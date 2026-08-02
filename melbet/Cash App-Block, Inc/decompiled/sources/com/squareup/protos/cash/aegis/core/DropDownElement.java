package com.squareup.protos.cash.aegis.core;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
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
import squareup.cash.bills.BillsApplet;

/* loaded from: classes7.dex */
public final class DropDownElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DropDownElement> CREATOR;
    public final List paragraphs;
    public final LocalizedString title;

    static {
        DropDownElement$Companion$ADAPTER$1 dropDownElement$Companion$ADAPTER$1 = new DropDownElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DropDownElement.class), "type.googleapis.com/squareup.cash.aegis.core.DropDownElement", Syntax.PROTO_2, null, "squareup/cash/aegis/core/SafetyEducationHub.proto");
        ADAPTER = dropDownElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(dropDownElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownElement(LocalizedString localizedString, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = localizedString;
        this.paragraphs = TransactorKt.immutableCopyOf("paragraphs", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DropDownElement)) {
            return false;
        }
        DropDownElement dropDownElement = (DropDownElement) obj;
        return Intrinsics.areEqual(unknownFields(), dropDownElement.unknownFields()) && Intrinsics.areEqual(this.title, dropDownElement.title) && Intrinsics.areEqual(this.paragraphs, dropDownElement.paragraphs);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title;
        int hashCode2 = this.paragraphs.hashCode() + ((hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsApplet.FullApplet.Builder builder = new BillsApplet.FullApplet.Builder(1);
        builder.title = this.title;
        builder.lines = this.paragraphs;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        List list = this.paragraphs;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("paragraphs=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DropDownElement{", "}", 0, null, null, 56);
    }

    public DropDownElement(LocalizedString localizedString, List list) {
        this(localizedString, list, ByteString.EMPTY);
    }
}
