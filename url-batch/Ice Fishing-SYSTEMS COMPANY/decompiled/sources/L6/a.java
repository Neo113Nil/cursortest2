package L6;

import J6.o;
import J6.p;
import J6.q;
import J6.t;
import c6.InterfaceC0543b;
import d6.C4460a;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import u.AbstractC5088e;

/* loaded from: classes2.dex */
public final class a implements q, p {

    /* renamed from: b, reason: collision with root package name */
    public static final a f1748b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f1749c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f1750d = new a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f1751e = new a(3);

    /* renamed from: f, reason: collision with root package name */
    public static final a f1752f = new a(4);

    /* renamed from: g, reason: collision with root package name */
    public static final a f1753g = new a(5);

    /* renamed from: h, reason: collision with root package name */
    public static final a f1754h = new a(6);
    public static final a i = new a(7);

    /* renamed from: j, reason: collision with root package name */
    public static final a f1755j = new a(8);

    /* renamed from: k, reason: collision with root package name */
    public static final a f1756k = new a(9);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1757a;

    public /* synthetic */ a(int i4) {
        this.f1757a = i4;
    }

    @Override // J6.p
    public int a(Object obj, Object obj2, J6.j jVar) {
        int i4 = 0;
        a aVar = f1749c;
        switch (this.f1757a) {
            case 1:
                List list = (List) obj2;
                int ordinal = ((b6.b) obj).ordinal();
                if (ordinal != 4) {
                    if (ordinal == 5) {
                        return t.c(Q6.b.f2724a, list, f1752f, jVar);
                    }
                    if (ordinal == 6) {
                        return t.c(Q6.b.f2724a, list, i, jVar);
                    }
                    if (ordinal == 7) {
                        return t.c(Q6.b.f2724a, list, f1753g, jVar);
                    }
                    throw new IllegalArgumentException("Unsupported attribute type.");
                }
                J6.b bVar = Q6.b.f2724a;
                if (list.isEmpty()) {
                    return 0;
                }
                int i9 = bVar.f1402c;
                int i10 = 0;
                while (i4 < list.size()) {
                    Object obj3 = list.get(i4);
                    int b9 = jVar.b();
                    int d2 = t.d(Q6.a.f2717a, (String) obj3, jVar);
                    jVar.f1425c[b9] = d2;
                    i10 += J6.d.b(d2) + i9 + d2;
                    i4++;
                }
                return i10;
            case 2:
                b6.b bVar2 = ((g6.e) obj).f37931a;
                switch (bVar2.ordinal()) {
                    case 0:
                        return t.d(Q6.a.f2717a, (String) obj2, jVar);
                    case 1:
                        int i11 = Q6.a.f2718b.f1402c;
                        ((Boolean) obj2).getClass();
                        int i12 = J6.d.f1408e;
                        return i11 + 1;
                    case 2:
                        return Q6.a.f2719c.f1402c + J6.d.a(((Long) obj2).longValue());
                    case 3:
                        int i13 = Q6.a.f2720d.f1402c;
                        ((Double) obj2).getClass();
                        int i14 = J6.d.f1408e;
                        return i13 + 8;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return t.b(Q6.a.f2721e, bVar2, (List) obj2, aVar, jVar);
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
            case 3:
                g6.e eVar = (g6.e) obj;
                if (!eVar.f37932b.isEmpty()) {
                    byte[] bArr = eVar.f37934d;
                    if (bArr == null) {
                        bArr = eVar.f37932b.getBytes(StandardCharsets.UTF_8);
                        eVar.f37934d = bArr;
                    }
                    i4 = J6.k.b(Q6.d.f2728a, bArr);
                }
                return t.b(Q6.d.f2729b, eVar, obj2, f1750d, jVar) + i4;
            default:
                C4460a c4460a = (C4460a) obj;
                switch (AbstractC5088e.d(c4460a.f37202a)) {
                    case 0:
                        return t.d(Q6.a.f2717a, (String) obj2, jVar);
                    case 1:
                        int i15 = Q6.a.f2718b.f1402c;
                        ((Boolean) obj2).getClass();
                        int i16 = J6.d.f1408e;
                        return i15 + 1;
                    case 2:
                        return J6.d.a(((Long) obj2).longValue()) + Q6.a.f2719c.f1402c;
                    case 3:
                        int i17 = Q6.a.f2720d.f1402c;
                        ((Double) obj2).getClass();
                        int i18 = J6.d.f1408e;
                        return i17 + 8;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        J6.b bVar3 = Q6.a.f2721e;
                        g6.e a9 = c4460a.a();
                        Objects.requireNonNull(a9);
                        return t.b(bVar3, a9.f37931a, (List) obj2, aVar, jVar);
                    case 8:
                        J6.b bVar4 = Q6.a.f2722f;
                        int b10 = jVar.b();
                        int f6 = i.f(Q6.e.f2730a, (InterfaceC0543b) obj2, jVar);
                        int b11 = J6.d.b(f6) + bVar4.f1402c + f6;
                        jVar.f1425c[b10] = f6;
                        return b11;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
        }
    }

    @Override // J6.q
    public void b(o oVar, Object obj, J6.j jVar) {
        switch (this.f1757a) {
            case 0:
                b6.g gVar = (b6.g) obj;
                switch (AbstractC5088e.d(gVar.getType())) {
                    case 0:
                        oVar.p(Q6.a.f2717a, (String) gVar.getValue(), jVar);
                        return;
                    case 1:
                        oVar.q(Q6.a.f2718b, ((Boolean) gVar.getValue()).booleanValue());
                        return;
                    case 2:
                        oVar.G(Q6.a.f2719c, ((Long) gVar.getValue()).longValue());
                        return;
                    case 3:
                        oVar.x(Q6.a.f2720d, ((Double) gVar.getValue()).doubleValue());
                        return;
                    case 4:
                        J6.b bVar = Q6.a.f2721e;
                        List list = (List) gVar.getValue();
                        oVar.K(bVar, jVar.e());
                        oVar.k(Q6.b.f2724a, list, f1748b, jVar);
                        oVar.z();
                        return;
                    case 5:
                        J6.b bVar2 = Q6.a.f2722f;
                        List list2 = (List) gVar.getValue();
                        oVar.K(bVar2, jVar.e());
                        oVar.k(Q6.e.f2730a, list2, f1755j, jVar);
                        oVar.z();
                        return;
                    case 6:
                        oVar.w(Q6.a.f2723g, (byte[]) jVar.c(byte[].class));
                        return;
                    default:
                        throw new IllegalArgumentException("Unsupported value type.");
                }
            case 1:
            case 2:
            case 3:
            case 6:
            default:
                oVar.p(Q6.a.f2717a, (String) obj, jVar);
                return;
            case 4:
                oVar.q(Q6.a.f2718b, ((Boolean) obj).booleanValue());
                return;
            case 5:
                oVar.x(Q6.a.f2720d, ((Double) obj).doubleValue());
                return;
            case 7:
                oVar.G(Q6.a.f2719c, ((Long) obj).longValue());
                return;
            case 8:
                b6.d dVar = (b6.d) obj;
                String str = dVar.f5567a;
                if (str.isEmpty()) {
                    J6.b bVar3 = Q6.d.f2728a;
                } else {
                    oVar.p(Q6.d.f2728a, str, jVar);
                }
                oVar.b(Q6.d.f2729b, dVar.f5568b, jVar);
                return;
        }
    }

    @Override // J6.q
    public int c(Object obj, J6.j jVar) {
        int b9;
        switch (this.f1757a) {
            case 0:
                b6.g gVar = (b6.g) obj;
                switch (AbstractC5088e.d(gVar.getType())) {
                    case 0:
                        return t.d(Q6.a.f2717a, (String) gVar.getValue(), jVar);
                    case 1:
                        Boolean bool = (Boolean) gVar.getValue();
                        int i4 = Q6.a.f2718b.f1402c;
                        bool.getClass();
                        int i9 = J6.d.f1408e;
                        return i4 + 1;
                    case 2:
                        return Q6.a.f2719c.f1402c + J6.d.a(((Long) gVar.getValue()).longValue());
                    case 3:
                        Double d2 = (Double) gVar.getValue();
                        int i10 = Q6.a.f2720d.f1402c;
                        d2.getClass();
                        int i11 = J6.d.f1408e;
                        return i10 + 8;
                    case 4:
                        J6.b bVar = Q6.a.f2721e;
                        List list = (List) gVar.getValue();
                        int b10 = jVar.b();
                        int c4 = t.c(Q6.b.f2724a, list, f1748b, jVar);
                        b9 = J6.d.b(c4) + bVar.f1402c + c4;
                        jVar.f1425c[b10] = c4;
                        break;
                    case 5:
                        J6.b bVar2 = Q6.a.f2722f;
                        List list2 = (List) gVar.getValue();
                        int b11 = jVar.b();
                        int c9 = t.c(Q6.e.f2730a, list2, f1755j, jVar);
                        b9 = J6.d.b(c9) + bVar2.f1402c + c9;
                        jVar.f1425c[b11] = c9;
                        break;
                    case 6:
                        ByteBuffer byteBuffer = (ByteBuffer) gVar.getValue();
                        int remaining = byteBuffer.remaining();
                        byte[] bArr = new byte[remaining];
                        byteBuffer.get(bArr);
                        jVar.a(bArr);
                        return J6.d.b(remaining) + remaining + Q6.a.f2723g.f1402c;
                    default:
                        throw new IllegalArgumentException("Unsupported value type.");
                }
                return b9;
            case 1:
            case 2:
            case 3:
            case 6:
            default:
                return t.d(Q6.a.f2717a, (String) obj, jVar);
            case 4:
                int i12 = Q6.a.f2718b.f1402c;
                ((Boolean) obj).getClass();
                int i13 = J6.d.f1408e;
                return i12 + 1;
            case 5:
                int i14 = Q6.a.f2720d.f1402c;
                ((Double) obj).getClass();
                int i15 = J6.d.f1408e;
                return i14 + 8;
            case 7:
                return J6.d.a(((Long) obj).longValue()) + Q6.a.f2719c.f1402c;
            case 8:
                b6.d dVar = (b6.d) obj;
                String str = dVar.f5567a;
                return t.a(Q6.d.f2729b, dVar.f5568b, jVar) + (!str.isEmpty() ? t.d(Q6.d.f2728a, str, jVar) : 0);
        }
    }

    @Override // J6.p
    public void d(o oVar, Object obj, Object obj2, J6.j jVar) {
        switch (this.f1757a) {
            case 1:
                List list = (List) obj2;
                int ordinal = ((b6.b) obj).ordinal();
                if (ordinal == 4) {
                    oVar.k(Q6.b.f2724a, list, f1756k, jVar);
                    return;
                }
                if (ordinal == 5) {
                    oVar.k(Q6.b.f2724a, list, f1752f, jVar);
                    return;
                } else if (ordinal == 6) {
                    oVar.k(Q6.b.f2724a, list, i, jVar);
                    return;
                } else {
                    if (ordinal != 7) {
                        throw new IllegalArgumentException("Unsupported attribute type.");
                    }
                    oVar.k(Q6.b.f2724a, list, f1753g, jVar);
                    return;
                }
            case 2:
                b6.b bVar = ((g6.e) obj).f37931a;
                switch (bVar.ordinal()) {
                    case 0:
                        oVar.p(Q6.a.f2717a, (String) obj2, jVar);
                        return;
                    case 1:
                        oVar.q(Q6.a.f2718b, ((Boolean) obj2).booleanValue());
                        return;
                    case 2:
                        oVar.G(Q6.a.f2719c, ((Long) obj2).longValue());
                        return;
                    case 3:
                        oVar.x(Q6.a.f2720d, ((Double) obj2).doubleValue());
                        return;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        oVar.g(Q6.a.f2721e, bVar, (List) obj2, f1749c, jVar);
                        return;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
            case 3:
                g6.e eVar = (g6.e) obj;
                if (eVar.f37932b.isEmpty()) {
                    J6.b bVar2 = Q6.d.f2728a;
                    oVar.getClass();
                } else {
                    byte[] bArr = eVar.f37934d;
                    if (bArr == null) {
                        bArr = eVar.f37932b.getBytes(StandardCharsets.UTF_8);
                        eVar.f37934d = bArr;
                    }
                    oVar.n(Q6.d.f2728a, bArr);
                }
                oVar.g(Q6.d.f2729b, eVar, obj2, f1750d, jVar);
                return;
            default:
                C4460a c4460a = (C4460a) obj;
                switch (AbstractC5088e.d(c4460a.f37202a)) {
                    case 0:
                        oVar.p(Q6.a.f2717a, (String) obj2, jVar);
                        return;
                    case 1:
                        oVar.q(Q6.a.f2718b, ((Boolean) obj2).booleanValue());
                        return;
                    case 2:
                        oVar.G(Q6.a.f2719c, ((Long) obj2).longValue());
                        return;
                    case 3:
                        oVar.x(Q6.a.f2720d, ((Double) obj2).doubleValue());
                        return;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        J6.b bVar3 = Q6.a.f2721e;
                        g6.e a9 = c4460a.a();
                        Objects.requireNonNull(a9);
                        p pVar = f1749c;
                        oVar.g(bVar3, a9.f37931a, (List) obj2, pVar, jVar);
                        return;
                    case 8:
                        J6.b bVar4 = Q6.a.f2722f;
                        oVar.getClass();
                        oVar.K(bVar4, jVar.e());
                        i.e(oVar, Q6.e.f2730a, (InterfaceC0543b) obj2, jVar);
                        oVar.z();
                        return;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
        }
    }
}
