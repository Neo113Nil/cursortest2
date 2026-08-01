package e2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import j1.w;
import java.util.HashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class m extends j1.o {
    @Override // j1.o
    public final void d(w wVar) {
        View view = wVar.f1968b;
        if (view instanceof TextView) {
            wVar.f1967a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // j1.o
    public final void g(w wVar) {
        View view = wVar.f1968b;
        if (view instanceof TextView) {
            wVar.f1967a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // j1.o
    public final Animator k(ViewGroup viewGroup, w wVar, w wVar2) {
        if (wVar == null || wVar2 == null || !(wVar.f1968b instanceof TextView)) {
            return null;
        }
        View view = wVar2.f1968b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap hashMap = wVar.f1967a;
        HashMap hashMap2 = wVar2.f1967a;
        float floatValue = hashMap.get("android:textscale:scale") != null ? ((Float) hashMap.get("android:textscale:scale")).floatValue() : 1.0f;
        float floatValue2 = hashMap2.get("android:textscale:scale") != null ? ((Float) hashMap2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new l(0, textView));
        return ofFloat;
    }
}
