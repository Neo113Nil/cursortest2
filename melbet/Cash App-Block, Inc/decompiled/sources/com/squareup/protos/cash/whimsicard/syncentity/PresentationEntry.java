package com.squareup.protos.cash.whimsicard.syncentity;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.protos.cash.ui.ActionType;
import com.squareup.protos.document.Document;
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
public final class PresentationEntry extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PresentationEntry> CREATOR;
    public final Category category;
    public final String device_id;
    public final StatusDisplay status_display;
    public final String theme_token;
    public final Timeline timeline;

    /* renamed from: type, reason: collision with root package name */
    public final EntryType f1344type;

    public enum Category implements WireEnum {
        CATEGORY_UNSPECIFIED(0),
        INFORMATIONAL(1),
        AWAITING_EXTERNAL(2),
        ACTION_NEEDED(3);

        public static final PresentationEntry$Category$Companion$ADAPTER$1 ADAPTER;
        public static final ActionType.Companion Companion;
        public final int value;

        static {
            Category category = CATEGORY_UNSPECIFIED;
            Companion = new ActionType.Companion();
            ADAPTER = new PresentationEntry$Category$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Category.class), Syntax.PROTO_2, category);
        }

        Category(int i) {
            this.value = i;
        }

        public static final Category fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return CATEGORY_UNSPECIFIED;
            }
            if (i == 1) {
                return INFORMATIONAL;
            }
            if (i == 2) {
                return AWAITING_EXTERNAL;
            }
            if (i != 3) {
                return null;
            }
            return ACTION_NEEDED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum EntryType implements WireEnum {
        ENTRY_TYPE_UNSPECIFIED(0),
        ACCOUNT(1),
        DEVICE(2),
        ORDER(3);

        public static final PresentationEntry$EntryType$Companion$ADAPTER$1 ADAPTER;
        public static final PoolVisibility.Companion Companion;
        public final int value;

        static {
            EntryType entryType = ENTRY_TYPE_UNSPECIFIED;
            Companion = new PoolVisibility.Companion();
            ADAPTER = new PresentationEntry$EntryType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(EntryType.class), Syntax.PROTO_2, entryType);
        }

        EntryType(int i) {
            this.value = i;
        }

        public static final EntryType fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return ENTRY_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return ACCOUNT;
            }
            if (i == 2) {
                return DEVICE;
            }
            if (i != 3) {
                return null;
            }
            return ORDER;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        PresentationEntry$Companion$ADAPTER$1 presentationEntry$Companion$ADAPTER$1 = new PresentationEntry$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PresentationEntry.class), "type.googleapis.com/squareup.cash.whimsicard.syncentity.PresentationEntry", Syntax.PROTO_2, null, "squareup/cash/whimsicard/syncentity/payment_device_presentation.proto");
        ADAPTER = presentationEntry$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(presentationEntry$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresentationEntry(EntryType entryType, Category category, StatusDisplay statusDisplay, Timeline timeline, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1344type = entryType;
        this.category = category;
        this.status_display = statusDisplay;
        this.timeline = timeline;
        this.theme_token = str;
        this.device_id = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PresentationEntry)) {
            return false;
        }
        PresentationEntry presentationEntry = (PresentationEntry) obj;
        return Intrinsics.areEqual(unknownFields(), presentationEntry.unknownFields()) && this.f1344type == presentationEntry.f1344type && this.category == presentationEntry.category && Intrinsics.areEqual(this.status_display, presentationEntry.status_display) && Intrinsics.areEqual(this.timeline, presentationEntry.timeline) && Intrinsics.areEqual(this.theme_token, presentationEntry.theme_token) && Intrinsics.areEqual(this.device_id, presentationEntry.device_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        EntryType entryType = this.f1344type;
        int hashCode2 = (hashCode + (entryType != null ? entryType.hashCode() : 0)) * 37;
        Category category = this.category;
        int hashCode3 = (hashCode2 + (category != null ? category.hashCode() : 0)) * 37;
        StatusDisplay statusDisplay = this.status_display;
        int hashCode4 = (hashCode3 + (statusDisplay != null ? statusDisplay.hashCode() : 0)) * 37;
        Timeline timeline = this.timeline;
        int hashCode5 = (hashCode4 + (timeline != null ? timeline.hashCode() : 0)) * 37;
        String str = this.theme_token;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.device_id;
        int hashCode7 = hashCode6 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Document.Builder builder = new Document.Builder(8, false);
        builder.title = this.f1344type;
        builder.url = this.category;
        builder.owner_token = this.status_display;
        builder.document_date = this.timeline;
        builder.category = this.theme_token;
        builder.token = this.device_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        EntryType entryType = this.f1344type;
        if (entryType != null) {
            arrayList.add("type=" + entryType);
        }
        Category category = this.category;
        if (category != null) {
            arrayList.add("category=" + category);
        }
        StatusDisplay statusDisplay = this.status_display;
        if (statusDisplay != null) {
            arrayList.add("status_display=" + statusDisplay);
        }
        Timeline timeline = this.timeline;
        if (timeline != null) {
            arrayList.add("timeline=" + timeline);
        }
        String str = this.theme_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "theme_token=", arrayList);
        }
        String str2 = this.device_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "device_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PresentationEntry{", "}", 0, null, null, 56);
    }
}
