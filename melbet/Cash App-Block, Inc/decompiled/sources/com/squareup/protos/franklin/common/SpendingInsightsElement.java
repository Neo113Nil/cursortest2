package com.squareup.protos.franklin.common;

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
public final class SpendingInsightsElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SpendingInsightsElement> CREATOR;

    static {
        SpendingInsightsElement$Companion$ADAPTER$1 spendingInsightsElement$Companion$ADAPTER$1 = new SpendingInsightsElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SpendingInsightsElement.class), "type.googleapis.com/squareup.franklin.common.SpendingInsightsElement", Syntax.PROTO_2, null, "squareup/franklin/card_modules.proto");
        ADAPTER = spendingInsightsElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(spendingInsightsElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpendingInsightsElement(ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof SpendingInsightsElement) && Intrinsics.areEqual(unknownFields(), ((SpendingInsightsElement) obj).unknownFields());
    }

    public final int hashCode() {
        return unknownFields().hashCode();
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EasingCurve.EaseIn.Builder builder = new EasingCurve.EaseIn.Builder(3);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        return "SpendingInsightsElement{}";
    }
}
