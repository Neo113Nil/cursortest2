package O1;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.mg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0944mg implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7106a;

    public C0944mg(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7106a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0890jg resolve(ParsingContext context, C0962ng template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        return new C0890jg();
    }
}
