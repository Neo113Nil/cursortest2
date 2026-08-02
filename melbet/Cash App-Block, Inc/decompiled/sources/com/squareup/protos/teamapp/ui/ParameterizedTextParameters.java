package com.squareup.protos.teamapp.ui;

import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.common.Money;
import com.squareup.util.cash.Luhn$$ExternalSyntheticLambda0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
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
import squareup.cash.bills.BillsApplet;

/* loaded from: classes8.dex */
public final class ParameterizedTextParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ParameterizedTextParameters> CREATOR;
    public final Map duration_parameters;
    public final Map money_parameters;
    public final Map number_parameters;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ParameterizedTextParameters.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.teamapp.ui.ParameterizedTextParameters$Companion$ADAPTER$1
            public final Lazy duration_parametersAdapter$delegate;
            public final Lazy money_parametersAdapter$delegate;
            public final Lazy number_parametersAdapter$delegate;

            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
                this.number_parametersAdapter$delegate = LazyKt.lazy(new Luhn$$ExternalSyntheticLambda0(4));
                this.money_parametersAdapter$delegate = LazyKt.lazy(new Luhn$$ExternalSyntheticLambda0(5));
                this.duration_parametersAdapter$delegate = LazyKt.lazy(new Luhn$$ExternalSyntheticLambda0(6));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                LinkedHashMap m = SizeMode$EnumUnboxingLocalUtility.m(protoReader);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ParameterizedTextParameters(m, linkedHashMap, linkedHashMap2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.putAll((Map) ((ProtoAdapter) this.number_parametersAdapter$delegate.getValue()).decode(protoReader));
                    } else if (nextTag == 2) {
                        linkedHashMap.putAll((Map) ((ProtoAdapter) this.money_parametersAdapter$delegate.getValue()).decode(protoReader));
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        linkedHashMap2.putAll((Map) ((ProtoAdapter) this.duration_parametersAdapter$delegate.getValue()).decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ParameterizedTextParameters parameterizedTextParameters = (ParameterizedTextParameters) obj;
                reverseProtoWriter.getClass();
                parameterizedTextParameters.getClass();
                reverseProtoWriter.writeBytes(parameterizedTextParameters.unknownFields());
                ((ProtoAdapter) this.duration_parametersAdapter$delegate.getValue()).encodeWithTag(reverseProtoWriter, 3, parameterizedTextParameters.duration_parameters);
                ((ProtoAdapter) this.money_parametersAdapter$delegate.getValue()).encodeWithTag(reverseProtoWriter, 2, parameterizedTextParameters.money_parameters);
                ((ProtoAdapter) this.number_parametersAdapter$delegate.getValue()).encodeWithTag(reverseProtoWriter, 1, parameterizedTextParameters.number_parameters);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ParameterizedTextParameters parameterizedTextParameters = (ParameterizedTextParameters) obj;
                parameterizedTextParameters.getClass();
                return ((ProtoAdapter) this.duration_parametersAdapter$delegate.getValue()).encodedSizeWithTag(3, parameterizedTextParameters.duration_parameters) + ((ProtoAdapter) this.money_parametersAdapter$delegate.getValue()).encodedSizeWithTag(2, parameterizedTextParameters.money_parameters) + ((ProtoAdapter) this.number_parametersAdapter$delegate.getValue()).encodedSizeWithTag(1, parameterizedTextParameters.number_parameters) + parameterizedTextParameters.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ParameterizedTextParameters parameterizedTextParameters = (ParameterizedTextParameters) obj;
                parameterizedTextParameters.getClass();
                LinkedHashMap m1170redactElements = TransactorKt.m1170redactElements(parameterizedTextParameters.number_parameters, Number.ADAPTER);
                LinkedHashMap m1170redactElements2 = TransactorKt.m1170redactElements(parameterizedTextParameters.money_parameters, Money.ADAPTER);
                LinkedHashMap m1170redactElements3 = TransactorKt.m1170redactElements(parameterizedTextParameters.duration_parameters, Duration.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new ParameterizedTextParameters(m1170redactElements, m1170redactElements2, m1170redactElements3, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ParameterizedTextParameters parameterizedTextParameters = (ParameterizedTextParameters) obj;
                parameterizedTextParameters.getClass();
                ((ProtoAdapter) this.number_parametersAdapter$delegate.getValue()).encodeWithTag(protoWriter, 1, parameterizedTextParameters.number_parameters);
                ((ProtoAdapter) this.money_parametersAdapter$delegate.getValue()).encodeWithTag(protoWriter, 2, parameterizedTextParameters.money_parameters);
                ((ProtoAdapter) this.duration_parametersAdapter$delegate.getValue()).encodeWithTag(protoWriter, 3, parameterizedTextParameters.duration_parameters);
                protoWriter.writeBytes(parameterizedTextParameters.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParameterizedTextParameters(Map map, Map map2, Map map3, ByteString byteString) {
        super(ADAPTER, byteString);
        map.getClass();
        map2.getClass();
        map3.getClass();
        byteString.getClass();
        this.number_parameters = TransactorKt.immutableCopyOf("number_parameters", map);
        this.money_parameters = TransactorKt.immutableCopyOf("money_parameters", map2);
        this.duration_parameters = TransactorKt.immutableCopyOf("duration_parameters", map3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ParameterizedTextParameters)) {
            return false;
        }
        ParameterizedTextParameters parameterizedTextParameters = (ParameterizedTextParameters) obj;
        return Intrinsics.areEqual(unknownFields(), parameterizedTextParameters.unknownFields()) && Intrinsics.areEqual(this.number_parameters, parameterizedTextParameters.number_parameters) && Intrinsics.areEqual(this.money_parameters, parameterizedTextParameters.money_parameters) && Intrinsics.areEqual(this.duration_parameters, parameterizedTextParameters.duration_parameters);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.duration_parameters.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m(unknownFields().hashCode() * 37, this.number_parameters, 37), this.money_parameters, 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsApplet.Builder builder = new BillsApplet.Builder(7);
        EmptyMap.INSTANCE.getClass();
        builder.action = this.number_parameters;
        builder.full_applet = this.money_parameters;
        builder.half_applet = this.duration_parameters;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Map map = this.number_parameters;
        if (!map.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("number_parameters=", map, arrayList);
        }
        Map map2 = this.money_parameters;
        if (!map2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("money_parameters=", map2, arrayList);
        }
        Map map3 = this.duration_parameters;
        if (!map3.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("duration_parameters=", map3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ParameterizedTextParameters{", "}", 0, null, null, 56);
    }
}
