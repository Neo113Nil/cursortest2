package com.squareup.protos.cash.paymenttemplate.v1;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import com.squareup.protos.cash.postcard.CardModule;
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

/* loaded from: classes7.dex */
public final class OonPaymentMethod extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OonPaymentMethod> CREATOR;
    public final zzkg payment_method_detail;

    /* renamed from: type, reason: collision with root package name */
    public final OonPaymentMethodType f1325type;

    static {
        OonPaymentMethod$Companion$ADAPTER$1 oonPaymentMethod$Companion$ADAPTER$1 = new OonPaymentMethod$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OonPaymentMethod.class), "type.googleapis.com/squareup.cash.paymenttemplate.v1.OonPaymentMethod", Syntax.PROTO_2, null, "squareup/cash/paymenttemplate/v1/payment_template.proto");
        ADAPTER = oonPaymentMethod$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(oonPaymentMethod$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OonPaymentMethod(OonPaymentMethodType oonPaymentMethodType, zzkg zzkgVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1325type = oonPaymentMethodType;
        this.payment_method_detail = zzkgVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OonPaymentMethod)) {
            return false;
        }
        OonPaymentMethod oonPaymentMethod = (OonPaymentMethod) obj;
        return Intrinsics.areEqual(unknownFields(), oonPaymentMethod.unknownFields()) && this.f1325type == oonPaymentMethod.f1325type && Intrinsics.areEqual(this.payment_method_detail, oonPaymentMethod.payment_method_detail);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        OonPaymentMethodType oonPaymentMethodType = this.f1325type;
        int hashCode2 = (hashCode + (oonPaymentMethodType != null ? oonPaymentMethodType.hashCode() : 0)) * 37;
        zzkg zzkgVar = this.payment_method_detail;
        int hashCode3 = hashCode2 + (zzkgVar != null ? zzkgVar.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardModule.Builder builder = new CardModule.Builder(14);
        builder.f1329type = this.f1325type;
        builder.use_case = this.payment_method_detail;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        OonPaymentMethodType oonPaymentMethodType = this.f1325type;
        if (oonPaymentMethodType != null) {
            arrayList.add("type=" + oonPaymentMethodType);
        }
        zzkg zzkgVar = this.payment_method_detail;
        if (zzkgVar != null) {
            arrayList.add("payment_method_detail=" + zzkgVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OonPaymentMethod{", "}", 0, null, null, 56);
    }
}
