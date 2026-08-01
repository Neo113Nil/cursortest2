package c4;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v implements TextWatcher, SpanWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final Object f1790d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f1791e = new AtomicInteger(0);

    public v(Object obj) {
        this.f1790d = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f1790d).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        ((TextWatcher) this.f1790d).beforeTextChanged(charSequence, i3, i10, i11);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i3, int i10) {
        if (this.f1791e.get() <= 0 || !(obj instanceof y)) {
            ((SpanWatcher) this.f1790d).onSpanAdded(spannable, obj, i3, i10);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i3, int i10, int i11, int i12) {
        int i13;
        int i14;
        if (this.f1791e.get() <= 0 || !(obj instanceof y)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (i3 > i10) {
                    i3 = 0;
                }
                if (i11 > i12) {
                    i13 = i3;
                    i14 = 0;
                    ((SpanWatcher) this.f1790d).onSpanChanged(spannable, obj, i13, i10, i14, i12);
                }
            }
            i13 = i3;
            i14 = i11;
            ((SpanWatcher) this.f1790d).onSpanChanged(spannable, obj, i13, i10, i14, i12);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i3, int i10) {
        if (this.f1791e.get() <= 0 || !(obj instanceof y)) {
            ((SpanWatcher) this.f1790d).onSpanRemoved(spannable, obj, i3, i10);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        ((TextWatcher) this.f1790d).onTextChanged(charSequence, i3, i10, i11);
    }
}
