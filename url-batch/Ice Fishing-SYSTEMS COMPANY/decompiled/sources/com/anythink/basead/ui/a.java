package com.anythink.basead.ui;

import android.view.View;
import com.anythink.basead.j.e;
import com.anythink.basead.ui.component.a;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: com.anythink.basead.ui.a$a, reason: collision with other inner class name */
    public interface InterfaceC0049a {
        void onProgressUpdate(long j9, long j10);

        void onVideoAdComplete();

        void onVideoAdStartPlay(long j9);

        void onVideoError(String str, String str2);
    }

    void destroyPlayerView(int i);

    long getVideoCurrentPosition();

    void initPlayerView(w wVar, x xVar, a.InterfaceC0055a interfaceC0055a, e eVar);

    void pauseVideo();

    void resumeVideo();

    void setATImproveClickViewController(com.anythink.basead.ui.improveclick.a aVar);

    void setAutoPlay(String str);

    void setIsMuted(boolean z8);

    void setPlayerOnClickListener(View.OnClickListener onClickListener);

    void setVideoListener(InterfaceC0049a interfaceC0049a);
}
