package com.facebook.login.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.provider.FontsContractCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import com.facebook.internal.ab;
import com.facebook.internal.n;
import com.facebook.internal.o;
import com.facebook.internal.p;
import com.facebook.internal.t;
import com.facebook.j;
import com.facebook.u;
import com.google.android.gms.common.util.CrashUtils;

/* loaded from: classes.dex */
public class ProfilePictureView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6301a = "ProfilePictureView";

    /* renamed from: b, reason: collision with root package name */
    private String f6302b;

    /* renamed from: c, reason: collision with root package name */
    private int f6303c;

    /* renamed from: d, reason: collision with root package name */
    private int f6304d;
    private boolean e;
    private Bitmap f;
    private ImageView g;
    private int h;
    private o i;
    private a j;
    private Bitmap k;

    public interface a {
        void a(j jVar);
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6303c = 0;
        this.f6304d = 0;
        this.e = true;
        this.h = -1;
        this.k = null;
        a(context);
        a(attributeSet);
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6303c = 0;
        this.f6304d = 0;
        this.e = true;
        this.h = -1;
        this.k = null;
        a(context);
        a(attributeSet);
    }

    public final int getPresetSize() {
        return this.h;
    }

    public final void setPresetSize(int i) {
        switch (i) {
            case FontsContractCompat.FontRequestCallback.FAIL_REASON_SECURITY_VIOLATION /* -4 */:
            case FontsContractCompat.FontRequestCallback.FAIL_REASON_FONT_LOAD_ERROR /* -3 */:
            case -2:
            case -1:
                this.h = i;
                requestLayout();
                return;
            default:
                throw new IllegalArgumentException("Must use a predefined preset size");
        }
    }

    public final boolean a() {
        return this.e;
    }

    public final void setCropped(boolean z) {
        this.e = z;
        a(false);
    }

    public final String getProfileId() {
        return this.f6302b;
    }

    public final void setProfileId(String str) {
        boolean z;
        if (ab.a(this.f6302b) || !this.f6302b.equalsIgnoreCase(str)) {
            b();
            z = true;
        } else {
            z = false;
        }
        this.f6302b = str;
        a(z);
    }

    public final a getOnErrorListener() {
        return this.j;
    }

    public final void setOnErrorListener(a aVar) {
        this.j = aVar;
    }

    public final void setDefaultProfilePicture(Bitmap bitmap) {
        this.k = bitmap;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        boolean z;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i2) == 1073741824 || layoutParams.height != -2) {
            z = false;
        } else {
            size = c(true);
            i2 = View.MeasureSpec.makeMeasureSpec(size, CrashUtils.ErrorDialogData.SUPPRESSED);
            z = true;
        }
        if (View.MeasureSpec.getMode(i) != 1073741824 && layoutParams.width == -2) {
            size2 = c(true);
            i = View.MeasureSpec.makeMeasureSpec(size2, CrashUtils.ErrorDialogData.SUPPRESSED);
            z = true;
        }
        if (z) {
            setMeasuredDimension(size2, size);
            measureChildren(i, i2);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a(false);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ProfilePictureView_superState", onSaveInstanceState);
        bundle.putString("ProfilePictureView_profileId", this.f6302b);
        bundle.putInt("ProfilePictureView_presetSize", this.h);
        bundle.putBoolean("ProfilePictureView_isCropped", this.e);
        bundle.putParcelable("ProfilePictureView_bitmap", this.f);
        bundle.putInt("ProfilePictureView_width", this.f6304d);
        bundle.putInt("ProfilePictureView_height", this.f6303c);
        bundle.putBoolean("ProfilePictureView_refresh", this.i != null);
        return bundle;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable.getClass() != Bundle.class) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("ProfilePictureView_superState"));
        this.f6302b = bundle.getString("ProfilePictureView_profileId");
        this.h = bundle.getInt("ProfilePictureView_presetSize");
        this.e = bundle.getBoolean("ProfilePictureView_isCropped");
        this.f6304d = bundle.getInt("ProfilePictureView_width");
        this.f6303c = bundle.getInt("ProfilePictureView_height");
        setImageBitmap((Bitmap) bundle.getParcelable("ProfilePictureView_bitmap"));
        if (bundle.getBoolean("ProfilePictureView_refresh")) {
            a(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i = null;
    }

    private void a(Context context) {
        removeAllViews();
        this.g = new ImageView(context);
        this.g.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.g.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        addView(this.g);
    }

    private void a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.com_facebook_profile_picture_view);
        setPresetSize(obtainStyledAttributes.getInt(R.styleable.com_facebook_profile_picture_view_com_facebook_preset_size, -1));
        this.e = obtainStyledAttributes.getBoolean(R.styleable.com_facebook_profile_picture_view_com_facebook_is_cropped, true);
        obtainStyledAttributes.recycle();
    }

    private void a(boolean z) {
        boolean c2 = c();
        if (this.f6302b == null || this.f6302b.length() == 0 || (this.f6304d == 0 && this.f6303c == 0)) {
            b();
        } else if (c2 || z) {
            b(true);
        }
    }

    private void b() {
        if (this.i != null) {
            n.b(this.i);
        }
        if (this.k == null) {
            setImageBitmap(BitmapFactory.decodeResource(getResources(), a() ? R.drawable.com_facebook_profile_picture_blank_square : R.drawable.com_facebook_profile_picture_blank_portrait));
        } else {
            c();
            setImageBitmap(Bitmap.createScaledBitmap(this.k, this.f6304d, this.f6303c, false));
        }
    }

    private void setImageBitmap(Bitmap bitmap) {
        if (this.g == null || bitmap == null) {
            return;
        }
        this.f = bitmap;
        this.g.setImageBitmap(bitmap);
    }

    private void b(boolean z) {
        o a2 = new o.a(getContext(), o.a(this.f6302b, this.f6304d, this.f6303c)).a(z).a(this).a(new o.b() { // from class: com.facebook.login.widget.ProfilePictureView.1
            @Override // com.facebook.internal.o.b
            public void a(p pVar) {
                ProfilePictureView.this.a(pVar);
            }
        }).a();
        if (this.i != null) {
            n.b(this.i);
        }
        this.i = a2;
        n.a(a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(p pVar) {
        if (pVar.a() == this.i) {
            this.i = null;
            Bitmap c2 = pVar.c();
            Exception b2 = pVar.b();
            if (b2 == null) {
                if (c2 != null) {
                    setImageBitmap(c2);
                    if (pVar.d()) {
                        b(false);
                        return;
                    }
                    return;
                }
                return;
            }
            a aVar = this.j;
            if (aVar != null) {
                aVar.a(new j("Error in downloading profile picture for profileId: " + getProfileId(), b2));
                return;
            }
            t.a(u.REQUESTS, 6, f6301a, b2.toString());
        }
    }

    private boolean c() {
        int height = getHeight();
        int width = getWidth();
        boolean z = true;
        if (width < 1 || height < 1) {
            return false;
        }
        int c2 = c(false);
        if (c2 != 0) {
            height = c2;
            width = height;
        }
        if (width <= height) {
            height = a() ? width : 0;
        } else {
            width = a() ? height : 0;
        }
        if (width == this.f6304d && height == this.f6303c) {
            z = false;
        }
        this.f6304d = width;
        this.f6303c = height;
        return z;
    }

    private int c(boolean z) {
        int i;
        switch (this.h) {
            case FontsContractCompat.FontRequestCallback.FAIL_REASON_SECURITY_VIOLATION /* -4 */:
                i = R.dimen.com_facebook_profilepictureview_preset_size_large;
                break;
            case FontsContractCompat.FontRequestCallback.FAIL_REASON_FONT_LOAD_ERROR /* -3 */:
                i = R.dimen.com_facebook_profilepictureview_preset_size_normal;
                break;
            case -2:
                i = R.dimen.com_facebook_profilepictureview_preset_size_small;
                break;
            case -1:
                if (!z) {
                    return 0;
                }
                i = R.dimen.com_facebook_profilepictureview_preset_size_normal;
                break;
            default:
                return 0;
        }
        return getResources().getDimensionPixelSize(i);
    }
}
