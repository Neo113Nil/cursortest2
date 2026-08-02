package com.squareup.protos.cash.cashbusinessaccounts.plasma.v1;

import android.os.Parcelable;
import com.squareup.cropview.Edge;
import com.squareup.protos.cash.aegis.core.Section;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.KybUseCase;
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
public final class C4BOnboardingFlowParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<C4BOnboardingFlowParameters> CREATOR;
    public final EntryPoint entry_point;
    public final KybUseCase kyb_use_case;
    public final String referrer_flow_token;

    public enum EntryPoint implements WireEnum {
        ENTRY_POINT_UNSPECIFIED(0),
        ENTRY_POINT_PROFILE(1),
        ENTRY_POINT_ACCOUNT_INFO_SETTING(2),
        ENTRY_POINT_P2P_WARNING_SWITCH_TO_BUSINESS(3),
        ENTRY_POINT_ACCOUNT_SWITCHER(4),
        ENTRY_POINT_ACCOUNT_FOOTER(5),
        ENTRY_POINT_ACTIVITY_ROW(6),
        ENTRY_POINT_PERSONAL_USE_ELIGIBILITY_VIOLATION(7),
        ENTRY_POINT_BIDV_APPROVED_PUSH(8),
        ENTRY_POINT_BIDV_APPROVED_EMAIL(9),
        ENTRY_POINT_BIDV_FAILED_PUSH(10),
        ENTRY_POINT_BIDV_FAILED_EMAIL(11),
        ENTRY_POINT_BIDV_FAILED_IN_APP_INLINE(12),
        ENTRY_POINT_BIDV_FAILED_HAS_ATTEMPTS_REMAINING_PUSH(15),
        ENTRY_POINT_BIDV_FAILED_HAS_ATTEMPTS_REMAINING_EMAIL(16),
        ENTRY_POINT_BIDV_FAILED_ATTEMPTS_EXHAUSTED_PUSH(17),
        ENTRY_POINT_BIDV_FAILED_ATTEMPTS_EXHAUSTED_EMAIL(18),
        ENTRY_POINT_C4B_AUTO_DOWNGRADED(13),
        ENTRY_POINT_PROFILE_UPSELL(14);

        public static final C4BOnboardingFlowParameters$EntryPoint$Companion$ADAPTER$1 ADAPTER;
        public static final Edge.Companion Companion;
        public final int value;

        static {
            EntryPoint entryPoint = ENTRY_POINT_UNSPECIFIED;
            Companion = new Edge.Companion(22);
            ADAPTER = new C4BOnboardingFlowParameters$EntryPoint$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(EntryPoint.class), Syntax.PROTO_2, entryPoint);
        }

        EntryPoint(int i) {
            this.value = i;
        }

        public static final EntryPoint fromValue(int i) {
            Companion.getClass();
            return Edge.Companion.m3827fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        C4BOnboardingFlowParameters$Companion$ADAPTER$1 c4BOnboardingFlowParameters$Companion$ADAPTER$1 = new C4BOnboardingFlowParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(C4BOnboardingFlowParameters.class), "type.googleapis.com/squareup.cash.cashbusinessaccounts.plasma.v1.C4BOnboardingFlowParameters", Syntax.PROTO_2, null, "squareup/cash/cashbusinessaccounts/plasma/v1/c4b_onboarding_flow.proto");
        ADAPTER = c4BOnboardingFlowParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(c4BOnboardingFlowParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4BOnboardingFlowParameters(EntryPoint entryPoint, String str, KybUseCase kybUseCase, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.entry_point = entryPoint;
        this.referrer_flow_token = str;
        this.kyb_use_case = kybUseCase;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4BOnboardingFlowParameters)) {
            return false;
        }
        C4BOnboardingFlowParameters c4BOnboardingFlowParameters = (C4BOnboardingFlowParameters) obj;
        return Intrinsics.areEqual(unknownFields(), c4BOnboardingFlowParameters.unknownFields()) && this.entry_point == c4BOnboardingFlowParameters.entry_point && Intrinsics.areEqual(this.referrer_flow_token, c4BOnboardingFlowParameters.referrer_flow_token) && this.kyb_use_case == c4BOnboardingFlowParameters.kyb_use_case;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        EntryPoint entryPoint = this.entry_point;
        int hashCode2 = (hashCode + (entryPoint != null ? entryPoint.hashCode() : 0)) * 37;
        String str = this.referrer_flow_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        KybUseCase kybUseCase = this.kyb_use_case;
        int hashCode4 = hashCode3 + (kybUseCase != null ? kybUseCase.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Section.Builder builder = new Section.Builder(28);
        builder.header_button = this.entry_point;
        builder.header_text = this.referrer_flow_token;
        builder.groups = this.kyb_use_case;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        EntryPoint entryPoint = this.entry_point;
        if (entryPoint != null) {
            arrayList.add("entry_point=" + entryPoint);
        }
        if (this.referrer_flow_token != null) {
            arrayList.add("referrer_flow_token=██");
        }
        KybUseCase kybUseCase = this.kyb_use_case;
        if (kybUseCase != null) {
            arrayList.add("kyb_use_case=" + kybUseCase);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "C4BOnboardingFlowParameters{", "}", 0, null, null, 56);
    }

    public /* synthetic */ C4BOnboardingFlowParameters(EntryPoint entryPoint, String str) {
        this(entryPoint, str, null, ByteString.EMPTY);
    }
}
