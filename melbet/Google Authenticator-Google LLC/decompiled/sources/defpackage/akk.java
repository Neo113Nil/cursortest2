package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akk implements kzr {
    final /* synthetic */ ksw a;
    final /* synthetic */ kzr b;
    final /* synthetic */ String[] c;
    final /* synthetic */ int[] d;

    public akk(ksw kswVar, kzr kzrVar, String[] strArr, int[] iArr) {
        this.a = kswVar;
        this.b = kzrVar;
        this.c = strArr;
        this.d = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r13.cg(r2, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0094, code lost:
    
        if (r13.cg(r2, r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.kzr
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cg(int[] iArr, kqj kqjVar) {
        akj akjVar;
        int i;
        if (kqjVar instanceof akj) {
            akjVar = (akj) kqjVar;
            int i2 = akjVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                akjVar.c = i2 - Integer.MIN_VALUE;
                Object obj = akjVar.a;
                kqp kqpVar = kqp.a;
                i = akjVar.c;
                if (i != 0) {
                    ixc.Y(obj);
                    ksw kswVar = this.a;
                    if (kswVar.a == null) {
                        kzr kzrVar = this.b;
                        Set M = ixc.M(this.c);
                        akjVar.d = iArr;
                        akjVar.c = 1;
                    } else {
                        String[] strArr = this.c;
                        int[] iArr2 = this.d;
                        ArrayList arrayList = new ArrayList();
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < strArr.length) {
                            String str = strArr[i3];
                            int i5 = i4 + 1;
                            Object obj2 = kswVar.a;
                            if (obj2 == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            int i6 = iArr2[i4];
                            if (((int[]) obj2)[i6] != iArr[i6]) {
                                arrayList.add(str);
                            }
                            i3++;
                            i4 = i5;
                        }
                        if (!arrayList.isEmpty()) {
                            kzr kzrVar2 = this.b;
                            Set s = ixc.s(arrayList);
                            akjVar.d = iArr;
                            akjVar.c = 2;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iArr = akjVar.d;
                    ixc.Y(obj);
                }
                this.a.a = iArr;
                return kow.a;
            }
        }
        akjVar = new akj(this, kqjVar);
        Object obj3 = akjVar.a;
        kqp kqpVar2 = kqp.a;
        i = akjVar.c;
        if (i != 0) {
        }
        this.a.a = iArr;
        return kow.a;
    }
}
