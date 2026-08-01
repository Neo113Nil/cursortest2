package l0;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e2.q;
import e2.r;
import n0.n1;
import n0.q1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class f implements q {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2541f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2542g;

    public f(e eVar, boolean z3) {
        this.f2542g = eVar;
        this.f2541f = z3;
    }

    public boolean a() {
        return this.f2541f;
    }

    public boolean b(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        e eVar = (e) this.f2542g;
        if (eVar == null) {
            return a();
        }
        eVar.getClass();
        char c4 = 2;
        for (int i4 = 0; i4 < i && c4 == 2; i4++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i4));
            f fVar = g.f2543a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c4 = 2;
                            break;
                    }
                }
                c4 = 0;
            }
            c4 = 1;
        }
        if (c4 == 0) {
            return true;
        }
        if (c4 != 1) {
            return a();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    @Override // e2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q1 c(View view, q1 q1Var, r rVar) {
        boolean z3;
        boolean z4;
        n1 n1Var = q1Var.f2775a;
        f0.c f2 = n1Var.f(519);
        f0.c f4 = n1Var.f(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f2542g;
        boolean z5 = bottomSheetBehavior.f836o;
        int i = f2.f1267b;
        int i4 = f2.f1268c;
        int i5 = f2.f1266a;
        bottomSheetBehavior.f844w = i;
        boolean z6 = true;
        boolean z7 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        if (z5) {
            int a2 = q1Var.a();
            bottomSheetBehavior.f843v = a2;
            paddingBottom = a2 + rVar.d;
        }
        if (bottomSheetBehavior.f837p) {
            paddingLeft = (z7 ? rVar.f1239c : rVar.f1237a) + i5;
        }
        if (bottomSheetBehavior.f838q) {
            paddingRight = (z7 ? rVar.f1237a : rVar.f1239c) + i4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!bottomSheetBehavior.f840s || marginLayoutParams.leftMargin == i5) {
            z3 = false;
        } else {
            marginLayoutParams.leftMargin = i5;
            z3 = true;
        }
        if (bottomSheetBehavior.f841t && marginLayoutParams.rightMargin != i4) {
            marginLayoutParams.rightMargin = i4;
            z3 = true;
        }
        if (bottomSheetBehavior.f842u) {
            int i6 = marginLayoutParams.topMargin;
            int i7 = f2.f1267b;
            if (i6 != i7) {
                marginLayoutParams.topMargin = i7;
                if (z6) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z4 = this.f2541f;
                if (z4) {
                    bottomSheetBehavior.f834m = f4.d;
                }
                if (z5 && !z4) {
                    return q1Var;
                }
                bottomSheetBehavior.I();
                return q1Var;
            }
        }
        z6 = z3;
        if (z6) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        z4 = this.f2541f;
        if (z4) {
        }
        if (z5) {
        }
        bottomSheetBehavior.I();
        return q1Var;
    }

    public f(BottomSheetBehavior bottomSheetBehavior, boolean z3) {
        this.f2542g = bottomSheetBehavior;
        this.f2541f = z3;
    }
}
