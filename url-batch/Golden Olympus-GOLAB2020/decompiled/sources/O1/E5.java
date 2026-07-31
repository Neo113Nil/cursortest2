package O1;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class E5 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f2510a;

    public E5(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f2510a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public B5 resolve(ParsingContext context, F5 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        return new B5();
    }
}
