package squareup.cash.earnings;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;
import squareup.cash.earnings.EarningsHomeUi;

/* loaded from: classes10.dex */
public final class EarningsHomeUi$Section$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        EarningsHomeUi.Section.AbstractC0087Section abstractC0087Section = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EarningsHomeUi.Section(abstractC0087Section, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    abstractC0087Section = new EarningsHomeUi.Section.AbstractC0087Section.Header((EarningHeaderSection) EarningHeaderSection.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    abstractC0087Section = new EarningsHomeUi.Section.AbstractC0087Section.Activity((ActivitySection) ActivitySection.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    abstractC0087Section = new EarningsHomeUi.Section.AbstractC0087Section.ActiveDistribution((ActiveDistributionSection) ActiveDistributionSection.ADAPTER.decode(protoReader));
                    break;
                case 4:
                case 5:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 6:
                    abstractC0087Section = new EarningsHomeUi.Section.AbstractC0087Section.FdicFooter((EarningFdicFooterSection) EarningFdicFooterSection.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    abstractC0087Section = new EarningsHomeUi.Section.AbstractC0087Section.EarningCard((EarningCardSection) EarningCardSection.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    abstractC0087Section = new EarningsHomeUi.Section.AbstractC0087Section.ActionButtons((ActionButtonGroupSection) ActionButtonGroupSection.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    abstractC0087Section = new EarningsHomeUi.Section.AbstractC0087Section.EarningTools((EarningToolsSection) EarningToolsSection.ADAPTER.decode(protoReader));
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarningsHomeUi.Section section = (EarningsHomeUi.Section) obj;
        reverseProtoWriter.getClass();
        section.getClass();
        reverseProtoWriter.writeBytes(section.unknownFields());
        EarningsHomeUi.Section.AbstractC0087Section abstractC0087Section = section.section;
        if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.Header) {
            EarningHeaderSection.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((EarningsHomeUi.Section.AbstractC0087Section.Header) abstractC0087Section).value);
            return;
        }
        if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.Activity) {
            ActivitySection.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((EarningsHomeUi.Section.AbstractC0087Section.Activity) abstractC0087Section).value);
            return;
        }
        if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.ActiveDistribution) {
            ActiveDistributionSection.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((EarningsHomeUi.Section.AbstractC0087Section.ActiveDistribution) abstractC0087Section).value);
            return;
        }
        if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.FdicFooter) {
            EarningFdicFooterSection.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((EarningsHomeUi.Section.AbstractC0087Section.FdicFooter) abstractC0087Section).value);
            return;
        }
        if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.EarningCard) {
            EarningCardSection.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((EarningsHomeUi.Section.AbstractC0087Section.EarningCard) abstractC0087Section).value);
            return;
        }
        if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.ActionButtons) {
            ActionButtonGroupSection.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((EarningsHomeUi.Section.AbstractC0087Section.ActionButtons) abstractC0087Section).value);
        } else if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.EarningTools) {
            EarningToolsSection.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((EarningsHomeUi.Section.AbstractC0087Section.EarningTools) abstractC0087Section).value);
        } else {
            if (abstractC0087Section == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        EarningsHomeUi.Section section = (EarningsHomeUi.Section) obj;
        section.getClass();
        int size$okio = section.unknownFields().getSize$okio();
        EarningsHomeUi.Section.AbstractC0087Section abstractC0087Section = section.section;
        if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.Header) {
            encodedSizeWithTag = EarningHeaderSection.ADAPTER.encodedSizeWithTag(1, ((EarningsHomeUi.Section.AbstractC0087Section.Header) abstractC0087Section).value);
        } else if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.Activity) {
            encodedSizeWithTag = ActivitySection.ADAPTER.encodedSizeWithTag(2, ((EarningsHomeUi.Section.AbstractC0087Section.Activity) abstractC0087Section).value);
        } else if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.ActiveDistribution) {
            encodedSizeWithTag = ActiveDistributionSection.ADAPTER.encodedSizeWithTag(3, ((EarningsHomeUi.Section.AbstractC0087Section.ActiveDistribution) abstractC0087Section).value);
        } else if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.FdicFooter) {
            encodedSizeWithTag = EarningFdicFooterSection.ADAPTER.encodedSizeWithTag(6, ((EarningsHomeUi.Section.AbstractC0087Section.FdicFooter) abstractC0087Section).value);
        } else if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.EarningCard) {
            encodedSizeWithTag = EarningCardSection.ADAPTER.encodedSizeWithTag(7, ((EarningsHomeUi.Section.AbstractC0087Section.EarningCard) abstractC0087Section).value);
        } else if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.ActionButtons) {
            encodedSizeWithTag = ActionButtonGroupSection.ADAPTER.encodedSizeWithTag(8, ((EarningsHomeUi.Section.AbstractC0087Section.ActionButtons) abstractC0087Section).value);
        } else {
            if (!(abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.EarningTools)) {
                if (abstractC0087Section == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = EarningToolsSection.ADAPTER.encodedSizeWithTag(9, ((EarningsHomeUi.Section.AbstractC0087Section.EarningTools) abstractC0087Section).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarningsHomeUi.Section section = (EarningsHomeUi.Section) obj;
        section.getClass();
        ByteString byteString = ByteString.EMPTY;
        EarningsHomeUi.Section.AbstractC0087Section abstractC0087Section = section.section;
        byteString.getClass();
        return new EarningsHomeUi.Section(abstractC0087Section, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarningsHomeUi.Section section = (EarningsHomeUi.Section) obj;
        section.getClass();
        EarningsHomeUi.Section.AbstractC0087Section abstractC0087Section = section.section;
        if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.Header) {
            EarningHeaderSection.ADAPTER.encodeWithTag(protoWriter, 1, ((EarningsHomeUi.Section.AbstractC0087Section.Header) abstractC0087Section).value);
        } else if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.Activity) {
            ActivitySection.ADAPTER.encodeWithTag(protoWriter, 2, ((EarningsHomeUi.Section.AbstractC0087Section.Activity) abstractC0087Section).value);
        } else if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.ActiveDistribution) {
            ActiveDistributionSection.ADAPTER.encodeWithTag(protoWriter, 3, ((EarningsHomeUi.Section.AbstractC0087Section.ActiveDistribution) abstractC0087Section).value);
        } else if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.FdicFooter) {
            EarningFdicFooterSection.ADAPTER.encodeWithTag(protoWriter, 6, ((EarningsHomeUi.Section.AbstractC0087Section.FdicFooter) abstractC0087Section).value);
        } else if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.EarningCard) {
            EarningCardSection.ADAPTER.encodeWithTag(protoWriter, 7, ((EarningsHomeUi.Section.AbstractC0087Section.EarningCard) abstractC0087Section).value);
        } else if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.ActionButtons) {
            ActionButtonGroupSection.ADAPTER.encodeWithTag(protoWriter, 8, ((EarningsHomeUi.Section.AbstractC0087Section.ActionButtons) abstractC0087Section).value);
        } else if (abstractC0087Section instanceof EarningsHomeUi.Section.AbstractC0087Section.EarningTools) {
            EarningToolsSection.ADAPTER.encodeWithTag(protoWriter, 9, ((EarningsHomeUi.Section.AbstractC0087Section.EarningTools) abstractC0087Section).value);
        } else if (abstractC0087Section != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(section.unknownFields());
    }
}
