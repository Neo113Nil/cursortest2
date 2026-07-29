package com.android.volley.toolbox;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.volley.s;
import com.android.volley.toolbox.h;

/* loaded from: classes.dex */
public class NetworkImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private String f2317a;

    /* renamed from: b, reason: collision with root package name */
    private int f2318b;

    /* renamed from: c, reason: collision with root package name */
    private int f2319c;

    /* renamed from: d, reason: collision with root package name */
    private h f2320d;
    private h.c e;

    public NetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setDefaultImageResId(int i) {
        this.f2318b = i;
    }

    public void setErrorImageResId(int i) {
        this.f2319c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void a(boolean z) {
        boolean z2;
        boolean z3;
        int width = getWidth();
        int height = getHeight();
        ImageView.ScaleType scaleType = getScaleType();
        if (getLayoutParams() != null) {
            z2 = getLayoutParams().width == -2;
            if (getLayoutParams().height == -2) {
                z3 = true;
                boolean z4 = !z2 && z3;
                if (width == 0 || height != 0 || z4) {
                    if (!TextUtils.isEmpty(this.f2317a)) {
                        if (this.e != null) {
                            this.e.a();
                            this.e = null;
                        }
                        a();
                        return;
                    }
                    if (this.e != null && this.e.c() != null) {
                        if (this.e.c().equals(this.f2317a)) {
                            return;
                        }
                        this.e.a();
                        a();
                    }
                    if (z2) {
                        width = 0;
                    }
                    this.e = this.f2320d.a(this.f2317a, new AnonymousClass1(z), width, z3 ? 0 : height, scaleType);
                    return;
                }
                return;
            }
        } else {
            z2 = false;
        }
        z3 = false;
        if (z2) {
        }
        if (width == 0) {
        }
        if (!TextUtils.isEmpty(this.f2317a)) {
        }
    }

    /* renamed from: com.android.volley.toolbox.NetworkImageView$1, reason: invalid class name */
    class AnonymousClass1 implements h.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f2321a;

        AnonymousClass1(boolean z) {
            this.f2321a = z;
        }

        @Override // com.android.volley.n.a
        public void onErrorResponse(s sVar) {
            if (NetworkImageView.this.f2319c != 0) {
                NetworkImageView.this.setImageResource(NetworkImageView.this.f2319c);
            }
        }

        @Override // com.android.volley.toolbox.h.d
        public void a(final h.c cVar, boolean z) {
            if (z && this.f2321a) {
                NetworkImageView.this.post(new Runnable() { // from class: com.android.volley.toolbox.NetworkImageView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass1.this.a(cVar, false);
                    }
                });
            } else {
                if (cVar.b() == null) {
                    if (NetworkImageView.this.f2318b != 0) {
                        NetworkImageView.this.setImageResource(NetworkImageView.this.f2318b);
                        return;
                    }
                    return;
                }
                NetworkImageView.this.setImageBitmap(cVar.b());
            }
        }
    }

    private void a() {
        if (this.f2318b != 0) {
            setImageResource(this.f2318b);
        } else {
            setImageBitmap(null);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a(true);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        if (this.e != null) {
            this.e.a();
            setImageBitmap(null);
            this.e = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }
}
