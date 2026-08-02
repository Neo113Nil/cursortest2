package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.LoanOption;
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
public final class BaseCardComponent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BaseCardComponent> CREATOR;
    public final List elements;
    public final StyleAttributes style_attributes;
    public final Action tap;

    static {
        BaseCardComponent$Companion$ADAPTER$1 baseCardComponent$Companion$ADAPTER$1 = new BaseCardComponent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BaseCardComponent.class), "type.googleapis.com/squareup.cash.genericelements.ui.BaseCardComponent", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = baseCardComponent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(baseCardComponent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCardComponent(List list, StyleAttributes styleAttributes, Action action, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.style_attributes = styleAttributes;
        this.tap = action;
        this.elements = TransactorKt.immutableCopyOf("elements", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BaseCardComponent)) {
            return false;
        }
        BaseCardComponent baseCardComponent = (BaseCardComponent) obj;
        return Intrinsics.areEqual(unknownFields(), baseCardComponent.unknownFields()) && Intrinsics.areEqual(this.elements, baseCardComponent.elements) && Intrinsics.areEqual(this.style_attributes, baseCardComponent.style_attributes) && Intrinsics.areEqual(this.tap, baseCardComponent.tap);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.elements);
        StyleAttributes styleAttributes = this.style_attributes;
        int hashCode = (m + (styleAttributes != null ? styleAttributes.hashCode() : 0)) * 37;
        Action action = this.tap;
        int hashCode2 = hashCode + (action != null ? action.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LoanOption.Builder builder = new LoanOption.Builder(23);
        builder.payment_schedule = this.elements;
        builder.loan_type = this.style_attributes;
        builder.tila_data = this.tap;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.elements;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("elements=", arrayList, list);
        }
        StyleAttributes styleAttributes = this.style_attributes;
        if (styleAttributes != null) {
            arrayList.add("style_attributes=" + styleAttributes);
        }
        Action action = this.tap;
        if (action != null) {
            arrayList.add("tap=" + action);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BaseCardComponent{", "}", 0, null, null, 56);
    }
}
