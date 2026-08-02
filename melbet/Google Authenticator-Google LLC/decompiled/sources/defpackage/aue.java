package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aue implements auc {
    private final auc a;
    private final Object b = new Object();

    public aue(auc aucVar) {
        this.a = aucVar;
    }

    @Override // defpackage.auc
    public final List a(String str) {
        List a;
        str.getClass();
        synchronized (this.b) {
            a = this.a.a(str);
        }
        return a;
    }

    @Override // defpackage.auc
    public final boolean b(axl axlVar) {
        boolean b;
        synchronized (this.b) {
            b = this.a.b(axlVar);
        }
        return b;
    }

    @Override // defpackage.auc
    public final brn c(axl axlVar) {
        brn c;
        synchronized (this.b) {
            c = this.a.c(axlVar);
        }
        return c;
    }

    @Override // defpackage.auc
    public final brn d(axl axlVar) {
        brn d;
        synchronized (this.b) {
            d = this.a.d(axlVar);
        }
        return d;
    }

    @Override // defpackage.auc
    public final /* synthetic */ brn e(axt axtVar) {
        return zx.g(this, axtVar);
    }
}
