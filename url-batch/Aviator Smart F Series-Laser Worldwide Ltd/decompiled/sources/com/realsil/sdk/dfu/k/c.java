package com.realsil.sdk.dfu.k;

import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.model.BankInfo;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: e, reason: collision with root package name */
    public int f15987e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15989g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15990h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f15992j;

    /* renamed from: q, reason: collision with root package name */
    public int f15999q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f16000r;

    /* renamed from: y, reason: collision with root package name */
    public int f16007y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f16008z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f15983a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15984b = true;

    /* renamed from: c, reason: collision with root package name */
    public int f15985c = 3;

    /* renamed from: d, reason: collision with root package name */
    public int f15986d = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f15988f = 2;

    /* renamed from: i, reason: collision with root package name */
    public int f15991i = 1;

    /* renamed from: k, reason: collision with root package name */
    public int f15993k = 0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15994l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15995m = true;

    /* renamed from: n, reason: collision with root package name */
    public int f15996n = 256;

    /* renamed from: o, reason: collision with root package name */
    public int f15997o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f15998p = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f16001s = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f16005w = 1;

    /* renamed from: x, reason: collision with root package name */
    public int f16006x = -1;
    public int A = 0;
    public int B = 0;
    public int C = 0;
    public boolean D = false;
    public boolean E = true;
    public boolean F = false;
    public int G = 0;
    public boolean H = false;
    public boolean I = false;
    public boolean J = false;

    /* renamed from: t, reason: collision with root package name */
    public BankInfo f16002t = new BankInfo();

    /* renamed from: u, reason: collision with root package name */
    public BankInfo f16003u = new BankInfo();

    /* renamed from: v, reason: collision with root package name */
    public BankInfo f16004v = new BankInfo();

    public int a() {
        return this.f15991i;
    }

    public abstract boolean a(byte[] bArr, int i8);

    public int b() {
        return this.f16007y;
    }

    public int c() {
        return this.f16006x;
    }

    public int d() {
        return this.f15993k;
    }

    public int e() {
        return this.f16005w;
    }

    public boolean f() {
        return this.f15990h;
    }

    public boolean g() {
        return this.f16000r;
    }

    public boolean h() {
        return this.f15989g;
    }

    public boolean i() {
        return this.f15992j;
    }

    public void j() {
        if (this.f15998p == 0) {
            this.f16000r = false;
            return;
        }
        this.f16001s = 0;
        for (int i8 = 0; i8 < 16; i8++) {
            int i9 = (this.f15998p >> (i8 * 2)) & 3;
            if (i9 == 1) {
                if (this.f16001s == 0) {
                    this.f16001s = 2;
                }
            } else if (i9 == 2) {
                this.f16001s = 1;
            }
        }
        this.f16000r = this.f16001s != 0;
        if (this.f15984b) {
            ZLogger.v(String.format("imageVersionIndicator = 0x%08x, bankEnabled=%b, updateBankIndicator=0x%02X", Integer.valueOf(this.f15998p), Boolean.valueOf(this.f16000r), Integer.valueOf(this.f16001s)));
        }
    }

    public void k() {
        if (this.f16000r) {
            this.f16005w = 2;
            return;
        }
        if (this.f15993k != 1) {
            this.f16005w = 1;
        } else if (this.f15997o > 0) {
            this.f16005w = 3;
        } else {
            this.f16005w = 2;
        }
    }

    public void a(int i8) {
        this.f15988f = i8;
    }

    public boolean a(byte[] bArr) {
        return a(bArr, 0);
    }
}
