package com.squareup.protos.timecards.scheduling;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ProfileRow;
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
public final class TeamMember extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TeamMember> CREATOR;
    public final String family_name;
    public final String given_name;
    public final String id;
    public final String initials;
    public final String person_id;

    static {
        TeamMember$Companion$ADAPTER$1 teamMember$Companion$ADAPTER$1 = new TeamMember$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TeamMember.class), "type.googleapis.com/squareup.timecards.scheduling.TeamMember", Syntax.PROTO_2, null, "squareup/timecards/scheduling/models.proto");
        ADAPTER = teamMember$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(teamMember$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamMember(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.id = str;
        this.given_name = str2;
        this.family_name = str3;
        this.initials = str4;
        this.person_id = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TeamMember)) {
            return false;
        }
        TeamMember teamMember = (TeamMember) obj;
        return Intrinsics.areEqual(unknownFields(), teamMember.unknownFields()) && Intrinsics.areEqual(this.id, teamMember.id) && Intrinsics.areEqual(this.given_name, teamMember.given_name) && Intrinsics.areEqual(this.family_name, teamMember.family_name) && Intrinsics.areEqual(this.initials, teamMember.initials) && Intrinsics.areEqual(this.person_id, teamMember.person_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.given_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.family_name;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.initials;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.person_id;
        int hashCode6 = hashCode5 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileRow.Builder builder = new ProfileRow.Builder(13);
        builder.client_route = this.id;
        builder.icon_id = this.given_name;
        builder.title = this.family_name;
        builder.subtitle = this.initials;
        builder.call_to_action = this.person_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        if (this.given_name != null) {
            arrayList.add("given_name=██");
        }
        if (this.family_name != null) {
            arrayList.add("family_name=██");
        }
        if (this.initials != null) {
            arrayList.add("initials=██");
        }
        String str2 = this.person_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "person_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TeamMember{", "}", 0, null, null, 56);
    }
}
