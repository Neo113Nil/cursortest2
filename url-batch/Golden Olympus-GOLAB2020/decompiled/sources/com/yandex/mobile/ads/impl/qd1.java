package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
final class qd1 {

    /* renamed from: a, reason: collision with root package name */
    public int f30740a;

    /* renamed from: b, reason: collision with root package name */
    public long f30741b;

    /* renamed from: c, reason: collision with root package name */
    public int f30742c;

    /* renamed from: d, reason: collision with root package name */
    public int f30743d;

    /* renamed from: e, reason: collision with root package name */
    public int f30744e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f30745f = new int[KotlinVersion.MAX_COMPONENT_VALUE];

    /* renamed from: g, reason: collision with root package name */
    private final sf1 f30746g = new sf1(KotlinVersion.MAX_COMPONENT_VALUE);

    qd1() {
    }

    public final boolean a(lz lzVar, boolean z4) {
        this.f30740a = 0;
        this.f30741b = 0L;
        this.f30742c = 0;
        this.f30743d = 0;
        this.f30744e = 0;
        this.f30746g.c(27);
        try {
            if (lzVar.b(this.f30746g.c(), 0, 27, z4) && this.f30746g.v() == 1332176723) {
                if (this.f30746g.t() != 0) {
                    if (z4) {
                        return false;
                    }
                    throw wf1.a("unsupported bit stream revision");
                }
                this.f30740a = this.f30746g.t();
                this.f30741b = this.f30746g.l();
                this.f30746g.n();
                this.f30746g.n();
                this.f30746g.n();
                int t4 = this.f30746g.t();
                this.f30742c = t4;
                this.f30743d = t4 + 27;
                this.f30746g.c(t4);
                try {
                    if (lzVar.b(this.f30746g.c(), 0, this.f30742c, z4)) {
                        for (int i4 = 0; i4 < this.f30742c; i4++) {
                            this.f30745f[i4] = this.f30746g.t();
                            this.f30744e += this.f30745f[i4];
                        }
                        return true;
                    }
                } catch (EOFException e4) {
                    if (!z4) {
                        throw e4;
                    }
                }
                return false;
            }
        } catch (EOFException e5) {
            if (!z4) {
                throw e5;
            }
        }
        return false;
    }

    public final boolean a(lz lzVar, long j4) {
        if (lzVar.a() == lzVar.d()) {
            this.f30746g.c(4);
            while (true) {
                if (j4 != -1 && lzVar.a() + 4 >= j4) {
                    break;
                }
                try {
                    if (!lzVar.b(this.f30746g.c(), 0, 4, true)) {
                        break;
                    }
                    this.f30746g.e(0);
                    if (this.f30746g.v() == 1332176723) {
                        lzVar.c();
                        return true;
                    }
                    lzVar.a(1);
                } catch (EOFException unused) {
                }
            }
            do {
                if (j4 != -1 && lzVar.a() >= j4) {
                    break;
                }
            } while (lzVar.c(1) != -1);
            return false;
        }
        throw new IllegalArgumentException();
    }
}
