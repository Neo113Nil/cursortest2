package O1;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.o4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0968o4 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7257a;

    public C0968o4(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7257a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0950n4 deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(context, data, CommonUrlParts.LOCALE, TypeHelpersKt.TYPE_HELPER_STRING);
        Object read = JsonPropertyParser.read(context, data, "raw_text_variable");
        Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"raw_text_variable\")");
        return new C0950n4(readOptionalExpression, (String) read);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0950n4 value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(context, jSONObject, CommonUrlParts.LOCALE, value.f7144a);
        JsonPropertyParser.write(context, jSONObject, "raw_text_variable", value.a());
        JsonPropertyParser.write(context, jSONObject, "type", "currency");
        return jSONObject;
    }
}
