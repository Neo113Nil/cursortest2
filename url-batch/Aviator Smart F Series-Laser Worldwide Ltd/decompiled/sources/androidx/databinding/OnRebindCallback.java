package androidx.databinding;

import androidx.databinding.ViewDataBinding;

/* loaded from: classes.dex */
public abstract class OnRebindCallback<T extends ViewDataBinding> {
    public void onBound(T t7) {
    }

    public void onCanceled(T t7) {
    }

    public boolean onPreBind(T t7) {
        return true;
    }
}
