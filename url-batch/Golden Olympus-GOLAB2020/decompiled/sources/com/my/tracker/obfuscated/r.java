package com.my.tracker.obfuscated;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class r extends AbstractC1683s1 {

    /* renamed from: c, reason: collision with root package name */
    private final a f21511c;

    private static class a extends ByteArrayOutputStream {

        /* renamed from: a, reason: collision with root package name */
        private final int f21512a;

        /* renamed from: b, reason: collision with root package name */
        private int f21513b;

        /* renamed from: c, reason: collision with root package name */
        private int f21514c;

        public a(int i4) {
            super(i4);
            this.f21512a = i4;
            this.f21513b = Integer.MAX_VALUE;
            this.f21514c = -1;
        }

        public synchronized void m() {
            try {
                reset();
                if (AbstractC1708y2.a()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SimpleByteArrayOutputStream: minSize=");
                    int i4 = this.f21513b;
                    if (i4 == Integer.MAX_VALUE) {
                        i4 = 0;
                    }
                    sb.append(i4);
                    sb.append(", maxSize=");
                    sb.append(this.f21514c);
                    sb.append(", truncate=");
                    sb.append(this.f21512a);
                    AbstractC1708y2.a(sb.toString());
                }
                this.f21513b = Integer.MAX_VALUE;
                this.f21514c = -1;
                int length = ((ByteArrayOutputStream) this).buf.length;
                int i5 = this.f21512a;
                if (length > i5) {
                    ((ByteArrayOutputStream) this).buf = new byte[i5];
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.ByteArrayOutputStream
        public synchronized void reset() {
            try {
                int i4 = ((ByteArrayOutputStream) this).count;
                if (i4 > 0) {
                    this.f21513b = Integer.min(this.f21513b, i4);
                }
                this.f21514c = Integer.max(((ByteArrayOutputStream) this).count, this.f21514c);
                super.reset();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public r(int i4) {
        super(new a(i4));
        this.f21511c = (a) this.f21527a;
    }

    public void a() {
        this.f21511c.reset();
    }

    public int b() {
        return this.f21511c.size();
    }

    public byte[] c() {
        return this.f21511c.toByteArray();
    }

    public void d() {
        this.f21511c.m();
    }

    public void a(OutputStream outputStream) {
        this.f21511c.writeTo(outputStream);
    }
}
