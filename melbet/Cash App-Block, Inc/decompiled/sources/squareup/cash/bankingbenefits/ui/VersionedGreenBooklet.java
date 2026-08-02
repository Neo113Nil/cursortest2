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
public final class VersionedGreenBooklet extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VersionedGreenBooklet> CREATOR;
    public final GreenBookletV1 green_booklet_v1;

    static {
        VersionedGreenBooklet$Companion$ADAPTER$1 versionedGreenBooklet$Companion$ADAPTER$1 = new VersionedGreenBooklet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(VersionedGreenBooklet.class), "type.googleapis.com/squareup.cash.bankingbenefits.ui.VersionedGreenBooklet", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/ui/GreenBooklet.proto");
        ADAPTER = versionedGreenBooklet$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(versionedGreenBooklet$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VersionedGreenBooklet(GreenBookletV1 greenBookletV1, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.green_booklet_v1 = greenBookletV1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VersionedGreenBooklet)) {
            return false;
        }
        VersionedGreenBooklet versionedGreenBooklet = (VersionedGreenBooklet) obj;
        return Intrinsics.areEqual(unknownFields(), versionedGreenBooklet.unknownFields()) && Intrinsics.areEqual(this.green_booklet_v1, versionedGreenBooklet.green_booklet_v1);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        GreenBookletV1 greenBookletV1 = this.green_booklet_v1;
        int hashCode2 = hashCode + (greenBookletV1 != null ? greenBookletV1.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EarningTool.Builder builder = new EarningTool.Builder(11);
        builder.tool = this.green_booklet_v1;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        GreenBookletV1 greenBookletV1 = this.green_booklet_v1;
        if (greenBookletV1 != null) {
            arrayList.add("green_booklet_v1=" + greenBookletV1);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VersionedGreenBooklet{", "}", 0, null, null, 56);
    }
}
