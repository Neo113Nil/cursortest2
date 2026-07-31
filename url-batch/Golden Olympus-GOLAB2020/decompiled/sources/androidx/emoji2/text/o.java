package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class o extends SpannableStringBuilder {

    /* renamed from: b, reason: collision with root package name */
    private final Class f12210b;

    /* renamed from: c, reason: collision with root package name */
    private final List f12211c;

    private static class a implements TextWatcher, SpanWatcher {

        /* renamed from: a, reason: collision with root package name */
        final Object f12212a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicInteger f12213b = new AtomicInteger(0);

        a(Object obj) {
            this.f12212a = obj;
        }

        private boolean b(Object obj) {
            return obj instanceof j;
        }

        final void a() {
            this.f12213b.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f12212a).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            ((TextWatcher) this.f12212a).beforeTextChanged(charSequence, i4, i5, i6);
        }

        final void c() {
            this.f12213b.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i4, int i5) {
            if (this.f12213b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f12212a).onSpanAdded(spannable, obj, i4, i5);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i4, int i5, int i6, int i7) {
            int i8;
            int i9;
            if (this.f12213b.get() <= 0 || !b(obj)) {
                if (Build.VERSION.SDK_INT < 28) {
                    if (i4 > i5) {
                        i4 = 0;
                    }
                    if (i6 > i7) {
                        i8 = i4;
                        i9 = 0;
                        ((SpanWatcher) this.f12212a).onSpanChanged(spannable, obj, i8, i5, i9, i7);
                    }
                }
                i8 = i4;
                i9 = i6;
                ((SpanWatcher) this.f12212a).onSpanChanged(spannable, obj, i8, i5, i9, i7);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i4, int i5) {
            if (this.f12213b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f12212a).onSpanRemoved(spannable, obj, i4, i5);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            ((TextWatcher) this.f12212a).onTextChanged(charSequence, i4, i5, i6);
        }
    }

    o(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f12211c = new ArrayList();
        A.h.g(cls, "watcherClass cannot be null");
        this.f12210b = cls;
    }

    private void b() {
        for (int i4 = 0; i4 < this.f12211c.size(); i4++) {
            ((a) this.f12211c.get(i4)).a();
        }
    }

    public static o c(Class cls, CharSequence charSequence) {
        return new o(cls, charSequence);
    }

    private void e() {
        for (int i4 = 0; i4 < this.f12211c.size(); i4++) {
            ((a) this.f12211c.get(i4)).onTextChanged(this, 0, length(), length());
        }
    }

    private a f(Object obj) {
        for (int i4 = 0; i4 < this.f12211c.size(); i4++) {
            a aVar = (a) this.f12211c.get(i4);
            if (aVar.f12212a == obj) {
                return aVar;
            }
        }
        return null;
    }

    private boolean g(Class cls) {
        return this.f12210b == cls;
    }

    private boolean h(Object obj) {
        return obj != null && g(obj.getClass());
    }

    private void i() {
        for (int i4 = 0; i4 < this.f12211c.size(); i4++) {
            ((a) this.f12211c.get(i4)).c();
        }
    }

    public void a() {
        b();
    }

    public void d() {
        i();
        e();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        a f4;
        if (h(obj) && (f4 = f(obj)) != null) {
            obj = f4;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        a f4;
        if (h(obj) && (f4 = f(obj)) != null) {
            obj = f4;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        a f4;
        if (h(obj) && (f4 = f(obj)) != null) {
            obj = f4;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public Object[] getSpans(int i4, int i5, Class cls) {
        if (!g(cls)) {
            return super.getSpans(i4, i5, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i4, i5, a.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, aVarArr.length);
        for (int i6 = 0; i6 < aVarArr.length; i6++) {
            objArr[i6] = aVarArr[i6].f12212a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i4, int i5, Class cls) {
        if (cls == null || g(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i4, i5, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        a aVar;
        if (h(obj)) {
            aVar = f(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f12211c.remove(aVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i4, int i5, int i6) {
        if (h(obj)) {
            a aVar = new a(obj);
            this.f12211c.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i4, i5, i6);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int i4, int i5) {
        return new o(this.f12210b, this, i4, i5);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder delete(int i4, int i5) {
        super.delete(i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i4, CharSequence charSequence) {
        super.insert(i4, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i4, int i5, CharSequence charSequence) {
        b();
        super.replace(i4, i5, charSequence);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i4, CharSequence charSequence, int i5, int i6) {
        super.insert(i4, charSequence, i5, i6);
        return this;
    }

    o(Class cls, CharSequence charSequence, int i4, int i5) {
        super(charSequence, i4, i5);
        this.f12211c = new ArrayList();
        A.h.g(cls, "watcherClass cannot be null");
        this.f12210b = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i4, int i5, CharSequence charSequence, int i6, int i7) {
        b();
        super.replace(i4, i5, charSequence, i6, i7);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c4) {
        super.append(c4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence, int i4, int i5) {
        super.append(charSequence, i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i4) {
        super.append(charSequence, obj, i4);
        return this;
    }
}
