package g2;

import a.e0;
import android.view.MenuItem;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.oriondriftchasers.arordrft.MainMenuActivityHub;
import com.oriondriftchasers.arordrft.R;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class n implements k.k {

    /* renamed from: f, reason: collision with root package name */
    public final BottomNavigationView f1786f;

    public n(ConstraintLayout constraintLayout, BottomNavigationView bottomNavigationView) {
        this.f1786f = bottomNavigationView;
    }

    @Override // k.k
    public boolean k(k.m mVar, MenuItem menuItem) {
        p pVar = this.f1786f.f1791j;
        if (pVar == null) {
            return false;
        }
        MainMenuActivityHub mainMenuActivityHub = (MainMenuActivityHub) ((e0) pVar).f18g;
        int i = MainMenuActivityHub.F;
        f3.d.e(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.nav_utility) {
            mainMenuActivityHub.r(new v2.g());
            return false;
        }
        if (itemId == R.id.nav_info) {
            mainMenuActivityHub.r(new v2.c());
            return false;
        }
        if (itemId == R.id.nav_quiz) {
            mainMenuActivityHub.r(new v2.d());
            return false;
        }
        if (itemId == R.id.nav_stats) {
            mainMenuActivityHub.r(new v2.e());
            return false;
        }
        if (itemId != R.id.nav_game) {
            return true;
        }
        mainMenuActivityHub.r(new v2.b());
        return false;
    }

    public n(BottomNavigationView bottomNavigationView) {
        this.f1786f = bottomNavigationView;
    }

    @Override // k.k
    public void v(k.m mVar) {
    }
}
