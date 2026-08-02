package com.squareup.protos.roster.business_hours;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
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
import xyz.block.protos.genie.Collection;

/* loaded from: classes8.dex */
public final class BusinessHours extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BusinessHours> CREATOR;
    public final List periods;

    static {
        BusinessHours$Companion$ADAPTER$1 businessHours$Companion$ADAPTER$1 = new BusinessHours$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BusinessHours.class), "type.googleapis.com/squareup.roster.business_hours.BusinessHours", Syntax.PROTO_2, null, "squareup/roster/business_hours.proto");
        ADAPTER = businessHours$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(businessHours$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessHours(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.periods = TransactorKt.immutableCopyOf("periods", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BusinessHours)) {
            return false;
        }
        BusinessHours businessHours = (BusinessHours) obj;
        return Intrinsics.areEqual(unknownFields(), businessHours.unknownFields()) && Intrinsics.areEqual(this.periods, businessHours.periods);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.periods.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Collection.Builder builder = new Collection.Builder(17, false);
        builder.items = this.periods;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.periods;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("periods=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BusinessHours{", "}", 0, null, null, 56);
    }
}
