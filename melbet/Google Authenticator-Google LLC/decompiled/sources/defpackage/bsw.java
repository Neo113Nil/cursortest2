package defpackage;

import android.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bsw implements gbj {
    final /* synthetic */ bsz a;

    public bsw(bsz bszVar) {
        this.a = bszVar;
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        ((hkf) ((hkf) ((hkf) bsz.a.g()).h(th)).i("com/google/android/apps/authenticator2/loginrequirement/LoginRequirementFragmentPeer$ConsentGivenCallback", "onFailure", 'b', "LoginRequirementFragmentPeer.java")).s("Could not save consent for account.");
        bsz bszVar = this.a;
        fpm.m(bszVar.b.E().findViewById(R.id.content), com.google.android.apps.authenticator2.R.string.something_went_wrong, -1).g();
        bszVar.k.n(bszVar.e.c);
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        ((hkf) ((hkf) bsz.a.e()).i("com/google/android/apps/authenticator2/loginrequirement/LoginRequirementFragmentPeer$ConsentGivenCallback", "onSuccess", 91, "LoginRequirementFragmentPeer.java")).s("Consent saved successfully.");
        bsz bszVar = this.a;
        bst bstVar = bszVar.k;
        bstVar.n(bstVar.l());
        bszVar.e.c = bstVar.l();
    }

    @Override // defpackage.gbj
    public final /* synthetic */ void c() {
    }
}
