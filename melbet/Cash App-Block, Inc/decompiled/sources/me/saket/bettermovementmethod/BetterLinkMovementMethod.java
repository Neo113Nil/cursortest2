package me.saket.bettermovementmethod;

import android.graphics.RectF;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.squareup.cash.R;

/* loaded from: classes4.dex */
public final class BetterLinkMovementMethod extends LinkMovementMethod {
    public static BetterLinkMovementMethod singleInstance;
    public int activeTextViewHashcode;
    public ClickableSpan clickableSpanUnderTouchOnActionDown;
    public boolean isUrlHighlighted;
    public final RectF touchedLineBounds = new RectF();
    public boolean wasLongPressRegistered;

    public static BetterLinkMovementMethod getInstance() {
        if (singleInstance == null) {
            singleInstance = new BetterLinkMovementMethod();
        }
        return singleInstance;
    }

    public final void highlightUrl(TextView textView, ClickableSpan clickableSpan, Spannable spannable) {
        if (this.isUrlHighlighted) {
            return;
        }
        this.isUrlHighlighted = true;
        int spanStart = spannable.getSpanStart(clickableSpan);
        int spanEnd = spannable.getSpanEnd(clickableSpan);
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(textView.getHighlightColor());
        spannable.setSpan(backgroundColorSpan, spanStart, spanEnd, 18);
        textView.setTag(R.id.bettermovementmethod_highlight_background_span, backgroundColorSpan);
        Selection.setSelection(spannable, spanStart, spanEnd);
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        ClickableSpan clickableSpan;
        if (this.activeTextViewHashcode != textView.hashCode()) {
            this.activeTextViewHashcode = textView.hashCode();
            textView.setAutoLinkMask(0);
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int totalPaddingLeft = x - textView.getTotalPaddingLeft();
        int totalPaddingTop = y - textView.getTotalPaddingTop();
        int scrollX = textView.getScrollX() + totalPaddingLeft;
        int scrollY = textView.getScrollY() + totalPaddingTop;
        Layout layout = textView.getLayout();
        int lineForVertical = layout.getLineForVertical(scrollY);
        float f = scrollX;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
        float lineLeft = layout.getLineLeft(lineForVertical);
        RectF rectF = this.touchedLineBounds;
        rectF.left = lineLeft;
        rectF.top = layout.getLineTop(lineForVertical);
        rectF.right = layout.getLineWidth(lineForVertical) + rectF.left;
        rectF.bottom = layout.getLineBottom(lineForVertical);
        if (rectF.contains(f, scrollY)) {
            for (Object obj : spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class)) {
                if (obj instanceof ClickableSpan) {
                    clickableSpan = (ClickableSpan) obj;
                    break;
                }
            }
        }
        clickableSpan = null;
        if (motionEvent.getAction() == 0) {
            this.clickableSpanUnderTouchOnActionDown = clickableSpan;
        }
        boolean z = this.clickableSpanUnderTouchOnActionDown != null;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                if (!this.wasLongPressRegistered && z && clickableSpan == this.clickableSpanUnderTouchOnActionDown) {
                    Spanned spanned = (Spanned) textView.getText();
                    if (clickableSpan instanceof URLSpan) {
                        ((URLSpan) clickableSpan).getURL();
                    } else {
                        spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan)).toString();
                    }
                    clickableSpan.onClick(textView);
                }
                this.wasLongPressRegistered = false;
                this.clickableSpanUnderTouchOnActionDown = null;
                removeUrlHighlightColor(textView);
            } else {
                if (action != 2) {
                    if (action == 3) {
                        this.wasLongPressRegistered = false;
                        this.clickableSpanUnderTouchOnActionDown = null;
                        removeUrlHighlightColor(textView);
                    }
                    return false;
                }
                if (!this.wasLongPressRegistered) {
                    if (clickableSpan != null) {
                        highlightUrl(textView, clickableSpan, spannable);
                        return z;
                    }
                    removeUrlHighlightColor(textView);
                    return z;
                }
            }
        } else if (clickableSpan != null) {
            highlightUrl(textView, clickableSpan, spannable);
        }
        return z;
    }

    public final void removeUrlHighlightColor(TextView textView) {
        if (this.isUrlHighlighted) {
            this.isUrlHighlighted = false;
            Spannable spannable = (Spannable) textView.getText();
            spannable.removeSpan((BackgroundColorSpan) textView.getTag(R.id.bettermovementmethod_highlight_background_span));
            Selection.removeSelection(spannable);
        }
    }
}
