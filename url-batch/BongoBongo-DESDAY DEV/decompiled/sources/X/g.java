package X;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g extends A1.d {

    /* renamed from: e, reason: collision with root package name */
    public final f f976e;

    public g(TextView textView) {
        this.f976e = new f(textView);
    }

    @Override // A1.d
    public final InputFilter[] I(InputFilter[] inputFilterArr) {
        return !(V.j.f897k != null) ? inputFilterArr : this.f976e.I(inputFilterArr);
    }

    @Override // A1.d
    public final boolean P() {
        return this.f976e.f975g;
    }

    @Override // A1.d
    public final void c0(boolean z2) {
        if (V.j.f897k != null) {
            this.f976e.c0(z2);
        }
    }

    @Override // A1.d
    public final void g0(boolean z2) {
        boolean z3 = V.j.f897k != null;
        f fVar = this.f976e;
        if (z3) {
            fVar.g0(z2);
        } else {
            fVar.f975g = z2;
        }
    }

    @Override // A1.d
    public final TransformationMethod l0(TransformationMethod transformationMethod) {
        return !(V.j.f897k != null) ? transformationMethod : this.f976e.l0(transformationMethod);
    }
}
