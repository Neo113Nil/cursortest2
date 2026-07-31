package t0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import android.util.Pair;
import java.util.Arrays;
import m4.q;
import m4.r;
import m4.s0;
import o2.m0;
import r0.s1;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f21734c = new f(new int[]{2}, 8);

    /* renamed from: d, reason: collision with root package name */
    private static final f f21735d = new f(new int[]{2, 5, 6}, 8);

    /* renamed from: e, reason: collision with root package name */
    private static final m4.r<Integer, Integer> f21736e = new r.a().d(5, 6).d(17, 6).d(7, 6).d(18, 6).d(6, 8).d(8, 8).d(14, 8).b();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f21737a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21738b;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final AudioAttributes f21739a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        /* JADX WARN: Multi-variable type inference failed */
        public static int[] a() {
            q.a r7 = m4.q.r();
            s0 it = f.f21736e.keySet().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f21739a)) {
                    r7.a(Integer.valueOf(intValue));
                }
            }
            r7.a(2);
            return o4.d.k(r7.h());
        }

        public static int b(int i7, int i8) {
            for (int i9 = 8; i9 > 0; i9--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i7).setSampleRate(i8).setChannelMask(m0.G(i9)).build(), f21739a)) {
                    return i9;
                }
            }
            return 0;
        }
    }

    public f(int[] iArr, int i7) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f21737a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f21737a = new int[0];
        }
        this.f21738b = i7;
    }

    private static boolean b() {
        if (m0.f19752a >= 17) {
            String str = m0.f19754c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static f c(Context context) {
        return d(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    static f d(Context context, Intent intent) {
        return (b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) ? f21735d : (m0.f19752a < 29 || !(m0.w0(context) || m0.r0(context))) ? (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f21734c : new f(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)) : new f(a.a(), 8);
    }

    private static int e(int i7) {
        int i8 = m0.f19752a;
        if (i8 <= 28) {
            if (i7 == 7) {
                i7 = 8;
            } else if (i7 == 3 || i7 == 4 || i7 == 5) {
                i7 = 6;
            }
        }
        if (i8 <= 26 && "fugu".equals(m0.f19753b) && i7 == 1) {
            i7 = 2;
        }
        return m0.G(i7);
    }

    private static int g(int i7, int i8) {
        return m0.f19752a >= 29 ? a.b(i7, i8) : ((Integer) o2.a.e(f21736e.getOrDefault(Integer.valueOf(i7), 0))).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Arrays.equals(this.f21737a, fVar.f21737a) && this.f21738b == fVar.f21738b;
    }

    public Pair<Integer, Integer> f(s1 s1Var) {
        int f7 = o2.v.f((String) o2.a.e(s1Var.f20956q), s1Var.f20953n);
        if (!f21736e.containsKey(Integer.valueOf(f7))) {
            return null;
        }
        if (f7 == 18 && !i(18)) {
            f7 = 6;
        } else if (f7 == 8 && !i(8)) {
            f7 = 7;
        }
        if (!i(f7)) {
            return null;
        }
        int i7 = s1Var.D;
        if (i7 == -1 || f7 == 18) {
            int i8 = s1Var.E;
            if (i8 == -1) {
                i8 = 48000;
            }
            i7 = g(f7, i8);
        } else if (i7 > this.f21738b) {
            return null;
        }
        int e7 = e(i7);
        if (e7 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(f7), Integer.valueOf(e7));
    }

    public boolean h(s1 s1Var) {
        return f(s1Var) != null;
    }

    public int hashCode() {
        return this.f21738b + (Arrays.hashCode(this.f21737a) * 31);
    }

    public boolean i(int i7) {
        return Arrays.binarySearch(this.f21737a, i7) >= 0;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f21738b + ", supportedEncodings=" + Arrays.toString(this.f21737a) + "]";
    }
}
