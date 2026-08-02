package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.protos.franklin.ui.UiCashLimits;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ViewContextRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ViewContextRenderData> CREATOR;
    public final ViewContext view_context;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ViewContext implements WireEnum {
        public static final /* synthetic */ ViewContext[] $VALUES;
        public static final ViewContextRenderData$ViewContext$Companion$ADAPTER$1 ADAPTER;
        public static final ClientDriven.Companion Companion;
        public static final ViewContext PARENTAL_CONTROLS;

        static {
            ViewContext viewContext = new ViewContext("PARENTAL_CONTROLS", 0);
            PARENTAL_CONTROLS = viewContext;
            $VALUES = new ViewContext[]{viewContext};
            Companion = new ClientDriven.Companion();
            ADAPTER = new ViewContextRenderData$ViewContext$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ViewContext.class), Syntax.PROTO_2, null);
        }

        public static final ViewContext fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return PARENTAL_CONTROLS;
            }
            return null;
        }

        public static ViewContext valueOf(String str) {
            return (ViewContext) Enum.valueOf(ViewContext.class, str);
        }

        public static ViewContext[] values() {
            return (ViewContext[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return 1;
        }
    }

    static {
        ViewContextRenderData$Companion$ADAPTER$1 viewContextRenderData$Companion$ADAPTER$1 = new ViewContextRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ViewContextRenderData.class), "type.googleapis.com/squareup.franklin.ViewContextRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = viewContextRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(viewContextRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewContextRenderData(ViewContext viewContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.view_context = viewContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ViewContextRenderData)) {
            return false;
        }
        ViewContextRenderData viewContextRenderData = (ViewContextRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), viewContextRenderData.unknownFields()) && this.view_context == viewContextRenderData.view_context;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ViewContext viewContext = this.view_context;
        int hashCode2 = hashCode + (viewContext != null ? viewContext.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiCashLimits.Builder builder = new UiCashLimits.Builder(18);
        builder.cash_limit_group = this.view_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ViewContext viewContext = this.view_context;
        if (viewContext != null) {
            arrayList.add("view_context=" + viewContext);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ViewContextRenderData{", "}", 0, null, null, 56);
    }
}
