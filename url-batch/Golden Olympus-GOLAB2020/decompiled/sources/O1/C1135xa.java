package O1;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.xa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1135xa implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8490a;

    public C1135xa(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8490a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1081ua resolve(ParsingContext context, C1153ya template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Object resolve = JsonFieldResolver.resolve(context, template.f8641a, data, "x", this.f8490a.L2(), this.f8490a.J2());
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…imensionJsonEntityParser)");
        Object resolve2 = JsonFieldResolver.resolve(context, template.f8642b, data, "y", this.f8490a.L2(), this.f8490a.J2());
        Intrinsics.checkNotNullExpressionValue(resolve2, "resolve(context, templat…imensionJsonEntityParser)");
        return new C1081ua((J4) resolve, (J4) resolve2);
    }
}
