package com.squareup.protos.cash.woodrow.syncvalues;

import android.os.Parcelable;
import com.squareup.protos.cash.ui.SplitButtons;
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
public final class PerformanceDetailsUi extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PerformanceDetailsUi> CREATOR;
    public final PerformanceDetailsUiFooter footer;
    public final PerformanceDetailsUiSections sections;

    static {
        PerformanceDetailsUi$Companion$ADAPTER$1 performanceDetailsUi$Companion$ADAPTER$1 = new PerformanceDetailsUi$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PerformanceDetailsUi.class), "type.googleapis.com/squareup.cash.woodrow.syncvalues.PerformanceDetailsUi", Syntax.PROTO_3, null, "squareup/cash/woodrow/syncvalues/types.proto");
        ADAPTER = performanceDetailsUi$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(performanceDetailsUi$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceDetailsUi(PerformanceDetailsUiSections performanceDetailsUiSections, PerformanceDetailsUiFooter performanceDetailsUiFooter, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.sections = performanceDetailsUiSections;
        this.footer = performanceDetailsUiFooter;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PerformanceDetailsUi)) {
            return false;
        }
        PerformanceDetailsUi performanceDetailsUi = (PerformanceDetailsUi) obj;
        return Intrinsics.areEqual(unknownFields(), performanceDetailsUi.unknownFields()) && Intrinsics.areEqual(this.sections, performanceDetailsUi.sections) && Intrinsics.areEqual(this.footer, performanceDetailsUi.footer);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PerformanceDetailsUiSections performanceDetailsUiSections = this.sections;
        int hashCode2 = (hashCode + (performanceDetailsUiSections != null ? performanceDetailsUiSections.hashCode() : 0)) * 37;
        PerformanceDetailsUiFooter performanceDetailsUiFooter = this.footer;
        int hashCode3 = hashCode2 + (performanceDetailsUiFooter != null ? performanceDetailsUiFooter.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SplitButtons.Builder builder = new SplitButtons.Builder(25);
        builder.primary_button = this.sections;
        builder.secondary_button = this.footer;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PerformanceDetailsUiSections performanceDetailsUiSections = this.sections;
        if (performanceDetailsUiSections != null) {
            arrayList.add("sections=" + performanceDetailsUiSections);
        }
        PerformanceDetailsUiFooter performanceDetailsUiFooter = this.footer;
        if (performanceDetailsUiFooter != null) {
            arrayList.add("footer=" + performanceDetailsUiFooter);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PerformanceDetailsUi{", "}", 0, null, null, 56);
    }
}
