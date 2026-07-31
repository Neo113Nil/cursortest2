package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import h1.C2443d;
import h1.C2445f;

/* loaded from: classes2.dex */
public class UnityPlayerForRenderService extends UnityPlayerForActivityOrService {

    /* renamed from: a, reason: collision with root package name */
    private final C2445f f22098a;

    public UnityPlayerForRenderService(Context context) {
        this(context, null, "");
    }

    public void forwardSoftInputArea(Rect rect) {
        super.reportSoftInputArea(rect);
    }

    public void forwardSoftInputIsVisible(boolean z4) {
        super.reportSoftInputIsVisible(z4);
    }

    public void forwardSoftInputSelection(int i4, int i5) {
        super.reportSoftInputSelection(i4, i5);
    }

    public void forwardSoftInputStr(String str, int i4, boolean z4) {
        super.reportSoftInputStr(str, i4, z4);
    }

    public ISoftInputListener getSoftInputListener() {
        return this.f22098a.f36740b;
    }

    @Override // com.unity3d.player.UnityPlayerForActivityOrService, com.unity3d.player.UnityPlayer
    final boolean handleFocus(boolean z4) {
        return super.handleFocus(true);
    }

    public void mute(boolean z4) {
        if (this.m_PhoneCallListener.f22095a == 1) {
            return;
        }
        nativeMuteMasterAudio(z4);
    }

    @Override // com.unity3d.player.UnityPlayerForActivityOrService
    protected void resetSoftInput() {
    }

    @Override // com.unity3d.player.UnityPlayer
    protected void saveFocusState(boolean z4) {
        this.mState.f36758a = true;
    }

    public void setSoftInputListener(ISoftInputListener iSoftInputListener) {
        this.f22098a.f36740b = iSoftInputListener;
    }

    @Override // com.unity3d.player.UnityPlayerForActivityOrService
    protected void showSoftInput(String str, int i4, boolean z4, boolean z5, boolean z6, boolean z7, String str2, int i5, boolean z8, boolean z9) {
        this.f22098a.a(str, i4, z4, z5, z6, z7, str2, i5, z8, z9);
    }

    @Override // com.unity3d.player.UnityPlayer
    protected boolean showVideoPlayer(String str, int i4, int i5, int i6, boolean z4, int i7, int i8) {
        h1.T.a(5, "VideoPlayer Not Supported");
        return false;
    }

    public UnityPlayerForRenderService(Context context, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents) {
        this(context, iUnityPlayerLifecycleEvents, "");
    }

    public UnityPlayerForRenderService(Context context, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents, String str) {
        super(context, iUnityPlayerLifecycleEvents, str, new C2443d());
        h1.T.a(4, "Creating UnityPlayerForRenderService with cmdline: " + str);
        this.f22098a = new C2445f();
    }
}
