package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.u4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3990u4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34528a = 2;

    /* renamed from: b, reason: collision with root package name */
    public boolean f34529b;

    /* renamed from: c, reason: collision with root package name */
    public int f34530c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f34531d;

    /* renamed from: e, reason: collision with root package name */
    public int f34532e;

    /* renamed from: f, reason: collision with root package name */
    public Object f34533f;

    public C3990u4(C4280zO c4280zO) {
        this.f34533f = c4280zO;
    }

    public void a() {
        this.f34532e = this.f34529b ? ((androidx.emoji2.text.g) this.f34533f).g() : ((androidx.emoji2.text.g) this.f34533f).k();
    }

    public void b(int i, View view) {
        if (this.f34529b) {
            int b9 = ((androidx.emoji2.text.g) this.f34533f).b(view);
            androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f34533f;
            this.f34532e = (Integer.MIN_VALUE == gVar.f4883a ? 0 : gVar.l() - gVar.f4883a) + b9;
        } else {
            this.f34532e = ((androidx.emoji2.text.g) this.f34533f).e(view);
        }
        this.f34530c = i;
    }

    public void c(int i, View view) {
        androidx.emoji2.text.g gVar = (androidx.emoji2.text.g) this.f34533f;
        int l9 = Integer.MIN_VALUE == gVar.f4883a ? 0 : gVar.l() - gVar.f4883a;
        if (l9 >= 0) {
            b(i, view);
            return;
        }
        this.f34530c = i;
        if (!this.f34529b) {
            int e6 = ((androidx.emoji2.text.g) this.f34533f).e(view);
            int k6 = e6 - ((androidx.emoji2.text.g) this.f34533f).k();
            this.f34532e = e6;
            if (k6 > 0) {
                int g9 = (((androidx.emoji2.text.g) this.f34533f).g() - Math.min(0, (((androidx.emoji2.text.g) this.f34533f).g() - l9) - ((androidx.emoji2.text.g) this.f34533f).b(view))) - (((androidx.emoji2.text.g) this.f34533f).c(view) + e6);
                if (g9 < 0) {
                    this.f34532e -= Math.min(k6, -g9);
                    return;
                }
                return;
            }
            return;
        }
        int g10 = (((androidx.emoji2.text.g) this.f34533f).g() - l9) - ((androidx.emoji2.text.g) this.f34533f).b(view);
        this.f34532e = ((androidx.emoji2.text.g) this.f34533f).g() - g10;
        if (g10 > 0) {
            int c4 = this.f34532e - ((androidx.emoji2.text.g) this.f34533f).c(view);
            int k9 = ((androidx.emoji2.text.g) this.f34533f).k();
            int min = c4 - (Math.min(((androidx.emoji2.text.g) this.f34533f).e(view) - k9, 0) + k9);
            if (min < 0) {
                this.f34532e = Math.min(g10, -min) + this.f34532e;
            }
        }
    }

    public void d() {
        this.f34530c = -1;
        this.f34532e = Integer.MIN_VALUE;
        this.f34529b = false;
        this.f34531d = false;
    }

    public void e() {
        this.f34529b = false;
        this.f34531d = false;
    }

    public void f(int i) {
        this.f34529b = 1 == ((this.f34529b ? 1 : 0) | i);
        this.f34530c += i;
    }

    public void g(int i) {
        PA.T(!this.f34529b);
        boolean z8 = i == this.f34530c;
        this.f34529b = z8;
        if (z8) {
            this.f34532e = 3;
            this.f34531d = false;
        }
    }

    public void h(byte[] bArr, int i, int i4) {
        if (this.f34529b) {
            int i9 = i4 - i;
            byte[] bArr2 = (byte[]) this.f34533f;
            int length = bArr2.length;
            int i10 = this.f34532e + i9;
            if (length < i10) {
                this.f34533f = Arrays.copyOf(bArr2, i10 + i10);
            }
            System.arraycopy(bArr, i, (byte[]) this.f34533f, this.f34532e, i9);
            this.f34532e += i9;
        }
    }

    public boolean i(int i) {
        if (!this.f34529b) {
            return false;
        }
        this.f34532e -= i;
        this.f34529b = false;
        this.f34531d = true;
        return true;
    }

    public String toString() {
        switch (this.f34528a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.f34530c + ", mCoordinate=" + this.f34532e + ", mLayoutFromEnd=" + this.f34529b + ", mValid=" + this.f34531d + '}';
            default:
                return super.toString();
        }
    }

    public C3990u4(int i) {
        this.f34530c = i;
        byte[] bArr = new byte[com.anythink.expressad.video.module.a.a.f21890V];
        this.f34533f = bArr;
        bArr[2] = 1;
    }

    public C3990u4() {
        d();
    }
}
