package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bon implements gbj {
    final /* synthetic */ boo a;

    public bon(boo booVar) {
        this.a = booVar;
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        if (!(th instanceof cbk)) {
            ((hkf) ((hkf) ((hkf) boo.a.g()).h(th)).i("com/google/android/apps/authenticator2/addfirstotp/AddFirstOtpFragmentPeer$OtpAddedViaQrCodeLocally", "onFailure", (char) 219, "AddFirstOtpFragmentPeer.java")).s("Otp not added successfully to the local database");
        } else {
            ((hkf) ((hkf) ((hkf) boo.a.g()).h(th)).i("com/google/android/apps/authenticator2/addfirstotp/AddFirstOtpFragmentPeer$OtpAddedViaQrCodeLocally", "onFailure", (char) 215, "AddFirstOtpFragmentPeer.java")).s("Otp could not be created from an invalid QR code during scanning.");
            this.a.a();
        }
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        ((hkf) ((hkf) boo.a.e()).i("com/google/android/apps/authenticator2/addfirstotp/AddFirstOtpFragmentPeer$OtpAddedViaQrCodeLocally", "onSuccess", 208, "AddFirstOtpFragmentPeer.java")).s("Otp successfully added locally via scanning a code");
        this.a.b.E().finish();
    }

    @Override // defpackage.gbj
    public final /* synthetic */ void c() {
    }
}
