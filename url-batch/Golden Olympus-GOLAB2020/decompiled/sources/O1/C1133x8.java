package O1;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.x8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1133x8 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f8489a;

    public C1133x8(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f8489a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1079u8 resolve(ParsingContext context, C1151y8 template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        return new C1079u8((String) JsonFieldResolver.resolveOptional(context, template.f8636a, data, "height_variable_name"), (String) JsonFieldResolver.resolveOptional(context, template.f8637b, data, "width_variable_name"));
    }
}
