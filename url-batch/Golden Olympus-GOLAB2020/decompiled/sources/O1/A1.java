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

/* loaded from: classes2.dex */
public abstract class A1 implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f1291b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f1292c = a.f1294i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f1293a;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f1294i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A1 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return A1.f1291b.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final A1 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((B1) BuiltInParserKt.getBuiltInParserComponent().D0().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends A1 {

        /* renamed from: d, reason: collision with root package name */
        private final C0890jg f1295d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0890jg value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f1295d = value;
        }

        public final C0890jg c() {
            return this.f1295d;
        }
    }

    public static final class d extends A1 {

        /* renamed from: d, reason: collision with root package name */
        private final C0980og f1296d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C0980og value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f1296d = value;
        }

        public final C0980og c() {
            return this.f1296d;
        }
    }

    public static final class e extends A1 {

        /* renamed from: d, reason: collision with root package name */
        private final Ng f1297d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Ng value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f1297d = value;
        }

        public final Ng c() {
            return this.f1297d;
        }
    }

    public static final class f extends A1 {

        /* renamed from: d, reason: collision with root package name */
        private final Sg f1298d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Sg value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f1298d = value;
        }

        public final Sg c() {
            return this.f1298d;
        }
    }

    public /* synthetic */ A1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(A1 a12, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (a12 == null) {
            return false;
        }
        if (this instanceof e) {
            Ng c4 = ((e) this).c();
            Object b4 = a12.b();
            return c4.a(b4 instanceof Ng ? (Ng) b4 : null, resolver, otherResolver);
        }
        if (this instanceof d) {
            C0980og c5 = ((d) this).c();
            Object b5 = a12.b();
            return c5.a(b5 instanceof C0980og ? (C0980og) b5 : null, resolver, otherResolver);
        }
        if (this instanceof f) {
            Sg c6 = ((f) this).c();
            Object b6 = a12.b();
            return c6.a(b6 instanceof Sg ? (Sg) b6 : null, resolver, otherResolver);
        }
        if (!(this instanceof c)) {
            throw new W1.m();
        }
        C0890jg c7 = ((c) this).c();
        Object b7 = a12.b();
        return c7.a(b7 instanceof C0890jg ? (C0890jg) b7 : null, resolver, otherResolver);
    }

    public final Object b() {
        if (this instanceof e) {
            return ((e) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int hash;
        Integer num = this.f1293a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(getClass()).hashCode();
        if (this instanceof e) {
            hash = ((e) this).c().hash();
        } else if (this instanceof d) {
            hash = ((d) this).c().hash();
        } else if (this instanceof f) {
            hash = ((f) this).c().hash();
        } else {
            if (!(this instanceof c)) {
                throw new W1.m();
            }
            hash = ((c) this).c().hash();
        }
        int i4 = hashCode + hash;
        this.f1293a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((B1) BuiltInParserKt.getBuiltInParserComponent().D0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private A1() {
    }
}
