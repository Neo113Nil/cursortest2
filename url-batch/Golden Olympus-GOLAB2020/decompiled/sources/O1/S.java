package O1;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class S implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4695a;

    public S(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4695a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public O resolve(ParsingContext context, T template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f4853a, data, "value", TypeHelpersKt.TYPE_HELPER_DICT);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…value\", TYPE_HELPER_DICT)");
        return new O(resolveExpression);
    }
}
