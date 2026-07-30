package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.icefishing.icefish.ice.fishing.s294s.R;
import d0.AbstractC0353b;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: p, reason: collision with root package name */
    public final int f3939p;

    /* renamed from: q, reason: collision with root package name */
    public final int f3940q;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0353b.f4624i, R.attr.seekBarPreferenceStyle, 0);
        int i2 = obtainStyledAttributes.getInt(3, 0);
        int i5 = obtainStyledAttributes.getInt(1, 100);
        i5 = i5 < i2 ? i2 : i5;
        if (i5 != this.f3939p) {
            this.f3939p = i5;
        }
        int i7 = obtainStyledAttributes.getInt(4, 0);
        if (i7 != this.f3940q) {
            this.f3940q = Math.min(this.f3939p - i2, Math.abs(i7));
        }
        obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i2) {
        return Integer.valueOf(typedArray.getInt(i2, 0));
    }
}
