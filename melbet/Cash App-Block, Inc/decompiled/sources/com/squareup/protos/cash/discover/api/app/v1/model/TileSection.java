package com.squareup.protos.cash.discover.api.app.v1.model;

import android.os.Parcelable;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.protos.cash.janus.api.ContactAlias;
import com.squareup.protos.cash.ui.Image;
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

/* loaded from: classes.dex */
public final class TileSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TileSection> CREATOR;
    public final ElementPlacement button_placement;
    public final Composition composition;
    public final DetailsPage details_page;
    public final Image image;
    public final SubtitlePlacement subtitle_placement;
    public final ElementPlacement text_placement;
    public final Double tile_ratio;

    /* loaded from: classes7.dex */
    public enum Composition implements WireEnum {
        TOP_LEFT_TEXT(1),
        BOTTOM_LEFT_TEXT(2);

        public final int value;
        public static final Action.Type.Companion Companion = new Action.Type.Companion();
        public static final TileSection$Composition$Companion$ADAPTER$1 ADAPTER = new TileSection$Composition$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Composition.class), Syntax.PROTO_2, null);

        Composition(int i) {
            this.value = i;
        }

        public static final Composition fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return TOP_LEFT_TEXT;
            }
            if (i != 2) {
                return null;
            }
            return BOTTOM_LEFT_TEXT;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes7.dex */
    public enum ElementPlacement implements WireEnum {
        ELEMENT_PLACEMENT_UNSPECIFIED(0),
        ELEMENT_PLACEMENT_TOP_LEFT(1),
        ELEMENT_PLACEMENT_BOTTOM_LEFT(2),
        ELEMENT_PLACEMENT_TOP_RIGHT(3),
        ELEMENT_PLACEMENT_BOTTOM_RIGHT(4);

        public static final TileSection$ElementPlacement$Companion$ADAPTER$1 ADAPTER;
        public static final Alignment.Companion Companion;
        public final int value;

        static {
            ElementPlacement elementPlacement = ELEMENT_PLACEMENT_UNSPECIFIED;
            Companion = new Alignment.Companion();
            ADAPTER = new TileSection$ElementPlacement$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ElementPlacement.class), Syntax.PROTO_2, elementPlacement);
        }

        ElementPlacement(int i) {
            this.value = i;
        }

        public static final ElementPlacement fromValue(int i) {
            Companion.getClass();
            return Alignment.Companion.m3860fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    /* loaded from: classes7.dex */
    public enum SubtitlePlacement implements WireEnum {
        ABOVE_TITLE(1),
        BELOW_TITLE(2);

        public final int value;
        public static final Channel.Companion Companion = new Channel.Companion();
        public static final TileSection$SubtitlePlacement$Companion$ADAPTER$1 ADAPTER = new TileSection$SubtitlePlacement$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SubtitlePlacement.class), Syntax.PROTO_2, null);

        SubtitlePlacement(int i) {
            this.value = i;
        }

        public static final SubtitlePlacement fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return ABOVE_TITLE;
            }
            if (i != 2) {
                return null;
            }
            return BELOW_TITLE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        TileSection$Companion$ADAPTER$1 tileSection$Companion$ADAPTER$1 = new TileSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TileSection.class), "type.googleapis.com/squareup.cash.discover.api.app.v1.model.TileSection", Syntax.PROTO_2, null, "squareup/cash/discover/api/app/v1/model/sections.proto");
        ADAPTER = tileSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(tileSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileSection(Image image, Double d, Composition composition, ElementPlacement elementPlacement, ElementPlacement elementPlacement2, SubtitlePlacement subtitlePlacement, DetailsPage detailsPage, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.image = image;
        this.tile_ratio = d;
        this.composition = composition;
        this.text_placement = elementPlacement;
        this.button_placement = elementPlacement2;
        this.subtitle_placement = subtitlePlacement;
        this.details_page = detailsPage;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TileSection)) {
            return false;
        }
        TileSection tileSection = (TileSection) obj;
        return Intrinsics.areEqual(unknownFields(), tileSection.unknownFields()) && Intrinsics.areEqual(this.image, tileSection.image) && Intrinsics.areEqual(this.tile_ratio, tileSection.tile_ratio) && this.composition == tileSection.composition && this.text_placement == tileSection.text_placement && this.button_placement == tileSection.button_placement && this.subtitle_placement == tileSection.subtitle_placement && Intrinsics.areEqual(this.details_page, tileSection.details_page);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Image image = this.image;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
        Double d = this.tile_ratio;
        int hashCode3 = (hashCode2 + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
        Composition composition = this.composition;
        int hashCode4 = (hashCode3 + (composition != null ? composition.hashCode() : 0)) * 37;
        ElementPlacement elementPlacement = this.text_placement;
        int hashCode5 = (hashCode4 + (elementPlacement != null ? elementPlacement.hashCode() : 0)) * 37;
        ElementPlacement elementPlacement2 = this.button_placement;
        int hashCode6 = (hashCode5 + (elementPlacement2 != null ? elementPlacement2.hashCode() : 0)) * 37;
        SubtitlePlacement subtitlePlacement = this.subtitle_placement;
        int hashCode7 = (hashCode6 + (subtitlePlacement != null ? subtitlePlacement.hashCode() : 0)) * 37;
        DetailsPage detailsPage = this.details_page;
        int hashCode8 = hashCode7 + (detailsPage != null ? detailsPage.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ContactAlias.Builder builder = new ContactAlias.Builder(21, false);
        builder.customer_token = this.image;
        builder.alias_value = this.tile_ratio;
        builder.hashed_alias_token = this.composition;
        builder.alias_type = this.text_placement;
        builder.updated_at = this.button_placement;
        builder.linked_at = this.subtitle_placement;
        builder.version = this.details_page;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Image image = this.image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
        }
        Double d = this.tile_ratio;
        if (d != null) {
            SizeMode$EnumUnboxingLocalUtility.m("tile_ratio=", d, arrayList);
        }
        Composition composition = this.composition;
        if (composition != null) {
            arrayList.add("composition=" + composition);
        }
        ElementPlacement elementPlacement = this.text_placement;
        if (elementPlacement != null) {
            arrayList.add("text_placement=" + elementPlacement);
        }
        ElementPlacement elementPlacement2 = this.button_placement;
        if (elementPlacement2 != null) {
            arrayList.add("button_placement=" + elementPlacement2);
        }
        SubtitlePlacement subtitlePlacement = this.subtitle_placement;
        if (subtitlePlacement != null) {
            arrayList.add("subtitle_placement=" + subtitlePlacement);
        }
        DetailsPage detailsPage = this.details_page;
        if (detailsPage != null) {
            arrayList.add("details_page=" + detailsPage);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TileSection{", "}", 0, null, null, 56);
    }
}
