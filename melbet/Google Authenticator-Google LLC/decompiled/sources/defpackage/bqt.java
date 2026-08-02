package defpackage;

import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bqt implements gbj {
    final /* synthetic */ bqw a;

    public bqt(bqw bqwVar) {
        this.a = bqwVar;
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        ((hkf) ((hkf) ((hkf) bqw.a.g()).h(th)).i("com/google/android/apps/authenticator2/editotp/EditOtpFragmentPeer$MovingOtpToAnotherAccountFutureCallback", "onFailure", (char) 384, "EditOtpFragmentPeer.java")).s("Error while moving an OTP.");
        bqs bqsVar = this.a.c;
        fpm n = fpm.n(bqsVar.J(), bqsVar.bs().getString(R.string.something_went_wrong), -1);
        n.l(bqw.b(bqsVar));
        n.g();
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        ((hkf) ((hkf) bqw.a.e()).i("com/google/android/apps/authenticator2/editotp/EditOtpFragmentPeer$MovingOtpToAnotherAccountFutureCallback", "onSuccess", 378, "EditOtpFragmentPeer.java")).s("Successfully deleted OTP locally while moving to another account");
        this.a.c.E().finish();
    }

    @Override // defpackage.gbj
    public final /* synthetic */ void c() {
    }
}
