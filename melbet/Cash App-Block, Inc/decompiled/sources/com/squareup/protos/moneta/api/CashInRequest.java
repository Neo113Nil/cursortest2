package com.squareup.protos.moneta.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.core.model.DigitalWalletType;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.person.Alias;
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
public final class CashInRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashInRequest> CREATOR;
    public final Money amount;
    public final DigitalWalletType client_verified_digital_wallet;
    public final String external_id;
    public final String passcode_token;
    public final RequestContext request_context;
    public final Instrument source;
    public final Instrument target;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CashInRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.moneta.api.CashInRequest$Companion$ADAPTER$1
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
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new CashInRequest((RequestContext) obj, (String) obj2, (Instrument) obj3, (Instrument) obj4, (Money) obj5, (String) obj6, (DigitalWalletType) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            obj3 = TransactorKt.decodeMessageOrMerge(Instrument.ADAPTER, protoReader, obj3);
                            break;
                        case 4:
                            obj4 = TransactorKt.decodeMessageOrMerge(Instrument.ADAPTER, protoReader, obj4);
                            break;
                        case 5:
                            obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            try {
                                obj7 = DigitalWalletType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                CashInRequest cashInRequest = (CashInRequest) obj;
                reverseProtoWriter.getClass();
                cashInRequest.getClass();
                reverseProtoWriter.writeBytes(cashInRequest.unknownFields());
                DigitalWalletType.ADAPTER.encodeWithTag(reverseProtoWriter, 7, cashInRequest.client_verified_digital_wallet);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, cashInRequest.passcode_token);
                Money.ADAPTER.encodeWithTag(reverseProtoWriter, 5, cashInRequest.amount);
                ProtoAdapter protoAdapter3 = Instrument.ADAPTER;
                protoAdapter3.encodeWithTag(reverseProtoWriter, 4, cashInRequest.target);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 3, cashInRequest.source);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, cashInRequest.external_id);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cashInRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                CashInRequest cashInRequest = (CashInRequest) obj;
                cashInRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(1, cashInRequest.request_context) + cashInRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(2, cashInRequest.external_id) + encodedSizeWithTag;
                ProtoAdapter protoAdapter3 = Instrument.ADAPTER;
                return DigitalWalletType.ADAPTER.encodedSizeWithTag(7, cashInRequest.client_verified_digital_wallet) + protoAdapter2.encodedSizeWithTag(6, cashInRequest.passcode_token) + Money.ADAPTER.encodedSizeWithTag(5, cashInRequest.amount) + protoAdapter3.encodedSizeWithTag(4, cashInRequest.target) + protoAdapter3.encodedSizeWithTag(3, cashInRequest.source) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                CashInRequest cashInRequest = (CashInRequest) obj;
                cashInRequest.getClass();
                RequestContext requestContext = cashInRequest.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                Instrument instrument = cashInRequest.source;
                Instrument instrument2 = instrument != null ? (Instrument) Instrument.ADAPTER.redact(instrument) : null;
                Instrument instrument3 = cashInRequest.target;
                Instrument instrument4 = instrument3 != null ? (Instrument) Instrument.ADAPTER.redact(instrument3) : null;
                Money money = cashInRequest.amount;
                return CashInRequest.copy$default(cashInRequest, requestContext2, instrument2, instrument4, money != null ? (Money) Money.ADAPTER.redact(money) : null, ByteString.EMPTY, 66);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                CashInRequest cashInRequest = (CashInRequest) obj;
                cashInRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, cashInRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 2, cashInRequest.external_id);
                ProtoAdapter protoAdapter3 = Instrument.ADAPTER;
                protoAdapter3.encodeWithTag(protoWriter, 3, cashInRequest.source);
                protoAdapter3.encodeWithTag(protoWriter, 4, cashInRequest.target);
                Money.ADAPTER.encodeWithTag(protoWriter, 5, cashInRequest.amount);
                protoAdapter2.encodeWithTag(protoWriter, 6, cashInRequest.passcode_token);
                DigitalWalletType.ADAPTER.encodeWithTag(protoWriter, 7, cashInRequest.client_verified_digital_wallet);
                protoWriter.writeBytes(cashInRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashInRequest(RequestContext requestContext, String str, Instrument instrument, Instrument instrument2, Money money, String str2, DigitalWalletType digitalWalletType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.external_id = str;
        this.source = instrument;
        this.target = instrument2;
        this.amount = money;
        this.passcode_token = str2;
        this.client_verified_digital_wallet = digitalWalletType;
    }

    public static CashInRequest copy$default(CashInRequest cashInRequest, RequestContext requestContext, Instrument instrument, Instrument instrument2, Money money, ByteString byteString, int i) {
        String str = cashInRequest.external_id;
        if ((i & 4) != 0) {
            instrument = cashInRequest.source;
        }
        Instrument instrument3 = instrument;
        if ((i & 8) != 0) {
            instrument2 = cashInRequest.target;
        }
        Instrument instrument4 = instrument2;
        if ((i & 16) != 0) {
            money = cashInRequest.amount;
        }
        Money money2 = money;
        String str2 = (i & 32) != 0 ? cashInRequest.passcode_token : null;
        DigitalWalletType digitalWalletType = cashInRequest.client_verified_digital_wallet;
        if ((i & 128) != 0) {
            byteString = cashInRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        cashInRequest.getClass();
        byteString2.getClass();
        return new CashInRequest(requestContext, str, instrument3, instrument4, money2, str2, digitalWalletType, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashInRequest)) {
            return false;
        }
        CashInRequest cashInRequest = (CashInRequest) obj;
        return Intrinsics.areEqual(unknownFields(), cashInRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, cashInRequest.request_context) && Intrinsics.areEqual(this.external_id, cashInRequest.external_id) && Intrinsics.areEqual(this.source, cashInRequest.source) && Intrinsics.areEqual(this.target, cashInRequest.target) && Intrinsics.areEqual(this.amount, cashInRequest.amount) && Intrinsics.areEqual(this.passcode_token, cashInRequest.passcode_token) && this.client_verified_digital_wallet == cashInRequest.client_verified_digital_wallet;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.external_id;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Instrument instrument = this.source;
        int hashCode4 = (hashCode3 + (instrument != null ? instrument.hashCode() : 0)) * 37;
        Instrument instrument2 = this.target;
        int hashCode5 = (hashCode4 + (instrument2 != null ? instrument2.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode6 = (hashCode5 + (money != null ? money.hashCode() : 0)) * 37;
        String str2 = this.passcode_token;
        int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
        DigitalWalletType digitalWalletType = this.client_verified_digital_wallet;
        int hashCode8 = hashCode7 + (digitalWalletType != null ? digitalWalletType.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(20, false);
        builder.f1407type = this.request_context;
        builder.scope = this.external_id;
        builder.first_verified_at_ms = this.source;
        builder.last_verified_at_ms = this.target;
        builder.created_at = this.amount;
        builder.value = this.passcode_token;
        builder.updated_at = this.client_verified_digital_wallet;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.external_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "external_id=", arrayList);
        }
        Instrument instrument = this.source;
        if (instrument != null) {
            arrayList.add("source=" + instrument);
        }
        Instrument instrument2 = this.target;
        if (instrument2 != null) {
            arrayList.add("target=" + instrument2);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        if (this.passcode_token != null) {
            arrayList.add("passcode_token=██");
        }
        DigitalWalletType digitalWalletType = this.client_verified_digital_wallet;
        if (digitalWalletType != null) {
            arrayList.add("client_verified_digital_wallet=" + digitalWalletType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashInRequest{", "}", 0, null, null, 56);
    }
}
