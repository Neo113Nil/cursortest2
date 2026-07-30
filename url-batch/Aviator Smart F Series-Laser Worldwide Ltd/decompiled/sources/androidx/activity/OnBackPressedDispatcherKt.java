package androidx.activity;

import androidx.lifecycle.LifecycleOwner;
import f6.l;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcherKt {
    public static final OnBackPressedCallback addCallback(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, final boolean z7, final l onBackPressed) {
        s.checkNotNullParameter(onBackPressedDispatcher, "<this>");
        s.checkNotNullParameter(onBackPressed, "onBackPressed");
        OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback(z7) { // from class: androidx.activity.OnBackPressedDispatcherKt$addCallback$callback$1
            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                onBackPressed.invoke(this);
            }
        };
        if (lifecycleOwner != null) {
            onBackPressedDispatcher.addCallback(lifecycleOwner, onBackPressedCallback);
        } else {
            onBackPressedDispatcher.addCallback(onBackPressedCallback);
        }
        return onBackPressedCallback;
    }

    public static /* synthetic */ OnBackPressedCallback addCallback$default(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, boolean z7, l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            lifecycleOwner = null;
        }
        if ((i8 & 2) != 0) {
            z7 = true;
        }
        return addCallback(onBackPressedDispatcher, lifecycleOwner, z7, lVar);
    }
}
