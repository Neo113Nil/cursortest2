package O1;

import O1.AbstractC0849ha;
import O1.AbstractC0884ja;
import O1.AbstractC1063ta;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.na, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0956na implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7224a;

    public C0956na(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7224a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0849ha resolve(ParsingContext context, AbstractC1063ta template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof AbstractC1063ta.c) {
            return new AbstractC0849ha.c(((AbstractC0884ja.e) this.f7224a.P5().getValue()).resolve(context, ((AbstractC1063ta.c) template).c(), data));
        }
        if (template instanceof AbstractC1063ta.d) {
            return new AbstractC0849ha.d(((C1027ra) this.f7224a.V5().getValue()).resolve(context, ((AbstractC1063ta.d) template).c(), data));
        }
        throw new W1.m();
    }
}
