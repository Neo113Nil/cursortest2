package O1;

import O1.AbstractC0912l2;
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

/* renamed from: O1.k2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0894k2 implements JSONSerializable, Hashable {

    /* renamed from: d, reason: collision with root package name */
    public static final c f6782d = new c(null);

    /* renamed from: e, reason: collision with root package name */
    private static final Function2 f6783e = b.f6800i;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f6784a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f6785b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f6786c;

    /* renamed from: O1.k2$a */
    public enum a {
        START("start"),
        STOP("stop"),
        PAUSE("pause"),
        RESUME("resume"),
        CANCEL("cancel"),
        RESET("reset");


        /* renamed from: c, reason: collision with root package name */
        public static final c f6787c = new c(null);

        /* renamed from: d, reason: collision with root package name */
        public static final Function1 f6788d = b.f6799i;

        /* renamed from: e, reason: collision with root package name */
        public static final Function1 f6789e = C0046a.f6798i;

        /* renamed from: b, reason: collision with root package name */
        private final String f6797b;

        /* renamed from: O1.k2$a$a, reason: collision with other inner class name */
        static final class C0046a extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final C0046a f6798i = new C0046a();

            C0046a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a invoke(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return a.f6787c.a(value);
            }
        }

        /* renamed from: O1.k2$a$b */
        static final class b extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final b f6799i = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(a value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return a.f6787c.b(value);
            }
        }

        /* renamed from: O1.k2$a$c */
        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                a aVar = a.START;
                if (Intrinsics.areEqual(value, aVar.f6797b)) {
                    return aVar;
                }
                a aVar2 = a.STOP;
                if (Intrinsics.areEqual(value, aVar2.f6797b)) {
                    return aVar2;
                }
                a aVar3 = a.PAUSE;
                if (Intrinsics.areEqual(value, aVar3.f6797b)) {
                    return aVar3;
                }
                a aVar4 = a.RESUME;
                if (Intrinsics.areEqual(value, aVar4.f6797b)) {
                    return aVar4;
                }
                a aVar5 = a.CANCEL;
                if (Intrinsics.areEqual(value, aVar5.f6797b)) {
                    return aVar5;
                }
                a aVar6 = a.RESET;
                if (Intrinsics.areEqual(value, aVar6.f6797b)) {
                    return aVar6;
                }
                return null;
            }

            public final String b(a obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.f6797b;
            }

            private c() {
            }
        }

        a(String str) {
            this.f6797b = str;
        }
    }

    /* renamed from: O1.k2$b */
    static final class b extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f6800i = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0894k2 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0894k2.f6782d.a(env, it);
        }
    }

    /* renamed from: O1.k2$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0894k2 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC0912l2.c) BuiltInParserKt.getBuiltInParserComponent().e1().getValue()).deserialize(env, json);
        }

        private c() {
        }
    }

    public C0894k2(Expression action, Expression id) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(id, "id");
        this.f6784a = action;
        this.f6785b = id;
    }

    public final boolean a(C0894k2 c0894k2, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        return c0894k2 != null && this.f6784a.evaluate(resolver) == c0894k2.f6784a.evaluate(otherResolver) && Intrinsics.areEqual(this.f6785b.evaluate(resolver), c0894k2.f6785b.evaluate(otherResolver));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f6786c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0894k2.class).hashCode() + this.f6784a.hashCode() + this.f6785b.hashCode();
        this.f6786c = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0912l2.c) BuiltInParserKt.getBuiltInParserComponent().e1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
