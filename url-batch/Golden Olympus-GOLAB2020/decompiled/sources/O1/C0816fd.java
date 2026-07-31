package O1;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.fd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0816fd implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6195a;

    public C0816fd(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6195a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0762cd resolve(ParsingContext context, C0834gd template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        return new C0762cd();
    }
}
