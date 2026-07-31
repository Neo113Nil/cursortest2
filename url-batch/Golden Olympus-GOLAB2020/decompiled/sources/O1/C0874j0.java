package O1;

import O1.AbstractC0857i0;
import O1.C0839h0;
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

/* renamed from: O1.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0874j0 implements JSONSerializable, JsonTemplate {

    /* renamed from: h, reason: collision with root package name */
    public static final b f6530h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    private static final Expression f6531i;

    /* renamed from: j, reason: collision with root package name */
    private static final Expression f6532j;

    /* renamed from: k, reason: collision with root package name */
    private static final C0839h0.d f6533k;

    /* renamed from: l, reason: collision with root package name */
    private static final Function2 f6534l;

    /* renamed from: a, reason: collision with root package name */
    public final Field f6535a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f6536b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f6537c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f6538d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f6539e;

    /* renamed from: f, reason: collision with root package name */
    public final Field f6540f;

    /* renamed from: g, reason: collision with root package name */
    public final Field f6541g;

    /* renamed from: O1.j0$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f6542i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0874j0 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C0874j0(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.j0$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f6531i = companion.constant(C0839h0.c.DEFAULT);
        f6532j = companion.constant(Boolean.FALSE);
        f6533k = C0839h0.d.AUTO;
        f6534l = a.f6542i;
    }

    public C0874j0(Field description, Field hint, Field isChecked, Field mode, Field muteAfterAction, Field stateDescription, Field type) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(isChecked, "isChecked");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(muteAfterAction, "muteAfterAction");
        Intrinsics.checkNotNullParameter(stateDescription, "stateDescription");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f6535a = description;
        this.f6536b = hint;
        this.f6537c = isChecked;
        this.f6538d = mode;
        this.f6539e = muteAfterAction;
        this.f6540f = stateDescription;
        this.f6541g = type;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0857i0.d) BuiltInParserKt.getBuiltInParserComponent().I().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C0874j0(ParsingEnvironment parsingEnvironment, C0874j0 c0874j0, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c0874j0, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0874j0(ParsingEnvironment env, C0874j0 c0874j0, boolean z4, JSONObject json) {
        this(r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
