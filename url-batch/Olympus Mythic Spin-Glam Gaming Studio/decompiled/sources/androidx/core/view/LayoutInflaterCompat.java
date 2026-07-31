package androidx.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* loaded from: classes13.dex */
public final class LayoutInflaterCompat {

    static class Factory2Wrapper implements LayoutInflater.Factory2 {
        final LayoutInflaterFactory mDelegateFactory;

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.mDelegateFactory.onCreateView(null, str, context, attributeSet);
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.mDelegateFactory.onCreateView(view, str, context, attributeSet);
        }

        public String toString() {
            return getClass().getName() + "{" + this.mDelegateFactory + "}";
        }
    }

    public static void setFactory2(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }
}
