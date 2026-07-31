package O1;

import O1.L9;
import O1.P9;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class O9 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4269a;

    public O9(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4269a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public L9 resolve(ParsingContext context, P9 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof P9.e) {
            return new L9.e(((C0883j9) this.f4269a.m5().getValue()).resolve(context, ((P9.e) template).c(), data));
        }
        if (template instanceof P9.c) {
            return new L9.c(((P8) this.f4269a.a5().getValue()).resolve(context, ((P9.c) template).c(), data));
        }
        if (template instanceof P9.d) {
            return new L9.d(((C0794e9) this.f4269a.j5().getValue()).resolve(context, ((P9.d) template).c(), data));
        }
        throw new W1.m();
    }
}
