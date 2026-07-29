package com.facebook.ads.internal.p.b;

import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes.dex */
class e extends k {

    /* renamed from: a, reason: collision with root package name */
    private final h f5324a;

    /* renamed from: b, reason: collision with root package name */
    private final com.facebook.ads.internal.p.b.a.b f5325b;

    /* renamed from: c, reason: collision with root package name */
    private b f5326c;

    public e(h hVar, com.facebook.ads.internal.p.b.a.b bVar) {
        super(hVar, bVar);
        this.f5325b = bVar;
        this.f5324a = hVar;
    }

    private void a(OutputStream outputStream, long j) {
        byte[] bArr = new byte[8192];
        while (true) {
            int a2 = a(bArr, j, bArr.length);
            if (a2 == -1) {
                outputStream.flush();
                return;
            } else {
                outputStream.write(bArr, 0, a2);
                j += a2;
            }
        }
    }

    private boolean a(d dVar) {
        int a2 = this.f5324a.a();
        return ((a2 > 0) && dVar.f5323c && ((float) dVar.f5322b) > ((float) this.f5325b.a()) + (((float) a2) * 0.2f)) ? false : true;
    }

    private String b(d dVar) {
        String c2 = this.f5324a.c();
        boolean z = !TextUtils.isEmpty(c2);
        int a2 = this.f5325b.d() ? this.f5325b.a() : this.f5324a.a();
        boolean z2 = a2 >= 0;
        long j = dVar.f5323c ? a2 - dVar.f5322b : a2;
        boolean z3 = z2 && dVar.f5323c;
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.f5323c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
        sb.append("Accept-Ranges: bytes\n");
        sb.append(z2 ? String.format("Content-Length: %d\n", Long.valueOf(j)) : "");
        sb.append(z3 ? String.format("Content-Range: bytes %d-%d/%d\n", Long.valueOf(dVar.f5322b), Integer.valueOf(a2 - 1), Integer.valueOf(a2)) : "");
        sb.append(z ? String.format("Content-Type: %s\n", c2) : "");
        sb.append("\n");
        return sb.toString();
    }

    private void b(OutputStream outputStream, long j) {
        try {
            h hVar = new h(this.f5324a);
            hVar.a((int) j);
            byte[] bArr = new byte[8192];
            while (true) {
                int a2 = hVar.a(bArr);
                if (a2 == -1) {
                    outputStream.flush();
                    return;
                }
                outputStream.write(bArr, 0, a2);
            }
        } finally {
            this.f5324a.b();
        }
    }

    @Override // com.facebook.ads.internal.p.b.k
    protected void a(int i) {
        if (this.f5326c != null) {
            this.f5326c.a(this.f5325b.f5310a, this.f5324a.f5347a, i);
        }
    }

    public void a(b bVar) {
        this.f5326c = bVar;
    }

    public void a(d dVar, Socket socket) {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(b(dVar).getBytes("UTF-8"));
        long j = dVar.f5322b;
        if (a(dVar)) {
            a(bufferedOutputStream, j);
        } else {
            b(bufferedOutputStream, j);
        }
    }
}
