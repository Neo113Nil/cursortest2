package defpackage;

import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bvg implements gbj {
    final /* synthetic */ bvm a;

    public bvg(bvm bvmVar) {
        this.a = bvmVar;
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        ((hkf) ((hkf) ((hkf) bvm.a.g()).h(th)).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$StagedDiscardFutureCallback", "onFailure", (char) 1463, "OtpListFragmentPeer.java")).s("Failed to discard staged migration data.");
        bvm bvmVar = this.a;
        bvmVar.q(bvmVar.c.bs().getString(R.string.something_went_wrong));
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        ((hkf) ((hkf) bvm.a.e()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$StagedDiscardFutureCallback", "onSuccess", 1456, "OtpListFragmentPeer.java")).s("Staged migration data successfully discarded.");
        bvm bvmVar = this.a;
        bvmVar.q(bvmVar.c.bs().getString(R.string.staged_import_discard_message));
    }

    @Override // defpackage.gbj
    public final /* synthetic */ void c() {
    }
}
