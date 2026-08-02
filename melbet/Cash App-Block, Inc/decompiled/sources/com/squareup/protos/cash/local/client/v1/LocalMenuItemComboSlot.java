package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.document.DocumentEntity;
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
public final class LocalMenuItemComboSlot extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalMenuItemComboSlot> CREATOR;
    public final List available_item_tokens;
    public final List available_variation_tokens;
    public final String combo_category_token;
    public final String default_variation_token;
    public final String name;
    public final Integer num_selections;
    public final List price_adjustments;
    public final String token;

    static {
        LocalMenuItemComboSlot$Companion$ADAPTER$1 localMenuItemComboSlot$Companion$ADAPTER$1 = new LocalMenuItemComboSlot$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalMenuItemComboSlot.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalMenuItemComboSlot", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_menu.proto");
        ADAPTER = localMenuItemComboSlot$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localMenuItemComboSlot$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalMenuItemComboSlot(String str, String str2, String str3, List list, List list2, String str4, Integer num, List list3, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.token = str;
        this.name = str2;
        this.combo_category_token = str3;
        this.default_variation_token = str4;
        this.num_selections = num;
        this.available_item_tokens = TransactorKt.immutableCopyOf("available_item_tokens", list);
        this.available_variation_tokens = TransactorKt.immutableCopyOf("available_variation_tokens", list2);
        this.price_adjustments = TransactorKt.immutableCopyOf("price_adjustments", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalMenuItemComboSlot)) {
            return false;
        }
        LocalMenuItemComboSlot localMenuItemComboSlot = (LocalMenuItemComboSlot) obj;
        return Intrinsics.areEqual(unknownFields(), localMenuItemComboSlot.unknownFields()) && Intrinsics.areEqual(this.token, localMenuItemComboSlot.token) && Intrinsics.areEqual(this.name, localMenuItemComboSlot.name) && Intrinsics.areEqual(this.combo_category_token, localMenuItemComboSlot.combo_category_token) && Intrinsics.areEqual(this.available_item_tokens, localMenuItemComboSlot.available_item_tokens) && Intrinsics.areEqual(this.available_variation_tokens, localMenuItemComboSlot.available_variation_tokens) && Intrinsics.areEqual(this.default_variation_token, localMenuItemComboSlot.default_variation_token) && Intrinsics.areEqual(this.num_selections, localMenuItemComboSlot.num_selections) && Intrinsics.areEqual(this.price_adjustments, localMenuItemComboSlot.price_adjustments);
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
        String str3 = this.combo_category_token;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.available_item_tokens), 37, this.available_variation_tokens);
        String str4 = this.default_variation_token;
        int hashCode4 = (m + (str4 != null ? str4.hashCode() : 0)) * 37;
        Integer num = this.num_selections;
        int hashCode5 = this.price_adjustments.hashCode() + ((hashCode4 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DocumentEntity.Builder builder = new DocumentEntity.Builder(2, false);
        builder.category = this.token;
        builder.token = this.name;
        builder.title = this.combo_category_token;
        builder.url = this.available_item_tokens;
        builder.owner_token = this.available_variation_tokens;
        builder.client_route = this.default_variation_token;
        builder.version_data = this.num_selections;
        builder.localizable_title = this.price_adjustments;
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
        String str3 = this.combo_category_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "combo_category_token=", arrayList);
        }
        List list = this.available_item_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("available_item_tokens=", arrayList, list);
        }
        List list2 = this.available_variation_tokens;
        if (!list2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("available_variation_tokens=", arrayList, list2);
        }
        String str4 = this.default_variation_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "default_variation_token=", arrayList);
        }
        Integer num = this.num_selections;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("num_selections=", num, arrayList);
        }
        List list3 = this.price_adjustments;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("price_adjustments=", arrayList, list3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalMenuItemComboSlot{", "}", 0, null, null, 56);
    }
}
