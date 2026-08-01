package V;

import android.text.InputFilter;
import android.widget.TextView;
import x1.l;

/* loaded from: classes.dex */
public final class g extends l {

    /* renamed from: a, reason: collision with root package name */
    public final f f866a;

    public g(TextView textView) {
        this.f866a = new f(textView);
    }

    @Override // x1.l
    public final InputFilter[] D(InputFilter[] inputFilterArr) {
        return !(T.j.f801k != null) ? inputFilterArr : this.f866a.D(inputFilterArr);
    }

    @Override // x1.l
    public final void Z(boolean z2) {
        if (T.j.f801k != null) {
            this.f866a.Z(z2);
        }
    }

    @Override // x1.l
    public final void a0(boolean z2) {
        boolean z3 = T.j.f801k != null;
        f fVar = this.f866a;
        if (z3) {
            fVar.a0(z2);
        } else {
            fVar.f865c = z2;
        }
    }
}
