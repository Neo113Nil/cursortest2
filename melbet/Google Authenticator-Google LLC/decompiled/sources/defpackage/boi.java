package defpackage;

import android.app.Activity;
import android.support.v7.widget.Toolbar;
import com.google.android.apps.authenticator2.R;
import com.google.android.apps.authenticator2.addfirstotp.AddFirstOtpActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class boi implements ftm {
    public final AddFirstOtpActivity a;

    public boi(AddFirstOtpActivity addFirstOtpActivity, frz frzVar) {
        this.a = addFirstOtpActivity;
        frzVar.j(this);
    }

    public static Toolbar a(Activity activity) {
        return (Toolbar) activity.findViewById(R.id.toolbar);
    }

    @Override // defpackage.ftm
    public final void e(bst bstVar) {
        ae aeVar = new ae(this.a.a());
        frv o = bstVar.o();
        bok bokVar = new bok();
        jqq.g(bokVar);
        gmk.d(bokVar, o);
        aeVar.m(R.id.main_frame_layout, bokVar, "AddFirstOtpFragment");
        aeVar.c();
    }

    @Override // defpackage.ftm
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.ftm
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.ftm
    public final void c(fsv fsvVar) {
    }
}
