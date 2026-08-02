package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
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
public final class ImageFill extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ImageFill> CREATOR;
    public final String asset_url;
    public final com.squareup.protos.cash.ui.Image image_asset;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String asset_url;
        public com.squareup.protos.cash.ui.Image image_asset;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new ImageFill(this.image_asset, this.asset_url, buildUnknownFields());
                case 1:
                    return new GenericProfileElement.IconTextElement(this.image_asset, this.asset_url, buildUnknownFields());
                default:
                    return new ImageInset(this.image_asset, this.asset_url, buildUnknownFields());
            }
        }
    }

    static {
        ImageFill$Companion$ADAPTER$1 imageFill$Companion$ADAPTER$1 = new ImageFill$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ImageFill.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.ImageFill", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = imageFill$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(imageFill$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageFill(com.squareup.protos.cash.ui.Image image, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.asset_url = str;
        this.image_asset = image;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageFill)) {
            return false;
        }
        ImageFill imageFill = (ImageFill) obj;
        return Intrinsics.areEqual(unknownFields(), imageFill.unknownFields()) && Intrinsics.areEqual(this.asset_url, imageFill.asset_url) && Intrinsics.areEqual(this.image_asset, imageFill.image_asset);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.asset_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        com.squareup.protos.cash.ui.Image image = this.image_asset;
        int hashCode3 = hashCode2 + (image != null ? image.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.asset_url = this.asset_url;
        builder.image_asset = this.image_asset;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.asset_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "asset_url=", arrayList);
        }
        com.squareup.protos.cash.ui.Image image = this.image_asset;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image_asset=", image, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ImageFill{", "}", 0, null, null, 56);
    }
}
