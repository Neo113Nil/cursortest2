package org.apache.a.f.f;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ContentLengthInputStream.java */
/* loaded from: classes2.dex */
public class g extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private long f9916a;

    /* renamed from: b, reason: collision with root package name */
    private long f9917b = 0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9918c = false;

    /* renamed from: d, reason: collision with root package name */
    private org.apache.a.g.f f9919d;

    public g(org.apache.a.g.f fVar, long j) {
        this.f9919d = null;
        if (fVar == null) {
            throw new IllegalArgumentException("Input stream may not be null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("Content length may not be negative");
        }
        this.f9919d = fVar;
        this.f9916a = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f9918c) {
            return;
        }
        try {
            if (this.f9917b < this.f9916a) {
                do {
                } while (read(new byte[2048]) >= 0);
            }
        } finally {
            this.f9918c = true;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.f9919d instanceof org.apache.a.g.a) {
            return Math.min(((org.apache.a.g.a) this.f9919d).e(), (int) (this.f9916a - this.f9917b));
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f9918c) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.f9917b >= this.f9916a) {
            return -1;
        }
        int a2 = this.f9919d.a();
        if (a2 != -1) {
            this.f9917b++;
        } else if (this.f9917b < this.f9916a) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Premature end of Content-Length delimited message body (expected: ");
            stringBuffer.append(this.f9916a);
            stringBuffer.append("; received: ");
            stringBuffer.append(this.f9917b);
            throw new org.apache.a.a(stringBuffer.toString());
        }
        return a2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f9918c) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.f9917b >= this.f9916a) {
            return -1;
        }
        if (this.f9917b + i2 > this.f9916a) {
            i2 = (int) (this.f9916a - this.f9917b);
        }
        int a2 = this.f9919d.a(bArr, i, i2);
        if (a2 != -1 || this.f9917b >= this.f9916a) {
            if (a2 > 0) {
                this.f9917b += a2;
            }
            return a2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Premature end of Content-Length delimited message body (expected: ");
        stringBuffer.append(this.f9916a);
        stringBuffer.append("; received: ");
        stringBuffer.append(this.f9917b);
        throw new org.apache.a.a(stringBuffer.toString());
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        int read;
        if (j <= 0) {
            return 0L;
        }
        byte[] bArr = new byte[2048];
        long min = Math.min(j, this.f9916a - this.f9917b);
        long j2 = 0;
        while (min > 0 && (read = read(bArr, 0, (int) Math.min(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH, min))) != -1) {
            long j3 = read;
            j2 += j3;
            min -= j3;
        }
        return j2;
    }
}
