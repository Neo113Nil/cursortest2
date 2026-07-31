package O1;

import O1.C0892k0;
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

/* renamed from: O1.u1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1072u1 implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8127a;

    public C1072u1(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8127a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0892k0.c deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        C0892k0 c0892k0 = (C0892k0) JsonPropertyParser.readOptional(context, data, "action", this.f8127a.u0());
        List readOptionalList = JsonPropertyParser.readOptionalList(context, data, "actions", this.f8127a.u0());
        Expression readExpression = JsonExpressionParser.readExpression(context, data, b9.h.f15450K0, TypeHelpersKt.TYPE_HELPER_STRING);
        Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …ext\", TYPE_HELPER_STRING)");
        return new C0892k0.c(c0892k0, readOptionalList, readExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0892k0.c value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(context, jSONObject, "action", value.f6767a, this.f8127a.u0());
        JsonPropertyParser.writeList(context, jSONObject, "actions", value.f6768b, this.f8127a.u0());
        JsonExpressionParser.writeExpression(context, jSONObject, b9.h.f15450K0, value.f6769c);
        return jSONObject;
    }
}
