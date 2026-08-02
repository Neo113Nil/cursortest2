package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ari extends yn {
    final /* synthetic */ ViewPager2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ari(ViewPager2 viewPager2) {
        super(null, null);
        this.a = viewPager2;
    }

    @Override // defpackage.yn
    public final void l(int i) {
        ViewPager2 viewPager2 = this.a;
        viewPager2.clearFocus();
        if (viewPager2.hasFocus()) {
            viewPager2.e.requestFocus(2);
        }
    }
}
