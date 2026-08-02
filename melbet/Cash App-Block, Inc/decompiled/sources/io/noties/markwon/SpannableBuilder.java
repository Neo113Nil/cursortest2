package io.noties.markwon;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class SpannableBuilder implements Appendable, CharSequence {
    public final ArrayDeque spans = new ArrayDeque(8);
    public final StringBuilder builder = new StringBuilder((CharSequence) "");

    public final class Span {
        public final int end;
        public final int flags;
        public final int start;
        public final Object what;

        public Span(Object obj, int i, int i2, int i3) {
            this.what = obj;
            this.start = i;
            this.end = i2;
            this.flags = i3;
        }
    }

    public final class SpannableStringBuilderReversed extends SpannableStringBuilder {
    }

    public SpannableBuilder() {
        copySpans(0, "");
    }

    public static void setSpansInternal(SpannableBuilder spannableBuilder, Object obj, int i, int i2) {
        if (obj != null) {
            if (!obj.getClass().isArray()) {
                spannableBuilder.spans.push(new Span(obj, i, i2, 33));
                return;
            }
            for (Object obj2 : (Object[]) obj) {
                setSpansInternal(spannableBuilder, obj2, i, i2);
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        CharSequence subSequence = charSequence.subSequence(i, i2);
        StringBuilder sb = this.builder;
        copySpans(sb.length(), subSequence);
        sb.append(subSequence);
        return this;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.builder.charAt(i);
    }

    public final void copySpans(int i, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z = spanned instanceof SpannableStringBuilderReversed;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length > 0) {
                ArrayDeque arrayDeque = this.spans;
                if (!z) {
                    for (int i2 = 0; i2 < length; i2++) {
                        Object obj = spans[i2];
                        arrayDeque.push(new Span(obj, spanned.getSpanStart(obj) + i, spanned.getSpanEnd(obj) + i, spanned.getSpanFlags(obj)));
                    }
                    return;
                }
                for (int i3 = length - 1; i3 >= 0; i3--) {
                    Object obj2 = spans[i3];
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spanned;
                    arrayDeque.push(new Span(obj2, spannableStringBuilder.getSpanStart(obj2) + i, spannableStringBuilder.getSpanEnd(obj2) + i, spannableStringBuilder.getSpanFlags(obj2)));
                }
            }
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.builder.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        List<Span> list;
        int i3;
        StringBuilder sb = this.builder;
        int length = sb.length();
        if (i2 <= i || i < 0 || i2 > length) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayDeque arrayDeque = this.spans;
            if (i == 0 && length == i2) {
                ArrayList arrayList = new ArrayList(arrayDeque);
                Collections.reverse(arrayList);
                list = Collections.unmodifiableList(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(0);
                Iterator descendingIterator = arrayDeque.descendingIterator();
                while (descendingIterator.hasNext()) {
                    Span span = (Span) descendingIterator.next();
                    int i4 = span.start;
                    if ((i4 >= i && i4 < i2) || (((i3 = span.end) <= i2 && i3 > i) || (i4 < i && i3 > i2))) {
                        arrayList2.add(span);
                    }
                }
                list = Collections.unmodifiableList(arrayList2);
            }
        }
        if (list.isEmpty()) {
            return sb.subSequence(i, i2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.subSequence(i, i2));
        int length2 = spannableStringBuilder.length();
        for (Span span2 : list) {
            int max = Math.max(0, span2.start - i);
            spannableStringBuilder.setSpan(span2.what, max, Math.min(length2, (span2.end - span2.start) + max), span2.flags);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.builder.toString();
    }

    @Override // java.lang.Appendable
    public final void append(char c) {
        this.builder.append(c);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.builder.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        StringBuilder sb = this.builder;
        copySpans(sb.length(), charSequence);
        sb.append(charSequence);
        return this;
    }
}
