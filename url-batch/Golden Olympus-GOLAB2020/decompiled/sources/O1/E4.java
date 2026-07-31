package O1;

import O1.C1165z4;
import O1.F4;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class E4 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f2509a;

    public E4(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f2509a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1165z4.c resolve(ParsingContext context, F4.c template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Object resolve = JsonFieldResolver.resolve(context, template.f2734a, data, "div", this.f2509a.L4(), this.f2509a.J4());
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…nent.divJsonEntityParser)");
        Object resolve2 = JsonFieldResolver.resolve(context, (Field<Object>) template.f2735b, data, "state_id", (Function1<R, Object>) ParsingConvertersKt.NUMBER_TO_INT);
        Intrinsics.checkNotNullExpressionValue(resolve2, "resolve(context, templat…state_id\", NUMBER_TO_INT)");
        return new C1165z4.c((Z) resolve, ((Number) resolve2).longValue());
    }
}
