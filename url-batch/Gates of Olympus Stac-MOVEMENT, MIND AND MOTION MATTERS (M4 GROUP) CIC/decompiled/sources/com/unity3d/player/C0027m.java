package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStates;
import java.util.Map;

/* renamed from: com.unity3d.player.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0027m implements OnCompleteListener {
    private IAssetPackManagerStatusQueryCallback a;
    private Looper b = Looper.myLooper();
    private String[] c;

    public C0027m(String[] strArr, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        this.a = iAssetPackManagerStatusQueryCallback;
        this.c = strArr;
    }

    public final void onComplete(Task task) {
        int errorCode;
        if (this.a == null) {
            return;
        }
        int i = 0;
        try {
            AssetPackStates assetPackStates = (AssetPackStates) task.getResult();
            Map packStates = assetPackStates.packStates();
            int size = packStates.size();
            String[] strArr = new String[size];
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            for (AssetPackState assetPackState : packStates.values()) {
                strArr[i] = assetPackState.name();
                iArr[i] = assetPackState.status();
                iArr2[i] = assetPackState.errorCode();
                i++;
            }
            new Handler(this.b).post(new RunnableC0025l(this.a, assetPackStates.totalBytes(), strArr, iArr, iArr2));
        } catch (RuntimeExecutionException e) {
            e = e;
            String message = e.getMessage();
            String[] strArr2 = this.c;
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                int i3 = -100;
                if (i2 >= length) {
                    String[] strArr3 = this.c;
                    int[] iArr3 = new int[strArr3.length];
                    int[] iArr4 = new int[strArr3.length];
                    for (int i4 = 0; i4 < this.c.length; i4++) {
                        iArr3[i4] = 0;
                        Throwable th = e;
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
                        iArr4[i4] = errorCode;
                    }
                    new Handler(this.b).post(new RunnableC0025l(this.a, 0L, this.c, iArr3, iArr4));
                    return;
                }
                String str = strArr2[i2];
                if (message.contains(str)) {
                    Handler handler = new Handler(this.b);
                    IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback = this.a;
                    String[] strArr4 = {str};
                    int[] iArr5 = {0};
                    int[] iArr6 = new int[1];
                    while (true) {
                        if (!(e instanceof AssetPackException)) {
                            e = e.getCause();
                            if (e == null) {
                                break;
                            }
                        } else {
                            i3 = ((AssetPackException) e).getErrorCode();
                            break;
                        }
                    }
                    iArr6[0] = i3;
                    handler.post(new RunnableC0025l(iAssetPackManagerStatusQueryCallback, 0L, strArr4, iArr5, iArr6));
                    return;
                }
                i2++;
            }
        }
    }
}
