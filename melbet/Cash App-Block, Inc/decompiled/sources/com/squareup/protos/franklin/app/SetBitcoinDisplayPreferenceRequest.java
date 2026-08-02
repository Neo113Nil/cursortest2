package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.SetAmountRequest;
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
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes.dex */
public final class SetBitcoinDisplayPreferenceRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetBitcoinDisplayPreferenceRequest> CREATOR;
    public final BitcoinDisplayUnits display_units;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetBitcoinDisplayPreferenceRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.SetBitcoinDisplayPreferenceRequest$Companion$ADAPTER$1
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
                        return new SetBitcoinDisplayPreferenceRequest((BitcoinDisplayUnits) obj, (RequestContext) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = BitcoinDisplayUnits.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetBitcoinDisplayPreferenceRequest setBitcoinDisplayPreferenceRequest = (SetBitcoinDisplayPreferenceRequest) obj;
                reverseProtoWriter.getClass();
                setBitcoinDisplayPreferenceRequest.getClass();
                reverseProtoWriter.writeBytes(setBitcoinDisplayPreferenceRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, setBitcoinDisplayPreferenceRequest.request_context);
                BitcoinDisplayUnits.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setBitcoinDisplayPreferenceRequest.display_units);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetBitcoinDisplayPreferenceRequest setBitcoinDisplayPreferenceRequest = (SetBitcoinDisplayPreferenceRequest) obj;
                setBitcoinDisplayPreferenceRequest.getClass();
                return RequestContext.ADAPTER.encodedSizeWithTag(2, setBitcoinDisplayPreferenceRequest.request_context) + BitcoinDisplayUnits.ADAPTER.encodedSizeWithTag(1, setBitcoinDisplayPreferenceRequest.display_units) + setBitcoinDisplayPreferenceRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetBitcoinDisplayPreferenceRequest setBitcoinDisplayPreferenceRequest = (SetBitcoinDisplayPreferenceRequest) obj;
                setBitcoinDisplayPreferenceRequest.getClass();
                RequestContext requestContext = setBitcoinDisplayPreferenceRequest.request_context;
                return SetBitcoinDisplayPreferenceRequest.copy$default(setBitcoinDisplayPreferenceRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 1);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetBitcoinDisplayPreferenceRequest setBitcoinDisplayPreferenceRequest = (SetBitcoinDisplayPreferenceRequest) obj;
                setBitcoinDisplayPreferenceRequest.getClass();
                BitcoinDisplayUnits.ADAPTER.encodeWithTag(protoWriter, 1, setBitcoinDisplayPreferenceRequest.display_units);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 2, setBitcoinDisplayPreferenceRequest.request_context);
                protoWriter.writeBytes(setBitcoinDisplayPreferenceRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetBitcoinDisplayPreferenceRequest(BitcoinDisplayUnits bitcoinDisplayUnits, RequestContext requestContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.display_units = bitcoinDisplayUnits;
        this.request_context = requestContext;
    }

    public static SetBitcoinDisplayPreferenceRequest copy$default(SetBitcoinDisplayPreferenceRequest setBitcoinDisplayPreferenceRequest, RequestContext requestContext, ByteString byteString, int i) {
        BitcoinDisplayUnits bitcoinDisplayUnits = setBitcoinDisplayPreferenceRequest.display_units;
        if ((i & 4) != 0) {
            byteString = setBitcoinDisplayPreferenceRequest.unknownFields();
        }
        setBitcoinDisplayPreferenceRequest.getClass();
        byteString.getClass();
        return new SetBitcoinDisplayPreferenceRequest(bitcoinDisplayUnits, requestContext, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetBitcoinDisplayPreferenceRequest)) {
            return false;
        }
        SetBitcoinDisplayPreferenceRequest setBitcoinDisplayPreferenceRequest = (SetBitcoinDisplayPreferenceRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setBitcoinDisplayPreferenceRequest.unknownFields()) && this.display_units == setBitcoinDisplayPreferenceRequest.display_units && Intrinsics.areEqual(this.request_context, setBitcoinDisplayPreferenceRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BitcoinDisplayUnits bitcoinDisplayUnits = this.display_units;
        int hashCode2 = (hashCode + (bitcoinDisplayUnits != null ? bitcoinDisplayUnits.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode3 = hashCode2 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SetAmountRequest.Builder builder = new SetAmountRequest.Builder(5);
        builder.result = this.display_units;
        builder.request_context = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BitcoinDisplayUnits bitcoinDisplayUnits = this.display_units;
        if (bitcoinDisplayUnits != null) {
            arrayList.add("display_units=" + bitcoinDisplayUnits);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetBitcoinDisplayPreferenceRequest{", "}", 0, null, null, 56);
    }
}
