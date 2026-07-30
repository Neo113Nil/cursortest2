package androidx.preference;

import E.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.aurifaber.valuta.rotatus.signum.modulus.R;
import o.g;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: e, reason: collision with root package name */
    public final Context f1544e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1545f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f1546g;

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence f1547h;

    /* renamed from: i, reason: collision with root package name */
    public final String f1548i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f1549j;

    /* renamed from: k, reason: collision with root package name */
    public a f1550k;

    public Preference(Context context, AttributeSet attributeSet, int i2) {
        this.f1545f = Integer.MAX_VALUE;
        this.f1544e = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I.a.f403f, i2, 0);
        obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        String string = obtainStyledAttributes.getString(26);
        this.f1548i = string == null ? obtainStyledAttributes.getString(6) : string;
        CharSequence text = obtainStyledAttributes.getText(34);
        this.f1546g = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.f1547h = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f1545f = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        if (obtainStyledAttributes.getString(22) == null) {
            obtainStyledAttributes.getString(13);
        }
        obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        boolean z2 = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        g.p(obtainStyledAttributes, 19, 10);
        obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, z2));
        obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, z2));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f1549j = c(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f1549j = c(obtainStyledAttributes, 11);
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
        a aVar = this.f1550k;
        return aVar != null ? aVar.k(this) : this.f1547h;
    }

    public void b() {
    }

    public Object c(TypedArray typedArray, int i2) {
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i2 = preference2.f1545f;
        int i3 = this.f1545f;
        if (i3 != i2) {
            return i3 - i2;
        }
        CharSequence charSequence = preference2.f1546g;
        CharSequence charSequence2 = this.f1546g;
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
        CharSequence charSequence = this.f1546g;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence a2 = a();
        if (!TextUtils.isEmpty(a2)) {
            sb.append(a2);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.o(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}
