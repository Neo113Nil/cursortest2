package O1;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class G7 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f2890a;

    public G7(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f2890a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public D7 resolve(ParsingContext context, H7 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f2972a, data, "pattern", TypeHelpersKt.TYPE_HELPER_STRING);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…ern\", TYPE_HELPER_STRING)");
        return new D7(resolveExpression);
    }
}
