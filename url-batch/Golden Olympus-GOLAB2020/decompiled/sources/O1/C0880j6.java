package O1;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.j6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0880j6 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6587a;

    public C0880j6(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6587a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0827g6 resolve(ParsingContext context, C0898k6 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Object resolve = JsonFieldResolver.resolve(context, template.f6825a, data, "name");
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, template.name, data, \"name\")");
        Object resolve2 = JsonFieldResolver.resolve(context, (Field<Object>) template.f6826b, data, "type", (Function1<R, Object>) EnumC0915l5.f6908e);
        Intrinsics.checkNotNullExpressionValue(resolve2, "resolve(context, templat…valuableType.FROM_STRING)");
        return new C0827g6((String) resolve, (EnumC0915l5) resolve2);
    }
}
