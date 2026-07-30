package com.arthenica.ffmpegkit;

import android.os.Build;
import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class r {
    static final String[] FFMPEG_LIBRARIES = {"avutil", "swscale", "swresample", "avcodec", "avformat", "avfilter", "avdevice"};
    static final String[] LIBRARIES_LINKED_WITH_CXX = {"chromaprint", "openh264", "rubberband", "snappy", "srt", "tesseract", "x265", "zimg", "libilbc"};

    static void enableRedirection() {
        if (isTestModeDisabled()) {
            FFmpegKitConfig.enableRedirection();
        }
    }

    static String getDeviceDebugInformation() {
        return "brand: " + Build.BRAND + ", model: " + Build.MODEL + ", device: " + Build.DEVICE + ", api level: " + Build.VERSION.SDK_INT + ", abis: " + FFmpegKitConfig.argumentsToString(Build.SUPPORTED_ABIS) + ", 32bit abis: " + FFmpegKitConfig.argumentsToString(Build.SUPPORTED_32_BIT_ABIS) + ", 64bit abis: " + FFmpegKitConfig.argumentsToString(Build.SUPPORTED_64_BIT_ABIS);
    }

    static boolean isTestModeDisabled() {
        return System.getProperty("enable.ffmpeg.kit.test.mode") == null;
    }

    static String loadAbi() {
        return isTestModeDisabled() ? AbiDetect.getAbi() : Abi.ABI_X86_64.getName();
    }

    static String loadBuildDate() {
        return isTestModeDisabled() ? FFmpegKitConfig.getBuildDate() : new SimpleDateFormat(cn.hutool.core.date.d.PURE_DATE_PATTERN, Locale.getDefault()).format(new Date());
    }

    private static List<String> loadExternalLibraries() {
        return isTestModeDisabled() ? s.getExternalLibraries() : Collections.emptyList();
    }

    static boolean loadFFmpeg() {
        return false;
    }

    static void loadFFmpegKit(boolean z7) {
        boolean z8;
        if (!z7 && "arm-v7a".equals(loadNativeAbi())) {
            try {
                loadLibrary("ffmpegkit_armv7a_neon");
            } catch (Error e8) {
                e = e8;
                z8 = false;
            }
            try {
                AbiDetect.setArmV7aNeonLoaded();
                return;
            } catch (Error e9) {
                e = e9;
                z8 = true;
                Log.i("ffmpeg-kit", String.format("NEON supported armeabi-v7a ffmpegkit library not found. Loading default armeabi-v7a library.%s", com.arthenica.smartexception.java.a.getStackTraceString(e)));
                if (z8) {
                    return;
                }
                loadLibrary("ffmpegkit");
            }
        }
        loadLibrary("ffmpegkit");
    }

    static void loadFFmpegKitAbiDetect() {
        loadLibrary("ffmpegkit_abidetect");
    }

    static boolean loadIsLTSBuild() {
        if (isTestModeDisabled()) {
            return AbiDetect.isNativeLTSBuild();
        }
        return true;
    }

    private static void loadLibrary(String str) {
        if (isTestModeDisabled()) {
            try {
                System.loadLibrary(str);
            } catch (UnsatisfiedLinkError e8) {
                throw new Error(String.format("FFmpegKit failed to start on %s.", getDeviceDebugInformation()), e8);
            }
        }
    }

    static int loadLogLevel() {
        return isTestModeDisabled() ? FFmpegKitConfig.getNativeLogLevel() : Level.AV_LOG_DEBUG.getValue();
    }

    private static String loadNativeAbi() {
        return isTestModeDisabled() ? AbiDetect.getNativeAbi() : Abi.ABI_X86_64.getName();
    }

    static String loadPackageName() {
        return isTestModeDisabled() ? s.getPackageName() : "test";
    }

    static String loadVersion() {
        return isTestModeDisabled() ? FFmpegKitConfig.getVersion() : loadIsLTSBuild() ? String.format("%s-lts", "6.0") : "6.0";
    }
}
