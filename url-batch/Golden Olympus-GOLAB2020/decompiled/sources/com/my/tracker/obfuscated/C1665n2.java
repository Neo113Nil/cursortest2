package com.my.tracker.obfuscated;

import android.text.TextUtils;
import android.util.Base64;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.AbstractC1686t0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* renamed from: com.my.tracker.obfuscated.n2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1665n2 {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC1673p2 f21458a;

    /* renamed from: b, reason: collision with root package name */
    final C1712z2 f21459b;

    /* renamed from: c, reason: collision with root package name */
    final int f21460c;

    /* renamed from: com.my.tracker.obfuscated.n2$a */
    private static class a implements AbstractC1686t0.a {

        /* renamed from: a, reason: collision with root package name */
        private final C1688t2[] f21461a;

        /* renamed from: b, reason: collision with root package name */
        private long f21462b;

        private a(C1688t2[] c1688t2Arr) {
            this.f21461a = c1688t2Arr;
        }

        static a a(C1688t2[] c1688t2Arr) {
            return new a(c1688t2Arr);
        }

        public C1688t2[] b() {
            return this.f21461a;
        }

        public String toString() {
            String join = TextUtils.join(StringUtils.COMMA, this.f21461a);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                a(byteArrayOutputStream);
            } catch (Exception unused) {
            }
            return "[ChunkProtobufPacket]\n| sendTimestamp = " + this.f21462b + "\n| contain " + this.f21461a.length + " packets: " + join + "\n| content (base64): " + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0) + "\n[/ChunkProtobufPacket]";
        }

        @Override // com.my.tracker.obfuscated.AbstractC1686t0.a
        public void a(OutputStream outputStream) {
            r rVar = new r(16384);
            r rVar2 = new r(16384);
            for (C1688t2 c1688t2 : this.f21461a) {
                rVar.a();
                rVar2.a();
                a(c1688t2, rVar2);
                rVar.a(1, rVar2);
                rVar.a(outputStream);
            }
        }

        @Override // com.my.tracker.obfuscated.AbstractC1686t0.a
        public String a() {
            return "application/octet-stream";
        }

        public void a(long j4) {
            this.f21462b = j4;
        }

        private void a(C1688t2 c1688t2, r rVar) {
            try {
                rVar.b(c1688t2.b());
                rVar.a(4, this.f21462b);
            } catch (Exception unused) {
                AbstractC1708y2.b("TimeSpentPacketSender: something went wrong while extracting protobuf data, return empty result");
            }
        }
    }

    private C1665n2(int i4, C1712z2 c1712z2, InterfaceC1673p2 interfaceC1673p2) {
        this.f21460c = i4;
        this.f21458a = interfaceC1673p2;
        this.f21459b = c1712z2;
    }

    private a b() {
        C1688t2[] a4 = this.f21458a.a(this.f21460c);
        int length = a4 == null ? 0 : a4.length;
        AbstractC1708y2.a("TimeSpentPacketSender: got database chunk, size = " + length + ", requested = " + this.f21460c);
        if (length != 0) {
            return a.a(a4);
        }
        throw new Exception("database chunk is empty, nothing to send");
    }

    void a(a aVar) {
        C1688t2[] b4 = aVar.b();
        int length = b4.length;
        long[] jArr = new long[length];
        for (int i4 = 0; i4 < b4.length; i4++) {
            jArr[i4] = b4[i4].a();
        }
        this.f21458a.a(jArr);
        AbstractC1708y2.a("TimeSpentPacketSender: successfully deleted " + length + " packets from repository");
    }

    public void c() {
        AbstractC1708y2.a("TimeSpentPacketSender: i'm notified about new packet");
        AbstractC1658m.e(new Runnable() { // from class: com.my.tracker.obfuscated.m3
            @Override // java.lang.Runnable
            public final void run() {
                C1665n2.this.a();
            }
        });
    }

    void a() {
        AbstractC1708y2.a("TimeSpentPacketSender: start flushing database chunk...");
        try {
            a b4 = b();
            b(b4);
            a(b4);
            AbstractC1708y2.a("TimeSpentPacketSender: database chunk successfully flushed");
        } catch (Exception e4) {
            AbstractC1708y2.b("TimeSpentPacketSender: Something went wrong while flushing database chunk:\n" + e4.getMessage());
        }
    }

    void b(a aVar) {
        MyTrackerConfig.OkHttpClientProvider n4 = this.f21459b.n();
        String p4 = this.f21459b.p();
        aVar.a(System.currentTimeMillis());
        if (AbstractC1708y2.a()) {
            AbstractC1708y2.a("TimeSpentPacketSender: This packet will be sent now:\n" + aVar);
        }
        if (!AbstractC1686t0.a(aVar, n4, true).a(p4).c()) {
            throw new Exception("packet didn't delivered to server");
        }
        AbstractC1708y2.a("TimeSpentPacketSender: packet successfully delivered to server");
    }

    public static C1665n2 a(int i4, C1712z2 c1712z2, InterfaceC1673p2 interfaceC1673p2) {
        return new C1665n2(i4, c1712z2, interfaceC1673p2);
    }
}
