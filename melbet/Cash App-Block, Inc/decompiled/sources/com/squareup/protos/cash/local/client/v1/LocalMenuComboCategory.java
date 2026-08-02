package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.GiftCard;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalMenuComboCategory extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalMenuComboCategory> CREATOR;
    public final LocalImage image;
    public final List item_tokens;
    public final String name;
    public final String token;

    static {
        LocalMenuComboCategory$Companion$ADAPTER$1 localMenuComboCategory$Companion$ADAPTER$1 = new LocalMenuComboCategory$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalMenuComboCategory.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalMenuComboCategory", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_menu.proto");
        ADAPTER = localMenuComboCategory$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localMenuComboCategory$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalMenuComboCategory(String str, String str2, List list, LocalImage localImage, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.token = str;
        this.name = str2;
        this.image = localImage;
        this.item_tokens = TransactorKt.immutableCopyOf("item_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalMenuComboCategory)) {
            return false;
        }
        LocalMenuComboCategory localMenuComboCategory = (LocalMenuComboCategory) obj;
        return Intrinsics.areEqual(unknownFields(), localMenuComboCategory.unknownFields()) && Intrinsics.areEqual(this.token, localMenuComboCategory.token) && Intrinsics.areEqual(this.name, localMenuComboCategory.name) && Intrinsics.areEqual(this.item_tokens, localMenuComboCategory.item_tokens) && Intrinsics.areEqual(this.image, localMenuComboCategory.image);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.item_tokens);
        LocalImage localImage = this.image;
        int hashCode3 = m + (localImage != null ? localImage.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Builder builder = new GiftCard.Builder(9, false);
        builder.id = this.token;
        builder.last_4 = this.name;
        builder.gift_card_id = this.item_tokens;
        builder.gift_card_amount = this.image;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "name=", arrayList);
        }
        List list = this.item_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("item_tokens=", arrayList, list);
        }
        LocalImage localImage = this.image;
        if (localImage != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", localImage, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalMenuComboCategory{", "}", 0, null, null, 56);
    }
}
