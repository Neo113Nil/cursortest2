package io.flutter.embedding.android;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    long f17154a;

    /* renamed from: b, reason: collision with root package name */
    a f17155b;

    /* renamed from: c, reason: collision with root package name */
    long f17156c;

    /* renamed from: d, reason: collision with root package name */
    long f17157d;

    /* renamed from: e, reason: collision with root package name */
    boolean f17158e;

    /* renamed from: f, reason: collision with root package name */
    String f17159f;

    public enum a {
        kDown(0),
        kUp(1),
        kRepeat(2);


        /* renamed from: f, reason: collision with root package name */
        private long f17164f;

        a(long j7) {
            this.f17164f = j7;
        }

        public long b() {
            return this.f17164f;
        }
    }

    ByteBuffer a() {
        try {
            String str = this.f17159f;
            byte[] bytes = str == null ? null : str.getBytes("UTF-8");
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 48);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(this.f17154a);
            allocateDirect.putLong(this.f17155b.b());
            allocateDirect.putLong(this.f17156c);
            allocateDirect.putLong(this.f17157d);
            allocateDirect.putLong(this.f17158e ? 1L : 0L);
            if (bytes != null) {
                allocateDirect.put(bytes);
            }
            return allocateDirect;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }
}
