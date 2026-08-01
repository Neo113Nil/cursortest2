package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class y extends SpannableStringBuilder {

    /* renamed from: f, reason: collision with root package name */
    public final Class f368f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f369g;

    public y(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f369g = new ArrayList();
        h.a.m(cls, "watcherClass cannot be null");
        this.f368f = cls;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f369g;
            if (i >= arrayList.size()) {
                return;
            }
            ((x) arrayList.get(i)).f367g.incrementAndGet();
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
            ArrayList arrayList = this.f369g;
            if (i >= arrayList.size()) {
                return;
            }
            ((x) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    public final x c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f369g;
            if (i >= arrayList.size()) {
                return null;
            }
            x xVar = (x) arrayList.get(i);
            if (xVar.f366f == obj) {
                return xVar;
            }
            i++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f368f == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i4) {
        super.delete(i, i4);
        return this;
    }

    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f369g;
            if (i >= arrayList.size()) {
                return;
            }
            ((x) arrayList.get(i)).f367g.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        x c4;
        if (d(obj) && (c4 = c(obj)) != null) {
            obj = c4;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        x c4;
        if (d(obj) && (c4 = c(obj)) != null) {
            obj = c4;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        x c4;
        if (d(obj) && (c4 = c(obj)) != null) {
            obj = c4;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i4, Class cls) {
        if (this.f368f != cls) {
            return super.getSpans(i, i4, cls);
        }
        x[] xVarArr = (x[]) super.getSpans(i, i4, x.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, xVarArr.length);
        for (int i5 = 0; i5 < xVarArr.length; i5++) {
            objArr[i5] = xVarArr[i5].f366f;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i4, Class cls) {
        if (cls == null || this.f368f == cls) {
            cls = x.class;
        }
        return super.nextSpanTransition(i, i4, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        x xVar;
        if (d(obj)) {
            xVar = c(obj);
            if (xVar != null) {
                obj = xVar;
            }
        } else {
            xVar = null;
        }
        super.removeSpan(obj);
        if (xVar != null) {
            this.f369g.remove(xVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i4, CharSequence charSequence) {
        replace(i, i4, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i4, int i5) {
        if (d(obj)) {
            x xVar = new x(obj);
            this.f369g.add(xVar);
            obj = xVar;
        }
        super.setSpan(obj, i, i4, i5);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i4) {
        return new y(this.f368f, this, i, i4);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i4) {
        super.delete(i, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i4, CharSequence charSequence, int i5, int i6) {
        replace(i, i4, charSequence, i5, i6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i4, int i5) {
        super.insert(i, charSequence, i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i4, CharSequence charSequence) {
        a();
        super.replace(i, i4, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c4) {
        super.append(c4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i4, int i5) {
        super.insert(i, charSequence, i4, i5);
        return this;
    }

    public y(Class cls, y yVar, int i, int i4) {
        super(yVar, i, i4);
        this.f369g = new ArrayList();
        h.a.m(cls, "watcherClass cannot be null");
        this.f368f = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c4) {
        super.append(c4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c4) {
        super.append(c4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i4, CharSequence charSequence, int i5, int i6) {
        a();
        super.replace(i, i4, charSequence, i5, i6);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i4) {
        super.append(charSequence, i, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i4) {
        super.append(charSequence, i, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i4) {
        super.append(charSequence, i, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
