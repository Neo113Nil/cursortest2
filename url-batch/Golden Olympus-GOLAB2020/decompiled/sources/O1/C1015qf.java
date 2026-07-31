package O1;

import O1.AbstractC1050sf;
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

/* renamed from: O1.qf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1015qf implements JSONSerializable, Hashable {

    /* renamed from: e, reason: collision with root package name */
    public static final b f7702e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Expression f7703f = Expression.Companion.constant(c.ON_CONDITION);

    /* renamed from: g, reason: collision with root package name */
    private static final Function2 f7704g = a.f7709i;

    /* renamed from: a, reason: collision with root package name */
    public final List f7705a;

    /* renamed from: b, reason: collision with root package name */
    public final Expression f7706b;

    /* renamed from: c, reason: collision with root package name */
    public final Expression f7707c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f7708d;

    /* renamed from: O1.qf$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7709i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1015qf invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return C1015qf.f7702e.a(env, it);
        }
    }

    /* renamed from: O1.qf$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1015qf a(ParsingEnvironment env, JSONObject json) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            return ((AbstractC1050sf.c) BuiltInParserKt.getBuiltInParserComponent().Y8().getValue()).deserialize(env, json);
        }

        private b() {
        }
    }

    /* renamed from: O1.qf$c */
    public enum c {
        ON_CONDITION("on_condition"),
        ON_VARIABLE("on_variable");


        /* renamed from: c, reason: collision with root package name */
        public static final C0049c f7710c = new C0049c(null);

        /* renamed from: d, reason: collision with root package name */
        public static final Function1 f7711d = b.f7718i;

        /* renamed from: e, reason: collision with root package name */
        public static final Function1 f7712e = a.f7717i;

        /* renamed from: b, reason: collision with root package name */
        private final String f7716b;

        /* renamed from: O1.qf$c$a */
        static final class a extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f7717i = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c invoke(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return c.f7710c.a(value);
            }
        }

        /* renamed from: O1.qf$c$b */
        static final class b extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final b f7718i = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(c value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return c.f7710c.b(value);
            }
        }

        /* renamed from: O1.qf$c$c, reason: collision with other inner class name */
        public static final class C0049c {
            public /* synthetic */ C0049c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                c cVar = c.ON_CONDITION;
                if (Intrinsics.areEqual(value, cVar.f7716b)) {
                    return cVar;
                }
                c cVar2 = c.ON_VARIABLE;
                if (Intrinsics.areEqual(value, cVar2.f7716b)) {
                    return cVar2;
                }
                return null;
            }

            public final String b(c obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.f7716b;
            }

            private C0049c() {
            }
        }

        c(String str) {
            this.f7716b = str;
        }
    }

    public C1015qf(List actions, Expression condition, Expression mode) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f7705a = actions;
        this.f7706b = condition;
        this.f7707c = mode;
    }

    public final boolean a(C1015qf c1015qf, ExpressionResolver resolver, ExpressionResolver otherResolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        Intrinsics.checkNotNullParameter(otherResolver, "otherResolver");
        if (c1015qf == null) {
            return false;
        }
        List list = this.f7705a;
        List list2 = c1015qf.f7705a;
        if (list.size() == list2.size()) {
            Iterator it = list.iterator();
            int i4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    if (((Boolean) this.f7706b.evaluate(resolver)).booleanValue() != ((Boolean) c1015qf.f7706b.evaluate(otherResolver)).booleanValue() || this.f7707c.evaluate(resolver) != c1015qf.f7707c.evaluate(otherResolver)) {
                        break;
                    }
                    return true;
                }
                Object next = it.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (!((C0892k0) next).a((C0892k0) list2.get(i4), resolver, otherResolver)) {
                    break;
                }
                i4 = i5;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f7708d;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = kotlin.jvm.internal.H.b(C1015qf.class).hashCode();
        Iterator it = this.f7705a.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += ((C0892k0) it.next()).hash();
        }
        int hashCode2 = hashCode + i4 + this.f7706b.hashCode() + this.f7707c.hashCode();
        this.f7708d = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC1050sf.c) BuiltInParserKt.getBuiltInParserComponent().Y8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
