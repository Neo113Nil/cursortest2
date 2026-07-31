package O1;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.y7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1150y7 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8633a;

    public C1150y7(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8633a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1096v7 resolve(ParsingContext context, C1168z7 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f8793a, data, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…_BOOLEAN, ANY_TO_BOOLEAN)");
        return new C1096v7(resolveExpression);
    }
}
