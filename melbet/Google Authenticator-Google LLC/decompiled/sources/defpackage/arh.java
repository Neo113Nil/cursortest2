package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arh extends yn {
    final /* synthetic */ ViewPager2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arh(ViewPager2 viewPager2) {
        super(null, null);
        this.a = viewPager2;
    }

    @Override // defpackage.yn
    public final void j(int i) {
        if (i == 0) {
            this.a.e();
        }
    }

    @Override // defpackage.yn
    public final void l(int i) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.b != i) {
            viewPager2.b = i;
            ((aro) viewPager2.j).t();
        }
    }
}
