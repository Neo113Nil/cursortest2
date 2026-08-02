package com.squareup.protos.franklin;

import android.os.Parcelable;
import com.squareup.protos.franklin.app.ClaimData;
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
public final class PaymentPadTheme extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentPadTheme> CREATOR;
    public final PaymentPadThemeIdentifier id;

    static {
        PaymentPadTheme$Companion$ADAPTER$1 paymentPadTheme$Companion$ADAPTER$1 = new PaymentPadTheme$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaymentPadTheme.class), "type.googleapis.com/squareup.franklin.PaymentPadTheme", Syntax.PROTO_2, null, "squareup/franklin/available_payment_pad_themes.proto");
        ADAPTER = paymentPadTheme$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paymentPadTheme$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentPadTheme(PaymentPadThemeIdentifier paymentPadThemeIdentifier, ByteString byteString) {
        super(ADAPTER, byteString);
        paymentPadThemeIdentifier.getClass();
        byteString.getClass();
        this.id = paymentPadThemeIdentifier;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentPadTheme)) {
            return false;
        }
        PaymentPadTheme paymentPadTheme = (PaymentPadTheme) obj;
        return Intrinsics.areEqual(unknownFields(), paymentPadTheme.unknownFields()) && this.id == paymentPadTheme.id;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.id.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClaimData.Builder builder = new ClaimData.Builder(10);
        builder.claimable_payment = this.id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.id);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentPadTheme{", "}", 0, null, null, 56);
    }
}
