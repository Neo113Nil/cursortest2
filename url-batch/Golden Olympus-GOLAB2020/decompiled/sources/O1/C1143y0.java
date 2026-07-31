package O1;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.y0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1143y0 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8510a;

    public C1143y0(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8510a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1089v0 resolve(ParsingContext context, C1161z0 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, template.f8672a, data, FirebaseAnalytics.Param.INDEX, TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
        Object resolve = JsonFieldResolver.resolve(context, template.f8673b, data, "value", this.f8510a.d9(), this.f8510a.b9());
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…pedValueJsonEntityParser)");
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f8674c, data, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…ame\", TYPE_HELPER_STRING)");
        return new C1089v0(resolveOptionalExpression, (AbstractC1086uf) resolve, resolveExpression);
    }
}
