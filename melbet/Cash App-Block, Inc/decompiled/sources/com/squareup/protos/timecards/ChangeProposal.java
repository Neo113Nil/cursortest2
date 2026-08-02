package com.squareup.protos.timecards;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientrouting.UtilsKt;
import com.squareup.protos.franklin.api.Transfer;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import io.noties.markwon.LinkResolverDef;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ChangeProposal extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ChangeProposal> CREATOR;
    public final List advancements;
    public final String created_at;
    public final UtilsKt entity;
    public final String id;
    public final String note;
    public final String proposing_team_member_id;
    public final State state;
    public final String target_team_member_id;
    public final String updated_at;

    /* loaded from: classes9.dex */
    public enum State implements WireEnum {
        DO_NOT_USE(0),
        PENDING_ACCEPTANCE(1),
        PENDING_AUTHORIZATION(2),
        AUTHORIZED(3),
        DECLINED(4),
        FORBIDDEN(5),
        CANCELED(6),
        OBSOLETE(7),
        EXPIRED(8);

        public static final ChangeProposal$State$Companion$ADAPTER$1 ADAPTER;
        public static final LinkResolverDef Companion;
        public final int value;

        static {
            State state = DO_NOT_USE;
            Companion = new LinkResolverDef(4);
            ADAPTER = new ChangeProposal$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(State.class), Syntax.PROTO_2, state);
        }

        State(int i) {
            this.value = i;
        }

        public static final State fromValue(int i) {
            Companion.getClass();
            return LinkResolverDef.m4118fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ChangeProposal$Companion$ADAPTER$1 changeProposal$Companion$ADAPTER$1 = new ChangeProposal$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ChangeProposal.class), "type.googleapis.com/squareup.timecards.ChangeProposal", Syntax.PROTO_2, null, "squareup/timecards/change_proposal.proto");
        ADAPTER = changeProposal$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(changeProposal$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeProposal(String str, String str2, String str3, State state, String str4, List list, UtilsKt utilsKt, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.id = str;
        this.proposing_team_member_id = str2;
        this.target_team_member_id = str3;
        this.state = state;
        this.note = str4;
        this.entity = utilsKt;
        this.created_at = str5;
        this.updated_at = str6;
        this.advancements = TransactorKt.immutableCopyOf("advancements", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChangeProposal)) {
            return false;
        }
        ChangeProposal changeProposal = (ChangeProposal) obj;
        return Intrinsics.areEqual(unknownFields(), changeProposal.unknownFields()) && Intrinsics.areEqual(this.id, changeProposal.id) && Intrinsics.areEqual(this.proposing_team_member_id, changeProposal.proposing_team_member_id) && Intrinsics.areEqual(this.target_team_member_id, changeProposal.target_team_member_id) && this.state == changeProposal.state && Intrinsics.areEqual(this.note, changeProposal.note) && Intrinsics.areEqual(this.advancements, changeProposal.advancements) && Intrinsics.areEqual(this.entity, changeProposal.entity) && Intrinsics.areEqual(this.created_at, changeProposal.created_at) && Intrinsics.areEqual(this.updated_at, changeProposal.updated_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.proposing_team_member_id;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.target_team_member_id;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        State state = this.state;
        int hashCode5 = (hashCode4 + (state != null ? state.hashCode() : 0)) * 37;
        String str4 = this.note;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37, 37, this.advancements);
        UtilsKt utilsKt = this.entity;
        int hashCode6 = (m + (utilsKt != null ? utilsKt.hashCode() : 0)) * 37;
        String str5 = this.created_at;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.updated_at;
        int hashCode8 = hashCode7 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Transfer.Builder builder = new Transfer.Builder(15, false);
        builder.token = this.id;
        builder.source = this.proposing_team_member_id;
        builder.target = this.target_team_member_id;
        builder.state = this.state;
        builder.amount = this.note;
        builder.push_amount = this.advancements;
        builder.created_at = this.entity;
        builder.completed_at = this.created_at;
        builder.failed_at = this.updated_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        String str2 = this.proposing_team_member_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "proposing_team_member_id=", arrayList);
        }
        String str3 = this.target_team_member_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "target_team_member_id=", arrayList);
        }
        State state = this.state;
        if (state != null) {
            arrayList.add("state=" + state);
        }
        String str4 = this.note;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "note=", arrayList);
        }
        List list = this.advancements;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("advancements=", arrayList, list);
        }
        UtilsKt utilsKt = this.entity;
        if (utilsKt != null) {
            arrayList.add("entity=" + utilsKt);
        }
        String str5 = this.created_at;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "created_at=", arrayList);
        }
        String str6 = this.updated_at;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "updated_at=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ChangeProposal{", "}", 0, null, null, 56);
    }
}
