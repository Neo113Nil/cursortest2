package w0;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class h extends t0.d {

    /* renamed from: a, reason: collision with root package name */
    public final g f3571a;

    public h(TextView textView) {
        this.f3571a = new g(textView);
    }

    @Override // t0.d
    public final InputFilter[] g(InputFilter[] inputFilterArr) {
        return !(l.f332k != null) ? inputFilterArr : this.f3571a.g(inputFilterArr);
    }

    @Override // t0.d
    public final void r(boolean z3) {
        if (l.f332k != null) {
            this.f3571a.r(z3);
        }
    }

    @Override // t0.d
    public final void s(boolean z3) {
        g gVar = this.f3571a;
        if (l.f332k != null) {
            gVar.s(z3);
        } else {
            gVar.f3570c = z3;
        }
    }
}
