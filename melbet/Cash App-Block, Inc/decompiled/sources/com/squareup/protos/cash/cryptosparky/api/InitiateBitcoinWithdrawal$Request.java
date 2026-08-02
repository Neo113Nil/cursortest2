package com.squareup.protos.cash.cryptosparky.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import app.cash.zipline.internal.LogAndroidKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.CryptoPaymentEntryPoint;
import com.squareup.cash.crypto.amount.CryptoAmount;
import com.squareup.protos.cash.janus.api.ContactAlias;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class InitiateBitcoinWithdrawal$Request extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InitiateBitcoinWithdrawal$Request> CREATOR;
    public final CryptoAmount customer_supplied_amount;
    public final String deposit_transaction_token;
    public final CryptoPaymentEntryPoint entry_point;
    public final String external_id;
    public final String passcode_token;
    public final RequestContext request_context;
    public final LogAndroidKt withdrawalType;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InitiateBitcoinWithdrawal$Request.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cryptosparky.api.InitiateBitcoinWithdrawal$Request$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                LogAndroidKt initiateBitcoinWithdrawal$Request$WithdrawalType$WithdrawalDestination;
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                LogAndroidKt logAndroidKt = null;
                Object obj6 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new InitiateBitcoinWithdrawal$Request((String) obj, (RequestContext) obj2, logAndroidKt, (String) obj3, (CryptoAmount) obj4, (String) obj5, (CryptoPaymentEntryPoint) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 2:
                            obj2 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj2);
                            continue;
                        case 3:
                            initiateBitcoinWithdrawal$Request$WithdrawalType$WithdrawalDestination = new InitiateBitcoinWithdrawal$Request$WithdrawalType$WithdrawalDestination((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            initiateBitcoinWithdrawal$Request$WithdrawalType$WithdrawalDestination = new InitiateBitcoinWithdrawal$Request$WithdrawalType$DisplayId((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            obj3 = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 6:
                            obj4 = TransactorKt.decodeMessageOrMerge(CryptoAmount.ADAPTER, protoReader, obj4);
                            continue;
                        case 7:
                            obj5 = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 8:
                            initiateBitcoinWithdrawal$Request$WithdrawalType$WithdrawalDestination = new InitiateBitcoinWithdrawal$Request$WithdrawalType$SendBitcoinToken((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            try {
                                obj6 = CryptoPaymentEntryPoint.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        default:
                            protoReader.readUnknownField(nextTag);
                            continue;
                    }
                    logAndroidKt = initiateBitcoinWithdrawal$Request$WithdrawalType$WithdrawalDestination;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                InitiateBitcoinWithdrawal$Request initiateBitcoinWithdrawal$Request = (InitiateBitcoinWithdrawal$Request) obj;
                reverseProtoWriter.getClass();
                initiateBitcoinWithdrawal$Request.getClass();
                reverseProtoWriter.writeBytes(initiateBitcoinWithdrawal$Request.unknownFields());
                LogAndroidKt logAndroidKt = initiateBitcoinWithdrawal$Request.withdrawalType;
                if (logAndroidKt instanceof InitiateBitcoinWithdrawal$Request$WithdrawalType$WithdrawalDestination) {
                    ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, ((InitiateBitcoinWithdrawal$Request$WithdrawalType$WithdrawalDestination) logAndroidKt).value);
                } else if (logAndroidKt instanceof InitiateBitcoinWithdrawal$Request$WithdrawalType$DisplayId) {
                    ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, ((InitiateBitcoinWithdrawal$Request$WithdrawalType$DisplayId) logAndroidKt).value);
                } else if (logAndroidKt instanceof InitiateBitcoinWithdrawal$Request$WithdrawalType$SendBitcoinToken) {
                    ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 8, ((InitiateBitcoinWithdrawal$Request$WithdrawalType$SendBitcoinToken) logAndroidKt).value);
                } else if (logAndroidKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                CryptoPaymentEntryPoint.ADAPTER.encodeWithTag(reverseProtoWriter, 9, initiateBitcoinWithdrawal$Request.entry_point);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 7, initiateBitcoinWithdrawal$Request.deposit_transaction_token);
                CryptoAmount.ADAPTER.encodeWithTag(reverseProtoWriter, 6, initiateBitcoinWithdrawal$Request.customer_supplied_amount);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, initiateBitcoinWithdrawal$Request.passcode_token);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, initiateBitcoinWithdrawal$Request.request_context);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, initiateBitcoinWithdrawal$Request.external_id);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                int encodedSizeWithTag;
                InitiateBitcoinWithdrawal$Request initiateBitcoinWithdrawal$Request = (InitiateBitcoinWithdrawal$Request) obj;
                initiateBitcoinWithdrawal$Request.getClass();
                int size$okio = initiateBitcoinWithdrawal$Request.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag2 = RequestContext.ADAPTER.encodedSizeWithTag(2, initiateBitcoinWithdrawal$Request.request_context) + protoAdapter2.encodedSizeWithTag(1, initiateBitcoinWithdrawal$Request.external_id) + size$okio;
                LogAndroidKt logAndroidKt = initiateBitcoinWithdrawal$Request.withdrawalType;
                if (logAndroidKt instanceof InitiateBitcoinWithdrawal$Request$WithdrawalType$WithdrawalDestination) {
                    encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(3, ((InitiateBitcoinWithdrawal$Request$WithdrawalType$WithdrawalDestination) logAndroidKt).value);
                } else if (logAndroidKt instanceof InitiateBitcoinWithdrawal$Request$WithdrawalType$DisplayId) {
                    encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(4, ((InitiateBitcoinWithdrawal$Request$WithdrawalType$DisplayId) logAndroidKt).value);
                } else {
                    if (!(logAndroidKt instanceof InitiateBitcoinWithdrawal$Request$WithdrawalType$SendBitcoinToken)) {
                        if (logAndroidKt != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        return CryptoPaymentEntryPoint.ADAPTER.encodedSizeWithTag(9, initiateBitcoinWithdrawal$Request.entry_point) + protoAdapter2.encodedSizeWithTag(7, initiateBitcoinWithdrawal$Request.deposit_transaction_token) + CryptoAmount.ADAPTER.encodedSizeWithTag(6, initiateBitcoinWithdrawal$Request.customer_supplied_amount) + protoAdapter2.encodedSizeWithTag(5, initiateBitcoinWithdrawal$Request.passcode_token) + encodedSizeWithTag2;
                    }
                    encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(8, ((InitiateBitcoinWithdrawal$Request$WithdrawalType$SendBitcoinToken) logAndroidKt).value);
                }
                encodedSizeWithTag2 += encodedSizeWithTag;
                return CryptoPaymentEntryPoint.ADAPTER.encodedSizeWithTag(9, initiateBitcoinWithdrawal$Request.entry_point) + protoAdapter2.encodedSizeWithTag(7, initiateBitcoinWithdrawal$Request.deposit_transaction_token) + CryptoAmount.ADAPTER.encodedSizeWithTag(6, initiateBitcoinWithdrawal$Request.customer_supplied_amount) + protoAdapter2.encodedSizeWithTag(5, initiateBitcoinWithdrawal$Request.passcode_token) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                InitiateBitcoinWithdrawal$Request initiateBitcoinWithdrawal$Request = (InitiateBitcoinWithdrawal$Request) obj;
                initiateBitcoinWithdrawal$Request.getClass();
                RequestContext requestContext = initiateBitcoinWithdrawal$Request.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                CryptoAmount cryptoAmount = initiateBitcoinWithdrawal$Request.customer_supplied_amount;
                return InitiateBitcoinWithdrawal$Request.copy$default(initiateBitcoinWithdrawal$Request, requestContext2, cryptoAmount != null ? (CryptoAmount) CryptoAmount.ADAPTER.redact(cryptoAmount) : null, ByteString.EMPTY, 97);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                InitiateBitcoinWithdrawal$Request initiateBitcoinWithdrawal$Request = (InitiateBitcoinWithdrawal$Request) obj;
                initiateBitcoinWithdrawal$Request.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, initiateBitcoinWithdrawal$Request.external_id);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 2, initiateBitcoinWithdrawal$Request.request_context);
                protoAdapter2.encodeWithTag(protoWriter, 5, initiateBitcoinWithdrawal$Request.passcode_token);
                CryptoAmount.ADAPTER.encodeWithTag(protoWriter, 6, initiateBitcoinWithdrawal$Request.customer_supplied_amount);
                protoAdapter2.encodeWithTag(protoWriter, 7, initiateBitcoinWithdrawal$Request.deposit_transaction_token);
                CryptoPaymentEntryPoint.ADAPTER.encodeWithTag(protoWriter, 9, initiateBitcoinWithdrawal$Request.entry_point);
                LogAndroidKt logAndroidKt = initiateBitcoinWithdrawal$Request.withdrawalType;
                if (logAndroidKt instanceof InitiateBitcoinWithdrawal$Request$WithdrawalType$WithdrawalDestination) {
                    protoAdapter2.encodeWithTag(protoWriter, 3, ((InitiateBitcoinWithdrawal$Request$WithdrawalType$WithdrawalDestination) logAndroidKt).value);
                } else if (logAndroidKt instanceof InitiateBitcoinWithdrawal$Request$WithdrawalType$DisplayId) {
                    protoAdapter2.encodeWithTag(protoWriter, 4, ((InitiateBitcoinWithdrawal$Request$WithdrawalType$DisplayId) logAndroidKt).value);
                } else if (logAndroidKt instanceof InitiateBitcoinWithdrawal$Request$WithdrawalType$SendBitcoinToken) {
                    protoAdapter2.encodeWithTag(protoWriter, 8, ((InitiateBitcoinWithdrawal$Request$WithdrawalType$SendBitcoinToken) logAndroidKt).value);
                } else if (logAndroidKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                protoWriter.writeBytes(initiateBitcoinWithdrawal$Request.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public /* synthetic */ InitiateBitcoinWithdrawal$Request(String str, RequestContext requestContext, LogAndroidKt logAndroidKt, CryptoAmount cryptoAmount, String str2, CryptoPaymentEntryPoint cryptoPaymentEntryPoint, int i) {
        this(str, requestContext, logAndroidKt, null, (i & 16) != 0 ? null : cryptoAmount, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : cryptoPaymentEntryPoint, ByteString.EMPTY);
    }

    public static InitiateBitcoinWithdrawal$Request copy$default(InitiateBitcoinWithdrawal$Request initiateBitcoinWithdrawal$Request, RequestContext requestContext, CryptoAmount cryptoAmount, ByteString byteString, int i) {
        String str = initiateBitcoinWithdrawal$Request.external_id;
        LogAndroidKt logAndroidKt = (i & 4) != 0 ? initiateBitcoinWithdrawal$Request.withdrawalType : null;
        String str2 = (i & 8) != 0 ? initiateBitcoinWithdrawal$Request.passcode_token : null;
        if ((i & 16) != 0) {
            cryptoAmount = initiateBitcoinWithdrawal$Request.customer_supplied_amount;
        }
        CryptoAmount cryptoAmount2 = cryptoAmount;
        String str3 = initiateBitcoinWithdrawal$Request.deposit_transaction_token;
        CryptoPaymentEntryPoint cryptoPaymentEntryPoint = initiateBitcoinWithdrawal$Request.entry_point;
        if ((i & 128) != 0) {
            byteString = initiateBitcoinWithdrawal$Request.unknownFields();
        }
        ByteString byteString2 = byteString;
        initiateBitcoinWithdrawal$Request.getClass();
        byteString2.getClass();
        return new InitiateBitcoinWithdrawal$Request(str, requestContext, logAndroidKt, str2, cryptoAmount2, str3, cryptoPaymentEntryPoint, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InitiateBitcoinWithdrawal$Request)) {
            return false;
        }
        InitiateBitcoinWithdrawal$Request initiateBitcoinWithdrawal$Request = (InitiateBitcoinWithdrawal$Request) obj;
        return Intrinsics.areEqual(unknownFields(), initiateBitcoinWithdrawal$Request.unknownFields()) && Intrinsics.areEqual(this.external_id, initiateBitcoinWithdrawal$Request.external_id) && Intrinsics.areEqual(this.request_context, initiateBitcoinWithdrawal$Request.request_context) && Intrinsics.areEqual(this.withdrawalType, initiateBitcoinWithdrawal$Request.withdrawalType) && Intrinsics.areEqual(this.passcode_token, initiateBitcoinWithdrawal$Request.passcode_token) && Intrinsics.areEqual(this.customer_supplied_amount, initiateBitcoinWithdrawal$Request.customer_supplied_amount) && Intrinsics.areEqual(this.deposit_transaction_token, initiateBitcoinWithdrawal$Request.deposit_transaction_token) && this.entry_point == initiateBitcoinWithdrawal$Request.entry_point;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.external_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode3 = (hashCode2 + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        LogAndroidKt logAndroidKt = this.withdrawalType;
        int hashCode4 = (hashCode3 + (logAndroidKt != null ? logAndroidKt.hashCode() : 0)) * 37;
        String str2 = this.passcode_token;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        CryptoAmount cryptoAmount = this.customer_supplied_amount;
        int hashCode6 = (hashCode5 + (cryptoAmount != null ? cryptoAmount.hashCode() : 0)) * 37;
        String str3 = this.deposit_transaction_token;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        CryptoPaymentEntryPoint cryptoPaymentEntryPoint = this.entry_point;
        int hashCode8 = hashCode7 + (cryptoPaymentEntryPoint != null ? cryptoPaymentEntryPoint.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ContactAlias.Builder builder = new ContactAlias.Builder(15, false);
        builder.customer_token = this.external_id;
        builder.alias_type = this.request_context;
        builder.updated_at = this.withdrawalType;
        builder.alias_value = this.passcode_token;
        builder.linked_at = this.customer_supplied_amount;
        builder.hashed_alias_token = this.deposit_transaction_token;
        builder.version = this.entry_point;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.external_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "external_id=", arrayList);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.withdrawalType != null) {
            arrayList.add("withdrawalType=██");
        }
        if (this.passcode_token != null) {
            arrayList.add("passcode_token=██");
        }
        CryptoAmount cryptoAmount = this.customer_supplied_amount;
        if (cryptoAmount != null) {
            arrayList.add("customer_supplied_amount=" + cryptoAmount);
        }
        String str2 = this.deposit_transaction_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "deposit_transaction_token=", arrayList);
        }
        CryptoPaymentEntryPoint cryptoPaymentEntryPoint = this.entry_point;
        if (cryptoPaymentEntryPoint != null) {
            arrayList.add("entry_point=" + cryptoPaymentEntryPoint);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Request{", "}", 0, null, null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateBitcoinWithdrawal$Request(String str, RequestContext requestContext, LogAndroidKt logAndroidKt, String str2, CryptoAmount cryptoAmount, String str3, CryptoPaymentEntryPoint cryptoPaymentEntryPoint, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.external_id = str;
        this.request_context = requestContext;
        this.withdrawalType = logAndroidKt;
        this.passcode_token = str2;
        this.customer_supplied_amount = cryptoAmount;
        this.deposit_transaction_token = str3;
        this.entry_point = cryptoPaymentEntryPoint;
    }
}
