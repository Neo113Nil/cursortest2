package com.bykv.vk.openvk.zmn.zmn.zmn.nps;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import com.applovin.sdk.AppLovinEventTypes;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class fb {
    public static JSONArray zmn() {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean isAlias;
        HashSet hashSet = new HashSet();
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (!mediaCodecInfo.isEncoder()) {
                if (Build.VERSION.SDK_INT >= 29) {
                    isAlias = mediaCodecInfo.isAlias();
                    if (isAlias) {
                    }
                }
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    if (str.equals("video/hevc") && (capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/hevc")) != null) {
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                            hashSet.add(zmn(codecProfileLevel.level));
                        }
                    }
                }
            }
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        return jSONArray;
    }

    private static String zmn(int i) {
        for (Field field : MediaCodecInfo.CodecProfileLevel.class.getFields()) {
            String name = field.getName();
            if (field.getType() == Integer.TYPE && name.contains("HEVC")) {
                try {
                    if (field.getInt(null) == i) {
                        return name;
                    }
                } catch (IllegalAccessException unused) {
                    continue;
                }
            }
        }
        return String.valueOf(i);
    }

    public static int zmn(File file) {
        FileInputStream fileInputStream;
        if (file != null && file.exists()) {
            long length = file.length();
            if (length <= 0) {
                return -1;
            }
            FileInputStream fileInputStream2 = null;
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Exception unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                byte[] bArr = new byte[8];
                long j = 0;
                while (fileInputStream.read(bArr) == 8) {
                    long j2 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (255 & bArr[3]);
                    if (bArr[4] == 109 && bArr[5] == 111 && bArr[6] == 111 && bArr[7] == 118) {
                        break;
                    }
                    long j3 = j2 - 8;
                    if (j3 > 0 && fileInputStream.skip(j3) < j3) {
                        break;
                    }
                    j += j2;
                }
                int i = (int) ((j * 100.0f) / length);
                try {
                    fileInputStream.close();
                } catch (Exception unused2) {
                }
                return i;
            } catch (Exception unused3) {
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (Exception unused4) {
                    }
                }
                return -1;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (Exception unused5) {
                    }
                }
                throw th;
            }
        }
        return -1;
    }

    public static int zmn(String str) {
        MediaExtractor mediaExtractor;
        try {
            mediaExtractor = new MediaExtractor();
        } catch (Throwable unused) {
            mediaExtractor = null;
        }
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            for (int i = 0; i < trackCount; i++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                String string = trackFormat.getString("mime");
                if (string != null && (("video/avc".equals(string) || "video/hevc".equals(string)) && trackFormat.containsKey(AppLovinEventTypes.USER_COMPLETED_LEVEL))) {
                    int integer = trackFormat.getInteger(AppLovinEventTypes.USER_COMPLETED_LEVEL);
                    mediaExtractor.release();
                    return integer;
                }
            }
        } catch (Throwable unused2) {
            if (mediaExtractor == null) {
                return -1;
            }
            mediaExtractor.release();
            return -1;
        }
        mediaExtractor.release();
        return -1;
    }
}
