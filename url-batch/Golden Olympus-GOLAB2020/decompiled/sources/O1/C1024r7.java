package O1;

import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.r7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1024r7 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7778a;

    public C1024r7(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7778a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0971o7 resolve(ParsingContext context, C1042s7 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        return new C0971o7();
    }
}
