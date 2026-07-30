package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class XO {

    /* renamed from: e, reason: collision with root package name */
    public static final C3675oC f28641e;

    /* renamed from: f, reason: collision with root package name */
    public static final XO f28642f;

    /* renamed from: g, reason: collision with root package name */
    public static final C3675oC f28643g;

    /* renamed from: h, reason: collision with root package name */
    public static final C3944tC f28644h;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f28645a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final int f28646b;

    /* renamed from: c, reason: collision with root package name */
    public final UB f28647c;

    /* renamed from: d, reason: collision with root package name */
    public final UB f28648d;

    static {
        C3675oC j9 = UB.j(12);
        f28641e = j9;
        f28642f = new XO(UB.j(WO.f28388d), j9, C3675oC.f33115x);
        Object[] objArr = {2, 5, 6};
        PA.o(objArr, 3);
        f28643g = UB.p(objArr, 3);
        C3398j5 c3398j5 = new C3398j5(4);
        c3398j5.h(5, 6);
        c3398j5.h(17, 6);
        c3398j5.h(7, 6);
        c3398j5.h(30, 10);
        c3398j5.h(18, 6);
        c3398j5.h(6, 8);
        c3398j5.h(8, 8);
        c3398j5.h(14, 8);
        f28644h = c3398j5.s(true);
    }

    public XO(C3675oC c3675oC, UB ub, List list) {
        for (int i = 0; i < c3675oC.f33117w; i++) {
            WO wo = (WO) c3675oC.get(i);
            this.f28645a.put(wo.f28389a, wo);
        }
        int i4 = 0;
        for (int i9 = 0; i9 < this.f28645a.size(); i9++) {
            i4 = Math.max(i4, ((WO) this.f28645a.valueAt(i9)).f28390b);
        }
        this.f28646b = i4;
        this.f28647c = UB.n(ub);
        this.f28648d = UB.n(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x021a, code lost:
    
        if (r1.equals("Xiaomi") == false) goto L96;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static XO a(Context context, Intent intent, C2777Sj c2777Sj, AudioDeviceInfo audioDeviceInfo, List list) {
        int i;
        boolean isDirectPlaybackSupported;
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        List audioDevicesForAttributes;
        AudioManager b9 = AbstractC2655Lg.b(context);
        int i4 = 0;
        if (audioDeviceInfo == null) {
            if (Build.VERSION.SDK_INT >= 33) {
                audioDevicesForAttributes = b9.getAudioDevicesForAttributes(c2777Sj.a());
                if (!audioDevicesForAttributes.isEmpty()) {
                    audioDeviceInfo = (AudioDeviceInfo) audioDevicesForAttributes.get(0);
                }
            }
            audioDeviceInfo = null;
        }
        UB a9 = audioDeviceInfo != null ? JP.a(audioDeviceInfo) : f28641e;
        int i9 = Build.VERSION.SDK_INT;
        C3944tC c3944tC = f28644h;
        if (i9 >= 33 && (AbstractC3548lu.j(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            directProfilesForAttributes = b9.getDirectProfilesForAttributes(c2777Sj.a());
            HashMap hashMap = new HashMap();
            hashMap.put(2, new HashSet(AbstractC3194fG.E(12)));
            for (int i10 = 0; i10 < directProfilesForAttributes.size(); i10++) {
                AudioProfile f6 = TO.f(directProfilesForAttributes.get(i10));
                encapsulationType = f6.getEncapsulationType();
                if (encapsulationType != 1) {
                    format = f6.getFormat();
                    if (AbstractC3548lu.d(format) || c3944tC.containsKey(Integer.valueOf(format))) {
                        Integer valueOf = Integer.valueOf(format);
                        if (hashMap.containsKey(valueOf)) {
                            Set set = (Set) hashMap.get(valueOf);
                            set.getClass();
                            channelMasks2 = f6.getChannelMasks();
                            set.addAll(AbstractC3194fG.E(channelMasks2));
                        } else {
                            channelMasks = f6.getChannelMasks();
                            hashMap.put(valueOf, new HashSet(AbstractC3194fG.E(channelMasks)));
                        }
                    }
                }
            }
            SB sb = UB.f27942u;
            AbstractC2720Pd.p(4, "initialCapacity");
            Object[] objArr = new Object[4];
            for (Map.Entry entry : hashMap.entrySet()) {
                WO wo = new WO(((Integer) entry.getKey()).intValue(), (Set) entry.getValue());
                int length = objArr.length;
                int i11 = i4 + 1;
                int d2 = PB.d(length, i11);
                if (d2 > length) {
                    objArr = Arrays.copyOf(objArr, d2);
                }
                objArr[i4] = wo;
                i4 = i11;
            }
            return new XO(UB.p(objArr, i4), a9, list);
        }
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfo == null ? b9.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo}) {
            if (AbstractC4161xD.d(audioDeviceInfo2.getType())) {
                return new XO(UB.j(WO.f28388d), a9, list);
            }
        }
        ZB zb = new ZB(4);
        zb.f(2);
        if (Build.VERSION.SDK_INT < 29 || !(AbstractC3548lu.j(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            ContentResolver contentResolver = context.getContentResolver();
            boolean z8 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
            if (!z8) {
                String str = Build.MANUFACTURER;
                if (!str.equals("Amazon")) {
                }
            }
            if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                zb.g(f28643g);
            }
            if (intent == null || z8 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
                return new XO(c(AbstractC3194fG.D(zb.h()), 10), a9, list);
            }
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                zb.g(AbstractC3194fG.E(intArrayExtra));
            }
            return new XO(c(AbstractC3194fG.D(zb.h()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)), a9, list);
        }
        SB sb2 = UB.f27942u;
        RB rb = new RB(4);
        C3836rC c3836rC = c3944tC.f34379u;
        if (c3836rC == null) {
            C3836rC c3836rC2 = new C3836rC(c3944tC, new C3890sC(c3944tC.f34382x, 0, c3944tC.f34383y));
            c3944tC.f34379u = c3836rC2;
            c3836rC = c3836rC2;
        }
        CC a10 = c3836rC.a();
        while (a10.hasNext()) {
            Integer num = (Integer) a10.next();
            int intValue = num.intValue();
            switch (intValue) {
                case 2:
                case 3:
                    i = 3;
                    break;
                case 4:
                case 5:
                case 6:
                    i = 21;
                    break;
                case 7:
                case 8:
                    i = 23;
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                    i = 28;
                    break;
                case 13:
                case 19:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                default:
                    i = Integer.MAX_VALUE;
                    break;
                case 14:
                    i = 25;
                    break;
                case 20:
                    i = 30;
                    break;
                case 21:
                case 22:
                    i = 31;
                    break;
                case 30:
                case 31:
                    i = 34;
                    break;
            }
            if (Build.VERSION.SDK_INT >= i) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), c2777Sj.a());
                if (isDirectPlaybackSupported) {
                    rb.a(num);
                }
            }
        }
        rb.a(2);
        zb.g(rb.f());
        return new XO(c(AbstractC3194fG.D(zb.h()), 10), a9, list);
    }

    public static C3675oC c(int[] iArr, int i) {
        SB sb = UB.f27942u;
        AbstractC2720Pd.p(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i4 = 0;
        if (iArr == null) {
            iArr = new int[0];
        }
        int i9 = 0;
        while (i4 < iArr.length) {
            WO wo = new WO(iArr[i4], i);
            int length = objArr.length;
            int i10 = i9 + 1;
            int d2 = PB.d(length, i10);
            if (d2 > length) {
                objArr = Arrays.copyOf(objArr, d2);
            }
            objArr[i9] = wo;
            i4++;
            i9 = i10;
        }
        return UB.p(objArr, i9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0046, code lost:
    
        if (r5.indexOfKey(30) < 0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair b(TP tp, C2777Sj c2777Sj) {
        boolean isDirectPlaybackSupported;
        int i;
        String str = tp.f27776o;
        str.getClass();
        int g9 = K4.g(str, tp.f27772k);
        Integer valueOf = Integer.valueOf(g9);
        C3944tC c3944tC = f28644h;
        if (!c3944tC.containsKey(valueOf)) {
            return null;
        }
        SparseArray sparseArray = this.f28645a;
        if (g9 == 18) {
            if (sparseArray.indexOfKey(18) >= 0) {
                g9 = 18;
            } else {
                g9 = 6;
                if (sparseArray.indexOfKey(g9) < 0) {
                    return null;
                }
                WO wo = (WO) sparseArray.get(g9);
                wo.getClass();
                int i4 = 0;
                r11 = false;
                boolean contains = false;
                int i9 = 10;
                int i10 = tp.f27755H;
                int i11 = tp.f27754G;
                int i12 = wo.f28390b;
                AbstractC2917aC abstractC2917aC = wo.f28391c;
                if (i11 == -1 || g9 == 18) {
                    int i13 = tp.f27756I;
                    if (i13 == -1) {
                        i13 = 48000;
                    }
                    if (abstractC2917aC != null) {
                        i4 = i12;
                    } else {
                        int i14 = Build.VERSION.SDK_INT;
                        int i15 = wo.f28389a;
                        if (i14 >= 29) {
                            while (true) {
                                if (i9 <= 0) {
                                    break;
                                }
                                int e6 = AbstractC3548lu.e(i9);
                                if (e6 != 0) {
                                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i15).setSampleRate(i13).setChannelMask(e6).build(), c2777Sj.a());
                                    if (isDirectPlaybackSupported) {
                                        i4 = i9;
                                        break;
                                    }
                                }
                                i9--;
                            }
                        } else {
                            Object obj = c3944tC.get(Integer.valueOf(i15));
                            i4 = ((Integer) (obj != null ? obj : 0)).intValue();
                        }
                    }
                } else {
                    if (!str.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
                        if (abstractC2917aC != null) {
                            int e9 = i10 != -1 ? i10 : AbstractC3548lu.e(i11);
                            if (e9 != 0) {
                                contains = abstractC2917aC.contains(Integer.valueOf(e9));
                            }
                        } else if (i11 <= i12) {
                            contains = true;
                        }
                        if (!contains) {
                            return null;
                        }
                    } else if (i11 > 10) {
                        return null;
                    }
                    i4 = i11;
                }
                int i16 = Build.VERSION.SDK_INT;
                if (i16 <= 28) {
                    if (i4 == 7) {
                        i = 8;
                    } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                        i = 6;
                    }
                    if (i16 <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
                        i = 2;
                    }
                    if (i10 != -1 || i11 != i) {
                        i10 = AbstractC3548lu.e(i);
                    }
                    if (i10 == 0) {
                        return Pair.create(Integer.valueOf(g9), Integer.valueOf(i10));
                    }
                    return null;
                }
                i = i4;
                if (i16 <= 26) {
                    i = 2;
                }
                if (i10 != -1) {
                }
                i10 = AbstractC3548lu.e(i);
                if (i10 == 0) {
                }
            }
        }
        if (g9 == 8) {
            if (sparseArray.indexOfKey(8) >= 0) {
                g9 = 8;
            }
            g9 = 7;
            if (sparseArray.indexOfKey(g9) < 0) {
            }
        }
        if (g9 == 30) {
        }
        if (sparseArray.indexOfKey(g9) < 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r1 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean contentEquals;
        if (this != obj) {
            if (obj instanceof XO) {
                XO xo = (XO) obj;
                SparseArray sparseArray = this.f28645a;
                SparseArray sparseArray2 = xo.f28645a;
                String str = AbstractC3548lu.f32613a;
                if (Build.VERSION.SDK_INT >= 31) {
                    contentEquals = sparseArray.contentEquals(sparseArray2);
                } else {
                    int size = sparseArray.size();
                    if (size == sparseArray2.size()) {
                        for (int i = 0; i < size; i++) {
                            if (!Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                                break;
                            }
                        }
                        if (this.f28646b != xo.f28646b || !Objects.equals(this.f28647c, xo.f28647c) || !Objects.equals(this.f28648d, xo.f28648d)) {
                            break;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        String str = AbstractC3548lu.f32613a;
        int i4 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.f28645a;
        if (i4 >= 31) {
            i = sparseArray.contentHashCode();
        } else {
            int i9 = 17;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                i9 = Objects.hashCode(sparseArray.valueAt(i10)) + ((sparseArray.keyAt(i10) + (i9 * 31)) * 31);
            }
            i = i9;
        }
        return Objects.hashCode(this.f28648d) + ((Objects.hashCode(this.f28647c) + (((this.f28646b * 31) + i) * 31)) * 31);
    }

    public final String toString() {
        String obj = this.f28645a.toString();
        String valueOf = String.valueOf(this.f28647c);
        String valueOf2 = String.valueOf(this.f28648d);
        int i = this.f28646b;
        int length = String.valueOf(i).length();
        int length2 = obj.length();
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 28 + valueOf.length() + 26 + valueOf2.length() + 1);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", audioProfiles=");
        sb.append(obj);
        AbstractC5051n.j(sb, ", speakerLayoutChannelMasks=", valueOf, ", spatializerChannelMasks=", valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
