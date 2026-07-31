package C2;

import A2.f;
import A2.k;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* renamed from: C2.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0343x0 implements A2.f, InterfaceC0323n {

    /* renamed from: a, reason: collision with root package name */
    private final String f340a;

    /* renamed from: b, reason: collision with root package name */
    private final L f341b;

    /* renamed from: c, reason: collision with root package name */
    private final int f342c;

    /* renamed from: d, reason: collision with root package name */
    private int f343d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f344e;

    /* renamed from: f, reason: collision with root package name */
    private final List[] f345f;

    /* renamed from: g, reason: collision with root package name */
    private List f346g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f347h;

    /* renamed from: i, reason: collision with root package name */
    private Map f348i;

    /* renamed from: j, reason: collision with root package name */
    private final W1.h f349j;

    /* renamed from: k, reason: collision with root package name */
    private final W1.h f350k;

    /* renamed from: l, reason: collision with root package name */
    private final W1.h f351l;

    /* renamed from: C2.x0$a */
    static final class a extends kotlin.jvm.internal.s implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            C0343x0 c0343x0 = C0343x0.this;
            return Integer.valueOf(AbstractC0345y0.a(c0343x0, c0343x0.p()));
        }
    }

    /* renamed from: C2.x0$b */
    static final class b extends kotlin.jvm.internal.s implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3527b[] invoke() {
            InterfaceC3527b[] childSerializers;
            L l4 = C0343x0.this.f341b;
            return (l4 == null || (childSerializers = l4.childSerializers()) == null) ? AbstractC0347z0.f360a : childSerializers;
        }
    }

    /* renamed from: C2.x0$c */
    static final class c extends kotlin.jvm.internal.s implements Function1 {
        c() {
            super(1);
        }

        public final CharSequence a(int i4) {
            return C0343x0.this.g(i4) + ": " + C0343x0.this.i(i4).a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* renamed from: C2.x0$d */
    static final class d extends kotlin.jvm.internal.s implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final A2.f[] invoke() {
            ArrayList arrayList;
            InterfaceC3527b[] typeParametersSerializers;
            L l4 = C0343x0.this.f341b;
            if (l4 == null || (typeParametersSerializers = l4.typeParametersSerializers()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(typeParametersSerializers.length);
                for (InterfaceC3527b interfaceC3527b : typeParametersSerializers) {
                    arrayList.add(interfaceC3527b.getDescriptor());
                }
            }
            return AbstractC0339v0.b(arrayList);
        }
    }

    public C0343x0(String serialName, L l4, int i4) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f340a = serialName;
        this.f341b = l4;
        this.f342c = i4;
        this.f343d = -1;
        String[] strArr = new String[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            strArr[i5] = "[UNINITIALIZED]";
        }
        this.f344e = strArr;
        int i6 = this.f342c;
        this.f345f = new List[i6];
        this.f347h = new boolean[i6];
        this.f348i = MapsKt.emptyMap();
        W1.l lVar = W1.l.f9607c;
        this.f349j = W1.i.a(lVar, new b());
        this.f350k = W1.i.a(lVar, new d());
        this.f351l = W1.i.a(lVar, new a());
    }

    public static /* synthetic */ void m(C0343x0 c0343x0, String str, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        c0343x0.l(str, z4);
    }

    private final Map n() {
        HashMap hashMap = new HashMap();
        int length = this.f344e.length;
        for (int i4 = 0; i4 < length; i4++) {
            hashMap.put(this.f344e[i4], Integer.valueOf(i4));
        }
        return hashMap;
    }

    private final InterfaceC3527b[] o() {
        return (InterfaceC3527b[]) this.f349j.getValue();
    }

    private final int q() {
        return ((Number) this.f351l.getValue()).intValue();
    }

    @Override // A2.f
    public String a() {
        return this.f340a;
    }

    @Override // C2.InterfaceC0323n
    public Set b() {
        return this.f348i.keySet();
    }

    @Override // A2.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // A2.f
    public int d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.f348i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // A2.f
    public A2.j e() {
        return k.a.f99a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0343x0)) {
            return false;
        }
        A2.f fVar = (A2.f) obj;
        if (!Intrinsics.areEqual(a(), fVar.a()) || !Arrays.equals(p(), ((C0343x0) obj).p()) || f() != fVar.f()) {
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
    public final int f() {
        return this.f342c;
    }

    @Override // A2.f
    public String g(int i4) {
        return this.f344e[i4];
    }

    @Override // A2.f
    public List getAnnotations() {
        List list = this.f346g;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Override // A2.f
    public List h(int i4) {
        List list = this.f345f[i4];
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public int hashCode() {
        return q();
    }

    @Override // A2.f
    public A2.f i(int i4) {
        return o()[i4].getDescriptor();
    }

    @Override // A2.f
    public boolean isInline() {
        return f.a.b(this);
    }

    @Override // A2.f
    public boolean j(int i4) {
        return this.f347h[i4];
    }

    public final void l(String name, boolean z4) {
        Intrinsics.checkNotNullParameter(name, "name");
        String[] strArr = this.f344e;
        int i4 = this.f343d + 1;
        this.f343d = i4;
        strArr[i4] = name;
        this.f347h[i4] = z4;
        this.f345f[i4] = null;
        if (i4 == this.f342c - 1) {
            this.f348i = n();
        }
    }

    public final A2.f[] p() {
        return (A2.f[]) this.f350k.getValue();
    }

    public final void r(Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        List list = this.f345f[this.f343d];
        if (list == null) {
            list = new ArrayList(1);
            this.f345f[this.f343d] = list;
        }
        list.add(annotation);
    }

    public final void s(Annotation a4) {
        Intrinsics.checkNotNullParameter(a4, "a");
        if (this.f346g == null) {
            this.f346g = new ArrayList(1);
        }
        List list = this.f346g;
        Intrinsics.checkNotNull(list);
        list.add(a4);
    }

    public String toString() {
        return CollectionsKt.joinToString$default(kotlin.ranges.g.p(0, this.f342c), ", ", a() + '(', ")", 0, null, new c(), 24, null);
    }

    public /* synthetic */ C0343x0(String str, L l4, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i5 & 2) != 0 ? null : l4, i4);
    }
}
