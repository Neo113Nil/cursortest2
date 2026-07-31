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
public final class U8 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4923a;

    public U8(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4923a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public R8 resolve(ParsingContext context, V8 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f5029a, data, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…E_HELPER_URI, ANY_TO_URI)");
        Object resolve = JsonFieldResolver.resolve(context, template.f5030b, data, "insets", this.f4923a.G(), this.f4923a.E());
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…geInsetsJsonEntityParser)");
        return new R8(resolveExpression, (C0713a0) resolve);
    }
}
