package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.b9;
import com.yandex.mobile.ads.impl.iv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class dz implements iv {

    /* renamed from: a, reason: collision with root package name */
    private final Context f24998a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f24999b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final iv f25000c;

    /* renamed from: d, reason: collision with root package name */
    private wa0 f25001d;

    /* renamed from: e, reason: collision with root package name */
    private C1903eg f25002e;

    /* renamed from: f, reason: collision with root package name */
    private qr f25003f;

    /* renamed from: g, reason: collision with root package name */
    private iv f25004g;

    /* renamed from: h, reason: collision with root package name */
    private o72 f25005h;

    /* renamed from: i, reason: collision with root package name */
    private gv f25006i;

    /* renamed from: j, reason: collision with root package name */
    private mn1 f25007j;

    /* renamed from: k, reason: collision with root package name */
    private iv f25008k;

    public static final class a implements iv.a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f25009a;

        /* renamed from: b, reason: collision with root package name */
        private final iv.a f25010b;

        public a(Context context, iv.a aVar) {
            this.f25009a = context.getApplicationContext();
            this.f25010b = aVar;
        }

        @Override // com.yandex.mobile.ads.impl.iv.a
        public final iv a() {
            return new dz(this.f25009a, this.f25010b.a());
        }
    }

    public dz(Context context, iv ivVar) {
        this.f24998a = context.getApplicationContext();
        this.f25000c = (iv) C2253tf.a(ivVar);
    }

    private void a(iv ivVar) {
        for (int i4 = 0; i4 < this.f24999b.size(); i4++) {
            ivVar.a((s62) this.f24999b.get(i4));
        }
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final void close() {
        iv ivVar = this.f25008k;
        if (ivVar != null) {
            try {
                ivVar.close();
            } finally {
                this.f25008k = null;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final Map<String, List<String>> getResponseHeaders() {
        iv ivVar = this.f25008k;
        return ivVar == null ? Collections.EMPTY_MAP : ivVar.getResponseHeaders();
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final Uri getUri() {
        iv ivVar = this.f25008k;
        if (ivVar == null) {
            return null;
        }
        return ivVar.getUri();
    }

    @Override // com.yandex.mobile.ads.impl.fv
    public final int read(byte[] bArr, int i4, int i5) {
        iv ivVar = this.f25008k;
        ivVar.getClass();
        return ivVar.read(bArr, i4, i5);
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final void a(s62 s62Var) {
        s62Var.getClass();
        this.f25000c.a(s62Var);
        this.f24999b.add(s62Var);
        wa0 wa0Var = this.f25001d;
        if (wa0Var != null) {
            wa0Var.a(s62Var);
        }
        C1903eg c1903eg = this.f25002e;
        if (c1903eg != null) {
            c1903eg.a(s62Var);
        }
        qr qrVar = this.f25003f;
        if (qrVar != null) {
            qrVar.a(s62Var);
        }
        iv ivVar = this.f25004g;
        if (ivVar != null) {
            ivVar.a(s62Var);
        }
        o72 o72Var = this.f25005h;
        if (o72Var != null) {
            o72Var.a(s62Var);
        }
        gv gvVar = this.f25006i;
        if (gvVar != null) {
            gvVar.a(s62Var);
        }
        mn1 mn1Var = this.f25007j;
        if (mn1Var != null) {
            mn1Var.a(s62Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.iv
    public final long a(mv mvVar) {
        if (this.f25008k == null) {
            String scheme = mvVar.f29239a.getScheme();
            Uri uri = mvVar.f29239a;
            int i4 = u82.f32873a;
            String scheme2 = uri.getScheme();
            if (!TextUtils.isEmpty(scheme2) && !b9.h.f15468b.equals(scheme2)) {
                if ("asset".equals(scheme)) {
                    if (this.f25002e == null) {
                        C1903eg c1903eg = new C1903eg(this.f24998a);
                        this.f25002e = c1903eg;
                        a(c1903eg);
                    }
                    this.f25008k = this.f25002e;
                } else if (FirebaseAnalytics.Param.CONTENT.equals(scheme)) {
                    if (this.f25003f == null) {
                        qr qrVar = new qr(this.f24998a);
                        this.f25003f = qrVar;
                        a(qrVar);
                    }
                    this.f25008k = this.f25003f;
                } else if ("rtmp".equals(scheme)) {
                    if (this.f25004g == null) {
                        try {
                            iv ivVar = (iv) Class.forName("com.monetization.ads.exo.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.f25004g = ivVar;
                            a(ivVar);
                        } catch (ClassNotFoundException unused) {
                            ms0.d("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e4) {
                            throw new RuntimeException("Error instantiating RTMP extension", e4);
                        }
                        if (this.f25004g == null) {
                            this.f25004g = this.f25000c;
                        }
                    }
                    this.f25008k = this.f25004g;
                } else if ("udp".equals(scheme)) {
                    if (this.f25005h == null) {
                        o72 o72Var = new o72(0);
                        this.f25005h = o72Var;
                        a(o72Var);
                    }
                    this.f25008k = this.f25005h;
                } else if ("data".equals(scheme)) {
                    if (this.f25006i == null) {
                        gv gvVar = new gv();
                        this.f25006i = gvVar;
                        a(gvVar);
                    }
                    this.f25008k = this.f25006i;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.f25008k = this.f25000c;
                } else {
                    if (this.f25007j == null) {
                        mn1 mn1Var = new mn1(this.f24998a);
                        this.f25007j = mn1Var;
                        a(mn1Var);
                    }
                    this.f25008k = this.f25007j;
                }
            } else {
                String path = mvVar.f29239a.getPath();
                if (path != null && path.startsWith("/android_asset/")) {
                    if (this.f25002e == null) {
                        C1903eg c1903eg2 = new C1903eg(this.f24998a);
                        this.f25002e = c1903eg2;
                        a(c1903eg2);
                    }
                    this.f25008k = this.f25002e;
                } else {
                    if (this.f25001d == null) {
                        wa0 wa0Var = new wa0();
                        this.f25001d = wa0Var;
                        a(wa0Var);
                    }
                    this.f25008k = this.f25001d;
                }
            }
            return this.f25008k.a(mvVar);
        }
        throw new IllegalStateException();
    }
}
