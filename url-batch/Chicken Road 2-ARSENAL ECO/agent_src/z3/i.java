package z3;

import java.util.Map;
import k5.v;
import kotlin.jvm.internal.t;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: f, reason: collision with root package name */
    public static final c f6309f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f6310g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f6311h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f6312i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f6313j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f6314k;

    /* renamed from: l, reason: collision with root package name */
    public static final c f6315l;

    /* renamed from: m, reason: collision with root package name */
    public static final c f6316m;

    /* renamed from: n, reason: collision with root package name */
    public static final c f6317n;

    /* renamed from: o, reason: collision with root package name */
    public static final c f6318o;

    /* renamed from: p, reason: collision with root package name */
    public static final c f6319p;

    /* renamed from: q, reason: collision with root package name */
    public static final c f6320q;

    /* renamed from: r, reason: collision with root package name */
    public static final c f6321r;

    /* renamed from: s, reason: collision with root package name */
    public static final c f6322s;

    /* renamed from: a, reason: collision with root package name */
    public final d f6323a;

    /* renamed from: b, reason: collision with root package name */
    public final D5.c f6324b;

    /* renamed from: c, reason: collision with root package name */
    public final m f6325c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6326d;

    /* renamed from: e, reason: collision with root package name */
    public final j f6327e;

    static {
        d dVar = d.f6297g;
        kotlin.jvm.internal.d a7 = t.a(Boolean.TYPE);
        m mVar = m.f6336g;
        int i7 = 32;
        c cVar = new c(dVar, a7, mVar, Boolean.FALSE, i7, 3);
        f6309f = cVar;
        Class cls = Integer.TYPE;
        int i8 = 0;
        c cVar2 = new c(dVar, t.a(cls), mVar, i8, i7, 10);
        f6310g = cVar2;
        new e(cVar2, 0);
        c cVar3 = new c(dVar, t.a(cls), mVar, i8, i7, 19);
        f6311h = cVar3;
        new e(cVar3, 0);
        new e(new c(dVar, t.a(cls), mVar, i8, i7, 12), 0);
        d dVar2 = d.f6300j;
        int i9 = 32;
        int i10 = 7;
        c cVar4 = new c(dVar2, t.a(cls), mVar, i8, i9, i10);
        f6312i = cVar4;
        new e(cVar4, 0);
        new e(new c(dVar2, t.a(cls), mVar, i8, i9, i10), 0);
        Class cls2 = Long.TYPE;
        long j4 = 0L;
        int i11 = 32;
        c cVar5 = new c(dVar, t.a(cls2), mVar, j4, i11, 11);
        f6313j = cVar5;
        new e(cVar5, 1);
        c cVar6 = new c(dVar, t.a(cls2), mVar, j4, i11, 20);
        f6314k = cVar6;
        new e(cVar6, 1);
        new e(new c(dVar, t.a(cls2), mVar, j4, i11, 13), 1);
        d dVar3 = d.f6298h;
        int i12 = 8;
        c cVar7 = new c(dVar3, t.a(cls2), mVar, j4, i9, i12);
        f6315l = cVar7;
        new e(cVar7, 1);
        new e(new c(dVar3, t.a(cls2), mVar, j4, i9, i12), 1);
        c cVar8 = new c(dVar2, t.a(Float.TYPE), mVar, Float.valueOf(0.0f), i9, 1);
        new b(cVar8, (byte) 0);
        int i13 = 32;
        c cVar9 = new c(dVar3, t.a(Double.TYPE), mVar, Double.valueOf(0.0d), i13, 0);
        f6316m = cVar9;
        new b(cVar9);
        d dVar4 = d.f6299i;
        c cVar10 = new c(dVar4, t.a(n6.i.class), mVar, n6.i.f5525i, i13, 4);
        f6317n = cVar10;
        c cVar11 = new c(dVar4, t.a(String.class), mVar, "", i13, 14);
        f6318o = cVar11;
        kotlin.jvm.internal.d a8 = t.a(v.class);
        m mVar2 = m.f6337h;
        int i14 = 48;
        Object obj = null;
        new c(dVar4, a8, mVar2, obj, i14, 6);
        f6319p = new c(dVar4, t.a(Map.class), mVar2, obj, i14, 16);
        f6320q = new c(dVar4, t.a(Map.class), mVar2, obj, i14, 15);
        f6321r = new c(dVar, t.a(Void.class), mVar2, null, 48, 17);
        f6322s = new c(dVar4, t.a(Object.class), mVar2, obj, i14, 18);
        A3.c.E(cVar9, "type.googleapis.com/google.protobuf.DoubleValue");
        A3.c.E(cVar8, "type.googleapis.com/google.protobuf.FloatValue");
        A3.c.E(cVar5, "type.googleapis.com/google.protobuf.Int64Value");
        A3.c.E(cVar6, "type.googleapis.com/google.protobuf.UInt64Value");
        A3.c.E(cVar2, "type.googleapis.com/google.protobuf.Int32Value");
        A3.c.E(cVar3, "type.googleapis.com/google.protobuf.UInt32Value");
        A3.c.E(cVar, "type.googleapis.com/google.protobuf.BoolValue");
        A3.c.E(cVar11, "type.googleapis.com/google.protobuf.StringValue");
        A3.c.E(cVar10, "type.googleapis.com/google.protobuf.BytesValue");
        try {
            new c(dVar4, t.a(y1.g.n()), mVar2, null, 48, 5);
        } catch (NoClassDefFoundError unused) {
            new c();
        }
        try {
            new c(d.f6299i, t.a(y1.g.e()), m.f6337h, null, 48, 9);
        } catch (NoClassDefFoundError unused2) {
            new c();
        }
    }

    public i(d fieldEncoding, D5.c cVar, m syntax, Object obj) {
        d dVar;
        kotlin.jvm.internal.i.e(fieldEncoding, "fieldEncoding");
        kotlin.jvm.internal.i.e(syntax, "syntax");
        this.f6323a = fieldEncoding;
        this.f6324b = cVar;
        this.f6325c = syntax;
        this.f6326d = obj;
        boolean z5 = this instanceof g;
        if (!z5 && !(this instanceof j) && fieldEncoding != (dVar = d.f6299i)) {
            if (fieldEncoding == dVar) {
                throw new IllegalArgumentException("Unable to pack a length-delimited type.");
            }
            new g(this);
        }
        this.f6327e = ((this instanceof j) || z5) ? null : new j(this);
    }

    public final j a() {
        j jVar = this.f6327e;
        if (jVar != null) {
            return jVar;
        }
        throw new UnsupportedOperationException("Can't create a repeated adapter from a repeated or packed adapter.");
    }

    public abstract Object b(V5.g gVar);

    public Object c(a aVar) {
        V5.g gVar = aVar.f6293j;
        if (gVar == null) {
            gVar = new V5.g(aVar);
            aVar.f6293j = gVar;
        }
        return b(gVar);
    }

    public abstract void d(a6.d dVar, Object obj);

    public void e(a6.d writer, int i7, Object obj) {
        kotlin.jvm.internal.i.e(writer, "writer");
        if (obj != null) {
            d dVar = this.f6323a;
            writer.m(i7, dVar);
            if (dVar == d.f6299i) {
                writer.n(f(obj));
            }
            d(writer, obj);
        }
    }

    public abstract int f(Object obj);

    public int g(int i7, Object obj) {
        if (obj == null) {
            return 0;
        }
        int f7 = f(obj);
        int i8 = 5;
        if (this.f6323a == d.f6299i) {
            f7 += (f7 & (-128)) == 0 ? 1 : (f7 & (-16384)) == 0 ? 2 : (f7 & (-2097152)) == 0 ? 3 : (f7 & (-268435456)) == 0 ? 4 : 5;
        }
        int i9 = i7 << 3;
        if ((i9 & (-128)) == 0) {
            i8 = 1;
        } else if ((i9 & (-16384)) == 0) {
            i8 = 2;
        } else if ((i9 & (-2097152)) == 0) {
            i8 = 3;
        } else if ((i9 & (-268435456)) == 0) {
            i8 = 4;
        }
        return f7 + i8;
    }

    public /* synthetic */ i(d dVar, D5.c cVar, m mVar, Object obj, int i7) {
        this(dVar, cVar, mVar, (i7 & 16) != 0 ? null : obj);
    }

    public i(Class cls) {
        this(d.f6299i, t.a(cls), m.f6337h, null);
    }
}
