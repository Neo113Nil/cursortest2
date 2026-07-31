package O1;

import O1.R9;
import O1.X9;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class U9 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4924a;

    public U9(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4924a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public R9.a resolve(ParsingContext context, X9.a template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Object resolve = JsonFieldResolver.resolve(context, template.f5263a, data, "id");
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, template.id, data, \"id\")");
        return new R9.a((String) resolve, JsonFieldResolver.resolveOptionalList(context, template.f5264b, data, FirebaseAnalytics.Param.ITEMS, this.f4924a.L4(), this.f4924a.J4()));
    }
}
