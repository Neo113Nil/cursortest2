package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import e.AbstractC2408d;

/* loaded from: classes.dex */
class i0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f10938a;

    /* renamed from: b, reason: collision with root package name */
    private final View f10939b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f10940c;

    /* renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f10941d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f10942e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f10943f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f10944g;

    i0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f10941d = layoutParams;
        this.f10942e = new Rect();
        this.f10943f = new int[2];
        this.f10944g = new int[2];
        this.f10938a = context;
        View inflate = LayoutInflater.from(context).inflate(e.g.f36340s, (ViewGroup) null);
        this.f10939b = inflate;
        this.f10940c = (TextView) inflate.findViewById(e.f.f36314s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = e.i.f36356a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i4, int i5, boolean z4, WindowManager.LayoutParams layoutParams) {
        int height;
        int i6;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f10938a.getResources().getDimensionPixelOffset(AbstractC2408d.f36232k);
        if (view.getWidth() < dimensionPixelOffset) {
            i4 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f10938a.getResources().getDimensionPixelOffset(AbstractC2408d.f36231j);
            height = i5 + dimensionPixelOffset2;
            i6 = i5 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i6 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f10938a.getResources().getDimensionPixelOffset(z4 ? AbstractC2408d.f36234m : AbstractC2408d.f36233l);
        View b4 = b(view);
        if (b4 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b4.getWindowVisibleDisplayFrame(this.f10942e);
        Rect rect = this.f10942e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f10938a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f10942e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b4.getLocationOnScreen(this.f10944g);
        view.getLocationOnScreen(this.f10943f);
        int[] iArr = this.f10943f;
        int i7 = iArr[0];
        int[] iArr2 = this.f10944g;
        int i8 = i7 - iArr2[0];
        iArr[0] = i8;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i8 + i4) - (b4.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f10939b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f10939b.getMeasuredHeight();
        int i9 = this.f10943f[1];
        int i10 = ((i6 + i9) - dimensionPixelOffset3) - measuredHeight;
        int i11 = i9 + height + dimensionPixelOffset3;
        if (z4) {
            if (i10 >= 0) {
                layoutParams.y = i10;
                return;
            } else {
                layoutParams.y = i11;
                return;
            }
        }
        if (measuredHeight + i11 <= this.f10942e.height()) {
            layoutParams.y = i11;
        } else {
            layoutParams.y = i10;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams).type != 2) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return ((Activity) context).getWindow().getDecorView();
                }
            }
        }
        return rootView;
    }

    void c() {
        if (d()) {
            ((WindowManager) this.f10938a.getSystemService("window")).removeView(this.f10939b);
        }
    }

    boolean d() {
        return this.f10939b.getParent() != null;
    }

    void e(View view, int i4, int i5, boolean z4, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f10940c.setText(charSequence);
        a(view, i4, i5, z4, this.f10941d);
        ((WindowManager) this.f10938a.getSystemService("window")).addView(this.f10939b, this.f10941d);
    }
}
