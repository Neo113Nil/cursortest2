package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.protos.cash.composer.app.Asset;
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
public final class OffersSheetRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OffersSheetRequest> CREATOR;
    public final OfferSheetKey key;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OffersSheetRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashsuggest.api.OffersSheetRequest$Companion$ADAPTER$1
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
                        return new OffersSheetRequest((OfferSheetKey) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(OfferSheetKey.ADAPTER, protoReader, obj);
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                OffersSheetRequest offersSheetRequest = (OffersSheetRequest) obj;
                reverseProtoWriter.getClass();
                offersSheetRequest.getClass();
                reverseProtoWriter.writeBytes(offersSheetRequest.unknownFields());
                OfferSheetKey.ADAPTER.encodeWithTag(reverseProtoWriter, 1, offersSheetRequest.key);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                OffersSheetRequest offersSheetRequest = (OffersSheetRequest) obj;
                offersSheetRequest.getClass();
                return OfferSheetKey.ADAPTER.encodedSizeWithTag(1, offersSheetRequest.key) + offersSheetRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                OffersSheetRequest offersSheetRequest = (OffersSheetRequest) obj;
                offersSheetRequest.getClass();
                OfferSheetKey offerSheetKey = offersSheetRequest.key;
                OfferSheetKey offerSheetKey2 = offerSheetKey != null ? (OfferSheetKey) OfferSheetKey.ADAPTER.redact(offerSheetKey) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new OffersSheetRequest(offerSheetKey2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                OffersSheetRequest offersSheetRequest = (OffersSheetRequest) obj;
                offersSheetRequest.getClass();
                OfferSheetKey.ADAPTER.encodeWithTag(protoWriter, 1, offersSheetRequest.key);
                protoWriter.writeBytes(offersSheetRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersSheetRequest(OfferSheetKey offerSheetKey, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.key = offerSheetKey;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OffersSheetRequest)) {
            return false;
        }
        OffersSheetRequest offersSheetRequest = (OffersSheetRequest) obj;
        return Intrinsics.areEqual(unknownFields(), offersSheetRequest.unknownFields()) && Intrinsics.areEqual(this.key, offersSheetRequest.key);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        OfferSheetKey offerSheetKey = this.key;
        int hashCode2 = hashCode + (offerSheetKey != null ? offerSheetKey.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Asset.Builder builder = new Asset.Builder(1);
        builder.asset_type = this.key;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        OfferSheetKey offerSheetKey = this.key;
        if (offerSheetKey != null) {
            arrayList.add("key=" + offerSheetKey);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OffersSheetRequest{", "}", 0, null, null, 56);
    }
}
