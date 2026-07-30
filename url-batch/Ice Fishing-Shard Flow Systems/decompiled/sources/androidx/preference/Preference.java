package androidx.preference;

import A.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.icefishing.icefish.ice.fishing.s294s.R;
import d0.AbstractC0353b;
import d0.InterfaceC0352a;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: d, reason: collision with root package name */
    public final Context f3932d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3933e;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f3934i;

    /* renamed from: l, reason: collision with root package name */
    public final CharSequence f3935l;

    /* renamed from: m, reason: collision with root package name */
    public final String f3936m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f3937n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC0352a f3938o;

    public Preference(Context context, AttributeSet attributeSet, int i2) {
        this.f3933e = Integer.MAX_VALUE;
        this.f3932d = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0353b.f4621f, i2, 0);
        obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        String string = obtainStyledAttributes.getString(26);
        this.f3936m = string == null ? obtainStyledAttributes.getString(6) : string;
        CharSequence text = obtainStyledAttributes.getText(34);
        this.f3934i = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.f3935l = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f3933e = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        if (obtainStyledAttributes.getString(22) == null) {
            obtainStyledAttributes.getString(13);
        }
        obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        boolean z7 = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        if (obtainStyledAttributes.getString(19) == null) {
            obtainStyledAttributes.getString(10);
        }
        obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, z7));
        obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, z7));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f3937n = c(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f3937n = c(obtainStyledAttributes, 11);
        }
        obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        if (obtainStyledAttributes.hasValue(32)) {
            obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }

    public CharSequence a() {
        InterfaceC0352a interfaceC0352a = this.f3938o;
        return interfaceC0352a != null ? interfaceC0352a.e(this) : this.f3935l;
    }

    public void b() {
    }

    public Object c(TypedArray typedArray, int i2) {
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i2 = preference2.f3933e;
        CharSequence charSequence = preference2.f3934i;
        int i5 = this.f3933e;
        if (i5 != i2) {
            return i5 - i2;
        }
        CharSequence charSequence2 = this.f3934i;
        if (charSequence2 == charSequence) {
            return 0;
        }
        if (charSequence2 == null) {
            return 1;
        }
        if (charSequence == null) {
            return -1;
        }
        return charSequence2.toString().compareToIgnoreCase(charSequence.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f3934i;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence a7 = a();
        if (!TextUtils.isEmpty(a7)) {
            sb.append(a7);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}
