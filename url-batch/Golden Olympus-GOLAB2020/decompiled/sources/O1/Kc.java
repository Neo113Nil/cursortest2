package O1;

import O1.Bc;
import O1.Lc;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Kc implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f3429a;

    public Kc(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f3429a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bc.c resolve(ParsingContext context, Lc.c template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        C1127x2 c1127x2 = (C1127x2) JsonFieldResolver.resolveOptional(context, template.f3765a, data, "animation_in", this.f3429a.p1(), this.f3429a.n1());
        C1127x2 c1127x22 = (C1127x2) JsonFieldResolver.resolveOptional(context, template.f3766b, data, "animation_out", this.f3429a.p1(), this.f3429a.n1());
        Z z4 = (Z) JsonFieldResolver.resolveOptional(context, template.f3767c, data, "div", this.f3429a.L4(), this.f3429a.J4());
        Object resolve = JsonFieldResolver.resolve(context, template.f3768d, data, "state_id");
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…tateId, data, \"state_id\")");
        return new Bc.c(c1127x2, c1127x22, z4, (String) resolve, JsonFieldResolver.resolveOptionalList(context, template.f3769e, data, "swipe_out_actions", this.f3429a.w0(), this.f3429a.u0()));
    }
}
