package com.instagram.common.viewpoint.core;

import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.io.encoding.Base64;
import kotlin.time.DurationKt;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.mw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1714mw implements C8N {
    public static boolean A0v;
    public static int A0w;
    public static ExecutorService A0x;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D23918943: Monitor the audio track usage")
    public static AtomicInteger A0y;
    public static byte[] A0z;
    public static String[] A10 = {"a2KSouRkY2EeYPYlRPuQP1BMARpp6f9O", "Gy", "Dq9VRycV95bIzONst7U9W8VcH5OAT2ac", "T381mgHUGlQbTRbVURm4ZuRF6EOi2D8f", "KkGB0jhfpK5IC", "ogTnlK5ViGnrQ4kTUDUA61bIZynBq2mv", "CJ3ZuNqxaIjwSiQAD7ytgom2H57haWJk", "spWmv2H5WGO5MG6CASCqBbohd0yqIF8X"};
    public static final Object A11;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public AudioTrack A0D;
    public C1836oy A0E;
    public C1P A0F;
    public C1814ob A0G;
    public C02327m A0H;
    public C8J A0I;
    public C02458c A0J;
    public C02478f A0K;
    public C02478f A0L;
    public C02498h A0M;
    public C02498h A0N;
    public C02538n A0O;
    public ByteBuffer A0P;
    public ByteBuffer A0Q;
    public ByteBuffer A0R;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D45157249: Retry Audio Track Init failure with less Audio track allocation sizes")
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public byte[] A0c;
    public AnonymousClass38[] A0d;
    public ByteBuffer[] A0e;
    public final int A0f;
    public final AnonymousClass39 A0g;
    public final C3W A0h;
    public final InterfaceC01885u A0i;
    public final C02357p A0j;
    public final C8T A0k;
    public final C9N A0l;
    public final InterfaceC02468d A0m;
    public final C8k<C8H> A0n;
    public final C8k<C8M> A0o;
    public final C9I A0p;
    public final ArrayDeque<C02498h> A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final AnonymousClass38[] A0t;
    public final AnonymousClass38[] A0u;

    public static String A0L(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0z, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A0T() {
        A0z = new byte[]{99, 106, 44, 37, 56, 112, 106, 107, 74, 73, 78, 90, 67, 91, 110, 90, 75, 70, 64, 124, 70, 65, 68, 104, 85, 66, 125, 65, 76, 84, 72, 95, Ascii.ETB, 108, 88, 73, 68, 66, 121, 95, 76, 78, 70, Byte.MAX_VALUE, 72, 65, 72, 76, 94, 72, 121, 69, 95, 72, 76, 73, 39, 0, 8, Ascii.CR, 4, 5, 65, Ascii.NAK, Ascii.SO, 65, Ascii.DC2, 4, Ascii.NAK, 65, 17, Ascii.CR, 0, Ascii.CAN, 3, 0, 2, 10, 65, 17, 0, 19, 0, Ascii.FF, Ascii.DC2, 121, 94, 70, 81, 92, 89, 84, 16, 96, 115, 125, 16, 85, 94, 83, 95, 84, 89, 94, 87, 10, 16, 73, 110, 118, 97, 108, 105, 100, 32, 111, 117, 116, 112, 117, 116, 32, 99, 104, 97, 110, 110, 101, 108, 32, 99, 111, 110, 102, 105, 103, 32, 40, 109, 111, 100, 101, Base64.padSymbol, 57, Ascii.RS, 6, 17, Ascii.FS, Ascii.EM, Ascii.DC4, 80, Ascii.US, 5, 4, 0, 5, 4, 80, Ascii.NAK, Ascii.RS, 19, Ascii.US, Ascii.DC4, Ascii.EM, Ascii.RS, Ascii.ETB, 80, 88, Ascii.GS, Ascii.US, Ascii.DC4, Ascii.NAK, 77, 33, Ascii.CAN, 9, Ascii.DC4, Ascii.GS, 104, 95, 73, 95, 78, 78, 83, 84, 93, Ascii.SUB, 73, 78, 91, 86, 86, 95, 94, Ascii.SUB, 91, 79, 94, 83, 85, Ascii.SUB, 78, 72, 91, 89, 81, 117, 78, 65, 66, 76, 69, 0, 84, 79, 0, 67, 79, 78, 70, 73, 71, 85, 82, 69, 0, 80, 65, 83, 83, 84, 72, 82, 79, 85, 71, 72, 0, 70, 79, 82, Ascii.SUB, 0, 124, 71, 76, 81, 89, 76, 74, 93, 76, 77, 9, 72, 92, 77, 64, 70, 9, 76, 71, 74, 70, 77, 64, 71, 78, 19, 9, Ascii.US, Ascii.VT, Ascii.SUB, Ascii.ETB, 17, 81, Ascii.FF, Ascii.US, 9};
    }

    static {
        A0T();
        A0v = false;
        A11 = new Object();
        A0y = new AtomicInteger(0);
    }

    @Deprecated
    public C1714mw(C02357p c02357p, AnonymousClass38[] anonymousClass38Arr) {
        this(new C8e().A06((C02357p) AbstractC1487j1.A00(c02357p, C02357p.A04)).A07(anonymousClass38Arr));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @RequiresNonNull({"#1.audioProcessorChain"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1714mw(C8e c8e) {
        C02357p c02357p;
        AnonymousClass39 anonymousClass39;
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        c02357p = c8e.A03;
        this.A0j = c02357p;
        anonymousClass39 = c8e.A02;
        this.A0g = anonymousClass39;
        if (AbstractC01424a.A02 >= 21) {
            z4 = c8e.A05;
            if (z4) {
                z = true;
                this.A0s = z;
                if (AbstractC01424a.A02 >= 23) {
                    z3 = c8e.A04;
                    if (z3) {
                        z2 = true;
                        this.A0r = z2;
                        if (AbstractC01424a.A02 >= 29) {
                            i = c8e.A01;
                        } else {
                            i = 0;
                        }
                        this.A0f = i;
                        this.A0m = c8e.A00;
                        this.A0h = new C3W(C3T.A00);
                        this.A0h.A04();
                        this.A0k = new C8T(new C1715mx(this));
                        this.A0l = new C9N();
                        this.A0p = new C9I();
                        ArrayList arrayList = new ArrayList();
                        Collections.addAll(arrayList, new AbstractC1716my() { // from class: com.facebook.ads.redexgen.X.9K
                            public static String[] A00 = {"xDq4aPrtB4VOa6dWWLPhCvkNe2Vl9lis", "EsfqB3zUW", "UtEiT2kwdPvCqjHQhdRb9TlQndFxkub5", "Wgbe7hD6UIy", "xb", "RmqoPGkQn7vPyUpVU7ZkSehlX2jVBNRl", "20c7QZBscERNsZTH", "LeRFFk0E0DkpEnw35dU8lGRVd8w5nI17"};

                            @Override // com.instagram.common.viewpoint.core.AbstractC1716my
                            public final AnonymousClass36 A09(AnonymousClass36 anonymousClass36) throws AnonymousClass37 {
                                int i2 = anonymousClass36.A02;
                                if (i2 != 3 && i2 != 2) {
                                    if (A00[2].charAt(30) != 'b') {
                                        throw new RuntimeException();
                                    }
                                    A00[3] = "ty1ASCrQyl5";
                                    if (i2 != 268435456 && i2 != 536870912 && i2 != 805306368 && i2 != 4) {
                                        throw new AnonymousClass37(anonymousClass36);
                                    }
                                }
                                if (i2 != 2) {
                                    return new AnonymousClass36(anonymousClass36.A03, anonymousClass36.A01, 2);
                                }
                                return AnonymousClass36.A05;
                            }

                            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                            /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
                            /* JADX WARN: Removed duplicated region for block: B:20:0x00c8  */
                            @Override // com.instagram.common.viewpoint.core.AnonymousClass38
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void AGX(ByteBuffer byteBuffer) {
                                int resampledSize = byteBuffer.position();
                                int size = byteBuffer.limit();
                                int limit = size - resampledSize;
                                int position = this.A05.A02;
                                switch (position) {
                                    case 3:
                                        limit *= 2;
                                        break;
                                    case 4:
                                    case 805306368:
                                        limit /= 2;
                                        break;
                                    case 268435456:
                                        break;
                                    case 536870912:
                                        int position2 = limit / 3;
                                        limit = position2 * 2;
                                        break;
                                    default:
                                        throw new IllegalStateException();
                                }
                                ByteBuffer buffer = A00(limit);
                                int position3 = this.A05.A02;
                                switch (position3) {
                                    case 3:
                                        while (resampledSize < size) {
                                            buffer.put((byte) 0);
                                            int position4 = byteBuffer.get(resampledSize);
                                            buffer.put((byte) ((position4 & 255) - 128));
                                            resampledSize++;
                                        }
                                        int resampledSize2 = byteBuffer.limit();
                                        if (A00[7].charAt(16) != 53) {
                                            throw new RuntimeException();
                                        }
                                        A00[5] = "iqTXYqAhTQO7Wpg5y1SXfPoSIsa3UBxa";
                                        byteBuffer.position(resampledSize2);
                                        buffer.flip();
                                        return;
                                    case 4:
                                        while (resampledSize < size) {
                                            int position5 = (int) (32767.0f * AbstractC01424a.A00(byteBuffer.getFloat(resampledSize), -1.0f, 1.0f));
                                            int limit2 = (short) position5;
                                            int position6 = limit2 & 255;
                                            buffer.put((byte) position6);
                                            int position7 = limit2 >> 8;
                                            buffer.put((byte) (position7 & 255));
                                            resampledSize += 4;
                                        }
                                        int resampledSize22 = byteBuffer.limit();
                                        if (A00[7].charAt(16) != 53) {
                                        }
                                        break;
                                    case 268435456:
                                        while (resampledSize < size) {
                                            int position8 = resampledSize + 1;
                                            buffer.put(byteBuffer.get(position8));
                                            buffer.put(byteBuffer.get(resampledSize));
                                            resampledSize += 2;
                                        }
                                        int resampledSize222 = byteBuffer.limit();
                                        if (A00[7].charAt(16) != 53) {
                                        }
                                        break;
                                    case 536870912:
                                        while (resampledSize < size) {
                                            int position9 = resampledSize + 1;
                                            buffer.put(byteBuffer.get(position9));
                                            int position10 = resampledSize + 2;
                                            buffer.put(byteBuffer.get(position10));
                                            resampledSize += 3;
                                        }
                                        int resampledSize2222 = byteBuffer.limit();
                                        if (A00[7].charAt(16) != 53) {
                                        }
                                        break;
                                    case 805306368:
                                        while (resampledSize < size) {
                                            int position11 = resampledSize + 2;
                                            buffer.put(byteBuffer.get(position11));
                                            int position12 = resampledSize + 3;
                                            buffer.put(byteBuffer.get(position12));
                                            resampledSize += 4;
                                        }
                                        int resampledSize22222 = byteBuffer.limit();
                                        if (A00[7].charAt(16) != 53) {
                                        }
                                        break;
                                    default:
                                        throw new IllegalStateException();
                                }
                            }
                        }, this.A0l, this.A0p);
                        Collections.addAll(arrayList, this.A0g.A6r());
                        this.A0u = (AnonymousClass38[]) arrayList.toArray(new AnonymousClass38[0]);
                        this.A0t = new AnonymousClass38[]{new AbstractC1716my() { // from class: com.facebook.ads.redexgen.X.9L
                            public static final int A00 = Float.floatToIntBits(Float.NaN);

                            public static void A00(int i2, ByteBuffer byteBuffer) {
                                float pcm32BitFloat = (float) (i2 * 4.656612875245797E-10d);
                                int floatBits = Float.floatToIntBits(pcm32BitFloat);
                                if (floatBits == A00) {
                                    floatBits = Float.floatToIntBits(0.0f);
                                }
                                byteBuffer.putInt(floatBits);
                            }

                            @Override // com.instagram.common.viewpoint.core.AbstractC1716my
                            public final AnonymousClass36 A09(AnonymousClass36 anonymousClass36) throws AnonymousClass37 {
                                int i2 = anonymousClass36.A02;
                                if (AbstractC01424a.A14(i2)) {
                                    if (i2 != 4) {
                                        return new AnonymousClass36(anonymousClass36.A03, anonymousClass36.A01, 4);
                                    }
                                    return AnonymousClass36.A05;
                                }
                                throw new AnonymousClass37(anonymousClass36);
                            }

                            @Override // com.instagram.common.viewpoint.core.AnonymousClass38
                            public final void AGX(ByteBuffer byteBuffer) {
                                ByteBuffer A002;
                                int i2 = byteBuffer.position();
                                int limit = byteBuffer.limit();
                                int limit2 = limit - i2;
                                int position = this.A05.A02;
                                switch (position) {
                                    case 536870912:
                                        int position2 = limit2 / 3;
                                        A002 = A00(position2 * 4);
                                        while (i2 < limit) {
                                            int position3 = byteBuffer.get(i2);
                                            int limit3 = (position3 & 255) << 8;
                                            int position4 = i2 + 1;
                                            int limit4 = limit3 | ((byteBuffer.get(position4) & 255) << 16);
                                            int position5 = i2 + 2;
                                            A00(limit4 | ((byteBuffer.get(position5) & 255) << 24), A002);
                                            i2 += 3;
                                        }
                                        break;
                                    case 805306368:
                                        A002 = A00(limit2);
                                        while (i2 < limit) {
                                            int position6 = byteBuffer.get(i2);
                                            int limit5 = position6 & 255;
                                            int position7 = i2 + 1;
                                            int limit6 = limit5 | ((byteBuffer.get(position7) & 255) << 8);
                                            int position8 = i2 + 2;
                                            int limit7 = limit6 | ((byteBuffer.get(position8) & 255) << 16);
                                            int position9 = i2 + 3;
                                            A00(limit7 | ((byteBuffer.get(position9) & 255) << 24), A002);
                                            i2 += 4;
                                        }
                                        break;
                                    default:
                                        throw new IllegalStateException();
                                }
                                int position10 = byteBuffer.limit();
                                byteBuffer.position(position10);
                                A002.flip();
                            }
                        }};
                        this.A00 = 1.0f;
                        this.A0E = C1836oy.A07;
                        this.A01 = 0;
                        this.A0F = new C1P(0, 0.0f);
                        this.A0N = new C02498h(C1814ob.A06, false, 0L, 0L);
                        this.A0G = C1814ob.A06;
                        this.A03 = -1;
                        this.A0d = new AnonymousClass38[0];
                        this.A0e = new ByteBuffer[0];
                        this.A0q = new ArrayDeque<>();
                        this.A0n = new C8k<>(100L);
                        this.A0o = new C8k<>(100L);
                        this.A0i = null;
                    }
                }
                z2 = false;
                this.A0r = z2;
                if (AbstractC01424a.A02 >= 29) {
                }
                this.A0f = i;
                this.A0m = c8e.A00;
                this.A0h = new C3W(C3T.A00);
                this.A0h.A04();
                this.A0k = new C8T(new C1715mx(this));
                this.A0l = new C9N();
                this.A0p = new C9I();
                ArrayList arrayList2 = new ArrayList();
                Collections.addAll(arrayList2, new AbstractC1716my() { // from class: com.facebook.ads.redexgen.X.9K
                    public static String[] A00 = {"xDq4aPrtB4VOa6dWWLPhCvkNe2Vl9lis", "EsfqB3zUW", "UtEiT2kwdPvCqjHQhdRb9TlQndFxkub5", "Wgbe7hD6UIy", "xb", "RmqoPGkQn7vPyUpVU7ZkSehlX2jVBNRl", "20c7QZBscERNsZTH", "LeRFFk0E0DkpEnw35dU8lGRVd8w5nI17"};

                    @Override // com.instagram.common.viewpoint.core.AbstractC1716my
                    public final AnonymousClass36 A09(AnonymousClass36 anonymousClass36) throws AnonymousClass37 {
                        int i2 = anonymousClass36.A02;
                        if (i2 != 3 && i2 != 2) {
                            if (A00[2].charAt(30) != 'b') {
                                throw new RuntimeException();
                            }
                            A00[3] = "ty1ASCrQyl5";
                            if (i2 != 268435456 && i2 != 536870912 && i2 != 805306368 && i2 != 4) {
                                throw new AnonymousClass37(anonymousClass36);
                            }
                        }
                        if (i2 != 2) {
                            return new AnonymousClass36(anonymousClass36.A03, anonymousClass36.A01, 2);
                        }
                        return AnonymousClass36.A05;
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
                    /* JADX WARN: Removed duplicated region for block: B:20:0x00c8  */
                    @Override // com.instagram.common.viewpoint.core.AnonymousClass38
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void AGX(ByteBuffer byteBuffer) {
                        int resampledSize = byteBuffer.position();
                        int size = byteBuffer.limit();
                        int limit = size - resampledSize;
                        int position = this.A05.A02;
                        switch (position) {
                            case 3:
                                limit *= 2;
                                break;
                            case 4:
                            case 805306368:
                                limit /= 2;
                                break;
                            case 268435456:
                                break;
                            case 536870912:
                                int position2 = limit / 3;
                                limit = position2 * 2;
                                break;
                            default:
                                throw new IllegalStateException();
                        }
                        ByteBuffer buffer = A00(limit);
                        int position3 = this.A05.A02;
                        switch (position3) {
                            case 3:
                                while (resampledSize < size) {
                                    buffer.put((byte) 0);
                                    int position4 = byteBuffer.get(resampledSize);
                                    buffer.put((byte) ((position4 & 255) - 128));
                                    resampledSize++;
                                }
                                int resampledSize22222 = byteBuffer.limit();
                                if (A00[7].charAt(16) != 53) {
                                    throw new RuntimeException();
                                }
                                A00[5] = "iqTXYqAhTQO7Wpg5y1SXfPoSIsa3UBxa";
                                byteBuffer.position(resampledSize22222);
                                buffer.flip();
                                return;
                            case 4:
                                while (resampledSize < size) {
                                    int position5 = (int) (32767.0f * AbstractC01424a.A00(byteBuffer.getFloat(resampledSize), -1.0f, 1.0f));
                                    int limit2 = (short) position5;
                                    int position6 = limit2 & 255;
                                    buffer.put((byte) position6);
                                    int position7 = limit2 >> 8;
                                    buffer.put((byte) (position7 & 255));
                                    resampledSize += 4;
                                }
                                int resampledSize222222 = byteBuffer.limit();
                                if (A00[7].charAt(16) != 53) {
                                }
                                break;
                            case 268435456:
                                while (resampledSize < size) {
                                    int position8 = resampledSize + 1;
                                    buffer.put(byteBuffer.get(position8));
                                    buffer.put(byteBuffer.get(resampledSize));
                                    resampledSize += 2;
                                }
                                int resampledSize2222222 = byteBuffer.limit();
                                if (A00[7].charAt(16) != 53) {
                                }
                                break;
                            case 536870912:
                                while (resampledSize < size) {
                                    int position9 = resampledSize + 1;
                                    buffer.put(byteBuffer.get(position9));
                                    int position10 = resampledSize + 2;
                                    buffer.put(byteBuffer.get(position10));
                                    resampledSize += 3;
                                }
                                int resampledSize22222222 = byteBuffer.limit();
                                if (A00[7].charAt(16) != 53) {
                                }
                                break;
                            case 805306368:
                                while (resampledSize < size) {
                                    int position11 = resampledSize + 2;
                                    buffer.put(byteBuffer.get(position11));
                                    int position12 = resampledSize + 3;
                                    buffer.put(byteBuffer.get(position12));
                                    resampledSize += 4;
                                }
                                int resampledSize222222222 = byteBuffer.limit();
                                if (A00[7].charAt(16) != 53) {
                                }
                                break;
                            default:
                                throw new IllegalStateException();
                        }
                    }
                }, this.A0l, this.A0p);
                Collections.addAll(arrayList2, this.A0g.A6r());
                this.A0u = (AnonymousClass38[]) arrayList2.toArray(new AnonymousClass38[0]);
                this.A0t = new AnonymousClass38[]{new AbstractC1716my() { // from class: com.facebook.ads.redexgen.X.9L
                    public static final int A00 = Float.floatToIntBits(Float.NaN);

                    public static void A00(int i2, ByteBuffer byteBuffer) {
                        float pcm32BitFloat = (float) (i2 * 4.656612875245797E-10d);
                        int floatBits = Float.floatToIntBits(pcm32BitFloat);
                        if (floatBits == A00) {
                            floatBits = Float.floatToIntBits(0.0f);
                        }
                        byteBuffer.putInt(floatBits);
                    }

                    @Override // com.instagram.common.viewpoint.core.AbstractC1716my
                    public final AnonymousClass36 A09(AnonymousClass36 anonymousClass36) throws AnonymousClass37 {
                        int i2 = anonymousClass36.A02;
                        if (AbstractC01424a.A14(i2)) {
                            if (i2 != 4) {
                                return new AnonymousClass36(anonymousClass36.A03, anonymousClass36.A01, 4);
                            }
                            return AnonymousClass36.A05;
                        }
                        throw new AnonymousClass37(anonymousClass36);
                    }

                    @Override // com.instagram.common.viewpoint.core.AnonymousClass38
                    public final void AGX(ByteBuffer byteBuffer) {
                        ByteBuffer A002;
                        int i2 = byteBuffer.position();
                        int limit = byteBuffer.limit();
                        int limit2 = limit - i2;
                        int position = this.A05.A02;
                        switch (position) {
                            case 536870912:
                                int position2 = limit2 / 3;
                                A002 = A00(position2 * 4);
                                while (i2 < limit) {
                                    int position3 = byteBuffer.get(i2);
                                    int limit3 = (position3 & 255) << 8;
                                    int position4 = i2 + 1;
                                    int limit4 = limit3 | ((byteBuffer.get(position4) & 255) << 16);
                                    int position5 = i2 + 2;
                                    A00(limit4 | ((byteBuffer.get(position5) & 255) << 24), A002);
                                    i2 += 3;
                                }
                                break;
                            case 805306368:
                                A002 = A00(limit2);
                                while (i2 < limit) {
                                    int position6 = byteBuffer.get(i2);
                                    int limit5 = position6 & 255;
                                    int position7 = i2 + 1;
                                    int limit6 = limit5 | ((byteBuffer.get(position7) & 255) << 8);
                                    int position8 = i2 + 2;
                                    int limit7 = limit6 | ((byteBuffer.get(position8) & 255) << 16);
                                    int position9 = i2 + 3;
                                    A00(limit7 | ((byteBuffer.get(position9) & 255) << 24), A002);
                                    i2 += 4;
                                }
                                break;
                            default:
                                throw new IllegalStateException();
                        }
                        int position10 = byteBuffer.limit();
                        byteBuffer.position(position10);
                        A002.flip();
                    }
                }};
                this.A00 = 1.0f;
                this.A0E = C1836oy.A07;
                this.A01 = 0;
                this.A0F = new C1P(0, 0.0f);
                this.A0N = new C02498h(C1814ob.A06, false, 0L, 0L);
                this.A0G = C1814ob.A06;
                this.A03 = -1;
                this.A0d = new AnonymousClass38[0];
                this.A0e = new ByteBuffer[0];
                this.A0q = new ArrayDeque<>();
                this.A0n = new C8k<>(100L);
                this.A0o = new C8k<>(100L);
                this.A0i = null;
            }
        }
        z = false;
        this.A0s = z;
        if (AbstractC01424a.A02 >= 23) {
        }
        z2 = false;
        this.A0r = z2;
        if (AbstractC01424a.A02 >= 29) {
        }
        this.A0f = i;
        this.A0m = c8e.A00;
        this.A0h = new C3W(C3T.A00);
        this.A0h.A04();
        this.A0k = new C8T(new C1715mx(this));
        this.A0l = new C9N();
        this.A0p = new C9I();
        ArrayList arrayList22 = new ArrayList();
        Collections.addAll(arrayList22, new AbstractC1716my() { // from class: com.facebook.ads.redexgen.X.9K
            public static String[] A00 = {"xDq4aPrtB4VOa6dWWLPhCvkNe2Vl9lis", "EsfqB3zUW", "UtEiT2kwdPvCqjHQhdRb9TlQndFxkub5", "Wgbe7hD6UIy", "xb", "RmqoPGkQn7vPyUpVU7ZkSehlX2jVBNRl", "20c7QZBscERNsZTH", "LeRFFk0E0DkpEnw35dU8lGRVd8w5nI17"};

            @Override // com.instagram.common.viewpoint.core.AbstractC1716my
            public final AnonymousClass36 A09(AnonymousClass36 anonymousClass36) throws AnonymousClass37 {
                int i2 = anonymousClass36.A02;
                if (i2 != 3 && i2 != 2) {
                    if (A00[2].charAt(30) != 'b') {
                        throw new RuntimeException();
                    }
                    A00[3] = "ty1ASCrQyl5";
                    if (i2 != 268435456 && i2 != 536870912 && i2 != 805306368 && i2 != 4) {
                        throw new AnonymousClass37(anonymousClass36);
                    }
                }
                if (i2 != 2) {
                    return new AnonymousClass36(anonymousClass36.A03, anonymousClass36.A01, 2);
                }
                return AnonymousClass36.A05;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x00c8  */
            @Override // com.instagram.common.viewpoint.core.AnonymousClass38
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void AGX(ByteBuffer byteBuffer) {
                int resampledSize = byteBuffer.position();
                int size = byteBuffer.limit();
                int limit = size - resampledSize;
                int position = this.A05.A02;
                switch (position) {
                    case 3:
                        limit *= 2;
                        break;
                    case 4:
                    case 805306368:
                        limit /= 2;
                        break;
                    case 268435456:
                        break;
                    case 536870912:
                        int position2 = limit / 3;
                        limit = position2 * 2;
                        break;
                    default:
                        throw new IllegalStateException();
                }
                ByteBuffer buffer = A00(limit);
                int position3 = this.A05.A02;
                switch (position3) {
                    case 3:
                        while (resampledSize < size) {
                            buffer.put((byte) 0);
                            int position4 = byteBuffer.get(resampledSize);
                            buffer.put((byte) ((position4 & 255) - 128));
                            resampledSize++;
                        }
                        int resampledSize222222222 = byteBuffer.limit();
                        if (A00[7].charAt(16) != 53) {
                            throw new RuntimeException();
                        }
                        A00[5] = "iqTXYqAhTQO7Wpg5y1SXfPoSIsa3UBxa";
                        byteBuffer.position(resampledSize222222222);
                        buffer.flip();
                        return;
                    case 4:
                        while (resampledSize < size) {
                            int position5 = (int) (32767.0f * AbstractC01424a.A00(byteBuffer.getFloat(resampledSize), -1.0f, 1.0f));
                            int limit2 = (short) position5;
                            int position6 = limit2 & 255;
                            buffer.put((byte) position6);
                            int position7 = limit2 >> 8;
                            buffer.put((byte) (position7 & 255));
                            resampledSize += 4;
                        }
                        int resampledSize2222222222 = byteBuffer.limit();
                        if (A00[7].charAt(16) != 53) {
                        }
                        break;
                    case 268435456:
                        while (resampledSize < size) {
                            int position8 = resampledSize + 1;
                            buffer.put(byteBuffer.get(position8));
                            buffer.put(byteBuffer.get(resampledSize));
                            resampledSize += 2;
                        }
                        int resampledSize22222222222 = byteBuffer.limit();
                        if (A00[7].charAt(16) != 53) {
                        }
                        break;
                    case 536870912:
                        while (resampledSize < size) {
                            int position9 = resampledSize + 1;
                            buffer.put(byteBuffer.get(position9));
                            int position10 = resampledSize + 2;
                            buffer.put(byteBuffer.get(position10));
                            resampledSize += 3;
                        }
                        int resampledSize222222222222 = byteBuffer.limit();
                        if (A00[7].charAt(16) != 53) {
                        }
                        break;
                    case 805306368:
                        while (resampledSize < size) {
                            int position11 = resampledSize + 2;
                            buffer.put(byteBuffer.get(position11));
                            int position12 = resampledSize + 3;
                            buffer.put(byteBuffer.get(position12));
                            resampledSize += 4;
                        }
                        int resampledSize2222222222222 = byteBuffer.limit();
                        if (A00[7].charAt(16) != 53) {
                        }
                        break;
                    default:
                        throw new IllegalStateException();
                }
            }
        }, this.A0l, this.A0p);
        Collections.addAll(arrayList22, this.A0g.A6r());
        this.A0u = (AnonymousClass38[]) arrayList22.toArray(new AnonymousClass38[0]);
        this.A0t = new AnonymousClass38[]{new AbstractC1716my() { // from class: com.facebook.ads.redexgen.X.9L
            public static final int A00 = Float.floatToIntBits(Float.NaN);

            public static void A00(int i2, ByteBuffer byteBuffer) {
                float pcm32BitFloat = (float) (i2 * 4.656612875245797E-10d);
                int floatBits = Float.floatToIntBits(pcm32BitFloat);
                if (floatBits == A00) {
                    floatBits = Float.floatToIntBits(0.0f);
                }
                byteBuffer.putInt(floatBits);
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC1716my
            public final AnonymousClass36 A09(AnonymousClass36 anonymousClass36) throws AnonymousClass37 {
                int i2 = anonymousClass36.A02;
                if (AbstractC01424a.A14(i2)) {
                    if (i2 != 4) {
                        return new AnonymousClass36(anonymousClass36.A03, anonymousClass36.A01, 4);
                    }
                    return AnonymousClass36.A05;
                }
                throw new AnonymousClass37(anonymousClass36);
            }

            @Override // com.instagram.common.viewpoint.core.AnonymousClass38
            public final void AGX(ByteBuffer byteBuffer) {
                ByteBuffer A002;
                int i2 = byteBuffer.position();
                int limit = byteBuffer.limit();
                int limit2 = limit - i2;
                int position = this.A05.A02;
                switch (position) {
                    case 536870912:
                        int position2 = limit2 / 3;
                        A002 = A00(position2 * 4);
                        while (i2 < limit) {
                            int position3 = byteBuffer.get(i2);
                            int limit3 = (position3 & 255) << 8;
                            int position4 = i2 + 1;
                            int limit4 = limit3 | ((byteBuffer.get(position4) & 255) << 16);
                            int position5 = i2 + 2;
                            A00(limit4 | ((byteBuffer.get(position5) & 255) << 24), A002);
                            i2 += 3;
                        }
                        break;
                    case 805306368:
                        A002 = A00(limit2);
                        while (i2 < limit) {
                            int position6 = byteBuffer.get(i2);
                            int limit5 = position6 & 255;
                            int position7 = i2 + 1;
                            int limit6 = limit5 | ((byteBuffer.get(position7) & 255) << 8);
                            int position8 = i2 + 2;
                            int limit7 = limit6 | ((byteBuffer.get(position8) & 255) << 16);
                            int position9 = i2 + 3;
                            A00(limit7 | ((byteBuffer.get(position9) & 255) << 24), A002);
                            i2 += 4;
                        }
                        break;
                    default:
                        throw new IllegalStateException();
                }
                int position10 = byteBuffer.limit();
                byteBuffer.position(position10);
                A002.flip();
            }
        }};
        this.A00 = 1.0f;
        this.A0E = C1836oy.A07;
        this.A01 = 0;
        this.A0F = new C1P(0, 0.0f);
        this.A0N = new C02498h(C1814ob.A06, false, 0L, 0L);
        this.A0G = C1814ob.A06;
        this.A03 = -1;
        this.A0d = new AnonymousClass38[0];
        this.A0e = new ByteBuffer[0];
        this.A0q = new ArrayDeque<>();
        this.A0n = new C8k<>(100L);
        this.A0o = new C8k<>(100L);
        this.A0i = null;
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "D58560720: customized audio track retry logic. Feature is available upstream already")
    private int A00() {
        if (MetaExoPlayerUpgradeConfig.A03(EnumC1429i2.A1i)) {
            return A01(this.A0K.A06, this.A0K.A02, this.A0K.A03);
        }
        return DurationKt.NANOS_IN_MILLIS;
    }

    public static int A01(int i, int i2, int i3) {
        int minBufferSize = AudioTrack.getMinBufferSize(i, i2, i3);
        C3M.A08(minBufferSize != -2);
        return minBufferSize;
    }

    public static int A02(int i, ByteBuffer byteBuffer) {
        switch (i) {
            case 5:
            case 6:
            case 18:
                return GF.A03(byteBuffer);
            case 7:
            case 8:
                int headerDataInBigEndian = GV.A00(byteBuffer);
                return headerDataInBigEndian;
            case 9:
                int headerDataInBigEndian2 = AbstractC01424a.A0F(byteBuffer, byteBuffer.position());
                int headerDataInBigEndian3 = AbstractC0450Gm.A01(headerDataInBigEndian2);
                if (headerDataInBigEndian3 != -1) {
                    return headerDataInBigEndian3;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            case 19:
            default:
                throw new IllegalStateException(A0L(244, 27, 17) + i);
            case 14:
                int syncframeOffset = GF.A02(byteBuffer);
                if (syncframeOffset == -1) {
                    return 0;
                }
                return GF.A04(byteBuffer, syncframeOffset) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return GI.A01(byteBuffer);
            case 20:
                return AbstractC0455Gr.A00(byteBuffer);
        }
    }

    private int A03(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        if (AbstractC01424a.A02 >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (!AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return 0;
        }
        if (AbstractC01424a.A02 != 30) {
            return 1;
        }
        String str = AbstractC01424a.A06;
        String[] strArr = A10;
        if (strArr[2].charAt(24) != strArr[6].charAt(24)) {
            throw new RuntimeException();
        }
        A10[7] = "3tkRuQxdBcZlCTwsgu7cjpWlPYr81dQa";
        if (!str.startsWith(A0L(Opcodes.LRETURN, 5, 73))) {
            return 1;
        }
        if (A10[7].length() != 32) {
            return 2;
        }
        A10[7] = "7yaDe65lYY86qlvGhmsANLPH6jvNYU2p";
        return 2;
    }

    public static int A04(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    private int A05(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (AbstractC01424a.A02 >= 26) {
            return audioTrack.write(byteBuffer, i, 1, j * 1000);
        }
        if (this.A0P == null) {
            this.A0P = ByteBuffer.allocate(16);
            this.A0P.order(ByteOrder.BIG_ENDIAN);
            this.A0P.putInt(1431633921);
        }
        if (this.A02 == 0) {
            this.A0P.putInt(4, i);
            this.A0P.putLong(8, 1000 * j);
            this.A0P.position(0);
            this.A02 = i;
        }
        int result = this.A0P.remaining();
        if (result > 0) {
            int avSyncHeaderBytesRemaining = audioTrack.write(this.A0P, result, 1);
            if (avSyncHeaderBytesRemaining < 0) {
                this.A02 = 0;
                return avSyncHeaderBytesRemaining;
            }
            if (avSyncHeaderBytesRemaining < result) {
                return 0;
            }
        }
        int A04 = A04(audioTrack, byteBuffer, i);
        if (A04 < 0) {
            this.A02 = 0;
            return A04;
        }
        int i2 = this.A02 - A04;
        String[] strArr = A10;
        if (strArr[0].charAt(31) == strArr[3].charAt(31)) {
            throw new RuntimeException();
        }
        A10[7] = "dZEIQVBMkpJ01dOsE3P3AYpi9pP3UgAn";
        this.A02 = i2;
        return A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A06() {
        if (this.A0K.A04 == 0) {
            long j = this.A0A;
            if (A10[1].length() != 2) {
                throw new RuntimeException();
            }
            String[] strArr = A10;
            strArr[2] = "fKroUyDCoriQZ27MdWvBeynNHxXh31S0";
            strArr[6] = "V2Tsqcz9Ivj1DWTn2T33JaE9HhmQCs1A";
            return j / this.A0K.A01;
        }
        return this.A09;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A07() {
        if (this.A0K.A04 == 0) {
            return this.A0C / this.A0K.A05;
        }
        return this.A0B;
    }

    private long A08(long j) {
        while (!this.A0q.isEmpty() && j >= this.A0q.getFirst().A00) {
            C02498h remove = this.A0q.remove();
            String[] strArr = A10;
            if (strArr[0].charAt(31) == strArr[3].charAt(31)) {
                throw new RuntimeException();
            }
            A10[7] = "uS5QwbhdMNBXkjn1i9eeeV7Jy2FKd79B";
            this.A0N = remove;
        }
        long j2 = j - this.A0N.A00;
        if (this.A0N.A02.equals(C1814ob.A06)) {
            return this.A0N.A01 + j2;
        }
        if (this.A0q.isEmpty()) {
            long mediaDurationSinceLastCheckpointUs = this.A0g.A8M(j2);
            long playoutDurationSinceLastCheckpointUs = this.A0N.A01;
            return playoutDurationSinceLastCheckpointUs + mediaDurationSinceLastCheckpointUs;
        }
        C02498h first = this.A0q.getFirst();
        long A0Q = AbstractC01424a.A0Q(first.A00 - j, this.A0N.A02.A01);
        long playoutDurationSinceLastCheckpointUs2 = first.A01;
        return playoutDurationSinceLastCheckpointUs2 - A0Q;
    }

    private long A09(long j) {
        return this.A0K.A08(this.A0g.A90()) + j;
    }

    public static AudioFormat A0D(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    private AudioTrack A0F() throws C8H {
        try {
            return A0G((C02478f) C3M.A01(this.A0K));
        } catch (C8H e) {
            int retryBufferSize = A00();
            if (this.A0K.A00 > retryBufferSize) {
                C02478f A0C = this.A0K.A0C(retryBufferSize);
                try {
                    AudioTrack A0G = A0G(A0C);
                    this.A0K = A0C;
                    return A0G;
                } catch (C8H initialFailure) {
                    e.addSuppressed(initialFailure);
                    A0O();
                    throw e;
                }
            }
            A0O();
            throw e;
        }
    }

    private AudioTrack A0G(C02478f c02478f) throws C8H {
        try {
            AudioTrack A0A = c02478f.A0A(this.A0b, this.A0E, this.A01);
            if (0 != 0) {
                A0l(A0A);
            }
            return A0A;
        } catch (C8H e) {
            if (this.A0I != null) {
                this.A0I.ACV(e);
            }
            throw e;
        }
    }

    private C1814ob A0I() {
        return A0K().A02;
    }

    private C02498h A0K() {
        if (this.A0M != null) {
            return this.A0M;
        }
        if (!this.A0q.isEmpty()) {
            return this.A0q.getLast();
        }
        return this.A0N;
    }

    public static /* synthetic */ AtomicInteger A0M() {
        AtomicInteger atomicInteger = A0y;
        if (A10[4].length() == 6) {
            throw new RuntimeException();
        }
        A10[7] = "bxvwh9PGR3JBxYGaTMYcQ8NcsphLXH3B";
        return atomicInteger;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0N() {
        for (int i = 0; i < i; i++) {
            AnonymousClass38 anonymousClass38 = this.A0d[i];
            anonymousClass38.flush();
            this.A0e[i] = anonymousClass38.A8V();
        }
    }

    private void A0O() {
        if (this.A0K.A0D()) {
            if (A10[1].length() != 2) {
                throw new RuntimeException();
            }
            A10[5] = "ac1bNzRzCepoXog5xkGE2UP5sVZPG6ZN";
            this.A0W = true;
        }
    }

    private void A0P() {
        if (!this.A0a) {
            this.A0a = true;
            this.A0k.A0H(A07());
            this.A0D.stop();
            this.A02 = 0;
        }
    }

    private void A0Q() {
        this.A0A = 0L;
        this.A09 = 0L;
        this.A0C = 0L;
        this.A0B = 0L;
        this.A0V = false;
        this.A04 = 0;
        this.A0N = new C02498h(A0I(), A0p(), 0L, 0L);
        this.A08 = 0L;
        this.A0M = null;
        this.A0q.clear();
        this.A0Q = null;
        this.A05 = 0;
        this.A0R = null;
        this.A0a = false;
        this.A0U = false;
        this.A03 = -1;
        this.A0P = null;
        this.A02 = 0;
        this.A0p.A0D();
        A0N();
    }

    private void A0R() {
        if (!A0h()) {
            return;
        }
        if (AbstractC01424a.A02 >= 21) {
            A0X(this.A0D, this.A00);
        } else {
            A0Y(this.A0D, this.A00);
        }
    }

    private void A0S() {
        AnonymousClass38[] anonymousClass38Arr = this.A0K.A09;
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass38 anonymousClass38 : anonymousClass38Arr) {
            if (anonymousClass38.AAC()) {
                arrayList.add(anonymousClass38);
            } else {
                anonymousClass38.flush();
            }
        }
        int size = arrayList.size();
        AnonymousClass38[] audioProcessors = new AnonymousClass38[size];
        this.A0d = (AnonymousClass38[]) arrayList.toArray(audioProcessors);
        this.A0e = new ByteBuffer[size];
        A0N();
    }

    private void A0U(long j) {
        C1814ob c1814ob;
        boolean z;
        if (A0i()) {
            c1814ob = this.A0g.A47(A0I());
        } else {
            c1814ob = C1814ob.A06;
            if (A10[7].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A10;
            strArr[0] = "I2oaxDVd9h4oXXSjJqrHfFArwnmkYbuU";
            strArr[3] = "djNSsSrQ9W3py9jFqud3MNGsNXIKPv6H";
        }
        if (A0i()) {
            z = this.A0g.A48(A0p());
        } else {
            z = false;
        }
        this.A0q.add(new C02498h(c1814ob, z, Math.max(0L, j), this.A0K.A08(A07())));
        A0S();
        if (this.A0I != null) {
            this.A0I.AFF(z);
        }
    }

    private void A0V(long j) throws C8M {
        ByteBuffer byteBuffer;
        int length = this.A0d.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                ByteBuffer[] byteBufferArr = this.A0e;
                int i2 = i - 1;
                String[] strArr = A10;
                String str = strArr[0];
                String str2 = strArr[3];
                int index = str.charAt(31);
                int count = str2.charAt(31);
                if (index == count) {
                    throw new RuntimeException();
                }
                A10[1] = "0P";
                byteBuffer = byteBufferArr[i2];
            } else {
                byteBuffer = this.A0Q != null ? this.A0Q : AnonymousClass38.A00;
            }
            if (i == length) {
                A0e(byteBuffer, j);
            } else {
                AnonymousClass38 anonymousClass38 = this.A0d[i];
                int index2 = this.A03;
                if (i > index2) {
                    anonymousClass38.AGX(byteBuffer);
                }
                ByteBuffer A8V = anonymousClass38.A8V();
                this.A0e[i] = A8V;
                if (A8V.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    private void A0W(AudioTrack audioTrack) {
        if (this.A0O == null) {
            this.A0O = new C02538n(this);
        }
        C02538n c02538n = this.A0O;
        String[] strArr = A10;
        if (strArr[2].charAt(24) != strArr[6].charAt(24)) {
            throw new RuntimeException();
        }
        A10[7] = "8t8nFWsxRl9HTQxqXeO3m9pm7diLrI9Q";
        c02538n.A00(audioTrack);
    }

    public static void A0X(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    public static void A0Y(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    private void A0Z(final AudioTrack audioTrack, final C3W c3w, final C8J c8j, final C8F c8f) {
        c3w.A02();
        final Handler handler = new Handler(Looper.myLooper());
        synchronized (A11) {
            if (A0x == null) {
                A0x = AbstractC01424a.A0u(A0L(23, 33, 21));
            }
            A0w++;
            A0x.execute(new Runnable() { // from class: com.facebook.ads.redexgen.X.8Y
                @Override // java.lang.Runnable
                public final void run() {
                    C1714mw.A0a(audioTrack, c8j, handler, c8f, c3w);
                }
            });
        }
    }

    public static /* synthetic */ void A0a(AudioTrack audioTrack, final C8J c8j, Handler handler, final C8F c8f, C3W c3w) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (c8j != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8X
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8J.this.ACX(c8f);
                    }
                });
            }
            c3w.A04();
            synchronized (A11) {
                A0w--;
                if (A0w == 0) {
                    A0x.shutdown();
                    A0x = null;
                }
            }
        } catch (Throwable th) {
            if (c8j != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8X
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8J.this.ACX(c8f);
                    }
                });
            }
            c3w.A04();
            synchronized (A11) {
                A0w--;
                if (A0w == 0) {
                    A0x.shutdown();
                    A0x = null;
                }
                throw th;
            }
        }
    }

    private void A0b(C1814ob c1814ob) {
        if (A0h()) {
            try {
                this.A0D.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(c1814ob.A01).setPitch(c1814ob.A00).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                AnonymousClass44.A0A(A0L(7, 16, 23), A0L(56, 29, 89), e);
            }
            PlaybackParams playbackParams = this.A0D.getPlaybackParams();
            float speed = playbackParams.getSpeed();
            PlaybackParams playbackParams2 = this.A0D.getPlaybackParams();
            c1814ob = new C1814ob(speed, playbackParams2.getPitch());
            this.A0k.A0G(c1814ob.A01);
        }
        this.A0G = c1814ob;
    }

    private void A0c(C1814ob c1814ob, boolean z) {
        C02498h A0K = A0K();
        if (!c1814ob.equals(A0K.A02) || z != A0K.A03) {
            C02498h mediaPositionParameters = new C02498h(c1814ob, z, -9223372036854775807L, -9223372036854775807L);
            if (A0h()) {
                this.A0M = mediaPositionParameters;
            } else {
                this.A0N = mediaPositionParameters;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e8, code lost:
    
        if (r0 < r2) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0e(ByteBuffer byteBuffer, long j) throws C8M {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        if (this.A0R != null) {
            C3M.A07(this.A0R == byteBuffer);
        } else {
            this.A0R = byteBuffer;
            if (AbstractC01424a.A02 < 21) {
                int remaining = byteBuffer.remaining();
                if (this.A0c != null) {
                    int bytesRemaining = this.A0c.length;
                }
                this.A0c = new byte[remaining];
                int error = byteBuffer.position();
                byteBuffer.get(this.A0c, 0, remaining);
                byteBuffer.position(error);
                this.A06 = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        String[] strArr = A10;
        if (strArr[0].charAt(31) != strArr[3].charAt(31)) {
            String[] strArr2 = A10;
            strArr2[0] = "3eWYirSbyPmDL1bYCzZXBxfzFZ0IdKrC";
            strArr2[3] = "GyxGkXW2OhP0jBJSoZP6T4LL67dzWnKX";
            int i = 0;
            if (AbstractC01424a.A02 < 21) {
                int A0C = this.A0k.A0C(this.A0C);
                if (A0C > 0) {
                    i = this.A0D.write(this.A0c, this.A06, Math.min(remaining2, A0C));
                    if (i > 0) {
                        this.A06 += i;
                        byteBuffer.position(byteBuffer.position() + i);
                    }
                }
            } else {
                boolean z = this.A0b;
                int error2 = A10[5].charAt(7);
                if (error2 != 67) {
                    A10[7] = "ZkKj9ZygtLpdvIDMWffq04xWvvg8fJzl";
                    if (!z) {
                        i = A04(this.A0D, byteBuffer, remaining2);
                    } else {
                        C3M.A08(j != -9223372036854775807L);
                        i = A05(this.A0D, byteBuffer, remaining2, j);
                    }
                }
            }
            this.A07 = SystemClock.elapsedRealtime();
            if (i < 0) {
                C8M c8m = new C8M(i, this.A0K.A07, A0k(i) && this.A0B > 0);
                if (this.A0I != null) {
                    this.A0I.ACV(c8m);
                }
                if (!c8m.A02) {
                    this.A0o.A01(c8m);
                    return;
                }
                throw c8m;
            }
            this.A0o.A00();
            if (A0l(this.A0D)) {
                if (this.A0B > 0) {
                    this.A0V = false;
                }
                if (this.A0X && this.A0I != null && i < remaining2 && !this.A0V) {
                    this.A0I.AEO();
                }
            }
            int bytesRemaining2 = this.A0K.A04;
            if (bytesRemaining2 == 0) {
                this.A0C += i;
            }
            if (i == remaining2) {
                int bytesRemaining3 = this.A0K.A04;
                if (bytesRemaining3 != 0) {
                    C3M.A08(byteBuffer == this.A0Q);
                    long j2 = this.A0B;
                    int bytesRemaining4 = this.A04;
                    long j3 = bytesRemaining4;
                    int bytesRemaining5 = this.A05;
                    this.A0B = j2 + (j3 * bytesRemaining5);
                }
                this.A0R = null;
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (r8.A0R != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (r8.A0R != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A0f() throws C8M {
        boolean z = false;
        if (this.A03 == -1) {
            this.A03 = 0;
            z = true;
        }
        while (this.A03 < this.A0d.length) {
            AnonymousClass38 anonymousClass38 = this.A0d[this.A03];
            if (z) {
                anonymousClass38.AGW();
            }
            A0V(-9223372036854775807L);
            boolean AAG = anonymousClass38.AAG();
            String[] strArr = A10;
            if (strArr[0].charAt(31) == strArr[3].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A10;
            strArr2[0] = "SZlzkFrjT9RrDQln4ds2mG9At4QQTsjU";
            strArr2[3] = "7YjBVNvSPjH845plY2W9SI0PPB4m8Pgz";
            if (!AAG) {
                return false;
            }
            z = true;
            this.A03++;
        }
        if (this.A0R != null) {
            A0e(this.A0R, -9223372036854775807L);
            String[] strArr3 = A10;
            if (strArr3[2].charAt(24) == strArr3[6].charAt(24)) {
                A10[1] = "ih";
            }
        }
        this.A03 = -1;
        return true;
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "D45157249: Retry Audio Track Init failure with less Audio track allocation sizes; Upstream has this feature")
    private boolean A0g() throws C8H {
        if (!this.A0h.A03()) {
            return false;
        }
        this.A0D = this.A0S ? A0F() : A0G(this.A0K);
        String[] strArr = A10;
        if (strArr[2].charAt(24) != strArr[6].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A10;
        strArr2[2] = "dWhjJD4ryPYmrGCHimoCOlqhHDAwt6Vc";
        strArr2[6] = "fifoJCnFOIc3PbrGHGLYECSFH4AKcCFA";
        if (A0l(this.A0D)) {
            A0W(this.A0D);
            if (this.A0f != 3) {
                this.A0D.setOffloadDelayPadding(this.A0K.A07.A08, this.A0K.A07.A09);
            }
        }
        if (AbstractC01424a.A02 >= 31 && this.A0H != null) {
            C02448b.A00(this.A0D, this.A0H);
        }
        this.A01 = this.A0D.getAudioSessionId();
        this.A0k.A0I(this.A0D, this.A0K.A04 == 2, this.A0K.A03, this.A0K.A05, this.A0K.A00);
        A0R();
        if (this.A0F.A01 != 0) {
            this.A0D.attachAuxEffect(this.A0F.A01);
            AudioTrack audioTrack = this.A0D;
            C1P c1p = this.A0F;
            if (A10[7].length() != 32) {
                audioTrack.setAuxEffectSendLevel(c1p.A00);
            } else {
                A10[7] = "RIRRfrrRSIs4t73WNQ17weV6jTByi7uZ";
                audioTrack.setAuxEffectSendLevel(c1p.A00);
            }
        }
        if (this.A0J != null && AbstractC01424a.A02 >= 23) {
            C8a.A00(this.A0D, this.A0J);
        }
        this.A0Y = true;
        if (this.A0I != null) {
            this.A0I.ACW(this.A0K.A0B());
        }
        return true;
    }

    private boolean A0h() {
        return this.A0D != null;
    }

    private boolean A0i() {
        if (!this.A0b) {
            if (A0L(271, 9, 70).equals(this.A0K.A07.A0W) && !A0j(this.A0K.A07.A0C)) {
                return true;
            }
        }
        return false;
    }

    private boolean A0j(int i) {
        return this.A0s && AbstractC01424a.A14(i);
    }

    public static boolean A0k(int i) {
        return (AbstractC01424a.A02 >= 24 && i == -6) || i == -32;
    }

    public static boolean A0l(AudioTrack audioTrack) {
        return AbstractC01424a.A02 >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A0m(C1830or c1830or, C1836oy c1836oy) {
        int A03;
        int channelConfig;
        if (AbstractC01424a.A02 < 29 || this.A0f == 0 || (A03 = AbstractC00972h.A03((String) C3M.A01(c1830or.A0W), c1830or.A0R)) == 0) {
            return false;
        }
        int encoding = c1830or.A06;
        int channelConfig2 = AbstractC01424a.A01(encoding);
        if (channelConfig2 == 0) {
            return false;
        }
        int encoding2 = c1830or.A0G;
        switch (A03(A0D(encoding2, channelConfig2, A03), c1836oy.A01().A00)) {
            case 0:
                return false;
            case 1:
                int encoding3 = c1830or.A08;
                if (encoding3 == 0) {
                    int encoding4 = c1830or.A09;
                    if (encoding4 == 0) {
                        channelConfig = 0;
                        int encoding5 = this.A0f;
                        int encoding6 = encoding5 != 1 ? 1 : 0;
                        return channelConfig != 0 || encoding6 == 0;
                    }
                }
                channelConfig = 1;
                int encoding52 = this.A0f;
                if (encoding52 != 1) {
                }
                if (channelConfig != 0) {
                }
            case 2:
                return true;
            default:
                throw new IllegalStateException();
        }
    }

    public final int A0o(C1830or c1830or) {
        if (!A0L(271, 9, 70).equals(c1830or.A0W)) {
            return ((this.A0W || !A0m(c1830or, this.A0E)) && !this.A0j.A0B(c1830or)) ? 0 : 2;
        }
        if (!AbstractC01424a.A15(c1830or.A0C)) {
            AnonymousClass44.A07(A0L(7, 16, 23), A0L(85, 22, 8) + c1830or.A0C);
            return 0;
        }
        int i = c1830or.A0C;
        if (A10[7].length() != 32) {
            throw new RuntimeException();
        }
        A10[1] = "pL";
        return (i == 2 || (this.A0s && c1830or.A0C == 4)) ? 2 : 1;
    }

    public final boolean A0p() {
        return A0K().A03;
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    public final void A51(C1830or c1830or, int i, int[] iArr) throws C8G {
        int outputSampleRate;
        AnonymousClass38[] anonymousClass38Arr;
        int outputSampleRate2;
        int outputPcmFrameSize;
        int outputChannelConfig;
        int intValue;
        int outputEncoding;
        int outputMode = i;
        int[] iArr2 = iArr;
        if (A0L(271, 9, 70).equals(c1830or.A0W)) {
            C3M.A07(AbstractC01424a.A15(c1830or.A0C));
            outputSampleRate = AbstractC01424a.A06(c1830or.A0C, c1830or.A06);
            if (A0j(c1830or.A0C)) {
                anonymousClass38Arr = this.A0t;
            } else {
                anonymousClass38Arr = this.A0u;
            }
            C9I c9i = this.A0p;
            int inputPcmFrameSize = c1830or.A08;
            c9i.A0E(inputPcmFrameSize, c1830or.A09);
            int inputPcmFrameSize2 = AbstractC01424a.A02;
            if (inputPcmFrameSize2 < 21) {
                int inputPcmFrameSize3 = c1830or.A06;
                if (inputPcmFrameSize3 == 8 && iArr2 == null) {
                    iArr2 = new int[6];
                    for (int inputPcmFrameSize4 = 0; inputPcmFrameSize4 < iArr2.length; inputPcmFrameSize4++) {
                        iArr2[inputPcmFrameSize4] = inputPcmFrameSize4;
                    }
                }
            }
            this.A0l.A0C(iArr2);
            int i2 = c1830or.A0G;
            int inputPcmFrameSize5 = c1830or.A06;
            AnonymousClass36 anonymousClass36 = new AnonymousClass36(i2, inputPcmFrameSize5, c1830or.A0C);
            for (AnonymousClass38 anonymousClass38 : anonymousClass38Arr) {
                try {
                    AnonymousClass36 A4z = anonymousClass38.A4z(anonymousClass36);
                    if (anonymousClass38.AAC()) {
                        anonymousClass36 = A4z;
                    }
                } catch (AnonymousClass37 e) {
                    throw new C8G(e, c1830or);
                }
            }
            outputChannelConfig = 0;
            intValue = anonymousClass36.A02;
            outputSampleRate2 = anonymousClass36.A03;
            outputEncoding = AbstractC01424a.A01(anonymousClass36.A01);
            outputPcmFrameSize = AbstractC01424a.A06(intValue, anonymousClass36.A01);
        } else {
            outputSampleRate = -1;
            anonymousClass38Arr = new AnonymousClass38[0];
            outputSampleRate2 = c1830or.A0G;
            outputPcmFrameSize = -1;
            if (A0m(c1830or, this.A0E)) {
                outputChannelConfig = 1;
                intValue = AbstractC00972h.A03((String) C3M.A01(c1830or.A0W), c1830or.A0R);
                outputEncoding = AbstractC01424a.A01(c1830or.A06);
            } else {
                outputChannelConfig = 2;
                if (A10[1].length() == 2) {
                    A10[5] = "lAbqtU1Up8pAGeHbeXVy9OX5EzAUCGx9";
                    Pair<Integer, Integer> A09 = this.A0j.A09(c1830or);
                    if (A09 != null) {
                        intValue = ((Integer) A09.first).intValue();
                        outputEncoding = ((Integer) A09.second).intValue();
                        if (A10[7].length() == 32) {
                            A10[1] = "Lw";
                        }
                    } else {
                        throw new C8G(A0L(207, 37, 24) + c1830or, c1830or);
                    }
                }
                throw new RuntimeException();
            }
        }
        String A0L = A0L(0, 7, 114);
        if (intValue != 0) {
            if (outputEncoding != 0) {
                if (outputMode == 0) {
                    InterfaceC02468d interfaceC02468d = this.A0m;
                    int A01 = A01(outputSampleRate2, outputEncoding, intValue);
                    int outputChannelConfig2 = outputPcmFrameSize != -1 ? outputPcmFrameSize : 1;
                    outputMode = interfaceC02468d.A6x(A01, intValue, outputChannelConfig, outputChannelConfig2, outputSampleRate2, c1830or.A05, this.A0r ? 8.0d : 1.0d);
                }
                this.A0W = false;
                C02478f c02478f = new C02478f(c1830or, outputSampleRate, outputChannelConfig, outputPcmFrameSize, outputSampleRate2, outputEncoding, intValue, outputMode, anonymousClass38Arr, this.A0b);
                if (A0h()) {
                    this.A0L = c02478f;
                    return;
                } else {
                    this.A0K = c02478f;
                    return;
                }
            }
            throw new C8G(A0L(107, 36, 56) + outputChannelConfig + A0L + c1830or, c1830or);
        }
        throw new C8G(A0L(Opcodes.D2L, 30, 72) + outputChannelConfig + A0L + c1830or, c1830or);
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    public final void A5r() {
        if (this.A0b) {
            this.A0b = false;
            flush();
        }
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    public final void A6E() {
        C3M.A08(AbstractC01424a.A02 >= 21);
        C3M.A08(this.A0T);
        if (!this.A0b) {
            this.A0b = true;
            flush();
        }
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    public final void A6L() {
        if (AbstractC01424a.A02 < 25) {
            flush();
            return;
        }
        this.A0o.A00();
        this.A0n.A00();
        if (!A0h()) {
            return;
        }
        A0Q();
        if (this.A0k.A0J()) {
            this.A0D.pause();
        }
        this.A0D.flush();
        this.A0k.A0E();
        this.A0k.A0I(this.A0D, this.A0K.A04 == 2, this.A0K.A03, this.A0K.A05, this.A0K.A00);
        this.A0Y = true;
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    public final long A7X(boolean z) {
        if (!A0h() || this.A0Y) {
            return Long.MIN_VALUE;
        }
        long A0D = this.A0k.A0D(z);
        C02478f c02478f = this.A0K;
        long positionUs = A07();
        return A09(A08(Math.min(A0D, c02478f.A08(positionUs))));
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    public final C1814ob A8e() {
        if (this.A0r) {
            return this.A0G;
        }
        return A0I();
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    public final boolean A9W(ByteBuffer byteBuffer, final long adjustmentUs, int i) throws C8H, C8M {
        C3M.A07(this.A0Q == null || byteBuffer == this.A0Q);
        if (this.A0L != null) {
            if (!A0f()) {
                return false;
            }
            if (this.A0L.A0E(this.A0K)) {
                this.A0K = this.A0L;
                this.A0L = null;
                if (A0l(this.A0D) && this.A0f != 3) {
                    if (this.A0D.getPlayState() == 3) {
                        this.A0D.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.A0D;
                    int i2 = this.A0K.A07.A08;
                    String[] strArr = A10;
                    if (strArr[0].charAt(31) != strArr[3].charAt(31)) {
                        String[] strArr2 = A10;
                        strArr2[0] = "jzTmuhmcT6oYK5lhq8C6QOSyUXF7wdwQ";
                        strArr2[3] = "cWMrj79Gd0zdSeVIzQJ8siz7G3nSjdgD";
                        audioTrack.setOffloadDelayPadding(i2, this.A0K.A07.A09);
                        this.A0V = true;
                    } else {
                        throw new RuntimeException();
                    }
                }
            } else {
                A0P();
                if (A9g()) {
                    return false;
                }
                flush();
            }
            A0U(adjustmentUs);
        }
        if (!A0h()) {
            try {
                if (!A0g()) {
                    return false;
                }
            } catch (C8H e) {
                if (!e.A02) {
                    this.A0n.A01(e);
                    return false;
                }
                throw e;
            }
        }
        this.A0n.A00();
        if (this.A0Y) {
            this.A08 = Math.max(0L, adjustmentUs);
            this.A0Z = false;
            this.A0Y = false;
            if (this.A0r && AbstractC01424a.A02 >= 23) {
                A0b(this.A0G);
            }
            A0U(adjustmentUs);
            if (this.A0X) {
                AGG();
            }
        }
        if (!this.A0k.A0N(A07())) {
            return false;
        }
        if (this.A0Q == null) {
            C3M.A07(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.A0K.A04 != 0 && this.A04 == 0) {
                this.A04 = A02(this.A0K.A03, byteBuffer);
                if (this.A04 == 0) {
                    return true;
                }
            }
            if (this.A0M != null) {
                if (!A0f()) {
                    return false;
                }
                A0U(adjustmentUs);
                this.A0M = null;
            }
            final long A09 = this.A08 + this.A0K.A09(A06() - this.A0p.A0C());
            if (!this.A0Z && Math.abs(A09 - adjustmentUs) > 200000) {
                if (this.A0I != null) {
                    this.A0I.ACV(new Exception(adjustmentUs, A09) { // from class: com.facebook.ads.redexgen.X.8L
                        public static byte[] A02;
                        public final long A00;
                        public final long A01;

                        static {
                            A01();
                        }

                        public static String A00(int i3, int i4, int i5) {
                            byte[] copyOfRange = Arrays.copyOfRange(A02, i3, i3 + i4);
                            for (int i6 = 0; i6 < copyOfRange.length; i6++) {
                                copyOfRange[i6] = (byte) ((copyOfRange[i6] - i5) - 106);
                            }
                            return new String(copyOfRange);
                        }

                        public static void A01() {
                            A02 = new byte[]{-20, -32, 39, 47, 52, -32, Ascii.GS, 54, 45, 64, 56, 45, 43, 60, 45, 44, -24, 41, Base64.padSymbol, 44, 49, 55, -24, 60, 58, 41, 43, 51, -24, 60, 49, 53, 45, 59, 60, 41, 53, 56, -24, 44, 49, 59, 43, 55, 54, 60, 49, 54, Base64.padSymbol, 49, 60, 65, 2, -24, 45, 64, 56, 45, 43, 60, 45, 44, -24};
                        }

                        {
                            super(A00(6, 57, 94) + A09 + A00(0, 6, 86) + adjustmentUs);
                            this.A00 = adjustmentUs;
                            this.A01 = A09;
                        }
                    });
                }
                this.A0Z = true;
            }
            if (this.A0Z) {
                if (!A0f()) {
                    return false;
                }
                long j = adjustmentUs - A09;
                this.A08 += j;
                this.A0Z = false;
                A0U(adjustmentUs);
                if (this.A0I != null && j != 0) {
                    this.A0I.AEh();
                }
            }
            if (this.A0K.A04 == 0) {
                this.A0A += byteBuffer.remaining();
            } else {
                this.A09 += this.A04 * i;
            }
            this.A0Q = byteBuffer;
            this.A05 = i;
        }
        A0V(adjustmentUs);
        if (!this.A0Q.hasRemaining()) {
            this.A0Q = null;
            this.A05 = 0;
            return true;
        }
        if (this.A0k.A0M(A07())) {
            AnonymousClass44.A07(A0L(7, 16, 23), A0L(Opcodes.GETSTATIC, 29, 2));
            flush();
            return true;
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    public final void A9Z() {
        this.A0Z = true;
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    public final boolean A9g() {
        return A0h() && this.A0k.A0L(A07());
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    public final boolean AAG() {
        return !A0h() || (this.A0U && !A9g());
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    public final void AGG() {
        this.A0X = true;
        if (A0h()) {
            this.A0k.A0F();
            this.A0D.play();
        }
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    public final void AGI() throws C8M {
        if (!this.A0U && A0h() && A0f()) {
            A0P();
            this.A0U = true;
        }
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    public final void AIW(C1836oy c1836oy) {
        if (this.A0E.equals(c1836oy)) {
            return;
        }
        this.A0E = c1836oy;
        if (this.A0b) {
            return;
        }
        flush();
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    public final void AIX(int i) {
        if (this.A01 != i) {
            this.A01 = i;
            this.A0T = i != 0;
            flush();
        }
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    public final void AIY(C1P c1p) {
        if (this.A0F.equals(c1p)) {
            return;
        }
        int i = c1p.A01;
        float f = c1p.A00;
        if (this.A0D != null) {
            int effectId = this.A0F.A01;
            if (effectId != i) {
                AudioTrack audioTrack = this.A0D;
                if (A10[7].length() != 32) {
                    throw new RuntimeException();
                }
                String[] strArr = A10;
                strArr[0] = "ejzMDVkCKjmiTtIYDMlHFxA2dL6L7Th4";
                strArr[3] = "3op87oKeQBz5MvPCbX5N1e1cWqib6LOP";
                audioTrack.attachAuxEffect(i);
            }
            if (i != 0) {
                this.A0D.setAuxEffectSendLevel(f);
            }
        }
        this.A0F = c1p;
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D45157249: Retry Audio Track Init failure with less Audio track allocation sizes")
    public final void AIg(boolean z) {
        this.A0S = z;
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    public final void AIl(C8J c8j) {
        this.A0I = c8j;
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    public final void AIt(C1814ob c1814ob) {
        C1814ob c1814ob2 = new C1814ob(AbstractC01424a.A00(c1814ob.A01, 0.1f, 8.0f), AbstractC01424a.A00(c1814ob.A00, 0.1f, 8.0f));
        if (this.A0r) {
            int i = AbstractC01424a.A02;
            String[] strArr = A10;
            if (strArr[2].charAt(24) != strArr[6].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A10;
            strArr2[0] = "mNkMATimN2JlCwGmoqKrFKrIOPJhoNaC";
            strArr2[3] = "5L3Fdp27ixuu2nNAlcGmWXwucnCjA2b5";
            if (i >= 23) {
                A0b(c1814ob2);
                return;
            }
        }
        A0c(c1814ob2, A0p());
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    public final void AIw(C02327m c02327m) {
        this.A0H = c02327m;
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    public final void AIy(AudioDeviceInfo audioDeviceInfo) {
        this.A0J = audioDeviceInfo == null ? null : new C02458c(audioDeviceInfo);
        String[] strArr = A10;
        if (strArr[2].charAt(24) != strArr[6].charAt(24)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A10;
        strArr2[0] = "fdceU7wc4F7eltehFDuXboaWNHZsjBbo";
        strArr2[3] = "ndF9ePFUZlaV1XmuWN8y5PTJytJgMa2t";
        if (this.A0D != null) {
            C8a.A00(this.A0D, this.A0J);
        }
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    public final void AJ4(boolean z) {
        A0c(A0I(), z);
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    public final boolean AJc(C1830or c1830or) {
        return A0o(c1830or) != 0;
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old API that can be removed when we move to MediaCodecRenderer2")
    public final boolean AJe(int i, int i2) {
        return AbstractC01424a.A15(i2) ? i2 != 4 || AbstractC01424a.A02 >= 21 : this.A0j != null && this.A0j.A0A(i2) && (i == -1 || i <= this.A0j.A08());
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    public final void flush() {
        if (A0h()) {
            A0Q();
            if (this.A0k.A0J()) {
                this.A0D.pause();
            }
            boolean A0l = A0l(this.A0D);
            if (A10[4].length() == 6) {
                throw new RuntimeException();
            }
            A10[5] = "i9Rinuw5ztOihCbMK36CN4CjOXT3DfRT";
            if (A0l) {
                C02538n c02538n = this.A0O;
                if (A10[7].length() != 32) {
                    throw new RuntimeException();
                }
                A10[7] = "H3Tn5qbfAuT8Q6Ln8VWJEFxZf5lTeqqt";
                ((C02538n) C3M.A01(c02538n)).A01(this.A0D);
            }
            if (AbstractC01424a.A02 < 21 && !this.A0T) {
                this.A01 = 0;
            }
            C8F A0B = this.A0K.A0B();
            if (this.A0L != null) {
                this.A0K = this.A0L;
                this.A0L = null;
            }
            this.A0k.A0E();
            A0Z(this.A0D, this.A0h, this.A0I, A0B);
            this.A0D = null;
        }
        this.A0o.A00();
        this.A0n.A00();
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    public final void pause() {
        this.A0X = false;
        if (A0h() && this.A0k.A0K()) {
            this.A0D.pause();
        }
    }

    @Override // com.instagram.common.viewpoint.core.C8N
    public final void setVolume(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            String[] strArr = A10;
            if (strArr[0].charAt(31) == strArr[3].charAt(31)) {
                throw new RuntimeException();
            }
            A10[5] = "E1Te023wTVVNappUuQixsG3bphOCE2I8";
            A0R();
        }
    }
}
