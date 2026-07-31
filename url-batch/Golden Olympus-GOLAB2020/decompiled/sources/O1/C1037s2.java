package O1;

import O1.AbstractC1055t2;
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

/* renamed from: O1.s2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1037s2 implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final c f7793d = new c(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f7794e = b.f7807i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f7795a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f7796b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f7797c;

    /* renamed from: O1.s2$a */
    public enum a {
        START("start"),
        PAUSE("pause");


        /* renamed from: c, reason: collision with root package name */
        public static final c f7798c = new c(null);

        /* renamed from: d, reason: collision with root package name */
        public static final Function1 f7799d = b.f7806i;

        /* renamed from: e, reason: collision with root package name */
        public static final Function1 f7800e = C0050a.f7805i;

        /* renamed from: b, reason: collision with root package name */
        private final String f7804b;

        /* renamed from: O1.s2$a$a, reason: collision with other inner class name */
        static final class C0050a extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final C0050a f7805i = new C0050a();

            C0050a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a invoke(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return a.f7798c.a(value);
            }
        }

        /* renamed from: O1.s2$a$b */
        static final class b extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final b f7806i = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(a value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return a.f7798c.b(value);
            }
        }

        /* renamed from: O1.s2$a$c */
        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                a aVar = a.START;
                if (Intrinsics.areEqual(value, aVar.f7804b)) {
                    return aVar;
                }
                a aVar2 = a.PAUSE;
                if (Intrinsics.areEqual(value, aVar2.f7804b)) {
                    return aVar2;
                }
                return null;
            }

            public final String b(a obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.f7804b;
            }

            private c() {
            }
        }

        a(String str) {
            this.f7804b = str;
        }
    }

    /* renamed from: O1.s2$b */
    static final class b extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f7807i = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1037s2 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C1037s2.f7793d.a(env, it);
        }
    }

    /* renamed from: O1.s2$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1037s2 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC1055t2.c) BuiltInParserKt.getBuiltInParserComponent().k1().getValue()).deserialize(env, json);
        }

        private c() {
        }
    }

    public C1037s2(Expression action, Expression id) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(id, "id");
        this.f7795a = action;
        this.f7796b = id;
    }

    public final boolean a(C1037s2 c1037s2, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c1037s2 != null && this.f7795a.evaluate(resolver) == c1037s2.f7795a.evaluate(otherResolver) && Intrinsics.areEqual(this.f7796b.evaluate(resolver), c1037s2.f7796b.evaluate(otherResolver));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f7797c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C1037s2.class).hashCode() + this.f7795a.hashCode() + this.f7796b.hashCode();
        this.f7797c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC1055t2.c) BuiltInParserKt.getBuiltInParserComponent().k1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
