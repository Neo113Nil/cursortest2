package androidx.dynamicanimation.animation;

import android.util.FloatProperty;

/* loaded from: classes4.dex */
public abstract class FloatPropertyCompat<T> {
    final String mPropertyName;

    public abstract void setValue(Object obj, float f);

    public FloatPropertyCompat(String str) {
        this.mPropertyName = str;
    }

    /* renamed from: androidx.dynamicanimation.animation.FloatPropertyCompat$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends FloatPropertyCompat<Object> {
        final /* synthetic */ FloatProperty val$property;

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(Object obj, float f) {
            this.val$property.setValue(obj, f);
        }
    }
}
