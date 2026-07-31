package O1;

import O1.C0765cg;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.hg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0855hg implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f6415a;

    public C0855hg(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f6415a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0765cg resolve(ParsingContext context, C0872ig template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        return new C0765cg(JsonFieldResolver.resolveOptionalExpression(context, template.f6514a, data, "constrained", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN), (C0765cg.c) JsonFieldResolver.resolveOptional(context, template.f6515b, data, "max_size", this.f6415a.v9(), this.f6415a.t9()), (C0765cg.c) JsonFieldResolver.resolveOptional(context, template.f6516c, data, "min_size", this.f6415a.v9(), this.f6415a.t9()));
    }
}
