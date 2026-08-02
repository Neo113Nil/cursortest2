package defpackage;

import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bvf implements gbj {
    final /* synthetic */ bvm a;

    public bvf(bvm bvmVar) {
        this.a = bvmVar;
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        if (th instanceof cal) {
            ((hkf) ((hkf) ((hkf) bvm.a.g()).h(th)).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$SoftDeleteOtpOnPassboxCallback", "onFailure", (char) 1699, "OtpListFragmentPeer.java")).s("Otp not deleted successfully from the local database");
            bvm bvmVar = this.a;
            bvmVar.q(bvmVar.c.bs().getString(R.string.something_went_wrong));
        }
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        ((hkf) ((hkf) bvm.a.e()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$SoftDeleteOtpOnPassboxCallback", "onSuccess", 1693, "OtpListFragmentPeer.java")).s("Otp successfully soft-deleted from passbox.");
    }

    @Override // defpackage.gbj
    public final /* synthetic */ void c() {
    }
}
