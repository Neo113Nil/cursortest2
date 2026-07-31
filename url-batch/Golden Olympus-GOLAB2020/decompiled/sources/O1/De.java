package O1;

import O1.AbstractC1139xe;
import O1.Ge;
import O1.Je;
import O1.Le;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class De implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f2469a;

    public De(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f2469a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC1139xe resolve(ParsingContext context, Le template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof Le.c) {
            return new AbstractC1139xe.c(((Ge.d) this.f2469a.C8().getValue()).resolve(context, ((Le.c) template).c(), data));
        }
        if (template instanceof Le.d) {
            return new AbstractC1139xe.d(((Je.d) this.f2469a.F8().getValue()).resolve(context, ((Le.d) template).c(), data));
        }
        throw new W1.m();
    }
}
