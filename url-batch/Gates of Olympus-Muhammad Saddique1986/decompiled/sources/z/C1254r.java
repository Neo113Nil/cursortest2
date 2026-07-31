package z;

import B.a0;
import C0.C0031g;
import C0.G;
import C0.H;
import C0.J;
import D0.AbstractC0063a;
import I0.C0188a;
import I0.C0194g;
import a0.C0238c;
import a0.C0239d;
import android.graphics.PointF;
import android.graphics.RectF;
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
import b0.M;
import e2.InterfaceC0424c;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n.t0;
import r0.InterfaceC0919p;
import u0.O0;
import x.F;
import x.Q;
import x.p0;

/* renamed from: z.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1254r {

    /* renamed from: a, reason: collision with root package name */
    public static final C1254r f10463a = new C1254r();

    private final void C(Q q3, SelectGesture selectGesture, a0 a0Var) {
        RectF selectionArea;
        int granularity;
        if (a0Var != null) {
            selectionArea = selectGesture.getSelectionArea();
            C0239d F3 = M.F(selectionArea);
            granularity = selectGesture.getGranularity();
            long n3 = t0.n(q3, F3, G(granularity));
            Q q4 = a0Var.f345d;
            if (q4 != null) {
                q4.f(n3);
            }
            Q q5 = a0Var.f345d;
            if (q5 != null) {
                q5.e(J.f567b);
            }
            if (J.b(n3)) {
                return;
            }
            a0Var.p(false);
            a0Var.n(F.f9944d);
        }
    }

    private final void D(AbstractC1236D abstractC1236D, SelectGesture selectGesture, AbstractC1235C abstractC1235C) {
        RectF selectionArea;
        int granularity;
        selectionArea = selectGesture.getSelectionArea();
        M.F(selectionArea);
        granularity = selectGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final void E(Q q3, SelectRangeGesture selectRangeGesture, a0 a0Var) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        if (a0Var != null) {
            selectionStartArea = selectRangeGesture.getSelectionStartArea();
            C0239d F3 = M.F(selectionStartArea);
            selectionEndArea = selectRangeGesture.getSelectionEndArea();
            C0239d F4 = M.F(selectionEndArea);
            granularity = selectRangeGesture.getGranularity();
            long c2 = t0.c(q3, F3, F4, G(granularity));
            Q q4 = a0Var.f345d;
            if (q4 != null) {
                q4.f(c2);
            }
            Q q5 = a0Var.f345d;
            if (q5 != null) {
                q5.e(J.f567b);
            }
            if (J.b(c2)) {
                return;
            }
            a0Var.p(false);
            a0Var.n(F.f9944d);
        }
    }

    private final void F(AbstractC1236D abstractC1236D, SelectRangeGesture selectRangeGesture, AbstractC1235C abstractC1235C) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        M.F(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        M.F(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final int G(int i3) {
        return i3 != 1 ? 0 : 1;
    }

    private final int a(AbstractC1236D abstractC1236D, HandwritingGesture handwritingGesture) {
        throw null;
    }

    private final int b(HandwritingGesture handwritingGesture, InterfaceC0424c interfaceC0424c) {
        String fallbackText;
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        interfaceC0424c.n(new C0188a(fallbackText, 1));
        return 5;
    }

    private final int c(Q q3, DeleteGesture deleteGesture, C0031g c0031g, InterfaceC0424c interfaceC0424c) {
        int granularity;
        RectF deletionArea;
        granularity = deleteGesture.getGranularity();
        int G3 = G(granularity);
        deletionArea = deleteGesture.getDeletionArea();
        long n3 = t0.n(q3, M.F(deletionArea), G3);
        if (J.b(n3)) {
            return f10463a.b(AbstractC1251o.i(deleteGesture), interfaceC0424c);
        }
        h(n3, c0031g, G3 == 1, interfaceC0424c);
        return 1;
    }

    private final int d(AbstractC1236D abstractC1236D, DeleteGesture deleteGesture, AbstractC1235C abstractC1235C) {
        int granularity;
        RectF deletionArea;
        granularity = deleteGesture.getGranularity();
        G(granularity);
        deletionArea = deleteGesture.getDeletionArea();
        M.F(deletionArea);
        throw null;
    }

    private final int e(Q q3, DeleteRangeGesture deleteRangeGesture, C0031g c0031g, InterfaceC0424c interfaceC0424c) {
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        granularity = deleteRangeGesture.getGranularity();
        int G3 = G(granularity);
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        C0239d F3 = M.F(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        long c2 = t0.c(q3, F3, M.F(deletionEndArea), G3);
        if (J.b(c2)) {
            return f10463a.b(AbstractC1251o.i(deleteRangeGesture), interfaceC0424c);
        }
        h(c2, c0031g, G3 == 1, interfaceC0424c);
        return 1;
    }

    private final int f(AbstractC1236D abstractC1236D, DeleteRangeGesture deleteRangeGesture, AbstractC1235C abstractC1235C) {
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        granularity = deleteRangeGesture.getGranularity();
        G(granularity);
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        M.F(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        M.F(deletionEndArea);
        throw null;
    }

    private final void g(AbstractC1236D abstractC1236D, long j3, boolean z3) {
        if (!z3) {
            throw null;
        }
        throw null;
    }

    private final void h(long j3, C0031g c0031g, boolean z3, InterfaceC0424c interfaceC0424c) {
        if (z3) {
            int i3 = J.f568c;
            int i4 = (int) (j3 >> 32);
            int i5 = (int) (j3 & 4294967295L);
            int codePointBefore = i4 > 0 ? Character.codePointBefore(c0031g, i4) : 10;
            int codePointAt = i5 < c0031g.f596a.length() ? Character.codePointAt(c0031g, i5) : 10;
            if (t0.q(codePointBefore) && (t0.p(codePointAt) || t0.o(codePointAt))) {
                do {
                    i4 -= Character.charCount(codePointBefore);
                    if (i4 == 0) {
                        break;
                    } else {
                        codePointBefore = Character.codePointBefore(c0031g, i4);
                    }
                } while (t0.q(codePointBefore));
                j3 = O2.l.J(i4, i5);
            } else if (t0.q(codePointAt) && (t0.p(codePointBefore) || t0.o(codePointBefore))) {
                do {
                    i5 += Character.charCount(codePointAt);
                    if (i5 == c0031g.f596a.length()) {
                        break;
                    } else {
                        codePointAt = Character.codePointAt(c0031g, i5);
                    }
                } while (t0.q(codePointAt));
                j3 = O2.l.J(i4, i5);
            }
        }
        int i6 = (int) (4294967295L & j3);
        interfaceC0424c.n(new C1255s(new I0.i[]{new I0.y(i6, i6), new C0194g(J.c(j3), 0)}));
    }

    private final int k(Q q3, InsertGesture insertGesture, O0 o02, InterfaceC0424c interfaceC0424c) {
        PointF insertionPoint;
        int i3;
        p0 d3;
        String textToInsert;
        long n3;
        int l3;
        if (o02 == null) {
            return b(AbstractC1251o.i(insertGesture), interfaceC0424c);
        }
        insertionPoint = insertGesture.getInsertionPoint();
        long e3 = l0.c.e(insertionPoint.x, insertionPoint.y);
        p0 d4 = q3.d();
        if (d4 != null) {
            C0.o oVar = d4.f10230a.f558b;
            InterfaceC0919p c2 = q3.c();
            if (c2 != null && (l3 = t0.l(oVar, (n3 = c2.n(e3)), o02)) != -1) {
                i3 = oVar.e(C0238c.a(n3, (oVar.b(l3) + oVar.d(l3)) / 2.0f, 1));
                if (i3 != -1 || ((d3 = q3.d()) != null && t0.d(d3.f10230a, i3))) {
                    return b(AbstractC1251o.i(insertGesture), interfaceC0424c);
                }
                textToInsert = insertGesture.getTextToInsert();
                m(i3, textToInsert, interfaceC0424c);
                return 1;
            }
        }
        i3 = -1;
        if (i3 != -1) {
        }
        return b(AbstractC1251o.i(insertGesture), interfaceC0424c);
    }

    private final int l(AbstractC1236D abstractC1236D, InsertGesture insertGesture, AbstractC1235C abstractC1235C, O0 o02) {
        PointF insertionPoint;
        insertionPoint = insertGesture.getInsertionPoint();
        l0.c.e(insertionPoint.x, insertionPoint.y);
        throw null;
    }

    private final void m(int i3, String str, InterfaceC0424c interfaceC0424c) {
        interfaceC0424c.n(new C1255s(new I0.i[]{new I0.y(i3, i3), new C0188a(str, 1)}));
    }

    private final int n(Q q3, JoinOrSplitGesture joinOrSplitGesture, C0031g c0031g, O0 o02, InterfaceC0424c interfaceC0424c) {
        PointF joinOrSplitPoint;
        int i3;
        p0 d3;
        long n3;
        int l3;
        if (o02 == null) {
            return b(AbstractC1251o.i(joinOrSplitGesture), interfaceC0424c);
        }
        joinOrSplitPoint = joinOrSplitGesture.getJoinOrSplitPoint();
        long e3 = l0.c.e(joinOrSplitPoint.x, joinOrSplitPoint.y);
        p0 d4 = q3.d();
        if (d4 != null) {
            C0.o oVar = d4.f10230a.f558b;
            InterfaceC0919p c2 = q3.c();
            if (c2 != null && (l3 = t0.l(oVar, (n3 = c2.n(e3)), o02)) != -1) {
                i3 = oVar.e(C0238c.a(n3, (oVar.b(l3) + oVar.d(l3)) / 2.0f, 1));
                if (i3 != -1 || ((d3 = q3.d()) != null && t0.d(d3.f10230a, i3))) {
                    return b(AbstractC1251o.i(joinOrSplitGesture), interfaceC0424c);
                }
                int i4 = i3;
                while (i4 > 0) {
                    int codePointBefore = Character.codePointBefore(c0031g, i4);
                    if (!t0.p(codePointBefore)) {
                        break;
                    }
                    i4 -= Character.charCount(codePointBefore);
                }
                while (i3 < c0031g.f596a.length()) {
                    int codePointAt = Character.codePointAt(c0031g, i3);
                    if (!t0.p(codePointAt)) {
                        break;
                    }
                    i3 += Character.charCount(codePointAt);
                }
                long J3 = O2.l.J(i4, i3);
                if (J.b(J3)) {
                    m((int) (J3 >> 32), " ", interfaceC0424c);
                } else {
                    h(J3, c0031g, false, interfaceC0424c);
                }
                return 1;
            }
        }
        i3 = -1;
        if (i3 != -1) {
        }
        return b(AbstractC1251o.i(joinOrSplitGesture), interfaceC0424c);
    }

    private final int o(AbstractC1236D abstractC1236D, JoinOrSplitGesture joinOrSplitGesture, AbstractC1235C abstractC1235C, O0 o02) {
        throw null;
    }

    private final int p(Q q3, RemoveSpaceGesture removeSpaceGesture, C0031g c0031g, O0 o02, InterfaceC0424c interfaceC0424c) {
        PointF startPoint;
        PointF endPoint;
        long j3;
        int i3;
        int i4;
        int i5;
        String sb;
        p0 d3 = q3.d();
        H h3 = d3 != null ? d3.f10230a : null;
        startPoint = removeSpaceGesture.getStartPoint();
        long e3 = l0.c.e(startPoint.x, startPoint.y);
        endPoint = removeSpaceGesture.getEndPoint();
        long e4 = l0.c.e(endPoint.x, endPoint.y);
        InterfaceC0919p c2 = q3.c();
        if (h3 == null || c2 == null) {
            j3 = J.f567b;
        } else {
            long n3 = c2.n(e3);
            long n4 = c2.n(e4);
            C0.o oVar = h3.f558b;
            int l3 = t0.l(oVar, n3, o02);
            int l4 = t0.l(oVar, n4, o02);
            if (l3 != -1) {
                if (l4 != -1) {
                    l3 = Math.min(l3, l4);
                }
                l4 = l3;
            } else if (l4 == -1) {
                j3 = J.f567b;
            }
            float b3 = (oVar.b(l4) + oVar.d(l4)) / 2;
            j3 = oVar.f(new C0239d(Math.min(C0238c.d(n3), C0238c.d(n4)), b3 - 0.1f, Math.max(C0238c.d(n3), C0238c.d(n4)), b3 + 0.1f), 0, C0.F.f545a);
        }
        if (J.b(j3)) {
            return f10463a.b(AbstractC1251o.i(removeSpaceGesture), interfaceC0424c);
        }
        C0031g subSequence = c0031g.subSequence(J.e(j3), J.d(j3));
        Pattern compile = Pattern.compile("\\s+");
        f2.j.e(compile, "compile(...)");
        String str = subSequence.f596a;
        f2.j.f(str, "input");
        Matcher matcher = compile.matcher(str);
        f2.j.e(matcher, "matcher(...)");
        C1256t c1256t = !matcher.find(0) ? null : new C1256t(matcher, str);
        if (c1256t == null) {
            sb = str.toString();
            i4 = -1;
            i3 = -1;
        } else {
            int length = str.length();
            StringBuilder sb2 = new StringBuilder(length);
            int i6 = 0;
            i3 = -1;
            while (true) {
                sb2.append((CharSequence) str, i6, c1256t.o().f6419d);
                if (i3 == -1) {
                    i3 = c1256t.o().f6419d;
                }
                i4 = c1256t.o().f6420e + 1;
                sb2.append((CharSequence) "");
                i5 = c1256t.o().f6420e + 1;
                Matcher matcher2 = (Matcher) c1256t.f10466e;
                int end = matcher2.end() + (matcher2.end() == matcher2.start() ? 1 : 0);
                String str2 = (String) c1256t.f10467f;
                if (end <= str2.length()) {
                    Matcher matcher3 = matcher2.pattern().matcher(str2);
                    f2.j.e(matcher3, "matcher(...)");
                    c1256t = !matcher3.find(end) ? null : new C1256t(matcher3, str2);
                } else {
                    c1256t = null;
                }
                if (i5 >= length || c1256t == null) {
                    break;
                }
                i6 = i5;
            }
            if (i5 < length) {
                sb2.append((CharSequence) str, i5, length);
            }
            sb = sb2.toString();
            f2.j.e(sb, "toString(...)");
        }
        if (i3 == -1 || i4 == -1) {
            return b(AbstractC1251o.i(removeSpaceGesture), interfaceC0424c);
        }
        int i7 = (int) (j3 >> 32);
        String substring = sb.substring(i3, sb.length() - (J.c(j3) - i4));
        f2.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        interfaceC0424c.n(new C1255s(new I0.i[]{new I0.y(i7 + i3, i7 + i4), new C0188a(substring, 1)}));
        return 1;
    }

    private final int q(AbstractC1236D abstractC1236D, RemoveSpaceGesture removeSpaceGesture, AbstractC1235C abstractC1235C, O0 o02) {
        throw null;
    }

    private final int r(Q q3, SelectGesture selectGesture, a0 a0Var, InterfaceC0424c interfaceC0424c) {
        RectF selectionArea;
        int granularity;
        selectionArea = selectGesture.getSelectionArea();
        C0239d F3 = M.F(selectionArea);
        granularity = selectGesture.getGranularity();
        long n3 = t0.n(q3, F3, G(granularity));
        if (J.b(n3)) {
            return f10463a.b(AbstractC1251o.i(selectGesture), interfaceC0424c);
        }
        v(n3, a0Var, interfaceC0424c);
        return 1;
    }

    private final int s(AbstractC1236D abstractC1236D, SelectGesture selectGesture, AbstractC1235C abstractC1235C) {
        RectF selectionArea;
        int granularity;
        selectionArea = selectGesture.getSelectionArea();
        M.F(selectionArea);
        granularity = selectGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final int t(Q q3, SelectRangeGesture selectRangeGesture, a0 a0Var, InterfaceC0424c interfaceC0424c) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        C0239d F3 = M.F(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        C0239d F4 = M.F(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        long c2 = t0.c(q3, F3, F4, G(granularity));
        if (J.b(c2)) {
            return f10463a.b(AbstractC1251o.i(selectRangeGesture), interfaceC0424c);
        }
        v(c2, a0Var, interfaceC0424c);
        return 1;
    }

    private final int u(AbstractC1236D abstractC1236D, SelectRangeGesture selectRangeGesture, AbstractC1235C abstractC1235C) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        M.F(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        M.F(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final void v(long j3, a0 a0Var, InterfaceC0424c interfaceC0424c) {
        int i3 = J.f568c;
        interfaceC0424c.n(new I0.y((int) (j3 >> 32), (int) (j3 & 4294967295L)));
        if (a0Var != null) {
            a0Var.f(true);
        }
    }

    private final void w(Q q3, DeleteGesture deleteGesture, a0 a0Var) {
        RectF deletionArea;
        int granularity;
        if (a0Var != null) {
            deletionArea = deleteGesture.getDeletionArea();
            C0239d F3 = M.F(deletionArea);
            granularity = deleteGesture.getGranularity();
            long n3 = t0.n(q3, F3, G(granularity));
            Q q4 = a0Var.f345d;
            if (q4 != null) {
                q4.e(n3);
            }
            Q q5 = a0Var.f345d;
            if (q5 != null) {
                q5.f(J.f567b);
            }
            if (J.b(n3)) {
                return;
            }
            a0Var.p(false);
            a0Var.n(F.f9944d);
        }
    }

    private final void x(AbstractC1236D abstractC1236D, DeleteGesture deleteGesture, AbstractC1235C abstractC1235C) {
        RectF deletionArea;
        int granularity;
        deletionArea = deleteGesture.getDeletionArea();
        M.F(deletionArea);
        granularity = deleteGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final void y(Q q3, DeleteRangeGesture deleteRangeGesture, a0 a0Var) {
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        if (a0Var != null) {
            deletionStartArea = deleteRangeGesture.getDeletionStartArea();
            C0239d F3 = M.F(deletionStartArea);
            deletionEndArea = deleteRangeGesture.getDeletionEndArea();
            C0239d F4 = M.F(deletionEndArea);
            granularity = deleteRangeGesture.getGranularity();
            long c2 = t0.c(q3, F3, F4, G(granularity));
            Q q4 = a0Var.f345d;
            if (q4 != null) {
                q4.e(c2);
            }
            Q q5 = a0Var.f345d;
            if (q5 != null) {
                q5.f(J.f567b);
            }
            if (J.b(c2)) {
                return;
            }
            a0Var.p(false);
            a0Var.n(F.f9944d);
        }
    }

    private final void z(AbstractC1236D abstractC1236D, DeleteRangeGesture deleteRangeGesture, AbstractC1235C abstractC1235C) {
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        M.F(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        M.F(deletionEndArea);
        granularity = deleteRangeGesture.getGranularity();
        G(granularity);
        throw null;
    }

    public final boolean A(Q q3, PreviewableHandwritingGesture previewableHandwritingGesture, a0 a0Var, CancellationSignal cancellationSignal) {
        G g3;
        C0031g c0031g = q3.f9984j;
        if (c0031g == null) {
            return false;
        }
        p0 d3 = q3.d();
        if (!c0031g.equals((d3 == null || (g3 = d3.f10230a.f557a) == null) ? null : g3.f547a)) {
            return false;
        }
        if (AbstractC1251o.q(previewableHandwritingGesture)) {
            C(q3, AbstractC1251o.k(previewableHandwritingGesture), a0Var);
        } else if (AbstractC0063a.q(previewableHandwritingGesture)) {
            w(q3, AbstractC0063a.g(previewableHandwritingGesture), a0Var);
        } else if (AbstractC0063a.v(previewableHandwritingGesture)) {
            E(q3, AbstractC0063a.k(previewableHandwritingGesture), a0Var);
        } else {
            if (!AbstractC0063a.x(previewableHandwritingGesture)) {
                return false;
            }
            y(q3, AbstractC0063a.h(previewableHandwritingGesture), a0Var);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new C1252p(0, a0Var));
        return true;
    }

    public final boolean B(AbstractC1236D abstractC1236D, PreviewableHandwritingGesture previewableHandwritingGesture, AbstractC1235C abstractC1235C, CancellationSignal cancellationSignal) {
        if (AbstractC1251o.q(previewableHandwritingGesture)) {
            D(abstractC1236D, AbstractC1251o.k(previewableHandwritingGesture), abstractC1235C);
        } else if (AbstractC0063a.q(previewableHandwritingGesture)) {
            x(abstractC1236D, AbstractC0063a.g(previewableHandwritingGesture), abstractC1235C);
        } else if (AbstractC0063a.v(previewableHandwritingGesture)) {
            F(abstractC1236D, AbstractC0063a.k(previewableHandwritingGesture), abstractC1235C);
        } else {
            if (!AbstractC0063a.x(previewableHandwritingGesture)) {
                return false;
            }
            z(abstractC1236D, AbstractC0063a.h(previewableHandwritingGesture), abstractC1235C);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new C1253q());
        return true;
    }

    public final int i(Q q3, HandwritingGesture handwritingGesture, a0 a0Var, O0 o02, InterfaceC0424c interfaceC0424c) {
        G g3;
        C0031g c0031g = q3.f9984j;
        if (c0031g == null) {
            return 3;
        }
        p0 d3 = q3.d();
        if (!c0031g.equals((d3 == null || (g3 = d3.f10230a.f557a) == null) ? null : g3.f547a)) {
            return 3;
        }
        if (AbstractC1251o.q(handwritingGesture)) {
            return r(q3, AbstractC1251o.k(handwritingGesture), a0Var, interfaceC0424c);
        }
        if (AbstractC0063a.q(handwritingGesture)) {
            return c(q3, AbstractC0063a.g(handwritingGesture), c0031g, interfaceC0424c);
        }
        if (AbstractC0063a.v(handwritingGesture)) {
            return t(q3, AbstractC0063a.k(handwritingGesture), a0Var, interfaceC0424c);
        }
        if (AbstractC0063a.x(handwritingGesture)) {
            return e(q3, AbstractC0063a.h(handwritingGesture), c0031g, interfaceC0424c);
        }
        if (AbstractC1251o.n(handwritingGesture)) {
            return n(q3, AbstractC1251o.j(handwritingGesture), c0031g, o02, interfaceC0424c);
        }
        if (AbstractC0063a.z(handwritingGesture)) {
            return k(q3, AbstractC0063a.i(handwritingGesture), o02, interfaceC0424c);
        }
        if (AbstractC0063a.B(handwritingGesture)) {
            return p(q3, AbstractC0063a.j(handwritingGesture), c0031g, o02, interfaceC0424c);
        }
        return 2;
    }

    public final int j(AbstractC1236D abstractC1236D, HandwritingGesture handwritingGesture, AbstractC1235C abstractC1235C, O0 o02) {
        if (AbstractC1251o.q(handwritingGesture)) {
            return s(abstractC1236D, AbstractC1251o.k(handwritingGesture), abstractC1235C);
        }
        if (AbstractC0063a.q(handwritingGesture)) {
            return d(abstractC1236D, AbstractC0063a.g(handwritingGesture), abstractC1235C);
        }
        if (AbstractC0063a.v(handwritingGesture)) {
            return u(abstractC1236D, AbstractC0063a.k(handwritingGesture), abstractC1235C);
        }
        if (AbstractC0063a.x(handwritingGesture)) {
            return f(abstractC1236D, AbstractC0063a.h(handwritingGesture), abstractC1235C);
        }
        if (AbstractC1251o.n(handwritingGesture)) {
            return o(abstractC1236D, AbstractC1251o.j(handwritingGesture), abstractC1235C, o02);
        }
        if (AbstractC0063a.z(handwritingGesture)) {
            return l(abstractC1236D, AbstractC0063a.i(handwritingGesture), abstractC1235C, o02);
        }
        if (AbstractC0063a.B(handwritingGesture)) {
            return q(abstractC1236D, AbstractC0063a.j(handwritingGesture), abstractC1235C, o02);
        }
        return 2;
    }
}
