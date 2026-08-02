package defpackage;

import android.content.Intent;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class brh implements gbj {
    final /* synthetic */ bri a;

    public brh(bri briVar) {
        this.a = briVar;
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        bre breVar = this.a.b;
        fpm m = fpm.m(breVar.J(), R.string.something_went_wrong, -1);
        m.l(bri.b(breVar));
        m.g();
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        ((hkf) ((hkf) bri.a.e()).i("com/google/android/apps/authenticator2/enterkey/EnterKeyFragmentPeer$SaveToLocalDbCallback", "onSuccess", 278, "EnterKeyFragmentPeer.java")).s("OTP successfully added to the local database by manually entering the key");
        bre breVar = this.a.b;
        breVar.E().setResult(-1, new Intent());
        breVar.E().finish();
    }

    @Override // defpackage.gbj
    public final /* synthetic */ void c() {
    }
}
