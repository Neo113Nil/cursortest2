package com.squareup.protos.cash.discover.api.app.v1.model;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.grantly.api.LoanOption;
import com.squareup.protos.cash.piggybank.api.v2.InterestTiersApyRates;
import com.squareup.protos.cash.ui.Color;
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

/* loaded from: classes7.dex */
public final class GraphSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GraphSection> CREATOR;
    public final Color background_color;
    public final Color line_color;
    public final List points;

    public final class Point extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Point> CREATOR;
        public final Double x_value;
        public final Double y_value;

        static {
            GraphSection$Point$Companion$ADAPTER$1 graphSection$Point$Companion$ADAPTER$1 = new GraphSection$Point$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Point.class), "type.googleapis.com/squareup.cash.discover.api.app.v1.model.GraphSection.Point", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v1/model/sections.proto");
            ADAPTER = graphSection$Point$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(graphSection$Point$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Point(Double d, Double d2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.x_value = d;
            this.y_value = d2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Point)) {
                return false;
            }
            Point point = (Point) obj;
            return Intrinsics.areEqual(unknownFields(), point.unknownFields()) && Intrinsics.areEqual(this.x_value, point.x_value) && Intrinsics.areEqual(this.y_value, point.y_value);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Double d = this.x_value;
            int hashCode2 = (hashCode + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
            Double d2 = this.y_value;
            int hashCode3 = hashCode2 + (d2 != null ? Double.hashCode(d2.doubleValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            InterestTiersApyRates.Builder builder = new InterestTiersApyRates.Builder(1);
            builder.standard_interest_apy_rate = this.x_value;
            builder.enhanced_interest_apy_rate = this.y_value;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Double d = this.x_value;
            if (d != null) {
                SizeMode$EnumUnboxingLocalUtility.m("x_value=", d, arrayList);
            }
            Double d2 = this.y_value;
            if (d2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("y_value=", d2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Point{", "}", 0, null, null, 56);
        }
    }

    static {
        GraphSection$Companion$ADAPTER$1 graphSection$Companion$ADAPTER$1 = new GraphSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GraphSection.class), "type.googleapis.com/squareup.cash.discover.api.app.v1.model.GraphSection", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v1/model/sections.proto");
        ADAPTER = graphSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(graphSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphSection(List list, Color color, Color color2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.line_color = color;
        this.background_color = color2;
        this.points = TransactorKt.immutableCopyOf("points", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GraphSection)) {
            return false;
        }
        GraphSection graphSection = (GraphSection) obj;
        return Intrinsics.areEqual(unknownFields(), graphSection.unknownFields()) && Intrinsics.areEqual(this.points, graphSection.points) && Intrinsics.areEqual(this.line_color, graphSection.line_color) && Intrinsics.areEqual(this.background_color, graphSection.background_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.points);
        Color color = this.line_color;
        int hashCode = (m + (color != null ? color.hashCode() : 0)) * 37;
        Color color2 = this.background_color;
        int hashCode2 = hashCode + (color2 != null ? color2.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LoanOption.Builder builder = new LoanOption.Builder(12);
        builder.payment_schedule = this.points;
        builder.loan_type = this.line_color;
        builder.tila_data = this.background_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.points;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("points=", arrayList, list);
        }
        Color color = this.line_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("line_color=", color, arrayList);
        }
        Color color2 = this.background_color;
        if (color2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GraphSection{", "}", 0, null, null, 56);
    }
}
