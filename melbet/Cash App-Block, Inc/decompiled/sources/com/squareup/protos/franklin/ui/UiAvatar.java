package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\"!#$R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u000bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0005¨\u0006%"}, d2 = {"Lcom/squareup/protos/franklin/ui/UiAvatar;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/UiAvatar$Builder;", "Lcom/squareup/protos/cash/ui/Color;", "background_color", "Lcom/squareup/protos/cash/ui/Color;", "", "monogram_text", "Ljava/lang/String;", "Lcom/squareup/protos/cash/ui/Icon;", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "tint_color", "border_color", "accessibility_value", "Lcom/squareup/protos/cash/localization/LocalizableString;", "localizable_accessibility_value", "Lcom/squareup/protos/cash/localization/LocalizableString;", "Lcom/squareup/protos/cash/ui/Image;", "image", "Lcom/squareup/protos/cash/ui/Image;", "Lcom/squareup/protos/franklin/ui/UiAvatar$Shape;", "shape", "Lcom/squareup/protos/franklin/ui/UiAvatar$Shape;", "", "is_template_avatar", "Ljava/lang/Boolean;", "badge_image", "badge_icon", "Lcom/squareup/protos/franklin/ui/UiAvatar$BadgeShape;", "badge_shape", "Lcom/squareup/protos/franklin/ui/UiAvatar$BadgeShape;", "badge_background_color", "Companion", "Builder", "BadgeShape", "Shape", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UiAvatar extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiAvatar> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 5, tag = 3)
    public final String accessibility_value;

    @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 0, tag = 1)
    public final Color background_color;

    @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 13, tag = 15)
    public final Color badge_background_color;

    @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 11, tag = 10)
    public final Icon badge_icon;

    @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 10, tag = 7)
    public final Image badge_image;

    @WireField(adapter = "com.squareup.protos.franklin.ui.UiAvatar$BadgeShape#ADAPTER", schemaIndex = 12, tag = 8)
    public final BadgeShape badge_shape;

    @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 4, tag = 12)
    public final Color border_color;

    @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 2, tag = 9)
    public final Icon icon;

    @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 7, tag = 5)
    public final Image image;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 9, tag = 6)
    public final Boolean is_template_avatar;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", redacted = true, schemaIndex = 6, tag = 4)
    public final LocalizableString localizable_accessibility_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String monogram_text;

    @WireField(adapter = "com.squareup.protos.franklin.ui.UiAvatar$Shape#ADAPTER", schemaIndex = 8, tag = 14)
    public final Shape shape;

    @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 3, tag = 11)
    public final Color tint_color;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0015\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006J\b\u0010\u001d\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/squareup/protos/franklin/ui/UiAvatar$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "<init>", "()V", "background_color", "Lcom/squareup/protos/cash/ui/Color;", "monogram_text", "", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "tint_color", "border_color", "accessibility_value", "localizable_accessibility_value", "Lcom/squareup/protos/cash/localization/LocalizableString;", "image", "Lcom/squareup/protos/cash/ui/Image;", "shape", "Lcom/squareup/protos/franklin/ui/UiAvatar$Shape;", "is_template_avatar", "", "Ljava/lang/Boolean;", "badge_image", "badge_icon", "badge_shape", "Lcom/squareup/protos/franklin/ui/UiAvatar$BadgeShape;", "badge_background_color", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/ui/UiAvatar$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public String accessibility_value;
        public Color background_color;
        public Color badge_background_color;
        public Icon badge_icon;
        public Image badge_image;
        public BadgeShape badge_shape;
        public Color border_color;
        public Icon icon;
        public Image image;
        public Boolean is_template_avatar;
        public LocalizableString localizable_accessibility_value;
        public String monogram_text;
        public Shape shape;
        public Color tint_color;

        public final Builder accessibility_value(String accessibility_value) {
            this.accessibility_value = accessibility_value;
            return this;
        }

        public final Builder background_color(Color background_color) {
            this.background_color = background_color;
            return this;
        }

        public final Builder badge_background_color(Color badge_background_color) {
            this.badge_background_color = badge_background_color;
            return this;
        }

        public final Builder badge_icon(Icon badge_icon) {
            this.badge_icon = badge_icon;
            return this;
        }

        public final Builder badge_image(Image badge_image) {
            this.badge_image = badge_image;
            return this;
        }

        public final Builder badge_shape(BadgeShape badge_shape) {
            this.badge_shape = badge_shape;
            return this;
        }

        public final Builder border_color(Color border_color) {
            this.border_color = border_color;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public UiAvatar build() {
            return new UiAvatar(this.background_color, this.monogram_text, this.icon, this.tint_color, this.border_color, this.accessibility_value, this.localizable_accessibility_value, this.image, this.shape, this.is_template_avatar, this.badge_image, this.badge_icon, this.badge_shape, this.badge_background_color, buildUnknownFields());
        }

        public final Builder icon(Icon icon) {
            this.icon = icon;
            return this;
        }

        public final Builder image(Image image) {
            this.image = image;
            return this;
        }

        public final Builder is_template_avatar(Boolean is_template_avatar) {
            this.is_template_avatar = is_template_avatar;
            return this;
        }

        public final Builder localizable_accessibility_value(LocalizableString localizable_accessibility_value) {
            this.localizable_accessibility_value = localizable_accessibility_value;
            return this;
        }

        public final Builder monogram_text(String monogram_text) {
            this.monogram_text = monogram_text;
            return this;
        }

        public final Builder shape(Shape shape) {
            this.shape = shape;
            return this;
        }

        public final Builder tint_color(Color tint_color) {
            this.tint_color = tint_color;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UiAvatar.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.UiAvatar$Companion$ADAPTER$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v36 */
            /* JADX WARN: Type inference failed for: r0v39 */
            /* JADX WARN: Type inference failed for: r0v40 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public UiAvatar decode(ProtoReader reader) {
                Object obj;
                UiAvatar.Shape shape;
                Boolean bool;
                ?? decode;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                String str = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                UiAvatar.Shape shape2 = null;
                Boolean bool2 = null;
                Object obj9 = null;
                Object obj10 = null;
                UiAvatar.BadgeShape badgeShape = null;
                String str2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new UiAvatar((Color) obj2, str, (Icon) obj4, (Color) obj5, (Color) obj6, str2, (LocalizableString) obj7, (Image) obj8, shape2, bool2, (Image) obj9, (Icon) obj10, badgeShape, (Color) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj2);
                            decode = str;
                            break;
                        case 2:
                            decode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            str2 = ProtoAdapter.STRING.decode(reader);
                            decode = str;
                            break;
                        case 4:
                            obj7 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj7);
                            decode = str;
                            break;
                        case 5:
                            obj8 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj8);
                            decode = str;
                            break;
                        case 6:
                            bool2 = ProtoAdapter.BOOL.decode(reader);
                            decode = str;
                            break;
                        case 7:
                            obj9 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj9);
                            decode = str;
                            break;
                        case 8:
                            obj = obj3;
                            shape = shape2;
                            bool = bool2;
                            try {
                                badgeShape = UiAvatar.BadgeShape.ADAPTER.decode(reader);
                                obj3 = obj;
                                bool2 = bool;
                                shape2 = shape;
                                decode = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 9:
                            obj4 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj4);
                            decode = str;
                            break;
                        case 10:
                            obj10 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj10);
                            decode = str;
                            break;
                        case 11:
                            obj5 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj5);
                            decode = str;
                            break;
                        case 12:
                            obj6 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj6);
                            decode = str;
                            break;
                        case 13:
                        default:
                            reader.readUnknownField(nextTag);
                            obj = obj3;
                            shape = shape2;
                            bool = bool2;
                            decode = str;
                            obj3 = obj;
                            bool2 = bool;
                            shape2 = shape;
                            break;
                        case 14:
                            try {
                                shape2 = UiAvatar.Shape.ADAPTER.decode(reader);
                                decode = str;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                obj = obj3;
                                shape = shape2;
                                bool = bool2;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 15:
                            obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj3);
                            decode = str;
                            break;
                    }
                    str = decode;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UiAvatar value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = Color.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 1, value.background_color);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 2, value.monogram_text);
                ProtoAdapter protoAdapter4 = Icon.ADAPTER;
                protoAdapter4.encodeWithTag(writer, 9, value.icon);
                protoAdapter2.encodeWithTag(writer, 11, value.tint_color);
                protoAdapter2.encodeWithTag(writer, 12, value.border_color);
                protoAdapter3.encodeWithTag(writer, 3, value.accessibility_value);
                LocalizableString.ADAPTER.encodeWithTag(writer, 4, value.localizable_accessibility_value);
                ProtoAdapter protoAdapter5 = Image.ADAPTER;
                protoAdapter5.encodeWithTag(writer, 5, value.image);
                UiAvatar.Shape.ADAPTER.encodeWithTag(writer, 14, value.shape);
                ProtoAdapter.BOOL.encodeWithTag(writer, 6, value.is_template_avatar);
                protoAdapter5.encodeWithTag(writer, 7, value.badge_image);
                protoAdapter4.encodeWithTag(writer, 10, value.badge_icon);
                UiAvatar.BadgeShape.ADAPTER.encodeWithTag(writer, 8, value.badge_shape);
                protoAdapter2.encodeWithTag(writer, 15, value.badge_background_color);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UiAvatar value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = Color.ADAPTER;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(1, value.background_color) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                int encodedSizeWithTag2 = protoAdapter3.encodedSizeWithTag(2, value.monogram_text) + encodedSizeWithTag;
                ProtoAdapter protoAdapter4 = Icon.ADAPTER;
                int encodedSizeWithTag3 = LocalizableString.ADAPTER.encodedSizeWithTag(4, value.localizable_accessibility_value) + protoAdapter3.encodedSizeWithTag(3, value.accessibility_value) + protoAdapter2.encodedSizeWithTag(12, value.border_color) + protoAdapter2.encodedSizeWithTag(11, value.tint_color) + protoAdapter4.encodedSizeWithTag(9, value.icon) + encodedSizeWithTag2;
                ProtoAdapter protoAdapter5 = Image.ADAPTER;
                return protoAdapter2.encodedSizeWithTag(15, value.badge_background_color) + UiAvatar.BadgeShape.ADAPTER.encodedSizeWithTag(8, value.badge_shape) + protoAdapter4.encodedSizeWithTag(10, value.badge_icon) + protoAdapter5.encodedSizeWithTag(7, value.badge_image) + ProtoAdapter.BOOL.encodedSizeWithTag(6, value.is_template_avatar) + UiAvatar.Shape.ADAPTER.encodedSizeWithTag(14, value.shape) + protoAdapter5.encodedSizeWithTag(5, value.image) + encodedSizeWithTag3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UiAvatar redact(UiAvatar value) {
                value.getClass();
                Color color = value.background_color;
                Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
                Icon icon = value.icon;
                Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
                Color color3 = value.tint_color;
                Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
                Color color5 = value.border_color;
                Color color6 = color5 != null ? (Color) Color.ADAPTER.redact(color5) : null;
                Image image = value.image;
                Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                Image image3 = value.badge_image;
                Image image4 = image3 != null ? (Image) Image.ADAPTER.redact(image3) : null;
                Icon icon3 = value.badge_icon;
                Icon icon4 = icon3 != null ? (Icon) Icon.ADAPTER.redact(icon3) : null;
                Color color7 = value.badge_background_color;
                Color color8 = color7 != null ? (Color) Color.ADAPTER.redact(color7) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.monogram_text;
                UiAvatar.Shape shape = value.shape;
                Boolean bool = value.is_template_avatar;
                UiAvatar.BadgeShape badgeShape = value.badge_shape;
                byteString.getClass();
                return new UiAvatar(color2, str, icon2, color4, color6, null, null, image2, shape, bool, image4, icon4, badgeShape, color8, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UiAvatar value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = Color.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 15, value.badge_background_color);
                UiAvatar.BadgeShape.ADAPTER.encodeWithTag(writer, 8, value.badge_shape);
                ProtoAdapter protoAdapter3 = Icon.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 10, value.badge_icon);
                ProtoAdapter protoAdapter4 = Image.ADAPTER;
                protoAdapter4.encodeWithTag(writer, 7, value.badge_image);
                ProtoAdapter.BOOL.encodeWithTag(writer, 6, value.is_template_avatar);
                UiAvatar.Shape.ADAPTER.encodeWithTag(writer, 14, value.shape);
                protoAdapter4.encodeWithTag(writer, 5, value.image);
                LocalizableString.ADAPTER.encodeWithTag(writer, 4, value.localizable_accessibility_value);
                ProtoAdapter protoAdapter5 = ProtoAdapter.STRING;
                protoAdapter5.encodeWithTag(writer, 3, value.accessibility_value);
                protoAdapter2.encodeWithTag(writer, 12, value.border_color);
                protoAdapter2.encodeWithTag(writer, 11, value.tint_color);
                protoAdapter3.encodeWithTag(writer, 9, value.icon);
                protoAdapter5.encodeWithTag(writer, 2, value.monogram_text);
                protoAdapter2.encodeWithTag(writer, 1, value.background_color);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public /* synthetic */ UiAvatar(Color color, String str, Icon icon, Color color2, Image image, Boolean bool, Icon icon2, int i) {
        this((i & 1) != 0 ? null : color, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : icon, (i & 8) != 0 ? null : color2, null, null, null, (i & 128) != 0 ? null : image, null, (i & 512) != 0 ? null : bool, null, (i & 2048) != 0 ? null : icon2, null, null, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiAvatar)) {
            return false;
        }
        UiAvatar uiAvatar = (UiAvatar) obj;
        return Intrinsics.areEqual(unknownFields(), uiAvatar.unknownFields()) && Intrinsics.areEqual(this.background_color, uiAvatar.background_color) && Intrinsics.areEqual(this.monogram_text, uiAvatar.monogram_text) && Intrinsics.areEqual(this.icon, uiAvatar.icon) && Intrinsics.areEqual(this.tint_color, uiAvatar.tint_color) && Intrinsics.areEqual(this.border_color, uiAvatar.border_color) && Intrinsics.areEqual(this.accessibility_value, uiAvatar.accessibility_value) && Intrinsics.areEqual(this.localizable_accessibility_value, uiAvatar.localizable_accessibility_value) && Intrinsics.areEqual(this.image, uiAvatar.image) && this.shape == uiAvatar.shape && Intrinsics.areEqual(this.is_template_avatar, uiAvatar.is_template_avatar) && Intrinsics.areEqual(this.badge_image, uiAvatar.badge_image) && Intrinsics.areEqual(this.badge_icon, uiAvatar.badge_icon) && this.badge_shape == uiAvatar.badge_shape && Intrinsics.areEqual(this.badge_background_color, uiAvatar.badge_background_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Color color = this.background_color;
        int hashCode2 = (hashCode + (color != null ? color.hashCode() : 0)) * 37;
        String str = this.monogram_text;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Icon icon = this.icon;
        int hashCode4 = (hashCode3 + (icon != null ? icon.hashCode() : 0)) * 37;
        Color color2 = this.tint_color;
        int hashCode5 = (hashCode4 + (color2 != null ? color2.hashCode() : 0)) * 37;
        Color color3 = this.border_color;
        int hashCode6 = (hashCode5 + (color3 != null ? color3.hashCode() : 0)) * 37;
        String str2 = this.accessibility_value;
        int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_accessibility_value;
        int hashCode8 = (hashCode7 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        Image image = this.image;
        int hashCode9 = (hashCode8 + (image != null ? image.hashCode() : 0)) * 37;
        Shape shape = this.shape;
        int hashCode10 = (hashCode9 + (shape != null ? shape.hashCode() : 0)) * 37;
        Boolean bool = this.is_template_avatar;
        int hashCode11 = (hashCode10 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Image image2 = this.badge_image;
        int hashCode12 = (hashCode11 + (image2 != null ? image2.hashCode() : 0)) * 37;
        Icon icon2 = this.badge_icon;
        int hashCode13 = (hashCode12 + (icon2 != null ? icon2.hashCode() : 0)) * 37;
        BadgeShape badgeShape = this.badge_shape;
        int hashCode14 = (hashCode13 + (badgeShape != null ? badgeShape.hashCode() : 0)) * 37;
        Color color4 = this.badge_background_color;
        int hashCode15 = hashCode14 + (color4 != null ? color4.hashCode() : 0);
        this.hashCode = hashCode15;
        return hashCode15;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.background_color = this.background_color;
        builder.monogram_text = this.monogram_text;
        builder.icon = this.icon;
        builder.tint_color = this.tint_color;
        builder.border_color = this.border_color;
        builder.accessibility_value = this.accessibility_value;
        builder.localizable_accessibility_value = this.localizable_accessibility_value;
        builder.image = this.image;
        builder.shape = this.shape;
        builder.is_template_avatar = this.is_template_avatar;
        builder.badge_image = this.badge_image;
        builder.badge_icon = this.badge_icon;
        builder.badge_shape = this.badge_shape;
        builder.badge_background_color = this.badge_background_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Color color = this.background_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color, arrayList);
        }
        String str = this.monogram_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "monogram_text=", arrayList);
        }
        Icon icon = this.icon;
        if (icon != null) {
            Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
        }
        Color color2 = this.tint_color;
        if (color2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("tint_color=", color2, arrayList);
        }
        Color color3 = this.border_color;
        if (color3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("border_color=", color3, arrayList);
        }
        if (this.accessibility_value != null) {
            arrayList.add("accessibility_value=██");
        }
        if (this.localizable_accessibility_value != null) {
            arrayList.add("localizable_accessibility_value=██");
        }
        Image image = this.image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
        }
        Shape shape = this.shape;
        if (shape != null) {
            arrayList.add("shape=" + shape);
        }
        Boolean bool = this.is_template_avatar;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_template_avatar=", bool, arrayList);
        }
        Image image2 = this.badge_image;
        if (image2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("badge_image=", image2, arrayList);
        }
        Icon icon2 = this.badge_icon;
        if (icon2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("badge_icon=", icon2, arrayList);
        }
        BadgeShape badgeShape = this.badge_shape;
        if (badgeShape != null) {
            arrayList.add("badge_shape=" + badgeShape);
        }
        Color color4 = this.badge_background_color;
        if (color4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("badge_background_color=", color4, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiAvatar{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/ui/UiAvatar$BadgeShape;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CIRCULAR", "CARD", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class BadgeShape implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BadgeShape[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final BadgeShape CIRCULAR = new BadgeShape("CIRCULAR", 0, 1);
        public static final BadgeShape CARD = new BadgeShape("CARD", 1, 2);

        private static final /* synthetic */ BadgeShape[] $values() {
            return new BadgeShape[]{CIRCULAR, CARD};
        }

        static {
            BadgeShape[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BadgeShape.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.UiAvatar$BadgeShape$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public UiAvatar.BadgeShape fromValue(int value) {
                    return UiAvatar.BadgeShape.INSTANCE.fromValue(value);
                }
            };
        }

        private BadgeShape(String str, int i, int i2) {
            this.value = i2;
        }

        public static final BadgeShape fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static BadgeShape valueOf(String str) {
            return (BadgeShape) Enum.valueOf(BadgeShape.class, str);
        }

        public static BadgeShape[] values() {
            return (BadgeShape[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/UiAvatar$BadgeShape$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/UiAvatar$BadgeShape;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final BadgeShape fromValue(int value) {
                if (value == 1) {
                    return BadgeShape.CIRCULAR;
                }
                if (value != 2) {
                    return null;
                }
                return BadgeShape.CARD;
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/ui/UiAvatar$Shape;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CIRCLE", "SQUIRCLE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Shape implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Shape[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;
        public static final Shape CIRCLE = new Shape("CIRCLE", 0, 1);
        public static final Shape SQUIRCLE = new Shape("SQUIRCLE", 1, 2);

        private static final /* synthetic */ Shape[] $values() {
            return new Shape[]{CIRCLE, SQUIRCLE};
        }

        static {
            Shape[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Shape.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.UiAvatar$Shape$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public UiAvatar.Shape fromValue(int value) {
                    return UiAvatar.Shape.INSTANCE.fromValue(value);
                }
            };
        }

        private Shape(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Shape fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Shape valueOf(String str) {
            return (Shape) Enum.valueOf(Shape.class, str);
        }

        public static Shape[] values() {
            return (Shape[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/UiAvatar$Shape$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/UiAvatar$Shape;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Shape fromValue(int value) {
                if (value == 1) {
                    return Shape.CIRCLE;
                }
                if (value != 2) {
                    return null;
                }
                return Shape.SQUIRCLE;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/UiAvatar$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/UiAvatar$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/UiAvatar;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ UiAvatar build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiAvatar(Color color, String str, Icon icon, Color color2, Color color3, String str2, LocalizableString localizableString, Image image, Shape shape, Boolean bool, Image image2, Icon icon2, BadgeShape badgeShape, Color color4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.background_color = color;
        this.monogram_text = str;
        this.icon = icon;
        this.tint_color = color2;
        this.border_color = color3;
        this.accessibility_value = str2;
        this.localizable_accessibility_value = localizableString;
        this.image = image;
        this.shape = shape;
        this.is_template_avatar = bool;
        this.badge_image = image2;
        this.badge_icon = icon2;
        this.badge_shape = badgeShape;
        this.badge_background_color = color4;
    }
}
