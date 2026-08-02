package squareup.cash.bankingbenefits.ui;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.person.Alias;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.full.KClasses$$Lambda$1;
import net.idrnd.face.iad.capture.internal.y0;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class CashGreenV1 extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashGreenV1> CREATOR;
    public final String client_route;
    public final Long expire_at;
    public final List path_progresses;
    public final RiskStatus risk_status;
    public final Status status;
    public final StatusMethod status_method;
    public final String support_url;

    /* loaded from: classes9.dex */
    public enum Status implements WireEnum {
        STATUS_UNSPECIFIED(0),
        INACTIVE(1),
        ACTIVE(2),
        CHURN(3),
        INELIGIBLE(4);

        public static final CashGreenV1$Status$Companion$ADAPTER$1 ADAPTER;
        public static final y0 Companion;
        public final int value;

        static {
            Status status = STATUS_UNSPECIFIED;
            Companion = new y0();
            ADAPTER = new CashGreenV1$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            return y0.m4312fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum StatusMethod implements WireEnum {
        STATUS_METHOD_UNSPECIFIED(0),
        SPEND(1),
        DIRECT_DEPOSIT(2);

        public static final CashGreenV1$StatusMethod$Companion$ADAPTER$1 ADAPTER;
        public static final KClasses$$Lambda$1 Companion;
        public final int value;

        static {
            StatusMethod statusMethod = STATUS_METHOD_UNSPECIFIED;
            Companion = new KClasses$$Lambda$1(24);
            ADAPTER = new CashGreenV1$StatusMethod$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(StatusMethod.class), Syntax.PROTO_2, statusMethod);
        }

        StatusMethod(int i) {
            this.value = i;
        }

        public static final StatusMethod fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return STATUS_METHOD_UNSPECIFIED;
            }
            if (i == 1) {
                return SPEND;
            }
            if (i != 2) {
                return null;
            }
            return DIRECT_DEPOSIT;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CashGreenV1$Companion$ADAPTER$1 cashGreenV1$Companion$ADAPTER$1 = new CashGreenV1$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashGreenV1.class), "type.googleapis.com/squareup.cash.bankingbenefits.ui.CashGreenV1", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/ui/CashGreen.proto");
        ADAPTER = cashGreenV1$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashGreenV1$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashGreenV1(Status status, Long l, List list, String str, StatusMethod statusMethod, RiskStatus riskStatus, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.status = status;
        this.expire_at = l;
        this.client_route = str;
        this.status_method = statusMethod;
        this.risk_status = riskStatus;
        this.support_url = str2;
        this.path_progresses = TransactorKt.immutableCopyOf("path_progresses", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashGreenV1)) {
            return false;
        }
        CashGreenV1 cashGreenV1 = (CashGreenV1) obj;
        return Intrinsics.areEqual(unknownFields(), cashGreenV1.unknownFields()) && this.status == cashGreenV1.status && Intrinsics.areEqual(this.expire_at, cashGreenV1.expire_at) && Intrinsics.areEqual(this.path_progresses, cashGreenV1.path_progresses) && Intrinsics.areEqual(this.client_route, cashGreenV1.client_route) && this.status_method == cashGreenV1.status_method && Intrinsics.areEqual(this.risk_status, cashGreenV1.risk_status) && Intrinsics.areEqual(this.support_url, cashGreenV1.support_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Status status = this.status;
        int hashCode2 = (hashCode + (status != null ? status.hashCode() : 0)) * 37;
        Long l = this.expire_at;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37, 37, this.path_progresses);
        String str = this.client_route;
        int hashCode3 = (m + (str != null ? str.hashCode() : 0)) * 37;
        StatusMethod statusMethod = this.status_method;
        int hashCode4 = (hashCode3 + (statusMethod != null ? statusMethod.hashCode() : 0)) * 37;
        RiskStatus riskStatus = this.risk_status;
        int hashCode5 = (hashCode4 + (riskStatus != null ? riskStatus.hashCode() : 0)) * 37;
        String str2 = this.support_url;
        int hashCode6 = hashCode5 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Alias.Builder builder = new Alias.Builder(25, false);
        builder.f1407type = this.status;
        builder.first_verified_at_ms = this.expire_at;
        builder.last_verified_at_ms = this.path_progresses;
        builder.scope = this.client_route;
        builder.created_at = this.status_method;
        builder.updated_at = this.risk_status;
        builder.value = this.support_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        Long l = this.expire_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expire_at=", l, arrayList);
        }
        List list = this.path_progresses;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("path_progresses=", arrayList, list);
        }
        String str = this.client_route;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route=", arrayList);
        }
        StatusMethod statusMethod = this.status_method;
        if (statusMethod != null) {
            arrayList.add("status_method=" + statusMethod);
        }
        RiskStatus riskStatus = this.risk_status;
        if (riskStatus != null) {
            arrayList.add("risk_status=" + riskStatus);
        }
        String str2 = this.support_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "support_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashGreenV1{", "}", 0, null, null, 56);
    }
}
