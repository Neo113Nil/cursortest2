package com.squareup.cropview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cropview.Edge;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.EnumSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class CropView extends AppCompatImageView {
    public final EnumSet activeEdges;
    public float aspectRatio;
    public final RectF bounds;
    public final Paint boxPaint;
    public final Paint circlePaint;
    public final Paint cornerPaint;
    public final Path cornerPath;
    public final float defaultMinSize;
    public final Paint dimPaint;
    public final Path dimPath;
    public final RectF displayRect;
    public final Paint gridPaint;
    public float minHeight;
    public float minWidth;
    public final RectF rect;
    public final int requestedMinHeight;
    public final int requestedMinWidth;
    public final Shape shape;
    public final SparseArray trackers;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Shape {
        public static final /* synthetic */ Shape[] $VALUES;
        public static final Shape OVAL;
        public static final Shape RECT;

        static {
            Shape shape = new Shape("RECT", 0);
            RECT = shape;
            Shape shape2 = new Shape("OVAL", 1);
            OVAL = shape2;
            $VALUES = new Shape[]{shape, shape2};
        }

        public static Shape valueOf(String str) {
            return (Shape) Enum.valueOf(Shape.class, str);
        }

        public static Shape[] values() {
            return (Shape[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.rect = new RectF();
        this.displayRect = new RectF();
        this.bounds = new RectF();
        this.defaultMinSize = getResources().getDimensionPixelSize(R.dimen.crop_box_min_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CropView, i, R.style.CropView);
        obtainStyledAttributes.getClass();
        int color = obtainStyledAttributes.getColor(2, 0);
        int color2 = obtainStyledAttributes.getColor(4, 0);
        int color3 = obtainStyledAttributes.getColor(8, 0);
        int color4 = obtainStyledAttributes.getColor(7, 0);
        float dimension = obtainStyledAttributes.getDimension(3, RecyclerView.DECELERATION_RATE);
        float dimension2 = obtainStyledAttributes.getDimension(5, RecyclerView.DECELERATION_RATE);
        float dimension3 = obtainStyledAttributes.getDimension(6, RecyclerView.DECELERATION_RATE);
        float dimension4 = obtainStyledAttributes.getDimension(9, RecyclerView.DECELERATION_RATE);
        int i2 = obtainStyledAttributes.getInt(11, 0);
        int i3 = obtainStyledAttributes.getInt(10, 0);
        if (i2 < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "minCropWidthPx cannot be negative: "));
            throw null;
        }
        if (i3 < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i3, "minCropHeightPx cannot be negative: "));
            throw null;
        }
        this.requestedMinWidth = i2;
        this.requestedMinHeight = i3;
        updateMinSize();
        int i4 = obtainStyledAttributes.getInt(0, 0);
        int i5 = obtainStyledAttributes.getInt(1, 0);
        if (i4 < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i4, "aspectRatioX cannot be negative: "));
            throw null;
        }
        if (i5 < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i5, "aspectRatioY cannot be negative: "));
            throw null;
        }
        if (i4 != 0 && i5 != 0) {
            setAspectRatio(i4 / i5);
        } else {
            if (i4 != 0) {
                a$$ExternalSyntheticBUOutline0.m$3("aspectRatioX was set without setting aspectRatioY");
                throw null;
            }
            if (i5 != 0) {
                a$$ExternalSyntheticBUOutline0.m$3("aspectRatioY was set without setting aspectRatioX");
                throw null;
            }
            setAspectRatio(RecyclerView.DECELERATION_RATE);
        }
        Shape[] values = Shape.values();
        Shape shape = Shape.RECT;
        Shape shape2 = values[obtainStyledAttributes.getInt(12, 0)];
        if (this.shape != shape2) {
            this.shape = shape2;
            invalidate();
        }
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(color);
        paint.setStrokeWidth(dimension);
        this.boxPaint = paint;
        Paint paint2 = new Paint(paint);
        paint2.setAntiAlias(true);
        this.circlePaint = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(color2);
        this.cornerPaint = paint3;
        Paint paint4 = new Paint();
        paint4.setStyle(style);
        paint4.setColor(color3);
        paint4.setStrokeWidth(dimension4);
        this.gridPaint = paint4;
        Paint paint5 = new Paint();
        paint5.setColor(color4);
        this.dimPaint = paint5;
        Path path = new Path();
        path.moveTo(dimension2, RecyclerView.DECELERATION_RATE);
        path.lineTo(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
        path.lineTo(RecyclerView.DECELERATION_RATE, dimension2);
        float f = dimension2 - dimension3;
        path.lineTo(dimension3, f);
        path.lineTo(dimension3, dimension3);
        path.lineTo(f, dimension3);
        path.close();
        this.cornerPath = path;
        Path path2 = new Path();
        path2.setFillType(Path.FillType.EVEN_ODD);
        this.dimPath = path2;
        this.trackers = new SparseArray(4);
        EnumSet noneOf = EnumSet.noneOf(Edge.class);
        noneOf.getClass();
        this.activeEdges = noneOf;
    }

    public static Bitmap getBitmap(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public final void applyAspectRatio() {
        if (this.aspectRatio > RecyclerView.DECELERATION_RATE) {
            RectF rectF = this.rect;
            if (!rectF.isEmpty()) {
                Timber.Forest forest = Timber.Forest;
                forest.i("Applying aspect ratio %s to %s.", Float.valueOf(this.aspectRatio), rectF);
                float width = rectF.width() / rectF.height();
                float f = this.aspectRatio;
                if (f > width) {
                    float height = (rectF.height() - (rectF.width() / this.aspectRatio)) / 2.0f;
                    rectF.set(rectF.left, rectF.top + height, rectF.right, rectF.bottom - height);
                } else if (f < width) {
                    float width2 = (rectF.width() - (rectF.height() * this.aspectRatio)) / 2.0f;
                    rectF.set(rectF.left + width2, rectF.top, rectF.right - width2, rectF.bottom);
                }
                RectF rectF2 = this.displayRect;
                rectF2.set(rectF);
                rectF2.inset(0.5f, 0.5f);
                forest.i("  Result: %s", rectF);
            }
        }
        invalidate();
    }

    public final float getBitmapScale(Bitmap bitmap) {
        return Math.min(bitmap.getWidth() / ((getWidth() - getPaddingLeft()) - getPaddingRight()), bitmap.getHeight() / ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public final HorizontalRegion getHorizontalRegion(float f) {
        RectF rectF = this.rect;
        return f <= (rectF.width() / 4.0f) + rectF.left ? HorizontalRegion.LEFT : f >= rectF.right - (rectF.width() / 4.0f) ? HorizontalRegion.RIGHT : HorizontalRegion.CENTER;
    }

    public final VerticalRegion getVerticalRegion(float f) {
        RectF rectF = this.rect;
        return f <= (rectF.height() / 4.0f) + rectF.top ? VerticalRegion.TOP : f >= rectF.bottom - (rectF.height() / 4.0f) ? VerticalRegion.BOTTOM : VerticalRegion.CENTER;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        canvas.getClass();
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        canvas.drawPath(this.dimPath, this.dimPaint);
        RectF rectF = this.rect;
        float height = rectF.height() / 3.0f;
        float width = rectF.width() / 3.0f;
        Shape shape = Shape.OVAL;
        Shape shape2 = this.shape;
        if (shape2 == shape) {
            f = (rectF.width() / 2.0f) - ((float) Math.sqrt(Math.pow(rectF.width() / 2.0d, 2.0d) - Math.pow(width / 2.0d, 2.0d)));
            f2 = (rectF.height() / 2.0f) - ((float) Math.sqrt(Math.pow(rectF.height() / 2.0d, 2.0d) - Math.pow(height / 2.0d, 2.0d)));
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        float f3 = rectF.left + f;
        float f4 = rectF.top;
        Paint paint = this.gridPaint;
        canvas.drawLine(f3, f4 + height, rectF.right - f, f4 + height, paint);
        float f5 = rectF.left + f;
        float f6 = rectF.bottom;
        canvas.drawLine(f5, f6 - height, rectF.right - f, f6 - height, paint);
        float f7 = rectF.left;
        canvas.drawLine(f7 + width, rectF.top + f2, f7 + width, rectF.bottom - f2, paint);
        float f8 = rectF.right;
        canvas.drawLine(f8 - width, rectF.top + f2, f8 - width, rectF.bottom - f2, paint);
        Shape shape3 = Shape.RECT;
        RectF rectF2 = this.displayRect;
        if (shape2 == shape3) {
            canvas.drawRect(rectF2, this.boxPaint);
        } else {
            canvas.drawOval(rectF2, this.circlePaint);
        }
        if (shape2 == shape3) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            Path path = this.cornerPath;
            Paint paint2 = this.cornerPaint;
            canvas.drawPath(path, paint2);
            canvas.restore();
            canvas.save();
            canvas.rotate(90.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
            canvas.translate(rectF.top, -rectF.right);
            canvas.drawPath(path, paint2);
            canvas.restore();
            canvas.save();
            canvas.rotate(180.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
            canvas.translate(-rectF.right, -rectF.bottom);
            canvas.drawPath(path, paint2);
            canvas.restore();
            canvas.save();
            canvas.rotate(270.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
            canvas.translate(-rectF.bottom, rectF.left);
            canvas.drawPath(path, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        char c;
        float f;
        float f2;
        float f3;
        float f4;
        motionEvent.getClass();
        int actionMasked = motionEvent.getActionMasked();
        RectF rectF = this.bounds;
        EnumSet enumSet = this.activeEdges;
        boolean z2 = false;
        SparseArray sparseArray = this.trackers;
        if (actionMasked == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            int actionIndex = motionEvent.getActionIndex();
            Edge.Companion companion = Edge.Companion;
            HorizontalRegion horizontalRegion = getHorizontalRegion(motionEvent.getX(actionIndex));
            VerticalRegion verticalRegion = getVerticalRegion(motionEvent.getY(actionIndex));
            companion.getClass();
            EnumSet removeConflictingEdges = removeConflictingEdges(Edge.Companion.from(horizontalRegion, verticalRegion));
            if (removeConflictingEdges.isEmpty()) {
                return false;
            }
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (((MotionTracker) sparseArray.get(pointerId)) == null) {
                sparseArray.put(pointerId, new MotionTracker(removeConflictingEdges, rectF, this.minWidth, this.minHeight, this.aspectRatio, motionEvent.getX(actionIndex), motionEvent.getY(actionIndex)));
                enumSet.addAll(removeConflictingEdges);
                return true;
            }
        } else if (actionMasked != 1) {
            char c2 = 3;
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int actionIndex2 = motionEvent.getActionIndex();
                        Edge.Companion companion2 = Edge.Companion;
                        HorizontalRegion horizontalRegion2 = getHorizontalRegion(motionEvent.getX(actionIndex2));
                        VerticalRegion verticalRegion2 = getVerticalRegion(motionEvent.getY(actionIndex2));
                        companion2.getClass();
                        EnumSet removeConflictingEdges2 = removeConflictingEdges(Edge.Companion.from(horizontalRegion2, verticalRegion2));
                        if (removeConflictingEdges2.isEmpty()) {
                            return false;
                        }
                        int pointerId2 = motionEvent.getPointerId(actionIndex2);
                        if (((MotionTracker) sparseArray.get(pointerId2)) == null) {
                            sparseArray.put(pointerId2, new MotionTracker(removeConflictingEdges2, rectF, this.minWidth, this.minHeight, this.aspectRatio, motionEvent.getX(actionIndex2), motionEvent.getY(actionIndex2)));
                            enumSet.addAll(removeConflictingEdges2);
                            return true;
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(motionEvent.getActionIndex());
                        MotionTracker motionTracker = (MotionTracker) sparseArray.get(pointerId3);
                        if (motionTracker != null) {
                            EnumSet copyOf = EnumSet.copyOf((Collection) motionTracker.edges);
                            copyOf.getClass();
                            enumSet.removeAll(copyOf);
                            sparseArray.remove(pointerId3);
                            return true;
                        }
                    }
                    return true;
                }
                enumSet.clear();
                sparseArray.clear();
                getParent().requestDisallowInterceptTouchEvent(false);
                return super.onTouchEvent(motionEvent);
            }
            int pointerCount = motionEvent.getPointerCount();
            int i = 0;
            boolean z3 = false;
            while (true) {
                RectF rectF2 = this.rect;
                if (i < pointerCount) {
                    MotionTracker motionTracker2 = (MotionTracker) sparseArray.get(motionEvent.getPointerId(i));
                    if (motionTracker2 != null) {
                        float x = motionEvent.getX(i);
                        float y = motionEvent.getY(i);
                        RectF rectF3 = motionTracker2.bounds;
                        EnumSet enumSet2 = motionTracker2.edges;
                        rectF2.getClass();
                        float f5 = motionTracker2.lastX;
                        if (x == f5) {
                            z = z2;
                            if (y == motionTracker2.lastY) {
                                c = c2;
                                z3 = true;
                            }
                        } else {
                            z = z2;
                        }
                        RectF rectF4 = motionTracker2.bounds;
                        float f6 = motionTracker2.aspectRatio;
                        float f7 = motionTracker2.minWidth;
                        float f8 = motionTracker2.minHeight;
                        Delta delta = new Delta(rectF4, f6, f7, f8, x - f5, y - motionTracker2.lastY);
                        Edge.Companion.getClass();
                        if (Intrinsics.areEqual(Edge.MOVE, enumSet2)) {
                            float f9 = delta.dx;
                            if (f9 >= RecyclerView.DECELERATION_RATE) {
                                f = rectF3.right;
                                f2 = rectF2.right;
                            } else {
                                f = rectF2.left;
                                f2 = rectF3.left;
                            }
                            delta.dx = Math.copySign(Math.min(Math.abs(f9), f - f2), delta.dx);
                            float f10 = delta.dy;
                            if (f10 >= RecyclerView.DECELERATION_RATE) {
                                f3 = rectF3.bottom;
                                f4 = rectF2.bottom;
                            } else {
                                f3 = rectF2.top;
                                f4 = rectF3.top;
                            }
                            float copySign = Math.copySign(Math.min(Math.abs(f10), f3 - f4), delta.dy);
                            delta.dy = copySign;
                            rectF2.offset(delta.dx, copySign);
                        } else if (enumSet2.size() == 2) {
                            if (enumSet2.equals(Edge.CORNER_TOP_LEFT)) {
                                delta.adjustLeftBounds(rectF2);
                                delta.adjustTopBounds(rectF2);
                                if (f6 != RecyclerView.DECELERATION_RATE) {
                                    if (Math.abs(delta.dx) >= Math.abs(delta.dy)) {
                                        delta.dy = delta.dx / f6;
                                        if (rectF2.height() - delta.dy < f8 && f8 < rectF4.height()) {
                                            float height = rectF2.height() - f8;
                                            delta.dy = height;
                                            delta.dx = height * f6;
                                        }
                                        float f11 = rectF2.top;
                                        float f12 = delta.dy + f11;
                                        float f13 = rectF4.top;
                                        if (f12 < f13) {
                                            float f14 = f13 - f11;
                                            delta.dy = f14;
                                            delta.dx = f14 * f6;
                                        }
                                    } else {
                                        delta.dx = delta.dy * f6;
                                        if (rectF2.width() - delta.dx < f7 && f7 < rectF4.width()) {
                                            float width = rectF2.width() - f7;
                                            delta.dx = width;
                                            delta.dy = width / f6;
                                        }
                                        float f15 = rectF2.left;
                                        float f16 = delta.dx + f15;
                                        float f17 = rectF4.left;
                                        if (f16 < f17) {
                                            float f18 = f17 - f15;
                                            delta.dx = f18;
                                            delta.dy = f18 / f6;
                                        }
                                    }
                                }
                                rectF2.set(rectF2.left + delta.dx, rectF2.top + delta.dy, rectF2.right, rectF2.bottom);
                            } else if (enumSet2.equals(Edge.CORNER_TOP_RIGHT)) {
                                delta.adjustRightBounds(rectF2);
                                delta.adjustTopBounds(rectF2);
                                if (f6 != RecyclerView.DECELERATION_RATE) {
                                    if (Math.abs(delta.dx) >= Math.abs(delta.dy)) {
                                        delta.dy = (-delta.dx) / f6;
                                        if (rectF2.height() - delta.dy < f8 && f8 < rectF4.height()) {
                                            float height2 = rectF2.height() - f8;
                                            delta.dy = height2;
                                            delta.dx = (-height2) * f6;
                                        }
                                        float f19 = rectF2.top;
                                        float f20 = delta.dy + f19;
                                        float f21 = rectF4.top;
                                        if (f20 < f21) {
                                            float f22 = f21 - f19;
                                            delta.dy = f22;
                                            delta.dx = (-f22) * f6;
                                        }
                                    } else {
                                        delta.dx = (-delta.dy) * f6;
                                        if (rectF2.width() + delta.dx < f7 && f7 < rectF4.width()) {
                                            float width2 = f7 - rectF2.width();
                                            delta.dx = width2;
                                            delta.dy = (-width2) / f6;
                                        }
                                        float f23 = rectF2.right;
                                        float f24 = delta.dx + f23;
                                        float f25 = rectF4.right;
                                        if (f24 > f25) {
                                            float f26 = f25 - f23;
                                            delta.dx = f26;
                                            delta.dy = (-f26) / f6;
                                        }
                                    }
                                }
                                rectF2.set(rectF2.left, rectF2.top + delta.dy, rectF2.right + delta.dx, rectF2.bottom);
                            } else if (enumSet2.equals(Edge.CORNER_BOTTOM_LEFT)) {
                                delta.adjustLeftBounds(rectF2);
                                delta.adjustBottomBounds(rectF2);
                                if (f6 != RecyclerView.DECELERATION_RATE) {
                                    if (Math.abs(delta.dx) >= Math.abs(delta.dy)) {
                                        delta.dy = (-delta.dx) / f6;
                                        if (rectF2.height() + delta.dy < f8 && f8 < rectF4.height()) {
                                            float height3 = f8 - rectF2.height();
                                            delta.dy = height3;
                                            delta.dx = (-height3) * f6;
                                        }
                                        float f27 = rectF2.bottom;
                                        float f28 = delta.dy + f27;
                                        float f29 = rectF4.bottom;
                                        if (f28 > f29) {
                                            float f30 = f29 - f27;
                                            delta.dy = f30;
                                            delta.dx = (-f30) * f6;
                                        }
                                    } else {
                                        delta.dx = (-delta.dy) * f6;
                                        if (rectF2.width() - delta.dx < f7 && f7 < rectF4.width()) {
                                            float width3 = rectF2.width() - f7;
                                            delta.dx = width3;
                                            delta.dy = (-width3) / f6;
                                        }
                                        float f31 = rectF2.left;
                                        float f32 = delta.dx + f31;
                                        float f33 = rectF4.left;
                                        if (f32 < f33) {
                                            float f34 = f33 - f31;
                                            delta.dx = f34;
                                            delta.dy = (-f34) / f6;
                                        }
                                    }
                                }
                                rectF2.set(rectF2.left + delta.dx, rectF2.top, rectF2.right, rectF2.bottom + delta.dy);
                            } else {
                                if (!enumSet2.equals(Edge.CORNER_BOTTOM_RIGHT)) {
                                    OptionalProvider$$ExternalSyntheticLambda0.m((Object) enumSet2, "Illegal edge set: ");
                                    return z;
                                }
                                delta.adjustRightBounds(rectF2);
                                delta.adjustBottomBounds(rectF2);
                                if (f6 != RecyclerView.DECELERATION_RATE) {
                                    if (Math.abs(delta.dx) >= Math.abs(delta.dy)) {
                                        delta.dy = delta.dx / f6;
                                        if (rectF2.height() + delta.dy < f8 && f8 < rectF4.height()) {
                                            float height4 = f8 - rectF2.height();
                                            delta.dy = height4;
                                            delta.dx = height4 * f6;
                                        }
                                        float f35 = rectF2.bottom;
                                        float f36 = delta.dy + f35;
                                        float f37 = rectF4.bottom;
                                        if (f36 > f37) {
                                            float f38 = f37 - f35;
                                            delta.dy = f38;
                                            delta.dx = f38 * f6;
                                        }
                                    } else {
                                        delta.dx = delta.dy * f6;
                                        if (rectF2.width() + delta.dx < f7 && f7 < rectF4.width()) {
                                            float width4 = f7 - rectF2.width();
                                            delta.dx = width4;
                                            delta.dy = width4 / f6;
                                        }
                                        float f39 = rectF2.right;
                                        float f40 = delta.dx + f39;
                                        float f41 = rectF4.right;
                                        if (f40 > f41) {
                                            float f42 = f41 - f39;
                                            delta.dx = f42;
                                            delta.dy = f42 / f6;
                                        }
                                    }
                                }
                                rectF2.set(rectF2.left, rectF2.top, rectF2.right + delta.dx, rectF2.bottom + delta.dy);
                            }
                        } else {
                            if (enumSet2.size() != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(enumSet2.size(), "Unexpected number of edges: "));
                                return z;
                            }
                            int ordinal = ((Edge) enumSet2.iterator().next()).ordinal();
                            if (ordinal == 0) {
                                c = 3;
                                delta.adjustLeftBounds(rectF2);
                                if (f6 > RecyclerView.DECELERATION_RATE) {
                                    delta.dy = (-delta.dx) / f6;
                                    if (rectF2.height() + delta.dy < f8 && f8 < rectF4.height()) {
                                        float height5 = f8 - rectF2.height();
                                        delta.dy = height5;
                                        delta.dx = (-height5) * f6;
                                    }
                                    float f43 = rectF2.top;
                                    float f44 = f43 - (delta.dy / 2.0f);
                                    float f45 = rectF4.top;
                                    if (f44 < f45) {
                                        float f46 = (f43 - f45) * 2.0f;
                                        delta.dy = f46;
                                        delta.dx = (-f46) * f6;
                                    }
                                    float f47 = rectF2.bottom;
                                    float f48 = (delta.dy / 2.0f) + f47;
                                    float f49 = rectF4.bottom;
                                    if (f48 > f49) {
                                        float f50 = (f49 - f47) * 2.0f;
                                        delta.dy = f50;
                                        delta.dx = (-f50) * f6;
                                    }
                                    delta.dy /= 2.0f;
                                } else {
                                    delta.dy = RecyclerView.DECELERATION_RATE;
                                }
                                float f51 = rectF2.left + delta.dx;
                                float f52 = rectF2.top;
                                float f53 = delta.dy;
                                rectF2.set(f51, f52 - f53, rectF2.right, rectF2.bottom + f53);
                            } else if (ordinal == 1) {
                                c = 3;
                                delta.adjustTopBounds(rectF2);
                                if (f6 > RecyclerView.DECELERATION_RATE) {
                                    delta.dx = (-delta.dy) * f6;
                                    if (rectF2.width() + delta.dx < f7 && f7 < rectF4.width()) {
                                        float width5 = f7 - rectF2.width();
                                        delta.dx = width5;
                                        delta.dy = (-width5) / f6;
                                    }
                                    float f54 = rectF2.left;
                                    float f55 = f54 - (delta.dx / 2.0f);
                                    float f56 = rectF4.left;
                                    if (f55 < f56) {
                                        float f57 = (f54 - f56) * 2.0f;
                                        delta.dx = f57;
                                        delta.dy = (-f57) / f6;
                                    }
                                    float f58 = rectF2.right;
                                    float f59 = (delta.dx / 2.0f) + f58;
                                    float f60 = rectF4.right;
                                    if (f59 > f60) {
                                        float f61 = (f60 - f58) * 2.0f;
                                        delta.dx = f61;
                                        delta.dy = (-f61) / f6;
                                    }
                                    delta.dx /= 2.0f;
                                } else {
                                    delta.dx = RecyclerView.DECELERATION_RATE;
                                }
                                float f62 = rectF2.left;
                                float f63 = delta.dx;
                                rectF2.set(f62 - f63, rectF2.top + delta.dy, rectF2.right + f63, rectF2.bottom);
                            } else if (ordinal != 2) {
                                c = 3;
                                if (ordinal != 3) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return z;
                                }
                                delta.adjustBottomBounds(rectF2);
                                if (f6 > RecyclerView.DECELERATION_RATE) {
                                    delta.dx = delta.dy * f6;
                                    if (rectF2.width() + delta.dx < f7 && f7 < rectF4.width()) {
                                        float width6 = f7 - rectF2.width();
                                        delta.dx = width6;
                                        delta.dy = width6 / f6;
                                    }
                                    float f64 = rectF2.left;
                                    float f65 = f64 - (delta.dx / 2.0f);
                                    float f66 = rectF4.left;
                                    if (f65 < f66) {
                                        float f67 = (f64 - f66) * 2.0f;
                                        delta.dx = f67;
                                        delta.dy = f67 / f6;
                                    }
                                    float f68 = rectF2.right;
                                    float f69 = (delta.dx / 2.0f) + f68;
                                    float f70 = rectF4.right;
                                    if (f69 > f70) {
                                        float f71 = (f70 - f68) * 2.0f;
                                        delta.dx = f71;
                                        delta.dy = f71 / f6;
                                    }
                                    delta.dx /= 2.0f;
                                } else {
                                    delta.dx = RecyclerView.DECELERATION_RATE;
                                }
                                float f72 = rectF2.left;
                                float f73 = delta.dx;
                                rectF2.set(f72 - f73, rectF2.top, rectF2.right + f73, rectF2.bottom + delta.dy);
                            } else {
                                c = 3;
                                delta.adjustRightBounds(rectF2);
                                if (f6 > RecyclerView.DECELERATION_RATE) {
                                    delta.dy = delta.dx / f6;
                                    if (rectF2.height() + delta.dy < f8 && f8 < rectF4.height()) {
                                        float height6 = f8 - rectF2.height();
                                        delta.dy = height6;
                                        delta.dx = height6 * f6;
                                    }
                                    float f74 = rectF2.top;
                                    float f75 = f74 - (delta.dy / 2.0f);
                                    float f76 = rectF4.top;
                                    if (f75 < f76) {
                                        float f77 = (f74 - f76) * 2.0f;
                                        delta.dy = f77;
                                        delta.dx = f77 * f6;
                                    }
                                    float f78 = rectF2.bottom;
                                    float f79 = (delta.dy / 2.0f) + f78;
                                    float f80 = rectF4.bottom;
                                    if (f79 > f80) {
                                        float f81 = (f80 - f78) * 2.0f;
                                        delta.dy = f81;
                                        delta.dx = f81 * f6;
                                    }
                                    delta.dy /= 2.0f;
                                } else {
                                    delta.dy = RecyclerView.DECELERATION_RATE;
                                }
                                float f82 = rectF2.left;
                                float f83 = rectF2.top;
                                float f84 = delta.dy;
                                rectF2.set(f82, f83 - f84, rectF2.right + delta.dx, rectF2.bottom + f84);
                            }
                            motionTracker2.lastX = x;
                            motionTracker2.lastY = y;
                            z3 = true;
                        }
                        c = 3;
                        motionTracker2.lastX = x;
                        motionTracker2.lastY = y;
                        z3 = true;
                    } else {
                        z = z2;
                        c = c2;
                    }
                    i++;
                    c2 = c;
                    z2 = z;
                } else if (z3) {
                    RectF rectF5 = this.displayRect;
                    rectF5.set(rectF2);
                    rectF5.inset(0.5f, 0.5f);
                    updateDimPath();
                    invalidate();
                    return true;
                }
            }
        } else {
            getParent().requestDisallowInterceptTouchEvent(false);
            int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
            MotionTracker motionTracker3 = (MotionTracker) sparseArray.get(pointerId4);
            if (motionTracker3 != null) {
                EnumSet copyOf2 = EnumSet.copyOf((Collection) motionTracker3.edges);
                copyOf2.getClass();
                enumSet.removeAll(copyOf2);
                sparseArray.remove(pointerId4);
                return true;
            }
        }
        return true;
    }

    public final EnumSet removeConflictingEdges(EnumSet enumSet) {
        EnumSet copyOf = EnumSet.copyOf((Collection) enumSet);
        copyOf.getClass();
        float f = this.aspectRatio;
        EnumSet enumSet2 = this.activeEdges;
        if (f <= RecyclerView.DECELERATION_RATE) {
            copyOf.removeAll(enumSet2);
            return copyOf;
        }
        if (!enumSet2.isEmpty() && (enumSet2.size() != 2 || !Intrinsics.areEqual(EnumSet.complementOf(enumSet2), copyOf))) {
            copyOf.clear();
        }
        return copyOf;
    }

    public final void setAspectRatio(float f) {
        if (f < RecyclerView.DECELERATION_RATE) {
            throw new IllegalArgumentException(("aspectRatio cannot be negative: " + f).toString());
        }
        if (this.aspectRatio == f) {
            return;
        }
        this.aspectRatio = f;
        applyAspectRatio();
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        if (!super.setFrame(i, i2, i3, i4)) {
            return false;
        }
        RectF rectF = this.rect;
        if (rectF.isEmpty()) {
            rectF.set(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, (getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
            RectF rectF2 = this.displayRect;
            rectF2.set(rectF);
            rectF2.inset(0.5f, 0.5f);
            applyAspectRatio();
        }
        updateMinSize();
        this.bounds.set(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, (getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        updateDimPath();
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        updateMinSize();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        updateMinSize();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        updateMinSize();
    }

    public final void updateDimPath() {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        Path path = this.dimPath;
        path.reset();
        path.addRect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, width, height, Path.Direction.CW);
        Shape shape = this.shape;
        Shape shape2 = Shape.RECT;
        RectF rectF = this.displayRect;
        if (shape == shape2) {
            path.addRect(rectF, Path.Direction.CCW);
        } else {
            path.addOval(rectF, Path.Direction.CCW);
        }
    }

    public final void updateMinSize() {
        int i;
        Bitmap bitmap = getBitmap(getDrawable());
        float f = this.defaultMinSize;
        int i2 = this.requestedMinWidth;
        if (i2 == 0 || (i = this.requestedMinHeight) == 0 || getWidth() == 0 || bitmap == null) {
            this.minWidth = f;
            this.minHeight = f;
            return;
        }
        float bitmapScale = getBitmapScale(bitmap);
        float f2 = i2 / bitmapScale;
        float f3 = i / bitmapScale;
        if (f2 >= f && f3 >= f) {
            this.minWidth = f2;
            this.minHeight = f3;
            return;
        }
        float f4 = f2 / f3;
        if (f4 >= 1.0f) {
            this.minWidth = f4 * f;
            this.minHeight = f;
        } else {
            this.minWidth = f;
            this.minHeight = f / f4;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ CropView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
