package c4;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w extends SpannableStringBuilder {

    /* renamed from: d, reason: collision with root package name */
    public final Class f1792d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1793e;

    public w(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f1793e = new ArrayList();
        i7.a.A(cls, "watcherClass cannot be null");
        this.f1792d = cls;
    }

    public final void a() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f1793e;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((v) arrayList.get(i3)).f1791e.incrementAndGet();
            i3++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f1793e;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((v) arrayList.get(i3)).onTextChanged(this, 0, length(), length());
            i3++;
        }
    }

    public final v c(Object obj) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f1793e;
            if (i3 >= arrayList.size()) {
                return null;
            }
            v vVar = (v) arrayList.get(i3);
            if (vVar.f1790d == obj) {
                return vVar;
            }
            i3++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f1792d == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i3, int i10) {
        super.delete(i3, i10);
        return this;
    }

    public final void e() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f1793e;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((v) arrayList.get(i3)).f1791e.decrementAndGet();
            i3++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        v c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        v c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        v c10;
        if (d(obj) && (c10 = c(obj)) != null) {
            obj = c10;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i3, int i10, Class cls) {
        if (this.f1792d != cls) {
            return super.getSpans(i3, i10, cls);
        }
        v[] vVarArr = (v[]) super.getSpans(i3, i10, v.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, vVarArr.length);
        for (int i11 = 0; i11 < vVarArr.length; i11++) {
            objArr[i11] = vVarArr[i11].f1790d;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i3, CharSequence charSequence) {
        super.insert(i3, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i3, int i10, Class cls) {
        if (cls == null || this.f1792d == cls) {
            cls = v.class;
        }
        return super.nextSpanTransition(i3, i10, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        v vVar;
        if (d(obj)) {
            vVar = c(obj);
            if (vVar != null) {
                obj = vVar;
            }
        } else {
            vVar = null;
        }
        super.removeSpan(obj);
        if (vVar != null) {
            this.f1793e.remove(vVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i3, int i10, CharSequence charSequence, int i11, int i12) {
        a();
        super.replace(i3, i10, charSequence, i11, i12);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i3, int i10, int i11) {
        if (d(obj)) {
            v vVar = new v(obj);
            this.f1793e.add(vVar);
            obj = vVar;
        }
        super.setSpan(obj, i3, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i3, int i10) {
        return new w(this.f1792d, this, i3, i10);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i3, int i10) {
        super.delete(i3, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i3, CharSequence charSequence) {
        super.insert(i3, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i3, CharSequence charSequence, int i10, int i11) {
        super.insert(i3, charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i3, CharSequence charSequence, int i10, int i11) {
        super.insert(i3, charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i3, int i10) {
        super.append(charSequence, i3, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i3, int i10) {
        super.append(charSequence, i3, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i3, int i10) {
        super.append(charSequence, i3, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i3, int i10, CharSequence charSequence, int i11, int i12) {
        replace(i3, i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i3) {
        super.append(charSequence, obj, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i3, int i10, CharSequence charSequence) {
        a();
        super.replace(i3, i10, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i3, int i10, CharSequence charSequence) {
        replace(i3, i10, charSequence);
        return this;
    }

    public w(Class cls, w wVar, int i3, int i10) {
        super(wVar, i3, i10);
        this.f1793e = new ArrayList();
        i7.a.A(cls, "watcherClass cannot be null");
        this.f1792d = cls;
    }
}
