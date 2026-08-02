package com.squareup.protos.papermate;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiAppLock;
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
public final class PaperCashDepositEligibility extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaperCashDepositEligibility> CREATOR;
    public final Boolean is_eligible;

    static {
        PaperCashDepositEligibility$Companion$ADAPTER$1 paperCashDepositEligibility$Companion$ADAPTER$1 = new PaperCashDepositEligibility$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaperCashDepositEligibility.class), "type.googleapis.com/squareup.papermate.PaperCashDepositEligibility", Syntax.PROTO_2, null, "squareup/papermate/paper_cash_deposit_eligibility.proto");
        ADAPTER = paperCashDepositEligibility$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paperCashDepositEligibility$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaperCashDepositEligibility(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.is_eligible = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaperCashDepositEligibility)) {
            return false;
        }
        PaperCashDepositEligibility paperCashDepositEligibility = (PaperCashDepositEligibility) obj;
        return Intrinsics.areEqual(unknownFields(), paperCashDepositEligibility.unknownFields()) && Intrinsics.areEqual(this.is_eligible, paperCashDepositEligibility.is_eligible);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.is_eligible;
        int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAppLock.Builder builder = new UiAppLock.Builder(26);
        builder.activated = this.is_eligible;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.is_eligible;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_eligible=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaperCashDepositEligibility{", "}", 0, null, null, 56);
    }
}
