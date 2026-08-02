package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.lending.Loan;
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
import okio.AsyncTimeout;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SyncInvestmentCategory extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncInvestmentCategory> CREATOR;
    public final String accent_color;
    public final Color category_color;
    public final String description;
    public final String filter_description;
    public final String image_url;
    public final List investment_entity_tokens;
    public final String name;
    public final String parent_category_token;
    public final PrefixIcon prefix_icon;
    public final Boolean show_ipo_preview;
    public final String token;

    /* renamed from: type, reason: collision with root package name */
    public final CategoryType f1390type;
    public final List ui_filter_group_tokens;
    public final Integer ui_ordering;

    /* loaded from: classes.dex */
    public enum CategoryType implements WireEnum {
        DO_NOT_USE_CATEGORY_TYPE(0),
        CATEGORY(1),
        SUBCATEGORY(2),
        TOP_LEVEL_UI(3),
        PERFORMANCE(4),
        ADVANCED(5);

        public static final SyncInvestmentCategory$CategoryType$Companion$ADAPTER$1 ADAPTER;
        public static final UiAlias.Type.Companion Companion;
        public final int value;

        static {
            CategoryType categoryType = DO_NOT_USE_CATEGORY_TYPE;
            Companion = new UiAlias.Type.Companion();
            ADAPTER = new SyncInvestmentCategory$CategoryType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CategoryType.class), Syntax.PROTO_2, categoryType);
        }

        CategoryType(int i) {
            this.value = i;
        }

        public static final CategoryType fromValue(int i) {
            Companion.getClass();
            return UiAlias.Type.Companion.m3946fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes.dex */
    public enum PrefixIcon implements WireEnum {
        DO_NOT_USE_PREFIX_ICON(0),
        UP_ARROW(1),
        DOWN_ARROW(2);

        public static final SyncInvestmentCategory$PrefixIcon$Companion$ADAPTER$1 ADAPTER;
        public static final AsyncTimeout.Companion Companion;
        public final int value;

        static {
            PrefixIcon prefixIcon = DO_NOT_USE_PREFIX_ICON;
            Companion = new AsyncTimeout.Companion();
            ADAPTER = new SyncInvestmentCategory$PrefixIcon$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PrefixIcon.class), Syntax.PROTO_2, prefixIcon);
        }

        PrefixIcon(int i) {
            this.value = i;
        }

        public static final PrefixIcon fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return DO_NOT_USE_PREFIX_ICON;
            }
            if (i == 1) {
                return UP_ARROW;
            }
            if (i != 2) {
                return null;
            }
            return DOWN_ARROW;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        SyncInvestmentCategory$Companion$ADAPTER$1 syncInvestmentCategory$Companion$ADAPTER$1 = new SyncInvestmentCategory$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncInvestmentCategory.class), "type.googleapis.com/squareup.franklin.SyncInvestmentCategory", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncInvestmentCategory$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncInvestmentCategory$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncInvestmentCategory(String str, String str2, PrefixIcon prefixIcon, String str3, String str4, String str5, List list, List list2, CategoryType categoryType, String str6, String str7, Color color, Integer num, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.token = str;
        this.name = str2;
        this.prefix_icon = prefixIcon;
        this.image_url = str3;
        this.accent_color = str4;
        this.parent_category_token = str5;
        this.f1390type = categoryType;
        this.description = str6;
        this.filter_description = str7;
        this.category_color = color;
        this.ui_ordering = num;
        this.show_ipo_preview = bool;
        this.investment_entity_tokens = TransactorKt.immutableCopyOf("investment_entity_tokens", list);
        this.ui_filter_group_tokens = TransactorKt.immutableCopyOf("ui_filter_group_tokens", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncInvestmentCategory)) {
            return false;
        }
        SyncInvestmentCategory syncInvestmentCategory = (SyncInvestmentCategory) obj;
        return Intrinsics.areEqual(unknownFields(), syncInvestmentCategory.unknownFields()) && Intrinsics.areEqual(this.token, syncInvestmentCategory.token) && Intrinsics.areEqual(this.name, syncInvestmentCategory.name) && this.prefix_icon == syncInvestmentCategory.prefix_icon && Intrinsics.areEqual(this.image_url, syncInvestmentCategory.image_url) && Intrinsics.areEqual(this.accent_color, syncInvestmentCategory.accent_color) && Intrinsics.areEqual(this.parent_category_token, syncInvestmentCategory.parent_category_token) && Intrinsics.areEqual(this.investment_entity_tokens, syncInvestmentCategory.investment_entity_tokens) && Intrinsics.areEqual(this.ui_filter_group_tokens, syncInvestmentCategory.ui_filter_group_tokens) && this.f1390type == syncInvestmentCategory.f1390type && Intrinsics.areEqual(this.description, syncInvestmentCategory.description) && Intrinsics.areEqual(this.filter_description, syncInvestmentCategory.filter_description) && Intrinsics.areEqual(this.category_color, syncInvestmentCategory.category_color) && Intrinsics.areEqual(this.ui_ordering, syncInvestmentCategory.ui_ordering) && Intrinsics.areEqual(this.show_ipo_preview, syncInvestmentCategory.show_ipo_preview);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        PrefixIcon prefixIcon = this.prefix_icon;
        int hashCode4 = (hashCode3 + (prefixIcon != null ? prefixIcon.hashCode() : 0)) * 37;
        String str3 = this.image_url;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.accent_color;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.parent_category_token;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37, 37, this.investment_entity_tokens), 37, this.ui_filter_group_tokens);
        CategoryType categoryType = this.f1390type;
        int hashCode7 = (m + (categoryType != null ? categoryType.hashCode() : 0)) * 37;
        String str6 = this.description;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.filter_description;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 37;
        Color color = this.category_color;
        int hashCode10 = (hashCode9 + (color != null ? color.hashCode() : 0)) * 37;
        Integer num = this.ui_ordering;
        int hashCode11 = (hashCode10 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Boolean bool = this.show_ipo_preview;
        int hashCode12 = hashCode11 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode12;
        return hashCode12;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Loan.Builder builder = new Loan.Builder(12);
        builder.token = this.token;
        builder.credit_line_token = this.name;
        builder.borrowed_at = this.prefix_icon;
        builder.due_at = this.image_url;
        builder.principal_amount = this.accent_color;
        builder.setup_fee_amount = this.parent_category_token;
        builder.detail_rows = this.investment_entity_tokens;
        builder.outstanding_amount = this.ui_filter_group_tokens;
        builder.late_fee_amount = this.f1390type;
        builder.interest_amount = this.description;
        builder.state = this.filter_description;
        builder.lending_product = this.category_color;
        builder.setup_fee_bps = this.ui_ordering;
        builder.bnpl_data = this.show_ipo_preview;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "name=", arrayList);
        }
        PrefixIcon prefixIcon = this.prefix_icon;
        if (prefixIcon != null) {
            arrayList.add("prefix_icon=" + prefixIcon);
        }
        String str3 = this.image_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "image_url=", arrayList);
        }
        String str4 = this.accent_color;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "accent_color=", arrayList);
        }
        String str5 = this.parent_category_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "parent_category_token=", arrayList);
        }
        List list = this.investment_entity_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("investment_entity_tokens=", arrayList, list);
        }
        List list2 = this.ui_filter_group_tokens;
        if (!list2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("ui_filter_group_tokens=", arrayList, list2);
        }
        CategoryType categoryType = this.f1390type;
        if (categoryType != null) {
            arrayList.add("type=" + categoryType);
        }
        String str6 = this.description;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "description=", arrayList);
        }
        String str7 = this.filter_description;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "filter_description=", arrayList);
        }
        Color color = this.category_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("category_color=", color, arrayList);
        }
        Integer num = this.ui_ordering;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("ui_ordering=", num, arrayList);
        }
        Boolean bool = this.show_ipo_preview;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_ipo_preview=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncInvestmentCategory{", "}", 0, null, null, 56);
    }
}
