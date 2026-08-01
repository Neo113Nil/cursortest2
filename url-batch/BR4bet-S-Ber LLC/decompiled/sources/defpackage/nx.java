package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class nx {
    public final w50 a = new w50(0);
    public final w50 b = new w50(0);

    public static nx a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static nx b(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return c(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    public static nx c(ArrayList arrayList) {
        nx nxVar = new nx();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                g9.v(animator, "Animator must be an ObjectAnimator: ");
                return null;
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            nxVar.g(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            ox oxVar = new ox();
            oxVar.d = 0;
            oxVar.e = 1;
            oxVar.a = startDelay;
            oxVar.b = duration;
            oxVar.c = interpolator;
            oxVar.d = objectAnimator.getRepeatCount();
            oxVar.e = objectAnimator.getRepeatMode();
            nxVar.a.put(propertyName, oxVar);
        }
        return nxVar;
    }

    public final ObjectAnimator d(String str, Object obj, Property property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, e(str));
        ofPropertyValuesHolder.setProperty(property);
        w50 w50Var = this.a;
        if (w50Var.get(str) == null) {
            throw new IllegalArgumentException();
        }
        ox oxVar = (ox) w50Var.get(str);
        ofPropertyValuesHolder.setStartDelay(oxVar.a);
        ofPropertyValuesHolder.setDuration(oxVar.b);
        ofPropertyValuesHolder.setInterpolator(oxVar.a());
        ofPropertyValuesHolder.setRepeatCount(oxVar.d);
        ofPropertyValuesHolder.setRepeatMode(oxVar.e);
        return ofPropertyValuesHolder;
    }

    public final PropertyValuesHolder[] e(String str) {
        if (!f(str)) {
            throw new IllegalArgumentException();
        }
        PropertyValuesHolder[] propertyValuesHolderArr = (PropertyValuesHolder[]) this.b.get(str);
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nx) {
            return this.a.equals(((nx) obj).a);
        }
        return false;
    }

    public final boolean f(String str) {
        return this.b.get(str) != null;
    }

    public final void g(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.b.put(str, propertyValuesHolderArr);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "\n" + nx.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
