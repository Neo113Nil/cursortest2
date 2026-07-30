package com.anythink.core.common.m.d.a;

import com.anythink.basead.exoplayer.k.p;
import com.anythink.core.common.m.b.h;
import com.anythink.core.common.m.d.d;
import com.anythink.core.common.v.q;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: c, reason: collision with root package name */
    private static final int f14735c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f14736d = 7;

    /* renamed from: a, reason: collision with root package name */
    protected Socket f14737a;

    /* renamed from: e, reason: collision with root package name */
    private String f14739e;

    /* renamed from: f, reason: collision with root package name */
    private int f14740f;

    /* renamed from: b, reason: collision with root package name */
    private final String f14738b = getClass().getSimpleName();

    /* renamed from: g, reason: collision with root package name */
    private byte[] f14741g = null;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f14742h = new byte[1];

    private boolean b() {
        Socket socket = this.f14737a;
        return (socket == null || !socket.isConnected() || this.f14737a.isClosed()) ? false : true;
    }

    public abstract void a(d dVar, d.a aVar);

    public final void b(final d dVar, final d.a aVar) {
        com.anythink.core.common.v.b.d dVar2 = new com.anythink.core.common.v.b.d() { // from class: com.anythink.core.common.m.d.a.c.1
            /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
            /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
            @Override // com.anythink.core.common.v.b.d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a() {
                d.a aVar2;
                try {
                    c.this.b(dVar);
                    c.this.a(dVar, aVar);
                } catch (SocketException e6) {
                    String unused = c.this.f14738b;
                    e6.getMessage();
                    dVar.toString();
                    c.b(c.this);
                    try {
                        c.this.b(dVar);
                        c.this.a(dVar, aVar);
                    } catch (Throwable th) {
                        String unused2 = c.this.f14738b;
                        e6.getMessage();
                        dVar.toString();
                        th = th;
                        String str = th.getMessage() + "," + q.a(th.getStackTrace());
                        String unused3 = c.this.f14738b;
                        dVar.a("", str, c.this.f14739e, c.this.f14740f);
                        aVar2 = aVar;
                        if (aVar2 == null) {
                            aVar2.a(th);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    String unused4 = c.this.f14738b;
                    th.getMessage();
                    String str2 = th.getMessage() + "," + q.a(th.getStackTrace());
                    String unused32 = c.this.f14738b;
                    dVar.a("", str2, c.this.f14739e, c.this.f14740f);
                    aVar2 = aVar;
                    if (aVar2 == null) {
                    }
                }
            }
        };
        if (dVar.c() == 6) {
            com.anythink.core.common.v.b.b.a().a(dVar2, 2);
        } else {
            com.anythink.core.common.v.b.b.a().a(dVar2, 3);
        }
    }

    private void a(d dVar) {
        synchronized (this) {
            try {
                if (this.f14737a == null) {
                    Socket socket = new Socket();
                    this.f14737a = socket;
                    socket.setSoTimeout(60000);
                }
                h e_ = dVar.e_();
                if (e_ != null) {
                    this.f14739e = e_.a();
                    this.f14740f = e_.b();
                    this.f14737a.connect(new InetSocketAddress(this.f14739e, this.f14740f), 30000);
                } else {
                    throw new IllegalArgumentException("The domain must not can be null or empty.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(d dVar) {
        try {
            Socket socket = this.f14737a;
            if (socket == null || !socket.isConnected() || this.f14737a.isClosed()) {
                synchronized (this) {
                    try {
                        if (this.f14737a == null) {
                            Socket socket2 = new Socket();
                            this.f14737a = socket2;
                            socket2.setSoTimeout(60000);
                        }
                        h e_ = dVar.e_();
                        if (e_ != null) {
                            this.f14739e = e_.a();
                            this.f14740f = e_.b();
                            this.f14737a.connect(new InetSocketAddress(this.f14739e, this.f14740f), 30000);
                        } else {
                            throw new IllegalArgumentException("The domain must not can be null or empty.");
                        }
                    } finally {
                    }
                }
            }
            byte[] e6 = dVar.e();
            if (e6 != null) {
                int length = e6.length;
                if (e6.length == 0) {
                    return;
                }
                int i = length + 7;
                byte[] bArr = this.f14741g;
                if (bArr == null || bArr.length < i) {
                    this.f14741g = new byte[i];
                }
                byte[] bArr2 = this.f14741g;
                bArr2[0] = 0;
                bArr2[1] = 3;
                bArr2[2] = (byte) dVar.c();
                byte[] bArr3 = this.f14741g;
                bArr3[3] = (byte) ((length >>> 24) & p.f8630b);
                bArr3[4] = (byte) ((length >>> 16) & p.f8630b);
                bArr3[5] = (byte) ((length >>> 8) & p.f8630b);
                bArr3[6] = (byte) (length & p.f8630b);
                System.arraycopy(e6, 0, bArr3, 7, e6.length);
                OutputStream outputStream = this.f14737a.getOutputStream();
                outputStream.write(this.f14741g, 0, i);
                outputStream.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a() {
        synchronized (this) {
            try {
                Socket socket = this.f14737a;
                if (socket != null) {
                    socket.close();
                    this.f14737a = null;
                }
            } catch (Exception unused) {
            }
        }
    }

    public final int a(InputStream inputStream) {
        if (inputStream.read(this.f14742h, 0, 1) != -1) {
            byte[] bArr = this.f14742h;
            byte b9 = bArr[0];
            bArr[0] = 0;
            return b9;
        }
        throw new SocketException("Socket.InputStream read length = -1!");
    }

    public static /* synthetic */ void b(c cVar) {
        synchronized (cVar) {
            try {
                Socket socket = cVar.f14737a;
                if (socket != null) {
                    socket.close();
                    cVar.f14737a = null;
                }
            } catch (Exception unused) {
            }
        }
    }
}
