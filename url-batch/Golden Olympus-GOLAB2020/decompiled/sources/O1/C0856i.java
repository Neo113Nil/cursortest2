package O1;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0856i implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6421a;

    public C0856i(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6421a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0802f resolve(ParsingContext context, C0873j template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Object resolve = JsonFieldResolver.resolve(context, template.f6527a, data, "name");
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, template.name, data, \"name\")");
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f6528b, data, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…, TYPE_HELPER_JSON_ARRAY)");
        return new C0802f((String) resolve, resolveExpression);
    }
}
