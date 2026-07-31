package com.unity3d.player;

import com.unity3d.player.UnityPlayer;

/* renamed from: com.unity3d.player.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1785x0 extends UnityPlayer.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22274b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f22275c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f22277e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1785x0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, boolean z4, String str, int i4) {
        super();
        this.f22277e = unityPlayerForActivityOrService;
        this.f22274b = z4;
        this.f22275c = str;
        this.f22276d = i4;
    }

    @Override // com.unity3d.player.UnityPlayer.b
    public final void a() {
        if (this.f22274b) {
            this.f22277e.nativeSoftInputCanceled();
        } else {
            String str = this.f22275c;
            if (str != null) {
                this.f22277e.nativeSetInputString(str);
            }
        }
        if (this.f22276d == 1) {
            this.f22277e.nativeSoftInputClosed();
        }
    }
}
