package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.franklin.ui.UiCashLimits;
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

/* loaded from: classes8.dex */
public final class P2pPoolMemberRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<P2pPoolMemberRenderData> CREATOR;
    public final MembershipStatus membership_status;

    public enum MembershipStatus implements WireEnum {
        UNKNOWN(0),
        ADDED_BY_OWNER(1),
        ADDED_THROUGH_SHARE_LINK(2),
        REMOVED_BY_OWNER(3),
        REMOVED_BY_SELF(4);

        public static final P2pPoolMemberRenderData$MembershipStatus$Companion$ADAPTER$1 ADAPTER;
        public static final Trigger.Companion Companion;
        public final int value;

        static {
            MembershipStatus membershipStatus = UNKNOWN;
            Companion = new Trigger.Companion();
            ADAPTER = new P2pPoolMemberRenderData$MembershipStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(MembershipStatus.class), Syntax.PROTO_2, membershipStatus);
        }

        MembershipStatus(int i) {
            this.value = i;
        }

        public static final MembershipStatus fromValue(int i) {
            Companion.getClass();
            return Trigger.Companion.m3951fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        P2pPoolMemberRenderData$Companion$ADAPTER$1 p2pPoolMemberRenderData$Companion$ADAPTER$1 = new P2pPoolMemberRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(P2pPoolMemberRenderData.class), "type.googleapis.com/squareup.franklin.P2pPoolMemberRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = p2pPoolMemberRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(p2pPoolMemberRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2pPoolMemberRenderData(MembershipStatus membershipStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.membership_status = membershipStatus;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof P2pPoolMemberRenderData)) {
            return false;
        }
        P2pPoolMemberRenderData p2pPoolMemberRenderData = (P2pPoolMemberRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), p2pPoolMemberRenderData.unknownFields()) && this.membership_status == p2pPoolMemberRenderData.membership_status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        MembershipStatus membershipStatus = this.membership_status;
        int hashCode2 = hashCode + (membershipStatus != null ? membershipStatus.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiCashLimits.Builder builder = new UiCashLimits.Builder(1);
        builder.cash_limit_group = this.membership_status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        MembershipStatus membershipStatus = this.membership_status;
        if (membershipStatus != null) {
            arrayList.add("membership_status=" + membershipStatus);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "P2pPoolMemberRenderData{", "}", 0, null, null, 56);
    }
}
