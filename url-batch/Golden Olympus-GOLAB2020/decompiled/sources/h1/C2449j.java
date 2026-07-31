package h1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.ironsource.b9;

/* renamed from: h1.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2449j extends View {

    /* renamed from: a, reason: collision with root package name */
    public final int f36744a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36745b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36746c;

    /* renamed from: d, reason: collision with root package name */
    public Bitmap f36747d;

    /* renamed from: e, reason: collision with root package name */
    public Bitmap f36748e;

    public C2449j(Context context, int i4) {
        super(context);
        this.f36746c = -16777216;
        this.f36744a = i4;
        int identifier = getResources().getIdentifier("unity_static_splash", "drawable", getContext().getPackageName());
        this.f36745b = identifier;
        if (identifier != 0) {
            forceLayout();
        }
        int identifier2 = getResources().getIdentifier("staticSplashScreenBackgroundColor", b9.h.f15459S, getContext().getPackageName());
        if (identifier2 != 0) {
            this.f36746c = getResources().getColor(identifier2, getContext().getTheme());
        }
        setBackgroundColor(this.f36746c);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f36747d;
        if (bitmap != null) {
            bitmap.recycle();
            this.f36747d = null;
        }
        Bitmap bitmap2 = this.f36748e;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.f36748e = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0069, code lost:
    
        if (r1 < r12) goto L31;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        if (this.f36745b == 0) {
            return;
        }
        if (this.f36747d == null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = false;
            this.f36747d = BitmapFactory.decodeResource(getResources(), this.f36745b, options);
        }
        int width = this.f36747d.getWidth();
        int height = this.f36747d.getHeight();
        int width2 = getWidth();
        int height2 = getHeight();
        if (width2 == 0 || height2 == 0) {
            return;
        }
        float f4 = width / height;
        float f5 = width2;
        float f6 = height2;
        boolean z5 = f5 / f6 <= f4;
        int a4 = E.a(this.f36744a);
        if (a4 != 0) {
            if (a4 == 1 || a4 == 2) {
                if ((this.f36744a == 3) ^ z5) {
                    height = (int) (f5 / f4);
                    width = width2;
                }
                width = (int) (f6 * f4);
                height = height2;
            }
        } else if (width2 < width) {
            height = (int) (f5 / f4);
            width = width2;
        }
        Bitmap bitmap = this.f36748e;
        if (bitmap != null) {
            if (bitmap.getWidth() == width && this.f36748e.getHeight() == height) {
                return;
            }
            Bitmap bitmap2 = this.f36748e;
            if (bitmap2 != this.f36747d) {
                bitmap2.recycle();
                this.f36748e = null;
            }
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f36747d, width, height, true);
        this.f36748e = createScaledBitmap;
        createScaledBitmap.setDensity(getResources().getDisplayMetrics().densityDpi);
        ColorDrawable colorDrawable = new ColorDrawable(this.f36746c);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), this.f36748e);
        bitmapDrawable.setGravity(17);
        setBackground(new LayerDrawable(new Drawable[]{colorDrawable, bitmapDrawable}));
    }
}
