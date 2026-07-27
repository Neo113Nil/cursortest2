package B0;

import kotlin.Unit;
import x0.C1303e;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public int f929a;

    /* renamed from: b, reason: collision with root package name */
    public float f930b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f931c;

    public p(int i2, C1303e c1303e) {
        this.f929a = i2;
        this.f931c = c1303e;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float a(int i2, boolean z4, boolean z5, boolean z6) {
        boolean z7;
        int i4;
        int i5 = 1;
        F f4 = (F) this.f931c;
        if (z4) {
            int c4 = A.c(f4.f905f, i2, z4);
            int lineStart = f4.f905f.getLineStart(c4);
            int f5 = f4.f(c4);
            if (i2 == lineStart || i2 == f5) {
                z7 = true;
                int i6 = i2 * 4;
                if (z6) {
                    i5 = z7 ? 2 : 3;
                } else if (z7) {
                    i5 = 0;
                }
                i4 = i6 + i5;
                if (this.f929a != i4) {
                    return this.f930b;
                }
                float h4 = z6 ? f4.h(i2, z4) : f4.i(i2, z4);
                if (z5) {
                    this.f929a = i4;
                    this.f930b = h4;
                }
                return h4;
            }
        }
        z7 = false;
        int i62 = i2 * 4;
        if (z6) {
        }
        i4 = i62 + i5;
        if (this.f929a != i4) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(float f4, E2.c cVar) {
        x0.i iVar;
        int i2;
        p pVar;
        if (cVar instanceof x0.i) {
            iVar = (x0.i) cVar;
            int i4 = iVar.f11437m;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iVar.f11437m = i4 - Integer.MIN_VALUE;
                Object obj = iVar.f11435k;
                D2.a aVar = D2.a.f2163d;
                i2 = iVar.f11437m;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    Float f5 = new Float(f4);
                    iVar.f11434j = this;
                    iVar.f11437m = 1;
                    obj = ((C1303e) this.f931c).h(f5, iVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    pVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = iVar.f11434j;
                    AbstractC1343r.b(obj);
                }
                pVar.f930b += ((Number) obj).floatValue();
                return Unit.f7487a;
            }
        }
        iVar = new x0.i(this, cVar);
        Object obj2 = iVar.f11435k;
        D2.a aVar2 = D2.a.f2163d;
        i2 = iVar.f11437m;
        if (i2 != 0) {
        }
        pVar.f930b += ((Number) obj2).floatValue();
        return Unit.f7487a;
    }

    public p(F f4) {
        this.f931c = f4;
        this.f929a = -1;
    }
}
