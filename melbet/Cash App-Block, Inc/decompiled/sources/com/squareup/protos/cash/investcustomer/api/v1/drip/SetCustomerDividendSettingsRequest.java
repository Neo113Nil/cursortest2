package com.squareup.protos.cash.investcustomer.api.v1.drip;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.franklin.common.RequestContext;
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
public final class SetCustomerDividendSettingsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetCustomerDividendSettingsRequest> CREATOR;
    public final RequestContext request_context;
    public final DividendSetting setting;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetCustomerDividendSettingsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.investcustomer.api.v1.drip.SetCustomerDividendSettingsRequest$Companion$ADAPTER$1
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
                        break;
                    }
                    if (nextTag == 1) {
                        try {
                            obj = DividendSetting.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj2);
                    }
                }
                ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
                DividendSetting dividendSetting = (DividendSetting) obj;
                if (dividendSetting != null) {
                    return new SetCustomerDividendSettingsRequest(dividendSetting, (RequestContext) obj2, endMessageAndGetUnknownFields);
                }
                TransactorKt.missingRequiredFields(obj, "setting");
                throw null;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetCustomerDividendSettingsRequest setCustomerDividendSettingsRequest = (SetCustomerDividendSettingsRequest) obj;
                reverseProtoWriter.getClass();
                setCustomerDividendSettingsRequest.getClass();
                reverseProtoWriter.writeBytes(setCustomerDividendSettingsRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, setCustomerDividendSettingsRequest.request_context);
                DividendSetting.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setCustomerDividendSettingsRequest.setting);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetCustomerDividendSettingsRequest setCustomerDividendSettingsRequest = (SetCustomerDividendSettingsRequest) obj;
                setCustomerDividendSettingsRequest.getClass();
                return RequestContext.ADAPTER.encodedSizeWithTag(2, setCustomerDividendSettingsRequest.request_context) + DividendSetting.ADAPTER.encodedSizeWithTag(1, setCustomerDividendSettingsRequest.setting) + setCustomerDividendSettingsRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetCustomerDividendSettingsRequest setCustomerDividendSettingsRequest = (SetCustomerDividendSettingsRequest) obj;
                setCustomerDividendSettingsRequest.getClass();
                RequestContext requestContext = setCustomerDividendSettingsRequest.request_context;
                return SetCustomerDividendSettingsRequest.copy$default(setCustomerDividendSettingsRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 1);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetCustomerDividendSettingsRequest setCustomerDividendSettingsRequest = (SetCustomerDividendSettingsRequest) obj;
                setCustomerDividendSettingsRequest.getClass();
                DividendSetting.ADAPTER.encodeWithTag(protoWriter, 1, setCustomerDividendSettingsRequest.setting);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 2, setCustomerDividendSettingsRequest.request_context);
                protoWriter.writeBytes(setCustomerDividendSettingsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetCustomerDividendSettingsRequest(DividendSetting dividendSetting, RequestContext requestContext, ByteString byteString) {
        super(ADAPTER, byteString);
        dividendSetting.getClass();
        byteString.getClass();
        this.setting = dividendSetting;
        this.request_context = requestContext;
    }

    public static SetCustomerDividendSettingsRequest copy$default(SetCustomerDividendSettingsRequest setCustomerDividendSettingsRequest, RequestContext requestContext, ByteString byteString, int i) {
        DividendSetting dividendSetting = setCustomerDividendSettingsRequest.setting;
        if ((i & 4) != 0) {
            byteString = setCustomerDividendSettingsRequest.unknownFields();
        }
        setCustomerDividendSettingsRequest.getClass();
        dividendSetting.getClass();
        byteString.getClass();
        return new SetCustomerDividendSettingsRequest(dividendSetting, requestContext, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetCustomerDividendSettingsRequest)) {
            return false;
        }
        SetCustomerDividendSettingsRequest setCustomerDividendSettingsRequest = (SetCustomerDividendSettingsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setCustomerDividendSettingsRequest.unknownFields()) && this.setting == setCustomerDividendSettingsRequest.setting && Intrinsics.areEqual(this.request_context, setCustomerDividendSettingsRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (this.setting.hashCode() + (unknownFields().hashCode() * 37)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = hashCode + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.Builder builder = new Card.Builder(9);
        builder.card_type = this.setting;
        builder.card_pii = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("setting=" + this.setting);
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetCustomerDividendSettingsRequest{", "}", 0, null, null, 56);
    }
}
