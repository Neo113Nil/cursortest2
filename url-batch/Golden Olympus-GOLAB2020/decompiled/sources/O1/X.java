package O1;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class X implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5193a;

    public X(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5193a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public U resolve(ParsingContext context, Y template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Object resolve = JsonFieldResolver.resolve(context, template.f5292a, data, "name");
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, template.name, data, \"name\")");
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f5293b, data, "value", TypeHelpersKt.TYPE_HELPER_DICT);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…value\", TYPE_HELPER_DICT)");
        return new U((String) resolve, resolveExpression);
    }
}
