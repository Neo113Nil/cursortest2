package coil.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import coil.transition.TransitionTarget;

/* compiled from: GenericViewTarget.kt */
/* loaded from: classes6.dex */
public abstract class GenericViewTarget implements ViewTarget, TransitionTarget, DefaultLifecycleObserver {
    private boolean isStarted;

    public abstract Drawable getDrawable();

    public abstract void setDrawable(Drawable drawable);

    @Override // coil.target.Target
    public void onStart(Drawable drawable) {
        updateDrawable(drawable);
    }

    @Override // coil.target.Target
    public void onError(Drawable drawable) {
        updateDrawable(drawable);
    }

    @Override // coil.target.Target
    public void onSuccess(Drawable drawable) {
        updateDrawable(drawable);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner lifecycleOwner) {
        this.isStarted = true;
        updateAnimation();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner lifecycleOwner) {
        this.isStarted = false;
        updateAnimation();
    }

    protected final void updateDrawable(Drawable drawable) {
        Object drawable2 = getDrawable();
        Animatable animatable = drawable2 instanceof Animatable ? (Animatable) drawable2 : null;
        if (animatable != null) {
            animatable.stop();
        }
        setDrawable(drawable);
        updateAnimation();
    }

    protected final void updateAnimation() {
        Object drawable = getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.isStarted) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }
}
