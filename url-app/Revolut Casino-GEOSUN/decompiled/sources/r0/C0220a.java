package r0;

import android.os.Build;
import android.view.View;
import c0.AbstractActivityC0104f;
import m0.C0193c;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0220a {

    /* renamed from: a, reason: collision with root package name */
    public AbstractActivityC0104f f2834a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2835b;

    /* renamed from: c, reason: collision with root package name */
    public final C0193c f2836c;

    public C0220a(int i2, AbstractActivityC0104f abstractActivityC0104f, C0193c c0193c) {
        this.f2834a = abstractActivityC0104f;
        this.f2835b = i2;
        this.f2836c = c0193c;
        c0193c.f2706f = this;
    }

    public final int a() {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        AbstractActivityC0104f abstractActivityC0104f = this.f2834a;
        int i2 = this.f2835b;
        View findViewById = abstractActivityC0104f.findViewById(i2);
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
        AbstractActivityC0104f abstractActivityC0104f = this.f2834a;
        int i3 = this.f2835b;
        View findViewById = abstractActivityC0104f.findViewById(i3);
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
