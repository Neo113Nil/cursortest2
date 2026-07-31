package com.yandex.div.core.view2;

import android.view.View;
import androidx.lifecycle.AbstractC1346l;
import androidx.lifecycle.InterfaceC1351q;
import androidx.lifecycle.InterfaceC1354u;
import androidx.lifecycle.d0;
import com.yandex.div.core.expression.RuntimeStoreProvider;
import com.yandex.div.core.view2.ReleaseManager;
import com.yandex.div.internal.Log;
import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.T;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public class ReleaseManager {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final HashMap<InterfaceC1354u, Set<Div2View>> divToRelease;

    @NotNull
    private final Object monitor;

    @NotNull
    private final InterfaceC1351q observer;

    @NotNull
    private final RuntimeStoreProvider runtimeStoreProvider;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC1346l.a.values().length];
            try {
                iArr[AbstractC1346l.a.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ReleaseManager(@NotNull RuntimeStoreProvider runtimeStoreProvider) {
        Intrinsics.checkNotNullParameter(runtimeStoreProvider, "runtimeStoreProvider");
        this.runtimeStoreProvider = runtimeStoreProvider;
        this.divToRelease = new HashMap<>();
        this.monitor = new Object();
        this.observer = new InterfaceC1351q() { // from class: w1.v
            @Override // androidx.lifecycle.InterfaceC1351q
            public final void onStateChanged(InterfaceC1354u interfaceC1354u, AbstractC1346l.a aVar) {
                ReleaseManager.observer$lambda$2(ReleaseManager.this, interfaceC1354u, aVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object addLifecycleListener(InterfaceC1354u interfaceC1354u, Div2View div2View) {
        Object obj;
        synchronized (this.monitor) {
            try {
                if (this.divToRelease.containsKey(interfaceC1354u)) {
                    Set<Div2View> set = this.divToRelease.get(interfaceC1354u);
                    obj = set != null ? Boolean.valueOf(set.add(div2View)) : null;
                } else {
                    this.divToRelease.put(interfaceC1354u, T.f(div2View));
                    interfaceC1354u.getLifecycle().addObserver(this.observer);
                    obj = Unit.f41027a;
                }
            } finally {
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observer$lambda$2(ReleaseManager this$0, InterfaceC1354u source, AbstractC1346l.a event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        synchronized (this$0.monitor) {
            try {
                if (WhenMappings.$EnumSwitchMapping$0[event.ordinal()] == 1) {
                    Set<Div2View> set = this$0.divToRelease.get(source);
                    if (set != null) {
                        Intrinsics.checkNotNullExpressionValue(set, "divToRelease[source]");
                        for (Div2View div2View : set) {
                            div2View.cleanup();
                            this$0.runtimeStoreProvider.cleanupRuntime$div_release(div2View);
                        }
                    }
                    this$0.divToRelease.remove(source);
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void observeDivLifecycle(@NotNull final Div2View divView) {
        Intrinsics.checkNotNullParameter(divView, "divView");
        InterfaceC1354u lifecycleOwner$div_release = divView.getContext$div_release().getLifecycleOwner$div_release();
        if (lifecycleOwner$div_release != null) {
            addLifecycleListener(lifecycleOwner$div_release, divView);
            return;
        }
        if (!divView.isAttachedToWindow()) {
            divView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.ReleaseManager$observeDivLifecycle$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view) {
                    divView.removeOnAttachStateChangeListener(this);
                    InterfaceC1354u a4 = d0.a(divView);
                    if (a4 != null) {
                        this.addLifecycleListener(a4, divView);
                    } else {
                        Log.w("ReleaseManager", "Attempt to bind a Div2View, which has no LifecycleOwner. Release event will not be caught! If you're using some long-lived resources, like a video player, call cleanup explicitly when you don't need Div2View anymore");
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view) {
                }
            });
            return;
        }
        InterfaceC1354u a4 = d0.a(divView);
        if (a4 != null) {
            addLifecycleListener(a4, divView);
        } else {
            Log.w("ReleaseManager", "Attempt to bind a Div2View, which has no LifecycleOwner. Release event will not be caught! If you're using some long-lived resources, like a video player, call cleanup explicitly when you don't need Div2View anymore");
        }
    }
}
