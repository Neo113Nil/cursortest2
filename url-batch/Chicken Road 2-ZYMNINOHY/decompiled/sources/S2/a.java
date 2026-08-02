package S2;

import android.util.Log;
import android.view.Surface;
import com.mediadevkit.fvp.FvpPlugin;
import io.flutter.view.TextureRegistry;

/* loaded from: classes.dex */
public final class a implements TextureRegistry.SurfaceProducer.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f2597a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextureRegistry.SurfaceProducer f2598b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f2599c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f2602f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ FvpPlugin f2603g;

    public a(FvpPlugin fvpPlugin, long j4, TextureRegistry.SurfaceProducer surfaceProducer, long j5, int i4, int i5, boolean z) {
        this.f2603g = fvpPlugin;
        this.f2597a = j4;
        this.f2598b = surfaceProducer;
        this.f2599c = j5;
        this.f2600d = i4;
        this.f2601e = i5;
        this.f2602f = z;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer.Callback
    public final void onSurfaceAvailable() {
        StringBuilder sb = new StringBuilder("SurfaceProducer.onSurfaceAvailable for textureId ");
        long j4 = this.f2597a;
        sb.append(j4);
        Log.d("FvpPlugin", sb.toString());
        Surface surface = this.f2598b.getSurface();
        FvpPlugin fvpPlugin = this.f2603g;
        fvpPlugin.f6056d.put(Long.valueOf(j4), surface);
        fvpPlugin.nativeSetSurface(this.f2599c, this.f2597a, surface, this.f2600d, this.f2601e, this.f2602f);
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer.Callback
    public final void onSurfaceCleanup() {
        StringBuilder sb = new StringBuilder("SurfaceProducer.onSurfaceCleanup for textureId ");
        long j4 = this.f2597a;
        sb.append(j4);
        Log.d("FvpPlugin", sb.toString());
        FvpPlugin fvpPlugin = this.f2603g;
        fvpPlugin.f6055c.remove(Long.valueOf(j4));
        fvpPlugin.nativeSetSurface(this.f2599c, this.f2597a, null, 0, 0, this.f2602f);
    }
}
