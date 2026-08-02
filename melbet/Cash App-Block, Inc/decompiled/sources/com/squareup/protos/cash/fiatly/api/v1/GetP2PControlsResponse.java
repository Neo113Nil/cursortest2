package com.squareup.protos.cash.fiatly.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.LoanOption;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/fiatly/api/v1/GetP2PControlsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/api/LoanOption$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetP2PControlsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetP2PControlsResponse> CREATOR;
    public final Long custom_p2p_send_limit_30_day_max_amount;
    public final List custom_p2p_send_limit_30_day_presets;
    public final P2PControls p2p_controls;

    static {
        GetP2PControlsResponse$Companion$ADAPTER$1 getP2PControlsResponse$Companion$ADAPTER$1 = new GetP2PControlsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetP2PControlsResponse.class), "type.googleapis.com/squareup.cash.fiatly.api.v1.GetP2PControlsResponse", Syntax.PROTO_2, null, "squareup/cash/fiatly/api/v1/p2p_controls.proto");
        ADAPTER = getP2PControlsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getP2PControlsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetP2PControlsResponse(P2PControls p2PControls, List list, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.p2p_controls = p2PControls;
        this.custom_p2p_send_limit_30_day_max_amount = l;
        this.custom_p2p_send_limit_30_day_presets = TransactorKt.immutableCopyOf("custom_p2p_send_limit_30_day_presets", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetP2PControlsResponse)) {
            return false;
        }
        GetP2PControlsResponse getP2PControlsResponse = (GetP2PControlsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getP2PControlsResponse.unknownFields()) && Intrinsics.areEqual(this.p2p_controls, getP2PControlsResponse.p2p_controls) && Intrinsics.areEqual(this.custom_p2p_send_limit_30_day_presets, getP2PControlsResponse.custom_p2p_send_limit_30_day_presets) && Intrinsics.areEqual(this.custom_p2p_send_limit_30_day_max_amount, getP2PControlsResponse.custom_p2p_send_limit_30_day_max_amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        P2PControls p2PControls = this.p2p_controls;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (p2PControls != null ? p2PControls.hashCode() : 0)) * 37, 37, this.custom_p2p_send_limit_30_day_presets);
        Long l = this.custom_p2p_send_limit_30_day_max_amount;
        int hashCode2 = m + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LoanOption.Builder builder = new LoanOption.Builder(18);
        builder.loan_type = this.p2p_controls;
        builder.payment_schedule = this.custom_p2p_send_limit_30_day_presets;
        builder.tila_data = this.custom_p2p_send_limit_30_day_max_amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        P2PControls p2PControls = this.p2p_controls;
        if (p2PControls != null) {
            arrayList.add("p2p_controls=" + p2PControls);
        }
        List list = this.custom_p2p_send_limit_30_day_presets;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("custom_p2p_send_limit_30_day_presets=", arrayList, list);
        }
        Long l = this.custom_p2p_send_limit_30_day_max_amount;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("custom_p2p_send_limit_30_day_max_amount=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetP2PControlsResponse{", "}", 0, null, null, 56);
    }
}
