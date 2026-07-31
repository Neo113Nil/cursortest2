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

/* loaded from: classes2.dex */
public final class W4 implements JSONSerializable, JsonTemplate {

    /* renamed from: c, reason: collision with root package name */
    public static final b f5092c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Function2 f5093d = a.f5096i;

    /* renamed from: a, reason: collision with root package name */
    public final Field f5094a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f5095b;

    static final class a extends kotlin.jvm.internal.s implements Function2 {

        /* renamed from: i, reason: collision with root package name */
        public static final a f5096i = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W4 invoke(ParsingEnvironment env, JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return new W4(env, null, false, it, 6, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public W4(Field onFailActions, Field onSuccessActions) {
        Intrinsics.checkNotNullParameter(onFailActions, "onFailActions");
        Intrinsics.checkNotNullParameter(onSuccessActions, "onSuccessActions");
        this.f5094a = onFailActions;
        this.f5095b = onSuccessActions;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((U4) BuiltInParserKt.getBuiltInParserComponent().Q2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ W4(ParsingEnvironment parsingEnvironment, W4 w4, boolean z4, JSONObject jSONObject, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i4 & 2) != 0 ? null : w4, (i4 & 4) != 0 ? false : z4, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public W4(ParsingEnvironment env, W4 w4, boolean z4, JSONObject json) {
        this(r1.nullField(false), r1.nullField(false));
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(json, "json");
        Field.Companion companion = Field.Companion;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
