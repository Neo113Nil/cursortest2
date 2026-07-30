package defpackage;

import android.graphics.PointF;
import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.regex.Matcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fx0 {
    public static final fx0 a = new fx0();

    private final void C(sc1 sc1Var, SelectGesture selectGesture, gv2 gv2Var) {
        if (gv2Var != null) {
            long z = o70.z(sc1Var, bd3.L(selectGesture.getSelectionArea()), G(selectGesture.getGranularity()));
            sc1 sc1Var2 = gv2Var.d;
            if (sc1Var2 != null) {
                sc1Var2.f(z);
            }
            sc1 sc1Var3 = gv2Var.d;
            if (sc1Var3 != null) {
                sc1Var3.e(jw2.b);
            }
            if (jw2.b(z)) {
                return;
            }
            gv2Var.p(false);
            gv2Var.n(zw0.m);
        }
    }

    private final void D(yy2 yy2Var, SelectGesture selectGesture, dw2 dw2Var) {
        bd3.L(selectGesture.getSelectionArea());
        G(selectGesture.getGranularity());
        throw null;
    }

    private final void E(sc1 sc1Var, SelectRangeGesture selectRangeGesture, gv2 gv2Var) {
        if (gv2Var != null) {
            long n = o70.n(sc1Var, bd3.L(selectRangeGesture.getSelectionStartArea()), bd3.L(selectRangeGesture.getSelectionEndArea()), G(selectRangeGesture.getGranularity()));
            sc1 sc1Var2 = gv2Var.d;
            if (sc1Var2 != null) {
                sc1Var2.f(n);
            }
            sc1 sc1Var3 = gv2Var.d;
            if (sc1Var3 != null) {
                sc1Var3.e(jw2.b);
            }
            if (jw2.b(n)) {
                return;
            }
            gv2Var.p(false);
            gv2Var.n(zw0.m);
        }
    }

    private final void F(yy2 yy2Var, SelectRangeGesture selectRangeGesture, dw2 dw2Var) {
        bd3.L(selectRangeGesture.getSelectionStartArea());
        bd3.L(selectRangeGesture.getSelectionEndArea());
        G(selectRangeGesture.getGranularity());
        throw null;
    }

    private final int G(int i) {
        return i != 1 ? 0 : 1;
    }

    private final int a(yy2 yy2Var, HandwritingGesture handwritingGesture) {
        throw null;
    }

    private final int b(HandwritingGesture handwritingGesture, Function1<? super pf0, Unit> function1) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        function1.invoke(new yw(fallbackText, 1));
        return 5;
    }

    private final int c(sc1 sc1Var, DeleteGesture deleteGesture, yd ydVar, Function1<? super pf0, Unit> function1) {
        int G = G(deleteGesture.getGranularity());
        long z = o70.z(sc1Var, bd3.L(deleteGesture.getDeletionArea()), G);
        if (jw2.b(z)) {
            return a.b(deleteGesture, function1);
        }
        h(z, ydVar, G == 1, function1);
        return 1;
    }

    private final int d(yy2 yy2Var, DeleteGesture deleteGesture, dw2 dw2Var) {
        G(deleteGesture.getGranularity());
        bd3.L(deleteGesture.getDeletionArea());
        throw null;
    }

    private final int e(sc1 sc1Var, DeleteRangeGesture deleteRangeGesture, yd ydVar, Function1<? super pf0, Unit> function1) {
        int G = G(deleteRangeGesture.getGranularity());
        long n = o70.n(sc1Var, bd3.L(deleteRangeGesture.getDeletionStartArea()), bd3.L(deleteRangeGesture.getDeletionEndArea()), G);
        if (jw2.b(n)) {
            return a.b(deleteRangeGesture, function1);
        }
        h(n, ydVar, G == 1, function1);
        return 1;
    }

    private final int f(yy2 yy2Var, DeleteRangeGesture deleteRangeGesture, dw2 dw2Var) {
        G(deleteRangeGesture.getGranularity());
        bd3.L(deleteRangeGesture.getDeletionStartArea());
        bd3.L(deleteRangeGesture.getDeletionEndArea());
        throw null;
    }

    private final void g(yy2 yy2Var, long j, boolean z) {
        if (!z) {
            throw null;
        }
        throw null;
    }

    private final void h(long j, yd ydVar, boolean z, Function1<? super pf0, Unit> function1) {
        if (z) {
            int i = jw2.c;
            int i2 = (int) (j >> 32);
            int i3 = (int) (j & 4294967295L);
            int codePointBefore = i2 > 0 ? Character.codePointBefore(ydVar, i2) : 10;
            int codePointAt = i3 < ydVar.n.length() ? Character.codePointAt(ydVar, i3) : 10;
            if (o70.E(codePointBefore) && (o70.D(codePointAt) || o70.C(codePointAt))) {
                do {
                    i2 -= Character.charCount(codePointBefore);
                    if (i2 == 0) {
                        break;
                    } else {
                        codePointBefore = Character.codePointBefore(ydVar, i2);
                    }
                } while (o70.E(codePointBefore));
                j = th2.a(i2, i3);
            } else if (o70.E(codePointAt) && (o70.D(codePointBefore) || o70.C(codePointBefore))) {
                do {
                    i3 += Character.charCount(codePointAt);
                    if (i3 == ydVar.n.length()) {
                        break;
                    } else {
                        codePointAt = Character.codePointAt(ydVar, i3);
                    }
                } while (o70.E(codePointAt));
                j = th2.a(i2, i3);
            }
        }
        int i4 = (int) (j & 4294967295L);
        function1.invoke(new gx0(new pf0[]{new nj2(i4, i4), new w90(jw2.c(j), 0)}));
    }

    private final int k(sc1 sc1Var, InsertGesture insertGesture, g53 g53Var, Function1<? super pf0, Unit> function1) {
        int i;
        cw2 d;
        long v;
        int y;
        if (g53Var == null) {
            return b(insertGesture, function1);
        }
        PointF insertionPoint = insertGesture.getInsertionPoint();
        long i2 = ap.i(insertionPoint.x, insertionPoint.y);
        cw2 d2 = sc1Var.d();
        if (d2 != null) {
            sm1 sm1Var = d2.a.b;
            t81 c = sc1Var.c();
            if (c != null && (y = o70.y(sm1Var, (v = c.v(i2)), g53Var)) != -1) {
                i = sm1Var.e(au1.a(v, (sm1Var.b(y) + sm1Var.d(y)) / 2.0f, 1));
                if (i != -1 || ((d = sc1Var.d()) != null && o70.o(d.a, i))) {
                    return b(insertGesture, function1);
                }
                m(i, insertGesture.getTextToInsert(), function1);
                return 1;
            }
        }
        i = -1;
        if (i != -1) {
        }
        return b(insertGesture, function1);
    }

    private final int l(yy2 yy2Var, InsertGesture insertGesture, dw2 dw2Var, g53 g53Var) {
        PointF insertionPoint = insertGesture.getInsertionPoint();
        ap.i(insertionPoint.x, insertionPoint.y);
        throw null;
    }

    private final void m(int i, String str, Function1<? super pf0, Unit> function1) {
        function1.invoke(new gx0(new pf0[]{new nj2(i, i), new yw(str, 1)}));
    }

    private final int n(sc1 sc1Var, JoinOrSplitGesture joinOrSplitGesture, yd ydVar, g53 g53Var, Function1<? super pf0, Unit> function1) {
        int i;
        cw2 d;
        long v;
        int y;
        if (g53Var == null) {
            return b(joinOrSplitGesture, function1);
        }
        PointF joinOrSplitPoint = joinOrSplitGesture.getJoinOrSplitPoint();
        long i2 = ap.i(joinOrSplitPoint.x, joinOrSplitPoint.y);
        cw2 d2 = sc1Var.d();
        if (d2 != null) {
            sm1 sm1Var = d2.a.b;
            t81 c = sc1Var.c();
            if (c != null && (y = o70.y(sm1Var, (v = c.v(i2)), g53Var)) != -1) {
                i = sm1Var.e(au1.a(v, (sm1Var.b(y) + sm1Var.d(y)) / 2.0f, 1));
                if (i != -1 || ((d = sc1Var.d()) != null && o70.o(d.a, i))) {
                    return b(joinOrSplitGesture, function1);
                }
                int i3 = i;
                while (i3 > 0) {
                    int codePointBefore = Character.codePointBefore(ydVar, i3);
                    if (!o70.D(codePointBefore)) {
                        break;
                    }
                    i3 -= Character.charCount(codePointBefore);
                }
                while (i < ydVar.n.length()) {
                    int codePointAt = Character.codePointAt(ydVar, i);
                    if (!o70.D(codePointAt)) {
                        break;
                    }
                    i += Character.charCount(codePointAt);
                }
                long a2 = th2.a(i3, i);
                if (jw2.b(a2)) {
                    m((int) (a2 >> 32), " ", function1);
                    return 1;
                }
                h(a2, ydVar, false, function1);
                return 1;
            }
        }
        i = -1;
        if (i != -1) {
        }
        return b(joinOrSplitGesture, function1);
    }

    private final int o(yy2 yy2Var, JoinOrSplitGesture joinOrSplitGesture, dw2 dw2Var, g53 g53Var) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int p(sc1 sc1Var, RemoveSpaceGesture removeSpaceGesture, yd ydVar, g53 g53Var, Function1<? super pf0, Unit> function1) {
        long j;
        int i;
        String sb;
        int i2;
        cw2 d = sc1Var.d();
        bw2 bw2Var = d != null ? d.a : null;
        PointF startPoint = removeSpaceGesture.getStartPoint();
        long i3 = ap.i(startPoint.x, startPoint.y);
        PointF endPoint = removeSpaceGesture.getEndPoint();
        long i4 = ap.i(endPoint.x, endPoint.y);
        t81 c = sc1Var.c();
        int i5 = 0;
        if (bw2Var != null) {
            sm1 sm1Var = bw2Var.b;
            if (c != null) {
                long v = c.v(i3);
                long v2 = c.v(i4);
                int y = o70.y(sm1Var, v, g53Var);
                int y2 = o70.y(sm1Var, v2, g53Var);
                if (y != -1) {
                    if (y2 != -1) {
                        y = Math.min(y, y2);
                    }
                    y2 = y;
                } else if (y2 == -1) {
                    j = jw2.b;
                    if (jw2.b(j)) {
                        return a.b(removeSpaceGesture, function1);
                    }
                    a82 a82Var = new a82();
                    a82Var.m = -1;
                    a82 a82Var2 = new a82();
                    a82Var2.m = -1;
                    String str = ydVar.subSequence(jw2.e(j), jw2.d(j)).n;
                    Regex regex = new Regex("\\s+");
                    p8 p8Var = new p8(19, a82Var, a82Var2);
                    str.getClass();
                    Matcher matcher = regex.m.matcher(str);
                    matcher.getClass();
                    oi1 oi1Var = !matcher.find(0) ? null : new oi1(matcher, str);
                    if (oi1Var == null) {
                        sb = str.toString();
                        i = 0;
                    } else {
                        int length = str.length();
                        StringBuilder sb2 = new StringBuilder(length);
                        int i6 = 0;
                        while (true) {
                            sb2.append((CharSequence) str, i6, oi1Var.a().m);
                            p8Var.invoke(oi1Var);
                            sb2.append((CharSequence) BuildConfig.FLAVOR);
                            i6 = oi1Var.a().n + 1;
                            CharSequence charSequence = oi1Var.b;
                            Matcher matcher2 = oi1Var.a;
                            i = i5;
                            int end = matcher2.end() + (matcher2.end() == matcher2.start() ? 1 : i);
                            if (end <= charSequence.length()) {
                                Matcher matcher3 = matcher2.pattern().matcher(charSequence);
                                matcher3.getClass();
                                if (matcher3.find(end)) {
                                    oi1Var = new oi1(matcher3, charSequence);
                                    if (i6 >= length || oi1Var == null) {
                                        break;
                                    }
                                    i5 = i;
                                }
                            }
                            oi1Var = null;
                            if (i6 >= length) {
                                break;
                            }
                            break;
                        }
                        if (i6 < length) {
                            sb2.append((CharSequence) str, i6, length);
                        }
                        sb = sb2.toString();
                    }
                    int i7 = a82Var.m;
                    if (i7 == -1 || (i2 = a82Var2.m) == -1) {
                        return b(removeSpaceGesture, function1);
                    }
                    int i8 = (int) (j >> 32);
                    String substring = sb.substring(i7, sb.length() - (jw2.c(j) - a82Var2.m));
                    nj2 nj2Var = new nj2(i8 + i7, i8 + i2);
                    yw ywVar = new yw(substring, 1);
                    pf0[] pf0VarArr = new pf0[2];
                    pf0VarArr[i] = nj2Var;
                    pf0VarArr[1] = ywVar;
                    function1.invoke(new gx0(pf0VarArr));
                    return 1;
                }
                float b = (sm1Var.b(y2) + sm1Var.d(y2)) / 2.0f;
                j = sm1Var.f(new w72(Math.min(au1.d(v), au1.d(v2)), b - 0.1f, Math.max(au1.d(v), au1.d(v2)), b + 0.1f), 0, by1.D);
                if (jw2.b(j)) {
                }
            }
        }
        j = jw2.b;
        if (jw2.b(j)) {
        }
    }

    private final int q(yy2 yy2Var, RemoveSpaceGesture removeSpaceGesture, dw2 dw2Var, g53 g53Var) {
        throw null;
    }

    private final int r(sc1 sc1Var, SelectGesture selectGesture, gv2 gv2Var, Function1<? super pf0, Unit> function1) {
        long z = o70.z(sc1Var, bd3.L(selectGesture.getSelectionArea()), G(selectGesture.getGranularity()));
        if (jw2.b(z)) {
            return a.b(selectGesture, function1);
        }
        v(z, gv2Var, function1);
        return 1;
    }

    private final int s(yy2 yy2Var, SelectGesture selectGesture, dw2 dw2Var) {
        bd3.L(selectGesture.getSelectionArea());
        G(selectGesture.getGranularity());
        throw null;
    }

    private final int t(sc1 sc1Var, SelectRangeGesture selectRangeGesture, gv2 gv2Var, Function1<? super pf0, Unit> function1) {
        long n = o70.n(sc1Var, bd3.L(selectRangeGesture.getSelectionStartArea()), bd3.L(selectRangeGesture.getSelectionEndArea()), G(selectRangeGesture.getGranularity()));
        if (jw2.b(n)) {
            return a.b(selectRangeGesture, function1);
        }
        v(n, gv2Var, function1);
        return 1;
    }

    private final int u(yy2 yy2Var, SelectRangeGesture selectRangeGesture, dw2 dw2Var) {
        bd3.L(selectRangeGesture.getSelectionStartArea());
        bd3.L(selectRangeGesture.getSelectionEndArea());
        G(selectRangeGesture.getGranularity());
        throw null;
    }

    private final void v(long j, gv2 gv2Var, Function1<? super pf0, Unit> function1) {
        int i = jw2.c;
        function1.invoke(new nj2((int) (j >> 32), (int) (j & 4294967295L)));
        if (gv2Var != null) {
            gv2Var.f(true);
        }
    }

    private final void w(sc1 sc1Var, DeleteGesture deleteGesture, gv2 gv2Var) {
        if (gv2Var != null) {
            long z = o70.z(sc1Var, bd3.L(deleteGesture.getDeletionArea()), G(deleteGesture.getGranularity()));
            sc1 sc1Var2 = gv2Var.d;
            if (sc1Var2 != null) {
                sc1Var2.e(z);
            }
            sc1 sc1Var3 = gv2Var.d;
            if (sc1Var3 != null) {
                sc1Var3.f(jw2.b);
            }
            if (jw2.b(z)) {
                return;
            }
            gv2Var.p(false);
            gv2Var.n(zw0.m);
        }
    }

    private final void x(yy2 yy2Var, DeleteGesture deleteGesture, dw2 dw2Var) {
        bd3.L(deleteGesture.getDeletionArea());
        G(deleteGesture.getGranularity());
        throw null;
    }

    private final void y(sc1 sc1Var, DeleteRangeGesture deleteRangeGesture, gv2 gv2Var) {
        if (gv2Var != null) {
            long n = o70.n(sc1Var, bd3.L(deleteRangeGesture.getDeletionStartArea()), bd3.L(deleteRangeGesture.getDeletionEndArea()), G(deleteRangeGesture.getGranularity()));
            sc1 sc1Var2 = gv2Var.d;
            if (sc1Var2 != null) {
                sc1Var2.e(n);
            }
            sc1 sc1Var3 = gv2Var.d;
            if (sc1Var3 != null) {
                sc1Var3.f(jw2.b);
            }
            if (jw2.b(n)) {
                return;
            }
            gv2Var.p(false);
            gv2Var.n(zw0.m);
        }
    }

    private final void z(yy2 yy2Var, DeleteRangeGesture deleteRangeGesture, dw2 dw2Var) {
        bd3.L(deleteRangeGesture.getDeletionStartArea());
        bd3.L(deleteRangeGesture.getDeletionEndArea());
        G(deleteRangeGesture.getGranularity());
        throw null;
    }

    public final boolean A(sc1 sc1Var, PreviewableHandwritingGesture previewableHandwritingGesture, gv2 gv2Var, CancellationSignal cancellationSignal) {
        aw2 aw2Var;
        yd ydVar = sc1Var.j;
        if (ydVar == null) {
            return false;
        }
        cw2 d = sc1Var.d();
        if (!ydVar.equals((d == null || (aw2Var = d.a.a) == null) ? null : aw2Var.a)) {
            return false;
        }
        if (dm0.l(previewableHandwritingGesture)) {
            C(sc1Var, dm0.f(previewableHandwritingGesture), gv2Var);
        } else if (dm0.o(previewableHandwritingGesture)) {
            w(sc1Var, dm0.a(previewableHandwritingGesture), gv2Var);
        } else if (dm0.p(previewableHandwritingGesture)) {
            E(sc1Var, dm0.g(previewableHandwritingGesture), gv2Var);
        } else {
            if (!dm0.q(previewableHandwritingGesture)) {
                return false;
            }
            y(sc1Var, dm0.b(previewableHandwritingGesture), gv2Var);
        }
        int i = 1;
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new mz(i, gv2Var));
        }
        return true;
    }

    public final boolean B(yy2 yy2Var, PreviewableHandwritingGesture previewableHandwritingGesture, dw2 dw2Var, CancellationSignal cancellationSignal) {
        if (dm0.l(previewableHandwritingGesture)) {
            D(yy2Var, dm0.f(previewableHandwritingGesture), dw2Var);
        } else if (dm0.o(previewableHandwritingGesture)) {
            x(yy2Var, dm0.a(previewableHandwritingGesture), dw2Var);
        } else if (dm0.p(previewableHandwritingGesture)) {
            F(yy2Var, dm0.g(previewableHandwritingGesture), dw2Var);
        } else {
            if (!dm0.q(previewableHandwritingGesture)) {
                return false;
            }
            z(yy2Var, dm0.b(previewableHandwritingGesture), dw2Var);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new ex0());
        return true;
    }

    public final int i(sc1 sc1Var, HandwritingGesture handwritingGesture, gv2 gv2Var, g53 g53Var, Function1<? super pf0, Unit> function1) {
        aw2 aw2Var;
        yd ydVar = sc1Var.j;
        if (ydVar == null) {
            return 3;
        }
        cw2 d = sc1Var.d();
        if (!ydVar.equals((d == null || (aw2Var = d.a.a) == null) ? null : aw2Var.a)) {
            return 3;
        }
        if (dm0.l(handwritingGesture)) {
            return r(sc1Var, dm0.f(handwritingGesture), gv2Var, function1);
        }
        if (dm0.o(handwritingGesture)) {
            return c(sc1Var, dm0.a(handwritingGesture), ydVar, function1);
        }
        if (dm0.p(handwritingGesture)) {
            return t(sc1Var, dm0.g(handwritingGesture), gv2Var, function1);
        }
        if (dm0.q(handwritingGesture)) {
            return e(sc1Var, dm0.b(handwritingGesture), ydVar, function1);
        }
        if (dm0.n(handwritingGesture)) {
            return n(sc1Var, dm0.d(handwritingGesture), ydVar, g53Var, function1);
        }
        if (dm0.r(handwritingGesture)) {
            return k(sc1Var, dm0.c(handwritingGesture), g53Var, function1);
        }
        if (dm0.m(handwritingGesture)) {
            return p(sc1Var, dm0.e(handwritingGesture), ydVar, g53Var, function1);
        }
        return 2;
    }

    public final int j(yy2 yy2Var, HandwritingGesture handwritingGesture, dw2 dw2Var, g53 g53Var) {
        if (dm0.l(handwritingGesture)) {
            return s(yy2Var, dm0.f(handwritingGesture), dw2Var);
        }
        if (dm0.o(handwritingGesture)) {
            return d(yy2Var, dm0.a(handwritingGesture), dw2Var);
        }
        if (dm0.p(handwritingGesture)) {
            return u(yy2Var, dm0.g(handwritingGesture), dw2Var);
        }
        if (dm0.q(handwritingGesture)) {
            return f(yy2Var, dm0.b(handwritingGesture), dw2Var);
        }
        if (dm0.n(handwritingGesture)) {
            return o(yy2Var, dm0.d(handwritingGesture), dw2Var, g53Var);
        }
        if (dm0.r(handwritingGesture)) {
            return l(yy2Var, dm0.c(handwritingGesture), dw2Var, g53Var);
        }
        if (dm0.m(handwritingGesture)) {
            return q(yy2Var, dm0.e(handwritingGesture), dw2Var, g53Var);
        }
        return 2;
    }
}
