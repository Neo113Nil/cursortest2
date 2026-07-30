package p000createpolar;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageCameraXHyperionPulse4441 implements ComponentCallbacks2 {
    public final /* synthetic */ Configuration PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final /* synthetic */ PolarVoyageViewPager2HyperEpicDelta4183 PolarVoyageStrictModeLegendEpic1532;

    public PolarVoyageCameraXHyperionPulse4441(Configuration configuration, PolarVoyageViewPager2HyperEpicDelta4183 polarVoyageViewPager2HyperEpicDelta4183) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = configuration;
        this.PolarVoyageStrictModeLegendEpic1532 = polarVoyageViewPager2HyperEpicDelta4183;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.PolarVoyageStrictModeLegendEpic1532.PolarVoyageZipVortexCelestial6185.entrySet().iterator();
        while (it.hasNext()) {
            PolarVoyageManifestEclipseSpectraSpeed6949 polarVoyageManifestEclipseSpectraSpeed6949 = (PolarVoyageManifestEclipseSpectraSpeed6949) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (polarVoyageManifestEclipseSpectraSpeed6949 == null || Configuration.needNewResources(updateFrom, polarVoyageManifestEclipseSpectraSpeed6949.PolarVoyageMotionLayoutTransitionHeroVision4068)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.PolarVoyageStrictModeLegendEpic1532.PolarVoyageZipVortexCelestial6185.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.PolarVoyageStrictModeLegendEpic1532.PolarVoyageZipVortexCelestial6185.clear();
    }
}
