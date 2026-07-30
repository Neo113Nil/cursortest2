package com.baidu.ar;

import com.baidu.mapapi.http.wrapper.HttpManager;
import com.google.common.net.HttpHeaders;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class l3 {

    /* renamed from: a, reason: collision with root package name */
    public lb f2690a = null;

    public static z4 b(String[] strArr, String str) {
        if (!HttpManager.HTTP_GET.equalsIgnoreCase(strArr[0])) {
            throw new w7(String.format("Invalid request method received: %s Status line: %s", strArr[0], str));
        }
        if (!"HTTP/1.1".equalsIgnoreCase(strArr[2])) {
            throw new w7(String.format("Invalid status line received: %s Status line: %s", strArr[2], str));
        }
        a5 a5Var = new a5();
        a5Var.b(strArr[1]);
        return a5Var;
    }

    public int a(int i8) {
        if (i8 >= 0) {
            return i8;
        }
        throw new t7(1002, "Negative count");
    }

    public abstract b2 a(b2 b2Var);

    public abstract c5 a(a2 a2Var);

    public abstract c5 a(a2 a2Var, pb pbVar);

    public abstract l3 a();

    public abstract z4 a(a2 a2Var, qb qbVar);

    public abstract ByteBuffer a(q4 q4Var);

    public abstract List<q4> a(String str, boolean z7);

    public abstract List<q4> a(ByteBuffer byteBuffer, boolean z7);

    public abstract void a(we weVar, q4 q4Var);

    public abstract d2 b();

    public int c(d5 d5Var) {
        String c8 = d5Var.c(HttpHeaders.SEC_WEBSOCKET_VERSION);
        if (c8.length() > 0) {
            try {
                return new Integer(c8.trim()).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public abstract List<q4> c(ByteBuffer byteBuffer);

    public abstract void c();

    public d5 d(ByteBuffer byteBuffer) {
        return a(byteBuffer, this.f2690a);
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        throw new com.baidu.ar.s7();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static z4 a(ByteBuffer byteBuffer, lb lbVar) {
        String b8 = b(byteBuffer);
        if (b8 == null) {
            throw new s7(byteBuffer.capacity() + 128);
        }
        String[] split = b8.split(cn.hutool.core.text.l.SPACE, 3);
        if (split.length != 3) {
            throw new w7();
        }
        z4 a8 = lbVar == lb.CLIENT ? a(split, b8) : b(split, b8);
        while (true) {
            String b9 = b(byteBuffer);
            if (b9 == null || b9.length() <= 0) {
                break;
            }
            String[] split2 = b9.split(":", 2);
            if (split2.length != 2) {
                throw new w7("not an http header");
            }
            if (a8.a(split2[0])) {
                a8.a(split2[0], a8.c(split2[0]) + "; " + split2[1].replaceFirst("^ +", ""));
            } else {
                a8.a(split2[0], split2[1].replaceFirst("^ +", ""));
            }
        }
    }

    public static String b(ByteBuffer byteBuffer) {
        ByteBuffer a8 = a(byteBuffer);
        if (a8 == null) {
            return null;
        }
        return y1.a(a8.array(), 0, a8.limit());
    }

    public static z4 a(String[] strArr, String str) {
        if (!com.crrepa.band.my.device.watchfacenew.delegate.img.m.NEW_CUSTOM_WATCH_FACE_PRESET_IMG.equals(strArr[1])) {
            throw new w7(String.format("Invalid status code received: %s Status line: %s", strArr[1], str));
        }
        if (!"HTTP/1.1".equalsIgnoreCase(strArr[0])) {
            throw new w7(String.format("Invalid status line received: %s Status line: %s", strArr[0], str));
        }
        b5 b5Var = new b5();
        b5Var.a(Short.parseShort(strArr[1]));
        b5Var.d(strArr[2]);
        return b5Var;
    }

    public List<ByteBuffer> b(d5 d5Var) {
        return a(d5Var, true);
    }

    public static ByteBuffer a(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b8 = 48;
        while (byteBuffer.hasRemaining()) {
            byte b9 = byteBuffer.get();
            allocate.put(b9);
            if (b8 == 13 && b9 == 10) {
                allocate.limit(allocate.position() - 2);
                allocate.position(0);
                return allocate;
            }
            b8 = b9;
        }
        byteBuffer.position(byteBuffer.position() - allocate.position());
        return null;
    }

    public List<ByteBuffer> a(d5 d5Var, boolean z7) {
        String c8;
        StringBuilder sb = new StringBuilder(100);
        if (d5Var instanceof a2) {
            sb.append("GET ");
            sb.append(((a2) d5Var).a());
            c8 = " HTTP/1.1";
        } else {
            if (!(d5Var instanceof pb)) {
                throw new IllegalArgumentException("unknown role");
            }
            sb.append("HTTP/1.1 101 ");
            c8 = ((pb) d5Var).c();
        }
        sb.append(c8);
        sb.append("\r\n");
        Iterator<String> b8 = d5Var.b();
        while (b8.hasNext()) {
            String next = b8.next();
            String c9 = d5Var.c(next);
            sb.append(next);
            sb.append(": ");
            sb.append(c9);
            sb.append("\r\n");
        }
        sb.append("\r\n");
        byte[] a8 = y1.a(sb.toString());
        byte[] content = z7 ? d5Var.getContent() : null;
        ByteBuffer allocate = ByteBuffer.allocate((content == null ? 0 : content.length) + a8.length);
        allocate.put(a8);
        if (content != null) {
            allocate.put(content);
        }
        allocate.flip();
        return Collections.singletonList(allocate);
    }

    public void a(lb lbVar) {
        this.f2690a = lbVar;
    }

    public boolean a(d5 d5Var) {
        return d5Var.c(HttpHeaders.UPGRADE).equalsIgnoreCase("websocket") && d5Var.c("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade");
    }
}
