package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import com.squareup.protos.franklin.loyalty.LoyaltyProgram;
import com.squareup.protos.franklin.ui.UiCashLimits;
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
public final class UiLoyaltyProgram extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiLoyaltyProgram> CREATOR;
    public final LoyaltyProgram loyalty_program;

    static {
        UiLoyaltyProgram$Companion$ADAPTER$1 uiLoyaltyProgram$Companion$ADAPTER$1 = new UiLoyaltyProgram$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiLoyaltyProgram.class), "type.googleapis.com/squareup.franklin.ui.UiLoyaltyProgram", Syntax.PROTO_2, null, "squareup/franklin/ui/loyalty_program.proto");
        ADAPTER = uiLoyaltyProgram$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiLoyaltyProgram$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiLoyaltyProgram(LoyaltyProgram loyaltyProgram, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.loyalty_program = loyaltyProgram;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiLoyaltyProgram)) {
            return false;
        }
        UiLoyaltyProgram uiLoyaltyProgram = (UiLoyaltyProgram) obj;
        return Intrinsics.areEqual(unknownFields(), uiLoyaltyProgram.unknownFields()) && Intrinsics.areEqual(this.loyalty_program, uiLoyaltyProgram.loyalty_program);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LoyaltyProgram loyaltyProgram = this.loyalty_program;
        int hashCode2 = hashCode + (loyaltyProgram != null ? loyaltyProgram.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiCashLimits.Builder builder = new UiCashLimits.Builder(21);
        builder.cash_limit_group = this.loyalty_program;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LoyaltyProgram loyaltyProgram = this.loyalty_program;
        if (loyaltyProgram != null) {
            arrayList.add("loyalty_program=" + loyaltyProgram);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiLoyaltyProgram{", "}", 0, null, null, 56);
    }
}
