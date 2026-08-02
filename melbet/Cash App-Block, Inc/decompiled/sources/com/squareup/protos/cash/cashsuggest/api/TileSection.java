package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashface.api.Trust;
import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.protos.cash.grantly.api.Channel;
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

/* loaded from: classes7.dex */
public final class TileSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TileSection> CREATOR;
    public final Composition composition;
    public final Image image;
    public final SubtitlePlacement subtitle_placement;
    public final Double tile_ratio;

    public enum Composition implements WireEnum {
        TOP_LEFT_TEXT(1),
        BOTTOM_LEFT_TEXT(2);

        public final int value;
        public static final Channel.Companion Companion = new Channel.Companion();
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

    public enum SubtitlePlacement implements WireEnum {
        ABOVE_TITLE(1),
        BELOW_TITLE(2);

        public final int value;
        public static final RadioType.Companion Companion = new RadioType.Companion();
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
        TileSection$Companion$ADAPTER$1 tileSection$Companion$ADAPTER$1 = new TileSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TileSection.class), "type.googleapis.com/squareup.cash.cashsuggest.api.TileSection", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/Common.proto");
        ADAPTER = tileSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(tileSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileSection(Image image, Double d, Composition composition, SubtitlePlacement subtitlePlacement, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.image = image;
        this.tile_ratio = d;
        this.composition = composition;
        this.subtitle_placement = subtitlePlacement;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TileSection)) {
            return false;
        }
        TileSection tileSection = (TileSection) obj;
        return Intrinsics.areEqual(unknownFields(), tileSection.unknownFields()) && Intrinsics.areEqual(this.image, tileSection.image) && Intrinsics.areEqual(this.tile_ratio, tileSection.tile_ratio) && this.composition == tileSection.composition && this.subtitle_placement == tileSection.subtitle_placement;
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
        SubtitlePlacement subtitlePlacement = this.subtitle_placement;
        int hashCode5 = hashCode4 + (subtitlePlacement != null ? subtitlePlacement.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Trust.Builder builder = new Trust.Builder(20, false);
        builder.icon = this.image;
        builder.title = this.tile_ratio;
        builder.enabled = this.composition;
        builder.id = this.subtitle_placement;
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
        SubtitlePlacement subtitlePlacement = this.subtitle_placement;
        if (subtitlePlacement != null) {
            arrayList.add("subtitle_placement=" + subtitlePlacement);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TileSection{", "}", 0, null, null, 56);
    }
}
