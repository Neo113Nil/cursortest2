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

/* renamed from: O1.zf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1176zf implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final e f8891b = new e(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f8892c = d.f8897i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f8893a;

    /* renamed from: O1.zf$a */
    public static final class a extends AbstractC1176zf {

        /* renamed from: d, reason: collision with root package name */
        private final C0802f f8894d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0802f value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8894d = value;
        }

        public final C0802f c() {
            return this.f8894d;
        }
    }

    /* renamed from: O1.zf$b */
    public static final class b extends AbstractC1176zf {

        /* renamed from: d, reason: collision with root package name */
        private final C0981p f8895d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0981p value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8895d = value;
        }

        public final C0981p c() {
            return this.f8895d;
        }
    }

    /* renamed from: O1.zf$c */
    public static final class c extends AbstractC1176zf {

        /* renamed from: d, reason: collision with root package name */
        private final C1160z f8896d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C1160z value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8896d = value;
        }

        public final C1160z c() {
            return this.f8896d;
        }
    }

    /* renamed from: O1.zf$d */
    static final class d extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final d f8897i = new d();

        d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC1176zf invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC1176zf.f8891b.a(env, it);
        }
    }

    /* renamed from: O1.zf$e */
    public static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC1176zf a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Af) BuiltInParserKt.getBuiltInParserComponent().e9().getValue()).deserialize(env, json);
        }

        private e() {
        }
    }

    /* renamed from: O1.zf$f */
    public static final class f extends AbstractC1176zf {

        /* renamed from: d, reason: collision with root package name */
        private final U f8898d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(U value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8898d = value;
        }

        public final U c() {
            return this.f8898d;
        }
    }

    /* renamed from: O1.zf$g */
    public static final class g extends AbstractC1176zf {

        /* renamed from: d, reason: collision with root package name */
        private final C1141xg f8899d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C1141xg value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8899d = value;
        }

        public final C1141xg c() {
            return this.f8899d;
        }
    }

    /* renamed from: O1.zf$h */
    public static final class h extends AbstractC1176zf {

        /* renamed from: d, reason: collision with root package name */
        private final Ig f8900d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Ig value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8900d = value;
        }

        public final Ig c() {
            return this.f8900d;
        }
    }

    /* renamed from: O1.zf$i */
    public static final class i extends AbstractC1176zf {

        /* renamed from: d, reason: collision with root package name */
        private final ch f8901d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ch value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8901d = value;
        }

        public final ch c() {
            return this.f8901d;
        }
    }

    /* renamed from: O1.zf$j */
    public static final class j extends AbstractC1176zf {

        /* renamed from: d, reason: collision with root package name */
        private final mh f8902d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(mh value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f8902d = value;
        }

        public final mh c() {
            return this.f8902d;
        }
    }

    public /* synthetic */ AbstractC1176zf(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(AbstractC1176zf abstractC1176zf, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (abstractC1176zf == null) {
            return false;
        }
        if (this instanceof i) {
            ch c4 = ((i) this).c();
            Object b4 = abstractC1176zf.b();
            return c4.a(b4 instanceof ch ? (ch) b4 : null, resolver, otherResolver);
        }
        if (this instanceof h) {
            Ig c5 = ((h) this).c();
            Object b5 = abstractC1176zf.b();
            return c5.a(b5 instanceof Ig ? (Ig) b5 : null, resolver, otherResolver);
        }
        if (this instanceof g) {
            C1141xg c6 = ((g) this).c();
            Object b6 = abstractC1176zf.b();
            return c6.a(b6 instanceof C1141xg ? (C1141xg) b6 : null, resolver, otherResolver);
        }
        if (this instanceof b) {
            C0981p c7 = ((b) this).c();
            Object b7 = abstractC1176zf.b();
            return c7.a(b7 instanceof C0981p ? (C0981p) b7 : null, resolver, otherResolver);
        }
        if (this instanceof c) {
            C1160z c8 = ((c) this).c();
            Object b8 = abstractC1176zf.b();
            return c8.a(b8 instanceof C1160z ? (C1160z) b8 : null, resolver, otherResolver);
        }
        if (this instanceof j) {
            mh c9 = ((j) this).c();
            Object b9 = abstractC1176zf.b();
            return c9.a(b9 instanceof mh ? (mh) b9 : null, resolver, otherResolver);
        }
        if (this instanceof f) {
            U c10 = ((f) this).c();
            Object b10 = abstractC1176zf.b();
            return c10.a(b10 instanceof U ? (U) b10 : null, resolver, otherResolver);
        }
        if (!(this instanceof a)) {
            throw new W1.m();
        }
        C0802f c11 = ((a) this).c();
        Object b11 = abstractC1176zf.b();
        return c11.a(b11 instanceof C0802f ? (C0802f) b11 : null, resolver, otherResolver);
    }

    public final Object b() {
        if (this instanceof i) {
            return ((i) this).c();
        }
        if (this instanceof h) {
            return ((h) this).c();
        }
        if (this instanceof g) {
            return ((g) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
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
        Integer num = this.f8893a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(getClass()).hashCode();
        if (this instanceof i) {
            hash = ((i) this).c().hash();
        } else if (this instanceof h) {
            hash = ((h) this).c().hash();
        } else if (this instanceof g) {
            hash = ((g) this).c().hash();
        } else if (this instanceof b) {
            hash = ((b) this).c().hash();
        } else if (this instanceof c) {
            hash = ((c) this).c().hash();
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
        this.f8893a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Af) BuiltInParserKt.getBuiltInParserComponent().e9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private AbstractC1176zf() {
    }
}
