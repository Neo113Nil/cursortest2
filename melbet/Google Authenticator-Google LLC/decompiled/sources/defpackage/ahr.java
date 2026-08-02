package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.apps.authenticator2.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahr extends Preference {
    private long a;

    public ahr(Context context, List list, long j) {
        super(context);
        this.z = R.layout.expand_button;
        Drawable f = e.f(this.j, R.drawable.ic_arrow_down_24dp);
        if (this.r != f) {
            this.r = f;
            this.q = 0;
            d();
        }
        this.q = R.drawable.ic_arrow_down_24dp;
        H(this.j.getString(R.string.expand_button_title));
        F(999);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        CharSequence charSequence = null;
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence charSequence2 = preference.p;
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence2)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.B)) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequence2)) {
                charSequence = charSequence == null ? charSequence2 : this.j.getString(R.string.summary_collapsed_preference_list, charSequence, charSequence2);
            }
        }
        n(charSequence);
        this.a = j + 1000000;
    }

    @Override // androidx.preference.Preference
    public final void a(aiu aiuVar) {
        super.a(aiuVar);
        aiuVar.v = false;
    }

    @Override // androidx.preference.Preference
    public final long bl() {
        return this.a;
    }
}
