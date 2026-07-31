package androidx.preference;

import B0.C0000a;
import K.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.datastore.preferences.protobuf.k0;
import com.crane.slab.beam.R;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: l, reason: collision with root package name */
    public final CharSequence[] f1632l;

    /* renamed from: m, reason: collision with root package name */
    public final String f1633m;

    public ListPreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f594d, i2, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f1632l = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (C0000a.f68g == null) {
                C0000a.f68g = new C0000a(6);
            }
            this.f1640k = C0000a.f68g;
            b();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.f596f, i2, 0);
        String string = obtainStyledAttributes2.getString(33);
        this.f1633m = string == null ? obtainStyledAttributes2.getString(7) : string;
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        C0000a c0000a = this.f1640k;
        if (c0000a != null) {
            return c0000a.k(this);
        }
        CharSequence a2 = super.a();
        String str = this.f1633m;
        if (str != null) {
            String format = String.format(str, "");
            if (!TextUtils.equals(format, a2)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return a2;
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k0.s(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
