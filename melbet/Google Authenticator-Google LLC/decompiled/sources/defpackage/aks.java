package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aks extends kra implements krx {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ akt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aks(akt aktVar, kqj kqjVar) {
        super(2, kqjVar);
        this.d = aktVar;
    }

    @Override // defpackage.krx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aks) c((ald) obj, (kqj) obj2)).b(kow.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        if (r2.d(r3, r4, r19) != r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c7, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0088, code lost:
    
        if (r14 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0034, code lost:
    
        if (r5 != r1) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.concurrent.locks.ReentrantLock] */
    @Override // defpackage.kqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        ?? r7;
        ald aldVar;
        Object e;
        ajm[] ajmVarArr;
        ajm ajmVar;
        ajn ajnVar;
        Object obj2;
        kqp kqpVar = kqp.a;
        int i = this.b;
        boolean z = false;
        boolean z2 = true;
        try {
            if (i == 0) {
                ixc.Y(obj);
                aldVar = (ald) this.c;
                this.c = aldVar;
                this.b = 1;
                e = aldVar.e();
            } else {
                if (i != 1) {
                    obj2 = this.a;
                    ajnVar = (ajn) this.c;
                    try {
                        ixc.Y(obj);
                        ajnVar.f = z;
                        ((ReentrantLock) obj2).unlock();
                        return kow.a;
                    } catch (Throwable th) {
                        th = th;
                        ajnVar.f = z;
                        throw th;
                    }
                }
                aldVar = (ald) this.c;
                ixc.Y(obj);
                e = obj;
            }
            if (((Boolean) e).booleanValue()) {
                return kow.a;
            }
            akt aktVar = this.d;
            ajn ajnVar2 = aktVar.e;
            r7 = ajnVar2.e;
            r7.lock();
            try {
                ajnVar2.f = true;
                ReentrantLock reentrantLock = ajnVar2.a;
                reentrantLock.lock();
                try {
                    if (ajnVar2.d) {
                        ajnVar2.d = false;
                        long[] jArr = ajnVar2.b;
                        int length = jArr.length;
                        ajmVarArr = new ajm[length];
                        int i2 = 0;
                        boolean z3 = false;
                        while (i2 < length) {
                            boolean z4 = jArr[i2] > 0 ? z2 : z;
                            boolean[] zArr = ajnVar2.c;
                            if (z4 != zArr[i2]) {
                                zArr[i2] = z4;
                                ajmVar = z4 ? ajm.b : ajm.c;
                                z3 = true;
                            } else {
                                ajmVar = ajm.a;
                            }
                            ajmVarArr[i2] = ajmVar;
                            i2++;
                            z = false;
                            z2 = true;
                        }
                    }
                    ajmVarArr = null;
                    if (ajmVarArr != null) {
                        try {
                            akg akgVar = akg.b;
                            akr akrVar = new akr(ajmVarArr, aktVar, aldVar, null);
                            this.c = ajnVar2;
                            this.a = r7;
                            this.b = 2;
                        } catch (Throwable th2) {
                            th = th2;
                            ajnVar = ajnVar2;
                            z = false;
                            ajnVar.f = z;
                            throw th;
                        }
                    }
                    z = false;
                    ajnVar = ajnVar2;
                    obj2 = r7;
                    ajnVar.f = z;
                    ((ReentrantLock) obj2).unlock();
                    return kow.a;
                } finally {
                    reentrantLock.unlock();
                }
            } catch (Throwable th3) {
                th = th3;
                ((ReentrantLock) r7).unlock();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            r7 = kqpVar;
        }
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        aks aksVar = new aks(this.d, kqjVar);
        aksVar.c = obj;
        return aksVar;
    }
}
