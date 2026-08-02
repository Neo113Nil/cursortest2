package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fqb {
    public final TabLayout a;
    public final ViewPager2 b;
    public kr c;
    public boolean d;
    public fqa e;
    public kt f;
    public bst g;

    public fqb(TabLayout tabLayout, ViewPager2 viewPager2) {
        this.a = tabLayout;
        this.b = viewPager2;
    }

    public final void a() {
        TabLayout tabLayout = this.a;
        tabLayout.f();
        kr krVar = this.c;
        if (krVar != null) {
            int a = krVar.a();
            for (int i = 0; i < a; i++) {
                fpx d = tabLayout.d();
                d.g.setClickable(false);
                tabLayout.e(d, false);
            }
            if (a > 0) {
                int min = Math.min(this.b.b, tabLayout.b() - 1);
                if (min != tabLayout.a()) {
                    tabLayout.g(tabLayout.c(min), true);
                }
            }
        }
    }
}
