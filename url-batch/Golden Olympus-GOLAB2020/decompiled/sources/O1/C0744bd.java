package O1;

import O1.AbstractC0852hd;
import O1.Tc;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.bd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0744bd implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5816a;

    public C0744bd(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5816a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Tc resolve(ParsingContext context, AbstractC0852hd template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof AbstractC0852hd.d) {
            return new Tc.d(((C0816fd) this.f5816a.H7().getValue()).resolve(context, ((AbstractC0852hd.d) template).c(), data));
        }
        if (template instanceof AbstractC0852hd.c) {
            return new Tc.c(((Xc) this.f5816a.B7().getValue()).resolve(context, ((AbstractC0852hd.c) template).c(), data));
        }
        throw new W1.m();
    }
}
