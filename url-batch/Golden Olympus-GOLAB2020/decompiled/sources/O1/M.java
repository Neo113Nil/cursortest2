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
public final class M implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f3798a;

    public M(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f3798a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public J resolve(ParsingContext context, N template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f4076a, data, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…E_HELPER_URI, ANY_TO_URI)");
        return new J(resolveExpression);
    }
}
