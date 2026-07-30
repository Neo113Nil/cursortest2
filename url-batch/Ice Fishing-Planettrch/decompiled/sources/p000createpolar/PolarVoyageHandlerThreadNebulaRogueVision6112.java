package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageHandlerThreadNebulaRogueVision6112 implements ListIterator, PolarVoyageZipDeltaSpectraRogue6055 {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485 = 1;
    public final /* synthetic */ Object PolarVoyageRotateAnimationCyberCelestialDelta4768;
    public final Object PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageHandlerThreadNebulaRogueVision6112(PolarVoyageCoroutineCelestialAuroraPixel1740 polarVoyageCoroutineCelestialAuroraPixel1740, int i) {
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageCoroutineCelestialAuroraPixel1740;
        List list = (List) polarVoyageCoroutineCelestialAuroraPixel1740.PolarVoyageStrictModeLegendEpic1532;
        if (i >= 0 && i <= polarVoyageCoroutineCelestialAuroraPixel1740.PolarVoyageZipVortexCelestial6185()) {
            this.PolarVoyageStrictModeLegendEpic1532 = list.listIterator(polarVoyageCoroutineCelestialAuroraPixel1740.PolarVoyageZipVortexCelestial6185() - i);
            return;
        }
        StringBuilder PolarVoyageContentProviderHyperSpark3838 = PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageContentProviderHyperSpark3838("Position index ", i, " must be in range [");
        PolarVoyageContentProviderHyperSpark3838.append(new PolarVoyageLinearLayoutHyperionSpectra2647(0, polarVoyageCoroutineCelestialAuroraPixel1740.PolarVoyageZipVortexCelestial6185(), 1));
        PolarVoyageContentProviderHyperSpark3838.append("].");
        throw new IndexOutOfBoundsException(PolarVoyageContentProviderHyperSpark3838.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ListIterator) obj).hasPrevious();
            default:
                return ((PolarVoyageAlertDialogEliteQuantumSpark1292) obj).PolarVoyageItemDecorationUltraDeltaEpic7485 < ((PolarVoyageIntentServiceOmegaTitanium5259) this.PolarVoyageRotateAnimationCyberCelestialDelta4768).PolarVoyageBottomSheetOmegaNeo1907 - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ListIterator) obj).hasNext();
            default:
                return ((PolarVoyageAlertDialogEliteQuantumSpark1292) obj).PolarVoyageItemDecorationUltraDeltaEpic7485 >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ListIterator) obj).previous();
            default:
                PolarVoyageAlertDialogEliteQuantumSpark1292 polarVoyageAlertDialogEliteQuantumSpark1292 = (PolarVoyageAlertDialogEliteQuantumSpark1292) obj;
                int i2 = polarVoyageAlertDialogEliteQuantumSpark1292.PolarVoyageItemDecorationUltraDeltaEpic7485 + 1;
                PolarVoyageIntentServiceOmegaTitanium5259 polarVoyageIntentServiceOmegaTitanium5259 = (PolarVoyageIntentServiceOmegaTitanium5259) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageBitmapVisionAuroraPixel4705(i2, polarVoyageIntentServiceOmegaTitanium5259.PolarVoyageBottomSheetOmegaNeo1907);
                polarVoyageAlertDialogEliteQuantumSpark1292.PolarVoyageItemDecorationUltraDeltaEpic7485 = i2;
                return polarVoyageIntentServiceOmegaTitanium5259.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                PolarVoyageCoroutineCelestialAuroraPixel1740 polarVoyageCoroutineCelestialAuroraPixel1740 = (PolarVoyageCoroutineCelestialAuroraPixel1740) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                return (polarVoyageCoroutineCelestialAuroraPixel1740.size() - 1) - ((ListIterator) obj).previousIndex();
            default:
                return ((PolarVoyageAlertDialogEliteQuantumSpark1292) obj).PolarVoyageItemDecorationUltraDeltaEpic7485 + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((ListIterator) obj).next();
            default:
                PolarVoyageAlertDialogEliteQuantumSpark1292 polarVoyageAlertDialogEliteQuantumSpark1292 = (PolarVoyageAlertDialogEliteQuantumSpark1292) obj;
                int i2 = polarVoyageAlertDialogEliteQuantumSpark1292.PolarVoyageItemDecorationUltraDeltaEpic7485;
                PolarVoyageIntentServiceOmegaTitanium5259 polarVoyageIntentServiceOmegaTitanium5259 = (PolarVoyageIntentServiceOmegaTitanium5259) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                PolarVoyageConstraintSetClonePixelVortex4921.PolarVoyageBitmapVisionAuroraPixel4705(i2, polarVoyageIntentServiceOmegaTitanium5259.PolarVoyageBottomSheetOmegaNeo1907);
                polarVoyageAlertDialogEliteQuantumSpark1292.PolarVoyageItemDecorationUltraDeltaEpic7485 = i2 - 1;
                return polarVoyageIntentServiceOmegaTitanium5259.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                PolarVoyageCoroutineCelestialAuroraPixel1740 polarVoyageCoroutineCelestialAuroraPixel1740 = (PolarVoyageCoroutineCelestialAuroraPixel1740) this.PolarVoyageRotateAnimationCyberCelestialDelta4768;
                return (polarVoyageCoroutineCelestialAuroraPixel1740.size() - 1) - ((ListIterator) obj).nextIndex();
            default:
                return ((PolarVoyageAlertDialogEliteQuantumSpark1292) obj).PolarVoyageItemDecorationUltraDeltaEpic7485;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public PolarVoyageHandlerThreadNebulaRogueVision6112(PolarVoyageAlertDialogEliteQuantumSpark1292 polarVoyageAlertDialogEliteQuantumSpark1292, PolarVoyageIntentServiceOmegaTitanium5259 polarVoyageIntentServiceOmegaTitanium5259) {
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageAlertDialogEliteQuantumSpark1292;
        this.PolarVoyageRotateAnimationCyberCelestialDelta4768 = polarVoyageIntentServiceOmegaTitanium5259;
    }
}
