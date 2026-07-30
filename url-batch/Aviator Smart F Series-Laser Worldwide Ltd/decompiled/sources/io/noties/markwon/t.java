package io.noties.markwon;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class t implements Appendable, CharSequence {
    private final StringBuilder builder;
    private final Deque<a> spans;

    public static class a {
        public int end;
        public final int flags;
        public int start;
        public final Object what;

        a(@NonNull Object obj, int i8, int i9, int i10) {
            this.what = obj;
            this.start = i8;
            this.end = i9;
            this.flags = i10;
        }
    }

    static class b extends SpannableStringBuilder {
        b(CharSequence charSequence) {
            super(charSequence);
        }
    }

    public t() {
        this("");
    }

    private void copySpans(int i8, @Nullable CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z7 = spanned instanceof b;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length > 0) {
                if (!z7) {
                    for (int i9 = 0; i9 < length; i9++) {
                        Object obj = spans[i9];
                        setSpan(obj, spanned.getSpanStart(obj) + i8, spanned.getSpanEnd(obj) + i8, spanned.getSpanFlags(obj));
                    }
                    return;
                }
                for (int i10 = length - 1; i10 >= 0; i10--) {
                    Object obj2 = spans[i10];
                    setSpan(obj2, spanned.getSpanStart(obj2) + i8, spanned.getSpanEnd(obj2) + i8, spanned.getSpanFlags(obj2));
                }
            }
        }
    }

    @VisibleForTesting
    static boolean isPositionValid(int i8, int i9, int i10) {
        return i10 > i9 && i9 >= 0 && i10 <= i8;
    }

    public static void setSpans(@NonNull t tVar, @Nullable Object obj, int i8, int i9) {
        if (obj == null || !isPositionValid(tVar.length(), i8, i9)) {
            return;
        }
        setSpansInternal(tVar, obj, i8, i9);
    }

    private static void setSpansInternal(@NonNull t tVar, @Nullable Object obj, int i8, int i9) {
        if (obj != null) {
            if (!obj.getClass().isArray()) {
                tVar.setSpan(obj, i8, i9, 33);
                return;
            }
            for (Object obj2 : (Object[]) obj) {
                setSpansInternal(tVar, obj2, i8, i9);
            }
        }
    }

    @Override // java.lang.CharSequence
    public char charAt(int i8) {
        return this.builder.charAt(i8);
    }

    public void clear() {
        this.builder.setLength(0);
        this.spans.clear();
    }

    @NonNull
    public List<a> getSpans(int i8, int i9) {
        int i10;
        int length = length();
        if (!isPositionValid(length, i8, i9)) {
            return Collections.emptyList();
        }
        if (i8 == 0 && length == i9) {
            ArrayList arrayList = new ArrayList(this.spans);
            Collections.reverse(arrayList);
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(0);
        Iterator<a> descendingIterator = this.spans.descendingIterator();
        while (descendingIterator.hasNext()) {
            a next = descendingIterator.next();
            int i11 = next.start;
            if ((i11 >= i8 && i11 < i9) || (((i10 = next.end) <= i9 && i10 > i8) || (i11 < i8 && i10 > i9))) {
                arrayList2.add(next);
            }
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public char lastChar() {
        return this.builder.charAt(length() - 1);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.builder.length();
    }

    @NonNull
    public CharSequence removeFromEnd(int i8) {
        a next;
        int i9;
        int length = length();
        b bVar = new b(this.builder.subSequence(i8, length));
        Iterator<a> it = this.spans.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            int i10 = next.start;
            if (i10 >= i8 && (i9 = next.end) <= length) {
                bVar.setSpan(next.what, i10 - i8, i9 - i8, 33);
                it.remove();
            }
        }
        this.builder.replace(i8, length, "");
        return bVar;
    }

    @NonNull
    public t setSpan(@NonNull Object obj, int i8) {
        return setSpan(obj, i8, length());
    }

    @NonNull
    public SpannableStringBuilder spannableStringBuilder() {
        b bVar = new b(this.builder);
        for (a aVar : this.spans) {
            bVar.setSpan(aVar.what, aVar.start, aVar.end, aVar.flags);
        }
        return bVar;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i8, int i9) {
        List<a> spans = getSpans(i8, i9);
        if (spans.isEmpty()) {
            return this.builder.subSequence(i8, i9);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.builder.subSequence(i8, i9));
        int length = spannableStringBuilder.length();
        for (a aVar : spans) {
            int max = Math.max(0, aVar.start - i8);
            spannableStringBuilder.setSpan(aVar.what, max, Math.min(length, (aVar.end - aVar.start) + max), aVar.flags);
        }
        return spannableStringBuilder;
    }

    @NonNull
    public CharSequence text() {
        return spannableStringBuilder();
    }

    @Override // java.lang.CharSequence
    @NonNull
    public String toString() {
        return this.builder.toString();
    }

    public t(@NonNull CharSequence charSequence) {
        this.spans = new ArrayDeque(8);
        this.builder = new StringBuilder(charSequence);
        copySpans(0, charSequence);
    }

    @NonNull
    public t setSpan(@NonNull Object obj, int i8, int i9) {
        return setSpan(obj, i8, i9, 33);
    }

    @NonNull
    public t setSpan(@NonNull Object obj, int i8, int i9, int i10) {
        this.spans.push(new a(obj, i8, i9, i10));
        return this;
    }

    @NonNull
    public t append(@NonNull String str) {
        this.builder.append(str);
        return this;
    }

    @Override // java.lang.Appendable
    @NonNull
    public t append(char c8) {
        this.builder.append(c8);
        return this;
    }

    @Override // java.lang.Appendable
    @NonNull
    public t append(@NonNull CharSequence charSequence) {
        copySpans(length(), charSequence);
        this.builder.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    @NonNull
    public t append(CharSequence charSequence, int i8, int i9) {
        CharSequence subSequence = charSequence.subSequence(i8, i9);
        copySpans(length(), subSequence);
        this.builder.append(subSequence);
        return this;
    }

    @NonNull
    public t append(@NonNull CharSequence charSequence, @NonNull Object obj) {
        int length = length();
        append(charSequence);
        setSpan(obj, length);
        return this;
    }

    @NonNull
    public t append(@NonNull CharSequence charSequence, @NonNull Object obj, int i8) {
        int length = length();
        append(charSequence);
        setSpan(obj, length, length(), i8);
        return this;
    }
}
