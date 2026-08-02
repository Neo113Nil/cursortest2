package org.apache.commons.imaging.formats.jpeg.iptc;

import bo.app.ng$$ExternalSyntheticLambda0;
import java.util.Comparator;

/* loaded from: classes9.dex */
public class IptcRecord {
    public static final Comparator<IptcRecord> COMPARATOR = new ng$$ExternalSyntheticLambda0(28);
    public final IptcType iptcType;
    private final String value;

    public IptcRecord(IptcType iptcType, String str) {
        this.iptcType = iptcType;
        this.value = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(IptcRecord iptcRecord, IptcRecord iptcRecord2) {
        return iptcRecord.iptcType.getType() - iptcRecord2.iptcType.getType();
    }

    public String getIptcTypeName() {
        return this.iptcType.getName();
    }

    public String getValue() {
        return this.value;
    }
}
