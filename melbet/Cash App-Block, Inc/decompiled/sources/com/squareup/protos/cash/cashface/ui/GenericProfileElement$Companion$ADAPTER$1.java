package com.squareup.protos.cash.cashface.ui;

import app.cash.local.viewmodels.LocalTextsKt;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.genericelements.ui.ContainerElement;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenericProfileElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        LocalTextsKt localTextsKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericProfileElement(localTextsKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 11:
                    localTextsKt = new GenericProfileElement$Element$IconTextElement((GenericProfileElement.IconTextElement) GenericProfileElement.IconTextElement.ADAPTER.decode(protoReader));
                    break;
                case 12:
                    localTextsKt = new GenericProfileElement$Element$TextElement((GenericProfileElement.TextElement) GenericProfileElement.TextElement.ADAPTER.decode(protoReader));
                    break;
                case 13:
                    localTextsKt = new GenericProfileElement$Element$ActivityElement((GenericProfileElement.ActivityElement) GenericProfileElement.ActivityElement.ADAPTER.decode(protoReader));
                    break;
                case 14:
                    localTextsKt = new GenericProfileElement$Element$ButtonElement((GenericProfileElement.ButtonElement) GenericProfileElement.ButtonElement.ADAPTER.decode(protoReader));
                    break;
                case 15:
                case 23:
                case 24:
                case 25:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 16:
                    localTextsKt = new GenericProfileElement$Element$BoostElement((GenericProfileElement.BoostElement) GenericProfileElement.BoostElement.ADAPTER.decode(protoReader));
                    break;
                case 17:
                    localTextsKt = new GenericProfileElement$Element$ProgressMeterElement((GenericProfileElement.ProgressMeterElement) GenericProfileElement.ProgressMeterElement.ADAPTER.decode(protoReader));
                    break;
                case 18:
                    localTextsKt = new GenericProfileElement$Element$LabeledContainerElement((GenericProfileElement.LabeledContainerElement) GenericProfileElement.LabeledContainerElement.ADAPTER.decode(protoReader));
                    break;
                case 19:
                    localTextsKt = new GenericProfileElement$Element$ValueUnitElement((GenericProfileElement.ValueUnitElement) GenericProfileElement.ValueUnitElement.ADAPTER.decode(protoReader));
                    break;
                case 20:
                    localTextsKt = new GenericProfileElement$Element$CardElement((GenericProfileElement.CardElement) GenericProfileElement.CardElement.ADAPTER.decode(protoReader));
                    break;
                case 21:
                    localTextsKt = new GenericProfileElement$Element$ListElement((GenericProfileElement.ListElement) GenericProfileElement.ListElement.ADAPTER.decode(protoReader));
                    break;
                case 22:
                    localTextsKt = new GenericProfileElement$Element$AchievementsWidgetElement((GenericProfileElement.AchievementsWidgetElement) GenericProfileElement.AchievementsWidgetElement.ADAPTER.decode(protoReader));
                    break;
                case 26:
                    localTextsKt = new GenericProfileElement$Element$Container((ContainerElement) ContainerElement.ADAPTER.decode(protoReader));
                    break;
                case 27:
                    localTextsKt = new GenericProfileElement$Element$TrustElements((GenericProfileElement.TrustElements) GenericProfileElement.TrustElements.ADAPTER.decode(protoReader));
                    break;
                case 28:
                    localTextsKt = new GenericProfileElement$Element$ActivityStatsElement((GenericProfileElement.ActivityStatsElement) GenericProfileElement.ActivityStatsElement.ADAPTER.decode(protoReader));
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericProfileElement genericProfileElement = (GenericProfileElement) obj;
        genericProfileElement.getClass();
        LocalTextsKt localTextsKt = genericProfileElement.element;
        if (localTextsKt instanceof GenericProfileElement$Element$IconTextElement) {
            GenericProfileElement.IconTextElement.ADAPTER.encodeWithTag(protoWriter, 11, ((GenericProfileElement$Element$IconTextElement) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$TextElement) {
            GenericProfileElement.TextElement.ADAPTER.encodeWithTag(protoWriter, 12, ((GenericProfileElement$Element$TextElement) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$ActivityElement) {
            GenericProfileElement.ActivityElement.ADAPTER.encodeWithTag(protoWriter, 13, ((GenericProfileElement$Element$ActivityElement) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$ButtonElement) {
            GenericProfileElement.ButtonElement.ADAPTER.encodeWithTag(protoWriter, 14, ((GenericProfileElement$Element$ButtonElement) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$BoostElement) {
            GenericProfileElement.BoostElement.ADAPTER.encodeWithTag(protoWriter, 16, ((GenericProfileElement$Element$BoostElement) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$ProgressMeterElement) {
            GenericProfileElement.ProgressMeterElement.ADAPTER.encodeWithTag(protoWriter, 17, ((GenericProfileElement$Element$ProgressMeterElement) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$LabeledContainerElement) {
            GenericProfileElement.LabeledContainerElement.ADAPTER.encodeWithTag(protoWriter, 18, ((GenericProfileElement$Element$LabeledContainerElement) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$ValueUnitElement) {
            GenericProfileElement.ValueUnitElement.ADAPTER.encodeWithTag(protoWriter, 19, ((GenericProfileElement$Element$ValueUnitElement) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$CardElement) {
            GenericProfileElement.CardElement.ADAPTER.encodeWithTag(protoWriter, 20, ((GenericProfileElement$Element$CardElement) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$ListElement) {
            GenericProfileElement.ListElement.ADAPTER.encodeWithTag(protoWriter, 21, ((GenericProfileElement$Element$ListElement) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$AchievementsWidgetElement) {
            GenericProfileElement.AchievementsWidgetElement.ADAPTER.encodeWithTag(protoWriter, 22, ((GenericProfileElement$Element$AchievementsWidgetElement) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$Container) {
            ContainerElement.ADAPTER.encodeWithTag(protoWriter, 26, ((GenericProfileElement$Element$Container) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$TrustElements) {
            GenericProfileElement.TrustElements.ADAPTER.encodeWithTag(protoWriter, 27, ((GenericProfileElement$Element$TrustElements) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$ActivityStatsElement) {
            GenericProfileElement.ActivityStatsElement.ADAPTER.encodeWithTag(protoWriter, 28, ((GenericProfileElement$Element$ActivityStatsElement) localTextsKt).value);
        } else if (localTextsKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(genericProfileElement.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GenericProfileElement genericProfileElement = (GenericProfileElement) obj;
        genericProfileElement.getClass();
        int size$okio = genericProfileElement.unknownFields().getSize$okio();
        LocalTextsKt localTextsKt = genericProfileElement.element;
        if (localTextsKt instanceof GenericProfileElement$Element$IconTextElement) {
            encodedSizeWithTag = GenericProfileElement.IconTextElement.ADAPTER.encodedSizeWithTag(11, ((GenericProfileElement$Element$IconTextElement) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$TextElement) {
            encodedSizeWithTag = GenericProfileElement.TextElement.ADAPTER.encodedSizeWithTag(12, ((GenericProfileElement$Element$TextElement) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$ActivityElement) {
            encodedSizeWithTag = GenericProfileElement.ActivityElement.ADAPTER.encodedSizeWithTag(13, ((GenericProfileElement$Element$ActivityElement) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$ButtonElement) {
            encodedSizeWithTag = GenericProfileElement.ButtonElement.ADAPTER.encodedSizeWithTag(14, ((GenericProfileElement$Element$ButtonElement) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$BoostElement) {
            encodedSizeWithTag = GenericProfileElement.BoostElement.ADAPTER.encodedSizeWithTag(16, ((GenericProfileElement$Element$BoostElement) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$ProgressMeterElement) {
            encodedSizeWithTag = GenericProfileElement.ProgressMeterElement.ADAPTER.encodedSizeWithTag(17, ((GenericProfileElement$Element$ProgressMeterElement) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$LabeledContainerElement) {
            encodedSizeWithTag = GenericProfileElement.LabeledContainerElement.ADAPTER.encodedSizeWithTag(18, ((GenericProfileElement$Element$LabeledContainerElement) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$ValueUnitElement) {
            encodedSizeWithTag = GenericProfileElement.ValueUnitElement.ADAPTER.encodedSizeWithTag(19, ((GenericProfileElement$Element$ValueUnitElement) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$CardElement) {
            encodedSizeWithTag = GenericProfileElement.CardElement.ADAPTER.encodedSizeWithTag(20, ((GenericProfileElement$Element$CardElement) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$ListElement) {
            encodedSizeWithTag = GenericProfileElement.ListElement.ADAPTER.encodedSizeWithTag(21, ((GenericProfileElement$Element$ListElement) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$AchievementsWidgetElement) {
            encodedSizeWithTag = GenericProfileElement.AchievementsWidgetElement.ADAPTER.encodedSizeWithTag(22, ((GenericProfileElement$Element$AchievementsWidgetElement) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$Container) {
            encodedSizeWithTag = ContainerElement.ADAPTER.encodedSizeWithTag(26, ((GenericProfileElement$Element$Container) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$TrustElements) {
            encodedSizeWithTag = GenericProfileElement.TrustElements.ADAPTER.encodedSizeWithTag(27, ((GenericProfileElement$Element$TrustElements) localTextsKt).value);
        } else {
            if (!(localTextsKt instanceof GenericProfileElement$Element$ActivityStatsElement)) {
                if (localTextsKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = GenericProfileElement.ActivityStatsElement.ADAPTER.encodedSizeWithTag(28, ((GenericProfileElement$Element$ActivityStatsElement) localTextsKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericProfileElement genericProfileElement = (GenericProfileElement) obj;
        genericProfileElement.getClass();
        ByteString byteString = ByteString.EMPTY;
        LocalTextsKt localTextsKt = genericProfileElement.element;
        byteString.getClass();
        return new GenericProfileElement(localTextsKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericProfileElement genericProfileElement = (GenericProfileElement) obj;
        reverseProtoWriter.getClass();
        genericProfileElement.getClass();
        reverseProtoWriter.writeBytes(genericProfileElement.unknownFields());
        LocalTextsKt localTextsKt = genericProfileElement.element;
        if (localTextsKt instanceof GenericProfileElement$Element$IconTextElement) {
            GenericProfileElement.IconTextElement.ADAPTER.encodeWithTag(reverseProtoWriter, 11, ((GenericProfileElement$Element$IconTextElement) localTextsKt).value);
            return;
        }
        if (localTextsKt instanceof GenericProfileElement$Element$TextElement) {
            GenericProfileElement.TextElement.ADAPTER.encodeWithTag(reverseProtoWriter, 12, ((GenericProfileElement$Element$TextElement) localTextsKt).value);
            return;
        }
        if (localTextsKt instanceof GenericProfileElement$Element$ActivityElement) {
            GenericProfileElement.ActivityElement.ADAPTER.encodeWithTag(reverseProtoWriter, 13, ((GenericProfileElement$Element$ActivityElement) localTextsKt).value);
            return;
        }
        if (localTextsKt instanceof GenericProfileElement$Element$ButtonElement) {
            GenericProfileElement.ButtonElement.ADAPTER.encodeWithTag(reverseProtoWriter, 14, ((GenericProfileElement$Element$ButtonElement) localTextsKt).value);
            return;
        }
        if (localTextsKt instanceof GenericProfileElement$Element$BoostElement) {
            GenericProfileElement.BoostElement.ADAPTER.encodeWithTag(reverseProtoWriter, 16, ((GenericProfileElement$Element$BoostElement) localTextsKt).value);
            return;
        }
        if (localTextsKt instanceof GenericProfileElement$Element$ProgressMeterElement) {
            GenericProfileElement.ProgressMeterElement.ADAPTER.encodeWithTag(reverseProtoWriter, 17, ((GenericProfileElement$Element$ProgressMeterElement) localTextsKt).value);
            return;
        }
        if (localTextsKt instanceof GenericProfileElement$Element$LabeledContainerElement) {
            GenericProfileElement.LabeledContainerElement.ADAPTER.encodeWithTag(reverseProtoWriter, 18, ((GenericProfileElement$Element$LabeledContainerElement) localTextsKt).value);
            return;
        }
        if (localTextsKt instanceof GenericProfileElement$Element$ValueUnitElement) {
            GenericProfileElement.ValueUnitElement.ADAPTER.encodeWithTag(reverseProtoWriter, 19, ((GenericProfileElement$Element$ValueUnitElement) localTextsKt).value);
            return;
        }
        if (localTextsKt instanceof GenericProfileElement$Element$CardElement) {
            GenericProfileElement.CardElement.ADAPTER.encodeWithTag(reverseProtoWriter, 20, ((GenericProfileElement$Element$CardElement) localTextsKt).value);
            return;
        }
        if (localTextsKt instanceof GenericProfileElement$Element$ListElement) {
            GenericProfileElement.ListElement.ADAPTER.encodeWithTag(reverseProtoWriter, 21, ((GenericProfileElement$Element$ListElement) localTextsKt).value);
            return;
        }
        if (localTextsKt instanceof GenericProfileElement$Element$AchievementsWidgetElement) {
            GenericProfileElement.AchievementsWidgetElement.ADAPTER.encodeWithTag(reverseProtoWriter, 22, ((GenericProfileElement$Element$AchievementsWidgetElement) localTextsKt).value);
            return;
        }
        if (localTextsKt instanceof GenericProfileElement$Element$Container) {
            ContainerElement.ADAPTER.encodeWithTag(reverseProtoWriter, 26, ((GenericProfileElement$Element$Container) localTextsKt).value);
            return;
        }
        if (localTextsKt instanceof GenericProfileElement$Element$TrustElements) {
            GenericProfileElement.TrustElements.ADAPTER.encodeWithTag(reverseProtoWriter, 27, ((GenericProfileElement$Element$TrustElements) localTextsKt).value);
        } else if (localTextsKt instanceof GenericProfileElement$Element$ActivityStatsElement) {
            GenericProfileElement.ActivityStatsElement.ADAPTER.encodeWithTag(reverseProtoWriter, 28, ((GenericProfileElement$Element$ActivityStatsElement) localTextsKt).value);
        } else {
            if (localTextsKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }
}
