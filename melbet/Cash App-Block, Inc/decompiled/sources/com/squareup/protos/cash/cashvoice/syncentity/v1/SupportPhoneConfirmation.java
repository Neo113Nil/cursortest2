package com.squareup.protos.cash.cashvoice.syncentity.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.Banner;
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
public final class SupportPhoneConfirmation extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SupportPhoneConfirmation> CREATOR;
    public final String verification_id;

    static {
        SupportPhoneConfirmation$Companion$ADAPTER$1 supportPhoneConfirmation$Companion$ADAPTER$1 = new SupportPhoneConfirmation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SupportPhoneConfirmation.class), "type.googleapis.com/squareup.cash.cashvoice.syncentity.v1.SupportPhoneConfirmation", Syntax.PROTO_2, null, "squareup/cash/cashvoice/syncentity/v1/support_phone_confirmation.proto");
        ADAPTER = supportPhoneConfirmation$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(supportPhoneConfirmation$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportPhoneConfirmation(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.verification_id = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SupportPhoneConfirmation)) {
            return false;
        }
        SupportPhoneConfirmation supportPhoneConfirmation = (SupportPhoneConfirmation) obj;
        return Intrinsics.areEqual(unknownFields(), supportPhoneConfirmation.unknownFields()) && Intrinsics.areEqual(this.verification_id, supportPhoneConfirmation.verification_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.verification_id;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Banner.Builder builder = new Banner.Builder(19);
        builder.banner_color = this.verification_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.verification_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "verification_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SupportPhoneConfirmation{", "}", 0, null, null, 56);
    }
}
