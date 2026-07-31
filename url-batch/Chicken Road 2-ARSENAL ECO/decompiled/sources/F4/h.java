package F4;

import N.p;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public final class h implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f765a;

    /* renamed from: b, reason: collision with root package name */
    public int f766b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m[] f767c;

    public /* synthetic */ h(m[] mVarArr, int i7) {
        this.f765a = i7;
        this.f767c = mVarArr;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        m mVar;
        m[] mVarArr;
        byte[] bArr;
        m mVar2;
        switch (this.f765a) {
            case 0:
                X3.a aVar = (X3.a) obj;
                int i7 = this.f766b;
                this.f766b = i7 + 1;
                byte[] d7 = aVar.f2864b.isEmpty() ? i.f768a : aVar.d();
                switch (p.c(aVar.f2863a)) {
                    case 0:
                        mVar = new m(d7, new e(1, D4.j.f((String) obj2)));
                        break;
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        mVar = new m(d7, new d(((Boolean) obj2).booleanValue()));
                        break;
                    case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                        mVar = new m(d7, new l(((Long) obj2).longValue()));
                        break;
                    case 3:
                        mVar = new m(d7, new f(((Double) obj2).doubleValue()));
                        break;
                    case 4:
                        mVar = new m(d7, c.d((List) obj2, new A4.b(6)));
                        break;
                    case 5:
                        mVar = new m(d7, c.d((List) obj2, new A4.b(7)));
                        break;
                    case 6:
                        mVar = new m(d7, c.d((List) obj2, new A4.b(8)));
                        break;
                    case 7:
                        mVar = new m(d7, c.d((List) obj2, new A4.b(9)));
                        break;
                    case 8:
                        W3.b bVar = (W3.b) obj2;
                        if (bVar.isEmpty()) {
                            mVarArr = i.f769b;
                        } else {
                            m[] mVarArr2 = new m[bVar.size()];
                            bVar.forEach(new h(mVarArr2, 0));
                            mVarArr = mVarArr2;
                        }
                        mVar = new m(d7, new c(new b(mVarArr), (byte) 0));
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
                this.f767c[i7] = mVar;
                return;
            default:
                a4.e eVar = (a4.e) obj;
                int i8 = this.f766b;
                this.f766b = i8 + 1;
                if (eVar.f3140b.isEmpty()) {
                    bArr = m.f778d;
                } else {
                    bArr = eVar.f3142d;
                    if (bArr == null) {
                        bArr = eVar.f3140b.getBytes(StandardCharsets.UTF_8);
                        eVar.f3142d = bArr;
                    }
                }
                switch (eVar.f3139a.ordinal()) {
                    case 0:
                        mVar2 = new m(bArr, new e(1, D4.j.f((String) obj2)));
                        break;
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        mVar2 = new m(bArr, new d(((Boolean) obj2).booleanValue()));
                        break;
                    case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                        mVar2 = new m(bArr, new l(((Long) obj2).longValue()));
                        break;
                    case 3:
                        mVar2 = new m(bArr, new f(((Double) obj2).doubleValue()));
                        break;
                    case 4:
                        mVar2 = new m(bArr, c.d((List) obj2, new A4.b(6)));
                        break;
                    case 5:
                        mVar2 = new m(bArr, c.d((List) obj2, new A4.b(7)));
                        break;
                    case 6:
                        mVar2 = new m(bArr, c.d((List) obj2, new A4.b(8)));
                        break;
                    case 7:
                        mVar2 = new m(bArr, c.d((List) obj2, new A4.b(9)));
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
                this.f767c[i8] = mVar2;
                return;
        }
    }
}
