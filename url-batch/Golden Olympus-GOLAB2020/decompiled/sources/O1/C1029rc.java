package O1;

import O1.C0886jc;
import O1.C1047sc;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.rc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1029rc implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f7781a;

    public C1029rc(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f7781a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0886jc.c resolve(ParsingContext context, C1047sc.c template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Field field = template.f7919a;
        TypeHelper<Long> typeHelper = TypeHelpersKt.TYPE_HELPER_INT;
        Function1<Number, Long> function1 = ParsingConvertersKt.NUMBER_TO_INT;
        return new C0886jc.c(JsonFieldResolver.resolveOptionalExpression(context, field, data, "end", typeHelper, function1), (C0754c5) JsonFieldResolver.resolveOptional(context, template.f7920b, data, "margins", this.f7781a.X2(), this.f7781a.V2()), JsonFieldResolver.resolveOptionalExpression(context, template.f7921c, data, "start", typeHelper, function1), (X4) JsonFieldResolver.resolveOptional(context, template.f7922d, data, "track_active_style", this.f7781a.U2(), this.f7781a.S2()), (X4) JsonFieldResolver.resolveOptional(context, template.f7923e, data, "track_inactive_style", this.f7781a.U2(), this.f7781a.S2()));
    }
}
