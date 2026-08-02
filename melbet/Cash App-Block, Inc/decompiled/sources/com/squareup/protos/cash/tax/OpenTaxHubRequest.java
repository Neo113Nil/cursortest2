package com.squareup.protos.cash.tax;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.SplitButtons;
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
public final class OpenTaxHubRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OpenTaxHubRequest> CREATOR;
    public final RequestContext request_context;
    public final TaxEnvironment tax_environment;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OpenTaxHubRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.tax.OpenTaxHubRequest$Companion$ADAPTER$1
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
                        return new OpenTaxHubRequest((RequestContext) obj, (TaxEnvironment) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj2 = TaxEnvironment.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                OpenTaxHubRequest openTaxHubRequest = (OpenTaxHubRequest) obj;
                reverseProtoWriter.getClass();
                openTaxHubRequest.getClass();
                reverseProtoWriter.writeBytes(openTaxHubRequest.unknownFields());
                TaxEnvironment.ADAPTER.encodeWithTag(reverseProtoWriter, 2, openTaxHubRequest.tax_environment);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, openTaxHubRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                OpenTaxHubRequest openTaxHubRequest = (OpenTaxHubRequest) obj;
                openTaxHubRequest.getClass();
                return TaxEnvironment.ADAPTER.encodedSizeWithTag(2, openTaxHubRequest.tax_environment) + RequestContext.ADAPTER.encodedSizeWithTag(1, openTaxHubRequest.request_context) + openTaxHubRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                OpenTaxHubRequest openTaxHubRequest = (OpenTaxHubRequest) obj;
                openTaxHubRequest.getClass();
                RequestContext requestContext = openTaxHubRequest.request_context;
                return OpenTaxHubRequest.copy$default(openTaxHubRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                OpenTaxHubRequest openTaxHubRequest = (OpenTaxHubRequest) obj;
                openTaxHubRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, openTaxHubRequest.request_context);
                TaxEnvironment.ADAPTER.encodeWithTag(protoWriter, 2, openTaxHubRequest.tax_environment);
                protoWriter.writeBytes(openTaxHubRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenTaxHubRequest(RequestContext requestContext, TaxEnvironment taxEnvironment, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.tax_environment = taxEnvironment;
    }

    public static OpenTaxHubRequest copy$default(OpenTaxHubRequest openTaxHubRequest, RequestContext requestContext, ByteString byteString, int i) {
        TaxEnvironment taxEnvironment = openTaxHubRequest.tax_environment;
        if ((i & 4) != 0) {
            byteString = openTaxHubRequest.unknownFields();
        }
        openTaxHubRequest.getClass();
        byteString.getClass();
        return new OpenTaxHubRequest(requestContext, taxEnvironment, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OpenTaxHubRequest)) {
            return false;
        }
        OpenTaxHubRequest openTaxHubRequest = (OpenTaxHubRequest) obj;
        return Intrinsics.areEqual(unknownFields(), openTaxHubRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, openTaxHubRequest.request_context) && this.tax_environment == openTaxHubRequest.tax_environment;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        TaxEnvironment taxEnvironment = this.tax_environment;
        int hashCode3 = hashCode2 + (taxEnvironment != null ? taxEnvironment.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SplitButtons.Builder builder = new SplitButtons.Builder(15);
        builder.primary_button = this.request_context;
        builder.secondary_button = this.tax_environment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        TaxEnvironment taxEnvironment = this.tax_environment;
        if (taxEnvironment != null) {
            arrayList.add("tax_environment=" + taxEnvironment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OpenTaxHubRequest{", "}", 0, null, null, 56);
    }
}
