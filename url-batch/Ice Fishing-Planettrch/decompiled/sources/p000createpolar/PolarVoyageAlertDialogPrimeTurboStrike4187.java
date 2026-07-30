package p000createpolar;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageAlertDialogPrimeTurboStrike4187 extends PolarVoyageAdMobSpeedFusion2921 {
    public boolean PolarVoyageAnimatorSetSparkUltraMax8233;
    public int PolarVoyageBitmapMaxTitanTitan7960;
    public final byte[] PolarVoyageCameraPixelBlaze2629;
    public DatagramSocket PolarVoyageContentProviderHyperSpark3838;
    public final DatagramPacket PolarVoyageDrawableDeltaHyperion5742;
    public InetAddress PolarVoyageNavigationViewHyperHyperHyperion1793;
    public MulticastSocket PolarVoyageRemoteModelManagerOlympianCelestial9141;
    public Uri PolarVoyageSnackbarGammaEclipse2140;
    public final int PolarVoyageViewRogueMaster4778;

    public PolarVoyageAlertDialogPrimeTurboStrike4187() {
        super(true);
        this.PolarVoyageViewRogueMaster4778 = 8000;
        byte[] bArr = new byte[2000];
        this.PolarVoyageCameraPixelBlaze2629 = bArr;
        this.PolarVoyageDrawableDeltaHyperion5742 = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // p000createpolar.PolarVoyageEditTextNeoUltra9594
    public final Uri PolarVoyageBottomSheetOmegaNeo1907() {
        return this.PolarVoyageSnackbarGammaEclipse2140;
    }

    @Override // p000createpolar.PolarVoyageEditTextNeoUltra9594
    public final long PolarVoyageContentProviderHyperSpark3838(PolarVoyagePlaceholderRogueTitanium7752 polarVoyagePlaceholderRogueTitanium7752) {
        Uri uri = polarVoyagePlaceholderRogueTitanium7752.PolarVoyageZipVortexCelestial6185;
        this.PolarVoyageSnackbarGammaEclipse2140 = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.PolarVoyageSnackbarGammaEclipse2140.getPort();
        PolarVoyageSnackbarGammaEclipse2140();
        try {
            this.PolarVoyageNavigationViewHyperHyperHyperion1793 = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.PolarVoyageNavigationViewHyperHyperHyperion1793, port);
            if (this.PolarVoyageNavigationViewHyperHyperHyperion1793.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.PolarVoyageRemoteModelManagerOlympianCelestial9141 = multicastSocket;
                multicastSocket.joinGroup(this.PolarVoyageNavigationViewHyperHyperHyperion1793);
                this.PolarVoyageContentProviderHyperSpark3838 = this.PolarVoyageRemoteModelManagerOlympianCelestial9141;
            } else {
                this.PolarVoyageContentProviderHyperSpark3838 = new DatagramSocket(inetSocketAddress);
            }
            this.PolarVoyageContentProviderHyperSpark3838.setSoTimeout(this.PolarVoyageViewRogueMaster4778);
            this.PolarVoyageAnimatorSetSparkUltraMax8233 = true;
            PolarVoyageAnimatorSetSparkUltraMax8233(polarVoyagePlaceholderRogueTitanium7752);
            return -1L;
        } catch (IOException e) {
            throw new PolarVoyageGraphPhoenixNebulaDragon8619(e, 2001);
        } catch (SecurityException e2) {
            throw new PolarVoyageGraphPhoenixNebulaDragon8619(e2, 2006);
        }
    }

    @Override // p000createpolar.PolarVoyageEditTextNeoUltra9594
    public final void close() {
        this.PolarVoyageSnackbarGammaEclipse2140 = null;
        MulticastSocket multicastSocket = this.PolarVoyageRemoteModelManagerOlympianCelestial9141;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.PolarVoyageNavigationViewHyperHyperHyperion1793;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.PolarVoyageRemoteModelManagerOlympianCelestial9141 = null;
        }
        DatagramSocket datagramSocket = this.PolarVoyageContentProviderHyperSpark3838;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.PolarVoyageContentProviderHyperSpark3838 = null;
        }
        this.PolarVoyageNavigationViewHyperHyperHyperion1793 = null;
        this.PolarVoyageBitmapMaxTitanTitan7960 = 0;
        if (this.PolarVoyageAnimatorSetSparkUltraMax8233) {
            this.PolarVoyageAnimatorSetSparkUltraMax8233 = false;
            PolarVoyageStrictModeLegendEpic1532();
        }
    }

    @Override // p000createpolar.PolarVoyageTracePixelSparkNova2688
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.PolarVoyageBitmapMaxTitanTitan7960;
        DatagramPacket datagramPacket = this.PolarVoyageDrawableDeltaHyperion5742;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.PolarVoyageContentProviderHyperSpark3838;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.PolarVoyageBitmapMaxTitanTitan7960 = length;
                PolarVoyageKotlinBetaPulseBeta3653(length);
            } catch (SocketTimeoutException e) {
                throw new PolarVoyageGraphPhoenixNebulaDragon8619(e, 2002);
            } catch (IOException e2) {
                throw new PolarVoyageGraphPhoenixNebulaDragon8619(e2, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.PolarVoyageBitmapMaxTitanTitan7960;
        int min = Math.min(i4, i2);
        System.arraycopy(this.PolarVoyageCameraPixelBlaze2629, length2 - i4, bArr, i, min);
        this.PolarVoyageBitmapMaxTitanTitan7960 -= min;
        return min;
    }
}
