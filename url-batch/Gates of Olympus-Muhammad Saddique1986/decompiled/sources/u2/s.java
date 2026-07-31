package u2;

import e2.InterfaceC0426e;
import java.util.concurrent.atomic.AtomicInteger;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;
import t2.C1063p;
import t2.InterfaceC1053f;
import t2.InterfaceC1054g;

/* loaded from: classes.dex */
public final class s extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public s2.k f9722h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f9723i;

    /* renamed from: j, reason: collision with root package name */
    public int f9724j;

    /* renamed from: k, reason: collision with root package name */
    public int f9725k;

    /* renamed from: l, reason: collision with root package name */
    public int f9726l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9727m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1053f[] f9728n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1063p f9729o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1054g f9730p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(InterfaceC1053f[] interfaceC1053fArr, C1063p c1063p, InterfaceC1054g interfaceC1054g, V1.d dVar) {
        super(2, dVar);
        this.f9728n = interfaceC1053fArr;
        this.f9729o = c1063p;
        this.f9730p = interfaceC1054g;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((s) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        s sVar = new s(this.f9728n, this.f9729o, this.f9730p, dVar);
        sVar.f9727m = obj;
        return sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
    
        if (r6 != 0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00cc A[LOOP:0: B:14:0x00cc->B:26:?, LOOP_START, PHI: r6 r7
      0x00cc: PHI (r6v3 int) = (r6v2 int), (r6v4 int) binds: [B:12:0x00c9, B:26:?] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r7v5 S1.x) = (r7v4 S1.x), (r7v11 S1.x) binds: [B:12:0x00c9, B:26:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r7v1, types: [V1.a, q2.x] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0102 -> B:7:0x00ae). Please report as a decompilation issue!!! */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        byte[] bArr;
        int i3;
        s2.k kVar;
        int i4;
        Object[] objArr;
        Object obj2;
        S1.x xVar;
        W1.a aVar = W1.a.f4608d;
        int i5 = this.f9726l;
        m1.q qVar = AbstractC1151c.f9683c;
        R1.y yVar = R1.y.f4171a;
        if (i5 == 0) {
            R1.a.e(obj);
            InterfaceC0835w interfaceC0835w = (InterfaceC0835w) this.f9727m;
            InterfaceC1053f[] interfaceC1053fArr = this.f9728n;
            int length = interfaceC1053fArr.length;
            if (length == 0) {
                return yVar;
            }
            Object[] objArr2 = new Object[length];
            int i6 = 0;
            S1.k.r0(objArr2, qVar, 0, length);
            Object obj3 = null;
            s2.g a3 = n.r.a(length, 6, null);
            AtomicInteger atomicInteger = new AtomicInteger(length);
            int i7 = 0;
            while (i7 < length) {
                int i8 = i7;
                AtomicInteger atomicInteger2 = atomicInteger;
                ?? r7 = obj3;
                AbstractC0837y.r(interfaceC0835w, r7, r7, new r(interfaceC1053fArr, i8, atomicInteger2, a3, null), 3);
                i7 = i8 + 1;
                obj3 = r7;
                atomicInteger = atomicInteger2;
                i6 = i6;
                objArr2 = objArr2;
            }
            bArr = new byte[length];
            i3 = length;
            kVar = a3;
            i4 = i6;
            objArr = objArr2;
        } else if (i5 == 1) {
            i4 = this.f9725k;
            i3 = this.f9724j;
            bArr = this.f9723i;
            kVar = this.f9722h;
            objArr = (Object[]) this.f9727m;
            R1.a.e(obj);
            obj2 = ((s2.n) obj).f8412a;
            xVar = (S1.x) s2.n.a(obj2);
            if (xVar != null) {
                return yVar;
            }
            while (true) {
                int i9 = xVar.f4323a;
                Object obj4 = objArr[i9];
                objArr[i9] = xVar.f4324b;
                if (obj4 == qVar) {
                    i3--;
                }
                if (bArr[i9] != i4) {
                    bArr[i9] = (byte) i4;
                    xVar = (S1.x) s2.n.a(kVar.o());
                    if (xVar != null) {
                    }
                }
                if (i3 == 0) {
                    C1063p c1063p = this.f9729o;
                    this.f9727m = objArr;
                    this.f9722h = kVar;
                    this.f9723i = bArr;
                    this.f9724j = i3;
                    this.f9725k = i4;
                    this.f9726l = 2;
                    if (c1063p.g(this.f9730p, objArr, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else if (i5 == 2) {
            i4 = this.f9725k;
            i3 = this.f9724j;
            bArr = this.f9723i;
            kVar = this.f9722h;
            objArr = (Object[]) this.f9727m;
            R1.a.e(obj);
        } else {
            if (i5 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4 = this.f9725k;
            i3 = this.f9724j;
            bArr = this.f9723i;
            kVar = this.f9722h;
            objArr = (Object[]) this.f9727m;
            R1.a.e(obj);
        }
        i4 = (byte) (i4 + 1);
        this.f9727m = objArr;
        this.f9722h = kVar;
        this.f9723i = bArr;
        this.f9724j = i3;
        this.f9725k = i4;
        this.f9726l = 1;
        obj2 = kVar.c(this);
        if (obj2 == aVar) {
            return aVar;
        }
        xVar = (S1.x) s2.n.a(obj2);
        if (xVar != null) {
        }
    }
}
