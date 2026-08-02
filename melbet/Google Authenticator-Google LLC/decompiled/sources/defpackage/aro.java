package defpackage;

import android.R;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aro extends ym {
    public final /* synthetic */ ViewPager2 a;
    public kt b;
    private final aas c = new arm(this, 0);
    private final aas d = new arm(this, 2);

    public aro(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // defpackage.ym
    public final boolean k(int i) {
        return i == 8192 || i == 4096;
    }

    public final void s(int i) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.g) {
            viewPager2.i(i);
        }
    }

    public final void t() {
        int a;
        ViewPager2 viewPager2 = this.a;
        int i = R.id.accessibilityActionPageLeft;
        yq.j(viewPager2, R.id.accessibilityActionPageLeft);
        yq.j(viewPager2, R.id.accessibilityActionPageRight);
        yq.j(viewPager2, R.id.accessibilityActionPageUp);
        yq.j(viewPager2, R.id.accessibilityActionPageDown);
        if (viewPager2.c() == null || (a = viewPager2.c().a()) == 0 || !viewPager2.g) {
            return;
        }
        int i2 = a - 1;
        if (viewPager2.a() != 0) {
            if (viewPager2.b < i2) {
                yq.r(viewPager2, new aag(null, R.id.accessibilityActionPageDown, null, null, null), this.c);
            }
            if (viewPager2.b > 0) {
                yq.r(viewPager2, new aag(null, R.id.accessibilityActionPageUp, null, null, null), this.d);
                return;
            }
            return;
        }
        boolean f = viewPager2.f();
        int i3 = true != f ? 16908361 : 16908360;
        if (true == f) {
            i = 16908361;
        }
        if (viewPager2.b < i2) {
            yq.r(viewPager2, new aag(null, i3, null, null, null), this.c);
        }
        if (viewPager2.b > 0) {
            yq.r(viewPager2, new aag(null, i, null, null, null), this.d);
        }
    }
}
