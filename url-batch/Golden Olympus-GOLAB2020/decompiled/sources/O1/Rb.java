package O1;

import com.ironsource.b9;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Rb implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4681a;

    public Rb(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4681a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Ob resolve(ParsingContext context, Sb template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f4792a, data, b9.h.f15459S, TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…LOR, STRING_TO_COLOR_INT)");
        Object resolve = JsonFieldResolver.resolve(context, template.f4793b, data, "shape", this.f4681a.U6(), this.f4681a.S6());
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…divShapeJsonEntityParser)");
        return new Ob(resolveExpression, (Nb) resolve, (Qc) JsonFieldResolver.resolveOptional(context, template.f4794c, data, "stroke", this.f4681a.y7(), this.f4681a.w7()));
    }
}
