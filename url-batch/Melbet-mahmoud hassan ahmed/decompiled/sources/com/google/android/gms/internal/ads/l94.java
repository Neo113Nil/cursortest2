package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l94 implements he1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7877a;

    /* renamed from: b, reason: collision with root package name */
    private final List<vt1> f7878b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final he1 f7879c;

    /* renamed from: d, reason: collision with root package name */
    private he1 f7880d;

    /* renamed from: e, reason: collision with root package name */
    private he1 f7881e;

    /* renamed from: f, reason: collision with root package name */
    private he1 f7882f;

    /* renamed from: g, reason: collision with root package name */
    private he1 f7883g;

    /* renamed from: h, reason: collision with root package name */
    private he1 f7884h;

    /* renamed from: i, reason: collision with root package name */
    private he1 f7885i;

    /* renamed from: j, reason: collision with root package name */
    private he1 f7886j;

    /* renamed from: k, reason: collision with root package name */
    private he1 f7887k;

    public l94(Context context, he1 he1Var) {
        this.f7877a = context.getApplicationContext();
        this.f7879c = he1Var;
    }

    private final he1 o() {
        if (this.f7881e == null) {
            u84 u84Var = new u84(this.f7877a);
            this.f7881e = u84Var;
            p(u84Var);
        }
        return this.f7881e;
    }

    private final void p(he1 he1Var) {
        for (int i7 = 0; i7 < this.f7878b.size(); i7++) {
            he1Var.j(this.f7878b.get(i7));
        }
    }

    private static final void q(he1 he1Var, vt1 vt1Var) {
        if (he1Var != null) {
            he1Var.j(vt1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.fc1
    public final int a(byte[] bArr, int i7, int i8) {
        he1 he1Var = this.f7887k;
        Objects.requireNonNull(he1Var);
        return he1Var.a(bArr, i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final Uri h() {
        he1 he1Var = this.f7887k;
        if (he1Var == null) {
            return null;
        }
        return he1Var.h();
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final void i() {
        he1 he1Var = this.f7887k;
        if (he1Var != null) {
            try {
                he1Var.i();
            } finally {
                this.f7887k = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final void j(vt1 vt1Var) {
        Objects.requireNonNull(vt1Var);
        this.f7879c.j(vt1Var);
        this.f7878b.add(vt1Var);
        q(this.f7880d, vt1Var);
        q(this.f7881e, vt1Var);
        q(this.f7882f, vt1Var);
        q(this.f7883g, vt1Var);
        q(this.f7884h, vt1Var);
        q(this.f7885i, vt1Var);
        q(this.f7886j, vt1Var);
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final long k(li1 li1Var) {
        he1 he1Var;
        wu1.f(this.f7887k == null);
        String scheme = li1Var.f7985a.getScheme();
        if (n13.s(li1Var.f7985a)) {
            String path = li1Var.f7985a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f7880d == null) {
                    p94 p94Var = new p94();
                    this.f7880d = p94Var;
                    p(p94Var);
                }
                he1Var = this.f7880d;
                this.f7887k = he1Var;
                return this.f7887k.k(li1Var);
            }
            he1Var = o();
            this.f7887k = he1Var;
            return this.f7887k.k(li1Var);
        }
        if (!"asset".equals(scheme)) {
            if ("content".equals(scheme)) {
                if (this.f7882f == null) {
                    e94 e94Var = new e94(this.f7877a);
                    this.f7882f = e94Var;
                    p(e94Var);
                }
                he1Var = this.f7882f;
            } else if ("rtmp".equals(scheme)) {
                if (this.f7883g == null) {
                    try {
                        he1 he1Var2 = (he1) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.f7883g = he1Var2;
                        p(he1Var2);
                    } catch (ClassNotFoundException unused) {
                        Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e7) {
                        throw new RuntimeException("Error instantiating RTMP extension", e7);
                    }
                    if (this.f7883g == null) {
                        this.f7883g = this.f7879c;
                    }
                }
                he1Var = this.f7883g;
            } else if ("udp".equals(scheme)) {
                if (this.f7884h == null) {
                    ka4 ka4Var = new ka4(2000);
                    this.f7884h = ka4Var;
                    p(ka4Var);
                }
                he1Var = this.f7884h;
            } else if ("data".equals(scheme)) {
                if (this.f7885i == null) {
                    f94 f94Var = new f94();
                    this.f7885i = f94Var;
                    p(f94Var);
                }
                he1Var = this.f7885i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f7886j == null) {
                    ca4 ca4Var = new ca4(this.f7877a);
                    this.f7886j = ca4Var;
                    p(ca4Var);
                }
                he1Var = this.f7886j;
            } else {
                he1Var = this.f7879c;
            }
            this.f7887k = he1Var;
            return this.f7887k.k(li1Var);
        }
        he1Var = o();
        this.f7887k = he1Var;
        return this.f7887k.k(li1Var);
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final Map<String, List<String>> zza() {
        he1 he1Var = this.f7887k;
        return he1Var == null ? Collections.emptyMap() : he1Var.zza();
    }
}
