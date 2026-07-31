package f4;

import android.text.InputFilter;
import android.widget.TextView;
import d4.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g extends s6.a {

    /* renamed from: g, reason: collision with root package name */
    public final f f2730g;

    public g(TextView textView) {
        this.f2730g = new f(textView);
    }

    @Override // s6.a
    public final void E(boolean z3) {
        if (l.c()) {
            this.f2730g.E(z3);
        }
    }

    @Override // s6.a
    public final void F(boolean z3) {
        boolean c8 = l.c();
        f fVar = this.f2730g;
        if (c8) {
            fVar.F(z3);
        } else {
            fVar.i = z3;
        }
    }

    @Override // s6.a
    public final InputFilter[] s(InputFilter[] inputFilterArr) {
        return !l.c() ? inputFilterArr : this.f2730g.s(inputFilterArr);
    }
}
