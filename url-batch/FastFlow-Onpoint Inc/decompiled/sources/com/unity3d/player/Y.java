package com.unity3d.player;

/* loaded from: classes.dex */
public final class Y implements Runnable {
    public final /* synthetic */ PermissionRequest a;
    public final /* synthetic */ String[] b;
    public final /* synthetic */ int[] c;

    public Y(PermissionRequest permissionRequest, String[] strArr, int[] iArr) {
        this.a = permissionRequest;
        this.b = strArr;
        this.c = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.permissionResponse(this.b, this.c);
    }
}
