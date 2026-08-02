package defpackage;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arm implements aas {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public arm(aro aroVar, int i) {
        this.b = i;
        this.a = aroVar;
    }

    @Override // defpackage.aas
    public final boolean a(View view) {
        int i = this.b;
        if (i == 0) {
            ((aro) this.a).s(((ViewPager2) view).b + 1);
            return true;
        }
        if (i == 1) {
            DrawerLayout drawerLayout = (DrawerLayout) this.a;
            if (!drawerLayout.r(view) || drawerLayout.b(view) == 2) {
                return false;
            }
            drawerLayout.i(view, true);
            return true;
        }
        if (i == 2) {
            ((aro) this.a).s(((ViewPager2) view).b - 1);
            return true;
        }
        Object obj = this.a;
        if (i != 3) {
            hoq.ab(new btr((btw) obj), view);
            return true;
        }
        hoq.ab(new bts((btw) obj), view);
        return true;
    }

    public /* synthetic */ arm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
