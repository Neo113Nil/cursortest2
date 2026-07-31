package O1;

import O1.C0886jc;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.pc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0994pc implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7490a;

    public C0994pc(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7490a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0886jc.c deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        return new C0886jc.c(JsonExpressionParser.readOptionalExpression(context, data, "end", typeHelper, function1), (C0754c5) JsonPropertyParser.readOptional(context, data, "margins", this.f7490a.V2()), JsonExpressionParser.readOptionalExpression(context, data, "start", typeHelper, function1), (X4) JsonPropertyParser.readOptional(context, data, "track_active_style", this.f7490a.S2()), (X4) JsonPropertyParser.readOptional(context, data, "track_inactive_style", this.f7490a.S2()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0886jc.c value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(context, jSONObject, "end", value.f6664a);
        JsonPropertyParser.write(context, jSONObject, "margins", value.f6665b, this.f7490a.V2());
        JsonExpressionParser.writeExpression(context, jSONObject, "start", value.f6666c);
        JsonPropertyParser.write(context, jSONObject, "track_active_style", value.f6667d, this.f7490a.S2());
        JsonPropertyParser.write(context, jSONObject, "track_inactive_style", value.f6668e, this.f7490a.S2());
        return jSONObject;
    }
}
