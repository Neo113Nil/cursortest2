package com.squareup.wire.internal;

import androidx.room.TransactorKt;
import com.squareup.util.compose.ListsKt$$ExternalSyntheticLambda0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import io.noties.markwon.MarkwonConfiguration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes8.dex */
public final class RuntimeMessageAdapter extends ProtoAdapter {
    public final MarkwonConfiguration binding;
    public final FieldOrOneOfBinding[] fieldBindingsArray;
    public final Map fields;
    public final ArrayList jsonAlternateNames;
    public final ArrayList jsonNames;
    public final KClass messageType;

    public RuntimeMessageAdapter(MarkwonConfiguration markwonConfiguration) {
        super(FieldEncoding.LENGTH_DELIMITED, (KClass) markwonConfiguration.theme, (String) markwonConfiguration.imageDestinationProcessor, (Syntax) markwonConfiguration.spansFactory, (Object) null, 48);
        String str;
        this.binding = markwonConfiguration;
        this.messageType = (KClass) markwonConfiguration.theme;
        Map map = (Map) markwonConfiguration.linkResolver;
        this.fields = map;
        FieldOrOneOfBinding[] fieldOrOneOfBindingArr = (FieldOrOneOfBinding[]) map.values().toArray(new FieldOrOneOfBinding[0]);
        this.fieldBindingsArray = fieldOrOneOfBindingArr;
        ArrayList arrayList = new ArrayList(fieldOrOneOfBindingArr.length);
        for (FieldOrOneOfBinding fieldOrOneOfBinding : fieldOrOneOfBindingArr) {
            arrayList.add(getJsonName(fieldOrOneOfBinding));
        }
        this.jsonNames = arrayList;
        FieldOrOneOfBinding[] fieldOrOneOfBindingArr2 = this.fieldBindingsArray;
        ArrayList arrayList2 = new ArrayList(fieldOrOneOfBindingArr2.length);
        for (FieldOrOneOfBinding fieldOrOneOfBinding2 : fieldOrOneOfBindingArr2) {
            arrayList2.add(getJsonName(fieldOrOneOfBinding2));
        }
        FieldOrOneOfBinding[] fieldOrOneOfBindingArr3 = this.fieldBindingsArray;
        ArrayList arrayList3 = new ArrayList(fieldOrOneOfBindingArr3.length);
        for (FieldOrOneOfBinding fieldOrOneOfBinding3 : fieldOrOneOfBindingArr3) {
            if (!Intrinsics.areEqual(getJsonName(fieldOrOneOfBinding3), fieldOrOneOfBinding3.getDeclaredName())) {
                str = fieldOrOneOfBinding3.getDeclaredName();
            } else if (Intrinsics.areEqual(getJsonName(fieldOrOneOfBinding3), fieldOrOneOfBinding3.getName())) {
                String declaredName = fieldOrOneOfBinding3.getDeclaredName();
                declaredName.getClass();
                StringBuilder sb = new StringBuilder(declaredName.length());
                int i = 0;
                boolean z = false;
                while (i < declaredName.length()) {
                    int codePointAt = declaredName.codePointAt(i);
                    i += Character.charCount(codePointAt);
                    if (codePointAt == 95) {
                        z = true;
                    } else {
                        if (z && 97 <= codePointAt && codePointAt < 123) {
                            codePointAt -= 32;
                        }
                        sb.appendCodePoint(codePointAt);
                        z = false;
                    }
                }
                String sb2 = sb.toString();
                str = (Intrinsics.areEqual(getJsonName(fieldOrOneOfBinding3), sb2) || arrayList2.contains(sb2)) ? null : sb2;
            } else {
                str = fieldOrOneOfBinding3.getName();
            }
            arrayList3.add(str);
        }
        this.jsonAlternateNames = arrayList3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        Message.Builder builder = (Message.Builder) ((ListsKt$$ExternalSyntheticLambda0) this.binding.syntaxHighlight).invoke();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                protoReader.endMessageAndGetUnknownFields(beginMessage);
                return builder.build();
            }
            FieldOrOneOfBinding fieldOrOneOfBinding = (FieldOrOneOfBinding) this.fields.get(Integer.valueOf(nextTag));
            if (fieldOrOneOfBinding != null) {
                try {
                    Object decode = (fieldOrOneOfBinding.isMap() ? fieldOrOneOfBinding.getAdapter() : fieldOrOneOfBinding.getSingleAdapter()).decode(protoReader);
                    decode.getClass();
                    fieldOrOneOfBinding.value(builder, decode);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                peekFieldEncoding.getClass();
                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        obj.getClass();
        for (FieldOrOneOfBinding fieldOrOneOfBinding : this.fields.values()) {
            Object obj2 = fieldOrOneOfBinding.get(obj);
            if (obj2 != null) {
                fieldOrOneOfBinding.getAdapter().encodeWithTag(protoWriter, fieldOrOneOfBinding.getTag(), obj2);
            }
        }
        this.binding.getClass();
        protoWriter.writeBytes(((Message) obj).unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        obj.getClass();
        this.binding.getClass();
        Message message = (Message) obj;
        int cachedSerializedSize$wire_runtime = message.getCachedSerializedSize$wire_runtime();
        if (cachedSerializedSize$wire_runtime != 0) {
            return cachedSerializedSize$wire_runtime;
        }
        int i = 0;
        for (FieldOrOneOfBinding fieldOrOneOfBinding : this.fields.values()) {
            Object obj2 = fieldOrOneOfBinding.get(obj);
            if (obj2 != null) {
                i += fieldOrOneOfBinding.getAdapter().encodedSizeWithTag(fieldOrOneOfBinding.getTag(), obj2);
            }
        }
        int size$okio = message.unknownFields().getSize$okio() + i;
        message.setCachedSerializedSize$wire_runtime(size$okio);
        return size$okio;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof RuntimeMessageAdapter) && Intrinsics.areEqual(((RuntimeMessageAdapter) obj).messageType, this.messageType);
    }

    public final String getJsonName(FieldOrOneOfBinding fieldOrOneOfBinding) {
        fieldOrOneOfBinding.getClass();
        return fieldOrOneOfBinding.getWireFieldJsonName().length() == 0 ? fieldOrOneOfBinding.getDeclaredName() : fieldOrOneOfBinding.getWireFieldJsonName();
    }

    public final int hashCode() {
        return this.messageType.hashCode();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        obj.getClass();
        Message.Builder builder = (Message.Builder) ((ListsKt$$ExternalSyntheticLambda0) this.binding.syntaxHighlight).invoke();
        for (FieldOrOneOfBinding fieldOrOneOfBinding : this.fields.values()) {
            if (fieldOrOneOfBinding.getRedacted() && fieldOrOneOfBinding.getLabel() == WireField.Label.REQUIRED) {
                throw new UnsupportedOperationException("Field '" + fieldOrOneOfBinding.getName() + "' in " + getType() + " is required and cannot be redacted.");
            }
            boolean isMessage = fieldOrOneOfBinding.isMessage();
            if (fieldOrOneOfBinding.getRedacted() || (isMessage && !fieldOrOneOfBinding.getLabel().isRepeated())) {
                Object fromBuilder$1 = fieldOrOneOfBinding.getFromBuilder$1(builder);
                if (fromBuilder$1 != null) {
                    fieldOrOneOfBinding.set$1(builder, fieldOrOneOfBinding.getAdapter().redact(fromBuilder$1));
                }
            } else if (isMessage && fieldOrOneOfBinding.getLabel().isRepeated()) {
                Object fromBuilder$12 = fieldOrOneOfBinding.getFromBuilder$1(builder);
                fromBuilder$12.getClass();
                ProtoAdapter singleAdapter = fieldOrOneOfBinding.getSingleAdapter();
                singleAdapter.getClass();
                fieldOrOneOfBinding.set$1(builder, TransactorKt.m1169redactElements((List) fromBuilder$12, singleAdapter));
            }
        }
        builder.clearUnknownFields();
        return builder.build();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final String toString(Object obj) {
        obj.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(this.messageType.getSimpleName());
        sb.append('{');
        boolean z = true;
        for (FieldOrOneOfBinding fieldOrOneOfBinding : this.fields.values()) {
            Object obj2 = fieldOrOneOfBinding.get(obj);
            if (obj2 != null) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(fieldOrOneOfBinding.getName());
                sb.append('=');
                if (fieldOrOneOfBinding.getRedacted()) {
                    obj2 = "██";
                }
                sb.append(obj2);
                z = false;
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        reverseProtoWriter.getClass();
        obj.getClass();
        this.binding.getClass();
        reverseProtoWriter.writeBytes(((Message) obj).unknownFields());
        FieldOrOneOfBinding[] fieldOrOneOfBindingArr = this.fieldBindingsArray;
        int length = fieldOrOneOfBindingArr.length;
        while (true) {
            length--;
            if (-1 >= length) {
                return;
            }
            FieldOrOneOfBinding fieldOrOneOfBinding = fieldOrOneOfBindingArr[length];
            Object obj2 = fieldOrOneOfBinding.get(obj);
            if (obj2 != null) {
                fieldOrOneOfBinding.getAdapter().encodeWithTag(reverseProtoWriter, fieldOrOneOfBinding.getTag(), obj2);
            }
        }
    }
}
