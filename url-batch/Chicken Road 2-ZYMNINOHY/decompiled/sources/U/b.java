package U;

import W.D;
import W.F;
import a0.ExecutorC0129E;
import a0.SurfaceHolderCallbackC0125A;
import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import y0.y;

/* loaded from: classes.dex */
public final class b implements y0.p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3017a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3018b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3019c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3020d;

    public b(y0.p pVar, V0.j jVar) {
        this.f3018b = pVar;
        this.f3019c = jVar;
        this.f3020d = new SparseArray();
    }

    public void a() {
        F f4 = (F) this.f3020d;
        if (this.f3017a) {
            f4.c(new R1.n(1, this));
            this.f3017a = false;
        }
    }

    @Override // y0.p
    public void r() {
        SparseArray sparseArray = (SparseArray) this.f3020d;
        ((y0.p) this.f3018b).r();
        if (this.f3017a) {
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                ((V0.n) sparseArray.valueAt(i4)).f3221i = true;
            }
        }
    }

    @Override // y0.p
    public void x(y yVar) {
        ((y0.p) this.f3018b).x(yVar);
    }

    @Override // y0.p
    public y0.F z(int i4, int i5) {
        SparseArray sparseArray = (SparseArray) this.f3020d;
        y0.p pVar = (y0.p) this.f3018b;
        if (i5 != 3) {
            this.f3017a = true;
            return pVar.z(i4, i5);
        }
        V0.n nVar = (V0.n) sparseArray.get(i4);
        if (nVar != null) {
            return nVar;
        }
        V0.n nVar2 = new V0.n(pVar.z(i4, i5), (V0.j) this.f3019c);
        sparseArray.put(i4, nVar2);
        return nVar2;
    }

    public b(Context context, Looper looper, Looper looper2, SurfaceHolderCallbackC0125A surfaceHolderCallbackC0125A, D d4) {
        this.f3018b = context.getApplicationContext();
        this.f3020d = d4.a(looper, null);
        this.f3019c = new a(this, d4.a(looper2, null), surfaceHolderCallbackC0125A);
    }

    public b(Context context, t0.r rVar, Boolean bool) {
        Spatializer spatializer;
        int immersiveAudioLevel;
        AudioManager j4 = context == null ? null : i.j(context);
        if (j4 != null && (bool == null || !bool.booleanValue())) {
            spatializer = j4.getSpatializer();
            this.f3018b = spatializer;
            immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
            this.f3017a = immersiveAudioLevel != 0;
            t0.m mVar = new t0.m(rVar);
            this.f3020d = mVar;
            Looper myLooper = Looper.myLooper();
            myLooper.getClass();
            Handler handler = new Handler(myLooper);
            this.f3019c = handler;
            spatializer.addOnSpatializerStateChangedListener(new ExecutorC0129E(1, handler), mVar);
            return;
        }
        this.f3018b = null;
        this.f3017a = false;
        this.f3019c = null;
        this.f3020d = null;
    }
}
