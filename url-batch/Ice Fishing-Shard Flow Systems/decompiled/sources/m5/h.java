package m5;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public final class h implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6564a;

    /* renamed from: b, reason: collision with root package name */
    public int f6565b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m[] f6566c;

    public /* synthetic */ h(m[] mVarArr, int i2) {
        this.f6564a = i2;
        this.f6566c = mVarArr;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        m mVar;
        m[] mVarArr;
        byte[] bArr;
        m mVar2;
        switch (this.f6564a) {
            case 0:
                E4.a aVar = (E4.a) obj;
                int i2 = this.f6565b;
                this.f6565b = i2 + 1;
                byte[] d7 = aVar.f701b.isEmpty() ? i.f6567a : aVar.d();
                switch (S.i.b(aVar.f700a)) {
                    case 0:
                        mVar = new m(d7, new e(k5.h.f((String) obj2), 1));
                        break;
                    case 1:
                        mVar = new m(d7, new d(((Boolean) obj2).booleanValue()));
                        break;
                    case 2:
                        mVar = new m(d7, new l(((Long) obj2).longValue()));
                        break;
                    case 3:
                        mVar = new m(d7, new f(((Double) obj2).doubleValue()));
                        break;
                    case 4:
                        mVar = new m(d7, c.d((List) obj2, new C4.a(20)));
                        break;
                    case 5:
                        mVar = new m(d7, c.d((List) obj2, new C4.a(21)));
                        break;
                    case 6:
                        mVar = new m(d7, c.d((List) obj2, new C4.a(22)));
                        break;
                    case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        mVar = new m(d7, c.d((List) obj2, new C4.a(23)));
                        break;
                    case S.j.BYTES_FIELD_NUMBER /* 8 */:
                        D4.b bVar = (D4.b) obj2;
                        if (bVar.isEmpty()) {
                            mVarArr = i.f6568b;
                        } else {
                            m[] mVarArr2 = new m[bVar.size()];
                            bVar.forEach(new h(mVarArr2, 0));
                            mVarArr = mVarArr2;
                        }
                        mVar = new m(d7, new c(new C0692b(mVarArr), (byte) 0));
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
                this.f6566c[i2] = mVar;
                return;
            default:
                H4.e eVar = (H4.e) obj;
                int i5 = this.f6565b;
                this.f6565b = i5 + 1;
                if (eVar.f991b.isEmpty()) {
                    bArr = m.f6577d;
                } else {
                    bArr = eVar.f993d;
                    if (bArr == null) {
                        bArr = eVar.f991b.getBytes(StandardCharsets.UTF_8);
                        eVar.f993d = bArr;
                    }
                }
                switch (eVar.f990a.ordinal()) {
                    case 0:
                        mVar2 = new m(bArr, new e(k5.h.f((String) obj2), 1));
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
                        mVar2 = new m(bArr, c.d((List) obj2, new C4.a(20)));
                        break;
                    case 5:
                        mVar2 = new m(bArr, c.d((List) obj2, new C4.a(21)));
                        break;
                    case 6:
                        mVar2 = new m(bArr, c.d((List) obj2, new C4.a(22)));
                        break;
                    case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        mVar2 = new m(bArr, c.d((List) obj2, new C4.a(23)));
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
                this.f6566c[i5] = mVar2;
                return;
        }
    }
}
