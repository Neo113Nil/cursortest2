package O1;

import O1.R9;
import O1.W9;
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
public final class X9 implements JSONSerializable, JsonTemplate {

    /* renamed from: e, reason: collision with root package name */
    public static final c f5254e = new c(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Expression f5255f = Expression.Companion.constant(R9.d.PARTIAL);

    /* renamed from: g, reason: collision with root package name */
    private static final Function2 f5256g = b.f5266i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f5257a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f5258b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f5259c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f5260d;

    static final class b extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final b f5266i = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X9 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new X9(env, null, false, it, 6, null);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public X9(Field changes, Field mode, Field onAppliedActions, Field onFailedActions) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(onAppliedActions, "onAppliedActions");
        Intrinsics.checkNotNullParameter(onFailedActions, "onFailedActions");
        this.f5257a = changes;
        this.f5258b = mode;
        this.f5259c = onAppliedActions;
        this.f5260d = onFailedActions;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((W9.d) BuiltInParserKt.getBuiltInParserComponent().G5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public static final class a implements JSONSerializable, JsonTemplate {

        /* renamed from: c, reason: collision with root package name */
        public static final b f5261c = new b(null);

        /* renamed from: d, reason: collision with root package name */
        private static final Function2 f5262d = C0036a.f5265i;

        /* renamed from: a, reason: collision with root package name */
        public final Field f5263a;

        /* renamed from: b, reason: collision with root package name */
        public final Field f5264b;

        /* renamed from: O1.X9$a$a, reason: collision with other inner class name */
        static final class C0036a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final C0036a f5265i = new C0036a();

            C0036a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a invoke(ParsingEnvironment env, JSONObject it) {
                Intrinsics.checkNotNullParameter(env, "env");
                Intrinsics.checkNotNullParameter(it, "it");
                return new a(env, null, false, it, 6, null);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public a(Field id, Field items) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(items, "items");
            this.f5263a = id;
            this.f5264b = items;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((T9) BuiltInParserKt.getBuiltInParserComponent().D5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ a(ParsingEnvironment parsingEnvironment, a aVar, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i4 & 2) != 0 ? null : aVar, (i4 & 4) != 0 ? false : z4, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(ParsingEnvironment env, a aVar, boolean z4, JSONObject json) {
            this(r1.nullField(false), r1.nullField(false));
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            Field.Companion companion = Field.Companion;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    public /* synthetic */ X9(ParsingEnvironment parsingEnvironment, X9 x9, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : x9, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public X9(ParsingEnvironment env, X9 x9, boolean z4, JSONObject json) {
        this(r2.nullField(false), r2.nullField(false), r2.nullField(false), r2.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
