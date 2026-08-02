package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzjs;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
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

/* loaded from: classes.dex */
public final class Image extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Image> CREATOR;
    public final zzjs message;

    static {
        Image$Companion$ADAPTER$1 image$Companion$ADAPTER$1 = new Image$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Image.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.Image", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = image$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(image$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Image(zzjs zzjsVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.message = zzjsVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        Image image = (Image) obj;
        return Intrinsics.areEqual(unknownFields(), image.unknownFields()) && Intrinsics.areEqual(this.message, image.message);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzjs zzjsVar = this.message;
        int hashCode2 = hashCode + (zzjsVar != null ? zzjsVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LocalBuyer.Builder builder = new LocalBuyer.Builder(20);
        builder.local_buyer = this.message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzjs zzjsVar = this.message;
        if (zzjsVar != null) {
            arrayList.add("message=" + zzjsVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Image{", "}", 0, null, null, 56);
    }
}
