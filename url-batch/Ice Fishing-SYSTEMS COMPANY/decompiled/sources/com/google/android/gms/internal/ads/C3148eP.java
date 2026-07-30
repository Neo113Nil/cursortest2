package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import b0.C0521a;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.eP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3148eP {

    /* renamed from: a, reason: collision with root package name */
    public final Object f30348a;

    /* renamed from: b, reason: collision with root package name */
    public Object f30349b;

    /* renamed from: c, reason: collision with root package name */
    public Object f30350c;

    /* renamed from: d, reason: collision with root package name */
    public int f30351d;

    /* renamed from: e, reason: collision with root package name */
    public int f30352e;

    /* renamed from: f, reason: collision with root package name */
    public int f30353f;

    public /* synthetic */ C3148eP(C3148eP c3148eP) {
        this.f30348a = (TP) c3148eP.f30348a;
        this.f30349b = (C2777Sj) c3148eP.f30349b;
        this.f30350c = (AudioDeviceInfo) c3148eP.f30350c;
        this.f30351d = c3148eP.f30351d;
        this.f30352e = c3148eP.f30352e;
        this.f30353f = c3148eP.f30353f;
    }

    public void a() {
        this.f30351d = 1;
        this.f30349b = (androidx.emoji2.text.r) this.f30348a;
        this.f30353f = 0;
    }

    public boolean b() {
        C0521a b9 = ((androidx.emoji2.text.r) this.f30349b).f4910b.b();
        int a9 = b9.a(6);
        return !(a9 == 0 || ((ByteBuffer) b9.f2231w).get(a9 + b9.f2228n) == 0) || this.f30352e == 65039;
    }

    public C3148eP(TP tp) {
        this.f30348a = tp;
        this.f30349b = C2777Sj.f27609b;
        this.f30351d = 0;
        this.f30352e = -1;
        this.f30353f = -1;
    }

    public C3148eP(androidx.emoji2.text.r rVar) {
        this.f30351d = 1;
        this.f30348a = rVar;
        this.f30349b = rVar;
    }
}
