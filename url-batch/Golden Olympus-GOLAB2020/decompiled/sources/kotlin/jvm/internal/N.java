package kotlin.jvm.internal;

import g2.AbstractC2429a;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class N implements m2.k {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f41138f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final m2.d f41139b;

    /* renamed from: c, reason: collision with root package name */
    private final List f41140c;

    /* renamed from: d, reason: collision with root package name */
    private final m2.k f41141d;

    /* renamed from: e, reason: collision with root package name */
    private final int f41142e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41143a;

        static {
            int[] iArr = new int[m2.l.values().length];
            try {
                iArr[m2.l.f41361b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m2.l.f41362c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m2.l.f41363d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f41143a = iArr;
        }
    }

    static final class c extends s implements Function1 {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull KTypeProjection it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return N.this.b(it);
        }
    }

    public N(m2.d classifier, List arguments, m2.k kVar, int i4) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f41139b = classifier;
        this.f41140c = arguments;
        this.f41141d = kVar;
        this.f41142e = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String b(KTypeProjection kTypeProjection) {
        String valueOf;
        if (kTypeProjection.b() == null) {
            return "*";
        }
        m2.k a4 = kTypeProjection.a();
        N n4 = a4 instanceof N ? (N) a4 : null;
        if (n4 == null || (valueOf = n4.i(true)) == null) {
            valueOf = String.valueOf(kTypeProjection.a());
        }
        int i4 = b.f41143a[kTypeProjection.b().ordinal()];
        if (i4 == 1) {
            return valueOf;
        }
        if (i4 == 2) {
            return "in " + valueOf;
        }
        if (i4 != 3) {
            throw new W1.m();
        }
        return "out " + valueOf;
    }

    private final String i(boolean z4) {
        String name;
        m2.d g4 = g();
        m2.c cVar = g4 instanceof m2.c ? (m2.c) g4 : null;
        Class a4 = cVar != null ? AbstractC2429a.a(cVar) : null;
        if (a4 == null) {
            name = g().toString();
        } else if ((this.f41142e & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (a4.isArray()) {
            name = j(a4);
        } else if (z4 && a4.isPrimitive()) {
            m2.d g5 = g();
            Intrinsics.checkNotNull(g5, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = AbstractC2429a.b((m2.c) g5).getName();
        } else {
            name = a4.getName();
        }
        String str = name + (f().isEmpty() ? "" : CollectionsKt.joinToString$default(f(), ", ", "<", ">", 0, null, new c(), 24, null)) + (d() ? "?" : "");
        m2.k kVar = this.f41141d;
        if (!(kVar instanceof N)) {
            return str;
        }
        String i4 = ((N) kVar).i(true);
        if (Intrinsics.areEqual(i4, str)) {
            return str;
        }
        if (Intrinsics.areEqual(i4, str + '?')) {
            return str + '!';
        }
        return '(' + str + ".." + i4 + ')';
    }

    private final String j(Class cls) {
        return Intrinsics.areEqual(cls, boolean[].class) ? "kotlin.BooleanArray" : Intrinsics.areEqual(cls, char[].class) ? "kotlin.CharArray" : Intrinsics.areEqual(cls, byte[].class) ? "kotlin.ByteArray" : Intrinsics.areEqual(cls, short[].class) ? "kotlin.ShortArray" : Intrinsics.areEqual(cls, int[].class) ? "kotlin.IntArray" : Intrinsics.areEqual(cls, float[].class) ? "kotlin.FloatArray" : Intrinsics.areEqual(cls, long[].class) ? "kotlin.LongArray" : Intrinsics.areEqual(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    @Override // m2.k
    public boolean d() {
        return (this.f41142e & 1) != 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof N)) {
            return false;
        }
        N n4 = (N) obj;
        return Intrinsics.areEqual(g(), n4.g()) && Intrinsics.areEqual(f(), n4.f()) && Intrinsics.areEqual(this.f41141d, n4.f41141d) && this.f41142e == n4.f41142e;
    }

    @Override // m2.k
    public List f() {
        return this.f41140c;
    }

    @Override // m2.k
    public m2.d g() {
        return this.f41139b;
    }

    public int hashCode() {
        return (((g().hashCode() * 31) + f().hashCode()) * 31) + Integer.hashCode(this.f41142e);
    }

    public String toString() {
        return i(false) + " (Kotlin reflection is not available)";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N(m2.d classifier, List arguments, boolean z4) {
        this(classifier, arguments, null, z4 ? 1 : 0);
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
    }
}
