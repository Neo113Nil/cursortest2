package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axk implements axi {
    public final ajw a;
    public final ajf b = new axj();

    public axk(ajw ajwVar) {
        this.a = ajwVar;
    }

    @Override // defpackage.axi
    public final /* synthetic */ axh a(axl axlVar) {
        return (axh) abf.e(this.a, true, false, new axv(axlVar.a, axlVar.b, 1));
    }

    @Override // defpackage.axi
    public final List b() {
        return (List) abf.e(this.a, true, false, new ajq(5));
    }

    @Override // defpackage.axi
    public final void c(axh axhVar) {
        abf.e(this.a, false, true, new aes(this, axhVar, 10, null));
    }

    @Override // defpackage.axi
    public final void d(String str) {
        str.getClass();
        abf.e(this.a, false, true, new aes(str, 11, (short[]) null));
    }
}
