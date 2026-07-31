package O1;

import O1.AbstractC0849ha;
import O1.AbstractC0943mf;
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

/* renamed from: O1.nf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0961nf implements JSONSerializable, JsonTemplate {

    /* renamed from: d, reason: collision with root package name */
    public static final b f7225d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC0849ha.d f7226e;

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC0849ha.d f7227f;

    /* renamed from: g, reason: collision with root package name */
    private static final Function2 f7228g;

    /* renamed from: a, reason: collision with root package name */
    public final Field f7229a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f7230b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f7231c;

    /* renamed from: O1.nf$a */
    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f7232i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0961nf invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new C0961nf(env, null, false, it, 6, null);
        }
    }

    /* renamed from: O1.nf$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        Double valueOf = Double.valueOf(50.0d);
        f7226e = new AbstractC0849ha.d(new C0974oa(companion.constant(valueOf)));
        f7227f = new AbstractC0849ha.d(new C0974oa(companion.constant(valueOf)));
        f7228g = a.f7232i;
    }

    public C0961nf(Field pivotX, Field pivotY, Field rotation) {
        Intrinsics.checkNotNullParameter(pivotX, "pivotX");
        Intrinsics.checkNotNullParameter(pivotY, "pivotY");
        Intrinsics.checkNotNullParameter(rotation, "rotation");
        this.f7229a = pivotX;
        this.f7230b = pivotY;
        this.f7231c = rotation;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((AbstractC0943mf.c) BuiltInParserKt.getBuiltInParserComponent().W8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ C0961nf(ParsingEnvironment parsingEnvironment, C0961nf c0961nf, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : c0961nf, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0961nf(ParsingEnvironment env, C0961nf c0961nf, boolean z4, JSONObject json) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
