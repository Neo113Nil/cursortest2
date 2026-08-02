package com.squareup.protos.cash.cashface.api;

import android.os.Parcelable;
import com.squareup.protos.cash.cashapproxy.api.Divider;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ActivityClassic extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActivityClassic> CREATOR;

    static {
        ActivityClassic$Companion$ADAPTER$1 activityClassic$Companion$ADAPTER$1 = new ActivityClassic$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivityClassic.class), "type.googleapis.com/squareup.cash.cashface.api.ActivityClassic", Syntax.PROTO_2, null, "squareup/cash/cashface/api/CommerceProfileData.proto");
        ADAPTER = activityClassic$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(activityClassic$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityClassic(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ActivityClassic) && Intrinsics.areEqual(unknownFields(), ((ActivityClassic) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Divider.Builder builder = new Divider.Builder(27);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "ActivityClassic{}";
    }
}
