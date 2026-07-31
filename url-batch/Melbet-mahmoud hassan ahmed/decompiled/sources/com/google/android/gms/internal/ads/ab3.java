package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes.dex */
final class ab3 {

    /* renamed from: a, reason: collision with root package name */
    private final AudioManager f2712a;

    /* renamed from: b, reason: collision with root package name */
    private final m83 f2713b;

    /* renamed from: c, reason: collision with root package name */
    private n93 f2714c;

    /* renamed from: d, reason: collision with root package name */
    private int f2715d;

    /* renamed from: e, reason: collision with root package name */
    private float f2716e = 1.0f;

    public ab3(Context context, Handler handler, n93 n93Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(audioManager);
        this.f2712a = audioManager;
        this.f2714c = n93Var;
        this.f2713b = new m83(this, handler);
        this.f2715d = 0;
    }

    static /* bridge */ /* synthetic */ void c(ab3 ab3Var, int i7) {
        if (i7 == -3 || i7 == -2) {
            if (i7 != -2) {
                ab3Var.g(3);
                return;
            } else {
                ab3Var.f(0);
                ab3Var.g(2);
                return;
            }
        }
        if (i7 == -1) {
            ab3Var.f(-1);
            ab3Var.e();
        } else if (i7 == 1) {
            ab3Var.g(1);
            ab3Var.f(1);
        } else {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown focus change type: ");
            sb.append(i7);
            Log.w("AudioFocusManager", sb.toString());
        }
    }

    private final void e() {
        if (this.f2715d == 0) {
            return;
        }
        if (n13.f8865a < 26) {
            this.f2712a.abandonAudioFocus(this.f2713b);
        }
        g(0);
    }

    private final void f(int i7) {
        int R;
        n93 n93Var = this.f2714c;
        if (n93Var != null) {
            dy3 dy3Var = (dy3) n93Var;
            boolean Q = dy3Var.f4398f.Q();
            gy3 gy3Var = dy3Var.f4398f;
            R = gy3.R(Q, i7);
            gy3Var.X(Q, i7, R);
        }
    }

    private final void g(int i7) {
        if (this.f2715d == i7) {
            return;
        }
        this.f2715d = i7;
        float f7 = i7 == 3 ? 0.2f : 1.0f;
        if (this.f2716e == f7) {
            return;
        }
        this.f2716e = f7;
        n93 n93Var = this.f2714c;
        if (n93Var != null) {
            ((dy3) n93Var).f4398f.V();
        }
    }

    public final float a() {
        return this.f2716e;
    }

    public final int b(boolean z6, int i7) {
        e();
        return z6 ? 1 : -1;
    }

    public final void d() {
        this.f2714c = null;
        e();
    }
}
