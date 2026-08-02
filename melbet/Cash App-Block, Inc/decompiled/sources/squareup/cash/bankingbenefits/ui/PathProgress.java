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
public final class PathProgress extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PathProgress> CREATOR;
    public final PathProgress$Progress$Spend progress;

    static {
        PathProgress$Companion$ADAPTER$1 pathProgress$Companion$ADAPTER$1 = new PathProgress$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PathProgress.class), "type.googleapis.com/squareup.cash.bankingbenefits.ui.PathProgress", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/ui/CashGreen.proto");
        ADAPTER = pathProgress$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(pathProgress$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathProgress(PathProgress$Progress$Spend pathProgress$Progress$Spend, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.progress = pathProgress$Progress$Spend;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PathProgress)) {
            return false;
        }
        PathProgress pathProgress = (PathProgress) obj;
        return Intrinsics.areEqual(unknownFields(), pathProgress.unknownFields()) && Intrinsics.areEqual(this.progress, pathProgress.progress);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PathProgress$Progress$Spend pathProgress$Progress$Spend = this.progress;
        int hashCode2 = hashCode + (pathProgress$Progress$Spend != null ? pathProgress$Progress$Spend.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EarningTool.Builder builder = new EarningTool.Builder(8);
        builder.tool = this.progress;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PathProgress$Progress$Spend pathProgress$Progress$Spend = this.progress;
        if (pathProgress$Progress$Spend != null) {
            arrayList.add("progress=" + pathProgress$Progress$Spend);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PathProgress{", "}", 0, null, null, 56);
    }
}
