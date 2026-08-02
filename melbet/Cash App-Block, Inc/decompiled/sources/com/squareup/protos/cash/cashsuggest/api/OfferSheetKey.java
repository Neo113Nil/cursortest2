package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import app.cash.redwood.widget.ComposeHelpersKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashregistrar.Account;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.shop.rendering.api.OfferType;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes.dex */
public final class OfferSheetKey extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OfferSheetKey> CREATOR;
    public final Boolean from_iab;
    public final ComposeHelpersKt identifier_token;
    public final OfferType offer_type;
    public final PresentingContext presenting_context;
    public final SheetType sheet_type;

    /* loaded from: classes7.dex */
    public enum PresentingContext implements WireEnum {
        DEFAULT(0),
        OFFERS_BROWSE(1),
        OFFERS_SEARCH(2),
        MERCHANT_PROFILE(3),
        DISCOVER(4),
        IN_APP_BROWSER(5),
        CARD_TAB(6),
        ACTIVITY_TAB(7),
        AP_APPLET_BROWSE(9),
        AP_APPLET_SEARCH(10);

        public static final OfferSheetKey$PresentingContext$Companion$ADAPTER$1 ADAPTER;
        public static final Alignment.Companion Companion;
        public final int value;

        static {
            PresentingContext presentingContext = DEFAULT;
            Companion = new Alignment.Companion();
            ADAPTER = new OfferSheetKey$PresentingContext$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PresentingContext.class), Syntax.PROTO_2, presentingContext);
        }

        PresentingContext(int i) {
            this.value = i;
        }

        public static final PresentingContext fromValue(int i) {
            Companion.getClass();
            return Alignment.Companion.m3858fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        OfferSheetKey$Companion$ADAPTER$1 offerSheetKey$Companion$ADAPTER$1 = new OfferSheetKey$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OfferSheetKey.class), "type.googleapis.com/squareup.cash.cashsuggest.api.OfferSheetKey", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/OffersSheet.proto");
        ADAPTER = offerSheetKey$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(offerSheetKey$Companion$ADAPTER$1);
    }

    public /* synthetic */ OfferSheetKey(SheetType sheetType, OfferType offerType, ComposeHelpersKt composeHelpersKt, int i) {
        this(sheetType, offerType, composeHelpersKt, (i & 8) != 0 ? null : PresentingContext.IN_APP_BROWSER, null, ByteString.EMPTY);
    }

    public static OfferSheetKey copy$default(OfferSheetKey offerSheetKey, PresentingContext presentingContext, ByteString byteString, int i) {
        SheetType sheetType = offerSheetKey.sheet_type;
        OfferType offerType = offerSheetKey.offer_type;
        ComposeHelpersKt composeHelpersKt = offerSheetKey.identifier_token;
        if ((i & 8) != 0) {
            presentingContext = offerSheetKey.presenting_context;
        }
        PresentingContext presentingContext2 = presentingContext;
        Boolean bool = offerSheetKey.from_iab;
        if ((i & 32) != 0) {
            byteString = offerSheetKey.unknownFields();
        }
        ByteString byteString2 = byteString;
        offerSheetKey.getClass();
        byteString2.getClass();
        return new OfferSheetKey(sheetType, offerType, composeHelpersKt, presentingContext2, bool, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfferSheetKey)) {
            return false;
        }
        OfferSheetKey offerSheetKey = (OfferSheetKey) obj;
        return Intrinsics.areEqual(unknownFields(), offerSheetKey.unknownFields()) && this.sheet_type == offerSheetKey.sheet_type && this.offer_type == offerSheetKey.offer_type && Intrinsics.areEqual(this.identifier_token, offerSheetKey.identifier_token) && this.presenting_context == offerSheetKey.presenting_context && Intrinsics.areEqual(this.from_iab, offerSheetKey.from_iab);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SheetType sheetType = this.sheet_type;
        int hashCode2 = (hashCode + (sheetType != null ? sheetType.hashCode() : 0)) * 37;
        OfferType offerType = this.offer_type;
        int hashCode3 = (hashCode2 + (offerType != null ? offerType.hashCode() : 0)) * 37;
        ComposeHelpersKt composeHelpersKt = this.identifier_token;
        int hashCode4 = (hashCode3 + (composeHelpersKt != null ? composeHelpersKt.hashCode() : 0)) * 37;
        PresentingContext presentingContext = this.presenting_context;
        int hashCode5 = (hashCode4 + (presentingContext != null ? presentingContext.hashCode() : 0)) * 37;
        Boolean bool = this.from_iab;
        int hashCode6 = hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Account.Builder builder = new Account.Builder(23, false);
        builder.customer_token = this.sheet_type;
        builder.account_token = this.offer_type;
        builder.display_name = this.identifier_token;
        builder.account_type = this.presenting_context;
        builder.is_sponsored_account = this.from_iab;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SheetType sheetType = this.sheet_type;
        if (sheetType != null) {
            arrayList.add("sheet_type=" + sheetType);
        }
        OfferType offerType = this.offer_type;
        if (offerType != null) {
            arrayList.add("offer_type=" + offerType);
        }
        ComposeHelpersKt composeHelpersKt = this.identifier_token;
        if (composeHelpersKt != null) {
            arrayList.add("identifier_token=" + composeHelpersKt);
        }
        PresentingContext presentingContext = this.presenting_context;
        if (presentingContext != null) {
            arrayList.add("presenting_context=" + presentingContext);
        }
        Boolean bool = this.from_iab;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("from_iab=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OfferSheetKey{", "}", 0, null, null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferSheetKey(SheetType sheetType, OfferType offerType, ComposeHelpersKt composeHelpersKt, PresentingContext presentingContext, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.sheet_type = sheetType;
        this.offer_type = offerType;
        this.identifier_token = composeHelpersKt;
        this.presenting_context = presentingContext;
        this.from_iab = bool;
    }
}
