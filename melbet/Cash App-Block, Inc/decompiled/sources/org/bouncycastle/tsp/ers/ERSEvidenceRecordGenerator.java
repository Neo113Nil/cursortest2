package org.bouncycastle.tsp.ers;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.tsp.CryptoInfos;
import org.bouncycastle.asn1.tsp.EncryptionInfo;
import org.bouncycastle.asn1.tsp.EvidenceRecord;
import org.bouncycastle.operator.DigestCalculatorProvider;

/* loaded from: classes10.dex */
public class ERSEvidenceRecordGenerator {
    private final DigestCalculatorProvider digCalcProv;

    public ERSEvidenceRecordGenerator(DigestCalculatorProvider digestCalculatorProvider) {
        this.digCalcProv = digestCalculatorProvider;
    }

    public List<ERSEvidenceRecord> generate(List<ERSArchiveTimeStamp> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i != list.size(); i++) {
            arrayList.add(new ERSEvidenceRecord(new EvidenceRecord((CryptoInfos) null, (EncryptionInfo) null, list.get(i).toASN1Structure()), this.digCalcProv));
        }
        return arrayList;
    }

    public ERSEvidenceRecord generate(ERSArchiveTimeStamp eRSArchiveTimeStamp) {
        return new ERSEvidenceRecord(new EvidenceRecord((CryptoInfos) null, (EncryptionInfo) null, eRSArchiveTimeStamp.toASN1Structure()), this.digCalcProv);
    }
}
