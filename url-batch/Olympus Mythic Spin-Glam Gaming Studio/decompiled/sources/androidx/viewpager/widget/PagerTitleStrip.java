package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.DecorView
/* loaded from: classes13.dex */
public class PagerTitleStrip extends ViewGroup {
    private static final int[] ATTRS = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};
    private static final int[] TEXT_ATTRS = {R.attr.textAllCaps};
    TextView mCurrText;
    private int mGravity;
    private int mLastKnownCurrentPage;
    float mLastKnownPositionOffset;
    TextView mNextText;
    private int mNonPrimaryAlpha;
    private final PageListener mPageListener;
    ViewPager mPager;
    TextView mPrevText;
    private int mScaledTextSpacing;
    int mTextColor;
    private boolean mUpdatingPositions;
    private boolean mUpdatingText;
    private WeakReference mWatchingAdapter;

    private static class SingleLineAllCapsTransform extends SingleLineTransformationMethod {
        private Locale mLocale;

        SingleLineAllCapsTransform(Context context) {
            this.mLocale = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.mLocale);
            }
            return null;
        }
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new SingleLineAllCapsTransform(textView.getContext()));
    }

    public void setTextSpacing(int i) {
        this.mScaledTextSpacing = i;
        requestLayout();
    }

    public int getTextSpacing() {
        return this.mScaledTextSpacing;
    }

    public void setNonPrimaryAlpha(@FloatRange float f) {
        int i = ((int) (f * 255.0f)) & 255;
        this.mNonPrimaryAlpha = i;
        int i2 = (i << 24) | (this.mTextColor & 16777215);
        this.mPrevText.setTextColor(i2);
        this.mNextText.setTextColor(i2);
    }

    public void setTextColor(@ColorInt int i) {
        this.mTextColor = i;
        this.mCurrText.setTextColor(i);
        int i2 = (this.mNonPrimaryAlpha << 24) | (this.mTextColor & 16777215);
        this.mPrevText.setTextColor(i2);
        this.mNextText.setTextColor(i2);
    }

    public void setGravity(int i) {
        this.mGravity = i;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        PagerAdapter adapter = viewPager.getAdapter();
        viewPager.setInternalPageChangeListener(this.mPageListener);
        viewPager.addOnAdapterChangeListener(this.mPageListener);
        this.mPager = viewPager;
        WeakReference weakReference = this.mWatchingAdapter;
        updateAdapter(weakReference != null ? (PagerAdapter) weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.mPager;
        if (viewPager != null) {
            updateAdapter(viewPager.getAdapter(), null);
            this.mPager.setInternalPageChangeListener(null);
            this.mPager.removeOnAdapterChangeListener(this.mPageListener);
            this.mPager = null;
        }
    }

    void updateText(int i, PagerAdapter pagerAdapter) {
        int count = pagerAdapter != null ? pagerAdapter.getCount() : 0;
        this.mUpdatingText = true;
        CharSequence charSequence = null;
        this.mPrevText.setText((i < 1 || pagerAdapter == null) ? null : pagerAdapter.getPageTitle(i - 1));
        this.mCurrText.setText((pagerAdapter == null || i >= count) ? null : pagerAdapter.getPageTitle(i));
        int i2 = i + 1;
        if (i2 < count && pagerAdapter != null) {
            charSequence = pagerAdapter.getPageTitle(i2);
        }
        this.mNextText.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.mPrevText.measure(makeMeasureSpec, makeMeasureSpec2);
        this.mCurrText.measure(makeMeasureSpec, makeMeasureSpec2);
        this.mNextText.measure(makeMeasureSpec, makeMeasureSpec2);
        this.mLastKnownCurrentPage = i;
        if (!this.mUpdatingPositions) {
            updateTextPositions(i, this.mLastKnownPositionOffset, false);
        }
        this.mUpdatingText = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mUpdatingText) {
            return;
        }
        super.requestLayout();
    }

    void updateAdapter(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (pagerAdapter != null) {
            pagerAdapter.unregisterDataSetObserver(this.mPageListener);
            this.mWatchingAdapter = null;
        }
        if (pagerAdapter2 != null) {
            pagerAdapter2.registerDataSetObserver(this.mPageListener);
            this.mWatchingAdapter = new WeakReference(pagerAdapter2);
        }
        ViewPager viewPager = this.mPager;
        if (viewPager != null) {
            this.mLastKnownCurrentPage = -1;
            this.mLastKnownPositionOffset = -1.0f;
            updateText(viewPager.getCurrentItem(), pagerAdapter2);
            requestLayout();
        }
    }

    void updateTextPositions(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != this.mLastKnownCurrentPage) {
            updateText(i, this.mPager.getAdapter());
        } else if (!z && f == this.mLastKnownPositionOffset) {
            return;
        }
        this.mUpdatingPositions = true;
        int measuredWidth = this.mPrevText.getMeasuredWidth();
        int measuredWidth2 = this.mCurrText.getMeasuredWidth();
        int measuredWidth3 = this.mNextText.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (i8 * f2))) - i6;
        int i10 = measuredWidth2 + i9;
        int baseline = this.mPrevText.getBaseline();
        int baseline2 = this.mCurrText.getBaseline();
        int baseline3 = this.mNextText.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = max - baseline;
        int i12 = max - baseline2;
        int i13 = max - baseline3;
        int max2 = Math.max(Math.max(this.mPrevText.getMeasuredHeight() + i11, this.mCurrText.getMeasuredHeight() + i12), this.mNextText.getMeasuredHeight() + i13);
        int i14 = this.mGravity & 112;
        if (i14 == 16) {
            i2 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else {
            if (i14 != 80) {
                i3 = i11 + paddingTop;
                i4 = i12 + paddingTop;
                i5 = paddingTop + i13;
                TextView textView = this.mCurrText;
                textView.layout(i9, i4, i10, textView.getMeasuredHeight() + i4);
                int min = Math.min(paddingLeft, (i9 - this.mScaledTextSpacing) - measuredWidth);
                TextView textView2 = this.mPrevText;
                textView2.layout(min, i3, measuredWidth + min, textView2.getMeasuredHeight() + i3);
                int max3 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.mScaledTextSpacing);
                TextView textView3 = this.mNextText;
                textView3.layout(max3, i5, max3 + measuredWidth3, textView3.getMeasuredHeight() + i5);
                this.mLastKnownPositionOffset = f;
                this.mUpdatingPositions = false;
            }
            i2 = (height - paddingBottom) - max2;
        }
        i3 = i11 + i2;
        i4 = i12 + i2;
        i5 = i2 + i13;
        TextView textView4 = this.mCurrText;
        textView4.layout(i9, i4, i10, textView4.getMeasuredHeight() + i4);
        int min2 = Math.min(paddingLeft, (i9 - this.mScaledTextSpacing) - measuredWidth);
        TextView textView22 = this.mPrevText;
        textView22.layout(min2, i3, measuredWidth + min2, textView22.getMeasuredHeight() + i3);
        int max32 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.mScaledTextSpacing);
        TextView textView32 = this.mNextText;
        textView32.layout(max32, i5, max32 + measuredWidth3, textView32.getMeasuredHeight() + i5);
        this.mLastKnownPositionOffset = f;
        this.mUpdatingPositions = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int max;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int size = View.MeasureSpec.getSize(i);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (size * 0.2f), -2);
        this.mPrevText.measure(childMeasureSpec2, childMeasureSpec);
        this.mCurrText.measure(childMeasureSpec2, childMeasureSpec);
        this.mNextText.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            max = View.MeasureSpec.getSize(i2);
        } else {
            max = Math.max(getMinHeight(), this.mCurrText.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(max, i2, this.mCurrText.getMeasuredState() << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mPager != null) {
            float f = this.mLastKnownPositionOffset;
            if (f < 0.0f) {
                f = 0.0f;
            }
            updateTextPositions(this.mLastKnownCurrentPage, f, true);
        }
    }

    int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    private class PageListener extends DataSetObserver implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener {
        private int mScrollState;
        final /* synthetic */ PagerTitleStrip this$0;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            this.this$0.updateTextPositions(i, f, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            if (this.mScrollState == 0) {
                PagerTitleStrip pagerTitleStrip = this.this$0;
                pagerTitleStrip.updateText(pagerTitleStrip.mPager.getCurrentItem(), this.this$0.mPager.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = this.this$0;
                float f = pagerTitleStrip2.mLastKnownPositionOffset;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                pagerTitleStrip2.updateTextPositions(pagerTitleStrip2.mPager.getCurrentItem(), f, true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.mScrollState = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            this.this$0.updateAdapter(pagerAdapter, pagerAdapter2);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = this.this$0;
            pagerTitleStrip.updateText(pagerTitleStrip.mPager.getCurrentItem(), this.this$0.mPager.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = this.this$0;
            float f = pagerTitleStrip2.mLastKnownPositionOffset;
            if (f < 0.0f) {
                f = 0.0f;
            }
            pagerTitleStrip2.updateTextPositions(pagerTitleStrip2.mPager.getCurrentItem(), f, true);
        }
    }
}
