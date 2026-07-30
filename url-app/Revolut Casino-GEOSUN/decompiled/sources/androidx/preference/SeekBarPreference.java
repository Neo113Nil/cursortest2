package androidx.preference;

import I.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.aurifaber.valuta.rotatus.signum.modulus.R;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: l, reason: collision with root package name */
    public final int f1551l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1552m;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f406i, R.attr.seekBarPreferenceStyle, 0);
        int i2 = obtainStyledAttributes.getInt(3, 0);
        int i3 = obtainStyledAttributes.getInt(1, 100);
        i3 = i3 < i2 ? i2 : i3;
        if (i3 != this.f1551l) {
            this.f1551l = i3;
        }
        int i4 = obtainStyledAttributes.getInt(4, 0);
        if (i4 != this.f1552m) {
            this.f1552m = Math.min(this.f1551l - i2, Math.abs(i4));
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
