package O1;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0766d implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5988a;

    public C0766d(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5988a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0712a resolve(ParsingContext context, C0784e template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f6062a, data, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…, TYPE_HELPER_JSON_ARRAY)");
        return new C0712a(resolveExpression);
    }
}
