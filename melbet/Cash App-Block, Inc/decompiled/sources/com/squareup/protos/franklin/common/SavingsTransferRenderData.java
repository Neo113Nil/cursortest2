package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.banklin.data.StoredValueBalance;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.document.DocumentEntity;
import com.squareup.protos.franklin.ui.UiPublicProfile;
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
public final class SavingsTransferRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsTransferRenderData> CREATOR;
    public final Boolean is_negative_balance_adjustment;
    public final Boolean is_savings_render_context;
    public final String source_balance_token;
    public final StoredValueBalance.Type source_balance_type;
    public final SavingsFolderMetadata source_savings_folder_metadata;
    public final String target_balance_token;
    public final StoredValueBalance.Type target_balance_type;
    public final SavingsFolderMetadata target_savings_folder_metadata;

    public final class SavingsFolderMetadata extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SavingsFolderMetadata> CREATOR;
        public final String activity_token;
        public final String avatar_url;
        public final String icon_id;
        public final Image image;
        public final String label;
        public final LocalizableString localizable_label;

        static {
            SavingsTransferRenderData$SavingsFolderMetadata$Companion$ADAPTER$1 savingsTransferRenderData$SavingsFolderMetadata$Companion$ADAPTER$1 = new SavingsTransferRenderData$SavingsFolderMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsFolderMetadata.class), "type.googleapis.com/squareup.franklin.SavingsTransferRenderData.SavingsFolderMetadata", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = savingsTransferRenderData$SavingsFolderMetadata$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsTransferRenderData$SavingsFolderMetadata$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavingsFolderMetadata(String str, String str2, String str3, LocalizableString localizableString, Image image, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.label = str;
            this.avatar_url = str2;
            this.activity_token = str3;
            this.localizable_label = localizableString;
            this.image = image;
            this.icon_id = str4;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SavingsFolderMetadata)) {
                return false;
            }
            SavingsFolderMetadata savingsFolderMetadata = (SavingsFolderMetadata) obj;
            return Intrinsics.areEqual(unknownFields(), savingsFolderMetadata.unknownFields()) && Intrinsics.areEqual(this.label, savingsFolderMetadata.label) && Intrinsics.areEqual(this.avatar_url, savingsFolderMetadata.avatar_url) && Intrinsics.areEqual(this.activity_token, savingsFolderMetadata.activity_token) && Intrinsics.areEqual(this.localizable_label, savingsFolderMetadata.localizable_label) && Intrinsics.areEqual(this.image, savingsFolderMetadata.image) && Intrinsics.areEqual(this.icon_id, savingsFolderMetadata.icon_id);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.label;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.avatar_url;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.activity_token;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            LocalizableString localizableString = this.localizable_label;
            int hashCode5 = (hashCode4 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
            Image image = this.image;
            int hashCode6 = (hashCode5 + (image != null ? image.hashCode() : 0)) * 37;
            String str4 = this.icon_id;
            int hashCode7 = hashCode6 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            UiPublicProfile.Builder builder = new UiPublicProfile.Builder(6, false);
            builder.full_name = this.label;
            builder.photo_url = this.avatar_url;
            builder.synopsis = this.activity_token;
            builder.full_cashtag = this.localizable_label;
            builder.cashtag_url_enabled = this.image;
            builder.is_verified_account = this.icon_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.label != null) {
                arrayList.add("label=██");
            }
            String str = this.avatar_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "avatar_url=", arrayList);
            }
            String str2 = this.activity_token;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "activity_token=", arrayList);
            }
            LocalizableString localizableString = this.localizable_label;
            if (localizableString != null) {
                Matcher$$ExternalSyntheticOutline0.m("localizable_label=", localizableString, arrayList);
            }
            Image image = this.image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
            }
            String str3 = this.icon_id;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "icon_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsFolderMetadata{", "}", 0, null, null, 56);
        }
    }

    static {
        SavingsTransferRenderData$Companion$ADAPTER$1 savingsTransferRenderData$Companion$ADAPTER$1 = new SavingsTransferRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsTransferRenderData.class), "type.googleapis.com/squareup.franklin.SavingsTransferRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = savingsTransferRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsTransferRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsTransferRenderData(StoredValueBalance.Type type2, StoredValueBalance.Type type3, Boolean bool, String str, String str2, Boolean bool2, SavingsFolderMetadata savingsFolderMetadata, SavingsFolderMetadata savingsFolderMetadata2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.source_balance_type = type2;
        this.target_balance_type = type3;
        this.is_negative_balance_adjustment = bool;
        this.source_balance_token = str;
        this.target_balance_token = str2;
        this.is_savings_render_context = bool2;
        this.source_savings_folder_metadata = savingsFolderMetadata;
        this.target_savings_folder_metadata = savingsFolderMetadata2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsTransferRenderData)) {
            return false;
        }
        SavingsTransferRenderData savingsTransferRenderData = (SavingsTransferRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), savingsTransferRenderData.unknownFields()) && this.source_balance_type == savingsTransferRenderData.source_balance_type && this.target_balance_type == savingsTransferRenderData.target_balance_type && Intrinsics.areEqual(this.is_negative_balance_adjustment, savingsTransferRenderData.is_negative_balance_adjustment) && Intrinsics.areEqual(this.source_balance_token, savingsTransferRenderData.source_balance_token) && Intrinsics.areEqual(this.target_balance_token, savingsTransferRenderData.target_balance_token) && Intrinsics.areEqual(this.is_savings_render_context, savingsTransferRenderData.is_savings_render_context) && Intrinsics.areEqual(this.source_savings_folder_metadata, savingsTransferRenderData.source_savings_folder_metadata) && Intrinsics.areEqual(this.target_savings_folder_metadata, savingsTransferRenderData.target_savings_folder_metadata);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        StoredValueBalance.Type type2 = this.source_balance_type;
        int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
        StoredValueBalance.Type type3 = this.target_balance_type;
        int hashCode3 = (hashCode2 + (type3 != null ? type3.hashCode() : 0)) * 37;
        Boolean bool = this.is_negative_balance_adjustment;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.source_balance_token;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.target_balance_token;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool2 = this.is_savings_render_context;
        int hashCode7 = (hashCode6 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        SavingsFolderMetadata savingsFolderMetadata = this.source_savings_folder_metadata;
        int hashCode8 = (hashCode7 + (savingsFolderMetadata != null ? savingsFolderMetadata.hashCode() : 0)) * 37;
        SavingsFolderMetadata savingsFolderMetadata2 = this.target_savings_folder_metadata;
        int hashCode9 = hashCode8 + (savingsFolderMetadata2 != null ? savingsFolderMetadata2.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DocumentEntity.Builder builder = new DocumentEntity.Builder(29, false);
        builder.title = this.source_balance_type;
        builder.client_route = this.target_balance_type;
        builder.url = this.is_negative_balance_adjustment;
        builder.category = this.source_balance_token;
        builder.token = this.target_balance_token;
        builder.owner_token = this.is_savings_render_context;
        builder.version_data = this.source_savings_folder_metadata;
        builder.localizable_title = this.target_savings_folder_metadata;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        StoredValueBalance.Type type2 = this.source_balance_type;
        if (type2 != null) {
            arrayList.add("source_balance_type=" + type2);
        }
        StoredValueBalance.Type type3 = this.target_balance_type;
        if (type3 != null) {
            arrayList.add("target_balance_type=" + type3);
        }
        Boolean bool = this.is_negative_balance_adjustment;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_negative_balance_adjustment=", bool, arrayList);
        }
        String str = this.source_balance_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "source_balance_token=", arrayList);
        }
        String str2 = this.target_balance_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "target_balance_token=", arrayList);
        }
        Boolean bool2 = this.is_savings_render_context;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_savings_render_context=", bool2, arrayList);
        }
        SavingsFolderMetadata savingsFolderMetadata = this.source_savings_folder_metadata;
        if (savingsFolderMetadata != null) {
            arrayList.add("source_savings_folder_metadata=" + savingsFolderMetadata);
        }
        SavingsFolderMetadata savingsFolderMetadata2 = this.target_savings_folder_metadata;
        if (savingsFolderMetadata2 != null) {
            arrayList.add("target_savings_folder_metadata=" + savingsFolderMetadata2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsTransferRenderData{", "}", 0, null, null, 56);
    }
}
