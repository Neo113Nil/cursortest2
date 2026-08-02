package androidx.preference;

import B0.C0023a;
import M.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.neptunesoft.languesbacdz.R;
import s.AbstractC0291b;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: l, reason: collision with root package name */
    public final CharSequence[] f1798l;

    /* renamed from: m, reason: collision with root package name */
    public final String f1799m;

    public ListPreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f772d, i2, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f1798l = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (C0023a.f138g == null) {
                C0023a.f138g = new C0023a(12);
            }
            this.f1806k = C0023a.f138g;
            b();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.f774f, i2, 0);
        this.f1799m = AbstractC0291b.d(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        C0023a c0023a = this.f1806k;
        if (c0023a != null) {
            return c0023a.l(this);
        }
        CharSequence a2 = super.a();
        String str = this.f1799m;
        if (str == null) {
            return a2;
        }
        String format = String.format(str, "");
        if (TextUtils.equals(format, a2)) {
            return a2;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0291b.a(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
