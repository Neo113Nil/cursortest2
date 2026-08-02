package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
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
public final class RequiredInput extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RequiredInput> CREATOR;
    public final String input_id;
    public final InputType input_type;
    public final InputSpecification specification;
    public final State state;
    public final LocalErrorResponse.Error validation_error;

    public enum InputType implements WireEnum {
        INPUT_TYPE_UNSPECIFIED(0),
        INPUT_TYPE_TEXT(1),
        INPUT_TYPE_PHONE(2),
        INPUT_TYPE_APPOINTMENT_SLOT(3),
        INPUT_TYPE_ADDRESS(4),
        INPUT_TYPE_OPTION_PICKER(5);

        public static final RequiredInput$InputType$Companion$ADAPTER$1 ADAPTER;
        public static final Origin.Companion Companion;
        public final int value;

        static {
            InputType inputType = INPUT_TYPE_UNSPECIFIED;
            Companion = new Origin.Companion();
            ADAPTER = new RequiredInput$InputType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(InputType.class), Syntax.PROTO_2, inputType);
        }

        InputType(int i) {
            this.value = i;
        }

        public static final InputType fromValue(int i) {
            Companion.getClass();
            return Origin.Companion.m3884fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum State implements WireEnum {
        STATE_UNSPECIFIED(0),
        STATE_PENDING(1),
        STATE_COMPLETE(2),
        STATE_INVALID(3);

        public static final RequiredInput$State$Companion$ADAPTER$1 ADAPTER;
        public static final SliceStatus.Companion Companion;
        public final int value;

        static {
            State state = STATE_UNSPECIFIED;
            Companion = new SliceStatus.Companion();
            ADAPTER = new RequiredInput$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(State.class), Syntax.PROTO_2, state);
        }

        State(int i) {
            this.value = i;
        }

        public static final State fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return STATE_UNSPECIFIED;
            }
            if (i == 1) {
                return STATE_PENDING;
            }
            if (i == 2) {
                return STATE_COMPLETE;
            }
            if (i != 3) {
                return null;
            }
            return STATE_INVALID;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        RequiredInput$Companion$ADAPTER$1 requiredInput$Companion$ADAPTER$1 = new RequiredInput$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RequiredInput.class), "type.googleapis.com/squareup.cash.local.client.v1.RequiredInput", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_cart.proto");
        ADAPTER = requiredInput$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(requiredInput$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequiredInput(String str, InputType inputType, State state, InputSpecification inputSpecification, LocalErrorResponse.Error error, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.input_id = str;
        this.input_type = inputType;
        this.state = state;
        this.specification = inputSpecification;
        this.validation_error = error;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RequiredInput)) {
            return false;
        }
        RequiredInput requiredInput = (RequiredInput) obj;
        return Intrinsics.areEqual(unknownFields(), requiredInput.unknownFields()) && Intrinsics.areEqual(this.input_id, requiredInput.input_id) && this.input_type == requiredInput.input_type && this.state == requiredInput.state && Intrinsics.areEqual(this.specification, requiredInput.specification) && Intrinsics.areEqual(this.validation_error, requiredInput.validation_error);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.input_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        InputType inputType = this.input_type;
        int hashCode3 = (hashCode2 + (inputType != null ? inputType.hashCode() : 0)) * 37;
        State state = this.state;
        int hashCode4 = (hashCode3 + (state != null ? state.hashCode() : 0)) * 37;
        InputSpecification inputSpecification = this.specification;
        int hashCode5 = (hashCode4 + (inputSpecification != null ? inputSpecification.hashCode() : 0)) * 37;
        LocalErrorResponse.Error error = this.validation_error;
        int hashCode6 = hashCode5 + (error != null ? error.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BrandBanner.Builder builder = new BrandBanner.Builder(13);
        builder.icon = this.input_id;
        builder.title = this.input_type;
        builder.subtitle = this.state;
        builder.action = this.specification;
        builder.icon_background_color = this.validation_error;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.input_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "input_id=", arrayList);
        }
        InputType inputType = this.input_type;
        if (inputType != null) {
            arrayList.add("input_type=" + inputType);
        }
        State state = this.state;
        if (state != null) {
            arrayList.add("state=" + state);
        }
        InputSpecification inputSpecification = this.specification;
        if (inputSpecification != null) {
            arrayList.add("specification=" + inputSpecification);
        }
        LocalErrorResponse.Error error = this.validation_error;
        if (error != null) {
            arrayList.add("validation_error=" + error);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RequiredInput{", "}", 0, null, null, 56);
    }
}
