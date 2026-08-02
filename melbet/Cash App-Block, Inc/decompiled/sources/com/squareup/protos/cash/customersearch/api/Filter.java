package com.squareup.protos.cash.customersearch.api;

import android.os.Parcelable;
import app.cash.zipline.internal.SignaturePayloadKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Action;
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
public final class Filter extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Filter> CREATOR;
    public final String filter_name;
    public final SignaturePayloadKt option;

    static {
        Filter$Companion$ADAPTER$1 filter$Companion$ADAPTER$1 = new Filter$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Filter.class), "type.googleapis.com/squareup.cash.customersearch.api.Filter", Syntax.PROTO_2, null, "squareup/cash/customersearch/api/SearchCommon.proto");
        ADAPTER = filter$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(filter$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Filter(String str, SignaturePayloadKt signaturePayloadKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.filter_name = str;
        this.option = signaturePayloadKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Filter)) {
            return false;
        }
        Filter filter = (Filter) obj;
        return Intrinsics.areEqual(unknownFields(), filter.unknownFields()) && Intrinsics.areEqual(this.filter_name, filter.filter_name) && Intrinsics.areEqual(this.option, filter.option);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.filter_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        SignaturePayloadKt signaturePayloadKt = this.option;
        int hashCode3 = hashCode2 + (signaturePayloadKt != null ? signaturePayloadKt.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(4);
        builder.f1268type = this.filter_name;
        builder.details = this.option;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.filter_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "filter_name=", arrayList);
        }
        SignaturePayloadKt signaturePayloadKt = this.option;
        if (signaturePayloadKt != null) {
            arrayList.add("option=" + signaturePayloadKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Filter{", "}", 0, null, null, 56);
    }

    public /* synthetic */ Filter(String str, SignaturePayloadKt signaturePayloadKt) {
        this(str, signaturePayloadKt, ByteString.EMPTY);
    }
}
