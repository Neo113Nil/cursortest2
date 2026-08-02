package com.squareup.protos.wiremate;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzkp;
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
import squareup.cash.earnings.EarningTool;
import xyz.block.protos.genie.EasingCurve;

/* loaded from: classes8.dex */
public final class WiresEligibilityState extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<WiresEligibilityState> CREATOR;
    public final zzkp state;

    public final class EligibleInvalidAccount extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EligibleInvalidAccount> CREATOR;

        static {
            WiresEligibilityState$EligibleInvalidAccount$Companion$ADAPTER$1 wiresEligibilityState$EligibleInvalidAccount$Companion$ADAPTER$1 = new WiresEligibilityState$EligibleInvalidAccount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EligibleInvalidAccount.class), "type.googleapis.com/squareup.wiremate.WiresEligibilityState.EligibleInvalidAccount", Syntax.PROTO_2, null, "squareup/wiremate/wires_eligibility_state.proto");
            ADAPTER = wiresEligibilityState$EligibleInvalidAccount$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(wiresEligibilityState$EligibleInvalidAccount$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EligibleInvalidAccount(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof EligibleInvalidAccount) && Intrinsics.areEqual(unknownFields(), ((EligibleInvalidAccount) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EasingCurve.EaseIn.Builder builder = new EasingCurve.EaseIn.Builder(9);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "EligibleInvalidAccount{}";
        }
    }

    public final class EligibleValidAccount extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EligibleValidAccount> CREATOR;

        static {
            WiresEligibilityState$EligibleValidAccount$Companion$ADAPTER$1 wiresEligibilityState$EligibleValidAccount$Companion$ADAPTER$1 = new WiresEligibilityState$EligibleValidAccount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EligibleValidAccount.class), "type.googleapis.com/squareup.wiremate.WiresEligibilityState.EligibleValidAccount", Syntax.PROTO_2, null, "squareup/wiremate/wires_eligibility_state.proto");
            ADAPTER = wiresEligibilityState$EligibleValidAccount$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(wiresEligibilityState$EligibleValidAccount$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EligibleValidAccount(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof EligibleValidAccount) && Intrinsics.areEqual(unknownFields(), ((EligibleValidAccount) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EasingCurve.EaseIn.Builder builder = new EasingCurve.EaseIn.Builder(10);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "EligibleValidAccount{}";
        }
    }

    public final class Ineligible extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Ineligible> CREATOR;

        static {
            WiresEligibilityState$Ineligible$Companion$ADAPTER$1 wiresEligibilityState$Ineligible$Companion$ADAPTER$1 = new WiresEligibilityState$Ineligible$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Ineligible.class), "type.googleapis.com/squareup.wiremate.WiresEligibilityState.Ineligible", Syntax.PROTO_2, null, "squareup/wiremate/wires_eligibility_state.proto");
            ADAPTER = wiresEligibilityState$Ineligible$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(wiresEligibilityState$Ineligible$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ineligible(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof Ineligible) && Intrinsics.areEqual(unknownFields(), ((Ineligible) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EasingCurve.EaseIn.Builder builder = new EasingCurve.EaseIn.Builder(11);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "Ineligible{}";
        }
    }

    static {
        WiresEligibilityState$Companion$ADAPTER$1 wiresEligibilityState$Companion$ADAPTER$1 = new WiresEligibilityState$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(WiresEligibilityState.class), "type.googleapis.com/squareup.wiremate.WiresEligibilityState", Syntax.PROTO_2, null, "squareup/wiremate/wires_eligibility_state.proto");
        ADAPTER = wiresEligibilityState$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(wiresEligibilityState$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WiresEligibilityState(zzkp zzkpVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.state = zzkpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WiresEligibilityState)) {
            return false;
        }
        WiresEligibilityState wiresEligibilityState = (WiresEligibilityState) obj;
        return Intrinsics.areEqual(unknownFields(), wiresEligibilityState.unknownFields()) && Intrinsics.areEqual(this.state, wiresEligibilityState.state);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzkp zzkpVar = this.state;
        int hashCode2 = hashCode + (zzkpVar != null ? zzkpVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EarningTool.Builder builder = new EarningTool.Builder(5);
        builder.tool = this.state;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzkp zzkpVar = this.state;
        if (zzkpVar != null) {
            arrayList.add("state=" + zzkpVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "WiresEligibilityState{", "}", 0, null, null, 56);
    }
}
