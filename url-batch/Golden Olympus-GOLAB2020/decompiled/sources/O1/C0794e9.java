package O1;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.e9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0794e9 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6097a;

    public C0794e9(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6097a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0740b9 resolve(ParsingContext context, C0812f9 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        return new C0740b9();
    }
}
