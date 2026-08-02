package com.squareup.protos.cash.cashinstrumentstore.api.v1.cards.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.security.mri.api.v1.Identifiers;
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
public final class CardDetailsProto$DisplaySettings extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CardDetailsProto$DisplaySettings> CREATOR;
    public final String cardArtUrl;
    public final String cardSymbolUrl;
    public final String colorCardProductLogoUrl;
    public final String displayName;
    public final String displayPanSuffix;
    public final String monochromeCardProductLogoUrl;

    static {
        CardDetailsProto$DisplaySettings$Companion$ADAPTER$1 cardDetailsProto$DisplaySettings$Companion$ADAPTER$1 = new CardDetailsProto$DisplaySettings$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CardDetailsProto$DisplaySettings.class), "type.googleapis.com/squareup.cash.cashinstrumentstore.api.v1.cards.common.CardDetailsProto.DisplaySettings", Syntax.PROTO_2, null, "squareup/cash/cashinstrumentstore/api/v1/cards/common/card_details.proto");
        ADAPTER = cardDetailsProto$DisplaySettings$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cardDetailsProto$DisplaySettings$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetailsProto$DisplaySettings(String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.monochromeCardProductLogoUrl = str;
        this.colorCardProductLogoUrl = str2;
        this.displayPanSuffix = str3;
        this.displayName = str4;
        this.cardArtUrl = str5;
        this.cardSymbolUrl = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardDetailsProto$DisplaySettings)) {
            return false;
        }
        CardDetailsProto$DisplaySettings cardDetailsProto$DisplaySettings = (CardDetailsProto$DisplaySettings) obj;
        return Intrinsics.areEqual(unknownFields(), cardDetailsProto$DisplaySettings.unknownFields()) && Intrinsics.areEqual(this.monochromeCardProductLogoUrl, cardDetailsProto$DisplaySettings.monochromeCardProductLogoUrl) && Intrinsics.areEqual(this.colorCardProductLogoUrl, cardDetailsProto$DisplaySettings.colorCardProductLogoUrl) && Intrinsics.areEqual(this.displayPanSuffix, cardDetailsProto$DisplaySettings.displayPanSuffix) && Intrinsics.areEqual(this.displayName, cardDetailsProto$DisplaySettings.displayName) && Intrinsics.areEqual(this.cardArtUrl, cardDetailsProto$DisplaySettings.cardArtUrl) && Intrinsics.areEqual(this.cardSymbolUrl, cardDetailsProto$DisplaySettings.cardSymbolUrl);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.monochromeCardProductLogoUrl;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.colorCardProductLogoUrl;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.displayPanSuffix;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.displayName;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.cardArtUrl;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.cardSymbolUrl;
        int hashCode7 = hashCode6 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Identifiers.Builder builder = new Identifiers.Builder(2);
        builder.operating_system = this.monochromeCardProductLogoUrl;
        builder.operating_system_version = this.colorCardProductLogoUrl;
        builder.app_version = this.displayPanSuffix;
        builder.app_token = this.displayName;
        builder.device_id = this.cardArtUrl;
        builder.vendor_id = this.cardSymbolUrl;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.monochromeCardProductLogoUrl;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "monochromeCardProductLogoUrl=", arrayList);
        }
        String str2 = this.colorCardProductLogoUrl;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "colorCardProductLogoUrl=", arrayList);
        }
        String str3 = this.displayPanSuffix;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "displayPanSuffix=", arrayList);
        }
        String str4 = this.displayName;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "displayName=", arrayList);
        }
        String str5 = this.cardArtUrl;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "cardArtUrl=", arrayList);
        }
        String str6 = this.cardSymbolUrl;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "cardSymbolUrl=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DisplaySettings{", "}", 0, null, null, 56);
    }
}
