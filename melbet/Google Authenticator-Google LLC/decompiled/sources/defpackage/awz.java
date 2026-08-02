package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awz implements awx {
    public final ajf a = new awy();
    private final ajw b;

    public awz(ajw ajwVar) {
        this.b = ajwVar;
    }

    @Override // defpackage.awx
    public final List a(String str) {
        str.getClass();
        return (List) abf.e(this.b, true, false, new aes(str, 3));
    }

    @Override // defpackage.awx
    public final boolean b(String str) {
        str.getClass();
        return ((Boolean) abf.e(this.b, true, false, new aes(str, 5, (byte[]) null))).booleanValue();
    }

    @Override // defpackage.awx
    public final void c(brr brrVar) {
        abf.e(this.b, false, true, new aes(this, brrVar, 4, null));
    }
}
