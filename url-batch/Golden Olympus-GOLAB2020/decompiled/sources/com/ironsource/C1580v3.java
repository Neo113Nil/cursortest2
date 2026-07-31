package com.ironsource;

import androidx.lifecycle.AbstractC1346l;
import androidx.lifecycle.InterfaceC1351q;
import androidx.lifecycle.InterfaceC1354u;
import com.ironsource.C1580v3;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.v3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1580v3 implements InterfaceC1521n4 {

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata
    /* renamed from: com.ironsource.v3$a */
    static final class a implements InterfaceC1351q {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ok f19987a;

        @Metadata
        /* renamed from: com.ironsource.v3$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0167a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f19988a;

            static {
                int[] iArr = new int[AbstractC1346l.a.values().length];
                try {
                    iArr[AbstractC1346l.a.ON_START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbstractC1346l.a.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AbstractC1346l.a.ON_PAUSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AbstractC1346l.a.ON_STOP.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f19988a = iArr;
            }
        }

        public a(@NotNull ok listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f19987a = listener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(AbstractC1346l.a event, a this$0) {
            Intrinsics.checkNotNullParameter(event, "$event");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            int i4 = C0167a.f19988a[event.ordinal()];
            if (i4 == 1) {
                this$0.f19987a.c();
                return;
            }
            if (i4 == 2) {
                this$0.f19987a.a();
            } else if (i4 == 3) {
                this$0.f19987a.d();
            } else {
                if (i4 != 4) {
                    return;
                }
                this$0.f19987a.b();
            }
        }

        public boolean equals(@Nullable Object obj) {
            ok okVar = this.f19987a;
            a aVar = obj instanceof a ? (a) obj : null;
            return Intrinsics.areEqual(okVar, aVar != null ? aVar.f19987a : null);
        }

        public int hashCode() {
            return this.f19987a.hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1351q
        public void onStateChanged(@NotNull InterfaceC1354u source, @NotNull final AbstractC1346l.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.M3
                @Override // java.lang.Runnable
                public final void run() {
                    C1580v3.a.a(AbstractC1346l.a.this, this);
                }
            }, 0L, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ok observer) {
        Intrinsics.checkNotNullParameter(observer, "$observer");
        androidx.lifecycle.F.f12561i.a().getLifecycle().addObserver(new a(observer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ok observer) {
        Intrinsics.checkNotNullParameter(observer, "$observer");
        androidx.lifecycle.F.f12561i.a().getLifecycle().removeObserver(new a(observer));
    }

    @Override // com.ironsource.InterfaceC1521n4
    public void a(@NotNull final ok observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.L3
            @Override // java.lang.Runnable
            public final void run() {
                C1580v3.c(ok.this);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC1521n4
    public void b(@NotNull final ok observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.K3
            @Override // java.lang.Runnable
            public final void run() {
                C1580v3.d(ok.this);
            }
        }, 0L, 2, null);
    }
}
