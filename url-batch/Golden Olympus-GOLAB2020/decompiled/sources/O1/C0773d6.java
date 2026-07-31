package O1;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.d6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0773d6 implements JSONSerializable, JsonTemplate {

    /* renamed from: f, reason: collision with root package name */
    public static final b f6009f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Function2 f6010g = a.f6016i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f6011a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f6012b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f6013c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f6014d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f6015e;

    /* renamed from: O1.d6$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6016i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0773d6 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C0773d6(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.d6$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C0773d6(Field background, Field border, Field nextFocusIds, Field onBlur, Field onFocus) {
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(border, "border");
        Intrinsics.checkNotNullParameter(nextFocusIds, "nextFocusIds");
        Intrinsics.checkNotNullParameter(onBlur, "onBlur");
        Intrinsics.checkNotNullParameter(onFocus, "onFocus");
        this.f6011a = background;
        this.f6012b = border;
        this.f6013c = nextFocusIds;
        this.f6014d = onBlur;
        this.f6015e = onFocus;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Y5) BuiltInParserKt.getBuiltInParserComponent().x3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* renamed from: O1.d6$c */
    public static final class c implements JSONSerializable, JsonTemplate {

        /* renamed from: f, reason: collision with root package name */
        public static final b f6017f = new b(null);

        /* renamed from: g, reason: collision with root package name */
        private static final Function2 f6018g = a.f6024i;

        /* renamed from: a, reason: collision with root package name */
        public final Field f6019a;

        /* renamed from: b, reason: collision with root package name */
        public final Field f6020b;

        /* renamed from: c, reason: collision with root package name */
        public final Field f6021c;

        /* renamed from: d, reason: collision with root package name */
        public final Field f6022d;

        /* renamed from: e, reason: collision with root package name */
        public final Field f6023e;

        /* renamed from: O1.d6$c$a */
        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f6024i = new a();

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

        /* renamed from: O1.d6$c$b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public c(Field down, Field forward, Field left, Field right, Field up) {
            Intrinsics.checkNotNullParameter(down, "down");
            Intrinsics.checkNotNullParameter(forward, "forward");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            Intrinsics.checkNotNullParameter(up, "up");
            this.f6019a = down;
            this.f6020b = forward;
            this.f6021c = left;
            this.f6022d = right;
            this.f6023e = up;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((C0737b6) BuiltInParserKt.getBuiltInParserComponent().A3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ c(ParsingEnvironment parsingEnvironment, c cVar, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i4 & 2) != 0 ? null : cVar, (i4 & 4) != 0 ? false : z4, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(ParsingEnvironment env, c cVar, boolean z4, JSONObject json) {
            this(r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false));
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            Field.Companion companion = Field.Companion;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    public /* synthetic */ C0773d6(ParsingEnvironment parsingEnvironment, C0773d6 c0773d6, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c0773d6, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0773d6(ParsingEnvironment env, C0773d6 c0773d6, boolean z4, JSONObject json) {
        this(r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
