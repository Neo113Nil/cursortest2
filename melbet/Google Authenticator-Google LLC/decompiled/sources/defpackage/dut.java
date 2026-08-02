package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dut implements dou {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ dut(brn brnVar, String str, dou douVar, int i) {
        this.d = i;
        this.c = brnVar;
        this.a = str;
        this.b = douVar;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [dou, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [dou, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [dov, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [dou, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [dov, java.lang.Object] */
    @Override // defpackage.dou
    public final void a(View view, Object obj) {
        Object F;
        int i = this.d;
        if (i == 0) {
            jit jitVar = (jit) obj;
            F = jitVar != null ? dja.F((dsf) ((bst) this.c).a, jitVar) : null;
            dja djaVar = (dja) this.a;
            if (djaVar.u().f()) {
                djaVar.u().b().a(view, F);
                return;
            } else {
                dqx.b(view, 504, ((fwm) this.b).a, F, "https://myaccount.google.com/termsofservice");
                return;
            }
        }
        if (i == 1) {
            jit jitVar2 = (jit) obj;
            F = jitVar2 != null ? dja.F((dsf) ((bst) this.c).a, jitVar2) : null;
            dja djaVar2 = (dja) this.a;
            if (djaVar2.t().f()) {
                djaVar2.t().b().a(view, F);
                return;
            } else {
                dqx.b(view, 501, ((fwm) this.b).a, F, "https://www.google.com/policies/privacy");
                return;
            }
        }
        ?? r0 = this.b;
        fuf fufVar = (fuf) obj;
        gtt f = ((gva) ((brn) this.c).a).f((String) this.a, 272);
        try {
            r0.a(view, fufVar);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public /* synthetic */ dut(dja djaVar, fwm fwmVar, bst bstVar, int i) {
        this.d = i;
        this.a = djaVar;
        this.b = fwmVar;
        this.c = bstVar;
    }
}
