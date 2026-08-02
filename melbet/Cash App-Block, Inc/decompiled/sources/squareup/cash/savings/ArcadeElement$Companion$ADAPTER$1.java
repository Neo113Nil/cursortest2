package squareup.cash.savings;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;
import squareup.cash.savings.ArcadeElement;
import squareup.cash.ui.arcade.elements.BetweenSection;
import squareup.cash.ui.arcade.elements.ButtonDefaultGroup;
import squareup.cash.ui.arcade.elements.PageHeader;
import squareup.cash.ui.arcade.elements.SectionHeader;
import squareup.cash.ui.arcade.elements.WithinSection;

/* loaded from: classes10.dex */
public final class ArcadeElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ArcadeElement.Element element = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ArcadeElement(element, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    element = new ArcadeElement.Element.WithinSection((WithinSection) WithinSection.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    element = new ArcadeElement.Element.BetweenSection((BetweenSection) BetweenSection.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    element = new ArcadeElement.Element.CellDefault((ArcadeElement.TappableCellDefault) ArcadeElement.TappableCellDefault.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    element = new ArcadeElement.Element.SectionHeader((SectionHeader) SectionHeader.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    element = new ArcadeElement.Element.ButtonDefaultGroup((ButtonDefaultGroup) ButtonDefaultGroup.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    element = new ArcadeElement.Element.PageHeader((PageHeader) PageHeader.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ArcadeElement arcadeElement = (ArcadeElement) obj;
        reverseProtoWriter.getClass();
        arcadeElement.getClass();
        reverseProtoWriter.writeBytes(arcadeElement.unknownFields());
        ArcadeElement.Element element = arcadeElement.element;
        if (element instanceof ArcadeElement.Element.WithinSection) {
            WithinSection.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((ArcadeElement.Element.WithinSection) element).value);
            return;
        }
        if (element instanceof ArcadeElement.Element.BetweenSection) {
            BetweenSection.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((ArcadeElement.Element.BetweenSection) element).value);
            return;
        }
        if (element instanceof ArcadeElement.Element.CellDefault) {
            ArcadeElement.TappableCellDefault.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((ArcadeElement.Element.CellDefault) element).value);
            return;
        }
        if (element instanceof ArcadeElement.Element.SectionHeader) {
            SectionHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((ArcadeElement.Element.SectionHeader) element).value);
            return;
        }
        if (element instanceof ArcadeElement.Element.ButtonDefaultGroup) {
            ButtonDefaultGroup.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((ArcadeElement.Element.ButtonDefaultGroup) element).value);
        } else if (element instanceof ArcadeElement.Element.PageHeader) {
            PageHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((ArcadeElement.Element.PageHeader) element).value);
        } else {
            if (element == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        ArcadeElement arcadeElement = (ArcadeElement) obj;
        arcadeElement.getClass();
        int size$okio = arcadeElement.unknownFields().getSize$okio();
        ArcadeElement.Element element = arcadeElement.element;
        if (element instanceof ArcadeElement.Element.WithinSection) {
            encodedSizeWithTag = WithinSection.ADAPTER.encodedSizeWithTag(1, ((ArcadeElement.Element.WithinSection) element).value);
        } else if (element instanceof ArcadeElement.Element.BetweenSection) {
            encodedSizeWithTag = BetweenSection.ADAPTER.encodedSizeWithTag(2, ((ArcadeElement.Element.BetweenSection) element).value);
        } else if (element instanceof ArcadeElement.Element.CellDefault) {
            encodedSizeWithTag = ArcadeElement.TappableCellDefault.ADAPTER.encodedSizeWithTag(3, ((ArcadeElement.Element.CellDefault) element).value);
        } else if (element instanceof ArcadeElement.Element.SectionHeader) {
            encodedSizeWithTag = SectionHeader.ADAPTER.encodedSizeWithTag(4, ((ArcadeElement.Element.SectionHeader) element).value);
        } else if (element instanceof ArcadeElement.Element.ButtonDefaultGroup) {
            encodedSizeWithTag = ButtonDefaultGroup.ADAPTER.encodedSizeWithTag(5, ((ArcadeElement.Element.ButtonDefaultGroup) element).value);
        } else {
            if (!(element instanceof ArcadeElement.Element.PageHeader)) {
                if (element == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = PageHeader.ADAPTER.encodedSizeWithTag(6, ((ArcadeElement.Element.PageHeader) element).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ArcadeElement arcadeElement = (ArcadeElement) obj;
        arcadeElement.getClass();
        ByteString byteString = ByteString.EMPTY;
        ArcadeElement.Element element = arcadeElement.element;
        byteString.getClass();
        return new ArcadeElement(element, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ArcadeElement arcadeElement = (ArcadeElement) obj;
        arcadeElement.getClass();
        ArcadeElement.Element element = arcadeElement.element;
        if (element instanceof ArcadeElement.Element.WithinSection) {
            WithinSection.ADAPTER.encodeWithTag(protoWriter, 1, ((ArcadeElement.Element.WithinSection) element).value);
        } else if (element instanceof ArcadeElement.Element.BetweenSection) {
            BetweenSection.ADAPTER.encodeWithTag(protoWriter, 2, ((ArcadeElement.Element.BetweenSection) element).value);
        } else if (element instanceof ArcadeElement.Element.CellDefault) {
            ArcadeElement.TappableCellDefault.ADAPTER.encodeWithTag(protoWriter, 3, ((ArcadeElement.Element.CellDefault) element).value);
        } else if (element instanceof ArcadeElement.Element.SectionHeader) {
            SectionHeader.ADAPTER.encodeWithTag(protoWriter, 4, ((ArcadeElement.Element.SectionHeader) element).value);
        } else if (element instanceof ArcadeElement.Element.ButtonDefaultGroup) {
            ButtonDefaultGroup.ADAPTER.encodeWithTag(protoWriter, 5, ((ArcadeElement.Element.ButtonDefaultGroup) element).value);
        } else if (element instanceof ArcadeElement.Element.PageHeader) {
            PageHeader.ADAPTER.encodeWithTag(protoWriter, 6, ((ArcadeElement.Element.PageHeader) element).value);
        } else if (element != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(arcadeElement.unknownFields());
    }
}
