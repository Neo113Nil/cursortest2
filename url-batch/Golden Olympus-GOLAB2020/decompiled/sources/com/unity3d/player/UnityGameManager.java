package com.unity3d.player;

import android.app.GameManager;
import android.content.Context;

/* loaded from: classes2.dex */
public class UnityGameManager {
    private static Object mGameManager;

    public static Object getGameManager(Context context) {
        if (!PlatformSupport.SNOW_CONE_SUPPORT) {
            h1.T.a(6, "getGameManager: API level not supported. API level 31 is required.");
            return null;
        }
        Object obj = mGameManager;
        if (obj != null) {
            return obj;
        }
        if (context == null) {
            h1.T.a(6, "UnityGame: Request for GameManager supplied with null context.");
            return null;
        }
        Object systemService = context.getSystemService((Class<Object>) z1.a());
        mGameManager = systemService;
        return systemService;
    }

    public static int getGameMode(Context context) {
        int gameMode;
        if (!PlatformSupport.SNOW_CONE_SUPPORT) {
            h1.T.a(6, "getGameMode: API level not supported. API level 31 is required.");
            return 0;
        }
        GameManager a4 = x1.a(getGameManager(context));
        if (a4 == null) {
            h1.T.a(6, "UnityGame: GameManager not available.");
            return 0;
        }
        gameMode = a4.getGameMode();
        return gameMode;
    }
}
