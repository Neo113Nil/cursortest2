package O1;

import com.ironsource.b9;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Pb implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4338a;

    public Pb(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4338a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Ob deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression readExpression = JsonExpressionParser.readExpression(context, data, b9.h.f15459S, TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
        Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …LOR, STRING_TO_COLOR_INT)");
        Object read = JsonPropertyParser.read(context, data, "shape", this.f4338a.S6());
        Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"sha…divShapeJsonEntityParser)");
        return new Ob(readExpression, (Nb) read, (Qc) JsonPropertyParser.readOptional(context, data, "stroke", this.f4338a.w7()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Ob value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(context, jSONObject, b9.h.f15459S, value.f4273a, ParsingConvertersKt.COLOR_INT_TO_STRING);
        JsonPropertyParser.write(context, jSONObject, "shape", value.f4274b, this.f4338a.S6());
        JsonPropertyParser.write(context, jSONObject, "stroke", value.f4275c, this.f4338a.w7());
        JsonPropertyParser.write(context, jSONObject, "type", "shape_drawable");
        return jSONObject;
    }
}
