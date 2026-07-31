package com.yandex.div.core.view2;

import B.w;
import B.x;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C1280a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AccessibilityDelegateWrapper extends C1280a {

    @NotNull
    private Function2<? super View, ? super w, Unit> actionsAccessibilityNodeInfo;

    @NotNull
    private Function2<? super View, ? super w, Unit> initializeAccessibilityNodeInfo;

    @Nullable
    private final C1280a originalDelegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata
    /* renamed from: com.yandex.div.core.view2.AccessibilityDelegateWrapper$1, reason: invalid class name */
    public static final class AnonymousClass1 extends s implements Function2<View, w, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((View) obj, (w) obj2);
            return Unit.f41027a;
        }

        public final void invoke(@Nullable View view, @Nullable w wVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata
    /* renamed from: com.yandex.div.core.view2.AccessibilityDelegateWrapper$2, reason: invalid class name */
    public static final class AnonymousClass2 extends s implements Function2<View, w, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((View) obj, (w) obj2);
            return Unit.f41027a;
        }

        public final void invoke(@Nullable View view, @Nullable w wVar) {
        }
    }

    public /* synthetic */ AccessibilityDelegateWrapper(C1280a c1280a, Function2 function2, Function2 function22, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1280a, (i4 & 2) != 0 ? AnonymousClass1.INSTANCE : function2, (i4 & 4) != 0 ? AnonymousClass2.INSTANCE : function22);
    }

    @Override // androidx.core.view.C1280a
    public boolean dispatchPopulateAccessibilityEvent(@NotNull View host, @NotNull AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(event, "event");
        C1280a c1280a = this.originalDelegate;
        return c1280a != null ? c1280a.dispatchPopulateAccessibilityEvent(host, event) : super.dispatchPopulateAccessibilityEvent(host, event);
    }

    @Override // androidx.core.view.C1280a
    @Nullable
    public x getAccessibilityNodeProvider(@NotNull View host) {
        x accessibilityNodeProvider;
        Intrinsics.checkNotNullParameter(host, "host");
        C1280a c1280a = this.originalDelegate;
        return (c1280a == null || (accessibilityNodeProvider = c1280a.getAccessibilityNodeProvider(host)) == null) ? super.getAccessibilityNodeProvider(host) : accessibilityNodeProvider;
    }

    @Override // androidx.core.view.C1280a
    public void onInitializeAccessibilityEvent(@NotNull View host, @NotNull AccessibilityEvent event) {
        Unit unit;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(event, "event");
        C1280a c1280a = this.originalDelegate;
        if (c1280a != null) {
            c1280a.onInitializeAccessibilityEvent(host, event);
            unit = Unit.f41027a;
        } else {
            unit = null;
        }
        if (unit == null) {
            super.onInitializeAccessibilityEvent(host, event);
        }
    }

    @Override // androidx.core.view.C1280a
    public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull w info) {
        Unit unit;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(info, "info");
        C1280a c1280a = this.originalDelegate;
        if (c1280a != null) {
            c1280a.onInitializeAccessibilityNodeInfo(host, info);
            unit = Unit.f41027a;
        } else {
            unit = null;
        }
        if (unit == null) {
            super.onInitializeAccessibilityNodeInfo(host, info);
        }
        this.initializeAccessibilityNodeInfo.invoke(host, info);
        this.actionsAccessibilityNodeInfo.invoke(host, info);
    }

    @Override // androidx.core.view.C1280a
    public void onPopulateAccessibilityEvent(@NotNull View host, @NotNull AccessibilityEvent event) {
        Unit unit;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(event, "event");
        C1280a c1280a = this.originalDelegate;
        if (c1280a != null) {
            c1280a.onPopulateAccessibilityEvent(host, event);
            unit = Unit.f41027a;
        } else {
            unit = null;
        }
        if (unit == null) {
            super.onPopulateAccessibilityEvent(host, event);
        }
    }

    @Override // androidx.core.view.C1280a
    public boolean onRequestSendAccessibilityEvent(@NotNull ViewGroup host, @NotNull View child, @NotNull AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(event, "event");
        C1280a c1280a = this.originalDelegate;
        return c1280a != null ? c1280a.onRequestSendAccessibilityEvent(host, child, event) : super.onRequestSendAccessibilityEvent(host, child, event);
    }

    @Override // androidx.core.view.C1280a
    public boolean performAccessibilityAction(@NotNull View host, int i4, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(host, "host");
        C1280a c1280a = this.originalDelegate;
        return c1280a != null ? c1280a.performAccessibilityAction(host, i4, bundle) : super.performAccessibilityAction(host, i4, bundle);
    }

    @Override // androidx.core.view.C1280a
    public void sendAccessibilityEvent(@NotNull View host, int i4) {
        Unit unit;
        Intrinsics.checkNotNullParameter(host, "host");
        C1280a c1280a = this.originalDelegate;
        if (c1280a != null) {
            c1280a.sendAccessibilityEvent(host, i4);
            unit = Unit.f41027a;
        } else {
            unit = null;
        }
        if (unit == null) {
            super.sendAccessibilityEvent(host, i4);
        }
    }

    @Override // androidx.core.view.C1280a
    public void sendAccessibilityEventUnchecked(@NotNull View host, @NotNull AccessibilityEvent event) {
        Unit unit;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(event, "event");
        C1280a c1280a = this.originalDelegate;
        if (c1280a != null) {
            c1280a.sendAccessibilityEventUnchecked(host, event);
            unit = Unit.f41027a;
        } else {
            unit = null;
        }
        if (unit == null) {
            super.sendAccessibilityEventUnchecked(host, event);
        }
    }

    public final void setActionsAccessibilityNodeInfo(@NotNull Function2<? super View, ? super w, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.actionsAccessibilityNodeInfo = function2;
    }

    public final void setInitializeAccessibilityNodeInfo(@NotNull Function2<? super View, ? super w, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.initializeAccessibilityNodeInfo = function2;
    }

    public AccessibilityDelegateWrapper(@Nullable C1280a c1280a, @NotNull Function2<? super View, ? super w, Unit> initializeAccessibilityNodeInfo, @NotNull Function2<? super View, ? super w, Unit> actionsAccessibilityNodeInfo) {
        Intrinsics.checkNotNullParameter(initializeAccessibilityNodeInfo, "initializeAccessibilityNodeInfo");
        Intrinsics.checkNotNullParameter(actionsAccessibilityNodeInfo, "actionsAccessibilityNodeInfo");
        this.originalDelegate = c1280a;
        this.initializeAccessibilityNodeInfo = initializeAccessibilityNodeInfo;
        this.actionsAccessibilityNodeInfo = actionsAccessibilityNodeInfo;
    }
}
