package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
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
public final class AnimationFixed extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AnimationFixed> CREATOR;
    public final Integer height;
    public final com.squareup.protos.cash.ui.Image lottie_asset;
    public final Integer width;

    static {
        AnimationFixed$Companion$ADAPTER$1 animationFixed$Companion$ADAPTER$1 = new AnimationFixed$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AnimationFixed.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.AnimationFixed", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = animationFixed$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(animationFixed$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimationFixed(com.squareup.protos.cash.ui.Image image, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.lottie_asset = image;
        this.width = num;
        this.height = num2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnimationFixed)) {
            return false;
        }
        AnimationFixed animationFixed = (AnimationFixed) obj;
        return Intrinsics.areEqual(unknownFields(), animationFixed.unknownFields()) && Intrinsics.areEqual(this.lottie_asset, animationFixed.lottie_asset) && Intrinsics.areEqual(this.width, animationFixed.width) && Intrinsics.areEqual(this.height, animationFixed.height);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        com.squareup.protos.cash.ui.Image image = this.lottie_asset;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
        Integer num = this.width;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.height;
        int hashCode4 = hashCode3 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BLEPayload.Builder builder = new BLEPayload.Builder(11, false);
        builder.advertisement_data = this.lottie_asset;
        builder.transmission_level = this.width;
        builder.frequency = this.height;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        com.squareup.protos.cash.ui.Image image = this.lottie_asset;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("lottie_asset=", image, arrayList);
        }
        Integer num = this.width;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("width=", num, arrayList);
        }
        Integer num2 = this.height;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("height=", num2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AnimationFixed{", "}", 0, null, null, 56);
    }
}
