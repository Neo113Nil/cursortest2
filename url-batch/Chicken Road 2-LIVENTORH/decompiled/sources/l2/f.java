package l2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.m0;
import androidx.lifecycle.l0;
import androidx.lifecycle.n0;
import n0.q1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class f implements n0, d1.e, k.x, n0.r, e2.q {

    /* renamed from: g, reason: collision with root package name */
    public static f f2578g;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2579f;

    public /* synthetic */ f(int i) {
        this.f2579f = i;
    }

    public static f f(Context context, int i) {
        h.a.k(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, n1.a.f2823p);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        h.a.t(context, obtainStyledAttributes, 4);
        h.a.t(context, obtainStyledAttributes, 9);
        h.a.t(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        n.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0)).a();
        obtainStyledAttributes.recycle();
        f fVar = new f(9);
        h.a.l(rect.left);
        h.a.l(rect.top);
        h.a.l(rect.right);
        h.a.l(rect.bottom);
        return fVar;
    }

    public static Path g(float f2, float f4, float f5, float f6) {
        Path path = new Path();
        path.moveTo(f2, f4);
        path.lineTo(f5, f6);
        return path;
    }

    @Override // androidx.lifecycle.n0
    public l0 b(Class cls) {
        switch (this.f2579f) {
            case 7:
                return new m0(true);
            default:
                return new b1.a();
        }
    }

    @Override // e2.q
    public q1 c(View view, q1 q1Var, e2.r rVar) {
        rVar.d = q1Var.a() + rVar.d;
        boolean z3 = view.getLayoutDirection() == 1;
        int b4 = q1Var.b();
        int c4 = q1Var.c();
        int i = rVar.f1237a + (z3 ? c4 : b4);
        rVar.f1237a = i;
        int i4 = rVar.f1239c;
        if (!z3) {
            b4 = c4;
        }
        int i5 = i4 + b4;
        rVar.f1239c = i5;
        view.setPaddingRelative(i, rVar.f1238b, i5, rVar.d);
        return q1Var;
    }

    @Override // k.x
    public boolean d(k.m mVar) {
        return false;
    }

    public float e(float f2) {
        return 1.0f;
    }

    public Signature[] h(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // d1.e
    public void i() {
        switch (this.f2579f) {
            case 10:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    public boolean j(CharSequence charSequence) {
        return false;
    }

    @Override // d1.e
    public void m(int i, Object obj) {
        String str;
        switch (this.f2579f) {
            case 10:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i != 6 && i != 7 && i != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                    break;
                }
                break;
        }
    }

    public void n(androidx.emoji2.text.q qVar, float f2) {
        p.b bVar = (p.b) ((Drawable) qVar.f346g);
        p.a aVar = (p.a) qVar.f347h;
        boolean useCompatPadding = aVar.getUseCompatPadding();
        boolean preventCornerOverlap = aVar.getPreventCornerOverlap();
        if (f2 != bVar.f2999e || bVar.f3000f != useCompatPadding || bVar.f3001g != preventCornerOverlap) {
            bVar.f2999e = f2;
            bVar.f3000f = useCompatPadding;
            bVar.f3001g = preventCornerOverlap;
            bVar.b(null);
            bVar.invalidateSelf();
        }
        if (!aVar.getUseCompatPadding()) {
            qVar.H(0, 0, 0, 0);
            return;
        }
        p.b bVar2 = (p.b) ((Drawable) qVar.f346g);
        float f4 = bVar2.f2999e;
        float f5 = bVar2.f2996a;
        int ceil = (int) Math.ceil(p.c.a(f4, f5, aVar.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(p.c.b(f4, f5, aVar.getPreventCornerOverlap()));
        qVar.H(ceil, ceil2, ceil, ceil2);
    }

    public String toString() {
        switch (this.f2579f) {
            case 23:
                return "<NULL>";
            default:
                return super.toString();
        }
    }

    public f(View view, int i) {
        this.f2579f = i;
        switch (i) {
            case 20:
                if (Build.VERSION.SDK_INT < 30) {
                    new f(view, 19);
                    break;
                } else {
                    new n0.t(view, 19);
                    break;
                }
        }
    }

    private final void k() {
    }

    private final void l(int i, Object obj) {
    }

    @Override // k.x
    public void a(k.m mVar, boolean z3) {
    }

    @Override // n0.r
    public void onScrollLimit(int i, int i4, int i5, boolean z3) {
    }

    @Override // n0.r
    public void onScrollProgress(int i, int i4, int i5, int i6) {
    }
}
