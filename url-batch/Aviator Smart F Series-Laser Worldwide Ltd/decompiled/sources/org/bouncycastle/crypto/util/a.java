package org.bouncycastle.crypto.util;

import com.google.android.exoplayer2.RendererCapabilities;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class a {
    private static final Map cloneMap;

    /* renamed from: org.bouncycastle.crypto.util.a$a, reason: collision with other inner class name */
    static class C0389a implements m {
        C0389a() {
        }

        @Override // org.bouncycastle.crypto.util.a.m
        public org.bouncycastle.crypto.e createClone(org.bouncycastle.crypto.e eVar) {
            return new org.bouncycastle.crypto.digests.j((org.bouncycastle.crypto.digests.j) eVar);
        }
    }

    static class b implements m {
        b() {
        }

        @Override // org.bouncycastle.crypto.util.a.m
        public org.bouncycastle.crypto.e createClone(org.bouncycastle.crypto.e eVar) {
            return new org.bouncycastle.crypto.digests.m((org.bouncycastle.crypto.digests.m) eVar);
        }
    }

    static class c implements m {
        c() {
        }

        @Override // org.bouncycastle.crypto.util.a.m
        public org.bouncycastle.crypto.e createClone(org.bouncycastle.crypto.e eVar) {
            return new org.bouncycastle.crypto.digests.m((org.bouncycastle.crypto.digests.m) eVar);
        }
    }

    static class d implements m {
        d() {
        }

        @Override // org.bouncycastle.crypto.util.a.m
        public org.bouncycastle.crypto.e createClone(org.bouncycastle.crypto.e eVar) {
            return new org.bouncycastle.crypto.digests.e((org.bouncycastle.crypto.digests.e) eVar);
        }
    }

    static class e implements m {
        e() {
        }

        @Override // org.bouncycastle.crypto.util.a.m
        public org.bouncycastle.crypto.e createClone(org.bouncycastle.crypto.e eVar) {
            return new org.bouncycastle.crypto.digests.e((org.bouncycastle.crypto.digests.e) eVar);
        }
    }

    static class f implements m {
        f() {
        }

        @Override // org.bouncycastle.crypto.util.a.m
        public org.bouncycastle.crypto.e createClone(org.bouncycastle.crypto.e eVar) {
            return new org.bouncycastle.crypto.digests.g((org.bouncycastle.crypto.digests.g) eVar);
        }
    }

    static class g implements m {
        g() {
        }

        @Override // org.bouncycastle.crypto.util.a.m
        public org.bouncycastle.crypto.e createClone(org.bouncycastle.crypto.e eVar) {
            return new org.bouncycastle.crypto.digests.h((org.bouncycastle.crypto.digests.h) eVar);
        }
    }

    static class h implements m {
        h() {
        }

        @Override // org.bouncycastle.crypto.util.a.m
        public org.bouncycastle.crypto.e createClone(org.bouncycastle.crypto.e eVar) {
            return new org.bouncycastle.crypto.digests.i((org.bouncycastle.crypto.digests.i) eVar);
        }
    }

    static class i implements m {
        i() {
        }

        @Override // org.bouncycastle.crypto.util.a.m
        public org.bouncycastle.crypto.e createClone(org.bouncycastle.crypto.e eVar) {
            return new org.bouncycastle.crypto.digests.k((org.bouncycastle.crypto.digests.k) eVar);
        }
    }

    static class j implements m {
        j() {
        }

        @Override // org.bouncycastle.crypto.util.a.m
        public org.bouncycastle.crypto.e createClone(org.bouncycastle.crypto.e eVar) {
            return new org.bouncycastle.crypto.digests.j((org.bouncycastle.crypto.digests.j) eVar);
        }
    }

    static class k implements m {
        k() {
        }

        @Override // org.bouncycastle.crypto.util.a.m
        public org.bouncycastle.crypto.e createClone(org.bouncycastle.crypto.e eVar) {
            return new org.bouncycastle.crypto.digests.j((org.bouncycastle.crypto.digests.j) eVar);
        }
    }

    static class l implements m {
        l() {
        }

        @Override // org.bouncycastle.crypto.util.a.m
        public org.bouncycastle.crypto.e createClone(org.bouncycastle.crypto.e eVar) {
            return new org.bouncycastle.crypto.digests.j((org.bouncycastle.crypto.digests.j) eVar);
        }
    }

    private interface m {
        org.bouncycastle.crypto.e createClone(org.bouncycastle.crypto.e eVar);
    }

    static {
        HashMap hashMap = new HashMap();
        cloneMap = hashMap;
        hashMap.put(createMD5().getAlgorithmName(), new d());
        hashMap.put(createSHA1().getAlgorithmName(), new e());
        hashMap.put(createSHA224().getAlgorithmName(), new f());
        hashMap.put(createSHA256().getAlgorithmName(), new g());
        hashMap.put(createSHA384().getAlgorithmName(), new h());
        hashMap.put(createSHA512().getAlgorithmName(), new i());
        hashMap.put(createSHA3_224().getAlgorithmName(), new j());
        hashMap.put(createSHA3_256().getAlgorithmName(), new k());
        hashMap.put(createSHA3_384().getAlgorithmName(), new l());
        hashMap.put(createSHA3_512().getAlgorithmName(), new C0389a());
        hashMap.put(createSHAKE128().getAlgorithmName(), new b());
        hashMap.put(createSHAKE256().getAlgorithmName(), new c());
    }

    public static org.bouncycastle.crypto.e cloneDigest(org.bouncycastle.crypto.e eVar) {
        return ((m) cloneMap.get(eVar.getAlgorithmName())).createClone(eVar);
    }

    public static org.bouncycastle.crypto.e createMD5() {
        return new org.bouncycastle.crypto.digests.e();
    }

    public static org.bouncycastle.crypto.e createSHA1() {
        return new org.bouncycastle.crypto.digests.f();
    }

    public static org.bouncycastle.crypto.e createSHA224() {
        return new org.bouncycastle.crypto.digests.g();
    }

    public static org.bouncycastle.crypto.e createSHA256() {
        return new org.bouncycastle.crypto.digests.h();
    }

    public static org.bouncycastle.crypto.e createSHA384() {
        return new org.bouncycastle.crypto.digests.i();
    }

    public static org.bouncycastle.crypto.e createSHA3_224() {
        return new org.bouncycastle.crypto.digests.j(224);
    }

    public static org.bouncycastle.crypto.e createSHA3_256() {
        return new org.bouncycastle.crypto.digests.j(256);
    }

    public static org.bouncycastle.crypto.e createSHA3_384() {
        return new org.bouncycastle.crypto.digests.j(RendererCapabilities.MODE_SUPPORT_MASK);
    }

    public static org.bouncycastle.crypto.e createSHA3_512() {
        return new org.bouncycastle.crypto.digests.j(512);
    }

    public static org.bouncycastle.crypto.e createSHA512() {
        return new org.bouncycastle.crypto.digests.k();
    }

    public static org.bouncycastle.crypto.e createSHA512_224() {
        return new org.bouncycastle.crypto.digests.l(224);
    }

    public static org.bouncycastle.crypto.e createSHA512_256() {
        return new org.bouncycastle.crypto.digests.l(256);
    }

    public static org.bouncycastle.crypto.e createSHAKE128() {
        return new org.bouncycastle.crypto.digests.m(128);
    }

    public static org.bouncycastle.crypto.e createSHAKE256() {
        return new org.bouncycastle.crypto.digests.m(256);
    }
}
