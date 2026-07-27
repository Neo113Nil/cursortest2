package A3;

import java.util.Iterator;
import java.util.List;
import y3.AbstractC1571e;
import y3.C1569c;

/* loaded from: classes.dex */
public final class k extends y3.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f68b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f69c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f70d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f71e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(l lVar, byte[] bArr, List list) {
        super(r1 + r3);
        int b6 = y3.h.b(G3.c.f1018c, bArr) + y3.h.d(G3.c.f1016a, lVar);
        int i2 = G3.c.f1017b.f12384c;
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            int a6 = ((AbstractC1571e) it.next()).a();
            i3 += C1569c.b(a6) + i2 + a6;
        }
        this.f70d = lVar;
        this.f69c = bArr;
        this.f71e = list;
    }

    @Override // y3.AbstractC1571e
    public final void c(y3.m mVar) {
        switch (this.f68b) {
            case 0:
                mVar.y(F3.c.f685a, this.f69c);
                mVar.y(F3.c.f686b, (byte[]) this.f70d);
                mVar.o(F3.c.f687c, (n[]) this.f71e);
                break;
            case 1:
                mVar.a(G3.c.f1016a, (l) this.f70d);
                mVar.g(G3.c.f1017b, (List) this.f71e);
                mVar.y(G3.c.f1018c, this.f69c);
                break;
            default:
                mVar.a(G3.b.f1013a, (o) this.f70d);
                mVar.o(G3.b.f1014b, (k[]) this.f71e);
                mVar.y(G3.b.f1015c, this.f69c);
                break;
        }
    }

    public k(o oVar, byte[] bArr, k[] kVarArr) {
        super(y3.h.e(G3.b.f1014b, kVarArr) + y3.h.b(G3.b.f1015c, bArr) + y3.h.d(G3.b.f1013a, oVar));
        this.f70d = oVar;
        this.f69c = bArr;
        this.f71e = kVarArr;
    }

    public k(byte[] bArr, byte[] bArr2, n[] nVarArr) {
        super(y3.h.e(F3.c.f687c, nVarArr) + y3.h.b(F3.c.f686b, bArr2) + y3.h.b(F3.c.f685a, bArr));
        this.f69c = bArr;
        this.f70d = bArr2;
        this.f71e = nVarArr;
    }
}
