package X;

import H1.l;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g extends l {

    /* renamed from: f, reason: collision with root package name */
    public final f f1360f;

    public g(TextView textView) {
        this.f1360f = new f(textView);
    }

    @Override // H1.l
    public final boolean E() {
        return this.f1360f.f1359h;
    }

    @Override // H1.l
    public final void V(boolean z2) {
        if (V.j.f1274k != null) {
            this.f1360f.V(z2);
        }
    }

    @Override // H1.l
    public final void X(boolean z2) {
        boolean z3 = V.j.f1274k != null;
        f fVar = this.f1360f;
        if (z3) {
            fVar.X(z2);
        } else {
            fVar.f1359h = z2;
        }
    }

    @Override // H1.l
    public final TransformationMethod j0(TransformationMethod transformationMethod) {
        return !(V.j.f1274k != null) ? transformationMethod : this.f1360f.j0(transformationMethod);
    }

    @Override // H1.l
    public final InputFilter[] x(InputFilter[] inputFilterArr) {
        return !(V.j.f1274k != null) ? inputFilterArr : this.f1360f.x(inputFilterArr);
    }
}
