package m0;

import E.AbstractC0005f;
import W.J;
import a.AbstractC0124a;
import android.net.Uri;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.net.DatagramSocket;
import java.util.Locale;

/* renamed from: m0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1287I implements InterfaceC1291d {

    /* renamed from: a, reason: collision with root package name */
    public final Y.C f14335a = new Y.C(O3.d.g(8000));

    /* renamed from: b, reason: collision with root package name */
    public C1287I f14336b;

    @Override // Y.h
    public final Uri B() {
        return this.f14335a.f3669h;
    }

    @Override // Y.h
    public final long b(Y.k kVar) {
        this.f14335a.b(kVar);
        return -1L;
    }

    @Override // m0.InterfaceC1291d
    public final String c() {
        int e4 = e();
        AbstractC0124a.t(e4 != -1);
        String str = J.f3263a;
        Locale locale = Locale.US;
        return AbstractC0005f.i(e4, e4 + 1, "RTP/AVP;unicast;client_port=", TokenBuilder.TOKEN_DELIMITER);
    }

    @Override // Y.h
    public final void close() {
        this.f14335a.close();
        C1287I c1287i = this.f14336b;
        if (c1287i != null) {
            c1287i.close();
        }
    }

    @Override // m0.InterfaceC1291d
    public final int e() {
        DatagramSocket datagramSocket = this.f14335a.f3670i;
        int localPort = datagramSocket == null ? -1 : datagramSocket.getLocalPort();
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // m0.InterfaceC1291d
    public final boolean j() {
        return true;
    }

    @Override // m0.InterfaceC1291d
    public final C1285G n() {
        return null;
    }

    @Override // T.InterfaceC0090h
    public final int read(byte[] bArr, int i4, int i5) {
        try {
            return this.f14335a.read(bArr, i4, i5);
        } catch (Y.B e4) {
            if (e4.f3694a == 2002) {
                return -1;
            }
            throw e4;
        }
    }

    @Override // Y.h
    public final void y(Y.A a3) {
        this.f14335a.y(a3);
    }
}
