package V;

import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g extends s1.d {

    /* renamed from: a, reason: collision with root package name */
    public final f f821a;

    public g(TextView textView) {
        this.f821a = new f(textView);
    }

    @Override // s1.d
    public final InputFilter[] B(InputFilter[] inputFilterArr) {
        return !(T.j.f764k != null) ? inputFilterArr : this.f821a.B(inputFilterArr);
    }

    @Override // s1.d
    public final void e0(boolean z2) {
        if (T.j.f764k != null) {
            this.f821a.e0(z2);
        }
    }

    @Override // s1.d
    public final void f0(boolean z2) {
        boolean z3 = T.j.f764k != null;
        f fVar = this.f821a;
        if (z3) {
            fVar.f0(z2);
        } else {
            fVar.f820c = z2;
        }
    }
}
