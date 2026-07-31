package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import android.util.Pair;
import com.ironsource.b9;
import com.yandex.mobile.ads.impl.sj0;
import com.yandex.mobile.ads.impl.tj0;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.yandex.mobile.ads.impl.eh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1904eh {

    /* renamed from: c, reason: collision with root package name */
    private static final C1928fh f25290c = hm1.a();

    /* renamed from: d, reason: collision with root package name */
    public static final C1904eh f25291d = new C1904eh(new int[]{2}, 8);

    /* renamed from: e, reason: collision with root package name */
    private static final C1904eh f25292e = new C1904eh(new int[]{2, 5, 6}, 8);

    /* renamed from: f, reason: collision with root package name */
    private static final tj0<Integer, Integer> f25293f = new tj0.a().a((tj0.a) 5, 6).a((tj0.a) 17, 6).a((tj0.a) 7, 6).a((tj0.a) 18, 6).a((tj0.a) 6, 8).a((tj0.a) 8, 8).a((tj0.a) 14, 8).a();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f25294a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25295b;

    public C1904eh(int[] iArr, int i4) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f25294a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f25294a = new int[0];
        }
        this.f25295b = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1904eh)) {
            return false;
        }
        C1904eh c1904eh = (C1904eh) obj;
        return Arrays.equals(this.f25294a, c1904eh.f25294a) && this.f25295b == c1904eh.f25295b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f25294a) * 31) + this.f25295b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f25295b + ", supportedEncodings=" + Arrays.toString(this.f25294a) + b9.i.f15552e;
    }

    public static C1904eh a(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        int i4 = u82.f32873a;
        if (i4 >= 17) {
            C1928fh c1928fh = f25290c;
            String a4 = c1928fh.a();
            String str = u82.f32875c;
            if ((a4.equals(str) || c1928fh.c().equals(str)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                return f25292e;
            }
        }
        return (i4 < 29 || (!u82.d(context) && (i4 < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) ? (registerReceiver == null || registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f25291d : new C1904eh(registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)) : new C1904eh(a.a(), 8);
    }

    /* renamed from: com.yandex.mobile.ads.impl.eh$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final AudioAttributes f25296a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        public static int a(int i4, int i5) {
            boolean isDirectPlaybackSupported;
            for (int i6 = 8; i6 > 0; i6--) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i4).setSampleRate(i5).setChannelMask(u82.a(i6)).build(), f25296a);
                if (isDirectPlaybackSupported) {
                    return i6;
                }
            }
            return 0;
        }

        public static int[] a() {
            boolean isDirectPlaybackSupported;
            int i4 = sj0.f31764d;
            sj0.a aVar = new sj0.a();
            Iterator it = C1904eh.f25293f.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(num.intValue()).setSampleRate(48000).build(), f25296a);
                if (isDirectPlaybackSupported) {
                    aVar.b(num);
                }
            }
            aVar.b((Object) 2);
            return pp0.a(aVar.a());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0087, code lost:
    
        if (r7 != 5) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<Integer, Integer> a(yb0 yb0Var) {
        int a4;
        String str = yb0Var.f34991m;
        str.getClass();
        int b4 = i01.b(str, yb0Var.f34988j);
        tj0<Integer, Integer> tj0Var = f25293f;
        if (!tj0Var.containsKey(Integer.valueOf(b4))) {
            return null;
        }
        int i4 = 6;
        if (b4 == 18 && Arrays.binarySearch(this.f25294a, 18) < 0) {
            b4 = 6;
        } else if (b4 == 8 && Arrays.binarySearch(this.f25294a, 8) < 0) {
            b4 = 7;
        }
        if (Arrays.binarySearch(this.f25294a, b4) < 0) {
            return null;
        }
        int i5 = yb0Var.f35004z;
        if (i5 != -1 && b4 != 18) {
            if (i5 > this.f25295b) {
                return null;
            }
        } else {
            int i6 = yb0Var.f34973A;
            if (i6 == -1) {
                i6 = 48000;
            }
            if (u82.f32873a >= 29) {
                i5 = a.a(b4, i6);
            } else {
                Integer num = tj0Var.get(Integer.valueOf(b4));
                i5 = (num != null ? num : 0).intValue();
            }
        }
        int i7 = u82.f32873a;
        if (i7 <= 28) {
            if (i5 == 7) {
                i4 = 8;
            } else if (i5 != 3) {
                if (i5 != 4) {
                }
            }
            if (i7 <= 26 && f25290c.b().equals(u82.f32874b) && i4 == 1) {
                i4 = 2;
            }
            a4 = u82.a(i4);
            if (a4 != 0) {
                return null;
            }
            return Pair.create(Integer.valueOf(b4), Integer.valueOf(a4));
        }
        i4 = i5;
        if (i7 <= 26) {
            i4 = 2;
        }
        a4 = u82.a(i4);
        if (a4 != 0) {
        }
    }
}
