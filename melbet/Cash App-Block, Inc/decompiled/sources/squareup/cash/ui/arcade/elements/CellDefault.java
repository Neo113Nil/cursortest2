package squareup.cash.ui.arcade.elements;

import android.os.Parcelable;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.cash.ui.TintedIcon;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import squareup.cash.ui.arcade.elements.CellDefault;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u001b\u001a\u001c\u001d\u001eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001f"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/ui/arcade/elements/CellDefault$Builder;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon;", "icon", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "label_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "body_text", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessoryLeadingImage;", "accessory_leading_image", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessoryLeadingImage;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory;", "accessory", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory;", "Lcom/squareup/protos/cash/ui/TintedIcon;", "label_icon", "Lcom/squareup/protos/cash/ui/TintedIcon;", "Lcom/squareup/protos/cash/ui/Icon;", "body_icon", "Lcom/squareup/protos/cash/ui/Icon;", "", "is_badged", "Ljava/lang/Boolean;", "disabled", "Companion", "Builder", "CellDefaultIcon", "CellDefaultAccessoryLeadingImage", "CellDefaultAccessory", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CellDefault extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CellDefault> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "squareup.cash.ui.arcade.elements.CellDefault$CellDefaultAccessory#ADAPTER", schemaIndex = 4, tag = 4)
    public final CellDefaultAccessory accessory;

    @WireField(adapter = "squareup.cash.ui.arcade.elements.CellDefault$CellDefaultAccessoryLeadingImage#ADAPTER", schemaIndex = 3, tag = 9)
    public final CellDefaultAccessoryLeadingImage accessory_leading_image;

    @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 6, tag = 6)
    public final Icon body_icon;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", redacted = true, schemaIndex = 2, tag = 3)
    public final LocalizedString body_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 8, tag = 8)
    public final Boolean disabled;

    @WireField(adapter = "squareup.cash.ui.arcade.elements.CellDefault$CellDefaultIcon#ADAPTER", schemaIndex = 0, tag = 1)
    public final CellDefaultIcon icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 7, tag = 7)
    public final Boolean is_badged;

    @WireField(adapter = "com.squareup.protos.cash.ui.TintedIcon#ADAPTER", schemaIndex = 5, tag = 5)
    public final TintedIcon label_icon;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", redacted = true, schemaIndex = 1, tag = 2)
    public final LocalizedString label_text;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0015\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0016J\u0015\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0014¨\u0006\u0018"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/ui/arcade/elements/CellDefault;", "<init>", "()V", "icon", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon;", "label_text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "body_text", "accessory_leading_image", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessoryLeadingImage;", "accessory", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory;", "label_icon", "Lcom/squareup/protos/cash/ui/TintedIcon;", "body_icon", "Lcom/squareup/protos/cash/ui/Icon;", "is_badged", "", "Ljava/lang/Boolean;", "disabled", "(Ljava/lang/Boolean;)Lsquareup/cash/ui/arcade/elements/CellDefault$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public CellDefaultAccessory accessory;
        public CellDefaultAccessoryLeadingImage accessory_leading_image;
        public Icon body_icon;
        public LocalizedString body_text;
        public Boolean disabled;
        public CellDefaultIcon icon;
        public Boolean is_badged;
        public TintedIcon label_icon;
        public LocalizedString label_text;

        public final Builder accessory(CellDefaultAccessory accessory) {
            this.accessory = accessory;
            return this;
        }

        public final Builder accessory_leading_image(CellDefaultAccessoryLeadingImage accessory_leading_image) {
            this.accessory_leading_image = accessory_leading_image;
            return this;
        }

        public final Builder body_icon(Icon body_icon) {
            this.body_icon = body_icon;
            return this;
        }

        public final Builder body_text(LocalizedString body_text) {
            this.body_text = body_text;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public CellDefault build() {
            return new CellDefault(this.icon, this.label_text, this.body_text, this.accessory_leading_image, this.accessory, this.label_icon, this.body_icon, this.is_badged, this.disabled, buildUnknownFields());
        }

        public final Builder disabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        public final Builder icon(CellDefaultIcon icon) {
            this.icon = icon;
            return this;
        }

        public final Builder is_badged(Boolean is_badged) {
            this.is_badged = is_badged;
            return this;
        }

        public final Builder label_icon(TintedIcon label_icon) {
            this.label_icon = label_icon;
            return this;
        }

        public final Builder label_text(LocalizedString label_text) {
            this.label_text = label_text;
            return this;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0013\u0014\u0015\u0016\u0017B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Builder;", "type", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Type;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Type;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Type", "Companion", "LabeledPush", "CellDefaultAccessoryCompactButton", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CellDefaultAccessory extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CellDefaultAccessory> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireSealedOneof(schemaIndex = 0)
        public final Type type;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory;", "<init>", "()V", "type", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Type;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Type type;

            @Override // com.squareup.wire.Message.Builder
            public CellDefaultAccessory build() {
                return new CellDefaultAccessory(this.type, buildUnknownFields());
            }

            public final Builder type(Type type2) {
                this.type = type2;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CellDefaultAccessory.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.ui.arcade.elements.CellDefault$CellDefaultAccessory$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public CellDefault.CellDefaultAccessory decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    CellDefault.CellDefaultAccessory.Type type2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new CellDefault.CellDefaultAccessory(type2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                type2 = new CellDefault.CellDefaultAccessory.Type.Push(((Boolean) ProtoAdapter.BOOL.decode(reader)).booleanValue());
                                break;
                            case 2:
                                type2 = new CellDefault.CellDefaultAccessory.Type.LabeledPush((CellDefault.CellDefaultAccessory.LabeledPush) CellDefault.CellDefaultAccessory.LabeledPush.ADAPTER.decode(reader));
                                break;
                            case 3:
                                type2 = new CellDefault.CellDefaultAccessory.Type.Checkbox(((Boolean) ProtoAdapter.BOOL.decode(reader)).booleanValue());
                                break;
                            case 4:
                                type2 = new CellDefault.CellDefaultAccessory.Type.Radio(((Boolean) ProtoAdapter.BOOL.decode(reader)).booleanValue());
                                break;
                            case 5:
                                type2 = new CellDefault.CellDefaultAccessory.Type.Toggle(((Boolean) ProtoAdapter.BOOL.decode(reader)).booleanValue());
                                break;
                            case 6:
                                type2 = new CellDefault.CellDefaultAccessory.Type.CompactButton((CellDefault.CellDefaultAccessory.CellDefaultAccessoryCompactButton) CellDefault.CellDefaultAccessory.CellDefaultAccessoryCompactButton.ADAPTER.decode(reader));
                                break;
                            case 7:
                                type2 = new CellDefault.CellDefaultAccessory.Type.Label((LocalizedString) LocalizedString.ADAPTER.decode(reader));
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, CellDefault.CellDefaultAccessory value) {
                    writer.getClass();
                    value.getClass();
                    CellDefault.CellDefaultAccessory.Type type2 = value.type;
                    if (type2 instanceof CellDefault.CellDefaultAccessory.Type.Push) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(((CellDefault.CellDefaultAccessory.Type.Push) type2).getValue()));
                    } else if (type2 instanceof CellDefault.CellDefaultAccessory.Type.LabeledPush) {
                        CellDefault.CellDefaultAccessory.LabeledPush.ADAPTER.encodeWithTag(writer, 2, ((CellDefault.CellDefaultAccessory.Type.LabeledPush) type2).getValue());
                    } else if (type2 instanceof CellDefault.CellDefaultAccessory.Type.Checkbox) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(((CellDefault.CellDefaultAccessory.Type.Checkbox) type2).getValue()));
                    } else if (type2 instanceof CellDefault.CellDefaultAccessory.Type.Radio) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(((CellDefault.CellDefaultAccessory.Type.Radio) type2).getValue()));
                    } else if (type2 instanceof CellDefault.CellDefaultAccessory.Type.Toggle) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 5, Boolean.valueOf(((CellDefault.CellDefaultAccessory.Type.Toggle) type2).getValue()));
                    } else if (type2 instanceof CellDefault.CellDefaultAccessory.Type.CompactButton) {
                        CellDefault.CellDefaultAccessory.CellDefaultAccessoryCompactButton.ADAPTER.encodeWithTag(writer, 6, ((CellDefault.CellDefaultAccessory.Type.CompactButton) type2).getValue());
                    } else if (type2 instanceof CellDefault.CellDefaultAccessory.Type.Label) {
                        LocalizedString.ADAPTER.encodeWithTag(writer, 7, ((CellDefault.CellDefaultAccessory.Type.Label) type2).getValue());
                    } else if (type2 != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(CellDefault.CellDefaultAccessory value) {
                    int encodedSizeWithTag;
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    CellDefault.CellDefaultAccessory.Type type2 = value.type;
                    if (type2 instanceof CellDefault.CellDefaultAccessory.Type.Push) {
                        encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(((CellDefault.CellDefaultAccessory.Type.Push) type2).getValue()));
                    } else if (type2 instanceof CellDefault.CellDefaultAccessory.Type.LabeledPush) {
                        encodedSizeWithTag = CellDefault.CellDefaultAccessory.LabeledPush.ADAPTER.encodedSizeWithTag(2, ((CellDefault.CellDefaultAccessory.Type.LabeledPush) type2).getValue());
                    } else if (type2 instanceof CellDefault.CellDefaultAccessory.Type.Checkbox) {
                        encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(((CellDefault.CellDefaultAccessory.Type.Checkbox) type2).getValue()));
                    } else if (type2 instanceof CellDefault.CellDefaultAccessory.Type.Radio) {
                        encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(((CellDefault.CellDefaultAccessory.Type.Radio) type2).getValue()));
                    } else if (type2 instanceof CellDefault.CellDefaultAccessory.Type.Toggle) {
                        encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(((CellDefault.CellDefaultAccessory.Type.Toggle) type2).getValue()));
                    } else if (type2 instanceof CellDefault.CellDefaultAccessory.Type.CompactButton) {
                        encodedSizeWithTag = CellDefault.CellDefaultAccessory.CellDefaultAccessoryCompactButton.ADAPTER.encodedSizeWithTag(6, ((CellDefault.CellDefaultAccessory.Type.CompactButton) type2).getValue());
                    } else {
                        if (!(type2 instanceof CellDefault.CellDefaultAccessory.Type.Label)) {
                            if (type2 == null) {
                                return size$okio;
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        encodedSizeWithTag = LocalizedString.ADAPTER.encodedSizeWithTag(7, ((CellDefault.CellDefaultAccessory.Type.Label) type2).getValue());
                    }
                    return encodedSizeWithTag + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public CellDefault.CellDefaultAccessory redact(CellDefault.CellDefaultAccessory value) {
                    value.getClass();
                    return value.copy(null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, CellDefault.CellDefaultAccessory value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    CellDefault.CellDefaultAccessory.Type type2 = value.type;
                    if (type2 instanceof CellDefault.CellDefaultAccessory.Type.Push) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(((CellDefault.CellDefaultAccessory.Type.Push) type2).getValue()));
                        return;
                    }
                    if (type2 instanceof CellDefault.CellDefaultAccessory.Type.LabeledPush) {
                        CellDefault.CellDefaultAccessory.LabeledPush.ADAPTER.encodeWithTag(writer, 2, ((CellDefault.CellDefaultAccessory.Type.LabeledPush) type2).getValue());
                        return;
                    }
                    if (type2 instanceof CellDefault.CellDefaultAccessory.Type.Checkbox) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(((CellDefault.CellDefaultAccessory.Type.Checkbox) type2).getValue()));
                        return;
                    }
                    if (type2 instanceof CellDefault.CellDefaultAccessory.Type.Radio) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(((CellDefault.CellDefaultAccessory.Type.Radio) type2).getValue()));
                        return;
                    }
                    if (type2 instanceof CellDefault.CellDefaultAccessory.Type.Toggle) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 5, Boolean.valueOf(((CellDefault.CellDefaultAccessory.Type.Toggle) type2).getValue()));
                        return;
                    }
                    if (type2 instanceof CellDefault.CellDefaultAccessory.Type.CompactButton) {
                        CellDefault.CellDefaultAccessory.CellDefaultAccessoryCompactButton.ADAPTER.encodeWithTag(writer, 6, ((CellDefault.CellDefaultAccessory.Type.CompactButton) type2).getValue());
                    } else if (type2 instanceof CellDefault.CellDefaultAccessory.Type.Label) {
                        LocalizedString.ADAPTER.encodeWithTag(writer, 7, ((CellDefault.CellDefaultAccessory.Type.Label) type2).getValue());
                    } else {
                        if (type2 == null) {
                            return;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                    }
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ CellDefaultAccessory(Type type2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : type2, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ CellDefaultAccessory copy$default(CellDefaultAccessory cellDefaultAccessory, Type type2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                type2 = cellDefaultAccessory.type;
            }
            if ((i & 2) != 0) {
                byteString = cellDefaultAccessory.unknownFields();
            }
            return cellDefaultAccessory.copy(type2, byteString);
        }

        public final CellDefaultAccessory copy(Type type2, ByteString unknownFields) {
            unknownFields.getClass();
            return new CellDefaultAccessory(type2, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CellDefaultAccessory)) {
                return false;
            }
            CellDefaultAccessory cellDefaultAccessory = (CellDefaultAccessory) other;
            return Intrinsics.areEqual(unknownFields(), cellDefaultAccessory.unknownFields()) && Intrinsics.areEqual(this.type, cellDefaultAccessory.type);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Type type2 = this.type;
            int hashCode2 = hashCode + (type2 != null ? type2.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.type = this.type;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.type != null) {
                arrayList.add("type=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CellDefaultAccessory{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0014\u0010\u000f\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u0017R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u001a"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$CellDefaultAccessoryCompactButton;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$CellDefaultAccessoryCompactButton$Builder;", "text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "prominence", "Lsquareup/cash/ui/arcade/elements/ButtonProminence;", "is_destructive", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizedString;Lsquareup/cash/ui/arcade/elements/ButtonProminence;Ljava/lang/Boolean;Lokio/ByteString;)V", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "(Lcom/squareup/protos/cash/localization/LocalizedString;Lsquareup/cash/ui/arcade/elements/ButtonProminence;Ljava/lang/Boolean;Lokio/ByteString;)Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$CellDefaultAccessoryCompactButton;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class CellDefaultAccessoryCompactButton extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<CellDefaultAccessoryCompactButton> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
            public final Boolean is_destructive;

            @WireField(adapter = "squareup.cash.ui.arcade.elements.ButtonProminence#ADAPTER", schemaIndex = 1, tag = 2)
            public final ButtonProminence prominence;

            @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 0, tag = 1)
            public final LocalizedString text;

            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u000e"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$CellDefaultAccessoryCompactButton$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$CellDefaultAccessoryCompactButton;", "<init>", "()V", "text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "prominence", "Lsquareup/cash/ui/arcade/elements/ButtonProminence;", "is_destructive", "", "Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$CellDefaultAccessoryCompactButton$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public Boolean is_destructive;
                public ButtonProminence prominence;
                public LocalizedString text;

                @Override // com.squareup.wire.Message.Builder
                public CellDefaultAccessoryCompactButton build() {
                    return new CellDefaultAccessoryCompactButton(this.text, this.prominence, this.is_destructive, buildUnknownFields());
                }

                public final Builder is_destructive(Boolean is_destructive) {
                    this.is_destructive = is_destructive;
                    return this;
                }

                public final Builder prominence(ButtonProminence prominence) {
                    this.prominence = prominence;
                    return this;
                }

                public final Builder text(LocalizedString text) {
                    this.text = text;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CellDefaultAccessoryCompactButton.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.ui.arcade.elements.CellDefault$CellDefaultAccessory$CellDefaultAccessoryCompactButton$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public CellDefault.CellDefaultAccessory.CellDefaultAccessoryCompactButton decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new CellDefault.CellDefaultAccessory.CellDefaultAccessoryCompactButton((LocalizedString) obj, (ButtonProminence) obj2, (Boolean) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj);
                            } else if (nextTag == 2) {
                                try {
                                    obj2 = ButtonProminence.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (nextTag != 3) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj3 = ProtoAdapter.BOOL.decode(reader);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, CellDefault.CellDefaultAccessory.CellDefaultAccessoryCompactButton value) {
                        writer.getClass();
                        value.getClass();
                        LocalizedString.ADAPTER.encodeWithTag(writer, 1, value.text);
                        ButtonProminence.ADAPTER.encodeWithTag(writer, 2, value.prominence);
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.is_destructive);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(CellDefault.CellDefaultAccessory.CellDefaultAccessoryCompactButton value) {
                        value.getClass();
                        return ProtoAdapter.BOOL.encodedSizeWithTag(3, value.is_destructive) + ButtonProminence.ADAPTER.encodedSizeWithTag(2, value.prominence) + LocalizedString.ADAPTER.encodedSizeWithTag(1, value.text) + value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public CellDefault.CellDefaultAccessory.CellDefaultAccessoryCompactButton redact(CellDefault.CellDefaultAccessory.CellDefaultAccessoryCompactButton value) {
                        value.getClass();
                        LocalizedString localizedString = value.text;
                        return CellDefault.CellDefaultAccessory.CellDefaultAccessoryCompactButton.copy$default(value, localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null, null, null, ByteString.EMPTY, 6, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, CellDefault.CellDefaultAccessory.CellDefaultAccessoryCompactButton value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.is_destructive);
                        ButtonProminence.ADAPTER.encodeWithTag(writer, 2, value.prominence);
                        LocalizedString.ADAPTER.encodeWithTag(writer, 1, value.text);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ CellDefaultAccessoryCompactButton(LocalizedString localizedString, ButtonProminence buttonProminence, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : localizedString, (i & 2) != 0 ? null : buttonProminence, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ CellDefaultAccessoryCompactButton copy$default(CellDefaultAccessoryCompactButton cellDefaultAccessoryCompactButton, LocalizedString localizedString, ButtonProminence buttonProminence, Boolean bool, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    localizedString = cellDefaultAccessoryCompactButton.text;
                }
                if ((i & 2) != 0) {
                    buttonProminence = cellDefaultAccessoryCompactButton.prominence;
                }
                if ((i & 4) != 0) {
                    bool = cellDefaultAccessoryCompactButton.is_destructive;
                }
                if ((i & 8) != 0) {
                    byteString = cellDefaultAccessoryCompactButton.unknownFields();
                }
                return cellDefaultAccessoryCompactButton.copy(localizedString, buttonProminence, bool, byteString);
            }

            public final CellDefaultAccessoryCompactButton copy(LocalizedString text, ButtonProminence prominence, Boolean is_destructive, ByteString unknownFields) {
                unknownFields.getClass();
                return new CellDefaultAccessoryCompactButton(text, prominence, is_destructive, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof CellDefaultAccessoryCompactButton)) {
                    return false;
                }
                CellDefaultAccessoryCompactButton cellDefaultAccessoryCompactButton = (CellDefaultAccessoryCompactButton) other;
                return Intrinsics.areEqual(unknownFields(), cellDefaultAccessoryCompactButton.unknownFields()) && Intrinsics.areEqual(this.text, cellDefaultAccessoryCompactButton.text) && this.prominence == cellDefaultAccessoryCompactButton.prominence && Intrinsics.areEqual(this.is_destructive, cellDefaultAccessoryCompactButton.is_destructive);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.text;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                ButtonProminence buttonProminence = this.prominence;
                int hashCode3 = (hashCode2 + (buttonProminence != null ? buttonProminence.hashCode() : 0)) * 37;
                Boolean bool = this.is_destructive;
                int hashCode4 = hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.text = this.text;
                builder.prominence = this.prominence;
                builder.is_destructive = this.is_destructive;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                LocalizedString localizedString = this.text;
                if (localizedString != null) {
                    Matcher$$ExternalSyntheticOutline0.m("text=", localizedString, arrayList);
                }
                ButtonProminence buttonProminence = this.prominence;
                if (buttonProminence != null) {
                    arrayList.add("prominence=" + buttonProminence);
                }
                Boolean bool = this.is_destructive;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("is_destructive=", bool, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "CellDefaultAccessoryCompactButton{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$CellDefaultAccessoryCompactButton$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$CellDefaultAccessoryCompactButton$Builder;", "", "body", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$CellDefaultAccessoryCompactButton;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$CellDefaultAccessoryCompactButton;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ CellDefaultAccessoryCompactButton build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public CellDefaultAccessoryCompactButton() {
                this(null, null, null, null, 15, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CellDefaultAccessoryCompactButton(LocalizedString localizedString, ButtonProminence buttonProminence, Boolean bool, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.text = localizedString;
                this.prominence = buttonProminence;
                this.is_destructive = bool;
            }
        }

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bBA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0014\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0082\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u0096\u0080\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0016JE\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\u0019R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u001c"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$LabeledPush;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$LabeledPush$Builder;", "text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "vertical_alignment", "Lsquareup/cash/ui/arcade/elements/VerticalAlignment;", "text_color", "Lcom/squareup/protos/cash/ui/Color;", "hide_push_chevron", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizedString;Lsquareup/cash/ui/arcade/elements/VerticalAlignment;Lcom/squareup/protos/cash/ui/Color;Ljava/lang/Boolean;Lokio/ByteString;)V", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "(Lcom/squareup/protos/cash/localization/LocalizedString;Lsquareup/cash/ui/arcade/elements/VerticalAlignment;Lcom/squareup/protos/cash/ui/Color;Ljava/lang/Boolean;Lokio/ByteString;)Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$LabeledPush;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class LabeledPush extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<LabeledPush> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 3, tag = 4)
            public final Boolean hide_push_chevron;

            @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", redacted = true, schemaIndex = 0, tag = 1)
            public final LocalizedString text;

            @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 2, tag = 3)
            public final Color text_color;

            @WireField(adapter = "squareup.cash.ui.arcade.elements.VerticalAlignment#ADAPTER", schemaIndex = 1, tag = 2)
            public final VerticalAlignment vertical_alignment;

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0010"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$LabeledPush$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$LabeledPush;", "<init>", "()V", "text", "Lcom/squareup/protos/cash/localization/LocalizedString;", "vertical_alignment", "Lsquareup/cash/ui/arcade/elements/VerticalAlignment;", "text_color", "Lcom/squareup/protos/cash/ui/Color;", "hide_push_chevron", "", "Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$LabeledPush$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public Boolean hide_push_chevron;
                public LocalizedString text;
                public Color text_color;
                public VerticalAlignment vertical_alignment;

                @Override // com.squareup.wire.Message.Builder
                public LabeledPush build() {
                    return new LabeledPush(this.text, this.vertical_alignment, this.text_color, this.hide_push_chevron, buildUnknownFields());
                }

                public final Builder hide_push_chevron(Boolean hide_push_chevron) {
                    this.hide_push_chevron = hide_push_chevron;
                    return this;
                }

                public final Builder text(LocalizedString text) {
                    this.text = text;
                    return this;
                }

                public final Builder text_color(Color text_color) {
                    this.text_color = text_color;
                    return this;
                }

                public final Builder vertical_alignment(VerticalAlignment vertical_alignment) {
                    this.vertical_alignment = vertical_alignment;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LabeledPush.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.ui.arcade.elements.CellDefault$CellDefaultAccessory$LabeledPush$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public CellDefault.CellDefaultAccessory.LabeledPush decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        Object obj4 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new CellDefault.CellDefaultAccessory.LabeledPush((LocalizedString) obj, (VerticalAlignment) obj2, (Color) obj3, (Boolean) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj);
                            } else if (nextTag == 2) {
                                try {
                                    obj2 = VerticalAlignment.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (nextTag == 3) {
                                obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj3);
                            } else if (nextTag != 4) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj4 = ProtoAdapter.BOOL.decode(reader);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, CellDefault.CellDefaultAccessory.LabeledPush value) {
                        writer.getClass();
                        value.getClass();
                        LocalizedString.ADAPTER.encodeWithTag(writer, 1, value.text);
                        VerticalAlignment.ADAPTER.encodeWithTag(writer, 2, value.vertical_alignment);
                        Color.ADAPTER.encodeWithTag(writer, 3, value.text_color);
                        ProtoAdapter.BOOL.encodeWithTag(writer, 4, value.hide_push_chevron);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(CellDefault.CellDefaultAccessory.LabeledPush value) {
                        value.getClass();
                        return ProtoAdapter.BOOL.encodedSizeWithTag(4, value.hide_push_chevron) + Color.ADAPTER.encodedSizeWithTag(3, value.text_color) + VerticalAlignment.ADAPTER.encodedSizeWithTag(2, value.vertical_alignment) + LocalizedString.ADAPTER.encodedSizeWithTag(1, value.text) + value.unknownFields().getSize$okio();
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public CellDefault.CellDefaultAccessory.LabeledPush redact(CellDefault.CellDefaultAccessory.LabeledPush value) {
                        value.getClass();
                        Color color = value.text_color;
                        return CellDefault.CellDefaultAccessory.LabeledPush.copy$default(value, null, null, color != null ? (Color) Color.ADAPTER.redact(color) : null, null, ByteString.EMPTY, 10, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, CellDefault.CellDefaultAccessory.LabeledPush value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter.BOOL.encodeWithTag(writer, 4, value.hide_push_chevron);
                        Color.ADAPTER.encodeWithTag(writer, 3, value.text_color);
                        VerticalAlignment.ADAPTER.encodeWithTag(writer, 2, value.vertical_alignment);
                        LocalizedString.ADAPTER.encodeWithTag(writer, 1, value.text);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ LabeledPush(LocalizedString localizedString, VerticalAlignment verticalAlignment, Color color, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : localizedString, (i & 2) != 0 ? null : verticalAlignment, (i & 4) != 0 ? null : color, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ LabeledPush copy$default(LabeledPush labeledPush, LocalizedString localizedString, VerticalAlignment verticalAlignment, Color color, Boolean bool, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    localizedString = labeledPush.text;
                }
                if ((i & 2) != 0) {
                    verticalAlignment = labeledPush.vertical_alignment;
                }
                if ((i & 4) != 0) {
                    color = labeledPush.text_color;
                }
                if ((i & 8) != 0) {
                    bool = labeledPush.hide_push_chevron;
                }
                if ((i & 16) != 0) {
                    byteString = labeledPush.unknownFields();
                }
                ByteString byteString2 = byteString;
                Color color2 = color;
                return labeledPush.copy(localizedString, verticalAlignment, color2, bool, byteString2);
            }

            public final LabeledPush copy(LocalizedString text, VerticalAlignment vertical_alignment, Color text_color, Boolean hide_push_chevron, ByteString unknownFields) {
                unknownFields.getClass();
                return new LabeledPush(text, vertical_alignment, text_color, hide_push_chevron, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof LabeledPush)) {
                    return false;
                }
                LabeledPush labeledPush = (LabeledPush) other;
                return Intrinsics.areEqual(unknownFields(), labeledPush.unknownFields()) && Intrinsics.areEqual(this.text, labeledPush.text) && this.vertical_alignment == labeledPush.vertical_alignment && Intrinsics.areEqual(this.text_color, labeledPush.text_color) && Intrinsics.areEqual(this.hide_push_chevron, labeledPush.hide_push_chevron);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                LocalizedString localizedString = this.text;
                int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
                VerticalAlignment verticalAlignment = this.vertical_alignment;
                int hashCode3 = (hashCode2 + (verticalAlignment != null ? verticalAlignment.hashCode() : 0)) * 37;
                Color color = this.text_color;
                int hashCode4 = (hashCode3 + (color != null ? color.hashCode() : 0)) * 37;
                Boolean bool = this.hide_push_chevron;
                int hashCode5 = hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.text = this.text;
                builder.vertical_alignment = this.vertical_alignment;
                builder.text_color = this.text_color;
                builder.hide_push_chevron = this.hide_push_chevron;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                if (this.text != null) {
                    arrayList.add("text=██");
                }
                VerticalAlignment verticalAlignment = this.vertical_alignment;
                if (verticalAlignment != null) {
                    arrayList.add("vertical_alignment=" + verticalAlignment);
                }
                Color color = this.text_color;
                if (color != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("text_color=", color, arrayList);
                }
                Boolean bool = this.hide_push_chevron;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("hide_push_chevron=", bool, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "LabeledPush{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$LabeledPush$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$LabeledPush$Builder;", "", "body", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$LabeledPush;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$LabeledPush;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ LabeledPush build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public LabeledPush() {
                this(null, null, null, null, null, 31, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LabeledPush(LocalizedString localizedString, VerticalAlignment verticalAlignment, Color color, Boolean bool, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.text = localizedString;
                this.vertical_alignment = verticalAlignment;
                this.text_color = color;
                this.hide_push_chevron = bool;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Builder;", "", "body", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ CellDefaultAccessory build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Type;", "", "<init>", "()V", "Push", "LabeledPush", "Checkbox", "Radio", "Toggle", "CompactButton", "Label", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Type$Checkbox;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Type$CompactButton;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Type$Label;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Type$LabeledPush;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Type$Push;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Type$Radio;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Type$Toggle;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class Type {

            @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", declaredName = "checkbox", tag = 3)
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Type$Checkbox;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Type;", "value", "", "<init>", "(Z)V", "getValue", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Checkbox extends Type {
                private final boolean value;

                public Checkbox(boolean z) {
                    super(null);
                    this.value = z;
                }

                public static /* synthetic */ Checkbox copy$default(Checkbox checkbox, boolean z, int i, Object obj) {
                    if ((i & 1) != 0) {
                        z = checkbox.value;
                    }
                    return checkbox.copy(z);
                }

                /* renamed from: component1, reason: from getter */
                public final boolean getValue() {
                    return this.value;
                }

                public final Checkbox copy(boolean value) {
                    return new Checkbox(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Checkbox) && this.value == ((Checkbox) other).value;
                }

                public final boolean getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return Boolean.hashCode(this.value);
                }

                public String toString() {
                    return Fragment$5$$ExternalSyntheticOutline0.m("Checkbox(value=", ")", this.value);
                }
            }

            @WireOneofField(adapter = "squareup.cash.ui.arcade.elements.CellDefault$CellDefaultAccessory$CellDefaultAccessoryCompactButton#ADAPTER", declaredName = "compact_button", tag = 6)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Type$CompactButton;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Type;", "value", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$CellDefaultAccessoryCompactButton;", "<init>", "(Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$CellDefaultAccessoryCompactButton;)V", "getValue", "()Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$CellDefaultAccessoryCompactButton;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class CompactButton extends Type {
                private final CellDefaultAccessoryCompactButton value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public CompactButton(CellDefaultAccessoryCompactButton cellDefaultAccessoryCompactButton) {
                    super(null);
                    cellDefaultAccessoryCompactButton.getClass();
                    this.value = cellDefaultAccessoryCompactButton;
                }

                public static /* synthetic */ CompactButton copy$default(CompactButton compactButton, CellDefaultAccessoryCompactButton cellDefaultAccessoryCompactButton, int i, Object obj) {
                    if ((i & 1) != 0) {
                        cellDefaultAccessoryCompactButton = compactButton.value;
                    }
                    return compactButton.copy(cellDefaultAccessoryCompactButton);
                }

                /* renamed from: component1, reason: from getter */
                public final CellDefaultAccessoryCompactButton getValue() {
                    return this.value;
                }

                public final CompactButton copy(CellDefaultAccessoryCompactButton value) {
                    value.getClass();
                    return new CompactButton(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof CompactButton) && Intrinsics.areEqual(this.value, ((CompactButton) other).value);
                }

                public final CellDefaultAccessoryCompactButton getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "CompactButton(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", declaredName = AnnotatedPrivateKey.LABEL, redacted = true, tag = 7)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Type$Label;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Type;", "value", "Lcom/squareup/protos/cash/localization/LocalizedString;", "<init>", "(Lcom/squareup/protos/cash/localization/LocalizedString;)V", "getValue", "()Lcom/squareup/protos/cash/localization/LocalizedString;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Label extends Type {
                private final LocalizedString value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Label(LocalizedString localizedString) {
                    super(null);
                    localizedString.getClass();
                    this.value = localizedString;
                }

                public static /* synthetic */ Label copy$default(Label label, LocalizedString localizedString, int i, Object obj) {
                    if ((i & 1) != 0) {
                        localizedString = label.value;
                    }
                    return label.copy(localizedString);
                }

                /* renamed from: component1, reason: from getter */
                public final LocalizedString getValue() {
                    return this.value;
                }

                public final Label copy(LocalizedString value) {
                    value.getClass();
                    return new Label(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Label) && Intrinsics.areEqual(this.value, ((Label) other).value);
                }

                public final LocalizedString getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Label(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "squareup.cash.ui.arcade.elements.CellDefault$CellDefaultAccessory$LabeledPush#ADAPTER", declaredName = "labeled_push", tag = 2)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Type$LabeledPush;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Type;", "value", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$LabeledPush;", "<init>", "(Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$LabeledPush;)V", "getValue", "()Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$LabeledPush;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class LabeledPush extends Type {
                private final LabeledPush value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public LabeledPush(LabeledPush labeledPush) {
                    super(null);
                    labeledPush.getClass();
                    this.value = labeledPush;
                }

                public static /* synthetic */ LabeledPush copy$default(LabeledPush labeledPush, LabeledPush labeledPush2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        labeledPush2 = labeledPush.value;
                    }
                    return labeledPush.copy(labeledPush2);
                }

                /* renamed from: component1, reason: from getter */
                public final LabeledPush getValue() {
                    return this.value;
                }

                public final LabeledPush copy(LabeledPush value) {
                    value.getClass();
                    return new LabeledPush(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof LabeledPush) && Intrinsics.areEqual(this.value, ((LabeledPush) other).value);
                }

                public final LabeledPush getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "LabeledPush(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", declaredName = "push", tag = 1)
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Type$Push;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Type;", "value", "", "<init>", "(Z)V", "getValue", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Push extends Type {
                private final boolean value;

                public Push(boolean z) {
                    super(null);
                    this.value = z;
                }

                public static /* synthetic */ Push copy$default(Push push, boolean z, int i, Object obj) {
                    if ((i & 1) != 0) {
                        z = push.value;
                    }
                    return push.copy(z);
                }

                /* renamed from: component1, reason: from getter */
                public final boolean getValue() {
                    return this.value;
                }

                public final Push copy(boolean value) {
                    return new Push(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Push) && this.value == ((Push) other).value;
                }

                public final boolean getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return Boolean.hashCode(this.value);
                }

                public String toString() {
                    return Fragment$5$$ExternalSyntheticOutline0.m("Push(value=", ")", this.value);
                }
            }

            @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", declaredName = "radio", tag = 4)
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Type$Radio;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Type;", "value", "", "<init>", "(Z)V", "getValue", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Radio extends Type {
                private final boolean value;

                public Radio(boolean z) {
                    super(null);
                    this.value = z;
                }

                public static /* synthetic */ Radio copy$default(Radio radio, boolean z, int i, Object obj) {
                    if ((i & 1) != 0) {
                        z = radio.value;
                    }
                    return radio.copy(z);
                }

                /* renamed from: component1, reason: from getter */
                public final boolean getValue() {
                    return this.value;
                }

                public final Radio copy(boolean value) {
                    return new Radio(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Radio) && this.value == ((Radio) other).value;
                }

                public final boolean getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return Boolean.hashCode(this.value);
                }

                public String toString() {
                    return Fragment$5$$ExternalSyntheticOutline0.m("Radio(value=", ")", this.value);
                }
            }

            @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", declaredName = "toggle", tag = 5)
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Type$Toggle;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessory$Type;", "value", "", "<init>", "(Z)V", "getValue", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Toggle extends Type {
                private final boolean value;

                public Toggle(boolean z) {
                    super(null);
                    this.value = z;
                }

                public static /* synthetic */ Toggle copy$default(Toggle toggle, boolean z, int i, Object obj) {
                    if ((i & 1) != 0) {
                        z = toggle.value;
                    }
                    return toggle.copy(z);
                }

                /* renamed from: component1, reason: from getter */
                public final boolean getValue() {
                    return this.value;
                }

                public final Toggle copy(boolean value) {
                    return new Toggle(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Toggle) && this.value == ((Toggle) other).value;
                }

                public final boolean getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return Boolean.hashCode(this.value);
                }

                public String toString() {
                    return Fragment$5$$ExternalSyntheticOutline0.m("Toggle(value=", ")", this.value);
                }
            }

            public /* synthetic */ Type(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Type() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CellDefaultAccessory() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CellDefaultAccessory(Type type2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.type = type2;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0013\u0014\u0015\u0016B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$Builder;", "icon_style", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$IconStyle;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$IconStyle;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "IconStyle", "Companion", "TintedIcon", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CellDefaultIcon extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CellDefaultIcon> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireSealedOneof(schemaIndex = 0)
        public final IconStyle icon_style;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon;", "<init>", "()V", "icon_style", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$IconStyle;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public IconStyle icon_style;

            @Override // com.squareup.wire.Message.Builder
            public CellDefaultIcon build() {
                return new CellDefaultIcon(this.icon_style, buildUnknownFields());
            }

            public final Builder icon_style(IconStyle icon_style) {
                this.icon_style = icon_style;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CellDefaultIcon.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.ui.arcade.elements.CellDefault$CellDefaultIcon$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public CellDefault.CellDefaultIcon decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    CellDefault.CellDefaultIcon.IconStyle iconStyle = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new CellDefault.CellDefaultIcon(iconStyle, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            iconStyle = new CellDefault.CellDefaultIcon.IconStyle.Icon((Icon) Icon.ADAPTER.decode(reader));
                        } else if (nextTag == 2) {
                            iconStyle = new CellDefault.CellDefaultIcon.IconStyle.TintedIcon((CellDefault.CellDefaultIcon.TintedIcon) CellDefault.CellDefaultIcon.TintedIcon.ADAPTER.decode(reader));
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            iconStyle = new CellDefault.CellDefaultIcon.IconStyle.Avatar((UiAvatar) UiAvatar.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, CellDefault.CellDefaultIcon value) {
                    writer.getClass();
                    value.getClass();
                    CellDefault.CellDefaultIcon.IconStyle iconStyle = value.icon_style;
                    if (iconStyle instanceof CellDefault.CellDefaultIcon.IconStyle.Icon) {
                        Icon.ADAPTER.encodeWithTag(writer, 1, ((CellDefault.CellDefaultIcon.IconStyle.Icon) iconStyle).getValue());
                    } else if (iconStyle instanceof CellDefault.CellDefaultIcon.IconStyle.TintedIcon) {
                        CellDefault.CellDefaultIcon.TintedIcon.ADAPTER.encodeWithTag(writer, 2, ((CellDefault.CellDefaultIcon.IconStyle.TintedIcon) iconStyle).getValue());
                    } else if (iconStyle instanceof CellDefault.CellDefaultIcon.IconStyle.Avatar) {
                        UiAvatar.ADAPTER.encodeWithTag(writer, 3, ((CellDefault.CellDefaultIcon.IconStyle.Avatar) iconStyle).getValue());
                    } else if (iconStyle != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(CellDefault.CellDefaultIcon value) {
                    int encodedSizeWithTag;
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    CellDefault.CellDefaultIcon.IconStyle iconStyle = value.icon_style;
                    if (iconStyle instanceof CellDefault.CellDefaultIcon.IconStyle.Icon) {
                        encodedSizeWithTag = Icon.ADAPTER.encodedSizeWithTag(1, ((CellDefault.CellDefaultIcon.IconStyle.Icon) iconStyle).getValue());
                    } else if (iconStyle instanceof CellDefault.CellDefaultIcon.IconStyle.TintedIcon) {
                        encodedSizeWithTag = CellDefault.CellDefaultIcon.TintedIcon.ADAPTER.encodedSizeWithTag(2, ((CellDefault.CellDefaultIcon.IconStyle.TintedIcon) iconStyle).getValue());
                    } else {
                        if (!(iconStyle instanceof CellDefault.CellDefaultIcon.IconStyle.Avatar)) {
                            if (iconStyle == null) {
                                return size$okio;
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        encodedSizeWithTag = UiAvatar.ADAPTER.encodedSizeWithTag(3, ((CellDefault.CellDefaultIcon.IconStyle.Avatar) iconStyle).getValue());
                    }
                    return encodedSizeWithTag + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public CellDefault.CellDefaultIcon redact(CellDefault.CellDefaultIcon value) {
                    value.getClass();
                    return CellDefault.CellDefaultIcon.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, CellDefault.CellDefaultIcon value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    CellDefault.CellDefaultIcon.IconStyle iconStyle = value.icon_style;
                    if (iconStyle instanceof CellDefault.CellDefaultIcon.IconStyle.Icon) {
                        Icon.ADAPTER.encodeWithTag(writer, 1, ((CellDefault.CellDefaultIcon.IconStyle.Icon) iconStyle).getValue());
                        return;
                    }
                    if (iconStyle instanceof CellDefault.CellDefaultIcon.IconStyle.TintedIcon) {
                        CellDefault.CellDefaultIcon.TintedIcon.ADAPTER.encodeWithTag(writer, 2, ((CellDefault.CellDefaultIcon.IconStyle.TintedIcon) iconStyle).getValue());
                    } else if (iconStyle instanceof CellDefault.CellDefaultIcon.IconStyle.Avatar) {
                        UiAvatar.ADAPTER.encodeWithTag(writer, 3, ((CellDefault.CellDefaultIcon.IconStyle.Avatar) iconStyle).getValue());
                    } else {
                        if (iconStyle == null) {
                            return;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                    }
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ CellDefaultIcon(IconStyle iconStyle, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : iconStyle, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ CellDefaultIcon copy$default(CellDefaultIcon cellDefaultIcon, IconStyle iconStyle, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                iconStyle = cellDefaultIcon.icon_style;
            }
            if ((i & 2) != 0) {
                byteString = cellDefaultIcon.unknownFields();
            }
            return cellDefaultIcon.copy(iconStyle, byteString);
        }

        public final CellDefaultIcon copy(IconStyle icon_style, ByteString unknownFields) {
            unknownFields.getClass();
            return new CellDefaultIcon(icon_style, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CellDefaultIcon)) {
                return false;
            }
            CellDefaultIcon cellDefaultIcon = (CellDefaultIcon) other;
            return Intrinsics.areEqual(unknownFields(), cellDefaultIcon.unknownFields()) && Intrinsics.areEqual(this.icon_style, cellDefaultIcon.icon_style);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            IconStyle iconStyle = this.icon_style;
            int hashCode2 = hashCode + (iconStyle != null ? iconStyle.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.icon_style = this.icon_style;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            IconStyle iconStyle = this.icon_style;
            if (iconStyle != null) {
                arrayList.add("icon_style=" + iconStyle);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CellDefaultIcon{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0016J4\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$TintedIcon;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$TintedIcon$Builder;", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "background_color", "Lcom/squareup/protos/cash/ui/Color;", "icon_tint_color", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/ui/Icon;Lcom/squareup/protos/cash/ui/Color;Lcom/squareup/protos/cash/ui/Color;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class TintedIcon extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<TintedIcon> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 1, tag = 2)
            public final Color background_color;

            @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 0, tag = 1)
            public final Icon icon;

            @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 2, tag = 3)
            public final Color icon_tint_color;

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$TintedIcon$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$TintedIcon;", "<init>", "()V", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "background_color", "Lcom/squareup/protos/cash/ui/Color;", "icon_tint_color", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public Color background_color;
                public Icon icon;
                public Color icon_tint_color;

                public final Builder background_color(Color background_color) {
                    this.background_color = background_color;
                    return this;
                }

                @Override // com.squareup.wire.Message.Builder
                public TintedIcon build() {
                    return new TintedIcon(this.icon, this.background_color, this.icon_tint_color, buildUnknownFields());
                }

                public final Builder icon(Icon icon) {
                    this.icon = icon;
                    return this;
                }

                public final Builder icon_tint_color(Color icon_tint_color) {
                    this.icon_tint_color = icon_tint_color;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TintedIcon.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.ui.arcade.elements.CellDefault$CellDefaultIcon$TintedIcon$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public CellDefault.CellDefaultIcon.TintedIcon decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new CellDefault.CellDefaultIcon.TintedIcon((Icon) obj, (Color) obj2, (Color) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj);
                            } else if (nextTag == 2) {
                                obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj2);
                            } else if (nextTag != 3) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj3);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, CellDefault.CellDefaultIcon.TintedIcon value) {
                        writer.getClass();
                        value.getClass();
                        Icon.ADAPTER.encodeWithTag(writer, 1, value.icon);
                        ProtoAdapter protoAdapter2 = Color.ADAPTER;
                        protoAdapter2.encodeWithTag(writer, 2, value.background_color);
                        protoAdapter2.encodeWithTag(writer, 3, value.icon_tint_color);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(CellDefault.CellDefaultIcon.TintedIcon value) {
                        value.getClass();
                        int encodedSizeWithTag = Icon.ADAPTER.encodedSizeWithTag(1, value.icon) + value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = Color.ADAPTER;
                        return protoAdapter2.encodedSizeWithTag(3, value.icon_tint_color) + protoAdapter2.encodedSizeWithTag(2, value.background_color) + encodedSizeWithTag;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public CellDefault.CellDefaultIcon.TintedIcon redact(CellDefault.CellDefaultIcon.TintedIcon value) {
                        value.getClass();
                        Icon icon = value.icon;
                        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
                        Color color = value.background_color;
                        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
                        Color color3 = value.icon_tint_color;
                        return value.copy(icon2, color2, color3 != null ? (Color) Color.ADAPTER.redact(color3) : null, ByteString.EMPTY);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, CellDefault.CellDefaultIcon.TintedIcon value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = Color.ADAPTER;
                        protoAdapter2.encodeWithTag(writer, 3, value.icon_tint_color);
                        protoAdapter2.encodeWithTag(writer, 2, value.background_color);
                        Icon.ADAPTER.encodeWithTag(writer, 1, value.icon);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ TintedIcon(Icon icon, Color color, Color color2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : icon, (i & 2) != 0 ? null : color, (i & 4) != 0 ? null : color2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ TintedIcon copy$default(TintedIcon tintedIcon, Icon icon, Color color, Color color2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    icon = tintedIcon.icon;
                }
                if ((i & 2) != 0) {
                    color = tintedIcon.background_color;
                }
                if ((i & 4) != 0) {
                    color2 = tintedIcon.icon_tint_color;
                }
                if ((i & 8) != 0) {
                    byteString = tintedIcon.unknownFields();
                }
                return tintedIcon.copy(icon, color, color2, byteString);
            }

            public final TintedIcon copy(Icon icon, Color background_color, Color icon_tint_color, ByteString unknownFields) {
                unknownFields.getClass();
                return new TintedIcon(icon, background_color, icon_tint_color, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof TintedIcon)) {
                    return false;
                }
                TintedIcon tintedIcon = (TintedIcon) other;
                return Intrinsics.areEqual(unknownFields(), tintedIcon.unknownFields()) && Intrinsics.areEqual(this.icon, tintedIcon.icon) && Intrinsics.areEqual(this.background_color, tintedIcon.background_color) && Intrinsics.areEqual(this.icon_tint_color, tintedIcon.icon_tint_color);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Icon icon = this.icon;
                int hashCode2 = (hashCode + (icon != null ? icon.hashCode() : 0)) * 37;
                Color color = this.background_color;
                int hashCode3 = (hashCode2 + (color != null ? color.hashCode() : 0)) * 37;
                Color color2 = this.icon_tint_color;
                int hashCode4 = hashCode3 + (color2 != null ? color2.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.icon = this.icon;
                builder.background_color = this.background_color;
                builder.icon_tint_color = this.icon_tint_color;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                Icon icon = this.icon;
                if (icon != null) {
                    Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
                }
                Color color = this.background_color;
                if (color != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("background_color=", color, arrayList);
                }
                Color color2 = this.icon_tint_color;
                if (color2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("icon_tint_color=", color2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "TintedIcon{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$TintedIcon$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$TintedIcon$Builder;", "", "body", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$TintedIcon;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$TintedIcon;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ TintedIcon build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public TintedIcon() {
                this(null, null, null, null, 15, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TintedIcon(Icon icon, Color color, Color color2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.icon = icon;
                this.background_color = color;
                this.icon_tint_color = color2;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$Builder;", "", "body", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ CellDefaultIcon build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$IconStyle;", "", "<init>", "()V", "Icon", "TintedIcon", "Avatar", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$IconStyle$Avatar;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$IconStyle$Icon;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$IconStyle$TintedIcon;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class IconStyle {

            @WireOneofField(adapter = "com.squareup.protos.franklin.ui.UiAvatar#ADAPTER", declaredName = "avatar", tag = 3)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$IconStyle$Avatar;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$IconStyle;", "value", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "<init>", "(Lcom/squareup/protos/franklin/ui/UiAvatar;)V", "getValue", "()Lcom/squareup/protos/franklin/ui/UiAvatar;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Avatar extends IconStyle {
                private final UiAvatar value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Avatar(UiAvatar uiAvatar) {
                    super(null);
                    uiAvatar.getClass();
                    this.value = uiAvatar;
                }

                public static /* synthetic */ Avatar copy$default(Avatar avatar, UiAvatar uiAvatar, int i, Object obj) {
                    if ((i & 1) != 0) {
                        uiAvatar = avatar.value;
                    }
                    return avatar.copy(uiAvatar);
                }

                /* renamed from: component1, reason: from getter */
                public final UiAvatar getValue() {
                    return this.value;
                }

                public final Avatar copy(UiAvatar value) {
                    value.getClass();
                    return new Avatar(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Avatar) && Intrinsics.areEqual(this.value, ((Avatar) other).value);
                }

                public final UiAvatar getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "Avatar(value=", ")");
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", declaredName = "icon", tag = 1)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$IconStyle$Icon;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$IconStyle;", "value", "Lcom/squareup/protos/cash/ui/Icon;", "<init>", "(Lcom/squareup/protos/cash/ui/Icon;)V", "getValue", "()Lcom/squareup/protos/cash/ui/Icon;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Icon extends IconStyle {
                private final com.squareup.protos.cash.ui.Icon value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Icon(com.squareup.protos.cash.ui.Icon icon) {
                    super(null);
                    icon.getClass();
                    this.value = icon;
                }

                public static /* synthetic */ Icon copy$default(Icon icon, com.squareup.protos.cash.ui.Icon icon2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        icon2 = icon.value;
                    }
                    return icon.copy(icon2);
                }

                /* renamed from: component1, reason: from getter */
                public final com.squareup.protos.cash.ui.Icon getValue() {
                    return this.value;
                }

                public final Icon copy(com.squareup.protos.cash.ui.Icon value) {
                    value.getClass();
                    return new Icon(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Icon) && Intrinsics.areEqual(this.value, ((Icon) other).value);
                }

                public final com.squareup.protos.cash.ui.Icon getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Icon(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "squareup.cash.ui.arcade.elements.CellDefault$CellDefaultIcon$TintedIcon#ADAPTER", declaredName = "tinted_icon", tag = 2)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$IconStyle$TintedIcon;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$IconStyle;", "value", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$TintedIcon;", "<init>", "(Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$TintedIcon;)V", "getValue", "()Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon$TintedIcon;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class TintedIcon extends IconStyle {
                private final TintedIcon value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public TintedIcon(TintedIcon tintedIcon) {
                    super(null);
                    tintedIcon.getClass();
                    this.value = tintedIcon;
                }

                public static /* synthetic */ TintedIcon copy$default(TintedIcon tintedIcon, TintedIcon tintedIcon2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        tintedIcon2 = tintedIcon.value;
                    }
                    return tintedIcon.copy(tintedIcon2);
                }

                /* renamed from: component1, reason: from getter */
                public final TintedIcon getValue() {
                    return this.value;
                }

                public final TintedIcon copy(TintedIcon value) {
                    value.getClass();
                    return new TintedIcon(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof TintedIcon) && Intrinsics.areEqual(this.value, ((TintedIcon) other).value);
                }

                public final TintedIcon getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "TintedIcon(value=" + this.value + ")";
                }
            }

            public /* synthetic */ IconStyle(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private IconStyle() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CellDefaultIcon() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CellDefaultIcon(IconStyle iconStyle, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.icon_style = iconStyle;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CellDefault.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.ui.arcade.elements.CellDefault$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public CellDefault decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new CellDefault((CellDefault.CellDefaultIcon) obj, (LocalizedString) obj2, (LocalizedString) obj3, (CellDefault.CellDefaultAccessoryLeadingImage) obj4, (CellDefault.CellDefaultAccessory) obj5, (TintedIcon) obj6, (Icon) obj7, (Boolean) obj8, (Boolean) obj9, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = TransactorKt.decodeMessageOrMerge(CellDefault.CellDefaultIcon.ADAPTER, reader, obj);
                            break;
                        case 2:
                            obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj2);
                            break;
                        case 3:
                            obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, reader, obj3);
                            break;
                        case 4:
                            obj5 = TransactorKt.decodeMessageOrMerge(CellDefault.CellDefaultAccessory.ADAPTER, reader, obj5);
                            break;
                        case 5:
                            obj6 = TransactorKt.decodeMessageOrMerge(TintedIcon.ADAPTER, reader, obj6);
                            break;
                        case 6:
                            obj7 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj7);
                            break;
                        case 7:
                            obj8 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 8:
                            obj9 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 9:
                            obj4 = TransactorKt.decodeMessageOrMerge(CellDefault.CellDefaultAccessoryLeadingImage.ADAPTER, reader, obj4);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CellDefault value) {
                writer.getClass();
                value.getClass();
                CellDefault.CellDefaultIcon.ADAPTER.encodeWithTag(writer, 1, value.icon);
                ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 2, value.label_text);
                protoAdapter2.encodeWithTag(writer, 3, value.body_text);
                CellDefault.CellDefaultAccessoryLeadingImage.ADAPTER.encodeWithTag(writer, 9, value.accessory_leading_image);
                CellDefault.CellDefaultAccessory.ADAPTER.encodeWithTag(writer, 4, value.accessory);
                TintedIcon.ADAPTER.encodeWithTag(writer, 5, value.label_icon);
                Icon.ADAPTER.encodeWithTag(writer, 6, value.body_icon);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(writer, 7, value.is_badged);
                protoAdapter3.encodeWithTag(writer, 8, value.disabled);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CellDefault value) {
                value.getClass();
                int encodedSizeWithTag = CellDefault.CellDefaultIcon.ADAPTER.encodedSizeWithTag(1, value.icon) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
                int encodedSizeWithTag2 = Icon.ADAPTER.encodedSizeWithTag(6, value.body_icon) + TintedIcon.ADAPTER.encodedSizeWithTag(5, value.label_icon) + CellDefault.CellDefaultAccessory.ADAPTER.encodedSizeWithTag(4, value.accessory) + CellDefault.CellDefaultAccessoryLeadingImage.ADAPTER.encodedSizeWithTag(9, value.accessory_leading_image) + protoAdapter2.encodedSizeWithTag(3, value.body_text) + protoAdapter2.encodedSizeWithTag(2, value.label_text) + encodedSizeWithTag;
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                return protoAdapter3.encodedSizeWithTag(8, value.disabled) + protoAdapter3.encodedSizeWithTag(7, value.is_badged) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CellDefault redact(CellDefault value) {
                value.getClass();
                CellDefault.CellDefaultIcon cellDefaultIcon = value.icon;
                CellDefault.CellDefaultIcon cellDefaultIcon2 = cellDefaultIcon != null ? (CellDefault.CellDefaultIcon) CellDefault.CellDefaultIcon.ADAPTER.redact(cellDefaultIcon) : null;
                CellDefault.CellDefaultAccessoryLeadingImage cellDefaultAccessoryLeadingImage = value.accessory_leading_image;
                CellDefault.CellDefaultAccessoryLeadingImage cellDefaultAccessoryLeadingImage2 = cellDefaultAccessoryLeadingImage != null ? (CellDefault.CellDefaultAccessoryLeadingImage) CellDefault.CellDefaultAccessoryLeadingImage.ADAPTER.redact(cellDefaultAccessoryLeadingImage) : null;
                CellDefault.CellDefaultAccessory cellDefaultAccessory = value.accessory;
                CellDefault.CellDefaultAccessory cellDefaultAccessory2 = cellDefaultAccessory != null ? (CellDefault.CellDefaultAccessory) CellDefault.CellDefaultAccessory.ADAPTER.redact(cellDefaultAccessory) : null;
                TintedIcon tintedIcon = value.label_icon;
                TintedIcon tintedIcon2 = tintedIcon != null ? (TintedIcon) TintedIcon.ADAPTER.redact(tintedIcon) : null;
                Icon icon = value.body_icon;
                Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = value.is_badged;
                Boolean bool2 = value.disabled;
                byteString.getClass();
                return new CellDefault(cellDefaultIcon2, null, null, cellDefaultAccessoryLeadingImage2, cellDefaultAccessory2, tintedIcon2, icon2, bool, bool2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CellDefault value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 8, value.disabled);
                protoAdapter2.encodeWithTag(writer, 7, value.is_badged);
                Icon.ADAPTER.encodeWithTag(writer, 6, value.body_icon);
                TintedIcon.ADAPTER.encodeWithTag(writer, 5, value.label_icon);
                CellDefault.CellDefaultAccessory.ADAPTER.encodeWithTag(writer, 4, value.accessory);
                CellDefault.CellDefaultAccessoryLeadingImage.ADAPTER.encodeWithTag(writer, 9, value.accessory_leading_image);
                ProtoAdapter protoAdapter3 = LocalizedString.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 3, value.body_text);
                protoAdapter3.encodeWithTag(writer, 2, value.label_text);
                CellDefault.CellDefaultIcon.ADAPTER.encodeWithTag(writer, 1, value.icon);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public /* synthetic */ CellDefault(CellDefaultIcon cellDefaultIcon, LocalizedString localizedString, LocalizedString localizedString2, CellDefaultAccessory cellDefaultAccessory, int i) {
        this((i & 1) != 0 ? null : cellDefaultIcon, localizedString, localizedString2, null, (i & 16) != 0 ? null : cellDefaultAccessory, null, null, null, null, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CellDefault)) {
            return false;
        }
        CellDefault cellDefault = (CellDefault) obj;
        return Intrinsics.areEqual(unknownFields(), cellDefault.unknownFields()) && Intrinsics.areEqual(this.icon, cellDefault.icon) && Intrinsics.areEqual(this.label_text, cellDefault.label_text) && Intrinsics.areEqual(this.body_text, cellDefault.body_text) && Intrinsics.areEqual(this.accessory_leading_image, cellDefault.accessory_leading_image) && Intrinsics.areEqual(this.accessory, cellDefault.accessory) && Intrinsics.areEqual(this.label_icon, cellDefault.label_icon) && Intrinsics.areEqual(this.body_icon, cellDefault.body_icon) && Intrinsics.areEqual(this.is_badged, cellDefault.is_badged) && Intrinsics.areEqual(this.disabled, cellDefault.disabled);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CellDefaultIcon cellDefaultIcon = this.icon;
        int hashCode2 = (hashCode + (cellDefaultIcon != null ? cellDefaultIcon.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.label_text;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.body_text;
        int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        CellDefaultAccessoryLeadingImage cellDefaultAccessoryLeadingImage = this.accessory_leading_image;
        int hashCode5 = (hashCode4 + (cellDefaultAccessoryLeadingImage != null ? cellDefaultAccessoryLeadingImage.hashCode() : 0)) * 37;
        CellDefaultAccessory cellDefaultAccessory = this.accessory;
        int hashCode6 = (hashCode5 + (cellDefaultAccessory != null ? cellDefaultAccessory.hashCode() : 0)) * 37;
        TintedIcon tintedIcon = this.label_icon;
        int hashCode7 = (hashCode6 + (tintedIcon != null ? tintedIcon.hashCode() : 0)) * 37;
        Icon icon = this.body_icon;
        int hashCode8 = (hashCode7 + (icon != null ? icon.hashCode() : 0)) * 37;
        Boolean bool = this.is_badged;
        int hashCode9 = (hashCode8 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.disabled;
        int hashCode10 = hashCode9 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.icon = this.icon;
        builder.label_text = this.label_text;
        builder.body_text = this.body_text;
        builder.accessory_leading_image = this.accessory_leading_image;
        builder.accessory = this.accessory;
        builder.label_icon = this.label_icon;
        builder.body_icon = this.body_icon;
        builder.is_badged = this.is_badged;
        builder.disabled = this.disabled;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CellDefaultIcon cellDefaultIcon = this.icon;
        if (cellDefaultIcon != null) {
            arrayList.add("icon=" + cellDefaultIcon);
        }
        if (this.label_text != null) {
            arrayList.add("label_text=██");
        }
        if (this.body_text != null) {
            arrayList.add("body_text=██");
        }
        CellDefaultAccessoryLeadingImage cellDefaultAccessoryLeadingImage = this.accessory_leading_image;
        if (cellDefaultAccessoryLeadingImage != null) {
            arrayList.add("accessory_leading_image=" + cellDefaultAccessoryLeadingImage);
        }
        CellDefaultAccessory cellDefaultAccessory = this.accessory;
        if (cellDefaultAccessory != null) {
            arrayList.add("accessory=" + cellDefaultAccessory);
        }
        TintedIcon tintedIcon = this.label_icon;
        if (tintedIcon != null) {
            arrayList.add("label_icon=" + tintedIcon);
        }
        Icon icon = this.body_icon;
        if (icon != null) {
            Matcher$$ExternalSyntheticOutline0.m("body_icon=", icon, arrayList);
        }
        Boolean bool = this.is_badged;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_badged=", bool, arrayList);
        }
        Boolean bool2 = this.disabled;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("disabled=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CellDefault{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0013\u0014\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessoryLeadingImage;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessoryLeadingImage$Builder;", "type", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessoryLeadingImage$Type;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessoryLeadingImage$Type;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Type", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CellDefaultAccessoryLeadingImage extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CellDefaultAccessoryLeadingImage> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireSealedOneof(schemaIndex = 0)
        public final Type type;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessoryLeadingImage$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessoryLeadingImage;", "<init>", "()V", "type", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessoryLeadingImage$Type;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Type type;

            @Override // com.squareup.wire.Message.Builder
            public CellDefaultAccessoryLeadingImage build() {
                return new CellDefaultAccessoryLeadingImage(this.type, buildUnknownFields());
            }

            public final Builder type(Type type2) {
                this.type = type2;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CellDefaultAccessoryLeadingImage.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: squareup.cash.ui.arcade.elements.CellDefault$CellDefaultAccessoryLeadingImage$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public CellDefault.CellDefaultAccessoryLeadingImage decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    CellDefault.CellDefaultAccessoryLeadingImage.Type type2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new CellDefault.CellDefaultAccessoryLeadingImage(type2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            type2 = new CellDefault.CellDefaultAccessoryLeadingImage.Type.Icon((CellDefault.CellDefaultIcon) CellDefault.CellDefaultIcon.ADAPTER.decode(reader));
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            type2 = new CellDefault.CellDefaultAccessoryLeadingImage.Type.RemoteImage((Image) Image.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, CellDefault.CellDefaultAccessoryLeadingImage value) {
                    writer.getClass();
                    value.getClass();
                    CellDefault.CellDefaultAccessoryLeadingImage.Type type2 = value.type;
                    if (type2 instanceof CellDefault.CellDefaultAccessoryLeadingImage.Type.Icon) {
                        CellDefault.CellDefaultIcon.ADAPTER.encodeWithTag(writer, 1, ((CellDefault.CellDefaultAccessoryLeadingImage.Type.Icon) type2).getValue());
                    } else if (type2 instanceof CellDefault.CellDefaultAccessoryLeadingImage.Type.RemoteImage) {
                        Image.ADAPTER.encodeWithTag(writer, 2, ((CellDefault.CellDefaultAccessoryLeadingImage.Type.RemoteImage) type2).getValue());
                    } else if (type2 != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(CellDefault.CellDefaultAccessoryLeadingImage value) {
                    int encodedSizeWithTag;
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    CellDefault.CellDefaultAccessoryLeadingImage.Type type2 = value.type;
                    if (type2 instanceof CellDefault.CellDefaultAccessoryLeadingImage.Type.Icon) {
                        encodedSizeWithTag = CellDefault.CellDefaultIcon.ADAPTER.encodedSizeWithTag(1, ((CellDefault.CellDefaultAccessoryLeadingImage.Type.Icon) type2).getValue());
                    } else {
                        if (!(type2 instanceof CellDefault.CellDefaultAccessoryLeadingImage.Type.RemoteImage)) {
                            if (type2 == null) {
                                return size$okio;
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(2, ((CellDefault.CellDefaultAccessoryLeadingImage.Type.RemoteImage) type2).getValue());
                    }
                    return encodedSizeWithTag + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public CellDefault.CellDefaultAccessoryLeadingImage redact(CellDefault.CellDefaultAccessoryLeadingImage value) {
                    value.getClass();
                    return CellDefault.CellDefaultAccessoryLeadingImage.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, CellDefault.CellDefaultAccessoryLeadingImage value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    CellDefault.CellDefaultAccessoryLeadingImage.Type type2 = value.type;
                    if (type2 instanceof CellDefault.CellDefaultAccessoryLeadingImage.Type.Icon) {
                        CellDefault.CellDefaultIcon.ADAPTER.encodeWithTag(writer, 1, ((CellDefault.CellDefaultAccessoryLeadingImage.Type.Icon) type2).getValue());
                    } else if (type2 instanceof CellDefault.CellDefaultAccessoryLeadingImage.Type.RemoteImage) {
                        Image.ADAPTER.encodeWithTag(writer, 2, ((CellDefault.CellDefaultAccessoryLeadingImage.Type.RemoteImage) type2).getValue());
                    } else {
                        if (type2 == null) {
                            return;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                    }
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ CellDefaultAccessoryLeadingImage(Type type2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : type2, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ CellDefaultAccessoryLeadingImage copy$default(CellDefaultAccessoryLeadingImage cellDefaultAccessoryLeadingImage, Type type2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                type2 = cellDefaultAccessoryLeadingImage.type;
            }
            if ((i & 2) != 0) {
                byteString = cellDefaultAccessoryLeadingImage.unknownFields();
            }
            return cellDefaultAccessoryLeadingImage.copy(type2, byteString);
        }

        public final CellDefaultAccessoryLeadingImage copy(Type type2, ByteString unknownFields) {
            unknownFields.getClass();
            return new CellDefaultAccessoryLeadingImage(type2, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CellDefaultAccessoryLeadingImage)) {
                return false;
            }
            CellDefaultAccessoryLeadingImage cellDefaultAccessoryLeadingImage = (CellDefaultAccessoryLeadingImage) other;
            return Intrinsics.areEqual(unknownFields(), cellDefaultAccessoryLeadingImage.unknownFields()) && Intrinsics.areEqual(this.type, cellDefaultAccessoryLeadingImage.type);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Type type2 = this.type;
            int hashCode2 = hashCode + (type2 != null ? type2.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.type = this.type;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Type type2 = this.type;
            if (type2 != null) {
                arrayList.add("type=" + type2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CellDefaultAccessoryLeadingImage{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessoryLeadingImage$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessoryLeadingImage$Builder;", "", "body", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessoryLeadingImage;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessoryLeadingImage;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ CellDefaultAccessoryLeadingImage build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessoryLeadingImage$Type;", "", "<init>", "()V", "Icon", "RemoteImage", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessoryLeadingImage$Type$Icon;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessoryLeadingImage$Type$RemoteImage;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class Type {

            @WireOneofField(adapter = "squareup.cash.ui.arcade.elements.CellDefault$CellDefaultIcon#ADAPTER", declaredName = "icon", tag = 1)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessoryLeadingImage$Type$Icon;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessoryLeadingImage$Type;", "value", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon;", "<init>", "(Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon;)V", "getValue", "()Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultIcon;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Icon extends Type {
                private final CellDefaultIcon value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Icon(CellDefaultIcon cellDefaultIcon) {
                    super(null);
                    cellDefaultIcon.getClass();
                    this.value = cellDefaultIcon;
                }

                public static /* synthetic */ Icon copy$default(Icon icon, CellDefaultIcon cellDefaultIcon, int i, Object obj) {
                    if ((i & 1) != 0) {
                        cellDefaultIcon = icon.value;
                    }
                    return icon.copy(cellDefaultIcon);
                }

                /* renamed from: component1, reason: from getter */
                public final CellDefaultIcon getValue() {
                    return this.value;
                }

                public final Icon copy(CellDefaultIcon value) {
                    value.getClass();
                    return new Icon(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Icon) && Intrinsics.areEqual(this.value, ((Icon) other).value);
                }

                public final CellDefaultIcon getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Icon(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", declaredName = "remote_image", tag = 2)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessoryLeadingImage$Type$RemoteImage;", "Lsquareup/cash/ui/arcade/elements/CellDefault$CellDefaultAccessoryLeadingImage$Type;", "value", "Lcom/squareup/protos/cash/ui/Image;", "<init>", "(Lcom/squareup/protos/cash/ui/Image;)V", "getValue", "()Lcom/squareup/protos/cash/ui/Image;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class RemoteImage extends Type {
                private final Image value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public RemoteImage(Image image) {
                    super(null);
                    image.getClass();
                    this.value = image;
                }

                public static /* synthetic */ RemoteImage copy$default(RemoteImage remoteImage, Image image, int i, Object obj) {
                    if ((i & 1) != 0) {
                        image = remoteImage.value;
                    }
                    return remoteImage.copy(image);
                }

                /* renamed from: component1, reason: from getter */
                public final Image getValue() {
                    return this.value;
                }

                public final RemoteImage copy(Image value) {
                    value.getClass();
                    return new RemoteImage(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof RemoteImage) && Intrinsics.areEqual(this.value, ((RemoteImage) other).value);
                }

                public final Image getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return SVG$Unit$EnumUnboxingLocalUtility.m(this.value, "RemoteImage(value=", ")");
                }
            }

            public /* synthetic */ Type(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Type() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CellDefaultAccessoryLeadingImage() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CellDefaultAccessoryLeadingImage(Type type2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.type = type2;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lsquareup/cash/ui/arcade/elements/CellDefault$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lsquareup/cash/ui/arcade/elements/CellDefault$Builder;", "", "body", "Lsquareup/cash/ui/arcade/elements/CellDefault;", "build", "(Lkotlin/jvm/functions/Function1;)Lsquareup/cash/ui/arcade/elements/CellDefault;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ CellDefault build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellDefault(CellDefaultIcon cellDefaultIcon, LocalizedString localizedString, LocalizedString localizedString2, CellDefaultAccessoryLeadingImage cellDefaultAccessoryLeadingImage, CellDefaultAccessory cellDefaultAccessory, TintedIcon tintedIcon, Icon icon, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.icon = cellDefaultIcon;
        this.label_text = localizedString;
        this.body_text = localizedString2;
        this.accessory_leading_image = cellDefaultAccessoryLeadingImage;
        this.accessory = cellDefaultAccessory;
        this.label_icon = tintedIcon;
        this.body_icon = icon;
        this.is_badged = bool;
        this.disabled = bool2;
    }
}
