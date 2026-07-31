package O1;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.h1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0840h1 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6353a;

    public C0840h1(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6353a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0786e1 resolve(ParsingContext context, C0858i1 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f6433a, data, "on_fail_actions", this.f6353a.w0(), this.f6353a.u0());
        List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(context, template.f6434b, data, "on_success_actions", this.f6353a.w0(), this.f6353a.u0());
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f6435c, data, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…E_HELPER_URI, ANY_TO_URI)");
        return new C0786e1(resolveOptionalList, resolveOptionalList2, resolveExpression);
    }
}
