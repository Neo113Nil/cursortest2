package com.squareup.protos.rewardly.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.blockstable.api.v1.Asset;
import com.squareup.protos.cash.blockstable.api.v1.Chain;
import com.squareup.protos.cash.cashface.api.SocialAccount;
import com.squareup.protos.cash.cashliteflow.api.v1.AvailableAsset;
import com.squareup.protos.cash.cashliteflow.api.v1.AvailableChain;
import com.squareup.protos.cash.cashliteflow.api.v1.WalletAddressAsset;
import com.squareup.protos.cash.cashliteflow.api.v1.WalletAddressChain;
import com.squareup.protos.cash.ui.Image;
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
public final class IconAsset extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<IconAsset> CREATOR;
    public final Image image;
    public final String name;
    public final String url;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Image image;
        public String name;
        public String url;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new IconAsset(this.name, this.url, this.image, buildUnknownFields());
                case 1:
                    return new Asset(this.name, this.url, this.image, buildUnknownFields());
                case 2:
                    return new Chain(this.name, this.url, this.image, buildUnknownFields());
                case 3:
                    return new SocialAccount(this.image, this.name, this.url, buildUnknownFields());
                case 4:
                    return new AvailableAsset(this.name, this.url, this.image, buildUnknownFields());
                case 5:
                    return new AvailableChain(this.name, this.url, this.image, buildUnknownFields());
                case 6:
                    return new WalletAddressAsset(this.name, this.url, this.image, buildUnknownFields());
                default:
                    return new WalletAddressChain(this.name, this.url, this.image, buildUnknownFields());
            }
        }
    }

    static {
        IconAsset$Companion$ADAPTER$1 iconAsset$Companion$ADAPTER$1 = new IconAsset$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(IconAsset.class), "type.googleapis.com/squareup.rewardly.ui.IconAsset", Syntax.PROTO_2, null, "squareup/rewardly/ui.proto");
        ADAPTER = iconAsset$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(iconAsset$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconAsset(String str, String str2, Image image, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.name = str;
        this.url = str2;
        this.image = image;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IconAsset)) {
            return false;
        }
        IconAsset iconAsset = (IconAsset) obj;
        return Intrinsics.areEqual(unknownFields(), iconAsset.unknownFields()) && Intrinsics.areEqual(this.name, iconAsset.name) && Intrinsics.areEqual(this.url, iconAsset.url) && Intrinsics.areEqual(this.image, iconAsset.image);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.url;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Image image = this.image;
        int hashCode4 = hashCode3 + (image != null ? image.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.name = this.name;
        builder.url = this.url;
        builder.image = this.image;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        String str2 = this.url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "url=", arrayList);
        }
        Image image = this.image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IconAsset{", "}", 0, null, null, 56);
    }
}
