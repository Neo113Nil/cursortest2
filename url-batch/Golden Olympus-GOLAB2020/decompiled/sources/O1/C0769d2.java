package O1;

import O1.C0715a2;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.d2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0769d2 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5995a;

    public C0769d2(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5995a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0715a2 resolve(ParsingContext context, C0859i2 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f6439a, data, "container_id", TypeHelpersKt.TYPE_HELPER_STRING);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…_id\", TYPE_HELPER_STRING)");
        List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f6440b, data, "on_fail_actions", this.f5995a.w0(), this.f5995a.u0());
        List resolveOptionalList2 = JsonFieldResolver.resolveOptionalList(context, template.f6441c, data, "on_success_actions", this.f5995a.w0(), this.f5995a.u0());
        Object resolve = JsonFieldResolver.resolve(context, template.f6442d, data, "request", this.f5995a.d1(), this.f5995a.b1());
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…tRequestJsonEntityParser)");
        return new C0715a2(resolveExpression, resolveOptionalList, resolveOptionalList2, (C0715a2.c) resolve);
    }
}
