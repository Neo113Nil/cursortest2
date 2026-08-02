package com.squareup.protos.cash.genericelements.ui;

import coil3.request.ViewTargetRequestManagerKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BaseElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ViewTargetRequestManagerKt viewTargetRequestManagerKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BaseElement(viewTargetRequestManagerKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    viewTargetRequestManagerKt = new BaseElement$Element$Text((TextElement) TextElement.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    viewTargetRequestManagerKt = new BaseElement$Element$Image((ImageElement) ImageElement.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    viewTargetRequestManagerKt = new BaseElement$Element$Progress((ProgressMeterElement) ProgressMeterElement.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    viewTargetRequestManagerKt = new BaseElement$Element$TextButton((Button$TextButtonElement) Button$TextButtonElement.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    viewTargetRequestManagerKt = new BaseElement$Element$IconButton((Button$IconButtonElement) Button$IconButtonElement.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    viewTargetRequestManagerKt = new BaseElement$Element$Avatar((AvatarElement) AvatarElement.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    viewTargetRequestManagerKt = new BaseElement$Element$BlankDivider((BlankDividerElement) BlankDividerElement.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    viewTargetRequestManagerKt = new BaseElement$Element$IconTextElement((IconTextDetailElement) IconTextDetailElement.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    viewTargetRequestManagerKt = new BaseElement$Element$PillTextElement((PillTextElement) PillTextElement.ADAPTER.decode(protoReader));
                    break;
                case 10:
                    viewTargetRequestManagerKt = new BaseElement$Element$WithinSectionSpacer((WithinSectionSpacer) WithinSectionSpacer.ADAPTER.decode(protoReader));
                    break;
                case 11:
                    viewTargetRequestManagerKt = new BaseElement$Element$BetweenSectionSpacer((BetweenSectionSpacer) BetweenSectionSpacer.ADAPTER.decode(protoReader));
                    break;
                case 12:
                    viewTargetRequestManagerKt = new BaseElement$Element$ArcadeText((ArcadeTextElement) ArcadeTextElement.ADAPTER.decode(protoReader));
                    break;
                case 13:
                    viewTargetRequestManagerKt = new BaseElement$Element$ArcadeButton((ArcadeButtonElement) ArcadeButtonElement.ADAPTER.decode(protoReader));
                    break;
                case 14:
                    viewTargetRequestManagerKt = new BaseElement$Element$CopyCode((CopyCodeElement) CopyCodeElement.ADAPTER.decode(protoReader));
                    break;
                case 15:
                    viewTargetRequestManagerKt = new BaseElement$Element$ArcadeBadgedAvatar((ArcadeBadgedAvatarElement) ArcadeBadgedAvatarElement.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BaseElement baseElement = (BaseElement) obj;
        baseElement.getClass();
        ViewTargetRequestManagerKt viewTargetRequestManagerKt = baseElement.element;
        if (viewTargetRequestManagerKt instanceof BaseElement$Element$Text) {
            TextElement.ADAPTER.encodeWithTag(protoWriter, 1, ((BaseElement$Element$Text) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$Image) {
            ImageElement.ADAPTER.encodeWithTag(protoWriter, 2, ((BaseElement$Element$Image) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$Progress) {
            ProgressMeterElement.ADAPTER.encodeWithTag(protoWriter, 3, ((BaseElement$Element$Progress) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$TextButton) {
            Button$TextButtonElement.ADAPTER.encodeWithTag(protoWriter, 4, ((BaseElement$Element$TextButton) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$IconButton) {
            Button$IconButtonElement.ADAPTER.encodeWithTag(protoWriter, 5, ((BaseElement$Element$IconButton) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$Avatar) {
            AvatarElement.ADAPTER.encodeWithTag(protoWriter, 6, ((BaseElement$Element$Avatar) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$BlankDivider) {
            BlankDividerElement.ADAPTER.encodeWithTag(protoWriter, 7, ((BaseElement$Element$BlankDivider) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$IconTextElement) {
            IconTextDetailElement.ADAPTER.encodeWithTag(protoWriter, 8, ((BaseElement$Element$IconTextElement) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$PillTextElement) {
            PillTextElement.ADAPTER.encodeWithTag(protoWriter, 9, ((BaseElement$Element$PillTextElement) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$WithinSectionSpacer) {
            WithinSectionSpacer.ADAPTER.encodeWithTag(protoWriter, 10, ((BaseElement$Element$WithinSectionSpacer) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$BetweenSectionSpacer) {
            BetweenSectionSpacer.ADAPTER.encodeWithTag(protoWriter, 11, ((BaseElement$Element$BetweenSectionSpacer) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$ArcadeText) {
            ArcadeTextElement.ADAPTER.encodeWithTag(protoWriter, 12, ((BaseElement$Element$ArcadeText) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$ArcadeButton) {
            ArcadeButtonElement.ADAPTER.encodeWithTag(protoWriter, 13, ((BaseElement$Element$ArcadeButton) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$CopyCode) {
            CopyCodeElement.ADAPTER.encodeWithTag(protoWriter, 14, ((BaseElement$Element$CopyCode) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$ArcadeBadgedAvatar) {
            ArcadeBadgedAvatarElement.ADAPTER.encodeWithTag(protoWriter, 15, ((BaseElement$Element$ArcadeBadgedAvatar) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(baseElement.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        BaseElement baseElement = (BaseElement) obj;
        baseElement.getClass();
        int size$okio = baseElement.unknownFields().getSize$okio();
        ViewTargetRequestManagerKt viewTargetRequestManagerKt = baseElement.element;
        if (viewTargetRequestManagerKt instanceof BaseElement$Element$Text) {
            encodedSizeWithTag = TextElement.ADAPTER.encodedSizeWithTag(1, ((BaseElement$Element$Text) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$Image) {
            encodedSizeWithTag = ImageElement.ADAPTER.encodedSizeWithTag(2, ((BaseElement$Element$Image) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$Progress) {
            encodedSizeWithTag = ProgressMeterElement.ADAPTER.encodedSizeWithTag(3, ((BaseElement$Element$Progress) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$TextButton) {
            encodedSizeWithTag = Button$TextButtonElement.ADAPTER.encodedSizeWithTag(4, ((BaseElement$Element$TextButton) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$IconButton) {
            encodedSizeWithTag = Button$IconButtonElement.ADAPTER.encodedSizeWithTag(5, ((BaseElement$Element$IconButton) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$Avatar) {
            encodedSizeWithTag = AvatarElement.ADAPTER.encodedSizeWithTag(6, ((BaseElement$Element$Avatar) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$BlankDivider) {
            encodedSizeWithTag = BlankDividerElement.ADAPTER.encodedSizeWithTag(7, ((BaseElement$Element$BlankDivider) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$IconTextElement) {
            encodedSizeWithTag = IconTextDetailElement.ADAPTER.encodedSizeWithTag(8, ((BaseElement$Element$IconTextElement) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$PillTextElement) {
            encodedSizeWithTag = PillTextElement.ADAPTER.encodedSizeWithTag(9, ((BaseElement$Element$PillTextElement) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$WithinSectionSpacer) {
            encodedSizeWithTag = WithinSectionSpacer.ADAPTER.encodedSizeWithTag(10, ((BaseElement$Element$WithinSectionSpacer) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$BetweenSectionSpacer) {
            encodedSizeWithTag = BetweenSectionSpacer.ADAPTER.encodedSizeWithTag(11, ((BaseElement$Element$BetweenSectionSpacer) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$ArcadeText) {
            encodedSizeWithTag = ArcadeTextElement.ADAPTER.encodedSizeWithTag(12, ((BaseElement$Element$ArcadeText) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$ArcadeButton) {
            encodedSizeWithTag = ArcadeButtonElement.ADAPTER.encodedSizeWithTag(13, ((BaseElement$Element$ArcadeButton) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$CopyCode) {
            encodedSizeWithTag = CopyCodeElement.ADAPTER.encodedSizeWithTag(14, ((BaseElement$Element$CopyCode) viewTargetRequestManagerKt).value);
        } else {
            if (!(viewTargetRequestManagerKt instanceof BaseElement$Element$ArcadeBadgedAvatar)) {
                if (viewTargetRequestManagerKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = ArcadeBadgedAvatarElement.ADAPTER.encodedSizeWithTag(15, ((BaseElement$Element$ArcadeBadgedAvatar) viewTargetRequestManagerKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BaseElement baseElement = (BaseElement) obj;
        baseElement.getClass();
        ByteString byteString = ByteString.EMPTY;
        ViewTargetRequestManagerKt viewTargetRequestManagerKt = baseElement.element;
        byteString.getClass();
        return new BaseElement(viewTargetRequestManagerKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BaseElement baseElement = (BaseElement) obj;
        reverseProtoWriter.getClass();
        baseElement.getClass();
        reverseProtoWriter.writeBytes(baseElement.unknownFields());
        ViewTargetRequestManagerKt viewTargetRequestManagerKt = baseElement.element;
        if (viewTargetRequestManagerKt instanceof BaseElement$Element$Text) {
            TextElement.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((BaseElement$Element$Text) viewTargetRequestManagerKt).value);
            return;
        }
        if (viewTargetRequestManagerKt instanceof BaseElement$Element$Image) {
            ImageElement.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((BaseElement$Element$Image) viewTargetRequestManagerKt).value);
            return;
        }
        if (viewTargetRequestManagerKt instanceof BaseElement$Element$Progress) {
            ProgressMeterElement.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((BaseElement$Element$Progress) viewTargetRequestManagerKt).value);
            return;
        }
        if (viewTargetRequestManagerKt instanceof BaseElement$Element$TextButton) {
            Button$TextButtonElement.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((BaseElement$Element$TextButton) viewTargetRequestManagerKt).value);
            return;
        }
        if (viewTargetRequestManagerKt instanceof BaseElement$Element$IconButton) {
            Button$IconButtonElement.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((BaseElement$Element$IconButton) viewTargetRequestManagerKt).value);
            return;
        }
        if (viewTargetRequestManagerKt instanceof BaseElement$Element$Avatar) {
            AvatarElement.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((BaseElement$Element$Avatar) viewTargetRequestManagerKt).value);
            return;
        }
        if (viewTargetRequestManagerKt instanceof BaseElement$Element$BlankDivider) {
            BlankDividerElement.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((BaseElement$Element$BlankDivider) viewTargetRequestManagerKt).value);
            return;
        }
        if (viewTargetRequestManagerKt instanceof BaseElement$Element$IconTextElement) {
            IconTextDetailElement.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((BaseElement$Element$IconTextElement) viewTargetRequestManagerKt).value);
            return;
        }
        if (viewTargetRequestManagerKt instanceof BaseElement$Element$PillTextElement) {
            PillTextElement.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((BaseElement$Element$PillTextElement) viewTargetRequestManagerKt).value);
            return;
        }
        if (viewTargetRequestManagerKt instanceof BaseElement$Element$WithinSectionSpacer) {
            WithinSectionSpacer.ADAPTER.encodeWithTag(reverseProtoWriter, 10, ((BaseElement$Element$WithinSectionSpacer) viewTargetRequestManagerKt).value);
            return;
        }
        if (viewTargetRequestManagerKt instanceof BaseElement$Element$BetweenSectionSpacer) {
            BetweenSectionSpacer.ADAPTER.encodeWithTag(reverseProtoWriter, 11, ((BaseElement$Element$BetweenSectionSpacer) viewTargetRequestManagerKt).value);
            return;
        }
        if (viewTargetRequestManagerKt instanceof BaseElement$Element$ArcadeText) {
            ArcadeTextElement.ADAPTER.encodeWithTag(reverseProtoWriter, 12, ((BaseElement$Element$ArcadeText) viewTargetRequestManagerKt).value);
            return;
        }
        if (viewTargetRequestManagerKt instanceof BaseElement$Element$ArcadeButton) {
            ArcadeButtonElement.ADAPTER.encodeWithTag(reverseProtoWriter, 13, ((BaseElement$Element$ArcadeButton) viewTargetRequestManagerKt).value);
            return;
        }
        if (viewTargetRequestManagerKt instanceof BaseElement$Element$CopyCode) {
            CopyCodeElement.ADAPTER.encodeWithTag(reverseProtoWriter, 14, ((BaseElement$Element$CopyCode) viewTargetRequestManagerKt).value);
        } else if (viewTargetRequestManagerKt instanceof BaseElement$Element$ArcadeBadgedAvatar) {
            ArcadeBadgedAvatarElement.ADAPTER.encodeWithTag(reverseProtoWriter, 15, ((BaseElement$Element$ArcadeBadgedAvatar) viewTargetRequestManagerKt).value);
        } else {
            if (viewTargetRequestManagerKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }
}
