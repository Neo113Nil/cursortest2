package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzhs;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.Group;
import com.squareup.protos.cash.investcrypto.resources.Origin;
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

/* loaded from: classes7.dex */
public final class EducationalSheetButton extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EducationalSheetButton> CREATOR;
    public final zzhs action;
    public final String label;
    public final Style style;

    public enum Style implements WireEnum {
        STYLE_UNSPECIFIED(0),
        STYLE_PRIMARY(1),
        STYLE_SECONDARY(2);

        public static final EducationalSheetButton$Style$Companion$ADAPTER$1 ADAPTER;
        public static final Origin.Companion Companion;
        public final int value;

        static {
            Style style = STYLE_UNSPECIFIED;
            Companion = new Origin.Companion();
            ADAPTER = new EducationalSheetButton$Style$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Style.class), Syntax.PROTO_2, style);
        }

        Style(int i) {
            this.value = i;
        }

        public static final Style fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return STYLE_UNSPECIFIED;
            }
            if (i == 1) {
                return STYLE_PRIMARY;
            }
            if (i != 2) {
                return null;
            }
            return STYLE_SECONDARY;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        EducationalSheetButton$Companion$ADAPTER$1 educationalSheetButton$Companion$ADAPTER$1 = new EducationalSheetButton$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EducationalSheetButton.class), "type.googleapis.com/squareup.cash.local.client.v1.EducationalSheetButton", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_sheet.proto");
        ADAPTER = educationalSheetButton$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(educationalSheetButton$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationalSheetButton(zzhs zzhsVar, String str, Style style, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.action = zzhsVar;
        this.label = str;
        this.style = style;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EducationalSheetButton)) {
            return false;
        }
        EducationalSheetButton educationalSheetButton = (EducationalSheetButton) obj;
        return Intrinsics.areEqual(unknownFields(), educationalSheetButton.unknownFields()) && Intrinsics.areEqual(this.action, educationalSheetButton.action) && Intrinsics.areEqual(this.label, educationalSheetButton.label) && this.style == educationalSheetButton.style;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzhs zzhsVar = this.action;
        int hashCode2 = (hashCode + (zzhsVar != null ? zzhsVar.hashCode() : 0)) * 37;
        String str = this.label;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Style style = this.style;
        int hashCode4 = hashCode3 + (style != null ? style.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Group.Builder builder = new Group.Builder(19);
        builder.group_image = this.action;
        builder.name = this.label;
        builder.participants = this.style;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzhs zzhsVar = this.action;
        if (zzhsVar != null) {
            arrayList.add("action=" + zzhsVar);
        }
        String str = this.label;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
        }
        Style style = this.style;
        if (style != null) {
            arrayList.add("style=" + style);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EducationalSheetButton{", "}", 0, null, null, 56);
    }
}
