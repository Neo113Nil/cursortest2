package g7;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public e7.i f4513g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f4514h;

    /* renamed from: i, reason: collision with root package name */
    public int f4515i;

    /* renamed from: j, reason: collision with root package name */
    public int f4516j;

    /* renamed from: k, reason: collision with root package name */
    public int f4517k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4518l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f7.f[] f4519m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j6.i f4520n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f7.g f4521o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(f7.f[] fVarArr, q6.f fVar, f7.g gVar, h6.d dVar) {
        super(2, dVar);
        this.f4519m = fVarArr;
        this.f4520n = (j6.i) fVar;
        this.f4521o = gVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [j6.i, q6.f] */
    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        p pVar = new p(this.f4519m, this.f4520n, this.f4521o, dVar);
        pVar.f4518l = obj;
        return pVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((p) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008e, code lost:
    
        if (r10 == r6) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d1, code lost:
    
        if (r17.f4520n.c(r17.f4521o, r9, r17) == r6) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r3 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d3, code lost:
    
        return r6;
     */
    /* JADX WARN: Type inference failed for: r10v11, types: [j6.i, q6.f] */
    /* JADX WARN: Type inference failed for: r12v0, types: [c7.y, h6.i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00d1 -> B:10:0x007c). Please report as a decompilation issue!!! */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        byte[] bArr;
        e7.i iVar;
        int i7;
        Object[] objArr;
        int i8;
        Object obj2;
        h7.s sVar = c.f4482c;
        int i9 = this.f4517k;
        i6.a aVar = i6.a.f4956f;
        if (i9 == 0) {
            d6.a.e(obj);
            c7.x xVar = (c7.x) this.f4518l;
            f7.f[] fVarArr = this.f4519m;
            int length = fVarArr.length;
            if (length != 0) {
                Object[] objArr2 = new Object[length];
                e6.k.c0(0, length, sVar, objArr2);
                e7.e C = j1.c.C(length, 6, null);
                AtomicInteger atomicInteger = new AtomicInteger(length);
                Object obj3 = null;
                int i10 = 0;
                while (i10 < length) {
                    ?? r12 = obj3;
                    c7.a0.p(xVar, r12, r12, new o(fVarArr, i10, atomicInteger, C, null), 3);
                    i10++;
                    obj3 = r12;
                }
                bArr = new byte[length];
                iVar = C;
                i7 = length;
                objArr = objArr2;
                i8 = 0;
            }
            return d6.z.f2639a;
        }
        if (i9 == 1) {
            i8 = this.f4516j;
            i7 = this.f4515i;
            bArr = this.f4514h;
            iVar = this.f4513g;
            objArr = (Object[]) this.f4518l;
            d6.a.e(obj);
            obj2 = ((e7.l) obj).f2881a;
            e6.y yVar = (e6.y) e7.l.a(obj2);
            if (yVar != null) {
                while (true) {
                    int i11 = yVar.f2829a;
                    Object obj4 = objArr[i11];
                    objArr[i11] = yVar.f2830b;
                    if (obj4 == sVar) {
                        i7--;
                    }
                    if (bArr[i11] != i8) {
                        bArr[i11] = (byte) i8;
                        yVar = (e6.y) e7.l.a(iVar.d());
                        if (yVar != null) {
                        }
                    }
                    if (i7 == 0) {
                        this.f4518l = objArr;
                        this.f4513g = iVar;
                        this.f4514h = bArr;
                        this.f4515i = i7;
                        this.f4516j = i8;
                        this.f4517k = 2;
                    }
                }
            }
            return d6.z.f2639a;
        }
        if (i9 != 2 && i9 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i8 = this.f4516j;
        i7 = this.f4515i;
        bArr = this.f4514h;
        iVar = this.f4513g;
        objArr = (Object[]) this.f4518l;
        d6.a.e(obj);
        i8 = (byte) (i8 + 1);
        this.f4518l = objArr;
        this.f4513g = iVar;
        this.f4514h = bArr;
        this.f4515i = i7;
        this.f4516j = i8;
        this.f4517k = 1;
        obj2 = iVar.f(this);
    }
}
