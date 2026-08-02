package com.squareup.protos.cash.p2p.profile_directory.ui;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.earnings.EarningsYearMonth;

/* loaded from: classes7.dex */
public final class Range extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Range> CREATOR;
    public final int end;
    public final int start;

    static {
        Range$Companion$ADAPTER$1 range$Companion$ADAPTER$1 = new Range$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Range.class), "type.googleapis.com/squareup.cash.p2p.profile_directory.ui.Range", Syntax.PROTO_2, null, "squareup/cash/p2p/profile_directory/ui/UIElements.proto");
        ADAPTER = range$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(range$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Range(int i, int i2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.start = i;
        this.end = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        return Intrinsics.areEqual(unknownFields(), range.unknownFields()) && this.start == range.start && this.end == range.end;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = Integer.hashCode(this.end) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.start, unknownFields().hashCode() * 37, 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EarningsYearMonth.Builder builder = new EarningsYearMonth.Builder(4);
        builder.year = Integer.valueOf(this.start);
        builder.month = Integer.valueOf(this.end);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("start=" + this.start);
        arrayList.add("end=" + this.end);
        return CollectionsKt.joinToString$default(arrayList, ", ", "Range{", "}", 0, null, null, 56);
    }
}
