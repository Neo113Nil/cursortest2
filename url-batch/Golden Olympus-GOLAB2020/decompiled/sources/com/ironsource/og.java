package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface og<T> {

    @Metadata
    public static class a<ListenerType> implements og<ListenerType> {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private ListenerType f18517a;

        @Metadata
        /* renamed from: com.ironsource.og$a$a, reason: collision with other inner class name */
        public static final class C0155a extends ir {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f18518a;

            C0155a(Runnable runnable) {
                this.f18518a = runnable;
            }

            @Override // com.ironsource.ir
            public void a() {
                this.f18518a.run();
            }
        }

        @Nullable
        public final ListenerType a() {
            return this.f18517a;
        }

        public final void b(@Nullable ListenerType listenertype) {
            this.f18517a = listenertype;
        }

        public static /* synthetic */ void a(a aVar, Runnable runnable, boolean z4, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeOnUIThreadIfConditionMet");
            }
            if ((i4 & 2) != 0) {
                z4 = true;
            }
            aVar.a(runnable, z4);
        }

        @Override // com.ironsource.og
        public void a(ListenerType listenertype) {
            this.f18517a = listenertype;
        }

        public final void a(@NotNull Runnable runnable, boolean z4) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            if (z4) {
                IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new C0155a(runnable), 0L, 2, null);
            }
        }

        public final void a(@NotNull String instanceId, @NotNull String message) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(message, "message");
            IronLog.CALLBACK.info(message + " instanceId=" + instanceId);
        }
    }

    void a(T t4);
}
