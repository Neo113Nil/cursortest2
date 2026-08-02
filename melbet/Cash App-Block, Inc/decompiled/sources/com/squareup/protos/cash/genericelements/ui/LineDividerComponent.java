package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiAppLock;
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
public final class LineDividerComponent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LineDividerComponent> CREATOR;
    public final Boolean use_padding;

    static {
        LineDividerComponent$Companion$ADAPTER$1 lineDividerComponent$Companion$ADAPTER$1 = new LineDividerComponent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LineDividerComponent.class), "type.googleapis.com/squareup.cash.genericelements.ui.LineDividerComponent", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = lineDividerComponent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(lineDividerComponent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineDividerComponent(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.use_padding = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LineDividerComponent)) {
            return false;
        }
        LineDividerComponent lineDividerComponent = (LineDividerComponent) obj;
        return Intrinsics.areEqual(unknownFields(), lineDividerComponent.unknownFields()) && Intrinsics.areEqual(this.use_padding, lineDividerComponent.use_padding);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.use_padding;
        int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAppLock.Builder builder = new UiAppLock.Builder(10);
        builder.activated = this.use_padding;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.use_padding;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("use_padding=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LineDividerComponent{", "}", 0, null, null, 56);
    }
}
