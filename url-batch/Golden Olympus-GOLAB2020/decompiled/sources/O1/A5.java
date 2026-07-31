package O1;

import O1.AbstractC0824g3;
import O1.AbstractC1130x5;
import O1.G5;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class A5 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f1307a;

    public A5(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f1307a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC1130x5 resolve(ParsingContext context, G5 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof G5.a) {
            return new AbstractC1130x5.a(((AbstractC0824g3.d) this.f1307a.H1().getValue()).resolve(context, ((G5.a) template).c(), data));
        }
        if (template instanceof G5.d) {
            return new AbstractC1130x5.d(((E5) this.f1307a.j3().getValue()).resolve(context, ((G5.d) template).c(), data));
        }
        throw new W1.m();
    }
}
