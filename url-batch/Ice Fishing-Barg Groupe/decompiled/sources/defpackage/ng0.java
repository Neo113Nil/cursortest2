package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.Window;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import com.ice.fishing.grenza.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class ng0 {
    public static boolean PxuCJdSBwIXG = false;
    public static Method lS5Rgt96tfkO;

    public static boolean BRwzKIf41E4i(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        int i = rq2.PxuCJdSBwIXG;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = qq2.Y1f8riQaR6yg;
            qq2 qq2Var = (qq2) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (qq2Var == null) {
                qq2Var = new qq2();
                qq2Var.PxuCJdSBwIXG = null;
                qq2Var.lS5Rgt96tfkO = null;
                qq2Var.TSizfFm2Yiuu = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, qq2Var);
            }
            WeakReference weakReference2 = qq2Var.TSizfFm2Yiuu;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                qq2Var.TSizfFm2Yiuu = new WeakReference(keyEvent);
                if (qq2Var.lS5Rgt96tfkO == null) {
                    qq2Var.lS5Rgt96tfkO = new SparseArray();
                }
                SparseArray sparseArray = qq2Var.lS5Rgt96tfkO;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    u9.VhhvGxCb8gfr();
                    return false;
                }
            }
        }
        return false;
    }

    public static yq0 BjEWd04qc7Mw(br0 br0Var, int i) {
        br0Var.getClass();
        boolean z = i > 0;
        Integer valueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
        }
        xq0 xq0Var = yq0.Companion;
        int i2 = br0Var.rtx2ld2ELZv4;
        int i3 = br0Var.OPXfSBeufaJ8;
        if (br0Var.wdg6QnbFHrFF <= 0) {
            i = -i;
        }
        xq0Var.getClass();
        return new yq0(i2, i3, i);
    }

    public static final float EcgxDIVH5in8(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    public static final String EpkonXwzFgDB(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0d, max);
        float f2 = f * pow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / pow;
        return max > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public static bt IAToe7bXGz4N(bt btVar) {
        btVar.getClass();
        ct ctVar = btVar instanceof ct ? (ct) btVar : null;
        if (ctVar == null || (btVar = ctVar.wdg6QnbFHrFF) != null) {
            return btVar;
        }
        ju juVar = (ju) ctVar.e9gEMXR7LXtO().S2OOm9zPNm0h(ih0.x50lh2ztY7Y5);
        bt e00Var = juVar != null ? new e00(juVar, ctVar) : ctVar;
        ctVar.wdg6QnbFHrFF = e00Var;
        return e00Var;
    }

    public static final long J54yh1s3n4Aq(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static float OPXfSBeufaJ8(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static final long PxuCJdSBwIXG(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static bt QrzZRwfaDlRX(bt btVar, bt btVar2, pe0 pe0Var) {
        pe0Var.getClass();
        if (pe0Var instanceof nc) {
            return ((nc) pe0Var).gPXPFXrUH4XX(btVar2, btVar);
        }
        hu e9gEMXR7LXtO = btVar2.e9gEMXR7LXtO();
        return e9gEMXR7LXtO == n50.rtx2ld2ELZv4 ? new ds0(btVar2, btVar, pe0Var) : new es0(btVar2, e9gEMXR7LXtO, pe0Var, btVar);
    }

    public static final int RAsUl2FVSrh6(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static HqMwxkFaipxD RfyTYNmI9Srp(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new HqMwxkFaipxD(vl.Y1f8riQaR6yg(view));
        }
        return null;
    }

    public static String S2OOm9zPNm0h(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final int S9EYkSpbGuxq(hy1 hy1Var, String str) {
        hy1Var.getClass();
        int cpQdD2nAriOS = cpQdD2nAriOS(hy1Var, str);
        if (cpQdD2nAriOS >= 0) {
            return cpQdD2nAriOS;
        }
        int columnCount = hy1Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(hy1Var.getColumnName(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + zk.ctD2u3GUHhtA(arrayList, null, null, null, null, 63) + ']');
    }

    public static final void TSizfFm2Yiuu(x91 x91Var, wy1 wy1Var, on onVar, hp hpVar, int i) {
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(233973821);
        if ((((tf0Var.rtx2ld2ELZv4(x91Var) ? 4 : 2) | i | (tf0Var.rtx2ld2ELZv4(wy1Var) ? 32 : 16)) & 147) == 146 && tf0Var.e6tOsSdd2EFb()) {
            tf0Var.i68hK7ahKtgp();
        } else {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            zv.TSizfFm2Yiuu(new ir1[]{l21.PxuCJdSBwIXG.PxuCJdSBwIXG(x91Var), f21.PxuCJdSBwIXG.PxuCJdSBwIXG(x91Var), k21.PxuCJdSBwIXG.PxuCJdSBwIXG(x91Var)}, bs0.kpCQ9veP6n3I(1808964477, new pz(1, wy1Var, onVar), tf0Var), tf0Var, 56);
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new n6(x91Var, wy1Var, onVar, i, 5);
        }
    }

    public static Intent VhhvGxCb8gfr(Context context, ComponentName componentName) {
        String S2OOm9zPNm0h = S2OOm9zPNm0h(context, componentName);
        if (S2OOm9zPNm0h == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), S2OOm9zPNm0h);
        return S2OOm9zPNm0h(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static final Object XL4ISE6Oc65B(oo1 oo1Var, String str, ct ctVar) {
        Object Y1f8riQaR6yg = oo1Var.Y1f8riQaR6yg(str, new uk2(0), ctVar);
        return Y1f8riQaR6yg == su.rtx2ld2ELZv4 ? Y1f8riQaR6yg : no2.PxuCJdSBwIXG;
    }

    public static final void Y1f8riQaR6yg(wy1 wy1Var, on onVar, hp hpVar, int i) {
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(832919318);
        int i2 = (tf0Var.rtx2ld2ELZv4(wy1Var) ? 4 : 2) | i | (tf0Var.rtx2ld2ELZv4(onVar) ? 32 : 16);
        if ((i2 & 19) == 18 && tf0Var.e6tOsSdd2EFb()) {
            tf0Var.i68hK7ahKtgp();
        } else {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            hp.Companion.getClass();
            if (nLZGh9p8gVSu == fp.lS5Rgt96tfkO) {
                nLZGh9p8gVSu = new xy0(10);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            }
            le0 le0Var = (le0) nLZGh9p8gVSu;
            pr2 PxuCJdSBwIXG2 = l21.PxuCJdSBwIXG(tf0Var);
            if (PxuCJdSBwIXG2 == null) {
                u9.rtx2ld2ELZv4("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ck PxuCJdSBwIXG3 = bu1.PxuCJdSBwIXG(hc.class);
            zo0 zo0Var = new zo0(0);
            zo0Var.PxuCJdSBwIXG(bu1.PxuCJdSBwIXG(hc.class), le0Var);
            hc hcVar = (hc) th0.Pf0ThKz3j5YS(PxuCJdSBwIXG3, PxuCJdSBwIXG2, zo0Var.TSizfFm2Yiuu(), PxuCJdSBwIXG2 instanceof bj0 ? ((bj0) PxuCJdSBwIXG2).a92UlCVFR9N8() : xu.lS5Rgt96tfkO, tf0Var);
            hcVar.Y1f8riQaR6yg = new as2(wy1Var);
            wy1Var.lS5Rgt96tfkO(hcVar.TSizfFm2Yiuu, onVar, tf0Var, ((i2 << 6) & 896) | (i2 & 112));
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new bf(i, 15, wy1Var, onVar);
        }
    }

    public static final int ZbWwgt3aGe7A(hi2 hi2Var, Layout layout, xb xbVar, int i, RectF rectF, c22 c22Var, l4 l4Var, boolean z) {
        ew0[] ew0VarArr;
        yq0 yq0Var;
        ew0[] ew0VarArr2;
        int i2;
        int lS5Rgt96tfkO2;
        int i3;
        int i4;
        int PxuCJdSBwIXG2;
        Bidi createLineBidi;
        boolean z2;
        float PxuCJdSBwIXG3;
        float PxuCJdSBwIXG4;
        float f;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i5 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i5];
        Layout layout2 = hi2Var.a92UlCVFR9N8;
        int lineStart2 = layout2.getLineStart(i);
        int a92UlCVFR9N8 = hi2Var.a92UlCVFR9N8(i);
        if (i5 < (a92UlCVFR9N8 - lineStart2) * 2) {
            fp0.PxuCJdSBwIXG("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        bk0 bk0Var = new bk0(hi2Var);
        boolean z3 = false;
        boolean z4 = layout2.getParagraphDirection(i) == 1;
        int i6 = 0;
        while (lineStart2 < a92UlCVFR9N8) {
            boolean isRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z4 && !isRtlCharAt) {
                PxuCJdSBwIXG3 = bk0Var.PxuCJdSBwIXG(lineStart2, z3, z3, true);
                f = bk0Var.PxuCJdSBwIXG(lineStart2 + 1, true, true, true);
                z2 = z4;
            } else if (z4 && isRtlCharAt) {
                z2 = z4;
                f = bk0Var.PxuCJdSBwIXG(lineStart2, false, false, false);
                PxuCJdSBwIXG3 = bk0Var.PxuCJdSBwIXG(lineStart2 + 1, true, true, false);
            } else {
                z2 = z4;
                if (isRtlCharAt) {
                    PxuCJdSBwIXG4 = bk0Var.PxuCJdSBwIXG(lineStart2, false, false, true);
                    PxuCJdSBwIXG3 = bk0Var.PxuCJdSBwIXG(lineStart2 + 1, true, true, true);
                } else {
                    PxuCJdSBwIXG3 = bk0Var.PxuCJdSBwIXG(lineStart2, false, false, false);
                    PxuCJdSBwIXG4 = bk0Var.PxuCJdSBwIXG(lineStart2 + 1, true, true, false);
                }
                f = PxuCJdSBwIXG4;
            }
            fArr[i6] = PxuCJdSBwIXG3;
            fArr[i6 + 1] = f;
            i6 += 2;
            lineStart2++;
            z4 = z2;
            z3 = false;
        }
        Layout layout3 = (Layout) xbVar.lS5Rgt96tfkO;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int dgRBjINgWbAK = xbVar.dgRBjINgWbAK(lineStart3, false);
        int x50lh2ztY7Y5 = xbVar.x50lh2ztY7Y5(dgRBjINgWbAK);
        int i7 = lineStart3 - x50lh2ztY7Y5;
        int i8 = lineEnd2 - x50lh2ztY7Y5;
        Bidi e9gEMXR7LXtO = xbVar.e9gEMXR7LXtO(dgRBjINgWbAK);
        if (e9gEMXR7LXtO == null || (createLineBidi = e9gEMXR7LXtO.createLineBidi(i7, i8)) == null) {
            ew0VarArr = new ew0[]{new ew0(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = createLineBidi.getRunCount();
            ew0VarArr = new ew0[runCount];
            int i9 = 0;
            while (i9 < runCount) {
                int i10 = runCount;
                ew0VarArr[i9] = new ew0(createLineBidi.getRunStart(i9) + lineStart3, createLineBidi.getRunLimit(i9) + lineStart3, createLineBidi.getRunLevel(i9) % 2 == 1);
                i9++;
                runCount = i10;
            }
        }
        if (z) {
            yq0Var = new br0(0, ew0VarArr.length - 1, 1);
        } else {
            int length = ew0VarArr.length - 1;
            yq0.Companion.getClass();
            yq0Var = new yq0(length, 0, -1);
        }
        int i11 = yq0Var.rtx2ld2ELZv4;
        int i12 = yq0Var.OPXfSBeufaJ8;
        int i13 = yq0Var.wdg6QnbFHrFF;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return -1;
        }
        while (true) {
            ew0 ew0Var = ew0VarArr[i11];
            boolean z5 = ew0Var.TSizfFm2Yiuu;
            int i14 = ew0Var.PxuCJdSBwIXG;
            int i15 = ew0Var.lS5Rgt96tfkO;
            float f2 = z5 ? fArr[((i15 - 1) - lineStart) * 2] : fArr[(i14 - lineStart) * 2];
            float EcgxDIVH5in8 = z5 ? EcgxDIVH5in8(i14, lineStart, fArr) : EcgxDIVH5in8(i15 - 1, lineStart, fArr);
            float f3 = rectF.left;
            int i16 = i13;
            if (z) {
                if (EcgxDIVH5in8 >= f3) {
                    float f4 = rectF.right;
                    if (f2 <= f4) {
                        if ((z5 || f3 > f2) && (!z5 || f4 < EcgxDIVH5in8)) {
                            int i17 = i15;
                            int i18 = i14;
                            while (true) {
                                i3 = i17;
                                if (i17 - i18 <= 1) {
                                    break;
                                }
                                int i19 = (i3 + i18) / 2;
                                float f5 = fArr[(i19 - lineStart) * 2];
                                if ((z5 || f5 <= rectF.left) && (!z5 || f5 >= rectF.right)) {
                                    i17 = i3;
                                    i18 = i19;
                                } else {
                                    i17 = i19;
                                }
                            }
                            i4 = z5 ? i3 : i18;
                        } else {
                            i4 = i14;
                        }
                        int lS5Rgt96tfkO3 = c22Var.lS5Rgt96tfkO(i4);
                        if (lS5Rgt96tfkO3 != -1 && (PxuCJdSBwIXG2 = c22Var.PxuCJdSBwIXG(lS5Rgt96tfkO3)) < i15) {
                            if (PxuCJdSBwIXG2 >= i14) {
                                i14 = PxuCJdSBwIXG2;
                            }
                            if (lS5Rgt96tfkO3 > i15) {
                                lS5Rgt96tfkO3 = i15;
                            }
                            ew0VarArr2 = ew0VarArr;
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i20 = lS5Rgt96tfkO3;
                            while (true) {
                                rectF2.left = z5 ? fArr[((i20 - 1) - lineStart) * 2] : fArr[(i14 - lineStart) * 2];
                                rectF2.right = z5 ? EcgxDIVH5in8(i14, lineStart, fArr) : EcgxDIVH5in8(i20 - 1, lineStart, fArr);
                                if (!((Boolean) l4Var.rtx2ld2ELZv4(rectF2, rectF)).booleanValue()) {
                                    i14 = c22Var.Y1f8riQaR6yg(i14);
                                    if (i14 == -1 || i14 >= i15) {
                                        break;
                                    }
                                    i20 = c22Var.lS5Rgt96tfkO(i14);
                                    if (i20 > i15) {
                                        i20 = i15;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
                ew0VarArr2 = ew0VarArr;
                i14 = -1;
            } else {
                ew0VarArr2 = ew0VarArr;
                if (EcgxDIVH5in8 >= f3) {
                    float f6 = rectF.right;
                    if (f2 <= f6) {
                        if ((z5 || f6 < EcgxDIVH5in8) && (!z5 || f3 > f2)) {
                            int i21 = i15;
                            int i22 = i14;
                            while (i21 - i22 > 1) {
                                int i23 = (i21 + i22) / 2;
                                float f7 = fArr[(i23 - lineStart) * 2];
                                int i24 = i21;
                                if ((z5 || f7 <= rectF.right) && (!z5 || f7 >= rectF.left)) {
                                    i21 = i24;
                                    i22 = i23;
                                } else {
                                    i21 = i23;
                                }
                            }
                            i2 = z5 ? i21 : i22;
                        } else {
                            i2 = i15 - 1;
                        }
                        int PxuCJdSBwIXG5 = c22Var.PxuCJdSBwIXG(i2 + 1);
                        if (PxuCJdSBwIXG5 != -1 && (lS5Rgt96tfkO2 = c22Var.lS5Rgt96tfkO(PxuCJdSBwIXG5)) > i14) {
                            if (PxuCJdSBwIXG5 < i14) {
                                PxuCJdSBwIXG5 = i14;
                            }
                            if (lS5Rgt96tfkO2 <= i15) {
                                i15 = lS5Rgt96tfkO2;
                            }
                            RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int i25 = PxuCJdSBwIXG5;
                            while (true) {
                                rectF3.left = z5 ? fArr[((i15 - 1) - lineStart) * 2] : fArr[(i25 - lineStart) * 2];
                                rectF3.right = z5 ? EcgxDIVH5in8(i25, lineStart, fArr) : EcgxDIVH5in8(i15 - 1, lineStart, fArr);
                                if (!((Boolean) l4Var.rtx2ld2ELZv4(rectF3, rectF)).booleanValue()) {
                                    i15 = c22Var.e9gEMXR7LXtO(i15);
                                    if (i15 == -1 || i15 <= i14) {
                                        break;
                                    }
                                    i25 = c22Var.PxuCJdSBwIXG(i15);
                                    if (i25 < i14) {
                                        i25 = i14;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
                i15 = -1;
                i14 = i15;
            }
            if (i14 >= 0) {
                return i14;
            }
            if (i11 == i12) {
                return -1;
            }
            i11 += i16;
            i13 = i16;
            ew0VarArr = ew0VarArr2;
        }
    }

    public static n42 a92UlCVFR9N8(n42 n42Var) {
        o41 o41Var = n42Var.rtx2ld2ELZv4;
        o41Var.lS5Rgt96tfkO();
        return o41Var.gPXPFXrUH4XX > 0 ? n42Var : n42.OPXfSBeufaJ8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0396 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x039e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void aF05bpZJlKEP(ViewStructure viewStructure, vw0 vw0Var, AutofillId autofillId, String str, st1 st1Var) {
        int i;
        long j;
        long j2;
        char c;
        long j3;
        boolean z;
        ek2 ek2Var;
        v8 v8Var;
        n3 n3Var;
        ww1 ww1Var;
        Object obj;
        boolean z2;
        ks ksVar;
        Boolean bool;
        boolean z3;
        Integer num;
        Object obj2;
        int i2;
        List list;
        Integer valueOf;
        boolean z4;
        String xbgXKYA2cIfu;
        String[] EcgxDIVH5in8;
        String[] EcgxDIVH5in82;
        AutofillValue forText;
        v81 v81Var;
        long[] jArr;
        int i3;
        Object obj3;
        long[] jArr2;
        v81 v81Var2;
        ek2 ek2Var2;
        v8 v8Var2;
        n3 n3Var2;
        ww1 ww1Var2;
        k32 k32Var = h32.PxuCJdSBwIXG;
        k32 k32Var2 = y22.PxuCJdSBwIXG;
        z22 S2OOm9zPNm0h = vw0Var.S2OOm9zPNm0h();
        int i4 = 8;
        if (S2OOm9zPNm0h == null || (v81Var2 = S2OOm9zPNm0h.rtx2ld2ELZv4) == null) {
            i = 2;
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            z = true;
            ek2Var = null;
            v8Var = null;
            n3Var = null;
            ww1Var = null;
            obj = null;
            z2 = false;
            ksVar = null;
            bool = null;
            z3 = false;
            num = null;
        } else {
            Object[] objArr = v81Var2.lS5Rgt96tfkO;
            j = 128;
            Object[] objArr2 = v81Var2.TSizfFm2Yiuu;
            long[] jArr3 = v81Var2.PxuCJdSBwIXG;
            int length = jArr3.length - 2;
            i = 2;
            if (length >= 0) {
                z = true;
                int i5 = 0;
                obj = null;
                j2 = 255;
                z2 = false;
                ek2Var2 = null;
                v8Var2 = null;
                n3Var2 = null;
                ksVar = null;
                bool = null;
                ww1Var2 = null;
                z3 = false;
                num = null;
                c = 7;
                while (true) {
                    long j4 = jArr3[i5];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j4 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                Object obj4 = objArr[i8];
                                Object obj5 = objArr2[i8];
                                k32 k32Var3 = (k32) obj4;
                                if (cs0.wdg6QnbFHrFF(k32Var3, h32.RfyTYNmI9Srp)) {
                                    obj5.getClass();
                                    obj = (bs) obj5;
                                } else if (cs0.wdg6QnbFHrFF(k32Var3, h32.PxuCJdSBwIXG)) {
                                    obj5.getClass();
                                    CharSequence charSequence = (String) zk.FT2GK7JK5Ma2((List) obj5);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (cs0.wdg6QnbFHrFF(k32Var3, h32.XL4ISE6Oc65B)) {
                                    obj5.getClass();
                                    ksVar = (ks) obj5;
                                } else if (cs0.wdg6QnbFHrFF(k32Var3, h32.EcgxDIVH5in8)) {
                                    obj5.getClass();
                                    n3Var2 = (n3) obj5;
                                } else if (cs0.wdg6QnbFHrFF(k32Var3, h32.ozEBbv0hFTAB)) {
                                    obj5.getClass();
                                    v8Var2 = (v8) obj5;
                                } else if (cs0.wdg6QnbFHrFF(k32Var3, h32.x50lh2ztY7Y5)) {
                                    obj5.getClass();
                                    viewStructure.setFocused(((Boolean) obj5).booleanValue());
                                } else if (cs0.wdg6QnbFHrFF(k32Var3, h32.gGoUzNp9JO5I)) {
                                    obj5.getClass();
                                    num = (Integer) obj5;
                                } else if (cs0.wdg6QnbFHrFF(k32Var3, h32.nLZGh9p8gVSu)) {
                                    z3 = true;
                                } else if (cs0.wdg6QnbFHrFF(k32Var3, h32.QrzZRwfaDlRX)) {
                                    obj5.getClass();
                                    z = ((Boolean) obj5).booleanValue();
                                } else if (cs0.wdg6QnbFHrFF(k32Var3, h32.IAToe7bXGz4N)) {
                                    obj5.getClass();
                                    ww1Var2 = (ww1) obj5;
                                } else if (cs0.wdg6QnbFHrFF(k32Var3, h32.EpkonXwzFgDB)) {
                                    obj5.getClass();
                                    bool = (Boolean) obj5;
                                } else if (cs0.wdg6QnbFHrFF(k32Var3, h32.xfACYKDMU6Dj)) {
                                    obj5.getClass();
                                    ek2Var2 = (ek2) obj5;
                                } else if (cs0.wdg6QnbFHrFF(k32Var3, y22.lS5Rgt96tfkO)) {
                                    viewStructure.setClickable(true);
                                } else if (cs0.wdg6QnbFHrFF(k32Var3, y22.TSizfFm2Yiuu)) {
                                    viewStructure.setLongClickable(true);
                                } else if (cs0.wdg6QnbFHrFF(k32Var3, y22.S2OOm9zPNm0h)) {
                                    viewStructure.setFocusable(true);
                                } else if (cs0.wdg6QnbFHrFF(k32Var3, y22.dgRBjINgWbAK)) {
                                    z2 = true;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            } else {
                j2 = 255;
                c = 7;
                j3 = -9187201950435737472L;
                z = true;
                obj = null;
                z2 = false;
                ek2Var2 = null;
                v8Var2 = null;
                n3Var2 = null;
                ksVar = null;
                bool = null;
                ww1Var2 = null;
                z3 = false;
                num = null;
            }
            ek2Var = ek2Var2;
            v8Var = v8Var2;
            n3Var = n3Var2;
            ww1Var = ww1Var2;
        }
        z22 S2OOm9zPNm0h2 = vw0Var.S2OOm9zPNm0h();
        if (S2OOm9zPNm0h2 != null && S2OOm9zPNm0h2.wdg6QnbFHrFF && !S2OOm9zPNm0h2.dgRBjINgWbAK) {
            S2OOm9zPNm0h2 = S2OOm9zPNm0h2.lS5Rgt96tfkO();
            p81 p81Var = new p81(((f91) ((n81) vw0Var.r3s1LDPKFs1S()).OPXfSBeufaJ8).wdg6QnbFHrFF);
            p81Var.TSizfFm2Yiuu(vw0Var.r3s1LDPKFs1S());
            while (p81Var.OPXfSBeufaJ8()) {
                vw0 vw0Var2 = (vw0) p81Var.dgRBjINgWbAK(p81Var.lS5Rgt96tfkO - 1);
                z22 S2OOm9zPNm0h3 = vw0Var2.S2OOm9zPNm0h();
                if (S2OOm9zPNm0h3 != null && !S2OOm9zPNm0h3.wdg6QnbFHrFF) {
                    S2OOm9zPNm0h2.Y1f8riQaR6yg(S2OOm9zPNm0h3);
                    if (!S2OOm9zPNm0h3.dgRBjINgWbAK) {
                        p81Var.TSizfFm2Yiuu(vw0Var2.r3s1LDPKFs1S());
                    }
                }
            }
        }
        if (S2OOm9zPNm0h2 != null && (v81Var = S2OOm9zPNm0h2.rtx2ld2ELZv4) != null) {
            Object[] objArr3 = v81Var.lS5Rgt96tfkO;
            Object[] objArr4 = v81Var.TSizfFm2Yiuu;
            long[] jArr4 = v81Var.PxuCJdSBwIXG;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                i2 = 1;
                int i9 = 0;
                list = null;
                while (true) {
                    long j5 = jArr4[i9];
                    int i10 = i4;
                    int i11 = i9;
                    if ((((~j5) << c) & j5 & j3) != j3) {
                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j5 & j2) < j) {
                                int i14 = (i11 << 3) + i13;
                                Object obj6 = objArr3[i14];
                                Object obj7 = objArr4[i14];
                                obj3 = obj;
                                k32 k32Var4 = (k32) obj6;
                                jArr2 = jArr4;
                                if (cs0.wdg6QnbFHrFF(k32Var4, h32.wdg6QnbFHrFF)) {
                                    viewStructure.setEnabled(false);
                                } else if (cs0.wdg6QnbFHrFF(k32Var4, h32.aF05bpZJlKEP)) {
                                    obj7.getClass();
                                    list = (List) obj7;
                                }
                            } else {
                                obj3 = obj;
                                jArr2 = jArr4;
                            }
                            j5 >>= i10;
                            i13++;
                            jArr4 = jArr2;
                            obj = obj3;
                        }
                        obj2 = obj;
                        jArr = jArr4;
                        i3 = i10;
                        if (i12 != i3) {
                            break;
                        }
                    } else {
                        obj2 = obj;
                        jArr = jArr4;
                        i3 = i10;
                    }
                    if (i11 == length2) {
                        break;
                    }
                    i9 = i11 + 1;
                    i4 = i3;
                    jArr4 = jArr;
                    obj = obj2;
                }
                Integer valueOf2 = Integer.valueOf(vw0Var.OPXfSBeufaJ8);
                if (vw0Var.S9EYkSpbGuxq() == null) {
                    valueOf2 = null;
                }
                int intValue = valueOf2 == null ? valueOf2.intValue() : -1;
                viewStructure.setAutofillId(autofillId, intValue);
                viewStructure.setId(intValue, str, null, null);
                valueOf = obj2 == null ? Integer.valueOf(((p2) obj2).PxuCJdSBwIXG) : z2 ? Integer.valueOf(i2) : ek2Var != null ? Integer.valueOf(i) : null;
                if (valueOf != null) {
                    viewStructure.setAutofillType(valueOf.intValue());
                }
                if (v8Var != null) {
                    String str2 = v8Var.OPXfSBeufaJ8;
                    if (str2.length() >= 5000) {
                        str2 = (Character.isHighSurrogate(str2.charAt(4999)) && Character.isLowSurrogate(str2.charAt(5000))) ? ia2.JLGWdXyAxbxj(str2, 4999) : ia2.JLGWdXyAxbxj(str2, 5000);
                    }
                    forText = AutofillValue.forText(str2);
                    viewStructure.setAutofillValue(forText);
                }
                if (n3Var != null) {
                    viewStructure.setAutofillValue(n3Var.PxuCJdSBwIXG);
                }
                if (ksVar != null && (EcgxDIVH5in82 = cs0.EcgxDIVH5in8(ksVar)) != null) {
                    viewStructure.setAutofillHints(EcgxDIVH5in82);
                }
                st1Var.lS5Rgt96tfkO.RAsUl2FVSrh6(vw0Var.OPXfSBeufaJ8, new xo1(viewStructure));
                if (bool != null) {
                    viewStructure.setSelected(bool.booleanValue());
                }
                if (ek2Var == null) {
                    viewStructure.setCheckable(i2);
                    viewStructure.setChecked(ek2Var == ek2.rtx2ld2ELZv4);
                } else if (bool != null) {
                    ww1.Companion.getClass();
                    if (ww1Var == null || ww1Var.PxuCJdSBwIXG != 4) {
                        z4 = true;
                        viewStructure.setCheckable(true);
                        viewStructure.setChecked(bool.booleanValue());
                        ks.Companion.getClass();
                        boolean z5 = (!z3 || ((ksVar != null || (EcgxDIVH5in8 = cs0.EcgxDIVH5in8(ksVar)) == null || na.hnJvRxDXo0hm(EcgxDIVH5in8, (String) na.iSxsmagYqzHM(cs0.EcgxDIVH5in8(js.lS5Rgt96tfkO))) < 0) ? false : z4)) ? z4 : false;
                        viewStructure.setDataIsSensitive((!z5 || z) ? z4 : false);
                        viewStructure.setVisibility(vw0Var.nLZGh9p8gVSu.Y1f8riQaR6yg.d() ? 4 : 0);
                        if (list != null) {
                            int size = list.size();
                            String str3 = "";
                            for (int i15 = 0; i15 < size; i15++) {
                                v8 v8Var3 = (v8) list.get(i15);
                                StringBuilder sb = new StringBuilder();
                                sb.append(str3);
                                str3 = o0.QrzZRwfaDlRX(sb, v8Var3.OPXfSBeufaJ8, '\n');
                            }
                            viewStructure.setText(str3);
                            viewStructure.setClassName("android.widget.TextView");
                        }
                        if (((n81) vw0Var.r3s1LDPKFs1S()).isEmpty() && ww1Var != null && (xbgXKYA2cIfu = ni0.xbgXKYA2cIfu(ww1Var.PxuCJdSBwIXG)) != null) {
                            viewStructure.setClassName(xbgXKYA2cIfu);
                        }
                        if (z2) {
                            viewStructure.setClassName("android.widget.EditText");
                            if (Build.VERSION.SDK_INT >= 28 && num != null) {
                                viewStructure.setMaxTextLength(num.intValue());
                            }
                            if (z5) {
                                viewStructure.setInputType(129);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                z4 = true;
                ks.Companion.getClass();
                if (z3) {
                }
                viewStructure.setDataIsSensitive((!z5 || z) ? z4 : false);
                viewStructure.setVisibility(vw0Var.nLZGh9p8gVSu.Y1f8riQaR6yg.d() ? 4 : 0);
                if (list != null) {
                }
                if (((n81) vw0Var.r3s1LDPKFs1S()).isEmpty()) {
                    viewStructure.setClassName(xbgXKYA2cIfu);
                }
                if (z2) {
                }
            }
        }
        obj2 = obj;
        i2 = 1;
        list = null;
        Integer valueOf22 = Integer.valueOf(vw0Var.OPXfSBeufaJ8);
        if (vw0Var.S9EYkSpbGuxq() == null) {
        }
        if (valueOf22 == null) {
        }
        viewStructure.setAutofillId(autofillId, intValue);
        viewStructure.setId(intValue, str, null, null);
        if (obj2 == null) {
        }
        if (valueOf != null) {
        }
        if (v8Var != null) {
        }
        if (n3Var != null) {
        }
        if (ksVar != null) {
            viewStructure.setAutofillHints(EcgxDIVH5in82);
        }
        st1Var.lS5Rgt96tfkO.RAsUl2FVSrh6(vw0Var.OPXfSBeufaJ8, new xo1(viewStructure));
        if (bool != null) {
        }
        if (ek2Var == null) {
        }
        z4 = true;
        ks.Companion.getClass();
        if (z3) {
        }
        viewStructure.setDataIsSensitive((!z5 || z) ? z4 : false);
        viewStructure.setVisibility(vw0Var.nLZGh9p8gVSu.Y1f8riQaR6yg.d() ? 4 : 0);
        if (list != null) {
        }
        if (((n81) vw0Var.r3s1LDPKFs1S()).isEmpty()) {
        }
        if (z2) {
        }
    }

    public static Object amuv7NJvPxHu(pe0 pe0Var, Object obj, bt btVar) {
        pe0Var.getClass();
        hu e9gEMXR7LXtO = btVar.e9gEMXR7LXtO();
        Object fs0Var = e9gEMXR7LXtO == n50.rtx2ld2ELZv4 ? new fs0(btVar) : new gs0(btVar, e9gEMXR7LXtO);
        mm2.S9EYkSpbGuxq(2, pe0Var);
        return pe0Var.rtx2ld2ELZv4(obj, fs0Var);
    }

    public static final int cpQdD2nAriOS(hy1 hy1Var, String str) {
        hy1Var.getClass();
        int columnCount = hy1Var.getColumnCount();
        int i = 0;
        while (true) {
            if (i >= columnCount) {
                i = -1;
                break;
            }
            if (str.equals(hy1Var.getColumnName(i))) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        String dgRBjINgWbAK = o0.dgRBjINgWbAK("`", str, '`');
        int columnCount2 = hy1Var.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount2) {
                i2 = -1;
                break;
            }
            if (dgRBjINgWbAK.equals(hy1Var.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = hy1Var.getColumnCount();
            String concat = ".".concat(str);
            String dgRBjINgWbAK2 = o0.dgRBjINgWbAK(".", str, '`');
            for (int i3 = 0; i3 < columnCount3; i3++) {
                String columnName = hy1Var.getColumnName(i3);
                if (columnName.length() >= str.length() + 2 && (columnName.endsWith(concat) || (columnName.charAt(0) == '`' && columnName.endsWith(dgRBjINgWbAK2)))) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static long dgRBjINgWbAK(long j) {
        if (j < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j;
    }

    public static final void e6tOsSdd2EFb(kw0 kw0Var) {
        zv.zf8DYfih6EZu(kw0Var).BjEWd04qc7Mw();
    }

    public static final to0 e9gEMXR7LXtO(vo0 vo0Var, float f, final so0 so0Var, String str, hp hpVar) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        final Float valueOf = Float.valueOf(f);
        final Float valueOf2 = Float.valueOf(1.0f);
        tf0 tf0Var = (tf0) hpVar;
        Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
        hp.Companion.getClass();
        jx1 jx1Var = fp.lS5Rgt96tfkO;
        if (nLZGh9p8gVSu == jx1Var) {
            nLZGh9p8gVSu = new to0(vo0Var, valueOf, valueOf2, so0Var);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
        }
        final to0 to0Var = (to0) nLZGh9p8gVSu;
        boolean rtx2ld2ELZv4 = tf0Var.rtx2ld2ELZv4(so0Var);
        Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
        if (rtx2ld2ELZv4 || nLZGh9p8gVSu2 == jx1Var) {
            nLZGh9p8gVSu2 = new ae0() { // from class: wo0
                @Override // defpackage.ae0
                public final Object PxuCJdSBwIXG() {
                    to0 to0Var2 = to0Var;
                    Float f2 = to0Var2.rtx2ld2ELZv4;
                    Float f3 = valueOf;
                    boolean equals = f3.equals(f2);
                    Float f4 = valueOf2;
                    if (!equals || !f4.equals(to0Var2.OPXfSBeufaJ8)) {
                        to0Var2.rtx2ld2ELZv4 = f3;
                        to0Var2.OPXfSBeufaJ8 = f4;
                        to0Var2.dgRBjINgWbAK = new sd2(so0Var, b51.QrzZRwfaDlRX, f3, f4, null);
                        to0Var2.QrzZRwfaDlRX.lS5Rgt96tfkO.setValue(Boolean.TRUE);
                        to0Var2.x50lh2ztY7Y5 = false;
                        to0Var2.cpQdD2nAriOS = true;
                    }
                    return no2.PxuCJdSBwIXG;
                }
            };
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
        }
        mm2.r3s1LDPKFs1S((ae0) nLZGh9p8gVSu2, tf0Var);
        boolean rtx2ld2ELZv42 = tf0Var.rtx2ld2ELZv4(vo0Var);
        Object nLZGh9p8gVSu3 = tf0Var.nLZGh9p8gVSu();
        if (rtx2ld2ELZv42 || nLZGh9p8gVSu3 == jx1Var) {
            nLZGh9p8gVSu3 = new e9gEMXR7LXtO(15, vo0Var, to0Var);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu3);
        }
        mm2.rtx2ld2ELZv4(to0Var, (le0) nLZGh9p8gVSu3, tf0Var);
        return to0Var;
    }

    public static final uv1 gPXPFXrUH4XX(Throwable th) {
        th.getClass();
        return new uv1(th);
    }

    public static final KSerializer jyegZNwi31qc(Object obj, KSerializer... kSerializerArr) {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (invoke instanceof KSerializer) {
                return (KSerializer) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static a61 kpCQ9veP6n3I(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            u9.S9EYkSpbGuxq("Cannot read metadata.");
            return null;
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j2 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = duplicate.getInt();
                long j3 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j3 + j));
                    a61 a61Var = new a61();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    a61Var.dgRBjINgWbAK = duplicate;
                    a61Var.rtx2ld2ELZv4 = position;
                    int i6 = position - duplicate.getInt(position);
                    a61Var.OPXfSBeufaJ8 = i6;
                    a61Var.wdg6QnbFHrFF = ((ByteBuffer) a61Var.dgRBjINgWbAK).getShort(i6);
                    return a61Var;
                }
            }
        }
        u9.S9EYkSpbGuxq("Cannot read metadata.");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
    
        if (r8 == r9) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e0, code lost:
    
        if (r11 == r9) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void lS5Rgt96tfkO(Object obj, int i, ky0 ky0Var, on onVar, hp hpVar, int i2) {
        int i3;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(872548579);
        if ((i2 & 6) == 0) {
            i3 = (tf0Var.rtx2ld2ELZv4(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= tf0Var.Y1f8riQaR6yg(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= tf0Var.rtx2ld2ELZv4(ky0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= tf0Var.rtx2ld2ELZv4(onVar) ? 2048 : 1024;
        }
        if (tf0Var.Pf0ThKz3j5YS(i3 & 1, (i3 & 1171) != 1170)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            boolean a92UlCVFR9N8 = tf0Var.a92UlCVFR9N8(obj) | tf0Var.a92UlCVFR9N8(ky0Var);
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            jx1 jx1Var = fp.lS5Rgt96tfkO;
            if (!a92UlCVFR9N8) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu = new iy0(obj, ky0Var);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            iy0 iy0Var = (iy0) nLZGh9p8gVSu;
            iy0Var.TSizfFm2Yiuu = i;
            mj1 mj1Var = iy0Var.RAsUl2FVSrh6;
            fq fqVar = cm1.PxuCJdSBwIXG;
            iy0 iy0Var2 = (iy0) tf0Var.wdg6QnbFHrFF(fqVar);
            j72.Companion.getClass();
            j72 PxuCJdSBwIXG2 = i72.PxuCJdSBwIXG();
            le0 e9gEMXR7LXtO = PxuCJdSBwIXG2 != null ? PxuCJdSBwIXG2.e9gEMXR7LXtO() : null;
            j72 lS5Rgt96tfkO2 = i72.lS5Rgt96tfkO(PxuCJdSBwIXG2);
            try {
                if (iy0Var2 != ((iy0) mj1Var.getValue())) {
                    mj1Var.setValue(iy0Var2);
                    if (iy0Var.Y1f8riQaR6yg > 0) {
                        iy0 iy0Var3 = iy0Var.e9gEMXR7LXtO;
                        if (iy0Var3 != null) {
                            iy0Var3.lS5Rgt96tfkO();
                        }
                        if (iy0Var2 != null) {
                            iy0Var2.PxuCJdSBwIXG();
                        } else {
                            iy0Var2 = null;
                        }
                        iy0Var.e9gEMXR7LXtO = iy0Var2;
                    }
                }
                i72.e9gEMXR7LXtO(PxuCJdSBwIXG2, lS5Rgt96tfkO2, e9gEMXR7LXtO);
                boolean a92UlCVFR9N82 = tf0Var.a92UlCVFR9N8(iy0Var);
                Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
                if (!a92UlCVFR9N82) {
                    hp.Companion.getClass();
                }
                nLZGh9p8gVSu2 = new r3s1LDPKFs1S(15, iy0Var);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
                mm2.rtx2ld2ELZv4(iy0Var, (le0) nLZGh9p8gVSu2, tf0Var);
                zv.lS5Rgt96tfkO(fqVar.PxuCJdSBwIXG(iy0Var), onVar, tf0Var, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                i72.e9gEMXR7LXtO(PxuCJdSBwIXG2, lS5Rgt96tfkO2, e9gEMXR7LXtO);
                throw th;
            }
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new jy0(obj, i, ky0Var, onVar, i2);
        }
    }

    public static br0 nLZGh9p8gVSu(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new br0(i, i2 - 1, 1);
        }
        br0.Companion.getClass();
        return br0.dgRBjINgWbAK;
    }

    public static final nv1 ozEBbv0hFTAB(nv1 nv1Var) {
        nv1Var.getClass();
        mv1 lS5Rgt96tfkO2 = nv1Var.lS5Rgt96tfkO();
        qv1 qv1Var = nv1Var.r3s1LDPKFs1S;
        lS5Rgt96tfkO2.RAsUl2FVSrh6 = new uo2(qv1Var.a92UlCVFR9N8(), qv1Var.lS5Rgt96tfkO());
        return lS5Rgt96tfkO2.PxuCJdSBwIXG();
    }

    public static final long pnx5pC0XzaCw(long j) {
        if (j < 0) {
            u30.Companion.getClass();
            return u30.wdg6QnbFHrFF;
        }
        u30.Companion.getClass();
        return u30.OPXfSBeufaJ8;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:58|(1:(2:60|(1:113)(1:64))(2:115|116))|(4:108|109|(8:82|83|(1:(3:85|(1:103)(1:(1:91)(2:88|89))|90)(2:104|(1:106)))|92|(1:102)(1:96)|97|(1:99)|101)|(1:71)(2:72|(1:78)(2:80|81)))|66|(1:68)|82|83|(2:(0)(0)|90)|92|(1:94)|102|97|(0)|101|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00f0, code lost:
    
        if (r12 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00aa, code lost:
    
        if (r11 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015b A[Catch: NoSuchFieldException -> 0x018b, TryCatch #1 {NoSuchFieldException -> 0x018b, blocks: (B:83:0x014d, B:85:0x015b, B:94:0x0178, B:96:0x017e, B:97:0x0184, B:99:0x0188, B:90:0x0170), top: B:82:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0188 A[Catch: NoSuchFieldException -> 0x018b, TRY_LEAVE, TryCatch #1 {NoSuchFieldException -> 0x018b, blocks: (B:83:0x014d, B:85:0x015b, B:94:0x0178, B:96:0x017e, B:97:0x0184, B:99:0x0188, B:90:0x0170), top: B:82:0x014d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final KSerializer r3s1LDPKFs1S(Class cls, KSerializer... kSerializerArr) {
        Object obj;
        KSerializer kSerializer;
        Field field;
        Object obj2;
        KSerializer kSerializer2;
        int length;
        int i;
        Object obj3;
        Field field2;
        h42 h42Var;
        if (cls.isEnum() && cls.getAnnotation(h42.class) == null && cls.getAnnotation(io1.class) == null) {
            Object[] enumConstants = cls.getEnumConstants();
            String canonicalName = cls.getCanonicalName();
            canonicalName.getClass();
            enumConstants.getClass();
            return new m60(canonicalName, (Enum[]) enumConstants);
        }
        KSerializer[] kSerializerArr2 = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        KSerializer jyegZNwi31qc = obj == null ? null : jyegZNwi31qc(obj, (KSerializer[]) Arrays.copyOf(kSerializerArr2, kSerializerArr2.length));
        if (jyegZNwi31qc != null) {
            return jyegZNwi31qc;
        }
        String canonicalName2 = cls.getCanonicalName();
        if (canonicalName2 != null && !pa2.yQRudnv4La6p(canonicalName2, "java.", false) && !pa2.yQRudnv4La6p(canonicalName2, "kotlin.", false)) {
            Field[] declaredFields = cls.getDeclaredFields();
            declaredFields.getClass();
            int length2 = declaredFields.length;
            Field field3 = null;
            int i2 = 0;
            boolean z = false;
            while (true) {
                if (i2 < length2) {
                    Field field4 = declaredFields[i2];
                    if (cs0.wdg6QnbFHrFF(field4.getName(), "INSTANCE") && cs0.wdg6QnbFHrFF(field4.getType(), cls) && Modifier.isStatic(field4.getModifiers())) {
                        if (z) {
                            break;
                        }
                        z = true;
                        field3 = field4;
                    }
                    i2++;
                }
            }
            if (field3 != null) {
                Object obj4 = field3.get(null);
                Method[] methods = cls.getMethods();
                methods.getClass();
                int length3 = methods.length;
                Method method = null;
                int i3 = 0;
                boolean z2 = false;
                while (true) {
                    if (i3 < length3) {
                        Method method2 = methods[i3];
                        if (cs0.wdg6QnbFHrFF(method2.getName(), "serializer")) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            parameterTypes.getClass();
                            if (parameterTypes.length == 0 && cs0.wdg6QnbFHrFF(method2.getReturnType(), KSerializer.class)) {
                                if (z2) {
                                    break;
                                }
                                z2 = true;
                                method = method2;
                            }
                        }
                        i3++;
                    }
                }
                method = null;
                if (method != null) {
                    Object invoke = method.invoke(obj4, null);
                    if (invoke instanceof KSerializer) {
                        kSerializer = (KSerializer) invoke;
                        if (kSerializer == null) {
                            return kSerializer;
                        }
                        KSerializer[] kSerializerArr3 = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
                        Field[] declaredFields2 = cls.getDeclaredFields();
                        declaredFields2.getClass();
                        int length4 = declaredFields2.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length4) {
                                field = null;
                                break;
                            }
                            field = declaredFields2[i4];
                            if (Modifier.isStatic(field.getModifiers()) && field.getType().getAnnotation(s91.class) != null) {
                                break;
                            }
                            i4++;
                        }
                        if (field != null) {
                            try {
                                field.setAccessible(true);
                                obj2 = field.get(null);
                            } catch (Throwable unused2) {
                            }
                            if (obj2 != null || (kSerializer2 = jyegZNwi31qc(obj2, (KSerializer[]) Arrays.copyOf(kSerializerArr3, kSerializerArr3.length))) == null) {
                                Class<?>[] declaredClasses = cls.getDeclaredClasses();
                                declaredClasses.getClass();
                                length = declaredClasses.length;
                                Class<?> cls2 = null;
                                i = 0;
                                boolean z3 = false;
                                while (true) {
                                    if (i >= length) {
                                        Class<?> cls3 = declaredClasses[i];
                                        if (cls3.getSimpleName().equals("$serializer")) {
                                            if (z3) {
                                                break;
                                            }
                                            z3 = true;
                                            cls2 = cls3;
                                        }
                                        i++;
                                    } else if (!z3) {
                                    }
                                }
                                cls2 = null;
                                obj3 = (cls2 != null || (field2 = cls2.getField("INSTANCE")) == null) ? null : field2.get(null);
                                if (obj3 instanceof KSerializer) {
                                    kSerializer2 = (KSerializer) obj3;
                                }
                                kSerializer2 = null;
                            }
                            if (kSerializer2 == null) {
                                return kSerializer2;
                            }
                            if (cls.getAnnotation(io1.class) == null && ((h42Var = (h42) cls.getAnnotation(h42.class)) == null || !bu1.PxuCJdSBwIXG(h42Var.with()).equals(bu1.PxuCJdSBwIXG(ko1.class)))) {
                                return null;
                            }
                            return new ko1(bu1.PxuCJdSBwIXG(cls));
                        }
                        obj2 = null;
                        if (obj2 != null) {
                        }
                        Class<?>[] declaredClasses2 = cls.getDeclaredClasses();
                        declaredClasses2.getClass();
                        length = declaredClasses2.length;
                        Class<?> cls22 = null;
                        i = 0;
                        boolean z32 = false;
                        while (true) {
                            if (i >= length) {
                            }
                            i++;
                        }
                        cls22 = null;
                        if (cls22 != null) {
                        }
                        if (obj3 instanceof KSerializer) {
                        }
                        kSerializer2 = null;
                        if (kSerializer2 == null) {
                        }
                    }
                }
            }
        }
        kSerializer = null;
        if (kSerializer == null) {
        }
    }

    public static void rZjpSjn4zoMv(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            hnJvRxDXo0hm.a92UlCVFR9N8(window, z);
        } else {
            if (i >= 30) {
                hnJvRxDXo0hm.e9gEMXR7LXtO(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static double rtx2ld2ELZv4(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static final qt1 ryVscX7ZL4Ux(bw0 bw0Var) {
        qt1 wdg6QnbFHrFF = kj0.wdg6QnbFHrFF(bw0Var, true);
        long RAsUl2FVSrh6 = bw0Var.RAsUl2FVSrh6(wdg6QnbFHrFF.Y1f8riQaR6yg());
        float f = wdg6QnbFHrFF.TSizfFm2Yiuu;
        float f2 = wdg6QnbFHrFF.Y1f8riQaR6yg;
        long RAsUl2FVSrh62 = bw0Var.RAsUl2FVSrh6((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        return new qt1(Float.intBitsToFloat((int) (RAsUl2FVSrh6 >> 32)), Float.intBitsToFloat((int) (RAsUl2FVSrh6 & 4294967295L)), Float.intBitsToFloat((int) (RAsUl2FVSrh62 >> 32)), Float.intBitsToFloat((int) (RAsUl2FVSrh62 & 4294967295L)));
    }

    public static final void tmVwIGCQF4zR(Object obj) {
        if (obj instanceof uv1) {
            throw ((uv1) obj).rtx2ld2ELZv4;
        }
    }

    public static int wdg6QnbFHrFF(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static Comparable x50lh2ztY7Y5(Float f, tk tkVar) {
        tkVar.getClass();
        float f2 = tkVar.lS5Rgt96tfkO;
        float f3 = tkVar.PxuCJdSBwIXG;
        if (f3 <= f2) {
            return (!tk.PxuCJdSBwIXG(f, Float.valueOf(f3)) || tk.PxuCJdSBwIXG(Float.valueOf(f3), f)) ? (!tk.PxuCJdSBwIXG(Float.valueOf(f2), f) || tk.PxuCJdSBwIXG(f, Float.valueOf(f2))) ? f : Float.valueOf(f2) : Float.valueOf(f3);
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + tkVar + '.');
    }

    public static final void xfACYKDMU6Dj() {
        throw new UnsupportedOperationException();
    }
}
