package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.RequiresApi;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnBackPressedDispatcher.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u00045678B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0015\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\u001c\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0007¢\u0006\u0004\b%\u0010\u000fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001a0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103¨\u00069"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "", "Ljava/lang/Runnable;", "fallbackOnBackPressed", "Landroidx/core/util/Consumer;", "", "onHasEnabledCallbacksChanged", "<init>", "(Ljava/lang/Runnable;Landroidx/core/util/Consumer;)V", "(Ljava/lang/Runnable;)V", "shouldBeRegistered", "", "updateBackInvokedCallbackState", "(Z)V", "updateEnabledCallbacks", "()V", "Landroidx/activity/BackEventCompat;", "backEvent", "onBackStarted", "(Landroidx/activity/BackEventCompat;)V", "onBackProgressed", "onBackCancelled", "Landroid/window/OnBackInvokedDispatcher;", "invoker", "setOnBackInvokedDispatcher", "(Landroid/window/OnBackInvokedDispatcher;)V", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "addCallback", "(Landroidx/activity/OnBackPressedCallback;)V", "Landroidx/activity/Cancellable;", "addCancellableCallback$activity_release", "(Landroidx/activity/OnBackPressedCallback;)Landroidx/activity/Cancellable;", "addCancellableCallback", "Landroidx/lifecycle/LifecycleOwner;", "owner", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/OnBackPressedCallback;)V", "onBackPressed", "Ljava/lang/Runnable;", "Landroidx/core/util/Consumer;", "Lkotlin/collections/ArrayDeque;", "onBackPressedCallbacks", "Lkotlin/collections/ArrayDeque;", "inProgressCallback", "Landroidx/activity/OnBackPressedCallback;", "Landroid/window/OnBackInvokedCallback;", "onBackInvokedCallback", "Landroid/window/OnBackInvokedCallback;", "invokedDispatcher", "Landroid/window/OnBackInvokedDispatcher;", "backInvokedCallbackRegistered", "Z", "hasEnabledCallbacks", "Api33Impl", "Api34Impl", "LifecycleOnBackPressedCancellable", "OnBackPressedCancellable", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    private boolean backInvokedCallbackRegistered;
    private final Runnable fallbackOnBackPressed;
    private boolean hasEnabledCallbacks;
    private OnBackPressedCallback inProgressCallback;
    private OnBackInvokedDispatcher invokedDispatcher;
    private OnBackInvokedCallback onBackInvokedCallback;
    private final ArrayDeque onBackPressedCallbacks;
    private final Consumer onHasEnabledCallbacksChanged;

    public OnBackPressedDispatcher(Runnable runnable, Consumer consumer) {
        OnBackInvokedCallback createOnBackInvokedCallback;
        this.fallbackOnBackPressed = runnable;
        this.onHasEnabledCallbacksChanged = consumer;
        this.onBackPressedCallbacks = new ArrayDeque();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                createOnBackInvokedCallback = Api34Impl.INSTANCE.createOnBackAnimationCallback(new Function1() { // from class: androidx.activity.OnBackPressedDispatcher.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((BackEventCompat) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BackEventCompat backEvent) {
                        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                        OnBackPressedDispatcher.this.onBackStarted(backEvent);
                    }
                }, new Function1() { // from class: androidx.activity.OnBackPressedDispatcher.2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((BackEventCompat) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BackEventCompat backEvent) {
                        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                        OnBackPressedDispatcher.this.onBackProgressed(backEvent);
                    }
                }, new Function0() { // from class: androidx.activity.OnBackPressedDispatcher.3
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        m7invoke();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m7invoke() {
                        OnBackPressedDispatcher.this.onBackPressed();
                    }
                }, new Function0() { // from class: androidx.activity.OnBackPressedDispatcher.4
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        m8invoke();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m8invoke() {
                        OnBackPressedDispatcher.this.onBackCancelled();
                    }
                });
            } else {
                createOnBackInvokedCallback = Api33Impl.INSTANCE.createOnBackInvokedCallback(new Function0() { // from class: androidx.activity.OnBackPressedDispatcher.5
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        m9invoke();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m9invoke() {
                        OnBackPressedDispatcher.this.onBackPressed();
                    }
                });
            }
            this.onBackInvokedCallback = createOnBackInvokedCallback;
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this(runnable, null);
    }

    public final void setOnBackInvokedDispatcher(OnBackInvokedDispatcher invoker) {
        Intrinsics.checkNotNullParameter(invoker, "invoker");
        this.invokedDispatcher = invoker;
        updateBackInvokedCallbackState(this.hasEnabledCallbacks);
    }

    private final void updateBackInvokedCallbackState(boolean shouldBeRegistered) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.invokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback = this.onBackInvokedCallback;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (shouldBeRegistered && !this.backInvokedCallbackRegistered) {
            Api33Impl.INSTANCE.registerOnBackInvokedCallback(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = true;
        } else {
            if (shouldBeRegistered || !this.backInvokedCallbackRegistered) {
                return;
            }
            Api33Impl.INSTANCE.unregisterOnBackInvokedCallback(onBackInvokedDispatcher, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateEnabledCallbacks() {
        boolean z = this.hasEnabledCallbacks;
        ArrayDeque arrayDeque = this.onBackPressedCallbacks;
        boolean z2 = false;
        if (arrayDeque == null || !arrayDeque.isEmpty()) {
            Iterator<E> it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((OnBackPressedCallback) it.next()).getIsEnabled()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.hasEnabledCallbacks = z2;
        if (z2 != z) {
            Consumer consumer = this.onHasEnabledCallbacksChanged;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z2));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                updateBackInvokedCallbackState(z2);
            }
        }
    }

    public final void addCallback(OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        addCancellableCallback$activity_release(onBackPressedCallback);
    }

    public final Cancellable addCancellableCallback$activity_release(OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.onBackPressedCallbacks.add(onBackPressedCallback);
        OnBackPressedCancellable onBackPressedCancellable = new OnBackPressedCancellable(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(onBackPressedCancellable);
        updateEnabledCallbacks();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new OnBackPressedDispatcher$addCancellableCallback$1(this));
        return onBackPressedCancellable;
    }

    public final void addCallback(LifecycleOwner owner, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycleRegistry = owner.getLifecycleRegistry();
        if (lifecycleRegistry.getState() == Lifecycle.State.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycleRegistry, onBackPressedCallback));
        updateEnabledCallbacks();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new OnBackPressedDispatcher$addCallback$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBackStarted(BackEventCompat backEvent) {
        Object obj;
        ArrayDeque arrayDeque = this.onBackPressedCallbacks;
        ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            } else {
                obj = listIterator.previous();
                if (((OnBackPressedCallback) obj).getIsEnabled()) {
                    break;
                }
            }
        }
        OnBackPressedCallback onBackPressedCallback = (OnBackPressedCallback) obj;
        if (this.inProgressCallback != null) {
            onBackCancelled();
        }
        this.inProgressCallback = onBackPressedCallback;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackStarted(backEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    public final void onBackProgressed(BackEventCompat backEvent) {
        OnBackPressedCallback onBackPressedCallback;
        OnBackPressedCallback onBackPressedCallback2 = this.inProgressCallback;
        if (onBackPressedCallback2 == null) {
            ArrayDeque arrayDeque = this.onBackPressedCallbacks;
            ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    onBackPressedCallback = 0;
                    break;
                } else {
                    onBackPressedCallback = listIterator.previous();
                    if (((OnBackPressedCallback) onBackPressedCallback).getIsEnabled()) {
                        break;
                    }
                }
            }
            onBackPressedCallback2 = onBackPressedCallback;
        }
        if (onBackPressedCallback2 != null) {
            onBackPressedCallback2.handleOnBackProgressed(backEvent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void onBackPressed() {
        OnBackPressedCallback onBackPressedCallback;
        OnBackPressedCallback onBackPressedCallback2 = this.inProgressCallback;
        if (onBackPressedCallback2 == null) {
            ArrayDeque arrayDeque = this.onBackPressedCallbacks;
            ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    onBackPressedCallback = 0;
                    break;
                } else {
                    onBackPressedCallback = listIterator.previous();
                    if (((OnBackPressedCallback) onBackPressedCallback).getIsEnabled()) {
                        break;
                    }
                }
            }
            onBackPressedCallback2 = onBackPressedCallback;
        }
        this.inProgressCallback = null;
        if (onBackPressedCallback2 != null) {
            onBackPressedCallback2.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.fallbackOnBackPressed;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void onBackCancelled() {
        OnBackPressedCallback onBackPressedCallback;
        OnBackPressedCallback onBackPressedCallback2 = this.inProgressCallback;
        if (onBackPressedCallback2 == null) {
            ArrayDeque arrayDeque = this.onBackPressedCallbacks;
            ListIterator listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    onBackPressedCallback = 0;
                    break;
                } else {
                    onBackPressedCallback = listIterator.previous();
                    if (((OnBackPressedCallback) onBackPressedCallback).getIsEnabled()) {
                        break;
                    }
                }
            }
            onBackPressedCallback2 = onBackPressedCallback;
        }
        this.inProgressCallback = null;
        if (onBackPressedCallback2 != null) {
            onBackPressedCallback2.handleOnBackCancelled();
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$OnBackPressedCancellable;", "Landroidx/activity/Cancellable;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/activity/OnBackPressedCallback;)V", "cancel", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class OnBackPressedCancellable implements Cancellable {
        private final OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ OnBackPressedDispatcher this$0;

        public OnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, OnBackPressedCallback onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.onBackPressedCallback = onBackPressedCallback;
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.this$0.onBackPressedCallbacks.remove(this.onBackPressedCallback);
            if (Intrinsics.areEqual(this.this$0.inProgressCallback, this.onBackPressedCallback)) {
                this.onBackPressedCallback.handleOnBackCancelled();
                this.this$0.inProgressCallback = null;
            }
            this.onBackPressedCallback.removeCancellable(this);
            Function0 enabledChangedCallback = this.onBackPressedCallback.getEnabledChangedCallback();
            if (enabledChangedCallback != null) {
                enabledChangedCallback.mo4828invoke();
            }
            this.onBackPressedCallback.setEnabledChangedCallback$activity_release(null);
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/activity/Cancellable;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/Lifecycle;Landroidx/activity/OnBackPressedCallback;)V", "currentCancellable", "cancel", "", "onStateChanged", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, Cancellable {
        private Cancellable currentCancellable;
        private final Lifecycle lifecycle;
        private final OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ OnBackPressedDispatcher this$0;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle, OnBackPressedCallback onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.lifecycle = lifecycle;
            this.onBackPressedCallback = onBackPressedCallback;
            lifecycle.addObserver(this);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == Lifecycle.Event.ON_START) {
                this.currentCancellable = this.this$0.addCancellableCallback$activity_release(this.onBackPressedCallback);
                return;
            }
            if (event == Lifecycle.Event.ON_STOP) {
                Cancellable cancellable = this.currentCancellable;
                if (cancellable != null) {
                    cancellable.cancel();
                    return;
                }
                return;
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                cancel();
            }
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.lifecycle.removeObserver(this);
            this.onBackPressedCallback.removeCancellable(this);
            Cancellable cancellable = this.currentCancellable;
            if (cancellable != null) {
                cancellable.cancel();
            }
            this.currentCancellable = null;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @RequiresApi
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0001J\u0016\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001¨\u0006\u000e"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$Api33Impl;", "", "()V", "createOnBackInvokedCallback", "Landroid/window/OnBackInvokedCallback;", "onBackInvoked", "Lkotlin/Function0;", "", "registerOnBackInvokedCallback", "dispatcher", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "callback", "unregisterOnBackInvokedCallback", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api33Impl {
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        public final void registerOnBackInvokedCallback(Object dispatcher, int priority, Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(priority, (OnBackInvokedCallback) callback);
        }

        public final void unregisterOnBackInvokedCallback(Object dispatcher, Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }

        public final OnBackInvokedCallback createOnBackInvokedCallback(final Function0 onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.OnBackPressedDispatcher$Api33Impl$$ExternalSyntheticLambda0
                public final void onBackInvoked() {
                    Function0.this.mo4828invoke();
                }
            };
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @RequiresApi
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\r\u001a\u00020\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$Api34Impl;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/activity/BackEventCompat;", "", "onBackStarted", "onBackProgressed", "Lkotlin/Function0;", "onBackInvoked", "onBackCancelled", "Landroid/window/OnBackInvokedCallback;", "createOnBackAnimationCallback", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Landroid/window/OnBackInvokedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        public final OnBackInvokedCallback createOnBackAnimationCallback(final Function1 onBackStarted, final Function1 onBackProgressed, final Function0 onBackInvoked, final Function0 onBackCancelled) {
            Intrinsics.checkNotNullParameter(onBackStarted, "onBackStarted");
            Intrinsics.checkNotNullParameter(onBackProgressed, "onBackProgressed");
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            Intrinsics.checkNotNullParameter(onBackCancelled, "onBackCancelled");
            return new OnBackAnimationCallback() { // from class: androidx.activity.OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1
                public void onBackStarted(BackEvent backEvent) {
                    Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                    Function1.this.invoke(new BackEventCompat(backEvent));
                }

                public void onBackProgressed(BackEvent backEvent) {
                    Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                    onBackProgressed.invoke(new BackEventCompat(backEvent));
                }

                public void onBackInvoked() {
                    onBackInvoked.mo4828invoke();
                }

                public void onBackCancelled() {
                    onBackCancelled.mo4828invoke();
                }
            };
        }
    }
}
