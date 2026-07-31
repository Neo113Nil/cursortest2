package O1;

import O1.Q0;
import O1.U0;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class T0 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f4855a;

    public T0(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f4855a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Q0 resolve(ParsingContext context, U0 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof U0.c) {
            return new Q0.c(((H) this.f4855a.u().getValue()).resolve(context, ((U0.c) template).c(), data));
        }
        if (template instanceof U0.d) {
            return new Q0.d(((M) this.f4855a.x().getValue()).resolve(context, ((U0.d) template).c(), data));
        }
        throw new W1.m();
    }
}
