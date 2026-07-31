package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private TypedValue f10643a;

    /* renamed from: b, reason: collision with root package name */
    private TypedValue f10644b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f10645c;

    /* renamed from: d, reason: collision with root package name */
    private TypedValue f10646d;

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f10647e;

    /* renamed from: f, reason: collision with root package name */
    private TypedValue f10648f;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f10649g;

    /* renamed from: h, reason: collision with root package name */
    private a f10650h;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public void a(int i4, int i5, int i6, int i7) {
        this.f10649g.set(i4, i5, i6, i7);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f10647e == null) {
            this.f10647e = new TypedValue();
        }
        return this.f10647e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f10648f == null) {
            this.f10648f = new TypedValue();
        }
        return this.f10648f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f10645c == null) {
            this.f10645c = new TypedValue();
        }
        return this.f10645c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f10646d == null) {
            this.f10646d = new TypedValue();
        }
        return this.f10646d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f10643a == null) {
            this.f10643a = new TypedValue();
        }
        return this.f10643a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f10644b == null) {
            this.f10644b = new TypedValue();
        }
        return this.f10644b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f10650h;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f10650h;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i4, int i5) {
        boolean z4;
        int measuredWidth;
        TypedValue typedValue;
        int i6;
        int i7;
        float fraction;
        int i8;
        int i9;
        float fraction2;
        int i10;
        int i11;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z5 = true;
        boolean z6 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z6 ? this.f10646d : this.f10645c;
            if (typedValue2 != null && (i10 = typedValue2.type) != 0) {
                if (i10 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i10 == 6) {
                    int i12 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i12, i12);
                } else {
                    i11 = 0;
                    if (i11 > 0) {
                        Rect rect = this.f10649g;
                        i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i11 - (rect.left + rect.right), View.MeasureSpec.getSize(i4)), 1073741824);
                        z4 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z6 ? this.f10647e : this.f10648f;
                            if (typedValue3 != null && (i8 = typedValue3.type) != 0) {
                                if (i8 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i8 == 6) {
                                    int i13 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i13, i13);
                                } else {
                                    i9 = 0;
                                    if (i9 > 0) {
                                        Rect rect2 = this.f10649g;
                                        i5 = View.MeasureSpec.makeMeasureSpec(Math.min(i9 - (rect2.top + rect2.bottom), View.MeasureSpec.getSize(i5)), 1073741824);
                                    }
                                }
                                i9 = (int) fraction2;
                                if (i9 > 0) {
                                }
                            }
                        }
                        super.onMeasure(i4, i5);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z4 && mode == Integer.MIN_VALUE) {
                            typedValue = !z6 ? this.f10644b : this.f10643a;
                            if (typedValue != null && (i6 = typedValue.type) != 0) {
                                if (i6 != 5) {
                                    fraction = typedValue.getDimension(displayMetrics);
                                } else if (i6 == 6) {
                                    int i14 = displayMetrics.widthPixels;
                                    fraction = typedValue.getFraction(i14, i14);
                                } else {
                                    i7 = 0;
                                    if (i7 > 0) {
                                        Rect rect3 = this.f10649g;
                                        i7 -= rect3.left + rect3.right;
                                    }
                                    if (measuredWidth < i7) {
                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                                        if (z5) {
                                            super.onMeasure(makeMeasureSpec, i5);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i7 = (int) fraction;
                                if (i7 > 0) {
                                }
                                if (measuredWidth < i7) {
                                }
                            }
                        }
                        z5 = false;
                        if (z5) {
                        }
                    }
                }
                i11 = (int) fraction3;
                if (i11 > 0) {
                }
            }
        }
        z4 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        super.onMeasure(i4, i5);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z4) {
            if (!z6) {
            }
            if (typedValue != null) {
                if (i6 != 5) {
                }
                i7 = (int) fraction;
                if (i7 > 0) {
                }
                if (measuredWidth < i7) {
                }
            }
        }
        z5 = false;
        if (z5) {
        }
    }

    public void setAttachListener(a aVar) {
        this.f10650h = aVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f10649g = new Rect();
    }
}
