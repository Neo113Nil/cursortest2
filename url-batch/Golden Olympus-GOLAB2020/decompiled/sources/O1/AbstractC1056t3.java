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

/* renamed from: O1.t3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1056t3 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f7975a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final ListValidator f7976b = new ListValidator() { // from class: O1.s3
        @Override // com.yandex.div.internal.parser.ListValidator
        public final boolean isValid(List list) {
            boolean b4;
            b4 = AbstractC1056t3.b(list);
            return b4;
        }
    };

    /* renamed from: O1.t3$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: O1.t3$b */
    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7977a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7977a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1020r3 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            List readList = JsonPropertyParser.readList(context, data, FirebaseAnalytics.Param.ITEMS, this.f7977a.R1(), AbstractC1056t3.f7976b);
            Intrinsics.checkNotNullExpressionValue(readList, "readList(context, data, …yParser, ITEMS_VALIDATOR)");
            return new C1020r3(readList);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1020r3 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(context, jSONObject, FirebaseAnalytics.Param.ITEMS, value.f7757a, this.f7977a.R1());
            JsonPropertyParser.write(context, jSONObject, "type", "set");
            return jSONObject;
        }
    }

    /* renamed from: O1.t3$c */
    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7978a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7978a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1074u3 deserialize(ParsingContext context, C1074u3 c1074u3, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field field = c1074u3 != null ? c1074u3.f8135a : null;
            W1.h S12 = this.f7978a.S1();
            ListValidator listValidator = AbstractC1056t3.f7976b;
            Intrinsics.checkNotNull(listValidator, "null cannot be cast to non-null type com.yandex.div.internal.parser.ListValidator<T of com.yandex.div.internal.parser.ParsingValidatorsKt.cast>");
            Field readListField = JsonFieldParser.readListField(restrictPropertyOverride, data, FirebaseAnalytics.Param.ITEMS, allowPropertyOverride, field, S12, listValidator);
            Intrinsics.checkNotNullExpressionValue(readListField, "readListField(context, d…, ITEMS_VALIDATOR.cast())");
            return new C1074u3(readListField);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C1074u3 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(context, jSONObject, FirebaseAnalytics.Param.ITEMS, value.f8135a, this.f7978a.S1());
            JsonPropertyParser.write(context, jSONObject, "type", "set");
            return jSONObject;
        }
    }

    /* renamed from: O1.t3$d */
    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f7979a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f7979a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1020r3 resolve(ParsingContext context, C1074u3 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            List resolveList = JsonFieldResolver.resolveList(context, template.f8135a, data, FirebaseAnalytics.Param.ITEMS, this.f7979a.T1(), this.f7979a.R1(), AbstractC1056t3.f7976b);
            Intrinsics.checkNotNullExpressionValue(resolveList, "resolveList(context, tem…yParser, ITEMS_VALIDATOR)");
            return new C1020r3(resolveList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.size() >= 1;
    }
}
