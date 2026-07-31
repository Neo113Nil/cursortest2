package O1;

import O1.Ya;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Xa implements JSONSerializable, Hashable {

    /* renamed from: c, reason: collision with root package name */
    public static final b f5267c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f5268d = a.f5271i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f5269a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f5270b;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5271i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Xa invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Xa.f5267c.a(env, it);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Xa a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((Ya.c) BuiltInParserKt.getBuiltInParserComponent().r6().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    public enum c {
        NEAREST_CORNER("nearest_corner"),
        FARTHEST_CORNER("farthest_corner"),
        NEAREST_SIDE("nearest_side"),
        FARTHEST_SIDE("farthest_side");


        /* renamed from: c, reason: collision with root package name */
        public static final C0037c f5272c = new C0037c(null);

        /* renamed from: d, reason: collision with root package name */
        public static final Function1 f5273d = b.f5282i;

        /* renamed from: e, reason: collision with root package name */
        public static final Function1 f5274e = a.f5281i;

        /* renamed from: b, reason: collision with root package name */
        private final String f5280b;

        static final class a extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f5281i = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c invoke(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return c.f5272c.a(value);
            }
        }

        static final class b extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final b f5282i = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(c value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return c.f5272c.b(value);
            }
        }

        /* renamed from: O1.Xa$c$c, reason: collision with other inner class name */
        public static final class C0037c {
            public /* synthetic */ C0037c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                c cVar = c.NEAREST_CORNER;
                if (Intrinsics.areEqual(value, cVar.f5280b)) {
                    return cVar;
                }
                c cVar2 = c.FARTHEST_CORNER;
                if (Intrinsics.areEqual(value, cVar2.f5280b)) {
                    return cVar2;
                }
                c cVar3 = c.NEAREST_SIDE;
                if (Intrinsics.areEqual(value, cVar3.f5280b)) {
                    return cVar3;
                }
                c cVar4 = c.FARTHEST_SIDE;
                if (Intrinsics.areEqual(value, cVar4.f5280b)) {
                    return cVar4;
                }
                return null;
            }

            public final String b(c obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.f5280b;
            }

            private C0037c() {
            }
        }

        c(String str) {
            this.f5280b = str;
        }
    }

    public Xa(Expression value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f5269a = value;
    }

    public final boolean a(Xa xa, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return xa != null && this.f5269a.evaluate(resolver) == xa.f5269a.evaluate(otherResolver);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f5270b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(Xa.class).hashCode() + this.f5269a.hashCode();
        this.f5270b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Ya.c) BuiltInParserKt.getBuiltInParserComponent().r6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
