package E1;

import android.view.KeyEvent;
import com.google.android.gms.internal.play_billing.AbstractC0248o0;
import com.google.android.gms.internal.play_billing.i2;
import s0.C1184a;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public boolean f308a;

    /* renamed from: b, reason: collision with root package name */
    public Object f309b;

    public A(boolean z, Float f) {
        this.f308a = z;
        this.f309b = f;
    }

    public void a(boolean z) {
        if (this.f308a) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f308a = true;
        B b3 = (B) this.f309b;
        int i3 = b3.f311b - 1;
        b3.f311b = i3;
        boolean z2 = z | b3.f310a;
        b3.f310a = z2;
        if (i3 != 0 || z2) {
            return;
        }
        ((A0.f) b3.f313d).L((KeyEvent) b3.f312c);
    }

    public void b(i2 i2Var) {
        if (this.f308a) {
            AbstractC0248o0.g("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((A0.f) this.f309b).Q(new C1184a(i2Var));
        } catch (Throwable unused) {
            AbstractC0248o0.g("BillingLogger", "logging failed.");
        }
    }
}
