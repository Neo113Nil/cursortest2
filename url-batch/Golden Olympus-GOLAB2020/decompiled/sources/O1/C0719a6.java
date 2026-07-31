package O1;

import O1.W5;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.a6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0719a6 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5639a;

    public C0719a6(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5639a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public W5.c deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new W5.c(JsonExpressionParser.readOptionalExpression(context, data, "down", typeHelper), JsonExpressionParser.readOptionalExpression(context, data, "forward", typeHelper), JsonExpressionParser.readOptionalExpression(context, data, "left", typeHelper), JsonExpressionParser.readOptionalExpression(context, data, "right", typeHelper), JsonExpressionParser.readOptionalExpression(context, data, "up", typeHelper));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, W5.c value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(context, jSONObject, "down", value.f5108a);
        JsonExpressionParser.writeExpression(context, jSONObject, "forward", value.f5109b);
        JsonExpressionParser.writeExpression(context, jSONObject, "left", value.f5110c);
        JsonExpressionParser.writeExpression(context, jSONObject, "right", value.f5111d);
        JsonExpressionParser.writeExpression(context, jSONObject, "up", value.f5112e);
        return jSONObject;
    }
}
