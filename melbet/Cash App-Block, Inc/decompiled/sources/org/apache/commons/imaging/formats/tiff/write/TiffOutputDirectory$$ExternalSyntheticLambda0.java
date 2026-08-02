package org.apache.commons.imaging.formats.tiff.write;

import java.util.Comparator;
import org.apache.commons.imaging.formats.tiff.TiffElement;

/* loaded from: classes9.dex */
public final /* synthetic */ class TiffOutputDirectory$$ExternalSyntheticLambda0 implements Comparator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ TiffOutputDirectory$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$static$0;
        int lambda$static$1;
        int lambda$static$02;
        int lambda$sortFields$1;
        switch (this.$r8$classId) {
            case 0:
                lambda$static$0 = TiffOutputDirectory.lambda$static$0((TiffOutputDirectory) obj, (TiffOutputDirectory) obj2);
                return lambda$static$0;
            case 1:
                lambda$static$1 = TiffImageWriterLossless.lambda$static$1((TiffOutputItem) obj, (TiffOutputItem) obj2);
                return lambda$static$1;
            case 2:
                lambda$static$02 = TiffImageWriterLossless.lambda$static$0((TiffElement) obj, (TiffElement) obj2);
                return lambda$static$02;
            default:
                lambda$sortFields$1 = TiffOutputDirectory.lambda$sortFields$1((TiffOutputField) obj, (TiffOutputField) obj2);
                return lambda$sortFields$1;
        }
    }
}
