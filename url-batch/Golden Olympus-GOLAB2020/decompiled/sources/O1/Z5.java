package O1;

import O1.W5;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Z5 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5471a;

    public Z5(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5471a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public W5 resolve(ParsingContext context, C0773d6 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        return new W5(JsonFieldResolver.resolveOptionalList(context, template.f6011a, data, io.appmetrica.analytics.impl.L2.f37912g, this.f5471a.E1(), this.f5471a.C1()), (C0860i3) JsonFieldResolver.resolveOptional(context, template.f6012b, data, "border", this.f5471a.K1(), this.f5471a.I1()), (W5.c) JsonFieldResolver.resolveOptional(context, template.f6013c, data, "next_focus_ids", this.f5471a.B3(), this.f5471a.z3()), JsonFieldResolver.resolveOptionalList(context, template.f6014d, data, "on_blur", this.f5471a.w0(), this.f5471a.u0()), JsonFieldResolver.resolveOptionalList(context, template.f6015e, data, "on_focus", this.f5471a.w0(), this.f5471a.u0()));
    }
}
