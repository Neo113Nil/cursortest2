package squareup.cash.bankingbenefits.api.v1_0.app;

import com.squareup.cash.advertising.views.FullscreenAdViewKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;
import squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse;

/* loaded from: classes10.dex */
public final class GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        FullscreenAdViewKt fullscreenAdViewKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet((String) obj, fullscreenAdViewKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    fullscreenAdViewKt = new GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$Borrow((GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Borrow) GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Borrow.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    fullscreenAdViewKt = new GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$Overdraft((GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Overdraft) GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Overdraft.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    fullscreenAdViewKt = new GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$SavingsYield((GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.SavingsYield) GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.SavingsYield.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    fullscreenAdViewKt = new GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$AtmFees((GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.AtmFees) GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.AtmFees.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    fullscreenAdViewKt = new GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$PhoneSupport((GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PhoneSupport) GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PhoneSupport.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    fullscreenAdViewKt = new GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$FraudProtection((GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.FraudProtection) GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.FraudProtection.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    fullscreenAdViewKt = new GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$PaperMoneyDeposit((GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PaperMoneyDeposit) GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PaperMoneyDeposit.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet benefitForComparisonBooklet = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet) obj;
        reverseProtoWriter.getClass();
        benefitForComparisonBooklet.getClass();
        reverseProtoWriter.writeBytes(benefitForComparisonBooklet.unknownFields());
        FullscreenAdViewKt fullscreenAdViewKt = benefitForComparisonBooklet.benefit_data;
        if (fullscreenAdViewKt instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$Borrow) {
            GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Borrow.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$Borrow) fullscreenAdViewKt).value);
        } else if (fullscreenAdViewKt instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$Overdraft) {
            GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Overdraft.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$Overdraft) fullscreenAdViewKt).value);
        } else if (fullscreenAdViewKt instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$SavingsYield) {
            GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.SavingsYield.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$SavingsYield) fullscreenAdViewKt).value);
        } else if (fullscreenAdViewKt instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$AtmFees) {
            GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.AtmFees.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$AtmFees) fullscreenAdViewKt).value);
        } else if (fullscreenAdViewKt instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$PhoneSupport) {
            GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PhoneSupport.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$PhoneSupport) fullscreenAdViewKt).value);
        } else if (fullscreenAdViewKt instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$FraudProtection) {
            GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.FraudProtection.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$FraudProtection) fullscreenAdViewKt).value);
        } else if (fullscreenAdViewKt instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$PaperMoneyDeposit) {
            GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PaperMoneyDeposit.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$PaperMoneyDeposit) fullscreenAdViewKt).value);
        } else if (fullscreenAdViewKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, benefitForComparisonBooklet.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet benefitForComparisonBooklet = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet) obj;
        benefitForComparisonBooklet.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, benefitForComparisonBooklet.name) + benefitForComparisonBooklet.unknownFields().getSize$okio();
        FullscreenAdViewKt fullscreenAdViewKt = benefitForComparisonBooklet.benefit_data;
        if (fullscreenAdViewKt instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$Borrow) {
            return GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Borrow.ADAPTER.encodedSizeWithTag(2, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$Borrow) fullscreenAdViewKt).value) + encodedSizeWithTag;
        }
        if (fullscreenAdViewKt instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$Overdraft) {
            return GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Overdraft.ADAPTER.encodedSizeWithTag(3, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$Overdraft) fullscreenAdViewKt).value) + encodedSizeWithTag;
        }
        if (fullscreenAdViewKt instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$SavingsYield) {
            return GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.SavingsYield.ADAPTER.encodedSizeWithTag(4, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$SavingsYield) fullscreenAdViewKt).value) + encodedSizeWithTag;
        }
        if (fullscreenAdViewKt instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$AtmFees) {
            return GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.AtmFees.ADAPTER.encodedSizeWithTag(5, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$AtmFees) fullscreenAdViewKt).value) + encodedSizeWithTag;
        }
        if (fullscreenAdViewKt instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$PhoneSupport) {
            return GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PhoneSupport.ADAPTER.encodedSizeWithTag(6, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$PhoneSupport) fullscreenAdViewKt).value) + encodedSizeWithTag;
        }
        if (fullscreenAdViewKt instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$FraudProtection) {
            return GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.FraudProtection.ADAPTER.encodedSizeWithTag(7, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$FraudProtection) fullscreenAdViewKt).value) + encodedSizeWithTag;
        }
        if (fullscreenAdViewKt instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$PaperMoneyDeposit) {
            return GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PaperMoneyDeposit.ADAPTER.encodedSizeWithTag(8, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$PaperMoneyDeposit) fullscreenAdViewKt).value) + encodedSizeWithTag;
        }
        if (fullscreenAdViewKt == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet benefitForComparisonBooklet = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet) obj;
        benefitForComparisonBooklet.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = benefitForComparisonBooklet.name;
        FullscreenAdViewKt fullscreenAdViewKt = benefitForComparisonBooklet.benefit_data;
        byteString.getClass();
        return new GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet(str, fullscreenAdViewKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet benefitForComparisonBooklet = (GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet) obj;
        benefitForComparisonBooklet.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, benefitForComparisonBooklet.name);
        FullscreenAdViewKt fullscreenAdViewKt = benefitForComparisonBooklet.benefit_data;
        if (fullscreenAdViewKt instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$Borrow) {
            GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Borrow.ADAPTER.encodeWithTag(protoWriter, 2, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$Borrow) fullscreenAdViewKt).value);
        } else if (fullscreenAdViewKt instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$Overdraft) {
            GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.Overdraft.ADAPTER.encodeWithTag(protoWriter, 3, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$Overdraft) fullscreenAdViewKt).value);
        } else if (fullscreenAdViewKt instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$SavingsYield) {
            GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.SavingsYield.ADAPTER.encodeWithTag(protoWriter, 4, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$SavingsYield) fullscreenAdViewKt).value);
        } else if (fullscreenAdViewKt instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$AtmFees) {
            GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.AtmFees.ADAPTER.encodeWithTag(protoWriter, 5, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$AtmFees) fullscreenAdViewKt).value);
        } else if (fullscreenAdViewKt instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$PhoneSupport) {
            GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PhoneSupport.ADAPTER.encodeWithTag(protoWriter, 6, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$PhoneSupport) fullscreenAdViewKt).value);
        } else if (fullscreenAdViewKt instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$FraudProtection) {
            GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.FraudProtection.ADAPTER.encodeWithTag(protoWriter, 7, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$FraudProtection) fullscreenAdViewKt).value);
        } else if (fullscreenAdViewKt instanceof GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$PaperMoneyDeposit) {
            GetBankingBenefitsForComparisonBookletResponse.BenefitForComparisonBooklet.PaperMoneyDeposit.ADAPTER.encodeWithTag(protoWriter, 8, ((GetBankingBenefitsForComparisonBookletResponse$BenefitForComparisonBooklet$BenefitData$PaperMoneyDeposit) fullscreenAdViewKt).value);
        } else if (fullscreenAdViewKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(benefitForComparisonBooklet.unknownFields());
    }
}
