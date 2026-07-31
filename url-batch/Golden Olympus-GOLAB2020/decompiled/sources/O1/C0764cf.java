package O1;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.cf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0764cf implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5967a;

    public C0764cf(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5967a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Ze resolve(ParsingContext context, C0782df template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        return new Ze();
    }
}
