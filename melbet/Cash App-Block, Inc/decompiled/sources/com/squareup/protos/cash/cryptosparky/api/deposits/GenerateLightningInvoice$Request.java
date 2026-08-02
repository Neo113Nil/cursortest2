package com.squareup.protos.cash.cryptosparky.api.deposits;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.crypto.amount.CryptoAmount;
import com.squareup.protos.cash.cashliteflow.api.v1.GenerateLightningInvoiceRequest;
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
public final class GenerateLightningInvoice$Request extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GenerateLightningInvoice$Request> CREATOR;
    public final CryptoAmount amount;
    public final String description;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GenerateLightningInvoice$Request.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cryptosparky.api.deposits.GenerateLightningInvoice$Request$Companion$ADAPTER$1
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
                        return new GenerateLightningInvoice$Request((CryptoAmount) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                GenerateLightningInvoice$Request generateLightningInvoice$Request = (GenerateLightningInvoice$Request) obj;
                reverseProtoWriter.getClass();
                generateLightningInvoice$Request.getClass();
                reverseProtoWriter.writeBytes(generateLightningInvoice$Request.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, generateLightningInvoice$Request.description);
                CryptoAmount.ADAPTER.encodeWithTag(reverseProtoWriter, 1, generateLightningInvoice$Request.amount);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GenerateLightningInvoice$Request generateLightningInvoice$Request = (GenerateLightningInvoice$Request) obj;
                generateLightningInvoice$Request.getClass();
                return ProtoAdapter.STRING.encodedSizeWithTag(2, generateLightningInvoice$Request.description) + CryptoAmount.ADAPTER.encodedSizeWithTag(1, generateLightningInvoice$Request.amount) + generateLightningInvoice$Request.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GenerateLightningInvoice$Request generateLightningInvoice$Request = (GenerateLightningInvoice$Request) obj;
                generateLightningInvoice$Request.getClass();
                CryptoAmount cryptoAmount = generateLightningInvoice$Request.amount;
                CryptoAmount cryptoAmount2 = cryptoAmount != null ? (CryptoAmount) CryptoAmount.ADAPTER.redact(cryptoAmount) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new GenerateLightningInvoice$Request(cryptoAmount2, null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GenerateLightningInvoice$Request generateLightningInvoice$Request = (GenerateLightningInvoice$Request) obj;
                generateLightningInvoice$Request.getClass();
                CryptoAmount.ADAPTER.encodeWithTag(protoWriter, 1, generateLightningInvoice$Request.amount);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, generateLightningInvoice$Request.description);
                protoWriter.writeBytes(generateLightningInvoice$Request.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateLightningInvoice$Request(CryptoAmount cryptoAmount, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.amount = cryptoAmount;
        this.description = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GenerateLightningInvoice$Request)) {
            return false;
        }
        GenerateLightningInvoice$Request generateLightningInvoice$Request = (GenerateLightningInvoice$Request) obj;
        return Intrinsics.areEqual(unknownFields(), generateLightningInvoice$Request.unknownFields()) && Intrinsics.areEqual(this.amount, generateLightningInvoice$Request.amount) && Intrinsics.areEqual(this.description, generateLightningInvoice$Request.description);
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
        GenerateLightningInvoiceRequest.Builder builder = new GenerateLightningInvoiceRequest.Builder(1);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "Request{", "}", 0, null, null, 56);
    }

    public /* synthetic */ GenerateLightningInvoice$Request(CryptoAmount cryptoAmount, String str) {
        this(cryptoAmount, str, ByteString.EMPTY);
    }
}
