package com.baidu.ar;

import com.google.common.net.HttpHeaders;
import com.google.common.primitives.UnsignedBytes;
import com.jieli.jl_audio_decode.constant.ErrorCode;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public class m3 extends l3 {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ boolean f2768l = true;

    /* renamed from: b, reason: collision with root package name */
    public final f8 f2769b;

    /* renamed from: c, reason: collision with root package name */
    public y5 f2770c;

    /* renamed from: d, reason: collision with root package name */
    public List<y5> f2771d;

    /* renamed from: e, reason: collision with root package name */
    public w6 f2772e;

    /* renamed from: f, reason: collision with root package name */
    public List<w6> f2773f;

    /* renamed from: g, reason: collision with root package name */
    public q4 f2774g;

    /* renamed from: h, reason: collision with root package name */
    public final List<ByteBuffer> f2775h;

    /* renamed from: i, reason: collision with root package name */
    public ByteBuffer f2776i;

    /* renamed from: j, reason: collision with root package name */
    public final Random f2777j;

    /* renamed from: k, reason: collision with root package name */
    public int f2778k;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public int f2779a;

        /* renamed from: b, reason: collision with root package name */
        public int f2780b;

        public a(m3 m3Var, int i8, int i9) {
            this.f2779a = i8;
            this.f2780b = i9;
        }

        public final int a() {
            return this.f2779a;
        }

        public final int b() {
            return this.f2780b;
        }
    }

    public m3() {
        this(Collections.emptyList());
    }

    public final byte a(t9 t9Var) {
        if (t9Var == t9.CONTINUOUS) {
            return (byte) 0;
        }
        if (t9Var == t9.TEXT) {
            return (byte) 1;
        }
        if (t9Var == t9.BINARY) {
            return (byte) 2;
        }
        if (t9Var == t9.CLOSING) {
            return (byte) 8;
        }
        if (t9Var == t9.PING) {
            return (byte) 9;
        }
        if (t9Var == t9.PONG) {
            return (byte) 10;
        }
        throw new IllegalArgumentException("Don't know how to handle " + t9Var.toString());
    }

    public final byte b(int i8) {
        if (i8 == 1) {
            return (byte) 64;
        }
        if (i8 == 2) {
            return (byte) 32;
        }
        return i8 == 3 ? (byte) 16 : (byte) 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0096, code lost:
    
        if (r6.hasRemaining() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0098, code lost:
    
        r6.mark();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009b, code lost:
    
        r0.add(g(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a3, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a4, code lost:
    
        r6.reset();
        r1 = java.nio.ByteBuffer.allocate(a(r1.a()));
        r5.f2776i = r1;
        r1.put(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b8, code lost:
    
        return r0;
     */
    @Override // com.baidu.ar.l3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<q4> c(ByteBuffer byteBuffer) {
        while (true) {
            LinkedList linkedList = new LinkedList();
            if (this.f2776i == null) {
                break;
            }
            try {
                byteBuffer.mark();
                int remaining = byteBuffer.remaining();
                int remaining2 = this.f2776i.remaining();
                if (remaining2 > remaining) {
                    this.f2776i.put(byteBuffer.array(), byteBuffer.position(), remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                    return Collections.emptyList();
                }
                this.f2776i.put(byteBuffer.array(), byteBuffer.position(), remaining2);
                byteBuffer.position(byteBuffer.position() + remaining2);
                linkedList.add(g((ByteBuffer) this.f2776i.duplicate().position(0)));
                this.f2776i = null;
            } catch (r7 e8) {
                ByteBuffer allocate = ByteBuffer.allocate(a(e8.a()));
                if (!f2768l && allocate.limit() <= this.f2776i.limit()) {
                    throw new AssertionError();
                }
                this.f2776i.rewind();
                allocate.put(this.f2776i);
                this.f2776i = allocate;
            }
        }
    }

    public final void d() {
        long f8 = f();
        if (f8 <= this.f2778k) {
            return;
        }
        e();
        this.f2769b.a("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(this.f2778k), Long.valueOf(f8));
        throw new a8(this.f2778k);
    }

    public final void e() {
        synchronized (this.f2775h) {
            this.f2775h.clear();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m3.class != obj.getClass()) {
            return false;
        }
        m3 m3Var = (m3) obj;
        if (this.f2778k != m3Var.j()) {
            return false;
        }
        y5 y5Var = this.f2770c;
        if (y5Var == null ? m3Var.g() != null : !y5Var.equals(m3Var.g())) {
            return false;
        }
        w6 w6Var = this.f2772e;
        w6 l8 = m3Var.l();
        return w6Var != null ? w6Var.equals(l8) : l8 == null;
    }

    public final int f(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= 125) {
            return 1;
        }
        return byteBuffer.remaining() <= 65535 ? 2 : 8;
    }

    public final q4 g(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException();
        }
        int remaining = byteBuffer.remaining();
        int i8 = 2;
        a(remaining, 2);
        byte b8 = byteBuffer.get();
        boolean z7 = (b8 >> 8) != 0;
        boolean z8 = (b8 & 64) != 0;
        boolean z9 = (b8 & 32) != 0;
        boolean z10 = (b8 & 16) != 0;
        byte b9 = byteBuffer.get();
        boolean z11 = (b9 & UnsignedBytes.MAX_POWER_OF_TWO) != 0;
        int i9 = (byte) (b9 & Byte.MAX_VALUE);
        t9 a8 = a((byte) (b8 & 15));
        if (i9 < 0 || i9 > 125) {
            a a9 = a(byteBuffer, a8, i9, remaining, 2);
            i9 = a9.a();
            i8 = a9.b();
        }
        a(i9);
        a(remaining, i8 + (z11 ? 4 : 0) + i9);
        ByteBuffer allocate = ByteBuffer.allocate(a(i9));
        if (z11) {
            byte[] bArr = new byte[4];
            byteBuffer.get(bArr);
            for (int i10 = 0; i10 < i9; i10++) {
                allocate.put((byte) (byteBuffer.get() ^ bArr[i10 % 4]));
            }
        } else {
            allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
            byteBuffer.position(byteBuffer.position() + allocate.limit());
        }
        r4 a10 = r4.a(a8);
        a10.a(z7);
        a10.b(z8);
        a10.c(z9);
        a10.d(z10);
        allocate.flip();
        a10.a(allocate);
        g().a(a10);
        g().c(a10);
        if (this.f2769b.a()) {
            this.f2769b.a("afterDecoding({}): {}", Integer.valueOf(a10.f().remaining()), a10.f().remaining() > 1000 ? "too big to display" : new String(a10.f().array()));
        }
        a10.g();
        return a10;
    }

    public List<y5> h() {
        return this.f2771d;
    }

    public int hashCode() {
        y5 y5Var = this.f2770c;
        int hashCode = (y5Var != null ? y5Var.hashCode() : 0) * 31;
        w6 w6Var = this.f2772e;
        int hashCode2 = (hashCode + (w6Var != null ? w6Var.hashCode() : 0)) * 31;
        int i8 = this.f2778k;
        return hashCode2 + (i8 ^ (i8 >>> 32));
    }

    public List<w6> i() {
        return this.f2773f;
    }

    public int j() {
        return this.f2778k;
    }

    public final ByteBuffer k() {
        ByteBuffer allocate;
        synchronized (this.f2775h) {
            try {
                long j8 = 0;
                while (this.f2775h.iterator().hasNext()) {
                    j8 += r1.next().limit();
                }
                d();
                allocate = ByteBuffer.allocate((int) j8);
                Iterator<ByteBuffer> it = this.f2775h.iterator();
                while (it.hasNext()) {
                    allocate.put(it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        allocate.flip();
        return allocate;
    }

    public w6 l() {
        return this.f2772e;
    }

    public final String m() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(cn.hutool.core.date.d.HTTP_DATETIME_PATTERN, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(calendar.getTime());
    }

    @Override // com.baidu.ar.l3
    public String toString() {
        String l3Var = super.toString();
        if (g() != null) {
            l3Var = l3Var + " extension: " + g().toString();
        }
        if (l() != null) {
            l3Var = l3Var + " protocol: " + l().toString();
        }
        return l3Var + " max frame size: " + this.f2778k;
    }

    public m3(List<y5> list) {
        this(list, Collections.singletonList(new na("")));
    }

    public final byte a(boolean z7) {
        if (z7) {
            return UnsignedBytes.MAX_POWER_OF_TWO;
        }
        return (byte) 0;
    }

    @Override // com.baidu.ar.l3
    public d2 b() {
        return d2.TWOWAY;
    }

    @Override // com.baidu.ar.l3
    public void c() {
        this.f2776i = null;
        y5 y5Var = this.f2770c;
        if (y5Var != null) {
            y5Var.d();
        }
        this.f2770c = new x2();
        this.f2772e = null;
    }

    public final void d(we weVar, q4 q4Var) {
        if (this.f2774g == null) {
            this.f2769b.b("Protocol error: Previous continuous frame sequence not completed.");
            throw new t7(1002, "Continuous frame sequence was not started.");
        }
        e(q4Var.f());
        d();
        try {
        } catch (RuntimeException e8) {
            a(weVar, e8);
        }
        if (this.f2774g.a() != t9.TEXT) {
            if (this.f2774g.a() == t9.BINARY) {
                ((r4) this.f2774g).a(k());
                ((r4) this.f2774g).g();
                weVar.d().a(weVar, this.f2774g.f());
            }
            this.f2774g = null;
            e();
        }
        ((r4) this.f2774g).a(k());
        ((r4) this.f2774g).g();
        weVar.d().a(weVar, y1.b(this.f2774g.f()));
        this.f2774g = null;
        e();
    }

    public final void e(we weVar, q4 q4Var) {
        try {
            weVar.d().a(weVar, y1.b(q4Var.f()));
        } catch (RuntimeException e8) {
            a(weVar, e8);
        }
    }

    public final long f() {
        long j8;
        synchronized (this.f2775h) {
            try {
                j8 = 0;
                while (this.f2775h.iterator().hasNext()) {
                    j8 += r1.next().limit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j8;
    }

    public y5 g() {
        return this.f2770c;
    }

    public m3(List<y5> list, List<w6> list2) {
        this(list, list2, Integer.MAX_VALUE);
    }

    @Override // com.baidu.ar.l3
    public b2 a(b2 b2Var) {
        b2Var.a(HttpHeaders.UPGRADE, "websocket");
        b2Var.a("Connection", HttpHeaders.UPGRADE);
        byte[] bArr = new byte[16];
        this.f2777j.nextBytes(bArr);
        b2Var.a(HttpHeaders.SEC_WEBSOCKET_KEY, d1.a(bArr));
        b2Var.a(HttpHeaders.SEC_WEBSOCKET_VERSION, "13");
        StringBuilder sb = new StringBuilder();
        for (y5 y5Var : this.f2771d) {
            if (y5Var.c() != null && y5Var.c().length() != 0) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(y5Var.c());
            }
        }
        if (sb.length() != 0) {
            b2Var.a(HttpHeaders.SEC_WEBSOCKET_EXTENSIONS, sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        for (w6 w6Var : this.f2773f) {
            if (w6Var.b().length() != 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(w6Var.b());
            }
        }
        if (sb2.length() != 0) {
            b2Var.a(HttpHeaders.SEC_WEBSOCKET_PROTOCOL, sb2.toString());
        }
        return b2Var;
    }

    public final String b(String str) {
        try {
            return d1.a(MessageDigest.getInstance("SHA1").digest((str.trim() + WebSocketProtocol.ACCEPT_MAGIC).getBytes()));
        } catch (NoSuchAlgorithmException e8) {
            throw new IllegalStateException(e8);
        }
    }

    public final void c(q4 q4Var) {
        if (this.f2774g != null) {
            this.f2769b.b("Protocol error: Previous continuous frame sequence not completed.");
            throw new t7(1002, "Previous continuous frame sequence not completed.");
        }
        this.f2774g = q4Var;
        e(q4Var.f());
        d();
    }

    public final void e(ByteBuffer byteBuffer) {
        synchronized (this.f2775h) {
            this.f2775h.add(byteBuffer);
        }
    }

    public m3(List<y5> list, List<w6> list2, int i8) {
        this.f2769b = g8.a((Class<?>) m3.class);
        this.f2770c = new x2();
        this.f2777j = new Random();
        if (list == null || list2 == null || i8 < 1) {
            throw new IllegalArgumentException();
        }
        this.f2771d = new ArrayList(list.size());
        this.f2773f = new ArrayList(list2.size());
        this.f2775h = new ArrayList();
        Iterator<y5> it = list.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            if (it.next().getClass().equals(x2.class)) {
                z7 = true;
            }
        }
        this.f2771d.addAll(list);
        if (!z7) {
            List<y5> list3 = this.f2771d;
            list3.add(list3.size(), this.f2770c);
        }
        this.f2773f.addAll(list2);
        this.f2778k = i8;
    }

    @Override // com.baidu.ar.l3
    public c5 a(a2 a2Var) {
        f8 f8Var;
        String str;
        if (c(a2Var) != 13) {
            f8Var = this.f2769b;
            str = "acceptHandshakeAsServer - Wrong websocket version.";
        } else {
            c5 c5Var = c5.NOT_MATCHED;
            String c8 = a2Var.c(HttpHeaders.SEC_WEBSOCKET_EXTENSIONS);
            Iterator<y5> it = this.f2771d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                y5 next = it.next();
                if (next.a(c8)) {
                    this.f2770c = next;
                    c5Var = c5.MATCHED;
                    this.f2769b.a("acceptHandshakeAsServer - Matching extension found: {}", next);
                    break;
                }
            }
            c5 a8 = a(a2Var.c(HttpHeaders.SEC_WEBSOCKET_PROTOCOL));
            c5 c5Var2 = c5.MATCHED;
            if (a8 == c5Var2 && c5Var == c5Var2) {
                return c5Var2;
            }
            f8Var = this.f2769b;
            str = "acceptHandshakeAsServer - No matching extension or protocol found.";
        }
        f8Var.b(str);
        return c5.NOT_MATCHED;
    }

    public final ByteBuffer b(q4 q4Var) {
        int a8;
        ByteBuffer f8 = q4Var.f();
        int i8 = 0;
        boolean z7 = this.f2690a == lb.CLIENT;
        int f9 = f(f8);
        ByteBuffer allocate = ByteBuffer.allocate((f9 > 1 ? f9 + 1 : f9) + 1 + (z7 ? 4 : 0) + f8.remaining());
        byte a9 = (byte) (a(q4Var.a()) | ((byte) (q4Var.d() ? ErrorCode.ERR_OUTPUT_EXCEPTION : 0)));
        if (q4Var.b()) {
            a9 = (byte) (a9 | b(1));
        }
        if (q4Var.e()) {
            a9 = (byte) (a9 | b(2));
        }
        if (q4Var.c()) {
            a9 = (byte) (b(3) | a9);
        }
        allocate.put(a9);
        byte[] a10 = a(f8.remaining(), f9);
        if (!f2768l && a10.length != f9) {
            throw new AssertionError();
        }
        if (f9 == 1) {
            allocate.put((byte) (a10[0] | a(z7)));
        } else {
            if (f9 == 2) {
                a8 = a(z7) | a4.a.f97x1;
            } else {
                if (f9 != 8) {
                    throw new IllegalStateException("Size representation not supported/specified");
                }
                a8 = a(z7) | Byte.MAX_VALUE;
            }
            allocate.put((byte) a8);
            allocate.put(a10);
        }
        if (z7) {
            ByteBuffer allocate2 = ByteBuffer.allocate(4);
            allocate2.putInt(this.f2777j.nextInt());
            allocate.put(allocate2.array());
            while (f8.hasRemaining()) {
                allocate.put((byte) (f8.get() ^ allocate2.get(i8 % 4)));
                i8++;
            }
        } else {
            allocate.put(f8);
            f8.flip();
        }
        if (!f2768l && allocate.remaining() != 0) {
            throw new AssertionError(allocate.remaining());
        }
        allocate.flip();
        return allocate;
    }

    public final void c(we weVar, q4 q4Var) {
        int i8;
        String str;
        if (q4Var instanceof c2) {
            c2 c2Var = (c2) q4Var;
            i8 = c2Var.h();
            str = c2Var.i();
        } else {
            i8 = 1005;
            str = "";
        }
        if (weVar.c() == qa.CLOSING) {
            weVar.b(i8, str, true);
        } else if (b() == d2.TWOWAY) {
            weVar.a(i8, str, true);
        } else {
            weVar.c(i8, str, false);
        }
    }

    @Override // com.baidu.ar.l3
    public c5 a(a2 a2Var, pb pbVar) {
        f8 f8Var;
        String str;
        if (!a(pbVar)) {
            f8Var = this.f2769b;
            str = "acceptHandshakeAsClient - Missing/wrong upgrade or connection in handshake.";
        } else if (a2Var.a(HttpHeaders.SEC_WEBSOCKET_KEY) && pbVar.a(HttpHeaders.SEC_WEBSOCKET_ACCEPT)) {
            if (b(a2Var.c(HttpHeaders.SEC_WEBSOCKET_KEY)).equals(pbVar.c(HttpHeaders.SEC_WEBSOCKET_ACCEPT))) {
                c5 c5Var = c5.NOT_MATCHED;
                String c8 = pbVar.c(HttpHeaders.SEC_WEBSOCKET_EXTENSIONS);
                Iterator<y5> it = this.f2771d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    y5 next = it.next();
                    if (next.b(c8)) {
                        this.f2770c = next;
                        c5Var = c5.MATCHED;
                        this.f2769b.a("acceptHandshakeAsClient - Matching extension found: {}", next);
                        break;
                    }
                }
                c5 a8 = a(pbVar.c(HttpHeaders.SEC_WEBSOCKET_PROTOCOL));
                c5 c5Var2 = c5.MATCHED;
                if (a8 == c5Var2 && c5Var == c5Var2) {
                    return c5Var2;
                }
                f8Var = this.f2769b;
                str = "acceptHandshakeAsClient - No matching extension or protocol found.";
            } else {
                f8Var = this.f2769b;
                str = "acceptHandshakeAsClient - Wrong key for Sec-WebSocket-Key.";
            }
        } else {
            f8Var = this.f2769b;
            str = "acceptHandshakeAsClient - Missing Sec-WebSocket-Key or Sec-WebSocket-Accept";
        }
        f8Var.b(str);
        return c5.NOT_MATCHED;
    }

    public final void b(we weVar, q4 q4Var) {
        try {
            weVar.d().a(weVar, q4Var.f());
        } catch (RuntimeException e8) {
            a(weVar, e8);
        }
    }

    public final c5 a(String str) {
        for (w6 w6Var : this.f2773f) {
            if (w6Var.a(str)) {
                this.f2772e = w6Var;
                this.f2769b.a("acceptHandshake - Matching protocol found: {}", w6Var);
                return c5.MATCHED;
            }
        }
        return c5.NOT_MATCHED;
    }

    @Override // com.baidu.ar.l3
    public l3 a() {
        ArrayList arrayList = new ArrayList();
        Iterator<y5> it = h().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<w6> it2 = i().iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().a());
        }
        return new m3(arrayList, arrayList2, this.f2778k);
    }

    public final a a(ByteBuffer byteBuffer, t9 t9Var, int i8, int i9, int i10) {
        int i11;
        int i12;
        if (t9Var == t9.PING || t9Var == t9.PONG || t9Var == t9.CLOSING) {
            this.f2769b.b("Invalid frame: more than 125 octets");
            throw new v7("more than 125 octets");
        }
        if (i8 == 126) {
            i11 = i10 + 2;
            a(i9, i11);
            i12 = new BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
        } else {
            i11 = i10 + 8;
            a(i9, i11);
            byte[] bArr = new byte[8];
            for (int i13 = 0; i13 < 8; i13++) {
                bArr[i13] = byteBuffer.get();
            }
            long longValue = new BigInteger(bArr).longValue();
            a(longValue);
            i12 = (int) longValue;
        }
        return new a(this, i12, i11);
    }

    public final t9 a(byte b8) {
        if (b8 == 0) {
            return t9.CONTINUOUS;
        }
        if (b8 == 1) {
            return t9.TEXT;
        }
        if (b8 == 2) {
            return t9.BINARY;
        }
        switch (b8) {
            case 8:
                return t9.CLOSING;
            case 9:
                return t9.PING;
            case 10:
                return t9.PONG;
            default:
                throw new v7("Unknown opcode " + ((int) b8));
        }
    }

    @Override // com.baidu.ar.l3
    public z4 a(a2 a2Var, qb qbVar) {
        qbVar.a(HttpHeaders.UPGRADE, "websocket");
        qbVar.a("Connection", a2Var.c("Connection"));
        String c8 = a2Var.c(HttpHeaders.SEC_WEBSOCKET_KEY);
        if (c8 == null) {
            throw new w7("missing Sec-WebSocket-Key");
        }
        qbVar.a(HttpHeaders.SEC_WEBSOCKET_ACCEPT, b(c8));
        if (g().b().length() != 0) {
            qbVar.a(HttpHeaders.SEC_WEBSOCKET_EXTENSIONS, g().b());
        }
        if (l() != null && l().b().length() != 0) {
            qbVar.a(HttpHeaders.SEC_WEBSOCKET_PROTOCOL, l().b());
        }
        qbVar.d("Web Socket Protocol Handshake");
        qbVar.a(HttpHeaders.SERVER, "TooTallNate Java-WebSocket");
        qbVar.a("Date", m());
        return qbVar;
    }

    @Override // com.baidu.ar.l3
    public ByteBuffer a(q4 q4Var) {
        g().b(q4Var);
        if (this.f2769b.a()) {
            this.f2769b.a("afterEnconding({}): {}", Integer.valueOf(q4Var.f().remaining()), q4Var.f().remaining() > 1000 ? "too big to display" : new String(q4Var.f().array()));
        }
        return b(q4Var);
    }

    @Override // com.baidu.ar.l3
    public List<q4> a(String str, boolean z7) {
        rc rcVar = new rc();
        rcVar.a(ByteBuffer.wrap(y1.b(str)));
        rcVar.e(z7);
        try {
            rcVar.g();
            return Collections.singletonList(rcVar);
        } catch (t7 e8) {
            throw new n9(e8);
        }
    }

    @Override // com.baidu.ar.l3
    public List<q4> a(ByteBuffer byteBuffer, boolean z7) {
        j1 j1Var = new j1();
        j1Var.a(byteBuffer);
        j1Var.e(z7);
        try {
            j1Var.g();
            return Collections.singletonList(j1Var);
        } catch (t7 e8) {
            throw new n9(e8);
        }
    }

    public final void a(int i8, int i9) {
        if (i8 >= i9) {
            return;
        }
        this.f2769b.b("Incomplete frame: maxpacketsize < realpacketsize");
        throw new r7(i9);
    }

    public final void a(long j8) {
        if (j8 > 2147483647L) {
            this.f2769b.b("Limit exedeed: Payloadsize is to big...");
            throw new a8("Payloadsize is to big...");
        }
        int i8 = this.f2778k;
        if (j8 > i8) {
            this.f2769b.a("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(i8), Long.valueOf(j8));
            throw new a8("Payload limit reached.", this.f2778k);
        }
        if (j8 >= 0) {
            return;
        }
        this.f2769b.b("Limit underflow: Payloadsize is to little...");
        throw new a8("Payloadsize is to little...");
    }

    @Override // com.baidu.ar.l3
    public void a(we weVar, q4 q4Var) {
        t9 a8 = q4Var.a();
        if (a8 == t9.CLOSING) {
            c(weVar, q4Var);
            return;
        }
        if (a8 == t9.PING) {
            weVar.d().a(weVar, q4Var);
            return;
        }
        if (a8 == t9.PONG) {
            weVar.i();
            weVar.d().b(weVar, q4Var);
            return;
        }
        if (!q4Var.d() || a8 == t9.CONTINUOUS) {
            a(weVar, q4Var, a8);
            return;
        }
        if (this.f2774g != null) {
            this.f2769b.a("Protocol error: Continuous frame sequence not completed.");
            throw new t7(1002, "Continuous frame sequence not completed.");
        }
        if (a8 == t9.TEXT) {
            e(weVar, q4Var);
        } else if (a8 == t9.BINARY) {
            b(weVar, q4Var);
        } else {
            this.f2769b.a("non control or continious frame expected");
            throw new t7(1002, "non control or continious frame expected");
        }
    }

    public final void a(we weVar, q4 q4Var, t9 t9Var) {
        t9 t9Var2 = t9.CONTINUOUS;
        if (t9Var != t9Var2) {
            c(q4Var);
        } else if (q4Var.d()) {
            d(weVar, q4Var);
        } else if (this.f2774g == null) {
            this.f2769b.a("Protocol error: Continuous frame sequence was not started.");
            throw new t7(1002, "Continuous frame sequence was not started.");
        }
        if (t9Var == t9.TEXT && !y1.a(q4Var.f())) {
            this.f2769b.a("Protocol error: Payload is not UTF8");
            throw new t7(1007);
        }
        if (t9Var != t9Var2 || this.f2774g == null) {
            return;
        }
        e(q4Var.f());
    }

    public final void a(we weVar, RuntimeException runtimeException) {
        this.f2769b.b("Runtime exception during onWebsocketMessage", runtimeException);
        weVar.d().a(weVar, runtimeException);
    }

    public final byte[] a(long j8, int i8) {
        byte[] bArr = new byte[i8];
        int i9 = (i8 * 8) - 8;
        for (int i10 = 0; i10 < i8; i10++) {
            bArr[i10] = (byte) (j8 >>> (i9 - (i10 * 8)));
        }
        return bArr;
    }
}
