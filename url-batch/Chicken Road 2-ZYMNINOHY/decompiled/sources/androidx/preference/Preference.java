package androidx.preference;

import V3.b;
import a0.C0144j;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.rockchicken.pump.up.road.R;
import i1.AbstractC0456a;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5114a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5115b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f5116c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f5117d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5118e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5119f;

    /* renamed from: g, reason: collision with root package name */
    public C0144j f5120g;

    public Preference(Context context, AttributeSet attributeSet, int i4) {
        this.f5115b = Integer.MAX_VALUE;
        this.f5114a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0456a.f9306f, i4, 0);
        obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        String string = obtainStyledAttributes.getString(26);
        this.f5118e = string == null ? obtainStyledAttributes.getString(6) : string;
        CharSequence text = obtainStyledAttributes.getText(34);
        this.f5116c = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.f5117d = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f5115b = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        if (obtainStyledAttributes.getString(22) == null) {
            obtainStyledAttributes.getString(13);
        }
        obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        boolean z = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        if (obtainStyledAttributes.getString(19) == null) {
            obtainStyledAttributes.getString(10);
        }
        obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, z));
        obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, z));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f5119f = c(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f5119f = c(obtainStyledAttributes, 11);
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
        C0144j c0144j = this.f5120g;
        return c0144j != null ? c0144j.s(this) : this.f5117d;
    }

    public void b() {
    }

    public Object c(TypedArray typedArray, int i4) {
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i4 = preference2.f5115b;
        CharSequence charSequence = preference2.f5116c;
        int i5 = this.f5115b;
        if (i5 != i4) {
            return i5 - i4;
        }
        CharSequence charSequence2 = this.f5116c;
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
        CharSequence charSequence = this.f5116c;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence a3 = a();
        if (!TextUtils.isEmpty(a3)) {
            sb.append(a3);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.p(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}
