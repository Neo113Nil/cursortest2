package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ffx implements fka {
    final /* synthetic */ boolean a;
    final /* synthetic */ BottomSheetBehavior b;

    public ffx(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.a = z;
        this.b = bottomSheetBehavior;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r4 == false) goto L35;
     */
    @Override // defpackage.fka
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view, zz zzVar, fkb fkbVar) {
        vb f = zzVar.f(519);
        int i = f.c;
        vb f2 = zzVar.f(32);
        BottomSheetBehavior bottomSheetBehavior = this.b;
        bottomSheetBehavior.n = i;
        boolean i2 = fik.i(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        if (bottomSheetBehavior.g) {
            int a = zzVar.a();
            bottomSheetBehavior.m = a;
            paddingBottom = fkbVar.d + a;
        }
        if (bottomSheetBehavior.h) {
            paddingLeft = f.b + (i2 ? fkbVar.c : fkbVar.a);
        }
        if (bottomSheetBehavior.i) {
            paddingRight = (i2 ? fkbVar.a : fkbVar.c) + f.d;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z = true;
        boolean z2 = false;
        if (bottomSheetBehavior.j) {
            int i3 = marginLayoutParams.leftMargin;
            int i4 = f.b;
            if (i3 != i4) {
                marginLayoutParams.leftMargin = i4;
                z2 = true;
            }
        }
        if (bottomSheetBehavior.k) {
            int i5 = marginLayoutParams.rightMargin;
            int i6 = f.d;
            if (i5 != i6) {
                marginLayoutParams.rightMargin = i6;
                if (!bottomSheetBehavior.l && marginLayoutParams.topMargin != i) {
                    marginLayoutParams.topMargin = i;
                }
                view.setLayoutParams(marginLayoutParams);
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                boolean z3 = this.a;
                if (z3) {
                    bottomSheetBehavior.f = f2.e;
                }
                if (bottomSheetBehavior.g || z3) {
                    bottomSheetBehavior.aa();
                    return;
                }
                return;
            }
        }
        z = z2;
        if (!bottomSheetBehavior.l) {
        }
    }
}
