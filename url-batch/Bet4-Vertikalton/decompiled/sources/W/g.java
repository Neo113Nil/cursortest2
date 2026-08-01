package W;

import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g extends w1.d {

    /* renamed from: a, reason: collision with root package name */
    public final f f905a;

    public g(TextView textView) {
        this.f905a = new f(textView);
    }

    @Override // w1.d
    public final InputFilter[] D(InputFilter[] inputFilterArr) {
        return !(U.j.f847k != null) ? inputFilterArr : this.f905a.D(inputFilterArr);
    }

    @Override // w1.d
    public final void k0(boolean z2) {
        if (U.j.f847k != null) {
            this.f905a.k0(z2);
        }
    }

    @Override // w1.d
    public final void l0(boolean z2) {
        boolean z3 = U.j.f847k != null;
        f fVar = this.f905a;
        if (z3) {
            fVar.l0(z2);
        } else {
            fVar.f904c = z2;
        }
    }
}
