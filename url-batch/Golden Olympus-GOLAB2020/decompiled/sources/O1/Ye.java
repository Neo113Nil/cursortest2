package O1;

import O1.AbstractC0889jf;
import O1.Ve;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Ye implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5418a;

    public Ye(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5418a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Ve resolve(ParsingContext context, AbstractC0889jf template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof AbstractC0889jf.d) {
            return new Ve.d(((C0854hf) this.f5418a.U8().getValue()).resolve(context, ((AbstractC0889jf.d) template).c(), data));
        }
        if (template instanceof AbstractC0889jf.c) {
            return new Ve.c(((C0764cf) this.f5418a.R8().getValue()).resolve(context, ((AbstractC0889jf.c) template).c(), data));
        }
        throw new W1.m();
    }
}
