package com.squareup.protos.loyalizer;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.giftly.GiftCard;
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
public final class UiLoyaltyNotificationPreference extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiLoyaltyNotificationPreference> CREATOR;
    public final Boolean enabled;
    public final LocalizableString localizable_title;
    public final String title;

    static {
        UiLoyaltyNotificationPreference$Companion$ADAPTER$1 uiLoyaltyNotificationPreference$Companion$ADAPTER$1 = new UiLoyaltyNotificationPreference$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiLoyaltyNotificationPreference.class), "type.googleapis.com/squareup.loyalizer.UiLoyaltyNotificationPreference", Syntax.PROTO_2, null, "squareup/loyalizer/loyalty_profile.proto");
        ADAPTER = uiLoyaltyNotificationPreference$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiLoyaltyNotificationPreference$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiLoyaltyNotificationPreference(String str, Boolean bool, LocalizableString localizableString, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.enabled = bool;
        this.localizable_title = localizableString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiLoyaltyNotificationPreference)) {
            return false;
        }
        UiLoyaltyNotificationPreference uiLoyaltyNotificationPreference = (UiLoyaltyNotificationPreference) obj;
        return Intrinsics.areEqual(unknownFields(), uiLoyaltyNotificationPreference.unknownFields()) && Intrinsics.areEqual(this.title, uiLoyaltyNotificationPreference.title) && Intrinsics.areEqual(this.enabled, uiLoyaltyNotificationPreference.enabled) && Intrinsics.areEqual(this.localizable_title, uiLoyaltyNotificationPreference.localizable_title);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.enabled;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        LocalizableString localizableString = this.localizable_title;
        int hashCode4 = hashCode3 + (localizableString != null ? localizableString.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Options.Builder builder = new GiftCard.Options.Builder(25);
        builder.label = this.title;
        builder.client_scenario = this.enabled;
        builder.localizable_label = this.localizable_title;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        Boolean bool = this.enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
        }
        LocalizableString localizableString = this.localizable_title;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_title=", localizableString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiLoyaltyNotificationPreference{", "}", 0, null, null, 56);
    }
}
