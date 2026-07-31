package com.unity3d.player;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStates;
import java.util.Map;

/* renamed from: com.unity3d.player.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1746h implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final IAssetPackManagerStatusQueryCallback f22178a;

    /* renamed from: b, reason: collision with root package name */
    public final UnityPlayer f22179b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f22180c;

    public C1746h(UnityPlayer unityPlayer, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback, String[] strArr) {
        this.f22179b = unityPlayer;
        this.f22178a = iAssetPackManagerStatusQueryCallback;
        this.f22180c = strArr;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        if (this.f22178a == null) {
            return;
        }
        int i4 = 0;
        try {
            AssetPackStates assetPackStates = (AssetPackStates) task.getResult();
            Map packStates = assetPackStates.packStates();
            int size = packStates.size();
            String[] strArr = new String[size];
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            for (AssetPackState assetPackState : packStates.values()) {
                strArr[i4] = assetPackState.name();
                iArr[i4] = assetPackState.status();
                iArr2[i4] = assetPackState.errorCode();
                i4++;
            }
            this.f22179b.invokeOnMainThread(new RunnableC1743g(this.f22178a, assetPackStates.totalBytes(), strArr, iArr, iArr2));
        } catch (RuntimeExecutionException e4) {
            e = e4;
            String message = e.getMessage();
            for (String str : this.f22180c) {
                if (message.contains(str)) {
                    UnityPlayer unityPlayer = this.f22179b;
                    IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback = this.f22178a;
                    String[] strArr2 = {str};
                    int[] iArr3 = {0};
                    do {
                        e = e.getCause();
                    } while (e != null);
                    unityPlayer.invokeOnMainThread(new RunnableC1743g(iAssetPackManagerStatusQueryCallback, 0L, strArr2, iArr3, new int[]{-100}));
                    return;
                }
            }
            String[] strArr3 = this.f22180c;
            int[] iArr4 = new int[strArr3.length];
            int[] iArr5 = new int[strArr3.length];
            int i5 = 0;
            while (true) {
                String[] strArr4 = this.f22180c;
                if (i5 >= strArr4.length) {
                    this.f22179b.invokeOnMainThread(new RunnableC1743g(this.f22178a, 0L, strArr4, iArr4, iArr5));
                    return;
                }
                iArr4[i5] = 0;
                Throwable th = e;
                do {
                    th = th.getCause();
                } while (th != null);
                iArr5[i5] = -100;
                i5++;
            }
        }
    }
}
