package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.common.base.Ascii;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.nS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1752nS implements C7H {
    public static byte[] A05;
    public InterfaceC0379Dn A00;
    public final int A01;
    public final long A02;
    public final Context A03;
    public final C9U A04;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 82);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-77, -44, -43, -48, -28, -37, -29, -63, -44, -35, -45, -44, -31, -44, -31, -30, -75, -48, -46, -29, -34, -31, -24, -95, -50, -50, -53, -50, 124, -59, -54, -49, -48, -67, -54, -48, -59, -67, -48, -59, -54, -61, 124, -94, -94, -55, -52, -63, -61, 124, -63, -44, -48, -63, -54, -49, -59, -53, -54, -70, -25, -25, -28, -25, -107, -34, -29, -24, -23, -42, -29, -23, -34, -42, -23, -34, -29, -36, -107, -69, -63, -74, -72, -107, -38, -19, -23, -38, -29, -24, -34, -28, -29, -12, 33, 33, Ascii.RS, 33, -49, Ascii.CAN, Ascii.GS, 34, 35, 16, Ascii.GS, 35, Ascii.CAN, 16, 35, Ascii.CAN, Ascii.GS, Ascii.SYN, -49, -2, Ascii.US, 36, 34, -49, Ascii.DC4, 39, 35, Ascii.DC4, Ascii.GS, 34, Ascii.CAN, Ascii.RS, Ascii.GS, 6, 51, 51, 48, 51, -31, 42, 47, 52, 53, 34, 47, 53, 42, 34, 53, 42, 47, 40, -31, Ascii.ETB, 17, -6, -31, 38, 57, 53, 38, 47, 52, 42, 48, 47, 16, 51, 37, 40, 41, 40, -28, 10, 42, 49, 52, 41, 43, 5, 57, 40, 45, 51, Ascii.SYN, 41, 50, 40, 41, 54, 41, 54, -14, Ascii.SO, 49, 35, 38, 39, 38, -30, Ascii.SO, 43, 36, 40, 46, 35, 37, 3, 55, 38, 43, 49, Ascii.DC4, 39, 48, 38, 39, 52, 39, 52, -16, 6, 41, Ascii.ESC, Ascii.RS, Ascii.US, Ascii.RS, -38, 6, 35, Ascii.FS, 41, 42, 47, 45, -5, 47, Ascii.RS, 35, 41, Ascii.FF, Ascii.US, 40, Ascii.RS, Ascii.US, 44, Ascii.US, 44, -24, 4, 39, Ascii.EM, Ascii.FS, Ascii.GS, Ascii.FS, -40, 4, 33, Ascii.SUB, 46, 40, 48, Ascii.SO, 33, Ascii.FS, Ascii.GS, 39, 10, Ascii.GS, 38, Ascii.FS, Ascii.GS, 42, Ascii.GS, 42, -26, -7, 5, 3, -60, -4, -9, -7, -5, -8, 5, 5, 1, -60, -9, -6, 9, -60, -9, 4, -6, 8, 5, -1, -6, Ascii.SO, -60, 3, -5, -6, -1, -9, -55, -60, -5, Ascii.SO, 5, 6, 2, -9, Ascii.SI, -5, 8, -60, -5, Ascii.SO, 10, -60, -4, -4, 3, 6, -5, -3, -60, -36, -4, 3, 6, -5, -3, -41, Ascii.VT, -6, -1, 5, -24, -5, 4, -6, -5, 8, -5, 8, Ascii.ESC, 39, 37, -26, Ascii.RS, Ascii.EM, Ascii.ESC, Ascii.GS, Ascii.SUB, 39, 39, 35, -26, Ascii.EM, Ascii.FS, 43, -26, Ascii.EM, 38, Ascii.FS, 42, 39, 33, Ascii.FS, 48, -26, 37, Ascii.GS, Ascii.FS, 33, Ascii.EM, -21, -26, Ascii.GS, 48, 39, 40, 36, Ascii.EM, 49, Ascii.GS, 42, -26, Ascii.GS, 48, 44, -26, Ascii.RS, 36, Ascii.EM, Ascii.ESC, -26, 4, 33, Ascii.SUB, Ascii.RS, 36, Ascii.EM, Ascii.ESC, -7, 45, Ascii.FS, 33, 39, 10, Ascii.GS, 38, Ascii.FS, Ascii.GS, 42, Ascii.GS, 42, -56, -44, -46, -109, -53, -58, -56, -54, -57, -44, -44, -48, -109, -58, -55, -40, -109, -58, -45, -55, -41, -44, -50, -55, -35, -109, -46, -54, -55, -50, -58, -104, -109, -54, -35, -44, -43, -47, -58, -34, -54, -41, -109, -54, -35, -39, -109, -44, -43, -38, -40, -109, -79, -50, -57, -44, -43, -38, -40, -90, -38, -55, -50, -44, -73, -54, -45, -55, -54, -41, -54, -41, 35, 47, 45, -18, 38, 33, 35, 37, 34, 47, 47, 43, -18, 33, 36, 51, -18, 33, 46, 36, 50, 47, 41, 36, 56, -18, 45, 37, 36, 41, 33, -13, -18, 37, 56, 47, 48, 44, 33, 57, 37, 50, -18, 37, 56, 52, -18, 54, 48, -7, -18, Ascii.FF, 41, 34, 54, 48, 56, Ascii.SYN, 41, 36, 37, 47, Ascii.DC2, 37, 46, 36, 37, 50, 37, 50};
    }

    public C1752nS(Context context) {
        this(context, 0);
    }

    public C1752nS(Context context, int i) {
        this(context, null, i, 5000L);
    }

    @Deprecated
    public C1752nS(Context context, C9U c9u, int i, long j) {
        this.A00 = new C1753nT(this);
        this.A03 = context;
        this.A01 = i;
        this.A02 = j;
        this.A04 = c9u;
    }

    private final void A02(Context context, C9U c9u, long j, Handler handler, InterfaceC0432Fo interfaceC0432Fo, int extensionRendererIndex, ArrayList<InterfaceC1746nM> arrayList) {
        Class<?> cls;
        Class<?> clazz;
        Class<?> clazz2;
        Class<?> clazz3;
        arrayList.add(new C0O(context, C1431hv.A0S, new MediaCodecRendererMetaParameters(null, false), InterfaceC0308Ar.A00, j, c9u, false, false, handler, interfaceC0432Fo, 50, 5, 0, 0, 0));
        if (extensionRendererIndex == 0) {
            return;
        }
        int size = arrayList.size();
        if (extensionRendererIndex == 2) {
            size--;
        }
        try {
            try {
                cls = Class.forName(A00(487, 70, 110));
                clazz = Boolean.TYPE;
                clazz2 = Long.TYPE;
                clazz3 = Integer.TYPE;
            } catch (Exception e) {
                e = e;
            }
            try {
                arrayList.add(size, (InterfaceC1746nM) cls.getConstructor(clazz, clazz2, Handler.class, InterfaceC0432Fo.class, clazz3, clazz3).newInstance(true, Long.valueOf(j), handler, interfaceC0432Fo, 50, 5));
                Log.i(A00(0, 23, 29), A00(243, 27, 102));
            } catch (Exception e2) {
                e = e2;
                throw new RuntimeException(A00(127, 33, 111), e);
            }
        } catch (ClassNotFoundException unused) {
        }
    }

    private final void A03(Context context, C9U c9u, AnonymousClass38[] anonymousClass38Arr, Handler handler, C8D c8d, int extensionRendererIndex, ArrayList<InterfaceC1746nM> arrayList) {
        int extensionRendererIndex2;
        int extensionRendererIndex3;
        String A00 = A00(0, 23, 29);
        arrayList.add(new C0Q(context, C1431hv.A0S, new MediaCodecRendererMetaParameters(null, false), InterfaceC0308Ar.A00, c9u, false, false, false, handler, c8d, C02417p.A02(context), anonymousClass38Arr));
        if (extensionRendererIndex == 0) {
            return;
        }
        int size = arrayList.size();
        if (extensionRendererIndex == 2) {
            size--;
        }
        try {
            extensionRendererIndex2 = size + 1;
            try {
                arrayList.add(size, (InterfaceC1746nM) Class.forName(A00(415, 72, 19)).getConstructor(Handler.class, C8D.class, AnonymousClass38[].class).newInstance(handler, c8d, anonymousClass38Arr));
                Log.i(A00, A00(215, 28, 104));
            } catch (ClassNotFoundException unused) {
                size = extensionRendererIndex2;
                extensionRendererIndex2 = size;
                Constructor<?> constructor = Class.forName(A00(343, 72, 102)).getConstructor(Handler.class, C8D.class, AnonymousClass38[].class);
                extensionRendererIndex3 = extensionRendererIndex2 + 1;
                arrayList.add(extensionRendererIndex2, (InterfaceC1746nM) constructor.newInstance(handler, c8d, anonymousClass38Arr));
                Log.i(A00, A00(Opcodes.NEW, 28, 112));
                try {
                    Constructor<?> constructor2 = Class.forName(A00(270, 73, 68)).getConstructor(Handler.class, C8D.class, AnonymousClass38[].class);
                } catch (Exception e) {
                    e = e;
                }
                try {
                    arrayList.add(extensionRendererIndex3, (InterfaceC1746nM) constructor2.newInstance(handler, c8d, anonymousClass38Arr));
                    Log.i(A00, A00(Opcodes.IF_ICMPNE, 27, Opcodes.FREM));
                } catch (Exception e2) {
                    e = e2;
                    throw new RuntimeException(A00(23, 36, 10), e);
                }
            } catch (Exception e3) {
                e = e3;
                throw new RuntimeException(A00(93, 34, 93), e);
            }
        } catch (ClassNotFoundException unused2) {
        } catch (Exception e4) {
            e = e4;
        }
        try {
            Constructor<?> constructor3 = Class.forName(A00(343, 72, 102)).getConstructor(Handler.class, C8D.class, AnonymousClass38[].class);
            extensionRendererIndex3 = extensionRendererIndex2 + 1;
        } catch (ClassNotFoundException unused3) {
        } catch (Exception e5) {
            e = e5;
        }
        try {
            try {
                arrayList.add(extensionRendererIndex2, (InterfaceC1746nM) constructor3.newInstance(handler, c8d, anonymousClass38Arr));
                Log.i(A00, A00(Opcodes.NEW, 28, 112));
            } catch (ClassNotFoundException unused4) {
                extensionRendererIndex2 = extensionRendererIndex3;
                extensionRendererIndex3 = extensionRendererIndex2;
                Constructor<?> constructor22 = Class.forName(A00(270, 73, 68)).getConstructor(Handler.class, C8D.class, AnonymousClass38[].class);
                arrayList.add(extensionRendererIndex3, (InterfaceC1746nM) constructor22.newInstance(handler, c8d, anonymousClass38Arr));
                Log.i(A00, A00(Opcodes.IF_ICMPNE, 27, Opcodes.FREM));
            } catch (Exception e6) {
                e = e6;
                throw new RuntimeException(A00(59, 34, 35), e);
            }
            Constructor<?> constructor222 = Class.forName(A00(270, 73, 68)).getConstructor(Handler.class, C8D.class, AnonymousClass38[].class);
            arrayList.add(extensionRendererIndex3, (InterfaceC1746nM) constructor222.newInstance(handler, c8d, anonymousClass38Arr));
            Log.i(A00, A00(Opcodes.IF_ICMPNE, 27, Opcodes.FREM));
        } catch (ClassNotFoundException unused5) {
        }
    }

    private final void A04(Context context, B3 b3, Looper looper, int i, ArrayList<InterfaceC1746nM> arrayList) {
        arrayList.add(new AnonymousClass13(b3, looper));
    }

    private final void A05(Context context, InterfaceC0382Dq interfaceC0382Dq, Looper looper, int i, ArrayList<InterfaceC1746nM> arrayList) {
        arrayList.add(new C00710z(interfaceC0382Dq, looper, this.A00));
    }

    private final AnonymousClass38[] A06() {
        return new AnonymousClass38[0];
    }

    @Override // com.instagram.common.viewpoint.core.C7H
    public final InterfaceC1746nM[] A5Q(Handler handler, InterfaceC0432Fo interfaceC0432Fo, C8D c8d, InterfaceC0382Dq interfaceC0382Dq, B3 b3, C9U c9u) {
        C9U c9u2 = c9u;
        if (c9u2 == null) {
            c9u2 = this.A04;
        }
        ArrayList<InterfaceC1746nM> arrayList = new ArrayList<>();
        A02(this.A03, c9u2, this.A02, handler, interfaceC0432Fo, this.A01, arrayList);
        A03(this.A03, c9u2, A06(), handler, c8d, this.A01, arrayList);
        A05(this.A03, interfaceC0382Dq, handler.getLooper(), this.A01, arrayList);
        A04(this.A03, b3, handler.getLooper(), this.A01, arrayList);
        return (InterfaceC1746nM[]) arrayList.toArray(new InterfaceC1746nM[arrayList.size()]);
    }
}
