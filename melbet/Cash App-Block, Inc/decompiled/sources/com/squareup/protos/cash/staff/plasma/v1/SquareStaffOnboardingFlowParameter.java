package com.squareup.protos.cash.staff.plasma.v1;

import android.os.Parcelable;
import com.squareup.protos.common.Header;
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

/* loaded from: classes8.dex */
public final class SquareStaffOnboardingFlowParameter extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SquareStaffOnboardingFlowParameter> CREATOR;
    public final String invitation_token;
    public final String selected_customer_token;

    static {
        SquareStaffOnboardingFlowParameter$Companion$ADAPTER$1 squareStaffOnboardingFlowParameter$Companion$ADAPTER$1 = new SquareStaffOnboardingFlowParameter$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SquareStaffOnboardingFlowParameter.class), "type.googleapis.com/squareup.cash.staff.plasma.v1.SquareStaffOnboardingFlowParameter", Syntax.PROTO_2, null, "squareup/cash/staff/plasma/v1/square_staff_onboarding.proto");
        ADAPTER = squareStaffOnboardingFlowParameter$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(squareStaffOnboardingFlowParameter$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquareStaffOnboardingFlowParameter(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.invitation_token = str;
        this.selected_customer_token = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SquareStaffOnboardingFlowParameter)) {
            return false;
        }
        SquareStaffOnboardingFlowParameter squareStaffOnboardingFlowParameter = (SquareStaffOnboardingFlowParameter) obj;
        return Intrinsics.areEqual(unknownFields(), squareStaffOnboardingFlowParameter.unknownFields()) && Intrinsics.areEqual(this.invitation_token, squareStaffOnboardingFlowParameter.invitation_token) && Intrinsics.areEqual(this.selected_customer_token, squareStaffOnboardingFlowParameter.selected_customer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.invitation_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.selected_customer_token;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Header.Builder builder = new Header.Builder(14);
        builder.name = this.invitation_token;
        builder.value = this.selected_customer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.invitation_token != null) {
            arrayList.add("invitation_token=██");
        }
        if (this.selected_customer_token != null) {
            arrayList.add("selected_customer_token=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SquareStaffOnboardingFlowParameter{", "}", 0, null, null, 56);
    }

    public /* synthetic */ SquareStaffOnboardingFlowParameter(String str) {
        this(str, null, ByteString.EMPTY);
    }
}
