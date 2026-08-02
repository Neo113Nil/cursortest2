package io.flutter.plugin.view;

import E.AbstractC0005f;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import io.flutter.embedding.engine.systemchannels.SensitiveContentChannel;

/* loaded from: classes.dex */
public class SensitiveContentPlugin implements SensitiveContentChannel.SensitiveContentMethodHandler {
    private Activity mFlutterActivity;
    private final int mFlutterViewId;
    private final SensitiveContentChannel mSensitiveContentChannel;

    public SensitiveContentPlugin(int i4, Activity activity, SensitiveContentChannel sensitiveContentChannel) {
        this.mFlutterActivity = activity;
        this.mFlutterViewId = i4;
        this.mSensitiveContentChannel = sensitiveContentChannel;
        sensitiveContentChannel.setSensitiveContentMethodHandler(this);
    }

    private String getFlutterViewNotFoundErrorReason() {
        return AbstractC0005f.o(new StringBuilder("FlutterView with ID "), this.mFlutterViewId, "not found");
    }

    private String getNotSupportedErrorReason() {
        return "isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.";
    }

    public void destroy() {
        this.mSensitiveContentChannel.setSensitiveContentMethodHandler(null);
        this.mFlutterActivity = null;
    }

    @Override // io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.SensitiveContentMethodHandler
    public int getContentSensitivity() {
        int contentSensitivity;
        if (!isSupported()) {
            return 2;
        }
        View findViewById = this.mFlutterActivity.findViewById(this.mFlutterViewId);
        if (findViewById == null) {
            throw new IllegalArgumentException(getFlutterViewNotFoundErrorReason());
        }
        contentSensitivity = findViewById.getContentSensitivity();
        return contentSensitivity;
    }

    @Override // io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.SensitiveContentMethodHandler
    public boolean isSupported() {
        return Build.VERSION.SDK_INT >= 35;
    }

    @Override // io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.SensitiveContentMethodHandler
    public void setContentSensitivity(int i4) {
        int contentSensitivity;
        if (!isSupported()) {
            throw new IllegalStateException(getNotSupportedErrorReason());
        }
        View findViewById = this.mFlutterActivity.findViewById(this.mFlutterViewId);
        if (findViewById == null) {
            throw new IllegalArgumentException(getFlutterViewNotFoundErrorReason());
        }
        contentSensitivity = findViewById.getContentSensitivity();
        if (contentSensitivity == i4) {
            return;
        }
        findViewById.setContentSensitivity(i4);
        findViewById.invalidate();
    }
}
