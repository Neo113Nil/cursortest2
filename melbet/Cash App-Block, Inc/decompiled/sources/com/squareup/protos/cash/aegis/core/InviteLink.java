package com.squareup.protos.cash.aegis.core;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.BlockerAction;
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

/* loaded from: classes7.dex */
public final class InviteLink extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InviteLink> CREATOR;
    public final BlockerAction.ShareTextAction share_action;
    public final String text;
    public final String url;

    public final class Builder extends Message.Builder {
        public BlockerAction.ShareTextAction share_action;
        public String text;
        public String url;

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new InviteLink(this.text, this.share_action, this.url, buildUnknownFields());
        }
    }

    static {
        InviteLink$Companion$ADAPTER$1 inviteLink$Companion$ADAPTER$1 = new InviteLink$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InviteLink.class), "type.googleapis.com/squareup.cash.aegis.core.InviteLink", Syntax.PROTO_2, null, "squareup/cash/aegis/core/FamilyAccountsParameters.proto");
        ADAPTER = inviteLink$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(inviteLink$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteLink(String str, BlockerAction.ShareTextAction shareTextAction, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = str;
        this.share_action = shareTextAction;
        this.url = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InviteLink)) {
            return false;
        }
        InviteLink inviteLink = (InviteLink) obj;
        return Intrinsics.areEqual(unknownFields(), inviteLink.unknownFields()) && Intrinsics.areEqual(this.text, inviteLink.text) && Intrinsics.areEqual(this.share_action, inviteLink.share_action) && Intrinsics.areEqual(this.url, inviteLink.url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        BlockerAction.ShareTextAction shareTextAction = this.share_action;
        int hashCode3 = (hashCode2 + (shareTextAction != null ? shareTextAction.hashCode() : 0)) * 37;
        String str2 = this.url;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.text = this.text;
        builder.share_action = this.share_action;
        builder.url = this.url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
        }
        BlockerAction.ShareTextAction shareTextAction = this.share_action;
        if (shareTextAction != null) {
            arrayList.add("share_action=" + shareTextAction);
        }
        String str2 = this.url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InviteLink{", "}", 0, null, null, 56);
    }
}
