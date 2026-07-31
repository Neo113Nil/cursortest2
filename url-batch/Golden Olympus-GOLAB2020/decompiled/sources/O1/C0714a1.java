package O1;

import com.ironsource.b9;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.a1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0714a1 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5586a;

    public C0714a1(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5586a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Z0 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        Expression readExpression = JsonExpressionParser.readExpression(context, data, b9.h.f15463W, typeHelper);
        Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …key\", TYPE_HELPER_STRING)");
        AbstractC1086uf abstractC1086uf = (AbstractC1086uf) JsonPropertyParser.readOptional(context, data, "value", this.f5586a.b9());
        Expression readExpression2 = JsonExpressionParser.readExpression(context, data, "variable_name", typeHelper);
        Intrinsics.checkNotNullExpressionValue(readExpression2, "readExpression(context, …ame\", TYPE_HELPER_STRING)");
        return new Z0(readExpression, abstractC1086uf, readExpression2);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Z0 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(context, jSONObject, b9.h.f15463W, value.f5444a);
        JsonPropertyParser.write(context, jSONObject, "type", "dict_set_value");
        JsonPropertyParser.write(context, jSONObject, "value", value.f5445b, this.f5586a.b9());
        JsonExpressionParser.writeExpression(context, jSONObject, "variable_name", value.f5446c);
        return jSONObject;
    }
}
