package O1;

import O1.AbstractC0760cb;
import O1.B3;
import O1.Nb;
import O1.Wb;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Vb implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5033a;

    public Vb(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5033a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Nb resolve(ParsingContext context, Wb template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof Wb.d) {
            return new Nb.d(((AbstractC0760cb.d) this.f5033a.w6().getValue()).resolve(context, ((Wb.d) template).c(), data));
        }
        if (template instanceof Wb.a) {
            return new Nb.a(((B3.d) this.f5033a.W1().getValue()).resolve(context, ((Wb.a) template).c(), data));
        }
        throw new W1.m();
    }
}
