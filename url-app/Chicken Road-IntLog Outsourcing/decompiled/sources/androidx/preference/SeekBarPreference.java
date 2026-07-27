package androidx.preference;

import T.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.chickyneer.roadway.R;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: h, reason: collision with root package name */
    public final int f4613h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4614i;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f2760i, R.attr.seekBarPreferenceStyle, 0);
        int i2 = obtainStyledAttributes.getInt(3, 0);
        int i3 = obtainStyledAttributes.getInt(1, 100);
        i3 = i3 < i2 ? i2 : i3;
        if (i3 != this.f4613h) {
            this.f4613h = i3;
        }
        int i6 = obtainStyledAttributes.getInt(4, 0);
        if (i6 != this.f4614i) {
            this.f4614i = Math.min(this.f4613h - i2, Math.abs(i6));
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
