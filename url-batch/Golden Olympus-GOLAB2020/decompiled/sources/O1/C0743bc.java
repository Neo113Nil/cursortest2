package O1;

import O1.AbstractC0761cc;
import O1.K8;
import O1.U5;
import O1.Yb;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.bc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0743bc implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5815a;

    public C0743bc(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5815a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Yb resolve(ParsingContext context, AbstractC0761cc template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof AbstractC0761cc.c) {
            return new Yb.c(((U5.e) this.f5815a.v3().getValue()).resolve(context, ((AbstractC0761cc.c) template).c(), data));
        }
        if (template instanceof AbstractC0761cc.d) {
            return new Yb.d(((K8.d) this.f5815a.X4().getValue()).resolve(context, ((AbstractC0761cc.d) template).c(), data));
        }
        if (template instanceof AbstractC0761cc.e) {
            return new Yb.e(((C0855hg) this.f5815a.y9().getValue()).resolve(context, ((AbstractC0761cc.e) template).c(), data));
        }
        throw new W1.m();
    }
}
