package O1;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class O1 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4187a;

    public O1(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4187a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public L1 resolve(ParsingContext context, P1 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f4295a, data, "lifetime", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…ELPER_INT, NUMBER_TO_INT)");
        Expression resolveExpression2 = JsonFieldResolver.resolveExpression(context, template.f4296b, data, "name", TypeHelpersKt.TYPE_HELPER_STRING);
        Intrinsics.checkNotNullExpressionValue(resolveExpression2, "resolveExpression(contex…ame\", TYPE_HELPER_STRING)");
        Object resolve = JsonFieldResolver.resolve(context, template.f4297c, data, "value", this.f4187a.d9(), this.f4187a.b9());
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…pedValueJsonEntityParser)");
        return new L1(resolveExpression, resolveExpression2, (AbstractC1086uf) resolve);
    }
}
