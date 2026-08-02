package com.squareup.protos.loyalizer;

import android.os.Parcelable;
import com.squareup.protos.franklin.ui.UiCashLimits;
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
public final class LoyaltyProfile extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LoyaltyProfile> CREATOR;
    public final UiLoyaltyNotificationPreference notification_preference;

    static {
        LoyaltyProfile$Companion$ADAPTER$1 loyaltyProfile$Companion$ADAPTER$1 = new LoyaltyProfile$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LoyaltyProfile.class), "type.googleapis.com/squareup.loyalizer.LoyaltyProfile", Syntax.PROTO_2, null, "squareup/loyalizer/loyalty_profile.proto");
        ADAPTER = loyaltyProfile$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(loyaltyProfile$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyProfile(UiLoyaltyNotificationPreference uiLoyaltyNotificationPreference, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.notification_preference = uiLoyaltyNotificationPreference;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoyaltyProfile)) {
            return false;
        }
        LoyaltyProfile loyaltyProfile = (LoyaltyProfile) obj;
        return Intrinsics.areEqual(unknownFields(), loyaltyProfile.unknownFields()) && Intrinsics.areEqual(this.notification_preference, loyaltyProfile.notification_preference);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        UiLoyaltyNotificationPreference uiLoyaltyNotificationPreference = this.notification_preference;
        int hashCode2 = hashCode + (uiLoyaltyNotificationPreference != null ? uiLoyaltyNotificationPreference.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiCashLimits.Builder builder = new UiCashLimits.Builder(27);
        builder.cash_limit_group = this.notification_preference;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        UiLoyaltyNotificationPreference uiLoyaltyNotificationPreference = this.notification_preference;
        if (uiLoyaltyNotificationPreference != null) {
            arrayList.add("notification_preference=" + uiLoyaltyNotificationPreference);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LoyaltyProfile{", "}", 0, null, null, 56);
    }
}
