package com.chartboost.sdk.internal.interruption;

import android.app.Application;
import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.media3.exoplayer.AudioFocusManager$$ExternalSyntheticApiModelOutline6;
import androidx.media3.exoplayer.AudioFocusManager$$ExternalSyntheticApiModelOutline8;
import com.chartboost.sdk.impl.c7;
import com.chartboost.sdk.impl.ib;
import com.chartboost.sdk.impl.jb;
import com.chartboost.sdk.impl.xb;
import com.chartboost.sdk.internal.interruption.a;
import com.ironsource.X3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class InterruptionController implements AudioManager.OnAudioFocusChangeListener {
    public static Context g;
    public static AudioManager h;
    public static AudioFocusRequest i;
    public static final InterruptionController a = new InterruptionController();
    public static final Object b = new Object();
    public static final Set c = new LinkedHashSet();
    public static final List d = new ArrayList();
    public static final List e = new ArrayList();
    public static final List f = new ArrayList();
    public static ib j = new ib(0, 1, null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/internal/interruption/InterruptionController$AppProcessLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "()V", X3.i.u0, "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStart", "onStop", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AppProcessLifecycleObserver implements DefaultLifecycleObserver {
        public static final AppProcessLifecycleObserver a = new AppProcessLifecycleObserver();

        private AppProcessLifecycleObserver() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ /* synthetic */ void onCreate(@NotNull LifecycleOwner lifecycleOwner) {
            super.onCreate(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ /* synthetic */ void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
            super.onDestroy(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ /* synthetic */ void onPause(@NotNull LifecycleOwner lifecycleOwner) {
            super.onPause(lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            synchronized (InterruptionController.b) {
                try {
                    Set set = InterruptionController.c;
                    a.C0239a c0239a = com.chartboost.sdk.internal.interruption.a.b;
                    if (!set.contains(c0239a.a()) && InterruptionController.c.contains(c0239a.b())) {
                        InterruptionController.a.b(c0239a.b());
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            InterruptionController.a.b(com.chartboost.sdk.internal.interruption.a.b.a());
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            InterruptionController.a.a(com.chartboost.sdk.internal.interruption.a.b.a());
        }
    }

    public static final class a extends SuspendLambda implements Function2 {
        public int b;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(AppProcessLifecycleObserver.a);
            xb.c("InterruptionController initialized with ProcessLifecycleOwner.", null, 2, null);
            return Unit.INSTANCE;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ boolean c;

        public static final class a extends Lambda implements Function1 {
            public static final a b = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(WeakReference it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.get() == null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, Continuation continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Object obj2 = InterruptionController.b;
            boolean z = this.c;
            synchronized (obj2) {
                try {
                    CollectionsKt.removeAll(InterruptionController.e, (Function1) a.b);
                    Iterator it = InterruptionController.e.iterator();
                    while (it.hasNext()) {
                        c7 c7Var = (c7) ((WeakReference) it.next()).get();
                        if (c7Var != null) {
                            c7Var.b(z);
                        }
                    }
                    xb.c((z ? "Ducking" : "Restoring") + " ad audio volume", null, 2, null);
                    unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return unit;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int b;
        public final /* synthetic */ Set c;

        public static final class a extends Lambda implements Function1 {
            public static final a b = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(WeakReference it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.get() == null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Set set, Continuation continuation) {
            super(2, continuation);
            this.c = set;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Object obj2 = InterruptionController.b;
            Set set = this.c;
            synchronized (obj2) {
                try {
                    CollectionsKt.removeAll(InterruptionController.d, (Function1) a.b);
                    Iterator it = InterruptionController.d.iterator();
                    while (it.hasNext()) {
                        jb jbVar = (jb) ((WeakReference) it.next()).get();
                        if (jbVar != null) {
                            jbVar.a(set);
                        }
                    }
                    unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return unit;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public final /* synthetic */ c7 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c7 c7Var) {
            super(1);
            this.b = c7Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WeakReference it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.get() == null || it.get() == this.b);
        }
    }

    public static final class e extends Lambda implements Function1 {
        public final /* synthetic */ jb b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(jb jbVar) {
            super(1);
            this.b = jbVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WeakReference it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.get() == null || it.get() == this.b);
        }
    }

    public final void a(c7 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (b) {
            e.add(new WeakReference(listener));
        }
    }

    public final void b(c7 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (b) {
            CollectionsKt.removeAll(e, (Function1) new d(listener));
        }
    }

    public final Set f() {
        Set set;
        synchronized (b) {
            set = CollectionsKt.toSet(c);
        }
        return set;
    }

    public final void g() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new c(f(), null), 3, null);
    }

    public final int h() {
        int i2;
        Unit unit;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest build;
        AudioManager audioManager = h;
        if (audioManager != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusManager$$ExternalSyntheticApiModelOutline8.m();
                onAudioFocusChangeListener = AudioFocusManager$$ExternalSyntheticApiModelOutline6.m(j.a()).setOnAudioFocusChangeListener(this);
                willPauseWhenDucked = onAudioFocusChangeListener.setWillPauseWhenDucked(true);
                build = willPauseWhenDucked.build();
                i = build;
                i2 = audioManager.requestAudioFocus(build);
            } else {
                i2 = audioManager.requestAudioFocus(this, 3, j.a());
            }
            if (i2 == 0) {
                xb.b("Audio focus request FAILED.", (Throwable) null, 2, (Object) null);
            } else if (i2 == 1) {
                xb.c("Audio focus request GRANTED.", null, 2, null);
            } else if (i2 != 2) {
                xb.e("Audio focus request returned unknown result: " + i2, null, 2, null);
            } else {
                xb.c("Audio focus request DELAYED.", null, 2, null);
            }
            unit = Unit.INSTANCE;
        } else {
            i2 = 0;
            unit = null;
        }
        if (unit == null) {
            xb.b("AudioManager is null, cannot request audio focus.", (Throwable) null, 2, (Object) null);
        }
        return i2;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i2) {
        if (i2 == -3) {
            a(true);
            return;
        }
        if (i2 == -2 || i2 == -1) {
            a(com.chartboost.sdk.internal.interruption.a.b.b());
        } else {
            if (i2 != 1) {
                return;
            }
            a(false);
            b(com.chartboost.sdk.internal.interruption.a.b.b());
        }
    }

    public final void a(jb listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (b) {
            d.add(new WeakReference(listener));
        }
    }

    public final void b(jb listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (b) {
            CollectionsKt.removeAll(d, (Function1) new e(listener));
        }
    }

    public final void a(Application application, ib config) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(config, "config");
        Context applicationContext = application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        g = applicationContext;
        j = config;
        if (applicationContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
            applicationContext = null;
        }
        Object systemService = applicationContext.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager == null) {
            xb.b("Failed to get AudioManager. Audio focus handling will be disabled.", (Throwable) null, 2, (Object) null);
            audioManager = null;
        }
        h = audioManager;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new a(null), 3, null);
    }

    public final void b(com.chartboost.sdk.internal.interruption.a aVar) {
        boolean remove;
        synchronized (b) {
            remove = c.remove(aVar);
            Unit unit = Unit.INSTANCE;
        }
        if (remove) {
            xb.c("Ad interruption ended: " + aVar, null, 2, null);
            g();
        }
    }

    public static /* synthetic */ void a(InterruptionController interruptionController, Application application, ib ibVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            ibVar = new ib(0, 1, null);
        }
        interruptionController.a(application, ibVar);
    }

    public final void a() {
        AudioManager audioManager = h;
        if (audioManager != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest audioFocusRequest = i;
                if (audioFocusRequest != null) {
                    xb.c("Abandoning audio focus (API 26+).", null, 2, null);
                    audioManager.abandonAudioFocusRequest(audioFocusRequest);
                }
                i = null;
                return;
            }
            xb.c("Abandoning audio focus (API < 26).", null, 2, null);
            audioManager.abandonAudioFocus(this);
            return;
        }
        xb.b("AudioManager is null, cannot abandon audio focus.", (Throwable) null, 2, (Object) null);
    }

    public final void a(com.chartboost.sdk.internal.interruption.a aVar) {
        boolean z;
        synchronized (b) {
            Set set = c;
            boolean isEmpty = set.isEmpty();
            boolean add = set.add(aVar);
            if (!isEmpty && !add) {
                z = false;
                Unit unit = Unit.INSTANCE;
            }
            z = true;
            Unit unit2 = Unit.INSTANCE;
        }
        if (z) {
            xb.c("Ad interruption began: " + aVar, null, 2, null);
            g();
        }
    }

    public final void a(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new b(z, null), 3, null);
    }
}
