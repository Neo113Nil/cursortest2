package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aze extends kra implements krx {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aze(ajk ajkVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.b = i;
        this.a = ajkVar;
    }

    @Override // defpackage.krx
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.b != 0) {
            return ((aze) c((kzr) obj, (kqj) obj2)).b(kow.a);
        }
        return ((aze) c((zy) obj, (kqj) obj2)).b(kow.a);
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        if (this.b != 0) {
            ixc.Y(obj);
            ((ajk) this.a).e.incrementAndGet();
            return kow.a;
        }
        ixc.Y(obj);
        String str = azf.a;
        asq.a();
        Objects.toString(this.a);
        return kow.a;
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        int i = this.b;
        Object obj2 = this.a;
        return i != 0 ? new aze((ajk) obj2, kqjVar, 1) : new aze((axt) obj2, kqjVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aze(axt axtVar, kqj kqjVar, int i) {
        super(2, kqjVar);
        this.b = i;
        this.a = axtVar;
    }
}
