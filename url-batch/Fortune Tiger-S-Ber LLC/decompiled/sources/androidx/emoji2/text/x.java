package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class x implements TextWatcher, SpanWatcher {

    /* renamed from: f, reason: collision with root package name */
    public final Object f370f;
    public final AtomicInteger g = new AtomicInteger(0);

    public x(Object obj) {
        this.f370f = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f370f).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        ((TextWatcher) this.f370f).beforeTextChanged(charSequence, i4, i5, i6);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i4, int i5) {
        if (this.g.get() <= 0 || !(obj instanceof a0)) {
            ((SpanWatcher) this.f370f).onSpanAdded(spannable, obj, i4, i5);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        if (this.g.get() <= 0 || !(obj instanceof a0)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (i4 > i5) {
                    i4 = 0;
                }
                if (i6 > i7) {
                    i8 = i4;
                    i9 = 0;
                    ((SpanWatcher) this.f370f).onSpanChanged(spannable, obj, i8, i5, i9, i7);
                }
            }
            i8 = i4;
            i9 = i6;
            ((SpanWatcher) this.f370f).onSpanChanged(spannable, obj, i8, i5, i9, i7);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i4, int i5) {
        if (this.g.get() <= 0 || !(obj instanceof a0)) {
            ((SpanWatcher) this.f370f).onSpanRemoved(spannable, obj, i4, i5);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        ((TextWatcher) this.f370f).onTextChanged(charSequence, i4, i5, i6);
    }
}
