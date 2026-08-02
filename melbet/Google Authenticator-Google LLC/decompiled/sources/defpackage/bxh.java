package defpackage;

import android.app.Activity;
import android.support.v7.widget.Toolbar;
import com.google.android.apps.authenticator2.R;
import com.google.android.apps.authenticator2.migration.MigrationActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bxh implements ftm {
    public final MigrationActivity a;

    public bxh(MigrationActivity migrationActivity, frz frzVar) {
        this.a = migrationActivity;
        frzVar.j(this);
    }

    public static Toolbar a(Activity activity) {
        return (Toolbar) activity.findViewById(R.id.toolbar);
    }

    @Override // defpackage.ftm
    public final void c(fsv fsvVar) {
        this.a.finish();
    }

    @Override // defpackage.ftm
    public final void e(bst bstVar) {
        ae aeVar = new ae(this.a.a());
        frv o = bstVar.o();
        bxo bxoVar = new bxo();
        jqq.g(bxoVar);
        gmk.d(bxoVar, o);
        aeVar.m(R.id.main_frame_layout, bxoVar, "MigrationNavigationFragment");
        aeVar.c();
    }

    @Override // defpackage.ftm
    public final void b() {
    }

    @Override // defpackage.ftm
    public final /* synthetic */ void d() {
    }
}
