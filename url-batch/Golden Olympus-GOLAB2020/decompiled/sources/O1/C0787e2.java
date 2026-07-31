package O1;

import O1.C0715a2;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.e2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0787e2 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6071a;

    public C0787e2(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6071a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0715a2.c.C0039c deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        Expression readExpression = JsonExpressionParser.readExpression(context, data, "name", typeHelper);
        Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …ame\", TYPE_HELPER_STRING)");
        Expression readExpression2 = JsonExpressionParser.readExpression(context, data, "value", typeHelper);
        Intrinsics.checkNotNullExpressionValue(readExpression2, "readExpression(context, …lue\", TYPE_HELPER_STRING)");
        return new C0715a2.c.C0039c(readExpression, readExpression2);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0715a2.c.C0039c value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(context, jSONObject, "name", value.f5605a);
        JsonExpressionParser.writeExpression(context, jSONObject, "value", value.f5606b);
        return jSONObject;
    }
}
