package d4;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class y implements TextWatcher, SpanWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final Object f2305d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f2306e = new AtomicInteger(0);

    public y(Object obj) {
        this.f2305d = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f2305d).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i8, int i9) {
        ((TextWatcher) this.f2305d).beforeTextChanged(charSequence, i, i8, i9);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i8) {
        if (this.f2306e.get() <= 0 || !(obj instanceof b0)) {
            ((SpanWatcher) this.f2305d).onSpanAdded(spannable, obj, i, i8);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i8, int i9, int i10) {
        int i11;
        int i12;
        if (this.f2306e.get() <= 0 || !(obj instanceof b0)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (i > i8) {
                    i = 0;
                }
                if (i9 > i10) {
                    i11 = i;
                    i12 = 0;
                    ((SpanWatcher) this.f2305d).onSpanChanged(spannable, obj, i11, i8, i12, i10);
                }
            }
            i11 = i;
            i12 = i9;
            ((SpanWatcher) this.f2305d).onSpanChanged(spannable, obj, i11, i8, i12, i10);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i8) {
        if (this.f2306e.get() <= 0 || !(obj instanceof b0)) {
            ((SpanWatcher) this.f2305d).onSpanRemoved(spannable, obj, i, i8);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i8, int i9) {
        ((TextWatcher) this.f2305d).onTextChanged(charSequence, i, i8, i9);
    }
}
