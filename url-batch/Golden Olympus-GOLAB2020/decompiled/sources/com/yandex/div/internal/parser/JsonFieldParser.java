package com.yandex.div.internal.parser;

import W1.h;
import androidx.annotation.NonNull;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.serialization.ParsingContext;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class JsonFieldParser {
    private static final ValueValidator<String> IS_NOT_EMPTY = new ValueValidator() { // from class: G1.a
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return JsonFieldParser.a((String) obj);
        }
    };

    public static /* synthetic */ boolean a(String str) {
        return !str.isEmpty();
    }

    @NonNull
    public static <V> Field<V> readField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z4, Field<V> field) {
        return readField(parsingContext, jSONObject, str, z4, field, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> Field<Expression<V>> readFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z4, Field<Expression<V>> field) {
        return readFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z4, field, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> Field<List<V>> readListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z4, Field<List<V>> field, @NonNull h hVar) {
        try {
            return new Field.Value(z4, JsonPropertyParser.readList(parsingContext, jSONObject, str, hVar));
        } catch (ParsingException e4) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e4);
            Field<List<V>> referenceOrFallback = referenceOrFallback(z4, readReference(parsingContext, jSONObject, str), field);
            if (referenceOrFallback != null) {
                return referenceOrFallback;
            }
            throw e4;
        }
    }

    @NonNull
    public static <R, V> Field<ExpressionList<V>> readOptionalExpressionListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z4, Field<ExpressionList<V>> field, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator) {
        return readOptionalExpressionListField(parsingContext, jSONObject, str, typeHelper, z4, field, function1, listValidator, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> Field<V> readOptionalField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z4, Field<V> field) {
        return readOptionalField(parsingContext, jSONObject, str, z4, field, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> Field<Expression<V>> readOptionalFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z4, Field<Expression<V>> field) {
        return readOptionalFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z4, field, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <R, V> Field<List<V>> readOptionalListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z4, Field<List<V>> field, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator) {
        return readOptionalListField(parsingContext, jSONObject, str, z4, field, function1, listValidator, JsonParsers.alwaysValid());
    }

    public static String readReference(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        return (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, '$' + str, IS_NOT_EMPTY);
    }

    public static <V> Field<V> referenceOrFallback(boolean z4, String str, Field<V> field) {
        if (str != null) {
            return new Field.Reference(z4, str);
        }
        if (field != null) {
            return FieldKt.clone(field, z4);
        }
        if (z4) {
            return Field.Companion.nullField(z4);
        }
        return null;
    }

    public static <V> void writeExpressionField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, Field<Expression<V>> field) {
        writeExpressionField(parsingContext, jSONObject, str, field, JsonParsers.doNotConvert());
    }

    public static <R, V> void writeExpressionListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, Field<ExpressionList<V>> field, @NonNull Function1<V, R> function1) {
        if (field instanceof Field.Value) {
            JsonExpressionParser.writeExpressionList(parsingContext, jSONObject, str, (ExpressionList) ((Field.Value) field).value, function1);
        } else if (field instanceof Field.Reference) {
            JsonPropertyParser.write(parsingContext, jSONObject, "$" + str, ((Field.Reference) field).reference);
        }
    }

    public static <V> void writeField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, Field<V> field) {
        writeField(parsingContext, jSONObject, str, field, JsonParsers.doNotConvert());
    }

    public static <R, V> void writeListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, Field<List<V>> field, @NonNull Function1<V, R> function1) {
        if (field instanceof Field.Value) {
            JsonPropertyParser.writeList(parsingContext, jSONObject, str, (List) ((Field.Value) field).value, function1);
        } else if (field instanceof Field.Reference) {
            JsonPropertyParser.write(parsingContext, jSONObject, "$" + str, ((Field.Reference) field).reference);
        }
    }

    @NonNull
    public static <R, V> Field<V> readField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z4, Field<V> field, @NonNull Function1<R, V> function1) {
        return readField(parsingContext, jSONObject, str, z4, field, function1, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <R, V> Field<V> readOptionalField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z4, Field<V> field, @NonNull Function1<R, V> function1) {
        return readOptionalField(parsingContext, jSONObject, str, z4, field, function1, JsonParsers.alwaysValid());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, V> void writeExpressionField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, Field<Expression<V>> field, @NonNull Function1<V, R> function1) {
        if (field instanceof Field.Value) {
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, str, (Expression) ((Field.Value) field).value, function1);
        } else if (field instanceof Field.Reference) {
            JsonPropertyParser.write(parsingContext, jSONObject, "$" + str, ((Field.Reference) field).reference);
        }
    }

    public static <R, V> void writeField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, Field<V> field, @NonNull Function1<V, R> function1) {
        if (field instanceof Field.Value) {
            JsonPropertyParser.write(parsingContext, jSONObject, str, ((Field.Value) field).value, (Function1<T, R>) function1);
        } else if (field instanceof Field.Reference) {
            JsonPropertyParser.write(parsingContext, jSONObject, "$" + str, ((Field.Reference) field).reference);
        }
    }

    @NonNull
    public static <V> Field<V> readField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z4, Field<V> field, @NonNull ValueValidator<V> valueValidator) {
        return readField(parsingContext, jSONObject, str, z4, field, JsonParsers.doNotConvert(), valueValidator);
    }

    @NonNull
    public static <R, V> Field<Expression<V>> readFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z4, Field<Expression<V>> field, @NonNull Function1<R, V> function1) {
        return readFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z4, field, function1, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <R, V> Field<ExpressionList<V>> readOptionalExpressionListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z4, Field<ExpressionList<V>> field, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        ExpressionList readOptionalExpressionList = JsonExpressionParser.readOptionalExpressionList(parsingContext, jSONObject, str, typeHelper, function1, listValidator, valueValidator);
        if (readOptionalExpressionList != null) {
            return new Field.Value(z4, readOptionalExpressionList);
        }
        String readReference = readReference(parsingContext, jSONObject, str);
        if (readReference != null) {
            return new Field.Reference(z4, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z4);
        }
        return Field.Companion.nullField(z4);
    }

    @NonNull
    public static <R, V> Field<V> readOptionalField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z4, Field<V> field, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        Object readOptional = JsonPropertyParser.readOptional(parsingContext, jSONObject, str, function1, valueValidator);
        if (readOptional != null) {
            return new Field.Value(z4, readOptional);
        }
        String readReference = readReference(parsingContext, jSONObject, str);
        if (readReference != null) {
            return new Field.Reference(z4, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z4);
        }
        return Field.Companion.nullField(z4);
    }

    @NonNull
    public static <R, V> Field<Expression<V>> readOptionalFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z4, Field<Expression<V>> field, @NonNull Function1<R, V> function1) {
        return readOptionalFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z4, field, function1, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <R, V> Field<List<V>> readOptionalListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z4, Field<List<V>> field, @NonNull Function1<R, V> function1, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, str, function1, listValidator, valueValidator);
        if (readOptionalList != null) {
            return new Field.Value(z4, readOptionalList);
        }
        String readReference = readReference(parsingContext, jSONObject, str);
        if (readReference != null) {
            return new Field.Reference(z4, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z4);
        }
        return Field.Companion.nullField(z4);
    }

    @NonNull
    public static <R, V> Field<V> readField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z4, Field<V> field, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        try {
            return new Field.Value(z4, JsonPropertyParser.read(parsingContext, jSONObject, str, function1, valueValidator));
        } catch (ParsingException e4) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e4);
            Field<V> referenceOrFallback = referenceOrFallback(z4, readReference(parsingContext, jSONObject, str), field);
            if (referenceOrFallback != null) {
                return referenceOrFallback;
            }
            throw e4;
        }
    }

    @NonNull
    public static <V> Field<Expression<V>> readFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z4, Field<Expression<V>> field, @NonNull ValueValidator<V> valueValidator) {
        return readFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z4, field, JsonParsers.doNotConvert(), valueValidator);
    }

    @NonNull
    public static <V> Field<Expression<V>> readOptionalFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z4, Field<Expression<V>> field, @NonNull ValueValidator<V> valueValidator) {
        return readOptionalFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z4, field, JsonParsers.doNotConvert(), valueValidator);
    }

    public static <V> void writeListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, Field<List<V>> field, @NonNull h hVar) {
        if (field instanceof Field.Value) {
            JsonPropertyParser.writeList(parsingContext, jSONObject, str, (List) ((Field.Value) field).value, hVar);
        } else if (field instanceof Field.Reference) {
            JsonPropertyParser.write(parsingContext, jSONObject, "$" + str, ((Field.Reference) field).reference);
        }
    }

    public static <V> void writeField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, Field<V> field, @NonNull h hVar) {
        if (field instanceof Field.Value) {
            JsonPropertyParser.write(parsingContext, jSONObject, str, ((Field.Value) field).value, hVar);
        } else if (field instanceof Field.Reference) {
            JsonPropertyParser.write(parsingContext, jSONObject, "$" + str, ((Field.Reference) field).reference);
        }
    }

    @NonNull
    public static <R, V> Field<Expression<V>> readFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z4, Field<Expression<V>> field, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        try {
            return new Field.Value(z4, JsonExpressionParser.readExpression(parsingContext, jSONObject, str, typeHelper, function1, valueValidator));
        } catch (ParsingException e4) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e4);
            Field<Expression<V>> referenceOrFallback = referenceOrFallback(z4, readReference(parsingContext, jSONObject, str), field);
            if (referenceOrFallback != null) {
                return referenceOrFallback;
            }
            throw e4;
        }
    }

    @NonNull
    public static <V> Field<List<V>> readListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z4, Field<List<V>> field, @NonNull h hVar, @NonNull ListValidator<V> listValidator) {
        try {
            return new Field.Value(z4, JsonPropertyParser.readList(parsingContext, jSONObject, str, hVar, listValidator));
        } catch (ParsingException e4) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e4);
            Field<List<V>> referenceOrFallback = referenceOrFallback(z4, readReference(parsingContext, jSONObject, str), field);
            if (referenceOrFallback != null) {
                return referenceOrFallback;
            }
            throw e4;
        }
    }

    @NonNull
    public static <R, V> Field<Expression<V>> readOptionalFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z4, Field<Expression<V>> field, @NonNull Function1<R, V> function1, @NonNull ValueValidator<V> valueValidator) {
        Expression readOptionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, str, typeHelper, function1, valueValidator, null);
        if (readOptionalExpression != null) {
            return new Field.Value(z4, readOptionalExpression);
        }
        String readReference = readReference(parsingContext, jSONObject, str);
        if (readReference != null) {
            return new Field.Reference(z4, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z4);
        }
        return Field.Companion.nullField(z4);
    }

    @NonNull
    public static <V> Field<V> readOptionalField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z4, Field<V> field, @NonNull h hVar) {
        Object readOptional = JsonPropertyParser.readOptional(parsingContext, jSONObject, str, hVar);
        if (readOptional != null) {
            return new Field.Value(z4, readOptional);
        }
        String readReference = readReference(parsingContext, jSONObject, str);
        if (readReference != null) {
            return new Field.Reference(z4, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z4);
        }
        return Field.Companion.nullField(z4);
    }

    @NonNull
    public static <V> Field<List<V>> readOptionalListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z4, Field<List<V>> field, @NonNull h hVar) {
        List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, str, hVar);
        if (readOptionalList != null) {
            return new Field.Value(z4, readOptionalList);
        }
        String readReference = readReference(parsingContext, jSONObject, str);
        if (readReference != null) {
            return new Field.Reference(z4, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z4);
        }
        return Field.Companion.nullField(z4);
    }

    @NonNull
    public static <V> Field<V> readField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z4, Field<V> field, @NonNull h hVar) {
        try {
            return new Field.Value(z4, JsonPropertyParser.read(parsingContext, jSONObject, str, hVar));
        } catch (ParsingException e4) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e4);
            Field<V> referenceOrFallback = referenceOrFallback(z4, readReference(parsingContext, jSONObject, str), field);
            if (referenceOrFallback != null) {
                return referenceOrFallback;
            }
            throw e4;
        }
    }

    @NonNull
    public static <V> Field<List<V>> readOptionalListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z4, Field<List<V>> field, @NonNull h hVar, @NonNull ListValidator<V> listValidator) {
        List readOptionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, str, hVar, listValidator);
        if (readOptionalList != null) {
            return new Field.Value(z4, readOptionalList);
        }
        String readReference = readReference(parsingContext, jSONObject, str);
        if (readReference != null) {
            return new Field.Reference(z4, readReference);
        }
        if (field != null) {
            return FieldKt.clone(field, z4);
        }
        return Field.Companion.nullField(z4);
    }
}
