package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class zai extends Drawable implements Drawable.Callback {
    private int zaa;
    private long zab;
    private int zac;
    private int zad;
    private int zae;
    private int zaf;
    private boolean zag;
    private boolean zah;
    private zag zai;
    private Drawable zaj;
    private Drawable zak;
    private boolean zal;
    private boolean zam;
    private boolean zan;
    private int zao;

    public zai(Drawable drawable, Drawable drawable2) {
        this(null);
        drawable = drawable == null ? zaf.zaa : drawable;
        this.zaj = drawable;
        drawable.setCallback(this);
        zag zagVar = this.zai;
        zagVar.zab = drawable.getChangingConfigurations() | zagVar.zab;
        drawable2 = drawable2 == null ? zaf.zaa : drawable2;
        this.zak = drawable2;
        drawable2.setCallback(this);
        zag zagVar2 = this.zai;
        zagVar2.zab = drawable2.getChangingConfigurations() | zagVar2.zab;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004f, code lost:
    
        if (r0 == 0) goto L22;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        boolean z4;
        int i4 = this.zaa;
        int i5 = 0;
        if (i4 == 1) {
            this.zab = SystemClock.uptimeMillis();
            this.zaa = 2;
            z4 = false;
        } else if (i4 == 2 && this.zab >= 0) {
            float uptimeMillis = (SystemClock.uptimeMillis() - this.zab) / this.zae;
            z4 = uptimeMillis >= 1.0f;
            if (z4) {
                this.zaa = 0;
            }
            this.zaf = (int) ((this.zac * Math.min(uptimeMillis, 1.0f)) + 0.0f);
        } else {
            z4 = true;
        }
        int i6 = this.zaf;
        boolean z5 = this.zag;
        Drawable drawable = this.zaj;
        Drawable drawable2 = this.zak;
        if (z4) {
            if (!z5) {
                i5 = i6;
            }
            drawable.draw(canvas);
            i6 = i5;
            int i7 = this.zad;
            if (i6 == i7) {
                drawable2.setAlpha(i7);
                drawable2.draw(canvas);
                return;
            }
            return;
        }
        if (z5) {
            drawable.setAlpha(this.zad - i6);
            i5 = 1;
        }
        drawable.draw(canvas);
        if (i5 != 0) {
            drawable.setAlpha(this.zad);
        }
        if (i6 > 0) {
            drawable2.setAlpha(i6);
            drawable2.draw(canvas);
            drawable2.setAlpha(this.zad);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        zag zagVar = this.zai;
        return changingConfigurations | zagVar.zaa | zagVar.zab;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!zac()) {
            return null;
        }
        this.zai.zaa = getChangingConfigurations();
        return this.zai;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.zaj.getIntrinsicHeight(), this.zak.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.zaj.getIntrinsicWidth(), this.zak.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.zan) {
            this.zao = Drawable.resolveOpacity(this.zaj.getOpacity(), this.zak.getOpacity());
            this.zan = true;
        }
        return this.zao;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (this.zah || super.mutate() != this) {
            return this;
        }
        if (!zac()) {
            throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
        }
        this.zaj.mutate();
        this.zak.mutate();
        this.zah = true;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.zaj.setBounds(rect);
        this.zak.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        if (this.zaf == this.zad) {
            this.zaf = i4;
        }
        this.zad = i4;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.zaj.setColorFilter(colorFilter);
        this.zak.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final Drawable zaa() {
        return this.zak;
    }

    public final void zab(int i4) {
        this.zac = this.zad;
        this.zaf = 0;
        this.zae = IronSourceConstants.INTERSTITIAL_DAILY_CAPPED;
        this.zaa = 1;
        invalidateSelf();
    }

    public final boolean zac() {
        if (!this.zal) {
            boolean z4 = false;
            if (this.zaj.getConstantState() != null && this.zak.getConstantState() != null) {
                z4 = true;
            }
            this.zam = z4;
            this.zal = true;
        }
        return this.zam;
    }

    zai(zag zagVar) {
        this.zaa = 0;
        this.zad = KotlinVersion.MAX_COMPONENT_VALUE;
        this.zaf = 0;
        this.zag = true;
        this.zai = new zag(zagVar);
    }
}
