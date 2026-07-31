package O1;

import O1.G8;
import O1.Ma;
import O1.Pd;
import O1.Td;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Sd implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4806a;

    public Sd(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4806a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Pd resolve(ParsingContext context, Td template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof Td.c) {
            return new Pd.c(((G8.d) this.f4806a.U4().getValue()).resolve(context, ((Td.c) template).c(), data));
        }
        if (template instanceof Td.d) {
            return new Pd.d(((Ma.d) this.f4806a.k6().getValue()).resolve(context, ((Td.d) template).c(), data));
        }
        throw new W1.m();
    }
}
