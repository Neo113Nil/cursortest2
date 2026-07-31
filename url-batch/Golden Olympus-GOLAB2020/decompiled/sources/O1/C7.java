package O1;

import O1.AbstractC1078u7;
import O1.I7;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class C7 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f1580a;

    public C7(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f1580a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC1078u7 resolve(ParsingContext context, I7 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof I7.d) {
            return new AbstractC1078u7.d(((G7) this.f1580a.o4().getValue()).resolve(context, ((I7.d) template).c(), data));
        }
        if (template instanceof I7.c) {
            return new AbstractC1078u7.c(((C1150y7) this.f1580a.i4().getValue()).resolve(context, ((I7.c) template).c(), data));
        }
        throw new W1.m();
    }
}
