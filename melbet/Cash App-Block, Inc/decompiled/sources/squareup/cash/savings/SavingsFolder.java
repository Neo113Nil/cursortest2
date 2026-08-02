package squareup.cash.savings;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import squareup.cash.bills.BillsApplet;

/* loaded from: classes10.dex */
public final class SavingsFolder extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsFolder> CREATOR;
    public final GoalFolder active_goal;
    public final String instrument_token;
    public final String owning_customer_token;

    static {
        SavingsFolder$Companion$ADAPTER$1 savingsFolder$Companion$ADAPTER$1 = new SavingsFolder$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsFolder.class), "type.googleapis.com/squareup.cash.savings.SavingsFolder", Syntax.PROTO_2, null, "squareup/cash/savings/SavingsFolder.proto");
        ADAPTER = savingsFolder$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsFolder$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsFolder(String str, GoalFolder goalFolder, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.instrument_token = str;
        this.active_goal = goalFolder;
        this.owning_customer_token = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsFolder)) {
            return false;
        }
        SavingsFolder savingsFolder = (SavingsFolder) obj;
        return Intrinsics.areEqual(unknownFields(), savingsFolder.unknownFields()) && Intrinsics.areEqual(this.instrument_token, savingsFolder.instrument_token) && Intrinsics.areEqual(this.active_goal, savingsFolder.active_goal) && Intrinsics.areEqual(this.owning_customer_token, savingsFolder.owning_customer_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.instrument_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        GoalFolder goalFolder = this.active_goal;
        int hashCode3 = (hashCode2 + (goalFolder != null ? goalFolder.hashCode() : 0)) * 37;
        String str2 = this.owning_customer_token;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsApplet.Builder builder = new BillsApplet.Builder(24);
        builder.action = this.instrument_token;
        builder.full_applet = this.active_goal;
        builder.half_applet = this.owning_customer_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.instrument_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "instrument_token=", arrayList);
        }
        GoalFolder goalFolder = this.active_goal;
        if (goalFolder != null) {
            arrayList.add("active_goal=" + goalFolder);
        }
        String str2 = this.owning_customer_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "owning_customer_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsFolder{", "}", 0, null, null, 56);
    }
}
