package O1;

import O1.AbstractC0853he;
import O1.AbstractC0924le;
import O1.F3;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.ke, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0906ke implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6856a;

    public C0906ke(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6856a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0853he resolve(ParsingContext context, AbstractC0924le template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof AbstractC0924le.d) {
            return new AbstractC0853he.d(((C1173zc) this.f6856a.m7().getValue()).resolve(context, ((AbstractC0924le.d) template).c(), data));
        }
        if (template instanceof AbstractC0924le.a) {
            return new AbstractC0853he.a(((F3.d) this.f6856a.Z1().getValue()).resolve(context, ((AbstractC0924le.a) template).c(), data));
        }
        throw new W1.m();
    }
}
