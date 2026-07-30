package com.google.maps.android.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.maps.android.R;

/* loaded from: classes4.dex */
public class IconGenerator {
    public static final int STYLE_BLUE = 4;
    public static final int STYLE_DEFAULT = 1;
    public static final int STYLE_GREEN = 5;
    public static final int STYLE_ORANGE = 7;
    public static final int STYLE_PURPLE = 6;
    public static final int STYLE_RED = 3;
    public static final int STYLE_WHITE = 2;
    private float mAnchorU = 0.5f;
    private float mAnchorV = 1.0f;
    private BubbleDrawable mBackground;
    private ViewGroup mContainer;
    private View mContentView;
    private final Context mContext;
    private int mRotation;
    private RotationLayout mRotationLayout;
    private TextView mTextView;

    public IconGenerator(Context context) {
        this.mContext = context;
        this.mBackground = new BubbleDrawable(context);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.amu_text_bubble, (ViewGroup) null);
        this.mContainer = viewGroup;
        RotationLayout rotationLayout = (RotationLayout) viewGroup.getChildAt(0);
        this.mRotationLayout = rotationLayout;
        TextView textView = (TextView) rotationLayout.findViewById(R.id.amu_text);
        this.mTextView = textView;
        this.mContentView = textView;
        setStyle(1);
    }

    private static int getStyleColor(int i8) {
        if (i8 == 3) {
            return -3407872;
        }
        if (i8 == 4) {
            return -16737844;
        }
        if (i8 == 5) {
            return -10053376;
        }
        if (i8 != 6) {
            return i8 != 7 ? -1 : -30720;
        }
        return -6736948;
    }

    private static int getTextStyle(int i8) {
        return (i8 == 3 || i8 == 4 || i8 == 5 || i8 == 6 || i8 == 7) ? R.style.amu_Bubble_TextAppearance_Light : R.style.amu_Bubble_TextAppearance_Dark;
    }

    private float rotateAnchor(float f8, float f9) {
        int i8 = this.mRotation;
        if (i8 == 0) {
            return f8;
        }
        if (i8 == 1) {
            return 1.0f - f9;
        }
        if (i8 == 2) {
            return 1.0f - f8;
        }
        if (i8 == 3) {
            return f9;
        }
        throw new IllegalStateException();
    }

    public float getAnchorU() {
        return rotateAnchor(this.mAnchorU, this.mAnchorV);
    }

    public float getAnchorV() {
        return rotateAnchor(this.mAnchorV, this.mAnchorU);
    }

    public Bitmap makeIcon(CharSequence charSequence) {
        TextView textView = this.mTextView;
        if (textView != null) {
            textView.setText(charSequence);
        }
        return makeIcon();
    }

    public void setBackground(Drawable drawable) {
        this.mContainer.setBackgroundDrawable(drawable);
        if (drawable == null) {
            this.mContainer.setPadding(0, 0, 0, 0);
            return;
        }
        Rect rect = new Rect();
        drawable.getPadding(rect);
        this.mContainer.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setColor(int i8) {
        this.mBackground.setColor(i8);
        setBackground(this.mBackground);
    }

    public void setContentPadding(int i8, int i9, int i10, int i11) {
        this.mContentView.setPadding(i8, i9, i10, i11);
    }

    public void setContentRotation(int i8) {
        this.mRotationLayout.setViewRotation(i8);
    }

    public void setContentView(View view) {
        this.mRotationLayout.removeAllViews();
        this.mRotationLayout.addView(view);
        this.mContentView = view;
        View findViewById = this.mRotationLayout.findViewById(R.id.amu_text);
        this.mTextView = findViewById instanceof TextView ? (TextView) findViewById : null;
    }

    public void setRotation(int i8) {
        this.mRotation = ((i8 + 360) % 360) / 90;
    }

    public void setStyle(int i8) {
        setColor(getStyleColor(i8));
        setTextAppearance(this.mContext, getTextStyle(i8));
    }

    public void setTextAppearance(Context context, int i8) {
        TextView textView = this.mTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i8);
        }
    }

    public void setTextAppearance(int i8) {
        setTextAppearance(this.mContext, i8);
    }

    public Bitmap makeIcon() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mContainer.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = this.mContainer.getMeasuredWidth();
        int measuredHeight = this.mContainer.getMeasuredHeight();
        this.mContainer.layout(0, 0, measuredWidth, measuredHeight);
        int i8 = this.mRotation;
        if (i8 == 1 || i8 == 3) {
            measuredHeight = this.mContainer.getMeasuredWidth();
            measuredWidth = this.mContainer.getMeasuredHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        Canvas canvas = new Canvas(createBitmap);
        int i9 = this.mRotation;
        if (i9 == 1) {
            canvas.translate(measuredWidth, 0.0f);
            canvas.rotate(90.0f);
        } else if (i9 == 2) {
            canvas.rotate(180.0f, measuredWidth / 2, measuredHeight / 2);
        } else if (i9 == 3) {
            canvas.translate(0.0f, measuredHeight);
            canvas.rotate(270.0f);
        }
        this.mContainer.draw(canvas);
        return createBitmap;
    }
}
