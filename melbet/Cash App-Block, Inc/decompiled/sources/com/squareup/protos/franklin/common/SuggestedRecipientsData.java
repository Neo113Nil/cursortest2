package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes.dex */
public final class SuggestedRecipientsData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SuggestedRecipientsData> CREATOR;
    public final List groups;
    public final List suggested_customers;

    static {
        SuggestedRecipientsData$Companion$ADAPTER$1 suggestedRecipientsData$Companion$ADAPTER$1 = new SuggestedRecipientsData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SuggestedRecipientsData.class), "type.googleapis.com/squareup.franklin.common.SuggestedRecipientsData", Syntax.PROTO_2, null, "squareup/franklin/common/recipient.proto");
        ADAPTER = suggestedRecipientsData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(suggestedRecipientsData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestedRecipientsData(List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.suggested_customers = TransactorKt.immutableCopyOf("suggested_customers", list);
        this.groups = TransactorKt.immutableCopyOf("groups", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SuggestedRecipientsData)) {
            return false;
        }
        SuggestedRecipientsData suggestedRecipientsData = (SuggestedRecipientsData) obj;
        return Intrinsics.areEqual(unknownFields(), suggestedRecipientsData.unknownFields()) && Intrinsics.areEqual(this.suggested_customers, suggestedRecipientsData.suggested_customers) && Intrinsics.areEqual(this.groups, suggestedRecipientsData.groups);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.groups.hashCode() + Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.suggested_customers);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GreenBenefitsV1.Builder builder = new GreenBenefitsV1.Builder(18);
        builder.card_holder_benefits = this.suggested_customers;
        builder.green_status_benefits = this.groups;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.suggested_customers;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("suggested_customers=", arrayList, list);
        }
        List list2 = this.groups;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("groups=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SuggestedRecipientsData{", "}", 0, null, null, 56);
    }
}
