package A3;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import y3.C1568b;
import y3.C1569c;
import y3.r;

/* loaded from: classes.dex */
public final class a implements y3.o, y3.n {

    /* renamed from: b, reason: collision with root package name */
    public static final a f39b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f40c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f41d = new a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f42e = new a(3);

    /* renamed from: f, reason: collision with root package name */
    public static final a f43f = new a(4);

    /* renamed from: g, reason: collision with root package name */
    public static final a f44g = new a(5);

    /* renamed from: h, reason: collision with root package name */
    public static final a f45h = new a(6);

    /* renamed from: i, reason: collision with root package name */
    public static final a f46i = new a(7);

    /* renamed from: j, reason: collision with root package name */
    public static final a f47j = new a(8);

    /* renamed from: k, reason: collision with root package name */
    public static final a f48k = new a(9);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49a;

    public /* synthetic */ a(int i2) {
        this.f49a = i2;
    }

    @Override // y3.o
    public int a(Object obj, y3.g gVar) {
        int b6;
        switch (this.f49a) {
            case 0:
                Q2.g gVar2 = (Q2.g) obj;
                switch (O.j.b(gVar2.getType())) {
                    case 0:
                        return r.d(F3.a.f677a, (String) gVar2.getValue(), gVar);
                    case 1:
                        Boolean bool = (Boolean) gVar2.getValue();
                        int i2 = F3.a.f678b.f12384c;
                        bool.getClass();
                        int i3 = C1569c.f12386e;
                        return i2 + 1;
                    case 2:
                        return F3.a.f679c.f12384c + C1569c.a(((Long) gVar2.getValue()).longValue());
                    case 3:
                        Double d6 = (Double) gVar2.getValue();
                        int i6 = F3.a.f680d.f12384c;
                        d6.getClass();
                        int i7 = C1569c.f12386e;
                        return i6 + 8;
                    case 4:
                        C1568b c1568b = F3.a.f681e;
                        List list = (List) gVar2.getValue();
                        int b7 = gVar.b();
                        int c2 = r.c(F3.b.f684a, list, f39b, gVar);
                        b6 = C1569c.b(c2) + c1568b.f12384c + c2;
                        gVar.f12398c[b7] = c2;
                        break;
                    case 5:
                        C1568b c1568b2 = F3.a.f682f;
                        List list2 = (List) gVar2.getValue();
                        int b8 = gVar.b();
                        int c6 = r.c(F3.e.f690a, list2, f47j, gVar);
                        b6 = C1569c.b(c6) + c1568b2.f12384c + c6;
                        gVar.f12398c[b8] = c6;
                        break;
                    case 6:
                        ByteBuffer byteBuffer = (ByteBuffer) gVar2.getValue();
                        int remaining = byteBuffer.remaining();
                        byte[] bArr = new byte[remaining];
                        byteBuffer.get(bArr);
                        gVar.a(bArr);
                        return C1569c.b(remaining) + remaining + F3.a.f683g.f12384c;
                    default:
                        throw new IllegalArgumentException("Unsupported value type.");
                }
                return b6;
            case 1:
            case 2:
            case 3:
            case 6:
            default:
                return r.d(F3.a.f677a, (String) obj, gVar);
            case 4:
                int i8 = F3.a.f678b.f12384c;
                ((Boolean) obj).getClass();
                int i9 = C1569c.f12386e;
                return i8 + 1;
            case 5:
                int i10 = F3.a.f680d.f12384c;
                ((Double) obj).getClass();
                int i11 = C1569c.f12386e;
                return i10 + 8;
            case 7:
                return C1569c.a(((Long) obj).longValue()) + F3.a.f679c.f12384c;
            case 8:
                Q2.d dVar = (Q2.d) obj;
                String str = dVar.f2485a;
                return r.a(F3.d.f689b, dVar.f2486b, gVar) + (!str.isEmpty() ? r.d(F3.d.f688a, str, gVar) : 0);
        }
    }

    @Override // y3.n
    public void b(y3.m mVar, Object obj, Object obj2, y3.g gVar) {
        switch (this.f49a) {
            case 1:
                List list = (List) obj2;
                int ordinal = ((Q2.b) obj).ordinal();
                if (ordinal == 4) {
                    mVar.p(F3.b.f684a, list, f48k, gVar);
                    return;
                }
                if (ordinal == 5) {
                    mVar.p(F3.b.f684a, list, f43f, gVar);
                    return;
                } else if (ordinal == 6) {
                    mVar.p(F3.b.f684a, list, f46i, gVar);
                    return;
                } else {
                    if (ordinal != 7) {
                        throw new IllegalArgumentException("Unsupported attribute type.");
                    }
                    mVar.p(F3.b.f684a, list, f44g, gVar);
                    return;
                }
            case 2:
                Q2.b bVar = ((V2.e) obj).f3236a;
                switch (bVar.ordinal()) {
                    case 0:
                        mVar.A(F3.a.f677a, (String) obj2, gVar);
                        return;
                    case 1:
                        mVar.C(F3.a.f678b, ((Boolean) obj2).booleanValue());
                        return;
                    case 2:
                        mVar.L(F3.a.f679c, ((Long) obj2).longValue());
                        return;
                    case 3:
                        mVar.E(F3.a.f680d, ((Double) obj2).doubleValue());
                        return;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        mVar.c(F3.a.f681e, bVar, (List) obj2, f40c, gVar);
                        return;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
            case 3:
                V2.e eVar = (V2.e) obj;
                if (eVar.f3237b.isEmpty()) {
                    C1568b c1568b = F3.d.f688a;
                    mVar.getClass();
                } else {
                    byte[] bArr = eVar.f3239d;
                    if (bArr == null) {
                        bArr = eVar.f3237b.getBytes(StandardCharsets.UTF_8);
                        eVar.f3239d = bArr;
                    }
                    mVar.y(F3.d.f688a, bArr);
                }
                mVar.c(F3.d.f689b, eVar, obj2, f41d, gVar);
                return;
            default:
                S2.a aVar = (S2.a) obj;
                switch (O.j.b(aVar.f2745a)) {
                    case 0:
                        mVar.A(F3.a.f677a, (String) obj2, gVar);
                        return;
                    case 1:
                        mVar.C(F3.a.f678b, ((Boolean) obj2).booleanValue());
                        return;
                    case 2:
                        mVar.L(F3.a.f679c, ((Long) obj2).longValue());
                        return;
                    case 3:
                        mVar.E(F3.a.f680d, ((Double) obj2).doubleValue());
                        return;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        C1568b c1568b2 = F3.a.f681e;
                        V2.e a6 = aVar.a();
                        Objects.requireNonNull(a6);
                        y3.n nVar = f40c;
                        mVar.c(c1568b2, a6.f3236a, (List) obj2, nVar, gVar);
                        return;
                    case 8:
                        C1568b c1568b3 = F3.a.f682f;
                        mVar.getClass();
                        mVar.P(c1568b3, gVar.e());
                        j.e(mVar, F3.e.f690a, (R2.b) obj2, gVar);
                        mVar.F();
                        return;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
        }
    }

    @Override // y3.o
    public void c(y3.m mVar, Object obj, y3.g gVar) {
        switch (this.f49a) {
            case 0:
                Q2.g gVar2 = (Q2.g) obj;
                switch (O.j.b(gVar2.getType())) {
                    case 0:
                        mVar.A(F3.a.f677a, (String) gVar2.getValue(), gVar);
                        return;
                    case 1:
                        mVar.C(F3.a.f678b, ((Boolean) gVar2.getValue()).booleanValue());
                        return;
                    case 2:
                        mVar.L(F3.a.f679c, ((Long) gVar2.getValue()).longValue());
                        return;
                    case 3:
                        mVar.E(F3.a.f680d, ((Double) gVar2.getValue()).doubleValue());
                        return;
                    case 4:
                        C1568b c1568b = F3.a.f681e;
                        List list = (List) gVar2.getValue();
                        mVar.getClass();
                        mVar.P(c1568b, gVar.e());
                        mVar.p(F3.b.f684a, list, f39b, gVar);
                        mVar.F();
                        return;
                    case 5:
                        C1568b c1568b2 = F3.a.f682f;
                        List list2 = (List) gVar2.getValue();
                        mVar.getClass();
                        mVar.P(c1568b2, gVar.e());
                        mVar.p(F3.e.f690a, list2, f47j, gVar);
                        mVar.F();
                        return;
                    case 6:
                        mVar.D(F3.a.f683g, (byte[]) gVar.c(byte[].class));
                        return;
                    default:
                        throw new IllegalArgumentException("Unsupported value type.");
                }
            case 1:
            case 2:
            case 3:
            case 6:
            default:
                mVar.A(F3.a.f677a, (String) obj, gVar);
                return;
            case 4:
                mVar.C(F3.a.f678b, ((Boolean) obj).booleanValue());
                return;
            case 5:
                mVar.E(F3.a.f680d, ((Double) obj).doubleValue());
                return;
            case 7:
                mVar.L(F3.a.f679c, ((Long) obj).longValue());
                return;
            case 8:
                Q2.d dVar = (Q2.d) obj;
                String str = dVar.f2485a;
                if (str.isEmpty()) {
                    C1568b c1568b3 = F3.d.f688a;
                    mVar.getClass();
                } else {
                    mVar.A(F3.d.f688a, str, gVar);
                }
                mVar.b(F3.d.f689b, dVar.f2486b, gVar);
                return;
        }
    }

    @Override // y3.n
    public int d(Object obj, Object obj2, y3.g gVar) {
        int i2 = 0;
        a aVar = f40c;
        switch (this.f49a) {
            case 1:
                List list = (List) obj2;
                int ordinal = ((Q2.b) obj).ordinal();
                if (ordinal != 4) {
                    if (ordinal == 5) {
                        return r.c(F3.b.f684a, list, f43f, gVar);
                    }
                    if (ordinal == 6) {
                        return r.c(F3.b.f684a, list, f46i, gVar);
                    }
                    if (ordinal == 7) {
                        return r.c(F3.b.f684a, list, f44g, gVar);
                    }
                    throw new IllegalArgumentException("Unsupported attribute type.");
                }
                C1568b c1568b = F3.b.f684a;
                if (!list.isEmpty()) {
                    int i3 = c1568b.f12384c;
                    int i6 = 0;
                    while (i2 < list.size()) {
                        Object obj3 = list.get(i2);
                        int b6 = gVar.b();
                        int d6 = r.d(F3.a.f677a, (String) obj3, gVar);
                        gVar.f12398c[b6] = d6;
                        i6 += C1569c.b(d6) + i3 + d6;
                        i2++;
                    }
                    i2 = i6;
                }
                return i2;
            case 2:
                Q2.b bVar = ((V2.e) obj).f3236a;
                switch (bVar.ordinal()) {
                    case 0:
                        return r.d(F3.a.f677a, (String) obj2, gVar);
                    case 1:
                        int i7 = F3.a.f678b.f12384c;
                        ((Boolean) obj2).getClass();
                        int i8 = C1569c.f12386e;
                        return i7 + 1;
                    case 2:
                        return F3.a.f679c.f12384c + C1569c.a(((Long) obj2).longValue());
                    case 3:
                        int i9 = F3.a.f680d.f12384c;
                        ((Double) obj2).getClass();
                        int i10 = C1569c.f12386e;
                        return i9 + 8;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return r.b(F3.a.f681e, bVar, (List) obj2, aVar, gVar);
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
            case 3:
                V2.e eVar = (V2.e) obj;
                if (!eVar.f3237b.isEmpty()) {
                    byte[] bArr = eVar.f3239d;
                    if (bArr == null) {
                        bArr = eVar.f3237b.getBytes(StandardCharsets.UTF_8);
                        eVar.f3239d = bArr;
                    }
                    i2 = y3.h.b(F3.d.f688a, bArr);
                }
                return r.b(F3.d.f689b, eVar, obj2, f41d, gVar) + i2;
            default:
                S2.a aVar2 = (S2.a) obj;
                switch (O.j.b(aVar2.f2745a)) {
                    case 0:
                        return r.d(F3.a.f677a, (String) obj2, gVar);
                    case 1:
                        int i11 = F3.a.f678b.f12384c;
                        ((Boolean) obj2).getClass();
                        int i12 = C1569c.f12386e;
                        return i11 + 1;
                    case 2:
                        return C1569c.a(((Long) obj2).longValue()) + F3.a.f679c.f12384c;
                    case 3:
                        int i13 = F3.a.f680d.f12384c;
                        ((Double) obj2).getClass();
                        int i14 = C1569c.f12386e;
                        return i13 + 8;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        C1568b c1568b2 = F3.a.f681e;
                        V2.e a6 = aVar2.a();
                        Objects.requireNonNull(a6);
                        return r.b(c1568b2, a6.f3236a, (List) obj2, aVar, gVar);
                    case 8:
                        C1568b c1568b3 = F3.a.f682f;
                        int b7 = gVar.b();
                        int f3 = j.f(F3.e.f690a, (R2.b) obj2, gVar);
                        int b8 = C1569c.b(f3) + c1568b3.f12384c + f3;
                        gVar.f12398c[b7] = f3;
                        return b8;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
        }
    }
}
