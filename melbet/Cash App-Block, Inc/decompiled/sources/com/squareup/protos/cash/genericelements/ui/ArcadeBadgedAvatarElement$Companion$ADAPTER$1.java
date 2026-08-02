package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import coil3.network.internal.Utils_androidKt;
import com.google.android.gms.internal.mlkit_vision_common.zzbc;
import com.squareup.protos.cash.genericelements.ui.ArcadeBadgedAvatarElement;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ArcadeBadgedAvatarElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        zzbc arcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon;
        Object obj5;
        Utils_androidKt arcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        zzbc zzbcVar = null;
        Utils_androidKt utils_androidKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ArcadeBadgedAvatarElement((ArcadeBadgedAvatarElement.Size) obj6, (String) obj7, (SemanticBackgroundColor) obj8, (String) obj9, zzbcVar, utils_androidKt, (Alignment) obj10, (Color) obj11, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = obj6;
                    obj2 = obj7;
                    obj3 = obj8;
                    try {
                        obj6 = ArcadeBadgedAvatarElement.Size.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj8 = obj3;
                    obj7 = obj2;
                    break;
                case 2:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj = obj6;
                    obj2 = obj7;
                    try {
                        obj6 = obj;
                        obj8 = SemanticBackgroundColor.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj3 = obj8;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                    obj7 = obj2;
                    break;
                case 4:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj4 = obj6;
                    arcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon = new ArcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon((ArcadeBadgedAvatarElement.AvatarImageLocalIcon) ArcadeBadgedAvatarElement.AvatarImageLocalIcon.ADAPTER.decode(protoReader));
                    obj6 = obj4;
                    zzbcVar = arcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon;
                    break;
                case 6:
                    obj4 = obj6;
                    arcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon = new ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteIcon((ArcadeBadgedAvatarElement.AvatarImageRemoteIcon) ArcadeBadgedAvatarElement.AvatarImageRemoteIcon.ADAPTER.decode(protoReader));
                    obj6 = obj4;
                    zzbcVar = arcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon;
                    break;
                case 7:
                    obj4 = obj6;
                    arcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon = new ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteImage((ArcadeBadgedAvatarElement.AvatarImageRemoteImage) ArcadeBadgedAvatarElement.AvatarImageRemoteImage.ADAPTER.decode(protoReader));
                    obj6 = obj4;
                    zzbcVar = arcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon;
                    break;
                case 8:
                    obj5 = obj6;
                    arcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon = new ArcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon((ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon) ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon.ADAPTER.decode(protoReader));
                    obj6 = obj5;
                    utils_androidKt = arcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon;
                    break;
                case 9:
                    obj5 = obj6;
                    arcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon = new ArcadeBadgedAvatarElement$AvatarBadge$BadgeRemoteImage((ArcadeBadgedAvatarElement.AvatarBadgeRemoteImage) ArcadeBadgedAvatarElement.AvatarBadgeRemoteImage.ADAPTER.decode(protoReader));
                    obj6 = obj5;
                    utils_androidKt = arcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon;
                    break;
                case 10:
                    try {
                        obj10 = Alignment.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        obj = obj6;
                        obj2 = obj7;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 11:
                    obj11 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj11);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj6;
                    obj2 = obj7;
                    obj3 = obj8;
                    obj6 = obj;
                    obj8 = obj3;
                    obj7 = obj2;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ArcadeBadgedAvatarElement arcadeBadgedAvatarElement = (ArcadeBadgedAvatarElement) obj;
        reverseProtoWriter.getClass();
        arcadeBadgedAvatarElement.getClass();
        reverseProtoWriter.writeBytes(arcadeBadgedAvatarElement.unknownFields());
        Utils_androidKt utils_androidKt = arcadeBadgedAvatarElement.avatar_badge;
        if (utils_androidKt instanceof ArcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon) {
            ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((ArcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon) utils_androidKt).value);
        } else if (utils_androidKt instanceof ArcadeBadgedAvatarElement$AvatarBadge$BadgeRemoteImage) {
            ArcadeBadgedAvatarElement.AvatarBadgeRemoteImage.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((ArcadeBadgedAvatarElement$AvatarBadge$BadgeRemoteImage) utils_androidKt).value);
        } else if (utils_androidKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        zzbc zzbcVar = arcadeBadgedAvatarElement.avatar_image;
        if (zzbcVar instanceof ArcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon) {
            ArcadeBadgedAvatarElement.AvatarImageLocalIcon.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((ArcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon) zzbcVar).value);
        } else if (zzbcVar instanceof ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteIcon) {
            ArcadeBadgedAvatarElement.AvatarImageRemoteIcon.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteIcon) zzbcVar).value);
        } else if (zzbcVar instanceof ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteImage) {
            ArcadeBadgedAvatarElement.AvatarImageRemoteImage.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteImage) zzbcVar).value);
        } else if (zzbcVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 11, arcadeBadgedAvatarElement.custom_background_color);
        Alignment.ADAPTER.encodeWithTag(reverseProtoWriter, 10, arcadeBadgedAvatarElement.alignment);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, arcadeBadgedAvatarElement.content_description);
        SemanticBackgroundColor.ADAPTER.encodeWithTag(reverseProtoWriter, 3, arcadeBadgedAvatarElement.background_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, arcadeBadgedAvatarElement.monogram);
        ArcadeBadgedAvatarElement.Size.ADAPTER.encodeWithTag(reverseProtoWriter, 1, arcadeBadgedAvatarElement.size);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006f  */
    @Override // com.squareup.wire.ProtoAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        Utils_androidKt utils_androidKt;
        int encodedSizeWithTag2;
        ArcadeBadgedAvatarElement arcadeBadgedAvatarElement = (ArcadeBadgedAvatarElement) obj;
        arcadeBadgedAvatarElement.getClass();
        int encodedSizeWithTag3 = ArcadeBadgedAvatarElement.Size.ADAPTER.encodedSizeWithTag(1, arcadeBadgedAvatarElement.size) + arcadeBadgedAvatarElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag4 = protoAdapter.encodedSizeWithTag(4, arcadeBadgedAvatarElement.content_description) + SemanticBackgroundColor.ADAPTER.encodedSizeWithTag(3, arcadeBadgedAvatarElement.background_color) + protoAdapter.encodedSizeWithTag(2, arcadeBadgedAvatarElement.monogram) + encodedSizeWithTag3;
        zzbc zzbcVar = arcadeBadgedAvatarElement.avatar_image;
        if (zzbcVar instanceof ArcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon) {
            encodedSizeWithTag = ArcadeBadgedAvatarElement.AvatarImageLocalIcon.ADAPTER.encodedSizeWithTag(5, ((ArcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon) zzbcVar).value);
        } else if (zzbcVar instanceof ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteIcon) {
            encodedSizeWithTag = ArcadeBadgedAvatarElement.AvatarImageRemoteIcon.ADAPTER.encodedSizeWithTag(6, ((ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteIcon) zzbcVar).value);
        } else {
            if (!(zzbcVar instanceof ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteImage)) {
                if (zzbcVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                utils_androidKt = arcadeBadgedAvatarElement.avatar_badge;
                if (!(utils_androidKt instanceof ArcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon)) {
                    encodedSizeWithTag2 = ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon.ADAPTER.encodedSizeWithTag(8, ((ArcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon) utils_androidKt).value);
                } else {
                    if (!(utils_androidKt instanceof ArcadeBadgedAvatarElement$AvatarBadge$BadgeRemoteImage)) {
                        if (utils_androidKt != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        return Color.ADAPTER.encodedSizeWithTag(11, arcadeBadgedAvatarElement.custom_background_color) + Alignment.ADAPTER.encodedSizeWithTag(10, arcadeBadgedAvatarElement.alignment) + encodedSizeWithTag4;
                    }
                    encodedSizeWithTag2 = ArcadeBadgedAvatarElement.AvatarBadgeRemoteImage.ADAPTER.encodedSizeWithTag(9, ((ArcadeBadgedAvatarElement$AvatarBadge$BadgeRemoteImage) utils_androidKt).value);
                }
                encodedSizeWithTag4 += encodedSizeWithTag2;
                return Color.ADAPTER.encodedSizeWithTag(11, arcadeBadgedAvatarElement.custom_background_color) + Alignment.ADAPTER.encodedSizeWithTag(10, arcadeBadgedAvatarElement.alignment) + encodedSizeWithTag4;
            }
            encodedSizeWithTag = ArcadeBadgedAvatarElement.AvatarImageRemoteImage.ADAPTER.encodedSizeWithTag(7, ((ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteImage) zzbcVar).value);
        }
        encodedSizeWithTag4 += encodedSizeWithTag;
        utils_androidKt = arcadeBadgedAvatarElement.avatar_badge;
        if (!(utils_androidKt instanceof ArcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon)) {
        }
        encodedSizeWithTag4 += encodedSizeWithTag2;
        return Color.ADAPTER.encodedSizeWithTag(11, arcadeBadgedAvatarElement.custom_background_color) + Alignment.ADAPTER.encodedSizeWithTag(10, arcadeBadgedAvatarElement.alignment) + encodedSizeWithTag4;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ArcadeBadgedAvatarElement arcadeBadgedAvatarElement = (ArcadeBadgedAvatarElement) obj;
        arcadeBadgedAvatarElement.getClass();
        Color color = arcadeBadgedAvatarElement.custom_background_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        ArcadeBadgedAvatarElement.Size size = arcadeBadgedAvatarElement.size;
        String str = arcadeBadgedAvatarElement.monogram;
        SemanticBackgroundColor semanticBackgroundColor = arcadeBadgedAvatarElement.background_color;
        String str2 = arcadeBadgedAvatarElement.content_description;
        zzbc zzbcVar = arcadeBadgedAvatarElement.avatar_image;
        Utils_androidKt utils_androidKt = arcadeBadgedAvatarElement.avatar_badge;
        Alignment alignment = arcadeBadgedAvatarElement.alignment;
        byteString.getClass();
        return new ArcadeBadgedAvatarElement(size, str, semanticBackgroundColor, str2, zzbcVar, utils_androidKt, alignment, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ArcadeBadgedAvatarElement arcadeBadgedAvatarElement = (ArcadeBadgedAvatarElement) obj;
        arcadeBadgedAvatarElement.getClass();
        ArcadeBadgedAvatarElement.Size.ADAPTER.encodeWithTag(protoWriter, 1, arcadeBadgedAvatarElement.size);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, arcadeBadgedAvatarElement.monogram);
        SemanticBackgroundColor.ADAPTER.encodeWithTag(protoWriter, 3, arcadeBadgedAvatarElement.background_color);
        protoAdapter.encodeWithTag(protoWriter, 4, arcadeBadgedAvatarElement.content_description);
        Alignment.ADAPTER.encodeWithTag(protoWriter, 10, arcadeBadgedAvatarElement.alignment);
        Color.ADAPTER.encodeWithTag(protoWriter, 11, arcadeBadgedAvatarElement.custom_background_color);
        zzbc zzbcVar = arcadeBadgedAvatarElement.avatar_image;
        if (zzbcVar instanceof ArcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon) {
            ArcadeBadgedAvatarElement.AvatarImageLocalIcon.ADAPTER.encodeWithTag(protoWriter, 5, ((ArcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon) zzbcVar).value);
        } else if (zzbcVar instanceof ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteIcon) {
            ArcadeBadgedAvatarElement.AvatarImageRemoteIcon.ADAPTER.encodeWithTag(protoWriter, 6, ((ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteIcon) zzbcVar).value);
        } else if (zzbcVar instanceof ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteImage) {
            ArcadeBadgedAvatarElement.AvatarImageRemoteImage.ADAPTER.encodeWithTag(protoWriter, 7, ((ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteImage) zzbcVar).value);
        } else if (zzbcVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        Utils_androidKt utils_androidKt = arcadeBadgedAvatarElement.avatar_badge;
        if (utils_androidKt instanceof ArcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon) {
            ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon.ADAPTER.encodeWithTag(protoWriter, 8, ((ArcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon) utils_androidKt).value);
        } else if (utils_androidKt instanceof ArcadeBadgedAvatarElement$AvatarBadge$BadgeRemoteImage) {
            ArcadeBadgedAvatarElement.AvatarBadgeRemoteImage.ADAPTER.encodeWithTag(protoWriter, 9, ((ArcadeBadgedAvatarElement$AvatarBadge$BadgeRemoteImage) utils_androidKt).value);
        } else if (utils_androidKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(arcadeBadgedAvatarElement.unknownFields());
    }
}
