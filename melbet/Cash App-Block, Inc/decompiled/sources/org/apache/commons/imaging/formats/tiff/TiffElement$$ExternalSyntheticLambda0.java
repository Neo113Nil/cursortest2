package org.apache.commons.imaging.formats.tiff;

import java.util.Comparator;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry;
import org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PhotometricInterpreterFloat;

/* loaded from: classes9.dex */
public final /* synthetic */ class TiffElement$$ExternalSyntheticLambda0 implements Comparator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ TiffElement$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$static$0;
        int lambda$new$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$static$0 = TiffElement.lambda$static$0((TiffElement) obj, (TiffElement) obj2);
                return lambda$static$0;
            default:
                lambda$new$0 = PhotometricInterpreterFloat.lambda$new$0((PaletteEntry) obj, (PaletteEntry) obj2);
                return lambda$new$0;
        }
    }
}
