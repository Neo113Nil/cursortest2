package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class LottieDrawable extends Drawable implements Drawable.Callback, Animatable {
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    private int alpha;
    private final com.airbnb.lottie.utils.g animator;
    private Rect canvasClipBounds;
    private RectF canvasClipBoundsRectF;
    private boolean clipToCompositionBounds;
    private h composition;

    @Nullable
    private com.airbnb.lottie.model.layer.c compositionLayer;
    private boolean enableMergePaths;

    @Nullable
    com.airbnb.lottie.a fontAssetDelegate;

    @Nullable
    private w.a fontAssetManager;
    private boolean ignoreSystemAnimationsDisabled;

    @Nullable
    private com.airbnb.lottie.b imageAssetDelegate;

    @Nullable
    private w.b imageAssetManager;

    @Nullable
    private String imageAssetsFolder;
    private boolean isApplyingOpacityToLayersEnabled;
    private boolean isDirty;
    private final ArrayList<c> lazyCompositionTasks;
    private boolean maintainOriginalImageBounds;
    private OnVisibleAction onVisibleAction;
    private boolean outlineMasksAndMattes;
    private boolean performanceTrackingEnabled;
    private final ValueAnimator.AnimatorUpdateListener progressUpdateListener;
    private RenderMode renderMode;
    private final Matrix renderingMatrix;
    private boolean safeMode;
    private Bitmap softwareRenderingBitmap;
    private Canvas softwareRenderingCanvas;
    private Rect softwareRenderingDstBoundsRect;
    private RectF softwareRenderingDstBoundsRectF;
    private Matrix softwareRenderingOriginalCanvasMatrix;
    private Matrix softwareRenderingOriginalCanvasMatrixInverse;
    private Paint softwareRenderingPaint;
    private Rect softwareRenderingSrcBoundsRect;
    private RectF softwareRenderingTransformedBounds;
    private boolean systemAnimationsEnabled;

    @Nullable
    t0 textDelegate;
    private boolean useSoftwareRendering;

    private enum OnVisibleAction {
        NONE,
        PLAY,
        RESUME
    }

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (LottieDrawable.this.compositionLayer != null) {
                LottieDrawable.this.compositionLayer.setProgress(LottieDrawable.this.animator.getAnimatedValueAbsolute());
            }
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

    /* JADX INFO: Access modifiers changed from: private */
    interface c {
        void run(h hVar);
    }

    public LottieDrawable() {
        com.airbnb.lottie.utils.g gVar = new com.airbnb.lottie.utils.g();
        this.animator = gVar;
        this.systemAnimationsEnabled = true;
        this.ignoreSystemAnimationsDisabled = false;
        this.safeMode = false;
        this.onVisibleAction = OnVisibleAction.NONE;
        this.lazyCompositionTasks = new ArrayList<>();
        a aVar = new a();
        this.progressUpdateListener = aVar;
        this.maintainOriginalImageBounds = false;
        this.clipToCompositionBounds = true;
        this.alpha = 255;
        this.renderMode = RenderMode.AUTOMATIC;
        this.useSoftwareRendering = false;
        this.renderingMatrix = new Matrix();
        this.isDirty = false;
        gVar.addUpdateListener(aVar);
    }

    private boolean animationsEnabled() {
        return this.systemAnimationsEnabled || this.ignoreSystemAnimationsDisabled;
    }

    private void buildCompositionLayer() {
        h hVar = this.composition;
        if (hVar == null) {
            return;
        }
        com.airbnb.lottie.model.layer.c cVar = new com.airbnb.lottie.model.layer.c(this, com.airbnb.lottie.parser.v.parse(hVar), hVar.getLayers(), hVar);
        this.compositionLayer = cVar;
        if (this.outlineMasksAndMattes) {
            cVar.setOutlineMasksAndMattes(true);
        }
        this.compositionLayer.setClipToCompositionBounds(this.clipToCompositionBounds);
    }

    private void computeRenderMode() {
        h hVar = this.composition;
        if (hVar == null) {
            return;
        }
        this.useSoftwareRendering = this.renderMode.useSoftwareRendering(Build.VERSION.SDK_INT, hVar.hasDashPattern(), hVar.getMaskAndMatteCount());
    }

    private void convertRect(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void drawDirectlyToCanvas(Canvas canvas) {
        com.airbnb.lottie.model.layer.c cVar = this.compositionLayer;
        h hVar = this.composition;
        if (cVar == null || hVar == null) {
            return;
        }
        this.renderingMatrix.reset();
        if (!getBounds().isEmpty()) {
            this.renderingMatrix.preScale(r2.width() / hVar.getBounds().width(), r2.height() / hVar.getBounds().height());
        }
        cVar.draw(canvas, this.renderingMatrix, this.alpha);
    }

    private void ensureSoftwareRenderingBitmap(int i8, int i9) {
        Bitmap bitmap = this.softwareRenderingBitmap;
        if (bitmap == null || bitmap.getWidth() < i8 || this.softwareRenderingBitmap.getHeight() < i9) {
            Bitmap createBitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
            this.softwareRenderingBitmap = createBitmap;
            this.softwareRenderingCanvas.setBitmap(createBitmap);
            this.isDirty = true;
            return;
        }
        if (this.softwareRenderingBitmap.getWidth() > i8 || this.softwareRenderingBitmap.getHeight() > i9) {
            Bitmap createBitmap2 = Bitmap.createBitmap(this.softwareRenderingBitmap, 0, 0, i8, i9);
            this.softwareRenderingBitmap = createBitmap2;
            this.softwareRenderingCanvas.setBitmap(createBitmap2);
            this.isDirty = true;
        }
    }

    private void ensureSoftwareRenderingObjectsInitialized() {
        if (this.softwareRenderingCanvas != null) {
            return;
        }
        this.softwareRenderingCanvas = new Canvas();
        this.softwareRenderingTransformedBounds = new RectF();
        this.softwareRenderingOriginalCanvasMatrix = new Matrix();
        this.softwareRenderingOriginalCanvasMatrixInverse = new Matrix();
        this.canvasClipBounds = new Rect();
        this.canvasClipBoundsRectF = new RectF();
        this.softwareRenderingPaint = new v.a();
        this.softwareRenderingSrcBoundsRect = new Rect();
        this.softwareRenderingDstBoundsRect = new Rect();
        this.softwareRenderingDstBoundsRectF = new RectF();
    }

    @Nullable
    private Context getContext() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private w.a getFontAssetManager() {
        if (getCallback() == null) {
            return null;
        }
        if (this.fontAssetManager == null) {
            this.fontAssetManager = new w.a(getCallback(), this.fontAssetDelegate);
        }
        return this.fontAssetManager;
    }

    private w.b getImageAssetManager() {
        if (getCallback() == null) {
            return null;
        }
        w.b bVar = this.imageAssetManager;
        if (bVar != null && !bVar.hasSameContext(getContext())) {
            this.imageAssetManager = null;
        }
        if (this.imageAssetManager == null) {
            this.imageAssetManager = new w.b(getCallback(), this.imageAssetsFolder, null, this.composition.getImages());
        }
        return this.imageAssetManager;
    }

    private boolean ignoreCanvasClipBounds() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        if (((View) callback).getParent() instanceof ViewGroup) {
            return !((ViewGroup) r0).getClipChildren();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addValueCallback$14(com.airbnb.lottie.model.d dVar, Object obj, com.airbnb.lottie.value.c cVar, h hVar) {
        addValueCallback(dVar, (com.airbnb.lottie.model.d) obj, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playAnimation$0(h hVar) {
        playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resumeAnimation$1(h hVar) {
        resumeAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setFrame$12(int i8, h hVar) {
        setFrame(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMaxFrame$4(int i8, h hVar) {
        setMaxFrame(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMaxFrame$7(String str, h hVar) {
        setMaxFrame(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMaxProgress$5(float f8, h hVar) {
        setMaxProgress(f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinAndMaxFrame$10(int i8, int i9, h hVar) {
        setMinAndMaxFrame(i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinAndMaxFrame$8(String str, h hVar) {
        setMinAndMaxFrame(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinAndMaxFrame$9(String str, String str2, boolean z7, h hVar) {
        setMinAndMaxFrame(str, str2, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinAndMaxProgress$11(float f8, float f9, h hVar) {
        setMinAndMaxProgress(f8, f9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinFrame$2(int i8, h hVar) {
        setMinFrame(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinFrame$6(String str, h hVar) {
        setMinFrame(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setMinProgress$3(float f8, h hVar) {
        setMinProgress(f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setProgress$13(float f8, h hVar) {
        setProgress(f8);
    }

    private void renderAndDrawAsBitmap(Canvas canvas, com.airbnb.lottie.model.layer.c cVar) {
        if (this.composition == null || cVar == null) {
            return;
        }
        ensureSoftwareRenderingObjectsInitialized();
        canvas.getMatrix(this.softwareRenderingOriginalCanvasMatrix);
        canvas.getClipBounds(this.canvasClipBounds);
        convertRect(this.canvasClipBounds, this.canvasClipBoundsRectF);
        this.softwareRenderingOriginalCanvasMatrix.mapRect(this.canvasClipBoundsRectF);
        convertRect(this.canvasClipBoundsRectF, this.canvasClipBounds);
        if (this.clipToCompositionBounds) {
            this.softwareRenderingTransformedBounds.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            cVar.getBounds(this.softwareRenderingTransformedBounds, null, false);
        }
        this.softwareRenderingOriginalCanvasMatrix.mapRect(this.softwareRenderingTransformedBounds);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        scaleRect(this.softwareRenderingTransformedBounds, width, height);
        if (!ignoreCanvasClipBounds()) {
            RectF rectF = this.softwareRenderingTransformedBounds;
            Rect rect = this.canvasClipBounds;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int ceil = (int) Math.ceil(this.softwareRenderingTransformedBounds.width());
        int ceil2 = (int) Math.ceil(this.softwareRenderingTransformedBounds.height());
        if (ceil == 0 || ceil2 == 0) {
            return;
        }
        ensureSoftwareRenderingBitmap(ceil, ceil2);
        if (this.isDirty) {
            this.renderingMatrix.set(this.softwareRenderingOriginalCanvasMatrix);
            this.renderingMatrix.preScale(width, height);
            Matrix matrix = this.renderingMatrix;
            RectF rectF2 = this.softwareRenderingTransformedBounds;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.softwareRenderingBitmap.eraseColor(0);
            cVar.draw(this.softwareRenderingCanvas, this.renderingMatrix, this.alpha);
            this.softwareRenderingOriginalCanvasMatrix.invert(this.softwareRenderingOriginalCanvasMatrixInverse);
            this.softwareRenderingOriginalCanvasMatrixInverse.mapRect(this.softwareRenderingDstBoundsRectF, this.softwareRenderingTransformedBounds);
            convertRect(this.softwareRenderingDstBoundsRectF, this.softwareRenderingDstBoundsRect);
        }
        this.softwareRenderingSrcBoundsRect.set(0, 0, ceil, ceil2);
        canvas.drawBitmap(this.softwareRenderingBitmap, this.softwareRenderingSrcBoundsRect, this.softwareRenderingDstBoundsRect, this.softwareRenderingPaint);
    }

    private void scaleRect(RectF rectF, float f8, float f9) {
        rectF.set(rectF.left * f8, rectF.top * f9, rectF.right * f8, rectF.bottom * f9);
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.animator.addListener(animatorListener);
    }

    @RequiresApi(api = 19)
    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.animator.addPauseListener(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.animator.addUpdateListener(animatorUpdateListener);
    }

    public <T> void addValueCallback(final com.airbnb.lottie.model.d dVar, final T t7, @Nullable final com.airbnb.lottie.value.c cVar) {
        com.airbnb.lottie.model.layer.c cVar2 = this.compositionLayer;
        if (cVar2 == null) {
            this.lazyCompositionTasks.add(new c() { // from class: com.airbnb.lottie.i0
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void run(h hVar) {
                    LottieDrawable.this.lambda$addValueCallback$14(dVar, t7, cVar, hVar);
                }
            });
            return;
        }
        if (dVar == com.airbnb.lottie.model.d.COMPOSITION) {
            cVar2.addValueCallback(t7, cVar);
        } else if (dVar.getResolvedElement() != null) {
            dVar.getResolvedElement().addValueCallback(t7, cVar);
        } else {
            List<com.airbnb.lottie.model.d> resolveKeyPath = resolveKeyPath(dVar);
            for (int i8 = 0; i8 < resolveKeyPath.size(); i8++) {
                resolveKeyPath.get(i8).getResolvedElement().addValueCallback(t7, cVar);
            }
            if (!(!resolveKeyPath.isEmpty())) {
                return;
            }
        }
        invalidateSelf();
        if (t7 == n0.TIME_REMAP) {
            setProgress(getProgress());
        }
    }

    public void cancelAnimation() {
        this.lazyCompositionTasks.clear();
        this.animator.cancel();
        if (isVisible()) {
            return;
        }
        this.onVisibleAction = OnVisibleAction.NONE;
    }

    public void clearComposition() {
        if (this.animator.isRunning()) {
            this.animator.cancel();
            if (!isVisible()) {
                this.onVisibleAction = OnVisibleAction.NONE;
            }
        }
        this.composition = null;
        this.compositionLayer = null;
        this.imageAssetManager = null;
        this.animator.clearComposition();
        invalidateSelf();
    }

    @Deprecated
    public void disableExtraScaleModeInFitXY() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        com.airbnb.lottie.c.beginSection("Drawable#draw");
        if (this.safeMode) {
            try {
                if (this.useSoftwareRendering) {
                    renderAndDrawAsBitmap(canvas, this.compositionLayer);
                } else {
                    drawDirectlyToCanvas(canvas);
                }
            } catch (Throwable th) {
                com.airbnb.lottie.utils.f.error("Lottie crashed in draw!", th);
            }
        } else if (this.useSoftwareRendering) {
            renderAndDrawAsBitmap(canvas, this.compositionLayer);
        } else {
            drawDirectlyToCanvas(canvas);
        }
        this.isDirty = false;
        com.airbnb.lottie.c.endSection("Drawable#draw");
    }

    public boolean enableMergePathsForKitKatAndAbove() {
        return this.enableMergePaths;
    }

    @MainThread
    public void endAnimation() {
        this.lazyCompositionTasks.clear();
        this.animator.endAnimation();
        if (isVisible()) {
            return;
        }
        this.onVisibleAction = OnVisibleAction.NONE;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.alpha;
    }

    @Nullable
    public Bitmap getBitmapForId(String str) {
        w.b imageAssetManager = getImageAssetManager();
        if (imageAssetManager != null) {
            return imageAssetManager.bitmapForId(str);
        }
        return null;
    }

    public boolean getClipToCompositionBounds() {
        return this.clipToCompositionBounds;
    }

    public h getComposition() {
        return this.composition;
    }

    public int getFrame() {
        return (int) this.animator.getFrame();
    }

    @Nullable
    @Deprecated
    public Bitmap getImageAsset(String str) {
        w.b imageAssetManager = getImageAssetManager();
        if (imageAssetManager != null) {
            return imageAssetManager.bitmapForId(str);
        }
        h hVar = this.composition;
        j0 j0Var = hVar == null ? null : hVar.getImages().get(str);
        if (j0Var != null) {
            return j0Var.getBitmap();
        }
        return null;
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.imageAssetsFolder;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        h hVar = this.composition;
        if (hVar == null) {
            return -1;
        }
        return hVar.getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        h hVar = this.composition;
        if (hVar == null) {
            return -1;
        }
        return hVar.getBounds().width();
    }

    @Nullable
    public j0 getLottieImageAssetForId(String str) {
        h hVar = this.composition;
        if (hVar == null) {
            return null;
        }
        return hVar.getImages().get(str);
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.maintainOriginalImageBounds;
    }

    public float getMaxFrame() {
        return this.animator.getMaxFrame();
    }

    public float getMinFrame() {
        return this.animator.getMinFrame();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Nullable
    public r0 getPerformanceTracker() {
        h hVar = this.composition;
        if (hVar != null) {
            return hVar.getPerformanceTracker();
        }
        return null;
    }

    @FloatRange(from = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, to = 1.0d)
    public float getProgress() {
        return this.animator.getAnimatedValueAbsolute();
    }

    public RenderMode getRenderMode() {
        return this.useSoftwareRendering ? RenderMode.SOFTWARE : RenderMode.HARDWARE;
    }

    public int getRepeatCount() {
        return this.animator.getRepeatCount();
    }

    @SuppressLint({"WrongConstant"})
    public int getRepeatMode() {
        return this.animator.getRepeatMode();
    }

    public float getSpeed() {
        return this.animator.getSpeed();
    }

    @Nullable
    public t0 getTextDelegate() {
        return this.textDelegate;
    }

    @Nullable
    public Typeface getTypeface(String str, String str2) {
        w.a fontAssetManager = getFontAssetManager();
        if (fontAssetManager != null) {
            return fontAssetManager.getTypeface(str, str2);
        }
        return null;
    }

    public boolean hasMasks() {
        com.airbnb.lottie.model.layer.c cVar = this.compositionLayer;
        return cVar != null && cVar.hasMasks();
    }

    public boolean hasMatte() {
        com.airbnb.lottie.model.layer.c cVar = this.compositionLayer;
        return cVar != null && cVar.hasMatte();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.isDirty) {
            return;
        }
        this.isDirty = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isAnimating() {
        com.airbnb.lottie.utils.g gVar = this.animator;
        if (gVar == null) {
            return false;
        }
        return gVar.isRunning();
    }

    boolean isAnimatingOrWillAnimateOnVisible() {
        if (isVisible()) {
            return this.animator.isRunning();
        }
        OnVisibleAction onVisibleAction = this.onVisibleAction;
        return onVisibleAction == OnVisibleAction.PLAY || onVisibleAction == OnVisibleAction.RESUME;
    }

    public boolean isApplyingOpacityToLayersEnabled() {
        return this.isApplyingOpacityToLayersEnabled;
    }

    public boolean isLooping() {
        return this.animator.getRepeatCount() == -1;
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.enableMergePaths;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return isAnimating();
    }

    @Deprecated
    public void loop(boolean z7) {
        this.animator.setRepeatCount(z7 ? -1 : 0);
    }

    public void pauseAnimation() {
        this.lazyCompositionTasks.clear();
        this.animator.pauseAnimation();
        if (isVisible()) {
            return;
        }
        this.onVisibleAction = OnVisibleAction.NONE;
    }

    @MainThread
    public void playAnimation() {
        if (this.compositionLayer == null) {
            this.lazyCompositionTasks.add(new c() { // from class: com.airbnb.lottie.w
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void run(h hVar) {
                    LottieDrawable.this.lambda$playAnimation$0(hVar);
                }
            });
            return;
        }
        computeRenderMode();
        if (animationsEnabled() || getRepeatCount() == 0) {
            if (isVisible()) {
                this.animator.playAnimation();
                this.onVisibleAction = OnVisibleAction.NONE;
            } else {
                this.onVisibleAction = OnVisibleAction.PLAY;
            }
        }
        if (animationsEnabled()) {
            return;
        }
        setFrame((int) (getSpeed() < 0.0f ? getMinFrame() : getMaxFrame()));
        this.animator.endAnimation();
        if (isVisible()) {
            return;
        }
        this.onVisibleAction = OnVisibleAction.NONE;
    }

    public void removeAllAnimatorListeners() {
        this.animator.removeAllListeners();
    }

    public void removeAllUpdateListeners() {
        this.animator.removeAllUpdateListeners();
        this.animator.addUpdateListener(this.progressUpdateListener);
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.animator.removeListener(animatorListener);
    }

    @RequiresApi(api = 19)
    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.animator.removePauseListener(animatorPauseListener);
    }

    public void removeAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.animator.removeUpdateListener(animatorUpdateListener);
    }

    public List<com.airbnb.lottie.model.d> resolveKeyPath(com.airbnb.lottie.model.d dVar) {
        if (this.compositionLayer == null) {
            com.airbnb.lottie.utils.f.warning("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.compositionLayer.resolveKeyPath(dVar, 0, arrayList, new com.airbnb.lottie.model.d(new String[0]));
        return arrayList;
    }

    @MainThread
    public void resumeAnimation() {
        if (this.compositionLayer == null) {
            this.lazyCompositionTasks.add(new c() { // from class: com.airbnb.lottie.e0
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void run(h hVar) {
                    LottieDrawable.this.lambda$resumeAnimation$1(hVar);
                }
            });
            return;
        }
        computeRenderMode();
        if (animationsEnabled() || getRepeatCount() == 0) {
            if (isVisible()) {
                this.animator.resumeAnimation();
                this.onVisibleAction = OnVisibleAction.NONE;
            } else {
                this.onVisibleAction = OnVisibleAction.RESUME;
            }
        }
        if (animationsEnabled()) {
            return;
        }
        setFrame((int) (getSpeed() < 0.0f ? getMinFrame() : getMaxFrame()));
        this.animator.endAnimation();
        if (isVisible()) {
            return;
        }
        this.onVisibleAction = OnVisibleAction.NONE;
    }

    public void reverseAnimationSpeed() {
        this.animator.reverseAnimationSpeed();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j8) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i8) {
        this.alpha = i8;
        invalidateSelf();
    }

    public void setApplyingOpacityToLayersEnabled(boolean z7) {
        this.isApplyingOpacityToLayersEnabled = z7;
    }

    public void setClipToCompositionBounds(boolean z7) {
        if (z7 != this.clipToCompositionBounds) {
            this.clipToCompositionBounds = z7;
            com.airbnb.lottie.model.layer.c cVar = this.compositionLayer;
            if (cVar != null) {
                cVar.setClipToCompositionBounds(z7);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        com.airbnb.lottie.utils.f.warning("Use addColorFilter instead.");
    }

    public boolean setComposition(h hVar) {
        if (this.composition == hVar) {
            return false;
        }
        this.isDirty = true;
        clearComposition();
        this.composition = hVar;
        buildCompositionLayer();
        this.animator.setComposition(hVar);
        setProgress(this.animator.getAnimatedFraction());
        Iterator it = new ArrayList(this.lazyCompositionTasks).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar != null) {
                cVar.run(hVar);
            }
            it.remove();
        }
        this.lazyCompositionTasks.clear();
        hVar.setPerformanceTrackingEnabled(this.performanceTrackingEnabled);
        computeRenderMode();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void setFontAssetDelegate(com.airbnb.lottie.a aVar) {
        this.fontAssetDelegate = aVar;
        w.a aVar2 = this.fontAssetManager;
        if (aVar2 != null) {
            aVar2.setDelegate(aVar);
        }
    }

    public void setFrame(final int i8) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new c() { // from class: com.airbnb.lottie.x
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void run(h hVar) {
                    LottieDrawable.this.lambda$setFrame$12(i8, hVar);
                }
            });
        } else {
            this.animator.setFrame(i8);
        }
    }

    public void setIgnoreDisabledSystemAnimations(boolean z7) {
        this.ignoreSystemAnimationsDisabled = z7;
    }

    public void setImageAssetDelegate(com.airbnb.lottie.b bVar) {
        w.b bVar2 = this.imageAssetManager;
        if (bVar2 != null) {
            bVar2.setDelegate(bVar);
        }
    }

    public void setImagesAssetsFolder(@Nullable String str) {
        this.imageAssetsFolder = str;
    }

    public void setMaintainOriginalImageBounds(boolean z7) {
        this.maintainOriginalImageBounds = z7;
    }

    public void setMaxFrame(final int i8) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new c() { // from class: com.airbnb.lottie.d0
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void run(h hVar) {
                    LottieDrawable.this.lambda$setMaxFrame$4(i8, hVar);
                }
            });
        } else {
            this.animator.setMaxFrame(i8 + 0.99f);
        }
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) final float f8) {
        h hVar = this.composition;
        if (hVar == null) {
            this.lazyCompositionTasks.add(new c() { // from class: com.airbnb.lottie.v
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void run(h hVar2) {
                    LottieDrawable.this.lambda$setMaxProgress$5(f8, hVar2);
                }
            });
        } else {
            this.animator.setMaxFrame(com.airbnb.lottie.utils.i.lerp(hVar.getStartFrame(), this.composition.getEndFrame(), f8));
        }
    }

    public void setMinAndMaxFrame(final String str) {
        h hVar = this.composition;
        if (hVar == null) {
            this.lazyCompositionTasks.add(new c() { // from class: com.airbnb.lottie.z
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void run(h hVar2) {
                    LottieDrawable.this.lambda$setMinAndMaxFrame$8(str, hVar2);
                }
            });
            return;
        }
        com.airbnb.lottie.model.g marker = hVar.getMarker(str);
        if (marker != null) {
            int i8 = (int) marker.startFrame;
            setMinAndMaxFrame(i8, ((int) marker.durationFrames) + i8);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public void setMinAndMaxProgress(@FloatRange(from = 0.0d, to = 1.0d) final float f8, @FloatRange(from = 0.0d, to = 1.0d) final float f9) {
        h hVar = this.composition;
        if (hVar == null) {
            this.lazyCompositionTasks.add(new c() { // from class: com.airbnb.lottie.a0
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void run(h hVar2) {
                    LottieDrawable.this.lambda$setMinAndMaxProgress$11(f8, f9, hVar2);
                }
            });
        } else {
            setMinAndMaxFrame((int) com.airbnb.lottie.utils.i.lerp(hVar.getStartFrame(), this.composition.getEndFrame(), f8), (int) com.airbnb.lottie.utils.i.lerp(this.composition.getStartFrame(), this.composition.getEndFrame(), f9));
        }
    }

    public void setMinFrame(final int i8) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new c() { // from class: com.airbnb.lottie.b0
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void run(h hVar) {
                    LottieDrawable.this.lambda$setMinFrame$2(i8, hVar);
                }
            });
        } else {
            this.animator.setMinFrame(i8);
        }
    }

    public void setMinProgress(final float f8) {
        h hVar = this.composition;
        if (hVar == null) {
            this.lazyCompositionTasks.add(new c() { // from class: com.airbnb.lottie.c0
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void run(h hVar2) {
                    LottieDrawable.this.lambda$setMinProgress$3(f8, hVar2);
                }
            });
        } else {
            setMinFrame((int) com.airbnb.lottie.utils.i.lerp(hVar.getStartFrame(), this.composition.getEndFrame(), f8));
        }
    }

    public void setOutlineMasksAndMattes(boolean z7) {
        if (this.outlineMasksAndMattes == z7) {
            return;
        }
        this.outlineMasksAndMattes = z7;
        com.airbnb.lottie.model.layer.c cVar = this.compositionLayer;
        if (cVar != null) {
            cVar.setOutlineMasksAndMattes(z7);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z7) {
        this.performanceTrackingEnabled = z7;
        h hVar = this.composition;
        if (hVar != null) {
            hVar.setPerformanceTrackingEnabled(z7);
        }
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) final float f8) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new c() { // from class: com.airbnb.lottie.u
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void run(h hVar) {
                    LottieDrawable.this.lambda$setProgress$13(f8, hVar);
                }
            });
            return;
        }
        com.airbnb.lottie.c.beginSection("Drawable#setProgress");
        this.animator.setFrame(this.composition.getFrameForProgress(f8));
        com.airbnb.lottie.c.endSection("Drawable#setProgress");
    }

    public void setRenderMode(RenderMode renderMode) {
        this.renderMode = renderMode;
        computeRenderMode();
    }

    public void setRepeatCount(int i8) {
        this.animator.setRepeatCount(i8);
    }

    public void setRepeatMode(int i8) {
        this.animator.setRepeatMode(i8);
    }

    public void setSafeMode(boolean z7) {
        this.safeMode = z7;
    }

    public void setSpeed(float f8) {
        this.animator.setSpeed(f8);
    }

    public void setSystemAnimationsAreEnabled(Boolean bool) {
        this.systemAnimationsEnabled = bool.booleanValue();
    }

    public void setTextDelegate(t0 t0Var) {
        this.textDelegate = t0Var;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        boolean z9 = !isVisible();
        boolean visible = super.setVisible(z7, z8);
        if (z7) {
            OnVisibleAction onVisibleAction = this.onVisibleAction;
            if (onVisibleAction == OnVisibleAction.PLAY) {
                playAnimation();
            } else if (onVisibleAction == OnVisibleAction.RESUME) {
                resumeAnimation();
            }
        } else if (this.animator.isRunning()) {
            pauseAnimation();
            this.onVisibleAction = OnVisibleAction.RESUME;
        } else if (!z9) {
            this.onVisibleAction = OnVisibleAction.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        playAnimation();
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void stop() {
        endAnimation();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    @Nullable
    public Bitmap updateBitmap(String str, @Nullable Bitmap bitmap) {
        w.b imageAssetManager = getImageAssetManager();
        if (imageAssetManager == null) {
            com.airbnb.lottie.utils.f.warning("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Bitmap updateBitmap = imageAssetManager.updateBitmap(str, bitmap);
        invalidateSelf();
        return updateBitmap;
    }

    public boolean useTextGlyphs() {
        return this.textDelegate == null && this.composition.getCharacters().size() > 0;
    }

    public void enableMergePathsForKitKatAndAbove(boolean z7) {
        if (this.enableMergePaths == z7) {
            return;
        }
        this.enableMergePaths = z7;
        if (this.composition != null) {
            buildCompositionLayer();
        }
    }

    public void setMaxFrame(final String str) {
        h hVar = this.composition;
        if (hVar == null) {
            this.lazyCompositionTasks.add(new c() { // from class: com.airbnb.lottie.f0
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void run(h hVar2) {
                    LottieDrawable.this.lambda$setMaxFrame$7(str, hVar2);
                }
            });
            return;
        }
        com.airbnb.lottie.model.g marker = hVar.getMarker(str);
        if (marker != null) {
            setMaxFrame((int) (marker.startFrame + marker.durationFrames));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void setMinFrame(final String str) {
        h hVar = this.composition;
        if (hVar == null) {
            this.lazyCompositionTasks.add(new c() { // from class: com.airbnb.lottie.h0
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void run(h hVar2) {
                    LottieDrawable.this.lambda$setMinFrame$6(str, hVar2);
                }
            });
            return;
        }
        com.airbnb.lottie.model.g marker = hVar.getMarker(str);
        if (marker != null) {
            setMinFrame((int) marker.startFrame);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public void setMinAndMaxFrame(final String str, final String str2, final boolean z7) {
        h hVar = this.composition;
        if (hVar == null) {
            this.lazyCompositionTasks.add(new c() { // from class: com.airbnb.lottie.g0
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void run(h hVar2) {
                    LottieDrawable.this.lambda$setMinAndMaxFrame$9(str, str2, z7, hVar2);
                }
            });
            return;
        }
        com.airbnb.lottie.model.g marker = hVar.getMarker(str);
        if (marker != null) {
            int i8 = (int) marker.startFrame;
            com.airbnb.lottie.model.g marker2 = this.composition.getMarker(str2);
            if (marker2 != null) {
                setMinAndMaxFrame(i8, (int) (marker2.startFrame + (z7 ? 1.0f : 0.0f)));
                return;
            }
            throw new IllegalArgumentException("Cannot find marker with name " + str2 + ".");
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    private void convertRect(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void draw(Canvas canvas, Matrix matrix) {
        com.airbnb.lottie.model.layer.c cVar = this.compositionLayer;
        h hVar = this.composition;
        if (cVar == null || hVar == null) {
            return;
        }
        if (this.useSoftwareRendering) {
            canvas.save();
            canvas.concat(matrix);
            renderAndDrawAsBitmap(canvas, cVar);
            canvas.restore();
        } else {
            cVar.draw(canvas, matrix, this.alpha);
        }
        this.isDirty = false;
    }

    public <T> void addValueCallback(com.airbnb.lottie.model.d dVar, T t7, com.airbnb.lottie.value.e eVar) {
        addValueCallback(dVar, (com.airbnb.lottie.model.d) t7, (com.airbnb.lottie.value.c) new b(eVar));
    }

    public void setMinAndMaxFrame(final int i8, final int i9) {
        if (this.composition == null) {
            this.lazyCompositionTasks.add(new c() { // from class: com.airbnb.lottie.y
                @Override // com.airbnb.lottie.LottieDrawable.c
                public final void run(h hVar) {
                    LottieDrawable.this.lambda$setMinAndMaxFrame$10(i8, i9, hVar);
                }
            });
        } else {
            this.animator.setMinAndMaxFrames(i8, i9 + 0.99f);
        }
    }
}
