package com.squareup.protos.cash.cashcustomergateway.api.v1;

import android.os.Parcelable;
import com.squareup.protos.cash.cashface.api.Banner;
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
public final class LookupCashtagRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LookupCashtagRequest> CREATOR;
    public final String cashtag;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LookupCashtagRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashcustomergateway.api.v1.LookupCashtagRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new LookupCashtagRequest((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                LookupCashtagRequest lookupCashtagRequest = (LookupCashtagRequest) obj;
                reverseProtoWriter.getClass();
                lookupCashtagRequest.getClass();
                reverseProtoWriter.writeBytes(lookupCashtagRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, lookupCashtagRequest.cashtag);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                LookupCashtagRequest lookupCashtagRequest = (LookupCashtagRequest) obj;
                lookupCashtagRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(1, lookupCashtagRequest.cashtag) + lookupCashtagRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ((LookupCashtagRequest) obj).getClass();
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new LookupCashtagRequest(null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                LookupCashtagRequest lookupCashtagRequest = (LookupCashtagRequest) obj;
                lookupCashtagRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, lookupCashtagRequest.cashtag);
                protoWriter.writeBytes(lookupCashtagRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LookupCashtagRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.cashtag = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LookupCashtagRequest)) {
            return false;
        }
        LookupCashtagRequest lookupCashtagRequest = (LookupCashtagRequest) obj;
        return Intrinsics.areEqual(unknownFields(), lookupCashtagRequest.unknownFields()) && Intrinsics.areEqual(this.cashtag, lookupCashtagRequest.cashtag);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.cashtag;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Banner.Builder builder = new Banner.Builder(3);
        builder.banner_color = this.cashtag;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.cashtag != null) {
            arrayList.add("cashtag=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LookupCashtagRequest{", "}", 0, null, null, 56);
    }
}
