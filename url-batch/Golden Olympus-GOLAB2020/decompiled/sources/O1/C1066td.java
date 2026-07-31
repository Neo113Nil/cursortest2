package O1;

import O1.C1013qd;
import O1.Id;
import com.ironsource.b9;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.td, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1066td implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8109a;

    public C1066td(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8109a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1013qd.c resolve(ParsingContext context, Id.c template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Object resolve = JsonFieldResolver.resolve(context, template.f3228a, data, "div", this.f8109a.L4(), this.f8109a.J4());
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…nent.divJsonEntityParser)");
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f3229b, data, b9.h.f15436D0, TypeHelpersKt.TYPE_HELPER_STRING);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…tle\", TYPE_HELPER_STRING)");
        return new C1013qd.c((Z) resolve, resolveExpression, (C0892k0) JsonFieldResolver.resolveOptional(context, template.f3230c, data, "title_click_action", this.f8109a.w0(), this.f8109a.u0()));
    }
}
