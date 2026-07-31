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
public final class ph implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7549a;

    public ph(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7549a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public mh resolve(ParsingContext context, qh template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Object resolve = JsonFieldResolver.resolve(context, template.f7726a, data, "name");
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, template.name, data, \"name\")");
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f7727b, data, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…E_HELPER_URI, ANY_TO_URI)");
        return new mh((String) resolve, resolveExpression);
    }
}
