package io.flutter.embedding.android;

import io.flutter.embedding.android.FlutterMeasureSpec;
import io.flutter.embedding.android.KeyboardManager;
import io.flutter.embedding.engine.systemchannels.KeyEventChannel;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements FlutterMeasureSpec.MeasureCallback, KeyEventChannel.EventResponseHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13531a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13532b;

    public /* synthetic */ c(int i4, Object obj) {
        this.f13531a = i4;
        this.f13532b = obj;
    }

    @Override // io.flutter.embedding.engine.systemchannels.KeyEventChannel.EventResponseHandler
    public void onFrameworkResponse(boolean z) {
        ((KeyboardManager.Responder.OnKeyEventHandledCallback) this.f13532b).onKeyEventHandled(z);
    }

    @Override // io.flutter.embedding.android.FlutterMeasureSpec.MeasureCallback
    public void onMeasure(int i4, int i5) {
        switch (this.f13531a) {
            case 0:
                ((FlutterImageView) this.f13532b).setMeasuredDimension(i4, i5);
                break;
            case 1:
                ((FlutterSurfaceView) this.f13532b).setMeasuredDimension(i4, i5);
                break;
            default:
                ((FlutterTextureView) this.f13532b).setMeasuredDimension(i4, i5);
                break;
        }
    }
}
