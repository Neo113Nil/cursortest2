package androidx.preference;

import K0.j;
import R.a;
import a.AbstractC0129a;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.fc.barca.football.R;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence[] f2422h;

    /* renamed from: i, reason: collision with root package name */
    public final String f2423i;

    public ListPreference(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1286d, i3, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f2422h = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (j.f854d == null) {
                j.f854d = new j(19);
            }
            this.f2429g = j.f854d;
            b();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.f, i3, 0);
        String string = obtainStyledAttributes2.getString(33);
        this.f2423i = string == null ? obtainStyledAttributes2.getString(7) : string;
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        j jVar = this.f2429g;
        if (jVar != null) {
            return jVar.g(this);
        }
        CharSequence a3 = super.a();
        String str = this.f2423i;
        if (str != null) {
            String format = String.format(str, "");
            if (!TextUtils.equals(format, a3)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return a3;
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i3) {
        return typedArray.getString(i3);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0129a.n(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
