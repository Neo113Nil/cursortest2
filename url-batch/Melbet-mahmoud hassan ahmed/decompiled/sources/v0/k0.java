package v0;

import android.annotation.SuppressLint;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import s0.u1;
import v0.g0;
import v0.m;

/* loaded from: classes.dex */
public final class k0 implements g0 {

    /* renamed from: d, reason: collision with root package name */
    public static final g0.c f22668d = new g0.c() { // from class: v0.j0
        @Override // v0.g0.c
        public final g0 a(UUID uuid) {
            g0 A;
            A = k0.A(uuid);
            return A;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final UUID f22669a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaDrm f22670b;

    /* renamed from: c, reason: collision with root package name */
    private int f22671c;

    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, u1 u1Var) {
            LogSessionId a7 = u1Var.a();
            if (a7.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            ((MediaDrm.PlaybackComponent) o2.a.e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(a7);
        }
    }

    private k0(UUID uuid) {
        o2.a.e(uuid);
        o2.a.b(!r0.j.f20684b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f22669a = uuid;
        MediaDrm mediaDrm = new MediaDrm(u(uuid));
        this.f22670b = mediaDrm;
        this.f22671c = 1;
        if (r0.j.f20686d.equals(uuid) && B()) {
            w(mediaDrm);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g0 A(UUID uuid) {
        try {
            return C(uuid);
        } catch (p0 unused) {
            o2.r.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new d0();
        }
    }

    private static boolean B() {
        return "ASUS_Z00AD".equals(o2.m0.f19755d);
    }

    public static k0 C(UUID uuid) {
        try {
            return new k0(uuid);
        } catch (UnsupportedSchemeException e7) {
            throw new p0(1, e7);
        } catch (Exception e8) {
            throw new p0(2, e8);
        }
    }

    private static byte[] q(byte[] bArr) {
        o2.a0 a0Var = new o2.a0(bArr);
        int p7 = a0Var.p();
        short r7 = a0Var.r();
        short r8 = a0Var.r();
        if (r7 != 1 || r8 != 1) {
            o2.r.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short r9 = a0Var.r();
        Charset charset = l4.d.f18616e;
        String A = a0Var.A(r9, charset);
        if (A.contains("<LA_URL>")) {
            return bArr;
        }
        int indexOf = A.indexOf("</DATA>");
        if (indexOf == -1) {
            o2.r.i("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = A.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + A.substring(indexOf);
        int i7 = p7 + 52;
        ByteBuffer allocate = ByteBuffer.allocate(i7);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(i7);
        allocate.putShort(r7);
        allocate.putShort(r8);
        allocate.putShort((short) (str.length() * 2));
        allocate.put(str.getBytes(charset));
        return allocate.array();
    }

    private static byte[] r(UUID uuid, byte[] bArr) {
        return r0.j.f20685c.equals(uuid) ? v0.a.a(bArr) : bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if ("AFTT".equals(r0) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] s(UUID uuid, byte[] bArr) {
        UUID uuid2 = r0.j.f20687e;
        if (uuid2.equals(uuid)) {
            byte[] e7 = e1.l.e(bArr, uuid);
            if (e7 != null) {
                bArr = e7;
            }
            bArr = e1.l.a(uuid2, q(bArr));
        }
        if (o2.m0.f19752a >= 23 || !r0.j.f20686d.equals(uuid)) {
            if (uuid2.equals(uuid) && "Amazon".equals(o2.m0.f19754c)) {
                String str = o2.m0.f19755d;
                if (!"AFTB".equals(str)) {
                    if (!"AFTS".equals(str)) {
                        if (!"AFTM".equals(str)) {
                        }
                    }
                }
            }
        }
        byte[] e8 = e1.l.e(bArr, uuid);
        return e8 != null ? e8 : bArr;
    }

    private static String t(UUID uuid, String str) {
        return (o2.m0.f19752a < 26 && r0.j.f20685c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    private static UUID u(UUID uuid) {
        return (o2.m0.f19752a >= 27 || !r0.j.f20685c.equals(uuid)) ? uuid : r0.j.f20684b;
    }

    private static void w(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static m.b y(UUID uuid, List<m.b> list) {
        boolean z6;
        if (r0.j.f20686d.equals(uuid)) {
            if (o2.m0.f19752a >= 28 && list.size() > 1) {
                m.b bVar = list.get(0);
                int i7 = 0;
                for (int i8 = 0; i8 < list.size(); i8++) {
                    m.b bVar2 = list.get(i8);
                    byte[] bArr = (byte[]) o2.a.e(bVar2.f22689j);
                    if (!o2.m0.c(bVar2.f22688i, bVar.f22688i) || !o2.m0.c(bVar2.f22687h, bVar.f22687h) || !e1.l.c(bArr)) {
                        z6 = false;
                        break;
                    }
                    i7 += bArr.length;
                }
                z6 = true;
                if (z6) {
                    byte[] bArr2 = new byte[i7];
                    int i9 = 0;
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        byte[] bArr3 = (byte[]) o2.a.e(list.get(i10).f22689j);
                        int length = bArr3.length;
                        System.arraycopy(bArr3, 0, bArr2, i9, length);
                        i9 += length;
                    }
                    return bVar.c(bArr2);
                }
            }
            for (int i11 = 0; i11 < list.size(); i11++) {
                m.b bVar3 = list.get(i11);
                int g7 = e1.l.g((byte[]) o2.a.e(bVar3.f22689j));
                int i12 = o2.m0.f19752a;
                if (i12 < 23 && g7 == 0) {
                    return bVar3;
                }
                if (i12 >= 23 && g7 == 1) {
                    return bVar3;
                }
            }
        }
        return list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(g0.b bVar, MediaDrm mediaDrm, byte[] bArr, int i7, int i8, byte[] bArr2) {
        bVar.a(this, bArr, i7, i8, bArr2);
    }

    @Override // v0.g0
    public synchronized void a() {
        int i7 = this.f22671c - 1;
        this.f22671c = i7;
        if (i7 == 0) {
            this.f22670b.release();
        }
    }

    @Override // v0.g0
    public void b(byte[] bArr, u1 u1Var) {
        if (o2.m0.f19752a >= 31) {
            try {
                a.b(this.f22670b, bArr, u1Var);
            } catch (UnsupportedOperationException unused) {
                o2.r.i("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // v0.g0
    public void c(final g0.b bVar) {
        this.f22670b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: v0.i0
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i7, int i8, byte[] bArr2) {
                k0.this.z(bVar, mediaDrm, bArr, i7, i8, bArr2);
            }
        });
    }

    @Override // v0.g0
    public boolean d(byte[] bArr, String str) {
        if (o2.m0.f19752a >= 31) {
            return a.a(this.f22670b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f22669a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // v0.g0
    public void e(byte[] bArr, byte[] bArr2) {
        this.f22670b.restoreKeys(bArr, bArr2);
    }

    @Override // v0.g0
    public Map<String, String> f(byte[] bArr) {
        return this.f22670b.queryKeyStatus(bArr);
    }

    @Override // v0.g0
    public void g(byte[] bArr) {
        this.f22670b.closeSession(bArr);
    }

    @Override // v0.g0
    public byte[] h(byte[] bArr, byte[] bArr2) {
        if (r0.j.f20685c.equals(this.f22669a)) {
            bArr2 = v0.a.b(bArr2);
        }
        return this.f22670b.provideKeyResponse(bArr, bArr2);
    }

    @Override // v0.g0
    public g0.d i() {
        MediaDrm.ProvisionRequest provisionRequest = this.f22670b.getProvisionRequest();
        return new g0.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // v0.g0
    public void j(byte[] bArr) {
        this.f22670b.provideProvisionResponse(bArr);
    }

    @Override // v0.g0
    @SuppressLint({"WrongConstant"})
    public g0.a k(byte[] bArr, List<m.b> list, int i7, HashMap<String, String> hashMap) {
        byte[] bArr2;
        String str;
        m.b bVar = null;
        if (list != null) {
            bVar = y(this.f22669a, list);
            bArr2 = s(this.f22669a, (byte[]) o2.a.e(bVar.f22689j));
            str = t(this.f22669a, bVar.f22688i);
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f22670b.getKeyRequest(bArr, bArr2, str, i7, hashMap);
        byte[] r7 = r(this.f22669a, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && bVar != null && !TextUtils.isEmpty(bVar.f22687h)) {
            defaultUrl = bVar.f22687h;
        }
        return new g0.a(r7, defaultUrl, o2.m0.f19752a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // v0.g0
    public int l() {
        return 2;
    }

    @Override // v0.g0
    public byte[] n() {
        return this.f22670b.openSession();
    }

    @Override // v0.g0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public h0 m(byte[] bArr) {
        return new h0(u(this.f22669a), bArr, o2.m0.f19752a < 21 && r0.j.f20686d.equals(this.f22669a) && "L3".equals(x("securityLevel")));
    }

    public String x(String str) {
        return this.f22670b.getPropertyString(str);
    }
}
