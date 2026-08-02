package androidx.preference;

import V3.b;
import a0.C0144j;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.rockchicken.pump.up.road.R;
import i1.AbstractC0456a;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence[] f5112h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5113i;

    public ListPreference(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0456a.f9304d, i4, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f5112h = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (C0144j.f4166c == null) {
                C0144j.f4166c = new C0144j(9, false);
            }
            this.f5120g = C0144j.f4166c;
            b();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0456a.f9306f, i4, 0);
        String string = obtainStyledAttributes2.getString(33);
        this.f5113i = string == null ? obtainStyledAttributes2.getString(7) : string;
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        C0144j c0144j = this.f5120g;
        if (c0144j != null) {
            return c0144j.s(this);
        }
        CharSequence a3 = super.a();
        String str = this.f5113i;
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
    public final Object c(TypedArray typedArray, int i4) {
        return typedArray.getString(i4);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.p(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
