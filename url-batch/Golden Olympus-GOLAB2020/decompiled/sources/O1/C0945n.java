package O1;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0945n implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7113a;

    public C0945n(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7113a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0891k resolve(ParsingContext context, C0963o template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f7239a, data, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…_BOOLEAN, ANY_TO_BOOLEAN)");
        return new C0891k(resolveExpression);
    }
}
