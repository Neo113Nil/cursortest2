package com.squareup.protos.cash.woodrow.syncvalues;

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
public final class PerformanceDetailsUiSections extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PerformanceDetailsUiSections> CREATOR;
    public final List sections;

    static {
        PerformanceDetailsUiSections$Companion$ADAPTER$1 performanceDetailsUiSections$Companion$ADAPTER$1 = new PerformanceDetailsUiSections$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PerformanceDetailsUiSections.class), "type.googleapis.com/squareup.cash.woodrow.syncvalues.PerformanceDetailsUiSections", Syntax.PROTO_3, null, "squareup/cash/woodrow/syncvalues/types.proto");
        ADAPTER = performanceDetailsUiSections$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(performanceDetailsUiSections$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceDetailsUiSections(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.sections = TransactorKt.immutableCopyOf("sections", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PerformanceDetailsUiSections)) {
            return false;
        }
        PerformanceDetailsUiSections performanceDetailsUiSections = (PerformanceDetailsUiSections) obj;
        return Intrinsics.areEqual(unknownFields(), performanceDetailsUiSections.unknownFields()) && Intrinsics.areEqual(this.sections, performanceDetailsUiSections.sections);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.sections.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Headers.Builder builder = new Headers.Builder(10, false);
        builder.header = this.sections;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.sections;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sections=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PerformanceDetailsUiSections{", "}", 0, null, null, 56);
    }
}
