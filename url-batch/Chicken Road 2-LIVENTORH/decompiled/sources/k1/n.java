package k1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f2211a;

    /* renamed from: b, reason: collision with root package name */
    public m f2212b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f2213c;
    public PorterDuff.Mode d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2214e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f2215f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2216g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f2217h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2218j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2219k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f2220l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f2211a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new p(this);
    }
}
