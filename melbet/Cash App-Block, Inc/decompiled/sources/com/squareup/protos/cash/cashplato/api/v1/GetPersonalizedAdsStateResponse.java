package com.squareup.protos.cash.cashplato.api.v1;

import android.os.Parcelable;
import app.cash.local.viewmodels.sheet.EducationalButtonAction;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.Activity;
import com.squareup.protos.franklin.common.PaymentRewardStatus;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetPersonalizedAdsStateResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetPersonalizedAdsStateResponse> CREATOR;
    public final EducationalButtonAction response;

    public final class State extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<State> CREATOR;
        public final String copy_text;
        public final Boolean personalized_ads_enabled;

        static {
            GetPersonalizedAdsStateResponse$State$Companion$ADAPTER$1 getPersonalizedAdsStateResponse$State$Companion$ADAPTER$1 = new GetPersonalizedAdsStateResponse$State$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(State.class), "type.googleapis.com/squareup.cash.cashplato.api.v1.GetPersonalizedAdsStateResponse.State", Syntax.PROTO_2, null, "squareup/cash/cashplato/api/v1/cash_plato_service.proto");
            ADAPTER = getPersonalizedAdsStateResponse$State$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getPersonalizedAdsStateResponse$State$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public State(String str, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.personalized_ads_enabled = bool;
            this.copy_text = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.areEqual(unknownFields(), state.unknownFields()) && Intrinsics.areEqual(this.personalized_ads_enabled, state.personalized_ads_enabled) && Intrinsics.areEqual(this.copy_text, state.copy_text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Boolean bool = this.personalized_ads_enabled;
            int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            String str = this.copy_text;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            PaymentRewardStatus.Builder builder = new PaymentRewardStatus.Builder(2);
            builder.show_payments = this.personalized_ads_enabled;
            builder.main_text = this.copy_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Boolean bool = this.personalized_ads_enabled;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("personalized_ads_enabled=", bool, arrayList);
            }
            String str = this.copy_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "copy_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "State{", "}", 0, null, null, 56);
        }
    }

    static {
        GetPersonalizedAdsStateResponse$Companion$ADAPTER$1 getPersonalizedAdsStateResponse$Companion$ADAPTER$1 = new GetPersonalizedAdsStateResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetPersonalizedAdsStateResponse.class), "type.googleapis.com/squareup.cash.cashplato.api.v1.GetPersonalizedAdsStateResponse", Syntax.PROTO_2, null, "squareup/cash/cashplato/api/v1/cash_plato_service.proto");
        ADAPTER = getPersonalizedAdsStateResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getPersonalizedAdsStateResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPersonalizedAdsStateResponse(EducationalButtonAction educationalButtonAction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response = educationalButtonAction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPersonalizedAdsStateResponse)) {
            return false;
        }
        GetPersonalizedAdsStateResponse getPersonalizedAdsStateResponse = (GetPersonalizedAdsStateResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getPersonalizedAdsStateResponse.unknownFields()) && Intrinsics.areEqual(this.response, getPersonalizedAdsStateResponse.response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        EducationalButtonAction educationalButtonAction = this.response;
        int hashCode2 = hashCode + (educationalButtonAction != null ? educationalButtonAction.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Activity.Builder builder = new Activity.Builder(20);
        builder.activity = this.response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        EducationalButtonAction educationalButtonAction = this.response;
        if (educationalButtonAction != null) {
            arrayList.add("response=" + educationalButtonAction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPersonalizedAdsStateResponse{", "}", 0, null, null, 56);
    }
}
