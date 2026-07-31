package O1;

import O1.C0757c8;
import O1.C1060t7;
import com.ironsource.b9;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.b8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0739b8 implements TemplateResolver {

    /* renamed from: a, reason: collision with root package name */
    private final Cg f5794a;

    public C0739b8(Cg component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f5794a = component;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1060t7.f resolve(ParsingContext context, C0757c8.c template, JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(data, "data");
        Expression resolveExpression = JsonFieldResolver.resolveExpression(context, template.f5942a, data, b9.h.f15459S, TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT);
        Intrinsics.checkNotNullExpressionValue(resolveExpression, "resolveExpression(contex…LOR, STRING_TO_COLOR_INT)");
        return new C1060t7.f(resolveExpression);
    }
}
