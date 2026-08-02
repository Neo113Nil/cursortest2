package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.datadog.android.ndk.internal.NdkCrashLog;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.InputValue;
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
public final class EducationalSheetContent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EducationalSheetContent> CREATOR;
    public final String analytics_id;
    public final NdkCrashLog.Companion content;

    static {
        EducationalSheetContent$Companion$ADAPTER$1 educationalSheetContent$Companion$ADAPTER$1 = new EducationalSheetContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EducationalSheetContent.class), "type.googleapis.com/squareup.cash.local.client.v1.EducationalSheetContent", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_sheet.proto");
        ADAPTER = educationalSheetContent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(educationalSheetContent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationalSheetContent(NdkCrashLog.Companion companion, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.content = companion;
        this.analytics_id = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EducationalSheetContent)) {
            return false;
        }
        EducationalSheetContent educationalSheetContent = (EducationalSheetContent) obj;
        return Intrinsics.areEqual(unknownFields(), educationalSheetContent.unknownFields()) && Intrinsics.areEqual(this.content, educationalSheetContent.content) && Intrinsics.areEqual(this.analytics_id, educationalSheetContent.analytics_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        NdkCrashLog.Companion companion = this.content;
        int hashCode2 = (hashCode + (companion != null ? companion.hashCode() : 0)) * 37;
        String str = this.analytics_id;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        InputValue.Builder builder = new InputValue.Builder(5);
        builder.value = this.content;
        builder.input_id = this.analytics_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        NdkCrashLog.Companion companion = this.content;
        if (companion != null) {
            arrayList.add("content=" + companion);
        }
        String str = this.analytics_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "analytics_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EducationalSheetContent{", "}", 0, null, null, 56);
    }
}
