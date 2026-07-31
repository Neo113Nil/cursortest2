package O1;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class M2 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f3801a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final ListValidator f3802b = new ListValidator() { // from class: O1.L2
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            boolean b4;
            b4 = M2.b(list);
            return b4;
        }
    };

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3803a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3803a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public K2 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            List readList = JsonPropertyParser.readList(context, data, FirebaseAnalytics.Param.ITEMS, this.f3803a.w1(), M2.f3802b);
            Intrinsics.checkNotNullExpressionValue(readList, "readList(context, data, …yParser, ITEMS_VALIDATOR)");
            return new K2(readList);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, K2 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(context, jSONObject, FirebaseAnalytics.Param.ITEMS, value.f3372a, this.f3803a.w1());
            JsonPropertyParser.write(context, jSONObject, "type", "set");
            return jSONObject;
        }
    }

    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3804a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3804a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public N2 deserialize(ParsingContext context, N2 n22, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field field = n22 != null ? n22.f4082a : null;
            W1.h x12 = this.f3804a.x1();
            ListValidator listValidator = M2.f3802b;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readListField = JsonFieldParser.readListField(restrictPropertyOverride, data, FirebaseAnalytics.Param.ITEMS, allowPropertyOverride, field, x12, listValidator);
            Intrinsics.checkNotNullExpressionValue(readListField, "readListField(context, d…, ITEMS_VALIDATOR.cast())");
            return new N2(readListField);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, N2 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(context, jSONObject, FirebaseAnalytics.Param.ITEMS, value.f4082a, this.f3804a.x1());
            JsonPropertyParser.write(context, jSONObject, "type", "set");
            return jSONObject;
        }
    }

    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f3805a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f3805a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public K2 resolve(ParsingContext context, N2 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            List resolveList = JsonFieldResolver.resolveList(context, template.f4082a, data, FirebaseAnalytics.Param.ITEMS, this.f3805a.y1(), this.f3805a.w1(), M2.f3802b);
            Intrinsics.checkNotNullExpressionValue(resolveList, "resolveList(context, tem…yParser, ITEMS_VALIDATOR)");
            return new K2(resolveList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() >= 1;
    }
}
