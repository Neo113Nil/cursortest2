package O1;

import O1.AbstractC1054t1;
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

/* renamed from: O1.j2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0876j2 implements JSONSerializable, JsonTemplate {

    /* renamed from: l, reason: collision with root package name */
    public static final b f6548l = new b(null);

    /* renamed from: m, reason: collision with root package name */
    private static final Expression f6549m = Expression.Companion.constant(Boolean.TRUE);

    /* renamed from: n, reason: collision with root package name */
    private static final Function2 f6550n = a.f6562i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f6551a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f6552b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f6553c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f6554d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f6555e;

    /* renamed from: f, reason: collision with root package name */
    public final Field f6556f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f6557g;

    /* renamed from: h, reason: collision with root package name */
    public final Field f6558h;

    /* renamed from: i, reason: collision with root package name */
    public final Field f6559i;

    /* renamed from: j, reason: collision with root package name */
    public final Field f6560j;

    /* renamed from: k, reason: collision with root package name */
    public final Field f6561k;

    /* renamed from: O1.j2$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6562i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0876j2 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C0876j2(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.j2$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public C0876j2(Field downloadCallbacks, Field isEnabled, Field logId, Field logUrl, Field menuItems, Field payload, Field referer, Field scopeId, Field target, Field typed, Field url) {
        Intrinsics.checkNotNullParameter(downloadCallbacks, "downloadCallbacks");
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        Intrinsics.checkNotNullParameter(logId, "logId");
        Intrinsics.checkNotNullParameter(logUrl, "logUrl");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(referer, "referer");
        Intrinsics.checkNotNullParameter(scopeId, "scopeId");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(typed, "typed");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f6551a = downloadCallbacks;
        this.f6552b = isEnabled;
        this.f6553c = logId;
        this.f6554d = logUrl;
        this.f6555e = menuItems;
        this.f6556f = payload;
        this.f6557g = referer;
        this.f6558h = scopeId;
        this.f6559i = target;
        this.f6560j = typed;
        this.f6561k = url;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC1054t1.d) BuiltInParserKt.getBuiltInParserComponent().v0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* renamed from: O1.j2$c */
    public static final class c implements JSONSerializable, JsonTemplate {

        /* renamed from: d, reason: collision with root package name */
        public static final b f6563d = new b(null);

        /* renamed from: e, reason: collision with root package name */
        private static final Function2 f6564e = a.f6568i;

        /* renamed from: a, reason: collision with root package name */
        public final Field f6565a;

        /* renamed from: b, reason: collision with root package name */
        public final Field f6566b;

        /* renamed from: c, reason: collision with root package name */
        public final Field f6567c;

        /* renamed from: O1.j2$c$a */
        static final class a extends kotlin.jvm.internal.s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final a f6568i = new a();

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

        /* renamed from: O1.j2$c$b */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
            }
        }

        public c(Field action, Field actions, Field text) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(actions, "actions");
            Intrinsics.checkNotNullParameter(text, "text");
            this.f6565a = action;
            this.f6566b = actions;
            this.f6567c = text;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((C1090v1) BuiltInParserKt.getBuiltInParserComponent().y0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
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

    public /* synthetic */ C0876j2(ParsingEnvironment parsingEnvironment, C0876j2 c0876j2, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c0876j2, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0876j2(ParsingEnvironment env, C0876j2 c0876j2, boolean z4, JSONObject json) {
        this(r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false), r14.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
