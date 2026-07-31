package u;

import R1.y;
import a0.C0239d;
import n.z0;

/* renamed from: u.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1076c {

    /* renamed from: a, reason: collision with root package name */
    public final K.d f9094a = new K.d(new C1077d[16]);

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        if (r8 < r2) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:10:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0239d c0239d, X1.c cVar) {
        C1075b c1075b;
        int i3;
        int i4;
        C0239d c0239d2;
        int i5;
        Object[] objArr;
        if (cVar instanceof C1075b) {
            c1075b = (C1075b) cVar;
            int i6 = c1075b.f9093m;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c1075b.f9093m = i6 - Integer.MIN_VALUE;
                Object obj = c1075b.f9091k;
                W1.a aVar = W1.a.f4608d;
                i3 = c1075b.f9093m;
                if (i3 != 0) {
                    R1.a.e(obj);
                    K.d dVar = this.f9094a;
                    i4 = dVar.f3216f;
                    if (i4 > 0) {
                        Object[] objArr2 = dVar.f3214d;
                        c0239d2 = c0239d;
                        i5 = 0;
                        objArr = objArr2;
                        C1077d c1077d = (C1077d) objArr[i5];
                        c1075b.f9087g = c0239d2;
                        c1075b.f9088h = objArr;
                        c1075b.f9089i = i4;
                        c1075b.f9090j = i5;
                        c1075b.f9093m = 1;
                        if (z0.l(c1077d, c0239d2, c1075b) == aVar) {
                            return aVar;
                        }
                        i5++;
                    }
                    return y.f4171a;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i5 = c1075b.f9090j;
                i4 = c1075b.f9089i;
                objArr = c1075b.f9088h;
                C0239d c0239d3 = c1075b.f9087g;
                R1.a.e(obj);
                c0239d2 = c0239d3;
                i5++;
            }
        }
        c1075b = new C1075b(this, cVar);
        Object obj2 = c1075b.f9091k;
        W1.a aVar2 = W1.a.f4608d;
        i3 = c1075b.f9093m;
        if (i3 != 0) {
        }
    }
}
