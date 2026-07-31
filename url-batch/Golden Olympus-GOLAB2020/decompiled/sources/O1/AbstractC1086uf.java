package O1;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.uf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1086uf implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final e f8171b = new e(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f8172c = d.f8177i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f8173a;

    /* renamed from: O1.uf$a */
    public static final class a extends AbstractC1086uf {

        /* renamed from: d, reason: collision with root package name */
        private final C0712a f8174d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0712a value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8174d = value;
        }

        public final C0712a c() {
            return this.f8174d;
        }
    }

    /* renamed from: O1.uf$b */
    public static final class b extends AbstractC1086uf {

        /* renamed from: d, reason: collision with root package name */
        private final C0891k f8175d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0891k value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8175d = value;
        }

        public final C0891k c() {
            return this.f8175d;
        }
    }

    /* renamed from: O1.uf$c */
    public static final class c extends AbstractC1086uf {

        /* renamed from: d, reason: collision with root package name */
        private final C1070u f8176d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C1070u value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8176d = value;
        }

        public final C1070u c() {
            return this.f8176d;
        }
    }

    /* renamed from: O1.uf$d */
    static final class d extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final d f8177i = new d();

        d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC1086uf invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC1086uf.f8171b.a(env, it);
        }
    }

    /* renamed from: O1.uf$e */
    public static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC1086uf a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C1104vf) BuiltInParserKt.getBuiltInParserComponent().b9().getValue()).deserialize(env, json);
        }

        private e() {
        }
    }

    /* renamed from: O1.uf$f */
    public static final class f extends AbstractC1086uf {

        /* renamed from: d, reason: collision with root package name */
        private final O f8178d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(O value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8178d = value;
        }

        public final O c() {
            return this.f8178d;
        }
    }

    /* renamed from: O1.uf$g */
    public static final class g extends AbstractC1086uf {

        /* renamed from: d, reason: collision with root package name */
        private final C1051sg f8179d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C1051sg value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8179d = value;
        }

        public final C1051sg c() {
            return this.f8179d;
        }
    }

    /* renamed from: O1.uf$h */
    public static final class h extends AbstractC1086uf {

        /* renamed from: d, reason: collision with root package name */
        private final Dg f8180d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Dg value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8180d = value;
        }

        public final Dg c() {
            return this.f8180d;
        }
    }

    /* renamed from: O1.uf$i */
    public static final class i extends AbstractC1086uf {

        /* renamed from: d, reason: collision with root package name */
        private final Xg f8181d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Xg value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8181d = value;
        }

        public final Xg c() {
            return this.f8181d;
        }
    }

    /* renamed from: O1.uf$j */
    public static final class j extends AbstractC1086uf {

        /* renamed from: d, reason: collision with root package name */
        private final hh f8182d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(hh value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8182d = value;
        }

        public final hh c() {
            return this.f8182d;
        }
    }

    public /* synthetic */ AbstractC1086uf(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(AbstractC1086uf abstractC1086uf, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (abstractC1086uf == null) {
            return false;
        }
        if (this instanceof i) {
            Xg c4 = ((i) this).c();
            Object b4 = abstractC1086uf.b();
            return c4.a(b4 instanceof Xg ? (Xg) b4 : null, resolver, otherResolver);
        }
        if (this instanceof g) {
            C1051sg c5 = ((g) this).c();
            Object b5 = abstractC1086uf.b();
            return c5.a(b5 instanceof C1051sg ? (C1051sg) b5 : null, resolver, otherResolver);
        }
        if (this instanceof h) {
            Dg c6 = ((h) this).c();
            Object b6 = abstractC1086uf.b();
            return c6.a(b6 instanceof Dg ? (Dg) b6 : null, resolver, otherResolver);
        }
        if (this instanceof c) {
            C1070u c7 = ((c) this).c();
            Object b7 = abstractC1086uf.b();
            return c7.a(b7 instanceof C1070u ? (C1070u) b7 : null, resolver, otherResolver);
        }
        if (this instanceof b) {
            C0891k c8 = ((b) this).c();
            Object b8 = abstractC1086uf.b();
            return c8.a(b8 instanceof C0891k ? (C0891k) b8 : null, resolver, otherResolver);
        }
        if (this instanceof j) {
            hh c9 = ((j) this).c();
            Object b9 = abstractC1086uf.b();
            return c9.a(b9 instanceof hh ? (hh) b9 : null, resolver, otherResolver);
        }
        if (this instanceof f) {
            O c10 = ((f) this).c();
            Object b10 = abstractC1086uf.b();
            return c10.a(b10 instanceof O ? (O) b10 : null, resolver, otherResolver);
        }
        if (!(this instanceof a)) {
            throw new W1.m();
        }
        C0712a c11 = ((a) this).c();
        Object b11 = abstractC1086uf.b();
        return c11.a(b11 instanceof C0712a ? (C0712a) b11 : null, resolver, otherResolver);
    }

    public final Object b() {
        if (this instanceof i) {
            return ((i) this).c();
        }
        if (this instanceof g) {
            return ((g) this).c();
        }
        if (this instanceof h) {
            return ((h) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof j) {
            return ((j) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof a) {
            return ((a) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int hash;
        Integer num = this.f8173a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(getClass()).hashCode();
        if (this instanceof i) {
            hash = ((i) this).c().hash();
        } else if (this instanceof g) {
            hash = ((g) this).c().hash();
        } else if (this instanceof h) {
            hash = ((h) this).c().hash();
        } else if (this instanceof c) {
            hash = ((c) this).c().hash();
        } else if (this instanceof b) {
            hash = ((b) this).c().hash();
        } else if (this instanceof j) {
            hash = ((j) this).c().hash();
        } else if (this instanceof f) {
            hash = ((f) this).c().hash();
        } else {
            if (!(this instanceof a)) {
                throw new W1.m();
            }
            hash = ((a) this).c().hash();
        }
        int i4 = hashCode + hash;
        this.f8173a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C1104vf) BuiltInParserKt.getBuiltInParserComponent().b9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC1086uf() {
    }
}
