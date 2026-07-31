package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes3.dex */
public final class o72 extends AbstractC2211rj {

    /* renamed from: e, reason: collision with root package name */
    private final int f29930e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f29931f;

    /* renamed from: g, reason: collision with root package name */
    private final DatagramPacket f29932g;

    /* renamed from: h, reason: collision with root package name */
    private Uri f29933h;

    /* renamed from: i, reason: collision with root package name */
    private DatagramSocket f29934i;

    /* renamed from: j, reason: collision with root package name */
    private MulticastSocket f29935j;

    /* renamed from: k, reason: collision with root package name */
    private InetAddress f29936k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f29937l;

    /* renamed from: m, reason: collision with root package name */
    private int f29938m;

    public static final class a extends jv {
        public a(Exception exc, int i4) {
            super(exc, i4);
        }
    }

    public o72(int i4) {
        super(true);
        this.f29930e = JosStatusCodes.RTN_CODE_COMMON_ERROR;
        byte[] bArr = new byte[2000];
        this.f29931f = bArr;
        this.f29932g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final long a(mv mvVar) {
        Uri uri = mvVar.f29239a;
        this.f29933h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f29933h.getPort();
        b(mvVar);
        try {
            this.f29936k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f29936k, port);
            if (this.f29936k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f29935j = multicastSocket;
                multicastSocket.joinGroup(this.f29936k);
                this.f29934i = this.f29935j;
            } else {
                this.f29934i = new DatagramSocket(inetSocketAddress);
            }
            this.f29934i.setSoTimeout(this.f29930e);
            this.f29937l = true;
            c(mvVar);
            return -1L;
        } catch (IOException e4) {
            throw new a(e4, IronSourceConstants.IS_LOAD_CALLED);
        } catch (SecurityException e5) {
            throw new a(e5, 2006);
        }
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final void close() {
        this.f29933h = null;
        MulticastSocket multicastSocket = this.f29935j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f29936k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f29935j = null;
        }
        DatagramSocket datagramSocket = this.f29934i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f29934i = null;
        }
        this.f29936k = null;
        this.f29938m = 0;
        if (this.f29937l) {
            this.f29937l = false;
            e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final Uri getUri() {
        return this.f29933h;
    }

    @Override // com.yandex.mobile.ads.impl.fv
    public final int read(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        if (this.f29938m == 0) {
            try {
                DatagramSocket datagramSocket = this.f29934i;
                datagramSocket.getClass();
                datagramSocket.receive(this.f29932g);
                int length = this.f29932g.getLength();
                this.f29938m = length;
                c(length);
            } catch (SocketTimeoutException e4) {
                throw new a(e4, 2002);
            } catch (IOException e5) {
                throw new a(e5, IronSourceConstants.IS_LOAD_CALLED);
            }
        }
        int length2 = this.f29932g.getLength();
        int i6 = this.f29938m;
        int min = Math.min(i6, i5);
        System.arraycopy(this.f29931f, length2 - i6, bArr, i4, min);
        this.f29938m -= min;
        return min;
    }
}
