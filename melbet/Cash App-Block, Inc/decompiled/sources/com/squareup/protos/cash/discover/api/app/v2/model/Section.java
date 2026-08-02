package com.squareup.protos.cash.discover.api.app.v2.model;

import android.os.Parcelable;
import com.squareup.protos.cash.composer.app.Asset;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.grantly.api.Action;
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
public final class Section extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Section> CREATOR;
    public final Section$Content$RowSection content;

    public final class Modal extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Modal> CREATOR;
        public final Button button;
        public final Text text;

        static {
            Section$Modal$Companion$ADAPTER$1 section$Modal$Companion$ADAPTER$1 = new Section$Modal$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Modal.class), "type.googleapis.com/squareup.cash.discover.api.app.v2.model.Section.Modal", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v2/model/section.proto");
            ADAPTER = section$Modal$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(section$Modal$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Modal(Text text, Button button, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = text;
            this.button = button;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Modal)) {
                return false;
            }
            Modal modal = (Modal) obj;
            return Intrinsics.areEqual(unknownFields(), modal.unknownFields()) && Intrinsics.areEqual(this.text, modal.text) && Intrinsics.areEqual(this.button, modal.button);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Text text = this.text;
            int hashCode2 = (hashCode + (text != null ? text.hashCode() : 0)) * 37;
            Button button = this.button;
            int hashCode3 = hashCode2 + (button != null ? button.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Action.Builder builder = new Action.Builder(11);
            builder.f1268type = this.text;
            builder.details = this.button;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Text text = this.text;
            if (text != null) {
                arrayList.add("text=" + text);
            }
            Button button = this.button;
            if (button != null) {
                arrayList.add("button=" + button);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Modal{", "}", 0, null, null, 56);
        }
    }

    static {
        Section$Companion$ADAPTER$1 section$Companion$ADAPTER$1 = new Section$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Section.class), "type.googleapis.com/squareup.cash.discover.api.app.v2.model.Section", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v2/model/section.proto");
        ADAPTER = section$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(section$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Section(Section$Content$RowSection section$Content$RowSection, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.content = section$Content$RowSection;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Section)) {
            return false;
        }
        Section section = (Section) obj;
        return Intrinsics.areEqual(unknownFields(), section.unknownFields()) && Intrinsics.areEqual(this.content, section.content);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Section$Content$RowSection section$Content$RowSection = this.content;
        int hashCode2 = hashCode + (section$Content$RowSection != null ? section$Content$RowSection.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Asset.Builder builder = new Asset.Builder(16);
        builder.asset_type = this.content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Section$Content$RowSection section$Content$RowSection = this.content;
        if (section$Content$RowSection != null) {
            arrayList.add("content=" + section$Content$RowSection);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Section{", "}", 0, null, null, 56);
    }
}
