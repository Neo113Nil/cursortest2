package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.b60;
import com.yandex.mobile.ads.impl.iv;
import com.yandex.mobile.ads.impl.mv;
import com.yandex.mobile.ads.impl.nz;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class eh0 implements jv0 {

    /* renamed from: a, reason: collision with root package name */
    private final iv.a f25297a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25298b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f25299c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f25300d;

    public eh0(String str, boolean z4, nz.a aVar) {
        C2253tf.a((z4 && TextUtils.isEmpty(str)) ? false : true);
        this.f25297a = aVar;
        this.f25298b = str;
        this.f25299c = z4;
        this.f25300d = new HashMap();
    }

    public final byte[] a(UUID uuid, b60.a aVar) {
        String b4 = aVar.b();
        if (this.f25299c || TextUtils.isEmpty(b4)) {
            b4 = this.f25298b;
        }
        if (TextUtils.isEmpty(b4)) {
            mv.a aVar2 = new mv.a();
            Uri uri = Uri.EMPTY;
            throw new kv0(aVar2.a(uri).a(), uri, tj0.g(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = C1813am.f23362e;
        hashMap.put(com.ironsource.cc.f15718K, uuid2.equals(uuid) ? "text/xml" : C1813am.f23360c.equals(uuid) ? com.ironsource.cc.f15719L : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f25300d) {
            hashMap.putAll(this.f25300d);
        }
        return a(this.f25297a, b4, aVar.a(), hashMap);
    }

    public final byte[] a(b60.d dVar) {
        return a(this.f25297a, dVar.b() + "&signedRequest=" + u82.a(dVar.a()), null, Collections.EMPTY_MAP);
    }

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        synchronized (this.f25300d) {
            this.f25300d.put(str, str2);
        }
    }

    private static byte[] a(iv.a aVar, String str, byte[] bArr, Map<String, String> map) {
        Map<String, List<String>> map2;
        List<String> list;
        h22 h22Var = new h22(aVar.a());
        mv a4 = new mv.a().b(str).a(map).b().a(bArr).a(1).a();
        int i4 = 0;
        int i5 = 0;
        mv mvVar = a4;
        while (true) {
            try {
                kv kvVar = new kv(h22Var, mvVar);
                try {
                    int i6 = u82.f32873a;
                    byte[] bArr2 = new byte[Base64Utils.IO_BUFFER_SIZE];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int read = kvVar.read(bArr2);
                        if (read != -1) {
                            byteArrayOutputStream.write(bArr2, i4, read);
                        } else {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            u82.a((Closeable) kvVar);
                            return byteArray;
                        }
                    }
                } catch (zg0 e4) {
                    try {
                        int i7 = e4.f35589e;
                        String str2 = ((i7 != 307 && i7 != 308) || i5 >= 5 || (map2 = e4.f35590f) == null || (list = map2.get("Location")) == null || list.isEmpty()) ? null : list.get(i4);
                        if (str2 != null) {
                            i5++;
                            mvVar = mvVar.a().b(str2).a();
                            u82.a((Closeable) kvVar);
                        } else {
                            throw e4;
                        }
                    } catch (Throwable th) {
                        u82.a((Closeable) kvVar);
                        throw th;
                    }
                }
            } catch (Exception e5) {
                Uri f4 = h22Var.f();
                f4.getClass();
                throw new kv0(a4, f4, h22Var.getResponseHeaders(), h22Var.e(), e5);
            }
        }
    }
}
