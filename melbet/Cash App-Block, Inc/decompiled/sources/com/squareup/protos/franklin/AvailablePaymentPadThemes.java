package com.squareup.protos.franklin;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Headers;
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
public final class AvailablePaymentPadThemes extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AvailablePaymentPadThemes> CREATOR;
    public final List available_payment_pad_themes;

    static {
        AvailablePaymentPadThemes$Companion$ADAPTER$1 availablePaymentPadThemes$Companion$ADAPTER$1 = new AvailablePaymentPadThemes$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvailablePaymentPadThemes.class), "type.googleapis.com/squareup.franklin.AvailablePaymentPadThemes", Syntax.PROTO_2, null, "squareup/franklin/available_payment_pad_themes.proto");
        ADAPTER = availablePaymentPadThemes$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(availablePaymentPadThemes$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvailablePaymentPadThemes(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.available_payment_pad_themes = TransactorKt.immutableCopyOf("available_payment_pad_themes", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvailablePaymentPadThemes)) {
            return false;
        }
        AvailablePaymentPadThemes availablePaymentPadThemes = (AvailablePaymentPadThemes) obj;
        return Intrinsics.areEqual(unknownFields(), availablePaymentPadThemes.unknownFields()) && Intrinsics.areEqual(this.available_payment_pad_themes, availablePaymentPadThemes.available_payment_pad_themes);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.available_payment_pad_themes.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Headers.Builder builder = new Headers.Builder(11, false);
        builder.header = this.available_payment_pad_themes;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.available_payment_pad_themes;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("available_payment_pad_themes=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AvailablePaymentPadThemes{", "}", 0, null, null, 56);
    }
}
