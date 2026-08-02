package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.datadog.android.ndk.internal.NdkCrashLog;
import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import com.datadog.android.rum.model.ActionEvent;
import com.google.android.gms.internal.mlkit_vision_common.zzik;
import com.google.android.gms.internal.mlkit_vision_common.zzil;
import com.google.android.gms.internal.mlkit_vision_common.zzir;
import com.google.android.gms.internal.mlkit_vision_common.zzjf;
import com.google.android.gms.internal.mlkit_vision_common.zzjj;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.CreateOrderResponse;
import com.squareup.protos.cash.local.client.v1.EducationalSheetText;
import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.protos.cash.local.client.v1.GetFulfillmentSchedulingQuoteRequest;
import com.squareup.protos.cash.local.client.v1.LocalAdditionalBuyerInfo;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.protos.cash.local.client.v1.LocalProfileWidget;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionDetailsPlaceholder;
import com.squareup.protos.cash.marketdata.model.InvestmentEarnings;
import com.squareup.protos.cash.messagingplatformcommon.ondemand.GetInAppMessagesResponse;
import com.squareup.protos.cash.messagingplatformcommon.placements.Placement;
import com.squareup.protos.cash.money.content.MoneyTab;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
import com.squareup.protos.cash.nearby.api.v1.ConnectionData;
import com.squareup.protos.cash.nearby.api.v1.GetNearbySessionRequest;
import com.squareup.protos.cash.nearby.api.v1.GetNearbySessionResponse;
import com.squareup.protos.cash.nearby.api.v1.NFCPayload;
import com.squareup.protos.cash.nearby.api.v1.NearbySession;
import com.squareup.protos.common.signing.SigningData;
import com.squareup.protos.invest.ui.Section;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InputValue extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InputValue> CREATOR;
    public final String input_id;
    public final InputData value;

    public final class AppointmentSlotValue extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AppointmentSlotValue> CREATOR;
        public final Instant selected_time;
        public final String slot_id;

        static {
            InputValue$AppointmentSlotValue$Companion$ADAPTER$1 inputValue$AppointmentSlotValue$Companion$ADAPTER$1 = new InputValue$AppointmentSlotValue$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AppointmentSlotValue.class), "type.googleapis.com/squareup.cash.local.client.v1.InputValue.AppointmentSlotValue", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_cart.proto");
            ADAPTER = inputValue$AppointmentSlotValue$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(inputValue$AppointmentSlotValue$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppointmentSlotValue(String str, Instant instant, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.slot_id = str;
            this.selected_time = instant;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AppointmentSlotValue)) {
                return false;
            }
            AppointmentSlotValue appointmentSlotValue = (AppointmentSlotValue) obj;
            return Intrinsics.areEqual(unknownFields(), appointmentSlotValue.unknownFields()) && Intrinsics.areEqual(this.slot_id, appointmentSlotValue.slot_id) && Intrinsics.areEqual(this.selected_time, appointmentSlotValue.selected_time);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.slot_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Instant instant = this.selected_time;
            int hashCode3 = hashCode2 + (instant != null ? instant.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(14);
            builder.input_id = this.slot_id;
            builder.value = this.selected_time;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.slot_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "slot_id=", arrayList);
            }
            Instant instant = this.selected_time;
            if (instant != null) {
                Matcher$$ExternalSyntheticOutline0.m("selected_time=", instant, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AppointmentSlotValue{", "}", 0, null, null, 56);
        }
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object input_id;
        public Object value;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new InputValue((String) this.input_id, (InputData) this.value, buildUnknownFields());
                case 1:
                    return new CreateOrderResponse.ErrorResponse.Error((String) this.input_id, (LocalErrorResponse.Error.Type) this.value, buildUnknownFields());
                case 2:
                    return new CreateOrderResponse.InputsNotFulfilled((CreateCartResponse) this.input_id, (List) this.value, buildUnknownFields());
                case 3:
                    return new CreateOrderResponse.InputsNotFulfilled.InputError((String) this.input_id, (LocalErrorResponse.Error) this.value, buildUnknownFields());
                case 4:
                    return new CreateOrderResponse.Success((LocalOrder) this.value, (String) this.input_id, buildUnknownFields());
                case 5:
                    return new EducationalSheetContent((NdkCrashLog.Companion) this.value, (String) this.input_id, buildUnknownFields());
                case 6:
                    String str = (String) this.input_id;
                    if (str == null) {
                        TransactorKt.missingRequiredFields(str, "value");
                        throw null;
                    }
                    EducationalSheetText.Style style = (EducationalSheetText.Style) this.value;
                    if (style != null) {
                        return new EducationalSheetText(str, style, buildUnknownFields());
                    }
                    TransactorKt.missingRequiredFields(style, "style");
                    throw null;
                case 7:
                    return new GetActiveOrdersResponse((List) this.input_id, (LocalErrorResponse) this.value, buildUnknownFields());
                case 8:
                    return new GetBrandCollectionResponse((BrandCollection) this.input_id, (Long) this.value, buildUnknownFields());
                case 9:
                    return new GetEditorialResponse.EditorialContent.Image((LocalImage) this.input_id, (GetEditorialResponse.EditorialContent.Image.Style) this.value, buildUnknownFields());
                case 10:
                    return new GetEditorialResponse.EditorialContent.Text.Font((Long) this.input_id, (GetEditorialResponse.EditorialContent.Text.Font.Weight) this.value, buildUnknownFields());
                case 11:
                    return new GetFulfillmentSchedulingQuoteRequest.FreeFormFulfillmentFilter((LocalFulfillmentType) this.input_id, (LocalAddress) this.value, buildUnknownFields());
                case 12:
                    return new GetShortlinkResponse((ViewUtilsKt) this.input_id, (List) this.value, buildUnknownFields());
                case 13:
                    return new InputSpecification((Boolean) this.input_id, (zzik) this.value, buildUnknownFields());
                case 14:
                    return new AppointmentSlotValue((String) this.input_id, (Instant) this.value, buildUnknownFields());
                case 15:
                    return new LocalAdditionalBuyerInfo((LocalAdditionalBuyerInfo.Type) this.value, (String) this.input_id, buildUnknownFields());
                case 16:
                    return new LocalButton((String) this.input_id, (zzir) this.value, buildUnknownFields());
                case 17:
                    return new LocalPaymentMethod((LocalPaymentOption) this.input_id, (LocalPaymentMethod$PaymentMethodData$StoredInstrument) this.value, buildUnknownFields());
                case 18:
                    return new LocalProfileWidget((LocalProfileWidget.Type) this.input_id, (ActionEvent.Companion) this.value, buildUnknownFields());
                case 19:
                    return new PreferredPaymentMethod((LocalPaymentOption) this.value, (String) this.input_id, buildUnknownFields());
                case 20:
                    return new TagDefinition((String) this.input_id, (zzjf) this.value, buildUnknownFields());
                case 21:
                    return new UpdateCartResponse((CreateCartResponse) this.input_id, (ActionEvent.Dd.Companion) this.value, buildUnknownFields());
                case 22:
                    return new LoyaltyPromotionDetailsPlaceholder((List) this.input_id, (LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData) this.value, buildUnknownFields());
                case 23:
                    return new LoyaltyPromotionDetailsPlaceholder.LoyaltyPromotionData.Section((String) this.input_id, (zzjj) this.value, buildUnknownFields());
                case 24:
                    return new InvestmentEarnings((List) this.input_id, (Section.Row.MoreInfo) this.value, buildUnknownFields());
                case 25:
                    return new GetInAppMessagesResponse.PlacementToMessages((Placement) this.input_id, (List) this.value, buildUnknownFields());
                case 26:
                    return new MoneyTab.Applet((MoneyTab.Applet.Id) this.input_id, (MoneyTab.Applet.Banner) this.value, buildUnknownFields());
                case 27:
                    return new ConnectionData((BLEPayload) this.input_id, (NFCPayload) this.value, buildUnknownFields());
                case 28:
                    return new GetNearbySessionRequest((ByteString) this.input_id, (SigningData) this.value, buildUnknownFields());
                default:
                    return new GetNearbySessionResponse((NearbySession) this.input_id, (GetNearbySessionResponse.ErrorCode) this.value, buildUnknownFields());
            }
        }
    }

    public final class InputData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InputData> CREATOR;
        public final zzil data;

        static {
            InputValue$InputData$Companion$ADAPTER$1 inputValue$InputData$Companion$ADAPTER$1 = new InputValue$InputData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InputData.class), "type.googleapis.com/squareup.cash.local.client.v1.InputValue.InputData", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_cart.proto");
            ADAPTER = inputValue$InputData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(inputValue$InputData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InputData(zzil zzilVar, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.data = zzilVar;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InputData)) {
                return false;
            }
            InputData inputData = (InputData) obj;
            return Intrinsics.areEqual(unknownFields(), inputData.unknownFields()) && Intrinsics.areEqual(this.data, inputData.data);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            zzil zzilVar = this.data;
            int hashCode2 = hashCode + (zzilVar != null ? zzilVar.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            LocalBuyer.Builder builder = new LocalBuyer.Builder(6);
            builder.local_buyer = this.data;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            zzil zzilVar = this.data;
            if (zzilVar != null) {
                arrayList.add("data=" + zzilVar);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InputData{", "}", 0, null, null, 56);
        }
    }

    static {
        InputValue$Companion$ADAPTER$1 inputValue$Companion$ADAPTER$1 = new InputValue$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InputValue.class), "type.googleapis.com/squareup.cash.local.client.v1.InputValue", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_cart.proto");
        ADAPTER = inputValue$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(inputValue$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputValue(String str, InputData inputData, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.input_id = str;
        this.value = inputData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InputValue)) {
            return false;
        }
        InputValue inputValue = (InputValue) obj;
        return Intrinsics.areEqual(unknownFields(), inputValue.unknownFields()) && Intrinsics.areEqual(this.input_id, inputValue.input_id) && Intrinsics.areEqual(this.value, inputValue.value);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.input_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        InputData inputData = this.value;
        int hashCode3 = hashCode2 + (inputData != null ? inputData.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.input_id = this.input_id;
        builder.value = this.value;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.input_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "input_id=", arrayList);
        }
        InputData inputData = this.value;
        if (inputData != null) {
            arrayList.add("value=" + inputData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InputValue{", "}", 0, null, null, 56);
    }
}
