package U;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class t extends SpannableStringBuilder {

    /* renamed from: d, reason: collision with root package name */
    public final Class f2704d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f2705e;

    public t(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f2705e = new ArrayList();
        AbstractC1053a.j(cls, "watcherClass cannot be null");
        this.f2704d = cls;
    }

    public final void a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f2705e;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i2)).f2703e.incrementAndGet();
            i2++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f2705e;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i2)).onTextChanged(this, 0, length(), length());
            i2++;
        }
    }

    public final s c(Object obj) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f2705e;
            if (i2 >= arrayList.size()) {
                return null;
            }
            s sVar = (s) arrayList.get(i2);
            if (sVar.f2702d == obj) {
                return sVar;
            }
            i2++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f2704d == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i2, int i5) {
        super.delete(i2, i5);
        return this;
    }

    public final void e() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f2705e;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i2)).f2703e.decrementAndGet();
            i2++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        s c7;
        if (d(obj) && (c7 = c(obj)) != null) {
            obj = c7;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        s c7;
        if (d(obj) && (c7 = c(obj)) != null) {
            obj = c7;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        s c7;
        if (d(obj) && (c7 = c(obj)) != null) {
            obj = c7;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i2, int i5, Class cls) {
        if (this.f2704d != cls) {
            return super.getSpans(i2, i5, cls);
        }
        s[] sVarArr = (s[]) super.getSpans(i2, i5, s.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, sVarArr.length);
        for (int i7 = 0; i7 < sVarArr.length; i7++) {
            objArr[i7] = sVarArr[i7].f2702d;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i2, int i5, Class cls) {
        if (cls == null || this.f2704d == cls) {
            cls = s.class;
        }
        return super.nextSpanTransition(i2, i5, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        s sVar;
        if (d(obj)) {
            sVar = c(obj);
            if (sVar != null) {
                obj = sVar;
            }
        } else {
            sVar = null;
        }
        super.removeSpan(obj);
        if (sVar != null) {
            this.f2705e.remove(sVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i2, int i5, CharSequence charSequence) {
        replace(i2, i5, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i2, int i5, int i7) {
        if (d(obj)) {
            s sVar = new s(obj);
            this.f2705e.add(sVar);
            obj = sVar;
        }
        super.setSpan(obj, i2, i5, i7);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i5) {
        return new t(this.f2704d, this, i2, i5);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i2, int i5) {
        super.delete(i2, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i2, int i5, CharSequence charSequence, int i7, int i8) {
        replace(i2, i5, charSequence, i7, i8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i2, CharSequence charSequence, int i5, int i7) {
        super.insert(i2, charSequence, i5, i7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i5, CharSequence charSequence) {
        a();
        super.replace(i2, i5, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c7) {
        super.append(c7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i2, CharSequence charSequence, int i5, int i7) {
        super.insert(i2, charSequence, i5, i7);
        return this;
    }

    public t(Class cls, t tVar, int i2, int i5) {
        super(tVar, i2, i5);
        this.f2705e = new ArrayList();
        AbstractC1053a.j(cls, "watcherClass cannot be null");
        this.f2704d = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c7) {
        super.append(c7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c7) {
        super.append(c7);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i5, CharSequence charSequence, int i7, int i8) {
        a();
        super.replace(i2, i5, charSequence, i7, i8);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i2, int i5) {
        super.append(charSequence, i2, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i2, int i5) {
        super.append(charSequence, i2, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i2, int i5) {
        super.append(charSequence, i2, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i2) {
        super.append(charSequence, obj, i2);
        return this;
    }
}
