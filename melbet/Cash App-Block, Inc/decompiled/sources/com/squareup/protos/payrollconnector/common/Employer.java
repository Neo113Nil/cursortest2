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
public final class Employer extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Employer> CREATOR;
    public final String canonical_name;
    public final SourceIdentifier source_id;
    public final String token;

    static {
        Employer$Companion$ADAPTER$1 employer$Companion$ADAPTER$1 = new Employer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Employer.class), "type.googleapis.com/squareup.payrollconnector.common.Employer", Syntax.PROTO_2, null, "squareup/payroll-connector/common/PayrollProviderProto.proto");
        ADAPTER = employer$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(employer$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Employer(String str, String str2, SourceIdentifier sourceIdentifier, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.canonical_name = str2;
        this.source_id = sourceIdentifier;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Employer)) {
            return false;
        }
        Employer employer = (Employer) obj;
        return Intrinsics.areEqual(unknownFields(), employer.unknownFields()) && Intrinsics.areEqual(this.token, employer.token) && Intrinsics.areEqual(this.canonical_name, employer.canonical_name) && Intrinsics.areEqual(this.source_id, employer.source_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.canonical_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        SourceIdentifier sourceIdentifier = this.source_id;
        int hashCode4 = hashCode3 + (sourceIdentifier != null ? sourceIdentifier.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Options.Builder builder = new GiftCard.Options.Builder(27);
        builder.label = this.token;
        builder.localizable_label = this.canonical_name;
        builder.client_scenario = this.source_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.canonical_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "canonical_name=", arrayList);
        }
        SourceIdentifier sourceIdentifier = this.source_id;
        if (sourceIdentifier != null) {
            arrayList.add("source_id=" + sourceIdentifier);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Employer{", "}", 0, null, null, 56);
    }
}
