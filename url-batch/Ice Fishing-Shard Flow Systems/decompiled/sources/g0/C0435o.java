package g0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: g0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0435o {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0440t f4956a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4957b;

    public C0435o(AbstractC0440t abstractC0440t, int i2) {
        this.f4957b = i2;
        new Rect();
        this.f4956a = abstractC0440t;
    }

    public static C0435o a(AbstractC0440t abstractC0440t, int i2) {
        if (i2 == 0) {
            return new C0435o(abstractC0440t, 0);
        }
        if (i2 == 1) {
            return new C0435o(abstractC0440t, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public final int b(View view) {
        int right;
        int i2;
        switch (this.f4957b) {
            case 0:
                C0441u c0441u = (C0441u) view.getLayoutParams();
                this.f4956a.getClass();
                right = view.getRight() + ((C0441u) view.getLayoutParams()).f4969a.right;
                i2 = ((ViewGroup.MarginLayoutParams) c0441u).rightMargin;
                break;
            default:
                C0441u c0441u2 = (C0441u) view.getLayoutParams();
                this.f4956a.getClass();
                right = view.getBottom() + ((C0441u) view.getLayoutParams()).f4969a.bottom;
                i2 = ((ViewGroup.MarginLayoutParams) c0441u2).bottomMargin;
                break;
        }
        return right + i2;
    }

    public final int c(View view) {
        int left;
        int i2;
        switch (this.f4957b) {
            case 0:
                C0441u c0441u = (C0441u) view.getLayoutParams();
                this.f4956a.getClass();
                left = view.getLeft() - ((C0441u) view.getLayoutParams()).f4969a.left;
                i2 = ((ViewGroup.MarginLayoutParams) c0441u).leftMargin;
                break;
            default:
                C0441u c0441u2 = (C0441u) view.getLayoutParams();
                this.f4956a.getClass();
                left = view.getTop() - ((C0441u) view.getLayoutParams()).f4969a.top;
                i2 = ((ViewGroup.MarginLayoutParams) c0441u2).topMargin;
                break;
        }
        return left - i2;
    }

    public final int d() {
        int i2;
        int t6;
        switch (this.f4957b) {
            case 0:
                AbstractC0440t abstractC0440t = this.f4956a;
                i2 = abstractC0440t.f4967f;
                t6 = abstractC0440t.t();
                break;
            default:
                AbstractC0440t abstractC0440t2 = this.f4956a;
                i2 = abstractC0440t2.f4968g;
                t6 = abstractC0440t2.r();
                break;
        }
        return i2 - t6;
    }

    public final int e() {
        switch (this.f4957b) {
            case 0:
                return this.f4956a.s();
            default:
                return this.f4956a.u();
        }
    }
}
