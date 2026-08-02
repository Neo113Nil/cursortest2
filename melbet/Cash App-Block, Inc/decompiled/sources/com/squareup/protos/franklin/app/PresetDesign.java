package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.lending.OpaqueRoute;
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
public final class PresetDesign extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PresetDesign> CREATOR;
    public final String token;

    static {
        PresetDesign$Companion$ADAPTER$1 presetDesign$Companion$ADAPTER$1 = new PresetDesign$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PresetDesign.class), "type.googleapis.com/squareup.franklin.app.PresetDesign", Syntax.PROTO_2, null, "squareup/franklin/app/payment_device_customization.proto");
        ADAPTER = presetDesign$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(presetDesign$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresetDesign(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PresetDesign)) {
            return false;
        }
        PresetDesign presetDesign = (PresetDesign) obj;
        return Intrinsics.areEqual(unknownFields(), presetDesign.unknownFields()) && Intrinsics.areEqual(this.token, presetDesign.token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        OpaqueRoute.Builder builder = new OpaqueRoute.Builder(11);
        builder.client_route = this.token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PresetDesign{", "}", 0, null, null, 56);
    }
}
