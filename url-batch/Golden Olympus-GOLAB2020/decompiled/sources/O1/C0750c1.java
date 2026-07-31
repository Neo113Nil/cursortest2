package O1;

import com.ironsource.b9;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.c1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0750c1 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5841a;

    public C0750c1(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5841a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Z0 resolve(ParsingContext context, C0768d1 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Field field = template.f5991a;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, field, data, b9.h.f15463W, typeHelper);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…key\", TYPE_HELPER_STRING)");
        AbstractC1086uf abstractC1086uf = (AbstractC1086uf) JsonFieldResolver.resolveOptional(context, template.f5992b, data, "value", this.f5841a.d9(), this.f5841a.b9());
        Expression resolveExpression2 = JsonFieldResolver.resolveExpression(context, template.f5993c, data, "variable_name", typeHelper);
        Intrinsics.checkNotNullExpressionValue(resolveExpression2, "resolveExpression(contex…ame\", TYPE_HELPER_STRING)");
        return new Z0(resolveExpression, abstractC1086uf, resolveExpression2);
    }
}
