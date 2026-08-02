package defpackage;

import android.app.Activity;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
class fzk implements gbj {
    final /* synthetic */ fzp a;

    public fzk(fzp fzpVar) {
        this.a = fzpVar;
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        Intent putExtra = new Intent().putExtra("account_error", new ftb());
        bst bstVar = this.a.r;
        bstVar.m(putExtra);
        Activity activity = (Activity) bstVar.a;
        activity.setResult(0, putExtra);
        activity.finish();
        activity.overridePendingTransition(0, 0);
    }

    @Override // defpackage.gbj
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        this.a.r.n((frv) obj);
    }

    @Override // defpackage.gbj
    public final /* synthetic */ void c() {
    }
}
