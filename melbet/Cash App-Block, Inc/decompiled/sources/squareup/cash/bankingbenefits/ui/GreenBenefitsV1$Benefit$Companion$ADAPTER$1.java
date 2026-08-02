package squareup.cash.bankingbenefits.ui;

import com.squareup.cash.money.booklet.DisclosureSectionKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes10.dex */
public final class GreenBenefitsV1$Benefit$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        DisclosureSectionKt disclosureSectionKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GreenBenefitsV1.Benefit(disclosureSectionKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    disclosureSectionKt = new GreenBenefitsV1$Benefit$Element$Borrow((GreenBenefitsV1.Benefit.BorrowBenefit) GreenBenefitsV1.Benefit.BorrowBenefit.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    disclosureSectionKt = new GreenBenefitsV1$Benefit$Element$Overdraft((GreenBenefitsV1.Benefit.OverdraftBenefit) GreenBenefitsV1.Benefit.OverdraftBenefit.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    disclosureSectionKt = new GreenBenefitsV1$Benefit$Element$Savings((GreenBenefitsV1.Benefit.SavingsBenefit) GreenBenefitsV1.Benefit.SavingsBenefit.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    disclosureSectionKt = new GreenBenefitsV1$Benefit$Element$Atm((GreenBenefitsV1.Benefit.ATMBenefit) GreenBenefitsV1.Benefit.ATMBenefit.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    disclosureSectionKt = new GreenBenefitsV1$Benefit$Element$WeeklyOffers((GreenBenefitsV1.Benefit.WeeklyOffersBenefit) GreenBenefitsV1.Benefit.WeeklyOffersBenefit.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    disclosureSectionKt = new GreenBenefitsV1$Benefit$Element$PrioritySupport((GreenBenefitsV1.Benefit.PrioritySupportBenefit) GreenBenefitsV1.Benefit.PrioritySupportBenefit.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    disclosureSectionKt = new GreenBenefitsV1$Benefit$Element$PaperMoneyDeposit((GreenBenefitsV1.Benefit.PaperMoneyDepositBenefit) GreenBenefitsV1.Benefit.PaperMoneyDepositBenefit.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GreenBenefitsV1.Benefit benefit = (GreenBenefitsV1.Benefit) obj;
        reverseProtoWriter.getClass();
        benefit.getClass();
        reverseProtoWriter.writeBytes(benefit.unknownFields());
        DisclosureSectionKt disclosureSectionKt = benefit.element;
        if (disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$Borrow) {
            GreenBenefitsV1.Benefit.BorrowBenefit.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((GreenBenefitsV1$Benefit$Element$Borrow) disclosureSectionKt).value);
            return;
        }
        if (disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$Overdraft) {
            GreenBenefitsV1.Benefit.OverdraftBenefit.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GreenBenefitsV1$Benefit$Element$Overdraft) disclosureSectionKt).value);
            return;
        }
        if (disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$Savings) {
            GreenBenefitsV1.Benefit.SavingsBenefit.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((GreenBenefitsV1$Benefit$Element$Savings) disclosureSectionKt).value);
            return;
        }
        if (disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$Atm) {
            GreenBenefitsV1.Benefit.ATMBenefit.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((GreenBenefitsV1$Benefit$Element$Atm) disclosureSectionKt).value);
            return;
        }
        if (disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$WeeklyOffers) {
            GreenBenefitsV1.Benefit.WeeklyOffersBenefit.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((GreenBenefitsV1$Benefit$Element$WeeklyOffers) disclosureSectionKt).value);
            return;
        }
        if (disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$PrioritySupport) {
            GreenBenefitsV1.Benefit.PrioritySupportBenefit.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((GreenBenefitsV1$Benefit$Element$PrioritySupport) disclosureSectionKt).value);
        } else if (disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$PaperMoneyDeposit) {
            GreenBenefitsV1.Benefit.PaperMoneyDepositBenefit.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((GreenBenefitsV1$Benefit$Element$PaperMoneyDeposit) disclosureSectionKt).value);
        } else {
            if (disclosureSectionKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        GreenBenefitsV1.Benefit benefit = (GreenBenefitsV1.Benefit) obj;
        benefit.getClass();
        int size$okio = benefit.unknownFields().getSize$okio();
        DisclosureSectionKt disclosureSectionKt = benefit.element;
        if (disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$Borrow) {
            encodedSizeWithTag = GreenBenefitsV1.Benefit.BorrowBenefit.ADAPTER.encodedSizeWithTag(1, ((GreenBenefitsV1$Benefit$Element$Borrow) disclosureSectionKt).value);
        } else if (disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$Overdraft) {
            encodedSizeWithTag = GreenBenefitsV1.Benefit.OverdraftBenefit.ADAPTER.encodedSizeWithTag(2, ((GreenBenefitsV1$Benefit$Element$Overdraft) disclosureSectionKt).value);
        } else if (disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$Savings) {
            encodedSizeWithTag = GreenBenefitsV1.Benefit.SavingsBenefit.ADAPTER.encodedSizeWithTag(3, ((GreenBenefitsV1$Benefit$Element$Savings) disclosureSectionKt).value);
        } else if (disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$Atm) {
            encodedSizeWithTag = GreenBenefitsV1.Benefit.ATMBenefit.ADAPTER.encodedSizeWithTag(4, ((GreenBenefitsV1$Benefit$Element$Atm) disclosureSectionKt).value);
        } else if (disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$WeeklyOffers) {
            encodedSizeWithTag = GreenBenefitsV1.Benefit.WeeklyOffersBenefit.ADAPTER.encodedSizeWithTag(5, ((GreenBenefitsV1$Benefit$Element$WeeklyOffers) disclosureSectionKt).value);
        } else if (disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$PrioritySupport) {
            encodedSizeWithTag = GreenBenefitsV1.Benefit.PrioritySupportBenefit.ADAPTER.encodedSizeWithTag(6, ((GreenBenefitsV1$Benefit$Element$PrioritySupport) disclosureSectionKt).value);
        } else {
            if (!(disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$PaperMoneyDeposit)) {
                if (disclosureSectionKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = GreenBenefitsV1.Benefit.PaperMoneyDepositBenefit.ADAPTER.encodedSizeWithTag(7, ((GreenBenefitsV1$Benefit$Element$PaperMoneyDeposit) disclosureSectionKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GreenBenefitsV1.Benefit benefit = (GreenBenefitsV1.Benefit) obj;
        benefit.getClass();
        ByteString byteString = ByteString.EMPTY;
        DisclosureSectionKt disclosureSectionKt = benefit.element;
        byteString.getClass();
        return new GreenBenefitsV1.Benefit(disclosureSectionKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GreenBenefitsV1.Benefit benefit = (GreenBenefitsV1.Benefit) obj;
        benefit.getClass();
        DisclosureSectionKt disclosureSectionKt = benefit.element;
        if (disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$Borrow) {
            GreenBenefitsV1.Benefit.BorrowBenefit.ADAPTER.encodeWithTag(protoWriter, 1, ((GreenBenefitsV1$Benefit$Element$Borrow) disclosureSectionKt).value);
        } else if (disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$Overdraft) {
            GreenBenefitsV1.Benefit.OverdraftBenefit.ADAPTER.encodeWithTag(protoWriter, 2, ((GreenBenefitsV1$Benefit$Element$Overdraft) disclosureSectionKt).value);
        } else if (disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$Savings) {
            GreenBenefitsV1.Benefit.SavingsBenefit.ADAPTER.encodeWithTag(protoWriter, 3, ((GreenBenefitsV1$Benefit$Element$Savings) disclosureSectionKt).value);
        } else if (disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$Atm) {
            GreenBenefitsV1.Benefit.ATMBenefit.ADAPTER.encodeWithTag(protoWriter, 4, ((GreenBenefitsV1$Benefit$Element$Atm) disclosureSectionKt).value);
        } else if (disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$WeeklyOffers) {
            GreenBenefitsV1.Benefit.WeeklyOffersBenefit.ADAPTER.encodeWithTag(protoWriter, 5, ((GreenBenefitsV1$Benefit$Element$WeeklyOffers) disclosureSectionKt).value);
        } else if (disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$PrioritySupport) {
            GreenBenefitsV1.Benefit.PrioritySupportBenefit.ADAPTER.encodeWithTag(protoWriter, 6, ((GreenBenefitsV1$Benefit$Element$PrioritySupport) disclosureSectionKt).value);
        } else if (disclosureSectionKt instanceof GreenBenefitsV1$Benefit$Element$PaperMoneyDeposit) {
            GreenBenefitsV1.Benefit.PaperMoneyDepositBenefit.ADAPTER.encodeWithTag(protoWriter, 7, ((GreenBenefitsV1$Benefit$Element$PaperMoneyDeposit) disclosureSectionKt).value);
        } else if (disclosureSectionKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(benefit.unknownFields());
    }
}
