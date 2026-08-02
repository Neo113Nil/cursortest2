package squareup.cash.bankingbenefits.ui;

import android.os.Parcelable;
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

/* loaded from: classes10.dex */
public final class VersionedCashGreen extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VersionedCashGreen> CREATOR;
    public final CashGreenV1 cash_green_v1;

    static {
        VersionedCashGreen$Companion$ADAPTER$1 versionedCashGreen$Companion$ADAPTER$1 = new VersionedCashGreen$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(VersionedCashGreen.class), "type.googleapis.com/squareup.cash.bankingbenefits.ui.VersionedCashGreen", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/ui/CashGreen.proto");
        ADAPTER = versionedCashGreen$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(versionedCashGreen$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VersionedCashGreen(CashGreenV1 cashGreenV1, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.cash_green_v1 = cashGreenV1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VersionedCashGreen)) {
            return false;
        }
        VersionedCashGreen versionedCashGreen = (VersionedCashGreen) obj;
        return Intrinsics.areEqual(unknownFields(), versionedCashGreen.unknownFields()) && Intrinsics.areEqual(this.cash_green_v1, versionedCashGreen.cash_green_v1);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CashGreenV1 cashGreenV1 = this.cash_green_v1;
        int hashCode2 = hashCode + (cashGreenV1 != null ? cashGreenV1.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EarningTool.Builder builder = new EarningTool.Builder(9);
        builder.tool = this.cash_green_v1;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CashGreenV1 cashGreenV1 = this.cash_green_v1;
        if (cashGreenV1 != null) {
            arrayList.add("cash_green_v1=" + cashGreenV1);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VersionedCashGreen{", "}", 0, null, null, 56);
    }
}
