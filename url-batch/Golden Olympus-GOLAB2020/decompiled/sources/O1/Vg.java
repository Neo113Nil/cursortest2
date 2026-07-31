package O1;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Vg implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5051a;

    public Vg(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5051a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Sg resolve(ParsingContext context, Wg template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        return new Sg();
    }
}
