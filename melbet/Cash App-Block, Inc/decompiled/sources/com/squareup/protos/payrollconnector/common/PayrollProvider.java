package com.squareup.protos.payrollconnector.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.DeepLinkSpec;
import com.squareup.protos.franklin.ui.UiDda;
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
public final class PayrollProvider extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PayrollProvider> CREATOR;
    public final DirectDepositInfo direct_deposit_info;
    public final List supported_tasks;

    /* renamed from: type, reason: collision with root package name */
    public final DeepLinkSpec.Companion f1404type;
    public final PayrollProviderUiSpecification ui_specification;

    static {
        PayrollProvider$Companion$ADAPTER$1 payrollProvider$Companion$ADAPTER$1 = new PayrollProvider$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PayrollProvider.class), "type.googleapis.com/squareup.payrollconnector.common.PayrollProvider", Syntax.PROTO_2, null, "squareup/payroll-connector/common/PayrollProviderProto.proto");
        ADAPTER = payrollProvider$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(payrollProvider$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayrollProvider(DeepLinkSpec.Companion companion, PayrollProviderUiSpecification payrollProviderUiSpecification, List list, DirectDepositInfo directDepositInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.f1404type = companion;
        this.ui_specification = payrollProviderUiSpecification;
        this.direct_deposit_info = directDepositInfo;
        this.supported_tasks = TransactorKt.immutableCopyOf("supported_tasks", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PayrollProvider)) {
            return false;
        }
        PayrollProvider payrollProvider = (PayrollProvider) obj;
        return Intrinsics.areEqual(unknownFields(), payrollProvider.unknownFields()) && Intrinsics.areEqual(this.f1404type, payrollProvider.f1404type) && Intrinsics.areEqual(this.ui_specification, payrollProvider.ui_specification) && Intrinsics.areEqual(this.supported_tasks, payrollProvider.supported_tasks) && Intrinsics.areEqual(this.direct_deposit_info, payrollProvider.direct_deposit_info);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        DeepLinkSpec.Companion companion = this.f1404type;
        int hashCode2 = (hashCode + (companion != null ? companion.hashCode() : 0)) * 37;
        PayrollProviderUiSpecification payrollProviderUiSpecification = this.ui_specification;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (payrollProviderUiSpecification != null ? payrollProviderUiSpecification.hashCode() : 0)) * 37, 37, this.supported_tasks);
        DirectDepositInfo directDepositInfo = this.direct_deposit_info;
        int hashCode3 = m + (directDepositInfo != null ? directDepositInfo.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiDda.Builder builder = new UiDda.Builder(22);
        builder.account = this.f1404type;
        builder.enabled = this.ui_specification;
        builder.button = this.supported_tasks;
        builder.dda_form = this.direct_deposit_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        DeepLinkSpec.Companion companion = this.f1404type;
        if (companion != null) {
            arrayList.add("type=" + companion);
        }
        PayrollProviderUiSpecification payrollProviderUiSpecification = this.ui_specification;
        if (payrollProviderUiSpecification != null) {
            arrayList.add("ui_specification=" + payrollProviderUiSpecification);
        }
        List list = this.supported_tasks;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("supported_tasks=", arrayList, list);
        }
        DirectDepositInfo directDepositInfo = this.direct_deposit_info;
        if (directDepositInfo != null) {
            arrayList.add("direct_deposit_info=" + directDepositInfo);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PayrollProvider{", "}", 0, null, null, 56);
    }
}
