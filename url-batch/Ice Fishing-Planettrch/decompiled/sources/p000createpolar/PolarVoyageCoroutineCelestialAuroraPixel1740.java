package p000createpolar;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageCoroutineCelestialAuroraPixel1740 extends PolarVoyageGeocoderMasterHyperHyperion4028 {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485 = 0;
    public final Object PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageCoroutineCelestialAuroraPixel1740(List list) {
        list.getClass();
        this.PolarVoyageStrictModeLegendEpic1532 = list;
    }

    @Override // p000createpolar.PolarVoyageTextInputLayoutTurboCelestialTitanium1416
    public final int PolarVoyageZipVortexCelestial6185() {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((Matcher) ((PolarVoyageAnimatorCelestialDeltaMaster5821) obj).PolarVoyageStrictModeLegendEpic1532).groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // p000createpolar.PolarVoyageTextInputLayoutTurboCelestialTitanium1416, java.util.Collection
    public /* bridge */ boolean contains(Object obj) {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        Object obj = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String group = ((Matcher) ((PolarVoyageAnimatorCelestialDeltaMaster5821) obj).PolarVoyageStrictModeLegendEpic1532).group(i);
                return group == null ? "" : group;
            default:
                List list = (List) obj;
                if (i >= 0 && i <= PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageDiffUtilDragonSpeedEclipse6225(this)) {
                    return list.get(PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageDiffUtilDragonSpeedEclipse6225(this) - i);
                }
                StringBuilder PolarVoyageContentProviderHyperSpark3838 = PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageContentProviderHyperSpark3838("Element index ", i, " must be in range [");
                PolarVoyageContentProviderHyperSpark3838.append(new PolarVoyageLinearLayoutHyperionSpectra2647(0, PolarVoyageDrawableCompatNebulaTitanNeo6818.PolarVoyageDiffUtilDragonSpeedEclipse6225(this), 1));
                PolarVoyageContentProviderHyperSpark3838.append("].");
                throw new IndexOutOfBoundsException(PolarVoyageContentProviderHyperSpark3838.toString());
        }
    }

    @Override // p000createpolar.PolarVoyageGeocoderMasterHyperHyperion4028, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // p000createpolar.PolarVoyageGeocoderMasterHyperHyperion4028, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case 1:
                return new PolarVoyageHandlerThreadNebulaRogueVision6112(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // p000createpolar.PolarVoyageGeocoderMasterHyperHyperion4028, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // p000createpolar.PolarVoyageGeocoderMasterHyperHyperion4028, java.util.List
    public ListIterator listIterator() {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case 1:
                return new PolarVoyageHandlerThreadNebulaRogueVision6112(this, 0);
            default:
                return super.listIterator();
        }
    }

    public PolarVoyageCoroutineCelestialAuroraPixel1740(PolarVoyageAnimatorCelestialDeltaMaster5821 polarVoyageAnimatorCelestialDeltaMaster5821) {
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageAnimatorCelestialDeltaMaster5821;
    }

    @Override // p000createpolar.PolarVoyageGeocoderMasterHyperHyperion4028, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.PolarVoyageItemDecorationUltraDeltaEpic7485) {
            case 1:
                return new PolarVoyageHandlerThreadNebulaRogueVision6112(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
