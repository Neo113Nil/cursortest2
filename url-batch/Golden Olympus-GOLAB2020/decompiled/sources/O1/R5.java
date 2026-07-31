package O1;

import O1.N5;
import O1.Q5;
import com.huawei.hms.framework.common.BundleUtil;
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
public final class R5 implements JSONSerializable, JsonTemplate {

    /* renamed from: e, reason: collision with root package name */
    public static final b f4614e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Expression f4615f = Expression.Companion.constant(Boolean.FALSE);

    /* renamed from: g, reason: collision with root package name */
    private static final Function2 f4616g = a.f4621i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f4617a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f4618b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f4619c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f4620d;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4621i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final R5 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new R5(env, null, false, it, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public R5(Field alwaysVisible, Field pattern, Field patternElements, Field rawTextVariable) {
        Intrinsics.checkNotNullParameter(alwaysVisible, "alwaysVisible");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(patternElements, "patternElements");
        Intrinsics.checkNotNullParameter(rawTextVariable, "rawTextVariable");
        this.f4617a = alwaysVisible;
        this.f4618b = pattern;
        this.f4619c = patternElements;
        this.f4620d = rawTextVariable;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((N5.c) BuiltInParserKt.getBuiltInParserComponent().o3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public static final class c implements JSONSerializable, JsonTemplate {

        /* renamed from: d, reason: collision with root package name */
        public static final b f4622d = new b(null);

        /* renamed from: e, reason: collision with root package name */
        private static final Expression f4623e = Expression.Companion.constant(BundleUtil.UNDERLINE_TAG);

        /* renamed from: f, reason: collision with root package name */
        private static final Function2 f4624f = a.f4628i;

        /* renamed from: a, reason: collision with root package name */
        public final Field f4625a;

        /* renamed from: b, reason: collision with root package name */
        public final Field f4626b;

        /* renamed from: c, reason: collision with root package name */
        public final Field f4627c;

        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f4628i = new a();

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

        public c(Field key, Field placeholder, Field regex) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(regex, "regex");
            this.f4625a = key;
            this.f4626b = placeholder;
            this.f4627c = regex;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((Q5.c) BuiltInParserKt.getBuiltInParserComponent().r3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ c(ParsingEnvironment parsingEnvironment, c cVar, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i4 & 2) != 0 ? null : cVar, (i4 & 4) != 0 ? false : z4, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(ParsingEnvironment env, c cVar, boolean z4, JSONObject json) {
            this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            Field.Companion companion = Field.Companion;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    public /* synthetic */ R5(ParsingEnvironment parsingEnvironment, R5 r5, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : r5, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public R5(ParsingEnvironment env, R5 r5, boolean z4, JSONObject json) {
        this(r2.nullField(false), r2.nullField(false), r2.nullField(false), r2.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
