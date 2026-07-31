package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import android.util.Base64;
import com.yandex.mobile.ads.impl.b60;
import com.yandex.mobile.ads.impl.hz;
import com.yandex.mobile.ads.impl.u30;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final class hc0 implements b60 {

    /* renamed from: d, reason: collision with root package name */
    private static final ic0 f26702d = hm1.b();

    /* renamed from: e, reason: collision with root package name */
    public static final b60.c f26703e = new b60.c() { // from class: com.yandex.mobile.ads.impl.E6
        @Override // com.yandex.mobile.ads.impl.b60.c
        public final b60 a(UUID uuid) {
            b60 b4;
            b4 = hc0.b(uuid);
            return b4;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final UUID f26704a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaDrm f26705b;

    /* renamed from: c, reason: collision with root package name */
    private int f26706c;

    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            boolean requiresSecureDecoder;
            requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str);
            return requiresSecureDecoder;
        }

        public static void a(MediaDrm mediaDrm, byte[] bArr, ei1 ei1Var) {
            LogSessionId logSessionId;
            boolean equals;
            MediaDrm.PlaybackComponent playbackComponent;
            LogSessionId a4 = ei1Var.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = a4.equals(logSessionId);
            if (equals) {
                return;
            }
            playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            playbackComponent.setLogSessionId(a4);
        }
    }

    private hc0(UUID uuid) {
        C2253tf.a(uuid);
        C2253tf.a("Use C.CLEARKEY_UUID instead", !C1813am.f23359b.equals(uuid));
        this.f26704a = uuid;
        MediaDrm mediaDrm = new MediaDrm(a(uuid));
        this.f26705b = mediaDrm;
        this.f26706c = 1;
        if (C1813am.f23361d.equals(uuid) && d()) {
            a(mediaDrm);
        }
    }

    private static void a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    @Override // com.yandex.mobile.ads.impl.b60
    public final int b() {
        return 2;
    }

    @Override // com.yandex.mobile.ads.impl.b60
    public final byte[] c() {
        return this.f26705b.openSession();
    }

    @Override // com.yandex.mobile.ads.impl.b60
    public final synchronized void release() {
        int i4 = this.f26706c - 1;
        this.f26706c = i4;
        if (i4 == 0) {
            this.f26705b.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0206, code lost:
    
        if (new java.lang.String(r4, r9).equals(r6) != false) goto L81;
     */
    @Override // com.yandex.mobile.ads.impl.b60
    @SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b60.a a(byte[] bArr, List<u30.b> list, int i4, HashMap<String, String> hashMap) {
        u30.b bVar;
        byte[] bArr2;
        String str;
        String str2;
        if (list != null) {
            if (C1813am.f23361d.equals(this.f26704a)) {
                if (u82.f32873a >= 28 && list.size() > 1) {
                    u30.b bVar2 = list.get(0);
                    int i5 = 0;
                    for (int i6 = 0; i6 < list.size(); i6++) {
                        u30.b bVar3 = list.get(i6);
                        byte[] bArr3 = bVar3.f32806f;
                        bArr3.getClass();
                        if (u82.a(bVar3.f32805e, bVar2.f32805e) && u82.a(bVar3.f32804d, bVar2.f32804d) && tm1.a(bArr3)) {
                            i5 += bArr3.length;
                        }
                    }
                    byte[] bArr4 = new byte[i5];
                    int i7 = 0;
                    for (int i8 = 0; i8 < list.size(); i8++) {
                        byte[] bArr5 = list.get(i8).f32806f;
                        bArr5.getClass();
                        int length = bArr5.length;
                        System.arraycopy(bArr5, 0, bArr4, i7, length);
                        i7 += length;
                    }
                    bVar = new u30.b(bVar2.f32803c, bVar2.f32804d, bVar2.f32805e, bArr4);
                }
                for (int i9 = 0; i9 < list.size(); i9++) {
                    u30.b bVar4 = list.get(i9);
                    byte[] bArr6 = bVar4.f32806f;
                    bArr6.getClass();
                    int d4 = tm1.d(bArr6);
                    int i10 = u82.f32873a;
                    if ((i10 < 23 && d4 == 0) || (i10 >= 23 && d4 == 1)) {
                        bVar = bVar4;
                        break;
                    }
                }
                bVar = list.get(0);
            } else {
                bVar = list.get(0);
            }
            UUID uuid = this.f26704a;
            byte[] bArr7 = bVar.f32806f;
            bArr7.getClass();
            UUID uuid2 = C1813am.f23362e;
            if (uuid2.equals(uuid)) {
                byte[] a4 = tm1.a(uuid, bArr7);
                if (a4 != null) {
                    bArr7 = a4;
                }
                sf1 sf1Var = new sf1(bArr7);
                int k4 = sf1Var.k();
                short m4 = sf1Var.m();
                short m5 = sf1Var.m();
                if (m4 == 1 && m5 == 1) {
                    short m6 = sf1Var.m();
                    Charset charset = un.f33184d;
                    String a5 = sf1Var.a(m6, charset);
                    if (!a5.contains("<LA_URL>")) {
                        int indexOf = a5.indexOf("</DATA>");
                        if (indexOf == -1) {
                            ms0.d("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str3 = a5.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + a5.substring(indexOf);
                        int i11 = k4 + 52;
                        ByteBuffer allocate = ByteBuffer.allocate(i11);
                        allocate.order(ByteOrder.LITTLE_ENDIAN);
                        allocate.putInt(i11);
                        allocate.putShort(m4);
                        allocate.putShort(m5);
                        allocate.putShort((short) (str3.length() * 2));
                        allocate.put(str3.getBytes(charset));
                        bArr7 = allocate.array();
                    }
                } else {
                    ms0.c("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                int length2 = (bArr7 != null ? bArr7.length : 0) + 32;
                ByteBuffer allocate2 = ByteBuffer.allocate(length2);
                allocate2.putInt(length2);
                allocate2.putInt(1886614376);
                allocate2.putInt(0);
                allocate2.putLong(uuid2.getMostSignificantBits());
                allocate2.putLong(uuid2.getLeastSignificantBits());
                if (bArr7 != null && bArr7.length != 0) {
                    allocate2.putInt(bArr7.length);
                    allocate2.put(bArr7);
                }
                bArr7 = allocate2.array();
            }
            int i12 = u82.f32873a;
            if (i12 >= 23 || !C1813am.f23361d.equals(uuid)) {
                if (uuid2.equals(uuid)) {
                    f26702d.getClass();
                    byte[] decode = Base64.decode("QW1hem9u", 0);
                    Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
                    Charset charset2 = Charsets.UTF_8;
                    if (new String(decode, charset2).equals(u82.f32875c)) {
                        byte[] decode2 = Base64.decode("QUZUQg==", 0);
                        Intrinsics.checkNotNullExpressionValue(decode2, "decode(...)");
                        String str4 = new String(decode2, charset2);
                        String str5 = u82.f32876d;
                        if (!str4.equals(str5)) {
                            byte[] decode3 = Base64.decode("QUZUUw==", 0);
                            Intrinsics.checkNotNullExpressionValue(decode3, "decode(...)");
                            if (!new String(decode3, charset2).equals(str5)) {
                                byte[] decode4 = Base64.decode("QUZUTQ==", 0);
                                Intrinsics.checkNotNullExpressionValue(decode4, "decode(...)");
                                if (!new String(decode4, charset2).equals(str5)) {
                                    byte[] decode5 = Base64.decode("QUZUVA==", 0);
                                    Intrinsics.checkNotNullExpressionValue(decode5, "decode(...)");
                                }
                            }
                        }
                    }
                }
                UUID uuid3 = this.f26704a;
                str2 = bVar.f32805e;
                if (i12 < 26 && C1813am.f23360c.equals(uuid3) && ("video/mp4".equals(str2) || "audio/mp4".equals(str2))) {
                    str2 = "cenc";
                }
                byte[] bArr8 = bArr7;
                str = str2;
                bArr2 = bArr8;
            }
            byte[] a6 = tm1.a(uuid, bArr7);
            if (a6 != null) {
                bArr7 = a6;
            }
            UUID uuid32 = this.f26704a;
            str2 = bVar.f32805e;
            if (i12 < 26) {
                str2 = "cenc";
            }
            byte[] bArr82 = bArr7;
            str = str2;
            bArr2 = bArr82;
        } else {
            bVar = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f26705b.getKeyRequest(bArr, bArr2, str, i4, hashMap);
        UUID uuid4 = this.f26704a;
        byte[] data = keyRequest.getData();
        if (C1813am.f23360c.equals(uuid4) && u82.f32873a < 27) {
            Charset charset3 = un.f33183c;
            data = new String(data, charset3).replace('+', '-').replace('/', '_').getBytes(charset3);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && bVar != null && !TextUtils.isEmpty(bVar.f32804d)) {
            defaultUrl = bVar.f32804d;
        }
        if (u82.f32873a >= 23) {
            keyRequest.getRequestType();
        }
        return new b60.a(defaultUrl, data);
    }

    @Override // com.yandex.mobile.ads.impl.b60
    public final void b(byte[] bArr) {
        this.f26705b.closeSession(bArr);
    }

    @Override // com.yandex.mobile.ads.impl.b60
    public final void c(byte[] bArr) {
        this.f26705b.provideProvisionResponse(bArr);
    }

    @Override // com.yandex.mobile.ads.impl.b60
    public final su d(byte[] bArr) {
        return new gc0(a(this.f26704a), bArr, u82.f32873a < 21 && C1813am.f23361d.equals(this.f26704a) && "L3".equals(this.f26705b.getPropertyString("securityLevel")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b60 b(UUID uuid) {
        try {
            return c(uuid);
        } catch (a82 unused) {
            ms0.b("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new e40();
        }
    }

    public static hc0 c(UUID uuid) {
        try {
            return new hc0(uuid);
        } catch (UnsupportedSchemeException e4) {
            throw new a82(e4);
        } catch (Exception e5) {
            throw new a82(e5);
        }
    }

    @Override // com.yandex.mobile.ads.impl.b60
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (C1813am.f23360c.equals(this.f26704a)) {
            bArr2 = zn.a(bArr2);
        }
        return this.f26705b.provideKeyResponse(bArr, bArr2);
    }

    private static boolean d() {
        return f26702d.a().equals(u82.f32876d);
    }

    @Override // com.yandex.mobile.ads.impl.b60
    public final b60.d a() {
        MediaDrm.ProvisionRequest provisionRequest = this.f26705b.getProvisionRequest();
        return new b60.d(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b60.b bVar, MediaDrm mediaDrm, byte[] bArr, int i4, int i5, byte[] bArr2) {
        hz.c cVar = hz.this.f27010y;
        cVar.getClass();
        cVar.obtainMessage(i4, bArr).sendToTarget();
    }

    @Override // com.yandex.mobile.ads.impl.b60
    public final Map<String, String> a(byte[] bArr) {
        return this.f26705b.queryKeyStatus(bArr);
    }

    @Override // com.yandex.mobile.ads.impl.b60
    public final void a(byte[] bArr, byte[] bArr2) {
        this.f26705b.restoreKeys(bArr, bArr2);
    }

    @Override // com.yandex.mobile.ads.impl.b60
    public final void a(final b60.b bVar) {
        this.f26705b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: com.yandex.mobile.ads.impl.F6
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i4, int i5, byte[] bArr2) {
                hc0.this.a(bVar, mediaDrm, bArr, i4, i5, bArr2);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.b60
    public final void a(byte[] bArr, ei1 ei1Var) {
        if (u82.f32873a >= 31) {
            try {
                a.a(this.f26705b, bArr, ei1Var);
            } catch (UnsupportedOperationException unused) {
                ms0.d("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.b60
    public final boolean a(String str, byte[] bArr) {
        if (u82.f32873a >= 31) {
            return a.a(this.f26705b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f26704a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    private static UUID a(UUID uuid) {
        return (u82.f32873a >= 27 || !C1813am.f23360c.equals(uuid)) ? uuid : C1813am.f23359b;
    }
}
