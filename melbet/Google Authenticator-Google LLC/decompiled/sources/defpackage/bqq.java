package defpackage;

import android.app.Activity;
import android.support.v7.widget.Toolbar;
import com.google.android.apps.authenticator2.R;
import com.google.android.apps.authenticator2.editotp.EditOtpActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bqq implements ftm {
    public final EditOtpActivity a;

    public bqq(EditOtpActivity editOtpActivity, frz frzVar) {
        this.a = editOtpActivity;
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
        EditOtpActivity editOtpActivity = this.a;
        ae aeVar = new ae(editOtpActivity.a());
        frv o = bstVar.o();
        String stringExtra = editOtpActivity.getIntent().getStringExtra("editOtpUniqueId");
        bqs bqsVar = new bqs();
        jqq.g(bqsVar);
        gmk.d(bqsVar, o);
        gmb.c(bqsVar, stringExtra);
        aeVar.m(R.id.main_frame_layout, bqsVar, "EditOtpFragment");
        aeVar.c();
    }

    @Override // defpackage.ftm
    public final void b() {
    }

    @Override // defpackage.ftm
    public final /* synthetic */ void d() {
    }
}
