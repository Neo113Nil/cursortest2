package com.squareup.protos.franklin.onboarding;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.lending.OpaqueRoute;
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
public final class StaffInvitationOnboardingDeepLinkPayload extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StaffInvitationOnboardingDeepLinkPayload> CREATOR;
    public final String invitation_code;

    static {
        StaffInvitationOnboardingDeepLinkPayload$Companion$ADAPTER$1 staffInvitationOnboardingDeepLinkPayload$Companion$ADAPTER$1 = new StaffInvitationOnboardingDeepLinkPayload$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StaffInvitationOnboardingDeepLinkPayload.class), "type.googleapis.com/squareup.franklin.onboarding.StaffInvitationOnboardingDeepLinkPayload", Syntax.PROTO_2, null, "squareup/franklin/onboarding.proto");
        ADAPTER = staffInvitationOnboardingDeepLinkPayload$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(staffInvitationOnboardingDeepLinkPayload$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaffInvitationOnboardingDeepLinkPayload(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.invitation_code = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaffInvitationOnboardingDeepLinkPayload)) {
            return false;
        }
        StaffInvitationOnboardingDeepLinkPayload staffInvitationOnboardingDeepLinkPayload = (StaffInvitationOnboardingDeepLinkPayload) obj;
        return Intrinsics.areEqual(unknownFields(), staffInvitationOnboardingDeepLinkPayload.unknownFields()) && Intrinsics.areEqual(this.invitation_code, staffInvitationOnboardingDeepLinkPayload.invitation_code);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.invitation_code;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        OpaqueRoute.Builder builder = new OpaqueRoute.Builder(24);
        builder.client_route = this.invitation_code;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.invitation_code;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "invitation_code=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StaffInvitationOnboardingDeepLinkPayload{", "}", 0, null, null, 56);
    }
}
