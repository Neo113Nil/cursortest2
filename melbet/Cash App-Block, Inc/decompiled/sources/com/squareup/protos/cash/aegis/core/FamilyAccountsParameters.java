package com.squareup.protos.cash.aegis.core;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class FamilyAccountsParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FamilyAccountsParameters> CREATOR;
    public final InviteLink invite_teen_action;
    public final List pending_invitations;
    public final PendingRequestSection pending_request_section;
    public final List sections;
    public final List sorted_dependents;
    public final String title;
    public final FormBlocker.Element upsell_element;

    public final class Builder extends Message.Builder {
        public InviteLink invite_teen_action;
        public List pending_invitations;
        public PendingRequestSection pending_request_section;
        public List sections;
        public List sorted_dependents;
        public String title;
        public FormBlocker.Element upsell_element;

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new FamilyAccountsParameters(this.invite_teen_action, this.title, this.sorted_dependents, this.pending_request_section, this.sections, this.pending_invitations, this.upsell_element, buildUnknownFields());
        }
    }

    static {
        FamilyAccountsParameters$Companion$ADAPTER$1 familyAccountsParameters$Companion$ADAPTER$1 = new FamilyAccountsParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FamilyAccountsParameters.class), "type.googleapis.com/squareup.cash.aegis.core.FamilyAccountsParameters", Syntax.PROTO_2, null, "squareup/cash/aegis/core/FamilyAccountsParameters.proto");
        ADAPTER = familyAccountsParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(familyAccountsParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyAccountsParameters(InviteLink inviteLink, String str, List list, PendingRequestSection pendingRequestSection, List list2, List list3, FormBlocker.Element element, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.invite_teen_action = inviteLink;
        this.title = str;
        this.pending_request_section = pendingRequestSection;
        this.upsell_element = element;
        this.sorted_dependents = TransactorKt.immutableCopyOf("sorted_dependents", list);
        this.sections = TransactorKt.immutableCopyOf("sections", list2);
        this.pending_invitations = TransactorKt.immutableCopyOf("pending_invitations", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FamilyAccountsParameters)) {
            return false;
        }
        FamilyAccountsParameters familyAccountsParameters = (FamilyAccountsParameters) obj;
        return Intrinsics.areEqual(unknownFields(), familyAccountsParameters.unknownFields()) && Intrinsics.areEqual(this.invite_teen_action, familyAccountsParameters.invite_teen_action) && Intrinsics.areEqual(this.title, familyAccountsParameters.title) && Intrinsics.areEqual(this.sorted_dependents, familyAccountsParameters.sorted_dependents) && Intrinsics.areEqual(this.pending_request_section, familyAccountsParameters.pending_request_section) && Intrinsics.areEqual(this.sections, familyAccountsParameters.sections) && Intrinsics.areEqual(this.pending_invitations, familyAccountsParameters.pending_invitations) && Intrinsics.areEqual(this.upsell_element, familyAccountsParameters.upsell_element);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        InviteLink inviteLink = this.invite_teen_action;
        int hashCode2 = (hashCode + (inviteLink != null ? inviteLink.hashCode() : 0)) * 37;
        String str = this.title;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str != null ? str.hashCode() : 0)) * 37, 37, this.sorted_dependents);
        PendingRequestSection pendingRequestSection = this.pending_request_section;
        int m2 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((m + (pendingRequestSection != null ? pendingRequestSection.hashCode() : 0)) * 37, 37, this.sections), 37, this.pending_invitations);
        FormBlocker.Element element = this.upsell_element;
        int hashCode3 = m2 + (element != null ? element.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.invite_teen_action = this.invite_teen_action;
        builder.title = this.title;
        builder.sorted_dependents = this.sorted_dependents;
        builder.pending_request_section = this.pending_request_section;
        builder.sections = this.sections;
        builder.pending_invitations = this.pending_invitations;
        builder.upsell_element = this.upsell_element;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        InviteLink inviteLink = this.invite_teen_action;
        if (inviteLink != null) {
            arrayList.add("invite_teen_action=" + inviteLink);
        }
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        List list = this.sorted_dependents;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sorted_dependents=", arrayList, list);
        }
        PendingRequestSection pendingRequestSection = this.pending_request_section;
        if (pendingRequestSection != null) {
            arrayList.add("pending_request_section=" + pendingRequestSection);
        }
        List list2 = this.sections;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sections=", arrayList, list2);
        }
        List list3 = this.pending_invitations;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("pending_invitations=", arrayList, list3);
        }
        FormBlocker.Element element = this.upsell_element;
        if (element != null) {
            arrayList.add("upsell_element=" + element);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FamilyAccountsParameters{", "}", 0, null, null, 56);
    }
}
