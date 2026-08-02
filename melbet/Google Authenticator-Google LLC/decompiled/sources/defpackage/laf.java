package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class laf extends kra implements kry {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public laf(kqj kqjVar, krz krzVar, int i) {
        super(3, kqjVar);
        this.e = i;
        this.c = krzVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kry] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, krz] */
    @Override // defpackage.kry
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        if (this.e != 0) {
            laf lafVar = new laf((kqj) obj3, (krz) this.c, 1);
            lafVar.d = (kzr) obj;
            lafVar.b = (Object[]) obj2;
            return lafVar.b(kow.a);
        }
        laf lafVar2 = new laf((kry) this.c, (kqj) obj3, 0);
        lafVar2.d = (kzr) obj;
        lafVar2.b = (Object[]) obj2;
        return lafVar2.b(kow.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        if (r2.cg(r10, r9) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        if (r2.cg(r10, r9) == r0) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [kzr] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [kzr] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kry] */
    @Override // defpackage.kqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        ?? r2;
        ?? r22;
        if (this.e != 0) {
            kqp kqpVar = kqp.a;
            int i = this.a;
            if (i == 0) {
                ixc.Y(obj);
                Object obj2 = this.d;
                Object obj3 = this.b;
                Object obj4 = this.c;
                Object[] objArr = (Object[]) obj3;
                Object obj5 = objArr[0];
                Object obj6 = objArr[1];
                Object obj7 = objArr[2];
                this.a = 1;
                dwf dwfVar = new dwf(((dwf) obj4).d, this);
                dwfVar.a = (eba) obj5;
                dwfVar.b = (jia) obj6;
                dwfVar.c = (List) obj7;
                Object b = dwfVar.b(kow.a);
                if (b != kqpVar) {
                    r22 = obj2;
                    obj = b;
                }
                return kqpVar;
            }
            if (i != 1) {
                ixc.Y(obj);
                return kow.a;
            }
            Object obj8 = this.d;
            ixc.Y(obj);
            r22 = obj8;
            this.d = null;
            this.a = 2;
        } else {
            kqp kqpVar2 = kqp.a;
            int i2 = this.a;
            if (i2 == 0) {
                ixc.Y(obj);
                Object obj9 = this.d;
                Object obj10 = this.b;
                ?? r6 = this.c;
                Object[] objArr2 = (Object[]) obj10;
                Object obj11 = objArr2[0];
                Object obj12 = objArr2[1];
                this.a = 1;
                Object a = r6.a(obj11, obj12, this);
                if (a != kqpVar2) {
                    r2 = obj9;
                    obj = a;
                }
                return kqpVar2;
            }
            if (i2 != 1) {
                ixc.Y(obj);
                return kow.a;
            }
            Object obj13 = this.d;
            ixc.Y(obj);
            r2 = obj13;
            this.d = null;
            this.a = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public laf(kry kryVar, kqj kqjVar, int i) {
        super(3, kqjVar);
        this.e = i;
        this.c = kryVar;
    }
}
