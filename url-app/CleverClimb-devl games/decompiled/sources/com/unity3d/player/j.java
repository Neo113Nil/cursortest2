package com.unity3d.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;

/* loaded from: classes2.dex */
public final class j extends View {

    /* renamed from: a, reason: collision with root package name */
    final int f9371a;

    /* renamed from: b, reason: collision with root package name */
    final int f9372b;

    /* renamed from: c, reason: collision with root package name */
    Bitmap f9373c;

    /* renamed from: d, reason: collision with root package name */
    Bitmap f9374d;

    /* renamed from: com.unity3d.player.j$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9375a = new int[a.a().length];

        static {
            try {
                f9375a[a.f9376a - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9375a[a.f9377b - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9375a[a.f9378c - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f9376a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f9377b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f9378c = 3;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ int[] f9379d = {f9376a, f9377b, f9378c};

        public static int[] a() {
            return (int[]) f9379d.clone();
        }
    }

    public j(Context context, int i) {
        super(context);
        this.f9371a = i;
        this.f9372b = getResources().getIdentifier("unity_static_splash", "drawable", getContext().getPackageName());
        if (this.f9372b != 0) {
            forceLayout();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f9373c != null) {
            this.f9373c.recycle();
            this.f9373c = null;
        }
        if (this.f9374d != null) {
            this.f9374d.recycle();
            this.f9374d = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r12 < r10) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f9372b == 0) {
            return;
        }
        if (this.f9373c == null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = false;
            this.f9373c = BitmapFactory.decodeResource(getResources(), this.f9372b, options);
        }
        int width = this.f9373c.getWidth();
        int height = this.f9373c.getHeight();
        int width2 = getWidth();
        int height2 = getHeight();
        if (width2 == 0 || height2 == 0) {
            return;
        }
        float f = width / height;
        float f2 = width2;
        float f3 = height2;
        boolean z2 = f2 / f3 <= f;
        switch (AnonymousClass1.f9375a[this.f9371a - 1]) {
            case 1:
                if (width2 < width) {
                    height = (int) (f2 / f);
                    width = width2;
                    break;
                }
                break;
            case 2:
            case 3:
                if ((this.f9371a == a.f9378c) ^ z2) {
                    height = (int) (f2 / f);
                    width = width2;
                    break;
                }
                width = (int) (f3 * f);
                height = height2;
                break;
        }
        if (this.f9374d != null) {
            if (this.f9374d.getWidth() == width && this.f9374d.getHeight() == height) {
                return;
            }
            if (this.f9374d != this.f9373c) {
                this.f9374d.recycle();
                this.f9374d = null;
            }
        }
        this.f9374d = Bitmap.createScaledBitmap(this.f9373c, width, height, true);
        this.f9374d.setDensity(getResources().getDisplayMetrics().densityDpi);
        ColorDrawable colorDrawable = new ColorDrawable(-16777216);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), this.f9374d);
        bitmapDrawable.setGravity(17);
        setBackground(new LayerDrawable(new Drawable[]{colorDrawable, bitmapDrawable}));
    }
}
