package com.baidu.platform.comapi.map.d0.f;

import android.util.Pair;
import android.view.MotionEvent;
import com.baidu.platform.comapi.map.MapController;
import com.baidu.platform.comapi.map.d0.a;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected MapController f9638a;

    public a(MapController mapController) {
        this.f9638a = mapController;
    }

    public void a(com.baidu.platform.comapi.map.d0.e.b bVar) {
    }

    public abstract void a(com.baidu.platform.comapi.map.d0.e.b bVar, Pair<a.d, a.d> pair);

    public abstract void a(com.baidu.platform.comapi.map.d0.e.b bVar, MotionEvent motionEvent);
}
