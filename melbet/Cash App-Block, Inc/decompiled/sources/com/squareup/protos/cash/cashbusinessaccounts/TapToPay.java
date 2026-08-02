package com.squareup.protos.cash.cashbusinessaccounts;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cropview.Edge;
import com.squareup.protos.cash.aegis.core.Section;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TapToPay extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TapToPay> CREATOR;
    public final OnboardingStatus onboarding_status;
    public final String payment_description_suggestion_algorithm;
    public final List payment_description_suggestions;

    public enum OnboardingStatus implements WireEnum {
        NOT_TARGETED(1),
        NOMINATED(2),
        ACTIVATED(3),
        DEACTIVATED(4),
        ARCHIVED(5);

        public final int value;
        public static final Edge.Companion Companion = new Edge.Companion(21);
        public static final TapToPay$OnboardingStatus$Companion$ADAPTER$1 ADAPTER = new TapToPay$OnboardingStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OnboardingStatus.class), Syntax.PROTO_2, null);

        OnboardingStatus(int i) {
            this.value = i;
        }

        public static final OnboardingStatus fromValue(int i) {
            Companion.getClass();
            return Edge.Companion.m3826fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        TapToPay$Companion$ADAPTER$1 tapToPay$Companion$ADAPTER$1 = new TapToPay$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TapToPay.class), "type.googleapis.com/squareup.cash.cashbusinessaccounts.TapToPay", Syntax.PROTO_2, null, "squareup/cash/cashbusinessaccounts/sync_values.proto");
        ADAPTER = tapToPay$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(tapToPay$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapToPay(OnboardingStatus onboardingStatus, List list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.onboarding_status = onboardingStatus;
        this.payment_description_suggestion_algorithm = str;
        this.payment_description_suggestions = TransactorKt.immutableCopyOf("payment_description_suggestions", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TapToPay)) {
            return false;
        }
        TapToPay tapToPay = (TapToPay) obj;
        return Intrinsics.areEqual(unknownFields(), tapToPay.unknownFields()) && this.onboarding_status == tapToPay.onboarding_status && Intrinsics.areEqual(this.payment_description_suggestions, tapToPay.payment_description_suggestions) && Intrinsics.areEqual(this.payment_description_suggestion_algorithm, tapToPay.payment_description_suggestion_algorithm);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        OnboardingStatus onboardingStatus = this.onboarding_status;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (onboardingStatus != null ? onboardingStatus.hashCode() : 0)) * 37, 37, this.payment_description_suggestions);
        String str = this.payment_description_suggestion_algorithm;
        int hashCode2 = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Section.Builder builder = new Section.Builder(23);
        builder.header_button = this.onboarding_status;
        builder.groups = this.payment_description_suggestions;
        builder.header_text = this.payment_description_suggestion_algorithm;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        OnboardingStatus onboardingStatus = this.onboarding_status;
        if (onboardingStatus != null) {
            arrayList.add("onboarding_status=" + onboardingStatus);
        }
        if (!this.payment_description_suggestions.isEmpty()) {
            arrayList.add("payment_description_suggestions=██");
        }
        String str = this.payment_description_suggestion_algorithm;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "payment_description_suggestion_algorithm=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TapToPay{", "}", 0, null, null, 56);
    }
}
