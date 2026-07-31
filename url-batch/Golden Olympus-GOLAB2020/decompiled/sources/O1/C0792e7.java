package O1;

import O1.AbstractC0738b7;
import O1.AbstractC0810f7;
import O1.H4;
import O1.Oc;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.e7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0792e7 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6088a;

    public C0792e7(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6088a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0738b7 resolve(ParsingContext context, AbstractC0810f7 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof AbstractC0810f7.c) {
            return new AbstractC0738b7.c(((H4.d) this.f6088a.I2().getValue()).resolve(context, ((AbstractC0810f7.c) template).c(), data));
        }
        if (template instanceof AbstractC0810f7.d) {
            return new AbstractC0738b7.d(((Oc.d) this.f6088a.v7().getValue()).resolve(context, ((AbstractC0810f7.d) template).c(), data));
        }
        throw new W1.m();
    }
}
