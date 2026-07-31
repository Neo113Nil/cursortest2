package com.unity3d.player;

/* renamed from: com.unity3d.player.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1744g0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PermissionRequest f22175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String[] f22176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int[] f22177c;

    public RunnableC1744g0(PermissionRequest permissionRequest, String[] strArr, int[] iArr) {
        this.f22175a = permissionRequest;
        this.f22176b = strArr;
        this.f22177c = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22175a.permissionResponse(this.f22176b, this.f22177c);
    }
}
