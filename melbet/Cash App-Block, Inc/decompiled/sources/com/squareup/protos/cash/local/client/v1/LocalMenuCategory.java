package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.groups.ExpenseSlice;
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
public final class LocalMenuCategory extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalMenuCategory> CREATOR;
    public final String category_collection_token;
    public final LocalImage image;
    public final List item_tokens;
    public final LocalMenuHours menu_hours;
    public final String name;
    public final String token;

    static {
        LocalMenuCategory$Companion$ADAPTER$1 localMenuCategory$Companion$ADAPTER$1 = new LocalMenuCategory$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalMenuCategory.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalMenuCategory", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_menu.proto");
        ADAPTER = localMenuCategory$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localMenuCategory$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalMenuCategory(String str, String str2, LocalImage localImage, List list, String str3, LocalMenuHours localMenuHours, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.token = str;
        this.name = str2;
        this.image = localImage;
        this.category_collection_token = str3;
        this.menu_hours = localMenuHours;
        this.item_tokens = TransactorKt.immutableCopyOf("item_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalMenuCategory)) {
            return false;
        }
        LocalMenuCategory localMenuCategory = (LocalMenuCategory) obj;
        return Intrinsics.areEqual(unknownFields(), localMenuCategory.unknownFields()) && Intrinsics.areEqual(this.token, localMenuCategory.token) && Intrinsics.areEqual(this.name, localMenuCategory.name) && Intrinsics.areEqual(this.image, localMenuCategory.image) && Intrinsics.areEqual(this.item_tokens, localMenuCategory.item_tokens) && Intrinsics.areEqual(this.category_collection_token, localMenuCategory.category_collection_token) && Intrinsics.areEqual(this.menu_hours, localMenuCategory.menu_hours);
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
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalImage localImage = this.image;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (localImage != null ? localImage.hashCode() : 0)) * 37, 37, this.item_tokens);
        String str3 = this.category_collection_token;
        int hashCode4 = (m + (str3 != null ? str3.hashCode() : 0)) * 37;
        LocalMenuHours localMenuHours = this.menu_hours;
        int hashCode5 = hashCode4 + (localMenuHours != null ? localMenuHours.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ExpenseSlice.Builder builder = new ExpenseSlice.Builder(15);
        builder.slice_token = this.token;
        builder.requester = this.name;
        builder.responder = this.image;
        builder.amount = this.item_tokens;
        builder.status = this.category_collection_token;
        builder.action = this.menu_hours;
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
        LocalImage localImage = this.image;
        if (localImage != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", localImage, arrayList);
        }
        List list = this.item_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("item_tokens=", arrayList, list);
        }
        String str3 = this.category_collection_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "category_collection_token=", arrayList);
        }
        LocalMenuHours localMenuHours = this.menu_hours;
        if (localMenuHours != null) {
            arrayList.add("menu_hours=" + localMenuHours);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalMenuCategory{", "}", 0, null, null, 56);
    }
}
