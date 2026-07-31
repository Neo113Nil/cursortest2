package n2;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class q0 extends g {

    /* renamed from: e, reason: collision with root package name */
    private final int f19524e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f19525f;

    /* renamed from: g, reason: collision with root package name */
    private final DatagramPacket f19526g;

    /* renamed from: h, reason: collision with root package name */
    private Uri f19527h;

    /* renamed from: i, reason: collision with root package name */
    private DatagramSocket f19528i;

    /* renamed from: j, reason: collision with root package name */
    private MulticastSocket f19529j;

    /* renamed from: k, reason: collision with root package name */
    private InetAddress f19530k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f19531l;

    /* renamed from: m, reason: collision with root package name */
    private int f19532m;

    public static final class a extends m {
        public a(Throwable th, int i7) {
            super(th, i7);
        }
    }

    public q0() {
        this(2000);
    }

    public q0(int i7) {
        this(i7, 8000);
    }

    public q0(int i7, int i8) {
        super(true);
        this.f19524e = i8;
        byte[] bArr = new byte[i7];
        this.f19525f = bArr;
        this.f19526g = new DatagramPacket(bArr, 0, i7);
    }

    @Override // n2.l
    public long b(p pVar) {
        Uri uri = pVar.f19496a;
        this.f19527h = uri;
        String str = (String) o2.a.e(uri.getHost());
        int port = this.f19527h.getPort();
        s(pVar);
        try {
            this.f19530k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f19530k, port);
            if (this.f19530k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f19529j = multicastSocket;
                multicastSocket.joinGroup(this.f19530k);
                this.f19528i = this.f19529j;
            } else {
                this.f19528i = new DatagramSocket(inetSocketAddress);
            }
            this.f19528i.setSoTimeout(this.f19524e);
            this.f19531l = true;
            t(pVar);
            return -1L;
        } catch (IOException e7) {
            throw new a(e7, 2001);
        } catch (SecurityException e8) {
            throw new a(e8, 2006);
        }
    }

    @Override // n2.l
    public void close() {
        this.f19527h = null;
        MulticastSocket multicastSocket = this.f19529j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) o2.a.e(this.f19530k));
            } catch (IOException unused) {
            }
            this.f19529j = null;
        }
        DatagramSocket datagramSocket = this.f19528i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f19528i = null;
        }
        this.f19530k = null;
        this.f19532m = 0;
        if (this.f19531l) {
            this.f19531l = false;
            r();
        }
    }

    @Override // n2.l
    public Uri k() {
        return this.f19527h;
    }

    @Override // n2.i
    public int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        if (this.f19532m == 0) {
            try {
                ((DatagramSocket) o2.a.e(this.f19528i)).receive(this.f19526g);
                int length = this.f19526g.getLength();
                this.f19532m = length;
                q(length);
            } catch (SocketTimeoutException e7) {
                throw new a(e7, 2002);
            } catch (IOException e8) {
                throw new a(e8, 2001);
            }
        }
        int length2 = this.f19526g.getLength();
        int i9 = this.f19532m;
        int min = Math.min(i9, i8);
        System.arraycopy(this.f19525f, length2 - i9, bArr, i7, min);
        this.f19532m -= min;
        return min;
    }
}
