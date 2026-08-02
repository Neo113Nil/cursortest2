package E1;

import T.C0095m;
import a.AbstractC0124a;
import android.util.SparseBooleanArray;
import com.google.android.gms.internal.play_billing.AbstractC0352w;
import com.google.android.gms.internal.play_billing.x1;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public boolean f555a;

    /* renamed from: b, reason: collision with root package name */
    public Object f556b;

    public X(boolean z, Float f4) {
        this.f555a = z;
        this.f556b = f4;
    }

    public void a(int i4) {
        AbstractC0124a.t(!this.f555a);
        ((SparseBooleanArray) this.f556b).append(i4, true);
    }

    public C0095m b() {
        AbstractC0124a.t(!this.f555a);
        this.f555a = true;
        return new C0095m((SparseBooleanArray) this.f556b);
    }

    public void c(x1 x1Var) {
        if (this.f555a) {
            AbstractC0352w.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((B1.j) this.f556b).B(new I1.a(x1Var));
        } catch (Throwable unused) {
            AbstractC0352w.h("BillingLogger", "logging failed.");
        }
    }

    public X() {
        this.f556b = new SparseBooleanArray();
    }
}
