package p000createpolar;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageCamera2OmegaRogue8444 extends PolarVoyageNavigationViewNebulaNovaXPhoenix7849 {
    public final PolarVoyageDrawerLayoutGammaCosmos7826 PolarVoyageViewRogueMaster4778;

    public PolarVoyageCamera2OmegaRogue8444(PolarVoyageDrawerLayoutGammaCosmos7826 polarVoyageDrawerLayoutGammaCosmos7826) {
        polarVoyageDrawerLayoutGammaCosmos7826.getClass();
        this.PolarVoyageViewRogueMaster4778 = polarVoyageDrawerLayoutGammaCosmos7826;
    }

    public static boolean PolarVoyageDatabaseCosmosSpectraSolar3905(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i) {
        if (!PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < i) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // p000createpolar.PolarVoyageNavigationViewNebulaNovaXPhoenix7849
    public final List PolarVoyageAnimatorSetSparkUltraMax8233(String str, List list) {
        list.getClass();
        str.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        removeFirst.getClass();
        arrayList.add(removeFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            obj.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate PolarVoyageZipVortexCelestial6185 = this.PolarVoyageViewRogueMaster4778.PolarVoyageZipVortexCelestial6185(x509Certificate);
            if (PolarVoyageZipVortexCelestial6185 == null) {
                Iterator it = arrayDeque.iterator();
                it.getClass();
                while (it.hasNext()) {
                    Object next = it.next();
                    next.getClass();
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (PolarVoyageDatabaseCosmosSpectraSolar3905(x509Certificate, x509Certificate2, arrayList.size() - 1)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (!z) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(PolarVoyageZipVortexCelestial6185)) {
                arrayList.add(PolarVoyageZipVortexCelestial6185);
            }
            if (PolarVoyageDatabaseCosmosSpectraSolar3905(PolarVoyageZipVortexCelestial6185, PolarVoyageZipVortexCelestial6185, arrayList.size() - 2)) {
                return arrayList;
            }
            z = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof PolarVoyageCamera2OmegaRogue8444) && PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(((PolarVoyageCamera2OmegaRogue8444) obj).PolarVoyageViewRogueMaster4778, this.PolarVoyageViewRogueMaster4778);
    }

    public final int hashCode() {
        return this.PolarVoyageViewRogueMaster4778.hashCode();
    }
}
