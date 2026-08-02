package squareup.cash.paychecks;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.money.loadable.LoadableStateKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;
import squareup.cash.paychecks.PaychecksHomeUi;

/* loaded from: classes10.dex */
public final class PaychecksHomeUi$Section$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        LoadableStateKt loadableStateKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaychecksHomeUi.Section((PaychecksHomeUi.SectionVisibilityPredicate) obj, loadableStateKt, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = PaychecksHomeUi.SectionVisibilityPredicate.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    loadableStateKt = new PaychecksHomeUi$Section$Section$Activity((PaychecksHomeUi.ActivitySection) PaychecksHomeUi.ActivitySection.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    loadableStateKt = new PaychecksHomeUi$Section$Section$Nux((PaychecksHomeUi.DistributionNUXSection) PaychecksHomeUi.DistributionNUXSection.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    loadableStateKt = new PaychecksHomeUi$Section$Section$ActiveDistribution((PaychecksHomeUi.ActiveDistributionSection) PaychecksHomeUi.ActiveDistributionSection.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    loadableStateKt = new PaychecksHomeUi$Section$Section$AddOrUpdateDirectDeposit((PaychecksHomeUi.AddOrUpdateDirectDepositSection) PaychecksHomeUi.AddOrUpdateDirectDepositSection.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    try {
                        PaychecksHomeUi.SectionVisibilityPredicate.ADAPTER.tryDecode(protoReader, m);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 7:
                    loadableStateKt = new PaychecksHomeUi$Section$Section$KybEligibilityWarning((PaychecksHomeUi.KYBEligibilityWarningSection) PaychecksHomeUi.KYBEligibilityWarningSection.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaychecksHomeUi.Section section = (PaychecksHomeUi.Section) obj;
        reverseProtoWriter.getClass();
        section.getClass();
        reverseProtoWriter.writeBytes(section.unknownFields());
        LoadableStateKt loadableStateKt = section.section;
        if (loadableStateKt instanceof PaychecksHomeUi$Section$Section$Activity) {
            PaychecksHomeUi.ActivitySection.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((PaychecksHomeUi$Section$Section$Activity) loadableStateKt).value);
        } else if (loadableStateKt instanceof PaychecksHomeUi$Section$Section$Nux) {
            PaychecksHomeUi.DistributionNUXSection.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((PaychecksHomeUi$Section$Section$Nux) loadableStateKt).value);
        } else if (loadableStateKt instanceof PaychecksHomeUi$Section$Section$ActiveDistribution) {
            PaychecksHomeUi.ActiveDistributionSection.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((PaychecksHomeUi$Section$Section$ActiveDistribution) loadableStateKt).value);
        } else if (loadableStateKt instanceof PaychecksHomeUi$Section$Section$AddOrUpdateDirectDeposit) {
            PaychecksHomeUi.AddOrUpdateDirectDepositSection.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((PaychecksHomeUi$Section$Section$AddOrUpdateDirectDeposit) loadableStateKt).value);
        } else if (loadableStateKt instanceof PaychecksHomeUi$Section$Section$KybEligibilityWarning) {
            PaychecksHomeUi.KYBEligibilityWarningSection.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((PaychecksHomeUi$Section$Section$KybEligibilityWarning) loadableStateKt).value);
        } else if (loadableStateKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        PaychecksHomeUi$SectionVisibilityPredicate$Companion$ADAPTER$1 paychecksHomeUi$SectionVisibilityPredicate$Companion$ADAPTER$1 = PaychecksHomeUi.SectionVisibilityPredicate.ADAPTER;
        paychecksHomeUi$SectionVisibilityPredicate$Companion$ADAPTER$1.asRepeated().encodeWithTag(reverseProtoWriter, 6, section.visibility_predicates);
        paychecksHomeUi$SectionVisibilityPredicate$Companion$ADAPTER$1.encodeWithTag(reverseProtoWriter, 1, section.visibility_predicate);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        PaychecksHomeUi.Section section = (PaychecksHomeUi.Section) obj;
        section.getClass();
        int size$okio = section.unknownFields().getSize$okio();
        PaychecksHomeUi$SectionVisibilityPredicate$Companion$ADAPTER$1 paychecksHomeUi$SectionVisibilityPredicate$Companion$ADAPTER$1 = PaychecksHomeUi.SectionVisibilityPredicate.ADAPTER;
        int encodedSizeWithTag2 = paychecksHomeUi$SectionVisibilityPredicate$Companion$ADAPTER$1.encodedSizeWithTag(1, section.visibility_predicate) + size$okio;
        LoadableStateKt loadableStateKt = section.section;
        if (loadableStateKt instanceof PaychecksHomeUi$Section$Section$Activity) {
            encodedSizeWithTag = PaychecksHomeUi.ActivitySection.ADAPTER.encodedSizeWithTag(2, ((PaychecksHomeUi$Section$Section$Activity) loadableStateKt).value);
        } else if (loadableStateKt instanceof PaychecksHomeUi$Section$Section$Nux) {
            encodedSizeWithTag = PaychecksHomeUi.DistributionNUXSection.ADAPTER.encodedSizeWithTag(3, ((PaychecksHomeUi$Section$Section$Nux) loadableStateKt).value);
        } else if (loadableStateKt instanceof PaychecksHomeUi$Section$Section$ActiveDistribution) {
            encodedSizeWithTag = PaychecksHomeUi.ActiveDistributionSection.ADAPTER.encodedSizeWithTag(4, ((PaychecksHomeUi$Section$Section$ActiveDistribution) loadableStateKt).value);
        } else if (loadableStateKt instanceof PaychecksHomeUi$Section$Section$AddOrUpdateDirectDeposit) {
            encodedSizeWithTag = PaychecksHomeUi.AddOrUpdateDirectDepositSection.ADAPTER.encodedSizeWithTag(5, ((PaychecksHomeUi$Section$Section$AddOrUpdateDirectDeposit) loadableStateKt).value);
        } else {
            if (!(loadableStateKt instanceof PaychecksHomeUi$Section$Section$KybEligibilityWarning)) {
                if (loadableStateKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return paychecksHomeUi$SectionVisibilityPredicate$Companion$ADAPTER$1.asRepeated().encodedSizeWithTag(6, section.visibility_predicates) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = PaychecksHomeUi.KYBEligibilityWarningSection.ADAPTER.encodedSizeWithTag(7, ((PaychecksHomeUi$Section$Section$KybEligibilityWarning) loadableStateKt).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        return paychecksHomeUi$SectionVisibilityPredicate$Companion$ADAPTER$1.asRepeated().encodedSizeWithTag(6, section.visibility_predicates) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaychecksHomeUi.Section section = (PaychecksHomeUi.Section) obj;
        section.getClass();
        ByteString byteString = ByteString.EMPTY;
        PaychecksHomeUi.SectionVisibilityPredicate sectionVisibilityPredicate = section.visibility_predicate;
        LoadableStateKt loadableStateKt = section.section;
        List list = section.visibility_predicates;
        list.getClass();
        byteString.getClass();
        return new PaychecksHomeUi.Section(sectionVisibilityPredicate, loadableStateKt, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaychecksHomeUi.Section section = (PaychecksHomeUi.Section) obj;
        section.getClass();
        PaychecksHomeUi$SectionVisibilityPredicate$Companion$ADAPTER$1 paychecksHomeUi$SectionVisibilityPredicate$Companion$ADAPTER$1 = PaychecksHomeUi.SectionVisibilityPredicate.ADAPTER;
        paychecksHomeUi$SectionVisibilityPredicate$Companion$ADAPTER$1.encodeWithTag(protoWriter, 1, section.visibility_predicate);
        paychecksHomeUi$SectionVisibilityPredicate$Companion$ADAPTER$1.asRepeated().encodeWithTag(protoWriter, 6, section.visibility_predicates);
        LoadableStateKt loadableStateKt = section.section;
        if (loadableStateKt instanceof PaychecksHomeUi$Section$Section$Activity) {
            PaychecksHomeUi.ActivitySection.ADAPTER.encodeWithTag(protoWriter, 2, ((PaychecksHomeUi$Section$Section$Activity) loadableStateKt).value);
        } else if (loadableStateKt instanceof PaychecksHomeUi$Section$Section$Nux) {
            PaychecksHomeUi.DistributionNUXSection.ADAPTER.encodeWithTag(protoWriter, 3, ((PaychecksHomeUi$Section$Section$Nux) loadableStateKt).value);
        } else if (loadableStateKt instanceof PaychecksHomeUi$Section$Section$ActiveDistribution) {
            PaychecksHomeUi.ActiveDistributionSection.ADAPTER.encodeWithTag(protoWriter, 4, ((PaychecksHomeUi$Section$Section$ActiveDistribution) loadableStateKt).value);
        } else if (loadableStateKt instanceof PaychecksHomeUi$Section$Section$AddOrUpdateDirectDeposit) {
            PaychecksHomeUi.AddOrUpdateDirectDepositSection.ADAPTER.encodeWithTag(protoWriter, 5, ((PaychecksHomeUi$Section$Section$AddOrUpdateDirectDeposit) loadableStateKt).value);
        } else if (loadableStateKt instanceof PaychecksHomeUi$Section$Section$KybEligibilityWarning) {
            PaychecksHomeUi.KYBEligibilityWarningSection.ADAPTER.encodeWithTag(protoWriter, 7, ((PaychecksHomeUi$Section$Section$KybEligibilityWarning) loadableStateKt).value);
        } else if (loadableStateKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(section.unknownFields());
    }
}
