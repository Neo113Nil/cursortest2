package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
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
public final class StaffBrandDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StaffBrandDetails> CREATOR;
    public final LocalImage artwork_image;
    public final LocalColor background_color;
    public final LocalColor brand_card_outline_color;
    public final LocalColor foreground_color;

    static {
        StaffBrandDetails$Companion$ADAPTER$1 staffBrandDetails$Companion$ADAPTER$1 = new StaffBrandDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StaffBrandDetails.class), "type.googleapis.com/squareup.cash.local.client.app.v1.StaffBrandDetails", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/staff_brand_details.proto");
        ADAPTER = staffBrandDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(staffBrandDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaffBrandDetails(LocalColor localColor, LocalColor localColor2, LocalImage localImage, LocalColor localColor3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.foreground_color = localColor;
        this.background_color = localColor2;
        this.artwork_image = localImage;
        this.brand_card_outline_color = localColor3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StaffBrandDetails)) {
            return false;
        }
        StaffBrandDetails staffBrandDetails = (StaffBrandDetails) obj;
        return Intrinsics.areEqual(unknownFields(), staffBrandDetails.unknownFields()) && Intrinsics.areEqual(this.foreground_color, staffBrandDetails.foreground_color) && Intrinsics.areEqual(this.background_color, staffBrandDetails.background_color) && Intrinsics.areEqual(this.artwork_image, staffBrandDetails.artwork_image) && Intrinsics.areEqual(this.brand_card_outline_color, staffBrandDetails.brand_card_outline_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalColor localColor = this.foreground_color;
        int hashCode2 = (hashCode + (localColor != null ? localColor.hashCode() : 0)) * 37;
        LocalColor localColor2 = this.background_color;
        int hashCode3 = (hashCode2 + (localColor2 != null ? localColor2.hashCode() : 0)) * 37;
        LocalImage localImage = this.artwork_image;
        int hashCode4 = (hashCode3 + (localImage != null ? localImage.hashCode() : 0)) * 37;
        LocalColor localColor3 = this.brand_card_outline_color;
        int hashCode5 = hashCode4 + (localColor3 != null ? localColor3.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.CardPii.Builder builder = new Card.CardPii.Builder(28, false);
        builder.postal_code = this.foreground_color;
        builder.last_four_digits = this.background_color;
        builder.expiration = this.artwork_image;
        builder.ciphertext_ = this.brand_card_outline_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalColor localColor = this.foreground_color;
        if (localColor != null) {
            SizeMode$EnumUnboxingLocalUtility.m("foreground_color=", localColor, arrayList);
        }
        LocalColor localColor2 = this.background_color;
        if (localColor2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("background_color=", localColor2, arrayList);
        }
        LocalImage localImage = this.artwork_image;
        if (localImage != null) {
            SizeMode$EnumUnboxingLocalUtility.m("artwork_image=", localImage, arrayList);
        }
        LocalColor localColor3 = this.brand_card_outline_color;
        if (localColor3 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("brand_card_outline_color=", localColor3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StaffBrandDetails{", "}", 0, null, null, 56);
    }
}
