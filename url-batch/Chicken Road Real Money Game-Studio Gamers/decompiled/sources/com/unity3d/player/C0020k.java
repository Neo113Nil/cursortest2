package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStates;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;

/* renamed from: com.unity3d.player.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0020k implements OnCompleteListener {
    private IAssetPackManagerDownloadStatusCallback a;
    private Looper b = Looper.myLooper();
    private String c;

    public C0020k(String str, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        this.a = iAssetPackManagerDownloadStatusCallback;
        this.c = str;
    }

    public final void onComplete(Task task) {
        int errorCode;
        C0026n c0026n;
        C0026n c0026n2;
        Object obj;
        HashSet hashSet;
        AssetPackManager assetPackManager;
        AssetPackManager assetPackManager2;
        try {
            AssetPackStates assetPackStates = (AssetPackStates) task.getResult();
            Map packStates = assetPackStates.packStates();
            if (packStates.size() == 0) {
                return;
            }
            for (AssetPackState assetPackState : packStates.values()) {
                if (assetPackState.errorCode() != 0 || assetPackState.status() == 4 || assetPackState.status() == 5 || assetPackState.status() == 0) {
                    String name = assetPackState.name();
                    int status = assetPackState.status();
                    int errorCode2 = assetPackState.errorCode();
                    long j = assetPackStates.totalBytes();
                    new Handler(this.b).post(new RunnableC0012g(Collections.singleton(this.a), name, status, j, status == 4 ? j : 0L, 0, errorCode2));
                } else {
                    c0026n = C0026n.d;
                    String name2 = assetPackState.name();
                    IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback = this.a;
                    Looper looper = this.b;
                    c0026n.getClass();
                    c0026n2 = C0026n.d;
                    synchronized (c0026n2) {
                        obj = c0026n.c;
                        if (obj == null) {
                            C0014h c0014h = new C0014h(c0026n, iAssetPackManagerDownloadStatusCallback, looper);
                            assetPackManager2 = c0026n.a;
                            assetPackManager2.registerListener(c0014h);
                            c0026n.c = c0014h;
                        } else {
                            ((C0014h) obj).a(iAssetPackManagerDownloadStatusCallback);
                        }
                        hashSet = c0026n.b;
                        hashSet.add(name2);
                        assetPackManager = c0026n.a;
                        assetPackManager.fetch(Collections.singletonList(name2));
                    }
                }
            }
        } catch (RuntimeExecutionException e) {
            e = e;
            String str = this.c;
            while (true) {
                if (e instanceof AssetPackException) {
                    errorCode = ((AssetPackException) e).getErrorCode();
                    break;
                }
                e = e.getCause();
                if (e == null) {
                    errorCode = -100;
                    break;
                }
            }
            new Handler(this.b).post(new RunnableC0012g(Collections.singleton(this.a), str, 0, 0L, 0L, 0, errorCode));
        }
    }
}
