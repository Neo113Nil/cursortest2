package W;

import H1.l;
import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g extends l {

    /* renamed from: a, reason: collision with root package name */
    public final f f1260a;

    public g(TextView textView) {
        this.f1260a = new f(textView);
    }

    @Override // H1.l
    public final InputFilter[] H(InputFilter[] inputFilterArr) {
        return !(U.j.f1089k != null) ? inputFilterArr : this.f1260a.H(inputFilterArr);
    }

    @Override // H1.l
    public final void d0(boolean z2) {
        if (U.j.f1089k != null) {
            this.f1260a.d0(z2);
        }
    }

    @Override // H1.l
    public final void e0(boolean z2) {
        boolean z3 = U.j.f1089k != null;
        f fVar = this.f1260a;
        if (z3) {
            fVar.e0(z2);
        } else {
            fVar.f1259c = z2;
        }
    }
}
