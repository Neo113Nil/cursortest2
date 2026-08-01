package d2;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.appsflyer.R;
import com.google.android.gms.internal.measurement.se;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b0 extends o3.b implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final s.v Y;
    public final s.w A;
    public final s.w B;
    public final s.s0 C;
    public final s.s0 D;
    public int E;
    public Integer F;
    public final s.f G;
    public final ie.c H;
    public boolean I;
    public x J;
    public s.w K;
    public final s.x L;
    public final s.u M;
    public final s.u N;
    public final String O;
    public final String P;
    public final p.e Q;
    public final s.w R;
    public v1 S;
    public boolean T;
    public final s.u U;
    public final androidx.lifecycle.d0 V;
    public final ArrayList W;
    public final a0 X;

    /* renamed from: r, reason: collision with root package name */
    public final v f3338r;

    /* renamed from: s, reason: collision with root package name */
    public int f3339s = Integer.MIN_VALUE;

    /* renamed from: t, reason: collision with root package name */
    public final a0 f3340t = new a0(this, 0);

    /* renamed from: u, reason: collision with root package name */
    public final AccessibilityManager f3341u;

    /* renamed from: v, reason: collision with root package name */
    public long f3342v;

    /* renamed from: w, reason: collision with root package name */
    public List f3343w;

    /* renamed from: x, reason: collision with root package name */
    public final w f3344x;

    /* renamed from: y, reason: collision with root package name */
    public int f3345y;

    /* renamed from: z, reason: collision with root package name */
    public int f3346z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        int i3 = s.j.f8324a;
        s.v vVar = new s.v(32);
        int i10 = vVar.f8390b;
        if (i10 < 0) {
            kotlin.collections.i0.g("");
            return;
        }
        int i11 = i10 + 32;
        int[] iArr2 = vVar.f8389a;
        if (iArr2.length < i11) {
            vVar.f8389a = Arrays.copyOf(iArr2, Math.max(i11, (iArr2.length * 3) / 2));
        }
        int[] iArr3 = vVar.f8389a;
        int i12 = vVar.f8390b;
        if (i10 != i12) {
            kotlin.collections.v.c(i11, i10, i12, iArr3, iArr3);
        }
        kotlin.collections.v.f(i10, 0, 12, iArr, iArr3);
        vVar.f8390b += 32;
        Y = vVar;
    }

    public b0(v vVar) {
        this.f3338r = vVar;
        Object systemService = vVar.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.f3341u = (AccessibilityManager) systemService;
        this.f3342v = 100L;
        new Handler(Looper.getMainLooper());
        this.f3344x = new w(this);
        this.f3345y = Integer.MIN_VALUE;
        this.f3346z = Integer.MIN_VALUE;
        this.A = new s.w();
        this.B = new s.w();
        this.C = new s.s0(0);
        this.D = new s.s0(0);
        this.E = -1;
        this.G = new s.f(0);
        this.H = ie.j.a(1, 6, null);
        this.I = true;
        s.w wVar = s.l.f8343a;
        wVar.getClass();
        this.K = wVar;
        this.L = new s.x();
        this.M = new s.u();
        this.N = new s.u();
        this.O = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.P = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.Q = new p.e(12);
        this.R = new s.w();
        this.S = new v1(vVar.getSemanticsOwner().a(), wVar);
        int i3 = s.i.f8318a;
        this.U = new s.u();
        vVar.addOnAttachStateChangeListener(this);
        this.V = new androidx.lifecycle.d0(11, this);
        this.W = new ArrayList();
        this.X = new a0(this, 1);
    }

    public static Rect B(k1.v vVar, float f3, float f10) {
        if (!(vVar instanceof k1.z) && !(vVar instanceof k1.a0)) {
            return null;
        }
        j1.c i3 = vVar.i();
        return new Rect((int) (i3.f4916a + f3), (int) (i3.f4917b + f10), (int) (i3.f4918c + f3), (int) (i3.f4919d + f10));
    }

    public static float[] D(k1.v vVar) {
        if (!(vVar instanceof k1.a0)) {
            return null;
        }
        j1.d dVar = ((k1.a0) vVar).f5295f;
        long j = dVar.f4926h;
        long j3 = dVar.g;
        long j10 = dVar.f4925f;
        long j11 = dVar.f4924e;
        return new float[]{Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region E(k1.v vVar, float f3, float f10) {
        if (!(vVar instanceof k1.y)) {
            return null;
        }
        k1.y yVar = (k1.y) vVar;
        j1.c d10 = yVar.i().d(f3, f10);
        Region region = new Region(new Rect((int) (d10.f4916a + 0.0f), (int) (d10.f4917b + 0.0f), (int) (d10.f4918c + 0.0f), (int) (d10.f4919d + 0.0f)));
        Region region2 = new Region();
        k1.g gVar = yVar.f5356f;
        if (!(gVar instanceof k1.g)) {
            a2.r.r("Unable to obtain android.graphics.Path");
            return null;
        }
        Path path = gVar.f5321a;
        path.offset(f3, f10);
        region2.setPath(path, region);
        return region2;
    }

    public static CharSequence F(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i3 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i3 = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i3);
                subSequence.getClass();
                return subSequence;
            }
        }
        return charSequence;
    }

    public static String n(j2.m mVar) {
        m2.e eVar;
        if (mVar != null) {
            j2.j jVar = mVar.f4983d;
            s.h0 h0Var = jVar.f4975d;
            j2.t tVar = j2.q.f4993a;
            if (h0Var.c(tVar)) {
                return z2.a.a((List) jVar.e(tVar), ",", null, 62);
            }
            j2.t tVar2 = j2.q.E;
            if (h0Var.c(tVar2)) {
                Object g = h0Var.g(tVar2);
                if (g == null) {
                    g = null;
                }
                m2.e eVar2 = (m2.e) g;
                if (eVar2 != null) {
                    return eVar2.f6454e;
                }
            } else {
                Object g2 = h0Var.g(j2.q.A);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                if (list != null && (eVar = (m2.e) CollectionsKt.firstOrNull(list)) != null) {
                    return eVar.f6454e;
                }
            }
        }
        return null;
    }

    public static /* synthetic */ void v(b0 b0Var, int i3, int i10, Integer num, int i11) {
        if ((i11 & 4) != 0) {
            num = null;
        }
        b0Var.u(i3, i10, num, null);
    }

    public final boolean A(j2.m mVar, int i3, int i10, boolean z10) {
        String n10;
        j2.j jVar = mVar.f4983d;
        int i11 = mVar.f4985f;
        j2.t tVar = j2.i.f4958i;
        if (jVar.f4975d.c(tVar) && h0.b(mVar)) {
            vd.n nVar = (vd.n) ((j2.a) mVar.f4983d.e(tVar)).f4929b;
            if (nVar != null) {
                return ((Boolean) nVar.a(Integer.valueOf(i3), Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
            }
        } else if ((i3 != i10 || i10 != this.E) && (n10 = n(mVar)) != null) {
            if (i3 < 0 || i3 != i10 || i10 > n10.length()) {
                i3 = -1;
            }
            this.E = i3;
            boolean z11 = n10.length() > 0;
            t(j(r(i11), z11 ? Integer.valueOf(this.E) : null, z11 ? Integer.valueOf(this.E) : null, z11 ? Integer.valueOf(n10.length()) : null, n10));
            x(i11);
            return true;
        }
        return false;
    }

    public final Rect C(float f3, float f10, float f11, float f12) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
        v vVar = this.f3338r;
        long v10 = vVar.v(floatToRawIntBits);
        long v11 = vVar.v((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
        int i3 = (int) (v10 >> 32);
        int i10 = (int) (v11 >> 32);
        int i11 = (int) (v10 & 4294967295L);
        int i12 = (int) (v11 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i10))), (int) Math.floor(Math.min(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i10))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G() {
        long j;
        long j3;
        long j10;
        char c10;
        long[] jArr;
        long[] jArr2;
        long j11;
        int i3;
        int i10;
        int i11;
        char c11;
        s.x xVar = new s.x();
        s.x xVar2 = this.L;
        int[] iArr = xVar2.f8393b;
        long[] jArr3 = xVar2.f8392a;
        int length = jArr3.length - 2;
        s.w wVar = this.R;
        int i12 = 8;
        if (length >= 0) {
            int i13 = 0;
            j = 128;
            j3 = 255;
            while (true) {
                long j12 = jArr3[i13];
                char c12 = 7;
                j10 = -9187201950435737472L;
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j12 & 255) < 128) {
                            int i16 = iArr[(i13 << 3) + i15];
                            c11 = c12;
                            j2.n nVar = (j2.n) m().b(i16);
                            j2.m mVar = nVar != null ? nVar.f4986a : null;
                            if (mVar != null) {
                                if (mVar.f4983d.f4975d.c(j2.q.f4996d)) {
                                }
                            }
                            xVar.a(i16);
                            v1 v1Var = (v1) wVar.b(i16);
                            if (v1Var != null) {
                                Object g = v1Var.f3586a.f4975d.g(j2.q.f4996d);
                                r23 = g != 0 ? g : null;
                            }
                            w(r23, i16, 32);
                        } else {
                            c11 = c12;
                        }
                        j12 >>= 8;
                        i15++;
                        c12 = c11;
                    }
                    c10 = c12;
                    if (i14 != 8) {
                        break;
                    }
                } else {
                    c10 = 7;
                }
                if (i13 == length) {
                    break;
                } else {
                    i13++;
                }
            }
        } else {
            j = 128;
            j3 = 255;
            j10 = -9187201950435737472L;
            c10 = 7;
        }
        int[] iArr2 = xVar.f8393b;
        long[] jArr4 = xVar.f8392a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i17 = 0;
            while (true) {
                long j13 = jArr4[i17];
                if ((((~j13) << c10) & j13 & j10) != j10) {
                    int i18 = 8 - ((~(i17 - length2)) >>> 31);
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j13 & j3) < j) {
                            int i20 = iArr2[(i17 << 3) + i19];
                            int hashCode = Integer.hashCode(i20) * (-862048943);
                            int i21 = hashCode ^ (hashCode << 16);
                            int i22 = i21 & 127;
                            int i23 = xVar2.f8394c;
                            int i24 = (i21 >>> 7) & i23;
                            i3 = i12;
                            int i25 = 0;
                            while (true) {
                                long[] jArr5 = xVar2.f8392a;
                                int i26 = i24 >> 3;
                                jArr2 = jArr4;
                                int i27 = (i24 & 7) << 3;
                                j11 = j13;
                                long j14 = (jArr5[i26] >>> i27) | ((jArr5[i26 + 1] << (64 - i27)) & ((-i27) >> 63));
                                int i28 = i23;
                                long j15 = (i22 * 72340172838076673L) ^ j14;
                                long j16 = (j15 - 72340172838076673L) & (~j15) & j10;
                                while (true) {
                                    if (j16 == 0) {
                                        break;
                                    }
                                    i11 = (i24 + (Long.numberOfTrailingZeros(j16) >> 3)) & i28;
                                    int i29 = i28;
                                    if (xVar2.f8393b[i11] == i20) {
                                        break;
                                    }
                                    j16 &= j16 - 1;
                                    i28 = i29;
                                }
                                i25 += 8;
                                i24 = (i24 + i25) & i10;
                                jArr4 = jArr2;
                                i23 = i10;
                                j13 = j11;
                            }
                            int i30 = i11;
                            if (i30 >= 0) {
                                xVar2.f(i30);
                            }
                        } else {
                            jArr2 = jArr4;
                            j11 = j13;
                            i3 = i12;
                        }
                        j13 = j11 >> i3;
                        i19++;
                        i12 = i3;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i18 != i12) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i17 == length2) {
                    break;
                }
                i17++;
                jArr4 = jArr;
                i12 = 8;
            }
        }
        wVar.c();
        s.k m10 = m();
        int[] iArr3 = m10.f8337b;
        Object[] objArr = m10.f8338c;
        long[] jArr6 = m10.f8336a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i31 = 0;
            while (true) {
                long j17 = jArr6[i31];
                if ((((~j17) << c10) & j17 & j10) != j10) {
                    int i32 = 8 - ((~(i31 - length3)) >>> 31);
                    for (int i33 = 0; i33 < i32; i33++) {
                        if ((j17 & j3) < j) {
                            int i34 = (i31 << 3) + i33;
                            int i35 = iArr3[i34];
                            j2.m mVar2 = ((j2.n) objArr[i34]).f4986a;
                            j2.j jVar = mVar2.f4983d;
                            j2.t tVar = j2.q.f4996d;
                            if (jVar.f4975d.c(tVar) && xVar2.a(i35)) {
                                w((String) mVar2.f4983d.e(tVar), i35, 16);
                            }
                            wVar.h(i35, new v1(mVar2, m()));
                        }
                        j17 >>= 8;
                    }
                    if (i32 != 8) {
                        break;
                    }
                }
                if (i31 == length3) {
                    break;
                } else {
                    i31++;
                }
            }
        }
        this.S = new v1(this.f3338r.getSemanticsOwner().a(), m());
    }

    @Override // o3.b
    public final l.d a(View view) {
        return this.f3344x;
    }

    public final void e(int i3, p3.f fVar, String str, Bundle bundle) {
        j2.m mVar;
        int i10;
        int i11;
        float h10;
        float h11;
        float g;
        float g2;
        int i12;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f7665a;
        j2.n nVar = (j2.n) m().b(i3);
        if (nVar == null || (mVar = nVar.f4986a) == null) {
            return;
        }
        c2.g0 g0Var = mVar.f4982c;
        j2.j jVar = mVar.f4983d;
        s.h0 h0Var = jVar.f4975d;
        String n10 = n(mVar);
        if (Intrinsics.a(str, this.O)) {
            int d10 = this.M.d(i3);
            if (d10 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, d10);
                return;
            }
            return;
        }
        if (Intrinsics.a(str, this.P)) {
            int d11 = this.N.d(i3);
            if (d11 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, d11);
                return;
            }
            return;
        }
        boolean c10 = h0Var.c(j2.i.f4951a);
        v vVar = this.f3338r;
        boolean z10 = false;
        if (!c10 || bundle == null || !Intrinsics.a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            j2.t tVar = j2.q.f5015y;
            if (h0Var.c(tVar) && bundle != null && Intrinsics.a(str, "androidx.compose.ui.semantics.testTag")) {
                Object g10 = h0Var.g(tVar);
                String str2 = (String) (g10 == null ? null : g10);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
            if (Intrinsics.a(str, "androidx.compose.ui.semantics.id")) {
                accessibilityNodeInfo.getExtras().putInt(str, mVar.f4985f);
                return;
            }
            if (Intrinsics.a(str, "androidx.compose.ui.semantics.shapeType")) {
                Object g11 = h0Var.g(j2.q.M);
                k1.f0 f0Var = (k1.f0) (g11 == null ? null : g11);
                if (f0Var != null) {
                    Rect rect = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect);
                    j1.c o6 = o(mVar, rect, f0Var);
                    float f3 = o6.f4917b;
                    float f10 = o6.f4916a;
                    k1.v a9 = f0Var.a(o6.b(), g0Var.M, vVar.getDensity());
                    if (a9 instanceof k1.z) {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", B(a9, f10, f3));
                        return;
                    } else if (a9 instanceof k1.a0) {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", B(a9, f10, f3));
                        accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", D(a9));
                        return;
                    } else if (!(a9 instanceof k1.y)) {
                        a2.r.p();
                        return;
                    } else {
                        accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", E(a9, f10, f3));
                        return;
                    }
                }
                return;
            }
            if (Intrinsics.a(str, "androidx.compose.ui.semantics.shapeRect")) {
                Object g12 = h0Var.g(j2.q.M);
                k1.f0 f0Var2 = (k1.f0) (g12 == null ? null : g12);
                if (f0Var2 != null) {
                    Rect rect2 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect2);
                    j1.c o10 = o(mVar, rect2, f0Var2);
                    Rect B = B(f0Var2.a(o10.b(), g0Var.M, vVar.getDensity()), o10.f4916a, o10.f4917b);
                    if (B != null) {
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", B);
                        return;
                    }
                    return;
                }
                return;
            }
            if (Intrinsics.a(str, "androidx.compose.ui.semantics.shapeCorners")) {
                Object g13 = h0Var.g(j2.q.M);
                k1.f0 f0Var3 = (k1.f0) (g13 == null ? null : g13);
                if (f0Var3 != null) {
                    Rect rect3 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect3);
                    float[] D = D(f0Var3.a(o(mVar, rect3, f0Var3).b(), g0Var.M, vVar.getDensity()));
                    if (D != null) {
                        accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", D);
                        return;
                    }
                    return;
                }
                return;
            }
            if (Intrinsics.a(str, "androidx.compose.ui.semantics.shapeRegion")) {
                Object g14 = h0Var.g(j2.q.M);
                k1.f0 f0Var4 = (k1.f0) (g14 == null ? null : g14);
                if (f0Var4 != null) {
                    Rect rect4 = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect4);
                    j1.c o11 = o(mVar, rect4, f0Var4);
                    Region E = E(f0Var4.a(o11.b(), g0Var.M, vVar.getDensity()), o11.f4916a, o11.f4917b);
                    if (E != null) {
                        accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", E);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        int i13 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i14 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i14 > 0 && i13 >= 0) {
            if (i13 < (n10 != null ? n10.length() : Integer.MAX_VALUE)) {
                m2.e0 n11 = h0.n(jVar);
                if (n11 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i15 = 0;
                while (i15 < i14) {
                    int i16 = i13 + i15;
                    if (i16 >= n11.f6457a.f6445a.f6454e.length()) {
                        arrayList.add(z10);
                        i10 = i13;
                        i11 = i14;
                        i12 = i15;
                    } else {
                        b1.m mVar2 = n11.f6458b;
                        m2.e eVar = (m2.e) ((se) mVar2.f1009c).f2798d;
                        if (i16 < 0 || i16 >= eVar.f6454e.length()) {
                            StringBuilder i17 = n0.l.i(i16, "offset(", ") is out of bounds [0, ");
                            i17.append(eVar.f6454e.length());
                            i17.append(')');
                            r2.a.a(i17.toString());
                        }
                        ArrayList arrayList2 = (ArrayList) mVar2.f1011e;
                        m2.m mVar3 = (m2.m) arrayList2.get(m2.z.c(i16, arrayList2));
                        m2.a aVar = mVar3.f6492a;
                        int a10 = mVar3.a(i16);
                        CharSequence charSequence = aVar.f6420e;
                        if (a10 < 0 || a10 >= charSequence.length()) {
                            StringBuilder i18 = n0.l.i(a10, "offset(", ") is out of bounds [0,");
                            i18.append(charSequence.length());
                            i18.append(')');
                            r2.a.a(i18.toString());
                        }
                        n2.h hVar = aVar.f6419d;
                        Layout layout = hVar.f7011e;
                        int lineForOffset = layout.getLineForOffset(a10);
                        float f11 = hVar.f(lineForOffset);
                        i10 = i13;
                        float d12 = hVar.d(lineForOffset);
                        i11 = i14;
                        boolean z11 = layout.getParagraphDirection(lineForOffset) == 1;
                        boolean isRtlCharAt = layout.isRtlCharAt(a10);
                        if (!z11 || isRtlCharAt) {
                            if (z11 && isRtlCharAt) {
                                g = hVar.h(a10, false);
                                g2 = hVar.h(a10 + 1, true);
                            } else if (isRtlCharAt) {
                                g = hVar.g(a10, false);
                                g2 = hVar.g(a10 + 1, true);
                            } else {
                                h10 = hVar.h(a10, false);
                                h11 = hVar.h(a10 + 1, true);
                            }
                            float f12 = g;
                            h10 = g2;
                            h11 = f12;
                        } else {
                            h10 = hVar.g(a10, false);
                            h11 = hVar.g(a10 + 1, true);
                        }
                        RectF rectF2 = new RectF(h10, f11, h11, d12);
                        float f13 = rectF2.left;
                        float f14 = rectF2.top;
                        float f15 = rectF2.right;
                        float f16 = rectF2.bottom;
                        i12 = i15;
                        long floatToRawIntBits = (Float.floatToRawIntBits(mVar3.f6497f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                        int i19 = (int) (floatToRawIntBits >> 32);
                        float intBitsToFloat = Float.intBitsToFloat(i19) + f13;
                        int i20 = (int) (floatToRawIntBits & 4294967295L);
                        j1.c cVar = new j1.c(intBitsToFloat, Float.intBitsToFloat(i20) + f14, Float.intBitsToFloat(i19) + f15, Float.intBitsToFloat(i20) + f16);
                        c2.i1 d13 = mVar.d();
                        long j = 0;
                        if (d13 != null) {
                            if (!d13.D0().B) {
                                d13 = null;
                            }
                            if (d13 != null) {
                                j = d13.K(0L);
                            }
                        }
                        j1.c e2 = cVar.e(j);
                        j1.c g15 = mVar.g();
                        if ((((((e2.f4916a > g15.f4918c ? 1 : (e2.f4916a == g15.f4918c ? 0 : -1)) < 0) & ((g15.f4916a > e2.f4918c ? 1 : (g15.f4916a == e2.f4918c ? 0 : -1)) < 0)) & ((e2.f4917b > g15.f4919d ? 1 : (e2.f4917b == g15.f4919d ? 0 : -1)) < 0)) & ((g15.f4917b > e2.f4919d ? 1 : (g15.f4917b == e2.f4919d ? 0 : -1)) < 0) ? e2.c(g15) : null) != null) {
                            long v10 = vVar.v((Float.floatToRawIntBits(r1.f4917b) & 4294967295L) | (Float.floatToRawIntBits(r1.f4916a) << 32));
                            long v11 = vVar.v((Float.floatToRawIntBits(r1.f4918c) << 32) | (Float.floatToRawIntBits(r1.f4919d) & 4294967295L));
                            int i21 = (int) (v10 >> 32);
                            int i22 = (int) (v11 >> 32);
                            int i23 = (int) (v10 & 4294967295L);
                            int i24 = (int) (v11 & 4294967295L);
                            rectF = new RectF(Math.min(Float.intBitsToFloat(i21), Float.intBitsToFloat(i22)), Math.min(Float.intBitsToFloat(i23), Float.intBitsToFloat(i24)), Math.max(Float.intBitsToFloat(i21), Float.intBitsToFloat(i22)), Math.max(Float.intBitsToFloat(i23), Float.intBitsToFloat(i24)));
                        } else {
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i15 = i12 + 1;
                    i14 = i11;
                    i13 = i10;
                    z10 = false;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ce, code lost:
    
        r8.f8395d = 0;
        r0 = r8.f8392a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d4, code lost:
    
        if (r0 == s.p0.f8356a) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d6, code lost:
    
        kotlin.collections.v.j(r0, -9187201950435737472L);
        r0 = r8.f8392a;
        r11 = r8.f8394c;
        r12 = r11 >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ea, code lost:
    
        r20 = r6;
        r5 = 255 << ((r11 & 7) << 3);
        r16 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f5, code lost:
    
        r0[r12] = r5 | ((~r5) & r0[r12]);
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fd, code lost:
    
        r0.f8396e = s.p0.a(r0.f8394c) - r0.f8395d;
        r5 = r13.getHandler();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010e, code lost:
    
        if (r19.T != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0110, code lost:
    
        if (r5 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0112, code lost:
    
        r11 = 1;
        r19.T = true;
        r5.post(r19.V);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0139, code lost:
    
        if (ge.a0.i(r5, r2) == r3) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011d, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014a, code lost:
    
        r20.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fa, code lost:
    
        r20 = r6;
        r0 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:12:0x0030, B:16:0x0061, B:22:0x0075, B:24:0x007d, B:27:0x008a, B:31:0x0092, B:35:0x00bf, B:36:0x00a2, B:40:0x00b1, B:42:0x00b9, B:45:0x00c2, B:46:0x00c7, B:49:0x00c8, B:50:0x00cd, B:52:0x00ce, B:54:0x00d6, B:77:0x004b, B:79:0x0052), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0139 -> B:14:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(nd.c cVar) {
        y yVar;
        int i3;
        s.f fVar;
        s.f fVar2;
        s.x xVar;
        ie.b bVar;
        s.x xVar2;
        ie.b bVar2;
        Object b10;
        try {
            if (cVar instanceof y) {
                yVar = (y) cVar;
                int i10 = yVar.f3600s;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    yVar.f3600s = i10 - Integer.MIN_VALUE;
                    Object obj = yVar.f3598i;
                    md.a aVar = md.a.f6622d;
                    i3 = yVar.f3600s;
                    fVar = this.G;
                    int i11 = 1;
                    if (i3 != 0) {
                        cf.c.M(obj);
                        xVar = new s.x();
                        ie.c cVar2 = this.H;
                        cVar2.getClass();
                        bVar = new ie.b(cVar2);
                        yVar.f3596d = xVar;
                        yVar.f3597e = bVar;
                        yVar.f3600s = i11;
                        b10 = bVar.b(yVar);
                        if (b10 != aVar) {
                        }
                    } else if (i3 == 1) {
                        bVar2 = yVar.f3597e;
                        xVar2 = yVar.f3596d;
                        cf.c.M(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i3 != 2) {
                            kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bVar2 = yVar.f3597e;
                        s.x xVar3 = yVar.f3596d;
                        cf.c.M(obj);
                        fVar2 = fVar;
                        int i12 = 1;
                        xVar = xVar3;
                        char c10 = 2;
                        bVar = bVar2;
                        fVar = fVar2;
                        i11 = i12;
                        yVar.f3596d = xVar;
                        yVar.f3597e = bVar;
                        yVar.f3600s = i11;
                        b10 = bVar.b(yVar);
                        if (b10 != aVar) {
                            return aVar;
                        }
                        ie.b bVar3 = bVar;
                        xVar2 = xVar;
                        obj = b10;
                        bVar2 = bVar3;
                        if (((Boolean) obj).booleanValue()) {
                            fVar.clear();
                            return Unit.f5554a;
                        }
                        bVar2.c();
                        boolean p4 = p();
                        s.w wVar = this.B;
                        s.w wVar2 = this.A;
                        if (p4) {
                            int i13 = fVar.f8298i;
                            int i14 = 0;
                            while (true) {
                                v vVar = this.f3338r;
                                if (i14 >= i13) {
                                    break;
                                }
                                c2.g0 g0Var = (c2.g0) fVar.f8297e[i14];
                                z(g0Var, xVar2);
                                if (g0Var.E() && !vVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(g0Var)) {
                                    int i15 = g0Var.f1550e;
                                    if (wVar2.b(i15) != null) {
                                        throw new ClassCastException();
                                    }
                                    if (wVar.b(i15) != null) {
                                        throw new ClassCastException();
                                    }
                                }
                                i14++;
                            }
                        } else {
                            fVar2 = fVar;
                            i12 = i11;
                            xVar = xVar2;
                        }
                        fVar2.clear();
                        wVar2.c();
                        wVar.c();
                        long j = this.f3342v;
                        yVar.f3596d = xVar;
                        yVar.f3597e = bVar2;
                        c10 = 2;
                        yVar.f3600s = 2;
                    }
                }
            }
            if (i3 != 0) {
            }
        } catch (Throwable th) {
            th = th;
            fVar2 = fVar;
        }
        yVar = new y(this, cVar);
        Object obj2 = yVar.f3598i;
        md.a aVar2 = md.a.f6622d;
        i3 = yVar.f3600s;
        fVar = this.G;
        int i112 = 1;
    }

    public final void g(boolean z10, long j) {
        j2.t tVar;
        int i3;
        if (!Intrinsics.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return;
        }
        s.k m10 = m();
        if (j1.b.a(j, 9205357640488583168L) || (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return;
        }
        if (z10) {
            tVar = j2.q.f5012v;
        } else {
            if (z10) {
                a2.r.p();
                return;
            }
            tVar = j2.q.f5011u;
        }
        Object[] objArr = m10.f8338c;
        long[] jArr = m10.f8336a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j3 = jArr[i10];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((255 & j3) < 128) {
                        j2.n nVar = (j2.n) objArr[(i10 << 3) + i13];
                        x2.j jVar = nVar.f4987b;
                        float f3 = jVar.f10325a;
                        float f10 = jVar.f10326b;
                        i3 = i11;
                        float f11 = jVar.f10327c;
                        float f12 = jVar.f10328d;
                        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                        if ((intBitsToFloat2 < f12) && ((((intBitsToFloat > f3 ? 1 : (intBitsToFloat == f3 ? 0 : -1)) >= 0) & ((intBitsToFloat > f11 ? 1 : (intBitsToFloat == f11 ? 0 : -1)) < 0)) & ((intBitsToFloat2 > f10 ? 1 : (intBitsToFloat2 == f10 ? 0 : -1)) >= 0))) {
                            Object g = nVar.f4986a.f4983d.f4975d.g(tVar);
                            if (g == null) {
                                g = null;
                            }
                            if (g != null) {
                                kotlin.collections.i0.j();
                                return;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        i3 = i11;
                    }
                    j3 >>= i3;
                    i13++;
                    i11 = i3;
                }
                if (i12 != i11) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void h() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (p()) {
                s(this.f3338r.getSemanticsOwner().a(), this.S);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                y(m());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    G();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent i(int i3, int i10) {
        j2.n nVar;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        v vVar = this.f3338r;
        obtain.setPackageName(vVar.getContext().getPackageName());
        obtain.setSource(vVar, i3);
        if (p() && (nVar = (j2.n) m().b(i3)) != null) {
            j2.m mVar = nVar.f4986a;
            obtain.setPassword(mVar.f4983d.f4975d.c(j2.q.I));
            Object g = mVar.f4983d.f4975d.g(j2.q.f5004n);
            if (g == null) {
                g = null;
            }
            boolean a9 = Intrinsics.a(g, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                o3.q.i(obtain, a9);
            }
        }
        return obtain;
    }

    public final AccessibilityEvent j(int i3, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent i10 = i(i3, 8192);
        if (num != null) {
            i10.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            i10.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            i10.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            i10.getText().add(charSequence);
        }
        return i10;
    }

    public final int k(j2.m mVar) {
        j2.j jVar = mVar.f4983d;
        if (!jVar.f4975d.c(j2.q.f4993a)) {
            j2.t tVar = j2.q.F;
            if (jVar.f4975d.c(tVar)) {
                return (int) (((m2.g0) jVar.e(tVar)).f6478a & 4294967295L);
            }
        }
        return this.E;
    }

    public final int l(j2.m mVar) {
        j2.j jVar = mVar.f4983d;
        if (!jVar.f4975d.c(j2.q.f4993a)) {
            j2.t tVar = j2.q.F;
            if (jVar.f4975d.c(tVar)) {
                return (int) (((m2.g0) jVar.e(tVar)).f6478a >> 32);
            }
        }
        return this.E;
    }

    public final s.k m() {
        if (this.I) {
            this.I = false;
            v vVar = this.f3338r;
            this.K = j2.p.b(vVar.getSemanticsOwner(), r.f3516i);
            if (p()) {
                s.w wVar = this.K;
                Resources resources = vVar.getContext().getResources();
                s.u uVar = this.M;
                uVar.a();
                s.u uVar2 = this.N;
                uVar2.a();
                j2.n nVar = (j2.n) wVar.b(-1);
                j2.m mVar = nVar != null ? nVar.f4986a : null;
                mVar.getClass();
                ArrayList b10 = j2.x.b(mVar, new a3.e(6, wVar), new a3.e(7, resources), kotlin.collections.x.c(mVar));
                int i3 = 1;
                int size = b10.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i10 = ((j2.m) b10.get(i3 - 1)).f4985f;
                        int i11 = ((j2.m) b10.get(i3)).f4985f;
                        uVar.f(i10, i11);
                        uVar2.f(i11, i10);
                        if (i3 == size) {
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        return this.K;
    }

    public final j1.c o(j2.m mVar, Rect rect, k1.f0 f0Var) {
        z zVar = new z(f0Var);
        c2.g0 g0Var = mVar.f4982c;
        d1.k kVar = (d1.k) g0Var.S.g;
        c2.i iVar = null;
        if ((kVar.f3308r & 8) != 0) {
            loop0: while (true) {
                if (kVar == null) {
                    break;
                }
                if ((kVar.f3307i & 8) != 0) {
                    d1.k kVar2 = kVar;
                    o0.e eVar = null;
                    while (kVar2 != null) {
                        if (kVar2 instanceof c2.x1) {
                            ((c2.x1) kVar2).u(zVar);
                            if (zVar.f3603d) {
                                iVar = kVar2;
                                break loop0;
                            }
                        } else if ((kVar2.f3307i & 8) != 0 && (kVar2 instanceof c2.j)) {
                            int i3 = 0;
                            for (d1.k kVar3 = ((c2.j) kVar2).D; kVar3 != null; kVar3 = kVar3.f3310t) {
                                if ((kVar3.f3307i & 8) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        kVar2 = kVar3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new o0.e(new d1.k[16]);
                                        }
                                        if (kVar2 != null) {
                                            eVar.b(kVar2);
                                            kVar2 = null;
                                        }
                                        eVar.b(kVar3);
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                        kVar2 = c2.k.e(eVar);
                    }
                }
                if ((kVar.f3308r & 8) == 0) {
                    break;
                }
                kVar = kVar.f3310t;
            }
        }
        c2.i iVar2 = (c2.x1) iVar;
        if (iVar2 == null || !((d1.k) iVar2).f3305d.B) {
            return a2.q.f((c2.i1) g0Var.S.f1494e, false);
        }
        c2.i1 t6 = c2.k.t(iVar2);
        j1.c p4 = a2.q.h(t6).p(t6, false);
        Rect C = C(p4.f4916a, p4.f4917b, p4.f4918c, p4.f4919d);
        float f3 = C.left - rect.left;
        float f10 = C.top - rect.top;
        return new j1.c(f3, f10, C.width() + f3, C.height() + f10);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z10) {
        this.f3343w = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        this.f3343w = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.f3341u;
        if (accessibilityManager.isEnabled()) {
            this.f3343w = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.f3338r.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.V);
        AccessibilityManager accessibilityManager = this.f3341u;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final boolean p() {
        AccessibilityManager accessibilityManager = this.f3341u;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> list = this.f3343w;
        if (list == null) {
            list = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.f3343w = list;
        }
        return !list.isEmpty();
    }

    public final void q(c2.g0 g0Var) {
        if (this.G.add(g0Var)) {
            this.H.b(Unit.f5554a);
        }
    }

    public final int r(int i3) {
        if (i3 == this.f3338r.getSemanticsOwner().a().f4985f) {
            return -1;
        }
        return i3;
    }

    public final void s(j2.m mVar, v1 v1Var) {
        int[] iArr = s.m.f8345a;
        s.x xVar = new s.x();
        List j = j2.m.j(4, mVar);
        c2.g0 g0Var = mVar.f4982c;
        int size = j.size();
        for (int i3 = 0; i3 < size; i3++) {
            j2.m mVar2 = (j2.m) j.get(i3);
            s.k m10 = m();
            int i10 = mVar2.f4985f;
            if (m10.a(i10)) {
                if (!v1Var.f3587b.b(i10)) {
                    q(g0Var);
                    return;
                }
                xVar.a(i10);
            }
        }
        s.x xVar2 = v1Var.f3587b;
        int[] iArr2 = xVar2.f8393b;
        long[] jArr = xVar2.f8392a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j3 = jArr[i11];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j3) < 128 && !xVar.b(iArr2[(i11 << 3) + i13])) {
                            q(g0Var);
                            return;
                        }
                        j3 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        List j10 = j2.m.j(4, mVar);
        int size2 = j10.size();
        for (int i14 = 0; i14 < size2; i14++) {
            j2.m mVar3 = (j2.m) j10.get(i14);
            v1 v1Var2 = (v1) this.R.b(mVar3.f4985f);
            if (v1Var2 != null && m().a(mVar3.f4985f)) {
                s(mVar3, v1Var2);
            }
        }
    }

    public final boolean t(AccessibilityEvent accessibilityEvent) {
        if (!p()) {
            return false;
        }
        if (accessibilityEvent.getEventType() != 2048) {
            accessibilityEvent.getEventType();
        }
        return ((Boolean) this.f3340t.invoke(accessibilityEvent)).booleanValue();
    }

    public final boolean u(int i3, int i10, Integer num, List list) {
        if (i3 == Integer.MIN_VALUE || !p()) {
            return false;
        }
        AccessibilityEvent i11 = i(i3, i10);
        if (num != null) {
            i11.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            i11.setContentDescription(z2.a.a(list, ",", null, 62));
        }
        return t(i11);
    }

    public final void w(String str, int i3, int i10) {
        AccessibilityEvent i11 = i(r(i3), 32);
        i11.setContentChangeTypes(i10);
        if (str != null) {
            i11.getText().add(str);
        }
        t(i11);
    }

    public final void x(int i3) {
        x xVar = this.J;
        if (xVar != null) {
            j2.m mVar = xVar.f3589a;
            if (i3 != mVar.f4985f) {
                return;
            }
            if (SystemClock.uptimeMillis() - xVar.f3594f <= 1000) {
                AccessibilityEvent i10 = i(r(mVar.f4985f), 131072);
                i10.setFromIndex(xVar.f3592d);
                i10.setToIndex(xVar.f3593e);
                i10.setAction(xVar.f3590b);
                i10.setMovementGranularity(xVar.f3591c);
                i10.getText().add(n(mVar));
                t(i10);
            }
        }
        this.J = null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void y(s.k r57) {
        /*
            Method dump skipped, instructions count: 1671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.b0.y(s.k):void");
    }

    public final void z(c2.g0 g0Var, s.x xVar) {
        j2.j u2;
        if (g0Var.E() && !this.f3338r.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(g0Var)) {
            c2.g0 g0Var2 = null;
            if (!g0Var.S.d(8)) {
                g0Var = g0Var.s();
                while (true) {
                    if (g0Var == null) {
                        g0Var = null;
                        break;
                    } else if (g0Var.S.d(8)) {
                        break;
                    } else {
                        g0Var = g0Var.s();
                    }
                }
            }
            if (g0Var == null || (u2 = g0Var.u()) == null) {
                return;
            }
            if (!u2.f4977i) {
                c2.g0 s3 = g0Var.s();
                while (true) {
                    if (s3 != null) {
                        j2.j u10 = s3.u();
                        if (u10 != null && u10.f4977i) {
                            g0Var2 = s3;
                            break;
                        }
                        s3 = s3.s();
                    } else {
                        break;
                    }
                }
                if (g0Var2 != null) {
                    g0Var = g0Var2;
                }
            }
            int i3 = g0Var.f1550e;
            if (xVar.a(i3)) {
                v(this, r(i3), 2048, 1, 8);
            }
        }
    }
}
