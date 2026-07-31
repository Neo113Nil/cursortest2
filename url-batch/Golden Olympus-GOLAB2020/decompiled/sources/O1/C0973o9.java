package O1;

import O1.AbstractC0919l9;
import O1.AbstractC1080u9;
import O1.B9;
import O1.D9;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.o9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0973o9 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7364a;

    public C0973o9(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7364a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0919l9 resolve(ParsingContext context, D9 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof D9.d) {
            return new AbstractC0919l9.d(((B9.e) this.f7364a.v5().getValue()).resolve(context, ((D9.d) template).c(), data));
        }
        if (template instanceof D9.c) {
            return new AbstractC0919l9.c(((AbstractC1080u9.e) this.f7364a.s5().getValue()).resolve(context, ((D9.c) template).c(), data));
        }
        throw new W1.m();
    }
}
