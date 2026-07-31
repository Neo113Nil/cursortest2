package O1;

import O1.C0757c8;
import com.ironsource.b9;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.a8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0721a8 implements Serializer, TemplateDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5709a;

    public C0721a8(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5709a = component;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0757c8.c deserialize(ParsingContext context, C0757c8.c cVar, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Field readFieldWithExpression = JsonFieldParser.readFieldWithExpression(ParsingContextKt.restrictPropertyOverride(context), data, b9.h.f15459S, TypeHelpersKt.TYPE_HELPER_COLOR, context.getAllowPropertyOverride(), cVar != null ? cVar.f5942a : null, ParsingConvertersKt.STRING_TO_COLOR_INT);
        Intrinsics.checkNotNullExpressionValue(readFieldWithExpression, "readFieldWithExpression(…lor, STRING_TO_COLOR_INT)");
        return new C0757c8.c(readFieldWithExpression);
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C0757c8.c value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(context, jSONObject, b9.h.f15459S, value.f5942a, ParsingConvertersKt.COLOR_INT_TO_STRING);
        return jSONObject;
    }
}
