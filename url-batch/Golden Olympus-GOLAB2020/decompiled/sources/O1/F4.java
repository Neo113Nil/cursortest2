package O1;

import O1.B4;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class F4 implements JSONSerializable, JsonTemplate {

    /* renamed from: h, reason: collision with root package name */
    public static final b f2721h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    private static final Expression f2722i = Expression.Companion.constant(EnumC0979of.NONE);

    /* renamed from: j, reason: collision with root package name */
    private static final Function2 f2723j = a.f2731i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f2724a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f2725b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f2726c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f2727d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f2728e;

    /* renamed from: f, reason: collision with root package name */
    public final Field f2729f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f2730g;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f2731i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F4 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new F4(env, null, false, it, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public F4(Field functions, Field logId, Field states, Field timers, Field transitionAnimationSelector, Field variableTriggers, Field variables) {
        Intrinsics.checkNotNullParameter(functions, "functions");
        Intrinsics.checkNotNullParameter(logId, "logId");
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(timers, "timers");
        Intrinsics.checkNotNullParameter(transitionAnimationSelector, "transitionAnimationSelector");
        Intrinsics.checkNotNullParameter(variableTriggers, "variableTriggers");
        Intrinsics.checkNotNullParameter(variables, "variables");
        this.f2724a = functions;
        this.f2725b = logId;
        this.f2726c = states;
        this.f2727d = timers;
        this.f2728e = transitionAnimationSelector;
        this.f2729f = variableTriggers;
        this.f2730g = variables;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((B4.d) BuiltInParserKt.getBuiltInParserComponent().C2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public static final class c implements JSONSerializable, JsonTemplate {

        /* renamed from: c, reason: collision with root package name */
        public static final b f2732c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        private static final Function2 f2733d = a.f2736i;

        /* renamed from: a, reason: collision with root package name */
        public final Field f2734a;

        /* renamed from: b, reason: collision with root package name */
        public final Field f2735b;

        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f2736i = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return new c(env, null, false, it, 6, null);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public c(Field div, Field stateId) {
            Intrinsics.checkNotNullParameter(div, "div");
            Intrinsics.checkNotNullParameter(stateId, "stateId");
            this.f2734a = div;
            this.f2735b = stateId;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((D4) BuiltInParserKt.getBuiltInParserComponent().E2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ c(ParsingEnvironment parsingEnvironment, c cVar, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i4 & 2) != 0 ? null : cVar, (i4 & 4) != 0 ? false : z4, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(ParsingEnvironment env, c cVar, boolean z4, JSONObject json) {
            this(r1.nullField(false), r1.nullField(false));
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            Field.Companion companion = Field.Companion;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    public /* synthetic */ F4(ParsingEnvironment parsingEnvironment, F4 f4, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : f4, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public F4(ParsingEnvironment env, F4 f4, boolean z4, JSONObject json) {
        this(r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
