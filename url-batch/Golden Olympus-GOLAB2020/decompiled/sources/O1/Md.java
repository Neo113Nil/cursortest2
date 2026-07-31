package O1;

import O1.Kd;
import com.ironsource.b9;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Md implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f3904a;

    public Md(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f3904a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Kd.c deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "actions", this.f3904a.u0());
        List readOptionalList2 = JsonPropertyParser.readOptionalList(context, data, "images", this.f3904a.g8());
        List readOptionalList3 = JsonPropertyParser.readOptionalList(context, data, "ranges", this.f3904a.s8());
        Expression readExpression = JsonExpressionParser.readExpression(context, data, b9.h.f15450K0, TypeHelpersKt.TYPE_HELPER_STRING);
        Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …ext\", TYPE_HELPER_STRING)");
        return new Kd.c(readOptionalList, readOptionalList2, readOptionalList3, readExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, Kd.c value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.writeList(context, jSONObject, "actions", value.f3523a, this.f3904a.u0());
        JsonPropertyParser.writeList(context, jSONObject, "images", value.f3524b, this.f3904a.g8());
        JsonPropertyParser.writeList(context, jSONObject, "ranges", value.f3525c, this.f3904a.s8());
        JsonExpressionParser.writeExpression(context, jSONObject, b9.h.f15450K0, value.f3526d);
        return jSONObject;
    }
}
