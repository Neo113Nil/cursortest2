package O1;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.vg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1105vg implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8294a;

    public C1105vg(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8294a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1051sg resolve(ParsingContext context, C1123wg template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f8370a, data, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…ELPER_INT, NUMBER_TO_INT)");
        return new C1051sg(resolveExpression);
    }
}
