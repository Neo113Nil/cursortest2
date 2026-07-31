package O1;

import O1.Oc;
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
public final class Pc implements JSONSerializable, JsonTemplate {

    /* renamed from: c, reason: collision with root package name */
    public static final b f4339c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final S5 f4340d;

    /* renamed from: e, reason: collision with root package name */
    private static final Expression f4341e;

    /* renamed from: f, reason: collision with root package name */
    private static final Function2 f4342f;

    /* renamed from: a, reason: collision with root package name */
    public final Field f4343a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f4344b;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f4345i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pc invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new Pc(env, null, false, it, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f4340d = new S5(null, companion.constant(5L), 1, null);
        f4341e = companion.constant(10L);
        f4342f = a.f4345i;
    }

    public Pc(Field itemSpacing, Field maxVisibleItems) {
        Intrinsics.checkNotNullParameter(itemSpacing, "itemSpacing");
        Intrinsics.checkNotNullParameter(maxVisibleItems, "maxVisibleItems");
        this.f4343a = itemSpacing;
        this.f4344b = maxVisibleItems;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((Oc.c) BuiltInParserKt.getBuiltInParserComponent().u7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ Pc(ParsingEnvironment parsingEnvironment, Pc pc, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : pc, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Pc(ParsingEnvironment env, Pc pc, boolean z4, JSONObject json) {
        this(r1.nullField(false), r1.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
