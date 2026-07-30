package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vw extends pr2 implements Function2 {
    public gt m;
    public byte[] n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ xm0[] s;
    public final /* synthetic */ xt0 t;
    public final /* synthetic */ ym0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(o30 o30Var, ym0 ym0Var, xt0 xt0Var, xm0[] xm0VarArr) {
        super(2, o30Var);
        this.s = xm0VarArr;
        this.t = xt0Var;
        this.u = ym0Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        vw vwVar = new vw(o30Var, this.u, this.t, this.s);
        vwVar.r = obj;
        return vwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vw) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008e, code lost:
    
        if (r10 == r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d1, code lost:
    
        if (r17.t.a(r17.u, r9, r17) == r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r4 != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d3, code lost:
    
        return r2;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00d1 -> B:10:0x007c). Please report as a decompilation issue!!! */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        byte[] bArr;
        gt gtVar;
        int i;
        Object[] objArr;
        int i2;
        Object obj2;
        ng0 ng0Var = yj1.l;
        b50 b50Var = b50.m;
        int i3 = this.q;
        if (i3 == 0) {
            ca2.b(obj);
            a50 a50Var = (a50) this.r;
            xm0[] xm0VarArr = this.s;
            int length = xm0VarArr.length;
            if (length == 0) {
                return Unit.a;
            }
            Object[] objArr2 = new Object[length];
            int i4 = 0;
            ni.k(0, length, ng0Var, objArr2);
            lq g = s93.g(length, 6, null);
            AtomicInteger atomicInteger = new AtomicInteger(length);
            int i5 = 0;
            while (i5 < length) {
                z71.H(a50Var, null, new uw(xm0VarArr, i5, atomicInteger, g, null), 3);
                i5++;
                i4 = i4;
            }
            int i6 = i4;
            bArr = new byte[length];
            gtVar = g;
            i = length;
            objArr = objArr2;
            i2 = i6;
        } else if (i3 == 1) {
            i2 = this.p;
            i = this.o;
            bArr = this.n;
            gtVar = this.m;
            objArr = (Object[]) this.r;
            ca2.b(obj);
            obj2 = ((st) obj).a;
            IndexedValue indexedValue = (IndexedValue) st.a(obj2);
            if (indexedValue == null) {
                return Unit.a;
            }
            while (true) {
                int i7 = indexedValue.a;
                Object obj3 = objArr[i7];
                objArr[i7] = indexedValue.b;
                if (obj3 == ng0Var) {
                    i--;
                }
                if (bArr[i7] != i2) {
                    bArr[i7] = (byte) i2;
                    indexedValue = (IndexedValue) st.a(gtVar.i());
                    if (indexedValue != null) {
                    }
                }
                if (i == 0) {
                    this.r = objArr;
                    this.m = gtVar;
                    this.n = bArr;
                    this.o = i;
                    this.p = i2;
                    this.q = 2;
                }
            }
        } else {
            if (i3 != 2 && i3 != 3) {
                lh.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.p;
            i = this.o;
            bArr = this.n;
            gtVar = this.m;
            objArr = (Object[]) this.r;
            ca2.b(obj);
        }
        i2 = (byte) (i2 + 1);
        this.r = objArr;
        this.m = gtVar;
        this.n = bArr;
        this.o = i;
        this.p = i2;
        this.q = 1;
        obj2 = gtVar.j(this);
    }
}
