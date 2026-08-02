package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lax extends kra implements krx {
    Object a;
    Object b;
    int c;
    int d;
    int e;
    final /* synthetic */ kzq[] f;
    final /* synthetic */ kri g;
    final /* synthetic */ kry h;
    final /* synthetic */ kzr i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lax(kzq[] kzqVarArr, kri kriVar, kry kryVar, kzr kzrVar, kqj kqjVar) {
        super(2, kqjVar);
        this.f = kzqVarArr;
        this.g = kriVar;
        this.h = kryVar;
        this.i = kzrVar;
    }

    @Override // defpackage.krx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lax) c((kvm) obj, (kqj) obj2)).b(kow.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cc, code lost:
    
        if (r11.a(r12, r10, r17) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e8, code lost:
    
        if (r12.a(r13, r11, r17) == r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0088 A[LOOP:0: B:10:0x0088->B:26:?, LOOP_START, PHI: r7 r11
      0x0088: PHI (r7v5 int) = (r7v4 int), (r7v6 int) binds: [B:9:0x0086, B:26:?] A[DONT_GENERATE, DONT_INLINE]
      0x0088: PHI (r11v4 kpn) = (r11v3 kpn), (r11v17 kpn) binds: [B:9:0x0086, B:26:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00eb -> B:5:0x0067). Please report as a decompilation issue!!! */
    @Override // defpackage.kqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        int i;
        kys kysVar;
        int i2;
        Object[] objArr;
        Object obj2;
        kys kysVar2;
        Object obj3;
        int i3;
        int i4;
        kpn kpnVar;
        Object obj4;
        kqp kqpVar = kqp.a;
        int i5 = this.e;
        if (i5 == 0) {
            ixc.Y(obj);
            kvm kvmVar = (kvm) this.j;
            kzq[] kzqVarArr = this.f;
            int length = kzqVarArr.length;
            if (length != 0) {
                Object[] objArr2 = new Object[length];
                ixc.E(objArr2, lbd.b, 0, length);
                kys h = ixj.h(length, 0, 6);
                AtomicInteger atomicInteger = new AtomicInteger(length);
                for (int i6 = 0; i6 < length; i6++) {
                    ixg.i(kvmVar, null, 0, new law(kzqVarArr, i6, atomicInteger, h, (kqj) null, 0), 3);
                }
                i = 0;
                kysVar = h;
                i2 = length;
                objArr = objArr2;
                obj4 = new byte[length];
            }
            return kow.a;
        }
        if (i5 == 1) {
            i4 = this.d;
            i3 = this.c;
            Object obj5 = this.b;
            Object obj6 = this.a;
            objArr = (Object[]) this.j;
            ixc.Y(obj);
            obj2 = ((kyw) obj).b;
            obj3 = obj5;
            kysVar2 = obj6;
            kpnVar = (kpn) kyw.a(obj2);
            if (kpnVar != null) {
                do {
                    int i7 = kpnVar.a;
                    Object obj7 = objArr[i7];
                    objArr[i7] = kpnVar.b;
                    if (obj7 == lbd.b) {
                        i3--;
                    }
                    byte[] bArr = (byte[]) obj3;
                    if (bArr[i7] == i4) {
                        break;
                    }
                    bArr[i7] = (byte) i4;
                    kpnVar = (kpn) kyw.a(kysVar2.i());
                } while (kpnVar != null);
                if (i3 == 0) {
                    Object[] objArr3 = (Object[]) this.g.a();
                    if (objArr3 == null) {
                        kry kryVar = this.h;
                        kzr kzrVar = this.i;
                        this.j = objArr;
                        this.a = kysVar2;
                        this.b = obj3;
                        this.c = 0;
                        this.d = i4;
                        this.e = 2;
                    } else {
                        ixc.P(objArr, objArr3, 0, 0, 14);
                        kry kryVar2 = this.h;
                        kzr kzrVar2 = this.i;
                        this.j = objArr;
                        this.a = kysVar2;
                        this.b = obj3;
                        this.c = 0;
                        this.d = i4;
                        this.e = 3;
                    }
                }
                int i8 = i3;
                i = i4;
                i2 = i8;
                obj4 = obj3;
                kysVar = kysVar2;
            }
            return kow.a;
        }
        i = this.d;
        i2 = this.c;
        Object obj8 = this.b;
        Object obj9 = this.a;
        objArr = (Object[]) this.j;
        ixc.Y(obj);
        obj4 = obj8;
        kysVar = obj9;
        this.j = objArr;
        this.a = kysVar;
        this.b = obj4;
        this.c = i2;
        byte b = (byte) (i + 1);
        this.d = b;
        this.e = 1;
        obj2 = kysVar.e(this);
        if (obj2 != kqpVar) {
            i3 = i2;
            i4 = b;
            obj3 = obj4;
            kysVar2 = kysVar;
            kpnVar = (kpn) kyw.a(obj2);
            if (kpnVar != null) {
            }
            return kow.a;
        }
        return kqpVar;
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        lax laxVar = new lax(this.f, this.g, this.h, this.i, kqjVar);
        laxVar.j = obj;
        return laxVar;
    }
}
