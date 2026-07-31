package com.linecorp.linesdk.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.linecorp.android.security.encryption.StringCipher;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class EncryptorHolder {
    private static final int DEFAULT_ITERATION_COUNT = 5000;
    private static final String ENCRYPTION_SALT_SHARED_PREFERENCE_NAME = "com.linecorp.linesdk.sharedpreference.encryptionsalt";
    private static final StringCipher ENCRYPTOR = new StringCipher(ENCRYPTION_SALT_SHARED_PREFERENCE_NAME, 5000, true);
    private static volatile boolean s_isInitializationStarted = false;

    private static class EncryptorInitializationTask implements Runnable {

        @NonNull
        private final Context context;

        EncryptorInitializationTask(@NonNull Context context) {
            this.context = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            EncryptorHolder.ENCRYPTOR.initialize(this.context);
        }
    }

    private EncryptorHolder() {
    }

    @NonNull
    public static StringCipher getEncryptor() {
        return ENCRYPTOR;
    }

    public static void initializeOnWorkerThread(@NonNull Context context) {
        if (s_isInitializationStarted) {
            return;
        }
        s_isInitializationStarted = true;
        Executors.newSingleThreadExecutor().execute(new EncryptorInitializationTask(context.getApplicationContext()));
    }
}
