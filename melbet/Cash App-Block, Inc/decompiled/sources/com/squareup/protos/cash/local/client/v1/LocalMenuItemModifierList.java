package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzit;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.groups.Group;
import com.squareup.protos.cash.money.content.MoneyTab;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.cash.postcard.app.KnotSwitchCardResponse;
import com.squareup.protos.document.DocumentEntity;
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
public final class LocalMenuItemModifierList extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalMenuItemModifierList> CREATOR;
    public final zzit input_type;
    public final String name;
    public final String token;

    public final class FreeTextEntry extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<FreeTextEntry> CREATOR;
        public final Integer max_length;
        public final Boolean require_non_empty_string;

        static {
            LocalMenuItemModifierList$FreeTextEntry$Companion$ADAPTER$1 localMenuItemModifierList$FreeTextEntry$Companion$ADAPTER$1 = new LocalMenuItemModifierList$FreeTextEntry$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FreeTextEntry.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalMenuItemModifierList.FreeTextEntry", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_menu.proto");
            ADAPTER = localMenuItemModifierList$FreeTextEntry$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localMenuItemModifierList$FreeTextEntry$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FreeTextEntry(Boolean bool, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.max_length = num;
            this.require_non_empty_string = bool;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FreeTextEntry)) {
                return false;
            }
            FreeTextEntry freeTextEntry = (FreeTextEntry) obj;
            return Intrinsics.areEqual(unknownFields(), freeTextEntry.unknownFields()) && Intrinsics.areEqual(this.max_length, freeTextEntry.max_length) && Intrinsics.areEqual(this.require_non_empty_string, freeTextEntry.require_non_empty_string);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.max_length;
            int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Boolean bool = this.require_non_empty_string;
            int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            KnotSwitchCardResponse.Builder builder = new KnotSwitchCardResponse.Builder(2);
            builder.merchant_id = this.max_length;
            builder.success = this.require_non_empty_string;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Integer num = this.max_length;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("max_length=", num, arrayList);
            }
            Boolean bool = this.require_non_empty_string;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("require_non_empty_string=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "FreeTextEntry{", "}", 0, null, null, 56);
        }
    }

    public final class Modifier extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Modifier> CREATOR;
        public final LocalMenuAvailability availability;
        public final LocalImage image;
        public final String name;
        public final List nested_modifier_lists;
        public final LocalMoney price;
        public final Boolean selected_by_default;
        public final String token;

        static {
            LocalMenuItemModifierList$Modifier$Companion$ADAPTER$1 localMenuItemModifierList$Modifier$Companion$ADAPTER$1 = new LocalMenuItemModifierList$Modifier$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Modifier.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalMenuItemModifierList.Modifier", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_menu.proto");
            ADAPTER = localMenuItemModifierList$Modifier$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localMenuItemModifierList$Modifier$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Modifier(String str, String str2, LocalMoney localMoney, Boolean bool, LocalMenuAvailability localMenuAvailability, LocalImage localImage, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.token = str;
            this.name = str2;
            this.price = localMoney;
            this.selected_by_default = bool;
            this.availability = localMenuAvailability;
            this.image = localImage;
            this.nested_modifier_lists = TransactorKt.immutableCopyOf("nested_modifier_lists", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Modifier)) {
                return false;
            }
            Modifier modifier = (Modifier) obj;
            return Intrinsics.areEqual(unknownFields(), modifier.unknownFields()) && Intrinsics.areEqual(this.token, modifier.token) && Intrinsics.areEqual(this.name, modifier.name) && Intrinsics.areEqual(this.price, modifier.price) && Intrinsics.areEqual(this.selected_by_default, modifier.selected_by_default) && this.availability == modifier.availability && Intrinsics.areEqual(this.image, modifier.image) && Intrinsics.areEqual(this.nested_modifier_lists, modifier.nested_modifier_lists);
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
            LocalMoney localMoney = this.price;
            int hashCode4 = (hashCode3 + (localMoney != null ? localMoney.hashCode() : 0)) * 37;
            Boolean bool = this.selected_by_default;
            int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            LocalMenuAvailability localMenuAvailability = this.availability;
            int hashCode6 = (hashCode5 + (localMenuAvailability != null ? localMenuAvailability.hashCode() : 0)) * 37;
            LocalImage localImage = this.image;
            int hashCode7 = this.nested_modifier_lists.hashCode() + ((hashCode6 + (localImage != null ? localImage.hashCode() : 0)) * 37);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            PoolParticipant.Builder builder = new PoolParticipant.Builder(4);
            builder.customer_identifier = this.token;
            builder.full_name = this.name;
            builder.profile_photo_url = this.price;
            builder.cashtag = this.selected_by_default;
            builder.added_at = this.availability;
            builder.participant_type = this.image;
            builder.aggregated_contribution_amount = this.nested_modifier_lists;
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
            LocalMoney localMoney = this.price;
            if (localMoney != null) {
                SizeMode$EnumUnboxingLocalUtility.m("price=", localMoney, arrayList);
            }
            Boolean bool = this.selected_by_default;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("selected_by_default=", bool, arrayList);
            }
            LocalMenuAvailability localMenuAvailability = this.availability;
            if (localMenuAvailability != null) {
                arrayList.add("availability=" + localMenuAvailability);
            }
            LocalImage localImage = this.image;
            if (localImage != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", localImage, arrayList);
            }
            List list = this.nested_modifier_lists;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("nested_modifier_lists=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Modifier{", "}", 0, null, null, 56);
        }
    }

    public final class NestedModifierList extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<NestedModifierList> CREATOR;
        public final Boolean allow_quantities;
        public final Integer max_length;
        public final Integer max_selections;
        public final Integer min_selections;
        public final List modifiers;
        public final String name;
        public final Boolean require_non_empty_string;
        public final String token;

        static {
            LocalMenuItemModifierList$NestedModifierList$Companion$ADAPTER$1 localMenuItemModifierList$NestedModifierList$Companion$ADAPTER$1 = new LocalMenuItemModifierList$NestedModifierList$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NestedModifierList.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalMenuItemModifierList.NestedModifierList", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_menu.proto");
            ADAPTER = localMenuItemModifierList$NestedModifierList$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localMenuItemModifierList$NestedModifierList$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NestedModifierList(String str, String str2, Integer num, Integer num2, Boolean bool, List list, Integer num3, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.token = str;
            this.name = str2;
            this.min_selections = num;
            this.max_selections = num2;
            this.allow_quantities = bool;
            this.max_length = num3;
            this.require_non_empty_string = bool2;
            this.modifiers = TransactorKt.immutableCopyOf("modifiers", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NestedModifierList)) {
                return false;
            }
            NestedModifierList nestedModifierList = (NestedModifierList) obj;
            return Intrinsics.areEqual(unknownFields(), nestedModifierList.unknownFields()) && Intrinsics.areEqual(this.token, nestedModifierList.token) && Intrinsics.areEqual(this.name, nestedModifierList.name) && Intrinsics.areEqual(this.min_selections, nestedModifierList.min_selections) && Intrinsics.areEqual(this.max_selections, nestedModifierList.max_selections) && Intrinsics.areEqual(this.allow_quantities, nestedModifierList.allow_quantities) && Intrinsics.areEqual(this.modifiers, nestedModifierList.modifiers) && Intrinsics.areEqual(this.max_length, nestedModifierList.max_length) && Intrinsics.areEqual(this.require_non_empty_string, nestedModifierList.require_non_empty_string);
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
            Integer num = this.min_selections;
            int hashCode4 = (hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Integer num2 = this.max_selections;
            int hashCode5 = (hashCode4 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
            Boolean bool = this.allow_quantities;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37, 37, this.modifiers);
            Integer num3 = this.max_length;
            int hashCode6 = (m + (num3 != null ? Integer.hashCode(num3.intValue()) : 0)) * 37;
            Boolean bool2 = this.require_non_empty_string;
            int hashCode7 = hashCode6 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            DocumentEntity.Builder builder = new DocumentEntity.Builder(3, false);
            builder.category = this.token;
            builder.token = this.name;
            builder.title = this.min_selections;
            builder.client_route = this.max_selections;
            builder.url = this.allow_quantities;
            builder.owner_token = this.modifiers;
            builder.version_data = this.max_length;
            builder.localizable_title = this.require_non_empty_string;
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
            Integer num = this.min_selections;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("min_selections=", num, arrayList);
            }
            Integer num2 = this.max_selections;
            if (num2 != null) {
                re$$ExternalSyntheticOutline0.m("max_selections=", num2, arrayList);
            }
            Boolean bool = this.allow_quantities;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("allow_quantities=", bool, arrayList);
            }
            List list = this.modifiers;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("modifiers=", arrayList, list);
            }
            Integer num3 = this.max_length;
            if (num3 != null) {
                re$$ExternalSyntheticOutline0.m("max_length=", num3, arrayList);
            }
            Boolean bool2 = this.require_non_empty_string;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("require_non_empty_string=", bool2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "NestedModifierList{", "}", 0, null, null, 56);
        }
    }

    public final class SelectFromList extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SelectFromList> CREATOR;
        public final List modifiers;

        static {
            LocalMenuItemModifierList$SelectFromList$Companion$ADAPTER$1 localMenuItemModifierList$SelectFromList$Companion$ADAPTER$1 = new LocalMenuItemModifierList$SelectFromList$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SelectFromList.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalMenuItemModifierList.SelectFromList", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_menu.proto");
            ADAPTER = localMenuItemModifierList$SelectFromList$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localMenuItemModifierList$SelectFromList$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectFromList(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.modifiers = TransactorKt.immutableCopyOf("modifiers", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SelectFromList)) {
                return false;
            }
            SelectFromList selectFromList = (SelectFromList) obj;
            return Intrinsics.areEqual(unknownFields(), selectFromList.unknownFields()) && Intrinsics.areEqual(this.modifiers, selectFromList.modifiers);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.modifiers.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            MoneyTab.Builder builder = new MoneyTab.Builder(10, false);
            builder.applets = this.modifiers;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.modifiers;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("modifiers=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SelectFromList{", "}", 0, null, null, 56);
        }
    }

    static {
        LocalMenuItemModifierList$Companion$ADAPTER$1 localMenuItemModifierList$Companion$ADAPTER$1 = new LocalMenuItemModifierList$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalMenuItemModifierList.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalMenuItemModifierList", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_menu.proto");
        ADAPTER = localMenuItemModifierList$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localMenuItemModifierList$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalMenuItemModifierList(String str, String str2, zzit zzitVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.name = str2;
        this.input_type = zzitVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalMenuItemModifierList)) {
            return false;
        }
        LocalMenuItemModifierList localMenuItemModifierList = (LocalMenuItemModifierList) obj;
        return Intrinsics.areEqual(unknownFields(), localMenuItemModifierList.unknownFields()) && Intrinsics.areEqual(this.token, localMenuItemModifierList.token) && Intrinsics.areEqual(this.name, localMenuItemModifierList.name) && Intrinsics.areEqual(this.input_type, localMenuItemModifierList.input_type);
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
        zzit zzitVar = this.input_type;
        int hashCode4 = hashCode3 + (zzitVar != null ? zzitVar.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Group.Builder builder = new Group.Builder(29);
        builder.name = this.token;
        builder.group_image = this.name;
        builder.participants = this.input_type;
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
        zzit zzitVar = this.input_type;
        if (zzitVar != null) {
            arrayList.add("input_type=" + zzitVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalMenuItemModifierList{", "}", 0, null, null, 56);
    }
}
