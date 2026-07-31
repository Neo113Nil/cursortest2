package f1;

import android.content.Context;
import android.os.Build;
import com.snovikpovik.vuevnxsj.R;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f implements x {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2637f = true;

    /* renamed from: a, reason: collision with root package name */
    public final x1.t f2638a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2639b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public j1.b f2640c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2641d;

    /* renamed from: e, reason: collision with root package name */
    public final d f2642e;

    public f(x1.t tVar) {
        this.f2638a = tVar;
        d dVar = new d(this);
        this.f2642e = dVar;
        if (tVar.isAttachedToWindow()) {
            Context context = tVar.getContext();
            if (!this.f2641d) {
                context.getApplicationContext().registerComponentCallbacks(dVar);
                this.f2641d = true;
            }
        }
        tVar.addOnAttachStateChangeListener(new e(0, this));
    }

    @Override // f1.x
    public final void a(i1.b bVar) {
        synchronized (this.f2639b) {
            if (!bVar.f3311s) {
                bVar.f3311s = true;
                bVar.b();
            }
        }
    }

    @Override // f1.x
    public final i1.b b() {
        i1.d iVar;
        i1.b bVar;
        synchronized (this.f2639b) {
            try {
                x1.t tVar = this.f2638a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    tVar.getUniqueDrawingId();
                }
                if (i >= 29) {
                    iVar = new i1.g();
                } else if (f2637f) {
                    try {
                        iVar = new i1.e(this.f2638a, new r(), new h1.b());
                    } catch (Throwable unused) {
                        f2637f = false;
                        iVar = new i1.i(c(this.f2638a));
                    }
                } else {
                    iVar = new i1.i(c(this.f2638a));
                }
                bVar = new i1.b(iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public final j1.a c(x1.t tVar) {
        j1.b bVar = this.f2640c;
        if (bVar != null) {
            return bVar;
        }
        j1.b bVar2 = new j1.b(tVar.getContext());
        bVar2.setClipChildren(false);
        bVar2.setClipToPadding(false);
        bVar2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        tVar.addView(bVar2, -1);
        this.f2640c = bVar2;
        return bVar2;
    }
}
