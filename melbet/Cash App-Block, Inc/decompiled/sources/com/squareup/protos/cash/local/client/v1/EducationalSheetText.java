package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.protos.cash.local.client.v1.InputValue;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class EducationalSheetText extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EducationalSheetText> CREATOR;
    public final Style style;
    public final String value;

    public enum Style implements WireEnum {
        STYLE_UNSPECIFIED(0),
        STYLE_HERO(1),
        STYLE_HEADING_MEDIUM(2),
        STYLE_BODY(3),
        STYLE_HERO_SUBTITLE(4),
        STYLE_BODY_LEGAL(5),
        STYLE_BRANDED_FOOTNOTE(6),
        STYLE_HEADING_REGULAR(7);

        public static final EducationalSheetText$Style$Companion$ADAPTER$1 ADAPTER;
        public static final SliceStatus.Companion Companion;
        public final int value;

        static {
            Style style = STYLE_UNSPECIFIED;
            Companion = new SliceStatus.Companion();
            ADAPTER = new EducationalSheetText$Style$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Style.class), Syntax.PROTO_2, style);
        }

        Style(int i) {
            this.value = i;
        }

        public static final Style fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 0:
                    return STYLE_UNSPECIFIED;
                case 1:
                    return STYLE_HERO;
                case 2:
                    return STYLE_HEADING_MEDIUM;
                case 3:
                    return STYLE_BODY;
                case 4:
                    return STYLE_HERO_SUBTITLE;
                case 5:
                    return STYLE_BODY_LEGAL;
                case 6:
                    return STYLE_BRANDED_FOOTNOTE;
                case 7:
                    return STYLE_HEADING_REGULAR;
                default:
                    return null;
            }
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        EducationalSheetText$Companion$ADAPTER$1 educationalSheetText$Companion$ADAPTER$1 = new EducationalSheetText$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EducationalSheetText.class), "type.googleapis.com/squareup.cash.local.client.v1.EducationalSheetText", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_sheet.proto");
        ADAPTER = educationalSheetText$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(educationalSheetText$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationalSheetText(String str, Style style, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        style.getClass();
        byteString.getClass();
        this.value = str;
        this.style = style;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EducationalSheetText)) {
            return false;
        }
        EducationalSheetText educationalSheetText = (EducationalSheetText) obj;
        return Intrinsics.areEqual(unknownFields(), educationalSheetText.unknownFields()) && Intrinsics.areEqual(this.value, educationalSheetText.value) && this.style == educationalSheetText.style;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.style.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.value);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        InputValue.Builder builder = new InputValue.Builder(6);
        builder.input_id = this.value;
        builder.value = this.style;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.value, "value=", arrayList);
        arrayList.add("style=" + this.style);
        return CollectionsKt.joinToString$default(arrayList, ", ", "EducationalSheetText{", "}", 0, null, null, 56);
    }
}
