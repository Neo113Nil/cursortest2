package O1;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.hf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0854hf implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6414a;

    public C0854hf(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6414a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0800ef resolve(ParsingContext context, Cif template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        return new C0800ef();
    }
}
