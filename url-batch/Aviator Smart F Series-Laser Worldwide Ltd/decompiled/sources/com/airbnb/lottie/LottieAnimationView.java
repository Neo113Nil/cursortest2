package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    private static final k0 DEFAULT_FAILURE_LISTENER = new k0() { // from class: com.airbnb.lottie.f
        @Override // com.airbnb.lottie.k0
        public final void onResult(Object obj) {
            LottieAnimationView.lambda$static$0((Throwable) obj);
        }
    };
    private static final String TAG = "LottieAnimationView";
    private String animationName;

    @RawRes
    private int animationResId;
    private boolean autoPlay;
    private boolean cacheComposition;

    @Nullable
    private h composition;

    @Nullable
    private q0 compositionTask;

    @Nullable
    private k0 failureListener;

    @DrawableRes
    private int fallbackResource;
    private boolean ignoreUnschedule;
    private final k0 loadedListener;
    private final LottieDrawable lottieDrawable;
    private final Set<m0> lottieOnCompositionLoadedListeners;
    private final Set<UserActionTaken> userActionsTaken;
    private final k0 wrappedFailureListener;

    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        String animationName;
        int animationResId;
        String imageAssetsFolder;
        boolean isAnimating;
        float progress;
        int repeatCount;
        int repeatMode;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i8) {
                return new SavedState[i8];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeString(this.animationName);
            parcel.writeFloat(this.progress);
            parcel.writeInt(this.isAnimating ? 1 : 0);
            parcel.writeString(this.imageAssetsFolder);
            parcel.writeInt(this.repeatMode);
            parcel.writeInt(this.repeatCount);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.animationName = parcel.readString();
            this.progress = parcel.readFloat();
            this.isAnimating = parcel.readInt() == 1;
            this.imageAssetsFolder = parcel.readString();
            this.repeatMode = parcel.readInt();
            this.repeatCount = parcel.readInt();
        }
    }

    private enum UserActionTaken {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    class a implements k0 {
        a() {
        }

        @Override // com.airbnb.lottie.k0
        public void onResult(Throwable th) {
            if (LottieAnimationView.this.fallbackResource != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.fallbackResource);
            }
            (LottieAnimationView.this.failureListener == null ? LottieAnimationView.DEFAULT_FAILURE_LISTENER : LottieAnimationView.this.failureListener).onResult(th);
        }
    }

    class b extends com.airbnb.lottie.value.c {
        final /* synthetic */ com.airbnb.lottie.value.e val$callback;

        b(com.airbnb.lottie.value.e eVar) {
        }

        @Override // com.airbnb.lottie.value.c
        public T getValue(com.airbnb.lottie.value.b bVar) {
            throw null;
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.loadedListener = new k0() { // from class: com.airbnb.lottie.e
            @Override // com.airbnb.lottie.k0
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((h) obj);
            }
        };
        this.wrappedFailureListener = new a();
        this.fallbackResource = 0;
        this.lottieDrawable = new LottieDrawable();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        init(null, R$attr.lottieAnimationViewStyle);
    }

    private void cancelLoaderTask() {
        q0 q0Var = this.compositionTask;
        if (q0Var != null) {
            q0Var.removeListener(this.loadedListener);
            this.compositionTask.removeFailureListener(this.wrappedFailureListener);
        }
    }

    private void clearComposition() {
        this.composition = null;
        this.lottieDrawable.clearComposition();
    }

    private q0 fromAssets(final String str) {
        return isInEditMode() ? new q0(new Callable() { // from class: com.airbnb.lottie.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o0 lambda$fromAssets$2;
                lambda$fromAssets$2 = LottieAnimationView.this.lambda$fromAssets$2(str);
                return lambda$fromAssets$2;
            }
        }, true) : this.cacheComposition ? t.fromAsset(getContext(), str) : t.fromAsset(getContext(), str, null);
    }

    private q0 fromRawRes(@RawRes final int i8) {
        return isInEditMode() ? new q0(new Callable() { // from class: com.airbnb.lottie.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o0 lambda$fromRawRes$1;
                lambda$fromRawRes$1 = LottieAnimationView.this.lambda$fromRawRes$1(i8);
                return lambda$fromRawRes$1;
            }
        }, true) : this.cacheComposition ? t.fromRawRes(getContext(), i8) : t.fromRawRes(getContext(), i8, null);
    }

    private void init(@Nullable AttributeSet attributeSet, @AttrRes int i8) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.LottieAnimationView, i8, 0);
        this.cacheComposition = obtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_cacheComposition, true);
        int i9 = R$styleable.LottieAnimationView_lottie_rawRes;
        boolean hasValue = obtainStyledAttributes.hasValue(i9);
        int i10 = R$styleable.LottieAnimationView_lottie_fileName;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i10);
        int i11 = R$styleable.LottieAnimationView_lottie_url;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i11);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(i9, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(i10);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(i11)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(R$styleable.LottieAnimationView_lottie_fallbackRes, 0));
        if (obtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_autoPlay, false)) {
            this.autoPlay = true;
        }
        if (obtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_loop, false)) {
            this.lottieDrawable.setRepeatCount(-1);
        }
        int i12 = R$styleable.LottieAnimationView_lottie_repeatMode;
        if (obtainStyledAttributes.hasValue(i12)) {
            setRepeatMode(obtainStyledAttributes.getInt(i12, 1));
        }
        int i13 = R$styleable.LottieAnimationView_lottie_repeatCount;
        if (obtainStyledAttributes.hasValue(i13)) {
            setRepeatCount(obtainStyledAttributes.getInt(i13, -1));
        }
        int i14 = R$styleable.LottieAnimationView_lottie_speed;
        if (obtainStyledAttributes.hasValue(i14)) {
            setSpeed(obtainStyledAttributes.getFloat(i14, 1.0f));
        }
        int i15 = R$styleable.LottieAnimationView_lottie_clipToCompositionBounds;
        if (obtainStyledAttributes.hasValue(i15)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(i15, true));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(R$styleable.LottieAnimationView_lottie_imageAssetsFolder));
        setProgress(obtainStyledAttributes.getFloat(R$styleable.LottieAnimationView_lottie_progress, 0.0f));
        enableMergePathsForKitKatAndAbove(obtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        int i16 = R$styleable.LottieAnimationView_lottie_colorFilter;
        if (obtainStyledAttributes.hasValue(i16)) {
            addValueCallback(new com.airbnb.lottie.model.d("**"), (com.airbnb.lottie.model.d) n0.COLOR_FILTER, new com.airbnb.lottie.value.c(new s0(AppCompatResources.getColorStateList(getContext(), obtainStyledAttributes.getResourceId(i16, -1)).getDefaultColor())));
        }
        int i17 = R$styleable.LottieAnimationView_lottie_renderMode;
        if (obtainStyledAttributes.hasValue(i17)) {
            RenderMode renderMode = RenderMode.AUTOMATIC;
            int i18 = obtainStyledAttributes.getInt(i17, renderMode.ordinal());
            if (i18 >= RenderMode.values().length) {
                i18 = renderMode.ordinal();
            }
            setRenderMode(RenderMode.values()[i18]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        obtainStyledAttributes.recycle();
        this.lottieDrawable.setSystemAnimationsAreEnabled(Boolean.valueOf(com.airbnb.lottie.utils.j.getAnimationScale(getContext()) != 0.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ o0 lambda$fromAssets$2(String str) {
        return this.cacheComposition ? t.fromAssetSync(getContext(), str) : t.fromAssetSync(getContext(), str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ o0 lambda$fromRawRes$1(int i8) {
        return this.cacheComposition ? t.fromRawResSync(getContext(), i8) : t.fromRawResSync(getContext(), i8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Throwable th) {
        if (!com.airbnb.lottie.utils.j.isNetworkException(th)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        com.airbnb.lottie.utils.f.warning("Unable to load composition.", th);
    }

    private void setCompositionTask(q0 q0Var) {
        this.userActionsTaken.add(UserActionTaken.SET_ANIMATION);
        clearComposition();
        cancelLoaderTask();
        this.compositionTask = q0Var.addListener(this.loadedListener).addFailureListener(this.wrappedFailureListener);
    }

    private void setLottieDrawable() {
        boolean isAnimating = isAnimating();
        setImageDrawable(null);
        setImageDrawable(this.lottieDrawable);
        if (isAnimating) {
            this.lottieDrawable.resumeAnimation();
        }
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.addAnimatorListener(animatorListener);
    }

    @RequiresApi(api = 19)
    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lottieDrawable.addAnimatorPauseListener(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.addAnimatorUpdateListener(animatorUpdateListener);
    }

    public boolean addLottieOnCompositionLoadedListener(@NonNull m0 m0Var) {
        h hVar = this.composition;
        if (hVar != null) {
            m0Var.onCompositionLoaded(hVar);
        }
        return this.lottieOnCompositionLoadedListeners.add(m0Var);
    }

    public <T> void addValueCallback(com.airbnb.lottie.model.d dVar, T t7, com.airbnb.lottie.value.c cVar) {
        this.lottieDrawable.addValueCallback(dVar, (com.airbnb.lottie.model.d) t7, cVar);
    }

    @MainThread
    public void cancelAnimation() {
        this.userActionsTaken.add(UserActionTaken.PLAY_OPTION);
        this.lottieDrawable.cancelAnimation();
    }

    @Deprecated
    public void disableExtraScaleModeInFitXY() {
        this.lottieDrawable.disableExtraScaleModeInFitXY();
    }

    public void enableMergePathsForKitKatAndAbove(boolean z7) {
        this.lottieDrawable.enableMergePathsForKitKatAndAbove(z7);
    }

    public boolean getClipToCompositionBounds() {
        return this.lottieDrawable.getClipToCompositionBounds();
    }

    @Nullable
    public h getComposition() {
        return this.composition;
    }

    public long getDuration() {
        h hVar = this.composition;
        if (hVar != null) {
            return (long) hVar.getDuration();
        }
        return 0L;
    }

    public int getFrame() {
        return this.lottieDrawable.getFrame();
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.lottieDrawable.getImageAssetsFolder();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.lottieDrawable.getMaintainOriginalImageBounds();
    }

    public float getMaxFrame() {
        return this.lottieDrawable.getMaxFrame();
    }

    public float getMinFrame() {
        return this.lottieDrawable.getMinFrame();
    }

    @Nullable
    public r0 getPerformanceTracker() {
        return this.lottieDrawable.getPerformanceTracker();
    }

    @FloatRange(from = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, to = 1.0d)
    public float getProgress() {
        return this.lottieDrawable.getProgress();
    }

    public RenderMode getRenderMode() {
        return this.lottieDrawable.getRenderMode();
    }

    public int getRepeatCount() {
        return this.lottieDrawable.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.lottieDrawable.getRepeatMode();
    }

    public float getSpeed() {
        return this.lottieDrawable.getSpeed();
    }

    public boolean hasMasks() {
        return this.lottieDrawable.hasMasks();
    }

    public boolean hasMatte() {
        return this.lottieDrawable.hasMatte();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof LottieDrawable) && ((LottieDrawable) drawable).getRenderMode() == RenderMode.SOFTWARE) {
            this.lottieDrawable.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean isAnimating() {
        return this.lottieDrawable.isAnimating();
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.lottieDrawable.isMergePathsEnabledForKitKatAndAbove();
    }

    @Deprecated
    public void loop(boolean z7) {
        this.lottieDrawable.setRepeatCount(z7 ? -1 : 0);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.autoPlay) {
            return;
        }
        this.lottieDrawable.playAnimation();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i8;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.animationName = savedState.animationName;
        Set<UserActionTaken> set = this.userActionsTaken;
        UserActionTaken userActionTaken = UserActionTaken.SET_ANIMATION;
        if (!set.contains(userActionTaken) && !TextUtils.isEmpty(this.animationName)) {
            setAnimation(this.animationName);
        }
        this.animationResId = savedState.animationResId;
        if (!this.userActionsTaken.contains(userActionTaken) && (i8 = this.animationResId) != 0) {
            setAnimation(i8);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_PROGRESS)) {
            setProgress(savedState.progress);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.PLAY_OPTION) && savedState.isAnimating) {
            playAnimation();
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.imageAssetsFolder);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.repeatMode);
        }
        if (this.userActionsTaken.contains(UserActionTaken.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.repeatCount);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.animationName = this.animationName;
        savedState.animationResId = this.animationResId;
        savedState.progress = this.lottieDrawable.getProgress();
        savedState.isAnimating = this.lottieDrawable.isAnimatingOrWillAnimateOnVisible();
        savedState.imageAssetsFolder = this.lottieDrawable.getImageAssetsFolder();
        savedState.repeatMode = this.lottieDrawable.getRepeatMode();
        savedState.repeatCount = this.lottieDrawable.getRepeatCount();
        return savedState;
    }

    @MainThread
    public void pauseAnimation() {
        this.autoPlay = false;
        this.lottieDrawable.pauseAnimation();
    }

    @MainThread
    public void playAnimation() {
        this.userActionsTaken.add(UserActionTaken.PLAY_OPTION);
        this.lottieDrawable.playAnimation();
    }

    public void removeAllAnimatorListeners() {
        this.lottieDrawable.removeAllAnimatorListeners();
    }

    public void removeAllLottieOnCompositionLoadedListener() {
        this.lottieOnCompositionLoadedListeners.clear();
    }

    public void removeAllUpdateListeners() {
        this.lottieDrawable.removeAllUpdateListeners();
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.removeAnimatorListener(animatorListener);
    }

    @RequiresApi(api = 19)
    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lottieDrawable.removeAnimatorPauseListener(animatorPauseListener);
    }

    public boolean removeLottieOnCompositionLoadedListener(@NonNull m0 m0Var) {
        return this.lottieOnCompositionLoadedListeners.remove(m0Var);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.removeAnimatorUpdateListener(animatorUpdateListener);
    }

    public List<com.airbnb.lottie.model.d> resolveKeyPath(com.airbnb.lottie.model.d dVar) {
        return this.lottieDrawable.resolveKeyPath(dVar);
    }

    @MainThread
    public void resumeAnimation() {
        this.userActionsTaken.add(UserActionTaken.PLAY_OPTION);
        this.lottieDrawable.resumeAnimation();
    }

    public void reverseAnimationSpeed() {
        this.lottieDrawable.reverseAnimationSpeed();
    }

    public void setAnimation(@RawRes int i8) {
        this.animationResId = i8;
        this.animationName = null;
        setCompositionTask(fromRawRes(i8));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.cacheComposition ? t.fromUrl(getContext(), str) : t.fromUrl(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z7) {
        this.lottieDrawable.setApplyingOpacityToLayersEnabled(z7);
    }

    public void setCacheComposition(boolean z7) {
        this.cacheComposition = z7;
    }

    public void setClipToCompositionBounds(boolean z7) {
        this.lottieDrawable.setClipToCompositionBounds(z7);
    }

    public void setComposition(@NonNull h hVar) {
        if (c.DBG) {
            Log.v(TAG, "Set Composition \n" + hVar);
        }
        this.lottieDrawable.setCallback(this);
        this.composition = hVar;
        this.ignoreUnschedule = true;
        boolean composition = this.lottieDrawable.setComposition(hVar);
        this.ignoreUnschedule = false;
        if (getDrawable() != this.lottieDrawable || composition) {
            if (!composition) {
                setLottieDrawable();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<m0> it = this.lottieOnCompositionLoadedListeners.iterator();
            while (it.hasNext()) {
                it.next().onCompositionLoaded(hVar);
            }
        }
    }

    public void setFailureListener(@Nullable k0 k0Var) {
        this.failureListener = k0Var;
    }

    public void setFallbackResource(@DrawableRes int i8) {
        this.fallbackResource = i8;
    }

    public void setFontAssetDelegate(com.airbnb.lottie.a aVar) {
        this.lottieDrawable.setFontAssetDelegate(aVar);
    }

    public void setFrame(int i8) {
        this.lottieDrawable.setFrame(i8);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z7) {
        this.lottieDrawable.setIgnoreDisabledSystemAnimations(z7);
    }

    public void setImageAssetDelegate(com.airbnb.lottie.b bVar) {
        this.lottieDrawable.setImageAssetDelegate(bVar);
    }

    public void setImageAssetsFolder(String str) {
        this.lottieDrawable.setImagesAssetsFolder(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        cancelLoaderTask();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        cancelLoaderTask();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i8) {
        cancelLoaderTask();
        super.setImageResource(i8);
    }

    public void setMaintainOriginalImageBounds(boolean z7) {
        this.lottieDrawable.setMaintainOriginalImageBounds(z7);
    }

    public void setMaxFrame(int i8) {
        this.lottieDrawable.setMaxFrame(i8);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f8) {
        this.lottieDrawable.setMaxProgress(f8);
    }

    public void setMinAndMaxFrame(String str) {
        this.lottieDrawable.setMinAndMaxFrame(str);
    }

    public void setMinAndMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) float f8, @FloatRange(from = 0.0d, to = 1.0d) float f9) {
        this.lottieDrawable.setMinAndMaxProgress(f8, f9);
    }

    public void setMinFrame(int i8) {
        this.lottieDrawable.setMinFrame(i8);
    }

    public void setMinProgress(float f8) {
        this.lottieDrawable.setMinProgress(f8);
    }

    public void setOutlineMasksAndMattes(boolean z7) {
        this.lottieDrawable.setOutlineMasksAndMattes(z7);
    }

    public void setPerformanceTrackingEnabled(boolean z7) {
        this.lottieDrawable.setPerformanceTrackingEnabled(z7);
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f8) {
        this.userActionsTaken.add(UserActionTaken.SET_PROGRESS);
        this.lottieDrawable.setProgress(f8);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.lottieDrawable.setRenderMode(renderMode);
    }

    public void setRepeatCount(int i8) {
        this.userActionsTaken.add(UserActionTaken.SET_REPEAT_COUNT);
        this.lottieDrawable.setRepeatCount(i8);
    }

    public void setRepeatMode(int i8) {
        this.userActionsTaken.add(UserActionTaken.SET_REPEAT_MODE);
        this.lottieDrawable.setRepeatMode(i8);
    }

    public void setSafeMode(boolean z7) {
        this.lottieDrawable.setSafeMode(z7);
    }

    public void setSpeed(float f8) {
        this.lottieDrawable.setSpeed(f8);
    }

    public void setTextDelegate(t0 t0Var) {
        this.lottieDrawable.setTextDelegate(t0Var);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        LottieDrawable lottieDrawable;
        if (!this.ignoreUnschedule && drawable == (lottieDrawable = this.lottieDrawable) && lottieDrawable.isAnimating()) {
            pauseAnimation();
        } else if (!this.ignoreUnschedule && (drawable instanceof LottieDrawable)) {
            LottieDrawable lottieDrawable2 = (LottieDrawable) drawable;
            if (lottieDrawable2.isAnimating()) {
                lottieDrawable2.pauseAnimation();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    @Nullable
    public Bitmap updateBitmap(String str, @Nullable Bitmap bitmap) {
        return this.lottieDrawable.updateBitmap(str, bitmap);
    }

    public <T> void addValueCallback(com.airbnb.lottie.model.d dVar, T t7, com.airbnb.lottie.value.e eVar) {
        this.lottieDrawable.addValueCallback(dVar, (com.airbnb.lottie.model.d) t7, (com.airbnb.lottie.value.c) new b(eVar));
    }

    public void setAnimation(String str) {
        this.animationName = str;
        this.animationResId = 0;
        setCompositionTask(fromAssets(str));
    }

    public void setAnimationFromJson(String str, @Nullable String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.lottieDrawable.setMaxFrame(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z7) {
        this.lottieDrawable.setMinAndMaxFrame(str, str2, z7);
    }

    public void setMinFrame(String str) {
        this.lottieDrawable.setMinFrame(str);
    }

    public void setAnimation(InputStream inputStream, @Nullable String str) {
        setCompositionTask(t.fromJsonInputStream(inputStream, str));
    }

    public void setAnimationFromUrl(String str, @Nullable String str2) {
        setCompositionTask(t.fromUrl(getContext(), str, str2));
    }

    public void setMinAndMaxFrame(int i8, int i9) {
        this.lottieDrawable.setMinAndMaxFrame(i8, i9);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.loadedListener = new k0() { // from class: com.airbnb.lottie.e
            @Override // com.airbnb.lottie.k0
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((h) obj);
            }
        };
        this.wrappedFailureListener = new a();
        this.fallbackResource = 0;
        this.lottieDrawable = new LottieDrawable();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        init(attributeSet, R$attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.loadedListener = new k0() { // from class: com.airbnb.lottie.e
            @Override // com.airbnb.lottie.k0
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((h) obj);
            }
        };
        this.wrappedFailureListener = new a();
        this.fallbackResource = 0;
        this.lottieDrawable = new LottieDrawable();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        init(attributeSet, i8);
    }
}
