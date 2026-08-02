package defpackage;

import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bqv implements gbj {
    final /* synthetic */ bqw a;

    public bqv(bqw bqwVar) {
        this.a = bqwVar;
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        bqs bqsVar = this.a.c;
        fpm m = fpm.m(bqsVar.J(), R.string.something_went_wrong, -1);
        m.l(bqw.b(bqsVar));
        m.g();
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        ((hkf) ((hkf) bqw.a.e()).i("com/google/android/apps/authenticator2/editotp/EditOtpFragmentPeer$UpdateOtpLocallyOnSameGoogleAccountFutureCallback", "onSuccess", 361, "EditOtpFragmentPeer.java")).s("Otp updated successfully to local database via a QR code.");
        this.a.c.E().finish();
    }

    @Override // defpackage.gbj
    public final /* synthetic */ void c() {
    }
}
