package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzjm;
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
public final class Animation extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Animation> CREATOR;
    public final zzjm message;

    static {
        Animation$Companion$ADAPTER$1 animation$Companion$ADAPTER$1 = new Animation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Animation.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.Animation", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = animation$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(animation$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animation(zzjm zzjmVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.message = zzjmVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Animation)) {
            return false;
        }
        Animation animation = (Animation) obj;
        return Intrinsics.areEqual(unknownFields(), animation.unknownFields()) && Intrinsics.areEqual(this.message, animation.message);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzjm zzjmVar = this.message;
        int hashCode2 = hashCode + (zzjmVar != null ? zzjmVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LocalBuyer.Builder builder = new LocalBuyer.Builder(16);
        builder.local_buyer = this.message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzjm zzjmVar = this.message;
        if (zzjmVar != null) {
            arrayList.add("message=" + zzjmVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Animation{", "}", 0, null, null, 56);
    }
}
