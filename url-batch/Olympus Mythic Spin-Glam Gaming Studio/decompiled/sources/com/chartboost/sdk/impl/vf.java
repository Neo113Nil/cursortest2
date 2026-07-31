package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class vf {
    public zf a;
    public final boolean b;
    public final long c;

    public float a(boolean z) {
        return 1.0f;
    }

    public abstract Object a(Context context, Continuation continuation);

    public void a(float f, boolean z) {
    }

    public abstract void a(h7 h7Var, v5 v5Var);

    public abstract void a(nh nhVar);

    public abstract void a(boolean z, Integer num, Integer num2, i4 i4Var);

    public Bitmap g() {
        return null;
    }

    public abstract View k();

    public void l() {
    }

    public void m() {
    }

    public void n() {
    }

    public void o() {
    }

    public final zf j() {
        return this.a;
    }

    public boolean i() {
        return this.b;
    }

    public long h() {
        return this.c;
    }

    public static /* synthetic */ float a(vf vfVar, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mute");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return vfVar.a(z);
    }

    public final void a(zf zfVar) {
        this.a = zfVar;
    }

    public void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void a(vf vfVar, boolean z, Integer num, Integer num2, i4 i4Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackClick");
        }
        if ((i & 8) != 0) {
            i4Var = null;
        }
        vfVar.a(z, num, num2, i4Var);
    }

    public static /* synthetic */ void a(vf vfVar, h7 h7Var, v5 v5Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackEngagement");
        }
        if ((i & 2) != 0) {
            v5Var = null;
        }
        vfVar.a(h7Var, v5Var);
    }

    public static /* synthetic */ void a(vf vfVar, float f, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unmute");
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        vfVar.a(f, z);
    }
}
