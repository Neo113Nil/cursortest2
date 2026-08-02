package com.squareup.protos.cash.cashbusinessaccounts;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
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
public final class BusinessProfileData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BusinessProfileData> CREATOR;
    public final String banner_color_name;
    public final BusinessCategory category;
    public final LocalizedString category_display_text;
    public final String instagram_handle;
    public final Image instagram_logo;
    public final String location_display_text;

    static {
        BusinessProfileData$Companion$ADAPTER$1 businessProfileData$Companion$ADAPTER$1 = new BusinessProfileData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BusinessProfileData.class), "type.googleapis.com/squareup.cash.cashbusinessaccounts.BusinessProfileData", Syntax.PROTO_2, null, "squareup/cash/cashbusinessaccounts/sync_values.proto");
        ADAPTER = businessProfileData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(businessProfileData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessProfileData(String str, String str2, BusinessCategory businessCategory, LocalizedString localizedString, String str3, Image image, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.instagram_handle = str;
        this.location_display_text = str2;
        this.category = businessCategory;
        this.category_display_text = localizedString;
        this.banner_color_name = str3;
        this.instagram_logo = image;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BusinessProfileData)) {
            return false;
        }
        BusinessProfileData businessProfileData = (BusinessProfileData) obj;
        return Intrinsics.areEqual(unknownFields(), businessProfileData.unknownFields()) && Intrinsics.areEqual(this.instagram_handle, businessProfileData.instagram_handle) && Intrinsics.areEqual(this.location_display_text, businessProfileData.location_display_text) && this.category == businessProfileData.category && Intrinsics.areEqual(this.category_display_text, businessProfileData.category_display_text) && Intrinsics.areEqual(this.banner_color_name, businessProfileData.banner_color_name) && Intrinsics.areEqual(this.instagram_logo, businessProfileData.instagram_logo);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.instagram_handle;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.location_display_text;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        BusinessCategory businessCategory = this.category;
        int hashCode4 = (hashCode3 + (businessCategory != null ? businessCategory.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.category_display_text;
        int hashCode5 = (hashCode4 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        String str3 = this.banner_color_name;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Image image = this.instagram_logo;
        int hashCode7 = hashCode6 + (image != null ? image.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(15, false);
        builder.description = this.instagram_handle;
        builder.field = this.location_display_text;
        builder.category = this.category;
        builder.code = this.category_display_text;
        builder.retryable = this.banner_color_name;
        builder.metadata = this.instagram_logo;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.instagram_handle != null) {
            arrayList.add("instagram_handle=██");
        }
        if (this.location_display_text != null) {
            arrayList.add("location_display_text=██");
        }
        BusinessCategory businessCategory = this.category;
        if (businessCategory != null) {
            arrayList.add("category=" + businessCategory);
        }
        if (this.category_display_text != null) {
            arrayList.add("category_display_text=██");
        }
        String str = this.banner_color_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "banner_color_name=", arrayList);
        }
        Image image = this.instagram_logo;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("instagram_logo=", image, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BusinessProfileData{", "}", 0, null, null, 56);
    }
}
