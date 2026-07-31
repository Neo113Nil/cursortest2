package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ListenerHolder<L> {
    private final Executor zaa;
    private volatile Object zab;
    private volatile ListenerKey zac;

    public static final class ListenerKey<L> {
        private final Object zaa;
        private final String zab;

        ListenerKey(L l4, String str) {
            this.zaa = l4;
            this.zab = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj;
            return this.zaa == listenerKey.zaa && this.zab.equals(listenerKey.zab);
        }

        public int hashCode() {
            return (System.identityHashCode(this.zaa) * 31) + this.zab.hashCode();
        }

        public String toIdString() {
            return this.zab + "@" + System.identityHashCode(this.zaa);
        }
    }

    public interface Notifier<L> {
        void notifyListener(L l4);

        void onNotifyListenerFailed();
    }

    ListenerHolder(Looper looper, L l4, String str) {
        this.zaa = new HandlerExecutor(looper);
        this.zab = Preconditions.checkNotNull(l4, "Listener must not be null");
        this.zac = new ListenerKey(l4, Preconditions.checkNotEmpty(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void zaa(ListenerHolder listenerHolder, Notifier notifier) {
        Object obj = listenerHolder.zab;
        if (obj == null) {
            notifier.onNotifyListenerFailed();
            return;
        }
        try {
            notifier.notifyListener(obj);
        } catch (RuntimeException e4) {
            notifier.onNotifyListenerFailed();
            throw e4;
        }
    }

    public void clear() {
        this.zab = null;
        this.zac = null;
    }

    public ListenerKey<L> getListenerKey() {
        return this.zac;
    }

    public boolean hasListener() {
        return this.zab != null;
    }

    public void notifyListener(final Notifier<? super L> notifier) {
        Preconditions.checkNotNull(notifier, "Notifier must not be null");
        this.zaa.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.zabz
            @Override // java.lang.Runnable
            public final void run() {
                ListenerHolder.zaa(ListenerHolder.this, notifier);
            }
        });
    }

    ListenerHolder(Executor executor, L l4, String str) {
        this.zaa = (Executor) Preconditions.checkNotNull(executor, "Executor must not be null");
        this.zab = Preconditions.checkNotNull(l4, "Listener must not be null");
        this.zac = new ListenerKey(l4, Preconditions.checkNotEmpty(str));
    }
}
