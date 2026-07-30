package com.google.android.gms.fitness.data;

import androidx.annotation.Nullable;
import com.arthenica.ffmpegkit.x;
import com.github.mikephil.charting.utils.i;
import com.google.android.gms.common.internal.ShowFirstParty;
import d2.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzaj {
    public static final double zza;
    public static final double zzb;
    public static final double zzc;
    public static final Set zzd;
    private static final zzaj zze;
    private final Map zzf;
    private final Map zzg;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        zza = 10.0d / timeUnit.toNanos(1L);
        zzb = 2000.0d / TimeUnit.HOURS.toNanos(1L);
        zzc = 100.0d / timeUnit.toNanos(1L);
        zzd = Collections.unmodifiableSet(new HashSet(Arrays.asList("altitude", "duration", "food_item", "meal_type", "repetitions", "resistance", "resistance_type")));
        zze = new zzaj();
    }

    private zzaj() {
        HashMap hashMap = new HashMap();
        hashMap.put(c.XML_TAG_LATITUDE, new zzai(-90.0d, 90.0d, null));
        hashMap.put(c.XML_TAG_LONGITUDE, new zzai(-180.0d, 180.0d, null));
        hashMap.put("accuracy", new zzai(i.DOUBLE_EPSILON, 10000.0d, null));
        hashMap.put("bpm", new zzai(i.DOUBLE_EPSILON, 1000.0d, null));
        hashMap.put("altitude", new zzai(-100000.0d, 100000.0d, null));
        hashMap.put("percentage", new zzai(i.DOUBLE_EPSILON, 100.0d, null));
        hashMap.put("confidence", new zzai(i.DOUBLE_EPSILON, 100.0d, null));
        hashMap.put("duration", new zzai(i.DOUBLE_EPSILON, 9.223372036854776E18d, null));
        hashMap.put(x.KEY_HEIGHT, new zzai(i.DOUBLE_EPSILON, 3.0d, null));
        hashMap.put("weight", new zzai(i.DOUBLE_EPSILON, 1000.0d, null));
        hashMap.put("speed", new zzai(i.DOUBLE_EPSILON, 11000.0d, null));
        this.zzg = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("com.google.step_count.delta", zzd("steps", new zzai(i.DOUBLE_EPSILON, zza, null)));
        hashMap2.put("com.google.calories.expended", zzd(Field.NUTRIENT_CALORIES, new zzai(i.DOUBLE_EPSILON, zzb, null)));
        hashMap2.put("com.google.distance.delta", zzd("distance", new zzai(i.DOUBLE_EPSILON, zzc, null)));
        this.zzf = Collections.unmodifiableMap(hashMap2);
    }

    public static zzaj zzc() {
        return zze;
    }

    private static Map zzd(Object obj, Object obj2) {
        HashMap hashMap = new HashMap();
        hashMap.put(obj, obj2);
        return hashMap;
    }

    @Nullable
    public final zzai zza(String str) {
        return (zzai) this.zzg.get(str);
    }

    @Nullable
    public final zzai zzb(String str, String str2) {
        Map map = (Map) this.zzf.get(str);
        if (map != null) {
            return (zzai) map.get(str2);
        }
        return null;
    }
}
