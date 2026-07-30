package com.anythink.basead.ui.improveclick;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    protected Context f11295d;

    /* renamed from: e, reason: collision with root package name */
    protected w f11296e;

    /* renamed from: f, reason: collision with root package name */
    protected x f11297f;

    /* renamed from: g, reason: collision with root package name */
    protected ViewGroup f11298g;

    /* renamed from: h, reason: collision with root package name */
    protected int f11299h;
    RelativeLayout i;

    /* renamed from: j, reason: collision with root package name */
    View f11300j;

    /* renamed from: k, reason: collision with root package name */
    protected a f11301k;

    public interface a {
        void a(int i, int i4);
    }

    public interface b extends a {
        void a();

        void a(long j9);

        void b();
    }

    public abstract void a();

    public abstract void a(int i, Map<String, Object> map);

    public void a(Context context, w wVar, x xVar, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i, a aVar) {
        this.f11295d = context;
        this.f11296e = wVar;
        this.f11297f = xVar;
        this.f11298g = viewGroup;
        this.f11299h = i;
        this.f11301k = aVar;
        this.i = relativeLayout;
        this.f11300j = view;
    }

    public static boolean a(Map<String, Object> map) {
        Object obj;
        if (map == null || (obj = map.get("key_has_endcard_improve")) == null || !(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }
}
