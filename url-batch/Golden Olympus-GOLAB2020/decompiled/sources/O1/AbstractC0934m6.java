package O1;

import com.ironsource.b9;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingValidatorsKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div.serialization.TemplateResolver;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: O1.m6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0934m6 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f6992a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final ValueValidator f6993b = new ValueValidator() { // from class: O1.l6
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            boolean b4;
            b4 = AbstractC0934m6.b((String) obj);
            return b4;
        }
    };

    /* renamed from: O1.m6$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: O1.m6$b */
    public static final class b implements Serializer, Deserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6994a;

        public b(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6994a = component;
        }

        @Override // com.yandex.div.serialization.Deserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0809f6 deserialize(ParsingContext context, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            List readList = JsonPropertyParser.readList(context, data, "arguments", this.f6994a.C3());
            Intrinsics.checkNotNullExpressionValue(readList, "readList(context, data, …ArgumentJsonEntityParser)");
            Object read = JsonPropertyParser.read(context, data, b9.h.f15438E0);
            Intrinsics.checkNotNullExpressionValue(read, "read(context, data, \"body\")");
            Object read2 = JsonPropertyParser.read(context, data, "name", (ValueValidator<Object>) AbstractC0934m6.f6993b);
            Intrinsics.checkNotNullExpressionValue(read2, "read(context, data, \"name\", NAME_VALIDATOR)");
            Object read3 = JsonPropertyParser.read(context, data, "return_type", (Function1<R, Object>) EnumC0915l5.f6908e);
            Intrinsics.checkNotNullExpressionValue(read3, "read(context, data, \"ret…valuableType.FROM_STRING)");
            return new C0809f6(readList, (String) read, (String) read2, (EnumC0915l5) read3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0809f6 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonPropertyParser.writeList(context, jSONObject, "arguments", value.f6175a, this.f6994a.C3());
            JsonPropertyParser.write(context, jSONObject, b9.h.f15438E0, value.f6176b);
            JsonPropertyParser.write(context, jSONObject, "name", value.f6177c);
            JsonPropertyParser.write(context, jSONObject, "return_type", value.f6178d, (Function1<EnumC0915l5, R>) EnumC0915l5.f6907d);
            return jSONObject;
        }
    }

    /* renamed from: O1.m6$c */
    public static final class c implements Serializer, TemplateDeserializer {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6995a;

        public c(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6995a = component;
        }

        @Override // com.yandex.div.serialization.TemplateDeserializer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0952n6 deserialize(ParsingContext context, C0952n6 c0952n6, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            boolean allowPropertyOverride = context.getAllowPropertyOverride();
            ParsingContext restrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(context);
            Field readListField = JsonFieldParser.readListField(restrictPropertyOverride, data, "arguments", allowPropertyOverride, c0952n6 != null ? c0952n6.f7151a : null, this.f6995a.D3());
            Intrinsics.checkNotNullExpressionValue(readListField, "readListField(context, d…gumentJsonTemplateParser)");
            Field readField = JsonFieldParser.readField(restrictPropertyOverride, data, b9.h.f15438E0, allowPropertyOverride, c0952n6 != null ? c0952n6.f7152b : null);
            Intrinsics.checkNotNullExpressionValue(readField, "readField(context, data,…owOverride, parent?.body)");
            Field readField2 = JsonFieldParser.readField(restrictPropertyOverride, data, "name", allowPropertyOverride, c0952n6 != null ? c0952n6.f7153c : null, AbstractC0934m6.f6993b);
            Intrinsics.checkNotNullExpressionValue(readField2, "readField(context, data,…nt?.name, NAME_VALIDATOR)");
            Field readField3 = JsonFieldParser.readField(restrictPropertyOverride, data, "return_type", allowPropertyOverride, c0952n6 != null ? c0952n6.f7154d : null, EnumC0915l5.f6908e);
            Intrinsics.checkNotNullExpressionValue(readField3, "readField(context, data,…valuableType.FROM_STRING)");
            return new C0952n6(readListField, readField, readField2, readField3);
        }

        @Override // com.yandex.div.serialization.Serializer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject serialize(ParsingContext context, C0952n6 value) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONObject jSONObject = new JSONObject();
            JsonFieldParser.writeListField(context, jSONObject, "arguments", value.f7151a, this.f6995a.D3());
            JsonFieldParser.writeField(context, jSONObject, b9.h.f15438E0, value.f7152b);
            JsonFieldParser.writeField(context, jSONObject, "name", value.f7153c);
            JsonFieldParser.writeField(context, jSONObject, "return_type", value.f7154d, EnumC0915l5.f6907d);
            return jSONObject;
        }
    }

    /* renamed from: O1.m6$d */
    public static final class d implements TemplateResolver {

        /* renamed from: a, reason: collision with root package name */
        private final Cg f6996a;

        public d(Cg component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.f6996a = component;
        }

        @Override // com.yandex.div.serialization.TemplateResolver
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0809f6 resolve(ParsingContext context, C0952n6 template, JSONObject data) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(data, "data");
            List resolveList = JsonFieldResolver.resolveList(context, template.f7151a, data, "arguments", this.f6996a.E3(), this.f6996a.C3());
            Intrinsics.checkNotNullExpressionValue(resolveList, "resolveList(context, tem…ArgumentJsonEntityParser)");
            Object resolve = JsonFieldResolver.resolve(context, template.f7152b, data, b9.h.f15438E0);
            Intrinsics.checkNotNullExpressionValue(resolve, "resolve(context, template.body, data, \"body\")");
            Object resolve2 = JsonFieldResolver.resolve(context, (Field<Object>) template.f7153c, data, "name", (ValueValidator<Object>) AbstractC0934m6.f6993b);
            Intrinsics.checkNotNullExpressionValue(resolve2, "resolve(context, templat…, \"name\", NAME_VALIDATOR)");
            Object resolve3 = JsonFieldResolver.resolve(context, (Field<Object>) template.f7154d, data, "return_type", (Function1<R, Object>) EnumC0915l5.f6908e);
            Intrinsics.checkNotNullExpressionValue(resolve3, "resolve(context, templat…valuableType.FROM_STRING)");
            return new C0809f6(resolveList, (String) resolve, (String) resolve2, (EnumC0915l5) resolve3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ParsingValidatorsKt.doesMatch(it, "^[a-zA-Z_][a-zA-Z0-9_]*$");
    }
}
