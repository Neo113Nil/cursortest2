package com.squareup.protos.franklin.onboarding;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import xyz.block.protos.genie.IdValue;

/* loaded from: classes8.dex */
public final class InvitationOnboardingDeepLinkPayload extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InvitationOnboardingDeepLinkPayload> CREATOR;
    public final String invitation_code;
    public final String promotion_code;

    static {
        InvitationOnboardingDeepLinkPayload$Companion$ADAPTER$1 invitationOnboardingDeepLinkPayload$Companion$ADAPTER$1 = new InvitationOnboardingDeepLinkPayload$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InvitationOnboardingDeepLinkPayload.class), "type.googleapis.com/squareup.franklin.onboarding.InvitationOnboardingDeepLinkPayload", Syntax.PROTO_2, null, "squareup/franklin/onboarding.proto");
        ADAPTER = invitationOnboardingDeepLinkPayload$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(invitationOnboardingDeepLinkPayload$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvitationOnboardingDeepLinkPayload(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.invitation_code = str;
        this.promotion_code = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InvitationOnboardingDeepLinkPayload)) {
            return false;
        }
        InvitationOnboardingDeepLinkPayload invitationOnboardingDeepLinkPayload = (InvitationOnboardingDeepLinkPayload) obj;
        return Intrinsics.areEqual(unknownFields(), invitationOnboardingDeepLinkPayload.unknownFields()) && Intrinsics.areEqual(this.invitation_code, invitationOnboardingDeepLinkPayload.invitation_code) && Intrinsics.areEqual(this.promotion_code, invitationOnboardingDeepLinkPayload.promotion_code);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.invitation_code;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.promotion_code;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        IdValue.Builder builder = new IdValue.Builder(10);
        builder.server = this.invitation_code;
        builder.local = this.promotion_code;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.invitation_code;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "invitation_code=", arrayList);
        }
        String str2 = this.promotion_code;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "promotion_code=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InvitationOnboardingDeepLinkPayload{", "}", 0, null, null, 56);
    }
}
