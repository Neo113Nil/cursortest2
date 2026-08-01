package W;

import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g extends z1.d {

    /* renamed from: a, reason: collision with root package name */
    public final f f934a;

    public g(TextView textView) {
        this.f934a = new f(textView);
    }

    @Override // z1.d
    public final InputFilter[] G(InputFilter[] inputFilterArr) {
        return !(U.j.f856k != null) ? inputFilterArr : this.f934a.G(inputFilterArr);
    }

    @Override // z1.d
    public final void k0(boolean z2) {
        if (U.j.f856k != null) {
            this.f934a.k0(z2);
        }
    }

    @Override // z1.d
    public final void l0(boolean z2) {
        boolean z3 = U.j.f856k != null;
        f fVar = this.f934a;
        if (z3) {
            fVar.l0(z2);
        } else {
            fVar.f933c = z2;
        }
    }
}
