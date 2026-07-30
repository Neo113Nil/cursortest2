package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.WindowInsetsAnimation;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.majelw.libystne.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tt1 implements qw1, yp2, ek0, ce2, wg2, uu1, al3 {
    public final /* synthetic */ int m;
    public Object n;
    public Object o;

    public tt1(int i) {
        this.m = i;
        int i2 = 3;
        switch (i) {
            case 8:
                this.n = new LinkedHashMap();
                this.o = new LinkedHashMap();
                break;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                this.n = new dq2(i2);
                this.o = new yg1(16);
                break;
            case 15:
                this.n = new eo1(new Reference[16]);
                this.o = new ReferenceQueue();
                break;
            case 19:
                this.n = Collections.synchronizedMap(new WeakHashMap());
                this.o = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 20:
                sv0 sv0Var = sv0.d;
                this.n = new SparseIntArray();
                this.o = sv0Var;
                break;
            case 22:
                this.n = new HashMap();
                this.o = new sc3(6);
                sc3 sc3Var = new sc3(0);
                ld3 ld3Var = ld3.BITWISE_AND;
                ArrayList arrayList = sc3Var.a;
                arrayList.add(ld3Var);
                arrayList.add(ld3.BITWISE_LEFT_SHIFT);
                arrayList.add(ld3.BITWISE_NOT);
                arrayList.add(ld3.BITWISE_OR);
                arrayList.add(ld3.BITWISE_RIGHT_SHIFT);
                arrayList.add(ld3.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(ld3.BITWISE_XOR);
                w(sc3Var);
                sc3 sc3Var2 = new sc3(1);
                ld3 ld3Var2 = ld3.EQUALS;
                ArrayList arrayList2 = sc3Var2.a;
                arrayList2.add(ld3Var2);
                arrayList2.add(ld3.GREATER_THAN);
                arrayList2.add(ld3.GREATER_THAN_EQUALS);
                arrayList2.add(ld3.IDENTITY_EQUALS);
                arrayList2.add(ld3.IDENTITY_NOT_EQUALS);
                arrayList2.add(ld3.LESS_THAN);
                arrayList2.add(ld3.LESS_THAN_EQUALS);
                arrayList2.add(ld3.NOT_EQUALS);
                w(sc3Var2);
                sc3 sc3Var3 = new sc3(2);
                ld3 ld3Var3 = ld3.APPLY;
                ArrayList arrayList3 = sc3Var3.a;
                arrayList3.add(ld3Var3);
                arrayList3.add(ld3.BLOCK);
                arrayList3.add(ld3.BREAK);
                arrayList3.add(ld3.CASE);
                arrayList3.add(ld3.DEFAULT);
                arrayList3.add(ld3.CONTINUE);
                arrayList3.add(ld3.DEFINE_FUNCTION);
                arrayList3.add(ld3.FN);
                arrayList3.add(ld3.IF);
                arrayList3.add(ld3.QUOTE);
                arrayList3.add(ld3.RETURN);
                arrayList3.add(ld3.SWITCH);
                arrayList3.add(ld3.TERNARY);
                w(sc3Var3);
                sc3 sc3Var4 = new sc3(3);
                ld3 ld3Var4 = ld3.AND;
                ArrayList arrayList4 = sc3Var4.a;
                arrayList4.add(ld3Var4);
                arrayList4.add(ld3.NOT);
                arrayList4.add(ld3.OR);
                w(sc3Var4);
                sc3 sc3Var5 = new sc3(4);
                ld3 ld3Var5 = ld3.FOR_IN;
                ArrayList arrayList5 = sc3Var5.a;
                arrayList5.add(ld3Var5);
                arrayList5.add(ld3.FOR_IN_CONST);
                arrayList5.add(ld3.FOR_IN_LET);
                arrayList5.add(ld3.FOR_LET);
                arrayList5.add(ld3.FOR_OF);
                arrayList5.add(ld3.FOR_OF_CONST);
                arrayList5.add(ld3.FOR_OF_LET);
                arrayList5.add(ld3.WHILE);
                w(sc3Var5);
                sc3 sc3Var6 = new sc3(5);
                ld3 ld3Var6 = ld3.ADD;
                ArrayList arrayList6 = sc3Var6.a;
                arrayList6.add(ld3Var6);
                arrayList6.add(ld3.DIVIDE);
                arrayList6.add(ld3.MODULUS);
                arrayList6.add(ld3.MULTIPLY);
                arrayList6.add(ld3.NEGATE);
                arrayList6.add(ld3.POST_DECREMENT);
                arrayList6.add(ld3.POST_INCREMENT);
                arrayList6.add(ld3.PRE_DECREMENT);
                arrayList6.add(ld3.PRE_INCREMENT);
                arrayList6.add(ld3.SUBTRACT);
                w(sc3Var6);
                sc3 sc3Var7 = new sc3(7);
                ld3 ld3Var7 = ld3.ASSIGN;
                ArrayList arrayList7 = sc3Var7.a;
                arrayList7.add(ld3Var7);
                arrayList7.add(ld3.CONST);
                arrayList7.add(ld3.CREATE_ARRAY);
                arrayList7.add(ld3.CREATE_OBJECT);
                arrayList7.add(ld3.EXPRESSION_LIST);
                arrayList7.add(ld3.GET);
                arrayList7.add(ld3.GET_INDEX);
                arrayList7.add(ld3.GET_PROPERTY);
                arrayList7.add(ld3.NULL);
                arrayList7.add(ld3.SET_PROPERTY);
                arrayList7.add(ld3.TYPEOF);
                arrayList7.add(ld3.UNDEFINED);
                arrayList7.add(ld3.VAR);
                w(sc3Var7);
                break;
            default:
                this.n = new eo1(new i91[16]);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [ul1] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [ul1] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [eo1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eo1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void l(i91 i91Var) {
        if (i91Var.X > 0) {
            if (i91Var.Q.d == e91.q && !i91Var.p() && !i91Var.q() && !i91Var.Y && i91Var.J()) {
                ul1 ul1Var = i91Var.P.f;
                if ((ul1Var.p & 256) != 0) {
                    while (ul1Var != null) {
                        if ((ul1Var.o & 256) != 0) {
                            p90 p90Var = ul1Var;
                            ?? r5 = 0;
                            while (p90Var != 0) {
                                if (p90Var instanceof iv0) {
                                    iv0 iv0Var = (iv0) p90Var;
                                    iv0Var.y(s03.H(iv0Var, 256));
                                } else if ((p90Var.o & 256) != 0 && (p90Var instanceof p90)) {
                                    ul1 ul1Var2 = p90Var.B;
                                    int i = 0;
                                    p90Var = p90Var;
                                    r5 = r5;
                                    while (ul1Var2 != null) {
                                        if ((ul1Var2.o & 256) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                p90Var = ul1Var2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new eo1(new ul1[16]);
                                                }
                                                if (p90Var != 0) {
                                                    r5.b(p90Var);
                                                    p90Var = 0;
                                                }
                                                r5.b(ul1Var2);
                                            }
                                        }
                                        ul1Var2 = ul1Var2.r;
                                        p90Var = p90Var;
                                        r5 = r5;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                p90Var = s03.c(r5);
                            }
                        }
                        if ((ul1Var.p & 256) == 0) {
                            break;
                        } else {
                            ul1Var = ul1Var.r;
                        }
                    }
                }
            }
            i91Var.W = false;
            eo1 y = i91Var.y();
            Object[] objArr = y.m;
            int i2 = y.o;
            for (int i3 = 0; i3 < i2; i3++) {
                l((i91) objArr[i3]);
            }
        }
    }

    public static ni0 n(r01 r01Var, Throwable th) {
        if (th instanceof it1) {
            r01Var.getClass();
            r80 r80Var = r01Var.z;
            r80Var.getClass();
            r80 r80Var2 = k.a;
            r80Var.getClass();
        } else {
            r01Var.z.getClass();
            r80 r80Var3 = k.a;
        }
        return new ni0(null, r01Var, th);
    }

    @Override // defpackage.yp2
    public void a(ak1 ak1Var, Bitmap bitmap, Map map) {
        int i;
        int k = k31.k(bitmap);
        j72 j72Var = (j72) this.o;
        synchronized (j72Var.c) {
            i = j72Var.a;
        }
        j72 j72Var2 = (j72) this.o;
        if (k <= i) {
            j72Var2.d(ak1Var, new i72(bitmap, map, k));
        } else {
            j72Var2.e(ak1Var);
            ((r5) this.n).j(ak1Var, bitmap, map, k);
        }
    }

    @Override // defpackage.wg2
    public int b(int i) {
        do {
            i = ((sg) this.o).n(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.n).charAt(i)));
        return i;
    }

    @Override // defpackage.qw1
    public List c(Integer num) {
        List c = ((qw1) this.n).c(null);
        zl2 zl2Var = (zl2) this.o;
        int i = zl2Var.v;
        return i < 0 ? c : zv.E(s03.g(zl2Var, num, i, Integer.valueOf(zl2Var.D(zl2Var.b, i))), c);
    }

    @Override // defpackage.wg2
    public int d(int i) {
        do {
            i = ((sg) this.o).k(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.n).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.ce2
    public Object e(Object obj) {
        return ((Function1) this.o).invoke(obj);
    }

    @Override // defpackage.wg2
    public int f(int i) {
        CharSequence charSequence = (CharSequence) this.n;
        do {
            i = ((sg) this.o).k(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.wg2
    public int g(int i) {
        do {
            i = ((sg) this.o).n(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.n).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.w52
    public Object get() {
        dq2 dq2Var = new dq2(15);
        dq2 dq2Var2 = new dq2(9);
        Object obj = ((w52) this.n).get();
        w52 w52Var = (w52) this.o;
        return new tc2(dq2Var, dq2Var2, xl.f, (ue2) obj, w52Var);
    }

    @Override // defpackage.yp2
    public bk1 h(ak1 ak1Var) {
        i72 i72Var = (i72) ((j72) this.o).c(ak1Var);
        if (i72Var != null) {
            return new bk1(i72Var.a, i72Var.b);
        }
        return null;
    }

    @Override // defpackage.ce2
    public Object i(id2 id2Var, Object obj) {
        return ((Function2) this.n).invoke(id2Var, obj);
    }

    @Override // defpackage.yp2
    public void j(int i) {
        int i2;
        if (i >= 40) {
            ((j72) this.o).h(-1);
            return;
        }
        if (10 > i || i >= 20) {
            return;
        }
        j72 j72Var = (j72) this.o;
        synchronized (j72Var.c) {
            i2 = j72Var.d;
        }
        j72Var.h(i2 / 2);
    }

    public void k(Object obj, String str) {
        ((ArrayList) this.n).add(str + "=" + String.valueOf(obj));
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x019c, code lost:
    
        r0 = new defpackage.zu0[]{r7, r5}[1].b;
        r2 = r22 - r0.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a8, code lost:
    
        if (r7 >= r2) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01aa, code lost:
    
        r21[r4 + r7] = 0;
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b2, code lost:
    
        java.lang.System.arraycopy(r0, 0, r21, r4 + r2, r0.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b8, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(int[] iArr, int i) {
        zu0 zu0Var;
        zu0 zu0Var2;
        zu0 zu0Var3;
        yu0 yu0Var = (yu0) this.o;
        if (i == 0) {
            lh.e("No error correction bytes");
            return;
        }
        int length = iArr.length - i;
        if (length <= 0) {
            lh.e("No data bytes provided");
            return;
        }
        ArrayList arrayList = (ArrayList) this.n;
        int i2 = 1;
        int i3 = 0;
        if (i >= arrayList.size()) {
            zu0 zu0Var4 = (zu0) arrayList.get(arrayList.size() - 1);
            int size = arrayList.size();
            while (size <= i) {
                int[] iArr2 = {i2, yu0Var.a[(size - 1) + yu0Var.f]};
                if (iArr2[i3] == 0) {
                    int i4 = i2;
                    while (i4 < 2 && iArr2[i4] == 0) {
                        i4++;
                    }
                    if (i4 == 2) {
                        iArr2 = new int[]{i3};
                    } else {
                        int i5 = 2 - i4;
                        int[] iArr3 = new int[i5];
                        System.arraycopy(iArr2, i4, iArr3, i3, i5);
                        iArr2 = iArr3;
                    }
                }
                yu0 yu0Var2 = zu0Var4.a;
                if (!yu0Var2.equals(yu0Var)) {
                    lh.e("GenericGFPolys do not have same GenericGF field");
                    return;
                }
                int[] iArr4 = zu0Var4.b;
                if (iArr4[i3] == 0 || iArr2[i3] == 0) {
                    zu0Var4 = yu0Var2.c;
                } else {
                    int length2 = iArr4.length;
                    int length3 = iArr2.length;
                    int[] iArr5 = new int[(length2 + length3) - i2];
                    int i6 = i3;
                    while (i6 < length2) {
                        int i7 = iArr4[i6];
                        while (i3 < length3) {
                            int i8 = i6 + i3;
                            iArr5[i8] = iArr5[i8] ^ yu0Var2.a(i7, iArr2[i3]);
                            i3++;
                            iArr4 = iArr4;
                        }
                        i6++;
                        i3 = 0;
                    }
                    zu0Var4 = new zu0(yu0Var2, iArr5);
                }
                arrayList.add(zu0Var4);
                size++;
                i2 = 1;
                i3 = 0;
            }
        }
        zu0 zu0Var5 = (zu0) arrayList.get(i);
        int[] iArr6 = new int[length];
        System.arraycopy(iArr, 0, iArr6, 0, length);
        if (length == 0) {
            b71.t();
            return;
        }
        if (length > 1 && iArr6[0] == 0) {
            int i9 = 1;
            while (i9 < length && iArr6[i9] == 0) {
                i9++;
            }
            if (i9 == length) {
                iArr6 = new int[]{0};
            } else {
                int i10 = length - i9;
                int[] iArr7 = new int[i10];
                System.arraycopy(iArr6, i9, iArr7, 0, i10);
                iArr6 = iArr7;
            }
        }
        if (i < 0) {
            b71.t();
            return;
        }
        int length4 = iArr6.length;
        int[] iArr8 = new int[length4 + i];
        for (int i11 = 0; i11 < length4; i11++) {
            iArr8[i11] = yu0Var.a(iArr6[i11], 1);
        }
        zu0 zu0Var6 = new zu0(yu0Var, iArr8);
        yu0 yu0Var3 = zu0Var5.a;
        int[] iArr9 = zu0Var5.b;
        boolean equals = yu0Var.equals(yu0Var3);
        zu0 zu0Var7 = yu0Var.c;
        if (!equals) {
            lh.e("GenericGFPolys do not have same GenericGF field");
            return;
        }
        if (iArr9[0] == 0) {
            lh.e("Divide by 0");
            return;
        }
        int i12 = iArr9[(iArr9.length - 1) - zu0Var5.b()];
        if (i12 == 0) {
            throw new ArithmeticException();
        }
        int i13 = yu0Var.a[(yu0Var.d - yu0Var.b[i12]) - 1];
        zu0 zu0Var8 = zu0Var7;
        while (true) {
            int[] iArr10 = zu0Var6.b;
            if (zu0Var6.b() < zu0Var5.b() || iArr10[0] == 0) {
                break;
            }
            int b = zu0Var6.b() - zu0Var5.b();
            int a = yu0Var.a(iArr10[(iArr10.length - 1) - zu0Var6.b()], i13);
            yu0 yu0Var4 = zu0Var5.a;
            if (b < 0) {
                b71.t();
                return;
            }
            if (a == 0) {
                zu0Var2 = yu0Var4.c;
                zu0Var = zu0Var5;
            } else {
                int length5 = iArr9.length;
                int[] iArr11 = new int[length5 + b];
                int i14 = 0;
                while (i14 < length5) {
                    iArr11[i14] = yu0Var4.a(iArr9[i14], a);
                    i14++;
                    zu0Var5 = zu0Var5;
                }
                zu0Var = zu0Var5;
                zu0Var2 = new zu0(yu0Var4, iArr11);
            }
            if (b < 0) {
                b71.t();
                return;
            }
            if (a == 0) {
                zu0Var3 = zu0Var7;
            } else {
                int[] iArr12 = new int[b + 1];
                iArr12[0] = a;
                zu0Var3 = new zu0(yu0Var, iArr12);
            }
            zu0Var8 = zu0Var8.a(zu0Var3);
            zu0Var6 = zu0Var6.a(zu0Var2);
            zu0Var5 = zu0Var;
        }
    }

    public String o(String str) {
        String str2 = (String) this.o;
        Resources resources = (Resources) this.n;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // defpackage.uu1
    public void onComplete(jt2 jt2Var) {
        ((Map) ((tt1) this.o).o).remove((kt2) this.n);
    }

    public void p(String str, String str2, Bundle bundle, long j) {
        try {
            ((ve3) this.n).i(str, str2, bundle, j);
        } catch (RemoteException e) {
            pj3 pj3Var = ((AppMeasurementDynamiteService) this.o).g;
            if (pj3Var != null) {
                vh3 vh3Var = pj3Var.r;
                pj3.m(vh3Var);
                vh3Var.u.c(e, "Event interceptor threw exception");
            }
        }
    }

    public void q(Throwable th) {
        ip3 ip3Var = (ip3) this.n;
        jm3 jm3Var = (jm3) this.o;
        jm3Var.v();
        jm3Var.u = false;
        pj3 pj3Var = (pj3) jm3Var.m;
        ec3 ec3Var = pj3Var.p;
        vh3 vh3Var = pj3Var.r;
        int i = 2;
        if (ec3Var.G(null, ug3.T0)) {
            String message = th.getMessage();
            jm3Var.z = false;
            if (message != null) {
                if ((th instanceof IllegalStateException) || message.contains("garbage collected") || th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                    if (message.contains("Background")) {
                        jm3Var.z = true;
                    }
                    i = 1;
                } else if ((th instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                    i = 3;
                }
            }
        }
        int i2 = i - 1;
        if (i2 == 0) {
            pj3.m(vh3Var);
            vh3Var.u.d(vh3.E(pj3Var.r().C()), vh3.E(th.toString()), "registerTriggerAsync failed with retriable error. Will try later. App ID, throwable");
            jm3Var.v = 1;
            jm3Var.U().add(ip3Var);
            return;
        }
        if (i2 != 1) {
            pj3.m(vh3Var);
            vh3Var.r.d(vh3.E(pj3Var.r().C()), th, "registerTriggerAsync failed. Dropping URI. App ID, Throwable");
            v();
            jm3Var.v = 1;
            jm3Var.V();
            return;
        }
        jm3Var.U().add(ip3Var);
        if (jm3Var.v > ((Integer) ug3.w0.a(null)).intValue()) {
            jm3Var.v = 1;
            pj3.m(vh3Var);
            vh3Var.u.d(vh3.E(pj3Var.r().C()), vh3.E(th.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
            return;
        }
        pj3.m(vh3Var);
        vh3Var.u.e("registerTriggerAsync failed. App ID, delay in seconds, throwable", vh3.E(pj3Var.r().C()), vh3.E(String.valueOf(jm3Var.v)), vh3.E(th.toString()));
        int i3 = jm3Var.v;
        if (jm3Var.w == null) {
            jm3Var.w = new hl3(jm3Var, pj3Var, 1);
        }
        jm3Var.w.b(i3 * 1000);
        int i4 = jm3Var.v;
        jm3Var.v = i4 + i4;
    }

    public uw1 r(r01 r01Var, pl2 pl2Var) {
        List list = r01Var.f;
        Bitmap.Config config = r01Var.d;
        if ((!list.isEmpty() && !oi.o(l.a, config)) || (k31.o(config) && ((k31.o(config) && !r01Var.k) || !((ix0) this.o).b(pl2Var)))) {
            config = Bitmap.Config.ARGB_8888;
        }
        zm3 zm3Var = pl2Var.a;
        hb0 hb0Var = hb0.o;
        return new uw1(r01Var.a, config, null, pl2Var, (zm3Var.equals(hb0Var) || pl2Var.b.equals(hb0Var)) ? me2.n : r01Var.w, k.a(r01Var), r01Var.l && r01Var.f.isEmpty() && config != Bitmap.Config.ALPHA_8, r01Var.m, null, r01Var.h, r01Var.i, r01Var.x, r01Var.n, r01Var.o, r01Var.p);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uw1 s(uw1 uw1Var) {
        boolean z;
        boolean z2;
        Bitmap.Config config = uw1Var.b;
        kr krVar = uw1Var.o;
        boolean z3 = true;
        if (!k31.o(config) || ((ix0) this.o).a()) {
            z = false;
        } else {
            config = Bitmap.Config.ARGB_8888;
            z = true;
        }
        Bitmap.Config config2 = config;
        if (uw1Var.o.m) {
            fs2 fs2Var = (fs2) this.n;
            synchronized (fs2Var) {
                fs2Var.a();
                z2 = fs2Var.q;
            }
            if (!z2) {
                krVar = kr.p;
                return !z3 ? new uw1(uw1Var.a, config2, uw1Var.c, uw1Var.d, uw1Var.e, uw1Var.f, uw1Var.g, uw1Var.h, uw1Var.i, uw1Var.j, uw1Var.k, uw1Var.l, uw1Var.m, uw1Var.n, krVar) : uw1Var;
            }
        }
        z3 = z;
        if (!z3) {
        }
    }

    public void t(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.n)) {
            hashMap = new HashMap((Map) this.n);
        }
        synchronized (((Map) this.o)) {
            hashMap2 = new HashMap((Map) this.o);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                b71.o();
                return;
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((kt2) entry2.getKey()).b(new ne(status));
            }
        }
    }

    public String toString() {
        switch (this.m) {
            case 0:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.o.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.n;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                return "Bounds{lower=" + ((z21) this.n) + " upper=" + ((z21) this.o) + "}";
            default:
                return super.toString();
        }
    }

    public Object u() {
        Uri uri;
        ContentProviderClient acquireUnstableContentProviderClient;
        String str;
        kl3 kl3Var = (kl3) this.n;
        String str2 = (String) this.o;
        Context context = (Context) kl3Var.c;
        context.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        oy2 oy2Var = pk3.a;
        String str3 = null;
        if (contentResolver == null) {
            oy2Var.getClass();
            lh.g("ContentResolver needed with GservicesDelegateSupplier.init()");
            return null;
        }
        synchronized (oy2Var) {
            try {
                HashMap hashMap = (HashMap) oy2Var.n;
                AtomicBoolean atomicBoolean = (AtomicBoolean) oy2Var.m;
                if (hashMap == null) {
                    atomicBoolean.set(false);
                    oy2Var.n = new HashMap(16, 1.0f);
                    oy2Var.s = new Object();
                    contentResolver.registerContentObserver(rk3.a, true, new r83(oy2Var));
                } else if (atomicBoolean.getAndSet(false)) {
                    ((HashMap) oy2Var.n).clear();
                    ((HashMap) oy2Var.o).clear();
                    ((HashMap) oy2Var.p).clear();
                    ((HashMap) oy2Var.q).clear();
                    ((HashMap) oy2Var.r).clear();
                    oy2Var.s = new Object();
                }
                Object obj = oy2Var.s;
                if (((HashMap) oy2Var.n).containsKey(str2)) {
                    String str4 = (String) ((HashMap) oy2Var.n).get(str2);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                try {
                    uri = rk3.a;
                    acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                } catch (wk3 unused) {
                }
                try {
                    if (acquireUnstableContentProviderClient == null) {
                        throw new wk3("Unable to acquire ContentProviderClient");
                    }
                    try {
                        Cursor query = acquireUnstableContentProviderClient.query(uri, null, null, new String[]{str2}, null);
                        try {
                            if (query == null) {
                                throw new wk3("ContentProvider query returned null cursor");
                            }
                            if (query.moveToFirst()) {
                                str = query.getString(1);
                                query.close();
                                acquireUnstableContentProviderClient.release();
                            } else {
                                query.close();
                                acquireUnstableContentProviderClient.release();
                                str = null;
                            }
                            if (str != null && str.equals(null)) {
                                str = null;
                            }
                            synchronized (oy2Var) {
                                try {
                                    if (obj == oy2Var.s) {
                                        ((HashMap) oy2Var.n).put(str2, str);
                                    }
                                } finally {
                                }
                            }
                            if (str != null) {
                                return str;
                            }
                            return null;
                        } finally {
                        }
                    } catch (RemoteException e) {
                        throw new wk3("ContentProvider query failed", e);
                    }
                } catch (Throwable th) {
                    acquireUnstableContentProviderClient.release();
                    throw th;
                }
            } finally {
            }
        }
    }

    public void v() {
        pj3 pj3Var = (pj3) ((jm3) this.o).m;
        qi3 qi3Var = pj3Var.q;
        pj3.k(qi3Var);
        SparseArray C = qi3Var.C();
        ip3 ip3Var = (ip3) this.n;
        C.put(ip3Var.o, Long.valueOf(ip3Var.n));
        qi3 qi3Var2 = pj3Var.q;
        pj3.k(qi3Var2);
        int[] iArr = new int[C.size()];
        long[] jArr = new long[C.size()];
        for (int i = 0; i < C.size(); i++) {
            iArr[i] = C.keyAt(i);
            jArr[i] = ((Long) C.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        qi3Var2.z.K(bundle);
    }

    public void w(sc3 sc3Var) {
        ArrayList arrayList = sc3Var.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((HashMap) this.n).put(Integer.valueOf(((ld3) obj).m).toString(), sc3Var);
        }
    }

    public kc3 x(js0 js0Var, kc3 kc3Var) {
        ak2.w(js0Var);
        if (!(kc3Var instanceof lc3)) {
            return kc3Var;
        }
        lc3 lc3Var = (lc3) kc3Var;
        ArrayList arrayList = lc3Var.n;
        String str = lc3Var.m;
        HashMap hashMap = (HashMap) this.n;
        return (hashMap.containsKey(str) ? (sc3) hashMap.get(str) : (sc3) this.o).a(str, js0Var, arrayList);
    }

    public /* synthetic */ tt1(int i, Object obj, Object obj2, boolean z) {
        this.m = i;
        this.o = obj;
        this.n = obj2;
    }

    public tt1(Context context) {
        this.m = 12;
        ll3.v(context);
        Resources resources = context.getResources();
        this.n = resources;
        this.o = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public tt1(IBinder iBinder) {
        this.m = 29;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.n = new Messenger(iBinder);
            this.o = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.o = new ue3(iBinder);
            this.n = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public /* synthetic */ tt1(Object obj) {
        this.m = 0;
        this.o = obj;
        this.n = new ArrayList();
    }

    public tt1(ep3 ep3Var) {
        this.m = 27;
        this.o = ep3Var;
    }

    public tt1(b72 b72Var, fs2 fs2Var) {
        Object f11Var;
        this.m = 7;
        this.n = fs2Var;
        int i = Build.VERSION.SDK_INT;
        int i2 = 26;
        if (i < 26) {
            boolean z = g.a;
        } else if (!g.a) {
            if (i != 26 && i != 27) {
                f11Var = new f11(true);
            } else {
                f11Var = new u30(i2);
            }
            this.o = f11Var;
        }
        f11Var = new f11(false);
        this.o = f11Var;
    }

    public /* synthetic */ tt1(int i, Object obj, Object obj2) {
        this.m = i;
        this.n = obj;
        this.o = obj2;
    }

    public tt1(yu0 yu0Var) {
        this.m = 6;
        this.o = yu0Var;
        ArrayList arrayList = new ArrayList();
        this.n = arrayList;
        arrayList.add(new zu0(yu0Var, new int[]{1}));
    }

    public tt1(q80 q80Var, j30 j30Var, ny1 ny1Var) {
        this.m = 3;
        this.n = q80Var;
        this.o = j30Var;
    }

    public tt1(int i, r5 r5Var) {
        this.m = 5;
        this.n = r5Var;
        this.o = new j72(i, this);
    }

    public tt1(WindowInsetsAnimation.Bounds bounds) {
        this.m = 16;
        this.n = g73.g(bounds);
        this.o = g73.f(bounds);
    }
}
