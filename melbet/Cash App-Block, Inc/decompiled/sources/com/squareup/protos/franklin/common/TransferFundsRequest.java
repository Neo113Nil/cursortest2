package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f\u001eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\bR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/squareup/protos/franklin/common/TransferFundsRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/TransferFundsRequest$Builder;", "Lcom/squareup/protos/franklin/common/RequestContext;", "request_context", "Lcom/squareup/protos/franklin/common/RequestContext;", "", "external_id", "Ljava/lang/String;", "Lcom/squareup/protos/franklin/api/Instrument;", "source", "Lcom/squareup/protos/franklin/api/Instrument;", "target", "Lcom/squareup/protos/common/Money;", "amount", "Lcom/squareup/protos/common/Money;", "passcode", "passcode_token", "Lcom/squareup/protos/franklin/api/DepositPreference;", "deposit_preference", "Lcom/squareup/protos/franklin/api/DepositPreference;", "accepted_fee_amount", "Lcom/squareup/protos/common/CurrencyCode;", "pull_currency", "Lcom/squareup/protos/common/CurrencyCode;", "push_currency", "contract_token", "Lcom/squareup/protos/franklin/common/FeeTier;", "fee_tier", "Lcom/squareup/protos/franklin/common/FeeTier;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransferFundsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TransferFundsRequest> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 8, tag = 8)
    public final Money accepted_fee_amount;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 4, tag = 4)
    public final Money amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 11, tag = 13)
    public final String contract_token;

    @WireField(adapter = "com.squareup.protos.franklin.api.DepositPreference#ADAPTER", schemaIndex = 7, tag = 7)
    public final DepositPreference deposit_preference;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 1)
    public final String external_id;

    @WireField(adapter = "com.squareup.protos.franklin.common.FeeTier#ADAPTER", schemaIndex = 12, tag = 14)
    public final FeeTier fee_tier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 5, tag = 5)
    public final String passcode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 6, tag = 6)
    public final String passcode_token;

    @WireField(adapter = "com.squareup.protos.common.CurrencyCode#ADAPTER", schemaIndex = 9, tag = 11)
    public final CurrencyCode pull_currency;

    @WireField(adapter = "com.squareup.protos.common.CurrencyCode#ADAPTER", schemaIndex = 10, tag = 12)
    public final CurrencyCode push_currency;

    @WireField(adapter = "com.squareup.protos.franklin.common.RequestContext#ADAPTER", schemaIndex = 0, tag = 10)
    public final RequestContext request_context;

    @WireField(adapter = "com.squareup.protos.franklin.api.Instrument#ADAPTER", schemaIndex = 2, tag = 2)
    public final Instrument source;

    @WireField(adapter = "com.squareup.protos.franklin.api.Instrument#ADAPTER", schemaIndex = 3, tag = 3)
    public final Instrument target;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\b\u0010\u0019\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/franklin/common/TransferFundsRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/TransferFundsRequest;", "<init>", "()V", "request_context", "Lcom/squareup/protos/franklin/common/RequestContext;", "external_id", "", "source", "Lcom/squareup/protos/franklin/api/Instrument;", "target", "amount", "Lcom/squareup/protos/common/Money;", "passcode", "passcode_token", "deposit_preference", "Lcom/squareup/protos/franklin/api/DepositPreference;", "accepted_fee_amount", "pull_currency", "Lcom/squareup/protos/common/CurrencyCode;", "push_currency", "contract_token", "fee_tier", "Lcom/squareup/protos/franklin/common/FeeTier;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder {
        public Money accepted_fee_amount;
        public Money amount;
        public String contract_token;
        public DepositPreference deposit_preference;
        public String external_id;
        public FeeTier fee_tier;
        public String passcode;
        public String passcode_token;
        public CurrencyCode pull_currency;
        public CurrencyCode push_currency;
        public RequestContext request_context;
        public Instrument source;
        public Instrument target;

        public final Builder accepted_fee_amount(Money accepted_fee_amount) {
            this.accepted_fee_amount = accepted_fee_amount;
            return this;
        }

        public final Builder amount(Money amount) {
            this.amount = amount;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public TransferFundsRequest build() {
            return new TransferFundsRequest(this.request_context, this.external_id, this.source, this.target, this.amount, this.passcode, this.passcode_token, this.deposit_preference, this.accepted_fee_amount, this.pull_currency, this.push_currency, this.contract_token, this.fee_tier, buildUnknownFields());
        }

        public final Builder contract_token(String contract_token) {
            this.contract_token = contract_token;
            return this;
        }

        public final Builder deposit_preference(DepositPreference deposit_preference) {
            this.deposit_preference = deposit_preference;
            return this;
        }

        public final Builder external_id(String external_id) {
            this.external_id = external_id;
            return this;
        }

        public final Builder fee_tier(FeeTier fee_tier) {
            this.fee_tier = fee_tier;
            return this;
        }

        public final Builder passcode(String passcode) {
            this.passcode = passcode;
            return this;
        }

        public final Builder passcode_token(String passcode_token) {
            this.passcode_token = passcode_token;
            return this;
        }

        public final Builder pull_currency(CurrencyCode pull_currency) {
            this.pull_currency = pull_currency;
            return this;
        }

        public final Builder push_currency(CurrencyCode push_currency) {
            this.push_currency = push_currency;
            return this;
        }

        public final Builder request_context(RequestContext request_context) {
            this.request_context = request_context;
            return this;
        }

        public final Builder source(Instrument source) {
            this.source = source;
            return this;
        }

        public final Builder target(Instrument target) {
            this.target = target;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TransferFundsRequest.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.TransferFundsRequest$Companion$ADAPTER$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v37 */
            /* JADX WARN: Type inference failed for: r0v40 */
            /* JADX WARN: Type inference failed for: r0v41 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public TransferFundsRequest decode(ProtoReader reader) {
                Object obj;
                String str;
                DepositPreference depositPreference;
                ?? decode;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                String str2 = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                String str3 = null;
                DepositPreference depositPreference2 = null;
                Object obj7 = null;
                CurrencyCode currencyCode = null;
                CurrencyCode currencyCode2 = null;
                String str4 = null;
                String str5 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TransferFundsRequest((RequestContext) obj2, str2, (Instrument) obj4, (Instrument) obj5, (Money) obj6, str5, str3, depositPreference2, (Money) obj7, currencyCode, currencyCode2, str4, (FeeTier) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            decode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj4 = TransactorKt.decodeMessageOrMerge(Instrument.ADAPTER, reader, obj4);
                            decode = str2;
                            break;
                        case 3:
                            obj5 = TransactorKt.decodeMessageOrMerge(Instrument.ADAPTER, reader, obj5);
                            decode = str2;
                            break;
                        case 4:
                            obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj6);
                            decode = str2;
                            break;
                        case 5:
                            str5 = ProtoAdapter.STRING.decode(reader);
                            decode = str2;
                            break;
                        case 6:
                            str3 = ProtoAdapter.STRING.decode(reader);
                            decode = str2;
                            break;
                        case 7:
                            obj = obj3;
                            str = str3;
                            depositPreference = depositPreference2;
                            try {
                                depositPreference2 = DepositPreference.ADAPTER.decode(reader);
                                obj3 = obj;
                                str3 = str;
                                decode = str2;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 8:
                            obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj7);
                            decode = str2;
                            break;
                        case 9:
                        default:
                            reader.readUnknownField(nextTag);
                            obj = obj3;
                            str = str3;
                            depositPreference = depositPreference2;
                            decode = str2;
                            obj3 = obj;
                            str3 = str;
                            depositPreference2 = depositPreference;
                            break;
                        case 10:
                            obj2 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, reader, obj2);
                            decode = str2;
                            break;
                        case 11:
                            obj = obj3;
                            str = str3;
                            depositPreference = depositPreference2;
                            try {
                                currencyCode = CurrencyCode.ADAPTER.decode(reader);
                                obj3 = obj;
                                str3 = str;
                                depositPreference2 = depositPreference;
                                decode = str2;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 12:
                            try {
                                currencyCode2 = CurrencyCode.ADAPTER.decode(reader);
                                decode = str2;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                obj = obj3;
                                str = str3;
                                depositPreference = depositPreference2;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                break;
                            }
                        case 13:
                            str4 = ProtoAdapter.STRING.decode(reader);
                            decode = str2;
                            break;
                        case 14:
                            obj3 = TransactorKt.decodeMessageOrMerge(FeeTier.ADAPTER, reader, obj3);
                            decode = str2;
                            break;
                    }
                    str2 = decode;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TransferFundsRequest value) {
                writer.getClass();
                value.getClass();
                RequestContext.ADAPTER.encodeWithTag(writer, 10, value.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.external_id);
                ProtoAdapter protoAdapter3 = Instrument.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 2, value.source);
                protoAdapter3.encodeWithTag(writer, 3, value.target);
                ProtoAdapter protoAdapter4 = Money.ADAPTER;
                protoAdapter4.encodeWithTag(writer, 4, value.amount);
                protoAdapter2.encodeWithTag(writer, 5, value.passcode);
                protoAdapter2.encodeWithTag(writer, 6, value.passcode_token);
                DepositPreference.ADAPTER.encodeWithTag(writer, 7, value.deposit_preference);
                protoAdapter4.encodeWithTag(writer, 8, value.accepted_fee_amount);
                ProtoAdapter protoAdapter5 = CurrencyCode.ADAPTER;
                protoAdapter5.encodeWithTag(writer, 11, value.pull_currency);
                protoAdapter5.encodeWithTag(writer, 12, value.push_currency);
                protoAdapter2.encodeWithTag(writer, 13, value.contract_token);
                FeeTier.ADAPTER.encodeWithTag(writer, 14, value.fee_tier);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TransferFundsRequest value) {
                value.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(10, value.request_context) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(1, value.external_id) + encodedSizeWithTag;
                ProtoAdapter protoAdapter3 = Instrument.ADAPTER;
                int encodedSizeWithTag3 = protoAdapter3.encodedSizeWithTag(3, value.target) + protoAdapter3.encodedSizeWithTag(2, value.source) + encodedSizeWithTag2;
                ProtoAdapter protoAdapter4 = Money.ADAPTER;
                int encodedSizeWithTag4 = protoAdapter4.encodedSizeWithTag(8, value.accepted_fee_amount) + DepositPreference.ADAPTER.encodedSizeWithTag(7, value.deposit_preference) + protoAdapter2.encodedSizeWithTag(6, value.passcode_token) + protoAdapter2.encodedSizeWithTag(5, value.passcode) + protoAdapter4.encodedSizeWithTag(4, value.amount) + encodedSizeWithTag3;
                ProtoAdapter protoAdapter5 = CurrencyCode.ADAPTER;
                return FeeTier.ADAPTER.encodedSizeWithTag(14, value.fee_tier) + protoAdapter2.encodedSizeWithTag(13, value.contract_token) + protoAdapter5.encodedSizeWithTag(12, value.push_currency) + protoAdapter5.encodedSizeWithTag(11, value.pull_currency) + encodedSizeWithTag4;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TransferFundsRequest redact(TransferFundsRequest value) {
                value.getClass();
                RequestContext requestContext = value.request_context;
                RequestContext requestContext2 = requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null;
                Instrument instrument = value.source;
                Instrument instrument2 = instrument != null ? (Instrument) Instrument.ADAPTER.redact(instrument) : null;
                Instrument instrument3 = value.target;
                Instrument instrument4 = instrument3 != null ? (Instrument) Instrument.ADAPTER.redact(instrument3) : null;
                Money money = value.amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                Money money3 = value.accepted_fee_amount;
                Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
                FeeTier feeTier = value.fee_tier;
                return TransferFundsRequest.copy$default(value, requestContext2, instrument2, instrument4, money2, money4, feeTier != null ? (FeeTier) FeeTier.ADAPTER.redact(feeTier) : null, ByteString.EMPTY, 3714);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TransferFundsRequest value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                FeeTier.ADAPTER.encodeWithTag(writer, 14, value.fee_tier);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 13, value.contract_token);
                ProtoAdapter protoAdapter3 = CurrencyCode.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 12, value.push_currency);
                protoAdapter3.encodeWithTag(writer, 11, value.pull_currency);
                ProtoAdapter protoAdapter4 = Money.ADAPTER;
                protoAdapter4.encodeWithTag(writer, 8, value.accepted_fee_amount);
                DepositPreference.ADAPTER.encodeWithTag(writer, 7, value.deposit_preference);
                protoAdapter2.encodeWithTag(writer, 6, value.passcode_token);
                protoAdapter2.encodeWithTag(writer, 5, value.passcode);
                protoAdapter4.encodeWithTag(writer, 4, value.amount);
                ProtoAdapter protoAdapter5 = Instrument.ADAPTER;
                protoAdapter5.encodeWithTag(writer, 3, value.target);
                protoAdapter5.encodeWithTag(writer, 2, value.source);
                protoAdapter2.encodeWithTag(writer, 1, value.external_id);
                RequestContext.ADAPTER.encodeWithTag(writer, 10, value.request_context);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferFundsRequest(RequestContext requestContext, String str, Instrument instrument, Instrument instrument2, Money money, String str2, String str3, DepositPreference depositPreference, Money money2, CurrencyCode currencyCode, CurrencyCode currencyCode2, String str4, FeeTier feeTier, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.external_id = str;
        this.source = instrument;
        this.target = instrument2;
        this.amount = money;
        this.passcode = str2;
        this.passcode_token = str3;
        this.deposit_preference = depositPreference;
        this.accepted_fee_amount = money2;
        this.pull_currency = currencyCode;
        this.push_currency = currencyCode2;
        this.contract_token = str4;
        this.fee_tier = feeTier;
    }

    public static TransferFundsRequest copy$default(TransferFundsRequest transferFundsRequest, RequestContext requestContext, Instrument instrument, Instrument instrument2, Money money, Money money2, FeeTier feeTier, ByteString byteString, int i) {
        String str = transferFundsRequest.external_id;
        Instrument instrument3 = (i & 4) != 0 ? transferFundsRequest.source : instrument;
        Instrument instrument4 = (i & 8) != 0 ? transferFundsRequest.target : instrument2;
        Money money3 = (i & 16) != 0 ? transferFundsRequest.amount : money;
        String str2 = (i & 32) != 0 ? transferFundsRequest.passcode : null;
        String str3 = (i & 64) != 0 ? transferFundsRequest.passcode_token : null;
        DepositPreference depositPreference = transferFundsRequest.deposit_preference;
        Money money4 = (i & 256) != 0 ? transferFundsRequest.accepted_fee_amount : money2;
        CurrencyCode currencyCode = transferFundsRequest.pull_currency;
        CurrencyCode currencyCode2 = transferFundsRequest.push_currency;
        String str4 = transferFundsRequest.contract_token;
        FeeTier feeTier2 = (i & 4096) != 0 ? transferFundsRequest.fee_tier : feeTier;
        ByteString unknownFields = (i & PKIFailureInfo.certRevoked) != 0 ? transferFundsRequest.unknownFields() : byteString;
        transferFundsRequest.getClass();
        unknownFields.getClass();
        return new TransferFundsRequest(requestContext, str, instrument3, instrument4, money3, str2, str3, depositPreference, money4, currencyCode, currencyCode2, str4, feeTier2, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransferFundsRequest)) {
            return false;
        }
        TransferFundsRequest transferFundsRequest = (TransferFundsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), transferFundsRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, transferFundsRequest.request_context) && Intrinsics.areEqual(this.external_id, transferFundsRequest.external_id) && Intrinsics.areEqual(this.source, transferFundsRequest.source) && Intrinsics.areEqual(this.target, transferFundsRequest.target) && Intrinsics.areEqual(this.amount, transferFundsRequest.amount) && Intrinsics.areEqual(this.passcode, transferFundsRequest.passcode) && Intrinsics.areEqual(this.passcode_token, transferFundsRequest.passcode_token) && this.deposit_preference == transferFundsRequest.deposit_preference && Intrinsics.areEqual(this.accepted_fee_amount, transferFundsRequest.accepted_fee_amount) && this.pull_currency == transferFundsRequest.pull_currency && this.push_currency == transferFundsRequest.push_currency && Intrinsics.areEqual(this.contract_token, transferFundsRequest.contract_token) && Intrinsics.areEqual(this.fee_tier, transferFundsRequest.fee_tier);
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
        String str2 = this.passcode;
        int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.passcode_token;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
        DepositPreference depositPreference = this.deposit_preference;
        int hashCode9 = (hashCode8 + (depositPreference != null ? depositPreference.hashCode() : 0)) * 37;
        Money money2 = this.accepted_fee_amount;
        int hashCode10 = (hashCode9 + (money2 != null ? money2.hashCode() : 0)) * 37;
        CurrencyCode currencyCode = this.pull_currency;
        int hashCode11 = (hashCode10 + (currencyCode != null ? currencyCode.hashCode() : 0)) * 37;
        CurrencyCode currencyCode2 = this.push_currency;
        int hashCode12 = (hashCode11 + (currencyCode2 != null ? currencyCode2.hashCode() : 0)) * 37;
        String str4 = this.contract_token;
        int hashCode13 = (hashCode12 + (str4 != null ? str4.hashCode() : 0)) * 37;
        FeeTier feeTier = this.fee_tier;
        int hashCode14 = hashCode13 + (feeTier != null ? feeTier.hashCode() : 0);
        this.hashCode = hashCode14;
        return hashCode14;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.request_context = this.request_context;
        builder.external_id = this.external_id;
        builder.source = this.source;
        builder.target = this.target;
        builder.amount = this.amount;
        builder.passcode = this.passcode;
        builder.passcode_token = this.passcode_token;
        builder.deposit_preference = this.deposit_preference;
        builder.accepted_fee_amount = this.accepted_fee_amount;
        builder.pull_currency = this.pull_currency;
        builder.push_currency = this.push_currency;
        builder.contract_token = this.contract_token;
        builder.fee_tier = this.fee_tier;
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
        if (this.passcode != null) {
            arrayList.add("passcode=██");
        }
        if (this.passcode_token != null) {
            arrayList.add("passcode_token=██");
        }
        DepositPreference depositPreference = this.deposit_preference;
        if (depositPreference != null) {
            arrayList.add("deposit_preference=" + depositPreference);
        }
        Money money2 = this.accepted_fee_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("accepted_fee_amount=", money2, arrayList);
        }
        CurrencyCode currencyCode = this.pull_currency;
        if (currencyCode != null) {
            Matcher$$ExternalSyntheticOutline0.m("pull_currency=", currencyCode, arrayList);
        }
        CurrencyCode currencyCode2 = this.push_currency;
        if (currencyCode2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("push_currency=", currencyCode2, arrayList);
        }
        String str2 = this.contract_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "contract_token=", arrayList);
        }
        FeeTier feeTier = this.fee_tier;
        if (feeTier != null) {
            arrayList.add("fee_tier=" + feeTier);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TransferFundsRequest{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/TransferFundsRequest$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/TransferFundsRequest$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/TransferFundsRequest;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/TransferFundsRequest;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ TransferFundsRequest build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
