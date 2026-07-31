package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class ka4 extends eb1 {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f7438e;

    /* renamed from: f, reason: collision with root package name */
    private final DatagramPacket f7439f;

    /* renamed from: g, reason: collision with root package name */
    private Uri f7440g;

    /* renamed from: h, reason: collision with root package name */
    private DatagramSocket f7441h;

    /* renamed from: i, reason: collision with root package name */
    private MulticastSocket f7442i;

    /* renamed from: j, reason: collision with root package name */
    private InetAddress f7443j;

    /* renamed from: k, reason: collision with root package name */
    private InetSocketAddress f7444k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f7445l;

    /* renamed from: m, reason: collision with root package name */
    private int f7446m;

    public ka4(int i7) {
        super(true);
        byte[] bArr = new byte[2000];
        this.f7438e = bArr;
        this.f7439f = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.google.android.gms.internal.ads.fc1
    public final int a(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        if (this.f7446m == 0) {
            try {
                this.f7441h.receive(this.f7439f);
                int length = this.f7439f.getLength();
                this.f7446m = length;
                o(length);
            } catch (SocketTimeoutException e7) {
                throw new ja4(e7, 2002);
            } catch (IOException e8) {
                throw new ja4(e8, 2001);
            }
        }
        int length2 = this.f7439f.getLength();
        int i9 = this.f7446m;
        int min = Math.min(i9, i8);
        System.arraycopy(this.f7438e, length2 - i9, bArr, i7, min);
        this.f7446m -= min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final Uri h() {
        return this.f7440g;
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final void i() {
        this.f7440g = null;
        MulticastSocket multicastSocket = this.f7442i;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f7443j);
            } catch (IOException unused) {
            }
            this.f7442i = null;
        }
        DatagramSocket datagramSocket = this.f7441h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f7441h = null;
        }
        this.f7443j = null;
        this.f7444k = null;
        this.f7446m = 0;
        if (this.f7445l) {
            this.f7445l = false;
            p();
        }
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final long k(li1 li1Var) {
        DatagramSocket datagramSocket;
        Uri uri = li1Var.f7985a;
        this.f7440g = uri;
        String host = uri.getHost();
        int port = this.f7440g.getPort();
        q(li1Var);
        try {
            this.f7443j = InetAddress.getByName(host);
            this.f7444k = new InetSocketAddress(this.f7443j, port);
            if (this.f7443j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f7444k);
                this.f7442i = multicastSocket;
                multicastSocket.joinGroup(this.f7443j);
                datagramSocket = this.f7442i;
            } else {
                datagramSocket = new DatagramSocket(this.f7444k);
            }
            this.f7441h = datagramSocket;
            this.f7441h.setSoTimeout(8000);
            this.f7445l = true;
            r(li1Var);
            return -1L;
        } catch (IOException e7) {
            throw new ja4(e7, 2001);
        } catch (SecurityException e8) {
            throw new ja4(e8, 2006);
        }
    }
}
