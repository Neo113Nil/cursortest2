package com.squareup.protos.cash.taply.syncvalues;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.document.DocumentEntity;
import com.squareup.protos.franklin.ui.UiStatusAndLimits;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CashAppTag extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashAppTag> CREATOR;
    public final Boolean show_tag_activation;
    public final Boolean show_tag_support;
    public final List tags;

    public final class Tag extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Tag> CREATOR;
        public final Image background_image;
        public final String device_id;
        public final Boolean is_expired;
        public final Boolean is_locked;
        public final Boolean is_sponsor_locked;
        public final TagLifecycleState lifecycle_state;
        public final PhysicalTagOrderState tag_order_state;
        public final String tag_theme_token;

        static {
            CashAppTag$Tag$Companion$ADAPTER$1 cashAppTag$Tag$Companion$ADAPTER$1 = new CashAppTag$Tag$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Tag.class), "type.googleapis.com/squareup.cash.taply.syncvalues.CashAppTag.Tag", Syntax.PROTO_2, null, "squareup/cash/taply/syncvalues/cash_app_tag.proto");
            ADAPTER = cashAppTag$Tag$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppTag$Tag$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Tag(String str, String str2, Boolean bool, Boolean bool2, TagLifecycleState tagLifecycleState, PhysicalTagOrderState physicalTagOrderState, Boolean bool3, Image image, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.device_id = str;
            this.tag_theme_token = str2;
            this.is_locked = bool;
            this.is_sponsor_locked = bool2;
            this.lifecycle_state = tagLifecycleState;
            this.tag_order_state = physicalTagOrderState;
            this.is_expired = bool3;
            this.background_image = image;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Tag)) {
                return false;
            }
            Tag tag = (Tag) obj;
            return Intrinsics.areEqual(unknownFields(), tag.unknownFields()) && Intrinsics.areEqual(this.device_id, tag.device_id) && Intrinsics.areEqual(this.tag_theme_token, tag.tag_theme_token) && Intrinsics.areEqual(this.is_locked, tag.is_locked) && Intrinsics.areEqual(this.is_sponsor_locked, tag.is_sponsor_locked) && this.lifecycle_state == tag.lifecycle_state && this.tag_order_state == tag.tag_order_state && Intrinsics.areEqual(this.is_expired, tag.is_expired) && Intrinsics.areEqual(this.background_image, tag.background_image);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.device_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.tag_theme_token;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Boolean bool = this.is_locked;
            int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Boolean bool2 = this.is_sponsor_locked;
            int hashCode5 = (hashCode4 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
            TagLifecycleState tagLifecycleState = this.lifecycle_state;
            int hashCode6 = (hashCode5 + (tagLifecycleState != null ? tagLifecycleState.hashCode() : 0)) * 37;
            PhysicalTagOrderState physicalTagOrderState = this.tag_order_state;
            int hashCode7 = (hashCode6 + (physicalTagOrderState != null ? physicalTagOrderState.hashCode() : 0)) * 37;
            Boolean bool3 = this.is_expired;
            int hashCode8 = (hashCode7 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
            Image image = this.background_image;
            int hashCode9 = hashCode8 + (image != null ? image.hashCode() : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            DocumentEntity.Builder builder = new DocumentEntity.Builder(20, false);
            builder.category = this.device_id;
            builder.token = this.tag_theme_token;
            builder.title = this.is_locked;
            builder.client_route = this.is_sponsor_locked;
            builder.url = this.lifecycle_state;
            builder.owner_token = this.tag_order_state;
            builder.version_data = this.is_expired;
            builder.localizable_title = this.background_image;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.device_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "device_id=", arrayList);
            }
            String str2 = this.tag_theme_token;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "tag_theme_token=", arrayList);
            }
            Boolean bool = this.is_locked;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_locked=", bool, arrayList);
            }
            Boolean bool2 = this.is_sponsor_locked;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_sponsor_locked=", bool2, arrayList);
            }
            TagLifecycleState tagLifecycleState = this.lifecycle_state;
            if (tagLifecycleState != null) {
                arrayList.add("lifecycle_state=" + tagLifecycleState);
            }
            PhysicalTagOrderState physicalTagOrderState = this.tag_order_state;
            if (physicalTagOrderState != null) {
                arrayList.add("tag_order_state=" + physicalTagOrderState);
            }
            Boolean bool3 = this.is_expired;
            if (bool3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_expired=", bool3, arrayList);
            }
            Image image = this.background_image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("background_image=", image, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Tag{", "}", 0, null, null, 56);
        }
    }

    public enum TagLifecycleState implements WireEnum {
        TAG_LIFECYCLE_UNSPECIFIED(0),
        ACTIVE(1),
        INACTIVE(2),
        PENDING_FIRST_ACTIVATION(3);

        public static final CashAppTag$TagLifecycleState$Companion$ADAPTER$1 ADAPTER;
        public static final TextSize.Companion Companion;
        public final int value;

        static {
            TagLifecycleState tagLifecycleState = TAG_LIFECYCLE_UNSPECIFIED;
            Companion = new TextSize.Companion();
            ADAPTER = new CashAppTag$TagLifecycleState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TagLifecycleState.class), Syntax.PROTO_2, tagLifecycleState);
        }

        TagLifecycleState(int i) {
            this.value = i;
        }

        public static final TagLifecycleState fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return TAG_LIFECYCLE_UNSPECIFIED;
            }
            if (i == 1) {
                return ACTIVE;
            }
            if (i == 2) {
                return INACTIVE;
            }
            if (i != 3) {
                return null;
            }
            return PENDING_FIRST_ACTIVATION;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CashAppTag$Companion$ADAPTER$1 cashAppTag$Companion$ADAPTER$1 = new CashAppTag$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashAppTag.class), "type.googleapis.com/squareup.cash.taply.syncvalues.CashAppTag", Syntax.PROTO_2, null, "squareup/cash/taply/syncvalues/cash_app_tag.proto");
        ADAPTER = cashAppTag$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppTag$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppTag(Boolean bool, Boolean bool2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.show_tag_activation = bool;
        this.show_tag_support = bool2;
        this.tags = TransactorKt.immutableCopyOf("tags", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashAppTag)) {
            return false;
        }
        CashAppTag cashAppTag = (CashAppTag) obj;
        return Intrinsics.areEqual(unknownFields(), cashAppTag.unknownFields()) && Intrinsics.areEqual(this.tags, cashAppTag.tags) && Intrinsics.areEqual(this.show_tag_activation, cashAppTag.show_tag_activation) && Intrinsics.areEqual(this.show_tag_support, cashAppTag.show_tag_support);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.tags);
        Boolean bool = this.show_tag_activation;
        int hashCode = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.show_tag_support;
        int hashCode2 = hashCode + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiStatusAndLimits.Builder builder = new UiStatusAndLimits.Builder(1);
        builder.balance_limit_groups = this.tags;
        builder.has_passed_idv = this.show_tag_activation;
        builder.adding_cash_enabled = this.show_tag_support;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.tags;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("tags=", arrayList, list);
        }
        Boolean bool = this.show_tag_activation;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_tag_activation=", bool, arrayList);
        }
        Boolean bool2 = this.show_tag_support;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_tag_support=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashAppTag{", "}", 0, null, null, 56);
    }
}
