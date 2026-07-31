package O1;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1053t0 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7961a;

    public C1053t0(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7961a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1000q0 resolve(ParsingContext context, C1071u0 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Object resolve = JsonFieldResolver.resolve(context, template.f8125a, data, "animator_id");
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…rId, data, \"animator_id\")");
        return new C1000q0((String) resolve);
    }
}
