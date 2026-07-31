package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.u30;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public interface b60 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f23603a;

        /* renamed from: b, reason: collision with root package name */
        private final String f23604b;

        public a(String str, byte[] bArr) {
            this.f23603a = bArr;
            this.f23604b = str;
        }

        public final byte[] a() {
            return this.f23603a;
        }

        public final String b() {
            return this.f23604b;
        }
    }

    public interface b {
    }

    public interface c {
        b60 a(UUID uuid);
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f23605a;

        /* renamed from: b, reason: collision with root package name */
        private final String f23606b;

        public d(String str, byte[] bArr) {
            this.f23605a = bArr;
            this.f23606b = str;
        }

        public final byte[] a() {
            return this.f23605a;
        }

        public final String b() {
            return this.f23606b;
        }
    }

    a a(byte[] bArr, List<u30.b> list, int i4, HashMap<String, String> hashMap);

    d a();

    Map<String, String> a(byte[] bArr);

    void a(b bVar);

    default void a(byte[] bArr, ei1 ei1Var) {
    }

    void a(byte[] bArr, byte[] bArr2);

    boolean a(String str, byte[] bArr);

    int b();

    void b(byte[] bArr);

    byte[] b(byte[] bArr, byte[] bArr2);

    void c(byte[] bArr);

    byte[] c();

    su d(byte[] bArr);

    void release();
}
