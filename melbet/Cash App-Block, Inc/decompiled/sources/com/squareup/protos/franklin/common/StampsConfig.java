package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Headers;
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

/* loaded from: classes8.dex */
public final class StampsConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StampsConfig> CREATOR;
    public final List stamps;

    static {
        StampsConfig$Companion$ADAPTER$1 stampsConfig$Companion$ADAPTER$1 = new StampsConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StampsConfig.class), "type.googleapis.com/squareup.franklin.common.StampsConfig", Syntax.PROTO_2, null, "squareup/franklin/common/stamp.proto");
        ADAPTER = stampsConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(stampsConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StampsConfig(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.stamps = TransactorKt.immutableCopyOf("stamps", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StampsConfig)) {
            return false;
        }
        StampsConfig stampsConfig = (StampsConfig) obj;
        return Intrinsics.areEqual(unknownFields(), stampsConfig.unknownFields()) && Intrinsics.areEqual(this.stamps, stampsConfig.stamps);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.stamps.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Headers.Builder builder = new Headers.Builder(27, false);
        builder.header = this.stamps;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.stamps;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("stamps=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StampsConfig{", "}", 0, null, null, 56);
    }
}
