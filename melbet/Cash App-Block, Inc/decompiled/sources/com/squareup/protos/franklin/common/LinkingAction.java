package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.common.ProfileAlias;
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
public final class LinkingAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LinkingAction> CREATOR;
    public final String half_sheet_description;
    public final String half_sheet_title;
    public final LinkType link_type;
    public final LocalizableString localizable_half_sheet_description;
    public final LocalizableString localizable_half_sheet_title;

    static {
        LinkingAction$Companion$ADAPTER$1 linkingAction$Companion$ADAPTER$1 = new LinkingAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LinkingAction.class), "type.googleapis.com/squareup.franklin.common.LinkingAction", Syntax.PROTO_2, null, "squareup/franklin/common/instrument_link.proto");
        ADAPTER = linkingAction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(linkingAction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkingAction(LinkType linkType, String str, LocalizableString localizableString, String str2, LocalizableString localizableString2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.link_type = linkType;
        this.half_sheet_title = str;
        this.localizable_half_sheet_title = localizableString;
        this.half_sheet_description = str2;
        this.localizable_half_sheet_description = localizableString2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LinkingAction)) {
            return false;
        }
        LinkingAction linkingAction = (LinkingAction) obj;
        return Intrinsics.areEqual(unknownFields(), linkingAction.unknownFields()) && this.link_type == linkingAction.link_type && Intrinsics.areEqual(this.half_sheet_title, linkingAction.half_sheet_title) && Intrinsics.areEqual(this.localizable_half_sheet_title, linkingAction.localizable_half_sheet_title) && Intrinsics.areEqual(this.half_sheet_description, linkingAction.half_sheet_description) && Intrinsics.areEqual(this.localizable_half_sheet_description, linkingAction.localizable_half_sheet_description);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LinkType linkType = this.link_type;
        int hashCode2 = (hashCode + (linkType != null ? linkType.hashCode() : 0)) * 37;
        String str = this.half_sheet_title;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_half_sheet_title;
        int hashCode4 = (hashCode3 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        String str2 = this.half_sheet_description;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalizableString localizableString2 = this.localizable_half_sheet_description;
        int hashCode6 = hashCode5 + (localizableString2 != null ? localizableString2.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileAlias.Builder builder = new ProfileAlias.Builder(10, false);
        builder.alias = this.link_type;
        builder.verified = this.half_sheet_title;
        builder.expires_at = this.localizable_half_sheet_title;
        builder.version = this.half_sheet_description;
        builder.display_date = this.localizable_half_sheet_description;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LinkType linkType = this.link_type;
        if (linkType != null) {
            arrayList.add("link_type=" + linkType);
        }
        String str = this.half_sheet_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "half_sheet_title=", arrayList);
        }
        LocalizableString localizableString = this.localizable_half_sheet_title;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_half_sheet_title=", localizableString, arrayList);
        }
        String str2 = this.half_sheet_description;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "half_sheet_description=", arrayList);
        }
        LocalizableString localizableString2 = this.localizable_half_sheet_description;
        if (localizableString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_half_sheet_description=", localizableString2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LinkingAction{", "}", 0, null, null, 56);
    }
}
