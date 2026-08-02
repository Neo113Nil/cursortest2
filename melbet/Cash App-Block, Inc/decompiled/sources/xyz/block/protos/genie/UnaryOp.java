package xyz.block.protos.genie;

import androidx.camera.core.impl.CameraCaptureCallbacks;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.sequences.GeneratorSequence$iterator$1;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.ByteString;
import squareup.cash.savings.GoalFolder;
import xyz.block.genie.expressions.EvaluatedValue;
import xyz.block.genie.expressions.ExpressionError;
import xyz.block.genie.expressions.GenieViewStateAdapter;
import xyz.block.genie.expressions.StringTemplateTokensKt;
import xyz.block.genie.expressions.UnresolvedTemplateTokensException;
import xyz.block.genie.expressions.ValueConversionsKt;
import xyz.block.genie.expressions.core.ExpressionEvaluator$EmptyKeyPathException;
import xyz.block.genie.expressions.core.ExpressionEvaluator$MaxDepthExceededException;
import xyz.block.genie.expressions.core.ExpressionEvaluator$MissingExpressionException;
import xyz.block.genie.expressions.core.ExpressionEvaluator$TypeMismatchException;
import xyz.block.genie.expressions.core.ExpressionEvaluator$UnsupportedOperatorException;
import xyz.block.genie.expressions.core.ExpressionEvaluator$evaluateBinary$1;
import xyz.block.genie.expressions.core.ExpressionEvaluator$evaluateBinary$2;
import xyz.block.genie.expressions.core.ExpressionEvaluator$evaluateBinary$3;
import xyz.block.genie.expressions.core.ExpressionEvaluator$evaluateBinary$4;
import xyz.block.genie.expressions.core.ExpressionEvaluator$evaluateBinary$5;
import xyz.block.genie.expressions.core.ExpressionEvaluator$evaluateBinary$6;
import xyz.block.genie.state.GenieScopedViewState;
import xyz.block.genie.state.GenieStateValue;
import xyz.block.genie.state.GenieViewState;
import xyz.block.protos.genie.BinaryOp;
import xyz.block.protos.genie.Collection;
import xyz.block.protos.genie.CollectionMutation;
import xyz.block.protos.genie.CreateSessionResponse;
import xyz.block.protos.genie.FormatStringOp;
import xyz.block.protos.genie.GetSceneResponse;
import xyz.block.protos.genie.IdValue;
import xyz.block.protos.genie.KeyPath;
import xyz.block.protos.genie.KeyValueMap;
import xyz.block.protos.genie.Navigate;
import xyz.block.protos.genie.ViewPlan;

/* loaded from: classes10.dex */
public final class UnaryOp extends Message {
    public static final ProtoAdapter ADAPTER = new UnaryOp$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UnaryOp.class), "type.googleapis.com/xyz.block.genie.v1.UnaryOp", Syntax.PROTO_2, null, "xyz/block/genie/v1/expression.proto");
    public final Expression operand;
    public final Operator operator_;

    public enum Operator implements WireEnum {
        OPERATOR_UNSPECIFIED(0),
        OPERATOR_NOT(1),
        OPERATOR_IS_EMPTY(2),
        OPERATOR_LENGTH(3),
        OPERATOR_NEGATE(4);

        public static final UnaryOp$Operator$Companion$ADAPTER$1 ADAPTER;
        public static final Companion Companion;
        public final int value;

        public final class Companion {
            public static EvaluatedValue arith(EvaluatedValue evaluatedValue, EvaluatedValue evaluatedValue2, Function2 function2, Function2 function22) {
                boolean z = evaluatedValue instanceof EvaluatedValue.IntValue;
                if (z && (evaluatedValue2 instanceof EvaluatedValue.IntValue)) {
                    return new EvaluatedValue.IntValue(((Number) function22.invoke(Long.valueOf(((EvaluatedValue.IntValue) evaluatedValue).value), Long.valueOf(((EvaluatedValue.IntValue) evaluatedValue2).value))).longValue());
                }
                boolean z2 = evaluatedValue instanceof EvaluatedValue.FloatValue;
                if (z2 && (evaluatedValue2 instanceof EvaluatedValue.FloatValue)) {
                    return new EvaluatedValue.FloatValue(((Number) function2.invoke(Double.valueOf(((EvaluatedValue.FloatValue) evaluatedValue).value), Double.valueOf(((EvaluatedValue.FloatValue) evaluatedValue2).value))).doubleValue());
                }
                if (z && (evaluatedValue2 instanceof EvaluatedValue.FloatValue)) {
                    return new EvaluatedValue.FloatValue(((Number) function2.invoke(Double.valueOf(((EvaluatedValue.IntValue) evaluatedValue).value), Double.valueOf(((EvaluatedValue.FloatValue) evaluatedValue2).value))).doubleValue());
                }
                if (z2 && (evaluatedValue2 instanceof EvaluatedValue.IntValue)) {
                    return new EvaluatedValue.FloatValue(((Number) function2.invoke(Double.valueOf(((EvaluatedValue.FloatValue) evaluatedValue).value), Double.valueOf(((EvaluatedValue.IntValue) evaluatedValue2).value))).doubleValue());
                }
                if (z || z2) {
                    evaluatedValue = evaluatedValue2;
                }
                throw new ExpressionEvaluator$TypeMismatchException("numeric", evaluatedValue);
            }

            public static boolean boolOf(EvaluatedValue evaluatedValue) {
                if (evaluatedValue instanceof EvaluatedValue.BoolValue) {
                    return ((EvaluatedValue.BoolValue) evaluatedValue).value;
                }
                throw new ExpressionEvaluator$TypeMismatchException("bool", evaluatedValue);
            }

            public static EvaluatedValue evaluate(Expression expression, GenieViewStateAdapter genieViewStateAdapter, int i) {
                int i2;
                String base64;
                GenieViewState genieViewState = genieViewStateAdapter.state;
                if (i > 64) {
                    throw new ExpressionEvaluator$MaxDepthExceededException("Expression exceeded max depth 64");
                }
                String str = expression.string_literal;
                if (str != null) {
                    return new EvaluatedValue.StringValue(str);
                }
                Long l = expression.int_literal;
                if (l != null) {
                    return new EvaluatedValue.IntValue(l.longValue());
                }
                Double d = expression.float_literal;
                if (d != null) {
                    return new EvaluatedValue.FloatValue(d.doubleValue());
                }
                Boolean bool = expression.bool_literal;
                if (bool != null) {
                    return new EvaluatedValue.BoolValue(bool.booleanValue());
                }
                ByteString byteString = expression.blob_literal;
                if (byteString != null) {
                    return new EvaluatedValue.BlobValue(byteString);
                }
                KeyPath keyPath = expression.key_path_ref;
                if (keyPath != null) {
                    List list = keyPath.segments;
                    if (list.isEmpty()) {
                        throw new ExpressionEvaluator$EmptyKeyPathException("key_path_ref segments must not be empty");
                    }
                    GenieStateValue value = genieViewState.value(list);
                    if (value != null) {
                        return ValueConversionsKt.toEvaluatedValue(value);
                    }
                    throw new ExpressionError.UnresolvedKeyPath(list);
                }
                UnaryOp unaryOp = expression.unary_op;
                int i3 = 1;
                if (unaryOp != null) {
                    Operator operator = unaryOp.operator_;
                    if (operator == Operator.OPERATOR_UNSPECIFIED) {
                        throw new ExpressionEvaluator$UnsupportedOperatorException("Unsupported operator: ".concat("UnaryOp.OPERATOR_UNSPECIFIED"));
                    }
                    EvaluatedValue evaluate = evaluate(unaryOp.operand, genieViewStateAdapter, i + 1);
                    if (!(evaluate instanceof EvaluatedValue.Unresolved)) {
                        int ordinal = operator.ordinal();
                        if (ordinal == 0) {
                            a$$ExternalSyntheticBUOutline0.m$1("Handled above");
                            return null;
                        }
                        if (ordinal == 1) {
                            return new EvaluatedValue.BoolValue(!boolOf(evaluate));
                        }
                        if (ordinal == 2) {
                            if (evaluate instanceof EvaluatedValue.StringValue) {
                                return new EvaluatedValue.BoolValue(((EvaluatedValue.StringValue) evaluate).value.length() == 0);
                            }
                            if (evaluate instanceof EvaluatedValue.CollectionValue) {
                                return new EvaluatedValue.BoolValue(((EvaluatedValue.CollectionValue) evaluate).items.isEmpty());
                            }
                            if (evaluate instanceof EvaluatedValue.BlobValue) {
                                return new EvaluatedValue.BoolValue(Intrinsics.areEqual(((EvaluatedValue.BlobValue) evaluate).value, ByteString.EMPTY));
                            }
                            throw new ExpressionEvaluator$TypeMismatchException("string, collection, or blob", evaluate);
                        }
                        if (ordinal == 3) {
                            if (evaluate instanceof EvaluatedValue.StringValue) {
                                return new EvaluatedValue.IntValue(((EvaluatedValue.StringValue) evaluate).value.length());
                            }
                            if (evaluate instanceof EvaluatedValue.CollectionValue) {
                                return new EvaluatedValue.IntValue(((EvaluatedValue.CollectionValue) evaluate).items.size());
                            }
                            if (evaluate instanceof EvaluatedValue.BlobValue) {
                                return new EvaluatedValue.IntValue(((EvaluatedValue.BlobValue) evaluate).value.getSize$okio());
                            }
                            throw new ExpressionEvaluator$TypeMismatchException("string, collection, or blob", evaluate);
                        }
                        if (ordinal != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        if (evaluate instanceof EvaluatedValue.IntValue) {
                            return new EvaluatedValue.IntValue(-((EvaluatedValue.IntValue) evaluate).value);
                        }
                        if (evaluate instanceof EvaluatedValue.FloatValue) {
                            return new EvaluatedValue.FloatValue(-((EvaluatedValue.FloatValue) evaluate).value);
                        }
                        throw new ExpressionEvaluator$TypeMismatchException("numeric", evaluate);
                    }
                } else {
                    BinaryOp binaryOp = expression.binary_op;
                    if (binaryOp != null) {
                        BinaryOp.Operator operator2 = binaryOp.operator_;
                        Expression expression2 = binaryOp.left;
                        Expression expression3 = binaryOp.right;
                        if (operator2 == BinaryOp.Operator.OPERATOR_UNSPECIFIED) {
                            throw new ExpressionEvaluator$UnsupportedOperatorException("Unsupported operator: ".concat("BinaryOp.OPERATOR_UNSPECIFIED"));
                        }
                        int ordinal2 = operator2.ordinal();
                        if (ordinal2 == 1) {
                            int i4 = i + 1;
                            EvaluatedValue evaluate2 = evaluate(expression2, genieViewStateAdapter, i4);
                            if (!(evaluate2 instanceof EvaluatedValue.Unresolved)) {
                                if (!boolOf(evaluate2)) {
                                    return new EvaluatedValue.BoolValue(false);
                                }
                                EvaluatedValue evaluate3 = evaluate(expression3, genieViewStateAdapter, i4);
                                if (!(evaluate3 instanceof EvaluatedValue.Unresolved)) {
                                    return new EvaluatedValue.BoolValue(boolOf(evaluate3));
                                }
                            }
                        } else if (ordinal2 != 2) {
                            int i5 = i + 1;
                            EvaluatedValue evaluate4 = evaluate(expression2, genieViewStateAdapter, i5);
                            EvaluatedValue evaluate5 = evaluate(expression3, genieViewStateAdapter, i5);
                            if (!(evaluate4 instanceof EvaluatedValue.Unresolved) && !(evaluate5 instanceof EvaluatedValue.Unresolved)) {
                                switch (operator2) {
                                    case OPERATOR_UNSPECIFIED:
                                        a$$ExternalSyntheticBUOutline0.m$1("Handled above");
                                        return null;
                                    case OPERATOR_AND:
                                    case OPERATOR_OR:
                                        a$$ExternalSyntheticBUOutline0.m$1("Handled above");
                                        return null;
                                    case OPERATOR_EQUAL:
                                        return new EvaluatedValue.BoolValue(Intrinsics.areEqual(evaluate4, evaluate5));
                                    case OPERATOR_NOT_EQUAL:
                                        return new EvaluatedValue.BoolValue(!Intrinsics.areEqual(evaluate4, evaluate5));
                                    case OPERATOR_LESS_THAN:
                                        return new EvaluatedValue.BoolValue(numericOf(evaluate4) < numericOf(evaluate5));
                                    case OPERATOR_GREATER_THAN:
                                        return new EvaluatedValue.BoolValue(numericOf(evaluate4) > numericOf(evaluate5));
                                    case OPERATOR_ADD:
                                        return arith(evaluate4, evaluate5, ExpressionEvaluator$evaluateBinary$1.INSTANCE, ExpressionEvaluator$evaluateBinary$2.INSTANCE);
                                    case OPERATOR_SUBTRACT:
                                        return arith(evaluate4, evaluate5, ExpressionEvaluator$evaluateBinary$3.INSTANCE, ExpressionEvaluator$evaluateBinary$4.INSTANCE);
                                    case OPERATOR_MULTIPLY:
                                        return arith(evaluate4, evaluate5, ExpressionEvaluator$evaluateBinary$5.INSTANCE, ExpressionEvaluator$evaluateBinary$6.INSTANCE);
                                    case OPERATOR_DIVIDE:
                                        boolean z = evaluate4 instanceof EvaluatedValue.IntValue;
                                        if (z && (evaluate5 instanceof EvaluatedValue.IntValue)) {
                                            long j = ((EvaluatedValue.IntValue) evaluate5).value;
                                            if (j != 0) {
                                                return new EvaluatedValue.IntValue(((EvaluatedValue.IntValue) evaluate4).value / j);
                                            }
                                            throw new RuntimeException() { // from class: xyz.block.genie.expressions.core.ExpressionEvaluator$DivisionByZeroException
                                            };
                                        }
                                        boolean z2 = evaluate4 instanceof EvaluatedValue.FloatValue;
                                        if (z2 && (evaluate5 instanceof EvaluatedValue.FloatValue)) {
                                            double d2 = ((EvaluatedValue.FloatValue) evaluate5).value;
                                            if (d2 != 0.0d) {
                                                return new EvaluatedValue.FloatValue(((EvaluatedValue.FloatValue) evaluate4).value / d2);
                                            }
                                            throw new RuntimeException() { // from class: xyz.block.genie.expressions.core.ExpressionEvaluator$DivisionByZeroException
                                            };
                                        }
                                        if (z && (evaluate5 instanceof EvaluatedValue.FloatValue)) {
                                            double d3 = ((EvaluatedValue.FloatValue) evaluate5).value;
                                            if (d3 != 0.0d) {
                                                return new EvaluatedValue.FloatValue(((EvaluatedValue.IntValue) evaluate4).value / d3);
                                            }
                                            throw new RuntimeException() { // from class: xyz.block.genie.expressions.core.ExpressionEvaluator$DivisionByZeroException
                                            };
                                        }
                                        if (z2 && (evaluate5 instanceof EvaluatedValue.IntValue)) {
                                            long j2 = ((EvaluatedValue.IntValue) evaluate5).value;
                                            if (j2 != 0) {
                                                return new EvaluatedValue.FloatValue(((EvaluatedValue.FloatValue) evaluate4).value / j2);
                                            }
                                            throw new RuntimeException() { // from class: xyz.block.genie.expressions.core.ExpressionEvaluator$DivisionByZeroException
                                            };
                                        }
                                        if (z || z2) {
                                            evaluate4 = evaluate5;
                                        }
                                        throw new ExpressionEvaluator$TypeMismatchException("numeric", evaluate4);
                                    case OPERATOR_CONCAT:
                                        boolean z3 = evaluate4 instanceof EvaluatedValue.StringValue;
                                        if (z3 && (evaluate5 instanceof EvaluatedValue.StringValue)) {
                                            return new EvaluatedValue.StringValue(Recorder$$ExternalSyntheticOutline2.m$1(((EvaluatedValue.StringValue) evaluate4).value, ((EvaluatedValue.StringValue) evaluate5).value));
                                        }
                                        boolean z4 = evaluate4 instanceof EvaluatedValue.BlobValue;
                                        if (z4 && (evaluate5 instanceof EvaluatedValue.BlobValue)) {
                                            Buffer buffer = new Buffer();
                                            buffer.m4333write(((EvaluatedValue.BlobValue) evaluate4).value);
                                            buffer.m4333write(((EvaluatedValue.BlobValue) evaluate5).value);
                                            return new EvaluatedValue.BlobValue(buffer.readByteString(buffer.size));
                                        }
                                        if ((z3 && !(evaluate5 instanceof EvaluatedValue.StringValue)) || ((z4 && !(evaluate5 instanceof EvaluatedValue.BlobValue)) || z3 || z4)) {
                                            evaluate4 = evaluate5;
                                        }
                                        throw new ExpressionEvaluator$TypeMismatchException("string or blob", evaluate4);
                                    case OPERATOR_CONTAINS:
                                        boolean z5 = evaluate4 instanceof EvaluatedValue.StringValue;
                                        if (z5 && (evaluate5 instanceof EvaluatedValue.StringValue)) {
                                            return new EvaluatedValue.BoolValue(StringsKt.contains((CharSequence) ((EvaluatedValue.StringValue) evaluate4).value, (CharSequence) ((EvaluatedValue.StringValue) evaluate5).value, false));
                                        }
                                        boolean z6 = evaluate4 instanceof EvaluatedValue.BlobValue;
                                        if (z6 && (evaluate5 instanceof EvaluatedValue.BlobValue)) {
                                            ByteString byteString2 = ((EvaluatedValue.BlobValue) evaluate5).value;
                                            return new EvaluatedValue.BoolValue(Intrinsics.areEqual(byteString2, ByteString.EMPTY) || ByteString.indexOf$default(((EvaluatedValue.BlobValue) evaluate4).value, byteString2) != -1);
                                        }
                                        if ((z5 && !(evaluate5 instanceof EvaluatedValue.StringValue)) || ((z6 && !(evaluate5 instanceof EvaluatedValue.BlobValue)) || z5 || z6)) {
                                            evaluate4 = evaluate5;
                                        }
                                        throw new ExpressionEvaluator$TypeMismatchException("string or blob", evaluate4);
                                    default:
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                }
                            }
                        } else {
                            int i6 = i + 1;
                            EvaluatedValue evaluate6 = evaluate(expression2, genieViewStateAdapter, i6);
                            if (!(evaluate6 instanceof EvaluatedValue.Unresolved)) {
                                if (boolOf(evaluate6)) {
                                    return new EvaluatedValue.BoolValue(true);
                                }
                                EvaluatedValue evaluate7 = evaluate(expression3, genieViewStateAdapter, i6);
                                if (!(evaluate7 instanceof EvaluatedValue.Unresolved)) {
                                    return new EvaluatedValue.BoolValue(boolOf(evaluate7));
                                }
                            }
                        }
                    } else {
                        ConditionalOp conditionalOp = expression.conditional_op;
                        if (conditionalOp != null) {
                            int i7 = i + 1;
                            EvaluatedValue evaluate8 = evaluate(conditionalOp.condition, genieViewStateAdapter, i7);
                            if (!(evaluate8 instanceof EvaluatedValue.Unresolved)) {
                                return boolOf(evaluate8) ? evaluate(conditionalOp.then_expr, genieViewStateAdapter, i7) : evaluate(conditionalOp.else_expr, genieViewStateAdapter, i7);
                            }
                        } else {
                            FilterOp filterOp = expression.filter_op;
                            if (filterOp != null) {
                                int i8 = i + 1;
                                EvaluatedValue evaluate9 = evaluate(filterOp.collection, genieViewStateAdapter, i8);
                                if (!(evaluate9 instanceof EvaluatedValue.Unresolved)) {
                                    if (!(evaluate9 instanceof EvaluatedValue.CollectionValue)) {
                                        throw new ExpressionEvaluator$TypeMismatchException("collection", evaluate9);
                                    }
                                    String str2 = filterOp.item_variable;
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = ((EvaluatedValue.CollectionValue) evaluate9).items.iterator();
                                    while (it.hasNext()) {
                                        CollectionItem collectionItem = (CollectionItem) it.next();
                                        str2.getClass();
                                        collectionItem.getClass();
                                        EvaluatedValue evaluate10 = evaluate(filterOp.predicate, new GenieViewStateAdapter(new GenieScopedViewState(genieViewState, str2, CameraCaptureCallbacks.fromProto(collectionItem), null)), i8);
                                        if (!(evaluate10 instanceof EvaluatedValue.Unresolved)) {
                                            if (boolOf(evaluate10)) {
                                                arrayList.add(collectionItem);
                                            }
                                        }
                                    }
                                    return new EvaluatedValue.CollectionValue(arrayList);
                                }
                            } else {
                                CollectionLiteral collectionLiteral = expression.collection_literal;
                                if (collectionLiteral != null) {
                                    List list2 = collectionLiteral.items;
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                    int i9 = 0;
                                    for (Object obj : list2) {
                                        int i10 = i9 + 1;
                                        if (i9 < 0) {
                                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                                            throw null;
                                        }
                                        List<CollectionLiteralField> list3 = ((CollectionLiteralItem) obj).fields;
                                        ArrayList arrayList3 = new ArrayList();
                                        for (CollectionLiteralField collectionLiteralField : list3) {
                                            EvaluatedValue evaluate11 = evaluate(collectionLiteralField.value_, genieViewStateAdapter, i + 1);
                                            KeyValueMap.Entry keyValueEntry = evaluate11 instanceof EvaluatedValue.Unresolved ? null : keyValueEntry(collectionLiteralField.key, evaluate11);
                                            if (keyValueEntry != null) {
                                                arrayList3.add(keyValueEntry);
                                            }
                                        }
                                        Builder builder = new Builder(i3);
                                        KeyPath.Builder builder2 = new KeyPath.Builder();
                                        TransactorKt.checkElementsNotNull(arrayList3);
                                        builder2.segments = arrayList3;
                                        builder.operator_ = builder2.build();
                                        IdValue.Builder builder3 = new IdValue.Builder(r9 ? 1 : 0);
                                        builder3.local = String.valueOf(i9);
                                        builder3.server = null;
                                        builder.operand = builder3.build();
                                        arrayList2.add(builder.build());
                                        i9 = i10;
                                    }
                                    return new EvaluatedValue.CollectionValue(arrayList2);
                                }
                                FormatStringOp formatStringOp = expression.format_string_op;
                                if (formatStringOp == null) {
                                    throw new ExpressionEvaluator$MissingExpressionException("Expression has no variant set");
                                }
                                int i11 = i + 1;
                                EvaluatedValue evaluate12 = evaluate(formatStringOp.template, genieViewStateAdapter, i11);
                                if (!(evaluate12 instanceof EvaluatedValue.Unresolved)) {
                                    if (!(evaluate12 instanceof EvaluatedValue.StringValue)) {
                                        throw new ExpressionEvaluator$TypeMismatchException(InquiryField.StringField.TYPE, evaluate12);
                                    }
                                    String str3 = ((EvaluatedValue.StringValue) evaluate12).value;
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    for (FormatStringOp.TokenReplacement tokenReplacement : formatStringOp.token_replacements) {
                                        EvaluatedValue evaluate13 = evaluate(tokenReplacement.value_, genieViewStateAdapter, i11);
                                        boolean z7 = evaluate13 instanceof EvaluatedValue.Unresolved;
                                        if (!z7) {
                                            String str4 = tokenReplacement.key;
                                            if (evaluate13 instanceof EvaluatedValue.StringValue) {
                                                base64 = ((EvaluatedValue.StringValue) evaluate13).value;
                                            } else if (evaluate13 instanceof EvaluatedValue.IntValue) {
                                                base64 = String.valueOf(((EvaluatedValue.IntValue) evaluate13).value);
                                            } else if (evaluate13 instanceof EvaluatedValue.FloatValue) {
                                                double d4 = ((EvaluatedValue.FloatValue) evaluate13).value;
                                                long j3 = (long) d4;
                                                base64 = (Math.abs(d4) > Double.MAX_VALUE || j3 == Long.MAX_VALUE || j3 == Long.MIN_VALUE || ((double) j3) != d4) ? String.valueOf(d4) : String.valueOf(j3);
                                            } else if (evaluate13 instanceof EvaluatedValue.BoolValue) {
                                                base64 = String.valueOf(((EvaluatedValue.BoolValue) evaluate13).value);
                                            } else {
                                                if (!(evaluate13 instanceof EvaluatedValue.BlobValue)) {
                                                    if ((evaluate13 instanceof EvaluatedValue.CollectionValue) || (evaluate13 instanceof EvaluatedValue.GroupValue)) {
                                                        throw new ExpressionEvaluator$TypeMismatchException("primitive", evaluate13);
                                                    }
                                                    if (z7) {
                                                        throw new ExpressionEvaluator$TypeMismatchException("resolved value", evaluate13);
                                                    }
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return null;
                                                }
                                                base64 = ((EvaluatedValue.BlobValue) evaluate13).value.base64();
                                            }
                                            linkedHashMap.put(str4, base64);
                                        }
                                    }
                                    Regex regex = StringTemplateTokensKt.FORMAT_STRING_TOKEN_REGEX;
                                    str3.getClass();
                                    StringBuilder sb = new StringBuilder();
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    GeneratorSequence$iterator$1 generatorSequence$iterator$1 = new GeneratorSequence$iterator$1(Regex.findAll$default(str3, StringTemplateTokensKt.FORMAT_STRING_TOKEN_REGEX));
                                    int i12 = 0;
                                    while (generatorSequence$iterator$1.hasNext()) {
                                        MatchResult matchResult = (MatchResult) generatorSequence$iterator$1.next();
                                        int i13 = matchResult.getRange().first;
                                        int i14 = 0;
                                        while (true) {
                                            i2 = i13 - i14;
                                            if (i2 <= i12 || str3.charAt(i2 - 1) != '\\') {
                                                break;
                                            }
                                            i14++;
                                        }
                                        sb.append((CharSequence) str3, i12, i2);
                                        int i15 = i14 / 2;
                                        for (int i16 = 0; i16 < i15; i16++) {
                                            sb.append('\\');
                                        }
                                        String str5 = (String) matchResult.getGroupValues().get(1);
                                        if (i14 % 2 == 1) {
                                            sb.append("{{");
                                            sb.append(str5);
                                            sb.append("}}");
                                        } else {
                                            str5.getClass();
                                            String str6 = (String) linkedHashMap.get(str5);
                                            if (str6 != null) {
                                                sb.append(str6);
                                            } else {
                                                linkedHashSet.add(str5);
                                            }
                                        }
                                        i12 = matchResult.getRange().last + 1;
                                    }
                                    sb.append((CharSequence) str3, i12, str3.length());
                                    if (linkedHashSet.isEmpty()) {
                                        return new EvaluatedValue.StringValue(sb.toString());
                                    }
                                    throw new UnresolvedTemplateTokensException(linkedHashSet);
                                }
                            }
                        }
                    }
                }
                return EvaluatedValue.Unresolved.INSTANCE;
            }

            public static Operator fromValue(int i) {
                if (i == 0) {
                    return Operator.OPERATOR_UNSPECIFIED;
                }
                if (i == 1) {
                    return Operator.OPERATOR_NOT;
                }
                if (i == 2) {
                    return Operator.OPERATOR_IS_EMPTY;
                }
                if (i == 3) {
                    return Operator.OPERATOR_LENGTH;
                }
                if (i != 4) {
                    return null;
                }
                return Operator.OPERATOR_NEGATE;
            }

            public static KeyValueMap.Entry keyValueEntry(String str, EvaluatedValue evaluatedValue) {
                GoalFolder.Builder builder = new GoalFolder.Builder(13);
                builder.token = str;
                if (evaluatedValue instanceof EvaluatedValue.StringValue) {
                    builder.icon_unicode = ((EvaluatedValue.StringValue) evaluatedValue).value;
                    builder.completion_token = null;
                    builder.label = null;
                    builder.met_goal = null;
                    builder.goal_flow_parameters = null;
                    builder.goal_amount = null;
                    builder.goal_progress_percentage = null;
                    return builder.build();
                }
                if (evaluatedValue instanceof EvaluatedValue.IntValue) {
                    builder.completion_token = Long.valueOf(((EvaluatedValue.IntValue) evaluatedValue).value);
                    builder.icon_unicode = null;
                    builder.label = null;
                    builder.met_goal = null;
                    builder.goal_flow_parameters = null;
                    builder.goal_amount = null;
                    builder.goal_progress_percentage = null;
                    return builder.build();
                }
                if (evaluatedValue instanceof EvaluatedValue.FloatValue) {
                    builder.label = Double.valueOf(((EvaluatedValue.FloatValue) evaluatedValue).value);
                    builder.icon_unicode = null;
                    builder.completion_token = null;
                    builder.met_goal = null;
                    builder.goal_flow_parameters = null;
                    builder.goal_amount = null;
                    builder.goal_progress_percentage = null;
                    return builder.build();
                }
                if (evaluatedValue instanceof EvaluatedValue.BoolValue) {
                    builder.met_goal = Boolean.valueOf(((EvaluatedValue.BoolValue) evaluatedValue).value);
                    builder.icon_unicode = null;
                    builder.completion_token = null;
                    builder.label = null;
                    builder.goal_flow_parameters = null;
                    builder.goal_amount = null;
                    builder.goal_progress_percentage = null;
                    return builder.build();
                }
                if (evaluatedValue instanceof EvaluatedValue.BlobValue) {
                    builder.goal_flow_parameters = ((EvaluatedValue.BlobValue) evaluatedValue).value;
                    builder.icon_unicode = null;
                    builder.completion_token = null;
                    builder.label = null;
                    builder.met_goal = null;
                    builder.goal_amount = null;
                    builder.goal_progress_percentage = null;
                    return builder.build();
                }
                if (evaluatedValue instanceof EvaluatedValue.CollectionValue) {
                    Collection.Builder builder2 = new Collection.Builder(0);
                    ArrayList arrayList = ((EvaluatedValue.CollectionValue) evaluatedValue).items;
                    TransactorKt.checkElementsNotNull(arrayList);
                    builder2.items = arrayList;
                    builder.goal_progress_percentage = new Collection(builder2.items, builder2.buildUnknownFields());
                    builder.icon_unicode = null;
                    builder.completion_token = null;
                    builder.label = null;
                    builder.met_goal = null;
                    builder.goal_flow_parameters = null;
                    builder.goal_amount = null;
                    return builder.build();
                }
                if (!(evaluatedValue instanceof EvaluatedValue.GroupValue)) {
                    if (evaluatedValue instanceof EvaluatedValue.Unresolved) {
                        a$$ExternalSyntheticBUOutline0.m$1("Unresolved should be filtered by the caller before keyValueEntry");
                        return null;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                LinkedHashMap linkedHashMap = ((EvaluatedValue.GroupValue) evaluatedValue).fields;
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    EvaluatedValue evaluatedValue2 = (EvaluatedValue) entry.getValue();
                    KeyValueMap.Entry keyValueEntry = evaluatedValue2 instanceof EvaluatedValue.Unresolved ? null : keyValueEntry(str2, evaluatedValue2);
                    if (keyValueEntry != null) {
                        arrayList2.add(keyValueEntry);
                    }
                }
                KeyPath.Builder builder3 = new KeyPath.Builder();
                TransactorKt.checkElementsNotNull(arrayList2);
                builder3.segments = arrayList2;
                builder.goal_amount = builder3.build();
                builder.icon_unicode = null;
                builder.completion_token = null;
                builder.label = null;
                builder.met_goal = null;
                builder.goal_flow_parameters = null;
                builder.goal_progress_percentage = null;
                return builder.build();
            }

            public static double numericOf(EvaluatedValue evaluatedValue) {
                if (evaluatedValue instanceof EvaluatedValue.IntValue) {
                    return ((EvaluatedValue.IntValue) evaluatedValue).value;
                }
                if (evaluatedValue instanceof EvaluatedValue.FloatValue) {
                    return ((EvaluatedValue.FloatValue) evaluatedValue).value;
                }
                throw new ExpressionEvaluator$TypeMismatchException("numeric", evaluatedValue);
            }
        }

        static {
            Operator operator = OPERATOR_UNSPECIFIED;
            Companion = new Companion();
            ADAPTER = new UnaryOp$Operator$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Operator.class), Syntax.PROTO_2, operator);
        }

        Operator(int i) {
            this.value = i;
        }

        public static final Operator fromValue(int i) {
            Companion.getClass();
            return Companion.fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnaryOp(Operator operator, Expression expression, ByteString byteString) {
        super(ADAPTER, byteString);
        operator.getClass();
        expression.getClass();
        byteString.getClass();
        this.operator_ = operator;
        this.operand = expression;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UnaryOp)) {
            return false;
        }
        UnaryOp unaryOp = (UnaryOp) obj;
        return Intrinsics.areEqual(unknownFields(), unaryOp.unknownFields()) && this.operator_ == unaryOp.operator_ && Intrinsics.areEqual(this.operand, unaryOp.operand);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.operand.hashCode() + ((this.operator_.hashCode() + (unknownFields().hashCode() * 37)) * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.operator_ = this.operator_;
        builder.operand = this.operand;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("operator_=" + this.operator_);
        Matcher$$ExternalSyntheticOutline0.m("operand=", this.operand, arrayList);
        return CollectionsKt.joinToString$default(arrayList, ", ", "UnaryOp{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object operand;
        public Serializable operator_;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    Operator operator = (Operator) this.operator_;
                    if (operator == null) {
                        TransactorKt.missingRequiredFields(operator, "operator_");
                        throw null;
                    }
                    Expression expression = (Expression) this.operand;
                    if (expression != null) {
                        return new UnaryOp(operator, expression, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(expression, "operand");
                    throw null;
                case 1:
                    return build();
                case 2:
                    return new CollectionMutation.AppendItem((CollectionItem) this.operator_, (List) this.operand, buildUnknownFields());
                case 3:
                    return new CreateSessionResponse((CreateSessionResponse.Success) this.operator_, (CreateSessionResponse.Failure) this.operand, buildUnknownFields());
                case 4:
                    return new GetSceneResponse((GetSceneResponse.Success) this.operator_, (GetSceneResponse.Failure) this.operand, buildUnknownFields());
                case 5:
                    return new GetSceneResponse.Success((ViewPlan) this.operator_, (String) this.operand, buildUnknownFields());
                case 6:
                    return new Navigate((Navigate.Present) this.operator_, (Navigate.Dismiss) this.operand, buildUnknownFields());
                case 7:
                    String str = (String) this.operator_;
                    if (str == null) {
                        TransactorKt.missingRequiredFields(str, "view_slug");
                        throw null;
                    }
                    ViewSpec viewSpec = (ViewSpec) this.operand;
                    if (viewSpec != null) {
                        return new ViewPlan.ViewEntry(str, viewSpec, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(viewSpec, "view");
                    throw null;
                default:
                    return new ViewSpec((ByteString) this.operator_, buildUnknownFields(), (KeyValueMap) this.operand);
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public CollectionItem build() {
            return new CollectionItem((KeyValueMap) this.operator_, (IdValue) this.operand, buildUnknownFields());
        }
    }
}
