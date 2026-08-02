package com.squareup.protos.payrollconnector.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.giftly.GiftCard;
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

/* loaded from: classes8.dex */
public final class SourceIdentifier extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SourceIdentifier> CREATOR;
    public final PayrollProviderType payroll_provider_type;
    public final String source_id;
    public final PayrollVendor source_vendor;

    static {
        SourceIdentifier$Companion$ADAPTER$1 sourceIdentifier$Companion$ADAPTER$1 = new SourceIdentifier$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SourceIdentifier.class), "type.googleapis.com/squareup.payrollconnector.common.SourceIdentifier", Syntax.PROTO_2, null, "squareup/payroll-connector/common/PayrollProviderProto.proto");
        ADAPTER = sourceIdentifier$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(sourceIdentifier$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceIdentifier(PayrollVendor payrollVendor, String str, PayrollProviderType payrollProviderType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.source_vendor = payrollVendor;
        this.source_id = str;
        this.payroll_provider_type = payrollProviderType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SourceIdentifier)) {
            return false;
        }
        SourceIdentifier sourceIdentifier = (SourceIdentifier) obj;
        return Intrinsics.areEqual(unknownFields(), sourceIdentifier.unknownFields()) && this.source_vendor == sourceIdentifier.source_vendor && Intrinsics.areEqual(this.source_id, sourceIdentifier.source_id) && this.payroll_provider_type == sourceIdentifier.payroll_provider_type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PayrollVendor payrollVendor = this.source_vendor;
        int hashCode2 = (hashCode + (payrollVendor != null ? payrollVendor.hashCode() : 0)) * 37;
        String str = this.source_id;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        PayrollProviderType payrollProviderType = this.payroll_provider_type;
        int hashCode4 = hashCode3 + (payrollProviderType != null ? payrollProviderType.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Options.Builder builder = new GiftCard.Options.Builder(28);
        builder.localizable_label = this.source_vendor;
        builder.label = this.source_id;
        builder.client_scenario = this.payroll_provider_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PayrollVendor payrollVendor = this.source_vendor;
        if (payrollVendor != null) {
            arrayList.add("source_vendor=" + payrollVendor);
        }
        String str = this.source_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "source_id=", arrayList);
        }
        PayrollProviderType payrollProviderType = this.payroll_provider_type;
        if (payrollProviderType != null) {
            arrayList.add("payroll_provider_type=" + payrollProviderType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SourceIdentifier{", "}", 0, null, null, 56);
    }
}
