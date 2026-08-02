package com.withpersona.sdk2.inquiry.shared.files;

import android.app.Application;
import java.io.File;
import java.util.UUID;

/* loaded from: classes9.dex */
public final class SdkFilesManager {
    public final File sessionCacheDir;
    public final File sessionDir;

    public SdkFilesManager(Application application) {
        application.getClass();
        File file = new File(application.getCacheDir(), ".com.withpersona.sdk2.inquiry");
        this.sessionDir = new File(new File(application.getFilesDir(), ".com.withpersona.sdk2.inquiry"), "sess");
        this.sessionCacheDir = new File(file, "sess");
    }

    public static void ensureFolder(File file) {
        if (file.exists()) {
            if (!file.isFile()) {
                return;
            } else {
                file.delete();
            }
        }
        file.mkdirs();
    }

    public final File newRandomSessionFile(String str) {
        File file = this.sessionDir;
        ensureFolder(file);
        return new File(file, UUID.randomUUID() + "." + str);
    }
}
