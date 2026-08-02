package com.squareup.protos.cash.local.client.app.v1.account;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.protos.cash.pools.PoolParticipant;
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

/* loaded from: classes7.dex */
public final class LocalEarningCard extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalEarningCard> CREATOR;
    public final String byline_display_text;
    public final LocalImage card_image;
    public final String id;
    public final String primary_display_text;
    public final String secondary_display_text;
    public final Source source;
    public final EarningState state;

    public enum EarningState implements WireEnum {
        EARNING_STATE_UNSPECIFIED(0),
        EARNING_STATE_ENABLED_FOR_EARNING(1),
        EARNING_STATE_DISABLED_FOR_EARNING(2);

        public static final LocalEarningCard$EarningState$Companion$ADAPTER$1 ADAPTER;
        public static final SliceStatus.Companion Companion;
        public final int value;

        static {
            EarningState earningState = EARNING_STATE_UNSPECIFIED;
            Companion = new SliceStatus.Companion();
            ADAPTER = new LocalEarningCard$EarningState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(EarningState.class), Syntax.PROTO_2, earningState);
        }

        EarningState(int i) {
            this.value = i;
        }

        public static final EarningState fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return EARNING_STATE_UNSPECIFIED;
            }
            if (i == 1) {
                return EARNING_STATE_ENABLED_FOR_EARNING;
            }
            if (i != 2) {
                return null;
            }
            return EARNING_STATE_DISABLED_FOR_EARNING;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum Source implements WireEnum {
        SOURCE_UNSPECIFIED(0),
        SOURCE_LINKED_IN_STORE(1),
        SOURCE_CASH_APP_WALLET(2);

        public static final LocalEarningCard$Source$Companion$ADAPTER$1 ADAPTER;
        public static final FeeType.Companion Companion;
        public final int value;

        static {
            Source source = SOURCE_UNSPECIFIED;
            Companion = new FeeType.Companion();
            ADAPTER = new LocalEarningCard$Source$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Source.class), Syntax.PROTO_2, source);
        }

        Source(int i) {
            this.value = i;
        }

        public static final Source fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return SOURCE_UNSPECIFIED;
            }
            if (i == 1) {
                return SOURCE_LINKED_IN_STORE;
            }
            if (i != 2) {
                return null;
            }
            return SOURCE_CASH_APP_WALLET;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        LocalEarningCard$Companion$ADAPTER$1 localEarningCard$Companion$ADAPTER$1 = new LocalEarningCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalEarningCard.class), "type.googleapis.com/squareup.cash.local.client.app.v1.account.LocalEarningCard", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/account/earning_card.proto");
        ADAPTER = localEarningCard$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localEarningCard$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalEarningCard(String str, String str2, String str3, LocalImage localImage, EarningState earningState, Source source, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.primary_display_text = str;
        this.secondary_display_text = str2;
        this.byline_display_text = str3;
        this.card_image = localImage;
        this.state = earningState;
        this.source = source;
        this.id = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalEarningCard)) {
            return false;
        }
        LocalEarningCard localEarningCard = (LocalEarningCard) obj;
        return Intrinsics.areEqual(unknownFields(), localEarningCard.unknownFields()) && Intrinsics.areEqual(this.primary_display_text, localEarningCard.primary_display_text) && Intrinsics.areEqual(this.secondary_display_text, localEarningCard.secondary_display_text) && Intrinsics.areEqual(this.byline_display_text, localEarningCard.byline_display_text) && Intrinsics.areEqual(this.card_image, localEarningCard.card_image) && this.state == localEarningCard.state && this.source == localEarningCard.source && Intrinsics.areEqual(this.id, localEarningCard.id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.primary_display_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.secondary_display_text;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.byline_display_text;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        LocalImage localImage = this.card_image;
        int hashCode5 = (hashCode4 + (localImage != null ? localImage.hashCode() : 0)) * 37;
        EarningState earningState = this.state;
        int hashCode6 = (hashCode5 + (earningState != null ? earningState.hashCode() : 0)) * 37;
        Source source = this.source;
        int hashCode7 = (hashCode6 + (source != null ? source.hashCode() : 0)) * 37;
        String str4 = this.id;
        int hashCode8 = hashCode7 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolParticipant.Builder builder = new PoolParticipant.Builder(2);
        builder.customer_identifier = this.primary_display_text;
        builder.full_name = this.secondary_display_text;
        builder.profile_photo_url = this.byline_display_text;
        builder.added_at = this.card_image;
        builder.participant_type = this.state;
        builder.aggregated_contribution_amount = this.source;
        builder.cashtag = this.id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.primary_display_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "primary_display_text=", arrayList);
        }
        String str2 = this.secondary_display_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "secondary_display_text=", arrayList);
        }
        String str3 = this.byline_display_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "byline_display_text=", arrayList);
        }
        LocalImage localImage = this.card_image;
        if (localImage != null) {
            SizeMode$EnumUnboxingLocalUtility.m("card_image=", localImage, arrayList);
        }
        EarningState earningState = this.state;
        if (earningState != null) {
            arrayList.add("state=" + earningState);
        }
        Source source = this.source;
        if (source != null) {
            arrayList.add("source=" + source);
        }
        String str4 = this.id;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalEarningCard{", "}", 0, null, null, 56);
    }
}
