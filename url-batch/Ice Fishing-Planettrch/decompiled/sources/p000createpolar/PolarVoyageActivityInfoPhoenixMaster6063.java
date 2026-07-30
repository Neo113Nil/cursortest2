package p000createpolar;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageActivityInfoPhoenixMaster6063 implements HostnameVerifier {
    public static final PolarVoyageActivityInfoPhoenixMaster6063 PolarVoyageZipVortexCelestial6185 = new PolarVoyageActivityInfoPhoenixMaster6063();

    /* JADX WARN: Removed duplicated region for block: B:51:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[LOOP:1: B:22:0x005d->B:52:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean PolarVoyageKotlinBetaPulseBeta3653(String str, X509Certificate x509Certificate) {
        boolean z;
        int length;
        str.getClass();
        if (PolarVoyageThreadInfernoQuantumPhantom6954.PolarVoyageZipVortexCelestial6185.PolarVoyageKotlinBetaPulseBeta3653(str)) {
            String PolarVoyageMotionLayoutTransitionHeroVision4068 = PolarVoyageThreadInfernoQuantumPhantom6954.PolarVoyageMotionLayoutTransitionHeroVision4068(str);
            List PolarVoyageZipVortexCelestial61852 = PolarVoyageZipVortexCelestial6185(x509Certificate, 7);
            if (!PolarVoyageZipVortexCelestial61852.isEmpty()) {
                Iterator it = PolarVoyageZipVortexCelestial61852.iterator();
                while (it.hasNext()) {
                    if (PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(PolarVoyageMotionLayoutTransitionHeroVision4068, PolarVoyageThreadInfernoQuantumPhantom6954.PolarVoyageMotionLayoutTransitionHeroVision4068((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (PolarVoyageMotionLayoutTransitionHeroVision4068(str)) {
            Locale locale = Locale.US;
            locale.getClass();
            str = str.toLowerCase(locale);
            str.getClass();
        }
        List<String> PolarVoyageZipVortexCelestial61853 = PolarVoyageZipVortexCelestial6185(x509Certificate, 2);
        if (!PolarVoyageZipVortexCelestial61853.isEmpty()) {
            for (String str2 : PolarVoyageZipVortexCelestial61853) {
                if (str.length() != 0 && !PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageDisplayMetricsVortexDragon9516(str, ".", false) && !PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageContentProviderHyperSpark3838(str, "..", false) && str2 != null && str2.length() != 0 && !PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageDisplayMetricsVortexDragon9516(str2, ".", false) && !PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageContentProviderHyperSpark3838(str2, "..", false)) {
                    String concat = !PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageContentProviderHyperSpark3838(str, ".", false) ? str.concat(".") : str;
                    if (!PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageContentProviderHyperSpark3838(str2, ".", false)) {
                        str2 = str2.concat(".");
                    }
                    if (PolarVoyageMotionLayoutTransitionHeroVision4068(str2)) {
                        Locale locale2 = Locale.US;
                        locale2.getClass();
                        str2 = str2.toLowerCase(locale2);
                        str2.getClass();
                    }
                    if (!PolarVoyageDebugTitaniumInferno5712.PolarVoyageAlertDialogCyberHeroQuantum3938(str2, "*")) {
                        z = concat.equals(str2);
                    } else if (PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageDisplayMetricsVortexDragon9516(str2, "*.", false) && PolarVoyageDebugTitaniumInferno5712.PolarVoyageLooperThreadAlphaPrime1279(str2, '*', 1, 4) == -1 && concat.length() >= str2.length() && !"*.".equals(str2)) {
                        String substring = str2.substring(1);
                        if (PolarVoyageViewBindingRoguePulsePrime2512.PolarVoyageContentProviderHyperSpark3838(concat, substring, false) && ((length = concat.length() - substring.length()) <= 0 || PolarVoyageDebugTitaniumInferno5712.PolarVoyageFCMCelestialCosmosPixel3711(concat, '.', length - 1, 4) == -1)) {
                            z = true;
                        }
                    }
                    if (!z) {
                        return true;
                    }
                }
                z = false;
                if (!z) {
                }
            }
        }
        return false;
    }

    public static boolean PolarVoyageMotionLayoutTransitionHeroVision4068(String str) {
        long j;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            PolarVoyageCamera2MasterPulse1881.PolarVoyageTextInputEditTextNebulaHero6651(PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageStrictModeLegendEpic1532("endIndex < beginIndex: ", length2, " < 0"));
            return false;
        }
        if (length2 > str.length()) {
            StringBuilder PolarVoyageContentProviderHyperSpark3838 = PolarVoyageVibratorInfernoPhoenixFusion4401.PolarVoyageContentProviderHyperSpark3838("endIndex > string.length: ", length2, " > ");
            PolarVoyageContentProviderHyperSpark3838.append(str.length());
            throw new IllegalArgumentException(PolarVoyageContentProviderHyperSpark3838.toString().toString());
        }
        long j2 = 0;
        int i = 0;
        while (i < length2) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                j2++;
            } else {
                if (charAt < 2048) {
                    j = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    j = 3;
                } else {
                    int i2 = i + 1;
                    char charAt2 = i2 < length2 ? str.charAt(i2) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j2++;
                        i = i2;
                    } else {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
            }
            i++;
        }
        return length == ((int) j2);
    }

    public static List PolarVoyageZipVortexCelestial6185(X509Certificate x509Certificate, int i) {
        Collection<List<?>> subjectAlternativeNames;
        Object obj;
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
        }
        if (subjectAlternativeNames == null) {
            return PolarVoyageWindowManagerSpeedUltra3573.PolarVoyageItemDecorationUltraDeltaEpic7485;
        }
        ArrayList arrayList = new ArrayList();
        for (List<?> list : subjectAlternativeNames) {
            if (list != null && list.size() >= 2 && PolarVoyageR8VisionOmegaNebula9943.PolarVoyageItemDecorationUltraDeltaEpic7485(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        str.getClass();
        sSLSession.getClass();
        if (PolarVoyageMotionLayoutTransitionHeroVision4068(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                certificate.getClass();
                return PolarVoyageKotlinBetaPulseBeta3653(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
