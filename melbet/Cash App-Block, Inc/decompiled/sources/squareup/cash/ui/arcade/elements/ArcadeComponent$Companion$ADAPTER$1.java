package squareup.cash.ui.arcade.elements;

import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class ArcadeComponent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        CameraGraph$OperatingMode cameraGraph$OperatingMode = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ArcadeComponent((Integer) obj, cameraGraph$OperatingMode, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 2:
                    cameraGraph$OperatingMode = new ArcadeComponent$Component$ActionableButtonCtaGroup((ActionableButtonCtaGroup) ActionableButtonCtaGroup.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    cameraGraph$OperatingMode = new ArcadeComponent$Component$ActionableButtonDefault((ActionableButtonDefault) ActionableButtonDefault.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    cameraGraph$OperatingMode = new ArcadeComponent$Component$BetweenSection((BetweenSection) BetweenSection.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    cameraGraph$OperatingMode = new ArcadeComponent$Component$ButtonCompact((ButtonCompact) ButtonCompact.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    cameraGraph$OperatingMode = new ArcadeComponent$Component$ButtonCtaGroup((ButtonCtaGroup) ButtonCtaGroup.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    cameraGraph$OperatingMode = new ArcadeComponent$Component$ButtonDefault((ButtonDefault) ButtonDefault.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    cameraGraph$OperatingMode = new ArcadeComponent$Component$ButtonDefaultGroup((ButtonDefaultGroup) ButtonDefaultGroup.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    cameraGraph$OperatingMode = new ArcadeComponent$Component$CellDefault((CellDefault) CellDefault.ADAPTER.decode(protoReader));
                    break;
                case 10:
                    cameraGraph$OperatingMode = new ArcadeComponent$Component$HeroHeader((HeroHeader) HeroHeader.ADAPTER.decode(protoReader));
                    break;
                case 11:
                    cameraGraph$OperatingMode = new ArcadeComponent$Component$HeroNumericsHeader((HeroNumericsHeader) HeroNumericsHeader.ADAPTER.decode(protoReader));
                    break;
                case 12:
                    cameraGraph$OperatingMode = new ArcadeComponent$Component$InlineMessage((InlineMessage) InlineMessage.ADAPTER.decode(protoReader));
                    break;
                case 13:
                    cameraGraph$OperatingMode = new ArcadeComponent$Component$ListOrdered((ListOrdered) ListOrdered.ADAPTER.decode(protoReader));
                    break;
                case 14:
                    cameraGraph$OperatingMode = new ArcadeComponent$Component$ListUnordered((ListUnordered) ListUnordered.ADAPTER.decode(protoReader));
                    break;
                case 15:
                    cameraGraph$OperatingMode = new ArcadeComponent$Component$PageHeader((PageHeader) PageHeader.ADAPTER.decode(protoReader));
                    break;
                case 16:
                    cameraGraph$OperatingMode = new ArcadeComponent$Component$RemoteImage((RemoteImage) RemoteImage.ADAPTER.decode(protoReader));
                    break;
                case 17:
                    cameraGraph$OperatingMode = new ArcadeComponent$Component$SectionHeader((SectionHeader) SectionHeader.ADAPTER.decode(protoReader));
                    break;
                case 18:
                    cameraGraph$OperatingMode = new ArcadeComponent$Component$WithinSection((WithinSection) WithinSection.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ArcadeComponent arcadeComponent = (ArcadeComponent) obj;
        reverseProtoWriter.getClass();
        arcadeComponent.getClass();
        reverseProtoWriter.writeBytes(arcadeComponent.unknownFields());
        CameraGraph$OperatingMode cameraGraph$OperatingMode = arcadeComponent.component;
        if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ActionableButtonCtaGroup) {
            ActionableButtonCtaGroup.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((ArcadeComponent$Component$ActionableButtonCtaGroup) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ActionableButtonDefault) {
            ActionableButtonDefault.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((ArcadeComponent$Component$ActionableButtonDefault) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$BetweenSection) {
            BetweenSection.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((ArcadeComponent$Component$BetweenSection) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ButtonCompact) {
            ButtonCompact.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((ArcadeComponent$Component$ButtonCompact) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ButtonCtaGroup) {
            ButtonCtaGroup.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((ArcadeComponent$Component$ButtonCtaGroup) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ButtonDefault) {
            ButtonDefault.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((ArcadeComponent$Component$ButtonDefault) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ButtonDefaultGroup) {
            ButtonDefaultGroup.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((ArcadeComponent$Component$ButtonDefaultGroup) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$CellDefault) {
            CellDefault.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((ArcadeComponent$Component$CellDefault) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$HeroHeader) {
            HeroHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 10, ((ArcadeComponent$Component$HeroHeader) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$HeroNumericsHeader) {
            HeroNumericsHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 11, ((ArcadeComponent$Component$HeroNumericsHeader) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$InlineMessage) {
            InlineMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 12, ((ArcadeComponent$Component$InlineMessage) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ListOrdered) {
            ListOrdered.ADAPTER.encodeWithTag(reverseProtoWriter, 13, ((ArcadeComponent$Component$ListOrdered) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ListUnordered) {
            ListUnordered.ADAPTER.encodeWithTag(reverseProtoWriter, 14, ((ArcadeComponent$Component$ListUnordered) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$PageHeader) {
            PageHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 15, ((ArcadeComponent$Component$PageHeader) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$RemoteImage) {
            RemoteImage.ADAPTER.encodeWithTag(reverseProtoWriter, 16, ((ArcadeComponent$Component$RemoteImage) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$SectionHeader) {
            SectionHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 17, ((ArcadeComponent$Component$SectionHeader) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$WithinSection) {
            WithinSection.ADAPTER.encodeWithTag(reverseProtoWriter, 18, ((ArcadeComponent$Component$WithinSection) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, arcadeComponent.version);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ArcadeComponent arcadeComponent = (ArcadeComponent) obj;
        arcadeComponent.getClass();
        int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, arcadeComponent.version) + arcadeComponent.unknownFields().getSize$okio();
        CameraGraph$OperatingMode cameraGraph$OperatingMode = arcadeComponent.component;
        if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ActionableButtonCtaGroup) {
            return ActionableButtonCtaGroup.ADAPTER.encodedSizeWithTag(2, ((ArcadeComponent$Component$ActionableButtonCtaGroup) cameraGraph$OperatingMode).value) + encodedSizeWithTag;
        }
        if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ActionableButtonDefault) {
            return ActionableButtonDefault.ADAPTER.encodedSizeWithTag(3, ((ArcadeComponent$Component$ActionableButtonDefault) cameraGraph$OperatingMode).value) + encodedSizeWithTag;
        }
        if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$BetweenSection) {
            return BetweenSection.ADAPTER.encodedSizeWithTag(4, ((ArcadeComponent$Component$BetweenSection) cameraGraph$OperatingMode).value) + encodedSizeWithTag;
        }
        if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ButtonCompact) {
            return ButtonCompact.ADAPTER.encodedSizeWithTag(5, ((ArcadeComponent$Component$ButtonCompact) cameraGraph$OperatingMode).value) + encodedSizeWithTag;
        }
        if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ButtonCtaGroup) {
            return ButtonCtaGroup.ADAPTER.encodedSizeWithTag(6, ((ArcadeComponent$Component$ButtonCtaGroup) cameraGraph$OperatingMode).value) + encodedSizeWithTag;
        }
        if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ButtonDefault) {
            return ButtonDefault.ADAPTER.encodedSizeWithTag(7, ((ArcadeComponent$Component$ButtonDefault) cameraGraph$OperatingMode).value) + encodedSizeWithTag;
        }
        if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ButtonDefaultGroup) {
            return ButtonDefaultGroup.ADAPTER.encodedSizeWithTag(8, ((ArcadeComponent$Component$ButtonDefaultGroup) cameraGraph$OperatingMode).value) + encodedSizeWithTag;
        }
        if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$CellDefault) {
            return CellDefault.ADAPTER.encodedSizeWithTag(9, ((ArcadeComponent$Component$CellDefault) cameraGraph$OperatingMode).value) + encodedSizeWithTag;
        }
        if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$HeroHeader) {
            return HeroHeader.ADAPTER.encodedSizeWithTag(10, ((ArcadeComponent$Component$HeroHeader) cameraGraph$OperatingMode).value) + encodedSizeWithTag;
        }
        if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$HeroNumericsHeader) {
            return HeroNumericsHeader.ADAPTER.encodedSizeWithTag(11, ((ArcadeComponent$Component$HeroNumericsHeader) cameraGraph$OperatingMode).value) + encodedSizeWithTag;
        }
        if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$InlineMessage) {
            return InlineMessage.ADAPTER.encodedSizeWithTag(12, ((ArcadeComponent$Component$InlineMessage) cameraGraph$OperatingMode).value) + encodedSizeWithTag;
        }
        if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ListOrdered) {
            return ListOrdered.ADAPTER.encodedSizeWithTag(13, ((ArcadeComponent$Component$ListOrdered) cameraGraph$OperatingMode).value) + encodedSizeWithTag;
        }
        if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ListUnordered) {
            return ListUnordered.ADAPTER.encodedSizeWithTag(14, ((ArcadeComponent$Component$ListUnordered) cameraGraph$OperatingMode).value) + encodedSizeWithTag;
        }
        if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$PageHeader) {
            return PageHeader.ADAPTER.encodedSizeWithTag(15, ((ArcadeComponent$Component$PageHeader) cameraGraph$OperatingMode).value) + encodedSizeWithTag;
        }
        if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$RemoteImage) {
            return RemoteImage.ADAPTER.encodedSizeWithTag(16, ((ArcadeComponent$Component$RemoteImage) cameraGraph$OperatingMode).value) + encodedSizeWithTag;
        }
        if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$SectionHeader) {
            return SectionHeader.ADAPTER.encodedSizeWithTag(17, ((ArcadeComponent$Component$SectionHeader) cameraGraph$OperatingMode).value) + encodedSizeWithTag;
        }
        if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$WithinSection) {
            return WithinSection.ADAPTER.encodedSizeWithTag(18, ((ArcadeComponent$Component$WithinSection) cameraGraph$OperatingMode).value) + encodedSizeWithTag;
        }
        if (cameraGraph$OperatingMode == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ArcadeComponent arcadeComponent = (ArcadeComponent) obj;
        arcadeComponent.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = arcadeComponent.version;
        CameraGraph$OperatingMode cameraGraph$OperatingMode = arcadeComponent.component;
        byteString.getClass();
        return new ArcadeComponent(num, cameraGraph$OperatingMode, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ArcadeComponent arcadeComponent = (ArcadeComponent) obj;
        arcadeComponent.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, arcadeComponent.version);
        CameraGraph$OperatingMode cameraGraph$OperatingMode = arcadeComponent.component;
        if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ActionableButtonCtaGroup) {
            ActionableButtonCtaGroup.ADAPTER.encodeWithTag(protoWriter, 2, ((ArcadeComponent$Component$ActionableButtonCtaGroup) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ActionableButtonDefault) {
            ActionableButtonDefault.ADAPTER.encodeWithTag(protoWriter, 3, ((ArcadeComponent$Component$ActionableButtonDefault) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$BetweenSection) {
            BetweenSection.ADAPTER.encodeWithTag(protoWriter, 4, ((ArcadeComponent$Component$BetweenSection) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ButtonCompact) {
            ButtonCompact.ADAPTER.encodeWithTag(protoWriter, 5, ((ArcadeComponent$Component$ButtonCompact) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ButtonCtaGroup) {
            ButtonCtaGroup.ADAPTER.encodeWithTag(protoWriter, 6, ((ArcadeComponent$Component$ButtonCtaGroup) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ButtonDefault) {
            ButtonDefault.ADAPTER.encodeWithTag(protoWriter, 7, ((ArcadeComponent$Component$ButtonDefault) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ButtonDefaultGroup) {
            ButtonDefaultGroup.ADAPTER.encodeWithTag(protoWriter, 8, ((ArcadeComponent$Component$ButtonDefaultGroup) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$CellDefault) {
            CellDefault.ADAPTER.encodeWithTag(protoWriter, 9, ((ArcadeComponent$Component$CellDefault) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$HeroHeader) {
            HeroHeader.ADAPTER.encodeWithTag(protoWriter, 10, ((ArcadeComponent$Component$HeroHeader) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$HeroNumericsHeader) {
            HeroNumericsHeader.ADAPTER.encodeWithTag(protoWriter, 11, ((ArcadeComponent$Component$HeroNumericsHeader) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$InlineMessage) {
            InlineMessage.ADAPTER.encodeWithTag(protoWriter, 12, ((ArcadeComponent$Component$InlineMessage) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ListOrdered) {
            ListOrdered.ADAPTER.encodeWithTag(protoWriter, 13, ((ArcadeComponent$Component$ListOrdered) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$ListUnordered) {
            ListUnordered.ADAPTER.encodeWithTag(protoWriter, 14, ((ArcadeComponent$Component$ListUnordered) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$PageHeader) {
            PageHeader.ADAPTER.encodeWithTag(protoWriter, 15, ((ArcadeComponent$Component$PageHeader) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$RemoteImage) {
            RemoteImage.ADAPTER.encodeWithTag(protoWriter, 16, ((ArcadeComponent$Component$RemoteImage) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$SectionHeader) {
            SectionHeader.ADAPTER.encodeWithTag(protoWriter, 17, ((ArcadeComponent$Component$SectionHeader) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode instanceof ArcadeComponent$Component$WithinSection) {
            WithinSection.ADAPTER.encodeWithTag(protoWriter, 18, ((ArcadeComponent$Component$WithinSection) cameraGraph$OperatingMode).value);
        } else if (cameraGraph$OperatingMode != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(arcadeComponent.unknownFields());
    }
}
