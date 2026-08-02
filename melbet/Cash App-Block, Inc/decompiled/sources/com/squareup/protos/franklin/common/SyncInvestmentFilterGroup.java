package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.giftly.app.GiftCardCategory;
import com.squareup.protos.franklin.bankbook.Institution;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.franklin.ui.UiPublicProfile;
import com.squareup.protos.hieroglyph.KeyScope;
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
import okio.Path;
import squareup.cash.savings.GoalFolder;

/* loaded from: classes8.dex */
public final class SyncInvestmentFilterGroup extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncInvestmentFilterGroup> CREATOR;
    public final Boolean can_select_multiple_categories;
    public final List category_map;
    public final List category_tokens;
    public final JoinType joinType;
    public final String name;
    public final String name_plural;
    public final List subfilters;
    public final String token;

    /* loaded from: classes.dex */
    public enum JoinType implements WireEnum {
        DO_NOT_USE_JOIN_TYPE(0),
        INTERSECTION(1),
        UNION(2);

        public static final SyncInvestmentFilterGroup$JoinType$Companion$ADAPTER$1 ADAPTER;
        public static final Path.Companion Companion;
        public final int value;

        static {
            JoinType joinType = DO_NOT_USE_JOIN_TYPE;
            Companion = new Path.Companion();
            ADAPTER = new SyncInvestmentFilterGroup$JoinType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(JoinType.class), Syntax.PROTO_2, joinType);
        }

        JoinType(int i) {
            this.value = i;
        }

        public static final JoinType fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return DO_NOT_USE_JOIN_TYPE;
            }
            if (i == 1) {
                return INTERSECTION;
            }
            if (i != 2) {
                return null;
            }
            return UNION;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes.dex */
    public final class Subfilter extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Subfilter> CREATOR;
        public final String name;
        public final List options;
        public final Long placeholder_index;
        public final String placeholder_text;
        public final String token;

        /* renamed from: type, reason: collision with root package name */
        public final SubfilterType f1392type;

        /* loaded from: classes8.dex */
        public enum SubfilterType implements WireEnum {
            DO_NOT_USE_SUBFILTER_TYPE(0),
            INCREMENTAL(1),
            SELECTION(2);

            public static final SyncInvestmentFilterGroup$Subfilter$SubfilterType$Companion$ADAPTER$1 ADAPTER;
            public static final Trigger.Companion Companion;
            public final int value;

            static {
                SubfilterType subfilterType = DO_NOT_USE_SUBFILTER_TYPE;
                Companion = new Trigger.Companion();
                ADAPTER = new SyncInvestmentFilterGroup$Subfilter$SubfilterType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SubfilterType.class), Syntax.PROTO_2, subfilterType);
            }

            SubfilterType(int i) {
                this.value = i;
            }

            public static final SubfilterType fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return DO_NOT_USE_SUBFILTER_TYPE;
                }
                if (i == 1) {
                    return INCREMENTAL;
                }
                if (i != 2) {
                    return null;
                }
                return SELECTION;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            SyncInvestmentFilterGroup$Subfilter$Companion$ADAPTER$1 syncInvestmentFilterGroup$Subfilter$Companion$ADAPTER$1 = new SyncInvestmentFilterGroup$Subfilter$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Subfilter.class), "type.googleapis.com/squareup.franklin.SyncInvestmentFilterGroup.Subfilter", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
            ADAPTER = syncInvestmentFilterGroup$Subfilter$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(syncInvestmentFilterGroup$Subfilter$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Subfilter(String str, SubfilterType subfilterType, String str2, Long l, String str3, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.token = str;
            this.f1392type = subfilterType;
            this.name = str2;
            this.placeholder_index = l;
            this.placeholder_text = str3;
            this.options = TransactorKt.immutableCopyOf("options", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Subfilter)) {
                return false;
            }
            Subfilter subfilter = (Subfilter) obj;
            return Intrinsics.areEqual(unknownFields(), subfilter.unknownFields()) && Intrinsics.areEqual(this.token, subfilter.token) && this.f1392type == subfilter.f1392type && Intrinsics.areEqual(this.name, subfilter.name) && Intrinsics.areEqual(this.placeholder_index, subfilter.placeholder_index) && Intrinsics.areEqual(this.placeholder_text, subfilter.placeholder_text) && Intrinsics.areEqual(this.options, subfilter.options);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            SubfilterType subfilterType = this.f1392type;
            int hashCode3 = (hashCode2 + (subfilterType != null ? subfilterType.hashCode() : 0)) * 37;
            String str2 = this.name;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Long l = this.placeholder_index;
            int hashCode5 = (hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            String str3 = this.placeholder_text;
            int hashCode6 = this.options.hashCode() + ((hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiPublicProfile.Builder builder = new UiPublicProfile.Builder(8);
            builder.full_name = this.token;
            builder.full_cashtag = this.f1392type;
            builder.photo_url = this.name;
            builder.cashtag_url_enabled = this.placeholder_index;
            builder.synopsis = this.placeholder_text;
            builder.is_verified_account = this.options;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
            }
            SubfilterType subfilterType = this.f1392type;
            if (subfilterType != null) {
                arrayList.add("type=" + subfilterType);
            }
            String str2 = this.name;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "name=", arrayList);
            }
            Long l = this.placeholder_index;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("placeholder_index=", l, arrayList);
            }
            String str3 = this.placeholder_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "placeholder_text=", arrayList);
            }
            List list = this.options;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("options=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Subfilter{", "}", 0, null, null, 56);
        }
    }

    public final class SubfilterOption extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SubfilterOption> CREATOR;
        public final OptionGlyph glyph;
        public final String name;
        public final String token;

        public enum OptionGlyph implements WireEnum {
            DO_NOT_USE_OPTION_GLYPH(0),
            UP_ARROW(1),
            DOWN_ARROW(2);

            public static final SyncInvestmentFilterGroup$SubfilterOption$OptionGlyph$Companion$ADAPTER$1 ADAPTER;
            public static final KeyScope.Companion Companion;
            public final int value;

            static {
                OptionGlyph optionGlyph = DO_NOT_USE_OPTION_GLYPH;
                Companion = new KeyScope.Companion();
                ADAPTER = new SyncInvestmentFilterGroup$SubfilterOption$OptionGlyph$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OptionGlyph.class), Syntax.PROTO_2, optionGlyph);
            }

            OptionGlyph(int i) {
                this.value = i;
            }

            public static final OptionGlyph fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return DO_NOT_USE_OPTION_GLYPH;
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
            SyncInvestmentFilterGroup$SubfilterOption$Companion$ADAPTER$1 syncInvestmentFilterGroup$SubfilterOption$Companion$ADAPTER$1 = new SyncInvestmentFilterGroup$SubfilterOption$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SubfilterOption.class), "type.googleapis.com/squareup.franklin.SyncInvestmentFilterGroup.SubfilterOption", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
            ADAPTER = syncInvestmentFilterGroup$SubfilterOption$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(syncInvestmentFilterGroup$SubfilterOption$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubfilterOption(String str, String str2, OptionGlyph optionGlyph, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.token = str;
            this.name = str2;
            this.glyph = optionGlyph;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SubfilterOption)) {
                return false;
            }
            SubfilterOption subfilterOption = (SubfilterOption) obj;
            return Intrinsics.areEqual(unknownFields(), subfilterOption.unknownFields()) && Intrinsics.areEqual(this.token, subfilterOption.token) && Intrinsics.areEqual(this.name, subfilterOption.name) && this.glyph == subfilterOption.glyph;
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
            OptionGlyph optionGlyph = this.glyph;
            int hashCode4 = hashCode3 + (optionGlyph != null ? optionGlyph.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Institution.Builder builder = new Institution.Builder(29, false);
            builder.institution_token = this.token;
            builder.display_info = this.name;
            builder.help_menu_items = this.glyph;
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
            OptionGlyph optionGlyph = this.glyph;
            if (optionGlyph != null) {
                arrayList.add("glyph=" + optionGlyph);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SubfilterOption{", "}", 0, null, null, 56);
        }
    }

    static {
        SyncInvestmentFilterGroup$Companion$ADAPTER$1 syncInvestmentFilterGroup$Companion$ADAPTER$1 = new SyncInvestmentFilterGroup$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncInvestmentFilterGroup.class), "type.googleapis.com/squareup.franklin.SyncInvestmentFilterGroup", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
        ADAPTER = syncInvestmentFilterGroup$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncInvestmentFilterGroup$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncInvestmentFilterGroup(String str, String str2, List list, List list2, List list3, Boolean bool, String str3, JoinType joinType, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.token = str;
        this.name = str2;
        this.can_select_multiple_categories = bool;
        this.name_plural = str3;
        this.joinType = joinType;
        this.category_tokens = TransactorKt.immutableCopyOf("category_tokens", list);
        this.subfilters = TransactorKt.immutableCopyOf("subfilters", list2);
        this.category_map = TransactorKt.immutableCopyOf("category_map", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncInvestmentFilterGroup)) {
            return false;
        }
        SyncInvestmentFilterGroup syncInvestmentFilterGroup = (SyncInvestmentFilterGroup) obj;
        return Intrinsics.areEqual(unknownFields(), syncInvestmentFilterGroup.unknownFields()) && Intrinsics.areEqual(this.token, syncInvestmentFilterGroup.token) && Intrinsics.areEqual(this.name, syncInvestmentFilterGroup.name) && Intrinsics.areEqual(this.category_tokens, syncInvestmentFilterGroup.category_tokens) && Intrinsics.areEqual(this.subfilters, syncInvestmentFilterGroup.subfilters) && Intrinsics.areEqual(this.category_map, syncInvestmentFilterGroup.category_map) && Intrinsics.areEqual(this.can_select_multiple_categories, syncInvestmentFilterGroup.can_select_multiple_categories) && Intrinsics.areEqual(this.name_plural, syncInvestmentFilterGroup.name_plural) && this.joinType == syncInvestmentFilterGroup.joinType;
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
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.category_tokens), 37, this.subfilters), 37, this.category_map);
        Boolean bool = this.can_select_multiple_categories;
        int hashCode3 = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str3 = this.name_plural;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        JoinType joinType = this.joinType;
        int hashCode5 = hashCode4 + (joinType != null ? joinType.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GoalFolder.Builder builder = new GoalFolder.Builder(1);
        builder.token = this.token;
        builder.icon_unicode = this.name;
        builder.label = this.category_tokens;
        builder.goal_flow_parameters = this.subfilters;
        builder.goal_amount = this.category_map;
        builder.met_goal = this.can_select_multiple_categories;
        builder.completion_token = this.name_plural;
        builder.goal_progress_percentage = this.joinType;
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
        List list = this.category_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("category_tokens=", arrayList, list);
        }
        List list2 = this.subfilters;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("subfilters=", arrayList, list2);
        }
        List list3 = this.category_map;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("category_map=", arrayList, list3);
        }
        Boolean bool = this.can_select_multiple_categories;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("can_select_multiple_categories=", bool, arrayList);
        }
        String str3 = this.name_plural;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "name_plural=", arrayList);
        }
        JoinType joinType = this.joinType;
        if (joinType != null) {
            arrayList.add("joinType=" + joinType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncInvestmentFilterGroup{", "}", 0, null, null, 56);
    }

    /* loaded from: classes.dex */
    public final class CategoryMapNode extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CategoryMapNode> CREATOR;
        public final String category_token;
        public final String option_token;
        public final List sub_nodes;

        static {
            SyncInvestmentFilterGroup$CategoryMapNode$Companion$ADAPTER$1 syncInvestmentFilterGroup$CategoryMapNode$Companion$ADAPTER$1 = new SyncInvestmentFilterGroup$CategoryMapNode$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CategoryMapNode.class), "type.googleapis.com/squareup.franklin.SyncInvestmentFilterGroup.CategoryMapNode", Syntax.PROTO_2, null, "squareup/franklin/sync_entity.proto");
            ADAPTER = syncInvestmentFilterGroup$CategoryMapNode$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(syncInvestmentFilterGroup$CategoryMapNode$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CategoryMapNode(String str, String str2, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.option_token = str;
            this.category_token = str2;
            this.sub_nodes = TransactorKt.immutableCopyOf("sub_nodes", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CategoryMapNode)) {
                return false;
            }
            CategoryMapNode categoryMapNode = (CategoryMapNode) obj;
            return Intrinsics.areEqual(unknownFields(), categoryMapNode.unknownFields()) && Intrinsics.areEqual(this.option_token, categoryMapNode.option_token) && Intrinsics.areEqual(this.category_token, categoryMapNode.category_token) && Intrinsics.areEqual(this.sub_nodes, categoryMapNode.sub_nodes);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.option_token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.category_token;
            int hashCode3 = this.sub_nodes.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GiftCardCategory.Builder builder = new GiftCardCategory.Builder(5);
            builder.token = this.option_token;
            builder.name = this.category_token;
            builder.gift_card_type_tokens = this.sub_nodes;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.option_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "option_token=", arrayList);
            }
            String str2 = this.category_token;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "category_token=", arrayList);
            }
            List list = this.sub_nodes;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("sub_nodes=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CategoryMapNode{", "}", 0, null, null, 56);
        }

        public CategoryMapNode(List list) {
            this(null, null, list, ByteString.EMPTY);
        }
    }
}
