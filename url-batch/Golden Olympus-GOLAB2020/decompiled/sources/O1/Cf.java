package O1;

import O1.AbstractC1176zf;
import O1.Df;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Cf implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f1601a;

    public Cf(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f1601a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC1176zf resolve(ParsingContext context, Df template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof Df.i) {
            return new AbstractC1176zf.i(((fh) this.f1601a.ca().getValue()).resolve(context, ((Df.i) template).c(), data));
        }
        if (template instanceof Df.h) {
            return new AbstractC1176zf.h(((Lg) this.f1601a.Q9().getValue()).resolve(context, ((Df.h) template).c(), data));
        }
        if (template instanceof Df.g) {
            return new AbstractC1176zf.g(((Ag) this.f1601a.K9().getValue()).resolve(context, ((Df.g) template).c(), data));
        }
        if (template instanceof Df.b) {
            return new AbstractC1176zf.b(((C1034s) this.f1601a.l().getValue()).resolve(context, ((Df.b) template).c(), data));
        }
        if (template instanceof Df.c) {
            return new AbstractC1176zf.c(((C) this.f1601a.r().getValue()).resolve(context, ((Df.c) template).c(), data));
        }
        if (template instanceof Df.j) {
            return new AbstractC1176zf.j(((ph) this.f1601a.ia().getValue()).resolve(context, ((Df.j) template).c(), data));
        }
        if (template instanceof Df.f) {
            return new AbstractC1176zf.f(((X) this.f1601a.D().getValue()).resolve(context, ((Df.f) template).c(), data));
        }
        if (template instanceof Df.a) {
            return new AbstractC1176zf.a(((C0856i) this.f1601a.f().getValue()).resolve(context, ((Df.a) template).c(), data));
        }
        throw new W1.m();
    }
}
