package O1;

import O1.AbstractC0861i4;
import O1.AbstractC0932m4;
import O1.J5;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.l4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0914l4 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6905a;

    public C0914l4(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6905a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0861i4 resolve(ParsingContext context, AbstractC0932m4 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof AbstractC0932m4.d) {
            return new AbstractC0861i4.d(((C1024r7) this.f6905a.f4().getValue()).resolve(context, ((AbstractC0932m4.d) template).c(), data));
        }
        if (template instanceof AbstractC0932m4.c) {
            return new AbstractC0861i4.c(((J5.d) this.f6905a.m3().getValue()).resolve(context, ((AbstractC0932m4.c) template).c(), data));
        }
        throw new W1.m();
    }
}
