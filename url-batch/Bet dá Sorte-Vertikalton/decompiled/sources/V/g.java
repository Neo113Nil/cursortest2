package V;

import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g extends u1.d {

    /* renamed from: c, reason: collision with root package name */
    public final f f863c;

    public g(TextView textView) {
        this.f863c = new f(textView);
    }

    @Override // u1.d
    public final InputFilter[] G(InputFilter[] inputFilterArr) {
        return !(T.j.f789k != null) ? inputFilterArr : this.f863c.G(inputFilterArr);
    }

    @Override // u1.d
    public final void Y(boolean z2) {
        if (T.j.f789k != null) {
            this.f863c.Y(z2);
        }
    }

    @Override // u1.d
    public final void Z(boolean z2) {
        boolean z3 = T.j.f789k != null;
        f fVar = this.f863c;
        if (z3) {
            fVar.Z(z2);
        } else {
            fVar.f862e = z2;
        }
    }
}
