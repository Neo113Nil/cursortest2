package d2;

import f1.i0;
import java.util.ArrayList;
import java.util.List;
import x.v0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r extends q6.j implements p6.e {

    /* renamed from: f, reason: collision with root package name */
    public static final r f2170f;

    /* renamed from: g, reason: collision with root package name */
    public static final r f2171g;

    /* renamed from: h, reason: collision with root package name */
    public static final r f2172h;
    public static final r i;

    /* renamed from: j, reason: collision with root package name */
    public static final r f2173j;

    /* renamed from: k, reason: collision with root package name */
    public static final r f2174k;

    /* renamed from: l, reason: collision with root package name */
    public static final r f2175l;

    /* renamed from: m, reason: collision with root package name */
    public static final r f2176m;

    /* renamed from: n, reason: collision with root package name */
    public static final r f2177n;

    /* renamed from: o, reason: collision with root package name */
    public static final r f2178o;

    /* renamed from: p, reason: collision with root package name */
    public static final r f2179p;

    /* renamed from: q, reason: collision with root package name */
    public static final r f2180q;

    /* renamed from: r, reason: collision with root package name */
    public static final r f2181r;

    /* renamed from: s, reason: collision with root package name */
    public static final r f2182s;

    /* renamed from: t, reason: collision with root package name */
    public static final r f2183t;

    /* renamed from: u, reason: collision with root package name */
    public static final r f2184u;

    /* renamed from: v, reason: collision with root package name */
    public static final r f2185v;

    /* renamed from: w, reason: collision with root package name */
    public static final r f2186w;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2187e;

    static {
        int i8 = 2;
        f2170f = new r(i8, 0);
        f2171g = new r(i8, 1);
        f2172h = new r(i8, 2);
        i = new r(i8, 3);
        f2173j = new r(i8, 4);
        f2174k = new r(i8, 5);
        f2175l = new r(i8, 6);
        f2176m = new r(i8, 7);
        f2177n = new r(i8, 8);
        f2178o = new r(i8, 9);
        f2179p = new r(i8, 10);
        f2180q = new r(i8, 11);
        f2181r = new r(i8, 12);
        f2182s = new r(i8, 13);
        f2183t = new r(i8, 14);
        f2184u = new r(i8, 15);
        f2185v = new r(i8, 16);
        f2186w = new r(i8, 17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i8, int i9) {
        super(i8);
        this.f2187e = i9;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        String str;
        c6.c cVar;
        switch (this.f2187e) {
            case 0:
                return (z0.c) obj;
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList h02 = d6.m.h0(list);
                h02.addAll(list2);
                return h02;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                return (z0.m) obj;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                return (c6.m) obj;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                return (c6.m) obj;
            case 5:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 6:
                return (c6.m) obj;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                g gVar = (g) obj;
                int i8 = ((g) obj2).f2122a;
                return gVar;
            case v0.f8304b /* 9 */:
                return (i0) obj;
            case v0.f8306d /* 10 */:
                return (String) obj;
            case 11:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList h03 = d6.m.h0(list3);
                h03.addAll(list4);
                return h03;
            case 12:
                Float f6 = (Float) obj;
                ((Number) obj2).floatValue();
                return f6;
            case 13:
                return (String) obj;
            case 14:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case v0.f8308f /* 15 */:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f2108a) == null) {
                    str = aVar2.f2108a;
                }
                if (aVar == null || (cVar = aVar.f2109b) == null) {
                    cVar = aVar2.f2109b;
                }
                return new a(str, cVar);
            case 16:
                return obj == null ? obj2 : obj;
            default:
                n nVar = (n) obj2;
                Object valueOf = Float.valueOf(0.0f);
                j jVar = ((n) obj).f2159d;
                v vVar = s.f2205s;
                Object g3 = jVar.f2150d.g(vVar);
                if (g3 == null) {
                    g3 = valueOf;
                }
                float floatValue = ((Number) g3).floatValue();
                Object g7 = nVar.f2159d.f2150d.g(vVar);
                if (g7 != null) {
                    valueOf = g7;
                }
                return Integer.valueOf(Float.compare(floatValue, ((Number) valueOf).floatValue()));
        }
    }
}
