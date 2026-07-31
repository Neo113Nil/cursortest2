package O1;

import O1.E2;
import O1.J2;
import O1.P3;
import O1.Z8;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class I2 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f3133a;

    public I2(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f3133a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public E2 resolve(ParsingContext context, J2 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof J2.a) {
            return new E2.a(((P3.f) this.f3133a.i2().getValue()).resolve(context, ((J2.a) template).c(), data));
        }
        if (template instanceof J2.d) {
            return new E2.d(((Z8.f) this.f3133a.g5().getValue()).resolve(context, ((J2.d) template).c(), data));
        }
        throw new W1.m();
    }
}
