package com.artillery.ctc.uitls;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import androidx.annotation.Keep;
import java.io.File;
import y.d;

@Keep
/* loaded from: classes.dex */
public final class PathUtils {
    private static final char SEP = File.separatorChar;

    private PathUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static String getAbsolutePath(File file) {
        return file == null ? "" : file.getAbsolutePath();
    }

    public static String getAppDataPathExternalFirst() {
        String externalAppDataPath = getExternalAppDataPath();
        return TextUtils.isEmpty(externalAppDataPath) ? getInternalAppDataPath() : externalAppDataPath;
    }

    public static String getCachePathExternalFirst() {
        String externalAppCachePath = getExternalAppCachePath();
        return TextUtils.isEmpty(externalAppCachePath) ? getInternalAppCachePath() : externalAppCachePath;
    }

    public static String getDataPath() {
        return getAbsolutePath(Environment.getDataDirectory());
    }

    public static String getDownloadCachePath() {
        return getAbsolutePath(Environment.getDownloadCacheDirectory());
    }

    public static String getExternalAlarmsPath() {
        return !SDCardUtils.isSDCardEnableByEnvironment() ? "" : getAbsolutePath(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_ALARMS));
    }

    public static String getExternalAppAlarmsPath() {
        return !SDCardUtils.isSDCardEnableByEnvironment() ? "" : getAbsolutePath(d.a().getExternalFilesDir(Environment.DIRECTORY_ALARMS));
    }

    public static String getExternalAppCachePath() {
        return !SDCardUtils.isSDCardEnableByEnvironment() ? "" : getAbsolutePath(d.a().getExternalCacheDir());
    }

    public static String getExternalAppDataPath() {
        File externalCacheDir;
        return (SDCardUtils.isSDCardEnableByEnvironment() && (externalCacheDir = d.a().getExternalCacheDir()) != null) ? getAbsolutePath(externalCacheDir.getParentFile()) : "";
    }

    public static String getExternalAppDcimPath() {
        return !SDCardUtils.isSDCardEnableByEnvironment() ? "" : getAbsolutePath(d.a().getExternalFilesDir(Environment.DIRECTORY_DCIM));
    }

    public static String getExternalAppDocumentsPath() {
        return !SDCardUtils.isSDCardEnableByEnvironment() ? "" : getAbsolutePath(d.a().getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS));
    }

    public static String getExternalAppDownloadPath() {
        return !SDCardUtils.isSDCardEnableByEnvironment() ? "" : getAbsolutePath(d.a().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS));
    }

    public static String getExternalAppFilesPath() {
        return !SDCardUtils.isSDCardEnableByEnvironment() ? "" : getAbsolutePath(d.a().getExternalFilesDir(null));
    }

    public static String getExternalAppMoviesPath() {
        return !SDCardUtils.isSDCardEnableByEnvironment() ? "" : getAbsolutePath(d.a().getExternalFilesDir(Environment.DIRECTORY_MOVIES));
    }

    public static String getExternalAppMusicPath() {
        return !SDCardUtils.isSDCardEnableByEnvironment() ? "" : getAbsolutePath(d.a().getExternalFilesDir(Environment.DIRECTORY_MUSIC));
    }

    public static String getExternalAppNotificationsPath() {
        return !SDCardUtils.isSDCardEnableByEnvironment() ? "" : getAbsolutePath(d.a().getExternalFilesDir(Environment.DIRECTORY_NOTIFICATIONS));
    }

    public static String getExternalAppObbPath() {
        return !SDCardUtils.isSDCardEnableByEnvironment() ? "" : getAbsolutePath(d.a().getObbDir());
    }

    public static String getExternalAppPicturesPath() {
        return !SDCardUtils.isSDCardEnableByEnvironment() ? "" : getAbsolutePath(d.a().getExternalFilesDir(Environment.DIRECTORY_PICTURES));
    }

    public static String getExternalAppPodcastsPath() {
        return !SDCardUtils.isSDCardEnableByEnvironment() ? "" : getAbsolutePath(d.a().getExternalFilesDir(Environment.DIRECTORY_PODCASTS));
    }

    public static String getExternalAppRingtonesPath() {
        return !SDCardUtils.isSDCardEnableByEnvironment() ? "" : getAbsolutePath(d.a().getExternalFilesDir(Environment.DIRECTORY_RINGTONES));
    }

    public static String getExternalDcimPath() {
        return !SDCardUtils.isSDCardEnableByEnvironment() ? "" : getAbsolutePath(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM));
    }

    public static String getExternalDocumentsPath() {
        return !SDCardUtils.isSDCardEnableByEnvironment() ? "" : getAbsolutePath(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS));
    }

    public static String getExternalDownloadsPath() {
        return !SDCardUtils.isSDCardEnableByEnvironment() ? "" : getAbsolutePath(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
    }

    public static String getExternalMoviesPath() {
        return !SDCardUtils.isSDCardEnableByEnvironment() ? "" : getAbsolutePath(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES));
    }

    public static String getExternalMusicPath() {
        return !SDCardUtils.isSDCardEnableByEnvironment() ? "" : getAbsolutePath(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC));
    }

    public static String getExternalNotificationsPath() {
        return !SDCardUtils.isSDCardEnableByEnvironment() ? "" : getAbsolutePath(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_NOTIFICATIONS));
    }

    public static String getExternalPicturesPath() {
        return !SDCardUtils.isSDCardEnableByEnvironment() ? "" : getAbsolutePath(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES));
    }

    public static String getExternalPodcastsPath() {
        return !SDCardUtils.isSDCardEnableByEnvironment() ? "" : getAbsolutePath(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PODCASTS));
    }

    public static String getExternalRingtonesPath() {
        return !SDCardUtils.isSDCardEnableByEnvironment() ? "" : getAbsolutePath(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_RINGTONES));
    }

    public static String getExternalStoragePath() {
        return !SDCardUtils.isSDCardEnableByEnvironment() ? "" : getAbsolutePath(Environment.getExternalStorageDirectory());
    }

    public static String getFilesPathExternalFirst() {
        String externalAppFilesPath = getExternalAppFilesPath();
        return TextUtils.isEmpty(externalAppFilesPath) ? getInternalAppFilesPath() : externalAppFilesPath;
    }

    public static String getInternalAppCachePath() {
        return getAbsolutePath(d.a().getCacheDir());
    }

    public static String getInternalAppCodeCacheDir() {
        return getAbsolutePath(d.a().getCodeCacheDir());
    }

    public static String getInternalAppDataPath() {
        File dataDir;
        if (Build.VERSION.SDK_INT < 24) {
            return d.a().getApplicationInfo().dataDir;
        }
        dataDir = d.a().getDataDir();
        return getAbsolutePath(dataDir);
    }

    public static String getInternalAppDbPath(String str) {
        return getAbsolutePath(d.a().getDatabasePath(str));
    }

    public static String getInternalAppDbsPath() {
        return d.a().getApplicationInfo().dataDir + "/databases";
    }

    public static String getInternalAppFilesPath() {
        return getAbsolutePath(d.a().getFilesDir());
    }

    public static String getInternalAppNoBackupFilesPath() {
        return getAbsolutePath(d.a().getNoBackupFilesDir());
    }

    public static String getInternalAppSpPath() {
        return d.a().getApplicationInfo().dataDir + "/shared_prefs";
    }

    private static String getLegalSegment(String str) {
        char[] charArray = str.toCharArray();
        int i8 = -1;
        int i9 = -1;
        for (int i10 = 0; i10 < charArray.length; i10++) {
            if (charArray[i10] != SEP) {
                if (i8 == -1) {
                    i8 = i10;
                }
                i9 = i10;
            }
        }
        if (i8 >= 0 && i9 >= i8) {
            return str.substring(i8, i9 + 1);
        }
        throw new IllegalArgumentException("segment of <" + str + "> is illegal");
    }

    public static String getRootPath() {
        return getAbsolutePath(Environment.getRootDirectory());
    }

    public static String getRootPathExternalFirst() {
        String externalStoragePath = getExternalStoragePath();
        return TextUtils.isEmpty(externalStoragePath) ? getRootPath() : externalStoragePath;
    }

    public static String join(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        if (str == null) {
            str = "";
        }
        int length = str.length();
        String legalSegment = getLegalSegment(str2);
        if (length == 0) {
            return SEP + legalSegment;
        }
        char charAt = str.charAt(length - 1);
        char c8 = SEP;
        if (charAt == c8) {
            return str + legalSegment;
        }
        return str + c8 + legalSegment;
    }
}
