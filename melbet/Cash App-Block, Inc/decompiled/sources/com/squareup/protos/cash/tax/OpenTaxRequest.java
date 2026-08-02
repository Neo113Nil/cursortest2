package com.squareup.protos.cash.tax;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.SplitButtons;
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
public final class OpenTaxRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OpenTaxRequest> CREATOR;
    public final String deep_link_url;
    public final TaxEnvironment tax_environment;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OpenTaxRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.tax.OpenTaxRequest$Companion$ADAPTER$1
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
                        return new OpenTaxRequest((String) obj, (TaxEnvironment) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
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
                OpenTaxRequest openTaxRequest = (OpenTaxRequest) obj;
                reverseProtoWriter.getClass();
                openTaxRequest.getClass();
                reverseProtoWriter.writeBytes(openTaxRequest.unknownFields());
                TaxEnvironment.ADAPTER.encodeWithTag(reverseProtoWriter, 2, openTaxRequest.tax_environment);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, openTaxRequest.deep_link_url);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                OpenTaxRequest openTaxRequest = (OpenTaxRequest) obj;
                openTaxRequest.getClass();
                return TaxEnvironment.ADAPTER.encodedSizeWithTag(2, openTaxRequest.tax_environment) + ProtoAdapter.STRING.encodedSizeWithTag(1, openTaxRequest.deep_link_url) + openTaxRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                OpenTaxRequest openTaxRequest = (OpenTaxRequest) obj;
                openTaxRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = openTaxRequest.deep_link_url;
                TaxEnvironment taxEnvironment = openTaxRequest.tax_environment;
                byteString.getClass();
                return new OpenTaxRequest(str, taxEnvironment, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                OpenTaxRequest openTaxRequest = (OpenTaxRequest) obj;
                openTaxRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, openTaxRequest.deep_link_url);
                TaxEnvironment.ADAPTER.encodeWithTag(protoWriter, 2, openTaxRequest.tax_environment);
                protoWriter.writeBytes(openTaxRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenTaxRequest(String str, TaxEnvironment taxEnvironment, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.deep_link_url = str;
        this.tax_environment = taxEnvironment;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OpenTaxRequest)) {
            return false;
        }
        OpenTaxRequest openTaxRequest = (OpenTaxRequest) obj;
        return Intrinsics.areEqual(unknownFields(), openTaxRequest.unknownFields()) && Intrinsics.areEqual(this.deep_link_url, openTaxRequest.deep_link_url) && this.tax_environment == openTaxRequest.tax_environment;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.deep_link_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        TaxEnvironment taxEnvironment = this.tax_environment;
        int hashCode3 = hashCode2 + (taxEnvironment != null ? taxEnvironment.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SplitButtons.Builder builder = new SplitButtons.Builder(16);
        builder.primary_button = this.deep_link_url;
        builder.secondary_button = this.tax_environment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.deep_link_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "deep_link_url=", arrayList);
        }
        TaxEnvironment taxEnvironment = this.tax_environment;
        if (taxEnvironment != null) {
            arrayList.add("tax_environment=" + taxEnvironment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OpenTaxRequest{", "}", 0, null, null, 56);
    }
}
