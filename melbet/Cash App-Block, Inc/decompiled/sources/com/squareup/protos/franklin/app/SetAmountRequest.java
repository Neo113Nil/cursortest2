package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.google.android.gms.internal.mlkit_vision_face.zzdf;
import com.google.android.gms.internal.mlkit_vision_face.zzdg;
import com.google.android.gms.internal.mlkit_vision_face.zzdi;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.mosaic.personalization.api.v1.Entity;
import com.squareup.protos.cash.cryptoinvestflow.api.blockers.v1.BitcoinP2pConversionPercentageInputs;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.Blockers;
import com.squareup.protos.franklin.api.ScientificNumber;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.ClaimData;
import com.squareup.protos.franklin.app.ScheduledPaymentsConfig;
import com.squareup.protos.franklin.app.SelectOptionResponse;
import com.squareup.protos.franklin.app.SetAmountRequest;
import com.squareup.protos.franklin.app.SetAmountResponse;
import com.squareup.protos.franklin.app.SetCardCustomizationResponse;
import com.squareup.protos.franklin.app.SetCashtagUrlEnabledResponse;
import com.squareup.protos.franklin.app.SetCountryResponse;
import com.squareup.protos.franklin.app.SetFullNameResponse;
import com.squareup.protos.franklin.app.SetIncomingRequestPolicyResponse;
import com.squareup.protos.franklin.app.SetRatePlanResponse;
import com.squareup.protos.franklin.app.SetSignatureResponse;
import com.squareup.protos.franklin.app.SkipBlockerResponse;
import com.squareup.protos.franklin.app.SubmitBlockerResponse;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.app.UnregisterAliasResponse;
import com.squareup.protos.franklin.app.VerifyContactsResponse;
import com.squareup.protos.franklin.app.VerifyIdentityResponse;
import com.squareup.protos.franklin.app.VerifyInstrumentResponse;
import com.squareup.protos.franklin.app.VerifyMagicLinkResponse;
import com.squareup.protos.franklin.app.VerifyPasscodeAndExpirationResponse;
import com.squareup.protos.franklin.common.Profile;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.ScheduleRFC2445;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.SyncEntitiesResponse;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.franklin.onboarding.OnboardingDeepLinkPayload;
import com.squareup.protos.franklin.privacy.IncomingRequestPolicy;
import com.squareup.protos.repeatedly.common.ScheduledTransactionPreference;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes.dex */
public final class SetAmountRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetAmountRequest> CREATOR;
    public final RequestContext request_context;
    public final zzdg result;

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Serializable request_context;
        public Object result;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new SetAmountRequest((RequestContext) this.request_context, (zzdg) this.result, buildUnknownFields());
                case 1:
                    return new ScheduledPaymentsConfig.SupportedSchedule((String) this.request_context, (ScheduleRFC2445) this.result, buildUnknownFields());
                case 2:
                    return new SelectOptionResponse((ResponseContext) this.request_context, (SelectOptionResponse.Status) this.result, buildUnknownFields());
                case 3:
                    return new SelectTransferOptionRequest((RequestContext) this.request_context, (zzdf) this.result, buildUnknownFields());
                case 4:
                    return new SetAmountResponse((ResponseContext) this.request_context, (SetAmountResponse.Status) this.result, buildUnknownFields());
                case 5:
                    return new SetBitcoinDisplayPreferenceRequest((BitcoinDisplayUnits) this.result, (RequestContext) this.request_context, buildUnknownFields());
                case 6:
                    return new SetCardCustomizationResponse((ResponseContext) this.request_context, (SetCardCustomizationResponse.Status) this.result, buildUnknownFields());
                case 7:
                    return new SetCashtagUrlEnabledResponse((SetCashtagUrlEnabledResponse.Status) this.request_context, (ResponseContext) this.result, buildUnknownFields());
                case 8:
                    return new SetCountryRequest((RequestContext) this.request_context, (Country) this.result, buildUnknownFields());
                case 9:
                    return new SetCountryResponse((ResponseContext) this.request_context, (SetCountryResponse.Status) this.result, buildUnknownFields());
                case 10:
                    return new SetFullNameResponse((ResponseContext) this.request_context, (SetFullNameResponse.Status) this.result, buildUnknownFields());
                case 11:
                    return new SetIncomingRequestPolicyRequest((RequestContext) this.request_context, (IncomingRequestPolicy) this.result, buildUnknownFields());
                case 12:
                    return new SetIncomingRequestPolicyResponse((ResponseContext) this.request_context, (SetIncomingRequestPolicyResponse.Status) this.result, buildUnknownFields());
                case 13:
                    return new SetOnboardingContextRequest((String) this.request_context, (OnboardingDeepLinkPayload) this.result, buildUnknownFields());
                case 14:
                    return new SetRatePlanResponse((ResponseContext) this.request_context, (SetRatePlanResponse.Status) this.result, buildUnknownFields());
                case 15:
                    return new SetScheduledTransactionPreferenceRequest((RequestContext) this.request_context, (ScheduledTransactionPreference) this.result, buildUnknownFields());
                case 16:
                    return new SetSignatureResponse((ResponseContext) this.request_context, (SetSignatureResponse.Status) this.result, buildUnknownFields());
                case 17:
                    return new SkipBlockerRequest((RequestContext) this.request_context, (Blockers) this.result, buildUnknownFields());
                case 18:
                    return new SkipBlockerResponse((ResponseContext) this.request_context, (SkipBlockerResponse.Status) this.result, buildUnknownFields());
                case 19:
                    return new SubmitBitcoinP2pConversionPercentageRequest((RequestContext) this.request_context, (BitcoinP2pConversionPercentageInputs) this.result, buildUnknownFields());
                case 20:
                    return new SubmitBlockerResponse.AppResponseContext((Profile) this.request_context, (SyncEntitiesResponse) this.result, buildUnknownFields());
                case 21:
                    return new SubmitBlockerResponse.FlowResponseContext((ScenarioPlan) this.request_context, (StatusResult) this.result, buildUnknownFields());
                case 22:
                    return new SubmitFormRequest.ElementResult((String) this.request_context, (zzdi) this.result, buildUnknownFields());
                case 23:
                    return new UnregisterAliasRequest((RequestContext) this.request_context, (UiAlias) this.result, buildUnknownFields());
                case 24:
                    return new UnregisterAliasResponse((ResponseContext) this.request_context, (UnregisterAliasResponse.Status) this.result, buildUnknownFields());
                case 25:
                    return new VerifyContactsResponse((ResponseContext) this.request_context, (VerifyContactsResponse.Status) this.result, buildUnknownFields());
                case 26:
                    return new VerifyIdentityResponse((ResponseContext) this.request_context, (VerifyIdentityResponse.Status) this.result, buildUnknownFields());
                case 27:
                    return new VerifyInstrumentResponse((ResponseContext) this.request_context, (VerifyInstrumentResponse.Status) this.result, buildUnknownFields());
                case 28:
                    return new VerifyMagicLinkResponse((ResponseContext) this.request_context, (VerifyMagicLinkResponse.Status) this.result, buildUnknownFields());
                default:
                    return new VerifyPasscodeAndExpirationResponse((ResponseContext) this.request_context, (VerifyPasscodeAndExpirationResponse.Status) this.result, buildUnknownFields());
            }
        }
    }

    /* loaded from: classes8.dex */
    public final class PercentageResult extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PercentageResult> CREATOR;
        public final ScientificNumber percentage;

        static {
            SetAmountRequest$PercentageResult$Companion$ADAPTER$1 setAmountRequest$PercentageResult$Companion$ADAPTER$1 = new SetAmountRequest$PercentageResult$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PercentageResult.class), "type.googleapis.com/squareup.franklin.app.SetAmountRequest.PercentageResult", Syntax.PROTO_2, null, "squareup/franklin/app/amount.proto");
            ADAPTER = setAmountRequest$PercentageResult$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(setAmountRequest$PercentageResult$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PercentageResult(ScientificNumber scientificNumber, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.percentage = scientificNumber;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PercentageResult)) {
                return false;
            }
            PercentageResult percentageResult = (PercentageResult) obj;
            return Intrinsics.areEqual(unknownFields(), percentageResult.unknownFields()) && Intrinsics.areEqual(this.percentage, percentageResult.percentage);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ScientificNumber scientificNumber = this.percentage;
            int hashCode2 = hashCode + (scientificNumber != null ? scientificNumber.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ClaimData.Builder builder = new ClaimData.Builder(19);
            builder.claimable_payment = this.percentage;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            ScientificNumber scientificNumber = this.percentage;
            if (scientificNumber != null) {
                arrayList.add("percentage=" + scientificNumber);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PercentageResult{", "}", 0, null, null, 56);
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetAmountRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.SetAmountRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                zzdg zzdgVar = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SetAmountRequest((RequestContext) obj, zzdgVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        zzdgVar = new SetAmountRequest$Result$AmountResult((SetAmountRequest.AmountResult) SetAmountRequest.AmountResult.ADAPTER.decode(protoReader));
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        zzdgVar = new SetAmountRequest$Result$PercentageResult((SetAmountRequest.PercentageResult) SetAmountRequest.PercentageResult.ADAPTER.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetAmountRequest setAmountRequest = (SetAmountRequest) obj;
                reverseProtoWriter.getClass();
                setAmountRequest.getClass();
                reverseProtoWriter.writeBytes(setAmountRequest.unknownFields());
                zzdg zzdgVar = setAmountRequest.result;
                if (zzdgVar instanceof SetAmountRequest$Result$AmountResult) {
                    SetAmountRequest.AmountResult.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((SetAmountRequest$Result$AmountResult) zzdgVar).value);
                } else if (zzdgVar instanceof SetAmountRequest$Result$PercentageResult) {
                    SetAmountRequest.PercentageResult.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((SetAmountRequest$Result$PercentageResult) zzdgVar).value);
                } else if (zzdgVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setAmountRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetAmountRequest setAmountRequest = (SetAmountRequest) obj;
                setAmountRequest.getClass();
                int encodedSizeWithTag = RequestContext.ADAPTER.encodedSizeWithTag(1, setAmountRequest.request_context) + setAmountRequest.unknownFields().getSize$okio();
                zzdg zzdgVar = setAmountRequest.result;
                if (zzdgVar instanceof SetAmountRequest$Result$AmountResult) {
                    return SetAmountRequest.AmountResult.ADAPTER.encodedSizeWithTag(2, ((SetAmountRequest$Result$AmountResult) zzdgVar).value) + encodedSizeWithTag;
                }
                if (zzdgVar instanceof SetAmountRequest$Result$PercentageResult) {
                    return SetAmountRequest.PercentageResult.ADAPTER.encodedSizeWithTag(3, ((SetAmountRequest$Result$PercentageResult) zzdgVar).value) + encodedSizeWithTag;
                }
                if (zzdgVar == null) {
                    return encodedSizeWithTag;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetAmountRequest setAmountRequest = (SetAmountRequest) obj;
                setAmountRequest.getClass();
                RequestContext requestContext = setAmountRequest.request_context;
                return SetAmountRequest.copy$default(setAmountRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, null, ByteString.EMPTY, 2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetAmountRequest setAmountRequest = (SetAmountRequest) obj;
                setAmountRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, setAmountRequest.request_context);
                zzdg zzdgVar = setAmountRequest.result;
                if (zzdgVar instanceof SetAmountRequest$Result$AmountResult) {
                    SetAmountRequest.AmountResult.ADAPTER.encodeWithTag(protoWriter, 2, ((SetAmountRequest$Result$AmountResult) zzdgVar).value);
                } else if (zzdgVar instanceof SetAmountRequest$Result$PercentageResult) {
                    SetAmountRequest.PercentageResult.ADAPTER.encodeWithTag(protoWriter, 3, ((SetAmountRequest$Result$PercentageResult) zzdgVar).value);
                } else if (zzdgVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                protoWriter.writeBytes(setAmountRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetAmountRequest(RequestContext requestContext, zzdg zzdgVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.result = zzdgVar;
    }

    public static SetAmountRequest copy$default(SetAmountRequest setAmountRequest, RequestContext requestContext, zzdg zzdgVar, ByteString byteString, int i) {
        if ((i & 1) != 0) {
            requestContext = setAmountRequest.request_context;
        }
        if ((i & 2) != 0) {
            zzdgVar = setAmountRequest.result;
        }
        if ((i & 4) != 0) {
            byteString = setAmountRequest.unknownFields();
        }
        setAmountRequest.getClass();
        byteString.getClass();
        return new SetAmountRequest(requestContext, zzdgVar, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetAmountRequest)) {
            return false;
        }
        SetAmountRequest setAmountRequest = (SetAmountRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setAmountRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, setAmountRequest.request_context) && Intrinsics.areEqual(this.result, setAmountRequest.result);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        zzdg zzdgVar = this.result;
        int hashCode3 = hashCode2 + (zzdgVar != null ? zzdgVar.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.request_context = this.request_context;
        builder.result = this.result;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        zzdg zzdgVar = this.result;
        if (zzdgVar != null) {
            arrayList.add("result=" + zzdgVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetAmountRequest{", "}", 0, null, null, 56);
    }

    /* loaded from: classes8.dex */
    public final class AmountResult extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AmountResult> CREATOR;
        public final Money amount;

        static {
            SetAmountRequest$AmountResult$Companion$ADAPTER$1 setAmountRequest$AmountResult$Companion$ADAPTER$1 = new SetAmountRequest$AmountResult$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AmountResult.class), "type.googleapis.com/squareup.franklin.app.SetAmountRequest.AmountResult", Syntax.PROTO_2, null, "squareup/franklin/app/amount.proto");
            ADAPTER = setAmountRequest$AmountResult$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(setAmountRequest$AmountResult$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AmountResult(Money money, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.amount = money;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AmountResult)) {
                return false;
            }
            AmountResult amountResult = (AmountResult) obj;
            return Intrinsics.areEqual(unknownFields(), amountResult.unknownFields()) && Intrinsics.areEqual(this.amount, amountResult.amount);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Money money = this.amount;
            int hashCode2 = hashCode + (money != null ? money.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Entity.Payment.Builder builder = new Entity.Payment.Builder(4);
            builder.amount = this.amount;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Money money = this.amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AmountResult{", "}", 0, null, null, 56);
        }

        public /* synthetic */ AmountResult(Money money) {
            this(money, ByteString.EMPTY);
        }
    }

    public /* synthetic */ SetAmountRequest(RequestContext requestContext, SetAmountRequest$Result$AmountResult setAmountRequest$Result$AmountResult, int i) {
        this(requestContext, (i & 2) != 0 ? null : setAmountRequest$Result$AmountResult, ByteString.EMPTY);
    }
}
