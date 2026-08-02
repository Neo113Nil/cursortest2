package com.squareup.protos.teamapp.ui;

import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.ui.UiDda;
import com.squareup.util.cash.Luhn$$ExternalSyntheticLambda0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ParameterizedText extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ParameterizedText> CREATOR;
    public final Map fallback_parameters;
    public final String fallback_text;
    public final ParameterizedTextParameters parameters;
    public final String text;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ParameterizedText.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.teamapp.ui.ParameterizedText$Companion$ADAPTER$1
            public final Lazy fallback_parametersAdapter$delegate;

            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
                this.fallback_parametersAdapter$delegate = LazyKt.lazy(new Luhn$$ExternalSyntheticLambda0(3));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                LinkedHashMap m = SizeMode$EnumUnboxingLocalUtility.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        break;
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(ParameterizedTextParameters.ADAPTER, protoReader, obj2);
                    } else if (nextTag == 3) {
                        m.putAll((Map) ((ProtoAdapter) this.fallback_parametersAdapter$delegate.getValue()).decode(protoReader));
                    } else if (nextTag != 4) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
                ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
                String str = (String) obj;
                if (str != null) {
                    return new ParameterizedText(str, (ParameterizedTextParameters) obj2, m, (String) obj3, endMessageAndGetUnknownFields);
                }
                TransactorKt.missingRequiredFields(obj, "text");
                throw null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ParameterizedText parameterizedText = (ParameterizedText) obj;
                reverseProtoWriter.getClass();
                parameterizedText.getClass();
                reverseProtoWriter.writeBytes(parameterizedText.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, parameterizedText.fallback_text);
                ((ProtoAdapter) this.fallback_parametersAdapter$delegate.getValue()).encodeWithTag(reverseProtoWriter, 3, parameterizedText.fallback_parameters);
                ParameterizedTextParameters.ADAPTER.encodeWithTag(reverseProtoWriter, 2, parameterizedText.parameters);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, parameterizedText.text);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ParameterizedText parameterizedText = (ParameterizedText) obj;
                parameterizedText.getClass();
                int size$okio = parameterizedText.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(4, parameterizedText.fallback_text) + ((ProtoAdapter) this.fallback_parametersAdapter$delegate.getValue()).encodedSizeWithTag(3, parameterizedText.fallback_parameters) + ParameterizedTextParameters.ADAPTER.encodedSizeWithTag(2, parameterizedText.parameters) + protoAdapter2.encodedSizeWithTag(1, parameterizedText.text) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ParameterizedText parameterizedText = (ParameterizedText) obj;
                parameterizedText.getClass();
                ParameterizedTextParameters parameterizedTextParameters = parameterizedText.parameters;
                ParameterizedTextParameters parameterizedTextParameters2 = parameterizedTextParameters != null ? (ParameterizedTextParameters) ParameterizedTextParameters.ADAPTER.redact(parameterizedTextParameters) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = parameterizedText.text;
                Map map = parameterizedText.fallback_parameters;
                String str2 = parameterizedText.fallback_text;
                str.getClass();
                map.getClass();
                byteString.getClass();
                return new ParameterizedText(str, parameterizedTextParameters2, map, str2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ParameterizedText parameterizedText = (ParameterizedText) obj;
                parameterizedText.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, parameterizedText.text);
                ParameterizedTextParameters.ADAPTER.encodeWithTag(protoWriter, 2, parameterizedText.parameters);
                ((ProtoAdapter) this.fallback_parametersAdapter$delegate.getValue()).encodeWithTag(protoWriter, 3, parameterizedText.fallback_parameters);
                protoAdapter2.encodeWithTag(protoWriter, 4, parameterizedText.fallback_text);
                protoWriter.writeBytes(parameterizedText.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParameterizedText(String str, ParameterizedTextParameters parameterizedTextParameters, Map map, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        map.getClass();
        byteString.getClass();
        this.text = str;
        this.parameters = parameterizedTextParameters;
        this.fallback_text = str2;
        this.fallback_parameters = TransactorKt.immutableCopyOf("fallback_parameters", map);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ParameterizedText)) {
            return false;
        }
        ParameterizedText parameterizedText = (ParameterizedText) obj;
        return Intrinsics.areEqual(unknownFields(), parameterizedText.unknownFields()) && Intrinsics.areEqual(this.text, parameterizedText.text) && Intrinsics.areEqual(this.parameters, parameterizedText.parameters) && Intrinsics.areEqual(this.fallback_parameters, parameterizedText.fallback_parameters) && Intrinsics.areEqual(this.fallback_text, parameterizedText.fallback_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.text);
        ParameterizedTextParameters parameterizedTextParameters = this.parameters;
        int m2 = CameraState$Type$EnumUnboxingLocalUtility.m((m + (parameterizedTextParameters != null ? parameterizedTextParameters.hashCode() : 0)) * 37, this.fallback_parameters, 37);
        String str = this.fallback_text;
        int hashCode = m2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiDda.Builder builder = new UiDda.Builder(27);
        EmptyMap.INSTANCE.getClass();
        builder.account = this.text;
        builder.enabled = this.parameters;
        builder.button = this.fallback_parameters;
        builder.dda_form = this.fallback_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.text, "text=", arrayList);
        ParameterizedTextParameters parameterizedTextParameters = this.parameters;
        if (parameterizedTextParameters != null) {
            arrayList.add("parameters=" + parameterizedTextParameters);
        }
        Map map = this.fallback_parameters;
        if (!map.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("fallback_parameters=", map, arrayList);
        }
        String str = this.fallback_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "fallback_text=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ParameterizedText{", "}", 0, null, null, 56);
    }
}
