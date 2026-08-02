package defpackage;

import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bvb implements gbj {
    final /* synthetic */ bvm a;

    public bvb(bvm bvmVar) {
        this.a = bvmVar;
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        bvm bvmVar = this.a;
        bvmVar.q(bvmVar.c.bs().getString(R.string.reordering_error));
        ((hkf) ((hkf) ((hkf) bvm.a.g()).h(th)).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$OtpReorderingCallback", "onFailure", (char) 1929, "OtpListFragmentPeer.java")).s("Could not reorder OTPs");
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        ((hkf) ((hkf) bvm.a.e()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$OtpReorderingCallback", "onSuccess", 1923, "OtpListFragmentPeer.java")).s("Successfully reordered a pair of OTPs");
    }

    @Override // defpackage.gbj
    public final /* synthetic */ void c() {
    }
}
