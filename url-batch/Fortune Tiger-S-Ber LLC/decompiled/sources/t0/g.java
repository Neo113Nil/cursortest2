package t0;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class g extends m0.a {

    /* renamed from: a, reason: collision with root package name */
    public final f f3373a;

    public g(TextView textView) {
        this.f3373a = new f(textView);
    }

    @Override // m0.a
    public final InputFilter[] k(InputFilter[] inputFilterArr) {
        return !(l.f340k != null) ? inputFilterArr : this.f3373a.k(inputFilterArr);
    }

    @Override // m0.a
    public final void x(boolean z3) {
        if (l.f340k != null) {
            this.f3373a.x(z3);
        }
    }

    @Override // m0.a
    public final void y(boolean z3) {
        f fVar = this.f3373a;
        if (l.f340k != null) {
            fVar.y(z3);
        } else {
            fVar.c = z3;
        }
    }
}
