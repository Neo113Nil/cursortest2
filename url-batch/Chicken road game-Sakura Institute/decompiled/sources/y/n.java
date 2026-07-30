package y;

import a0.x0;
import a2.f0;
import a2.g0;
import a2.h0;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s1.l2;
import w.a0;
import w.j0;
import w.z0;
import z0.l0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f9720a = new n();

    private final void C(j0 j0Var, SelectGesture selectGesture, x0 x0Var) {
        RectF selectionArea;
        int granularity;
        if (x0Var != null) {
            selectionArea = selectGesture.getSelectionArea();
            y0.d y4 = l0.y(selectionArea);
            granularity = selectGesture.getGranularity();
            long g9 = u3.t.g(j0Var, y4, G(granularity));
            j0 j0Var2 = x0Var.f178d;
            if (j0Var2 != null) {
                j0Var2.f(g9);
            }
            j0 j0Var3 = x0Var.f178d;
            if (j0Var3 != null) {
                j0Var3.e(a2.j0.f406b);
            }
            if (a2.j0.b(g9)) {
                return;
            }
            x0Var.p(false);
            x0Var.n(a0.f9183f);
        }
    }

    private final void D(y yVar, SelectGesture selectGesture, x xVar) {
        RectF selectionArea;
        int granularity;
        selectionArea = selectGesture.getSelectionArea();
        l0.y(selectionArea);
        granularity = selectGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final void E(j0 j0Var, SelectRangeGesture selectRangeGesture, x0 x0Var) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        if (x0Var != null) {
            selectionStartArea = selectRangeGesture.getSelectionStartArea();
            y0.d y4 = l0.y(selectionStartArea);
            selectionEndArea = selectRangeGesture.getSelectionEndArea();
            y0.d y8 = l0.y(selectionEndArea);
            granularity = selectRangeGesture.getGranularity();
            long c4 = u3.t.c(j0Var, y4, y8, G(granularity));
            j0 j0Var2 = x0Var.f178d;
            if (j0Var2 != null) {
                j0Var2.f(c4);
            }
            j0 j0Var3 = x0Var.f178d;
            if (j0Var3 != null) {
                j0Var3.e(a2.j0.f406b);
            }
            if (a2.j0.b(c4)) {
                return;
            }
            x0Var.p(false);
            x0Var.n(a0.f9183f);
        }
    }

    private final void F(y yVar, SelectRangeGesture selectRangeGesture, x xVar) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        l0.y(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        l0.y(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final int G(int i7) {
        return i7 != 1 ? 0 : 1;
    }

    private final int a(y yVar, HandwritingGesture handwritingGesture) {
        throw null;
    }

    private final int b(HandwritingGesture handwritingGesture, q6.c cVar) {
        String fallbackText;
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        cVar.f(new g2.a(fallbackText, 1));
        return 5;
    }

    private final int c(j0 j0Var, DeleteGesture deleteGesture, a2.g gVar, q6.c cVar) {
        int granularity;
        RectF deletionArea;
        granularity = deleteGesture.getGranularity();
        int G = G(granularity);
        deletionArea = deleteGesture.getDeletionArea();
        long g9 = u3.t.g(j0Var, l0.y(deletionArea), G);
        if (a2.j0.b(g9)) {
            return f9720a.b(l.i(deleteGesture), cVar);
        }
        h(g9, gVar, G == 1, cVar);
        return 1;
    }

    private final int d(y yVar, DeleteGesture deleteGesture, x xVar) {
        int granularity;
        RectF deletionArea;
        granularity = deleteGesture.getGranularity();
        G(granularity);
        deletionArea = deleteGesture.getDeletionArea();
        l0.y(deletionArea);
        throw null;
    }

    private final int e(j0 j0Var, DeleteRangeGesture deleteRangeGesture, a2.g gVar, q6.c cVar) {
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        granularity = deleteRangeGesture.getGranularity();
        int G = G(granularity);
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        y0.d y4 = l0.y(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        long c4 = u3.t.c(j0Var, y4, l0.y(deletionEndArea), G);
        if (a2.j0.b(c4)) {
            return f9720a.b(l.i(deleteRangeGesture), cVar);
        }
        h(c4, gVar, G == 1, cVar);
        return 1;
    }

    private final int f(y yVar, DeleteRangeGesture deleteRangeGesture, x xVar) {
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        granularity = deleteRangeGesture.getGranularity();
        G(granularity);
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        l0.y(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        l0.y(deletionEndArea);
        throw null;
    }

    private final void g(y yVar, long j8, boolean z8) {
        if (!z8) {
            throw null;
        }
        throw null;
    }

    private final void h(long j8, a2.g gVar, boolean z8, q6.c cVar) {
        if (z8) {
            int i7 = a2.j0.f407c;
            int i8 = (int) (j8 >> 32);
            int i9 = (int) (j8 & 4294967295L);
            int codePointBefore = i8 > 0 ? Character.codePointBefore(gVar, i8) : 10;
            int codePointAt = i9 < gVar.f373f.length() ? Character.codePointAt(gVar, i9) : 10;
            if (u3.t.j(codePointBefore) && (u3.t.i(codePointAt) || u3.t.h(codePointAt))) {
                do {
                    i8 -= Character.charCount(codePointBefore);
                    if (i8 == 0) {
                        break;
                    } else {
                        codePointBefore = Character.codePointBefore(gVar, i8);
                    }
                } while (u3.t.j(codePointBefore));
                j8 = r4.a.h(i8, i9);
            } else if (u3.t.j(codePointAt) && (u3.t.i(codePointBefore) || u3.t.h(codePointBefore))) {
                do {
                    i9 += Character.charCount(codePointAt);
                    if (i9 == gVar.f373f.length()) {
                        break;
                    } else {
                        codePointAt = Character.codePointAt(gVar, i9);
                    }
                } while (u3.t.j(codePointAt));
                j8 = r4.a.h(i8, i9);
            }
        }
        int i10 = (int) (4294967295L & j8);
        cVar.f(new o(new g2.i[]{new g2.v(i10, i10), new g2.g(a2.j0.c(j8), 0)}));
    }

    private final int k(j0 j0Var, InsertGesture insertGesture, l2 l2Var, q6.c cVar) {
        PointF insertionPoint;
        int i7;
        z0 d8;
        String textToInsert;
        long M;
        int f9;
        if (l2Var == null) {
            return b(l.i(insertGesture), cVar);
        }
        insertionPoint = insertGesture.getInsertionPoint();
        long a3 = u3.r.a(insertionPoint.x, insertionPoint.y);
        z0 d9 = j0Var.d();
        if (d9 != null) {
            a2.o oVar = d9.f9471a.f389b;
            p1.p c4 = j0Var.c();
            if (c4 != null && (f9 = u3.t.f(oVar, (M = c4.M(a3)), l2Var)) != -1) {
                i7 = oVar.e(y0.c.a(M, (oVar.b(f9) + oVar.d(f9)) / 2.0f, 1));
                if (i7 != -1 || ((d8 = j0Var.d()) != null && u3.t.d(d8.f9471a, i7))) {
                    return b(l.i(insertGesture), cVar);
                }
                textToInsert = insertGesture.getTextToInsert();
                m(i7, textToInsert, cVar);
                return 1;
            }
        }
        i7 = -1;
        if (i7 != -1) {
        }
        return b(l.i(insertGesture), cVar);
    }

    private final int l(y yVar, InsertGesture insertGesture, x xVar, l2 l2Var) {
        PointF insertionPoint;
        insertionPoint = insertGesture.getInsertionPoint();
        u3.r.a(insertionPoint.x, insertionPoint.y);
        throw null;
    }

    private final void m(int i7, String str, q6.c cVar) {
        cVar.f(new o(new g2.i[]{new g2.v(i7, i7), new g2.a(str, 1)}));
    }

    private final int n(j0 j0Var, JoinOrSplitGesture joinOrSplitGesture, a2.g gVar, l2 l2Var, q6.c cVar) {
        PointF joinOrSplitPoint;
        int i7;
        z0 d8;
        long M;
        int f9;
        if (l2Var == null) {
            return b(l.i(joinOrSplitGesture), cVar);
        }
        joinOrSplitPoint = joinOrSplitGesture.getJoinOrSplitPoint();
        long a3 = u3.r.a(joinOrSplitPoint.x, joinOrSplitPoint.y);
        z0 d9 = j0Var.d();
        if (d9 != null) {
            a2.o oVar = d9.f9471a.f389b;
            p1.p c4 = j0Var.c();
            if (c4 != null && (f9 = u3.t.f(oVar, (M = c4.M(a3)), l2Var)) != -1) {
                i7 = oVar.e(y0.c.a(M, (oVar.b(f9) + oVar.d(f9)) / 2.0f, 1));
                if (i7 != -1 || ((d8 = j0Var.d()) != null && u3.t.d(d8.f9471a, i7))) {
                    return b(l.i(joinOrSplitGesture), cVar);
                }
                int i8 = i7;
                while (i8 > 0) {
                    int codePointBefore = Character.codePointBefore(gVar, i8);
                    if (!u3.t.i(codePointBefore)) {
                        break;
                    }
                    i8 -= Character.charCount(codePointBefore);
                }
                while (i7 < gVar.f373f.length()) {
                    int codePointAt = Character.codePointAt(gVar, i7);
                    if (!u3.t.i(codePointAt)) {
                        break;
                    }
                    i7 += Character.charCount(codePointAt);
                }
                long h3 = r4.a.h(i8, i7);
                if (a2.j0.b(h3)) {
                    m((int) (h3 >> 32), " ", cVar);
                    return 1;
                }
                h(h3, gVar, false, cVar);
                return 1;
            }
        }
        i7 = -1;
        if (i7 != -1) {
        }
        return b(l.i(joinOrSplitGesture), cVar);
    }

    private final int o(y yVar, JoinOrSplitGesture joinOrSplitGesture, x xVar, l2 l2Var) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int p(j0 j0Var, RemoveSpaceGesture removeSpaceGesture, a2.g gVar, l2 l2Var, q6.c cVar) {
        PointF startPoint;
        PointF endPoint;
        long j8;
        int i7;
        int i8;
        int i9;
        int i10;
        String sb;
        z0 d8 = j0Var.d();
        h0 h0Var = d8 != null ? d8.f9471a : null;
        startPoint = removeSpaceGesture.getStartPoint();
        long a3 = u3.r.a(startPoint.x, startPoint.y);
        endPoint = removeSpaceGesture.getEndPoint();
        long a9 = u3.r.a(endPoint.x, endPoint.y);
        p1.p c4 = j0Var.c();
        int i11 = 0;
        if (h0Var != null) {
            a2.o oVar = h0Var.f389b;
            if (c4 != null) {
                long M = c4.M(a3);
                long M2 = c4.M(a9);
                int f9 = u3.t.f(oVar, M, l2Var);
                int f10 = u3.t.f(oVar, M2, l2Var);
                if (f9 != -1) {
                    if (f10 != -1) {
                        f9 = Math.min(f9, f10);
                    }
                    f10 = f9;
                } else if (f10 == -1) {
                    j8 = a2.j0.f406b;
                    if (a2.j0.b(j8)) {
                        return f9720a.b(l.i(removeSpaceGesture), cVar);
                    }
                    String str = gVar.subSequence(a2.j0.e(j8), a2.j0.d(j8)).f373f;
                    Pattern compile = Pattern.compile("\\s+");
                    r6.k.e(compile, "compile(...)");
                    r6.k.f(str, "input");
                    Matcher matcher = compile.matcher(str);
                    r6.k.e(matcher, "matcher(...)");
                    q5.g gVar2 = !matcher.find(0) ? null : new q5.g(matcher, str);
                    if (gVar2 == null) {
                        sb = str.toString();
                        i10 = 0;
                        i8 = -1;
                        i7 = -1;
                    } else {
                        int length = str.length();
                        StringBuilder sb2 = new StringBuilder(length);
                        int i12 = 0;
                        i7 = -1;
                        while (true) {
                            sb2.append((CharSequence) str, i12, gVar2.l().f9521f);
                            if (i7 == -1) {
                                i7 = gVar2.l().f9521f;
                            }
                            i8 = gVar2.l().f9522g + 1;
                            sb2.append((CharSequence) "");
                            i9 = gVar2.l().f9522g + 1;
                            CharSequence charSequence = (CharSequence) gVar2.f7528h;
                            Matcher matcher2 = (Matcher) gVar2.f7527g;
                            i10 = i11;
                            int end = matcher2.end() + (matcher2.end() == matcher2.start() ? 1 : i10);
                            if (end <= charSequence.length()) {
                                Matcher matcher3 = matcher2.pattern().matcher(charSequence);
                                r6.k.e(matcher3, "matcher(...)");
                                gVar2 = !matcher3.find(end) ? null : new q5.g(matcher3, charSequence);
                            } else {
                                gVar2 = null;
                            }
                            if (i9 >= length || gVar2 == null) {
                                break;
                            }
                            i11 = i10;
                            i12 = i9;
                        }
                        if (i9 < length) {
                            sb2.append((CharSequence) str, i9, length);
                        }
                        sb = sb2.toString();
                        r6.k.e(sb, "toString(...)");
                    }
                    if (i7 == -1 || i8 == -1) {
                        return b(l.i(removeSpaceGesture), cVar);
                    }
                    int i13 = (int) (j8 >> 32);
                    String substring = sb.substring(i7, sb.length() - (a2.j0.c(j8) - i8));
                    r6.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    g2.v vVar = new g2.v(i13 + i7, i13 + i8);
                    g2.a aVar = new g2.a(substring, 1);
                    g2.i[] iVarArr = new g2.i[2];
                    iVarArr[i10] = vVar;
                    iVarArr[1] = aVar;
                    cVar.f(new o(iVarArr));
                    return 1;
                }
                float b9 = (oVar.b(f10) + oVar.d(f10)) / 2;
                j8 = oVar.f(new y0.d(Math.min(y0.c.d(M), y0.c.d(M2)), b9 - 0.1f, Math.max(y0.c.d(M), y0.c.d(M2)), b9 + 0.1f), 0, f0.f371a);
                if (a2.j0.b(j8)) {
                }
            }
        }
        j8 = a2.j0.f406b;
        if (a2.j0.b(j8)) {
        }
    }

    private final int q(y yVar, RemoveSpaceGesture removeSpaceGesture, x xVar, l2 l2Var) {
        throw null;
    }

    private final int r(j0 j0Var, SelectGesture selectGesture, x0 x0Var, q6.c cVar) {
        RectF selectionArea;
        int granularity;
        selectionArea = selectGesture.getSelectionArea();
        y0.d y4 = l0.y(selectionArea);
        granularity = selectGesture.getGranularity();
        long g9 = u3.t.g(j0Var, y4, G(granularity));
        if (a2.j0.b(g9)) {
            return f9720a.b(l.i(selectGesture), cVar);
        }
        v(g9, x0Var, cVar);
        return 1;
    }

    private final int s(y yVar, SelectGesture selectGesture, x xVar) {
        RectF selectionArea;
        int granularity;
        selectionArea = selectGesture.getSelectionArea();
        l0.y(selectionArea);
        granularity = selectGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final int t(j0 j0Var, SelectRangeGesture selectRangeGesture, x0 x0Var, q6.c cVar) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        y0.d y4 = l0.y(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        y0.d y8 = l0.y(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        long c4 = u3.t.c(j0Var, y4, y8, G(granularity));
        if (a2.j0.b(c4)) {
            return f9720a.b(l.i(selectRangeGesture), cVar);
        }
        v(c4, x0Var, cVar);
        return 1;
    }

    private final int u(y yVar, SelectRangeGesture selectRangeGesture, x xVar) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        l0.y(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        l0.y(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final void v(long j8, x0 x0Var, q6.c cVar) {
        int i7 = a2.j0.f407c;
        cVar.f(new g2.v((int) (j8 >> 32), (int) (j8 & 4294967295L)));
        if (x0Var != null) {
            x0Var.f(true);
        }
    }

    private final void w(j0 j0Var, DeleteGesture deleteGesture, x0 x0Var) {
        RectF deletionArea;
        int granularity;
        if (x0Var != null) {
            deletionArea = deleteGesture.getDeletionArea();
            y0.d y4 = l0.y(deletionArea);
            granularity = deleteGesture.getGranularity();
            long g9 = u3.t.g(j0Var, y4, G(granularity));
            j0 j0Var2 = x0Var.f178d;
            if (j0Var2 != null) {
                j0Var2.e(g9);
            }
            j0 j0Var3 = x0Var.f178d;
            if (j0Var3 != null) {
                j0Var3.f(a2.j0.f406b);
            }
            if (a2.j0.b(g9)) {
                return;
            }
            x0Var.p(false);
            x0Var.n(a0.f9183f);
        }
    }

    private final void x(y yVar, DeleteGesture deleteGesture, x xVar) {
        RectF deletionArea;
        int granularity;
        deletionArea = deleteGesture.getDeletionArea();
        l0.y(deletionArea);
        granularity = deleteGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final void y(j0 j0Var, DeleteRangeGesture deleteRangeGesture, x0 x0Var) {
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        if (x0Var != null) {
            deletionStartArea = deleteRangeGesture.getDeletionStartArea();
            y0.d y4 = l0.y(deletionStartArea);
            deletionEndArea = deleteRangeGesture.getDeletionEndArea();
            y0.d y8 = l0.y(deletionEndArea);
            granularity = deleteRangeGesture.getGranularity();
            long c4 = u3.t.c(j0Var, y4, y8, G(granularity));
            j0 j0Var2 = x0Var.f178d;
            if (j0Var2 != null) {
                j0Var2.e(c4);
            }
            j0 j0Var3 = x0Var.f178d;
            if (j0Var3 != null) {
                j0Var3.f(a2.j0.f406b);
            }
            if (a2.j0.b(c4)) {
                return;
            }
            x0Var.p(false);
            x0Var.n(a0.f9183f);
        }
    }

    private final void z(y yVar, DeleteRangeGesture deleteRangeGesture, x xVar) {
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        l0.y(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        l0.y(deletionEndArea);
        granularity = deleteRangeGesture.getGranularity();
        G(granularity);
        throw null;
    }

    public final boolean A(j0 j0Var, PreviewableHandwritingGesture previewableHandwritingGesture, x0 x0Var, CancellationSignal cancellationSignal) {
        g0 g0Var;
        a2.g gVar = j0Var.f9264j;
        if (gVar == null) {
            return false;
        }
        z0 d8 = j0Var.d();
        if (!gVar.equals((d8 == null || (g0Var = d8.f9471a.f388a) == null) ? null : g0Var.f377a)) {
            return false;
        }
        if (l.q(previewableHandwritingGesture)) {
            C(j0Var, l.k(previewableHandwritingGesture), x0Var);
        } else if (b2.a.q(previewableHandwritingGesture)) {
            w(j0Var, b2.a.g(previewableHandwritingGesture), x0Var);
        } else if (b2.a.v(previewableHandwritingGesture)) {
            E(j0Var, b2.a.k(previewableHandwritingGesture), x0Var);
        } else {
            if (!b2.a.x(previewableHandwritingGesture)) {
                return false;
            }
            y(j0Var, b2.a.h(previewableHandwritingGesture), x0Var);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new x1.f(1, x0Var));
        return true;
    }

    public final boolean B(y yVar, PreviewableHandwritingGesture previewableHandwritingGesture, x xVar, CancellationSignal cancellationSignal) {
        if (l.q(previewableHandwritingGesture)) {
            D(yVar, l.k(previewableHandwritingGesture), xVar);
        } else if (b2.a.q(previewableHandwritingGesture)) {
            x(yVar, b2.a.g(previewableHandwritingGesture), xVar);
        } else if (b2.a.v(previewableHandwritingGesture)) {
            F(yVar, b2.a.k(previewableHandwritingGesture), xVar);
        } else {
            if (!b2.a.x(previewableHandwritingGesture)) {
                return false;
            }
            z(yVar, b2.a.h(previewableHandwritingGesture), xVar);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new m());
        return true;
    }

    public final int i(j0 j0Var, HandwritingGesture handwritingGesture, x0 x0Var, l2 l2Var, q6.c cVar) {
        g0 g0Var;
        a2.g gVar = j0Var.f9264j;
        if (gVar == null) {
            return 3;
        }
        z0 d8 = j0Var.d();
        if (!gVar.equals((d8 == null || (g0Var = d8.f9471a.f388a) == null) ? null : g0Var.f377a)) {
            return 3;
        }
        if (l.q(handwritingGesture)) {
            return r(j0Var, l.k(handwritingGesture), x0Var, cVar);
        }
        if (b2.a.q(handwritingGesture)) {
            return c(j0Var, b2.a.g(handwritingGesture), gVar, cVar);
        }
        if (b2.a.v(handwritingGesture)) {
            return t(j0Var, b2.a.k(handwritingGesture), x0Var, cVar);
        }
        if (b2.a.x(handwritingGesture)) {
            return e(j0Var, b2.a.h(handwritingGesture), gVar, cVar);
        }
        if (l.n(handwritingGesture)) {
            return n(j0Var, l.j(handwritingGesture), gVar, l2Var, cVar);
        }
        if (b2.a.z(handwritingGesture)) {
            return k(j0Var, b2.a.i(handwritingGesture), l2Var, cVar);
        }
        if (b2.a.B(handwritingGesture)) {
            return p(j0Var, b2.a.j(handwritingGesture), gVar, l2Var, cVar);
        }
        return 2;
    }

    public final int j(y yVar, HandwritingGesture handwritingGesture, x xVar, l2 l2Var) {
        if (l.q(handwritingGesture)) {
            return s(yVar, l.k(handwritingGesture), xVar);
        }
        if (b2.a.q(handwritingGesture)) {
            return d(yVar, b2.a.g(handwritingGesture), xVar);
        }
        if (b2.a.v(handwritingGesture)) {
            return u(yVar, b2.a.k(handwritingGesture), xVar);
        }
        if (b2.a.x(handwritingGesture)) {
            return f(yVar, b2.a.h(handwritingGesture), xVar);
        }
        if (l.n(handwritingGesture)) {
            return o(yVar, l.j(handwritingGesture), xVar, l2Var);
        }
        if (b2.a.z(handwritingGesture)) {
            return l(yVar, b2.a.i(handwritingGesture), xVar, l2Var);
        }
        if (b2.a.B(handwritingGesture)) {
            return q(yVar, b2.a.j(handwritingGesture), xVar, l2Var);
        }
        return 2;
    }
}
