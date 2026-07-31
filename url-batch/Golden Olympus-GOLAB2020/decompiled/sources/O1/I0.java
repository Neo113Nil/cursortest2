package O1;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class I0 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f3125a;

    public I0(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f3125a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public F0 resolve(ParsingContext context, J0 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f3294a, data, FirebaseAnalytics.Param.INDEX, TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…ELPER_INT, NUMBER_TO_INT)");
        Object resolve = JsonFieldResolver.resolve(context, template.f3295b, data, "value", this.f3125a.d9(), this.f3125a.b9());
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…pedValueJsonEntityParser)");
        Expression resolveExpression2 = JsonFieldResolver.resolveExpression(context, template.f3296c, data, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING);
        Intrinsics.checkNotNullExpressionValue(resolveExpression2, "resolveExpression(contex…ame\", TYPE_HELPER_STRING)");
        return new F0(resolveExpression, (AbstractC1086uf) resolve, resolveExpression2);
    }
}
