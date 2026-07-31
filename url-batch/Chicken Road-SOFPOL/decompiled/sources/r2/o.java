package r2;

import a0.a0;
import a0.g1;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import android.window.BackEvent;
import androidx.compose.foundation.ScrollingLayoutElement;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b6.a2;
import com.snovikpovik.vuevnxsj.R;
import d6.u;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import l.j0;
import m0.b0;
import m0.o1;
import m0.s;
import m0.t1;
import m0.v0;
import m0.v1;
import m0.z0;
import q.u0;
import q6.t;
import t.q0;
import u1.e0;
import w1.y;
import w4.d0;
import w4.m0;
import x.f0;
import x.g0;
import x.t0;
import x1.b1;
import x1.k0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class o {
    public static q0.e A(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new q0.e(q3.l.a(view));
        }
        return null;
    }

    public static ColorStateList B(Context context, g1 g1Var, int i) {
        int resourceId;
        ColorStateList q4;
        TypedArray typedArray = (TypedArray) g1Var.f85c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (q4 = s6.a.q(context, resourceId)) == null) ? g1Var.p(i) : q4;
    }

    public static ColorStateList C(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList q4;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (q4 = s6.a.q(context, resourceId)) == null) ? typedArray.getColorStateList(i) : q4;
    }

    public static final String[] D(z0.m mVar) {
        q6.i.c(mVar, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((z0.d) mVar).f9110b.toArray(new String[0]);
    }

    public static Drawable E(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable D;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (D = h0.a.D(context, resourceId)) == null) ? typedArray.getDrawable(i) : D;
    }

    public static final ViewParent L(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final Bundle M(String str, Bundle bundle) {
        q6.i.e(str, "key");
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        r.F(str);
        throw null;
    }

    public static final ArrayList N(String str, Bundle bundle) {
        q6.i.e(str, "key");
        ArrayList a8 = Build.VERSION.SDK_INT >= 34 ? m3.a.a(bundle, str, m.a.A(t.a(Bundle.class))) : bundle.getParcelableArrayList(str);
        if (a8 != null) {
            return a8;
        }
        r.F(str);
        throw null;
    }

    public static final long P(double d8) {
        return d0(4294967296L, (float) d8);
    }

    public static final long Q(int i) {
        return d0(4294967296L, i);
    }

    public static o3.c R(j0 j0Var) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new o3.c(j3.a.j(j0Var));
        }
        TextPaint textPaint = new TextPaint(j0Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = j0Var.getBreakStrategy();
        int hyphenationFrequency = j0Var.getHyphenationFrequency();
        if (j0Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (j0Var.getInputType() & 15) != 3) {
                boolean z3 = j0Var.getLayoutDirection() == 1;
                switch (j0Var.getTextDirection()) {
                    case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case a4.i.LONG_FIELD_NUMBER /* 4 */:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z3) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(j3.a.c(DecimalFormatSymbols.getInstance(j0Var.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new o3.c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static boolean S(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i8 = rect.right;
            int i9 = rect2.right;
            return (i8 > i9 || rect.left >= i9) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            return (i10 > i11 || rect.top >= i11) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i12 = rect.left;
            int i13 = rect2.left;
            return (i12 < i13 || rect.right <= i13) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i14 = rect.top;
        int i15 = rect2.top;
        return (i14 < i15 || rect.bottom <= i15) && rect.bottom < rect2.bottom;
    }

    public static boolean U(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean X(char c8) {
        return Character.isWhitespace(c8) || Character.isSpaceChar(c8);
    }

    public static int Y(int i, Rect rect, Rect rect2) {
        int i8;
        int i9;
        if (i == 17) {
            i8 = rect.left;
            i9 = rect2.right;
        } else if (i == 33) {
            i8 = rect.top;
            i9 = rect2.bottom;
        } else if (i == 66) {
            i8 = rect2.left;
            i9 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i8 = rect2.top;
            i9 = rect.bottom;
        }
        return Math.max(0, i8 - i9);
    }

    public static final y0.m Z(s sVar, y0.m mVar) {
        if (mVar.a(y0.i.f8704e)) {
            return mVar;
        }
        sVar.R(1219399079, 0, null, null);
        y0.m mVar2 = (y0.m) mVar.b(y0.j.f8705a, new q.d(5, sVar));
        sVar.p(false);
        return mVar2;
    }

    public static final z0.d a(String str) {
        Set singleton = Collections.singleton(str);
        q6.i.d(singleton, "singleton(...)");
        return new z0.d(singleton);
    }

    public static final y0.m a0(s sVar, y0.m mVar) {
        sVar.V(439770924);
        y0.m Z = Z(sVar, mVar);
        sVar.p(false);
        return Z;
    }

    public static final void b(p6.a aVar, u2.o oVar, u0.c cVar, s sVar, int i) {
        s sVar2;
        l lVar;
        Object obj;
        sVar.W(826668973);
        int i8 = i | (sVar.h(aVar) ? 4 : 2) | (sVar.f(oVar) ? 32 : 16);
        if (sVar.N(i8 & 1, (i8 & 147) != 146)) {
            View view = (View) sVar.j(k0.f8491e);
            c cVar2 = (c) sVar.j(b1.f8370h);
            l lVar2 = (l) sVar.j(b1.f8375n);
            m0.q s5 = m0.b.s(sVar);
            z0 t3 = m0.b.t(cVar, sVar);
            Object[] objArr = new Object[0];
            Object K = sVar.K();
            v0 v0Var = m0.n.f5019a;
            if (K == v0Var) {
                K = u2.e.f7314f;
                sVar.f0(K);
            }
            Object c8 = v0.j.c(Arrays.copyOf(objArr, 0), v0.j.f7447a, (p6.a) K, sVar, 3456, 0);
            s sVar3 = sVar;
            UUID uuid = (UUID) c8;
            boolean f6 = sVar3.f(view) | sVar3.f(cVar2);
            Object K2 = sVar3.K();
            if (f6 || K2 == v0Var) {
                lVar = lVar2;
                u2.p pVar = new u2.p(aVar, oVar, view, lVar, cVar2, uuid);
                u0.c cVar3 = new u0.c(346960332, true, new q.d(1, t3));
                u2.n nVar = pVar.f7345k;
                nVar.setParentCompositionContext(s5);
                nVar.f7328m.setValue(cVar3);
                nVar.f7332q = true;
                if (nVar.f8326g == null && !nVar.isAttachedToWindow()) {
                    throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
                }
                nVar.c();
                sVar3.f0(pVar);
                obj = pVar;
            } else {
                obj = K2;
                lVar = lVar2;
            }
            u2.p pVar2 = (u2.p) obj;
            boolean h8 = sVar3.h(pVar2);
            Object K3 = sVar3.K();
            if (h8 || K3 == v0Var) {
                K3 = new a2(pVar2, null, 1);
                sVar3.f0(K3);
            }
            m0.b.f(c6.m.f1757a, sVar3, (p6.e) K3);
            boolean h9 = sVar3.h(pVar2);
            Object K4 = sVar3.K();
            if (h9 || K4 == v0Var) {
                K4 = new u2.a(pVar2, 0);
                sVar3.f0(K4);
            }
            m0.b.d(pVar2, (p6.c) K4, sVar3);
            boolean h10 = sVar3.h(pVar2) | ((i8 & 14) == 4) | ((i8 & 112) == 32) | sVar3.d(lVar.ordinal());
            Object K5 = sVar3.K();
            if (h10 || K5 == v0Var) {
                K5 = new u2.b(pVar2, aVar, oVar, lVar);
                sVar3.f0(K5);
            }
            m0.b.g((p6.a) K5, sVar3);
            sVar2 = sVar3;
        } else {
            s sVar4 = sVar;
            sVar4.Q();
            sVar2 = sVar4;
        }
        t1 r7 = sVar2.r();
        if (r7 != null) {
            r7.f5121d = new u2.c(aVar, oVar, cVar, i, 0);
        }
    }

    public static Typeface b0(Configuration configuration, Typeface typeface) {
        int i;
        int i8;
        int weight;
        int i9;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i = configuration.fontWeightAdjustment;
        if (i == Integer.MAX_VALUE) {
            return null;
        }
        i8 = configuration.fontWeightAdjustment;
        if (i8 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i9 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, h0.a.p(i9 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(int i, int i8, s sVar, p6.c cVar, t.j jVar, u.i iVar, x.d dVar, f0 f0Var, y0.d dVar2, y0.m mVar, z.p pVar, boolean z3) {
        y0.d dVar3;
        int i9;
        t.j jVar2;
        u.i iVar2;
        f0 f0Var2;
        boolean z7;
        y0.d dVar4;
        z.p pVar2;
        t1 r7;
        t.j jVar3;
        int i10;
        y0.d dVar5;
        u.i iVar3;
        z.p pVar3;
        t.j jVar4;
        boolean z8;
        f0 f0Var3;
        sVar.W(-1884325601);
        int i11 = i | 3472;
        int i12 = i8 & 32;
        if (i12 != 0) {
            i11 = 200080 | i;
        } else if ((196608 & i) == 0) {
            dVar3 = dVar2;
            i11 |= sVar.f(dVar3) ? 131072 : 65536;
            i9 = i11 | 46661632 | (!sVar.h(cVar) ? 536870912 : 268435456);
            if (sVar.N(i9 & 1, (306783379 & i9) == 306783378)) {
                sVar.Q();
                jVar2 = jVar;
                iVar2 = iVar;
                f0Var2 = f0Var;
                z7 = z3;
                dVar4 = dVar3;
                pVar2 = pVar;
            } else {
                sVar.S();
                if ((i & 1) == 0 || sVar.x()) {
                    z.k kVar = z.r.f9099a;
                    Object[] objArr = new Object[0];
                    a0 a0Var = z.p.f9076x;
                    boolean d8 = sVar.d(0) | sVar.d(0);
                    Object K = sVar.K();
                    Object obj = m0.n.f5019a;
                    if (d8 || K == obj) {
                        K = new t0(4);
                        sVar.f0(K);
                    }
                    z.p pVar4 = (z.p) v0.j.b(objArr, a0Var, (p6.a) K, sVar, 0);
                    float f6 = 0;
                    g0 g0Var = new g0(f6, f6, f6, f6);
                    y0.d dVar6 = i12 != 0 ? y0.b.f8689m : dVar3;
                    float f8 = u0.f5917a;
                    c cVar2 = (c) sVar.j(b1.f8370h);
                    boolean c8 = sVar.c(cVar2.b());
                    Object K2 = sVar.K();
                    if (c8 || K2 == obj) {
                        K2 = new r.s(new b1.b(cVar2));
                        sVar.f0(K2);
                    }
                    r.s sVar2 = (r.s) K2;
                    boolean f9 = sVar.f(sVar2);
                    Object K3 = sVar.K();
                    if (f9 || K3 == obj) {
                        K3 = new u.i(sVar2);
                        sVar.f0(K3);
                    }
                    u.i iVar4 = (u.i) K3;
                    b0 b0Var = q0.f6842a;
                    sVar.V(282942128);
                    t.k kVar2 = (t.k) sVar.j(q0.f6842a);
                    if (kVar2 == null) {
                        sVar.p(false);
                        jVar3 = null;
                    } else {
                        boolean f10 = sVar.f(kVar2);
                        Object K4 = sVar.K();
                        if (f10 || K4 == obj) {
                            Object jVar5 = new t.j(kVar2.f6797a, kVar2.f6798b, kVar2.f6799c, kVar2.f6800d);
                            sVar.f0(jVar5);
                            K4 = jVar5;
                        }
                        sVar.p(false);
                        jVar3 = (t.j) K4;
                    }
                    i10 = i9 & (-238551153);
                    dVar5 = dVar6;
                    iVar3 = iVar4;
                    pVar3 = pVar4;
                    jVar4 = jVar3;
                    z8 = true;
                    f0Var3 = g0Var;
                } else {
                    sVar.Q();
                    i10 = i9 & (-238551153);
                    jVar4 = jVar;
                    iVar3 = iVar;
                    f0Var3 = f0Var;
                    pVar3 = pVar;
                    z8 = z3;
                    dVar5 = dVar3;
                }
                sVar.q();
                r.b(1600902, ((i10 >> 12) & 112) | 384 | ((i10 >> 18) & 7168), sVar, cVar, jVar4, iVar3, dVar, f0Var3, dVar5, mVar, pVar3, z8);
                jVar2 = jVar4;
                iVar2 = iVar3;
                f0Var2 = f0Var3;
                dVar4 = dVar5;
                pVar2 = pVar3;
                z7 = z8;
            }
            r7 = sVar.r();
            if (r7 == null) {
                r7.f5121d = new z.b(mVar, pVar2, f0Var2, dVar, dVar4, iVar2, z7, jVar2, cVar, i, i8);
                return;
            }
            return;
        }
        dVar3 = dVar2;
        i9 = i11 | 46661632 | (!sVar.h(cVar) ? 536870912 : 268435456);
        if (sVar.N(i9 & 1, (306783379 & i9) == 306783378)) {
        }
        r7 = sVar.r();
        if (r7 == null) {
        }
    }

    public static int c0(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final s4.b d(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        return new s4.b(swipeEdge, progress, touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static final long d0(long j7, float f6) {
        long floatToRawIntBits = j7 | (Float.floatToRawIntBits(f6) & 4294967295L);
        p[] pVarArr = n.f6533b;
        return floatToRawIntBits;
    }

    public static final void e(y0.m mVar, p6.e eVar, s sVar, int i) {
        int i8;
        sVar.W(1090521195);
        if ((i & 6) == 0) {
            i8 = (sVar.f(mVar) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= sVar.h(eVar) ? 32 : 16;
        }
        if (sVar.N(i8 & 1, (i8 & 19) != 18)) {
            Object K = sVar.K();
            if (K == m0.n.f5019a) {
                K = u2.f.f7317a;
                sVar.f0(K);
            }
            e0 e0Var = (e0) K;
            int hashCode = Long.hashCode(sVar.T);
            o1 l3 = sVar.l();
            y0.m a02 = a0(sVar, mVar);
            w1.i.f7684c.getClass();
            y yVar = w1.h.f7675b;
            int i9 = (((((i8 << 3) & 112) | (((i8 >> 3) & 14) | 384)) << 6) & 896) | 6;
            sVar.Y();
            if (sVar.S) {
                sVar.k(yVar);
            } else {
                sVar.i0();
            }
            m0.b.u(e0Var, sVar, w1.h.f7678e);
            m0.b.u(l3, sVar, w1.h.f7677d);
            w1.g gVar = w1.h.f7679f;
            if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
                a0.q.n(hashCode, sVar, hashCode, gVar);
            }
            m0.b.u(a02, sVar, w1.h.f7676c);
            eVar.g(sVar, Integer.valueOf((i9 >> 6) & 14));
            sVar.p(true);
        } else {
            sVar.Q();
        }
        t1 r7 = sVar.r();
        if (r7 != null) {
            r7.f5121d = new u2.g(mVar, eVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(List list, y3.j jVar, i6.c cVar) {
        y3.d dVar;
        int i;
        List list2;
        q6.s sVar;
        Iterator it;
        Throwable th;
        if (cVar instanceof y3.d) {
            dVar = (y3.d) cVar;
            int i8 = dVar.f8855j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar.f8855j = i8 - Integer.MIN_VALUE;
                Object obj = dVar.i;
                i = dVar.f8855j;
                Object obj2 = h6.a.f3204d;
                if (i != 0) {
                    s6.a.K(obj);
                    ArrayList arrayList = new ArrayList();
                    v1 v1Var = new v1(list, arrayList, null);
                    dVar.f8853g = arrayList;
                    dVar.f8855j = 1;
                    if (jVar.a(v1Var, dVar) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = dVar.f8854h;
                        sVar = (q6.s) dVar.f8853g;
                        try {
                            s6.a.K(obj);
                        } catch (Throwable th2) {
                            Object obj3 = sVar.f6205d;
                            if (obj3 == null) {
                                sVar.f6205d = th2;
                            } else {
                                s6.a.e((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            p6.c cVar2 = (p6.c) it.next();
                            dVar.f8853g = sVar;
                            dVar.f8854h = it;
                            dVar.f8855j = 2;
                            if (cVar2.i(dVar) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) sVar.f6205d;
                        if (th == null) {
                            return c6.m.f1757a;
                        }
                        throw th;
                    }
                    list2 = (List) dVar.f8853g;
                    s6.a.K(obj);
                }
                sVar = new q6.s();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) sVar.f6205d;
                if (th == null) {
                }
            }
        }
        dVar = new y3.d(cVar);
        Object obj4 = dVar.i;
        i = dVar.f8855j;
        Object obj22 = h6.a.f3204d;
        if (i != 0) {
        }
        sVar = new q6.s();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) sVar.f6205d;
        if (th == null) {
        }
    }

    public static final void f0(Bundle bundle, String str, Bundle bundle2) {
        q6.i.e(str, "key");
        q6.i.e(bundle2, "value");
        bundle.putBundle(str, bundle2);
    }

    public static IOException g(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        String sb2 = sb.toString();
        q6.i.d(sb2, "toString(...)");
        return new IOException(sb2, iOException);
    }

    public static final void g0(Bundle bundle, String str, String str2) {
        q6.i.e(str, "key");
        q6.i.e(str2, "value");
        bundle.putString(str, str2);
    }

    public static IOException h(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        return parentFile == null ? g(file, iOException) : parentFile.exists() ? parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? g(file, iOException) : g(file, iOException) : parentFile.canWrite() ? g(file, iOException) : g(file, iOException) : parentFile.canRead() ? parentFile.canWrite() ? g(file, iOException) : g(file, iOException) : parentFile.canWrite() ? g(file, iOException) : g(file, iOException) : g(file, iOException);
    }

    public static final void h0(Bundle bundle, String str, List list) {
        bundle.putStringArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r9.bottom <= r11.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r8 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r8 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r10 = Y(r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r8 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r8 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r8 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r8 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r8 = r11.bottom;
        r9 = r9.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r10 >= java.lang.Math.max(1, r8 - r9)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r8 = r11.right;
        r9 = r9.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r8 = r9.top;
        r9 = r11.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        r8 = r9.left;
        r9 = r11.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0032, code lost:
    
        if (r9.right <= r11.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0039, code lost:
    
        if (r9.top >= r11.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0040, code lost:
    
        if (r9.left >= r11.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean i(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean j7 = j(i, rect, rect2);
        if (j(i, rect, rect3) || !j7) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
        }
        return true;
    }

    public static boolean j(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static final t.u0 j0(s sVar) {
        Object[] objArr = new Object[0];
        boolean d8 = sVar.d(0);
        Object K = sVar.K();
        if (d8 || K == m0.n.f5019a) {
            K = new c.e(25);
            sVar.f0(K);
        }
        return (t.u0) v0.j.b(objArr, t.u0.i, (p6.a) K, sVar, 0);
    }

    public static void k0(TextView textView, int i) {
        h0.a.n(i);
        if (Build.VERSION.SDK_INT >= 28) {
            j3.a.k(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i8 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), i + i8, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void l0(TextView textView, int i) {
        h0.a.n(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i8 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i8);
        }
    }

    public static void m0(TextView textView, int i) {
        h0.a.n(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void n0(View view, w5.j jVar) {
        q5.a aVar = jVar.f8105e.f8089c;
        if (aVar == null || !aVar.f6176a) {
            return;
        }
        float f6 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f6 += ((View) parent).getElevation();
        }
        w5.h hVar = jVar.f8105e;
        if (hVar.f8098m != f6) {
            hVar.f8098m = f6;
            jVar.s();
        }
    }

    public static void p(int i) {
        if (2 > i || i >= 37) {
            StringBuilder l3 = a0.q.l("radix ", i, " was not in valid range ");
            l3.append(new v6.d(2, 36, 1));
            throw new IllegalArgumentException(l3.toString());
        }
    }

    public static final long p0(long j7, float f6) {
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (j7 >> 32)) - f6);
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (j7 & 4294967295L)) - f6);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public static final void q(long j7, u.j0 j0Var) {
        if (j0Var == u.j0.f7027d) {
            if (a.g(j7) != Integer.MAX_VALUE) {
                return;
            }
            w.a.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (a.h(j7) != Integer.MAX_VALUE) {
                return;
            }
            w.a.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static v6.b q0(v6.d dVar) {
        q6.i.e(dVar, "<this>");
        return new v6.b(dVar.f7492d, dVar.f7493e, dVar.f7494f > 0 ? 2 : -2);
    }

    public static double r(double d8, double d9, double d10) {
        if (d9 <= d10) {
            return d8 < d9 ? d9 : d8 > d10 ? d10 : d8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d10 + " is less than minimum " + d9 + '.');
    }

    public static final long r0(long j7, z6.c cVar) {
        q6.i.e(cVar, "unit");
        z6.c cVar2 = z6.c.NANOSECONDS;
        q6.i.e(cVar2, "sourceUnit");
        TimeUnit timeUnit = cVar.f9293d;
        TimeUnit timeUnit2 = cVar2.f9293d;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-convert) > j7 || j7 > convert) {
            return z(u(r.r(j7, cVar, z6.c.MILLISECONDS)));
        }
        long convert2 = timeUnit2.convert(j7, timeUnit) << 1;
        int i = z6.a.f9288f;
        int i8 = z6.b.f9289a;
        return convert2;
    }

    public static float s(float f6, float f8, float f9) {
        if (f8 <= f9) {
            return f6 < f8 ? f8 : f6 > f9 ? f9 : f6;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f9 + " is less than minimum " + f8 + '.');
    }

    public static final void s0(String str, long j7) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j7);
        }
    }

    public static int t(int i, int i8, int i9) {
        if (i8 <= i9) {
            return i < i8 ? i8 : i > i9 ? i9 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i9 + " is less than minimum " + i8 + '.');
    }

    public static final boolean t0(Throwable th, p6.a aVar) {
        Collection asList;
        Object invoke;
        q6.i.e(th, "<this>");
        Integer num = l6.a.f4868a;
        x0.d dVar = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            q6.i.d(suppressed, "getSuppressed(...)");
            asList = Arrays.asList(suppressed);
            q6.i.d(asList, "asList(...)");
        } else {
            Method method = k6.a.f4199b;
            if (method == null || (invoke = method.invoke(th, null)) == null) {
                asList = u.f2326d;
            } else {
                asList = Arrays.asList((Throwable[]) invoke);
                q6.i.d(asList, "asList(...)");
            }
        }
        boolean z3 = false;
        if (!asList.isEmpty()) {
            Iterator it = asList.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof x0.d) {
                    return false;
                }
            }
        }
        try {
            List list = (List) aVar.b();
            boolean isEmpty = list.isEmpty();
            z3 = !isEmpty;
            if (!isEmpty) {
                dVar = new x0.d(list);
            }
        } catch (Throwable th2) {
            dVar = th2;
        }
        if (dVar != null) {
            s6.a.e(th, dVar);
        }
        return z3;
    }

    public static long u(long j7) {
        if (j7 < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j7 > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j7;
    }

    public static v6.d u0(int i, int i8) {
        if (i8 > Integer.MIN_VALUE) {
            return new v6.d(i, i8 - 1, 1);
        }
        v6.d dVar = v6.d.f7499g;
        return v6.d.f7499g;
    }

    public static int v(m0 m0Var, w4.u uVar, View view, View view2, d0 d0Var, boolean z3) {
        if (d0Var.q() == 0 || m0Var.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return Math.abs(d0.A(view) - d0.A(view2)) + 1;
        }
        return Math.min(uVar.o(), uVar.c(view2) - uVar.f(view));
    }

    public static ActionMode.Callback v0(ActionMode.Callback callback) {
        return (!(callback instanceof u3.h) || Build.VERSION.SDK_INT < 26) ? callback : ((u3.h) callback).f7375a;
    }

    public static int w(m0 m0Var, w4.u uVar, View view, View view2, d0 d0Var, boolean z3, boolean z7) {
        if (d0Var.q() == 0 || m0Var.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z7 ? Math.max(0, (m0Var.a() - Math.max(d0.A(view), d0.A(view2))) - 1) : Math.max(0, Math.min(d0.A(view), d0.A(view2)));
        if (z3) {
            return Math.round((max * (Math.abs(uVar.c(view2) - uVar.f(view)) / (Math.abs(d0.A(view) - d0.A(view2)) + 1))) + (uVar.m() - uVar.f(view)));
        }
        return max;
    }

    public static int x(m0 m0Var, w4.u uVar, View view, View view2, d0 d0Var, boolean z3) {
        if (d0Var.q() == 0 || m0Var.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return m0Var.a();
        }
        return (int) (((uVar.c(view2) - uVar.f(view)) / (Math.abs(d0.A(view) - d0.A(view2)) + 1)) * m0Var.a());
    }

    public static y0.m x0(y0.m mVar, t.u0 u0Var) {
        return androidx.compose.foundation.a.f(mVar, u0Var, u.j0.f7027d, true, null, u0Var.f6869c, true, null).d(new ScrollingLayoutElement(u0Var));
    }

    public static r y(int i) {
        return i != 0 ? i != 1 ? new w5.l() : new w5.e() : new w5.l();
    }

    public static ActionMode.Callback y0(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof u3.h) || callback == null) ? callback : new u3.h(callback, textView);
    }

    public static final long z(long j7) {
        long j8 = (j7 << 1) + 1;
        int i = z6.a.f9288f;
        int i8 = z6.b.f9289a;
        return j8;
    }

    public abstract int F();

    public abstract int G();

    public abstract int H();

    public abstract int I();

    public abstract int J(View view);

    public abstract int K(CoordinatorLayout coordinatorLayout);

    public abstract int O();

    public abstract boolean T(float f6);

    public abstract boolean V(View view);

    public abstract boolean W(float f6, float f8);

    public abstract void e0(v2.f fVar, v2.f fVar2);

    public abstract void i0(v2.f fVar, Thread thread);

    public abstract int k(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float l(int i);

    public abstract boolean m(v2.g gVar, v2.c cVar);

    public abstract boolean n(v2.g gVar, Object obj, Object obj2);

    public abstract boolean o(v2.g gVar, v2.f fVar, v2.f fVar2);

    public abstract boolean o0(View view, float f6);

    public abstract void w0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i8);
}
