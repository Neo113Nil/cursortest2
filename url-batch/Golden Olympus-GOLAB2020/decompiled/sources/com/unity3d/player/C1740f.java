package com.unity3d.player;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStates;
import java.util.Collections;
import java.util.Map;
import java.util.Vector;

/* renamed from: com.unity3d.player.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1740f implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final IAssetPackManagerDownloadStatusCallback f22166a;

    /* renamed from: b, reason: collision with root package name */
    public final UnityPlayer f22167b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f22168c;

    public C1740f(UnityPlayer unityPlayer, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback, String[] strArr) {
        this.f22167b = unityPlayer;
        this.f22166a = iAssetPackManagerDownloadStatusCallback;
        this.f22168c = strArr;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        try {
            AssetPackStates assetPackStates = (AssetPackStates) task.getResult();
            Map packStates = assetPackStates.packStates();
            if (packStates.size() == 0) {
                return;
            }
            Vector vector = new Vector();
            for (AssetPackState assetPackState : packStates.values()) {
                if (assetPackState.errorCode() != 0 || assetPackState.status() == 4 || assetPackState.status() == 5 || assetPackState.status() == 0) {
                    String name = assetPackState.name();
                    int status = assetPackState.status();
                    int errorCode = assetPackState.errorCode();
                    long j4 = assetPackStates.totalBytes();
                    this.f22167b.invokeOnMainThread(new RunnableC1728b(Collections.singleton(this.f22166a), name, status, j4, status == 4 ? j4 : 0L, 0, errorCode));
                } else {
                    vector.add(assetPackState.name());
                }
            }
            if (vector.size() > 0) {
                C1749i c1749i = C1749i.f22182e;
                UnityPlayer unityPlayer = this.f22167b;
                IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback = this.f22166a;
                c1749i.getClass();
                synchronized (C1749i.f22182e) {
                    try {
                        C1731c c1731c = c1749i.f22186d;
                        if (c1731c == null) {
                            C1731c c1731c2 = new C1731c(c1749i, unityPlayer, iAssetPackManagerDownloadStatusCallback);
                            c1749i.f22184b.registerListener(c1731c2);
                            c1749i.f22186d = c1731c2;
                        } else {
                            c1731c.a(iAssetPackManagerDownloadStatusCallback);
                        }
                        c1749i.f22185c.addAll(vector);
                        c1749i.f22184b.fetch(vector);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (RuntimeExecutionException e4) {
            Throwable th2 = e4;
            String[] strArr = this.f22168c;
            if (strArr.length == 1) {
                String str = strArr[0];
                do {
                    th2 = th2.getCause();
                } while (th2 != null);
                this.f22167b.invokeOnMainThread(new RunnableC1728b(Collections.singleton(this.f22166a), str, 0, 0L, 0L, 0, -100));
                return;
            }
            C1749i c1749i2 = C1749i.f22182e;
            IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback2 = this.f22166a;
            c1749i2.getClass();
            for (String str2 : strArr) {
                c1749i2.f22184b.getPackStates(Collections.singletonList(str2)).addOnCompleteListener(new C1740f(c1749i2.f22183a, iAssetPackManagerDownloadStatusCallback2, new String[]{str2}));
            }
        }
    }
}
