package com.squareup.protos.cash.tax;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.CardScheme;
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
public final class TaxDeepLinkRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TaxDeepLinkRequest> CREATOR;
    public final String link_url;
    public final RequestContext request_context;
    public final TaxEnvironment tax_environment;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TaxDeepLinkRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.tax.TaxDeepLinkRequest$Companion$ADAPTER$1
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
                Object obj3 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new TaxDeepLinkRequest((RequestContext) obj, (String) obj2, (TaxEnvironment) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj3 = TaxEnvironment.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                TaxDeepLinkRequest taxDeepLinkRequest = (TaxDeepLinkRequest) obj;
                reverseProtoWriter.getClass();
                taxDeepLinkRequest.getClass();
                reverseProtoWriter.writeBytes(taxDeepLinkRequest.unknownFields());
                TaxEnvironment.ADAPTER.encodeWithTag(reverseProtoWriter, 3, taxDeepLinkRequest.tax_environment);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, taxDeepLinkRequest.link_url);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, taxDeepLinkRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                TaxDeepLinkRequest taxDeepLinkRequest = (TaxDeepLinkRequest) obj;
                taxDeepLinkRequest.getClass();
                return TaxEnvironment.ADAPTER.encodedSizeWithTag(3, taxDeepLinkRequest.tax_environment) + ProtoAdapter.STRING.encodedSizeWithTag(2, taxDeepLinkRequest.link_url) + RequestContext.ADAPTER.encodedSizeWithTag(1, taxDeepLinkRequest.request_context) + taxDeepLinkRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                TaxDeepLinkRequest taxDeepLinkRequest = (TaxDeepLinkRequest) obj;
                taxDeepLinkRequest.getClass();
                RequestContext requestContext = taxDeepLinkRequest.request_context;
                return TaxDeepLinkRequest.copy$default(taxDeepLinkRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 6);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                TaxDeepLinkRequest taxDeepLinkRequest = (TaxDeepLinkRequest) obj;
                taxDeepLinkRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, taxDeepLinkRequest.request_context);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, taxDeepLinkRequest.link_url);
                TaxEnvironment.ADAPTER.encodeWithTag(protoWriter, 3, taxDeepLinkRequest.tax_environment);
                protoWriter.writeBytes(taxDeepLinkRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxDeepLinkRequest(RequestContext requestContext, String str, TaxEnvironment taxEnvironment, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.link_url = str;
        this.tax_environment = taxEnvironment;
    }

    public static TaxDeepLinkRequest copy$default(TaxDeepLinkRequest taxDeepLinkRequest, RequestContext requestContext, ByteString byteString, int i) {
        String str = taxDeepLinkRequest.link_url;
        TaxEnvironment taxEnvironment = taxDeepLinkRequest.tax_environment;
        if ((i & 8) != 0) {
            byteString = taxDeepLinkRequest.unknownFields();
        }
        taxDeepLinkRequest.getClass();
        byteString.getClass();
        return new TaxDeepLinkRequest(requestContext, str, taxEnvironment, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TaxDeepLinkRequest)) {
            return false;
        }
        TaxDeepLinkRequest taxDeepLinkRequest = (TaxDeepLinkRequest) obj;
        return Intrinsics.areEqual(unknownFields(), taxDeepLinkRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, taxDeepLinkRequest.request_context) && Intrinsics.areEqual(this.link_url, taxDeepLinkRequest.link_url) && this.tax_environment == taxDeepLinkRequest.tax_environment;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.link_url;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        TaxEnvironment taxEnvironment = this.tax_environment;
        int hashCode4 = hashCode3 + (taxEnvironment != null ? taxEnvironment.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardScheme.Builder builder = new CardScheme.Builder(29);
        builder.modules = this.request_context;
        builder.overflow_modules = this.link_url;
        builder.card_home_actions = this.tax_environment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.link_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "link_url=", arrayList);
        }
        TaxEnvironment taxEnvironment = this.tax_environment;
        if (taxEnvironment != null) {
            arrayList.add("tax_environment=" + taxEnvironment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxDeepLinkRequest{", "}", 0, null, null, 56);
    }
}
