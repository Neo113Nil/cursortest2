package com.unity3d.player;

import android.app.GameManager;
import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* loaded from: classes2.dex */
public class UnityGameState {
    private static String ModeName(int i4) {
        return i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? String.valueOf(i4) : "CONTENT" : "GAMEPLAY_UNINTERRUPTIBLE" : "GAMEPLAY_INTERRUPTIBLE" : "NONE" : GrsBaseInfo.CountryCodeSource.UNKNOWN;
    }

    public static void setGameState(Context context, boolean z4, int i4) {
        if (!PlatformSupport.TIRAMISU_SUPPORT) {
            h1.T.a(6, "setGameState: API level not supported. API level 33 is required.");
            return;
        }
        GameManager a4 = x1.a(UnityGameManager.getGameManager(context));
        if (a4 == null) {
            h1.T.a(6, "UnityGame: GameManager not available.");
            return;
        }
        h1.T.a(4, "SetGameState: " + z4 + " " + i4);
        a4.setGameState(C1.a(z4, i4));
    }

    public static void setGameState(Context context, boolean z4, int i4, int i5, int i6) {
        if (!PlatformSupport.TIRAMISU_SUPPORT) {
            h1.T.a(6, "setGameState: API level not supported. API level 33 is required.");
            return;
        }
        GameManager a4 = x1.a(UnityGameManager.getGameManager(context));
        if (a4 == null) {
            h1.T.a(6, "UnityGame: GameManager not available.");
            return;
        }
        h1.T.a(4, "SetGameState: isLoading: " + z4 + ", mode: " + ModeName(i4) + ", label: " + i5 + ", quality: " + i6);
        a4.setGameState(B1.a(z4, i4, i5, i6));
    }
}
