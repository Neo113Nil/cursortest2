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
public final class C implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f1554a;

    public C(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f1554a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1160z resolve(ParsingContext context, D template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Object resolve = JsonFieldResolver.resolve(context, template.f2429a, data, "name");
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, template.name, data, \"name\")");
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f2430b, data, "value", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…LOR, STRING_TO_COLOR_INT)");
        return new C1160z((String) resolve, resolveExpression);
    }
}
