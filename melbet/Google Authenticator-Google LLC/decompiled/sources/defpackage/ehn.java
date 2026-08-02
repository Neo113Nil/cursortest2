package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ehn {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public ehn(Context context) {
        this.b = context;
        this.a = "image_manager_disk_cache";
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kri] */
    public final void a() {
        ((kyt) this.b).j(this.a.a());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [dme, java.lang.Object] */
    public final void b(View view, int i, efo efoVar) {
        Object obj = this.a;
        dlb b = this.b.b();
        bqd g = ((efv) obj).g(i, gzp.h(efoVar));
        g.c(efr.a);
        b.b(view, g);
    }

    public final void c() {
        dwb dwbVar = (dwb) this.b;
        Object bB = dwbVar.c.bB();
        bB.getClass();
        ixg.i((kvm) bB, null, 0, new alg(dwbVar, (kzd) this.a, (kqj) null, 15), 3);
    }

    public final void d() {
        ((cnt) ((cns) this.a).b).b();
        Dialog dialog = (Dialog) this.b;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    public ehn(dwb dwbVar, kzd kzdVar) {
        this.b = dwbVar;
        this.a = kzdVar;
    }

    public /* synthetic */ ehn(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public ehn(Object obj, Object obj2, byte[] bArr) {
        this.b = obj2;
        this.a = obj;
    }
}
