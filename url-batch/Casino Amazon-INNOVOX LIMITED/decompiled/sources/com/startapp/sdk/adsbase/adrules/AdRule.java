package com.startapp.sdk.adsbase.adrules;

import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import com.startapp.json.TypeClassInfo;
import java.io.Serializable;
import java.util.List;

/* compiled from: Sta */
@TypeClassInfo(decider = WebViewManager.EVENT_TYPE_KEY, inheritClasses = {FreqCapRule.class, ProbabilityRule.class}, packageName = "com.startapp.sdk.adsbase.adrules")
/* loaded from: classes3.dex */
public abstract class AdRule implements Serializable {
    private static final long serialVersionUID = 7934302502238649788L;
    private transient boolean shouldProcessEntireHierarchy;

    public AdRule(boolean z) {
        this.shouldProcessEntireHierarchy = z;
    }

    public final boolean a() {
        return this.shouldProcessEntireHierarchy;
    }

    public abstract boolean a(List list);
}
