package O1;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.ra, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1027ra implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7780a;

    public C1027ra(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7780a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0974oa resolve(ParsingContext context, C1045sa template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f7858a, data, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…DOUBLE, NUMBER_TO_DOUBLE)");
        return new C0974oa(resolveExpression);
    }
}
