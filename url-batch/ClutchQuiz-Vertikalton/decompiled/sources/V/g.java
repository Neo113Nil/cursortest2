package V;

import T.k;
import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g extends T.d {

    /* renamed from: a, reason: collision with root package name */
    public final f f879a;

    public g(TextView textView) {
        this.f879a = new f(textView);
    }

    @Override // T.d
    public final void O(boolean z2) {
        if (k.f816k != null) {
            this.f879a.O(z2);
        }
    }

    @Override // T.d
    public final void P(boolean z2) {
        boolean z3 = k.f816k != null;
        f fVar = this.f879a;
        if (z3) {
            fVar.P(z2);
        } else {
            fVar.f878c = z2;
        }
    }

    @Override // T.d
    public final InputFilter[] v(InputFilter[] inputFilterArr) {
        return !(k.f816k != null) ? inputFilterArr : this.f879a.v(inputFilterArr);
    }
}
