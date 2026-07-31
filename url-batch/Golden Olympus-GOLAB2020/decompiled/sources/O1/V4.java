package O1;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class V4 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5019a;

    public V4(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5019a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public S4 resolve(ParsingContext context, W4 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        return new S4(JsonFieldResolver.resolveOptionalList(context, template.f5094a, data, "on_fail_actions", this.f5019a.w0(), this.f5019a.u0()), JsonFieldResolver.resolveOptionalList(context, template.f5095b, data, "on_success_actions", this.f5019a.w0(), this.f5019a.u0()));
    }
}
