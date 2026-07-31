package O1;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.p5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0987p5 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7463a;

    public C0987p5(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7463a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0933m5 resolve(ParsingContext context, C1005q5 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Object resolve = JsonFieldResolver.resolve(context, template.f7570a, data, "id");
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, template.id, data, \"id\")");
        return new C0933m5((String) resolve, (JSONObject) JsonFieldResolver.resolveOptional(context, template.f7571b, data, "params"));
    }
}
