package defpackage;

import android.view.View;
import com.google.android.material.navigation.NavigationView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fks extends abz {
    final /* synthetic */ NavigationView a;

    public fks(NavigationView navigationView) {
        this.a = navigationView;
    }

    @Override // defpackage.abz, defpackage.abw
    public final void a(View view) {
        NavigationView navigationView = this.a;
        if (view == navigationView) {
            navigationView.n.q();
            navigationView.b();
        }
    }

    @Override // defpackage.abz, defpackage.abw
    public final void b(View view) {
        NavigationView navigationView = this.a;
        if (view == navigationView) {
            iyi iyiVar = navigationView.n;
            iyiVar.getClass();
            view.post(new evp(iyiVar, 13));
        }
    }
}
