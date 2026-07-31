package O1;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.fa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0813fa implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6194a;

    public C0813fa(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6194a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0759ca resolve(ParsingContext context, C0831ga template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Object resolve = JsonFieldResolver.resolve(context, template.f6246a, data, "raw_text_variable");
        Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, templat…ata, \"raw_text_variable\")");
        return new C0759ca((String) resolve);
    }
}
