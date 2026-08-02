package com.squareup.protos.cash.referly.api.incentives.client;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.PaymentRewardStatus;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SetPromotionControlsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetPromotionControlsRequest> CREATOR;
    public final Boolean enabled;
    public final String teen_customer_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetPromotionControlsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.referly.api.incentives.client.SetPromotionControlsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SetPromotionControlsRequest((String) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetPromotionControlsRequest setPromotionControlsRequest = (SetPromotionControlsRequest) obj;
                reverseProtoWriter.getClass();
                setPromotionControlsRequest.getClass();
                reverseProtoWriter.writeBytes(setPromotionControlsRequest.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, setPromotionControlsRequest.enabled);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, setPromotionControlsRequest.teen_customer_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetPromotionControlsRequest setPromotionControlsRequest = (SetPromotionControlsRequest) obj;
                setPromotionControlsRequest.getClass();
                return ProtoAdapter.BOOL.encodedSizeWithTag(2, setPromotionControlsRequest.enabled) + ProtoAdapter.STRING.encodedSizeWithTag(1, setPromotionControlsRequest.teen_customer_token) + setPromotionControlsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetPromotionControlsRequest setPromotionControlsRequest = (SetPromotionControlsRequest) obj;
                setPromotionControlsRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = setPromotionControlsRequest.teen_customer_token;
                Boolean bool = setPromotionControlsRequest.enabled;
                byteString.getClass();
                return new SetPromotionControlsRequest(str, bool, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetPromotionControlsRequest setPromotionControlsRequest = (SetPromotionControlsRequest) obj;
                setPromotionControlsRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setPromotionControlsRequest.teen_customer_token);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, setPromotionControlsRequest.enabled);
                protoWriter.writeBytes(setPromotionControlsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetPromotionControlsRequest(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.teen_customer_token = str;
        this.enabled = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetPromotionControlsRequest)) {
            return false;
        }
        SetPromotionControlsRequest setPromotionControlsRequest = (SetPromotionControlsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setPromotionControlsRequest.unknownFields()) && Intrinsics.areEqual(this.teen_customer_token, setPromotionControlsRequest.teen_customer_token) && Intrinsics.areEqual(this.enabled, setPromotionControlsRequest.enabled);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.teen_customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.enabled;
        int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PaymentRewardStatus.Builder builder = new PaymentRewardStatus.Builder(8);
        builder.main_text = this.teen_customer_token;
        builder.show_payments = this.enabled;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.teen_customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "teen_customer_token=", arrayList);
        }
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetPromotionControlsRequest{", "}", 0, null, null, 56);
    }
}
