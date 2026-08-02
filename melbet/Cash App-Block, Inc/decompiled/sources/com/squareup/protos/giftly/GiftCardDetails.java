package com.squareup.protos.giftly;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.sync_values.LinkText;
import com.squareup.protos.cash.aegis.sync_values.SendCashCta;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.common.CashAppTagRenderData;
import com.squareup.protos.lending.sync_values.LendingInfo;
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
public final class GiftCardDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GiftCardDetails> CREATOR;
    public final String icon;
    public final LocalizableString localizable_note;
    public final String note;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String icon;
        public LocalizableString localizable_note;
        public String note;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new GiftCardDetails(this.icon, this.note, this.localizable_note, buildUnknownFields());
                case 1:
                    return new LinkText(this.icon, this.note, this.localizable_note, buildUnknownFields());
                case 2:
                    return new SendCashCta(this.icon, this.note, this.localizable_note, buildUnknownFields());
                case 3:
                    return new CashAppTagRenderData(this.icon, this.note, this.localizable_note, buildUnknownFields());
                default:
                    return new LendingInfo.FirstTimeBorrowData.HomeScreen.BulletContent.SupportData(this.icon, this.note, this.localizable_note, buildUnknownFields());
            }
        }
    }

    static {
        GiftCardDetails$Companion$ADAPTER$1 giftCardDetails$Companion$ADAPTER$1 = new GiftCardDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GiftCardDetails.class), "type.googleapis.com/squareup.giftly.GiftCardDetails", Syntax.PROTO_2, null, "squareup/giftly/gift_card.proto");
        ADAPTER = giftCardDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(giftCardDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftCardDetails(String str, String str2, LocalizableString localizableString, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.icon = str;
        this.note = str2;
        this.localizable_note = localizableString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftCardDetails)) {
            return false;
        }
        GiftCardDetails giftCardDetails = (GiftCardDetails) obj;
        return Intrinsics.areEqual(unknownFields(), giftCardDetails.unknownFields()) && Intrinsics.areEqual(this.icon, giftCardDetails.icon) && Intrinsics.areEqual(this.note, giftCardDetails.note) && Intrinsics.areEqual(this.localizable_note, giftCardDetails.localizable_note);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.icon;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.note;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_note;
        int hashCode4 = hashCode3 + (localizableString != null ? localizableString.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.icon = this.icon;
        builder.note = this.note;
        builder.localizable_note = this.localizable_note;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.icon;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "icon=", arrayList);
        }
        String str2 = this.note;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "note=", arrayList);
        }
        LocalizableString localizableString = this.localizable_note;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_note=", localizableString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GiftCardDetails{", "}", 0, null, null, 56);
    }
}
