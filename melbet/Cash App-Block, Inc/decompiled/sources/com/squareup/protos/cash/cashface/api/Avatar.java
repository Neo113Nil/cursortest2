package com.squareup.protos.cash.cashface.api;

import android.os.Parcelable;
import com.squareup.protos.cash.discover.api.app.v1.model.CaptionSection;
import com.squareup.protos.cash.messagingplatformcommon.app.AnimationFill;
import com.squareup.protos.cash.messagingplatformcommon.app.AnimationInset;
import com.squareup.protos.cash.shop.rendering.api.CategoryTileSection;
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

/* loaded from: classes7.dex */
public final class Avatar extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Avatar> CREATOR;
    public final Image photo;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Image photo;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Avatar(this.photo, buildUnknownFields());
                case 1:
                    return new CaptionSection(this.photo, buildUnknownFields());
                case 2:
                    return new AnimationFill(this.photo, buildUnknownFields());
                case 3:
                    return new AnimationInset(this.photo, buildUnknownFields());
                default:
                    return new CategoryTileSection.CategoryTile.ImageStyle(this.photo, buildUnknownFields());
            }
        }
    }

    static {
        Avatar$Companion$ADAPTER$1 avatar$Companion$ADAPTER$1 = new Avatar$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Avatar.class), "type.googleapis.com/squareup.cash.cashface.api.Avatar", Syntax.PROTO_2, null, "squareup/cash/cashface/api/CommerceProfileData.proto");
        ADAPTER = avatar$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(avatar$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Avatar(Image image, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.photo = image;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Avatar)) {
            return false;
        }
        Avatar avatar = (Avatar) obj;
        return Intrinsics.areEqual(unknownFields(), avatar.unknownFields()) && Intrinsics.areEqual(this.photo, avatar.photo);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Image image = this.photo;
        int hashCode2 = hashCode + (image != null ? image.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.photo = this.photo;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.photo != null) {
            arrayList.add("photo=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Avatar{", "}", 0, null, null, 56);
    }
}
