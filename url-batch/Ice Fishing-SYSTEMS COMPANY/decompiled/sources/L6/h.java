package L6;

import c6.InterfaceC0543b;
import d6.C4460a;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.BiConsumer;
import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class h implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1770a;

    /* renamed from: b, reason: collision with root package name */
    public int f1771b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m[] f1772c;

    public /* synthetic */ h(m[] mVarArr, int i) {
        this.f1770a = i;
        this.f1772c = mVarArr;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        m mVar;
        m[] mVarArr;
        byte[] bArr;
        m mVar2;
        switch (this.f1770a) {
            case 0:
                C4460a c4460a = (C4460a) obj;
                int i = this.f1771b;
                this.f1771b = i + 1;
                byte[] d2 = c4460a.f37203b.isEmpty() ? i.f1773a : c4460a.d();
                switch (AbstractC5088e.d(c4460a.f37202a)) {
                    case 0:
                        mVar = new m(d2, new e(J6.k.f((String) obj2), 1));
                        break;
                    case 1:
                        mVar = new m(d2, new d(((Boolean) obj2).booleanValue()));
                        break;
                    case 2:
                        mVar = new m(d2, new l(((Long) obj2).longValue()));
                        break;
                    case 3:
                        mVar = new m(d2, new f(((Double) obj2).doubleValue()));
                        break;
                    case 4:
                        mVar = new m(d2, c.d((List) obj2, new G6.b(6)));
                        break;
                    case 5:
                        mVar = new m(d2, c.d((List) obj2, new G6.b(7)));
                        break;
                    case 6:
                        mVar = new m(d2, c.d((List) obj2, new G6.b(8)));
                        break;
                    case 7:
                        mVar = new m(d2, c.d((List) obj2, new G6.b(9)));
                        break;
                    case 8:
                        InterfaceC0543b interfaceC0543b = (InterfaceC0543b) obj2;
                        if (interfaceC0543b.isEmpty()) {
                            mVarArr = i.f1774b;
                        } else {
                            m[] mVarArr2 = new m[interfaceC0543b.size()];
                            interfaceC0543b.forEach(new h(mVarArr2, 0));
                            mVarArr = mVarArr2;
                        }
                        mVar = new m(d2, new c(new b(mVarArr), (byte) 0));
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
                this.f1772c[i] = mVar;
                return;
            default:
                g6.e eVar = (g6.e) obj;
                int i4 = this.f1771b;
                this.f1771b = i4 + 1;
                if (eVar.f37932b.isEmpty()) {
                    bArr = m.f1783d;
                } else {
                    bArr = eVar.f37934d;
                    if (bArr == null) {
                        bArr = eVar.f37932b.getBytes(StandardCharsets.UTF_8);
                        eVar.f37934d = bArr;
                    }
                }
                switch (eVar.f37931a.ordinal()) {
                    case 0:
                        mVar2 = new m(bArr, new e(J6.k.f((String) obj2), 1));
                        break;
                    case 1:
                        mVar2 = new m(bArr, new d(((Boolean) obj2).booleanValue()));
                        break;
                    case 2:
                        mVar2 = new m(bArr, new l(((Long) obj2).longValue()));
                        break;
                    case 3:
                        mVar2 = new m(bArr, new f(((Double) obj2).doubleValue()));
                        break;
                    case 4:
                        mVar2 = new m(bArr, c.d((List) obj2, new G6.b(6)));
                        break;
                    case 5:
                        mVar2 = new m(bArr, c.d((List) obj2, new G6.b(7)));
                        break;
                    case 6:
                        mVar2 = new m(bArr, c.d((List) obj2, new G6.b(8)));
                        break;
                    case 7:
                        mVar2 = new m(bArr, c.d((List) obj2, new G6.b(9)));
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
                this.f1772c[i4] = mVar2;
                return;
        }
    }
}
