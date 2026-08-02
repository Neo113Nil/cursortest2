package squareup.cash.earnings;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bills.BillsApplet;

/* loaded from: classes10.dex */
public final class PaycheckDistributionTool extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaycheckDistributionTool> CREATOR;
    public final String client_route;
    public final List stream_avatars;
    public final LocalizedString title;

    static {
        PaycheckDistributionTool$Companion$ADAPTER$1 paycheckDistributionTool$Companion$ADAPTER$1 = new PaycheckDistributionTool$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaycheckDistributionTool.class), "type.googleapis.com/squareup.cash.earnings.PaycheckDistributionTool", Syntax.PROTO_2, null, "squareup/cash/earnings/EarningsHomeUi.proto");
        ADAPTER = paycheckDistributionTool$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paycheckDistributionTool$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaycheckDistributionTool(LocalizedString localizedString, String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = localizedString;
        this.client_route = str;
        this.stream_avatars = TransactorKt.immutableCopyOf("stream_avatars", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaycheckDistributionTool)) {
            return false;
        }
        PaycheckDistributionTool paycheckDistributionTool = (PaycheckDistributionTool) obj;
        return Intrinsics.areEqual(unknownFields(), paycheckDistributionTool.unknownFields()) && Intrinsics.areEqual(this.title, paycheckDistributionTool.title) && Intrinsics.areEqual(this.stream_avatars, paycheckDistributionTool.stream_avatars) && Intrinsics.areEqual(this.client_route, paycheckDistributionTool.client_route);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37, 37, this.stream_avatars);
        String str = this.client_route;
        int hashCode2 = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsApplet.Builder builder = new BillsApplet.Builder(16);
        builder.action = this.title;
        builder.full_applet = this.stream_avatars;
        builder.half_applet = this.client_route;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        List list = this.stream_avatars;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("stream_avatars=", arrayList, list);
        }
        String str = this.client_route;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaycheckDistributionTool{", "}", 0, null, null, 56);
    }
}
