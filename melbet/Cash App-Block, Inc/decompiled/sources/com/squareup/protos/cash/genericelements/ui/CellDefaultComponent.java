package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import coil3.svg.internal.Utils_androidKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.protos.cash.genericelements.ui.ArcadeTextElement;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.lending.Loan;
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
public final class CellDefaultComponent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CellDefaultComponent> CREATOR;
    public final BaseElement accessory;
    public final Utils_androidKt accessoryType;
    public final Action action;
    public final BaseElement body;
    public final String body_text;
    public final ArcadeTextElement.SemanticTextColor body_text_color;
    public final BaseElement icon;
    public final Color icon_background;
    public final String icon_description;
    public final String icon_id;
    public final Color icon_tint;
    public final BaseElement label;
    public final String label_text;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1266type;

    public enum Type implements WireEnum {
        LARGE_ICON(1),
        SMALL_ICON(2);

        public final int value;
        public static final ImageLayout.Companion Companion = new ImageLayout.Companion();
        public static final CellDefaultComponent$Type$Companion$ADAPTER$1 ADAPTER = new CellDefaultComponent$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, null);

        Type(int i) {
            this.value = i;
        }

        public static final Type fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return LARGE_ICON;
            }
            if (i != 2) {
                return null;
            }
            return SMALL_ICON;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CellDefaultComponent$Companion$ADAPTER$1 cellDefaultComponent$Companion$ADAPTER$1 = new CellDefaultComponent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CellDefaultComponent.class), "type.googleapis.com/squareup.cash.genericelements.ui.CellDefaultComponent", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = cellDefaultComponent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cellDefaultComponent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellDefaultComponent(Action action, BaseElement baseElement, String str, Color color, Color color2, String str2, BaseElement baseElement2, BaseElement baseElement3, BaseElement baseElement4, Type type2, Utils_androidKt utils_androidKt, String str3, String str4, ArcadeTextElement.SemanticTextColor semanticTextColor, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.action = action;
        this.icon = baseElement;
        this.icon_id = str;
        this.icon_tint = color;
        this.icon_background = color2;
        this.icon_description = str2;
        this.label = baseElement2;
        this.body = baseElement3;
        this.accessory = baseElement4;
        this.f1266type = type2;
        this.accessoryType = utils_androidKt;
        this.label_text = str3;
        this.body_text = str4;
        this.body_text_color = semanticTextColor;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CellDefaultComponent)) {
            return false;
        }
        CellDefaultComponent cellDefaultComponent = (CellDefaultComponent) obj;
        return Intrinsics.areEqual(unknownFields(), cellDefaultComponent.unknownFields()) && Intrinsics.areEqual(this.action, cellDefaultComponent.action) && Intrinsics.areEqual(this.icon, cellDefaultComponent.icon) && Intrinsics.areEqual(this.icon_id, cellDefaultComponent.icon_id) && Intrinsics.areEqual(this.icon_tint, cellDefaultComponent.icon_tint) && Intrinsics.areEqual(this.icon_background, cellDefaultComponent.icon_background) && Intrinsics.areEqual(this.icon_description, cellDefaultComponent.icon_description) && Intrinsics.areEqual(this.label, cellDefaultComponent.label) && Intrinsics.areEqual(this.body, cellDefaultComponent.body) && Intrinsics.areEqual(this.accessory, cellDefaultComponent.accessory) && this.f1266type == cellDefaultComponent.f1266type && Intrinsics.areEqual(this.accessoryType, cellDefaultComponent.accessoryType) && Intrinsics.areEqual(this.label_text, cellDefaultComponent.label_text) && Intrinsics.areEqual(this.body_text, cellDefaultComponent.body_text) && this.body_text_color == cellDefaultComponent.body_text_color;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Action action = this.action;
        int hashCode2 = (hashCode + (action != null ? action.hashCode() : 0)) * 37;
        BaseElement baseElement = this.icon;
        int hashCode3 = (hashCode2 + (baseElement != null ? baseElement.hashCode() : 0)) * 37;
        String str = this.icon_id;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        Color color = this.icon_tint;
        int hashCode5 = (hashCode4 + (color != null ? color.hashCode() : 0)) * 37;
        Color color2 = this.icon_background;
        int hashCode6 = (hashCode5 + (color2 != null ? color2.hashCode() : 0)) * 37;
        String str2 = this.icon_description;
        int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
        BaseElement baseElement2 = this.label;
        int hashCode8 = (hashCode7 + (baseElement2 != null ? baseElement2.hashCode() : 0)) * 37;
        BaseElement baseElement3 = this.body;
        int hashCode9 = (hashCode8 + (baseElement3 != null ? baseElement3.hashCode() : 0)) * 37;
        BaseElement baseElement4 = this.accessory;
        int hashCode10 = (hashCode9 + (baseElement4 != null ? baseElement4.hashCode() : 0)) * 37;
        Type type2 = this.f1266type;
        int hashCode11 = (hashCode10 + (type2 != null ? type2.hashCode() : 0)) * 37;
        Utils_androidKt utils_androidKt = this.accessoryType;
        int hashCode12 = (hashCode11 + (utils_androidKt != null ? utils_androidKt.hashCode() : 0)) * 37;
        String str3 = this.label_text;
        int hashCode13 = (hashCode12 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.body_text;
        int hashCode14 = (hashCode13 + (str4 != null ? str4.hashCode() : 0)) * 37;
        ArcadeTextElement.SemanticTextColor semanticTextColor = this.body_text_color;
        int hashCode15 = hashCode14 + (semanticTextColor != null ? semanticTextColor.hashCode() : 0);
        this.hashCode = hashCode15;
        return hashCode15;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Loan.Builder builder = new Loan.Builder(5);
        builder.borrowed_at = this.action;
        builder.due_at = this.icon;
        builder.token = this.icon_id;
        builder.principal_amount = this.icon_tint;
        builder.setup_fee_amount = this.icon_background;
        builder.credit_line_token = this.icon_description;
        builder.outstanding_amount = this.label;
        builder.late_fee_amount = this.body;
        builder.interest_amount = this.accessory;
        builder.setup_fee_bps = this.f1266type;
        builder.detail_rows = this.accessoryType;
        builder.state = this.label_text;
        builder.lending_product = this.body_text;
        builder.bnpl_data = this.body_text_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        BaseElement baseElement = this.icon;
        if (baseElement != null) {
            arrayList.add("icon=" + baseElement);
        }
        String str = this.icon_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "icon_id=", arrayList);
        }
        Color color = this.icon_tint;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("icon_tint=", color, arrayList);
        }
        Color color2 = this.icon_background;
        if (color2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("icon_background=", color2, arrayList);
        }
        String str2 = this.icon_description;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "icon_description=", arrayList);
        }
        BaseElement baseElement2 = this.label;
        if (baseElement2 != null) {
            arrayList.add("label=" + baseElement2);
        }
        BaseElement baseElement3 = this.body;
        if (baseElement3 != null) {
            arrayList.add("body=" + baseElement3);
        }
        BaseElement baseElement4 = this.accessory;
        if (baseElement4 != null) {
            arrayList.add("accessory=" + baseElement4);
        }
        Type type2 = this.f1266type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        Utils_androidKt utils_androidKt = this.accessoryType;
        if (utils_androidKt != null) {
            arrayList.add("accessoryType=" + utils_androidKt);
        }
        String str3 = this.label_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "label_text=", arrayList);
        }
        String str4 = this.body_text;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "body_text=", arrayList);
        }
        ArcadeTextElement.SemanticTextColor semanticTextColor = this.body_text_color;
        if (semanticTextColor != null) {
            arrayList.add("body_text_color=" + semanticTextColor);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CellDefaultComponent{", "}", 0, null, null, 56);
    }
}
