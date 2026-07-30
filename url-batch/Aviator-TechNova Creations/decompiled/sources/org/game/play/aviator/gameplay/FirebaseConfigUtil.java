package org.game.play.aviator.gameplay;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class FirebaseConfigUtil {
    private static final String KEY_GAMES_DATA = "AvitorGameLink";

    public interface OnConfigFetchListener {
        void onFetchFailure();

        void onFetchSuccess(String str);
    }

    public static void fetchGamesData(final OnConfigFetchListener onConfigFetchListener) {
        final FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        firebaseRemoteConfig.setConfigSettingsAsync(new FirebaseRemoteConfigSettings.Builder().setMinimumFetchIntervalInSeconds(3600L).build());
        HashMap hashMap = new HashMap();
        hashMap.put(KEY_GAMES_DATA, "");
        firebaseRemoteConfig.setDefaultsAsync(hashMap);
        firebaseRemoteConfig.fetchAndActivate().addOnCompleteListener(new OnCompleteListener() { // from class: org.game.play.aviator.gameplay.FirebaseConfigUtil$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FirebaseConfigUtil.lambda$fetchGamesData$0(FirebaseRemoteConfig.this, onConfigFetchListener, task);
            }
        });
    }

    static /* synthetic */ void lambda$fetchGamesData$0(FirebaseRemoteConfig firebaseRemoteConfig, OnConfigFetchListener onConfigFetchListener, Task task) {
        if (task.isSuccessful()) {
            String string = firebaseRemoteConfig.getString(KEY_GAMES_DATA);
            if (!string.isEmpty()) {
                onConfigFetchListener.onFetchSuccess(string);
                return;
            } else {
                onConfigFetchListener.onFetchFailure();
                return;
            }
        }
        onConfigFetchListener.onFetchFailure();
    }

    public static String getGamesData() {
        return FirebaseRemoteConfig.getInstance().getString(KEY_GAMES_DATA);
    }
}
