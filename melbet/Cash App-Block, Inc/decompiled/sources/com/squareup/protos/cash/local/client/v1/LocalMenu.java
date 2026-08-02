package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.employeejobs.Job;
import com.squareup.protos.franklin.api.FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalMenu extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalMenu> CREATOR;
    public final List categories;
    public final Long changes_at;
    public final Map combo_categories;
    public final Map discount_summaries;
    public final Map items;
    public final List menus;
    public final Map modifier_lists;
    public final Map option_values;
    public final List recommended_item_tokens;
    public final String scheduling_token;
    public final String title;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LocalMenu.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.v1.LocalMenu$Companion$ADAPTER$1
            public final Lazy combo_categoriesAdapter$delegate;
            public final Lazy discount_summariesAdapter$delegate;
            public final Lazy itemsAdapter$delegate;
            public final Lazy modifier_listsAdapter$delegate;
            public final Lazy option_valuesAdapter$delegate;

            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
                this.itemsAdapter$delegate = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(19));
                this.modifier_listsAdapter$delegate = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(20));
                this.option_valuesAdapter$delegate = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(21));
                this.combo_categoriesAdapter$delegate = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(22));
                this.discount_summariesAdapter$delegate = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(23));
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r12v0 */
            /* JADX WARN: Type inference failed for: r12v1 */
            /* JADX WARN: Type inference failed for: r12v26, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r12v28, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r12v39 */
            /* JADX WARN: Type inference failed for: r12v40 */
            /* JADX WARN: Type inference failed for: r12v42, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                ArrayList arrayList2 = new ArrayList();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                long beginMessage = protoReader.beginMessage();
                ?? r12 = 0;
                Long l = null;
                String str = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    String str2 = r12;
                    if (nextTag == -1) {
                        return new LocalMenu(m, linkedHashMap, linkedHashMap2, arrayList, str2, linkedHashMap3, arrayList2, l, str, linkedHashMap4, linkedHashMap5, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            m.add(LocalMenuCategory.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            linkedHashMap.putAll((Map) ((ProtoAdapter) this.itemsAdapter$delegate.getValue()).decode(protoReader));
                            break;
                        case 3:
                            linkedHashMap2.putAll((Map) ((ProtoAdapter) this.modifier_listsAdapter$delegate.getValue()).decode(protoReader));
                            break;
                        case 4:
                            arrayList.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            r12 = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 6:
                            linkedHashMap3.putAll((Map) ((ProtoAdapter) this.option_valuesAdapter$delegate.getValue()).decode(protoReader));
                            break;
                        case 7:
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                        case 8:
                            arrayList2.add(LocalMenuCategoryCollection.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            l = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 10:
                            str = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            linkedHashMap4.putAll((Map) ((ProtoAdapter) this.combo_categoriesAdapter$delegate.getValue()).decode(protoReader));
                            break;
                        case 12:
                            linkedHashMap5.putAll((Map) ((ProtoAdapter) this.discount_summariesAdapter$delegate.getValue()).decode(protoReader));
                            break;
                    }
                    r12 = str2;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                LocalMenu localMenu = (LocalMenu) obj;
                reverseProtoWriter.getClass();
                localMenu.getClass();
                reverseProtoWriter.writeBytes(localMenu.unknownFields());
                ((ProtoAdapter) this.discount_summariesAdapter$delegate.getValue()).encodeWithTag(reverseProtoWriter, 12, localMenu.discount_summaries);
                ((ProtoAdapter) this.combo_categoriesAdapter$delegate.getValue()).encodeWithTag(reverseProtoWriter, 11, localMenu.combo_categories);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 10, localMenu.scheduling_token);
                ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 9, localMenu.changes_at);
                LocalMenuCategoryCollection.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 8, localMenu.menus);
                ((ProtoAdapter) this.option_valuesAdapter$delegate.getValue()).encodeWithTag(reverseProtoWriter, 6, localMenu.option_values);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, localMenu.title);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 4, localMenu.recommended_item_tokens);
                ((ProtoAdapter) this.modifier_listsAdapter$delegate.getValue()).encodeWithTag(reverseProtoWriter, 3, localMenu.modifier_lists);
                ((ProtoAdapter) this.itemsAdapter$delegate.getValue()).encodeWithTag(reverseProtoWriter, 2, localMenu.items);
                LocalMenuCategory.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, localMenu.categories);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                LocalMenu localMenu = (LocalMenu) obj;
                localMenu.getClass();
                int encodedSizeWithTag = ((ProtoAdapter) this.modifier_listsAdapter$delegate.getValue()).encodedSizeWithTag(3, localMenu.modifier_lists) + ((ProtoAdapter) this.itemsAdapter$delegate.getValue()).encodedSizeWithTag(2, localMenu.items) + LocalMenuCategory.ADAPTER.asRepeated().encodedSizeWithTag(1, localMenu.categories) + localMenu.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return ((ProtoAdapter) this.discount_summariesAdapter$delegate.getValue()).encodedSizeWithTag(12, localMenu.discount_summaries) + ((ProtoAdapter) this.combo_categoriesAdapter$delegate.getValue()).encodedSizeWithTag(11, localMenu.combo_categories) + protoAdapter2.encodedSizeWithTag(10, localMenu.scheduling_token) + ProtoAdapter.INT64.encodedSizeWithTag(9, localMenu.changes_at) + LocalMenuCategoryCollection.ADAPTER.asRepeated().encodedSizeWithTag(8, localMenu.menus) + ((ProtoAdapter) this.option_valuesAdapter$delegate.getValue()).encodedSizeWithTag(6, localMenu.option_values) + protoAdapter2.encodedSizeWithTag(5, localMenu.title) + protoAdapter2.asRepeated().encodedSizeWithTag(4, localMenu.recommended_item_tokens) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                LocalMenu localMenu = (LocalMenu) obj;
                localMenu.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(localMenu.categories, LocalMenuCategory.ADAPTER);
                LinkedHashMap m1170redactElements = TransactorKt.m1170redactElements(localMenu.items, LocalMenuItem.ADAPTER);
                LinkedHashMap m1170redactElements2 = TransactorKt.m1170redactElements(localMenu.modifier_lists, LocalMenuItemModifierList.ADAPTER);
                LinkedHashMap m1170redactElements3 = TransactorKt.m1170redactElements(localMenu.option_values, LocalMenuItemOptionValue.ADAPTER);
                ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(localMenu.menus, LocalMenuCategoryCollection.ADAPTER);
                LinkedHashMap m1170redactElements4 = TransactorKt.m1170redactElements(localMenu.combo_categories, LocalMenuComboCategory.ADAPTER);
                LinkedHashMap m1170redactElements5 = TransactorKt.m1170redactElements(localMenu.discount_summaries, LocalMenuDiscountSummary.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                List list = localMenu.recommended_item_tokens;
                String str = localMenu.title;
                Long l = localMenu.changes_at;
                String str2 = localMenu.scheduling_token;
                list.getClass();
                byteString.getClass();
                return new LocalMenu(m1169redactElements, m1170redactElements, m1170redactElements2, list, str, m1170redactElements3, m1169redactElements2, l, str2, m1170redactElements4, m1170redactElements5, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                LocalMenu localMenu = (LocalMenu) obj;
                localMenu.getClass();
                LocalMenuCategory.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, localMenu.categories);
                ((ProtoAdapter) this.itemsAdapter$delegate.getValue()).encodeWithTag(protoWriter, 2, localMenu.items);
                ((ProtoAdapter) this.modifier_listsAdapter$delegate.getValue()).encodeWithTag(protoWriter, 3, localMenu.modifier_lists);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 4, localMenu.recommended_item_tokens);
                protoAdapter2.encodeWithTag(protoWriter, 5, localMenu.title);
                ((ProtoAdapter) this.option_valuesAdapter$delegate.getValue()).encodeWithTag(protoWriter, 6, localMenu.option_values);
                LocalMenuCategoryCollection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, localMenu.menus);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, localMenu.changes_at);
                protoAdapter2.encodeWithTag(protoWriter, 10, localMenu.scheduling_token);
                ((ProtoAdapter) this.combo_categoriesAdapter$delegate.getValue()).encodeWithTag(protoWriter, 11, localMenu.combo_categories);
                ((ProtoAdapter) this.discount_summariesAdapter$delegate.getValue()).encodeWithTag(protoWriter, 12, localMenu.discount_summaries);
                protoWriter.writeBytes(localMenu.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalMenu(List list, Map map, Map map2, List list2, String str, Map map3, List list3, Long l, String str2, Map map4, Map map5, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        map.getClass();
        map2.getClass();
        list2.getClass();
        map3.getClass();
        list3.getClass();
        map4.getClass();
        map5.getClass();
        byteString.getClass();
        this.title = str;
        this.changes_at = l;
        this.scheduling_token = str2;
        this.categories = TransactorKt.immutableCopyOf("categories", list);
        this.items = TransactorKt.immutableCopyOf("items", map);
        this.modifier_lists = TransactorKt.immutableCopyOf("modifier_lists", map2);
        this.recommended_item_tokens = TransactorKt.immutableCopyOf("recommended_item_tokens", list2);
        this.option_values = TransactorKt.immutableCopyOf("option_values", map3);
        this.menus = TransactorKt.immutableCopyOf("menus", list3);
        this.combo_categories = TransactorKt.immutableCopyOf("combo_categories", map4);
        this.discount_summaries = TransactorKt.immutableCopyOf("discount_summaries", map5);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalMenu)) {
            return false;
        }
        LocalMenu localMenu = (LocalMenu) obj;
        return Intrinsics.areEqual(unknownFields(), localMenu.unknownFields()) && Intrinsics.areEqual(this.categories, localMenu.categories) && Intrinsics.areEqual(this.items, localMenu.items) && Intrinsics.areEqual(this.modifier_lists, localMenu.modifier_lists) && Intrinsics.areEqual(this.recommended_item_tokens, localMenu.recommended_item_tokens) && Intrinsics.areEqual(this.title, localMenu.title) && Intrinsics.areEqual(this.option_values, localMenu.option_values) && Intrinsics.areEqual(this.menus, localMenu.menus) && Intrinsics.areEqual(this.changes_at, localMenu.changes_at) && Intrinsics.areEqual(this.scheduling_token, localMenu.scheduling_token) && Intrinsics.areEqual(this.combo_categories, localMenu.combo_categories) && Intrinsics.areEqual(this.discount_summaries, localMenu.discount_summaries);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(CameraState$Type$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.categories), this.items, 37), this.modifier_lists, 37), 37, this.recommended_item_tokens);
        String str = this.title;
        int m2 = Recorder$$ExternalSyntheticOutline2.m(CameraState$Type$EnumUnboxingLocalUtility.m((m + (str != null ? str.hashCode() : 0)) * 37, this.option_values, 37), 37, this.menus);
        Long l = this.changes_at;
        int hashCode = (m2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str2 = this.scheduling_token;
        int hashCode2 = this.discount_summaries.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m((hashCode + (str2 != null ? str2.hashCode() : 0)) * 37, this.combo_categories, 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Job.Builder builder = new Job.Builder(9);
        builder.title = EmptyList.INSTANCE;
        EmptyMap.INSTANCE.getClass();
        builder.title = this.categories;
        builder.default_wage = this.items;
        builder.updated_at_timestamp_ms = this.modifier_lists;
        builder.deleted_at_timestamp_ms = this.recommended_item_tokens;
        builder.token = this.title;
        builder.team_member_count = this.option_values;
        builder.version = this.menus;
        builder.created_at_timestamp_ms = this.changes_at;
        builder.merchant_token = this.scheduling_token;
        builder.tip_eligible = this.combo_categories;
        builder.default_color_scheme = this.discount_summaries;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.categories;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("categories=", arrayList, list);
        }
        Map map = this.items;
        if (!map.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("items=", map, arrayList);
        }
        Map map2 = this.modifier_lists;
        if (!map2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("modifier_lists=", map2, arrayList);
        }
        List list2 = this.recommended_item_tokens;
        if (!list2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("recommended_item_tokens=", arrayList, list2);
        }
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        Map map3 = this.option_values;
        if (!map3.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("option_values=", map3, arrayList);
        }
        List list3 = this.menus;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("menus=", arrayList, list3);
        }
        Long l = this.changes_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("changes_at=", l, arrayList);
        }
        String str2 = this.scheduling_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "scheduling_token=", arrayList);
        }
        Map map4 = this.combo_categories;
        if (!map4.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("combo_categories=", map4, arrayList);
        }
        Map map5 = this.discount_summaries;
        if (!map5.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("discount_summaries=", map5, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalMenu{", "}", 0, null, null, 56);
    }
}
