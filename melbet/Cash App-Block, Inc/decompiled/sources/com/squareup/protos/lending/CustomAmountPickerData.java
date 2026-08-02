package com.squareup.protos.lending;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.Money;
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
public final class CustomAmountPickerData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CustomAmountPickerData> CREATOR;
    public final LocalizedString button_title;
    public final Money maximum_amount;
    public final Money minimum_amount;
    public final LocalizedString subtitle;
    public final Color tint_color;
    public final LocalizedString title;

    static {
        CustomAmountPickerData$Companion$ADAPTER$1 customAmountPickerData$Companion$ADAPTER$1 = new CustomAmountPickerData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CustomAmountPickerData.class), "type.googleapis.com/squareup.lending.CustomAmountPickerData", Syntax.PROTO_2, null, "squareup/lending/custom_amount_picker_data.proto");
        ADAPTER = customAmountPickerData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(customAmountPickerData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomAmountPickerData(LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, Money money, Money money2, Color color, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = localizedString;
        this.subtitle = localizedString2;
        this.button_title = localizedString3;
        this.minimum_amount = money;
        this.maximum_amount = money2;
        this.tint_color = color;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CustomAmountPickerData)) {
            return false;
        }
        CustomAmountPickerData customAmountPickerData = (CustomAmountPickerData) obj;
        return Intrinsics.areEqual(unknownFields(), customAmountPickerData.unknownFields()) && Intrinsics.areEqual(this.title, customAmountPickerData.title) && Intrinsics.areEqual(this.subtitle, customAmountPickerData.subtitle) && Intrinsics.areEqual(this.button_title, customAmountPickerData.button_title) && Intrinsics.areEqual(this.minimum_amount, customAmountPickerData.minimum_amount) && Intrinsics.areEqual(this.maximum_amount, customAmountPickerData.maximum_amount) && Intrinsics.areEqual(this.tint_color, customAmountPickerData.tint_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.subtitle;
        int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        LocalizedString localizedString3 = this.button_title;
        int hashCode4 = (hashCode3 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
        Money money = this.minimum_amount;
        int hashCode5 = (hashCode4 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.maximum_amount;
        int hashCode6 = (hashCode5 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Color color = this.tint_color;
        int hashCode7 = hashCode6 + (color != null ? color.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiPublicProfile.Builder builder = new UiPublicProfile.Builder(15, false);
        builder.full_name = this.title;
        builder.photo_url = this.subtitle;
        builder.synopsis = this.button_title;
        builder.full_cashtag = this.minimum_amount;
        builder.cashtag_url_enabled = this.maximum_amount;
        builder.is_verified_account = this.tint_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
        }
        LocalizedString localizedString3 = this.button_title;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("button_title=", localizedString3, arrayList);
        }
        Money money = this.minimum_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("minimum_amount=", money, arrayList);
        }
        Money money2 = this.maximum_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("maximum_amount=", money2, arrayList);
        }
        Color color = this.tint_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("tint_color=", color, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CustomAmountPickerData{", "}", 0, null, null, 56);
    }
}
