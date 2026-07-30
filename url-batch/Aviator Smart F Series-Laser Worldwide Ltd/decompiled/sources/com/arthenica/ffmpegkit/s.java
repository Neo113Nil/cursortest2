package com.arthenica.ffmpegkit;

import io.reactivex.annotations.SchedulerSupport;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class s {
    private static final List<String> supportedExternalLibraries;

    static {
        ArrayList arrayList = new ArrayList();
        supportedExternalLibraries = arrayList;
        arrayList.add("dav1d");
        arrayList.add("fontconfig");
        arrayList.add("freetype");
        arrayList.add("fribidi");
        arrayList.add("gmp");
        arrayList.add("gnutls");
        arrayList.add("kvazaar");
        arrayList.add("mp3lame");
        arrayList.add("libass");
        arrayList.add("iconv");
        arrayList.add("libilbc");
        arrayList.add("libtheora");
        arrayList.add("libvidstab");
        arrayList.add("libvorbis");
        arrayList.add("libvpx");
        arrayList.add("libwebp");
        arrayList.add("libxml2");
        arrayList.add("opencore-amr");
        arrayList.add("openh264");
        arrayList.add("openssl");
        arrayList.add("opus");
        arrayList.add("rubberband");
        arrayList.add("sdl2");
        arrayList.add("shine");
        arrayList.add("snappy");
        arrayList.add("soxr");
        arrayList.add("speex");
        arrayList.add("srt");
        arrayList.add("tesseract");
        arrayList.add("twolame");
        arrayList.add("x264");
        arrayList.add("x265");
        arrayList.add("xvid");
        arrayList.add("zimg");
    }

    public static List<String> getExternalLibraries() {
        String nativeBuildConf = AbiDetect.getNativeBuildConf();
        ArrayList arrayList = new ArrayList();
        for (String str : supportedExternalLibraries) {
            if (!nativeBuildConf.contains("enable-" + str)) {
                if (nativeBuildConf.contains("enable-lib" + str)) {
                }
            }
            arrayList.add(str);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getPackageName() {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        List<String> externalLibraries = getExternalLibraries();
        boolean contains = externalLibraries.contains("speex");
        boolean contains2 = externalLibraries.contains("fribidi");
        boolean contains3 = externalLibraries.contains("gnutls");
        boolean contains4 = externalLibraries.contains("xvid");
        boolean z12 = true;
        boolean z13 = false;
        if (!contains || !contains2) {
            if (contains) {
                z7 = false;
                z8 = true;
            } else if (contains2) {
                z7 = true;
                z8 = false;
            } else if (!contains4) {
                z7 = false;
                z8 = false;
                if (contains3) {
                    z9 = false;
                    z10 = true;
                    z12 = false;
                }
            } else {
                if (!contains3) {
                    z7 = false;
                    z8 = false;
                    z9 = false;
                    z10 = false;
                    z12 = false;
                    z11 = true;
                    return !z12 ? (externalLibraries.contains("dav1d") && externalLibraries.contains("fontconfig") && externalLibraries.contains("freetype") && externalLibraries.contains("fribidi") && externalLibraries.contains("gmp") && externalLibraries.contains("gnutls") && externalLibraries.contains("kvazaar") && externalLibraries.contains("mp3lame") && externalLibraries.contains("libass") && externalLibraries.contains("iconv") && externalLibraries.contains("libilbc") && externalLibraries.contains("libtheora") && externalLibraries.contains("libvidstab") && externalLibraries.contains("libvorbis") && externalLibraries.contains("libvpx") && externalLibraries.contains("libwebp") && externalLibraries.contains("libxml2") && externalLibraries.contains("opencore-amr") && externalLibraries.contains("opus") && externalLibraries.contains("shine") && externalLibraries.contains("snappy") && externalLibraries.contains("soxr") && externalLibraries.contains("speex") && externalLibraries.contains("twolame") && externalLibraries.contains("x264") && externalLibraries.contains("x265") && externalLibraries.contains("xvid") && externalLibraries.contains("zimg")) ? "full-gpl" : SchedulerSupport.CUSTOM : z13 ? (externalLibraries.contains("dav1d") && externalLibraries.contains("fontconfig") && externalLibraries.contains("freetype") && externalLibraries.contains("fribidi") && externalLibraries.contains("gmp") && externalLibraries.contains("gnutls") && externalLibraries.contains("kvazaar") && externalLibraries.contains("mp3lame") && externalLibraries.contains("libass") && externalLibraries.contains("iconv") && externalLibraries.contains("libilbc") && externalLibraries.contains("libtheora") && externalLibraries.contains("libvorbis") && externalLibraries.contains("libvpx") && externalLibraries.contains("libwebp") && externalLibraries.contains("libxml2") && externalLibraries.contains("opencore-amr") && externalLibraries.contains("opus") && externalLibraries.contains("shine") && externalLibraries.contains("snappy") && externalLibraries.contains("soxr") && externalLibraries.contains("speex") && externalLibraries.contains("twolame") && externalLibraries.contains("zimg")) ? "full" : SchedulerSupport.CUSTOM : z7 ? (externalLibraries.contains("dav1d") && externalLibraries.contains("fontconfig") && externalLibraries.contains("freetype") && externalLibraries.contains("fribidi") && externalLibraries.contains("kvazaar") && externalLibraries.contains("libass") && externalLibraries.contains("iconv") && externalLibraries.contains("libtheora") && externalLibraries.contains("libvpx") && externalLibraries.contains("libwebp") && externalLibraries.contains("snappy") && externalLibraries.contains("zimg")) ? "video" : SchedulerSupport.CUSTOM : z8 ? (externalLibraries.contains("mp3lame") && externalLibraries.contains("libilbc") && externalLibraries.contains("libvorbis") && externalLibraries.contains("opencore-amr") && externalLibraries.contains("opus") && externalLibraries.contains("shine") && externalLibraries.contains("soxr") && externalLibraries.contains("speex") && externalLibraries.contains("twolame")) ? "audio" : SchedulerSupport.CUSTOM : z9 ? (externalLibraries.contains("gmp") && externalLibraries.contains("gnutls") && externalLibraries.contains("libvidstab") && externalLibraries.contains("x264") && externalLibraries.contains("x265") && externalLibraries.contains("xvid")) ? "https-gpl" : SchedulerSupport.CUSTOM : z10 ? (externalLibraries.contains("gmp") && externalLibraries.contains("gnutls")) ? "https" : SchedulerSupport.CUSTOM : z11 ? (externalLibraries.contains("libvidstab") && externalLibraries.contains("x264") && externalLibraries.contains("x265") && externalLibraries.contains("xvid")) ? "min-gpl" : SchedulerSupport.CUSTOM : externalLibraries.size() == 0 ? "min" : SchedulerSupport.CUSTOM;
                }
                z7 = false;
                z8 = false;
                z9 = true;
                z10 = false;
                z12 = false;
            }
            z9 = false;
            z10 = false;
            z12 = false;
        } else if (contains4) {
            z7 = false;
            z8 = false;
            z9 = false;
            z10 = false;
        } else {
            z7 = false;
            z8 = false;
            z9 = false;
            z10 = false;
            z12 = false;
            z13 = true;
        }
        z11 = false;
        if (!z12) {
        }
    }
}
