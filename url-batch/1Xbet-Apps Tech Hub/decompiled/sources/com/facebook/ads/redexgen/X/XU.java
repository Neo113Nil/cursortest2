package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public final class XU implements InterfaceC03689u {
    public static byte[] A04;
    public final int A00;
    public final long A01;
    public final Context A02;
    public final BK<X6> A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 84);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{113, 80, 83, 84, 64, 89, 65, 103, 80, 91, 81, 80, 71, 80, 71, 70, 115, 84, 86, 65, 90, 71, 76, Byte.MAX_VALUE, 72, 72, 85, 72, Ascii.SUB, 83, 84, 73, 78, 91, 84, 78, 83, 91, 78, 83, 84, 93, Ascii.SUB, 124, 124, 87, 74, 95, 93, Ascii.SUB, 95, 66, 78, 95, 84, 73, 83, 85, 84, 60, Ascii.VT, Ascii.VT, Ascii.SYN, Ascii.VT, 89, 16, Ascii.ETB, 10, Ascii.CR, Ascii.CAN, Ascii.ETB, Ascii.CR, 16, Ascii.CAN, Ascii.CR, 16, Ascii.ETB, Ascii.RS, 89, 63, 53, 56, 58, 89, Ascii.FS, 1, Ascii.CR, Ascii.FS, Ascii.ETB, 10, 16, Ascii.SYN, Ascii.ETB, 59, Ascii.FF, Ascii.FF, 17, Ascii.FF, 94, Ascii.ETB, 16, Ascii.CR, 10, Ascii.US, 16, 10, Ascii.ETB, Ascii.US, 10, Ascii.ETB, 16, Ascii.EM, 94, 49, Ascii.SO, Ascii.VT, Ascii.CR, 94, Ascii.ESC, 6, 10, Ascii.ESC, 16, Ascii.CR, Ascii.ETB, 17, 16, Ascii.CAN, 47, 47, 50, 47, 125, 52, 51, 46, 41, 60, 51, 41, 52, 60, 41, 52, 51, 58, 125, Ascii.VT, Ascii.CR, 100, 125, 56, 37, 41, 56, 51, 46, 52, 50, 51, 93, 126, 112, 117, 116, 117, 49, 87, 119, 124, 97, 116, 118, 80, 100, 117, 120, 126, 67, 116, Byte.MAX_VALUE, 117, 116, 99, 116, 99, 63, 81, 114, 124, 121, 120, 121, Base64.padSymbol, 81, 116, Byte.MAX_VALUE, 123, 113, 124, 126, 92, 104, 121, 116, 114, 79, 120, 115, 121, 120, 111, 120, 111, 51, 45, Ascii.SO, 0, 5, 4, 5, 65, 45, 8, 3, Ascii.SO, 17, Ascii.DC4, Ascii.DC2, 32, Ascii.DC4, 5, 8, Ascii.SO, 51, 4, Ascii.SI, 5, 4, 19, 4, 19, 79, 54, Ascii.NAK, Ascii.ESC, Ascii.RS, Ascii.US, Ascii.RS, 90, 54, 19, Ascii.CAN, Ascii.FF, 10, 2, 44, 19, Ascii.RS, Ascii.US, Ascii.NAK, 40, Ascii.US, Ascii.DC4, Ascii.RS, Ascii.US, 8, Ascii.US, 8, 84, 75, 71, 69, 6, 78, 73, 75, 77, 74, 71, 71, 67, 6, 73, 76, 91, 6, 65, 70, 92, 77, 90, 70, 73, 68, 6, 77, 80, 71, 88, 68, 73, 81, 77, 90, Ascii.SUB, 6, 77, 80, 92, 6, 78, 78, 69, 88, 77, 79, 6, 110, 78, 69, 88, 77, 79, 105, 93, 76, 65, 71, 122, 77, 70, 76, 77, 90, 77, 90, 84, 88, 90, Ascii.EM, 81, 86, 84, 82, 85, 88, 88, 92, Ascii.EM, 86, 83, 68, Ascii.EM, 94, 89, 67, 82, 69, 89, 86, 91, Ascii.EM, 82, 79, 88, 71, 91, 86, 78, 82, 69, 5, Ascii.EM, 82, 79, 67, Ascii.EM, 81, 91, 86, 84, Ascii.EM, 123, 94, 85, 81, 91, 86, 84, 118, 66, 83, 94, 88, 101, 82, 89, 83, 82, 69, 82, 69, 87, 91, 89, Ascii.SUB, 82, 85, 87, 81, 86, 91, 91, 95, Ascii.SUB, 85, 80, 71, Ascii.SUB, 93, 90, 64, 81, 70, 90, 85, 88, Ascii.SUB, 81, 76, 91, 68, 88, 85, 77, 81, 70, 6, Ascii.SUB, 81, 76, 64, Ascii.SUB, 91, 68, 65, 71, Ascii.SUB, 120, 93, 86, 91, 68, 65, 71, 117, 65, 80, 93, 91, 102, 81, 90, 80, 81, 70, 81, 70, 60, 48, 50, 113, 57, 62, 60, 58, Base64.padSymbol, 48, 48, 52, 113, 62, 59, 44, 113, 54, 49, 43, 58, 45, 49, 62, 51, 113, 58, 39, 48, 47, 51, 62, 38, 58, 45, 109, 113, 58, 39, 43, 113, 41, 47, 102, 113, 19, 54, Base64.padSymbol, 41, 47, 39, 9, 54, 59, 58, 48, Ascii.CR, 58, 49, 59, 58, 45, 58, 45};
    }

    public XU(Context context) {
        this(context, 0);
    }

    public XU(Context context, int i) {
        this(context, null, i, 5000L);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BK != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    @Deprecated
    public XU(Context context, BK<X6> bk, int i, long j) {
        this.A02 = context;
        this.A00 = i;
        this.A01 = j;
        this.A03 = bk;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BK != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    private final void A02(Context context, BK<X6> bk, long j, Handler handler, IL il, int extensionRendererIndex, ArrayList<XS> arrayList) {
        arrayList.add(new C1A(context, D4.A00, j, bk, false, handler, il, 50));
        if (extensionRendererIndex == 0) {
            return;
        }
        int size = arrayList.size();
        if (extensionRendererIndex == 2) {
            size--;
        }
        try {
            try {
                Class<?> cls = Class.forName(A00(469, 64, 11));
                Class<?> clazz = Boolean.TYPE;
                Class<?> clazz2 = Long.TYPE;
                Class<?> clazz3 = Integer.TYPE;
                try {
                    arrayList.add(size, (XS) cls.getConstructor(clazz, clazz2, Handler.class, IL.class, clazz3).newInstance(true, Long.valueOf(j), handler, il, 50));
                    Log.i(A00(0, 23, 97), A00(243, 27, 46));
                } catch (Exception e) {
                    e = e;
                    throw new RuntimeException(A00(127, 33, 9), e);
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BK != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    private final void A03(Context context, BK<X6> bk, AJ[] ajArr, Handler handler, AR ar, int i, ArrayList<XS> arrayList) {
        int extensionRendererIndex;
        int i2;
        String A00 = A00(0, 23, 97);
        arrayList.add(new C1B(context, D4.A00, bk, false, handler, ar, AC.A00(context), ajArr));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            extensionRendererIndex = size + 1;
            try {
                arrayList.add(size, (XS) Class.forName(A00(403, 66, 96)).getConstructor(Handler.class, AR.class, AJ[].class).newInstance(handler, ar, ajArr));
                Log.i(A00, A00(215, 28, 53));
            } catch (ClassNotFoundException unused) {
                size = extensionRendererIndex;
                extensionRendererIndex = size;
                i2 = extensionRendererIndex + 1;
                try {
                    try {
                        arrayList.add(extensionRendererIndex, (XS) Class.forName(A00(337, 66, 99)).getConstructor(Handler.class, AR.class, AJ[].class).newInstance(handler, ar, ajArr));
                        Log.i(A00, A00(Opcodes.NEW, 28, 73));
                    } catch (ClassNotFoundException unused2) {
                        extensionRendererIndex = i2;
                        i2 = extensionRendererIndex;
                        arrayList.add(i2, (XS) Class.forName(A00(270, 67, 124)).getConstructor(Handler.class, AR.class, AJ[].class).newInstance(handler, ar, ajArr));
                        Log.i(A00, A00(Opcodes.IF_ICMPNE, 27, 69));
                    } catch (Exception e) {
                        e = e;
                        throw new RuntimeException(A00(59, 34, 45), e);
                    }
                    arrayList.add(i2, (XS) Class.forName(A00(270, 67, 124)).getConstructor(Handler.class, AR.class, AJ[].class).newInstance(handler, ar, ajArr));
                    Log.i(A00, A00(Opcodes.IF_ICMPNE, 27, 69));
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                throw new RuntimeException(A00(93, 34, 42), e);
            }
        } catch (ClassNotFoundException unused3) {
        } catch (Exception e4) {
            e = e4;
        }
        try {
            i2 = extensionRendererIndex + 1;
            arrayList.add(extensionRendererIndex, (XS) Class.forName(A00(337, 66, 99)).getConstructor(Handler.class, AR.class, AJ[].class).newInstance(handler, ar, ajArr));
            Log.i(A00, A00(Opcodes.NEW, 28, 73));
        } catch (ClassNotFoundException unused4) {
        } catch (Exception e5) {
            e = e5;
        }
        try {
            try {
                arrayList.add(i2, (XS) Class.forName(A00(270, 67, 124)).getConstructor(Handler.class, AR.class, AJ[].class).newInstance(handler, ar, ajArr));
                Log.i(A00, A00(Opcodes.IF_ICMPNE, 27, 69));
            } catch (Exception e6) {
                e = e6;
                throw new RuntimeException(A00(23, 36, 110), e);
            }
        } catch (ClassNotFoundException unused5) {
        }
    }

    private final void A04(Context context, DH dh, Looper looper, int i, ArrayList<XS> arrayList) {
        arrayList.add(new C3D(dh, looper));
    }

    private final void A05(Context context, FZ fz, Looper looper, int i, ArrayList<XS> arrayList) {
        arrayList.add(new C3B(fz, looper));
    }

    private final AJ[] A06() {
        return new AJ[0];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BK != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC03689u
    public final XS[] A4h(Handler handler, IL il, AR ar, FZ fz, DH dh, BK<X6> bk) {
        BK<X6> bk2 = bk;
        if (bk2 == null) {
            bk2 = this.A03;
        }
        ArrayList<XS> arrayList = new ArrayList<>();
        A02(this.A02, bk2, this.A01, handler, il, this.A00, arrayList);
        A03(this.A02, bk2, A06(), handler, ar, this.A00, arrayList);
        A05(this.A02, fz, handler.getLooper(), this.A00, arrayList);
        A04(this.A02, dh, handler.getLooper(), this.A00, arrayList);
        return (XS[]) arrayList.toArray(new XS[arrayList.size()]);
    }
}
