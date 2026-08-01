package gb;

import com.onesignal.inAppMessages.internal.prompt.impl.b;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {
    private b currentPrompt;
    private String inAppMessageIdShowing;
    private Long lastTimeInAppDismissed;
    private boolean paused;

    public final b getCurrentPrompt() {
        return this.currentPrompt;
    }

    public final String getInAppMessageIdShowing() {
        return this.inAppMessageIdShowing;
    }

    public final Long getLastTimeInAppDismissed() {
        return this.lastTimeInAppDismissed;
    }

    public final boolean getPaused() {
        return this.paused;
    }

    public final void setCurrentPrompt(b bVar) {
        this.currentPrompt = bVar;
    }

    public final void setInAppMessageIdShowing(String str) {
        this.inAppMessageIdShowing = str;
    }

    public final void setLastTimeInAppDismissed(Long l10) {
        this.lastTimeInAppDismissed = l10;
    }

    public final void setPaused(boolean z10) {
        this.paused = z10;
    }
}
