package com.squareup.protos.cash.cashliteflow.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.crypto.amount.CryptoAmount;
import com.squareup.protos.cash.cryptosparky.api.deposits.GenerateLightningInvoice$Request;
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
public final class GenerateLightningInvoiceRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GenerateLightningInvoiceRequest> CREATOR;
    public final CryptoAmount amount;
    public final String description;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public CryptoAmount amount;
        public String description;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new GenerateLightningInvoiceRequest(this.amount, this.description, buildUnknownFields());
                default:
                    return new GenerateLightningInvoice$Request(this.amount, this.description, buildUnknownFields());
            }
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GenerateLightningInvoiceRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashliteflow.api.v1.GenerateLightningInvoiceRequest$Companion$ADAPTER$1
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
                        return new GenerateLightningInvoiceRequest((CryptoAmount) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(CryptoAmount.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GenerateLightningInvoiceRequest generateLightningInvoiceRequest = (GenerateLightningInvoiceRequest) obj;
                reverseProtoWriter.getClass();
                generateLightningInvoiceRequest.getClass();
                reverseProtoWriter.writeBytes(generateLightningInvoiceRequest.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, generateLightningInvoiceRequest.description);
                CryptoAmount.ADAPTER.encodeWithTag(reverseProtoWriter, 1, generateLightningInvoiceRequest.amount);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GenerateLightningInvoiceRequest generateLightningInvoiceRequest = (GenerateLightningInvoiceRequest) obj;
                generateLightningInvoiceRequest.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(2, generateLightningInvoiceRequest.description) + CryptoAmount.ADAPTER.encodedSizeWithTag(1, generateLightningInvoiceRequest.amount) + generateLightningInvoiceRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GenerateLightningInvoiceRequest generateLightningInvoiceRequest = (GenerateLightningInvoiceRequest) obj;
                generateLightningInvoiceRequest.getClass();
                CryptoAmount cryptoAmount = generateLightningInvoiceRequest.amount;
                CryptoAmount cryptoAmount2 = cryptoAmount != null ? (CryptoAmount) CryptoAmount.ADAPTER.redact(cryptoAmount) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new GenerateLightningInvoiceRequest(cryptoAmount2, null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GenerateLightningInvoiceRequest generateLightningInvoiceRequest = (GenerateLightningInvoiceRequest) obj;
                generateLightningInvoiceRequest.getClass();
                CryptoAmount.ADAPTER.encodeWithTag(protoWriter, 1, generateLightningInvoiceRequest.amount);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, generateLightningInvoiceRequest.description);
                protoWriter.writeBytes(generateLightningInvoiceRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateLightningInvoiceRequest(CryptoAmount cryptoAmount, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.amount = cryptoAmount;
        this.description = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GenerateLightningInvoiceRequest)) {
            return false;
        }
        GenerateLightningInvoiceRequest generateLightningInvoiceRequest = (GenerateLightningInvoiceRequest) obj;
        return Intrinsics.areEqual(unknownFields(), generateLightningInvoiceRequest.unknownFields()) && Intrinsics.areEqual(this.amount, generateLightningInvoiceRequest.amount) && Intrinsics.areEqual(this.description, generateLightningInvoiceRequest.description);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CryptoAmount cryptoAmount = this.amount;
        int hashCode2 = (hashCode + (cryptoAmount != null ? cryptoAmount.hashCode() : 0)) * 37;
        String str = this.description;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.amount = this.amount;
        builder.description = this.description;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CryptoAmount cryptoAmount = this.amount;
        if (cryptoAmount != null) {
            arrayList.add("amount=" + cryptoAmount);
        }
        if (this.description != null) {
            arrayList.add("description=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GenerateLightningInvoiceRequest{", "}", 0, null, null, 56);
    }
}
