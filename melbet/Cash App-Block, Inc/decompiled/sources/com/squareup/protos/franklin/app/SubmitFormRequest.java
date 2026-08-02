package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzdi;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.mosaic.personalization.api.v1.Entity;
import com.squareup.cash.p2pencore.v1.Date;
import com.squareup.protos.cash.semaphore.api.GetOnboardingConfigRequest;
import com.squareup.protos.common.Headers;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.app.ClaimData;
import com.squareup.protos.franklin.app.SetAmountRequest;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import com.squareup.protos.franklin.common.PaymentRewardStatus;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.ui.UiAddress;
import com.squareup.protos.franklin.ui.UiAppLock;
import com.squareup.protos.lending.OpaqueRoute;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import squareup.cash.earnings.EarnerCategory;

/* loaded from: classes.dex */
public final class SubmitFormRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SubmitFormRequest> CREATOR;
    public final String action_id;
    public final RequestContext request_context;
    public final List results;

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String action_id;
        public RequestContext request_context;
        public List results;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    this.results = EmptyList.INSTANCE;
                    break;
                default:
                    this.results = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new SubmitFormRequest(this.request_context, this.action_id, this.results, buildUnknownFields());
                default:
                    return new SubmitFilesetRequest(this.request_context, this.action_id, this.results, buildUnknownFields());
            }
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SubmitFormRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.SubmitFormRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SubmitFormRequest((RequestContext) obj, (String) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        m.add(SubmitFormRequest.ElementResult.ADAPTER.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SubmitFormRequest submitFormRequest = (SubmitFormRequest) obj;
                reverseProtoWriter.getClass();
                submitFormRequest.getClass();
                reverseProtoWriter.writeBytes(submitFormRequest.unknownFields());
                SubmitFormRequest.ElementResult.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, submitFormRequest.results);
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, submitFormRequest.action_id);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, submitFormRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SubmitFormRequest submitFormRequest = (SubmitFormRequest) obj;
                submitFormRequest.getClass();
                return SubmitFormRequest.ElementResult.ADAPTER.asRepeated().encodedSizeWithTag(3, submitFormRequest.results) + ProtoAdapter.STRING.encodedSizeWithTag(2, submitFormRequest.action_id) + RequestContext.ADAPTER.encodedSizeWithTag(1, submitFormRequest.request_context) + submitFormRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SubmitFormRequest submitFormRequest = (SubmitFormRequest) obj;
                submitFormRequest.getClass();
                RequestContext requestContext = submitFormRequest.request_context;
                return SubmitFormRequest.copy$default(submitFormRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, TransactorKt.m1169redactElements(submitFormRequest.results, SubmitFormRequest.ElementResult.ADAPTER), ByteString.EMPTY, 2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SubmitFormRequest submitFormRequest = (SubmitFormRequest) obj;
                submitFormRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, submitFormRequest.request_context);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, submitFormRequest.action_id);
                SubmitFormRequest.ElementResult.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, submitFormRequest.results);
                protoWriter.writeBytes(submitFormRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitFormRequest(RequestContext requestContext, String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.request_context = requestContext;
        this.action_id = str;
        this.results = TransactorKt.immutableCopyOf("results", list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    public static SubmitFormRequest copy$default(SubmitFormRequest submitFormRequest, RequestContext requestContext, ArrayList arrayList, ByteString byteString, int i) {
        String str = submitFormRequest.action_id;
        ArrayList arrayList2 = arrayList;
        if ((i & 4) != 0) {
            arrayList2 = submitFormRequest.results;
        }
        if ((i & 8) != 0) {
            byteString = submitFormRequest.unknownFields();
        }
        submitFormRequest.getClass();
        arrayList2.getClass();
        byteString.getClass();
        return new SubmitFormRequest(requestContext, str, arrayList2, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubmitFormRequest)) {
            return false;
        }
        SubmitFormRequest submitFormRequest = (SubmitFormRequest) obj;
        return Intrinsics.areEqual(unknownFields(), submitFormRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, submitFormRequest.request_context) && Intrinsics.areEqual(this.action_id, submitFormRequest.action_id) && Intrinsics.areEqual(this.results, submitFormRequest.results);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.action_id;
        int hashCode3 = this.results.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.request_context = this.request_context;
        builder.action_id = this.action_id;
        builder.results = this.results;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        String str = this.action_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "action_id=", arrayList);
        }
        List list = this.results;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("results=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitFormRequest{", "}", 0, null, null, 56);
    }

    /* loaded from: classes8.dex */
    public final class ElementResult extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ElementResult> CREATOR;
        public final String id;
        public final zzdi result;

        public final class AddressResult extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<AddressResult> CREATOR;
            public final GlobalAddress address;

            static {
                SubmitFormRequest$ElementResult$AddressResult$Companion$ADAPTER$1 submitFormRequest$ElementResult$AddressResult$Companion$ADAPTER$1 = new SubmitFormRequest$ElementResult$AddressResult$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AddressResult.class), "type.googleapis.com/squareup.franklin.app.SubmitFormRequest.ElementResult.AddressResult", Syntax.PROTO_2, null, "squareup/franklin/app/submit_form.proto");
                ADAPTER = submitFormRequest$ElementResult$AddressResult$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(submitFormRequest$ElementResult$AddressResult$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AddressResult(GlobalAddress globalAddress, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.address = globalAddress;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof AddressResult)) {
                    return false;
                }
                AddressResult addressResult = (AddressResult) obj;
                return Intrinsics.areEqual(unknownFields(), addressResult.unknownFields()) && Intrinsics.areEqual(this.address, addressResult.address);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                GlobalAddress globalAddress = this.address;
                int hashCode2 = hashCode + (globalAddress != null ? globalAddress.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                UiAddress.Builder builder = new UiAddress.Builder(1);
                builder.postal_address = this.address;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                GlobalAddress globalAddress = this.address;
                if (globalAddress != null) {
                    arrayList.add("address=" + globalAddress);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "AddressResult{", "}", 0, null, null, 56);
            }
        }

        public final class CashtagResult extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<CashtagResult> CREATOR;
            public final String cashtag;

            static {
                SubmitFormRequest$ElementResult$CashtagResult$Companion$ADAPTER$1 submitFormRequest$ElementResult$CashtagResult$Companion$ADAPTER$1 = new SubmitFormRequest$ElementResult$CashtagResult$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashtagResult.class), "type.googleapis.com/squareup.franklin.app.SubmitFormRequest.ElementResult.CashtagResult", Syntax.PROTO_2, null, "squareup/franklin/app/submit_form.proto");
                ADAPTER = submitFormRequest$ElementResult$CashtagResult$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(submitFormRequest$ElementResult$CashtagResult$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CashtagResult(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.cashtag = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CashtagResult)) {
                    return false;
                }
                CashtagResult cashtagResult = (CashtagResult) obj;
                return Intrinsics.areEqual(unknownFields(), cashtagResult.unknownFields()) && Intrinsics.areEqual(this.cashtag, cashtagResult.cashtag);
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
                OpaqueRoute.Builder builder = new OpaqueRoute.Builder(14);
                builder.client_route = this.cashtag;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                if (this.cashtag != null) {
                    arrayList.add("cashtag=██");
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "CashtagResult{", "}", 0, null, null, 56);
            }
        }

        public final class CheckBoxResult extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<CheckBoxResult> CREATOR;
            public final Boolean is_checked;

            static {
                SubmitFormRequest$ElementResult$CheckBoxResult$Companion$ADAPTER$1 submitFormRequest$ElementResult$CheckBoxResult$Companion$ADAPTER$1 = new SubmitFormRequest$ElementResult$CheckBoxResult$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CheckBoxResult.class), "type.googleapis.com/squareup.franklin.app.SubmitFormRequest.ElementResult.CheckBoxResult", Syntax.PROTO_2, null, "squareup/franklin/app/submit_form.proto");
                ADAPTER = submitFormRequest$ElementResult$CheckBoxResult$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(submitFormRequest$ElementResult$CheckBoxResult$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CheckBoxResult(Boolean bool, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.is_checked = bool;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CheckBoxResult)) {
                    return false;
                }
                CheckBoxResult checkBoxResult = (CheckBoxResult) obj;
                return Intrinsics.areEqual(unknownFields(), checkBoxResult.unknownFields()) && Intrinsics.areEqual(this.is_checked, checkBoxResult.is_checked);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Boolean bool = this.is_checked;
                int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                UiAppLock.Builder builder = new UiAppLock.Builder(23);
                builder.activated = this.is_checked;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Boolean bool = this.is_checked;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("is_checked=", bool, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "CheckBoxResult{", "}", 0, null, null, 56);
            }
        }

        public final class CountrySelectorResult extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<CountrySelectorResult> CREATOR;
            public final Country selected_country;

            static {
                SubmitFormRequest$ElementResult$CountrySelectorResult$Companion$ADAPTER$1 submitFormRequest$ElementResult$CountrySelectorResult$Companion$ADAPTER$1 = new SubmitFormRequest$ElementResult$CountrySelectorResult$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CountrySelectorResult.class), "type.googleapis.com/squareup.franklin.app.SubmitFormRequest.ElementResult.CountrySelectorResult", Syntax.PROTO_2, null, "squareup/franklin/app/submit_form.proto");
                ADAPTER = submitFormRequest$ElementResult$CountrySelectorResult$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(submitFormRequest$ElementResult$CountrySelectorResult$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CountrySelectorResult(Country country, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.selected_country = country;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CountrySelectorResult)) {
                    return false;
                }
                CountrySelectorResult countrySelectorResult = (CountrySelectorResult) obj;
                return Intrinsics.areEqual(unknownFields(), countrySelectorResult.unknownFields()) && this.selected_country == countrySelectorResult.selected_country;
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Country country = this.selected_country;
                int hashCode2 = hashCode + (country != null ? country.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                GetOnboardingConfigRequest.Builder builder = new GetOnboardingConfigRequest.Builder(1);
                builder.device_locale_country = this.selected_country;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Country country = this.selected_country;
                if (country != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("selected_country=", country, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "CountrySelectorResult{", "}", 0, null, null, 56);
            }
        }

        public final class EarnerCategoryResult extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<EarnerCategoryResult> CREATOR;
            public final EarnerCategory earner_category;

            static {
                SubmitFormRequest$ElementResult$EarnerCategoryResult$Companion$ADAPTER$1 submitFormRequest$ElementResult$EarnerCategoryResult$Companion$ADAPTER$1 = new SubmitFormRequest$ElementResult$EarnerCategoryResult$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EarnerCategoryResult.class), "type.googleapis.com/squareup.franklin.app.SubmitFormRequest.ElementResult.EarnerCategoryResult", Syntax.PROTO_2, null, "squareup/franklin/app/submit_form.proto");
                ADAPTER = submitFormRequest$ElementResult$EarnerCategoryResult$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(submitFormRequest$ElementResult$EarnerCategoryResult$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EarnerCategoryResult(EarnerCategory earnerCategory, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.earner_category = earnerCategory;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof EarnerCategoryResult)) {
                    return false;
                }
                EarnerCategoryResult earnerCategoryResult = (EarnerCategoryResult) obj;
                return Intrinsics.areEqual(unknownFields(), earnerCategoryResult.unknownFields()) && this.earner_category == earnerCategoryResult.earner_category;
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                EarnerCategory earnerCategory = this.earner_category;
                int hashCode2 = hashCode + (earnerCategory != null ? earnerCategory.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                ClaimData.Builder builder = new ClaimData.Builder(21);
                builder.claimable_payment = this.earner_category;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                EarnerCategory earnerCategory = this.earner_category;
                if (earnerCategory != null) {
                    arrayList.add("earner_category=" + earnerCategory);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "EarnerCategoryResult{", "}", 0, null, null, 56);
            }
        }

        public final class MerchantTransactionOptionPickerResult extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<MerchantTransactionOptionPickerResult> CREATOR;
            public final List selected_transactions;

            static {
                SubmitFormRequest$ElementResult$MerchantTransactionOptionPickerResult$Companion$ADAPTER$1 submitFormRequest$ElementResult$MerchantTransactionOptionPickerResult$Companion$ADAPTER$1 = new SubmitFormRequest$ElementResult$MerchantTransactionOptionPickerResult$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MerchantTransactionOptionPickerResult.class), "type.googleapis.com/squareup.franklin.app.SubmitFormRequest.ElementResult.MerchantTransactionOptionPickerResult", Syntax.PROTO_2, null, "squareup/franklin/app/submit_form.proto");
                ADAPTER = submitFormRequest$ElementResult$MerchantTransactionOptionPickerResult$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(submitFormRequest$ElementResult$MerchantTransactionOptionPickerResult$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MerchantTransactionOptionPickerResult(List list, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.selected_transactions = TransactorKt.immutableCopyOf("selected_transactions", list);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof MerchantTransactionOptionPickerResult)) {
                    return false;
                }
                MerchantTransactionOptionPickerResult merchantTransactionOptionPickerResult = (MerchantTransactionOptionPickerResult) obj;
                return Intrinsics.areEqual(unknownFields(), merchantTransactionOptionPickerResult.unknownFields()) && Intrinsics.areEqual(this.selected_transactions, merchantTransactionOptionPickerResult.selected_transactions);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.selected_transactions.hashCode() + (unknownFields().hashCode() * 37);
                this.hashCode = hashCode;
                return hashCode;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Headers.Builder builder = new Headers.Builder(19, false);
                builder.header = this.selected_transactions;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                if (!this.selected_transactions.isEmpty()) {
                    arrayList.add("selected_transactions=██");
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "MerchantTransactionOptionPickerResult{", "}", 0, null, null, 56);
            }
        }

        public final class MoneyInputResult extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<MoneyInputResult> CREATOR;
            public final Money amount;

            static {
                SubmitFormRequest$ElementResult$MoneyInputResult$Companion$ADAPTER$1 submitFormRequest$ElementResult$MoneyInputResult$Companion$ADAPTER$1 = new SubmitFormRequest$ElementResult$MoneyInputResult$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MoneyInputResult.class), "type.googleapis.com/squareup.franklin.app.SubmitFormRequest.ElementResult.MoneyInputResult", Syntax.PROTO_2, null, "squareup/franklin/app/submit_form.proto");
                ADAPTER = submitFormRequest$ElementResult$MoneyInputResult$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(submitFormRequest$ElementResult$MoneyInputResult$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MoneyInputResult(Money money, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.amount = money;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof MoneyInputResult)) {
                    return false;
                }
                MoneyInputResult moneyInputResult = (MoneyInputResult) obj;
                return Intrinsics.areEqual(unknownFields(), moneyInputResult.unknownFields()) && Intrinsics.areEqual(this.amount, moneyInputResult.amount);
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
                Entity.Payment.Builder builder = new Entity.Payment.Builder(5);
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
                return CollectionsKt.joinToString$default(arrayList, ", ", "MoneyInputResult{", "}", 0, null, null, 56);
            }
        }

        static {
            SubmitFormRequest$ElementResult$Companion$ADAPTER$1 submitFormRequest$ElementResult$Companion$ADAPTER$1 = new SubmitFormRequest$ElementResult$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ElementResult.class), "type.googleapis.com/squareup.franklin.app.SubmitFormRequest.ElementResult", Syntax.PROTO_2, null, "squareup/franklin/app/submit_form.proto");
            ADAPTER = submitFormRequest$ElementResult$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(submitFormRequest$ElementResult$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ElementResult(String str, zzdi zzdiVar, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.id = str;
            this.result = zzdiVar;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ElementResult)) {
                return false;
            }
            ElementResult elementResult = (ElementResult) obj;
            return Intrinsics.areEqual(unknownFields(), elementResult.unknownFields()) && Intrinsics.areEqual(this.id, elementResult.id) && Intrinsics.areEqual(this.result, elementResult.result);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            zzdi zzdiVar = this.result;
            int hashCode3 = hashCode2 + (zzdiVar != null ? zzdiVar.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SetAmountRequest.Builder builder = new SetAmountRequest.Builder(22);
            builder.request_context = this.id;
            builder.result = this.result;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
            }
            zzdi zzdiVar = this.result;
            if (zzdiVar != null) {
                arrayList.add("result=" + zzdiVar);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ElementResult{", "}", 0, null, null, 56);
        }

        public final class EmojiPickerResult extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<EmojiPickerResult> CREATOR;
            public final String selection;

            static {
                SubmitFormRequest$ElementResult$EmojiPickerResult$Companion$ADAPTER$1 submitFormRequest$ElementResult$EmojiPickerResult$Companion$ADAPTER$1 = new SubmitFormRequest$ElementResult$EmojiPickerResult$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EmojiPickerResult.class), "type.googleapis.com/squareup.franklin.app.SubmitFormRequest.ElementResult.EmojiPickerResult", Syntax.PROTO_2, null, "squareup/franklin/app/submit_form.proto");
                ADAPTER = submitFormRequest$ElementResult$EmojiPickerResult$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(submitFormRequest$ElementResult$EmojiPickerResult$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EmojiPickerResult(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.selection = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof EmojiPickerResult)) {
                    return false;
                }
                EmojiPickerResult emojiPickerResult = (EmojiPickerResult) obj;
                return Intrinsics.areEqual(unknownFields(), emojiPickerResult.unknownFields()) && Intrinsics.areEqual(this.selection, emojiPickerResult.selection);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.selection;
                int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                OpaqueRoute.Builder builder = new OpaqueRoute.Builder(15);
                builder.client_route = this.selection;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.selection;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "selection=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "EmojiPickerResult{", "}", 0, null, null, 56);
            }

            public /* synthetic */ EmojiPickerResult(String str) {
                this(str, ByteString.EMPTY);
            }
        }

        public final class OptionPickerResult extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<OptionPickerResult> CREATOR;
            public final String option_id;

            static {
                SubmitFormRequest$ElementResult$OptionPickerResult$Companion$ADAPTER$1 submitFormRequest$ElementResult$OptionPickerResult$Companion$ADAPTER$1 = new SubmitFormRequest$ElementResult$OptionPickerResult$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OptionPickerResult.class), "type.googleapis.com/squareup.franklin.app.SubmitFormRequest.ElementResult.OptionPickerResult", Syntax.PROTO_2, null, "squareup/franklin/app/submit_form.proto");
                ADAPTER = submitFormRequest$ElementResult$OptionPickerResult$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(submitFormRequest$ElementResult$OptionPickerResult$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OptionPickerResult(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.option_id = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof OptionPickerResult)) {
                    return false;
                }
                OptionPickerResult optionPickerResult = (OptionPickerResult) obj;
                return Intrinsics.areEqual(unknownFields(), optionPickerResult.unknownFields()) && Intrinsics.areEqual(this.option_id, optionPickerResult.option_id);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.option_id;
                int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                OpaqueRoute.Builder builder = new OpaqueRoute.Builder(16);
                builder.client_route = this.option_id;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.option_id;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "option_id=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "OptionPickerResult{", "}", 0, null, null, 56);
            }

            public /* synthetic */ OptionPickerResult(String str) {
                this(str, ByteString.EMPTY);
            }
        }

        public final class CellDefaultResult extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<CellDefaultResult> CREATOR;
            public final Boolean is_checked;
            public final String selection_group_id;

            static {
                SubmitFormRequest$ElementResult$CellDefaultResult$Companion$ADAPTER$1 submitFormRequest$ElementResult$CellDefaultResult$Companion$ADAPTER$1 = new SubmitFormRequest$ElementResult$CellDefaultResult$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CellDefaultResult.class), "type.googleapis.com/squareup.franklin.app.SubmitFormRequest.ElementResult.CellDefaultResult", Syntax.PROTO_2, null, "squareup/franklin/app/submit_form.proto");
                ADAPTER = submitFormRequest$ElementResult$CellDefaultResult$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(submitFormRequest$ElementResult$CellDefaultResult$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CellDefaultResult(String str, Boolean bool, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.is_checked = bool;
                this.selection_group_id = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CellDefaultResult)) {
                    return false;
                }
                CellDefaultResult cellDefaultResult = (CellDefaultResult) obj;
                return Intrinsics.areEqual(unknownFields(), cellDefaultResult.unknownFields()) && Intrinsics.areEqual(this.is_checked, cellDefaultResult.is_checked) && Intrinsics.areEqual(this.selection_group_id, cellDefaultResult.selection_group_id);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Boolean bool = this.is_checked;
                int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
                String str = this.selection_group_id;
                int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                PaymentRewardStatus.Builder builder = new PaymentRewardStatus.Builder(10);
                builder.show_payments = this.is_checked;
                builder.main_text = this.selection_group_id;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Boolean bool = this.is_checked;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("is_checked=", bool, arrayList);
                }
                String str = this.selection_group_id;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "selection_group_id=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "CellDefaultResult{", "}", 0, null, null, 56);
            }

            public /* synthetic */ CellDefaultResult(Boolean bool, String str) {
                this(str, bool, ByteString.EMPTY);
            }
        }

        public /* synthetic */ ElementResult(String str, zzdi zzdiVar, int i) {
            this((i & 1) != 0 ? null : str, zzdiVar, ByteString.EMPTY);
        }

        public final class TextInputResult extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<TextInputResult> CREATOR;
            public final List input_field_values;

            static {
                SubmitFormRequest$ElementResult$TextInputResult$Companion$ADAPTER$1 submitFormRequest$ElementResult$TextInputResult$Companion$ADAPTER$1 = new SubmitFormRequest$ElementResult$TextInputResult$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TextInputResult.class), "type.googleapis.com/squareup.franklin.app.SubmitFormRequest.ElementResult.TextInputResult", Syntax.PROTO_2, null, "squareup/franklin/app/submit_form.proto");
                ADAPTER = submitFormRequest$ElementResult$TextInputResult$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(submitFormRequest$ElementResult$TextInputResult$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextInputResult(List list, ByteString byteString) {
                super(ADAPTER, byteString);
                list.getClass();
                byteString.getClass();
                this.input_field_values = TransactorKt.immutableCopyOf("input_field_values", list);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof TextInputResult)) {
                    return false;
                }
                TextInputResult textInputResult = (TextInputResult) obj;
                return Intrinsics.areEqual(unknownFields(), textInputResult.unknownFields()) && Intrinsics.areEqual(this.input_field_values, textInputResult.input_field_values);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.input_field_values.hashCode() + (unknownFields().hashCode() * 37);
                this.hashCode = hashCode;
                return hashCode;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Headers.Builder builder = new Headers.Builder(20, false);
                builder.header = this.input_field_values;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                if (!this.input_field_values.isEmpty()) {
                    arrayList.add("input_field_values=██");
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "TextInputResult{", "}", 0, null, null, 56);
            }

            public TextInputResult(List list) {
                this(list, ByteString.EMPTY);
            }
        }

        public final class DateInputResult extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<DateInputResult> CREATOR;
            public final Integer day;
            public final Integer month;
            public final Integer year;

            static {
                SubmitFormRequest$ElementResult$DateInputResult$Companion$ADAPTER$1 submitFormRequest$ElementResult$DateInputResult$Companion$ADAPTER$1 = new SubmitFormRequest$ElementResult$DateInputResult$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DateInputResult.class), "type.googleapis.com/squareup.franklin.app.SubmitFormRequest.ElementResult.DateInputResult", Syntax.PROTO_2, null, "squareup/franklin/app/submit_form.proto");
                ADAPTER = submitFormRequest$ElementResult$DateInputResult$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(submitFormRequest$ElementResult$DateInputResult$Companion$ADAPTER$1);
            }

            public /* synthetic */ DateInputResult(Integer num, Integer num2, Integer num3, int i) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, ByteString.EMPTY);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DateInputResult)) {
                    return false;
                }
                DateInputResult dateInputResult = (DateInputResult) obj;
                return Intrinsics.areEqual(unknownFields(), dateInputResult.unknownFields()) && Intrinsics.areEqual(this.day, dateInputResult.day) && Intrinsics.areEqual(this.month, dateInputResult.month) && Intrinsics.areEqual(this.year, dateInputResult.year);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Integer num = this.day;
                int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
                Integer num2 = this.month;
                int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
                Integer num3 = this.year;
                int hashCode4 = hashCode3 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Date.Builder builder = new Date.Builder(4);
                builder.year = this.day;
                builder.month = this.month;
                builder.day = this.year;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                if (this.day != null) {
                    arrayList.add("day=██");
                }
                if (this.month != null) {
                    arrayList.add("month=██");
                }
                if (this.year != null) {
                    arrayList.add("year=██");
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "DateInputResult{", "}", 0, null, null, 56);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DateInputResult(Integer num, Integer num2, Integer num3, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.day = num;
                this.month = num2;
                this.year = num3;
            }
        }
    }

    public SubmitFormRequest(RequestContext requestContext, String str, List list, int i) {
        this(requestContext, (i & 2) != 0 ? null : str, (i & 4) != 0 ? EmptyList.INSTANCE : list, ByteString.EMPTY);
    }
}
