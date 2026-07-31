package O1;

import O1.AbstractC0775d8;
import O1.AbstractC0865i8;
import O1.AbstractC0972o8;
import O1.AbstractC1008q8;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.m8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0936m8 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7026a;

    public C0936m8(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7026a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC0775d8 resolve(ParsingContext context, AbstractC1008q8 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof AbstractC1008q8.d) {
            return new AbstractC0775d8.d(((AbstractC0972o8.d) this.f7026a.I4().getValue()).resolve(context, ((AbstractC1008q8.d) template).c(), data));
        }
        if (template instanceof AbstractC1008q8.c) {
            return new AbstractC0775d8.c(((AbstractC0865i8.d) this.f7026a.C4().getValue()).resolve(context, ((AbstractC1008q8.c) template).c(), data));
        }
        throw new W1.m();
    }
}
