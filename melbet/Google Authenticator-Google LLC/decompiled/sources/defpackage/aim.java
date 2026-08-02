package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aim extends kr {
    public List a;
    private final PreferenceGroup e;
    private List f;
    private final List g;
    private final Runnable i = new nc(this, 17, null);
    private final Handler h = new Handler(Looper.getMainLooper());

    public aim(PreferenceGroup preferenceGroup) {
        this.e = preferenceGroup;
        preferenceGroup.D = this;
        this.f = new ArrayList();
        this.a = new ArrayList();
        this.g = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            o(((PreferenceScreen) preferenceGroup).d);
        } else {
            o(true);
        }
        u();
    }

    private final List w(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int k = preferenceGroup.k();
        int i = 0;
        for (int i2 = 0; i2 < k; i2++) {
            Preference o = preferenceGroup.o(i2);
            if (o.x) {
                if (!y(preferenceGroup) || i < preferenceGroup.c) {
                    arrayList.add(o);
                } else {
                    arrayList2.add(o);
                }
                if (o instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) o;
                    if (!preferenceGroup2.W()) {
                        continue;
                    } else {
                        if (y(preferenceGroup) && y(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : w(preferenceGroup2)) {
                            if (!y(preferenceGroup) || i < preferenceGroup.c) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (y(preferenceGroup) && i > preferenceGroup.c) {
            ahr ahrVar = new ahr(preferenceGroup.j, arrayList2, preferenceGroup.bl());
            ahrVar.E = new awc(this, preferenceGroup);
            arrayList.add(ahrVar);
        }
        return arrayList;
    }

    private final void x(List list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.b);
        }
        int k = preferenceGroup.k();
        for (int i = 0; i < k; i++) {
            Preference o = preferenceGroup.o(i);
            list.add(o);
            ail ailVar = new ail(o);
            List list2 = this.g;
            if (!list2.contains(ailVar)) {
                list2.add(ailVar);
            }
            if (o instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) o;
                if (preferenceGroup2.W()) {
                    x(list, preferenceGroup2);
                }
            }
            o.D = this;
        }
    }

    private static final boolean y(PreferenceGroup preferenceGroup) {
        return preferenceGroup.c != Integer.MAX_VALUE;
    }

    @Override // defpackage.kr
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.kr
    public final int b(int i) {
        ail ailVar = new ail(t(i));
        List list = this.g;
        int indexOf = list.indexOf(ailVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = list.size();
        list.add(ailVar);
        return size;
    }

    @Override // defpackage.kr
    public final long c(int i) {
        if (this.c) {
            return t(i).bl();
        }
        return -1L;
    }

    @Override // defpackage.kr
    public final /* bridge */ /* synthetic */ lp d(ViewGroup viewGroup, int i) {
        ail ailVar = (ail) this.g.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, aiv.a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = e.f(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(ailVar.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            inflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = ailVar.b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new aiu(inflate);
    }

    @Override // defpackage.kr
    public final /* bridge */ /* synthetic */ void k(lp lpVar, int i) {
        aiu aiuVar = (aiu) lpVar;
        View view = aiuVar.a;
        Preference t = t(i);
        Drawable background = view.getBackground();
        Drawable drawable = aiuVar.t;
        if (background != drawable) {
            view.setBackground(drawable);
        }
        TextView textView = (TextView) aiuVar.C(R.id.title);
        if (textView != null && aiuVar.u != null && !textView.getTextColors().equals(aiuVar.u)) {
            textView.setTextColor(aiuVar.u);
        }
        t.a(aiuVar);
    }

    public final Preference t(int i) {
        if (i < 0 || i >= a()) {
            return null;
        }
        return (Preference) this.a.get(i);
    }

    public final void u() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).D = null;
        }
        ArrayList arrayList = new ArrayList(this.f.size());
        this.f = arrayList;
        PreferenceGroup preferenceGroup = this.e;
        x(arrayList, preferenceGroup);
        this.a = w(preferenceGroup);
        air airVar = preferenceGroup.k;
        e();
        for (Preference preference : this.f) {
        }
    }

    public final void v() {
        Handler handler = this.h;
        Runnable runnable = this.i;
        handler.removeCallbacks(runnable);
        handler.post(runnable);
    }
}
