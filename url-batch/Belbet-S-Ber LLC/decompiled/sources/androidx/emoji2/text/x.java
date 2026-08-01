package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class x implements TextWatcher, SpanWatcher {

    /* renamed from: f, reason: collision with root package name */
    public final Object f483f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicInteger f484g = new AtomicInteger(0);

    public x(Object obj) {
        this.f483f = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f483f).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i5) {
        ((TextWatcher) this.f483f).beforeTextChanged(charSequence, i, i4, i5);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i4) {
        if (this.f484g.get() <= 0 || !(obj instanceof a0)) {
            ((SpanWatcher) this.f483f).onSpanAdded(spannable, obj, i, i4);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i4, int i5, int i6) {
        int i7;
        int i8;
        if (this.f484g.get() <= 0 || !(obj instanceof a0)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (i > i4) {
                    i = 0;
                }
                if (i5 > i6) {
                    i7 = i;
                    i8 = 0;
                    ((SpanWatcher) this.f483f).onSpanChanged(spannable, obj, i7, i4, i8, i6);
                }
            }
            i7 = i;
            i8 = i5;
            ((SpanWatcher) this.f483f).onSpanChanged(spannable, obj, i7, i4, i8, i6);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i4) {
        if (this.f484g.get() <= 0 || !(obj instanceof a0)) {
            ((SpanWatcher) this.f483f).onSpanRemoved(spannable, obj, i, i4);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i5) {
        ((TextWatcher) this.f483f).onTextChanged(charSequence, i, i4, i5);
    }
}
