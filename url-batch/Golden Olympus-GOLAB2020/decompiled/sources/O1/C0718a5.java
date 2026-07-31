package O1;

import O1.AbstractC0736b5;
import O1.X4;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.a5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0718a5 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5638a;

    public C0718a5(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5638a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public X4 resolve(ParsingContext context, AbstractC0736b5 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof AbstractC0736b5.c) {
            return new X4.c(((Rb) this.f5638a.R6().getValue()).resolve(context, ((AbstractC0736b5.c) template).c(), data));
        }
        throw new W1.m();
    }
}
