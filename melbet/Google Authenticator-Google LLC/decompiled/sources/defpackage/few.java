package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class few {
    private final qy a = new qy(0);
    private final qy b = new qy(0);

    public static few a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId);
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
                Log.w("MotionSpec", "Can't load animation resource ID #0x".concat(String.valueOf(Integer.toHexString(resourceId))), e);
            }
        }
        return null;
    }

    private static few c(List list) {
        few fewVar = new few();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: ".concat(String.valueOf(String.valueOf(animator))));
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            fewVar.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            fex fexVar = new fex(objectAnimator.getStartDelay(), objectAnimator.getDuration(), objectAnimator.getInterpolator());
            fexVar.a = objectAnimator.getRepeatCount();
            fexVar.b = objectAnimator.getRepeatMode();
            fewVar.a.put(propertyName, fexVar);
        }
        return fewVar;
    }

    public final fex b(String str) {
        qy qyVar = this.a;
        if (qyVar.get(str) != null) {
            return (fex) qyVar.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof few) {
            return this.a.equals(((few) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "\n" + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
