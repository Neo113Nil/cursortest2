package z0;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import k0.AbstractActivityC0187d;
import o0.C0211b;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291a {

    /* renamed from: a, reason: collision with root package name */
    public Activity f3178a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3179b;

    /* renamed from: c, reason: collision with root package name */
    public final C0211b f3180c;

    public C0291a(int i2, AbstractActivityC0187d abstractActivityC0187d, C0211b c0211b) {
        this.f3178a = abstractActivityC0187d;
        this.f3179b = i2;
        this.f3180c = c0211b;
        c0211b.f2915f = this;
    }

    public final int a() {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        Activity activity = this.f3178a;
        int i2 = this.f3179b;
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
            throw new IllegalStateException("isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.");
        }
        Activity activity = this.f3178a;
        int i3 = this.f3179b;
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
