package O1;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class N0 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4078a;

    public N0(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4078a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public K0 resolve(ParsingContext context, O0 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        return new K0();
    }
}
