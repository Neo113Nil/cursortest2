package O1;

import O1.Kd;
import O1.Me;
import com.ironsource.b9;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Od implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4285a;

    public Od(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4285a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Kd.c resolve(ParsingContext context, Me.c template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f3997a, data, "actions", this.f4285a.w0(), this.f4285a.u0());
        List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(context, template.f3998b, data, "images", this.f4285a.i8(), this.f4285a.g8());
        List resolveOptionalList3 = JsonFieldResolver.resolveOptionalList(context, template.f3999c, data, "ranges", this.f4285a.u8(), this.f4285a.s8());
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f4000d, data, b9.h.f15450K0, TypeHelpersKt.TYPE_HELPER_STRING);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…ext\", TYPE_HELPER_STRING)");
        return new Kd.c(resolveOptionalList, resolveOptionalList2, resolveOptionalList3, resolveExpression);
    }
}
