package W;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g extends P0.f {

    /* renamed from: a, reason: collision with root package name */
    public final f f2779a;

    public g(TextView textView) {
        this.f2779a = new f(textView);
    }

    @Override // P0.f
    public final void G(boolean z7) {
        if (U.j.j != null) {
            this.f2779a.G(z7);
        }
    }

    @Override // P0.f
    public final void J(boolean z7) {
        f fVar = this.f2779a;
        if (U.j.j != null) {
            fVar.J(z7);
        } else {
            fVar.f2778c = z7;
        }
    }

    @Override // P0.f
    public final TransformationMethod Q(TransformationMethod transformationMethod) {
        return !(U.j.j != null) ? transformationMethod : this.f2779a.Q(transformationMethod);
    }

    @Override // P0.f
    public final InputFilter[] s(InputFilter[] inputFilterArr) {
        return !(U.j.j != null) ? inputFilterArr : this.f2779a.s(inputFilterArr);
    }

    @Override // P0.f
    public final boolean x() {
        return this.f2779a.f2778c;
    }
}
