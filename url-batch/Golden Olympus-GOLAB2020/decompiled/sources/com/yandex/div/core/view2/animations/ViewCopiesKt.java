package com.yandex.div.core.view2.animations;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.widget.ImageView;
import androidx.core.view.AbstractC1293g0;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import java.util.Iterator;
import k0.AbstractC3201i;
import k0.AbstractC3204l;
import k0.AbstractC3205m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class ViewCopiesKt {
    @NotNull
    public static final View createOrGetVisualCopy(@NotNull final View view, @NotNull ViewGroup sceneRoot, @NotNull AbstractC3204l transition, @NotNull int[] endPosition) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(endPosition, "endPosition");
        Object tag = view.getTag(AbstractC3201i.f40944a);
        View view2 = tag instanceof View ? (View) tag : null;
        if (view2 != null) {
            return view2;
        }
        final ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        setScreenshotFromView(imageView, view);
        imageView.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
        imageView.layout(0, 0, view.getWidth(), view.getHeight());
        invalidatePosition(imageView, sceneRoot, endPosition);
        view.setTag(AbstractC3201i.f40944a, imageView);
        replace(view, imageView, transition, sceneRoot);
        setHierarchyImageChangeCallback(view, new ViewCopiesKt$createOrGetVisualCopy$1(imageView, view));
        if (imageView.isAttachedToWindow()) {
            imageView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.animations.ViewCopiesKt$createOrGetVisualCopy$$inlined$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view3) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view3) {
                    imageView.removeOnAttachStateChangeListener(this);
                    ViewCopiesKt.setHierarchyImageChangeCallback(view, null);
                }
            });
            return imageView;
        }
        setHierarchyImageChangeCallback(view, null);
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void drawAndSet(ImageView imageView, View view) {
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        imageView.setImageBitmap(createBitmap);
        DivBorderSupports divBorderSupports = view instanceof DivBorderSupports ? (DivBorderSupports) view : null;
        if (divBorderSupports == null || divBorderSupports.getDivBorderDrawer() == null) {
            return;
        }
        imageView.setClipToOutline(view.getClipToOutline());
        imageView.setOutlineProvider(view.getOutlineProvider());
    }

    private static final void invalidatePosition(View view, ViewGroup viewGroup, int[] iArr) {
        int[] iArr2 = new int[2];
        viewGroup.getLocationOnScreen(iArr2);
        view.offsetLeftAndRight(iArr[0] - iArr2[0]);
        view.offsetTopAndBottom(iArr[1] - iArr2[1]);
    }

    private static final void replace(final View view, final View view2, AbstractC3204l abstractC3204l, ViewGroup viewGroup) {
        final ViewGroupOverlay overlay = viewGroup.getOverlay();
        view.setVisibility(4);
        overlay.add(view2);
        abstractC3204l.addListener(new AbstractC3205m() { // from class: com.yandex.div.core.view2.animations.ViewCopiesKt$replace$1
            @Override // k0.AbstractC3204l.f
            public void onTransitionEnd(@NotNull AbstractC3204l transition) {
                Intrinsics.checkNotNullParameter(transition, "transition");
                view.setTag(AbstractC3201i.f40944a, null);
                view.setVisibility(0);
                overlay.remove(view2);
                transition.removeListener(this);
            }

            @Override // k0.AbstractC3205m, k0.AbstractC3204l.f
            public void onTransitionPause(@NotNull AbstractC3204l transition) {
                Intrinsics.checkNotNullParameter(transition, "transition");
                overlay.remove(view2);
            }

            @Override // k0.AbstractC3205m, k0.AbstractC3204l.f
            public void onTransitionResume(@NotNull AbstractC3204l transition) {
                Intrinsics.checkNotNullParameter(transition, "transition");
                if (view2.getParent() == null) {
                    overlay.add(view2);
                }
            }

            @Override // k0.AbstractC3205m, k0.AbstractC3204l.f
            public void onTransitionStart(@NotNull AbstractC3204l transition) {
                Intrinsics.checkNotNullParameter(transition, "transition");
                view.setVisibility(4);
            }
        });
    }

    public static final void setHierarchyImageChangeCallback(@NotNull View view, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view instanceof DivImageView) {
            ((DivImageView) view).setImageChangeCallback(function0);
        } else if (view instanceof ViewGroup) {
            Iterator it = AbstractC1293g0.b((ViewGroup) view).iterator();
            while (it.hasNext()) {
                setHierarchyImageChangeCallback((View) it.next(), function0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setScreenshotFromView(final ImageView imageView, final View view) {
        Bitmap bitmap;
        if (!(view instanceof DivBorderSupports)) {
            ImageView imageView2 = view instanceof ImageView ? (ImageView) view : null;
            Object drawable = imageView2 != null ? imageView2.getDrawable() : null;
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                imageView.setImageBitmap(bitmap);
                return;
            }
        }
        if (ViewsKt.isActuallyLaidOut(view)) {
            drawAndSet(imageView, view);
        } else if (!ViewsKt.isActuallyLaidOut(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.animations.ViewCopiesKt$setScreenshotFromView$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                    view2.removeOnLayoutChangeListener(this);
                    ViewCopiesKt.drawAndSet(imageView, view);
                }
            });
        } else {
            drawAndSet(imageView, view);
        }
    }
}
