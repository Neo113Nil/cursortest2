package com.bytedance.adsdk.lottie;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class LottieAnimationView extends ImageView {
    private static final Wyp<Throwable> icD = new Wyp<Throwable>() { // from class: com.bytedance.adsdk.lottie.LottieAnimationView.1
        @Override // com.bytedance.adsdk.lottie.Wyp
        public void pvs(Throwable th) {
            com.bytedance.adsdk.lottie.sUS.sUS.pvs(th);
        }
    };
    private static final String pvs = "LottieAnimationView";
    private final Set<icD> IP;
    private final Wyp<Throwable> Jd;
    private boolean Ju;
    private int Mxy;
    private Wyp<Throwable> NB;
    private com.bytedance.adsdk.ugeno.icD Wyp;
    private final Set<Object> bNS;
    private boolean kj;
    private kj<sUS> mnm;
    private boolean qh;
    private int sUS;
    private String so;
    private sUS vA;
    private final Wyp<sUS> vG;
    private final so yiw;

    private enum icD {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.vG = new Wyp<sUS>() { // from class: com.bytedance.adsdk.lottie.LottieAnimationView.2
            @Override // com.bytedance.adsdk.lottie.Wyp
            public void pvs(sUS sus) {
                LottieAnimationView.this.setComposition(sus);
            }
        };
        this.Jd = new Wyp<Throwable>() { // from class: com.bytedance.adsdk.lottie.LottieAnimationView.3
            @Override // com.bytedance.adsdk.lottie.Wyp
            public void pvs(Throwable th) {
                if (LottieAnimationView.this.sUS != 0) {
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    lottieAnimationView.setImageResource(lottieAnimationView.sUS);
                }
                (LottieAnimationView.this.NB == null ? LottieAnimationView.icD : LottieAnimationView.this.NB).pvs(th);
            }
        };
        this.sUS = 0;
        this.yiw = new so();
        this.qh = false;
        this.kj = false;
        this.Ju = true;
        this.IP = new HashSet();
        this.bNS = new HashSet();
        sUS();
    }

    public void pvs(com.bytedance.adsdk.ugeno.icD icd) {
        this.Wyp = icd;
    }

    private void sUS() {
        setSaveEnabled(false);
        this.Ju = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        pvs(0.0f, false);
        pvs(false);
        setIgnoreDisabledSystemAnimations(false);
        this.yiw.pvs(Boolean.valueOf(com.bytedance.adsdk.lottie.sUS.sUS.pvs(getContext()) != 0.0f));
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        yiw();
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        yiw();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        yiw();
        super.setImageBitmap(bitmap);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        so soVar;
        if (!this.qh && drawable == (soVar = this.yiw) && soVar.cR()) {
            Jd();
        } else if (!this.qh && (drawable instanceof so)) {
            so soVar2 = (so) drawable;
            if (soVar2.cR()) {
                soVar2.ZhG();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof so) && ((so) drawable).NB() == cR.SOFTWARE) {
            this.yiw.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        so soVar = this.yiw;
        if (drawable2 == soVar) {
            super.invalidateDrawable(soVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        pvs pvsVar = new pvs(super.onSaveInstanceState());
        pvsVar.pvs = this.so;
        pvsVar.icD = this.Mxy;
        pvsVar.vG = this.yiw.dyT();
        pvsVar.Jd = this.yiw.zM();
        pvsVar.NB = this.yiw.vG();
        pvsVar.sUS = this.yiw.mnm();
        pvsVar.yiw = this.yiw.vA();
        return pvsVar;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof pvs)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        pvs pvsVar = (pvs) parcelable;
        super.onRestoreInstanceState(pvsVar.getSuperState());
        this.so = pvsVar.pvs;
        if (!this.IP.contains(icD.SET_ANIMATION) && !TextUtils.isEmpty(this.so)) {
            setAnimation(this.so);
        }
        this.Mxy = pvsVar.icD;
        if (!this.IP.contains(icD.SET_ANIMATION) && (i = this.Mxy) != 0) {
            setAnimation(i);
        }
        if (!this.IP.contains(icD.SET_PROGRESS)) {
            pvs(pvsVar.vG, false);
        }
        if (!this.IP.contains(icD.PLAY_OPTION) && pvsVar.Jd) {
            pvs();
        }
        if (!this.IP.contains(icD.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(pvsVar.NB);
        }
        if (!this.IP.contains(icD.SET_REPEAT_MODE)) {
            setRepeatMode(pvsVar.sUS);
        }
        if (this.IP.contains(icD.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(pvsVar.yiw);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.kj) {
            this.yiw.Mxy();
        }
        com.bytedance.adsdk.ugeno.icD icd = this.Wyp;
        if (icd != null) {
            icd.sUS();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.icD icd = this.Wyp;
        if (icd != null) {
            icd.sUS();
        }
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.yiw.so(z);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.yiw.Mxy(z);
    }

    public void pvs(boolean z) {
        this.yiw.pvs(z);
    }

    public void setClipToCompositionBounds(boolean z) {
        this.yiw.icD(z);
    }

    public boolean getClipToCompositionBounds() {
        return this.yiw.icD();
    }

    public void setCacheComposition(boolean z) {
        this.Ju = z;
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.yiw.NB(z);
    }

    public void setAnimation(int i) {
        this.Mxy = i;
        this.so = null;
        setCompositionTask(pvs(i));
    }

    private kj<sUS> pvs(final int i) {
        if (isInEditMode()) {
            return new kj<>(new Callable<qh<sUS>>() { // from class: com.bytedance.adsdk.lottie.LottieAnimationView.4
                @Override // java.util.concurrent.Callable
                /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
                public qh<sUS> call() throws Exception {
                    return LottieAnimationView.this.Ju ? yiw.icD(LottieAnimationView.this.getContext(), i) : yiw.icD(LottieAnimationView.this.getContext(), i, (String) null);
                }
            }, true);
        }
        return this.Ju ? yiw.pvs(getContext(), i) : yiw.pvs(getContext(), i, (String) null);
    }

    public void setAnimation(String str) {
        this.so = str;
        this.Mxy = 0;
        setCompositionTask(pvs(str));
    }

    private kj<sUS> pvs(final String str) {
        if (isInEditMode()) {
            return new kj<>(new Callable<qh<sUS>>() { // from class: com.bytedance.adsdk.lottie.LottieAnimationView.5
                @Override // java.util.concurrent.Callable
                /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
                public qh<sUS> call() throws Exception {
                    return LottieAnimationView.this.Ju ? yiw.vG(LottieAnimationView.this.getContext(), str) : yiw.vG(LottieAnimationView.this.getContext(), str, null);
                }
            }, true);
        }
        return this.Ju ? yiw.icD(getContext(), str) : yiw.icD(getContext(), str, (String) null);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        pvs(str, (String) null);
    }

    public void pvs(String str, String str2) {
        pvs(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void pvs(InputStream inputStream, String str) {
        setCompositionTask(yiw.pvs(inputStream, str));
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.Ju ? yiw.pvs(getContext(), str) : yiw.pvs(getContext(), str, (String) null));
    }

    public void setFailureListener(Wyp<Throwable> wyp) {
        this.NB = wyp;
    }

    public void setFallbackResource(int i) {
        this.sUS = i;
    }

    private void setCompositionTask(kj<sUS> kjVar) {
        this.IP.add(icD.SET_ANIMATION);
        so();
        yiw();
        this.mnm = kjVar.pvs(this.vG).vG(this.Jd);
    }

    private void yiw() {
        kj<sUS> kjVar = this.mnm;
        if (kjVar != null) {
            kjVar.icD(this.vG);
            this.mnm.Jd(this.Jd);
        }
    }

    public void setComposition(sUS sus) {
        if (NB.pvs) {
            Log.v(pvs, "Set Composition \n".concat(String.valueOf(sus)));
        }
        this.yiw.setCallback(this);
        this.vA = sus;
        this.qh = true;
        boolean pvs2 = this.yiw.pvs(sus);
        this.qh = false;
        if (getDrawable() != this.yiw || pvs2) {
            if (!pvs2) {
                Mxy();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<Object> it = this.bNS.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public sUS getComposition() {
        return this.vA;
    }

    public void pvs() {
        this.IP.add(icD.PLAY_OPTION);
        this.yiw.Mxy();
    }

    public void setMinFrame(int i) {
        this.yiw.pvs(i);
    }

    public float getMinFrame() {
        return this.yiw.kj();
    }

    public void setMinProgress(float f) {
        this.yiw.pvs(f);
    }

    public void setMaxFrame(int i) {
        this.yiw.icD(i);
    }

    public float getMaxFrame() {
        return this.yiw.Ju();
    }

    public void setMaxProgress(float f) {
        this.yiw.icD(f);
    }

    public void setMinFrame(String str) {
        this.yiw.icD(str);
    }

    public void setMaxFrame(String str) {
        this.yiw.vG(str);
    }

    public void setMinAndMaxFrame(String str) {
        this.yiw.Jd(str);
    }

    public void setSpeed(float f) {
        this.yiw.vG(f);
    }

    public float getSpeed() {
        return this.yiw.IP();
    }

    @Deprecated
    public void icD(boolean z) {
        this.yiw.NB(z ? -1 : 0);
    }

    public void setRepeatMode(int i) {
        this.IP.add(icD.SET_REPEAT_MODE);
        this.yiw.Jd(i);
    }

    public int getRepeatMode() {
        return this.yiw.mnm();
    }

    public void setRepeatCount(int i) {
        this.IP.add(icD.SET_REPEAT_COUNT);
        this.yiw.NB(i);
    }

    public int getRepeatCount() {
        return this.yiw.vA();
    }

    public boolean icD() {
        return this.yiw.cR();
    }

    public void setImageAssetsFolder(String str) {
        this.yiw.pvs(str);
    }

    public String getImageAssetsFolder() {
        return this.yiw.vG();
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.yiw.vG(z);
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.yiw.Jd();
    }

    public Bitmap pvs(String str, Bitmap bitmap) {
        return this.yiw.pvs(str, bitmap);
    }

    public void setImageAssetDelegate(Jd jd) {
        this.yiw.pvs(jd);
    }

    public void setDefaultFontFileExtension(String str) {
        this.yiw.yiw(str);
    }

    public void setFontAssetDelegate(vG vGVar) {
        this.yiw.pvs(vGVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.yiw.pvs(map);
    }

    public void setTextDelegate(zM zMVar) {
        this.yiw.pvs(zMVar);
    }

    public void vG() {
        this.IP.add(icD.PLAY_OPTION);
        this.yiw.ny();
    }

    public void Jd() {
        this.kj = false;
        this.yiw.ZhG();
    }

    public void setFrame(int i) {
        this.yiw.vG(i);
    }

    public int getFrame() {
        return this.yiw.bNS();
    }

    public void setProgress(float f) {
        pvs(f, true);
    }

    private void pvs(float f, boolean z) {
        if (z) {
            this.IP.add(icD.SET_PROGRESS);
        }
        this.yiw.Jd(f);
    }

    public float getProgress() {
        return this.yiw.dyT();
    }

    public long getDuration() {
        sUS sus = this.vA;
        if (sus != null) {
            return (long) sus.NB();
        }
        return 0L;
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.yiw.Jd(z);
    }

    public vA getPerformanceTracker() {
        return this.yiw.sUS();
    }

    private void so() {
        this.vA = null;
        this.yiw.so();
    }

    public void setSafeMode(boolean z) {
        this.yiw.yiw(z);
    }

    public void setRenderMode(cR cRVar) {
        this.yiw.pvs(cRVar);
    }

    public cR getRenderMode() {
        return this.yiw.NB();
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.yiw.sUS(z);
    }

    private void Mxy() {
        boolean icD2 = icD();
        setImageDrawable(null);
        setImageDrawable(this.yiw);
        if (icD2) {
            this.yiw.qh();
        }
    }

    private static class pvs extends View.BaseSavedState {
        public static final Parcelable.Creator<pvs> CREATOR = new Parcelable.Creator<pvs>() { // from class: com.bytedance.adsdk.lottie.LottieAnimationView.pvs.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
            public pvs createFromParcel(Parcel parcel) {
                return new pvs(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
            public pvs[] newArray(int i) {
                return new pvs[i];
            }
        };
        boolean Jd;
        String NB;
        int icD;
        String pvs;
        int sUS;
        float vG;
        int yiw;

        pvs(Parcelable parcelable) {
            super(parcelable);
        }

        private pvs(Parcel parcel) {
            super(parcel);
            this.pvs = parcel.readString();
            this.vG = parcel.readFloat();
            this.Jd = parcel.readInt() == 1;
            this.NB = parcel.readString();
            this.sUS = parcel.readInt();
            this.yiw = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.pvs);
            parcel.writeFloat(this.vG);
            parcel.writeInt(this.Jd ? 1 : 0);
            parcel.writeString(this.NB);
            parcel.writeInt(this.sUS);
            parcel.writeInt(this.yiw);
        }
    }
}
