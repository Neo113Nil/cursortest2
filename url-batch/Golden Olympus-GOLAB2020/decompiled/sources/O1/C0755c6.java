package O1;

import O1.C0773d6;
import O1.W5;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.c6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0755c6 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5859a;

    public C0755c6(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5859a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public W5.c resolve(ParsingContext context, C0773d6.c template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Field field = template.f6019a;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new W5.c(JsonFieldResolver.resolveOptionalExpression(context, field, data, "down", typeHelper), JsonFieldResolver.resolveOptionalExpression(context, template.f6020b, data, "forward", typeHelper), JsonFieldResolver.resolveOptionalExpression(context, template.f6021c, data, "left", typeHelper), JsonFieldResolver.resolveOptionalExpression(context, template.f6022d, data, "right", typeHelper), JsonFieldResolver.resolveOptionalExpression(context, template.f6023e, data, "up", typeHelper));
    }
}
