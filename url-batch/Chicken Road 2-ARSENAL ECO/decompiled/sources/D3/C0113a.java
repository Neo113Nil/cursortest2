package D3;

import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.util.TypedValue;
import java.util.HashMap;
import u0.C0675e;

/* renamed from: D3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0113a {

    /* renamed from: f, reason: collision with root package name */
    public static final Matrix f407f = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.h f408a;

    /* renamed from: b, reason: collision with root package name */
    public final C0675e f409b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f410c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f411d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public int f412e;

    public C0113a(io.flutter.embedding.engine.renderer.h hVar, boolean z5) {
        this.f408a = hVar;
        if (C0675e.f5972d == null) {
            C0675e.f5972d = new C0675e(2);
        }
        this.f409b = C0675e.f5972d;
        this.f410c = z5;
    }

    public static int b(int i7) {
        if (i7 == 0) {
            return 4;
        }
        if (i7 != 1) {
            if (i7 == 5) {
                return 4;
            }
            if (i7 != 6) {
                if (i7 == 2) {
                    return 5;
                }
                if (i7 != 7) {
                    if (i7 == 3) {
                        return 0;
                    }
                    if (i7 != 8) {
                        return -1;
                    }
                }
                return 3;
            }
        }
        return 6;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v7 int, still in use, count: 2, list:
          (r11v7 int) from 0x00a6: IF  (r11v7 int) == (-1 int)  -> B:3:0x000d A[HIDDEN] (LINE:167)
          (r11v7 int) from 0x00ac: PHI (r11v2 int) = (r11v1 int), (r11v7 int) binds: [B:90:0x00aa, B:25:0x00a6] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:53)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        */
    public final void a(android.view.MotionEvent r29, int r30, int r31, int r32, android.graphics.Matrix r33, java.nio.ByteBuffer r34, android.content.Context r35) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.C0113a.a(android.view.MotionEvent, int, int, int, android.graphics.Matrix, java.nio.ByteBuffer, android.content.Context):void");
    }

    public final int c(Context context) {
        if (this.f412e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.f412e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f412e;
    }
}
