package R;

import D.AbstractActivityC0005f;
import D.u;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public AbstractActivityC0005f f362a;

    /* renamed from: b, reason: collision with root package name */
    public final int f363b;

    /* renamed from: c, reason: collision with root package name */
    public final u f364c;

    public a(int i2, AbstractActivityC0005f abstractActivityC0005f, u uVar) {
        this.f362a = abstractActivityC0005f;
        this.f363b = i2;
        this.f364c = uVar;
        uVar.f111c = this;
    }

    public final int a() {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        AbstractActivityC0005f abstractActivityC0005f = this.f362a;
        int i2 = this.f363b;
        View findViewById = abstractActivityC0005f.findViewById(i2);
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
        AbstractActivityC0005f abstractActivityC0005f = this.f362a;
        int i3 = this.f363b;
        View findViewById = abstractActivityC0005f.findViewById(i3);
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
