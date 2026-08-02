package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.PoolsConfig;
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
public final class SquarePayrollRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SquarePayrollRenderData> CREATOR;
    public final String employer_display_name;
    public final String paystub_link;
    public final String paystub_url;

    static {
        SquarePayrollRenderData$Companion$ADAPTER$1 squarePayrollRenderData$Companion$ADAPTER$1 = new SquarePayrollRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SquarePayrollRenderData.class), "type.googleapis.com/squareup.franklin.SquarePayrollRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = squarePayrollRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(squarePayrollRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquarePayrollRenderData(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.employer_display_name = str;
        this.paystub_url = str2;
        this.paystub_link = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SquarePayrollRenderData)) {
            return false;
        }
        SquarePayrollRenderData squarePayrollRenderData = (SquarePayrollRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), squarePayrollRenderData.unknownFields()) && Intrinsics.areEqual(this.employer_display_name, squarePayrollRenderData.employer_display_name) && Intrinsics.areEqual(this.paystub_url, squarePayrollRenderData.paystub_url) && Intrinsics.areEqual(this.paystub_link, squarePayrollRenderData.paystub_link);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.employer_display_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.paystub_url;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.paystub_link;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolsConfig.Builder builder = new PoolsConfig.Builder(8);
        builder.nux_details_img_url = this.employer_display_name;
        builder.nux_activity_img_url = this.paystub_url;
        builder.share_background_img_url = this.paystub_link;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.employer_display_name != null) {
            arrayList.add("employer_display_name=██");
        }
        String str = this.paystub_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "paystub_url=", arrayList);
        }
        String str2 = this.paystub_link;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "paystub_link=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SquarePayrollRenderData{", "}", 0, null, null, 56);
    }
}
