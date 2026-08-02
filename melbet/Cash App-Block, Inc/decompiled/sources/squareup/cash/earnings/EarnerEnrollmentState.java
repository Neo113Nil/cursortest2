package squareup.cash.earnings;

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

/* loaded from: classes10.dex */
public final class EarnerEnrollmentState extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EarnerEnrollmentState> CREATOR;
    public final Boolean enrolled;

    static {
        EarnerEnrollmentState$Companion$ADAPTER$1 earnerEnrollmentState$Companion$ADAPTER$1 = new EarnerEnrollmentState$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EarnerEnrollmentState.class), "type.googleapis.com/squareup.cash.earnings.EarnerEnrollmentState", Syntax.PROTO_2, null, "squareup/cash/earnings/EarnerEnrollmentState.proto");
        ADAPTER = earnerEnrollmentState$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(earnerEnrollmentState$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarnerEnrollmentState(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.enrolled = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EarnerEnrollmentState)) {
            return false;
        }
        EarnerEnrollmentState earnerEnrollmentState = (EarnerEnrollmentState) obj;
        return Intrinsics.areEqual(unknownFields(), earnerEnrollmentState.unknownFields()) && Intrinsics.areEqual(this.enrolled, earnerEnrollmentState.enrolled);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.enrolled;
        int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAppLock.Builder builder = new UiAppLock.Builder(29);
        builder.activated = this.enrolled;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.enrolled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enrolled=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarnerEnrollmentState{", "}", 0, null, null, 56);
    }
}
