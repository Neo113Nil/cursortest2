package com.squareup.protos.payrollconnector.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.rewardly.ui.AppLinks;
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
public final class PayrollProviderUiSpecification extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PayrollProviderUiSpecification> CREATOR;
    public final PayrollProviderUiAvatar avatar;
    public final String title;

    static {
        PayrollProviderUiSpecification$Companion$ADAPTER$1 payrollProviderUiSpecification$Companion$ADAPTER$1 = new PayrollProviderUiSpecification$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PayrollProviderUiSpecification.class), "type.googleapis.com/squareup.payrollconnector.common.PayrollProviderUiSpecification", Syntax.PROTO_2, null, "squareup/payroll-connector/common/PayrollProviderProto.proto");
        ADAPTER = payrollProviderUiSpecification$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(payrollProviderUiSpecification$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayrollProviderUiSpecification(PayrollProviderUiAvatar payrollProviderUiAvatar, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.avatar = payrollProviderUiAvatar;
        this.title = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PayrollProviderUiSpecification)) {
            return false;
        }
        PayrollProviderUiSpecification payrollProviderUiSpecification = (PayrollProviderUiSpecification) obj;
        return Intrinsics.areEqual(unknownFields(), payrollProviderUiSpecification.unknownFields()) && Intrinsics.areEqual(this.avatar, payrollProviderUiSpecification.avatar) && Intrinsics.areEqual(this.title, payrollProviderUiSpecification.title);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PayrollProviderUiAvatar payrollProviderUiAvatar = this.avatar;
        int hashCode2 = (hashCode + (payrollProviderUiAvatar != null ? payrollProviderUiAvatar.hashCode() : 0)) * 37;
        String str = this.title;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(21);
        builder.f1411android = this.avatar;
        builder.ios = this.title;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PayrollProviderUiAvatar payrollProviderUiAvatar = this.avatar;
        if (payrollProviderUiAvatar != null) {
            arrayList.add("avatar=" + payrollProviderUiAvatar);
        }
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PayrollProviderUiSpecification{", "}", 0, null, null, 56);
    }
}
