package com.squareup.protos.timecards;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.EasingCurve;

/* loaded from: classes8.dex */
public final class GetClockinEssentialsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetClockinEssentialsRequest> CREATOR;

    static {
        GetClockinEssentialsRequest$Companion$ADAPTER$1 getClockinEssentialsRequest$Companion$ADAPTER$1 = new GetClockinEssentialsRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetClockinEssentialsRequest.class), "type.googleapis.com/squareup.timecards.GetClockinEssentialsRequest", Syntax.PROTO_2, null, "squareup/timecards/timecards_service.proto");
        ADAPTER = getClockinEssentialsRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getClockinEssentialsRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetClockinEssentialsRequest(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetClockinEssentialsRequest) && Intrinsics.areEqual(unknownFields(), ((GetClockinEssentialsRequest) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EasingCurve.EaseIn.Builder builder = new EasingCurve.EaseIn.Builder(8);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "GetClockinEssentialsRequest{}";
    }
}
