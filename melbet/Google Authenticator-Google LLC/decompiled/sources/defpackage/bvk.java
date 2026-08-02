package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bvk implements gbj {
    final /* synthetic */ bvm a;

    public bvk(bvm bvmVar) {
        this.a = bvmVar;
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
    }

    @Override // defpackage.gbj
    public final /* synthetic */ void b(Object obj, Object obj2) {
        bpc bpcVar = (bpc) obj2;
        ((hkf) ((hkf) bvm.a.e()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$UpdateHotpLocallyCallback", "onSuccess", 1709, "OtpListFragmentPeer.java")).s("Hotp counter successfully updated in local database.");
        btw a = btw.a(bpcVar, true);
        int i = 0;
        while (true) {
            bvm bvmVar = this.a;
            if (i >= bvmVar.H.size()) {
                return;
            }
            if (((btw) bvmVar.H.get(i)).d.equals(bpcVar.g)) {
                bvmVar.H.set(i, a);
                bvmVar.f.f(i);
            }
            i++;
        }
    }

    @Override // defpackage.gbj
    public final /* synthetic */ void c() {
    }
}
