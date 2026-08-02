package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eas extends ebb {
    public final efg a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public eas(ebp ebpVar) {
        super(new ebf(r0, r2, r1, r4.a()));
        ebi a;
        eay eayVar = new eay();
        eayVar.b(105607);
        eayVar.c(105606);
        eayVar.d(105606);
        eayVar.a();
        ebd ebdVar = new ebd(ebpVar.d, ebpVar.i);
        Drawable drawable = ebpVar.b;
        if (drawable == null) {
            int i = ebpVar.c;
            ebh ebhVar = new ebh();
            ebhVar.a = null;
            ebhVar.b(i);
            ebhVar.c(false);
            ebhVar.c(true);
            a = ebhVar.a();
        } else {
            ebh ebhVar2 = new ebh();
            ebhVar2.a = drawable;
            ebhVar2.b(-1);
            ebhVar2.c(false);
            ebhVar2.c(true);
            a = ebhVar2.a();
        }
        gzp h = gzp.h(Integer.valueOf(ebpVar.a));
        eay eayVar2 = new eay();
        eayVar2.b(ebpVar.e);
        eayVar2.c(90535);
        eayVar2.d(90535);
        efg efgVar = new efg();
        if (!efgVar.a) {
            efgVar.a = true;
            dih.ai((afc) efgVar.b, true);
        }
        this.a = efgVar;
        this.f = ebpVar.f;
        super.f();
        this.g = ebpVar.h;
        super.f();
        gzp.h(ebe.b);
    }

    @Override // defpackage.ebb
    public final Boolean a() {
        return Boolean.valueOf(this.a.a);
    }

    @Override // defpackage.ebb
    public final void c(afd afdVar) {
        dih.W(new drn(this, afdVar, 4, null));
    }

    @Override // defpackage.ebb
    public final void d(afd afdVar) {
        dih.W(new drn(this, afdVar, 5, null));
    }

    @Override // defpackage.ebb
    public final void b() {
    }

    @Override // defpackage.ebb
    public final void e() {
    }
}
