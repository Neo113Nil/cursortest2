package com.baidu.platform.comapi.h.s;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.baidu.mapapi.map.MapView;
import com.baidu.platform.comapi.h.n.f;

/* loaded from: classes2.dex */
public abstract class b extends com.baidu.platform.comapi.walknavi.a implements com.baidu.platform.comapi.h.m.a, com.baidu.platform.comapi.h.m.c, com.baidu.platform.comapi.h.f.a, f {
    public void a(Context context, View view, int i8, int i9, int i10, int i11) {
        if (view == null || !(view instanceof MapView)) {
            return;
        }
        ((MapView) view).getMap().setViewPadding(a(context, i8), a(context, i9), a(context, i10), a(context, i11));
    }

    public abstract void a(com.baidu.platform.comapi.walknavi.k.f.a aVar);

    public abstract void a(String str);

    public abstract void a(boolean z7);

    public abstract void b();

    public abstract void c();

    public abstract void c(int i8);

    public abstract void d(int i8);

    public abstract boolean d();

    public abstract void e();

    public abstract int f();

    public abstract int g();

    public abstract View h();

    public abstract float i();

    public abstract int j();

    public abstract int k();

    public abstract Handler l();

    public abstract int m();

    public abstract void n();

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    private int a(Context context, int i8) {
        return (int) ((context.getResources().getDisplayMetrics().density * i8) + 0.5f);
    }
}
