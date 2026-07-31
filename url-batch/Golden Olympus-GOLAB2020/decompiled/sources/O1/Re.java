package O1;

import O1.Qe;
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
public final class Re implements JSONSerializable, JsonTemplate {

    /* renamed from: g, reason: collision with root package name */
    public static final b f4683g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    private static final Expression f4684h = Expression.Companion.constant(0L);

    /* renamed from: i, reason: collision with root package name */
    private static final Function2 f4685i = a.f4692i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f4686a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f4687b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f4688c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f4689d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f4690e;

    /* renamed from: f, reason: collision with root package name */
    public final Field f4691f;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4692i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Re invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new Re(env, (Re) null, false, it, 6, (DefaultConstructorMarker) null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public Re(Field duration, Field endActions, Field id, Field tickActions, Field tickInterval, Field valueVariable) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(endActions, "endActions");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(tickActions, "tickActions");
        Intrinsics.checkNotNullParameter(tickInterval, "tickInterval");
        Intrinsics.checkNotNullParameter(valueVariable, "valueVariable");
        this.f4686a = duration;
        this.f4687b = endActions;
        this.f4688c = id;
        this.f4689d = tickActions;
        this.f4690e = tickInterval;
        this.f4691f = valueVariable;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Qe.c) BuiltInParserKt.getBuiltInParserComponent().H8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ Re(ParsingEnvironment parsingEnvironment, Re re, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : re, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Re(ParsingEnvironment env, Re re, boolean z4, JSONObject json) {
        this(r8.nullField(false), r8.nullField(false), r8.nullField(false), r8.nullField(false), r8.nullField(false), r8.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
