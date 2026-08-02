package com.squareup.protos.timecards;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiPublicProfile;
import com.squareup.protos.timecards.ChangeProposal;
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
public final class ChangeProposalAdvancement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ChangeProposalAdvancement> CREATOR;
    public final String created_at;
    public final String note;
    public final ChangeProposal.State previous_state;
    public final ChangeProposal.State state;
    public final String team_member_id;
    public final String updated_at;

    static {
        ChangeProposalAdvancement$Companion$ADAPTER$1 changeProposalAdvancement$Companion$ADAPTER$1 = new ChangeProposalAdvancement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ChangeProposalAdvancement.class), "type.googleapis.com/squareup.timecards.ChangeProposalAdvancement", Syntax.PROTO_2, null, "squareup/timecards/change_proposal.proto");
        ADAPTER = changeProposalAdvancement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(changeProposalAdvancement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeProposalAdvancement(String str, ChangeProposal.State state, ChangeProposal.State state2, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.team_member_id = str;
        this.state = state;
        this.previous_state = state2;
        this.note = str2;
        this.created_at = str3;
        this.updated_at = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChangeProposalAdvancement)) {
            return false;
        }
        ChangeProposalAdvancement changeProposalAdvancement = (ChangeProposalAdvancement) obj;
        return Intrinsics.areEqual(unknownFields(), changeProposalAdvancement.unknownFields()) && Intrinsics.areEqual(this.team_member_id, changeProposalAdvancement.team_member_id) && this.state == changeProposalAdvancement.state && this.previous_state == changeProposalAdvancement.previous_state && Intrinsics.areEqual(this.note, changeProposalAdvancement.note) && Intrinsics.areEqual(this.created_at, changeProposalAdvancement.created_at) && Intrinsics.areEqual(this.updated_at, changeProposalAdvancement.updated_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.team_member_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ChangeProposal.State state = this.state;
        int hashCode3 = (hashCode2 + (state != null ? state.hashCode() : 0)) * 37;
        ChangeProposal.State state2 = this.previous_state;
        int hashCode4 = (hashCode3 + (state2 != null ? state2.hashCode() : 0)) * 37;
        String str2 = this.note;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.created_at;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.updated_at;
        int hashCode7 = hashCode6 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiPublicProfile.Builder builder = new UiPublicProfile.Builder(28, false);
        builder.full_name = this.team_member_id;
        builder.full_cashtag = this.state;
        builder.cashtag_url_enabled = this.previous_state;
        builder.photo_url = this.note;
        builder.synopsis = this.created_at;
        builder.is_verified_account = this.updated_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.team_member_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "team_member_id=", arrayList);
        }
        ChangeProposal.State state = this.state;
        if (state != null) {
            arrayList.add("state=" + state);
        }
        ChangeProposal.State state2 = this.previous_state;
        if (state2 != null) {
            arrayList.add("previous_state=" + state2);
        }
        String str2 = this.note;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "note=", arrayList);
        }
        String str3 = this.created_at;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "created_at=", arrayList);
        }
        String str4 = this.updated_at;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "updated_at=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ChangeProposalAdvancement{", "}", 0, null, null, 56);
    }
}
