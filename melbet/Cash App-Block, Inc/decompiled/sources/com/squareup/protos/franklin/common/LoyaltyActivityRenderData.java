package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.protos.franklin.app.ClaimData;
import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LoyaltyActivityRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LoyaltyActivityRenderData> CREATOR;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1383type;

    public enum Type implements WireEnum {
        JOINED_PROGRAM(1),
        EARNED_POINTS(2),
        REDEEMED_REWARD(3),
        EXPIRED_POINTS(4),
        TIER_UPGRADE(5);

        public final int value;
        public static final KeyScope.Companion Companion = new KeyScope.Companion();
        public static final LoyaltyActivityRenderData$Type$Companion$ADAPTER$1 ADAPTER = new LoyaltyActivityRenderData$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, null);

        Type(int i) {
            this.value = i;
        }

        public static final Type fromValue(int i) {
            Companion.getClass();
            return KeyScope.Companion.m3969fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        LoyaltyActivityRenderData$Companion$ADAPTER$1 loyaltyActivityRenderData$Companion$ADAPTER$1 = new LoyaltyActivityRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LoyaltyActivityRenderData.class), "type.googleapis.com/squareup.franklin.LoyaltyActivityRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = loyaltyActivityRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(loyaltyActivityRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyActivityRenderData(Type type2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1383type = type2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoyaltyActivityRenderData)) {
            return false;
        }
        LoyaltyActivityRenderData loyaltyActivityRenderData = (LoyaltyActivityRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), loyaltyActivityRenderData.unknownFields()) && this.f1383type == loyaltyActivityRenderData.f1383type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Type type2 = this.f1383type;
        int hashCode2 = hashCode + (type2 != null ? type2.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClaimData.Builder builder = new ClaimData.Builder(28);
        builder.claimable_payment = this.f1383type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Type type2 = this.f1383type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LoyaltyActivityRenderData{", "}", 0, null, null, 56);
    }
}
