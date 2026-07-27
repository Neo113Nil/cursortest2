package y;

import A.a0;
import A0.C0036g;
import A0.G;
import A0.H;
import A0.I;
import B0.AbstractC0087a;
import G0.C0237a;
import G0.C0243g;
import Z.K;
import a.AbstractC0345a;
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
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import n.AbstractC0864b;
import p0.InterfaceC0980p;
import q.n0;
import s0.P0;
import w.EnumC1257F;
import w.P;
import w.o0;
import x0.C1305g;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f11491a = new r();

    private final void C(P p4, SelectGesture selectGesture, a0 a0Var) {
        RectF selectionArea;
        int granularity;
        if (a0Var != null) {
            selectionArea = selectGesture.getSelectionArea();
            Y.d F3 = K.F(selectionArea);
            granularity = selectGesture.getGranularity();
            long w4 = AbstractC0864b.w(p4, F3, G(granularity));
            P p5 = a0Var.f87d;
            if (p5 != null) {
                p5.f(w4);
            }
            P p6 = a0Var.f87d;
            if (p6 != null) {
                p6.e(A0.K.f299b);
            }
            if (A0.K.b(w4)) {
                return;
            }
            a0Var.p(false);
            a0Var.n(EnumC1257F.f11023d);
        }
    }

    private final void D(AbstractC1310D abstractC1310D, SelectGesture selectGesture, AbstractC1309C abstractC1309C) {
        RectF selectionArea;
        int granularity;
        selectionArea = selectGesture.getSelectionArea();
        K.F(selectionArea);
        granularity = selectGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final void E(P p4, SelectRangeGesture selectRangeGesture, a0 a0Var) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        if (a0Var != null) {
            selectionStartArea = selectRangeGesture.getSelectionStartArea();
            Y.d F3 = K.F(selectionStartArea);
            selectionEndArea = selectRangeGesture.getSelectionEndArea();
            Y.d F4 = K.F(selectionEndArea);
            granularity = selectRangeGesture.getGranularity();
            long k4 = AbstractC0864b.k(p4, F3, F4, G(granularity));
            P p5 = a0Var.f87d;
            if (p5 != null) {
                p5.f(k4);
            }
            P p6 = a0Var.f87d;
            if (p6 != null) {
                p6.e(A0.K.f299b);
            }
            if (A0.K.b(k4)) {
                return;
            }
            a0Var.p(false);
            a0Var.n(EnumC1257F.f11023d);
        }
    }

    private final void F(AbstractC1310D abstractC1310D, SelectRangeGesture selectRangeGesture, AbstractC1309C abstractC1309C) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        K.F(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        K.F(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final int G(int i2) {
        return i2 != 1 ? 0 : 1;
    }

    private final int a(AbstractC1310D abstractC1310D, HandwritingGesture handwritingGesture) {
        throw null;
    }

    private final int b(HandwritingGesture handwritingGesture, Function1<? super G0.i, Unit> function1) {
        String fallbackText;
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        function1.invoke(new C0237a(fallbackText, 1));
        return 5;
    }

    private final int c(P p4, DeleteGesture deleteGesture, C0036g c0036g, Function1<? super G0.i, Unit> function1) {
        int granularity;
        RectF deletionArea;
        granularity = deleteGesture.getGranularity();
        int G3 = G(granularity);
        deletionArea = deleteGesture.getDeletionArea();
        long w4 = AbstractC0864b.w(p4, K.F(deletionArea), G3);
        if (A0.K.b(w4)) {
            return f11491a.b(p.j(deleteGesture), function1);
        }
        h(w4, c0036g, G3 == 1, function1);
        return 1;
    }

    private final int d(AbstractC1310D abstractC1310D, DeleteGesture deleteGesture, AbstractC1309C abstractC1309C) {
        int granularity;
        RectF deletionArea;
        granularity = deleteGesture.getGranularity();
        G(granularity);
        deletionArea = deleteGesture.getDeletionArea();
        K.F(deletionArea);
        throw null;
    }

    private final int e(P p4, DeleteRangeGesture deleteRangeGesture, C0036g c0036g, Function1<? super G0.i, Unit> function1) {
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        granularity = deleteRangeGesture.getGranularity();
        int G3 = G(granularity);
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        Y.d F3 = K.F(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        long k4 = AbstractC0864b.k(p4, F3, K.F(deletionEndArea), G3);
        if (A0.K.b(k4)) {
            return f11491a.b(p.j(deleteRangeGesture), function1);
        }
        h(k4, c0036g, G3 == 1, function1);
        return 1;
    }

    private final int f(AbstractC1310D abstractC1310D, DeleteRangeGesture deleteRangeGesture, AbstractC1309C abstractC1309C) {
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        granularity = deleteRangeGesture.getGranularity();
        G(granularity);
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        K.F(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        K.F(deletionEndArea);
        throw null;
    }

    private final void g(AbstractC1310D abstractC1310D, long j4, boolean z4) {
        if (!z4) {
            throw null;
        }
        throw null;
    }

    private final void h(long j4, C0036g c0036g, boolean z4, Function1<? super G0.i, Unit> function1) {
        if (z4) {
            int i2 = A0.K.f300c;
            int i4 = (int) (j4 >> 32);
            int i5 = (int) (j4 & 4294967295L);
            int codePointBefore = i4 > 0 ? Character.codePointBefore(c0036g, i4) : 10;
            int codePointAt = i5 < c0036g.f328a.length() ? Character.codePointAt(c0036g, i5) : 10;
            if (AbstractC0864b.z(codePointBefore) && (AbstractC0864b.y(codePointAt) || AbstractC0864b.x(codePointAt))) {
                do {
                    i4 -= Character.charCount(codePointBefore);
                    if (i4 == 0) {
                        break;
                    } else {
                        codePointBefore = Character.codePointBefore(c0036g, i4);
                    }
                } while (AbstractC0864b.z(codePointBefore));
                j4 = M1.a.j(i4, i5);
            } else if (AbstractC0864b.z(codePointAt) && (AbstractC0864b.y(codePointBefore) || AbstractC0864b.x(codePointBefore))) {
                do {
                    i5 += Character.charCount(codePointAt);
                    if (i5 == c0036g.f328a.length()) {
                        break;
                    } else {
                        codePointAt = Character.codePointAt(c0036g, i5);
                    }
                } while (AbstractC0864b.z(codePointAt));
                j4 = M1.a.j(i4, i5);
            }
        }
        int i6 = (int) (4294967295L & j4);
        function1.invoke(new s(new G0.i[]{new G0.x(i6, i6), new C0243g(A0.K.c(j4), 0)}));
    }

    private final int k(P p4, InsertGesture insertGesture, P0 p02, Function1<? super G0.i, Unit> function1) {
        PointF insertionPoint;
        int i2;
        o0 d4;
        String textToInsert;
        long m4;
        int u4;
        if (p02 == null) {
            return b(p.j(insertGesture), function1);
        }
        insertionPoint = insertGesture.getInsertionPoint();
        long c4 = AbstractC0345a.c(insertionPoint.x, insertionPoint.y);
        o0 d5 = p4.d();
        if (d5 != null) {
            A0.o oVar = d5.f11290a.f290b;
            InterfaceC0980p c5 = p4.c();
            if (c5 != null && (u4 = AbstractC0864b.u(oVar, (m4 = c5.m(c4)), p02)) != -1) {
                i2 = oVar.e(Y.c.a(m4, (oVar.b(u4) + oVar.d(u4)) / 2.0f, 1));
                if (i2 != -1 || ((d4 = p4.d()) != null && AbstractC0864b.l(d4.f11290a, i2))) {
                    return b(p.j(insertGesture), function1);
                }
                textToInsert = insertGesture.getTextToInsert();
                m(i2, textToInsert, function1);
                return 1;
            }
        }
        i2 = -1;
        if (i2 != -1) {
        }
        return b(p.j(insertGesture), function1);
    }

    private final int l(AbstractC1310D abstractC1310D, InsertGesture insertGesture, AbstractC1309C abstractC1309C, P0 p02) {
        PointF insertionPoint;
        insertionPoint = insertGesture.getInsertionPoint();
        AbstractC0345a.c(insertionPoint.x, insertionPoint.y);
        throw null;
    }

    private final void m(int i2, String str, Function1<? super G0.i, Unit> function1) {
        function1.invoke(new s(new G0.i[]{new G0.x(i2, i2), new C0237a(str, 1)}));
    }

    private final int n(P p4, JoinOrSplitGesture joinOrSplitGesture, C0036g c0036g, P0 p02, Function1<? super G0.i, Unit> function1) {
        PointF joinOrSplitPoint;
        int i2;
        o0 d4;
        long m4;
        int u4;
        if (p02 == null) {
            return b(p.j(joinOrSplitGesture), function1);
        }
        joinOrSplitPoint = joinOrSplitGesture.getJoinOrSplitPoint();
        long c4 = AbstractC0345a.c(joinOrSplitPoint.x, joinOrSplitPoint.y);
        o0 d5 = p4.d();
        if (d5 != null) {
            A0.o oVar = d5.f11290a.f290b;
            InterfaceC0980p c5 = p4.c();
            if (c5 != null && (u4 = AbstractC0864b.u(oVar, (m4 = c5.m(c4)), p02)) != -1) {
                i2 = oVar.e(Y.c.a(m4, (oVar.b(u4) + oVar.d(u4)) / 2.0f, 1));
                if (i2 != -1 || ((d4 = p4.d()) != null && AbstractC0864b.l(d4.f11290a, i2))) {
                    return b(p.j(joinOrSplitGesture), function1);
                }
                int i4 = i2;
                while (i4 > 0) {
                    int codePointBefore = Character.codePointBefore(c0036g, i4);
                    if (!AbstractC0864b.y(codePointBefore)) {
                        break;
                    }
                    i4 -= Character.charCount(codePointBefore);
                }
                while (i2 < c0036g.f328a.length()) {
                    int codePointAt = Character.codePointAt(c0036g, i2);
                    if (!AbstractC0864b.y(codePointAt)) {
                        break;
                    }
                    i2 += Character.charCount(codePointAt);
                }
                long j4 = M1.a.j(i4, i2);
                if (A0.K.b(j4)) {
                    m((int) (j4 >> 32), " ", function1);
                } else {
                    h(j4, c0036g, false, function1);
                }
                return 1;
            }
        }
        i2 = -1;
        if (i2 != -1) {
        }
        return b(p.j(joinOrSplitGesture), function1);
    }

    private final int o(AbstractC1310D abstractC1310D, JoinOrSplitGesture joinOrSplitGesture, AbstractC1309C abstractC1309C, P0 p02) {
        throw null;
    }

    private final int p(P p4, RemoveSpaceGesture removeSpaceGesture, C0036g c0036g, P0 p02, Function1<? super G0.i, Unit> function1) {
        PointF startPoint;
        PointF endPoint;
        long j4;
        String sb;
        int i2;
        o0 d4 = p4.d();
        I i4 = d4 != null ? d4.f11290a : null;
        startPoint = removeSpaceGesture.getStartPoint();
        long c4 = AbstractC0345a.c(startPoint.x, startPoint.y);
        endPoint = removeSpaceGesture.getEndPoint();
        long c5 = AbstractC0345a.c(endPoint.x, endPoint.y);
        InterfaceC0980p c6 = p4.c();
        if (i4 == null || c6 == null) {
            j4 = A0.K.f299b;
        } else {
            long m4 = c6.m(c4);
            long m5 = c6.m(c5);
            A0.o oVar = i4.f290b;
            int u4 = AbstractC0864b.u(oVar, m4, p02);
            int u5 = AbstractC0864b.u(oVar, m5, p02);
            if (u4 != -1) {
                if (u5 != -1) {
                    u4 = Math.min(u4, u5);
                }
                u5 = u4;
            } else if (u5 == -1) {
                j4 = A0.K.f299b;
            }
            float b4 = (oVar.b(u5) + oVar.d(u5)) / 2;
            j4 = oVar.f(new Y.d(Math.min(Y.c.d(m4), Y.c.d(m5)), b4 - 0.1f, Math.max(Y.c.d(m4), Y.c.d(m5)), b4 + 0.1f), 0, G.f277a);
        }
        if (A0.K.b(j4)) {
            return f11491a.b(p.j(removeSpaceGesture), function1);
        }
        M2.C c7 = new M2.C();
        c7.f3578d = -1;
        M2.C c8 = new M2.C();
        c8.f3578d = -1;
        C0036g subSequence = c0036g.subSequence(A0.K.e(j4), A0.K.d(j4));
        Regex regex = new Regex("\\s+");
        n0 transform = new n0(c7, 15, c8);
        String input = subSequence.f328a;
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = regex.f7515d.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        kotlin.text.j jVar = !matcher.find(0) ? null : new kotlin.text.j(matcher, input);
        if (jVar == null) {
            sb = input.toString();
        } else {
            int length = input.length();
            StringBuilder sb2 = new StringBuilder(length);
            int i5 = 0;
            do {
                sb2.append((CharSequence) input, i5, jVar.a().f7505d);
                transform.invoke(jVar);
                sb2.append((CharSequence) "");
                i5 = jVar.a().f7506e + 1;
                Matcher matcher2 = jVar.f7537a;
                int end = matcher2.end() + (matcher2.end() == matcher2.start() ? 1 : 0);
                String str = jVar.f7538b;
                if (end <= str.length()) {
                    Matcher matcher3 = matcher2.pattern().matcher(str);
                    Intrinsics.checkNotNullExpressionValue(matcher3, "matcher(...)");
                    jVar = !matcher3.find(end) ? null : new kotlin.text.j(matcher3, str);
                } else {
                    jVar = null;
                }
                if (i5 >= length) {
                    break;
                }
            } while (jVar != null);
            if (i5 < length) {
                sb2.append((CharSequence) input, i5, length);
            }
            sb = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb, "toString(...)");
        }
        int i6 = c7.f3578d;
        if (i6 == -1 || (i2 = c8.f3578d) == -1) {
            return b(p.j(removeSpaceGesture), function1);
        }
        int i7 = (int) (j4 >> 32);
        String substring = sb.substring(i6, sb.length() - (A0.K.c(j4) - c8.f3578d));
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        function1.invoke(new s(new G0.i[]{new G0.x(i7 + i6, i7 + i2), new C0237a(substring, 1)}));
        return 1;
    }

    private final int q(AbstractC1310D abstractC1310D, RemoveSpaceGesture removeSpaceGesture, AbstractC1309C abstractC1309C, P0 p02) {
        throw null;
    }

    private final int r(P p4, SelectGesture selectGesture, a0 a0Var, Function1<? super G0.i, Unit> function1) {
        RectF selectionArea;
        int granularity;
        selectionArea = selectGesture.getSelectionArea();
        Y.d F3 = K.F(selectionArea);
        granularity = selectGesture.getGranularity();
        long w4 = AbstractC0864b.w(p4, F3, G(granularity));
        if (A0.K.b(w4)) {
            return f11491a.b(p.j(selectGesture), function1);
        }
        v(w4, a0Var, function1);
        return 1;
    }

    private final int s(AbstractC1310D abstractC1310D, SelectGesture selectGesture, AbstractC1309C abstractC1309C) {
        RectF selectionArea;
        int granularity;
        selectionArea = selectGesture.getSelectionArea();
        K.F(selectionArea);
        granularity = selectGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final int t(P p4, SelectRangeGesture selectRangeGesture, a0 a0Var, Function1<? super G0.i, Unit> function1) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        Y.d F3 = K.F(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        Y.d F4 = K.F(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        long k4 = AbstractC0864b.k(p4, F3, F4, G(granularity));
        if (A0.K.b(k4)) {
            return f11491a.b(p.j(selectRangeGesture), function1);
        }
        v(k4, a0Var, function1);
        return 1;
    }

    private final int u(AbstractC1310D abstractC1310D, SelectRangeGesture selectRangeGesture, AbstractC1309C abstractC1309C) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        K.F(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        K.F(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final void v(long j4, a0 a0Var, Function1<? super G0.i, Unit> function1) {
        int i2 = A0.K.f300c;
        function1.invoke(new G0.x((int) (j4 >> 32), (int) (j4 & 4294967295L)));
        if (a0Var != null) {
            a0Var.f(true);
        }
    }

    private final void w(P p4, DeleteGesture deleteGesture, a0 a0Var) {
        RectF deletionArea;
        int granularity;
        if (a0Var != null) {
            deletionArea = deleteGesture.getDeletionArea();
            Y.d F3 = K.F(deletionArea);
            granularity = deleteGesture.getGranularity();
            long w4 = AbstractC0864b.w(p4, F3, G(granularity));
            P p5 = a0Var.f87d;
            if (p5 != null) {
                p5.e(w4);
            }
            P p6 = a0Var.f87d;
            if (p6 != null) {
                p6.f(A0.K.f299b);
            }
            if (A0.K.b(w4)) {
                return;
            }
            a0Var.p(false);
            a0Var.n(EnumC1257F.f11023d);
        }
    }

    private final void x(AbstractC1310D abstractC1310D, DeleteGesture deleteGesture, AbstractC1309C abstractC1309C) {
        RectF deletionArea;
        int granularity;
        deletionArea = deleteGesture.getDeletionArea();
        K.F(deletionArea);
        granularity = deleteGesture.getGranularity();
        G(granularity);
        throw null;
    }

    private final void y(P p4, DeleteRangeGesture deleteRangeGesture, a0 a0Var) {
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        if (a0Var != null) {
            deletionStartArea = deleteRangeGesture.getDeletionStartArea();
            Y.d F3 = K.F(deletionStartArea);
            deletionEndArea = deleteRangeGesture.getDeletionEndArea();
            Y.d F4 = K.F(deletionEndArea);
            granularity = deleteRangeGesture.getGranularity();
            long k4 = AbstractC0864b.k(p4, F3, F4, G(granularity));
            P p5 = a0Var.f87d;
            if (p5 != null) {
                p5.e(k4);
            }
            P p6 = a0Var.f87d;
            if (p6 != null) {
                p6.f(A0.K.f299b);
            }
            if (A0.K.b(k4)) {
                return;
            }
            a0Var.p(false);
            a0Var.n(EnumC1257F.f11023d);
        }
    }

    private final void z(AbstractC1310D abstractC1310D, DeleteRangeGesture deleteRangeGesture, AbstractC1309C abstractC1309C) {
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        K.F(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        K.F(deletionEndArea);
        granularity = deleteRangeGesture.getGranularity();
        G(granularity);
        throw null;
    }

    public final boolean A(P p4, PreviewableHandwritingGesture previewableHandwritingGesture, a0 a0Var, CancellationSignal cancellationSignal) {
        H h4;
        C0036g c0036g = p4.f11063j;
        if (c0036g == null) {
            return false;
        }
        o0 d4 = p4.d();
        if (!c0036g.equals((d4 == null || (h4 = d4.f11290a.f289a) == null) ? null : h4.f279a)) {
            return false;
        }
        if (p.t(previewableHandwritingGesture)) {
            C(p4, p.m(previewableHandwritingGesture), a0Var);
        } else if (AbstractC0087a.r(previewableHandwritingGesture)) {
            w(p4, AbstractC0087a.h(previewableHandwritingGesture), a0Var);
        } else if (AbstractC0087a.v(previewableHandwritingGesture)) {
            E(p4, AbstractC0087a.k(previewableHandwritingGesture), a0Var);
        } else {
            if (!AbstractC0087a.x(previewableHandwritingGesture)) {
                return false;
            }
            y(p4, AbstractC0087a.i(previewableHandwritingGesture), a0Var);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new C1305g(1, a0Var));
        return true;
    }

    public final boolean B(AbstractC1310D abstractC1310D, PreviewableHandwritingGesture previewableHandwritingGesture, AbstractC1309C abstractC1309C, CancellationSignal cancellationSignal) {
        if (p.t(previewableHandwritingGesture)) {
            D(abstractC1310D, p.m(previewableHandwritingGesture), abstractC1309C);
        } else if (AbstractC0087a.r(previewableHandwritingGesture)) {
            x(abstractC1310D, AbstractC0087a.h(previewableHandwritingGesture), abstractC1309C);
        } else if (AbstractC0087a.v(previewableHandwritingGesture)) {
            F(abstractC1310D, AbstractC0087a.k(previewableHandwritingGesture), abstractC1309C);
        } else {
            if (!AbstractC0087a.x(previewableHandwritingGesture)) {
                return false;
            }
            z(abstractC1310D, AbstractC0087a.i(previewableHandwritingGesture), abstractC1309C);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new q());
        return true;
    }

    public final int i(P p4, HandwritingGesture handwritingGesture, a0 a0Var, P0 p02, Function1<? super G0.i, Unit> function1) {
        H h4;
        C0036g c0036g = p4.f11063j;
        if (c0036g == null) {
            return 3;
        }
        o0 d4 = p4.d();
        if (!c0036g.equals((d4 == null || (h4 = d4.f11290a.f289a) == null) ? null : h4.f279a)) {
            return 3;
        }
        if (p.t(handwritingGesture)) {
            return r(p4, p.m(handwritingGesture), a0Var, function1);
        }
        if (AbstractC0087a.r(handwritingGesture)) {
            return c(p4, AbstractC0087a.h(handwritingGesture), c0036g, function1);
        }
        if (AbstractC0087a.v(handwritingGesture)) {
            return t(p4, AbstractC0087a.k(handwritingGesture), a0Var, function1);
        }
        if (AbstractC0087a.x(handwritingGesture)) {
            return e(p4, AbstractC0087a.i(handwritingGesture), c0036g, function1);
        }
        if (p.s(handwritingGesture)) {
            return n(p4, p.k(handwritingGesture), c0036g, p02, function1);
        }
        if (AbstractC0087a.z(handwritingGesture)) {
            return k(p4, AbstractC0087a.j(handwritingGesture), p02, function1);
        }
        if (p.p(handwritingGesture)) {
            return p(p4, p.l(handwritingGesture), c0036g, p02, function1);
        }
        return 2;
    }

    public final int j(AbstractC1310D abstractC1310D, HandwritingGesture handwritingGesture, AbstractC1309C abstractC1309C, P0 p02) {
        if (p.t(handwritingGesture)) {
            return s(abstractC1310D, p.m(handwritingGesture), abstractC1309C);
        }
        if (AbstractC0087a.r(handwritingGesture)) {
            return d(abstractC1310D, AbstractC0087a.h(handwritingGesture), abstractC1309C);
        }
        if (AbstractC0087a.v(handwritingGesture)) {
            return u(abstractC1310D, AbstractC0087a.k(handwritingGesture), abstractC1309C);
        }
        if (AbstractC0087a.x(handwritingGesture)) {
            return f(abstractC1310D, AbstractC0087a.i(handwritingGesture), abstractC1309C);
        }
        if (p.s(handwritingGesture)) {
            return o(abstractC1310D, p.k(handwritingGesture), abstractC1309C, p02);
        }
        if (AbstractC0087a.z(handwritingGesture)) {
            return l(abstractC1310D, AbstractC0087a.j(handwritingGesture), abstractC1309C, p02);
        }
        if (p.p(handwritingGesture)) {
            return q(abstractC1310D, p.l(handwritingGesture), abstractC1309C, p02);
        }
        return 2;
    }
}
