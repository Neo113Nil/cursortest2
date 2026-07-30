package androidx.preference;

import A.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import c2.e;
import com.icefishing.icefish.ice.fishing.s294s.R;
import d0.AbstractC0353b;
import d0.InterfaceC0352a;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: p, reason: collision with root package name */
    public final CharSequence[] f3930p;

    /* renamed from: q, reason: collision with root package name */
    public final String f3931q;

    public ListPreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0353b.f4619d, i2, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f3930p = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (e.f4186e == null) {
                e.f4186e = new e();
            }
            this.f3938o = e.f4186e;
            b();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0353b.f4621f, i2, 0);
        String string = obtainStyledAttributes2.getString(33);
        this.f3931q = string == null ? obtainStyledAttributes2.getString(7) : string;
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        InterfaceC0352a interfaceC0352a = this.f3938o;
        if (interfaceC0352a != null) {
            return interfaceC0352a.e(this);
        }
        CharSequence a7 = super.a();
        String str = this.f3931q;
        if (str != null) {
            String format = String.format(str, "");
            if (!TextUtils.equals(format, a7)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return a7;
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
