package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.x42;

/* renamed from: com.yandex.mobile.ads.impl.zj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2395zj implements zh1 {

    /* renamed from: a, reason: collision with root package name */
    protected final x42.d f35608a = new x42.d();

    protected AbstractC2395zj() {
    }

    public final boolean b() {
        h60 h60Var = (h60) this;
        return h60Var.getPlaybackState() == 3 && h60Var.getPlayWhenReady() && h60Var.getPlaybackSuppressionReason() == 0;
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final boolean hasNextMediaItem() {
        h60 h60Var = (h60) this;
        x42 currentTimeline = h60Var.getCurrentTimeline();
        if (!currentTimeline.c()) {
            int currentMediaItemIndex = h60Var.getCurrentMediaItemIndex();
            h60Var.d();
            h60Var.e();
            if (currentTimeline.a(currentMediaItemIndex, 0, false) != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final boolean hasPreviousMediaItem() {
        h60 h60Var = (h60) this;
        x42 currentTimeline = h60Var.getCurrentTimeline();
        if (!currentTimeline.c()) {
            int currentMediaItemIndex = h60Var.getCurrentMediaItemIndex();
            h60Var.d();
            h60Var.e();
            if (currentTimeline.b(currentMediaItemIndex, 0, false) != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final boolean isCurrentMediaItemDynamic() {
        h60 h60Var = (h60) this;
        x42 currentTimeline = h60Var.getCurrentTimeline();
        return !currentTimeline.c() && currentTimeline.a(h60Var.getCurrentMediaItemIndex(), this.f35608a, 0L).f34426j;
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final boolean isCurrentMediaItemLive() {
        h60 h60Var = (h60) this;
        x42 currentTimeline = h60Var.getCurrentTimeline();
        return !currentTimeline.c() && currentTimeline.a(h60Var.getCurrentMediaItemIndex(), this.f35608a, 0L).a();
    }

    @Override // com.yandex.mobile.ads.impl.zh1
    public final boolean isCurrentMediaItemSeekable() {
        h60 h60Var = (h60) this;
        x42 currentTimeline = h60Var.getCurrentTimeline();
        return !currentTimeline.c() && currentTimeline.a(h60Var.getCurrentMediaItemIndex(), this.f35608a, 0L).f34425i;
    }
}
