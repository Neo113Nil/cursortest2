package com.squareup.protos.cash.p2p.profile_directory.ui;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.protos.franklin.common.AppLinks;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ShopInfoHalfSheet extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ShopInfoHalfSheet> CREATOR;
    public final Button action_button;
    public final AppLinks app_links;
    public final List bullets;
    public final zzkd content;
    public final DisplayCriteria display_criteria;
    public final Text footer;
    public final HorizontalAlignment image_horizontal_alignment;
    public final Integer image_max_px_height;
    public final Text subtitle;
    public final Text title;

    public enum DisplayCriteria implements WireEnum {
        ONCE_PER_SECTION(0),
        ALWAYS(1),
        NEVER(2);

        public static final ShopInfoHalfSheet$DisplayCriteria$Companion$ADAPTER$1 ADAPTER;
        public static final FeeType.Companion Companion;
        public final int value;

        static {
            DisplayCriteria displayCriteria = ONCE_PER_SECTION;
            Companion = new FeeType.Companion();
            ADAPTER = new ShopInfoHalfSheet$DisplayCriteria$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DisplayCriteria.class), Syntax.PROTO_2, displayCriteria);
        }

        DisplayCriteria(int i) {
            this.value = i;
        }

        public static final DisplayCriteria fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return ONCE_PER_SECTION;
            }
            if (i == 1) {
                return ALWAYS;
            }
            if (i != 2) {
                return null;
            }
            return NEVER;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        ShopInfoHalfSheet$Companion$ADAPTER$1 shopInfoHalfSheet$Companion$ADAPTER$1 = new ShopInfoHalfSheet$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ShopInfoHalfSheet.class), "type.googleapis.com/squareup.cash.p2p.profile_directory.ui.ShopInfoHalfSheet", Syntax.PROTO_2, null, "squareup/cash/p2p/profile_directory/ui/UIElements.proto");
        ADAPTER = shopInfoHalfSheet$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(shopInfoHalfSheet$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopInfoHalfSheet(zzkd zzkdVar, Integer num, HorizontalAlignment horizontalAlignment, Text text, Text text2, List list, Button button, Text text3, DisplayCriteria displayCriteria, AppLinks appLinks, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.content = zzkdVar;
        this.image_max_px_height = num;
        this.image_horizontal_alignment = horizontalAlignment;
        this.title = text;
        this.subtitle = text2;
        this.action_button = button;
        this.footer = text3;
        this.display_criteria = displayCriteria;
        this.app_links = appLinks;
        this.bullets = TransactorKt.immutableCopyOf("bullets", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShopInfoHalfSheet)) {
            return false;
        }
        ShopInfoHalfSheet shopInfoHalfSheet = (ShopInfoHalfSheet) obj;
        return Intrinsics.areEqual(unknownFields(), shopInfoHalfSheet.unknownFields()) && Intrinsics.areEqual(this.content, shopInfoHalfSheet.content) && Intrinsics.areEqual(this.image_max_px_height, shopInfoHalfSheet.image_max_px_height) && this.image_horizontal_alignment == shopInfoHalfSheet.image_horizontal_alignment && Intrinsics.areEqual(this.title, shopInfoHalfSheet.title) && Intrinsics.areEqual(this.subtitle, shopInfoHalfSheet.subtitle) && Intrinsics.areEqual(this.bullets, shopInfoHalfSheet.bullets) && Intrinsics.areEqual(this.action_button, shopInfoHalfSheet.action_button) && Intrinsics.areEqual(this.footer, shopInfoHalfSheet.footer) && this.display_criteria == shopInfoHalfSheet.display_criteria && Intrinsics.areEqual(this.app_links, shopInfoHalfSheet.app_links);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzkd zzkdVar = this.content;
        int hashCode2 = (hashCode + (zzkdVar != null ? zzkdVar.hashCode() : 0)) * 37;
        Integer num = this.image_max_px_height;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        HorizontalAlignment horizontalAlignment = this.image_horizontal_alignment;
        int hashCode4 = (hashCode3 + (horizontalAlignment != null ? horizontalAlignment.hashCode() : 0)) * 37;
        Text text = this.title;
        int hashCode5 = (hashCode4 + (text != null ? text.hashCode() : 0)) * 37;
        Text text2 = this.subtitle;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (text2 != null ? text2.hashCode() : 0)) * 37, 37, this.bullets);
        Button button = this.action_button;
        int hashCode6 = (m + (button != null ? button.hashCode() : 0)) * 37;
        Text text3 = this.footer;
        int hashCode7 = (hashCode6 + (text3 != null ? text3.hashCode() : 0)) * 37;
        DisplayCriteria displayCriteria = this.display_criteria;
        int hashCode8 = (hashCode7 + (displayCriteria != null ? displayCriteria.hashCode() : 0)) * 37;
        AppLinks appLinks = this.app_links;
        int hashCode9 = hashCode8 + (appLinks != null ? appLinks.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CashInRequest.Builder builder = new CashInRequest.Builder(11);
        builder.request_context = this.content;
        builder.external_id = this.image_max_px_height;
        builder.passcode_token = this.image_horizontal_alignment;
        builder.external_client_transfer_token = this.title;
        builder.source = this.subtitle;
        builder.target = this.bullets;
        builder.amount = this.action_button;
        builder.call_context = this.footer;
        builder.forwarded_call_context = this.display_criteria;
        builder.client_verified_digital_wallet = this.app_links;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzkd zzkdVar = this.content;
        if (zzkdVar != null) {
            arrayList.add("content=" + zzkdVar);
        }
        Integer num = this.image_max_px_height;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("image_max_px_height=", num, arrayList);
        }
        HorizontalAlignment horizontalAlignment = this.image_horizontal_alignment;
        if (horizontalAlignment != null) {
            arrayList.add("image_horizontal_alignment=" + horizontalAlignment);
        }
        Text text = this.title;
        if (text != null) {
            SizeMode$EnumUnboxingLocalUtility.m("title=", text, arrayList);
        }
        Text text2 = this.subtitle;
        if (text2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("subtitle=", text2, arrayList);
        }
        List list = this.bullets;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("bullets=", arrayList, list);
        }
        Button button = this.action_button;
        if (button != null) {
            arrayList.add("action_button=" + button);
        }
        Text text3 = this.footer;
        if (text3 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("footer=", text3, arrayList);
        }
        DisplayCriteria displayCriteria = this.display_criteria;
        if (displayCriteria != null) {
            arrayList.add("display_criteria=" + displayCriteria);
        }
        AppLinks appLinks = this.app_links;
        if (appLinks != null) {
            arrayList.add("app_links=" + appLinks);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ShopInfoHalfSheet{", "}", 0, null, null, 56);
    }
}
