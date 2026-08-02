package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dwj extends kra implements kry {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwj(kqj kqjVar, int i) {
        super(3, kqjVar);
        this.d = i;
    }

    @Override // defpackage.kry
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        if (this.d != 0) {
            dwj dwjVar = new dwj((kqj) obj3, 1, null);
            dwjVar.c = (kzr) obj;
            dwjVar.b = (Object[]) obj2;
            return dwjVar.b(kow.a);
        }
        dwj dwjVar2 = new dwj((kqj) obj3, 0);
        dwjVar2.c = (kzr) obj;
        dwjVar2.b = (Object[]) obj2;
        return dwjVar2.b(kow.a);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kzr] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kzr] */
    @Override // defpackage.kqu
    public final Object b(Object obj) {
        zy zyVar = null;
        int i = 0;
        if (this.d == 0) {
            kqp kqpVar = kqp.a;
            if (this.a != 0) {
                ixc.Y(obj);
            } else {
                ixc.Y(obj);
                ?? r10 = this.c;
                jia[] jiaVarArr = (jia[]) this.b;
                ArrayList arrayList = new ArrayList();
                int length = jiaVarArr.length;
                while (i < length) {
                    jia jiaVar = jiaVarArr[i];
                    if (true == jiaVar.a.isEmpty()) {
                        jiaVar = null;
                    }
                    if (jiaVar != null) {
                        arrayList.add(jiaVar);
                    }
                    i++;
                }
                this.a = 1;
                if (r10.cg(arrayList, this) == kqpVar) {
                    return kqpVar;
                }
            }
            return kow.a;
        }
        kqp kqpVar2 = kqp.a;
        int i2 = this.a;
        ixc.Y(obj);
        if (i2 == 0) {
            ?? r102 = this.c;
            zy[] zyVarArr = (zy[]) this.b;
            int length2 = zyVarArr.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                zy zyVar2 = zyVarArr[i];
                if (!ksp.b(zyVar2, avt.a)) {
                    zyVar = zyVar2;
                    break;
                }
                i++;
            }
            if (zyVar == null) {
                zyVar = avt.a;
            }
            this.a = 1;
            if (r102.cg(zyVar, this) == kqpVar2) {
                return kqpVar2;
            }
        }
        return kow.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwj(kqj kqjVar, int i, byte[] bArr) {
        super(3, kqjVar);
        this.d = i;
    }
}
