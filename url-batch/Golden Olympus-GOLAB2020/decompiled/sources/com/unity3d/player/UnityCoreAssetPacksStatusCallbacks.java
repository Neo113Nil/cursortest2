package com.unity3d.player;

/* loaded from: classes2.dex */
class UnityCoreAssetPacksStatusCallbacks implements IAssetPackManagerDownloadStatusCallback, IAssetPackManagerStatusQueryCallback {
    private final native void nativeStatusQueryResult(String str, int i4, int i5);

    @Override // com.unity3d.player.IAssetPackManagerStatusQueryCallback
    public void onStatusResult(long j4, String[] strArr, int[] iArr, int[] iArr2) {
        for (int i4 = 0; i4 < iArr.length; i4++) {
            nativeStatusQueryResult(strArr[i4], iArr[i4], iArr2[i4]);
        }
    }

    @Override // com.unity3d.player.IAssetPackManagerDownloadStatusCallback
    public void onStatusUpdate(String str, int i4, long j4, long j5, int i5, int i6) {
        nativeStatusQueryResult(str, i4, i6);
    }
}
