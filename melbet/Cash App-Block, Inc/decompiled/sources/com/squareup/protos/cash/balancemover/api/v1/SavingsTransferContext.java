package com.squareup.protos.cash.balancemover.api.v1;

import android.os.Parcelable;
import app.cash.local.primitives.DiscountCodeKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.idv.DisplayName;
import com.squareup.protos.cash.aegis.core.SubsectionBlock;
import com.squareup.protos.cash.cashapproxy.api.Divider;
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

/* loaded from: classes7.dex */
public final class SavingsTransferContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsTransferContext> CREATOR;
    public final DiscountCodeKt context;

    public final class GeneralFolder extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<GeneralFolder> CREATOR;

        static {
            SavingsTransferContext$GeneralFolder$Companion$ADAPTER$1 savingsTransferContext$GeneralFolder$Companion$ADAPTER$1 = new SavingsTransferContext$GeneralFolder$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GeneralFolder.class), "type.googleapis.com/squareup.cash.balancemover.api.v1.SavingsTransferContext.GeneralFolder", Syntax.PROTO_2, null, "squareup/cash/balancemover/api/v1/savings_transfer_context.proto");
            ADAPTER = savingsTransferContext$GeneralFolder$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsTransferContext$GeneralFolder$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GeneralFolder(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof GeneralFolder) && Intrinsics.areEqual(unknownFields(), ((GeneralFolder) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Divider.Builder builder = new Divider.Builder(18);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "GeneralFolder{}";
        }
    }

    public final class GoalFolder extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<GoalFolder> CREATOR;
        public final String goal_token;

        static {
            SavingsTransferContext$GoalFolder$Companion$ADAPTER$1 savingsTransferContext$GoalFolder$Companion$ADAPTER$1 = new SavingsTransferContext$GoalFolder$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GoalFolder.class), "type.googleapis.com/squareup.cash.balancemover.api.v1.SavingsTransferContext.GoalFolder", Syntax.PROTO_2, null, "squareup/cash/balancemover/api/v1/savings_transfer_context.proto");
            ADAPTER = savingsTransferContext$GoalFolder$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsTransferContext$GoalFolder$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GoalFolder(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.goal_token = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GoalFolder)) {
                return false;
            }
            GoalFolder goalFolder = (GoalFolder) obj;
            return Intrinsics.areEqual(unknownFields(), goalFolder.unknownFields()) && Intrinsics.areEqual(this.goal_token, goalFolder.goal_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.goal_token;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            DisplayName.Builder builder = new DisplayName.Builder(19);
            builder.display_name = this.goal_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.goal_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "goal_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "GoalFolder{", "}", 0, null, null, 56);
        }
    }

    public final class Home extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Home> CREATOR;

        static {
            SavingsTransferContext$Home$Companion$ADAPTER$1 savingsTransferContext$Home$Companion$ADAPTER$1 = new SavingsTransferContext$Home$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Home.class), "type.googleapis.com/squareup.cash.balancemover.api.v1.SavingsTransferContext.Home", Syntax.PROTO_2, null, "squareup/cash/balancemover/api/v1/savings_transfer_context.proto");
            ADAPTER = savingsTransferContext$Home$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsTransferContext$Home$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Home(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof Home) && Intrinsics.areEqual(unknownFields(), ((Home) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Divider.Builder builder = new Divider.Builder(19);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "Home{}";
        }
    }

    static {
        SavingsTransferContext$Companion$ADAPTER$1 savingsTransferContext$Companion$ADAPTER$1 = new SavingsTransferContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsTransferContext.class), "type.googleapis.com/squareup.cash.balancemover.api.v1.SavingsTransferContext", Syntax.PROTO_2, null, "squareup/cash/balancemover/api/v1/savings_transfer_context.proto");
        ADAPTER = savingsTransferContext$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsTransferContext$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsTransferContext(DiscountCodeKt discountCodeKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.context = discountCodeKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsTransferContext)) {
            return false;
        }
        SavingsTransferContext savingsTransferContext = (SavingsTransferContext) obj;
        return Intrinsics.areEqual(unknownFields(), savingsTransferContext.unknownFields()) && Intrinsics.areEqual(this.context, savingsTransferContext.context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        DiscountCodeKt discountCodeKt = this.context;
        int hashCode2 = hashCode + (discountCodeKt != null ? discountCodeKt.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SubsectionBlock.Builder builder = new SubsectionBlock.Builder(26);
        builder.f1245type = this.context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        DiscountCodeKt discountCodeKt = this.context;
        if (discountCodeKt != null) {
            arrayList.add("context=" + discountCodeKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsTransferContext{", "}", 0, null, null, 56);
    }

    public /* synthetic */ SavingsTransferContext(DiscountCodeKt discountCodeKt) {
        this(discountCodeKt, ByteString.EMPTY);
    }
}
