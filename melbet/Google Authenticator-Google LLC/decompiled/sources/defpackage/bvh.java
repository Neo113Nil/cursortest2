package defpackage;

import com.google.android.apps.authenticator2.R;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bvh implements gbj {
    final /* synthetic */ bvm a;

    public bvh(bvm bvmVar) {
        this.a = bvmVar;
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        ((hkf) ((hkf) ((hkf) bvm.a.g()).h(th)).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$StagedImportFutureCallback", "onFailure", (char) 1447, "OtpListFragmentPeer.java")).s("Failed to complete staged migration import transaction.");
        bvm bvmVar = this.a;
        bvmVar.q(bvmVar.c.bs().getString(R.string.something_went_wrong));
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        String string;
        ((hkf) ((hkf) bvm.a.e()).i("com/google/android/apps/authenticator2/main/OtpListFragmentPeer$StagedImportFutureCallback", "onSuccess", 1417, "OtpListFragmentPeer.java")).s("Staged migration import successfully completed and cleared.");
        bvm bvmVar = this.a;
        bvmVar.ad.k(hve.a, bxa.a);
        cae caeVar = (cae) ((ProtoParsers$InternalDontUse) obj2).a(cae.a, jkd.a());
        int i = caeVar.c;
        int i2 = caeVar.d + caeVar.e;
        if (i2 > 0) {
            buf bufVar = bvmVar.c;
            string = bufVar.bs().getString(R.string.staged_import_partial_success_message, bufVar.bs().getQuantityString(R.plurals.staged_import_imported_codes_count, i, Integer.valueOf(i)), bufVar.bs().getQuantityString(R.plurals.staged_import_skipped_codes_count, i2, Integer.valueOf(i2)));
        } else {
            string = bvmVar.c.bs().getString(R.string.staged_import_success_message);
        }
        bvmVar.q(string);
    }

    @Override // defpackage.gbj
    public final /* synthetic */ void c() {
    }
}
