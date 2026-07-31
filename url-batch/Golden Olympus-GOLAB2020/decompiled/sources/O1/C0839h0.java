package O1;

import O1.AbstractC0857i0;
import com.ironsource.b9;
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

/* renamed from: O1.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0839h0 implements JSONSerializable, Hashable {

    /* renamed from: i, reason: collision with root package name */
    public static final b f6310i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    private static final Expression f6311j;

    /* renamed from: k, reason: collision with root package name */
    private static final Expression f6312k;

    /* renamed from: l, reason: collision with root package name */
    private static final d f6313l;

    /* renamed from: m, reason: collision with root package name */
    private static final Function2 f6314m;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f6315a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f6316b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f6317c;

    /* renamed from: d, reason: collision with root package name */
    public final Expression f6318d;

    /* renamed from: e, reason: collision with root package name */
    public final Expression f6319e;

    /* renamed from: f, reason: collision with root package name */
    public final Expression f6320f;

    /* renamed from: g, reason: collision with root package name */
    public final d f6321g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f6322h;

    /* renamed from: O1.h0$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6323i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0839h0 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C0839h0.f6310i.a(env, it);
        }
    }

    /* renamed from: O1.h0$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0839h0 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC0857i0.c) BuiltInParserKt.getBuiltInParserComponent().H().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.h0$c */
    public enum c {
        DEFAULT("default"),
        MERGE("merge"),
        EXCLUDE("exclude");


        /* renamed from: c, reason: collision with root package name */
        public static final C0044c f6324c = new C0044c(null);

        /* renamed from: d, reason: collision with root package name */
        public static final Function1 f6325d = b.f6333i;

        /* renamed from: e, reason: collision with root package name */
        public static final Function1 f6326e = a.f6332i;

        /* renamed from: b, reason: collision with root package name */
        private final String f6331b;

        /* renamed from: O1.h0$c$a */
        static final class a extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f6332i = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c invoke(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return c.f6324c.a(value);
            }
        }

        /* renamed from: O1.h0$c$b */
        static final class b extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final b f6333i = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(c value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return c.f6324c.b(value);
            }
        }

        /* renamed from: O1.h0$c$c, reason: collision with other inner class name */
        public static final class C0044c {
            public /* synthetic */ C0044c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                c cVar = c.DEFAULT;
                if (Intrinsics.areEqual(value, cVar.f6331b)) {
                    return cVar;
                }
                c cVar2 = c.MERGE;
                if (Intrinsics.areEqual(value, cVar2.f6331b)) {
                    return cVar2;
                }
                c cVar3 = c.EXCLUDE;
                if (Intrinsics.areEqual(value, cVar3.f6331b)) {
                    return cVar3;
                }
                return null;
            }

            public final String b(c obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.f6331b;
            }

            private C0044c() {
            }
        }

        c(String str) {
            this.f6331b = str;
        }
    }

    /* renamed from: O1.h0$d */
    public enum d {
        NONE("none"),
        BUTTON("button"),
        IMAGE("image"),
        TEXT(b9.h.f15450K0),
        EDIT_TEXT("edit_text"),
        HEADER("header"),
        TAB_BAR("tab_bar"),
        LIST("list"),
        SELECT("select"),
        CHECKBOX("checkbox"),
        RADIO("radio"),
        AUTO("auto");


        /* renamed from: c, reason: collision with root package name */
        public static final c f6334c = new c(null);

        /* renamed from: d, reason: collision with root package name */
        public static final Function1 f6335d = b.f6352i;

        /* renamed from: e, reason: collision with root package name */
        public static final Function1 f6336e = a.f6351i;

        /* renamed from: b, reason: collision with root package name */
        private final String f6350b;

        /* renamed from: O1.h0$d$a */
        static final class a extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f6351i = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d invoke(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return d.f6334c.a(value);
            }
        }

        /* renamed from: O1.h0$d$b */
        static final class b extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final b f6352i = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(d value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return d.f6334c.b(value);
            }
        }

        /* renamed from: O1.h0$d$c */
        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                d dVar = d.NONE;
                if (Intrinsics.areEqual(value, dVar.f6350b)) {
                    return dVar;
                }
                d dVar2 = d.BUTTON;
                if (Intrinsics.areEqual(value, dVar2.f6350b)) {
                    return dVar2;
                }
                d dVar3 = d.IMAGE;
                if (Intrinsics.areEqual(value, dVar3.f6350b)) {
                    return dVar3;
                }
                d dVar4 = d.TEXT;
                if (Intrinsics.areEqual(value, dVar4.f6350b)) {
                    return dVar4;
                }
                d dVar5 = d.EDIT_TEXT;
                if (Intrinsics.areEqual(value, dVar5.f6350b)) {
                    return dVar5;
                }
                d dVar6 = d.HEADER;
                if (Intrinsics.areEqual(value, dVar6.f6350b)) {
                    return dVar6;
                }
                d dVar7 = d.TAB_BAR;
                if (Intrinsics.areEqual(value, dVar7.f6350b)) {
                    return dVar7;
                }
                d dVar8 = d.LIST;
                if (Intrinsics.areEqual(value, dVar8.f6350b)) {
                    return dVar8;
                }
                d dVar9 = d.SELECT;
                if (Intrinsics.areEqual(value, dVar9.f6350b)) {
                    return dVar9;
                }
                d dVar10 = d.CHECKBOX;
                if (Intrinsics.areEqual(value, dVar10.f6350b)) {
                    return dVar10;
                }
                d dVar11 = d.RADIO;
                if (Intrinsics.areEqual(value, dVar11.f6350b)) {
                    return dVar11;
                }
                d dVar12 = d.AUTO;
                if (Intrinsics.areEqual(value, dVar12.f6350b)) {
                    return dVar12;
                }
                return null;
            }

            public final String b(d obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.f6350b;
            }

            private c() {
            }
        }

        d(String str) {
            this.f6350b = str;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f6311j = companion.constant(c.DEFAULT);
        f6312k = companion.constant(Boolean.FALSE);
        f6313l = d.AUTO;
        f6314m = a.f6323i;
    }

    public C0839h0(Expression expression, Expression expression2, Expression expression3, Expression mode, Expression muteAfterAction, Expression expression4, d type) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(muteAfterAction, "muteAfterAction");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f6315a = expression;
        this.f6316b = expression2;
        this.f6317c = expression3;
        this.f6318d = mode;
        this.f6319e = muteAfterAction;
        this.f6320f = expression4;
        this.f6321g = type;
    }

    public final boolean a(C0839h0 c0839h0, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c0839h0 == null) {
            return false;
        }
        Expression expression = this.f6315a;
        String str = expression != null ? (String) expression.evaluate(resolver) : null;
        Expression expression2 = c0839h0.f6315a;
        if (Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(otherResolver) : null)) {
            Expression expression3 = this.f6316b;
            String str2 = expression3 != null ? (String) expression3.evaluate(resolver) : null;
            Expression expression4 = c0839h0.f6316b;
            if (Intrinsics.areEqual(str2, expression4 != null ? (String) expression4.evaluate(otherResolver) : null)) {
                Expression expression5 = this.f6317c;
                Boolean bool = expression5 != null ? (Boolean) expression5.evaluate(resolver) : null;
                Expression expression6 = c0839h0.f6317c;
                if (Intrinsics.areEqual(bool, expression6 != null ? (Boolean) expression6.evaluate(otherResolver) : null) && this.f6318d.evaluate(resolver) == c0839h0.f6318d.evaluate(otherResolver) && ((Boolean) this.f6319e.evaluate(resolver)).booleanValue() == ((Boolean) c0839h0.f6319e.evaluate(otherResolver)).booleanValue()) {
                    Expression expression7 = this.f6320f;
                    String str3 = expression7 != null ? (String) expression7.evaluate(resolver) : null;
                    Expression expression8 = c0839h0.f6320f;
                    if (Intrinsics.areEqual(str3, expression8 != null ? (String) expression8.evaluate(otherResolver) : null) && this.f6321g == c0839h0.f6321g) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f6322h;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C0839h0.class).hashCode();
        Expression expression = this.f6315a;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        Expression expression2 = this.f6316b;
        int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        Expression expression3 = this.f6317c;
        int hashCode4 = hashCode3 + (expression3 != null ? expression3.hashCode() : 0) + this.f6318d.hashCode() + this.f6319e.hashCode();
        Expression expression4 = this.f6320f;
        int hashCode5 = hashCode4 + (expression4 != null ? expression4.hashCode() : 0) + this.f6321g.hashCode();
        this.f6322h = Integer.valueOf(hashCode5);
        return hashCode5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0857i0.c) BuiltInParserKt.getBuiltInParserComponent().H().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
