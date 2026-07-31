package O1;

import O1.AbstractC0734b3;
import O1.G8;
import O1.Ma;
import O1.R6;
import O1.X2;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.a3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0716a3 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5623a;

    public C0716a3(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5623a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public X2 resolve(ParsingContext context, AbstractC0734b3 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        if (template instanceof AbstractC0734b3.d) {
            return new X2.d(((G8.d) this.f5623a.U4().getValue()).resolve(context, ((AbstractC0734b3.d) template).c(), data));
        }
        if (template instanceof AbstractC0734b3.f) {
            return new X2.f(((Ma.d) this.f5623a.k6().getValue()).resolve(context, ((AbstractC0734b3.f) template).c(), data));
        }
        if (template instanceof AbstractC0734b3.c) {
            return new X2.c(((R6.g) this.f5623a.T3().getValue()).resolve(context, ((AbstractC0734b3.c) template).c(), data));
        }
        if (template instanceof AbstractC0734b3.g) {
            return new X2.g(((C1173zc) this.f5623a.m7().getValue()).resolve(context, ((AbstractC0734b3.g) template).c(), data));
        }
        if (template instanceof AbstractC0734b3.e) {
            return new X2.e(((U8) this.f5623a.d5().getValue()).resolve(context, ((AbstractC0734b3.e) template).c(), data));
        }
        throw new W1.m();
    }
}
