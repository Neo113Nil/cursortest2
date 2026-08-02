package androidx.preference;

import R.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.fc.barca.football.R;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: h, reason: collision with root package name */
    public final int f2430h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2431i;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1290i, R.attr.seekBarPreferenceStyle, 0);
        int i3 = obtainStyledAttributes.getInt(3, 0);
        int i4 = obtainStyledAttributes.getInt(1, 100);
        i4 = i4 < i3 ? i3 : i4;
        if (i4 != this.f2430h) {
            this.f2430h = i4;
        }
        int i5 = obtainStyledAttributes.getInt(4, 0);
        if (i5 != this.f2431i) {
            this.f2431i = Math.min(this.f2430h - i3, Math.abs(i5));
        }
        obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i3) {
        return Integer.valueOf(typedArray.getInt(i3, 0));
    }
}
