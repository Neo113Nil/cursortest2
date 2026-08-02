package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bvi implements gbj {
    final /* synthetic */ bvm a;

    public bvi(bvm bvmVar) {
        this.a = bvmVar;
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        bvm.e(this.a.c).i(false, false);
        ((hkf) ((hkf) ((hkf) bvm.a.g()).h(th)).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$SwipeRefreshCallback", "onFailure", (char) 1758, "OtpListFragmentPeer.java")).s("Something went wrong during syncing");
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        bvm.e(this.a.c).i(false, false);
    }

    @Override // defpackage.gbj
    public final /* synthetic */ void c() {
    }
}
