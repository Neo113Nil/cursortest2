package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.GiftCard;
import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.protos.cash.ui.Icon;
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

/* loaded from: classes7.dex */
public final class DetailsPageUnorderedListItem extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DetailsPageUnorderedListItem> CREATOR;
    public final DetailsPageText body;
    public final Icon icon;
    public final IconAlignment icon_alignment;
    public final DetailsPageText label;

    public enum IconAlignment implements WireEnum {
        ICON_ALIGNMENT_UNSPECIFIED(0),
        ICON_ALIGNMENT_TOP(1),
        ICON_ALIGNMENT_LEFT(2);

        public static final DetailsPageUnorderedListItem$IconAlignment$Companion$ADAPTER$1 ADAPTER;
        public static final FeeType.Companion Companion;
        public final int value;

        static {
            IconAlignment iconAlignment = ICON_ALIGNMENT_UNSPECIFIED;
            Companion = new FeeType.Companion();
            ADAPTER = new DetailsPageUnorderedListItem$IconAlignment$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(IconAlignment.class), Syntax.PROTO_2, iconAlignment);
        }

        IconAlignment(int i) {
            this.value = i;
        }

        public static final IconAlignment fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return ICON_ALIGNMENT_UNSPECIFIED;
            }
            if (i == 1) {
                return ICON_ALIGNMENT_TOP;
            }
            if (i != 2) {
                return null;
            }
            return ICON_ALIGNMENT_LEFT;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        DetailsPageUnorderedListItem$Companion$ADAPTER$1 detailsPageUnorderedListItem$Companion$ADAPTER$1 = new DetailsPageUnorderedListItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DetailsPageUnorderedListItem.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.templates.detail.DetailsPageUnorderedListItem", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/templates/appmessages/DetailsPageComponent.proto");
        ADAPTER = detailsPageUnorderedListItem$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(detailsPageUnorderedListItem$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsPageUnorderedListItem(Icon icon, DetailsPageText detailsPageText, DetailsPageText detailsPageText2, IconAlignment iconAlignment, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.icon = icon;
        this.label = detailsPageText;
        this.body = detailsPageText2;
        this.icon_alignment = iconAlignment;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DetailsPageUnorderedListItem)) {
            return false;
        }
        DetailsPageUnorderedListItem detailsPageUnorderedListItem = (DetailsPageUnorderedListItem) obj;
        return Intrinsics.areEqual(unknownFields(), detailsPageUnorderedListItem.unknownFields()) && Intrinsics.areEqual(this.icon, detailsPageUnorderedListItem.icon) && Intrinsics.areEqual(this.label, detailsPageUnorderedListItem.label) && Intrinsics.areEqual(this.body, detailsPageUnorderedListItem.body) && this.icon_alignment == detailsPageUnorderedListItem.icon_alignment;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Icon icon = this.icon;
        int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
        DetailsPageText detailsPageText = this.label;
        int hashCode3 = (hashCode2 + (detailsPageText != null ? detailsPageText.hashCode() : 0)) * 37;
        DetailsPageText detailsPageText2 = this.body;
        int hashCode4 = (hashCode3 + (detailsPageText2 != null ? detailsPageText2.hashCode() : 0)) * 37;
        IconAlignment iconAlignment = this.icon_alignment;
        int hashCode5 = hashCode4 + (iconAlignment != null ? iconAlignment.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Builder builder = new GiftCard.Builder(24, false);
        builder.id = this.icon;
        builder.last_4 = this.label;
        builder.gift_card_id = this.body;
        builder.gift_card_amount = this.icon_alignment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Icon icon = this.icon;
        if (icon != null) {
            Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
        }
        DetailsPageText detailsPageText = this.label;
        if (detailsPageText != null) {
            arrayList.add("label=" + detailsPageText);
        }
        DetailsPageText detailsPageText2 = this.body;
        if (detailsPageText2 != null) {
            arrayList.add("body=" + detailsPageText2);
        }
        IconAlignment iconAlignment = this.icon_alignment;
        if (iconAlignment != null) {
            arrayList.add("icon_alignment=" + iconAlignment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DetailsPageUnorderedListItem{", "}", 0, null, null, 56);
    }
}
