package O1;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.q4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1004q4 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7567a;

    public C1004q4(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7567a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0950n4 resolve(ParsingContext context, C1021r4 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression resolveOptionalExpression = JsonFieldResolver.resolveOptionalExpression(context, template.f7763a, data, CommonUrlParts.LOCALE, TypeHelpersKt.TYPE_HELPER_STRING);
        Object resolve = JsonFieldResolver.resolve(context, template.f7764b, data, "raw_text_variable");
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…ata, \"raw_text_variable\")");
        return new C0950n4(resolveOptionalExpression, (String) resolve);
    }
}
