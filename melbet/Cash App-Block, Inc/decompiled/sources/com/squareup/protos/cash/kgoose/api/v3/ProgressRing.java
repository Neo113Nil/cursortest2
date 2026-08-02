package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u000e\r\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$Builder;", "", "fraction", "Ljava/lang/Double;", "Lcom/squareup/protos/cash/ui/Color;", "color", "Lcom/squareup/protos/cash/ui/Color;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent;", "contents", "Ljava/util/List;", "Companion", "Builder", "ProgressRingContent", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProgressRing extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ProgressRing> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 1, tag = 2)
    public final Color color;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ProgressRing$ProgressRingContent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<ProgressRingContent> contents;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 0, tag = 1)
    public final Double fraction;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0014\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing;", "<init>", "()V", "fraction", "", "Ljava/lang/Double;", "color", "Lcom/squareup/protos/cash/ui/Color;", "contents", "", "Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent;", "(Ljava/lang/Double;)Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Color color;
        public List<ProgressRingContent> contents = EmptyList.INSTANCE;
        public Double fraction;

        @Override // com.squareup.wire.Message.Builder
        public ProgressRing build() {
            return new ProgressRing(this.fraction, this.color, this.contents, buildUnknownFields());
        }

        public final Builder color(Color color) {
            this.color = color;
            return this;
        }

        public final Builder contents(List<ProgressRingContent> contents) {
            contents.getClass();
            TransactorKt.checkElementsNotNull(contents);
            this.contents = contents;
            return this;
        }

        public final Builder fraction(Double fraction) {
            this.fraction = fraction;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0007\b\u0006\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent$Content;", "content", "Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent$Content;", "Companion", "Builder", "Content", "TextContent", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ProgressRingContent extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ProgressRingContent> CREATOR;
        private static final long serialVersionUID = 0;

        @WireSealedOneof(schemaIndex = 0)
        public final Content content;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent;", "<init>", "()V", "content", "Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent$Content;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Content content;

            @Override // com.squareup.wire.Message.Builder
            public ProgressRingContent build() {
                return new ProgressRingContent(this.content, buildUnknownFields());
            }

            public final Builder content(Content content) {
                this.content = content;
                return this;
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent$Content;", "", "Text", "Avatar", "Image", "Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent$Content$Avatar;", "Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent$Content$Image;", "Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent$Content$Text;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class Content {

            @WireOneofField(adapter = "com.squareup.protos.franklin.ui.UiAvatar#ADAPTER", declaredName = "avatar", tag = 2)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent$Content$Avatar;", "Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent$Content;", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "value", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "getValue", "()Lcom/squareup/protos/franklin/ui/UiAvatar;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Avatar extends Content {
                private final UiAvatar value;

                public Avatar(UiAvatar uiAvatar) {
                    uiAvatar.getClass();
                    this.value = uiAvatar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Avatar) && Intrinsics.areEqual(this.value, ((Avatar) obj).value);
                }

                public final UiAvatar getValue() {
                    return this.value;
                }

                public final int hashCode() {
                    return this.value.hashCode();
                }

                public final String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Avatar(value=", ")");
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", declaredName = "image", tag = 3)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent$Content$Image;", "Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent$Content;", "Lcom/squareup/protos/cash/ui/Image;", "value", "Lcom/squareup/protos/cash/ui/Image;", "getValue", "()Lcom/squareup/protos/cash/ui/Image;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Image extends Content {
                private final com.squareup.protos.cash.ui.Image value;

                public Image(com.squareup.protos.cash.ui.Image image) {
                    image.getClass();
                    this.value = image;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Image) && Intrinsics.areEqual(this.value, ((Image) obj).value);
                }

                public final com.squareup.protos.cash.ui.Image getValue() {
                    return this.value;
                }

                public final int hashCode() {
                    return this.value.hashCode();
                }

                public final String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Image(value=", ")");
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ProgressRing$ProgressRingContent$TextContent#ADAPTER", declaredName = "text", tag = 1)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent$Content$Text;", "Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent$Content;", "Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent$TextContent;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent$TextContent;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent$TextContent;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Text extends Content {
                private final TextContent value;

                public Text(TextContent textContent) {
                    textContent.getClass();
                    this.value = textContent;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Text) && Intrinsics.areEqual(this.value, ((Text) obj).value);
                }

                public final TextContent getValue() {
                    return this.value;
                }

                public final int hashCode() {
                    return this.value.hashCode();
                }

                public final String toString() {
                    return "Text(value=" + this.value + ")";
                }
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent$TextContent;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent$TextContent$Builder;", "", "text", "Ljava/lang/String;", "Lcom/squareup/protos/cash/ui/Color;", "background_color", "Lcom/squareup/protos/cash/ui/Color;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class TextContent extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<TextContent> CREATOR;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 1, tag = 2)
            public final Color background_color;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String text;

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent$TextContent$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing$ProgressRingContent$TextContent;", "<init>", "()V", "text", "", "background_color", "Lcom/squareup/protos/cash/ui/Color;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public Color background_color;
                public String text;

                public final Builder background_color(Color background_color) {
                    this.background_color = background_color;
                    return this;
                }

                @Override // com.squareup.wire.Message.Builder
                public TextContent build() {
                    return new TextContent(this.text, this.background_color, buildUnknownFields());
                }

                public final Builder text(String text) {
                    this.text = text;
                    return this;
                }
            }

            static {
                ProgressRing$ProgressRingContent$TextContent$Companion$ADAPTER$1 progressRing$ProgressRingContent$TextContent$Companion$ADAPTER$1 = new ProgressRing$ProgressRingContent$TextContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TextContent.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ProgressRing.ProgressRingContent.TextContent", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/slot_content.proto");
                ADAPTER = progressRing$ProgressRingContent$TextContent$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(progressRing$ProgressRingContent$TextContent$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextContent(String str, Color color, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.text = str;
                this.background_color = color;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof TextContent)) {
                    return false;
                }
                TextContent textContent = (TextContent) obj;
                return Intrinsics.areEqual(unknownFields(), textContent.unknownFields()) && Intrinsics.areEqual(this.text, textContent.text) && Intrinsics.areEqual(this.background_color, textContent.background_color);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.text;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                Color color = this.background_color;
                int hashCode3 = hashCode2 + (color != null ? color.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Builder builder = new Builder();
                builder.text = this.text;
                builder.background_color = this.background_color;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.text;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
                }
                Color color = this.background_color;
                if (color != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "TextContent{", "}", 0, null, null, 56);
            }
        }

        static {
            ProgressRing$ProgressRingContent$Companion$ADAPTER$1 progressRing$ProgressRingContent$Companion$ADAPTER$1 = new ProgressRing$ProgressRingContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProgressRingContent.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ProgressRing.ProgressRingContent", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/slot_content.proto");
            ADAPTER = progressRing$ProgressRingContent$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(progressRing$ProgressRingContent$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProgressRingContent(Content content, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.content = content;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ProgressRingContent)) {
                return false;
            }
            ProgressRingContent progressRingContent = (ProgressRingContent) obj;
            return Intrinsics.areEqual(unknownFields(), progressRingContent.unknownFields()) && Intrinsics.areEqual(this.content, progressRingContent.content);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Content content = this.content;
            int hashCode2 = hashCode + (content != null ? content.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.content = this.content;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Content content = this.content;
            if (content != null) {
                arrayList.add("content=" + content);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ProgressRingContent{", "}", 0, null, null, 56);
        }
    }

    static {
        ProgressRing$Companion$ADAPTER$1 progressRing$Companion$ADAPTER$1 = new ProgressRing$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProgressRing.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.ProgressRing", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/slot_content.proto");
        ADAPTER = progressRing$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(progressRing$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressRing(Double d, Color color, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.fraction = d;
        this.color = color;
        this.contents = TransactorKt.immutableCopyOf("contents", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProgressRing)) {
            return false;
        }
        ProgressRing progressRing = (ProgressRing) obj;
        return Intrinsics.areEqual(unknownFields(), progressRing.unknownFields()) && Intrinsics.areEqual(this.fraction, progressRing.fraction) && Intrinsics.areEqual(this.color, progressRing.color) && Intrinsics.areEqual(this.contents, progressRing.contents);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Double d = this.fraction;
        int hashCode2 = (hashCode + (d != null ? Double.hashCode(d.doubleValue()) : 0)) * 37;
        Color color = this.color;
        int hashCode3 = this.contents.hashCode() + ((hashCode2 + (color != null ? color.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.fraction = this.fraction;
        builder.color = this.color;
        builder.contents = this.contents;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Double d = this.fraction;
        if (d != null) {
            SizeMode$EnumUnboxingLocalUtility.m("fraction=", d, arrayList);
        }
        Color color = this.color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("color=", color, arrayList);
        }
        if (!this.contents.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("contents=", arrayList, this.contents);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProgressRing{", "}", 0, null, null, 56);
    }
}
