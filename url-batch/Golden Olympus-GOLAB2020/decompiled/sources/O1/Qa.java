package O1;

import O1.Na;
import O1.Ra;
import O1.U5;
import O1.Ya;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Qa implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4469a;

    public Qa(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4469a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Na resolve(ParsingContext context, Ra template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof Ra.c) {
            return new Na.c(((U5.e) this.f4469a.v3().getValue()).resolve(context, ((Ra.c) template).c(), data));
        }
        if (template instanceof Ra.d) {
            return new Na.d(((Ya.e) this.f4469a.t6().getValue()).resolve(context, ((Ra.d) template).c(), data));
        }
        throw new W1.m();
    }
}
