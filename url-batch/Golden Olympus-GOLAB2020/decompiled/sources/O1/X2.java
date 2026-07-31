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
public abstract class X2 implements JSONSerializable, Hashable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f5196b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Function2 f5197c = a.f5199i;

    /* renamed from: a, reason: collision with root package name */
    private Integer f5198a;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5199i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X2 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return X2.f5196b.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final X2 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Y2) BuiltInParserKt.getBuiltInParserComponent().C1().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public static final class c extends X2 {

        /* renamed from: d, reason: collision with root package name */
        private final P6 f5200d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(P6 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5200d = value;
        }

        public final P6 c() {
            return this.f5200d;
        }
    }

    public static final class d extends X2 {

        /* renamed from: d, reason: collision with root package name */
        private final A8 f5201d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(A8 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5201d = value;
        }

        public final A8 c() {
            return this.f5201d;
        }
    }

    public static final class e extends X2 {

        /* renamed from: d, reason: collision with root package name */
        private final R8 f5202d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(R8 value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5202d = value;
        }

        public final R8 c() {
            return this.f5202d;
        }
    }

    public static final class f extends X2 {

        /* renamed from: d, reason: collision with root package name */
        private final C1171za f5203d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C1171za value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5203d = value;
        }

        public final C1171za c() {
            return this.f5203d;
        }
    }

    public static final class g extends X2 {

        /* renamed from: d, reason: collision with root package name */
        private final C1119wc f5204d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C1119wc value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f5204d = value;
        }

        public final C1119wc c() {
            return this.f5204d;
        }
    }

    public /* synthetic */ X2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(X2 x22, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (x22 == null) {
            return false;
        }
        if (this instanceof d) {
            A8 c4 = ((d) this).c();
            Object b4 = x22.b();
            return c4.a(b4 instanceof A8 ? (A8) b4 : null, resolver, otherResolver);
        }
        if (this instanceof f) {
            C1171za c5 = ((f) this).c();
            Object b5 = x22.b();
            return c5.a(b5 instanceof C1171za ? (C1171za) b5 : null, resolver, otherResolver);
        }
        if (this instanceof c) {
            P6 c6 = ((c) this).c();
            Object b6 = x22.b();
            return c6.a(b6 instanceof P6 ? (P6) b6 : null, resolver, otherResolver);
        }
        if (this instanceof g) {
            C1119wc c7 = ((g) this).c();
            Object b7 = x22.b();
            return c7.a(b7 instanceof C1119wc ? (C1119wc) b7 : null, resolver, otherResolver);
        }
        if (!(this instanceof e)) {
            throw new W1.m();
        }
        R8 c8 = ((e) this).c();
        Object b8 = x22.b();
        return c8.a(b8 instanceof R8 ? (R8) b8 : null, resolver, otherResolver);
    }

    public final Object b() {
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof g) {
            return ((g) this).c();
        }
        if (this instanceof e) {
            return ((e) this).c();
        }
        throw new W1.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int hash;
        Integer num = this.f5198a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(getClass()).hashCode();
        if (this instanceof d) {
            hash = ((d) this).c().hash();
        } else if (this instanceof f) {
            hash = ((f) this).c().hash();
        } else if (this instanceof c) {
            hash = ((c) this).c().hash();
        } else if (this instanceof g) {
            hash = ((g) this).c().hash();
        } else {
            if (!(this instanceof e)) {
                throw new W1.m();
            }
            hash = ((e) this).c().hash();
        }
        int i4 = hashCode + hash;
        this.f5198a = Integer.valueOf(i4);
        return i4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Y2) BuiltInParserKt.getBuiltInParserComponent().C1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private X2() {
    }
}
