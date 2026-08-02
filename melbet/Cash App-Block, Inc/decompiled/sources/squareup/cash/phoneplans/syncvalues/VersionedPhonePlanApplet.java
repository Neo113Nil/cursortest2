package squareup.cash.phoneplans.syncvalues;

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
public final class VersionedPhonePlanApplet extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VersionedPhonePlanApplet> CREATOR;
    public final PhonePlanAppletV1 phone_plan_applet_v1;

    static {
        VersionedPhonePlanApplet$Companion$ADAPTER$1 versionedPhonePlanApplet$Companion$ADAPTER$1 = new VersionedPhonePlanApplet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(VersionedPhonePlanApplet.class), "type.googleapis.com/squareup.cash.phoneplans.syncvalues.VersionedPhonePlanApplet", Syntax.PROTO_2, null, "squareup/cash/phoneplans/syncvalues/VersionedPhonePlanApplet.proto");
        ADAPTER = versionedPhonePlanApplet$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(versionedPhonePlanApplet$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VersionedPhonePlanApplet(PhonePlanAppletV1 phonePlanAppletV1, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.phone_plan_applet_v1 = phonePlanAppletV1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VersionedPhonePlanApplet)) {
            return false;
        }
        VersionedPhonePlanApplet versionedPhonePlanApplet = (VersionedPhonePlanApplet) obj;
        return Intrinsics.areEqual(unknownFields(), versionedPhonePlanApplet.unknownFields()) && Intrinsics.areEqual(this.phone_plan_applet_v1, versionedPhonePlanApplet.phone_plan_applet_v1);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PhonePlanAppletV1 phonePlanAppletV1 = this.phone_plan_applet_v1;
        int hashCode2 = hashCode + (phonePlanAppletV1 != null ? phonePlanAppletV1.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EarningTool.Builder builder = new EarningTool.Builder(22);
        builder.tool = this.phone_plan_applet_v1;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PhonePlanAppletV1 phonePlanAppletV1 = this.phone_plan_applet_v1;
        if (phonePlanAppletV1 != null) {
            arrayList.add("phone_plan_applet_v1=" + phonePlanAppletV1);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VersionedPhonePlanApplet{", "}", 0, null, null, 56);
    }
}
