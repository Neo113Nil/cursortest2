package U;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class s implements TextWatcher, SpanWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final Object f2702d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f2703e = new AtomicInteger(0);

    public s(Object obj) {
        this.f2702d = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f2702d).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i5, int i7) {
        ((TextWatcher) this.f2702d).beforeTextChanged(charSequence, i2, i5, i7);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i2, int i5) {
        if (this.f2703e.get() <= 0 || !(obj instanceof u)) {
            ((SpanWatcher) this.f2702d).onSpanAdded(spannable, obj, i2, i5);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i2, int i5, int i7, int i8) {
        int i9;
        int i10;
        if (this.f2703e.get() <= 0 || !(obj instanceof u)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (i2 > i5) {
                    i2 = 0;
                }
                if (i7 > i8) {
                    i9 = i2;
                    i10 = 0;
                    ((SpanWatcher) this.f2702d).onSpanChanged(spannable, obj, i9, i5, i10, i8);
                }
            }
            i9 = i2;
            i10 = i7;
            ((SpanWatcher) this.f2702d).onSpanChanged(spannable, obj, i9, i5, i10, i8);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i2, int i5) {
        if (this.f2703e.get() <= 0 || !(obj instanceof u)) {
            ((SpanWatcher) this.f2702d).onSpanRemoved(spannable, obj, i2, i5);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i5, int i7) {
        ((TextWatcher) this.f2702d).onTextChanged(charSequence, i2, i5, i7);
    }
}
