package V;

import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g extends u1.d {

    /* renamed from: a, reason: collision with root package name */
    public final f f849a;

    public g(TextView textView) {
        this.f849a = new f(textView);
    }

    @Override // u1.d
    public final InputFilter[] K(InputFilter[] inputFilterArr) {
        return !(T.j.f774k != null) ? inputFilterArr : this.f849a.K(inputFilterArr);
    }

    @Override // u1.d
    public final void l0(boolean z2) {
        if (T.j.f774k != null) {
            this.f849a.l0(z2);
        }
    }

    @Override // u1.d
    public final void m0(boolean z2) {
        boolean z3 = T.j.f774k != null;
        f fVar = this.f849a;
        if (z3) {
            fVar.m0(z2);
        } else {
            fVar.f848c = z2;
        }
    }
}
