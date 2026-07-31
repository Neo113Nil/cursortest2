package O1;

import O1.C1013qd;
import com.ironsource.b9;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.rd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1030rd implements Serializer, Deserializer {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7782a;

    public C1030rd(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7782a = component;
    }

    @Override // com.yandex.div.serialization.Deserializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1013qd.c deserialize(ParsingContext context, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Object read = JsonPropertyParser.read(context, data, "div", this.f7782a.J4());
        Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"div…nent.divJsonEntityParser)");
        Expression readExpression = JsonExpressionParser.readExpression(context, data, b9.h.f15436D0, TypeHelpersKt.TYPE_HELPER_STRING);
        Intrinsics.checkNotNullExpressionValue(readExpression, "readExpression(context, …tle\", TYPE_HELPER_STRING)");
        return new C1013qd.c((Z) read, readExpression, (C0892k0) JsonPropertyParser.readOptional(context, data, "title_click_action", this.f7782a.u0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(ParsingContext context, C1013qd.c value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(context, jSONObject, "div", value.f7643a, this.f7782a.J4());
        JsonExpressionParser.writeExpression(context, jSONObject, b9.h.f15436D0, value.f7644b);
        JsonPropertyParser.write(context, jSONObject, "title_click_action", value.f7645c, this.f7782a.u0());
        return jSONObject;
    }
}
