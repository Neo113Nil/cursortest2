package N;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: N.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0059p {

    /* renamed from: a, reason: collision with root package name */
    public final w f766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f767b;

    public C0059p(w wVar, int i2) {
        this.f767b = i2;
        new Rect();
        this.f766a = wVar;
    }

    public static C0059p a(w wVar, int i2) {
        if (i2 == 0) {
            return new C0059p(wVar, 0);
        }
        if (i2 == 1) {
            return new C0059p(wVar, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public final int b(View view) {
        int right;
        int i2;
        switch (this.f767b) {
            case 0:
                x xVar = (x) view.getLayoutParams();
                this.f766a.getClass();
                right = view.getRight() + ((x) view.getLayoutParams()).f781a.right;
                i2 = ((ViewGroup.MarginLayoutParams) xVar).rightMargin;
                break;
            default:
                x xVar2 = (x) view.getLayoutParams();
                this.f766a.getClass();
                right = view.getBottom() + ((x) view.getLayoutParams()).f781a.bottom;
                i2 = ((ViewGroup.MarginLayoutParams) xVar2).bottomMargin;
                break;
        }
        return right + i2;
    }

    public final int c(View view) {
        int left;
        int i2;
        switch (this.f767b) {
            case 0:
                x xVar = (x) view.getLayoutParams();
                this.f766a.getClass();
                left = view.getLeft() - ((x) view.getLayoutParams()).f781a.left;
                i2 = ((ViewGroup.MarginLayoutParams) xVar).leftMargin;
                break;
            default:
                x xVar2 = (x) view.getLayoutParams();
                this.f766a.getClass();
                left = view.getTop() - ((x) view.getLayoutParams()).f781a.top;
                i2 = ((ViewGroup.MarginLayoutParams) xVar2).topMargin;
                break;
        }
        return left - i2;
    }

    public final int d() {
        int i2;
        int t;
        switch (this.f767b) {
            case 0:
                w wVar = this.f766a;
                i2 = wVar.f779f;
                t = wVar.t();
                break;
            default:
                w wVar2 = this.f766a;
                i2 = wVar2.f780g;
                t = wVar2.r();
                break;
        }
        return i2 - t;
    }

    public final int e() {
        switch (this.f767b) {
            case 0:
                return this.f766a.s();
            default:
                return this.f766a.u();
        }
    }
}
