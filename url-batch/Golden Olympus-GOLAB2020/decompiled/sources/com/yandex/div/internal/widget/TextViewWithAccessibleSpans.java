package com.yandex.div.internal.widget;

import B.w;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.core.view.AbstractC1281a0;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.view2.spannable.ImageSpan;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class TextViewWithAccessibleSpans extends EllipsizedTextView {

    @Nullable
    private String _contentDescription;

    @NotNull
    private final List<ImageSpan> accessibleImageSpans;

    @NotNull
    private final List<ImageSpan> imageSpans;

    @Nullable
    private final SpanHelper spanHelper;

    @Metadata
    private final class SpanHelper extends N.a {
        public SpanHelper() {
            super(TextViewWithAccessibleSpans.this);
        }

        private final ImageSpan getSpanForId(int i4) {
            if (i4 != -1 && TextViewWithAccessibleSpans.this.accessibleImageSpans.size() != 0 && i4 < TextViewWithAccessibleSpans.this.accessibleImageSpans.size() && i4 >= 0) {
                return (ImageSpan) TextViewWithAccessibleSpans.this.accessibleImageSpans.get(i4);
            }
            return null;
        }

        @Override // N.a
        protected int getVirtualViewAt(float f4, float f5) {
            RectF rectF = new RectF();
            List list = TextViewWithAccessibleSpans.this.accessibleImageSpans;
            TextViewWithAccessibleSpans textViewWithAccessibleSpans = TextViewWithAccessibleSpans.this;
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ((ImageSpan) obj).getBoundsInText(rectF).offset(textViewWithAccessibleSpans.getPaddingLeft(), textViewWithAccessibleSpans.getPaddingTop());
                if (rectF.contains(f4, f5)) {
                    return i4;
                }
                i4 = i5;
            }
            return -1;
        }

        @Override // N.a
        protected void getVisibleVirtualViews(@NotNull List<Integer> virtualViewIds) {
            Intrinsics.checkNotNullParameter(virtualViewIds, "virtualViewIds");
            int i4 = 0;
            for (Object obj : TextViewWithAccessibleSpans.this.accessibleImageSpans) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                virtualViewIds.add(Integer.valueOf(i4));
                i4 = i5;
            }
        }

        @Override // N.a
        protected boolean onPerformActionForVirtualView(int i4, int i5, @Nullable Bundle bundle) {
            ImageSpan.Accessibility accessibility$div_release;
            ImageSpan.OnAccessibilityClickAction onClickAction;
            ImageSpan spanForId = getSpanForId(i4);
            if (spanForId == null || (accessibility$div_release = spanForId.getAccessibility$div_release()) == null || (onClickAction = accessibility$div_release.getOnClickAction()) == null || i5 != 16) {
                return false;
            }
            onClickAction.perform();
            return true;
        }

        @Override // N.a
        protected void onPopulateNodeForVirtualView(int i4, @NotNull w node) {
            String str;
            Intrinsics.checkNotNullParameter(node, "node");
            ImageSpan spanForId = getSpanForId(i4);
            if (spanForId == null) {
                return;
            }
            ImageSpan.Accessibility accessibility$div_release = spanForId.getAccessibility$div_release();
            if (accessibility$div_release == null || (str = accessibility$div_release.getAccessibilityType()) == null) {
                str = "";
            }
            node.k0(str);
            node.y0(TextViewWithAccessibleSpans.this.getContext().getPackageName());
            Rect boundsInText = spanForId.getBoundsInText(new Rect());
            TextViewWithAccessibleSpans textViewWithAccessibleSpans = TextViewWithAccessibleSpans.this;
            boundsInText.offset(textViewWithAccessibleSpans.getPaddingLeft(), textViewWithAccessibleSpans.getPaddingTop());
            ImageSpan.Accessibility accessibility$div_release2 = spanForId.getAccessibility$div_release();
            node.o0(accessibility$div_release2 != null ? accessibility$div_release2.getContentDescription() : null);
            ImageSpan.Accessibility accessibility$div_release3 = spanForId.getAccessibility$div_release();
            if ((accessibility$div_release3 != null ? accessibility$div_release3.getOnClickAction() : null) == null) {
                node.l0(false);
            } else {
                node.l0(true);
                node.a(16);
            }
            node.g0(boundsInText);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextViewWithAccessibleSpans(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        this.accessibleImageSpans = new ArrayList();
        this.imageSpans = new ArrayList();
        AccessibilityStateProvider.Companion companion = AccessibilityStateProvider.Companion;
        companion.evaluateTouchModeEnabled(context);
        if (!Intrinsics.areEqual(companion.getTouchModeEnabled(), Boolean.TRUE)) {
            this.spanHelper = null;
            return;
        }
        SpanHelper spanHelper = new SpanHelper();
        this.spanHelper = spanHelper;
        AbstractC1281a0.o0(this, spanHelper);
        setAccessibilityLiveRegion(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b5, code lost:
    
        if (r1 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void evaluateAndSetContentDescription() {
        String str;
        if (!Intrinsics.areEqual(AccessibilityStateProvider.Companion.getTouchModeEnabled(), Boolean.TRUE)) {
            super.setContentDescription(this._contentDescription);
            return;
        }
        List<ImageSpan> list = this.imageSpans;
        if (list == null || this._contentDescription != null) {
            str = this._contentDescription;
        } else {
            str = null;
            str = null;
            if (list.size() != 0 && getText().length() != 0) {
                CharSequence text = getText();
                SpannableString spannableString = text instanceof SpannableString ? (SpannableString) text : null;
                if (spannableString != null) {
                    List<ImageSpan> list2 = this.imageSpans;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(spannableString.getSpanStart((ImageSpan) it.next())));
                    }
                    List sortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.yandex.div.internal.widget.TextViewWithAccessibleSpans$evaluateAndSetContentDescription$lambda$3$$inlined$sortedByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t4, T t5) {
                            return Z1.a.d(Integer.valueOf(((Number) t5).intValue()), Integer.valueOf(((Number) t4).intValue()));
                        }
                    });
                    StringBuilder sb = new StringBuilder();
                    Iterator it2 = sortedWith.iterator();
                    int i4 = 0;
                    while (it2.hasNext()) {
                        int intValue = ((Number) it2.next()).intValue();
                        sb.append(getText().subSequence(i4, intValue));
                        i4 = intValue + 1;
                    }
                    sb.append(getText().subSequence(i4, getText().length()));
                    str = sb.toString();
                }
                str = getText().toString();
            }
        }
        super.setContentDescription(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if ((r0 != null ? r0.getOnClickAction() : null) != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void addImageSpan$div_release(@NotNull ImageSpan span) {
        Intrinsics.checkNotNullParameter(span, "span");
        if (Intrinsics.areEqual(AccessibilityStateProvider.Companion.getTouchModeEnabled(), Boolean.TRUE)) {
            this.imageSpans.add(span);
            ImageSpan.Accessibility accessibility$div_release = span.getAccessibility$div_release();
            if ((accessibility$div_release != null ? accessibility$div_release.getContentDescription() : null) == null) {
                ImageSpan.Accessibility accessibility$div_release2 = span.getAccessibility$div_release();
            }
            this.accessibleImageSpans.add(span);
            SpanHelper spanHelper = this.spanHelper;
            if (spanHelper != null) {
                spanHelper.invalidateVirtualView(this.accessibleImageSpans.size() - 1);
            }
        }
    }

    public final void clearImageSpans$div_release() {
        this.accessibleImageSpans.clear();
        this.imageSpans.clear();
        SpanHelper spanHelper = this.spanHelper;
        if (spanHelper != null) {
            spanHelper.invalidateRoot();
        }
        evaluateAndSetContentDescription();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        SpanHelper spanHelper = this.spanHelper;
        return (spanHelper != null && spanHelper.dispatchHoverEvent(event)) || super.dispatchHoverEvent(event);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        SpanHelper spanHelper = this.spanHelper;
        return (spanHelper != null && spanHelper.dispatchKeyEvent(event)) || super.dispatchKeyEvent(event);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int i4 = 0;
        for (Object obj : this.accessibleImageSpans) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            SpanHelper spanHelper = this.spanHelper;
            if (spanHelper != null) {
                spanHelper.invalidateVirtualView(i4);
            }
            i4 = i5;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z4, int i4, @Nullable Rect rect) {
        super.onFocusChanged(z4, i4, rect);
        SpanHelper spanHelper = this.spanHelper;
        if (spanHelper != null) {
            spanHelper.onFocusChanged(z4, i4, rect);
        }
    }

    @Override // android.view.View
    public void setContentDescription(@Nullable CharSequence charSequence) {
        this._contentDescription = charSequence != null ? charSequence.toString() : null;
        super.setContentDescription(charSequence);
    }

    @Override // com.yandex.div.internal.widget.EllipsizedTextView, android.widget.TextView
    public void setText(@Nullable CharSequence charSequence, @Nullable TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        evaluateAndSetContentDescription();
    }
}
