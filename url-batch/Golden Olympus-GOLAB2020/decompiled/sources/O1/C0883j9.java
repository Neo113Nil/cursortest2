package O1;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.j9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0883j9 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6596a;

    public C0883j9(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6596a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0830g9 resolve(ParsingContext context, C0901k9 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Object resolve = JsonFieldResolver.resolve(context, template.f6831a, data, "page_width", this.f6596a.J5(), this.f6596a.H5());
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…tageSizeJsonEntityParser)");
        return new C0830g9((Y9) resolve);
    }
}
