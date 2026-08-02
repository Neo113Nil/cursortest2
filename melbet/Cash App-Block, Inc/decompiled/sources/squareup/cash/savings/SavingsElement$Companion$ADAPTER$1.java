package squareup.cash.savings;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;
import squareup.cash.savings.SavingsElement;
import squareup.cash.savings.bespoke_elements.ActivitySection;
import squareup.cash.savings.bespoke_elements.Card;
import squareup.cash.savings.bespoke_elements.CompactCard;
import squareup.cash.savings.bespoke_elements.Disclosure;
import squareup.cash.savings.bespoke_elements.FolderList;
import squareup.cash.savings.bespoke_elements.GoalHeader;
import squareup.cash.savings.bespoke_elements.NoGoalHeader;
import squareup.cash.savings.bespoke_elements.TransferButtons;

/* loaded from: classes10.dex */
public final class SavingsElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        SavingsElement.Element element = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsElement(element, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    element = new SavingsElement.Element.NoGoalHeader((NoGoalHeader) NoGoalHeader.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    element = new SavingsElement.Element.GoalHeader((GoalHeader) GoalHeader.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    element = new SavingsElement.Element.TransferButtons((TransferButtons) TransferButtons.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    element = new SavingsElement.Element.FolderList((FolderList) FolderList.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    element = new SavingsElement.Element.ActivitySection((ActivitySection) ActivitySection.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    element = new SavingsElement.Element.Disclosure((Disclosure) Disclosure.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    element = new SavingsElement.Element.Card((Card) Card.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    element = new SavingsElement.Element.CompactCard((CompactCard) CompactCard.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsElement savingsElement = (SavingsElement) obj;
        reverseProtoWriter.getClass();
        savingsElement.getClass();
        reverseProtoWriter.writeBytes(savingsElement.unknownFields());
        SavingsElement.Element element = savingsElement.element;
        if (element instanceof SavingsElement.Element.NoGoalHeader) {
            NoGoalHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((SavingsElement.Element.NoGoalHeader) element).value);
            return;
        }
        if (element instanceof SavingsElement.Element.GoalHeader) {
            GoalHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((SavingsElement.Element.GoalHeader) element).value);
            return;
        }
        if (element instanceof SavingsElement.Element.TransferButtons) {
            TransferButtons.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((SavingsElement.Element.TransferButtons) element).value);
            return;
        }
        if (element instanceof SavingsElement.Element.FolderList) {
            FolderList.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((SavingsElement.Element.FolderList) element).value);
            return;
        }
        if (element instanceof SavingsElement.Element.ActivitySection) {
            ActivitySection.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((SavingsElement.Element.ActivitySection) element).value);
            return;
        }
        if (element instanceof SavingsElement.Element.Disclosure) {
            Disclosure.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((SavingsElement.Element.Disclosure) element).value);
            return;
        }
        if (element instanceof SavingsElement.Element.Card) {
            Card.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((SavingsElement.Element.Card) element).value);
        } else if (element instanceof SavingsElement.Element.CompactCard) {
            CompactCard.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((SavingsElement.Element.CompactCard) element).value);
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
        SavingsElement savingsElement = (SavingsElement) obj;
        savingsElement.getClass();
        int size$okio = savingsElement.unknownFields().getSize$okio();
        SavingsElement.Element element = savingsElement.element;
        if (element instanceof SavingsElement.Element.NoGoalHeader) {
            encodedSizeWithTag = NoGoalHeader.ADAPTER.encodedSizeWithTag(1, ((SavingsElement.Element.NoGoalHeader) element).value);
        } else if (element instanceof SavingsElement.Element.GoalHeader) {
            encodedSizeWithTag = GoalHeader.ADAPTER.encodedSizeWithTag(2, ((SavingsElement.Element.GoalHeader) element).value);
        } else if (element instanceof SavingsElement.Element.TransferButtons) {
            encodedSizeWithTag = TransferButtons.ADAPTER.encodedSizeWithTag(3, ((SavingsElement.Element.TransferButtons) element).value);
        } else if (element instanceof SavingsElement.Element.FolderList) {
            encodedSizeWithTag = FolderList.ADAPTER.encodedSizeWithTag(4, ((SavingsElement.Element.FolderList) element).value);
        } else if (element instanceof SavingsElement.Element.ActivitySection) {
            encodedSizeWithTag = ActivitySection.ADAPTER.encodedSizeWithTag(5, ((SavingsElement.Element.ActivitySection) element).value);
        } else if (element instanceof SavingsElement.Element.Disclosure) {
            encodedSizeWithTag = Disclosure.ADAPTER.encodedSizeWithTag(6, ((SavingsElement.Element.Disclosure) element).value);
        } else if (element instanceof SavingsElement.Element.Card) {
            encodedSizeWithTag = Card.ADAPTER.encodedSizeWithTag(7, ((SavingsElement.Element.Card) element).value);
        } else {
            if (!(element instanceof SavingsElement.Element.CompactCard)) {
                if (element == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = CompactCard.ADAPTER.encodedSizeWithTag(8, ((SavingsElement.Element.CompactCard) element).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsElement savingsElement = (SavingsElement) obj;
        savingsElement.getClass();
        ByteString byteString = ByteString.EMPTY;
        SavingsElement.Element element = savingsElement.element;
        byteString.getClass();
        return new SavingsElement(element, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsElement savingsElement = (SavingsElement) obj;
        savingsElement.getClass();
        SavingsElement.Element element = savingsElement.element;
        if (element instanceof SavingsElement.Element.NoGoalHeader) {
            NoGoalHeader.ADAPTER.encodeWithTag(protoWriter, 1, ((SavingsElement.Element.NoGoalHeader) element).value);
        } else if (element instanceof SavingsElement.Element.GoalHeader) {
            GoalHeader.ADAPTER.encodeWithTag(protoWriter, 2, ((SavingsElement.Element.GoalHeader) element).value);
        } else if (element instanceof SavingsElement.Element.TransferButtons) {
            TransferButtons.ADAPTER.encodeWithTag(protoWriter, 3, ((SavingsElement.Element.TransferButtons) element).value);
        } else if (element instanceof SavingsElement.Element.FolderList) {
            FolderList.ADAPTER.encodeWithTag(protoWriter, 4, ((SavingsElement.Element.FolderList) element).value);
        } else if (element instanceof SavingsElement.Element.ActivitySection) {
            ActivitySection.ADAPTER.encodeWithTag(protoWriter, 5, ((SavingsElement.Element.ActivitySection) element).value);
        } else if (element instanceof SavingsElement.Element.Disclosure) {
            Disclosure.ADAPTER.encodeWithTag(protoWriter, 6, ((SavingsElement.Element.Disclosure) element).value);
        } else if (element instanceof SavingsElement.Element.Card) {
            Card.ADAPTER.encodeWithTag(protoWriter, 7, ((SavingsElement.Element.Card) element).value);
        } else if (element instanceof SavingsElement.Element.CompactCard) {
            CompactCard.ADAPTER.encodeWithTag(protoWriter, 8, ((SavingsElement.Element.CompactCard) element).value);
        } else if (element != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(savingsElement.unknownFields());
    }
}
