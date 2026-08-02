package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import coil3.request.ViewTargetRequestManagerKt;
import com.squareup.protos.cash.composer.app.Asset;
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
public final class BaseElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BaseElement> CREATOR;
    public final ViewTargetRequestManagerKt element;

    static {
        BaseElement$Companion$ADAPTER$1 baseElement$Companion$ADAPTER$1 = new BaseElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BaseElement.class), "type.googleapis.com/squareup.cash.genericelements.ui.BaseElement", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = baseElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(baseElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseElement(ViewTargetRequestManagerKt viewTargetRequestManagerKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.element = viewTargetRequestManagerKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BaseElement)) {
            return false;
        }
        BaseElement baseElement = (BaseElement) obj;
        return Intrinsics.areEqual(unknownFields(), baseElement.unknownFields()) && Intrinsics.areEqual(this.element, baseElement.element);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ViewTargetRequestManagerKt viewTargetRequestManagerKt = this.element;
        int hashCode2 = hashCode + (viewTargetRequestManagerKt != null ? viewTargetRequestManagerKt.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Asset.Builder builder = new Asset.Builder(22);
        builder.asset_type = this.element;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ViewTargetRequestManagerKt viewTargetRequestManagerKt = this.element;
        if (viewTargetRequestManagerKt != null) {
            arrayList.add("element=" + viewTargetRequestManagerKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BaseElement{", "}", 0, null, null, 56);
    }
}
