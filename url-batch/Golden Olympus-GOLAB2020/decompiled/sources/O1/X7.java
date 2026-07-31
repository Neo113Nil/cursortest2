package O1;

import O1.N5;
import O1.T7;
import O1.Y7;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class X7 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5253a;

    public X7(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5253a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public T7 resolve(ParsingContext context, Y7 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof Y7.d) {
            return new T7.d(((N5.d) this.f5253a.p3().getValue()).resolve(context, ((Y7.d) template).c(), data));
        }
        if (template instanceof Y7.c) {
            return new T7.c(((C1004q4) this.f5253a.x2().getValue()).resolve(context, ((Y7.c) template).c(), data));
        }
        if (template instanceof Y7.e) {
            return new T7.e(((C0813fa) this.f5253a.M5().getValue()).resolve(context, ((Y7.e) template).c(), data));
        }
        throw new W1.m();
    }
}
