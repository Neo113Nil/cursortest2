package squareup.cash.earnings;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import io.noties.markwon.LinkResolverDef;
import java.time.Instant;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bills.BillsConfig;

/* loaded from: classes10.dex */
public final class EarnerModeStatus extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EarnerModeStatus> CREATOR;
    public final Instant ends_at;
    public final Status status;

    public enum Status implements WireEnum {
        STATUS_UNSPECIFIED(0),
        STATUS_ACTIVE(1),
        STATUS_INACTIVE(2);

        public static final EarnerModeStatus$Status$Companion$ADAPTER$1 ADAPTER;
        public static final LinkResolverDef Companion;
        public final int value;

        static {
            Status status = STATUS_UNSPECIFIED;
            Companion = new LinkResolverDef(25);
            ADAPTER = new EarnerModeStatus$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return STATUS_UNSPECIFIED;
            }
            if (i == 1) {
                return STATUS_ACTIVE;
            }
            if (i != 2) {
                return null;
            }
            return STATUS_INACTIVE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        EarnerModeStatus$Companion$ADAPTER$1 earnerModeStatus$Companion$ADAPTER$1 = new EarnerModeStatus$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EarnerModeStatus.class), "type.googleapis.com/squareup.cash.earnings.EarnerModeStatus", Syntax.PROTO_2, null, "squareup/cash/earnings/earner_mode_status.proto");
        ADAPTER = earnerModeStatus$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(earnerModeStatus$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarnerModeStatus(Status status, Instant instant, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.status = status;
        this.ends_at = instant;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EarnerModeStatus)) {
            return false;
        }
        EarnerModeStatus earnerModeStatus = (EarnerModeStatus) obj;
        return Intrinsics.areEqual(unknownFields(), earnerModeStatus.unknownFields()) && this.status == earnerModeStatus.status && Intrinsics.areEqual(this.ends_at, earnerModeStatus.ends_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Status status = this.status;
        int hashCode2 = (hashCode + (status != null ? status.hashCode() : 0)) * 37;
        Instant instant = this.ends_at;
        int hashCode3 = hashCode2 + (instant != null ? instant.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsConfig.Builder builder = new BillsConfig.Builder(11);
        builder.bills_applet_default_action = this.status;
        builder.half_applet_content = this.ends_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        Instant instant = this.ends_at;
        if (instant != null) {
            Matcher$$ExternalSyntheticOutline0.m("ends_at=", instant, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarnerModeStatus{", "}", 0, null, null, 56);
    }
}
