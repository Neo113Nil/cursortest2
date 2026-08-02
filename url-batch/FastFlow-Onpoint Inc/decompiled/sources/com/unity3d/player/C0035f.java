package com.unity3d.player;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStates;
import java.util.Collections;
import java.util.Map;
import java.util.Vector;

/* renamed from: com.unity3d.player.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035f implements OnCompleteListener {
    public final IAssetPackManagerDownloadStatusCallback a;
    public final UnityPlayer b;
    public final String[] c;

    public C0035f(UnityPlayer unityPlayer, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback, String[] strArr) {
        this.b = unityPlayer;
        this.a = iAssetPackManagerDownloadStatusCallback;
        this.c = strArr;
    }

    public final void onComplete(Task task) {
        int errorCode;
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
                    int errorCode2 = assetPackState.errorCode();
                    long j = assetPackStates.totalBytes();
                    this.b.invokeOnMainThread(new RunnableC0027b(Collections.singleton(this.a), name, status, j, status == 4 ? j : 0L, 0, errorCode2));
                } else {
                    vector.add(assetPackState.name());
                }
            }
            if (vector.size() > 0) {
                C0041i c0041i = C0041i.e;
                UnityPlayer unityPlayer = this.b;
                IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback = this.a;
                c0041i.getClass();
                synchronized (C0041i.e) {
                    C0029c c0029c = c0041i.d;
                    if (c0029c == null) {
                        C0029c c0029c2 = new C0029c(c0041i, unityPlayer, iAssetPackManagerDownloadStatusCallback);
                        c0041i.b.registerListener(c0029c2);
                        c0041i.d = c0029c2;
                    } else {
                        c0029c.a(iAssetPackManagerDownloadStatusCallback);
                    }
                    c0041i.c.addAll(vector);
                    c0041i.b.fetch(vector);
                }
            }
        } catch (RuntimeExecutionException e) {
            Throwable th = e;
            String[] strArr = this.c;
            if (strArr.length == 1) {
                String str = strArr[0];
                while (true) {
                    if (th instanceof AssetPackException) {
                        errorCode = ((AssetPackException) th).getErrorCode();
                        break;
                    }
                    th = th.getCause();
                    if (th == null) {
                        errorCode = -100;
                        break;
                    }
                }
                this.b.invokeOnMainThread(new RunnableC0027b(Collections.singleton(this.a), str, 0, 0L, 0L, 0, errorCode));
                return;
            }
            C0041i c0041i2 = C0041i.e;
            IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback2 = this.a;
            c0041i2.getClass();
            for (String str2 : strArr) {
                c0041i2.b.getPackStates(Collections.singletonList(str2)).addOnCompleteListener(new C0035f(c0041i2.a, iAssetPackManagerDownloadStatusCallback2, new String[]{str2}));
            }
        }
    }
}
