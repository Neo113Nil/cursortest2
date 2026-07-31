package O1;

import O1.Mf;
import com.huawei.hms.adapter.internal.CommonCode;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Pf implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4352a;

    public Pf(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4352a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Mf resolve(ParsingContext context, Tf template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, template.f4887a, data, "bitrate", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT);
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f4888b, data, "mime_type", TypeHelpersKt.TYPE_HELPER_STRING);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…ype\", TYPE_HELPER_STRING)");
        Mf.c cVar = (Mf.c) JsonFieldResolver.resolveOptional(context, template.f4889c, data, CommonCode.MapKey.HAS_RESOLUTION, this.f4352a.p9(), this.f4352a.n9());
        Expression resolveExpression2 = JsonFieldResolver.resolveExpression(context, template.f4890d, data, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
        Intrinsics.checkNotNullExpressionValue(resolveExpression2, "resolveExpression(contex…E_HELPER_URI, ANY_TO_URI)");
        return new Mf(resolveOptionalExpression, resolveExpression, cVar, resolveExpression2);
    }
}
