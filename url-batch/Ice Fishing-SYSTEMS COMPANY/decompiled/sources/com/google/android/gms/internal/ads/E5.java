package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/* loaded from: classes2.dex */
public final /* synthetic */ class E5 implements W5 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ E5 f24640b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ E5 f24641c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ E5 f24642d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ E5 f24643e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ E5 f24644f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ E5 f24645g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ E5 f24646h;
    public static final /* synthetic */ E5 i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ E5 f24647j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ E5 f24648k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ E5 f24649l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ E5 f24650m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ E5 f24651n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ E5 f24652o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ E5 f24653p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ E5 f24654q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ E5 f24655r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ E5 f24656s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ E5 f24657t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ E5 f24658u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ E5 f24659v;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24660a;

    static {
        int i4 = (((((~1272469786) & 1097507524) | 723881402) + ((1272469786 & 1078604356) | 746642480)) - (-1830851820)) ^ (1544617505 % 243268139);
        int i9 = (((((~1722060049) & 1087578905) | 70644109) + ((1722060049 & 1625428690) | 673239279)) - 1747544094) ^ (860516127 % 777720504);
        int i10 = (((((~168057522) & 567809569) | 2007585082) + ((168057522 & 1112917761) | 1200484666)) - (-1753249985)) ^ (1761250573 % 1089653714);
        int i11 = (((((~386839851) & 502322088) | 1879579687) + ((386839851 & 1341449096) | 1376723987)) - (-1804183292)) ^ (2118801173 % 1119399015);
        int i12 = (((((~627992393) & 399075139) | 1263590114) + ((627992393 & 1418280193) | 1644468862)) - (-1502362592)) ^ (1449228398 % 989241888);
        int i13 = (((((~1687776787) & 1627592001) | 771768986) + ((1687776787 & 1226806633) | 136094264)) - 1910482017) ^ (992028067 % 180785147);
        int i14 = (((((~1111088131) & 1881672142) | 1222111317) + ((1111088131 & 807995786) | 38123124)) - 1508183881) ^ (1348361729 % 788380902);
        f24659v = new E5((((((~636453333) & 363983206) | 1075208291) + ((636453333 & 2146013964) | 1783382730)) - (-1139191409)) ^ (1564003050 % 99885196));
        f24658u = new E5((((((~338346092) & 646267944) | 2030210865) + ((338346092 & 109431182) | 1768591350)) - (-956795148)) ^ (1912163036 % 671068506));
        f24657t = new E5((((((~1374600938) & 269492393) | 962980710) + ((1374600938 & (-2079309685)) | (-1096234186))) - (-724963331)) ^ (1587992726 % 995234140));
        f24656s = new E5(i14);
        f24655r = new E5(i11);
        f24654q = new E5(i12);
        E5 e52 = new E5(i13);
        int i15 = (((((~406011017) & 1269108768) | 73167649) + ((406011017 & 2074166272) | 872470299)) - 1878158194) ^ (1615935710 % 639806732);
        int i16 = (((((~257675105) & 286888065) | 1680106172) + ((257675105 & 353998857) | 216033710)) - (-2120570644)) ^ (2033505236 % 29777560);
        int i17 = (((((~2137100237) & 243279585) | 1476690352) + ((2137100237 & 1182836297) | 1215531406)) - (-1785612177)) ^ (1251300606 % 959372260);
        int i18 = (((((~1280321648) & 1509448282) | 1074834725) + ((1280321648 & 434689663) | 67544101)) - 1396684682) ^ (1309383303 % 1129033333);
        int i19 = (((((~1635905385) & 436500164) | 1627617040) + ((1635905385 & 1527677388) | 1092341018)) - (-1251599253)) ^ (1253207672 % 570073850);
        int i20 = (((((~2058657199) & 1077280871) | 426331554) + ((2058657199 & 1242960213) | 260153146)) - 1453981149) ^ (711845894 % 404158660);
        int i21 = (((((~2077486715) & 1348527492) | 196553360) + ((2077486715 & 1547749134) | 218380923)) - 1621461405) ^ (1713258270 % 1573363368);
        int i22 = (((((~1194953865) & 541827704) | 1410336387) + ((1194953865 & 676044922) | 221517442)) - 2090845028) ^ (485560280 % 402724286);
        int i23 = (((((~1424268980) & 433259076) | 136627722) + ((1424268980 & 299303110) | 33824130)) - 448747429) ^ (1129566413 % 184803526);
        f24653p = e52;
        f24652o = new E5(i10);
        f24651n = new E5(i15);
        f24650m = new E5(i16);
        f24649l = new E5(i17);
        f24648k = new E5(i9);
        f24647j = new E5(i18);
        i = new E5(i19);
        f24646h = new E5(i20);
        f24645g = new E5(i4);
        f24644f = new E5(i21);
        f24643e = new E5(i22);
        f24642d = new E5(i23);
        f24641c = new E5(1);
        f24640b = new E5(0);
    }

    public /* synthetic */ E5(int i4) {
        this.f24660a = i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0180, code lost:
    
        if (r1.equals("void") != false) goto L98;
     */
    @Override // java.util.function.Function
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object apply(Object obj) {
        EnumC4261z5 enumC4261z5;
        long j9;
        EnumC4261z5 enumC4261z52;
        EnumC4261z5 enumC4261z53;
        int i4 = this.f24660a;
        long j10 = 1;
        Class<?> cls = Void.TYPE;
        long j11 = 0;
        int i9 = 0;
        try {
            try {
                try {
                    try {
                        switch (i4) {
                            case 0:
                                V5 v52 = ((Y5) obj).f28787a;
                                v52.b(C3020c6.b(v52.c().m() + v52.c().m()));
                                return Optional.empty();
                            case 1:
                                V5 v53 = ((Y5) obj).f28787a;
                                v53.b(C3020c6.c(v53.c().q() + v53.c().q()));
                                return Optional.empty();
                            case 2:
                                V5 v54 = ((Y5) obj).f28787a;
                                v54.b(C3020c6.d(v54.c().n().d(v54.c().n())));
                                return Optional.empty();
                            case 3:
                                Y5 y52 = (Y5) obj;
                                try {
                                    long g9 = y52.f28789c.g();
                                    for (long j12 = 0; j12 < g9; j12++) {
                                        y52.f28787a.b(C3020c6.a(null));
                                    }
                                    return Optional.empty();
                                } catch (U5 unused) {
                                    enumC4261z5 = EnumC4261z5.f35473u;
                                    return Optional.of(enumC4261z5);
                                }
                            case 4:
                                V5 v55 = ((Y5) obj).f28787a;
                                v55.b(C3020c6.b(v55.c().m() & v55.c().m()));
                                return Optional.empty();
                            case 5:
                                long[] jArr = {916768482, 1259538933, 805446160, -15648283, -1266372608, 883303887, 6538657, 384868448, 102194872};
                                long j13 = jArr[0];
                                long j14 = jArr[1];
                                long j15 = jArr[2];
                                long j16 = jArr[3];
                                long j17 = jArr[4];
                                long j18 = jArr[5];
                                long j19 = jArr[6];
                                long j20 = jArr[7];
                                long j21 = (((((~j13) & j14) | j15) + (j17 | (j13 & j16))) - j18) + j19;
                                long j22 = j20 % 102194872;
                                V5 v56 = ((Y5) obj).f28787a;
                                v56.b(C3020c6.b((j21 ^ j22) ^ v56.c().m()));
                                return Optional.empty();
                            case 6:
                                V5 v57 = ((Y5) obj).f28787a;
                                v57.b(C3020c6.b(v57.c().m() | v57.c().m()));
                                return Optional.empty();
                            case 7:
                                V5 v58 = ((Y5) obj).f28787a;
                                v58.b(C3020c6.b(v58.c().m() ^ v58.c().m()));
                                return Optional.empty();
                            case 8:
                                Y5 y53 = (Y5) obj;
                                try {
                                    long m8 = y53.f28787a.c().m();
                                    C3761pr c3761pr = y53.f28788b;
                                    O5 o52 = y53.f28789c;
                                    c3761pr.z(o52.c(), 0L, r1.f28211b);
                                    o52.a(m8);
                                    return Optional.empty();
                                } catch (M5 | N5 unused2) {
                                    enumC4261z5 = EnumC4261z5.f35454L;
                                    return Optional.of(enumC4261z5);
                                } catch (R5 unused3) {
                                    enumC4261z5 = EnumC4261z5.f35464V;
                                    return Optional.of(enumC4261z5);
                                }
                            case 9:
                                Y5 y54 = (Y5) obj;
                                try {
                                    V5 v59 = y54.f28787a;
                                    long m9 = v59.c().m();
                                    ArrayList arrayList = (ArrayList) v59.c().o();
                                    int size = arrayList.size();
                                    Object h9 = v59.c().h();
                                    Object l9 = v59.c().l();
                                    if (l9 instanceof Method) {
                                        Method method = (Method) l9;
                                        Class<?>[] parameterTypes = method.getParameterTypes();
                                        if (parameterTypes.length == size) {
                                            Object[] objArr = new Object[size];
                                            if (h9 instanceof Constructor) {
                                                Class<?>[] parameterTypes2 = ((Constructor) h9).getParameterTypes();
                                                int length = parameterTypes2.length;
                                                Object[] objArr2 = new Object[length];
                                                ArrayList arrayList2 = (ArrayList) ((C3020c6) arrayList.get(0)).o();
                                                if (arrayList2.size() == length) {
                                                    int i10 = 0;
                                                    while (i10 < arrayList2.size()) {
                                                        objArr2[i10] = ((C3020c6) arrayList2.get(i10)).i(parameterTypes2[i10]);
                                                        i10++;
                                                        j11 = j11;
                                                    }
                                                    j9 = j11;
                                                    objArr[0] = objArr2;
                                                }
                                            } else {
                                                j9 = 0;
                                                while (i9 < size) {
                                                    objArr[i9] = ((C3020c6) arrayList.get(i9)).i(parameterTypes[i9]);
                                                    i9++;
                                                }
                                            }
                                            try {
                                                Object invoke = method.invoke(h9, objArr);
                                                y54.f28787a.b((method.getReturnType() == Void.class || method.getReturnType() == cls) ? C3020c6.a(null) : m9 != j9 ? C3020c6.g(invoke) : C3020c6.a(invoke));
                                                return Optional.empty();
                                            } catch (Throwable unused4) {
                                                enumC4261z5 = EnumC4261z5.f35453K;
                                                return Optional.of(enumC4261z5);
                                            }
                                        }
                                    }
                                    return Optional.of(EnumC4261z5.J);
                                } catch (C2911a6 unused5) {
                                    enumC4261z5 = EnumC4261z5.J;
                                }
                                break;
                            case 10:
                                Y5 y55 = (Y5) obj;
                                V5 v510 = y55.f28787a;
                                int intExact = Math.toIntExact(v510.c().m());
                                J5 n9 = v510.c().n();
                                J5 n10 = v510.c().n();
                                if (n9.f25735a.length != 16) {
                                    return Optional.of(EnumC4261z5.f35469o0);
                                }
                                int[] iArr = new int[4];
                                ByteBuffer.wrap(n9.a()).asIntBuffer().get(iArr);
                                G1.a aVar = new G1.a(intExact, 7, iArr);
                                byte[] a9 = n10.a();
                                byte[] bArr = new byte[8];
                                int i11 = 0;
                                while (i11 < a9.length) {
                                    if (i11 % 8 != 0) {
                                        if (i11 == 0) {
                                            i11 = 0;
                                        } else {
                                            a9[i11] = (byte) (((a9[i11] ^ bArr[i11 % 8]) << 24) >> 24);
                                            i11++;
                                        }
                                    }
                                    aVar.t(i11 >>> 3, bArr);
                                    a9[i11] = (byte) (((a9[i11] ^ bArr[i11 % 8]) << 24) >> 24);
                                    i11++;
                                }
                                y55.f28787a.b(C3020c6.d(J5.e(a9)));
                                return Optional.empty();
                            case 11:
                                V5 v511 = ((Y5) obj).f28787a;
                                double q6 = v511.c().q();
                                double q9 = v511.c().q();
                                if (q6 == 0.0d) {
                                    enumC4261z52 = EnumC4261z5.f35467Z;
                                    return Optional.of(enumC4261z52);
                                }
                                v511.b(C3020c6.c(q9 / q6));
                                return Optional.empty();
                            case 12:
                                V5 v512 = ((Y5) obj).f28787a;
                                long m10 = v512.c().m();
                                long m11 = v512.c().m();
                                if (m10 == 0) {
                                    enumC4261z52 = EnumC4261z5.f35467Z;
                                    return Optional.of(enumC4261z52);
                                }
                                v512.b(C3020c6.b(m11 / m10));
                                return Optional.empty();
                            case 13:
                                try {
                                    ((Y5) obj).f28787a.c();
                                    return Optional.empty();
                                } catch (T5 unused6) {
                                    enumC4261z5 = EnumC4261z5.f35463U;
                                    return Optional.of(enumC4261z5);
                                }
                            case 14:
                                Y5 y56 = (Y5) obj;
                                long m12 = y56.f28787a.c().m();
                                V5 v513 = y56.f28787a;
                                v513.b(C3020c6.j(v513.d(m12)));
                                return Optional.empty();
                            case 15:
                                Y5 y57 = (Y5) obj;
                                long m13 = y57.f28788b.E().f27116b + y57.f28787a.c().m();
                                V5 v514 = y57.f28787a;
                                v514.b(C3020c6.j(v514.d(-m13)));
                                return Optional.empty();
                            case 16:
                                Y5 y58 = (Y5) obj;
                                long g10 = y58.f28788b.E().f27116b + y58.f28789c.g();
                                V5 v515 = y58.f28787a;
                                v515.b(C3020c6.j(v515.d(-g10)));
                                return Optional.empty();
                            case 17:
                                try {
                                    V5 v516 = ((Y5) obj).f28787a;
                                    if (new Z5(true).compare(v516.c(), v516.c()) != 0) {
                                        j10 = 0;
                                    }
                                    v516.b(C3020c6.b(j10));
                                    return Optional.empty();
                                } catch (IllegalArgumentException unused7) {
                                    enumC4261z5 = EnumC4261z5.f35476x;
                                    return Optional.of(enumC4261z5);
                                }
                            case 18:
                                try {
                                    V5 v517 = ((Y5) obj).f28787a;
                                    String c4 = v517.c().n().c();
                                    switch (c4.hashCode()) {
                                        case -1325958191:
                                            if (c4.equals("double")) {
                                                cls = Double.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(c4);
                                            break;
                                        case 104431:
                                            if (c4.equals("int")) {
                                                cls = Integer.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(c4);
                                            break;
                                        case 3039496:
                                            if (c4.equals("byte")) {
                                                cls = Byte.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(c4);
                                            break;
                                        case 3052374:
                                            if (c4.equals("char")) {
                                                cls = Character.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(c4);
                                            break;
                                        case 3327612:
                                            if (c4.equals("long")) {
                                                cls = Long.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(c4);
                                            break;
                                        case 3625364:
                                            break;
                                        case 64711720:
                                            if (c4.equals("boolean")) {
                                                cls = Boolean.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(c4);
                                            break;
                                        case 97526364:
                                            if (c4.equals("float")) {
                                                cls = Float.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(c4);
                                            break;
                                        case 109413500:
                                            if (c4.equals("short")) {
                                                cls = Short.TYPE;
                                                break;
                                            }
                                            cls = Class.forName(c4);
                                            break;
                                        default:
                                            cls = Class.forName(c4);
                                            break;
                                    }
                                    v517.b(C3020c6.a(cls));
                                    return Optional.empty();
                                } catch (C2911a6 unused8) {
                                    enumC4261z5 = EnumC4261z5.f35449F;
                                    return Optional.of(enumC4261z5);
                                } catch (ClassNotFoundException unused9) {
                                    enumC4261z5 = EnumC4261z5.f35450G;
                                    return Optional.of(enumC4261z5);
                                }
                            case 19:
                                try {
                                    V5 v518 = ((Y5) obj).f28787a;
                                    ArrayList arrayList3 = (ArrayList) v518.c().o();
                                    Class<?>[] clsArr = new Class[arrayList3.size()];
                                    while (true) {
                                        if (i9 < arrayList3.size()) {
                                            Object l10 = ((C3020c6) arrayList3.get(i9)).l();
                                            if (l10 instanceof Class) {
                                                clsArr[i9] = (Class) l10;
                                                i9++;
                                            } else {
                                                enumC4261z53 = EnumC4261z5.f35451H;
                                            }
                                        } else {
                                            String c9 = v518.c().n().c();
                                            Object l11 = v518.c().l();
                                            if (l11 instanceof Class) {
                                                v518.b(C3020c6.a(((Class) l11).getMethod(c9, clsArr)));
                                                return Optional.empty();
                                            }
                                            enumC4261z53 = EnumC4261z5.f35451H;
                                        }
                                    }
                                    return Optional.of(enumC4261z53);
                                } catch (C2911a6 unused10) {
                                    enumC4261z5 = EnumC4261z5.f35451H;
                                    return Optional.of(enumC4261z5);
                                } catch (NoSuchMethodException unused11) {
                                    enumC4261z5 = EnumC4261z5.f35452I;
                                    return Optional.of(enumC4261z5);
                                } catch (SecurityException unused12) {
                                    enumC4261z5 = EnumC4261z5.f35465W;
                                    return Optional.of(enumC4261z5);
                                }
                            default:
                                V5 v519 = ((Y5) obj).f28787a;
                                long m14 = v519.c().m();
                                C3020c6 c10 = v519.c();
                                C3020c6 c11 = v519.c();
                                int i12 = c11.f29644g;
                                int i13 = i12 - 1;
                                if (i12 == 0) {
                                    throw null;
                                }
                                if (i13 == 3) {
                                    J5 n11 = c11.n();
                                    if (m14 < 0) {
                                        m14 += n11.f25735a.length;
                                    }
                                    if (c10.f29644g != 4) {
                                        throw new C2911a6();
                                    }
                                    if (m14 >= 0 && m14 < n11.f25735a.length) {
                                        char charAt = n11.c().charAt((int) m14);
                                        StringBuilder sb = new StringBuilder(String.valueOf(charAt).length());
                                        sb.append(charAt);
                                        c10 = C3020c6.d(J5.e(sb.toString().getBytes(Charset.forName(I5.a("Hn2H4l0=")))));
                                    }
                                } else {
                                    if (i13 != 4) {
                                        throw new C2911a6();
                                    }
                                    List o9 = c11.o();
                                    if (m14 < 0) {
                                        m14 += ((ArrayList) o9).size();
                                    }
                                    if (m14 >= 0) {
                                        ArrayList arrayList4 = (ArrayList) o9;
                                        if (m14 < arrayList4.size()) {
                                            c10 = (C3020c6) arrayList4.get((int) m14);
                                        }
                                    }
                                }
                                v519.b(c10);
                                return Optional.empty();
                        }
                    } catch (U5 e6) {
                        throw new AssertionError(I5.a("CEiv6BFfPnitUE+D"), e6);
                    }
                } catch (L5 | N5 | C2911a6 unused13) {
                    enumC4261z5 = EnumC4261z5.f35461S;
                }
            } catch (T5 unused14) {
                enumC4261z5 = EnumC4261z5.f35478z;
            }
        } catch (S5 | T5 unused15) {
            enumC4261z5 = EnumC4261z5.f35460R;
        }
    }
}
