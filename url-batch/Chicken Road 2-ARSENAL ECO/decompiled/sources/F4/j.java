package F4;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends D4.k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f770b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f771c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f772d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f773e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(k kVar, byte[] bArr, List list) {
        super(r1 + r3);
        int b7 = D4.j.b(L4.c.f1458c, bArr) + D4.j.d(L4.c.f1456a, kVar);
        int i7 = L4.c.f1457b.f512c;
        Iterator it = list.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            int a7 = ((D4.f) it.next()).a();
            i8 += D4.d.b(a7) + i7 + a7;
        }
        this.f772d = kVar;
        this.f771c = bArr;
        this.f773e = list;
    }

    @Override // D4.f
    public final void c(D4.n nVar) {
        switch (this.f770b) {
            case 0:
                nVar.v(K4.c.f1379a, this.f771c);
                nVar.v(K4.c.f1380b, (byte[]) this.f772d);
                nVar.h(K4.c.f1381c, (m[]) this.f773e);
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                nVar.a(L4.c.f1456a, (k) this.f772d);
                nVar.g(L4.c.f1457b, (List) this.f773e);
                nVar.v(L4.c.f1458c, this.f771c);
                break;
            default:
                nVar.a(L4.b.f1453a, (n) this.f772d);
                nVar.h(L4.b.f1454b, (j[]) this.f773e);
                nVar.v(L4.b.f1455c, this.f771c);
                break;
        }
    }

    public j(n nVar, byte[] bArr, j[] jVarArr) {
        super(D4.j.e(L4.b.f1454b, jVarArr) + D4.j.b(L4.b.f1455c, bArr) + D4.j.d(L4.b.f1453a, nVar));
        this.f772d = nVar;
        this.f771c = bArr;
        this.f773e = jVarArr;
    }

    public j(byte[] bArr, byte[] bArr2, m[] mVarArr) {
        super(D4.j.e(K4.c.f1381c, mVarArr) + D4.j.b(K4.c.f1380b, bArr2) + D4.j.b(K4.c.f1379a, bArr));
        this.f771c = bArr;
        this.f772d = bArr2;
        this.f773e = mVarArr;
    }
}
