package Y;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class C extends AbstractC0123c {

    /* renamed from: e, reason: collision with root package name */
    public final int f3666e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f3667f;

    /* renamed from: g, reason: collision with root package name */
    public final DatagramPacket f3668g;

    /* renamed from: h, reason: collision with root package name */
    public Uri f3669h;

    /* renamed from: i, reason: collision with root package name */
    public DatagramSocket f3670i;

    /* renamed from: j, reason: collision with root package name */
    public MulticastSocket f3671j;

    /* renamed from: k, reason: collision with root package name */
    public InetAddress f3672k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3673l;

    /* renamed from: m, reason: collision with root package name */
    public int f3674m;

    public C(int i4) {
        super(true);
        this.f3666e = i4;
        byte[] bArr = new byte[2000];
        this.f3667f = bArr;
        this.f3668g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // Y.h
    public final Uri B() {
        return this.f3669h;
    }

    @Override // Y.h
    public final long b(k kVar) {
        Uri uri = kVar.f3701a;
        this.f3669h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f3669h.getPort();
        g();
        try {
            this.f3672k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f3672k, port);
            if (this.f3672k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f3671j = multicastSocket;
                multicastSocket.joinGroup(this.f3672k);
                this.f3670i = this.f3671j;
            } else {
                this.f3670i = new DatagramSocket(inetSocketAddress);
            }
            this.f3670i.setSoTimeout(this.f3666e);
            this.f3673l = true;
            h(kVar);
            return -1L;
        } catch (IOException e4) {
            throw new B(e4, 2001);
        } catch (SecurityException e5) {
            throw new B(e5, 2006);
        }
    }

    @Override // Y.h
    public final void close() {
        this.f3669h = null;
        MulticastSocket multicastSocket = this.f3671j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f3672k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f3671j = null;
        }
        DatagramSocket datagramSocket = this.f3670i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f3670i = null;
        }
        this.f3672k = null;
        this.f3674m = 0;
        if (this.f3673l) {
            this.f3673l = false;
            f();
        }
    }

    @Override // T.InterfaceC0090h
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        int i6 = this.f3674m;
        DatagramPacket datagramPacket = this.f3668g;
        if (i6 == 0) {
            try {
                DatagramSocket datagramSocket = this.f3670i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f3674m = length;
                a(length);
            } catch (SocketTimeoutException e4) {
                throw new B(e4, 2002);
            } catch (IOException e5) {
                throw new B(e5, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i7 = this.f3674m;
        int min = Math.min(i7, i5);
        System.arraycopy(this.f3667f, length2 - i7, bArr, i4, min);
        this.f3674m -= min;
        return min;
    }
}
