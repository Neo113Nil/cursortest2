package O1;

import O1.AbstractC0985p3;
import O1.AbstractC1056t3;
import O1.AbstractC1092v3;
import O1.AbstractC1164z3;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.y3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1146y3 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8532a;

    public C1146y3(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8532a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC1092v3 resolve(ParsingContext context, AbstractC1164z3 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof AbstractC1164z3.d) {
            return new AbstractC1092v3.d(((AbstractC1056t3.d) this.f8532a.Q1().getValue()).resolve(context, ((AbstractC1164z3.d) template).c(), data));
        }
        if (template instanceof AbstractC1164z3.a) {
            return new AbstractC1092v3.a(((AbstractC0985p3.e) this.f8532a.N1().getValue()).resolve(context, ((AbstractC1164z3.a) template).c(), data));
        }
        throw new W1.m();
    }
}
