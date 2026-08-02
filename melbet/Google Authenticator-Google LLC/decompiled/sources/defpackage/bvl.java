package defpackage;

import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bvl implements gbj {
    final /* synthetic */ bvm a;

    public bvl(bvm bvmVar) {
        this.a = bvmVar;
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        if (th instanceof cal) {
            ((hkf) ((hkf) ((hkf) bvm.a.g()).h(th)).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$UpdateHotpOnPassboxCallback", "onFailure", (char) 1736, "OtpListFragmentPeer.java")).s("Hotp counter successfully updated in local database.");
            bvm bvmVar = this.a;
            bvmVar.q(bvmVar.c.bs().getString(R.string.something_went_wrong));
        } else {
            bvm bvmVar2 = this.a;
            bvmVar2.N = bvj.FAILED;
            bvmVar2.n();
            bvmVar2.q(bvmVar2.c.bs().getString(R.string.passbox_error));
            ((hkf) ((hkf) ((hkf) bvm.a.g()).h(th)).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$UpdateHotpOnPassboxCallback", "onFailure", 1740, "OtpListFragmentPeer.java")).s(((th instanceof kbt) || (th instanceof kbr)) ? "Could not update hotp counter on passbox." : "Something went wrong during hotp counter update");
        }
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        ((hkf) ((hkf) bvm.a.e()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$UpdateHotpOnPassboxCallback", "onSuccess", 1730, "OtpListFragmentPeer.java")).s("Hotp counter successfully updated on passbox.");
    }

    @Override // defpackage.gbj
    public final /* synthetic */ void c() {
    }
}
