package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashface.api.Avatar;
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
public final class AnimationInset extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AnimationInset> CREATOR;
    public final com.squareup.protos.cash.ui.Image lottie_asset;

    static {
        AnimationInset$Companion$ADAPTER$1 animationInset$Companion$ADAPTER$1 = new AnimationInset$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AnimationInset.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.AnimationInset", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = animationInset$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(animationInset$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimationInset(com.squareup.protos.cash.ui.Image image, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.lottie_asset = image;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnimationInset)) {
            return false;
        }
        AnimationInset animationInset = (AnimationInset) obj;
        return Intrinsics.areEqual(unknownFields(), animationInset.unknownFields()) && Intrinsics.areEqual(this.lottie_asset, animationInset.lottie_asset);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        com.squareup.protos.cash.ui.Image image = this.lottie_asset;
        int hashCode2 = hashCode + (image != null ? image.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Avatar.Builder builder = new Avatar.Builder(3);
        builder.photo = this.lottie_asset;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        com.squareup.protos.cash.ui.Image image = this.lottie_asset;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("lottie_asset=", image, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AnimationInset{", "}", 0, null, null, 56);
    }
}
