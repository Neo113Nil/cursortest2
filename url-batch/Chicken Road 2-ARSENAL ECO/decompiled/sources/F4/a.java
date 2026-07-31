package F4;

import D4.o;
import D4.p;
import D4.s;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a implements p, o {

    /* renamed from: b, reason: collision with root package name */
    public static final a f742b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f743c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f744d = new a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f745e = new a(3);

    /* renamed from: f, reason: collision with root package name */
    public static final a f746f = new a(4);

    /* renamed from: g, reason: collision with root package name */
    public static final a f747g = new a(5);

    /* renamed from: h, reason: collision with root package name */
    public static final a f748h = new a(6);

    /* renamed from: i, reason: collision with root package name */
    public static final a f749i = new a(7);

    /* renamed from: j, reason: collision with root package name */
    public static final a f750j = new a(8);

    /* renamed from: k, reason: collision with root package name */
    public static final a f751k = new a(9);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f752a;

    public /* synthetic */ a(int i7) {
        this.f752a = i7;
    }

    @Override // D4.o
    public void a(D4.n nVar, Object obj, Object obj2, D4.i iVar) {
        switch (this.f752a) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                List list = (List) obj2;
                int ordinal = ((V3.b) obj).ordinal();
                if (ordinal == 4) {
                    nVar.m(K4.b.f1378a, list, f751k, iVar);
                    return;
                }
                if (ordinal == 5) {
                    nVar.m(K4.b.f1378a, list, f746f, iVar);
                    return;
                } else if (ordinal == 6) {
                    nVar.m(K4.b.f1378a, list, f749i, iVar);
                    return;
                } else {
                    if (ordinal != 7) {
                        throw new IllegalArgumentException("Unsupported attribute type.");
                    }
                    nVar.m(K4.b.f1378a, list, f747g, iVar);
                    return;
                }
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                V3.b bVar = ((a4.e) obj).f3139a;
                switch (bVar.ordinal()) {
                    case 0:
                        nVar.y(K4.a.f1371a, (String) obj2, iVar);
                        return;
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        nVar.F(K4.a.f1372b, ((Boolean) obj2).booleanValue());
                        return;
                    case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                        nVar.O(K4.a.f1373c, ((Long) obj2).longValue());
                        return;
                    case 3:
                        nVar.H(K4.a.f1374d, ((Double) obj2).doubleValue());
                        return;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        nVar.e(K4.a.f1375e, bVar, (List) obj2, f743c, iVar);
                        return;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
            case 3:
                a4.e eVar = (a4.e) obj;
                if (eVar.f3140b.isEmpty()) {
                    D4.b bVar2 = K4.d.f1382a;
                    nVar.getClass();
                } else {
                    byte[] bArr = eVar.f3142d;
                    if (bArr == null) {
                        bArr = eVar.f3140b.getBytes(StandardCharsets.UTF_8);
                        eVar.f3142d = bArr;
                    }
                    nVar.v(K4.d.f1382a, bArr);
                }
                nVar.e(K4.d.f1383b, eVar, obj2, f744d, iVar);
                return;
            default:
                X3.a aVar = (X3.a) obj;
                switch (N.p.c(aVar.f2863a)) {
                    case 0:
                        nVar.y(K4.a.f1371a, (String) obj2, iVar);
                        return;
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        nVar.F(K4.a.f1372b, ((Boolean) obj2).booleanValue());
                        return;
                    case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                        nVar.O(K4.a.f1373c, ((Long) obj2).longValue());
                        return;
                    case 3:
                        nVar.H(K4.a.f1374d, ((Double) obj2).doubleValue());
                        return;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        D4.b bVar3 = K4.a.f1375e;
                        a4.e a7 = aVar.a();
                        Objects.requireNonNull(a7);
                        nVar.e(bVar3, a7.f3139a, (List) obj2, f743c, iVar);
                        return;
                    case 8:
                        D4.b bVar4 = K4.a.f1376f;
                        nVar.getClass();
                        nVar.S(bVar4, iVar.e());
                        i.e(nVar, K4.e.f1384a, (W3.b) obj2, iVar);
                        nVar.I();
                        return;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
        }
    }

    @Override // D4.p
    public void b(D4.n nVar, Object obj, D4.i iVar) {
        switch (this.f752a) {
            case 0:
                V3.g gVar = (V3.g) obj;
                switch (N.p.c(gVar.a())) {
                    case 0:
                        nVar.y(K4.a.f1371a, (String) gVar.getValue(), iVar);
                        return;
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        nVar.F(K4.a.f1372b, ((Boolean) gVar.getValue()).booleanValue());
                        return;
                    case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                        nVar.O(K4.a.f1373c, ((Long) gVar.getValue()).longValue());
                        return;
                    case 3:
                        nVar.H(K4.a.f1374d, ((Double) gVar.getValue()).doubleValue());
                        return;
                    case 4:
                        D4.b bVar = K4.a.f1375e;
                        List list = (List) gVar.getValue();
                        nVar.S(bVar, iVar.e());
                        nVar.m(K4.b.f1378a, list, f742b, iVar);
                        nVar.I();
                        return;
                    case 5:
                        D4.b bVar2 = K4.a.f1376f;
                        List list2 = (List) gVar.getValue();
                        nVar.S(bVar2, iVar.e());
                        nVar.m(K4.e.f1384a, list2, f750j, iVar);
                        nVar.I();
                        return;
                    case 6:
                        nVar.G(K4.a.f1377g, (byte[]) iVar.c(byte[].class));
                        return;
                    default:
                        throw new IllegalArgumentException("Unsupported value type.");
                }
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
            case 3:
            case 6:
            default:
                nVar.y(K4.a.f1371a, (String) obj, iVar);
                return;
            case 4:
                nVar.F(K4.a.f1372b, ((Boolean) obj).booleanValue());
                return;
            case 5:
                nVar.H(K4.a.f1374d, ((Double) obj).doubleValue());
                return;
            case 7:
                nVar.O(K4.a.f1373c, ((Long) obj).longValue());
                return;
            case 8:
                V3.d dVar = (V3.d) obj;
                String str = dVar.f2716a;
                if (str.isEmpty()) {
                    D4.b bVar3 = K4.d.f1382a;
                } else {
                    nVar.y(K4.d.f1382a, str, iVar);
                }
                nVar.d(K4.d.f1383b, dVar.f2717b, iVar);
                return;
        }
    }

    @Override // D4.p
    public int c(Object obj, D4.i iVar) {
        int b7;
        switch (this.f752a) {
            case 0:
                V3.g gVar = (V3.g) obj;
                switch (N.p.c(gVar.a())) {
                    case 0:
                        return s.d(K4.a.f1371a, (String) gVar.getValue(), iVar);
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        Boolean bool = (Boolean) gVar.getValue();
                        int i7 = K4.a.f1372b.f512c;
                        bool.getClass();
                        int i8 = D4.d.f518e;
                        return i7 + 1;
                    case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                        return K4.a.f1373c.f512c + D4.d.a(((Long) gVar.getValue()).longValue());
                    case 3:
                        Double d7 = (Double) gVar.getValue();
                        int i9 = K4.a.f1374d.f512c;
                        d7.getClass();
                        int i10 = D4.d.f518e;
                        return i9 + 8;
                    case 4:
                        D4.b bVar = K4.a.f1375e;
                        List list = (List) gVar.getValue();
                        int b8 = iVar.b();
                        int c7 = s.c(K4.b.f1378a, list, f742b, iVar);
                        b7 = D4.d.b(c7) + bVar.f512c + c7;
                        iVar.f533c[b8] = c7;
                        break;
                    case 5:
                        D4.b bVar2 = K4.a.f1376f;
                        List list2 = (List) gVar.getValue();
                        int b9 = iVar.b();
                        int c8 = s.c(K4.e.f1384a, list2, f750j, iVar);
                        b7 = D4.d.b(c8) + bVar2.f512c + c8;
                        iVar.f533c[b9] = c8;
                        break;
                    case 6:
                        ByteBuffer byteBuffer = (ByteBuffer) gVar.getValue();
                        int remaining = byteBuffer.remaining();
                        byte[] bArr = new byte[remaining];
                        byteBuffer.get(bArr);
                        iVar.a(bArr);
                        return D4.d.b(remaining) + remaining + K4.a.f1377g.f512c;
                    default:
                        throw new IllegalArgumentException("Unsupported value type.");
                }
                return b7;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
            case 3:
            case 6:
            default:
                return s.d(K4.a.f1371a, (String) obj, iVar);
            case 4:
                int i11 = K4.a.f1372b.f512c;
                ((Boolean) obj).getClass();
                int i12 = D4.d.f518e;
                return i11 + 1;
            case 5:
                int i13 = K4.a.f1374d.f512c;
                ((Double) obj).getClass();
                int i14 = D4.d.f518e;
                return i13 + 8;
            case 7:
                return D4.d.a(((Long) obj).longValue()) + K4.a.f1373c.f512c;
            case 8:
                V3.d dVar = (V3.d) obj;
                String str = dVar.f2716a;
                return s.a(K4.d.f1383b, dVar.f2717b, iVar) + (!str.isEmpty() ? s.d(K4.d.f1382a, str, iVar) : 0);
        }
    }

    @Override // D4.o
    public int d(Object obj, Object obj2, D4.i iVar) {
        int i7 = this.f752a;
        int i8 = 0;
        a aVar = f743c;
        switch (i7) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                List list = (List) obj2;
                int ordinal = ((V3.b) obj).ordinal();
                if (ordinal != 4) {
                    if (ordinal == 5) {
                        return s.c(K4.b.f1378a, list, f746f, iVar);
                    }
                    if (ordinal == 6) {
                        return s.c(K4.b.f1378a, list, f749i, iVar);
                    }
                    if (ordinal == 7) {
                        return s.c(K4.b.f1378a, list, f747g, iVar);
                    }
                    throw new IllegalArgumentException("Unsupported attribute type.");
                }
                D4.b bVar = K4.b.f1378a;
                if (list.isEmpty()) {
                    return 0;
                }
                int i9 = bVar.f512c;
                int i10 = 0;
                while (i8 < list.size()) {
                    Object obj3 = list.get(i8);
                    int b7 = iVar.b();
                    int d7 = s.d(K4.a.f1371a, (String) obj3, iVar);
                    iVar.f533c[b7] = d7;
                    i10 += D4.d.b(d7) + i9 + d7;
                    i8++;
                }
                return i10;
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                V3.b bVar2 = ((a4.e) obj).f3139a;
                switch (bVar2.ordinal()) {
                    case 0:
                        return s.d(K4.a.f1371a, (String) obj2, iVar);
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        int i11 = K4.a.f1372b.f512c;
                        ((Boolean) obj2).getClass();
                        int i12 = D4.d.f518e;
                        return i11 + 1;
                    case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                        return K4.a.f1373c.f512c + D4.d.a(((Long) obj2).longValue());
                    case 3:
                        int i13 = K4.a.f1374d.f512c;
                        ((Double) obj2).getClass();
                        int i14 = D4.d.f518e;
                        return i13 + 8;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return s.b(K4.a.f1375e, bVar2, (List) obj2, aVar, iVar);
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
            case 3:
                a4.e eVar = (a4.e) obj;
                if (!eVar.f3140b.isEmpty()) {
                    byte[] bArr = eVar.f3142d;
                    if (bArr == null) {
                        bArr = eVar.f3140b.getBytes(StandardCharsets.UTF_8);
                        eVar.f3142d = bArr;
                    }
                    i8 = D4.j.b(K4.d.f1382a, bArr);
                }
                return s.b(K4.d.f1383b, eVar, obj2, f744d, iVar) + i8;
            default:
                X3.a aVar2 = (X3.a) obj;
                switch (N.p.c(aVar2.f2863a)) {
                    case 0:
                        return s.d(K4.a.f1371a, (String) obj2, iVar);
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        int i15 = K4.a.f1372b.f512c;
                        ((Boolean) obj2).getClass();
                        int i16 = D4.d.f518e;
                        return i15 + 1;
                    case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                        return D4.d.a(((Long) obj2).longValue()) + K4.a.f1373c.f512c;
                    case 3:
                        int i17 = K4.a.f1374d.f512c;
                        ((Double) obj2).getClass();
                        int i18 = D4.d.f518e;
                        return i17 + 8;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        D4.b bVar3 = K4.a.f1375e;
                        a4.e a7 = aVar2.a();
                        Objects.requireNonNull(a7);
                        return s.b(bVar3, a7.f3139a, (List) obj2, aVar, iVar);
                    case 8:
                        D4.b bVar4 = K4.a.f1376f;
                        int b8 = iVar.b();
                        int f7 = i.f(K4.e.f1384a, (W3.b) obj2, iVar);
                        int b9 = D4.d.b(f7) + bVar4.f512c + f7;
                        iVar.f533c[b8] = f7;
                        return b9;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
        }
    }
}
