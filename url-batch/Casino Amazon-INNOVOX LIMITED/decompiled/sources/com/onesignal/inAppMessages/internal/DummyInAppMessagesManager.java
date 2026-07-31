package com.onesignal.inAppMessages.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.onesignal.inAppMessages.IInAppMessageClickListener;
import com.onesignal.inAppMessages.IInAppMessageLifecycleListener;
import com.onesignal.inAppMessages.IInAppMessagesManager;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DummyInAppMessagesManager.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u001c\u0010\u0013\u001a\u00020\n2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0015H\u0016J\b\u0010\u0016\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000eH\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u001a\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u001cH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/onesignal/inAppMessages/internal/DummyInAppMessagesManager;", "Lcom/onesignal/inAppMessages/IInAppMessagesManager;", "()V", "paused", "", "getPaused", "()Z", "setPaused", "(Z)V", "addClickListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/onesignal/inAppMessages/IInAppMessageClickListener;", "addLifecycleListener", "Lcom/onesignal/inAppMessages/IInAppMessageLifecycleListener;", "addTrigger", "key", "", "value", "addTriggers", "triggers", "", "clearTriggers", "removeClickListener", "removeLifecycleListener", "removeTrigger", "removeTriggers", "keys", "", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DummyInAppMessagesManager implements IInAppMessagesManager {
    private boolean paused = true;

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addClickListener */
    public void mo3812addClickListener(IInAppMessageClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addLifecycleListener */
    public void mo3813addLifecycleListener(IInAppMessageLifecycleListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addTrigger */
    public void mo3814addTrigger(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: addTriggers */
    public void mo3815addTriggers(Map<String, String> triggers) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: clearTriggers */
    public void mo3816clearTriggers() {
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeClickListener */
    public void mo3817removeClickListener(IInAppMessageClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeLifecycleListener */
    public void mo3818removeLifecycleListener(IInAppMessageLifecycleListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeTrigger */
    public void mo3819removeTrigger(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    /* renamed from: removeTriggers */
    public void mo3820removeTriggers(Collection<String> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    public boolean getPaused() {
        return this.paused;
    }

    @Override // com.onesignal.inAppMessages.IInAppMessagesManager
    public void setPaused(boolean z) {
        this.paused = z;
    }
}
