package com.squareup.protos.cash.cashliteflow.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.rewardly.ui.IconAsset;
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
public final class AvailableAsset extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AvailableAsset> CREATOR;
    public final String asset;
    public final String display_name;
    public final Image icon;

    static {
        AvailableAsset$Companion$ADAPTER$1 availableAsset$Companion$ADAPTER$1 = new AvailableAsset$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvailableAsset.class), "type.googleapis.com/squareup.cash.cashliteflow.api.v1beta1.AvailableAsset", Syntax.PROTO_2, null, "squareup/cash/cashliteflow/api/v1beta1/available_networks_messages.proto");
        ADAPTER = availableAsset$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(availableAsset$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvailableAsset(String str, String str2, Image image, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.asset = str;
        this.display_name = str2;
        this.icon = image;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvailableAsset)) {
            return false;
        }
        AvailableAsset availableAsset = (AvailableAsset) obj;
        return Intrinsics.areEqual(unknownFields(), availableAsset.unknownFields()) && Intrinsics.areEqual(this.asset, availableAsset.asset) && Intrinsics.areEqual(this.display_name, availableAsset.display_name) && Intrinsics.areEqual(this.icon, availableAsset.icon);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.asset;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.display_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Image image = this.icon;
        int hashCode4 = hashCode3 + (image != null ? image.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        IconAsset.Builder builder = new IconAsset.Builder(4);
        builder.name = this.asset;
        builder.url = this.display_name;
        builder.image = this.icon;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.asset;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "asset=", arrayList);
        }
        String str2 = this.display_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "display_name=", arrayList);
        }
        Image image = this.icon;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AvailableAsset{", "}", 0, null, null, 56);
    }
}
