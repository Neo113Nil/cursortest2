package com.squareup.protos.cash.aegis.client_routes;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.PoolOwner;
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
public final class DependentDetailsEntryDialog extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DependentDetailsEntryDialog> CREATOR;
    public final String dark_img_url;
    public final String light_img_url;
    public final String subtitle;
    public final String title;

    static {
        DependentDetailsEntryDialog$Companion$ADAPTER$1 dependentDetailsEntryDialog$Companion$ADAPTER$1 = new DependentDetailsEntryDialog$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DependentDetailsEntryDialog.class), "type.googleapis.com/squareup.cash.aegis.client_routes.DependentDetailsEntryDialog", Syntax.PROTO_2, null, "squareup/cash/aegis/client_routes/parameters.proto");
        ADAPTER = dependentDetailsEntryDialog$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(dependentDetailsEntryDialog$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DependentDetailsEntryDialog(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.subtitle = str2;
        this.light_img_url = str3;
        this.dark_img_url = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DependentDetailsEntryDialog)) {
            return false;
        }
        DependentDetailsEntryDialog dependentDetailsEntryDialog = (DependentDetailsEntryDialog) obj;
        return Intrinsics.areEqual(unknownFields(), dependentDetailsEntryDialog.unknownFields()) && Intrinsics.areEqual(this.title, dependentDetailsEntryDialog.title) && Intrinsics.areEqual(this.subtitle, dependentDetailsEntryDialog.subtitle) && Intrinsics.areEqual(this.light_img_url, dependentDetailsEntryDialog.light_img_url) && Intrinsics.areEqual(this.dark_img_url, dependentDetailsEntryDialog.dark_img_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.light_img_url;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.dark_img_url;
        int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolOwner.Builder builder = new PoolOwner.Builder(2);
        builder.customer_token = this.title;
        builder.full_name = this.subtitle;
        builder.profile_photo_url = this.light_img_url;
        builder.cashtag = this.dark_img_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.title != null) {
            arrayList.add("title=██");
        }
        if (this.subtitle != null) {
            arrayList.add("subtitle=██");
        }
        String str = this.light_img_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "light_img_url=", arrayList);
        }
        String str2 = this.dark_img_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "dark_img_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DependentDetailsEntryDialog{", "}", 0, null, null, 56);
    }
}
