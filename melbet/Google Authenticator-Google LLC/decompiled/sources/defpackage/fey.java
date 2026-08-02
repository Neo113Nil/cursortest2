package defpackage;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fey implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ColorStateList a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ fey(Object obj, ColorStateList colorStateList, Object obj2, Integer num, int i) {
        this.e = i;
        this.c = obj;
        this.a = colorStateList;
        this.d = obj2;
        this.b = num;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num;
        if (this.e != 0) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            dnz dnzVar = (dnz) this.c;
            dnzVar.e = ((1.0f - floatValue) * 0.0f) + (dnzVar.d * floatValue);
            if (this.a == null) {
                dnzVar.f = null;
            } else {
                dnzVar.f = ColorStateList.valueOf(dnz.a.evaluate(floatValue, (Integer) this.d, this.b).intValue());
            }
            dnzVar.invalidateSelf();
            return;
        }
        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        AppBarLayout appBarLayout = (AppBarLayout) this.c;
        int e = fhq.e(appBarLayout.h, this.a.getDefaultColor(), floatValue2);
        ColorStateList valueOf = ColorStateList.valueOf(e);
        fob fobVar = (fob) this.d;
        fobVar.M(valueOf);
        if (appBarLayout.i != null && (num = appBarLayout.j) != null && num.equals(this.b)) {
            appBarLayout.i.setTint(e);
        }
        List<ffc> list = appBarLayout.f;
        if (!list.isEmpty()) {
            for (ffc ffcVar : list) {
                if (fobVar.C() != null) {
                    ffcVar.a();
                }
            }
        }
        LinkedHashSet linkedHashSet = appBarLayout.g;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((kee) it.next()).m(floatValue2);
        }
    }
}
