package O1;

import O1.C0715a2;
import O1.C0859i2;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.g2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0823g2 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6212a;

    public C0823g2(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6212a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0715a2.c.C0039c resolve(ParsingContext context, C0859i2.c.C0045c template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Field field = template.f6453a;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, field, data, "name", typeHelper);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…ame\", TYPE_HELPER_STRING)");
        Expression resolveExpression2 = JsonFieldResolver.resolveExpression(context, template.f6454b, data, "value", typeHelper);
        Intrinsics.checkNotNullExpressionValue(resolveExpression2, "resolveExpression(contex…lue\", TYPE_HELPER_STRING)");
        return new C0715a2.c.C0039c(resolveExpression, resolveExpression2);
    }
}
