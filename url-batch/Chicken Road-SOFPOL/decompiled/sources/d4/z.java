package d4;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class z extends SpannableStringBuilder {

    /* renamed from: d, reason: collision with root package name */
    public final Class f2307d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2308e;

    public z(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f2308e = new ArrayList();
        h0.a.o(cls, "watcherClass cannot be null");
        this.f2307d = cls;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2308e;
            if (i >= arrayList.size()) {
                return;
            }
            ((y) arrayList.get(i)).f2306e.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2308e;
            if (i >= arrayList.size()) {
                return;
            }
            ((y) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    public final y c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2308e;
            if (i >= arrayList.size()) {
                return null;
            }
            y yVar = (y) arrayList.get(i);
            if (yVar.f2305d == obj) {
                return yVar;
            }
            i++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f2307d == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i8) {
        super.delete(i, i8);
        return this;
    }

    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2308e;
            if (i >= arrayList.size()) {
                return;
            }
            ((y) arrayList.get(i)).f2306e.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        y c8;
        if (d(obj) && (c8 = c(obj)) != null) {
            obj = c8;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        y c8;
        if (d(obj) && (c8 = c(obj)) != null) {
            obj = c8;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        y c8;
        if (d(obj) && (c8 = c(obj)) != null) {
            obj = c8;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i8, Class cls) {
        if (this.f2307d != cls) {
            return super.getSpans(i, i8, cls);
        }
        y[] yVarArr = (y[]) super.getSpans(i, i8, y.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, yVarArr.length);
        for (int i9 = 0; i9 < yVarArr.length; i9++) {
            objArr[i9] = yVarArr[i9].f2305d;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i8, Class cls) {
        if (cls == null || this.f2307d == cls) {
            cls = y.class;
        }
        return super.nextSpanTransition(i, i8, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        y yVar;
        if (d(obj)) {
            yVar = c(obj);
            if (yVar != null) {
                obj = yVar;
            }
        } else {
            yVar = null;
        }
        super.removeSpan(obj);
        if (yVar != null) {
            this.f2308e.remove(yVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i8, CharSequence charSequence) {
        replace(i, i8, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i8, int i9) {
        if (d(obj)) {
            y yVar = new y(obj);
            this.f2308e.add(yVar);
            obj = yVar;
        }
        super.setSpan(obj, i, i8, i9);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i8) {
        return new z(this.f2307d, this, i, i8);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i8) {
        super.delete(i, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i8, CharSequence charSequence, int i9, int i10) {
        replace(i, i8, charSequence, i9, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i8, int i9) {
        super.insert(i, charSequence, i8, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i8, CharSequence charSequence) {
        a();
        super.replace(i, i8, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c8) {
        super.append(c8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i8, int i9) {
        super.insert(i, charSequence, i8, i9);
        return this;
    }

    public z(Class cls, z zVar, int i, int i8) {
        super(zVar, i, i8);
        this.f2308e = new ArrayList();
        h0.a.o(cls, "watcherClass cannot be null");
        this.f2307d = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c8) {
        super.append(c8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c8) {
        super.append(c8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i8, CharSequence charSequence, int i9, int i10) {
        a();
        super.replace(i, i8, charSequence, i9, i10);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i8) {
        super.append(charSequence, i, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i8) {
        super.append(charSequence, i, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i8) {
        super.append(charSequence, i, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
