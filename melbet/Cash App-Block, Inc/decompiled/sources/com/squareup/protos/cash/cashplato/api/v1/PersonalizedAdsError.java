package com.squareup.protos.cash.cashplato.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PersonalizedAdsError extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PersonalizedAdsError> CREATOR;
    public final String error_details;
    public final ErrorType error_type;
    public final String user_message;

    public enum ErrorType implements WireEnum {
        ERROR_TYPE_UNSPECIFIED(0),
        ERROR_TYPE_CATCHALL(1),
        ERROR_TYPE_INVALID_COPY_PARAMETERS(2),
        ERROR_TYPE_INVALID_CUSTOMER_TOKEN(3),
        ERROR_TYPE_CONSENTSYS_FAILED(4),
        ERROR_TYPE_DISABLED(5),
        ERROR_TYPE_CAPS_FAILED(6),
        ERROR_TYPE_CANNOT_DETERMINE_REGION(7);

        public static final PersonalizedAdsError$ErrorType$Companion$ADAPTER$1 ADAPTER;
        public static final RadioType.Companion Companion;
        public final int value;

        static {
            ErrorType errorType = ERROR_TYPE_UNSPECIFIED;
            Companion = new RadioType.Companion();
            ADAPTER = new PersonalizedAdsError$ErrorType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ErrorType.class), Syntax.PROTO_2, errorType);
        }

        ErrorType(int i) {
            this.value = i;
        }

        public static final ErrorType fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 0:
                    return ERROR_TYPE_UNSPECIFIED;
                case 1:
                    return ERROR_TYPE_CATCHALL;
                case 2:
                    return ERROR_TYPE_INVALID_COPY_PARAMETERS;
                case 3:
                    return ERROR_TYPE_INVALID_CUSTOMER_TOKEN;
                case 4:
                    return ERROR_TYPE_CONSENTSYS_FAILED;
                case 5:
                    return ERROR_TYPE_DISABLED;
                case 6:
                    return ERROR_TYPE_CAPS_FAILED;
                case 7:
                    return ERROR_TYPE_CANNOT_DETERMINE_REGION;
                default:
                    return null;
            }
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        RadioType.Companion companion = ErrorType.Companion;
        PersonalizedAdsError$Companion$ADAPTER$1 personalizedAdsError$Companion$ADAPTER$1 = new PersonalizedAdsError$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PersonalizedAdsError.class), "type.googleapis.com/squareup.cash.cashplato.api.v1.PersonalizedAdsError", Syntax.PROTO_2, null, "squareup/cash/cashplato/api/v1/cash_plato_service.proto");
        ADAPTER = personalizedAdsError$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(personalizedAdsError$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalizedAdsError(ErrorType errorType, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.error_type = errorType;
        this.error_details = str;
        this.user_message = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersonalizedAdsError)) {
            return false;
        }
        PersonalizedAdsError personalizedAdsError = (PersonalizedAdsError) obj;
        return Intrinsics.areEqual(unknownFields(), personalizedAdsError.unknownFields()) && this.error_type == personalizedAdsError.error_type && Intrinsics.areEqual(this.error_details, personalizedAdsError.error_details) && Intrinsics.areEqual(this.user_message, personalizedAdsError.user_message);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ErrorType errorType = this.error_type;
        int hashCode2 = (hashCode + (errorType != null ? errorType.hashCode() : 0)) * 37;
        String str = this.error_details;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.user_message;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Row.Builder builder = new Row.Builder(18);
        builder.action = this.error_type;
        builder.title = this.error_details;
        builder.subtitle = this.user_message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ErrorType errorType = this.error_type;
        if (errorType != null) {
            arrayList.add("error_type=" + errorType);
        }
        String str = this.error_details;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "error_details=", arrayList);
        }
        String str2 = this.user_message;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "user_message=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PersonalizedAdsError{", "}", 0, null, null, 56);
    }
}
