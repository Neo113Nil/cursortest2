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
public final class Lg implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f3797a;

    public Lg(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f3797a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Ig resolve(ParsingContext context, Mg template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Object resolve = JsonFieldResolver.resolve(context, template.f4071a, data, "name");
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, template.name, data, \"name\")");
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f4072b, data, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…DOUBLE, NUMBER_TO_DOUBLE)");
        return new Ig((String) resolve, resolveExpression);
    }
}
