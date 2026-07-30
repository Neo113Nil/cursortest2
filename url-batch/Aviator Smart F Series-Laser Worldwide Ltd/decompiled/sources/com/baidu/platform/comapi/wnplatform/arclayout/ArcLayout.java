package com.baidu.platform.comapi.wnplatform.arclayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import com.baidu.baidumapsdk_api.R;
import com.baidu.platform.comapi.wnplatform.arclayout.b.b;

/* loaded from: classes2.dex */
public class ArcLayout extends com.baidu.platform.comapi.wnplatform.arclayout.a {
    public static final int CROP_INSIDE = 1;
    public static final int CROP_OUTSIDE = 2;
    public static final int POSITION_BOTTOM = 1;
    public static final int POSITION_LEFT = 3;
    public static final int POSITION_RIGHT = 4;
    public static final int POSITION_TOP = 2;
    private int arcHeight;
    private int arcPosition;
    private int cropDirection;

    class a implements b.a {
        a() {
        }

        @Override // com.baidu.platform.comapi.wnplatform.arclayout.b.b.a
        public boolean a() {
            return false;
        }

        @Override // com.baidu.platform.comapi.wnplatform.arclayout.b.b.a
        public Path a(int i8, int i9) {
            Path path = new Path();
            boolean z7 = ArcLayout.this.cropDirection == 1;
            int i10 = ArcLayout.this.arcPosition;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            if (z7) {
                                path.moveTo(0.0f, 0.0f);
                                float f8 = i8;
                                path.lineTo(f8, 0.0f);
                                float f9 = i9 / 2;
                                float f10 = i9;
                                path.quadTo(i8 - (ArcLayout.this.arcHeight * 2), f9, f8, f10);
                                path.lineTo(0.0f, f10);
                                path.close();
                            } else {
                                path.moveTo(0.0f, 0.0f);
                                path.lineTo(i8 - ArcLayout.this.arcHeight, 0.0f);
                                float f11 = i9;
                                path.quadTo(ArcLayout.this.arcHeight + i8, i9 / 2, i8 - ArcLayout.this.arcHeight, f11);
                                path.lineTo(0.0f, f11);
                                path.close();
                            }
                        }
                    } else if (z7) {
                        float f12 = i8;
                        path.moveTo(f12, 0.0f);
                        path.lineTo(0.0f, 0.0f);
                        float f13 = i9 / 2;
                        float f14 = i9;
                        path.quadTo(ArcLayout.this.arcHeight * 2, f13, 0.0f, f14);
                        path.lineTo(f12, f14);
                        path.close();
                    } else {
                        float f15 = i8;
                        path.moveTo(f15, 0.0f);
                        path.lineTo(ArcLayout.this.arcHeight, 0.0f);
                        float f16 = i9;
                        path.quadTo(-ArcLayout.this.arcHeight, i9 / 2, ArcLayout.this.arcHeight, f16);
                        path.lineTo(f15, f16);
                        path.close();
                    }
                } else if (!z7) {
                    path.moveTo(0.0f, ArcLayout.this.arcHeight);
                    float f17 = i8;
                    path.quadTo(i8 / 2, -ArcLayout.this.arcHeight, f17, ArcLayout.this.arcHeight);
                    float f18 = i9;
                    path.lineTo(f17, f18);
                    path.lineTo(0.0f, f18);
                    path.close();
                }
            } else if (z7) {
                path.moveTo(0.0f, 0.0f);
                float f19 = i9;
                path.lineTo(0.0f, f19);
                float f20 = i8;
                path.quadTo(i8 / 2, i9 - (ArcLayout.this.arcHeight * 2), f20, f19);
                path.lineTo(f20, 0.0f);
                path.close();
            } else {
                path.moveTo(0.0f, 0.0f);
                path.lineTo(0.0f, i9 - ArcLayout.this.arcHeight);
                float f21 = i8;
                path.quadTo(i8 / 2, ArcLayout.this.arcHeight + i9, f21, i9 - ArcLayout.this.arcHeight);
                path.lineTo(f21, 0.0f);
                path.close();
            }
            return path;
        }
    }

    public ArcLayout(Context context) {
        super(context);
        this.arcPosition = 2;
        this.cropDirection = 1;
        this.arcHeight = 0;
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ArcLayout);
            this.arcHeight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ArcLayout_arc_height, this.arcHeight);
            this.arcPosition = obtainStyledAttributes.getInteger(R.styleable.ArcLayout_arc_position, this.arcPosition);
            this.cropDirection = obtainStyledAttributes.getInteger(R.styleable.ArcLayout_arc_cropDirection, this.cropDirection);
            obtainStyledAttributes.recycle();
        }
        super.setClipPathCreator(new a());
    }

    public ArcLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.arcPosition = 2;
        this.cropDirection = 1;
        this.arcHeight = 0;
        init(context, attributeSet);
    }

    public ArcLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.arcPosition = 2;
        this.cropDirection = 1;
        this.arcHeight = 0;
        init(context, attributeSet);
    }
}
