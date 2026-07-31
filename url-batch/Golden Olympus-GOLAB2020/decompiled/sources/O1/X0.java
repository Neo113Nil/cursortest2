package O1;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class X0 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5194a;

    public X0(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5194a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public P0 resolve(ParsingContext context, Y0 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Object resolve = JsonFieldResolver.resolve(context, template.f5297a, data, FirebaseAnalytics.Param.CONTENT, this.f5194a.e0(), this.f5194a.c0());
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…dContentJsonEntityParser)");
        return new P0((Q0) resolve);
    }
}
