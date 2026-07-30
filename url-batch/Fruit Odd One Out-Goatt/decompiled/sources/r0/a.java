package r0;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import androidx.lifecycle.n;
import e0.f;
import f0.l;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public Activity f1142a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1143b;

    /* renamed from: c, reason: collision with root package name */
    public final n f1144c;

    public a(int i2, f fVar, n nVar) {
        this.f1142a = fVar;
        this.f1143b = i2;
        this.f1144c = nVar;
        nVar.f40c = this;
    }

    public final int a() {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        Activity activity = this.f1142a;
        int i2 = this.f1143b;
        View findViewById = activity.findViewById(i2);
        if (findViewById != null) {
            contentSensitivity = findViewById.getContentSensitivity();
            return contentSensitivity;
        }
        throw new IllegalArgumentException("FlutterView with ID " + i2 + "not found");
    }

    public final void b(int i2) {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            l.b("isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.");
            return;
        }
        Activity activity = this.f1142a;
        int i3 = this.f1143b;
        View findViewById = activity.findViewById(i3);
        if (findViewById == null) {
            throw new IllegalArgumentException("FlutterView with ID " + i3 + "not found");
        }
        contentSensitivity = findViewById.getContentSensitivity();
        if (contentSensitivity == i2) {
            return;
        }
        findViewById.setContentSensitivity(i2);
        findViewById.invalidate();
    }
}
