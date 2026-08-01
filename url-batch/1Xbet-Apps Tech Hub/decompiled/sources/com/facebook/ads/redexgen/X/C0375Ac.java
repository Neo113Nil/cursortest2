package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.Ac, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0375Ac {
    public static byte[] A0P;
    public static String[] A0Q = {"G0ejmsNLWo5N4HwPMLJOyhcWTLvm5k", "AaVAi8kEbPSTq7WMPq", "3SFwMFVKqfYZc9yidXjkKt9eYi", "MpavoNzourXMB6MEjk2fzdRtD4ZxlK4T", "tgtkP63ogxvavW2iBkIKDzfLLaZpZCzK", "ybOdqEkHneyM4wZj2LwFYBNLYP9L294", "eNRXQ28nuUhO04KATDB8SwCNKP", "apyaz1fP5pXVrlGks8RRBsGavNttMFUQ"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public AudioTrack A0H;
    public AZ A0I;
    public Method A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final InterfaceC0373Aa A0N;
    public final long[] A0O;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0P, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 126);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0P = new byte[]{48, 46, Base64.padSymbol, Ascii.NAK, 42, Base64.padSymbol, 46, 55, 44, 66};
    }

    static {
        A06();
    }

    public C0375Ac(InterfaceC0373Aa interfaceC0373Aa) {
        this.A0N = (InterfaceC0373Aa) HI.A01(interfaceC0373Aa);
        if (C0557Hx.A02 >= 18) {
            try {
                this.A0J = AudioTrack.class.getMethod(A03(0, 10, 75), null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.A0O = new long[10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (r0 > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        if (r8 != 3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        if (r11.A07 != (-9223372036854775807L)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        r11.A07 = android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        return r11.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
    
        if (r0 > 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long A00() {
        if (this.A0G != -9223372036854775807L) {
            long elapsedRealtime = (this.A03 * ((SystemClock.elapsedRealtime() * 1000) - this.A0G)) / 1000000;
            long framesSinceStop = this.A06;
            long elapsedTimeSinceStopUs = this.A0F;
            return Math.min(framesSinceStop, elapsedTimeSinceStopUs + elapsedRealtime);
        }
        int playState = this.A0H.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        int state = this.A0H.getPlaybackHeadPosition();
        long j = state & 4294967295L;
        if (this.A0M) {
            if (playState == 2) {
                String[] strArr = A0Q;
                String str = strArr[7];
                String str2 = strArr[3];
                int charAt = str.charAt(23);
                int state2 = str2.charAt(23);
                if (charAt == state2) {
                    throw new RuntimeException();
                }
                A0Q[1] = "2Rrhrvg7XFDDHkaxdizPj4VES";
                if (j == 0) {
                    this.A0C = this.A0A;
                }
            }
            j += this.A0C;
        }
        if (C0557Hx.A02 <= 28) {
            if (j == 0) {
                long j2 = this.A0A;
                if (A0Q[1].length() != 9) {
                    A0Q[5] = "5rZ1QvooVelNPm3umI";
                }
            }
            this.A07 = -9223372036854775807L;
        }
        if (this.A0A > j) {
            this.A0D++;
        }
        this.A0A = j;
        return (this.A0D << 32) + j;
    }

    private long A01() {
        return A02(A00());
    }

    private long A02(long j) {
        return (1000000 * j) / this.A03;
    }

    private void A04() {
        long systemTimeUs = A01();
        if (systemTimeUs == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        long playbackPositionUs = this.A09;
        if (nanoTime - playbackPositionUs >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
            long[] jArr = this.A0O;
            int i = this.A01;
            long playbackPositionUs2 = systemTimeUs - nanoTime;
            jArr[i] = playbackPositionUs2;
            this.A01 = (i + 1) % 10;
            int i2 = this.A04;
            if (i2 < 10) {
                this.A04 = i2 + 1;
            }
            this.A09 = nanoTime;
            this.A0E = 0L;
            int i3 = 0;
            while (true) {
                int i4 = this.A04;
                if (i3 >= i4) {
                    break;
                }
                long playbackPositionUs3 = i4;
                this.A0E += this.A0O[i3] / playbackPositionUs3;
                i3++;
            }
        }
        if (this.A0M) {
            return;
        }
        A08(nanoTime, systemTimeUs);
        A07(nanoTime);
    }

    private void A05() {
        this.A0E = 0L;
        this.A04 = 0;
        this.A01 = 0;
        this.A09 = 0L;
    }

    private void A07(long j) {
        if (this.A0L) {
            Method method = this.A0J;
            if (A0Q[1].length() == 9) {
                throw new RuntimeException();
            }
            A0Q[5] = "5gTCJ";
            if (method != null && j - this.A08 >= 500000) {
                try {
                    long intValue = (((Integer) method.invoke(this.A0H, null)).intValue() * 1000) - this.A05;
                    this.A0B = intValue;
                    long max = Math.max(intValue, 0L);
                    this.A0B = max;
                    if (max > 5000000) {
                        this.A0N.ABl(max);
                        this.A0B = 0L;
                    }
                } catch (Exception unused) {
                    this.A0J = null;
                }
                this.A08 = j;
            }
        }
    }

    private void A08(long j, long audioTimestampSystemTimeUs) {
        if (!this.A0I.A08(j)) {
            return;
        }
        long A02 = this.A0I.A02();
        long A01 = this.A0I.A01();
        if (Math.abs(A02 - j) > 5000000) {
            this.A0N.AD7(A01, A02, j, audioTimestampSystemTimeUs);
            this.A0I.A04();
        } else if (Math.abs(A02(A01) - audioTimestampSystemTimeUs) > 5000000) {
            this.A0N.ACV(A01, A02, j, audioTimestampSystemTimeUs);
            this.A0I.A04();
        } else {
            this.A0I.A03();
        }
    }

    private boolean A09() {
        return this.A0M && this.A0H.getPlayState() == 2 && A00() == 0;
    }

    public static boolean A0A(int i) {
        if (C0557Hx.A02 < 23) {
            if (i != 5) {
                String[] strArr = A0Q;
                if (strArr[6].length() != strArr[2].length()) {
                    throw new RuntimeException();
                }
                A0Q[0] = "NO";
                if (i == 6) {
                }
            }
            return true;
        }
        return false;
    }

    public final int A0B(long j) {
        int bytesPending = (int) (j - (A00() * this.A02));
        return this.A00 - bytesPending;
    }

    public final long A0C(boolean z) {
        long systemTimeUs;
        if (this.A0H.getPlayState() == 3) {
            A04();
        }
        long elapsedSinceTimestampUs = System.nanoTime() / 1000;
        if (this.A0I.A06()) {
            long systemTimeUs2 = this.A0I.A01();
            long timestampPositionUs = A02(systemTimeUs2);
            boolean A07 = this.A0I.A07();
            if (A0Q[1].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A0Q;
            strArr[7] = "B2EPmPjaxRfTTctNgZbFUDggQYGnhm7g";
            strArr[3] = "gdL6KIe4ggUqKImq5hrR6J8T2bfxhE0p";
            if (!A07) {
                return timestampPositionUs;
            }
            AZ az = this.A0I;
            String[] strArr2 = A0Q;
            if (strArr2[6].length() != strArr2[2].length()) {
                long systemTimeUs3 = az.A02();
                return timestampPositionUs + (elapsedSinceTimestampUs - systemTimeUs3);
            }
            A0Q[5] = "zkTTFu0HqLBb6JIYxZc4CSGv3";
            long systemTimeUs4 = az.A02();
            return timestampPositionUs + (elapsedSinceTimestampUs - systemTimeUs4);
        }
        if (this.A04 == 0) {
            systemTimeUs = A01();
        } else {
            long systemTimeUs5 = this.A0E;
            systemTimeUs = systemTimeUs5 + elapsedSinceTimestampUs;
        }
        if (!z) {
            long positionUs = this.A0B;
            return systemTimeUs - positionUs;
        }
        return systemTimeUs;
    }

    public final void A0D() {
        A05();
        this.A0H = null;
        this.A0I = null;
    }

    public final void A0E() {
        this.A0I.A05();
    }

    public final void A0F(long j) {
        this.A0F = A00();
        this.A0G = SystemClock.elapsedRealtime() * 1000;
        this.A06 = j;
    }

    public final void A0G(AudioTrack audioTrack, int i, int i2, int i3) {
        this.A0H = audioTrack;
        this.A02 = i2;
        this.A00 = i3;
        this.A0I = new AZ(audioTrack);
        this.A03 = audioTrack.getSampleRate();
        this.A0M = A0A(i);
        boolean A0c = C0557Hx.A0c(i);
        this.A0L = A0c;
        this.A05 = A0c ? A02(i3 / i2) : -9223372036854775807L;
        this.A0A = 0L;
        this.A0D = 0L;
        this.A0C = 0L;
        this.A0K = false;
        this.A0G = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
        this.A0B = 0L;
    }

    public final boolean A0H() {
        return this.A0H.getPlayState() == 3;
    }

    public final boolean A0I() {
        A05();
        if (this.A0G == -9223372036854775807L) {
            this.A0I.A05();
            return true;
        }
        return false;
    }

    public final boolean A0J(long j) {
        return j > A00() || A09();
    }

    public final boolean A0K(long j) {
        return this.A07 != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.A07 >= 200;
    }

    public final boolean A0L(long j) {
        InterfaceC0373Aa interfaceC0373Aa;
        int playState = this.A0H.getPlayState();
        if (this.A0M) {
            if (playState == 2) {
                this.A0K = false;
                return false;
            }
            if (playState == 1 && A00() == 0) {
                return false;
            }
        }
        boolean hadData = this.A0K;
        boolean A0J = A0J(j);
        this.A0K = A0J;
        if (hadData && !A0J && playState != 1 && (interfaceC0373Aa = this.A0N) != null) {
            interfaceC0373Aa.ADG(this.A00, C9E.A01(this.A05));
        }
        return true;
    }
}
