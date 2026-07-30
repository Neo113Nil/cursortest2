package h4;

import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.util.TypedValue;
import android.view.MotionEvent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;

/* renamed from: h4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0486a {

    /* renamed from: f, reason: collision with root package name */
    public static final Matrix f5182f = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.j f5183a;

    /* renamed from: b, reason: collision with root package name */
    public final P0.c f5184b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5185c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f5186d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public int f5187e;

    public C0486a(io.flutter.embedding.engine.renderer.j jVar, boolean z7) {
        this.f5183a = jVar;
        if (P0.c.f2186l == null) {
            P0.c.f2186l = new P0.c(7);
        }
        this.f5184b = P0.c.f2186l;
        this.f5185c = z7;
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
        throw new UnsupportedOperationException("Method not decompiled: h4.C0486a.a(android.view.MotionEvent, int, int, int, android.graphics.Matrix, java.nio.ByteBuffer, android.content.Context):void");
    }

    public final int c(Context context) {
        if (this.f5187e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.f5187e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f5187e;
    }

    public final void d(MotionEvent motionEvent, Matrix matrix) {
        int actionMasked = motionEvent.getActionMasked();
        int b7 = b(motionEvent.getActionMasked());
        char c7 = 5;
        boolean z7 = actionMasked == 0 || actionMasked == 5;
        boolean z8 = !z7 && (actionMasked == 1 || actionMasked == 6);
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        if (toolType == 1) {
            c7 = 0;
        } else if (toolType == 2) {
            c7 = 2;
        } else if (toolType == 3) {
            c7 = 1;
        } else if (toolType == 4) {
            c7 = 3;
        }
        int i2 = (z8 && c7 == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((pointerCount + i2) * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z7) {
            a(motionEvent, motionEvent.getActionIndex(), b7, 0, matrix, allocateDirect, null);
        } else if (z8) {
            for (int i5 = 0; i5 < pointerCount; i5++) {
                if (i5 != motionEvent.getActionIndex() && motionEvent.getToolType(i5) == 1) {
                    a(motionEvent, i5, 5, 1, matrix, allocateDirect, null);
                }
            }
            a(motionEvent, motionEvent.getActionIndex(), b7, 0, matrix, allocateDirect, null);
            if (i2 != 0) {
                a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, allocateDirect, null);
            }
        } else {
            for (int i7 = 0; i7 < pointerCount; i7++) {
                a(motionEvent, i7, b7, (pointerCount << 8) | 2, matrix, allocateDirect, null);
            }
        }
        if (allocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        this.f5183a.f5598a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
    }
}
