package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axo implements axm {
    public final ajf a = new axn();
    private final ajw b;

    public axo(ajw ajwVar) {
        this.b = ajwVar;
    }

    @Override // defpackage.axm
    public final List a(String str) {
        return (List) abf.e(this.b, true, false, new aes(str, 12, (int[]) null));
    }

    @Override // defpackage.axm
    public final void b(brr brrVar) {
        abf.e(this.b, false, true, new aes(this, brrVar, 13, null));
    }
}
