package O1;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class T1 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4856a;

    public T1(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4856a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Q1 resolve(ParsingContext context, U1 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Object resolve = JsonFieldResolver.resolve(context, template.f4911a, data, "value", this.f4856a.d9(), this.f4856a.b9());
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…pedValueJsonEntityParser)");
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f4912b, data, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…ame\", TYPE_HELPER_STRING)");
        return new Q1((AbstractC1086uf) resolve, resolveExpression);
    }
}
