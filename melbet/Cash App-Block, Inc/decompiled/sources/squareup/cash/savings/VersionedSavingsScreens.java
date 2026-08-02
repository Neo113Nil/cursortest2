package squareup.cash.savings;

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
public final class VersionedSavingsScreens extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VersionedSavingsScreens> CREATOR;
    public final SavingsScreens v2_screens;

    static {
        VersionedSavingsScreens$Companion$ADAPTER$1 versionedSavingsScreens$Companion$ADAPTER$1 = new VersionedSavingsScreens$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(VersionedSavingsScreens.class), "type.googleapis.com/squareup.cash.savings.VersionedSavingsScreens", Syntax.PROTO_2, null, "squareup/cash/savings/VersionedSavingsScreens.proto");
        ADAPTER = versionedSavingsScreens$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(versionedSavingsScreens$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VersionedSavingsScreens(SavingsScreens savingsScreens, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.v2_screens = savingsScreens;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VersionedSavingsScreens)) {
            return false;
        }
        VersionedSavingsScreens versionedSavingsScreens = (VersionedSavingsScreens) obj;
        return Intrinsics.areEqual(unknownFields(), versionedSavingsScreens.unknownFields()) && Intrinsics.areEqual(this.v2_screens, versionedSavingsScreens.v2_screens);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SavingsScreens savingsScreens = this.v2_screens;
        int hashCode2 = hashCode + (savingsScreens != null ? savingsScreens.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EarningTool.Builder builder = new EarningTool.Builder(28);
        builder.tool = this.v2_screens;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SavingsScreens savingsScreens = this.v2_screens;
        if (savingsScreens != null) {
            arrayList.add("v2_screens=" + savingsScreens);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VersionedSavingsScreens{", "}", 0, null, null, 56);
    }
}
