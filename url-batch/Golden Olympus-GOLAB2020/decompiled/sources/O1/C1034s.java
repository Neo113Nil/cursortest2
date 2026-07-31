package O1;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1034s implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7787a;

    public C1034s(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7787a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0981p resolve(ParsingContext context, C1052t template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Object resolve = JsonFieldResolver.resolve(context, template.f7958a, data, "name");
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, template.name, data, \"name\")");
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f7959b, data, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…_BOOLEAN, ANY_TO_BOOLEAN)");
        return new C0981p((String) resolve, resolveExpression);
    }
}
