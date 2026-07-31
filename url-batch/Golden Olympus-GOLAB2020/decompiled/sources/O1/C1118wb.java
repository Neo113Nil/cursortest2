package O1;

import O1.C0939mb;
import com.ironsource.b9;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.wb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1118wb implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8338a;

    public C1118wb(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8338a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0939mb.c deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, b9.h.f15450K0, typeHelper);
        Expression readExpression = JsonExpressionParser.readExpression(context, data, "value", typeHelper);
        Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …lue\", TYPE_HELPER_STRING)");
        return new C0939mb.c(readOptionalExpression, readExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0939mb.c value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(context, jSONObject, b9.h.f15450K0, value.f7090a);
        JsonExpressionParser.writeExpression(context, jSONObject, "value", value.f7091b);
        return jSONObject;
    }
}
