package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.paychecks.Paycheck;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/PaycheckRow;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/PaycheckRow$Builder;", "Lsquareup/cash/paychecks/Paycheck;", "paycheck", "Lsquareup/cash/paychecks/Paycheck;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PaycheckRow extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaycheckRow> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "squareup.cash.paychecks.Paycheck#ADAPTER", schemaIndex = 0, tag = 1)
    public final Paycheck paycheck;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/PaycheckRow$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/PaycheckRow;", "<init>", "()V", "paycheck", "Lsquareup/cash/paychecks/Paycheck;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Paycheck paycheck;

        @Override // com.squareup.wire.Message.Builder
        public PaycheckRow build() {
            return new PaycheckRow(this.paycheck, buildUnknownFields());
        }

        public final Builder paycheck(Paycheck paycheck) {
            this.paycheck = paycheck;
            return this;
        }
    }

    static {
        PaycheckRow$Companion$ADAPTER$1 paycheckRow$Companion$ADAPTER$1 = new PaycheckRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaycheckRow.class), "type.googleapis.com/squareup.cash.activity.api.v1.PaycheckRow", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/models.proto");
        ADAPTER = paycheckRow$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paycheckRow$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaycheckRow(Paycheck paycheck, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.paycheck = paycheck;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaycheckRow)) {
            return false;
        }
        PaycheckRow paycheckRow = (PaycheckRow) obj;
        return Intrinsics.areEqual(unknownFields(), paycheckRow.unknownFields()) && Intrinsics.areEqual(this.paycheck, paycheckRow.paycheck);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Paycheck paycheck = this.paycheck;
        int hashCode2 = hashCode + (paycheck != null ? paycheck.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.paycheck = this.paycheck;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Paycheck paycheck = this.paycheck;
        if (paycheck != null) {
            arrayList.add("paycheck=" + paycheck);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaycheckRow{", "}", 0, null, null, 56);
    }
}
