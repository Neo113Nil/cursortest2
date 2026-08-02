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
public final class VersionedGreenBenefits extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VersionedGreenBenefits> CREATOR;
    public final GreenBenefitsV1 green_benefits_v1;

    static {
        VersionedGreenBenefits$Companion$ADAPTER$1 versionedGreenBenefits$Companion$ADAPTER$1 = new VersionedGreenBenefits$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(VersionedGreenBenefits.class), "type.googleapis.com/squareup.cash.bankingbenefits.ui.VersionedGreenBenefits", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/ui/GreenBenefits.proto");
        ADAPTER = versionedGreenBenefits$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(versionedGreenBenefits$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VersionedGreenBenefits(GreenBenefitsV1 greenBenefitsV1, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.green_benefits_v1 = greenBenefitsV1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VersionedGreenBenefits)) {
            return false;
        }
        VersionedGreenBenefits versionedGreenBenefits = (VersionedGreenBenefits) obj;
        return Intrinsics.areEqual(unknownFields(), versionedGreenBenefits.unknownFields()) && Intrinsics.areEqual(this.green_benefits_v1, versionedGreenBenefits.green_benefits_v1);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        GreenBenefitsV1 greenBenefitsV1 = this.green_benefits_v1;
        int hashCode2 = hashCode + (greenBenefitsV1 != null ? greenBenefitsV1.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EarningTool.Builder builder = new EarningTool.Builder(10);
        builder.tool = this.green_benefits_v1;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        GreenBenefitsV1 greenBenefitsV1 = this.green_benefits_v1;
        if (greenBenefitsV1 != null) {
            arrayList.add("green_benefits_v1=" + greenBenefitsV1);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VersionedGreenBenefits{", "}", 0, null, null, 56);
    }
}
