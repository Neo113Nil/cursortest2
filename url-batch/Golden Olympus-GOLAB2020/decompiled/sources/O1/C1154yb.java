package O1;

import O1.C0939mb;
import O1.C1172zb;
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

/* renamed from: O1.yb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1154yb implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8644a;

    public C1154yb(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8644a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0939mb.c resolve(ParsingContext context, C1172zb.c template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Field field = template.f8882a;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, field, data, b9.h.f15450K0, typeHelper);
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f8883b, data, "value", typeHelper);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…lue\", TYPE_HELPER_STRING)");
        return new C0939mb.c(resolveOptionalExpression, resolveExpression);
    }
}
