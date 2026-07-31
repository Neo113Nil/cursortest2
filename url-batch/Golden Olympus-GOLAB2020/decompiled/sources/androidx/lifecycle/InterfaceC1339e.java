package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1339e extends InterfaceC1353t {
    default void onCreate(InterfaceC1354u owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    default void onDestroy(InterfaceC1354u owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    default void onPause(InterfaceC1354u owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    void onResume(InterfaceC1354u interfaceC1354u);

    default void onStart(InterfaceC1354u owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    default void onStop(InterfaceC1354u owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }
}
