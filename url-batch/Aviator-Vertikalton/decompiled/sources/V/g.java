package V;

import android.text.InputFilter;
import android.widget.TextView;
import q1.l;

/* loaded from: classes.dex */
public final class g extends l {

    /* renamed from: g, reason: collision with root package name */
    public final f f853g;

    public g(TextView textView) {
        this.f853g = new f(textView);
    }

    @Override // q1.l
    public final void k0(boolean z2) {
        if (T.j.f788k != null) {
            this.f853g.k0(z2);
        }
    }

    @Override // q1.l
    public final void o0(boolean z2) {
        boolean z3 = T.j.f788k != null;
        f fVar = this.f853g;
        if (z3) {
            fVar.o0(z2);
        } else {
            fVar.i = z2;
        }
    }

    @Override // q1.l
    public final InputFilter[] y(InputFilter[] inputFilterArr) {
        return !(T.j.f788k != null) ? inputFilterArr : this.f853g.y(inputFilterArr);
    }
}
