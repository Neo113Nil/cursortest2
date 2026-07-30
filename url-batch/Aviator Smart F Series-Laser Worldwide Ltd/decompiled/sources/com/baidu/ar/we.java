package com.baidu.ar;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public class we implements te {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ boolean f3634s = true;

    /* renamed from: b, reason: collision with root package name */
    public final BlockingQueue<ByteBuffer> f3636b;

    /* renamed from: c, reason: collision with root package name */
    public final xe f3637c;

    /* renamed from: d, reason: collision with root package name */
    public SelectionKey f3638d;

    /* renamed from: e, reason: collision with root package name */
    public ByteChannel f3639e;

    /* renamed from: h, reason: collision with root package name */
    public List<l3> f3642h;

    /* renamed from: i, reason: collision with root package name */
    public l3 f3643i;

    /* renamed from: j, reason: collision with root package name */
    public lb f3644j;

    /* renamed from: a, reason: collision with root package name */
    public final f8 f3635a = g8.a((Class<?>) we.class);

    /* renamed from: f, reason: collision with root package name */
    public boolean f3640f = false;

    /* renamed from: g, reason: collision with root package name */
    public volatile qa f3641g = qa.NOT_YET_CONNECTED;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f3645k = ByteBuffer.allocate(0);

    /* renamed from: l, reason: collision with root package name */
    public a2 f3646l = null;

    /* renamed from: m, reason: collision with root package name */
    public String f3647m = null;

    /* renamed from: n, reason: collision with root package name */
    public Integer f3648n = null;

    /* renamed from: o, reason: collision with root package name */
    public Boolean f3649o = null;

    /* renamed from: p, reason: collision with root package name */
    public String f3650p = null;

    /* renamed from: q, reason: collision with root package name */
    public long f3651q = System.nanoTime();

    /* renamed from: r, reason: collision with root package name */
    public final Object f3652r = new Object();

    public we(xe xeVar, l3 l3Var) {
        this.f3643i = null;
        if (xeVar == null || (l3Var == null && this.f3644j == lb.SERVER)) {
            throw new IllegalArgumentException("parameters must not be null");
        }
        this.f3636b = new LinkedBlockingQueue();
        new LinkedBlockingQueue();
        this.f3637c = xeVar;
        this.f3644j = lb.CLIENT;
        if (l3Var != null) {
            this.f3643i = l3Var.a();
        }
    }

    public void a() {
        int i8;
        if (this.f3641g == qa.NOT_YET_CONNECTED) {
            i8 = -1;
        } else {
            if (this.f3640f) {
                b(this.f3648n.intValue(), this.f3647m, this.f3649o.booleanValue());
                return;
            }
            i8 = (this.f3643i.b() != d2.NONE && (this.f3643i.b() != d2.ONEWAY || this.f3644j == lb.SERVER)) ? 1006 : 1000;
        }
        a(i8, true);
    }

    public long b() {
        return this.f3651q;
    }

    public qa c() {
        return this.f3641g;
    }

    public xe d() {
        return this.f3637c;
    }

    public final void e(ByteBuffer byteBuffer) {
        this.f3635a.a("write({}): {}", Integer.valueOf(byteBuffer.remaining()), byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array()));
        this.f3636b.add(byteBuffer);
        this.f3637c.b(this);
    }

    public boolean f() {
        return this.f3641g == qa.CLOSING;
    }

    public boolean g() {
        return this.f3641g == qa.OPEN;
    }

    public void h() {
        ea a8 = this.f3637c.a(this);
        if (a8 == null) {
            throw new NullPointerException("onPreparePing(WebSocket) returned null. PingFrame to sent can't be null.");
        }
        a(a8);
    }

    public void i() {
        this.f3651q = System.nanoTime();
    }

    public String toString() {
        return super.toString();
    }

    public void a(int i8) {
        a(i8, "", false);
    }

    public final ByteBuffer b(int i8) {
        String str = i8 != 404 ? "500 Internal Server Error" : "404 WebSocket Upgrade Failure";
        return ByteBuffer.wrap(y1.a("HTTP/1.1 " + str + "\r\nContent-Type: text/html\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + (str.length() + 48) + "\r\n\r\n<html><head></head><body><h1>" + str + "</h1></body></html>"));
    }

    public synchronized void c(int i8, String str, boolean z7) {
        if (this.f3640f) {
            return;
        }
        this.f3648n = Integer.valueOf(i8);
        this.f3647m = str;
        this.f3649o = Boolean.valueOf(z7);
        this.f3640f = true;
        this.f3637c.b(this);
        try {
            this.f3637c.a(this, i8, str, z7);
        } catch (RuntimeException e8) {
            this.f3635a.b("Exception in onWebsocketClosing", e8);
            this.f3637c.a(this, e8);
        }
        l3 l3Var = this.f3643i;
        if (l3Var != null) {
            l3Var.c();
        }
        this.f3646l = null;
    }

    public void d(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        a(this.f3643i.a(byteBuffer, this.f3644j == lb.CLIENT));
    }

    public boolean e() {
        return this.f3641g == qa.CLOSED;
    }

    public void a(int i8, String str) {
        a(i8, str, false);
    }

    public void b(int i8, String str) {
        b(i8, str, false);
    }

    public final boolean c(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        lb lbVar;
        d5 d8;
        if (this.f3645k.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.f3645k.remaining() < byteBuffer.remaining()) {
                ByteBuffer allocate = ByteBuffer.allocate(this.f3645k.capacity() + byteBuffer.remaining());
                this.f3645k.flip();
                allocate.put(this.f3645k);
                this.f3645k = allocate;
            }
            this.f3645k.put(byteBuffer);
            this.f3645k.flip();
            byteBuffer2 = this.f3645k;
        }
        byteBuffer2.mark();
        try {
            try {
                lbVar = this.f3644j;
            } catch (w7 e8) {
                this.f3635a.a("Closing due to invalid handshake", (Throwable) e8);
                a(e8);
            }
        } catch (s7 e9) {
            if (this.f3645k.capacity() == 0) {
                byteBuffer2.reset();
                int a8 = e9.a();
                if (a8 == 0) {
                    a8 = byteBuffer2.capacity() + 16;
                } else if (!f3634s && e9.a() < byteBuffer2.remaining()) {
                    throw new AssertionError();
                }
                ByteBuffer allocate2 = ByteBuffer.allocate(a8);
                this.f3645k = allocate2;
                allocate2.put(byteBuffer);
            } else {
                ByteBuffer byteBuffer3 = this.f3645k;
                byteBuffer3.position(byteBuffer3.limit());
                ByteBuffer byteBuffer4 = this.f3645k;
                byteBuffer4.limit(byteBuffer4.capacity());
            }
        }
        if (lbVar != lb.SERVER) {
            if (lbVar == lb.CLIENT) {
                this.f3643i.a(lbVar);
                d5 d9 = this.f3643i.d(byteBuffer2);
                if (!(d9 instanceof pb)) {
                    this.f3635a.b("Closing due to protocol error: wrong http function");
                    c(1002, "wrong http function", false);
                    return false;
                }
                pb pbVar = (pb) d9;
                if (this.f3643i.a(this.f3646l, pbVar) == c5.MATCHED) {
                    try {
                        this.f3637c.a(this, this.f3646l, pbVar);
                        a(pbVar);
                        return true;
                    } catch (t7 e10) {
                        this.f3635a.a("Closing due to invalid data exception. Possible handshake rejection", (Throwable) e10);
                        c(e10.a(), e10.getMessage(), false);
                        return false;
                    } catch (RuntimeException e11) {
                        this.f3635a.b("Closing since client was never connected", e11);
                        this.f3637c.a(this, e11);
                        c(-1, e11.getMessage(), false);
                        return false;
                    }
                }
                this.f3635a.a("Closing due to protocol error: draft {} refuses handshake", this.f3643i);
                a(1002, "draft " + this.f3643i + " refuses handshake");
            }
            return false;
        }
        l3 l3Var = this.f3643i;
        if (l3Var != null) {
            d5 d10 = l3Var.d(byteBuffer2);
            if (!(d10 instanceof a2)) {
                this.f3635a.b("Closing due to protocol error: wrong http function");
                c(1002, "wrong http function", false);
                return false;
            }
            a2 a2Var = (a2) d10;
            if (this.f3643i.a(a2Var) == c5.MATCHED) {
                a(a2Var);
                return true;
            }
            this.f3635a.b("Closing due to protocol error: the handshake did finally not match");
            a(1002, "the handshake did finally not match");
            return false;
        }
        Iterator<l3> it = this.f3642h.iterator();
        while (it.hasNext()) {
            l3 a9 = it.next().a();
            try {
                a9.a(this.f3644j);
                byteBuffer2.reset();
                d8 = a9.d(byteBuffer2);
            } catch (w7 unused) {
            }
            if (!(d8 instanceof a2)) {
                this.f3635a.b("Closing due to wrong handshake");
                b(new t7(1002, "wrong http function"));
                return false;
            }
            a2 a2Var2 = (a2) d8;
            if (a9.a(a2Var2) == c5.MATCHED) {
                this.f3650p = a2Var2.a();
                try {
                    a(a9.b(a9.a(a2Var2, this.f3637c.a(this, a9, a2Var2))));
                    this.f3643i = a9;
                    a(a2Var2);
                    return true;
                } catch (t7 e12) {
                    this.f3635a.a("Closing due to wrong handshake. Possible handshake rejection", (Throwable) e12);
                    b(e12);
                    return false;
                } catch (RuntimeException e13) {
                    this.f3635a.b("Closing due to internal server error", e13);
                    this.f3637c.a(this, e13);
                    a(e13);
                    return false;
                }
            }
        }
        if (this.f3643i == null) {
            this.f3635a.b("Closing due to protocol error: no draft matches");
            b(new t7(1002, "no draft matches"));
        }
        return false;
    }

    public synchronized void a(int i8, String str, boolean z7) {
        try {
            qa qaVar = this.f3641g;
            qa qaVar2 = qa.CLOSING;
            if (qaVar == qaVar2 || this.f3641g == qa.CLOSED) {
                return;
            }
            if (this.f3641g != qa.OPEN) {
                if (i8 == -3) {
                    if (!f3634s && !z7) {
                        throw new AssertionError();
                    }
                    c(-3, str, true);
                } else if (i8 != 1002) {
                    c(-1, str, false);
                }
                this.f3641g = qa.CLOSING;
                this.f3645k = null;
            }
            if (i8 == 1006) {
                if (!f3634s && z7) {
                    throw new AssertionError();
                }
                this.f3641g = qaVar2;
                c(i8, str, false);
                return;
            }
            if (this.f3643i.b() != d2.NONE) {
                try {
                    if (!z7) {
                        try {
                            this.f3637c.a(this, i8, str);
                        } catch (RuntimeException e8) {
                            this.f3637c.a(this, e8);
                        }
                    }
                    if (g()) {
                        c2 c2Var = new c2();
                        c2Var.a(str);
                        c2Var.a(i8);
                        c2Var.g();
                        a(c2Var);
                    }
                } catch (t7 e9) {
                    this.f3635a.b("generated frame is invalid", e9);
                    this.f3637c.a(this, e9);
                    c(1006, "generated frame is invalid", false);
                }
            }
            c(i8, str, z7);
            this.f3641g = qa.CLOSING;
            this.f3645k = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b(int i8, String str, boolean z7) {
        try {
            if (this.f3641g == qa.CLOSED) {
                return;
            }
            if (this.f3641g == qa.OPEN && i8 == 1006) {
                this.f3641g = qa.CLOSING;
            }
            SelectionKey selectionKey = this.f3638d;
            if (selectionKey != null) {
                selectionKey.cancel();
            }
            ByteChannel byteChannel = this.f3639e;
            if (byteChannel != null) {
                try {
                    byteChannel.close();
                } catch (IOException e8) {
                    if (e8.getMessage() == null || !e8.getMessage().equals("Broken pipe")) {
                        this.f3635a.b("Exception during channel.close()", e8);
                        this.f3637c.a(this, e8);
                    } else {
                        this.f3635a.a("Caught IOException: Broken pipe during closeConnection()", (Throwable) e8);
                    }
                }
            }
            try {
                this.f3637c.b(this, i8, str, z7);
            } catch (RuntimeException e9) {
                this.f3637c.a(this, e9);
            }
            l3 l3Var = this.f3643i;
            if (l3Var != null) {
                l3Var.c();
            }
            this.f3646l = null;
            this.f3641g = qa.CLOSED;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void a(int i8, boolean z7) {
        b(i8, "", z7);
    }

    public final void b(t7 t7Var) {
        e(b(404));
        c(t7Var.a(), t7Var.getMessage(), false);
    }

    public void a(b2 b2Var) {
        this.f3646l = this.f3643i.a(b2Var);
        String a8 = b2Var.a();
        this.f3650p = a8;
        if (!f3634s && a8 == null) {
            throw new AssertionError();
        }
        try {
            this.f3637c.a((te) this, this.f3646l);
            a(this.f3643i.b(this.f3646l));
        } catch (t7 unused) {
            throw new w7("Handshake data rejected by client.");
        } catch (RuntimeException e8) {
            this.f3635a.b("Exception in startHandshake", e8);
            this.f3637c.a(this, e8);
            throw new w7("rejected because of " + e8);
        }
    }

    public final void b(ByteBuffer byteBuffer) {
        String str;
        t7 t7Var;
        f8 f8Var;
        t7 t7Var2;
        try {
            for (q4 q4Var : this.f3643i.c(byteBuffer)) {
                this.f3635a.a("matched frame: {}", q4Var);
                this.f3643i.a(this, q4Var);
            }
        } catch (a8 e8) {
            int b8 = e8.b();
            t7Var2 = e8;
            if (b8 == Integer.MAX_VALUE) {
                str = "Closing due to invalid size of frame";
                f8Var = this.f3635a;
                t7Var = e8;
                f8Var.b(str, t7Var);
                this.f3637c.a(this, t7Var);
                t7Var2 = t7Var;
            }
            a(t7Var2);
        } catch (t7 e9) {
            str = "Closing due to invalid data in frame";
            f8Var = this.f3635a;
            t7Var = e9;
            f8Var.b(str, t7Var);
            this.f3637c.a(this, t7Var);
            t7Var2 = t7Var;
            a(t7Var2);
        }
    }

    public final void a(d5 d5Var) {
        this.f3635a.a("open using draft: {}", this.f3643i);
        this.f3641g = qa.OPEN;
        try {
            this.f3637c.a(this, d5Var);
        } catch (RuntimeException e8) {
            this.f3637c.a(this, e8);
        }
    }

    @Override // com.baidu.ar.te
    public void a(q4 q4Var) {
        a((Collection<q4>) Collections.singletonList(q4Var));
    }

    public void a(t7 t7Var) {
        a(t7Var.a(), t7Var.getMessage(), false);
    }

    public final void a(RuntimeException runtimeException) {
        e(b(500));
        c(-1, runtimeException.getMessage(), false);
    }

    public void a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        a(this.f3643i.a(str, this.f3644j == lb.CLIENT));
    }

    public void a(ByteBuffer byteBuffer) {
        boolean z7 = f3634s;
        if (!z7 && !byteBuffer.hasRemaining()) {
            throw new AssertionError();
        }
        this.f3635a.a("process({}): ({})", Integer.valueOf(byteBuffer.remaining()), byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining()));
        if (this.f3641g != qa.NOT_YET_CONNECTED) {
            if (this.f3641g != qa.OPEN) {
                return;
            }
        } else {
            if (!c(byteBuffer) || f() || e()) {
                return;
            }
            if (!z7 && this.f3645k.hasRemaining() == byteBuffer.hasRemaining() && byteBuffer.hasRemaining()) {
                throw new AssertionError();
            }
            if (!byteBuffer.hasRemaining()) {
                if (!this.f3645k.hasRemaining()) {
                    return;
                } else {
                    byteBuffer = this.f3645k;
                }
            }
        }
        b(byteBuffer);
    }

    public final void a(Collection<q4> collection) {
        if (!g()) {
            throw new ze();
        }
        if (collection == null) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList();
        for (q4 q4Var : collection) {
            this.f3635a.a("send frame: {}", q4Var);
            arrayList.add(this.f3643i.a(q4Var));
        }
        a((List<ByteBuffer>) arrayList);
    }

    public final void a(List<ByteBuffer> list) {
        synchronized (this.f3652r) {
            try {
                Iterator<ByteBuffer> it = list.iterator();
                while (it.hasNext()) {
                    e(it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(byte[] bArr) {
        d(ByteBuffer.wrap(bArr));
    }
}
