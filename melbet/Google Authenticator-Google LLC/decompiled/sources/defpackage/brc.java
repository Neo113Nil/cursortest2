package defpackage;

import android.app.Activity;
import android.support.v7.widget.Toolbar;
import com.google.android.apps.authenticator2.R;
import com.google.android.apps.authenticator2.enterkey.EnterKeyActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class brc implements ftm {
    public final EnterKeyActivity a;

    public brc(EnterKeyActivity enterKeyActivity, frz frzVar) {
        this.a = enterKeyActivity;
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
        bre breVar = new bre();
        jqq.g(breVar);
        gmk.d(breVar, o);
        aeVar.m(R.id.main_frame_layout, breVar, "EnterKeyFragment");
        aeVar.c();
    }

    @Override // defpackage.ftm
    public final void b() {
    }

    @Override // defpackage.ftm
    public final /* synthetic */ void d() {
    }
}
