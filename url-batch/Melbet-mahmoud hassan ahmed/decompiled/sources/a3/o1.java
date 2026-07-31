package a3;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: b, reason: collision with root package name */
    private static List<MediaCodecInfo> f125b;

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, List<Map<String, Object>>> f124a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f126c = new Object();

    @TargetApi(16)
    public static List<Map<String, Object>> a(String str) {
        ArrayList arrayList;
        Object obj = f126c;
        synchronized (obj) {
            Map<String, List<Map<String, Object>>> map = f124a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            try {
                synchronized (obj) {
                    if (f125b == null) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            f125b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        } else {
                            int codecCount = MediaCodecList.getCodecCount();
                            f125b = new ArrayList(codecCount);
                            for (int i7 = 0; i7 < codecCount; i7++) {
                                f125b.add(MediaCodecList.getCodecInfoAt(i7));
                            }
                        }
                    }
                    arrayList = new ArrayList();
                    for (MediaCodecInfo mediaCodecInfo : f125b) {
                        if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("codecName", mediaCodecInfo.getName());
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                            ArrayList arrayList2 = new ArrayList();
                            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                            }
                            hashMap.put("profileLevels", arrayList2);
                            int i8 = Build.VERSION.SDK_INT;
                            if (i8 >= 21) {
                                MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                                hashMap.put("bitRatesBps", b(videoCapabilities.getBitrateRange()));
                                hashMap.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                                hashMap.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                                hashMap.put("frameRates", b(videoCapabilities.getSupportedFrameRates()));
                                hashMap.put("widths", b(videoCapabilities.getSupportedWidths()));
                                hashMap.put("heights", b(videoCapabilities.getSupportedHeights()));
                            }
                            if (i8 >= 23) {
                                hashMap.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                            }
                            arrayList.add(hashMap);
                        }
                    }
                    f124a.put(str, arrayList);
                }
                return arrayList;
            } catch (LinkageError | RuntimeException e7) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("error", e7.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(hashMap2);
                f124a.put(str, arrayList3);
                return arrayList3;
            }
        }
    }

    @TargetApi(21)
    private static Integer[] b(Range<Integer> range) {
        return new Integer[]{range.getLower(), range.getUpper()};
    }
}
