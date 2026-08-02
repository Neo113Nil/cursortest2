package com.squareup.protos.timecards;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.SyncContactsRequest;
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

/* loaded from: classes8.dex */
public final class MerchantEmployeeRequestFilter extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MerchantEmployeeRequestFilter> CREATOR;
    public final List employee_token;
    public final String merchant_token;
    public final List unit_token;

    static {
        MerchantEmployeeRequestFilter$Companion$ADAPTER$1 merchantEmployeeRequestFilter$Companion$ADAPTER$1 = new MerchantEmployeeRequestFilter$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MerchantEmployeeRequestFilter.class), "type.googleapis.com/squareup.timecards.MerchantEmployeeRequestFilter", Syntax.PROTO_2, null, "squareup/timecards/service.proto");
        ADAPTER = merchantEmployeeRequestFilter$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(merchantEmployeeRequestFilter$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchantEmployeeRequestFilter(String str, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.merchant_token = str;
        this.employee_token = TransactorKt.immutableCopyOf("employee_token", list);
        this.unit_token = TransactorKt.immutableCopyOf("unit_token", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MerchantEmployeeRequestFilter)) {
            return false;
        }
        MerchantEmployeeRequestFilter merchantEmployeeRequestFilter = (MerchantEmployeeRequestFilter) obj;
        return Intrinsics.areEqual(unknownFields(), merchantEmployeeRequestFilter.unknownFields()) && Intrinsics.areEqual(this.merchant_token, merchantEmployeeRequestFilter.merchant_token) && Intrinsics.areEqual(this.employee_token, merchantEmployeeRequestFilter.employee_token) && Intrinsics.areEqual(this.unit_token, merchantEmployeeRequestFilter.unit_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.merchant_token;
        int hashCode2 = this.unit_token.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.employee_token);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SyncContactsRequest.Builder builder = new SyncContactsRequest.Builder(9, false);
        builder.sync_token = this.merchant_token;
        builder.add_hashed_aliases = this.employee_token;
        builder.remove_hashed_aliases = this.unit_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.merchant_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "merchant_token=", arrayList);
        }
        List list = this.employee_token;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("employee_token=", arrayList, list);
        }
        List list2 = this.unit_token;
        if (!list2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("unit_token=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MerchantEmployeeRequestFilter{", "}", 0, null, null, 56);
    }
}
