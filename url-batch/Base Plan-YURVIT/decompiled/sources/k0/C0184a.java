package k0;

import N.P;
import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.util.TypedValue;
import java.util.HashMap;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184a {

    /* renamed from: f, reason: collision with root package name */
    public static final Matrix f2663f = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.i f2664a;

    /* renamed from: b, reason: collision with root package name */
    public final P f2665b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2666c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f2667d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public int f2668e;

    public C0184a(io.flutter.embedding.engine.renderer.i iVar, boolean z2) {
        this.f2664a = iVar;
        if (P.f695h == null) {
            P.f695h = new P(13);
        }
        this.f2665b = P.f695h;
        this.f2666c = z2;
    }

    public static int b(int i2) {
        if (i2 == 0) {
            return 4;
        }
        if (i2 != 1) {
            if (i2 == 5) {
                return 4;
            }
            if (i2 != 6) {
                if (i2 == 2) {
                    return 5;
                }
                if (i2 != 7) {
                    if (i2 == 3) {
                        return 0;
                    }
                    if (i2 != 8) {
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
          (r11v7 int) from 0x00a6: IF  (r11v7 int) == (-1 int)  -> B:3:0x000d A[HIDDEN]
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
        throw new UnsupportedOperationException("Method not decompiled: k0.C0184a.a(android.view.MotionEvent, int, int, int, android.graphics.Matrix, java.nio.ByteBuffer, android.content.Context):void");
    }

    public final int c(Context context) {
        if (this.f2668e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.f2668e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f2668e;
    }
}
