package O1;

import O1.AbstractC1086uf;
import O1.AbstractC1158yf;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.xf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1140xf implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8499a;

    public C1140xf(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8499a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC1086uf resolve(ParsingContext context, AbstractC1158yf template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof AbstractC1158yf.i) {
            return new AbstractC1086uf.i(((ah) this.f8499a.Z9().getValue()).resolve(context, ((AbstractC1158yf.i) template).c(), data));
        }
        if (template instanceof AbstractC1158yf.g) {
            return new AbstractC1086uf.g(((C1105vg) this.f8499a.H9().getValue()).resolve(context, ((AbstractC1158yf.g) template).c(), data));
        }
        if (template instanceof AbstractC1158yf.h) {
            return new AbstractC1086uf.h(((Gg) this.f8499a.N9().getValue()).resolve(context, ((AbstractC1158yf.h) template).c(), data));
        }
        if (template instanceof AbstractC1158yf.c) {
            return new AbstractC1086uf.c(((C1124x) this.f8499a.o().getValue()).resolve(context, ((AbstractC1158yf.c) template).c(), data));
        }
        if (template instanceof AbstractC1158yf.b) {
            return new AbstractC1086uf.b(((C0945n) this.f8499a.i().getValue()).resolve(context, ((AbstractC1158yf.b) template).c(), data));
        }
        if (template instanceof AbstractC1158yf.j) {
            return new AbstractC1086uf.j(((kh) this.f8499a.fa().getValue()).resolve(context, ((AbstractC1158yf.j) template).c(), data));
        }
        if (template instanceof AbstractC1158yf.f) {
            return new AbstractC1086uf.f(((S) this.f8499a.A().getValue()).resolve(context, ((AbstractC1158yf.f) template).c(), data));
        }
        if (template instanceof AbstractC1158yf.a) {
            return new AbstractC1086uf.a(((C0766d) this.f8499a.c().getValue()).resolve(context, ((AbstractC1158yf.a) template).c(), data));
        }
        throw new W1.m();
    }
}
