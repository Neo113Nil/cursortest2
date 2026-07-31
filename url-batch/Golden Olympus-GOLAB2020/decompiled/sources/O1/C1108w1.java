package O1;

import O1.C0876j2;
import O1.C0892k0;
import com.ironsource.b9;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.w1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1108w1 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8297a;

    public C1108w1(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8297a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0892k0.c resolve(ParsingContext context, C0876j2.c template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        C0892k0 c0892k0 = (C0892k0) JsonFieldResolver.resolveOptional(context, template.f6565a, data, "action", this.f8297a.w0(), this.f8297a.u0());
        List resolveOptionalList = JsonFieldResolver.resolveOptionalList(context, template.f6566b, data, "actions", this.f8297a.w0(), this.f8297a.u0());
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f6567c, data, b9.h.f15450K0, TypeHelpersKt.TYPE_HELPER_STRING);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…ext\", TYPE_HELPER_STRING)");
        return new C0892k0.c(c0892k0, resolveOptionalList, resolveExpression);
    }
}
