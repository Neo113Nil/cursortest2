package O1;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class P8 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4330a;

    public P8(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4330a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public M8 resolve(ParsingContext context, Q8 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Object resolve = JsonFieldResolver.resolve(context, template.f4410a, data, "neighbour_page_width", this.f4330a.v3(), this.f4330a.t3());
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…ixedSizeJsonEntityParser)");
        return new M8((S5) resolve);
    }
}
