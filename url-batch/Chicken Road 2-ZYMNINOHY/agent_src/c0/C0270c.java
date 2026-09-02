package c0;

import T.C0086d;
import T.C0097o;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import v2.a0;
import v2.f0;
import v2.p0;

/* renamed from: c0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270c {

    /* renamed from: c, reason: collision with root package name */
    public static final C0270c f5542c = new C0270c(v2.I.o(C0269b.f5538d));

    /* renamed from: d, reason: collision with root package name */
    public static final a0 f5543d;

    /* renamed from: e, reason: collision with root package name */
    public static final f0 f5544e;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f5545a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final int f5546b;

    static {
        Object[] objArr = {2, 5, 6};
        v2.r.b(3, objArr);
        f5543d = v2.I.i(3, objArr);
        L3.h hVar = new L3.h(4);
        hVar.d(5, 6);
        hVar.d(17, 6);
        hVar.d(7, 6);
        hVar.d(30, 10);
        hVar.d(18, 6);
        hVar.d(6, 8);
        hVar.d(8, 8);
        hVar.d(14, 8);
        f5544e = hVar.a(true);
    }

    public C0270c(a0 a0Var) {
        for (int i4 = 0; i4 < a0Var.f15607d; i4++) {
            C0269b c0269b = (C0269b) a0Var.get(i4);
            this.f5545a.put(c0269b.f5539a, c0269b);
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f5545a.size(); i6++) {
            i5 = Math.max(i5, ((C0269b) this.f5545a.valueAt(i6)).f5540b);
        }
        this.f5546b = i5;
    }

    public static a0 a(int[] iArr, int i4) {
        v2.F j4 = v2.I.j();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i5 : iArr) {
            j4.b(new C0269b(i5, i4));
        }
        return j4.f();
    }

    public static C0270c b(Context context, C0086d c0086d, AudioDeviceInfo audioDeviceInfo) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c0086d, audioDeviceInfo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0232, code lost:
    
        if (r4.equals("Xiaomi") == false) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0270c c(Context context, Intent intent, C0086d c0086d, AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2;
        List audioDevicesForAttributes;
        boolean isDirectPlaybackSupported;
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        AudioManager j4 = U.i.j(context);
        if (audioDeviceInfo != null) {
            audioDeviceInfo2 = audioDeviceInfo;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                audioDevicesForAttributes = j4.getAudioDevicesForAttributes(c0086d.a());
                if (!audioDevicesForAttributes.isEmpty()) {
                    audioDeviceInfo2 = (AudioDeviceInfo) audioDevicesForAttributes.get(0);
                }
            }
            audioDeviceInfo2 = null;
        }
        int i4 = Build.VERSION.SDK_INT;
        f0 f0Var = f5544e;
        if (i4 >= 33 && (W.J.K(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            directProfilesForAttributes = j4.getDirectProfilesForAttributes(c0086d.a());
            HashMap hashMap = new HashMap();
            hashMap.put(2, new HashSet(O3.d.e(12)));
            for (int i5 = 0; i5 < directProfilesForAttributes.size(); i5++) {
                AudioProfile g4 = AbstractC0268a.g(directProfilesForAttributes.get(i5));
                encapsulationType = g4.getEncapsulationType();
                if (encapsulationType != 1) {
                    format = g4.getFormat();
                    if (W.J.H(format) || f0Var.containsKey(Integer.valueOf(format))) {
                        if (hashMap.containsKey(Integer.valueOf(format))) {
                            Set set = (Set) hashMap.get(Integer.valueOf(format));
                            set.getClass();
                            channelMasks2 = g4.getChannelMasks();
                            set.addAll(O3.d.e(channelMasks2));
                        } else {
                            Integer valueOf = Integer.valueOf(format);
                            channelMasks = g4.getChannelMasks();
                            hashMap.put(valueOf, new HashSet(O3.d.e(channelMasks)));
                        }
                    }
                }
            }
            v2.F j5 = v2.I.j();
            for (Map.Entry entry : hashMap.entrySet()) {
                j5.b(new C0269b(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new C0270c(j5.f());
        }
        AudioDeviceInfo[] devices = audioDeviceInfo2 == null ? j4.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo2};
        v2.L l4 = new v2.L(4);
        Integer[] numArr = {8, 7};
        v2.r.b(2, numArr);
        l4.d(2);
        System.arraycopy(numArr, 0, l4.f15559a, l4.f15560b, 2);
        l4.f15560b += 2;
        if (i4 >= 31) {
            Integer[] numArr2 = {26, 27};
            v2.r.b(2, numArr2);
            l4.d(2);
            System.arraycopy(numArr2, 0, l4.f15559a, l4.f15560b, 2);
            l4.f15560b += 2;
        }
        if (i4 >= 33) {
            l4.b(30);
        }
        v2.M f4 = l4.f();
        for (AudioDeviceInfo audioDeviceInfo3 : devices) {
            if (f4.contains(Integer.valueOf(audioDeviceInfo3.getType()))) {
                return f5542c;
            }
        }
        v2.L l5 = new v2.L(4);
        l5.b(2);
        if (Build.VERSION.SDK_INT >= 29 && (W.J.K(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            v2.F j6 = v2.I.j();
            p0 it = f0Var.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                if (Build.VERSION.SDK_INT >= W.J.q(intValue)) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), c0086d.a());
                    if (isDirectPlaybackSupported) {
                        j6.b(num);
                    }
                }
            }
            j6.b(2);
            a0 f5 = j6.f();
            f5.getClass();
            l5.c(f5);
            return new C0270c(a(O3.d.F(l5.f()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z) {
            String str = Build.MANUFACTURER;
            if (!str.equals("Amazon")) {
            }
        }
        if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            a0 a0Var = f5543d;
            a0Var.getClass();
            l5.c(a0Var);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new C0270c(a(O3.d.F(l5.f()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List e4 = O3.d.e(intArrayExtra);
            e4.getClass();
            l5.c(e4);
        }
        return new C0270c(a(O3.d.F(l5.f()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fb, code lost:
    
        if (r11 != 5) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair d(C0097o c0097o, C0086d c0086d) {
        boolean isDirectPlaybackSupported;
        int r4;
        String str = c0097o.n;
        str.getClass();
        int c4 = T.F.c(str, c0097o.f2866k);
        Integer valueOf = Integer.valueOf(c4);
        f0 f0Var = f5544e;
        if (!f0Var.containsKey(valueOf)) {
            return null;
        }
        int i4 = 6;
        SparseArray sparseArray = this.f5545a;
        if (c4 == 18 && !W.J.l(sparseArray, 18)) {
            c4 = 6;
        } else if ((c4 == 8 && !W.J.l(sparseArray, 8)) || (c4 == 30 && !W.J.l(sparseArray, 30))) {
            c4 = 7;
        }
        if (!W.J.l(sparseArray, c4)) {
            return null;
        }
        C0269b c0269b = (C0269b) sparseArray.get(c4);
        c0269b.getClass();
        int i5 = c0269b.f5540b;
        v2.M m4 = c0269b.f5541c;
        int i6 = c0097o.f2846F;
        boolean z = false;
        if (i6 == -1 || c4 == 18) {
            int i7 = c0097o.f2847G;
            if (i7 == -1) {
                i7 = 48000;
            }
            int i8 = c0269b.f5539a;
            if (m4 == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    i5 = 10;
                    while (true) {
                        if (i5 <= 0) {
                            i5 = 0;
                            break;
                        }
                        int r5 = W.J.r(i5);
                        if (r5 != 0) {
                            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i8).setSampleRate(i7).setChannelMask(r5).build(), c0086d.a());
                            if (isDirectPlaybackSupported) {
                                break;
                            }
                        }
                        i5--;
                    }
                } else {
                    Object obj = f0Var.get(Integer.valueOf(i8));
                    i5 = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
            i6 = i5;
        } else if (!c0097o.n.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (m4 != null) {
                int r6 = W.J.r(i6);
                if (r6 != 0) {
                    z = m4.contains(Integer.valueOf(r6));
                }
            } else if (i6 <= i5) {
                z = true;
            }
            if (!z) {
                return null;
            }
        } else if (i6 > 10) {
            return null;
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 <= 28) {
            if (i6 == 7) {
                i4 = 8;
            } else if (i6 != 3) {
                if (i6 != 4) {
                }
            }
            if (i9 <= 26 && "fugu".equals(Build.DEVICE) && i4 == 1) {
                i4 = 2;
            }
            r4 = W.J.r(i4);
            if (r4 != 0) {
                return null;
            }
            return Pair.create(Integer.valueOf(c4), Integer.valueOf(r4));
        }
        i4 = i6;
        if (i9 <= 26) {
            i4 = 2;
        }
        r4 = W.J.r(i4);
        if (r4 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r1 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean contentEquals;
        if (this != obj) {
            if (obj instanceof C0270c) {
                C0270c c0270c = (C0270c) obj;
                SparseArray sparseArray = c0270c.f5545a;
                String str = W.J.f3263a;
                SparseArray sparseArray2 = this.f5545a;
                if (sparseArray2 != null) {
                    if (sparseArray != null) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            contentEquals = sparseArray2.contentEquals(sparseArray);
                        } else {
                            int size = sparseArray2.size();
                            if (size == sparseArray.size()) {
                                for (int i4 = 0; i4 < size; i4++) {
                                    if (Objects.equals(sparseArray2.valueAt(i4), sparseArray.get(sparseArray2.keyAt(i4)))) {
                                    }
                                }
                                contentEquals = true;
                            }
                        }
                    }
                    contentEquals = false;
                    break;
                }
                if (!contentEquals || this.f5546b != c0270c.f5546b) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        String str = W.J.f3263a;
        int i5 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.f5545a;
        if (i5 >= 31) {
            i4 = sparseArray.contentHashCode();
        } else {
            i4 = 17;
            for (int i6 = 0; i6 < sparseArray.size(); i6++) {
                i4 = Objects.hashCode(sparseArray.valueAt(i6)) + ((sparseArray.keyAt(i6) + (i4 * 31)) * 31);
            }
        }
        return (i4 * 31) + this.f5546b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f5546b + ", audioProfiles=" + this.f5545a + "]";
    }
}
