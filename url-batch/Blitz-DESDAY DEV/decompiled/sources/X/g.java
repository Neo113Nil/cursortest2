package X;

import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g extends z1.d {

    /* renamed from: e, reason: collision with root package name */
    public final f f972e;

    public g(TextView textView) {
        this.f972e = new f(textView);
    }

    @Override // z1.d
    public final void V(boolean z2) {
        if (V.j.f887k != null) {
            this.f972e.V(z2);
        }
    }

    @Override // z1.d
    public final void Z(boolean z2) {
        boolean z3 = V.j.f887k != null;
        f fVar = this.f972e;
        if (z3) {
            fVar.Z(z2);
        } else {
            fVar.f971g = z2;
        }
    }

    @Override // z1.d
    public final InputFilter[] z(InputFilter[] inputFilterArr) {
        return !(V.j.f887k != null) ? inputFilterArr : this.f972e.z(inputFilterArr);
    }
}
