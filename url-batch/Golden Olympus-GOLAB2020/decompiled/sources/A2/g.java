package A2;

import A2.f;
import C2.AbstractC0339v0;
import C2.AbstractC0345y0;
import C2.InterfaceC0323n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.AbstractC3219i;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class g implements f, InterfaceC0323n {

    /* renamed from: a, reason: collision with root package name */
    private final String f76a;

    /* renamed from: b, reason: collision with root package name */
    private final j f77b;

    /* renamed from: c, reason: collision with root package name */
    private final int f78c;

    /* renamed from: d, reason: collision with root package name */
    private final List f79d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f80e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f81f;

    /* renamed from: g, reason: collision with root package name */
    private final f[] f82g;

    /* renamed from: h, reason: collision with root package name */
    private final List[] f83h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean[] f84i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f85j;

    /* renamed from: k, reason: collision with root package name */
    private final f[] f86k;

    /* renamed from: l, reason: collision with root package name */
    private final W1.h f87l;

    static final class a extends s implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            g gVar = g.this;
            return Integer.valueOf(AbstractC0345y0.a(gVar, gVar.f86k));
        }
    }

    static final class b extends s implements Function1 {
        b() {
            super(1);
        }

        public final CharSequence a(int i4) {
            return g.this.g(i4) + ": " + g.this.i(i4).a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public g(String serialName, j kind, int i4, List typeParameters, A2.a builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f76a = serialName;
        this.f77b = kind;
        this.f78c = i4;
        this.f79d = builder.c();
        this.f80e = CollectionsKt.toHashSet(builder.f());
        String[] strArr = (String[]) builder.f().toArray(new String[0]);
        this.f81f = strArr;
        this.f82g = AbstractC0339v0.b(builder.e());
        this.f83h = (List[]) builder.d().toArray(new List[0]);
        this.f84i = CollectionsKt.toBooleanArray(builder.g());
        Iterable<IndexedValue> Q02 = AbstractC3219i.Q0(strArr);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(Q02, 10));
        for (IndexedValue indexedValue : Q02) {
            arrayList.add(TuplesKt.to(indexedValue.b(), Integer.valueOf(indexedValue.a())));
        }
        this.f85j = MapsKt.toMap(arrayList);
        this.f86k = AbstractC0339v0.b(typeParameters);
        this.f87l = W1.i.b(new a());
    }

    private final int l() {
        return ((Number) this.f87l.getValue()).intValue();
    }

    @Override // A2.f
    public String a() {
        return this.f76a;
    }

    @Override // C2.InterfaceC0323n
    public Set b() {
        return this.f80e;
    }

    @Override // A2.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // A2.f
    public int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.f85j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // A2.f
    public j e() {
        return this.f77b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        f fVar = (f) obj;
        if (!Intrinsics.areEqual(a(), fVar.a()) || !Arrays.equals(this.f86k, ((g) obj).f86k) || f() != fVar.f()) {
            return false;
        }
        int f4 = f();
        for (int i4 = 0; i4 < f4; i4++) {
            if (!Intrinsics.areEqual(i(i4).a(), fVar.i(i4).a()) || !Intrinsics.areEqual(i(i4).e(), fVar.i(i4).e())) {
                return false;
            }
        }
        return true;
    }

    @Override // A2.f
    public int f() {
        return this.f78c;
    }

    @Override // A2.f
    public String g(int i4) {
        return this.f81f[i4];
    }

    @Override // A2.f
    public List getAnnotations() {
        return this.f79d;
    }

    @Override // A2.f
    public List h(int i4) {
        return this.f83h[i4];
    }

    public int hashCode() {
        return l();
    }

    @Override // A2.f
    public f i(int i4) {
        return this.f82g[i4];
    }

    @Override // A2.f
    public boolean isInline() {
        return f.a.b(this);
    }

    @Override // A2.f
    public boolean j(int i4) {
        return this.f84i[i4];
    }

    public String toString() {
        return CollectionsKt.joinToString$default(kotlin.ranges.g.p(0, f()), ", ", a() + '(', ")", 0, null, new b(), 24, null);
    }
}
