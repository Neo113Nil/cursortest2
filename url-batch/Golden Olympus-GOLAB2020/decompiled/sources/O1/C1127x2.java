package O1;

import O1.AbstractC0861i4;
import O1.C2;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.x2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1127x2 implements JSONSerializable, Hashable {

    /* renamed from: k, reason: collision with root package name */
    public static final b f8396k = new b(null);

    /* renamed from: l, reason: collision with root package name */
    private static final Expression f8397l;

    /* renamed from: m, reason: collision with root package name */
    private static final Expression f8398m;

    /* renamed from: n, reason: collision with root package name */
    private static final AbstractC0861i4.d f8399n;

    /* renamed from: o, reason: collision with root package name */
    private static final Expression f8400o;

    /* renamed from: p, reason: collision with root package name */
    private static final Function2 f8401p;

    /* renamed from: a, reason: collision with root package name */
    public final Expression f8402a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f8403b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f8404c;

    /* renamed from: d, reason: collision with root package name */
    public final List f8405d;

    /* renamed from: e, reason: collision with root package name */
    public final Expression f8406e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0861i4 f8407f;

    /* renamed from: g, reason: collision with root package name */
    public final Expression f8408g;

    /* renamed from: h, reason: collision with root package name */
    public final Expression f8409h;

    /* renamed from: i, reason: collision with root package name */
    private Integer f8410i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f8411j;

    /* renamed from: O1.x2$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f8412i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1127x2 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C1127x2.f8396k.a(env, it);
        }
    }

    /* renamed from: O1.x2$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1127x2 a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((C2.d) BuiltInParserKt.getBuiltInParserComponent().n1().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.x2$c */
    public enum c {
        FADE("fade"),
        TRANSLATE("translate"),
        SCALE("scale"),
        NATIVE("native"),
        SET("set"),
        NO_ANIMATION("no_animation");


        /* renamed from: c, reason: collision with root package name */
        public static final C0053c f8413c = new C0053c(null);

        /* renamed from: d, reason: collision with root package name */
        public static final Function1 f8414d = b.f8425i;

        /* renamed from: e, reason: collision with root package name */
        public static final Function1 f8415e = a.f8424i;

        /* renamed from: b, reason: collision with root package name */
        private final String f8423b;

        /* renamed from: O1.x2$c$a */
        static final class a extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f8424i = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c invoke(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return c.f8413c.a(value);
            }
        }

        /* renamed from: O1.x2$c$b */
        static final class b extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final b f8425i = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(c value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return c.f8413c.b(value);
            }
        }

        /* renamed from: O1.x2$c$c, reason: collision with other inner class name */
        public static final class C0053c {
            public /* synthetic */ C0053c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                c cVar = c.FADE;
                if (Intrinsics.areEqual(value, cVar.f8423b)) {
                    return cVar;
                }
                c cVar2 = c.TRANSLATE;
                if (Intrinsics.areEqual(value, cVar2.f8423b)) {
                    return cVar2;
                }
                c cVar3 = c.SCALE;
                if (Intrinsics.areEqual(value, cVar3.f8423b)) {
                    return cVar3;
                }
                c cVar4 = c.NATIVE;
                if (Intrinsics.areEqual(value, cVar4.f8423b)) {
                    return cVar4;
                }
                c cVar5 = c.SET;
                if (Intrinsics.areEqual(value, cVar5.f8423b)) {
                    return cVar5;
                }
                c cVar6 = c.NO_ANIMATION;
                if (Intrinsics.areEqual(value, cVar6.f8423b)) {
                    return cVar6;
                }
                return null;
            }

            public final String b(c obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.f8423b;
            }

            private C0053c() {
            }
        }

        c(String str) {
            this.f8423b = str;
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f8397l = companion.constant(300L);
        f8398m = companion.constant(EnumC1163z2.SPRING);
        f8399n = new AbstractC0861i4.d(new C0971o7());
        f8400o = companion.constant(0L);
        f8401p = a.f8412i;
    }

    public C1127x2(Expression duration, Expression expression, Expression interpolator, List list, Expression name, AbstractC0861i4 repeat, Expression startDelay, Expression expression2) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(repeat, "repeat");
        Intrinsics.checkNotNullParameter(startDelay, "startDelay");
        this.f8402a = duration;
        this.f8403b = expression;
        this.f8404c = interpolator;
        this.f8405d = list;
        this.f8406e = name;
        this.f8407f = repeat;
        this.f8408g = startDelay;
        this.f8409h = expression2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0097, code lost:
    
        if (r8.f8405d == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(C1127x2 c1127x2, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c1127x2 != null && ((Number) this.f8402a.evaluate(resolver)).longValue() == ((Number) c1127x2.f8402a.evaluate(otherResolver)).longValue()) {
            Expression expression = this.f8403b;
            Double d4 = expression != null ? (Double) expression.evaluate(resolver) : null;
            Expression expression2 = c1127x2.f8403b;
            if (Intrinsics.areEqual(d4, expression2 != null ? (Double) expression2.evaluate(otherResolver) : null) && this.f8404c.evaluate(resolver) == c1127x2.f8404c.evaluate(otherResolver)) {
                List list = this.f8405d;
                if (list != null) {
                    List list2 = c1127x2.f8405d;
                    if (list2 != null && list.size() == list2.size()) {
                        int i4 = 0;
                        for (Object obj : list) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            if (!((C1127x2) obj).a((C1127x2) list2.get(i4), resolver, otherResolver)) {
                                break;
                            }
                            i4 = i5;
                        }
                        if (this.f8406e.evaluate(resolver) == c1127x2.f8406e.evaluate(otherResolver) && this.f8407f.a(c1127x2.f8407f, resolver, otherResolver) && ((Number) this.f8408g.evaluate(resolver)).longValue() == ((Number) c1127x2.f8408g.evaluate(otherResolver)).longValue()) {
                            Expression expression3 = this.f8409h;
                            Double d5 = expression3 != null ? (Double) expression3.evaluate(resolver) : null;
                            Expression expression4 = c1127x2.f8409h;
                            if (Intrinsics.areEqual(d5, expression4 != null ? (Double) expression4.evaluate(otherResolver) : null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f8411j;
        if (num != null) {
            return num.intValue();
        }
        int propertiesHash = propertiesHash();
        List list = this.f8405d;
        int i4 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i4 += ((C1127x2) it.next()).hash();
            }
        }
        int i5 = propertiesHash + i4;
        this.f8411j = Integer.valueOf(i5);
        return i5;
    }

    @Override // com.yandex.div.data.Hashable
    public int propertiesHash() {
        Integer num = this.f8410i;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C1127x2.class).hashCode() + this.f8402a.hashCode();
        Expression expression = this.f8403b;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0) + this.f8404c.hashCode() + this.f8406e.hashCode() + this.f8407f.hash() + this.f8408g.hashCode();
        Expression expression2 = this.f8409h;
        int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        this.f8410i = Integer.valueOf(hashCode3);
        return hashCode3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((C2.d) BuiltInParserKt.getBuiltInParserComponent().n1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ C1127x2(com.yandex.div.json.expressions.Expression r2, com.yandex.div.json.expressions.Expression r3, com.yandex.div.json.expressions.Expression r4, java.util.List r5, com.yandex.div.json.expressions.Expression r6, O1.AbstractC0861i4 r7, com.yandex.div.json.expressions.Expression r8, com.yandex.div.json.expressions.Expression r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r1 = this;
            r11 = r10 & 1
            if (r11 == 0) goto L6
            com.yandex.div.json.expressions.Expression r2 = O1.C1127x2.f8397l
        L6:
            r11 = r10 & 2
            r0 = 0
            if (r11 == 0) goto Lc
            r3 = r0
        Lc:
            r11 = r10 & 4
            if (r11 == 0) goto L12
            com.yandex.div.json.expressions.Expression r4 = O1.C1127x2.f8398m
        L12:
            r11 = r10 & 8
            if (r11 == 0) goto L17
            r5 = r0
        L17:
            r11 = r10 & 32
            if (r11 == 0) goto L1d
            O1.i4$d r7 = O1.C1127x2.f8399n
        L1d:
            r11 = r10 & 64
            if (r11 == 0) goto L23
            com.yandex.div.json.expressions.Expression r8 = O1.C1127x2.f8400o
        L23:
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L31
            r11 = r0
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L3a
        L31:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L3a:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.C1127x2.<init>(com.yandex.div.json.expressions.Expression, com.yandex.div.json.expressions.Expression, com.yandex.div.json.expressions.Expression, java.util.List, com.yandex.div.json.expressions.Expression, O1.i4, com.yandex.div.json.expressions.Expression, com.yandex.div.json.expressions.Expression, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
