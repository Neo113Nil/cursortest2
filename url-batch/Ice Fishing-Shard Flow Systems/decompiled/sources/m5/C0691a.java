package m5;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import k5.C0602b;
import k5.C0603c;
import k5.q;
import r5.AbstractC0848a;
import r5.AbstractC0849b;
import r5.AbstractC0851d;
import r5.AbstractC0852e;

/* renamed from: m5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0691a implements k5.n, k5.m {

    /* renamed from: b, reason: collision with root package name */
    public static final C0691a f6542b = new C0691a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0691a f6543c = new C0691a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C0691a f6544d = new C0691a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final C0691a f6545e = new C0691a(3);

    /* renamed from: f, reason: collision with root package name */
    public static final C0691a f6546f = new C0691a(4);

    /* renamed from: g, reason: collision with root package name */
    public static final C0691a f6547g = new C0691a(5);

    /* renamed from: h, reason: collision with root package name */
    public static final C0691a f6548h = new C0691a(6);

    /* renamed from: i, reason: collision with root package name */
    public static final C0691a f6549i = new C0691a(7);
    public static final C0691a j = new C0691a(8);

    /* renamed from: k, reason: collision with root package name */
    public static final C0691a f6550k = new C0691a(9);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6551a;

    public /* synthetic */ C0691a(int i2) {
        this.f6551a = i2;
    }

    @Override // k5.n
    public int a(Object obj, k5.g gVar) {
        int b7;
        switch (this.f6551a) {
            case 0:
                C4.j jVar = (C4.j) obj;
                switch (S.i.b(jVar.getType())) {
                    case 0:
                        return q.d(AbstractC0848a.f7527a, (String) jVar.getValue(), gVar);
                    case 1:
                        Boolean bool = (Boolean) jVar.getValue();
                        int i2 = AbstractC0848a.f7528b.f6058c;
                        bool.getClass();
                        int i5 = C0603c.f6060e;
                        return i2 + 1;
                    case 2:
                        return AbstractC0848a.f7529c.f6058c + C0603c.a(((Long) jVar.getValue()).longValue());
                    case 3:
                        Double d7 = (Double) jVar.getValue();
                        int i7 = AbstractC0848a.f7530d.f6058c;
                        d7.getClass();
                        int i8 = C0603c.f6060e;
                        return i7 + 8;
                    case 4:
                        C0602b c0602b = AbstractC0848a.f7531e;
                        List list = (List) jVar.getValue();
                        int b8 = gVar.b();
                        int c7 = q.c(AbstractC0849b.f7534a, list, f6542b, gVar);
                        b7 = C0603c.b(c7) + c0602b.f6058c + c7;
                        gVar.f6072c[b8] = c7;
                        break;
                    case 5:
                        C0602b c0602b2 = AbstractC0848a.f7532f;
                        List list2 = (List) jVar.getValue();
                        int b9 = gVar.b();
                        int c8 = q.c(AbstractC0852e.f7540a, list2, j, gVar);
                        b7 = C0603c.b(c8) + c0602b2.f6058c + c8;
                        gVar.f6072c[b9] = c8;
                        break;
                    case 6:
                        ByteBuffer byteBuffer = (ByteBuffer) jVar.getValue();
                        int remaining = byteBuffer.remaining();
                        byte[] bArr = new byte[remaining];
                        byteBuffer.get(bArr);
                        gVar.a(bArr);
                        return C0603c.b(remaining) + remaining + AbstractC0848a.f7533g.f6058c;
                    default:
                        throw new IllegalArgumentException("Unsupported value type.");
                }
                return b7;
            case 1:
            case 2:
            case 3:
            case 6:
            default:
                return q.d(AbstractC0848a.f7527a, (String) obj, gVar);
            case 4:
                int i9 = AbstractC0848a.f7528b.f6058c;
                ((Boolean) obj).getClass();
                int i10 = C0603c.f6060e;
                return i9 + 1;
            case 5:
                int i11 = AbstractC0848a.f7530d.f6058c;
                ((Double) obj).getClass();
                int i12 = C0603c.f6060e;
                return i11 + 8;
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return C0603c.a(((Long) obj).longValue()) + AbstractC0848a.f7529c.f6058c;
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                C4.g gVar2 = (C4.g) obj;
                String str = gVar2.f310a;
                return q.a(AbstractC0851d.f7539b, gVar2.f311b, gVar) + (!str.isEmpty() ? q.d(AbstractC0851d.f7538a, str, gVar) : 0);
        }
    }

    @Override // k5.m
    public void b(k5.l lVar, Object obj, Object obj2, k5.g gVar) {
        switch (this.f6551a) {
            case 1:
                List list = (List) obj2;
                int ordinal = ((C4.e) obj).ordinal();
                if (ordinal == 4) {
                    lVar.s(AbstractC0849b.f7534a, list, f6550k, gVar);
                    return;
                }
                if (ordinal == 5) {
                    lVar.s(AbstractC0849b.f7534a, list, f6546f, gVar);
                    return;
                } else if (ordinal == 6) {
                    lVar.s(AbstractC0849b.f7534a, list, f6549i, gVar);
                    return;
                } else {
                    if (ordinal != 7) {
                        throw new IllegalArgumentException("Unsupported attribute type.");
                    }
                    lVar.s(AbstractC0849b.f7534a, list, f6547g, gVar);
                    return;
                }
            case 2:
                C4.e eVar = ((H4.e) obj).f990a;
                switch (eVar.ordinal()) {
                    case 0:
                        lVar.E(AbstractC0848a.f7527a, (String) obj2, gVar);
                        return;
                    case 1:
                        lVar.F(AbstractC0848a.f7528b, ((Boolean) obj2).booleanValue());
                        return;
                    case 2:
                        lVar.O(AbstractC0848a.f7529c, ((Long) obj2).longValue());
                        return;
                    case 3:
                        lVar.H(AbstractC0848a.f7530d, ((Double) obj2).doubleValue());
                        return;
                    case 4:
                    case 5:
                    case 6:
                    case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        lVar.g(AbstractC0848a.f7531e, eVar, (List) obj2, f6543c, gVar);
                        return;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
            case 3:
                H4.e eVar2 = (H4.e) obj;
                if (eVar2.f991b.isEmpty()) {
                    C0602b c0602b = AbstractC0851d.f7538a;
                    lVar.getClass();
                } else {
                    byte[] bArr = eVar2.f993d;
                    if (bArr == null) {
                        bArr = eVar2.f991b.getBytes(StandardCharsets.UTF_8);
                        eVar2.f993d = bArr;
                    }
                    lVar.B(AbstractC0851d.f7538a, bArr);
                }
                lVar.g(AbstractC0851d.f7539b, eVar2, obj2, f6544d, gVar);
                return;
            default:
                E4.a aVar = (E4.a) obj;
                switch (S.i.b(aVar.f700a)) {
                    case 0:
                        lVar.E(AbstractC0848a.f7527a, (String) obj2, gVar);
                        return;
                    case 1:
                        lVar.F(AbstractC0848a.f7528b, ((Boolean) obj2).booleanValue());
                        return;
                    case 2:
                        lVar.O(AbstractC0848a.f7529c, ((Long) obj2).longValue());
                        return;
                    case 3:
                        lVar.H(AbstractC0848a.f7530d, ((Double) obj2).doubleValue());
                        return;
                    case 4:
                    case 5:
                    case 6:
                    case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        C0602b c0602b2 = AbstractC0848a.f7531e;
                        H4.e a7 = aVar.a();
                        Objects.requireNonNull(a7);
                        lVar.g(c0602b2, a7.f990a, (List) obj2, f6543c, gVar);
                        return;
                    case S.j.BYTES_FIELD_NUMBER /* 8 */:
                        C0602b c0602b3 = AbstractC0848a.f7532f;
                        lVar.getClass();
                        lVar.S(c0602b3, gVar.e());
                        i.e(lVar, AbstractC0852e.f7540a, (D4.b) obj2, gVar);
                        lVar.I();
                        return;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
        }
    }

    @Override // k5.n
    public void c(k5.l lVar, Object obj, k5.g gVar) {
        switch (this.f6551a) {
            case 0:
                C4.j jVar = (C4.j) obj;
                switch (S.i.b(jVar.getType())) {
                    case 0:
                        lVar.E(AbstractC0848a.f7527a, (String) jVar.getValue(), gVar);
                        return;
                    case 1:
                        lVar.F(AbstractC0848a.f7528b, ((Boolean) jVar.getValue()).booleanValue());
                        return;
                    case 2:
                        lVar.O(AbstractC0848a.f7529c, ((Long) jVar.getValue()).longValue());
                        return;
                    case 3:
                        lVar.H(AbstractC0848a.f7530d, ((Double) jVar.getValue()).doubleValue());
                        return;
                    case 4:
                        C0602b c0602b = AbstractC0848a.f7531e;
                        List list = (List) jVar.getValue();
                        lVar.S(c0602b, gVar.e());
                        lVar.s(AbstractC0849b.f7534a, list, f6542b, gVar);
                        lVar.I();
                        return;
                    case 5:
                        C0602b c0602b2 = AbstractC0848a.f7532f;
                        List list2 = (List) jVar.getValue();
                        lVar.S(c0602b2, gVar.e());
                        lVar.s(AbstractC0852e.f7540a, list2, j, gVar);
                        lVar.I();
                        return;
                    case 6:
                        lVar.G(AbstractC0848a.f7533g, (byte[]) gVar.c(byte[].class));
                        return;
                    default:
                        throw new IllegalArgumentException("Unsupported value type.");
                }
            case 1:
            case 2:
            case 3:
            case 6:
            default:
                lVar.E(AbstractC0848a.f7527a, (String) obj, gVar);
                return;
            case 4:
                lVar.F(AbstractC0848a.f7528b, ((Boolean) obj).booleanValue());
                return;
            case 5:
                lVar.H(AbstractC0848a.f7530d, ((Double) obj).doubleValue());
                return;
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                lVar.O(AbstractC0848a.f7529c, ((Long) obj).longValue());
                return;
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                C4.g gVar2 = (C4.g) obj;
                String str = gVar2.f310a;
                if (str.isEmpty()) {
                    C0602b c0602b3 = AbstractC0851d.f7538a;
                } else {
                    lVar.E(AbstractC0851d.f7538a, str, gVar);
                }
                lVar.d(AbstractC0851d.f7539b, gVar2.f311b, gVar);
                return;
        }
    }

    @Override // k5.m
    public int d(Object obj, Object obj2, k5.g gVar) {
        int i2 = this.f6551a;
        int i5 = 0;
        C0691a c0691a = f6543c;
        switch (i2) {
            case 1:
                List list = (List) obj2;
                int ordinal = ((C4.e) obj).ordinal();
                if (ordinal != 4) {
                    if (ordinal == 5) {
                        return q.c(AbstractC0849b.f7534a, list, f6546f, gVar);
                    }
                    if (ordinal == 6) {
                        return q.c(AbstractC0849b.f7534a, list, f6549i, gVar);
                    }
                    if (ordinal == 7) {
                        return q.c(AbstractC0849b.f7534a, list, f6547g, gVar);
                    }
                    throw new IllegalArgumentException("Unsupported attribute type.");
                }
                C0602b c0602b = AbstractC0849b.f7534a;
                if (list.isEmpty()) {
                    return 0;
                }
                int i7 = c0602b.f6058c;
                int i8 = 0;
                while (i5 < list.size()) {
                    Object obj3 = list.get(i5);
                    int b7 = gVar.b();
                    int d7 = q.d(AbstractC0848a.f7527a, (String) obj3, gVar);
                    gVar.f6072c[b7] = d7;
                    i8 += C0603c.b(d7) + i7 + d7;
                    i5++;
                }
                return i8;
            case 2:
                C4.e eVar = ((H4.e) obj).f990a;
                switch (eVar.ordinal()) {
                    case 0:
                        return q.d(AbstractC0848a.f7527a, (String) obj2, gVar);
                    case 1:
                        int i9 = AbstractC0848a.f7528b.f6058c;
                        ((Boolean) obj2).getClass();
                        int i10 = C0603c.f6060e;
                        return i9 + 1;
                    case 2:
                        return AbstractC0848a.f7529c.f6058c + C0603c.a(((Long) obj2).longValue());
                    case 3:
                        int i11 = AbstractC0848a.f7530d.f6058c;
                        ((Double) obj2).getClass();
                        int i12 = C0603c.f6060e;
                        return i11 + 8;
                    case 4:
                    case 5:
                    case 6:
                    case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        return q.b(AbstractC0848a.f7531e, eVar, (List) obj2, c0691a, gVar);
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
            case 3:
                H4.e eVar2 = (H4.e) obj;
                if (!eVar2.f991b.isEmpty()) {
                    byte[] bArr = eVar2.f993d;
                    if (bArr == null) {
                        bArr = eVar2.f991b.getBytes(StandardCharsets.UTF_8);
                        eVar2.f993d = bArr;
                    }
                    i5 = k5.h.b(AbstractC0851d.f7538a, bArr);
                }
                return q.b(AbstractC0851d.f7539b, eVar2, obj2, f6544d, gVar) + i5;
            default:
                E4.a aVar = (E4.a) obj;
                switch (S.i.b(aVar.f700a)) {
                    case 0:
                        return q.d(AbstractC0848a.f7527a, (String) obj2, gVar);
                    case 1:
                        int i13 = AbstractC0848a.f7528b.f6058c;
                        ((Boolean) obj2).getClass();
                        int i14 = C0603c.f6060e;
                        return i13 + 1;
                    case 2:
                        return C0603c.a(((Long) obj2).longValue()) + AbstractC0848a.f7529c.f6058c;
                    case 3:
                        int i15 = AbstractC0848a.f7530d.f6058c;
                        ((Double) obj2).getClass();
                        int i16 = C0603c.f6060e;
                        return i15 + 8;
                    case 4:
                    case 5:
                    case 6:
                    case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        C0602b c0602b2 = AbstractC0848a.f7531e;
                        H4.e a7 = aVar.a();
                        Objects.requireNonNull(a7);
                        return q.b(c0602b2, a7.f990a, (List) obj2, c0691a, gVar);
                    case S.j.BYTES_FIELD_NUMBER /* 8 */:
                        C0602b c0602b3 = AbstractC0848a.f7532f;
                        int b8 = gVar.b();
                        int f7 = i.f(AbstractC0852e.f7540a, (D4.b) obj2, gVar);
                        int b9 = C0603c.b(f7) + c0602b3.f6058c + f7;
                        gVar.f6072c[b8] = f7;
                        return b9;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
        }
    }
}
