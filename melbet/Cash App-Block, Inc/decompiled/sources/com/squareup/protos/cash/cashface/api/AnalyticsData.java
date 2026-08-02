package com.squareup.protos.cash.cashface.api;

import android.os.Parcelable;
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
public final class AnalyticsData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AnalyticsData> CREATOR;
    public final String profile_elements_data;

    static {
        AnalyticsData$Companion$ADAPTER$1 analyticsData$Companion$ADAPTER$1 = new AnalyticsData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AnalyticsData.class), "type.googleapis.com/squareup.cash.cashface.api.AnalyticsData", Syntax.PROTO_2, null, "squareup/cash/cashface/api/AnalyticsData.proto");
        ADAPTER = analyticsData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(analyticsData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsData(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.profile_elements_data = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnalyticsData)) {
            return false;
        }
        AnalyticsData analyticsData = (AnalyticsData) obj;
        return Intrinsics.areEqual(unknownFields(), analyticsData.unknownFields()) && Intrinsics.areEqual(this.profile_elements_data, analyticsData.profile_elements_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.profile_elements_data;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Banner.Builder builder = new Banner.Builder(4);
        builder.banner_color = this.profile_elements_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.profile_elements_data != null) {
            arrayList.add("profile_elements_data=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AnalyticsData{", "}", 0, null, null, 56);
    }
}
