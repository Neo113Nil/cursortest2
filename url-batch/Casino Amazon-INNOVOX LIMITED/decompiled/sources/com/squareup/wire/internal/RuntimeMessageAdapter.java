package com.squareup.wire.internal;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: RuntimeMessageAdapter.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 @*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004:\u0001@B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010 \u001a\u00028\u0001¢\u0006\u0002\u0010!J\u0015\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010$J\u001d\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010#\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010)J\u001d\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020*2\u0006\u0010#\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010+J\u0015\u0010,\u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u00101\u001a\u00020\rH\u0016J\u0015\u00102\u001a\u00020\u00182\u0006\u0010#\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00103J\u0015\u00104\u001a\u00028\u00002\u0006\u00105\u001a\u000206H\u0016¢\u0006\u0002\u00107JU\u00108\u001a\u00020&\"\u0004\b\u0002\u001092\b\u0010:\u001a\u0004\u0018\u00018\u00002\f\u0010;\u001a\b\u0012\u0004\u0012\u0002H90\u00172\b\u0010<\u001a\u0004\u0018\u0001H92 \u0010=\u001a\u001c\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u0002H9\u0012\u0004\u0012\u00020&0>¢\u0006\u0002\u0010?R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\nX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R%\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e0\u0012¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u001d\u0010\u001d\u001a\u00020\u0018*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000e8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006A"}, d2 = {"Lcom/squareup/wire/internal/RuntimeMessageAdapter;", "M", "", "B", "Lcom/squareup/wire/ProtoAdapter;", "binding", "Lcom/squareup/wire/internal/MessageBinding;", "<init>", "(Lcom/squareup/wire/internal/MessageBinding;)V", "messageType", "Lkotlin/reflect/KClass;", "fields", "", "", "Lcom/squareup/wire/internal/FieldOrOneOfBinding;", "getFields", "()Ljava/util/Map;", "fieldBindingsArray", "", "getFieldBindingsArray", "()[Lcom/squareup/wire/internal/FieldOrOneOfBinding;", "[Lcom/squareup/wire/internal/FieldOrOneOfBinding;", "jsonNames", "", "", "getJsonNames", "()Ljava/util/List;", "jsonAlternateNames", "getJsonAlternateNames", "jsonName", "getJsonName", "(Lcom/squareup/wire/internal/FieldOrOneOfBinding;)Ljava/lang/String;", "newBuilder", "()Ljava/lang/Object;", "encodedSize", "value", "(Ljava/lang/Object;)I", "encode", "", "writer", "Lcom/squareup/wire/ProtoWriter;", "(Lcom/squareup/wire/ProtoWriter;Ljava/lang/Object;)V", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ReverseProtoWriter;Ljava/lang/Object;)V", "redact", "(Ljava/lang/Object;)Ljava/lang/Object;", "equals", "", "other", "hashCode", "toString", "(Ljava/lang/Object;)Ljava/lang/String;", "decode", "reader", "Lcom/squareup/wire/ProtoReader;", "(Lcom/squareup/wire/ProtoReader;)Ljava/lang/Object;", "writeAllFields", "A", "message", "jsonAdapters", "redactedFieldsAdapter", "encodeValue", "Lkotlin/Function3;", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "Companion", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RuntimeMessageAdapter<M, B> extends ProtoAdapter<M> {
    private static final String REDACTED = "██";
    private final MessageBinding<M, B> binding;
    private final FieldOrOneOfBinding<M, B>[] fieldBindingsArray;
    private final Map<Integer, FieldOrOneOfBinding<M, B>> fields;
    private final List<String> jsonAlternateNames;
    private final List<String> jsonNames;
    private final KClass<? super M> messageType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RuntimeMessageAdapter(MessageBinding<M, B> binding) {
        super(FieldEncoding.LENGTH_DELIMITED, binding.getMessageType(), binding.getTypeUrl(), binding.getSyntax(), null, null, 48, null);
        String str;
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        this.messageType = binding.getMessageType();
        Map<Integer, FieldOrOneOfBinding<M, B>> fields = binding.getFields();
        this.fields = fields;
        FieldOrOneOfBinding<M, B>[] fieldOrOneOfBindingArr = (FieldOrOneOfBinding[]) fields.values().toArray(new FieldOrOneOfBinding[0]);
        this.fieldBindingsArray = fieldOrOneOfBindingArr;
        ArrayList arrayList = new ArrayList(fieldOrOneOfBindingArr.length);
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : fieldOrOneOfBindingArr) {
            arrayList.add(getJsonName(fieldOrOneOfBinding));
        }
        this.jsonNames = arrayList;
        FieldOrOneOfBinding<M, B>[] fieldOrOneOfBindingArr2 = this.fieldBindingsArray;
        ArrayList arrayList2 = new ArrayList(fieldOrOneOfBindingArr2.length);
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding2 : fieldOrOneOfBindingArr2) {
            arrayList2.add(getJsonName(fieldOrOneOfBinding2));
        }
        ArrayList arrayList3 = arrayList2;
        FieldOrOneOfBinding<M, B>[] fieldOrOneOfBindingArr3 = this.fieldBindingsArray;
        ArrayList arrayList4 = new ArrayList(fieldOrOneOfBindingArr3.length);
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding3 : fieldOrOneOfBindingArr3) {
            if (!Intrinsics.areEqual(getJsonName(fieldOrOneOfBinding3), fieldOrOneOfBinding3.getDeclaredName())) {
                str = fieldOrOneOfBinding3.getDeclaredName();
            } else if (Intrinsics.areEqual(getJsonName(fieldOrOneOfBinding3), fieldOrOneOfBinding3.getName())) {
                String camelCase$default = _PlatformKt.camelCase$default(fieldOrOneOfBinding3.getDeclaredName(), false, 2, null);
                str = (Intrinsics.areEqual(getJsonName(fieldOrOneOfBinding3), camelCase$default) || arrayList3.contains(camelCase$default)) ? null : camelCase$default;
            } else {
                str = fieldOrOneOfBinding3.getName();
            }
            arrayList4.add(str);
        }
        this.jsonAlternateNames = arrayList4;
    }

    public final Map<Integer, FieldOrOneOfBinding<M, B>> getFields() {
        return this.fields;
    }

    public final FieldOrOneOfBinding<M, B>[] getFieldBindingsArray() {
        return this.fieldBindingsArray;
    }

    public final List<String> getJsonNames() {
        return this.jsonNames;
    }

    public final List<String> getJsonAlternateNames() {
        return this.jsonAlternateNames;
    }

    public final String getJsonName(FieldOrOneOfBinding<?, ?> fieldOrOneOfBinding) {
        Intrinsics.checkNotNullParameter(fieldOrOneOfBinding, "<this>");
        return fieldOrOneOfBinding.getWireFieldJsonName().length() == 0 ? fieldOrOneOfBinding.getDeclaredName() : fieldOrOneOfBinding.getWireFieldJsonName();
    }

    public final B newBuilder() {
        return this.binding.newBuilder();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(M value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int cachedSerializedSize = this.binding.getCachedSerializedSize(value);
        if (cachedSerializedSize != 0) {
            return cachedSerializedSize;
        }
        int i = 0;
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : this.fields.values()) {
            Object obj = fieldOrOneOfBinding.get(value);
            if (obj != null) {
                i += fieldOrOneOfBinding.getAdapter().encodedSizeWithTag(fieldOrOneOfBinding.getTag(), obj);
            }
        }
        int size = i + this.binding.unknownFields(value).size();
        this.binding.setCachedSerializedSize(value, size);
        return size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, M value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : this.fields.values()) {
            Object obj = fieldOrOneOfBinding.get(value);
            if (obj != null) {
                fieldOrOneOfBinding.getAdapter().encodeWithTag(writer, fieldOrOneOfBinding.getTag(), (int) obj);
            }
        }
        writer.writeBytes(this.binding.unknownFields(value));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, M value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(this.binding.unknownFields(value));
        int length = this.fieldBindingsArray.length;
        while (true) {
            length--;
            if (-1 >= length) {
                return;
            }
            FieldOrOneOfBinding<M, B> fieldOrOneOfBinding = this.fieldBindingsArray[length];
            Object obj = fieldOrOneOfBinding.get(value);
            if (obj != null) {
                fieldOrOneOfBinding.getAdapter().encodeWithTag(writer, fieldOrOneOfBinding.getTag(), (int) obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public M redact(M value) {
        Intrinsics.checkNotNullParameter(value, "value");
        B newBuilder = this.binding.newBuilder();
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : this.fields.values()) {
            if (fieldOrOneOfBinding.getRedacted() && fieldOrOneOfBinding.getLabel() == WireField.Label.REQUIRED) {
                throw new UnsupportedOperationException("Field '" + fieldOrOneOfBinding.getName() + "' in " + getType() + " is required and cannot be redacted.");
            }
            boolean isMessage = fieldOrOneOfBinding.isMessage();
            if (fieldOrOneOfBinding.getRedacted() || (isMessage && !fieldOrOneOfBinding.getLabel().isRepeated())) {
                Object fromBuilder = fieldOrOneOfBinding.getFromBuilder(newBuilder);
                if (fromBuilder != null) {
                    fieldOrOneOfBinding.set(newBuilder, fieldOrOneOfBinding.getAdapter().redact(fromBuilder));
                }
            } else if (isMessage && fieldOrOneOfBinding.getLabel().isRepeated()) {
                Object fromBuilder2 = fieldOrOneOfBinding.getFromBuilder(newBuilder);
                Intrinsics.checkNotNull(fromBuilder2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                ProtoAdapter<?> singleAdapter = fieldOrOneOfBinding.getSingleAdapter();
                Intrinsics.checkNotNull(singleAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
                fieldOrOneOfBinding.set(newBuilder, Internal.m3855redactElements((List) fromBuilder2, singleAdapter));
            }
        }
        this.binding.clearUnknownFields(newBuilder);
        return this.binding.build(newBuilder);
    }

    public boolean equals(Object other) {
        return (other instanceof RuntimeMessageAdapter) && Intrinsics.areEqual(((RuntimeMessageAdapter) other).messageType, this.messageType);
    }

    public int hashCode() {
        return this.messageType.hashCode();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public String toString(M value) {
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sb = new StringBuilder();
        sb.append(this.messageType.getSimpleName());
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z = true;
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : this.fields.values()) {
            Object obj = fieldOrOneOfBinding.get(value);
            if (obj != null) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(fieldOrOneOfBinding.getName());
                sb.append('=');
                if (fieldOrOneOfBinding.getRedacted()) {
                    obj = REDACTED;
                }
                sb.append(obj);
                z = false;
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public M decode(ProtoReader reader) {
        ProtoAdapter<?> singleAdapter;
        Intrinsics.checkNotNullParameter(reader, "reader");
        B newBuilder = newBuilder();
        long beginMessage = reader.beginMessage();
        while (true) {
            int nextTag = reader.nextTag();
            if (nextTag != -1) {
                FieldOrOneOfBinding<M, B> fieldOrOneOfBinding = this.fields.get(Integer.valueOf(nextTag));
                if (fieldOrOneOfBinding != null) {
                    try {
                        if (fieldOrOneOfBinding.isMap()) {
                            singleAdapter = fieldOrOneOfBinding.getAdapter();
                        } else {
                            singleAdapter = fieldOrOneOfBinding.getSingleAdapter();
                        }
                        Object decode = singleAdapter.decode(reader);
                        Intrinsics.checkNotNull(decode);
                        fieldOrOneOfBinding.value(newBuilder, decode);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        this.binding.addUnknownField(newBuilder, nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                } else {
                    FieldEncoding nextFieldEncoding = reader.getNextFieldEncoding();
                    Intrinsics.checkNotNull(nextFieldEncoding);
                    this.binding.addUnknownField(newBuilder, nextTag, nextFieldEncoding, nextFieldEncoding.rawProtoAdapter().decode(reader));
                }
            } else {
                reader.endMessageAndGetUnknownFields(beginMessage);
                return this.binding.build(newBuilder);
            }
        }
    }

    public final <A> void writeAllFields(M message, List<? extends A> jsonAdapters, A redactedFieldsAdapter, Function3<? super String, Object, ? super A, Unit> encodeValue) {
        Intrinsics.checkNotNullParameter(jsonAdapters, "jsonAdapters");
        Intrinsics.checkNotNullParameter(encodeValue, "encodeValue");
        int length = this.fieldBindingsArray.length;
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            FieldOrOneOfBinding<M, B> fieldOrOneOfBinding = this.fieldBindingsArray[i];
            Intrinsics.checkNotNull(message);
            Object obj = fieldOrOneOfBinding.get(message);
            if (!fieldOrOneOfBinding.omitFromJson(getSyntax(), obj)) {
                if (fieldOrOneOfBinding.getRedacted() && redactedFieldsAdapter != null && obj != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(this.jsonNames.get(i));
                } else {
                    encodeValue.invoke(this.jsonNames.get(i), obj, jsonAdapters.get(i));
                }
            }
        }
        if (arrayList == null || !(!arrayList.isEmpty())) {
            return;
        }
        Intrinsics.checkNotNull(redactedFieldsAdapter);
        encodeValue.invoke("__redacted_fields", arrayList, redactedFieldsAdapter);
    }
}
