package c4;

import java.util.Map;
import k6.InterfaceC0608c;
import kotlin.Unit;
import kotlin.jvm.internal.C0643h;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0303i {

    /* renamed from: f, reason: collision with root package name */
    public static final C0297c f4224f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0297c f4225g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0297c f4226h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0297c f4227i;
    public static final C0297c j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0297c f4228k;

    /* renamed from: l, reason: collision with root package name */
    public static final C0297c f4229l;

    /* renamed from: m, reason: collision with root package name */
    public static final C0297c f4230m;

    /* renamed from: n, reason: collision with root package name */
    public static final C0297c f4231n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0297c f4232o;

    /* renamed from: p, reason: collision with root package name */
    public static final C0297c f4233p;

    /* renamed from: q, reason: collision with root package name */
    public static final C0297c f4234q;

    /* renamed from: r, reason: collision with root package name */
    public static final C0297c f4235r;

    /* renamed from: s, reason: collision with root package name */
    public static final C0297c f4236s;

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0298d f4237a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0608c f4238b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC0307m f4239c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4240d;

    /* renamed from: e, reason: collision with root package name */
    public final C0304j f4241e;

    static {
        EnumC0298d enumC0298d = EnumC0298d.f4212e;
        C0643h a7 = E.a(Boolean.TYPE);
        EnumC0307m enumC0307m = EnumC0307m.f4251e;
        int i2 = 32;
        C0297c c0297c = new C0297c(enumC0298d, a7, enumC0307m, Boolean.FALSE, i2, 3);
        f4224f = c0297c;
        Class cls = Integer.TYPE;
        int i5 = 0;
        C0297c c0297c2 = new C0297c(enumC0298d, E.a(cls), enumC0307m, i5, i2, 10);
        f4225g = c0297c2;
        new C0299e(c0297c2, 0);
        C0297c c0297c3 = new C0297c(enumC0298d, E.a(cls), enumC0307m, i5, i2, 19);
        f4226h = c0297c3;
        new C0299e(c0297c3, 0);
        new C0299e(new C0297c(enumC0298d, E.a(cls), enumC0307m, i5, i2, 12), 0);
        EnumC0298d enumC0298d2 = EnumC0298d.f4215m;
        int i7 = 32;
        int i8 = 7;
        C0297c c0297c4 = new C0297c(enumC0298d2, E.a(cls), enumC0307m, i5, i7, i8);
        f4227i = c0297c4;
        new C0299e(c0297c4, 0);
        new C0299e(new C0297c(enumC0298d2, E.a(cls), enumC0307m, i5, i7, i8), 0);
        Class cls2 = Long.TYPE;
        long j7 = 0L;
        int i9 = 32;
        C0297c c0297c5 = new C0297c(enumC0298d, E.a(cls2), enumC0307m, j7, i9, 11);
        j = c0297c5;
        new C0299e(c0297c5, 1);
        C0297c c0297c6 = new C0297c(enumC0298d, E.a(cls2), enumC0307m, j7, i9, 20);
        f4228k = c0297c6;
        new C0299e(c0297c6, 1);
        new C0299e(new C0297c(enumC0298d, E.a(cls2), enumC0307m, j7, i9, 13), 1);
        EnumC0298d enumC0298d3 = EnumC0298d.f4213i;
        int i10 = 8;
        C0297c c0297c7 = new C0297c(enumC0298d3, E.a(cls2), enumC0307m, j7, i7, i10);
        f4229l = c0297c7;
        new C0299e(c0297c7, 1);
        new C0299e(new C0297c(enumC0298d3, E.a(cls2), enumC0307m, j7, i7, i10), 1);
        C0297c c0297c8 = new C0297c(enumC0298d2, E.a(Float.TYPE), enumC0307m, Float.valueOf(0.0f), i7, 1);
        new C0296b(c0297c8, (byte) 0);
        int i11 = 32;
        C0297c c0297c9 = new C0297c(enumC0298d3, E.a(Double.TYPE), enumC0307m, Double.valueOf(0.0d), i11, 0);
        f4230m = c0297c9;
        new C0296b(c0297c9);
        EnumC0298d enumC0298d4 = EnumC0298d.f4214l;
        C0297c c0297c10 = new C0297c(enumC0298d4, E.a(T6.i.class), enumC0307m, T6.i.f2618l, i11, 4);
        f4231n = c0297c10;
        C0297c c0297c11 = new C0297c(enumC0298d4, E.a(String.class), enumC0307m, "", i11, 14);
        f4232o = c0297c11;
        C0643h a8 = E.a(Unit.class);
        EnumC0307m enumC0307m2 = EnumC0307m.f4252i;
        int i12 = 48;
        Object obj = null;
        new C0297c(enumC0298d4, a8, enumC0307m2, obj, i12, 6);
        f4233p = new C0297c(enumC0298d4, E.a(Map.class), enumC0307m2, obj, i12, 16);
        f4234q = new C0297c(enumC0298d4, E.a(Map.class), enumC0307m2, obj, i12, 15);
        f4235r = new C0297c(enumC0298d, E.a(Void.class), enumC0307m2, null, 48, 17);
        f4236s = new C0297c(enumC0298d4, E.a(Object.class), enumC0307m2, obj, i12, 18);
        P0.f.n(c0297c9, "type.googleapis.com/google.protobuf.DoubleValue");
        P0.f.n(c0297c8, "type.googleapis.com/google.protobuf.FloatValue");
        P0.f.n(c0297c5, "type.googleapis.com/google.protobuf.Int64Value");
        P0.f.n(c0297c6, "type.googleapis.com/google.protobuf.UInt64Value");
        P0.f.n(c0297c2, "type.googleapis.com/google.protobuf.Int32Value");
        P0.f.n(c0297c3, "type.googleapis.com/google.protobuf.UInt32Value");
        P0.f.n(c0297c, "type.googleapis.com/google.protobuf.BoolValue");
        P0.f.n(c0297c11, "type.googleapis.com/google.protobuf.StringValue");
        P0.f.n(c0297c10, "type.googleapis.com/google.protobuf.BytesValue");
        try {
            new C0297c(enumC0298d4, E.a(C4.l.A()), enumC0307m2, null, 48, 5);
        } catch (NoClassDefFoundError unused) {
            new C0297c();
        }
        try {
            new C0297c(EnumC0298d.f4214l, E.a(C4.l.g()), EnumC0307m.f4252i, null, 48, 9);
        } catch (NoClassDefFoundError unused2) {
            new C0297c();
        }
    }

    public AbstractC0303i(EnumC0298d fieldEncoding, InterfaceC0608c interfaceC0608c, EnumC0307m syntax, Object obj) {
        EnumC0298d enumC0298d;
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
        this.f4237a = fieldEncoding;
        this.f4238b = interfaceC0608c;
        this.f4239c = syntax;
        this.f4240d = obj;
        boolean z7 = this instanceof C0301g;
        if (!z7 && !(this instanceof C0304j) && fieldEncoding != (enumC0298d = EnumC0298d.f4214l)) {
            if (fieldEncoding == enumC0298d) {
                throw new IllegalArgumentException("Unable to pack a length-delimited type.");
            }
            new C0301g(this);
        }
        this.f4241e = ((this instanceof C0304j) || z7) ? null : new C0304j(this);
    }

    public final C0304j a() {
        C0304j c0304j = this.f4241e;
        if (c0304j != null) {
            return c0304j;
        }
        throw new UnsupportedOperationException("Can't create a repeated adapter from a repeated or packed adapter.");
    }

    public abstract Object b(B.f fVar);

    public Object c(C0295a reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        B.f fVar = reader.j;
        if (fVar == null) {
            fVar = new B.f(reader);
            reader.j = fVar;
        }
        return b(fVar);
    }

    public final Object d(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "bytes");
        int length = source.length;
        Intrinsics.checkNotNullParameter(source, "source");
        return c(new C0295a(source, length));
    }

    public abstract void e(l2.c cVar, Object obj);

    public void f(l2.c writer, int i2, Object obj) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (obj != null) {
            EnumC0298d enumC0298d = this.f4237a;
            writer.G(i2, enumC0298d);
            if (enumC0298d == EnumC0298d.f4214l) {
                writer.H(g(obj));
            }
            e(writer, obj);
        }
    }

    public abstract int g(Object obj);

    public int h(int i2, Object obj) {
        if (obj == null) {
            return 0;
        }
        int g7 = g(obj);
        int i5 = 5;
        if (this.f4237a == EnumC0298d.f4214l) {
            g7 += (g7 & (-128)) == 0 ? 1 : (g7 & (-16384)) == 0 ? 2 : (g7 & (-2097152)) == 0 ? 3 : (g7 & (-268435456)) == 0 ? 4 : 5;
        }
        EnumC0298d fieldEncoding = EnumC0298d.f4212e;
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        int i7 = i2 << 3;
        if ((i7 & (-128)) == 0) {
            i5 = 1;
        } else if ((i7 & (-16384)) == 0) {
            i5 = 2;
        } else if ((i7 & (-2097152)) == 0) {
            i5 = 3;
        } else if ((i7 & (-268435456)) == 0) {
            i5 = 4;
        }
        return g7 + i5;
    }

    public /* synthetic */ AbstractC0303i(EnumC0298d enumC0298d, InterfaceC0608c interfaceC0608c, EnumC0307m enumC0307m, Object obj, int i2) {
        this(enumC0298d, interfaceC0608c, enumC0307m, (i2 & 16) != 0 ? null : obj);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC0303i(EnumC0298d fieldEncoding, C0643h c0643h, EnumC0307m syntax, f5.h hVar) {
        this(fieldEncoding, (InterfaceC0608c) c0643h, syntax, (Object) hVar);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC0303i(Class type) {
        this(fieldEncoding, E.a(type), syntax, (Object) null);
        EnumC0298d fieldEncoding = EnumC0298d.f4214l;
        EnumC0307m syntax = EnumC0307m.f4252i;
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
        Intrinsics.checkNotNullParameter(type, "<this>");
    }
}
