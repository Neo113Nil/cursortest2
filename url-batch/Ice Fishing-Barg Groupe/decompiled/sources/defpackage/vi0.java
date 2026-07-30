package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.HandwritingGesture;
import com.ice.fishing.grenza.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class vi0 {
    public static final /* synthetic */ int PxuCJdSBwIXG = 0;
    public static Thread TSizfFm2Yiuu = null;
    public static final float lS5Rgt96tfkO = 24.0f;

    public vi0() {
        new ConcurrentHashMap();
    }

    public static final boolean BRwzKIf41E4i(long j, long j2) {
        return j == j2;
    }

    public static final boolean BjEWd04qc7Mw(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final String EcgxDIVH5in8(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i >= 0) {
            sb.append("Unexpected JSON token at offset " + i + ": ");
        }
        sb.append(str);
        if (str2 != null && !ia2.fRTaYY6FBZcX(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !ia2.fRTaYY6FBZcX(str3)) {
            sb.append("\n".concat(str3));
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    public static final boolean EpkonXwzFgDB(String str, Bundle bundle) {
        str.getClass();
        return bundle.containsKey(str) && bundle.get(str) == null;
    }

    public static final Bundle IAToe7bXGz4N(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        xi0.ryVscX7ZL4Ux(str);
        throw null;
    }

    public static final Rect IXK6ba3ucyzm(dr0 dr0Var) {
        return new Rect(dr0Var.PxuCJdSBwIXG, dr0Var.lS5Rgt96tfkO, dr0Var.TSizfFm2Yiuu, dr0Var.Y1f8riQaR6yg);
    }

    public static final boolean J54yh1s3n4Aq(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final RectF JHNfcAUfKc4G(qt1 qt1Var) {
        return new RectF(qt1Var.PxuCJdSBwIXG, qt1Var.lS5Rgt96tfkO, qt1Var.TSizfFm2Yiuu, qt1Var.Y1f8riQaR6yg);
    }

    public static final w82 KUoIVIumpKat(e71 e71Var, hp hpVar) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        return VhhvGxCb8gfr((d71) ((tf0) hpVar).wdg6QnbFHrFF(a51.PxuCJdSBwIXG), e71Var);
    }

    public static final SerialDescriptor OPXfSBeufaJ8(SerialDescriptor serialDescriptor, k42 k42Var) {
        serialDescriptor.getClass();
        k42Var.getClass();
        if (!cs0.wdg6QnbFHrFF(serialDescriptor.TSizfFm2Yiuu(), e42.e9gEMXR7LXtO)) {
            return serialDescriptor.a92UlCVFR9N8() ? OPXfSBeufaJ8(serialDescriptor.wdg6QnbFHrFF(0), k42Var) : serialDescriptor;
        }
        eu0 wLFCmsViZrNT = b51.wLFCmsViZrNT(serialDescriptor);
        if (wLFCmsViZrNT == null) {
            return serialDescriptor;
        }
        k42.lS5Rgt96tfkO(k42Var, wLFCmsViZrNT);
        return serialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void POWyO8hTM6YC(m61 m61Var, ae0 ae0Var) {
        ye1 ye1Var = m61Var.r3s1LDPKFs1S;
        if (ye1Var == null) {
            ye1Var = new ye1((we1) m61Var);
            m61Var.r3s1LDPKFs1S = ye1Var;
        }
        hi1 snapshotObserver = ((r1) zv.wLFCmsViZrNT(m61Var)).getSnapshotObserver();
        ye1.Companion.getClass();
        snapshotObserver.PxuCJdSBwIXG.Y1f8riQaR6yg(ye1Var, k1.EpkonXwzFgDB, ae0Var);
    }

    public static final CharSequence Pf0ThKz3j5YS(CharSequence charSequence, int i) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sb.append(charSequence.subSequence(i2, i3).toString());
                sb.append(str2);
                return sb.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static w3 PxuCJdSBwIXG(int i, int i2, int i3) {
        Bitmap createBitmap;
        lw1 lw1Var = wl.e9gEMXR7LXtO;
        Bitmap.Config yQRudnv4La6p = b51.yQRudnv4La6p(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, b51.yQRudnv4La6p(i3), true, vl.PxuCJdSBwIXG(lw1Var));
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, yQRudnv4La6p);
            createBitmap.setHasAlpha(true);
        }
        return new w3(createBitmap);
    }

    public static final boolean QrzZRwfaDlRX(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt == '(') {
                        i2++;
                    } else if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        break;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return cs0.wdg6QnbFHrFF(ia2.GlTbNTgfSMqy(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final qt1 RAsUl2FVSrh6(dm1 dm1Var, int i, yk2 yk2Var, ji2 ji2Var, boolean z, int i2) {
        qt1 qt1Var;
        if (ji2Var != null) {
            qt1Var = ji2Var.TSizfFm2Yiuu(yk2Var.lS5Rgt96tfkO.lS5Rgt96tfkO(i));
        } else {
            qt1.Companion.getClass();
            qt1Var = qt1.e9gEMXR7LXtO;
        }
        float f = qt1Var.PxuCJdSBwIXG;
        int POWyO8hTM6YC = dm1Var.POWyO8hTM6YC(2.0f);
        return new qt1(z ? (i2 - f) - POWyO8hTM6YC : f, qt1Var.lS5Rgt96tfkO, z ? i2 - f : POWyO8hTM6YC + f, qt1Var.Y1f8riQaR6yg);
    }

    public static zc0 RfyTYNmI9Srp(zc0[] zc0VarArr) {
        zc0 zc0Var = null;
        int i = Integer.MAX_VALUE;
        for (zc0 zc0Var2 : zc0VarArr) {
            int abs = (Math.abs(zc0Var2.TSizfFm2Yiuu - 400) * 2) + (zc0Var2.Y1f8riQaR6yg ? 1 : 0);
            if (zc0Var == null || i > abs) {
                zc0Var = zc0Var2;
                i = abs;
            }
        }
        return zc0Var;
    }

    public static final o01 S2OOm9zPNm0h(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            o01 o01Var = tag instanceof o01 ? (o01) tag : null;
            if (o01Var != null) {
                return o01Var;
            }
            Object pnx5pC0XzaCw = ni0.pnx5pC0XzaCw(view);
            view = pnx5pC0XzaCw instanceof View ? (View) pnx5pC0XzaCw : null;
        }
        return null;
    }

    public static final String S9EYkSpbGuxq(Collection collection) {
        collection.getClass();
        return !collection.isEmpty() ? ja2.POWyO8hTM6YC(zk.ctD2u3GUHhtA(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        if (r1 == defpackage.fp.lS5Rgt96tfkO) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TSizfFm2Yiuu(o01 o01Var, w01 w01Var, le0 le0Var, hp hpVar, int i) {
        int i2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(228371534);
        if ((i & 6) == 0) {
            i2 = (tf0Var.rtx2ld2ELZv4(o01Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(w01Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(le0Var) ? 256 : 128;
        }
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 147) != 146)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            boolean rtx2ld2ELZv4 = tf0Var.rtx2ld2ELZv4(w01Var) | ((i2 & 896) == 256) | tf0Var.rtx2ld2ELZv4(o01Var);
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            if (!rtx2ld2ELZv4) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu = new cd(o01Var, w01Var, le0Var);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            mm2.OPXfSBeufaJ8(o01Var, w01Var, (le0) nLZGh9p8gVSu, tf0Var);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new q5(o01Var, w01Var, le0Var, i, 8);
        }
    }

    public static final w82 VhhvGxCb8gfr(d71 d71Var, e71 e71Var) {
        int ordinal = e71Var.ordinal();
        if (ordinal == 0) {
            ((c71) d71Var).getClass();
            w82 w82Var = c71.lS5Rgt96tfkO;
            w82Var.getClass();
            return w82Var;
        }
        if (ordinal == 1) {
            ((c71) d71Var).getClass();
            w82 w82Var2 = c71.TSizfFm2Yiuu;
            w82Var2.getClass();
            return w82Var2;
        }
        if (ordinal == 2) {
            ((c71) d71Var).getClass();
            w82 w82Var3 = c71.Y1f8riQaR6yg;
            w82Var3.getClass();
            return w82Var3;
        }
        if (ordinal == 3) {
            ((c71) d71Var).getClass();
            w82 w82Var4 = c71.e9gEMXR7LXtO;
            w82Var4.getClass();
            return w82Var4;
        }
        if (ordinal == 4) {
            ((c71) d71Var).getClass();
            w82 w82Var5 = c71.a92UlCVFR9N8;
            w82Var5.getClass();
            return w82Var5;
        }
        if (ordinal != 5) {
            u9.gPXPFXrUH4XX();
            return null;
        }
        ((c71) d71Var).getClass();
        w82 w82Var6 = c71.RAsUl2FVSrh6;
        w82Var6.getClass();
        return w82Var6;
    }

    public static int XL4ISE6Oc65B(HandwritingGesture handwritingGesture, r3s1LDPKFs1S r3s1ldpkfs1s) {
        String fallbackText;
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        r3s1ldpkfs1s.OPXfSBeufaJ8(new mm(fallbackText, 1));
        return 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:216:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x04ab A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v19, types: [eb1, za1] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9, types: [bt] */
    /* JADX WARN: Type inference failed for: r12v9, types: [gl2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [hp, tf0] */
    /* JADX WARN: Type inference failed for: r22v3, types: [bt] */
    /* JADX WARN: Type inference failed for: r22v5, types: [bt] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Y1f8riQaR6yg(final lb1 lb1Var, final eb1 eb1Var, final n61 n61Var, final s sVar, final le0 le0Var, final le0 le0Var2, final le0 le0Var3, final le0 le0Var4, hp hpVar, final int i) {
        vc1 vc1Var;
        tf0 tf0Var;
        int i2;
        o01 o01Var;
        Object d4Var;
        d91 d91Var;
        fj1 fj1Var;
        final d91 d91Var2;
        int i3;
        vc1 vc1Var2;
        wz wzVar;
        vc1 vc1Var3;
        final go goVar;
        k81 k81Var;
        d91 d91Var3;
        i92 i92Var;
        ?? r11;
        x12 x12Var;
        gl2 gl2Var;
        x91 x91Var;
        wz wzVar2;
        go goVar2;
        d91 d91Var4;
        k81 k81Var2;
        wz wzVar3;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        ArrayList arrayList;
        int length;
        int i4;
        String str;
        za1 wdg6QnbFHrFF;
        eb1 eb1Var2;
        Bundle bundle;
        int i5;
        za1 wdg6QnbFHrFF2;
        eb1 eb1Var3;
        tf0 tf0Var2;
        tf0 tf0Var3 = (tf0) hpVar;
        tf0Var3.JHNfcAUfKc4G(-1964664536);
        int i6 = (i & 6) == 0 ? (tf0Var3.rtx2ld2ELZv4(lb1Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i6 |= tf0Var3.rtx2ld2ELZv4(eb1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= tf0Var3.a92UlCVFR9N8(n61Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i6 |= tf0Var3.a92UlCVFR9N8(sVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i6 |= tf0Var3.rtx2ld2ELZv4(le0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i6 |= tf0Var3.rtx2ld2ELZv4(le0Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i6 |= tf0Var3.rtx2ld2ELZv4(le0Var3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i6 |= tf0Var3.rtx2ld2ELZv4(le0Var4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i6 |= tf0Var3.rtx2ld2ELZv4(null) ? 67108864 : 33554432;
        }
        int i7 = i6;
        if ((38347923 & i7) == 38347922 && tf0Var3.e6tOsSdd2EFb()) {
            tf0Var3.i68hK7ahKtgp();
            tf0Var2 = tf0Var3;
        } else {
            tf0Var3.wLFCmsViZrNT();
            if ((i & 1) != 0 && !tf0Var3.pnx5pC0XzaCw()) {
                tf0Var3.i68hK7ahKtgp();
            }
            tf0Var3.BRwzKIf41E4i();
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            o01 o01Var2 = (o01) tf0Var3.wdg6QnbFHrFF(f21.PxuCJdSBwIXG);
            pr2 PxuCJdSBwIXG2 = l21.PxuCJdSBwIXG(tf0Var3);
            if (PxuCJdSBwIXG2 == null) {
                u9.rtx2ld2ELZv4("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                return;
            }
            or2 RAsUl2FVSrh6 = PxuCJdSBwIXG2.RAsUl2FVSrh6();
            lb1Var.getClass();
            la1 la1Var = lb1Var.lS5Rgt96tfkO;
            RAsUl2FVSrh6.getClass();
            la1Var.getClass();
            vc1 vc1Var4 = la1Var.RfyTYNmI9Srp;
            na1 na1Var = la1Var.QrzZRwfaDlRX;
            na1.Companion.getClass();
            ir2 ir2Var = nr2.Companion;
            c cVar = oa1.PxuCJdSBwIXG;
            if (!cs0.wdg6QnbFHrFF(na1Var, (na1) ir2.PxuCJdSBwIXG(ir2Var, RAsUl2FVSrh6, cVar).PxuCJdSBwIXG(bu1.PxuCJdSBwIXG(na1.class)))) {
                if (!la1Var.a92UlCVFR9N8.isEmpty()) {
                    u9.rtx2ld2ELZv4("ViewModelStore should be set before setGraph call");
                    return;
                }
                la1Var.QrzZRwfaDlRX = (na1) ir2.PxuCJdSBwIXG(ir2Var, RAsUl2FVSrh6, cVar).PxuCJdSBwIXG(bu1.PxuCJdSBwIXG(na1.class));
            }
            eb1Var.getClass();
            la1Var.getClass();
            LinkedHashMap linkedHashMap = la1Var.EcgxDIVH5in8;
            id0 id0Var = eb1Var.x50lh2ztY7Y5;
            da daVar = la1Var.a92UlCVFR9N8;
            if (!daVar.isEmpty() && la1Var.rtx2ld2ELZv4() == f01.rtx2ld2ELZv4) {
                u9.rtx2ld2ELZv4("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
                return;
            }
            if (cs0.wdg6QnbFHrFF(la1Var.TSizfFm2Yiuu, eb1Var)) {
                vc1Var = vc1Var4;
                tf0Var = tf0Var3;
                i2 = i7;
                o01Var = o01Var2;
                int e9gEMXR7LXtO = ((s82) id0Var.Y1f8riQaR6yg).e9gEMXR7LXtO();
                for (int i8 = 0; i8 < e9gEMXR7LXtO; i8++) {
                    za1 za1Var = (za1) ((s82) id0Var.Y1f8riQaR6yg).a92UlCVFR9N8(i8);
                    eb1 eb1Var4 = la1Var.TSizfFm2Yiuu;
                    eb1Var4.getClass();
                    int TSizfFm2Yiuu2 = ((s82) eb1Var4.x50lh2ztY7Y5.Y1f8riQaR6yg).TSizfFm2Yiuu(i8);
                    eb1 eb1Var5 = la1Var.TSizfFm2Yiuu;
                    eb1Var5.getClass();
                    s82 s82Var = (s82) eb1Var5.x50lh2ztY7Y5.Y1f8riQaR6yg;
                    if (s82Var.rtx2ld2ELZv4) {
                        zv.wdg6QnbFHrFF(s82Var);
                    }
                    int VhhvGxCb8gfr = mm2.VhhvGxCb8gfr(s82Var.OPXfSBeufaJ8, s82Var.dgRBjINgWbAK, TSizfFm2Yiuu2);
                    if (VhhvGxCb8gfr >= 0) {
                        Object[] objArr = s82Var.wdg6QnbFHrFF;
                        Object obj = objArr[VhhvGxCb8gfr];
                        objArr[VhhvGxCb8gfr] = za1Var;
                    }
                }
                Iterator it = daVar.iterator();
                while (it.hasNext()) {
                    x91 x91Var2 = (x91) it.next();
                    xa1 xa1Var = za1.Companion;
                    za1 za1Var2 = x91Var2.OPXfSBeufaJ8;
                    xa1Var.getClass();
                    y41 y41Var = new y41(z32.KUoIVIumpKat(xa1.lS5Rgt96tfkO(za1Var2)));
                    za1 za1Var3 = la1Var.TSizfFm2Yiuu;
                    za1Var3.getClass();
                    Iterator it2 = y41Var.iterator();
                    while (true) {
                        ListIterator listIterator = (ListIterator) ((fw1) it2).OPXfSBeufaJ8;
                        if (listIterator.hasPrevious()) {
                            za1 za1Var4 = (za1) listIterator.previous();
                            if (!cs0.wdg6QnbFHrFF(za1Var4, la1Var.TSizfFm2Yiuu) || !za1Var3.equals(eb1Var)) {
                                if (za1Var3 instanceof eb1) {
                                    za1Var3 = ((eb1) za1Var3).x50lh2ztY7Y5.wdg6QnbFHrFF(za1Var4.OPXfSBeufaJ8.lS5Rgt96tfkO);
                                    za1Var3.getClass();
                                }
                            }
                        }
                    }
                    x91Var2.OPXfSBeufaJ8 = za1Var3;
                }
            } else {
                eb1 eb1Var6 = la1Var.TSizfFm2Yiuu;
                if (eb1Var6 != null) {
                    ArrayList arrayList2 = new ArrayList(la1Var.x50lh2ztY7Y5.keySet());
                    int size = arrayList2.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj2 = arrayList2.get(i9);
                        i9++;
                        Integer num = (Integer) obj2;
                        num.getClass();
                        ArrayList arrayList3 = arrayList2;
                        int intValue = num.intValue();
                        Iterator it3 = linkedHashMap.values().iterator();
                        while (it3.hasNext()) {
                            ((fa1) it3.next()).Y1f8riQaR6yg = true;
                        }
                        boolean gPXPFXrUH4XX = la1Var.gPXPFXrUH4XX(intValue, null, xi0.gGoUzNp9JO5I(new xy0(12)));
                        Iterator it4 = linkedHashMap.values().iterator();
                        while (it4.hasNext()) {
                            ((fa1) it4.next()).Y1f8riQaR6yg = false;
                            it4 = it4;
                            gPXPFXrUH4XX = gPXPFXrUH4XX;
                        }
                        if (gPXPFXrUH4XX) {
                            la1Var.x50lh2ztY7Y5(intValue, true, false);
                        }
                        arrayList2 = arrayList3;
                    }
                    la1Var.x50lh2ztY7Y5(eb1Var6.OPXfSBeufaJ8.lS5Rgt96tfkO, true, false);
                }
                la1Var.TSizfFm2Yiuu = eb1Var;
                vc1 vc1Var5 = la1Var.RfyTYNmI9Srp;
                ga1 ga1Var = la1Var.PxuCJdSBwIXG;
                q3 q3Var = ga1Var.TSizfFm2Yiuu;
                Bundle bundle2 = la1Var.Y1f8riQaR6yg;
                if (bundle2 != null && bundle2.containsKey("android-support-nav:controller:navigatorState:names")) {
                    ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names");
                    if (stringArrayList == null) {
                        xi0.ryVscX7ZL4Ux("android-support-nav:controller:navigatorState:names");
                        throw null;
                    }
                    int size2 = stringArrayList.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        String str2 = stringArrayList.get(i10);
                        int i11 = i10 + 1;
                        String str3 = str2;
                        vc1Var5.lS5Rgt96tfkO(str3);
                        if (bundle2.containsKey(str3)) {
                            IAToe7bXGz4N(str3, bundle2);
                        }
                        i10 = i11;
                    }
                }
                Bundle[] bundleArr = la1Var.e9gEMXR7LXtO;
                if (bundleArr != null) {
                    int length2 = bundleArr.length;
                    int i12 = 0;
                    while (i12 < length2) {
                        Bundle[] bundleArr2 = bundleArr;
                        Bundle bundle3 = bundleArr2[i12];
                        bundle3.getClass();
                        bundle3.setClassLoader(aa1.class.getClassLoader());
                        String aF05bpZJlKEP = aF05bpZJlKEP("nav-entry-state:id", bundle3);
                        int ZbWwgt3aGe7A = ZbWwgt3aGe7A("nav-entry-state:destination-id", bundle3);
                        int i13 = length2;
                        int i14 = i12;
                        Bundle bundle4 = bundle3.getBundle("nav-entry-state:args");
                        if (bundle4 == null) {
                            xi0.ryVscX7ZL4Ux("nav-entry-state:args");
                            throw null;
                        }
                        Bundle bundle5 = bundle3.getBundle("nav-entry-state:saved-state");
                        if (bundle5 == null) {
                            xi0.ryVscX7ZL4Ux("nav-entry-state:saved-state");
                            throw null;
                        }
                        za1 TSizfFm2Yiuu3 = la1Var.TSizfFm2Yiuu(ZbWwgt3aGe7A, null);
                        if (TSizfFm2Yiuu3 == null) {
                            za1.Companion.getClass();
                            throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + xa1.PxuCJdSBwIXG(q3Var, ZbWwgt3aGe7A) + " cannot be found from the current destination " + la1Var.a92UlCVFR9N8());
                        }
                        f01 rtx2ld2ELZv4 = la1Var.rtx2ld2ELZv4();
                        na1 na1Var2 = la1Var.QrzZRwfaDlRX;
                        q3Var.getClass();
                        rtx2ld2ELZv4.getClass();
                        Context context = q3Var.PxuCJdSBwIXG;
                        bundle4.setClassLoader(context != null ? context.getClassLoader() : null);
                        x91.Companion.getClass();
                        x91 x91Var3 = new x91(q3Var, TSizfFm2Yiuu3, bundle4, rtx2ld2ELZv4, na1Var2, aF05bpZJlKEP, bundle5);
                        tc1 lS5Rgt96tfkO2 = vc1Var5.lS5Rgt96tfkO(TSizfFm2Yiuu3.rtx2ld2ELZv4);
                        Object obj3 = linkedHashMap.get(lS5Rgt96tfkO2);
                        if (obj3 == null) {
                            obj3 = new fa1(ga1Var, lS5Rgt96tfkO2);
                            linkedHashMap.put(lS5Rgt96tfkO2, obj3);
                        }
                        daVar.addLast(x91Var3);
                        ((fa1) obj3).PxuCJdSBwIXG(x91Var3);
                        eb1 eb1Var7 = x91Var3.OPXfSBeufaJ8.wdg6QnbFHrFF;
                        if (eb1Var7 != null) {
                            la1Var.wdg6QnbFHrFF(x91Var3, la1Var.e9gEMXR7LXtO(eb1Var7.OPXfSBeufaJ8.lS5Rgt96tfkO));
                        }
                        i12 = i14 + 1;
                        bundleArr = bundleArr2;
                        length2 = i13;
                    }
                    la1Var.lS5Rgt96tfkO.PxuCJdSBwIXG();
                    la1Var.e9gEMXR7LXtO = null;
                }
                Collection values = w41.wLFCmsViZrNT(vc1Var5.PxuCJdSBwIXG).values();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : values) {
                    if (!((tc1) obj4).lS5Rgt96tfkO) {
                        arrayList4.add(obj4);
                    }
                }
                int size3 = arrayList4.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj5 = arrayList4.get(i15);
                    i15++;
                    tc1 tc1Var = (tc1) obj5;
                    Object obj6 = linkedHashMap.get(tc1Var);
                    if (obj6 == null) {
                        tc1Var.getClass();
                        obj6 = new fa1(ga1Var, tc1Var);
                        linkedHashMap.put(tc1Var, obj6);
                    }
                    tc1Var.getClass();
                    tc1Var.PxuCJdSBwIXG = (fa1) obj6;
                    tc1Var.lS5Rgt96tfkO = true;
                }
                if (la1Var.TSizfFm2Yiuu == null || !daVar.isEmpty()) {
                    vc1Var = vc1Var4;
                    tf0Var = tf0Var3;
                    i2 = i7;
                    o01Var = o01Var2;
                    la1Var.lS5Rgt96tfkO();
                } else {
                    Activity activity = ga1Var.Y1f8riQaR6yg;
                    if (!ga1Var.e9gEMXR7LXtO && activity != null) {
                        Intent intent = activity.getIntent();
                        la1 la1Var2 = ga1Var.lS5Rgt96tfkO;
                        if (intent != null) {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                try {
                                    iArr = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                                } catch (Exception e) {
                                    i2 = i7;
                                    Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e);
                                    iArr = null;
                                }
                            } else {
                                iArr = null;
                            }
                            i2 = i7;
                            ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                            Bundle ZbWwgt3aGe7A2 = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
                            Bundle bundle6 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                            if (bundle6 != null) {
                                ZbWwgt3aGe7A2.putAll(bundle6);
                            }
                            if (iArr == null || iArr.length == 0) {
                                ?? OPXfSBeufaJ8 = la1Var2.OPXfSBeufaJ8();
                                iArr2 = iArr;
                                o01Var = o01Var2;
                                tf0Var = tf0Var3;
                                vc1Var = vc1Var4;
                                ya1 e9gEMXR7LXtO2 = OPXfSBeufaJ8.e9gEMXR7LXtO(new m9(intent.getData(), intent.getAction(), intent.getType(), 13), OPXfSBeufaJ8);
                                if (e9gEMXR7LXtO2 != null) {
                                    za1 za1Var5 = e9gEMXR7LXtO2.rtx2ld2ELZv4;
                                    int[] lS5Rgt96tfkO3 = za1Var5.lS5Rgt96tfkO(null);
                                    Bundle PxuCJdSBwIXG3 = za1Var5.PxuCJdSBwIXG(e9gEMXR7LXtO2.OPXfSBeufaJ8);
                                    if (PxuCJdSBwIXG3 != null) {
                                        ZbWwgt3aGe7A2.putAll(PxuCJdSBwIXG3);
                                    }
                                    iArr3 = lS5Rgt96tfkO3;
                                    arrayList = null;
                                    if (iArr3 != null && iArr3.length != 0) {
                                        la1Var2.getClass();
                                        eb1 eb1Var8 = la1Var2.TSizfFm2Yiuu;
                                        length = iArr3.length;
                                        i4 = 0;
                                        while (true) {
                                            if (i4 < length) {
                                                str = null;
                                                break;
                                            }
                                            int i16 = iArr3[i4];
                                            if (i4 == 0) {
                                                i5 = length;
                                                eb1 eb1Var9 = la1Var2.TSizfFm2Yiuu;
                                                eb1Var9.getClass();
                                                wdg6QnbFHrFF2 = eb1Var9.OPXfSBeufaJ8.lS5Rgt96tfkO == i16 ? la1Var2.TSizfFm2Yiuu : null;
                                            } else {
                                                i5 = length;
                                                eb1Var8.getClass();
                                                wdg6QnbFHrFF2 = eb1Var8.x50lh2ztY7Y5.wdg6QnbFHrFF(i16);
                                            }
                                            if (wdg6QnbFHrFF2 == null) {
                                                xa1 xa1Var2 = za1.Companion;
                                                q3 q3Var2 = la1Var2.PxuCJdSBwIXG.TSizfFm2Yiuu;
                                                xa1Var2.getClass();
                                                str = xa1.PxuCJdSBwIXG(q3Var2, i16);
                                                break;
                                            }
                                            if (i4 != iArr3.length - 1 && (wdg6QnbFHrFF2 instanceof eb1)) {
                                                while (true) {
                                                    eb1Var3 = (eb1) wdg6QnbFHrFF2;
                                                    eb1Var3.getClass();
                                                    id0 id0Var2 = eb1Var3.x50lh2ztY7Y5;
                                                    if (!(id0Var2.wdg6QnbFHrFF(id0Var2.lS5Rgt96tfkO) instanceof eb1)) {
                                                        break;
                                                    } else {
                                                        wdg6QnbFHrFF2 = id0Var2.wdg6QnbFHrFF(id0Var2.lS5Rgt96tfkO);
                                                    }
                                                }
                                                eb1Var8 = eb1Var3;
                                            }
                                            i4++;
                                            length = i5;
                                        }
                                        if (str == null) {
                                            z21.Companion.getClass();
                                            Log.i("NavController", "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent);
                                        } else {
                                            ZbWwgt3aGe7A2.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                            int length3 = iArr3.length;
                                            Bundle[] bundleArr3 = new Bundle[length3];
                                            for (int i17 = 0; i17 < length3; i17++) {
                                                Bundle ZbWwgt3aGe7A3 = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
                                                ZbWwgt3aGe7A3.putAll(ZbWwgt3aGe7A2);
                                                if (arrayList != null && (bundle = (Bundle) arrayList.get(i17)) != null) {
                                                    ZbWwgt3aGe7A3.putAll(bundle);
                                                }
                                                bundleArr3[i17] = ZbWwgt3aGe7A3;
                                            }
                                            int flags = intent.getFlags();
                                            int i18 = 268435456 & flags;
                                            if (i18 != 0 && (flags & 32768) == 0) {
                                                intent.addFlags(32768);
                                                ce2 ce2Var = new ce2(ga1Var.PxuCJdSBwIXG);
                                                ce2Var.PxuCJdSBwIXG(intent);
                                                ce2Var.lS5Rgt96tfkO();
                                                activity.finish();
                                                activity.overridePendingTransition(0, 0);
                                            } else if (i18 != 0) {
                                                if (!la1Var2.a92UlCVFR9N8.isEmpty()) {
                                                    eb1 eb1Var10 = la1Var2.TSizfFm2Yiuu;
                                                    eb1Var10.getClass();
                                                    la1Var2.x50lh2ztY7Y5(eb1Var10.OPXfSBeufaJ8.lS5Rgt96tfkO, true, false);
                                                }
                                                int i19 = 0;
                                                while (i19 < iArr3.length) {
                                                    int i20 = iArr3[i19];
                                                    int i21 = i19 + 1;
                                                    Bundle bundle7 = bundleArr3[i19];
                                                    za1 TSizfFm2Yiuu4 = la1Var2.TSizfFm2Yiuu(i20, null);
                                                    if (TSizfFm2Yiuu4 == null) {
                                                        za1.Companion.getClass();
                                                        throw new IllegalStateException("Deep Linking failed: destination " + xa1.PxuCJdSBwIXG(q3Var, i20) + " cannot be found from the current destination " + la1Var2.a92UlCVFR9N8());
                                                    }
                                                    la1Var2.dgRBjINgWbAK(TSizfFm2Yiuu4, bundle7, xi0.gGoUzNp9JO5I(new e9gEMXR7LXtO(21, TSizfFm2Yiuu4, ga1Var)));
                                                    i19 = i21;
                                                }
                                                ga1Var.e9gEMXR7LXtO = true;
                                            } else {
                                                eb1 eb1Var11 = la1Var2.TSizfFm2Yiuu;
                                                int length4 = iArr3.length;
                                                for (int i22 = 0; i22 < length4; i22++) {
                                                    int i23 = iArr3[i22];
                                                    Bundle bundle8 = bundleArr3[i22];
                                                    if (i22 == 0) {
                                                        wdg6QnbFHrFF = la1Var2.TSizfFm2Yiuu;
                                                    } else {
                                                        eb1Var11.getClass();
                                                        wdg6QnbFHrFF = eb1Var11.x50lh2ztY7Y5.wdg6QnbFHrFF(i23);
                                                    }
                                                    if (wdg6QnbFHrFF == null) {
                                                        za1.Companion.getClass();
                                                        throw new IllegalStateException("Deep Linking failed: destination " + xa1.PxuCJdSBwIXG(q3Var, i23) + " cannot be found in graph " + eb1Var11);
                                                    }
                                                    if (i22 == iArr3.length - 1) {
                                                        eb1 eb1Var12 = la1Var2.TSizfFm2Yiuu;
                                                        eb1Var12.getClass();
                                                        la1Var2.dgRBjINgWbAK(wdg6QnbFHrFF, bundle8, new xb1(false, false, eb1Var12.OPXfSBeufaJ8.lS5Rgt96tfkO, true, false, 0, 0));
                                                    } else if (wdg6QnbFHrFF instanceof eb1) {
                                                        while (true) {
                                                            eb1Var2 = (eb1) wdg6QnbFHrFF;
                                                            eb1Var2.getClass();
                                                            id0 id0Var3 = eb1Var2.x50lh2ztY7Y5;
                                                            if (!(id0Var3.wdg6QnbFHrFF(id0Var3.lS5Rgt96tfkO) instanceof eb1)) {
                                                                break;
                                                            } else {
                                                                wdg6QnbFHrFF = id0Var3.wdg6QnbFHrFF(id0Var3.lS5Rgt96tfkO);
                                                            }
                                                        }
                                                        eb1Var11 = eb1Var2;
                                                    }
                                                }
                                                ga1Var.e9gEMXR7LXtO = true;
                                            }
                                        }
                                    }
                                    eb1 eb1Var13 = la1Var.TSizfFm2Yiuu;
                                    eb1Var13.getClass();
                                    la1Var.dgRBjINgWbAK(eb1Var13, null, null);
                                }
                            } else {
                                iArr2 = iArr;
                                vc1Var = vc1Var4;
                                tf0Var = tf0Var3;
                                o01Var = o01Var2;
                            }
                            arrayList = parcelableArrayList;
                            iArr3 = iArr2;
                            if (iArr3 != null) {
                                la1Var2.getClass();
                                eb1 eb1Var82 = la1Var2.TSizfFm2Yiuu;
                                length = iArr3.length;
                                i4 = 0;
                                while (true) {
                                    if (i4 < length) {
                                    }
                                    i4++;
                                    length = i5;
                                }
                                if (str == null) {
                                }
                            }
                            eb1 eb1Var132 = la1Var.TSizfFm2Yiuu;
                            eb1Var132.getClass();
                            la1Var.dgRBjINgWbAK(eb1Var132, null, null);
                        }
                    }
                    vc1Var = vc1Var4;
                    tf0Var = tf0Var3;
                    i2 = i7;
                    o01Var = o01Var2;
                    eb1 eb1Var1322 = la1Var.TSizfFm2Yiuu;
                    eb1Var1322.getClass();
                    la1Var.dgRBjINgWbAK(eb1Var1322, null, null);
                }
            }
            vc1 vc1Var6 = vc1Var;
            tc1 lS5Rgt96tfkO4 = vc1Var6.lS5Rgt96tfkO("composable");
            go goVar3 = lS5Rgt96tfkO4 instanceof go ? (go) lS5Rgt96tfkO4 : null;
            if (goVar3 == null) {
                zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
                if (XL4ISE6Oc65B != null) {
                    final int i24 = 2;
                    XL4ISE6Oc65B.Y1f8riQaR6yg = new pe0() { // from class: ob1
                        @Override // defpackage.pe0
                        public final Object rtx2ld2ELZv4(Object obj7, Object obj8) {
                            int i25 = i24;
                            no2 no2Var = no2.PxuCJdSBwIXG;
                            int i26 = i;
                            switch (i25) {
                                case 0:
                                    ((Integer) obj8).getClass();
                                    int bEKsvqmvPh2y = ki0.bEKsvqmvPh2y(i26 | 1);
                                    vi0.Y1f8riQaR6yg(lb1Var, eb1Var, n61Var, sVar, le0Var, le0Var2, le0Var3, le0Var4, (hp) obj7, bEKsvqmvPh2y);
                                    break;
                                case 1:
                                    ((Integer) obj8).getClass();
                                    int bEKsvqmvPh2y2 = ki0.bEKsvqmvPh2y(i26 | 1);
                                    vi0.Y1f8riQaR6yg(lb1Var, eb1Var, n61Var, sVar, le0Var, le0Var2, le0Var3, le0Var4, (hp) obj7, bEKsvqmvPh2y2);
                                    break;
                                default:
                                    ((Integer) obj8).getClass();
                                    int bEKsvqmvPh2y3 = ki0.bEKsvqmvPh2y(i26 | 1);
                                    vi0.Y1f8riQaR6yg(lb1Var, eb1Var, n61Var, sVar, le0Var, le0Var2, le0Var3, le0Var4, (hp) obj7, bEKsvqmvPh2y3);
                                    break;
                            }
                            return no2Var;
                        }
                    };
                    return;
                }
                return;
            }
            ?? r13 = tf0Var;
            d91 QrzZRwfaDlRX = sj0.QrzZRwfaDlRX(goVar3.lS5Rgt96tfkO().e9gEMXR7LXtO, r13);
            Object nLZGh9p8gVSu = r13.nLZGh9p8gVSu();
            hp.Companion.getClass();
            Object obj7 = fp.lS5Rgt96tfkO;
            if (nLZGh9p8gVSu == obj7) {
                nLZGh9p8gVSu = new fj1(0.0f);
                r13.JTxCbbCwomzt(nLZGh9p8gVSu);
            }
            fj1 fj1Var2 = (fj1) nLZGh9p8gVSu;
            Object nLZGh9p8gVSu2 = r13.nLZGh9p8gVSu();
            if (nLZGh9p8gVSu2 == obj7) {
                nLZGh9p8gVSu2 = sj0.tmVwIGCQF4zR(Boolean.FALSE);
                r13.JTxCbbCwomzt(nLZGh9p8gVSu2);
            }
            d91 d91Var5 = (d91) nLZGh9p8gVSu2;
            boolean z = ((List) QrzZRwfaDlRX.getValue()).size() > 1;
            boolean a92UlCVFR9N8 = r13.a92UlCVFR9N8(QrzZRwfaDlRX) | r13.rtx2ld2ELZv4(goVar3);
            Object nLZGh9p8gVSu3 = r13.nLZGh9p8gVSu();
            if (a92UlCVFR9N8 || nLZGh9p8gVSu3 == obj7) {
                go goVar4 = goVar3;
                d4Var = new d4(goVar4, QrzZRwfaDlRX, fj1Var2, d91Var5, null, 4);
                d91Var = QrzZRwfaDlRX;
                fj1Var = fj1Var2;
                d91Var2 = d91Var5;
                goVar3 = goVar4;
                i3 = 1048576;
                r13.JTxCbbCwomzt(d4Var);
            } else {
                d4Var = nLZGh9p8gVSu3;
                d91Var = QrzZRwfaDlRX;
                fj1Var = fj1Var2;
                d91Var2 = d91Var5;
                i3 = 1048576;
            }
            jh0.RAsUl2FVSrh6(z, (pe0) d4Var, r13, 0);
            o01 o01Var3 = o01Var;
            boolean rtx2ld2ELZv42 = r13.rtx2ld2ELZv4(lb1Var) | r13.rtx2ld2ELZv4(o01Var3);
            Object nLZGh9p8gVSu4 = r13.nLZGh9p8gVSu();
            int i25 = 23;
            if (rtx2ld2ELZv42 || nLZGh9p8gVSu4 == obj7) {
                nLZGh9p8gVSu4 = new e9gEMXR7LXtO(i25, lb1Var, o01Var3);
                r13.JTxCbbCwomzt(nLZGh9p8gVSu4);
            }
            mm2.rtx2ld2ELZv4(o01Var3, (le0) nLZGh9p8gVSu4, r13);
            yy1 nLZGh9p8gVSu5 = ni0.nLZGh9p8gVSu(r13);
            d91 QrzZRwfaDlRX2 = sj0.QrzZRwfaDlRX(la1Var.OPXfSBeufaJ8, r13);
            Object nLZGh9p8gVSu6 = r13.nLZGh9p8gVSu();
            if (nLZGh9p8gVSu6 == obj7) {
                nLZGh9p8gVSu6 = sj0.RfyTYNmI9Srp(new pb1(QrzZRwfaDlRX2, 0));
                r13.JTxCbbCwomzt(nLZGh9p8gVSu6);
            }
            i92 i92Var2 = (i92) nLZGh9p8gVSu6;
            x91 x91Var4 = (x91) zk.BUo4iHFctTZi((List) i92Var2.getValue());
            Object nLZGh9p8gVSu7 = r13.nLZGh9p8gVSu();
            if (nLZGh9p8gVSu7 == obj7) {
                int i26 = ne1.PxuCJdSBwIXG;
                nLZGh9p8gVSu7 = new k81(6);
                r13.JTxCbbCwomzt(nLZGh9p8gVSu7);
            }
            k81 k81Var3 = (k81) nLZGh9p8gVSu7;
            if (x91Var4 != null) {
                r13.IXK6ba3ucyzm(-1797563167);
                boolean rtx2ld2ELZv43 = r13.rtx2ld2ELZv4(goVar3) | ((((i2 & 3670016) ^ 1572864) > i3 && r13.a92UlCVFR9N8(le0Var3)) || (i2 & 1572864) == i3) | ((i2 & 57344) == 16384);
                Object nLZGh9p8gVSu8 = r13.nLZGh9p8gVSu();
                if (rtx2ld2ELZv43 || nLZGh9p8gVSu8 == obj7) {
                    final int i27 = 1;
                    vc1Var3 = vc1Var6;
                    goVar = goVar3;
                    k81Var = k81Var3;
                    le0 le0Var5 = new le0() { // from class: mb1
                        @Override // defpackage.le0
                        public final Object OPXfSBeufaJ8(Object obj8) {
                            int i28 = i27;
                            d91 d91Var6 = d91Var2;
                            le0 le0Var6 = le0Var;
                            le0 le0Var7 = le0Var3;
                            go goVar5 = goVar;
                            y7 y7Var = (y7) obj8;
                            switch (i28) {
                                case 0:
                                    za1 za1Var6 = ((x91) y7Var.lS5Rgt96tfkO()).OPXfSBeufaJ8;
                                    za1Var6.getClass();
                                    fo foVar = (fo) za1Var6;
                                    if (((Boolean) goVar5.TSizfFm2Yiuu.getValue()).booleanValue() || ((Boolean) d91Var6.getValue()).booleanValue()) {
                                        za1.Companion.getClass();
                                        for (za1 za1Var7 : xa1.lS5Rgt96tfkO(foVar)) {
                                        }
                                        return (k70) le0Var7.OPXfSBeufaJ8(y7Var);
                                    }
                                    za1.Companion.getClass();
                                    for (za1 za1Var8 : xa1.lS5Rgt96tfkO(foVar)) {
                                    }
                                    return (k70) le0Var6.OPXfSBeufaJ8(y7Var);
                                default:
                                    za1 za1Var9 = ((x91) y7Var.TSizfFm2Yiuu()).OPXfSBeufaJ8;
                                    za1Var9.getClass();
                                    fo foVar2 = (fo) za1Var9;
                                    if (((Boolean) goVar5.TSizfFm2Yiuu.getValue()).booleanValue() || ((Boolean) d91Var6.getValue()).booleanValue()) {
                                        za1.Companion.getClass();
                                        for (za1 za1Var10 : xa1.lS5Rgt96tfkO(foVar2)) {
                                        }
                                        return (e60) le0Var7.OPXfSBeufaJ8(y7Var);
                                    }
                                    za1.Companion.getClass();
                                    for (za1 za1Var11 : xa1.lS5Rgt96tfkO(foVar2)) {
                                    }
                                    return (e60) le0Var6.OPXfSBeufaJ8(y7Var);
                            }
                        }
                    };
                    r13.JTxCbbCwomzt(le0Var5);
                    nLZGh9p8gVSu8 = le0Var5;
                } else {
                    vc1Var3 = vc1Var6;
                    goVar = goVar3;
                    k81Var = k81Var3;
                }
                le0 le0Var6 = (le0) nLZGh9p8gVSu8;
                boolean rtx2ld2ELZv44 = r13.rtx2ld2ELZv4(goVar) | ((((i2 & 29360128) ^ 12582912) > 8388608 && r13.a92UlCVFR9N8(le0Var4)) || (i2 & 12582912) == 8388608) | ((i2 & 458752) == 131072);
                Object nLZGh9p8gVSu9 = r13.nLZGh9p8gVSu();
                if (rtx2ld2ELZv44 || nLZGh9p8gVSu9 == obj7) {
                    final int i28 = 0;
                    le0 le0Var7 = new le0() { // from class: mb1
                        @Override // defpackage.le0
                        public final Object OPXfSBeufaJ8(Object obj8) {
                            int i282 = i28;
                            d91 d91Var6 = d91Var2;
                            le0 le0Var62 = le0Var2;
                            le0 le0Var72 = le0Var4;
                            go goVar5 = goVar;
                            y7 y7Var = (y7) obj8;
                            switch (i282) {
                                case 0:
                                    za1 za1Var6 = ((x91) y7Var.lS5Rgt96tfkO()).OPXfSBeufaJ8;
                                    za1Var6.getClass();
                                    fo foVar = (fo) za1Var6;
                                    if (((Boolean) goVar5.TSizfFm2Yiuu.getValue()).booleanValue() || ((Boolean) d91Var6.getValue()).booleanValue()) {
                                        za1.Companion.getClass();
                                        for (za1 za1Var7 : xa1.lS5Rgt96tfkO(foVar)) {
                                        }
                                        return (k70) le0Var72.OPXfSBeufaJ8(y7Var);
                                    }
                                    za1.Companion.getClass();
                                    for (za1 za1Var8 : xa1.lS5Rgt96tfkO(foVar)) {
                                    }
                                    return (k70) le0Var62.OPXfSBeufaJ8(y7Var);
                                default:
                                    za1 za1Var9 = ((x91) y7Var.TSizfFm2Yiuu()).OPXfSBeufaJ8;
                                    za1Var9.getClass();
                                    fo foVar2 = (fo) za1Var9;
                                    if (((Boolean) goVar5.TSizfFm2Yiuu.getValue()).booleanValue() || ((Boolean) d91Var6.getValue()).booleanValue()) {
                                        za1.Companion.getClass();
                                        for (za1 za1Var10 : xa1.lS5Rgt96tfkO(foVar2)) {
                                        }
                                        return (e60) le0Var72.OPXfSBeufaJ8(y7Var);
                                    }
                                    za1.Companion.getClass();
                                    for (za1 za1Var11 : xa1.lS5Rgt96tfkO(foVar2)) {
                                    }
                                    return (e60) le0Var62.OPXfSBeufaJ8(y7Var);
                            }
                        }
                    };
                    r13.JTxCbbCwomzt(le0Var7);
                    nLZGh9p8gVSu9 = le0Var7;
                }
                le0 le0Var8 = (le0) nLZGh9p8gVSu9;
                boolean z2 = (i2 & 234881024) == 67108864;
                Object nLZGh9p8gVSu10 = r13.nLZGh9p8gVSu();
                if (z2 || nLZGh9p8gVSu10 == obj7) {
                    nLZGh9p8gVSu10 = new xy0(i25);
                    r13.JTxCbbCwomzt(nLZGh9p8gVSu10);
                }
                le0 le0Var9 = (le0) nLZGh9p8gVSu10;
                Boolean bool = Boolean.TRUE;
                boolean rtx2ld2ELZv45 = r13.rtx2ld2ELZv4(goVar);
                Object nLZGh9p8gVSu11 = r13.nLZGh9p8gVSu();
                int i29 = 22;
                if (rtx2ld2ELZv45 || nLZGh9p8gVSu11 == obj7) {
                    nLZGh9p8gVSu11 = new e9gEMXR7LXtO(i29, i92Var2, goVar);
                    r13.JTxCbbCwomzt(nLZGh9p8gVSu11);
                }
                mm2.rtx2ld2ELZv4(bool, (le0) nLZGh9p8gVSu11, r13);
                Object nLZGh9p8gVSu12 = r13.nLZGh9p8gVSu();
                if (nLZGh9p8gVSu12 == obj7) {
                    nLZGh9p8gVSu12 = new x12(x91Var4);
                    r13.JTxCbbCwomzt(nLZGh9p8gVSu12);
                }
                x12 x12Var2 = (x12) nLZGh9p8gVSu12;
                boolean a92UlCVFR9N82 = r13.a92UlCVFR9N8(x12Var2);
                Object nLZGh9p8gVSu13 = r13.nLZGh9p8gVSu();
                if (a92UlCVFR9N82 || nLZGh9p8gVSu13 == obj7) {
                    j72.Companion.getClass();
                    j72 PxuCJdSBwIXG4 = i72.PxuCJdSBwIXG();
                    le0 e9gEMXR7LXtO3 = PxuCJdSBwIXG4 != null ? PxuCJdSBwIXG4.e9gEMXR7LXtO() : null;
                    d91Var3 = d91Var2;
                    j72 lS5Rgt96tfkO5 = i72.lS5Rgt96tfkO(PxuCJdSBwIXG4);
                    i92Var = i92Var2;
                    try {
                        gl2 gl2Var2 = new gl2(x12Var2, null, "entry");
                        i72.e9gEMXR7LXtO(PxuCJdSBwIXG4, lS5Rgt96tfkO5, e9gEMXR7LXtO3);
                        r13.JTxCbbCwomzt(gl2Var2);
                        nLZGh9p8gVSu13 = gl2Var2;
                    } catch (Throwable th) {
                        i72.e9gEMXR7LXtO(PxuCJdSBwIXG4, lS5Rgt96tfkO5, e9gEMXR7LXtO3);
                        throw th;
                    }
                } else {
                    d91Var3 = d91Var2;
                    i92Var = i92Var2;
                }
                ?? r12 = (gl2) nLZGh9p8gVSu13;
                if (x12Var2 != null) {
                    r13.IXK6ba3ucyzm(-1357590553);
                    Object nLZGh9p8gVSu14 = r13.nLZGh9p8gVSu();
                    if (nLZGh9p8gVSu14 == obj7) {
                        nLZGh9p8gVSu14 = mm2.kpCQ9veP6n3I(r13);
                        r13.JTxCbbCwomzt(nLZGh9p8gVSu14);
                    }
                    ru ruVar = (ru) nLZGh9p8gVSu14;
                    boolean rtx2ld2ELZv46 = r13.rtx2ld2ELZv4(ruVar) | r13.a92UlCVFR9N8(x12Var2);
                    Object nLZGh9p8gVSu15 = r13.nLZGh9p8gVSu();
                    if (rtx2ld2ELZv46 || nLZGh9p8gVSu15 == obj7) {
                        nLZGh9p8gVSu15 = new xf2(5, x12Var2, ruVar);
                        r13.JTxCbbCwomzt(nLZGh9p8gVSu15);
                    }
                    mm2.rtx2ld2ELZv4(ruVar, (le0) nLZGh9p8gVSu15, r13);
                    Object value = x12Var2.TSizfFm2Yiuu.getValue();
                    Object value2 = x12Var2.lS5Rgt96tfkO.getValue();
                    boolean a92UlCVFR9N83 = r13.a92UlCVFR9N8(x12Var2);
                    Object nLZGh9p8gVSu16 = r13.nLZGh9p8gVSu();
                    if (a92UlCVFR9N83 || nLZGh9p8gVSu16 == obj7) {
                        r11 = null;
                        nLZGh9p8gVSu16 = new rtx2ld2ELZv4(x12Var2, r11, 22);
                        r13.JTxCbbCwomzt(nLZGh9p8gVSu16);
                    } else {
                        r11 = null;
                    }
                    mm2.dgRBjINgWbAK(value, value2, (pe0) nLZGh9p8gVSu16, r13);
                    r13.gPXPFXrUH4XX(false);
                } else {
                    r11 = null;
                    r13.IXK6ba3ucyzm(-1356604288);
                    r12.PxuCJdSBwIXG(x12Var2.lS5Rgt96tfkO.getValue(), r13, 0);
                    r13.gPXPFXrUH4XX(false);
                }
                boolean a92UlCVFR9N84 = r13.a92UlCVFR9N8(r12);
                Object nLZGh9p8gVSu17 = r13.nLZGh9p8gVSu();
                if (a92UlCVFR9N84 || nLZGh9p8gVSu17 == obj7) {
                    nLZGh9p8gVSu17 = new il2(r12, 1);
                    r13.JTxCbbCwomzt(nLZGh9p8gVSu17);
                }
                mm2.rtx2ld2ELZv4(r12, (le0) nLZGh9p8gVSu17, r13);
                if (((Boolean) d91Var3.getValue()).booleanValue()) {
                    r13.IXK6ba3ucyzm(-1795329152);
                    Float valueOf = Float.valueOf(fj1Var.rtx2ld2ELZv4());
                    boolean a92UlCVFR9N85 = r13.a92UlCVFR9N8(d91Var) | r13.rtx2ld2ELZv4(x12Var2);
                    Object nLZGh9p8gVSu18 = r13.nLZGh9p8gVSu();
                    if (a92UlCVFR9N85 || nLZGh9p8gVSu18 == obj7) {
                        ?? r22 = r11;
                        nLZGh9p8gVSu18 = new rtx2ld2ELZv4(x12Var2, d91Var, fj1Var, r22, 12);
                        r13.JTxCbbCwomzt(nLZGh9p8gVSu18);
                        wzVar3 = r22;
                    } else {
                        wzVar3 = r11;
                    }
                    mm2.wdg6QnbFHrFF(r13, (pe0) nLZGh9p8gVSu18, valueOf);
                    r13.gPXPFXrUH4XX(false);
                    x12Var = x12Var2;
                    gl2Var = r12;
                    x91Var = x91Var4;
                    wzVar2 = wzVar3;
                } else {
                    ?? r222 = r11;
                    r13.IXK6ba3ucyzm(-1794910745);
                    boolean rtx2ld2ELZv47 = r13.rtx2ld2ELZv4(x12Var2) | r13.rtx2ld2ELZv4(x91Var4) | r13.a92UlCVFR9N8(r12);
                    Object nLZGh9p8gVSu19 = r13.nLZGh9p8gVSu();
                    if (rtx2ld2ELZv47 || nLZGh9p8gVSu19 == obj7) {
                        x12Var = x12Var2;
                        gl2Var = r12;
                        nLZGh9p8gVSu19 = new e4(x12Var, x91Var4, gl2Var, r222, 6);
                        x91Var = x91Var4;
                        r13.JTxCbbCwomzt(nLZGh9p8gVSu19);
                    } else {
                        x12Var = x12Var2;
                        gl2Var = r12;
                        x91Var = x91Var4;
                    }
                    mm2.wdg6QnbFHrFF(r13, (pe0) nLZGh9p8gVSu19, x91Var);
                    r13.gPXPFXrUH4XX(false);
                    wzVar2 = r222;
                }
                boolean rtx2ld2ELZv48 = r13.rtx2ld2ELZv4(k81Var) | r13.rtx2ld2ELZv4(goVar) | r13.a92UlCVFR9N8(le0Var6) | r13.a92UlCVFR9N8(le0Var8) | r13.a92UlCVFR9N8(le0Var9);
                Object nLZGh9p8gVSu20 = r13.nLZGh9p8gVSu();
                if (rtx2ld2ELZv48 || nLZGh9p8gVSu20 == obj7) {
                    k81 k81Var4 = k81Var;
                    vc1Var2 = vc1Var3;
                    d91 d91Var6 = d91Var3;
                    go goVar5 = goVar;
                    df0 df0Var = new df0(k81Var4, goVar5, le0Var6, le0Var8, le0Var9, i92Var, d91Var6);
                    goVar2 = goVar5;
                    d91Var4 = d91Var6;
                    k81Var2 = k81Var4;
                    r13.JTxCbbCwomzt(df0Var);
                    nLZGh9p8gVSu20 = df0Var;
                } else {
                    goVar2 = goVar;
                    k81Var2 = k81Var;
                    vc1Var2 = vc1Var3;
                    d91Var4 = d91Var3;
                }
                le0 le0Var10 = (le0) nLZGh9p8gVSu20;
                Object nLZGh9p8gVSu21 = r13.nLZGh9p8gVSu();
                if (nLZGh9p8gVSu21 == obj7) {
                    nLZGh9p8gVSu21 = new xy0(25);
                    r13.JTxCbbCwomzt(nLZGh9p8gVSu21);
                }
                x91 x91Var5 = x91Var;
                gl2 gl2Var3 = gl2Var;
                b51.kpCQ9veP6n3I(gl2Var3, n61Var, le0Var10, sVar, (le0) nLZGh9p8gVSu21, bs0.kpCQ9veP6n3I(820763100, new sb1(x12Var, x91Var5, nLZGh9p8gVSu5, d91Var4, i92Var), r13), r13, ((i2 >> 3) & 112) | 221184 | (i2 & 7168));
                Object a92UlCVFR9N86 = gl2Var3.PxuCJdSBwIXG.a92UlCVFR9N8();
                Object value3 = gl2Var3.Y1f8riQaR6yg.getValue();
                boolean a92UlCVFR9N87 = r13.a92UlCVFR9N8(gl2Var3) | r13.rtx2ld2ELZv4(lb1Var) | r13.rtx2ld2ELZv4(x91Var5) | r13.rtx2ld2ELZv4(goVar2) | r13.rtx2ld2ELZv4(k81Var2);
                Object nLZGh9p8gVSu22 = r13.nLZGh9p8gVSu();
                if (a92UlCVFR9N87 || nLZGh9p8gVSu22 == obj7) {
                    tb1 tb1Var = new tb1(gl2Var3, lb1Var, x91Var5, k81Var2, i92Var, goVar2, null);
                    r13.JTxCbbCwomzt(tb1Var);
                    nLZGh9p8gVSu22 = tb1Var;
                }
                mm2.dgRBjINgWbAK(a92UlCVFR9N86, value3, (pe0) nLZGh9p8gVSu22, r13);
                r13.gPXPFXrUH4XX(false);
                wzVar = wzVar2;
            } else {
                vc1Var2 = vc1Var6;
                wzVar = null;
                r13.IXK6ba3ucyzm(-1789758886);
                r13.gPXPFXrUH4XX(false);
            }
            tc1 lS5Rgt96tfkO6 = vc1Var2.lS5Rgt96tfkO("dialog");
            wz wzVar4 = lS5Rgt96tfkO6 instanceof wz ? (wz) lS5Rgt96tfkO6 : wzVar;
            if (wzVar4 == null) {
                zs1 XL4ISE6Oc65B2 = r13.XL4ISE6Oc65B();
                if (XL4ISE6Oc65B2 != null) {
                    final int i30 = 0;
                    XL4ISE6Oc65B2.Y1f8riQaR6yg = new pe0() { // from class: ob1
                        @Override // defpackage.pe0
                        public final Object rtx2ld2ELZv4(Object obj72, Object obj8) {
                            int i252 = i30;
                            no2 no2Var = no2.PxuCJdSBwIXG;
                            int i262 = i;
                            switch (i252) {
                                case 0:
                                    ((Integer) obj8).getClass();
                                    int bEKsvqmvPh2y = ki0.bEKsvqmvPh2y(i262 | 1);
                                    vi0.Y1f8riQaR6yg(lb1Var, eb1Var, n61Var, sVar, le0Var, le0Var2, le0Var3, le0Var4, (hp) obj72, bEKsvqmvPh2y);
                                    break;
                                case 1:
                                    ((Integer) obj8).getClass();
                                    int bEKsvqmvPh2y2 = ki0.bEKsvqmvPh2y(i262 | 1);
                                    vi0.Y1f8riQaR6yg(lb1Var, eb1Var, n61Var, sVar, le0Var, le0Var2, le0Var3, le0Var4, (hp) obj72, bEKsvqmvPh2y2);
                                    break;
                                default:
                                    ((Integer) obj8).getClass();
                                    int bEKsvqmvPh2y3 = ki0.bEKsvqmvPh2y(i262 | 1);
                                    vi0.Y1f8riQaR6yg(lb1Var, eb1Var, n61Var, sVar, le0Var, le0Var2, le0Var3, le0Var4, (hp) obj72, bEKsvqmvPh2y3);
                                    break;
                            }
                            return no2Var;
                        }
                    };
                    return;
                }
                return;
            }
            mm2.RAsUl2FVSrh6(wzVar4, r13, 0);
            tf0Var2 = r13;
        }
        zs1 XL4ISE6Oc65B3 = tf0Var2.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B3 != null) {
            final int i31 = 1;
            XL4ISE6Oc65B3.Y1f8riQaR6yg = new pe0() { // from class: ob1
                @Override // defpackage.pe0
                public final Object rtx2ld2ELZv4(Object obj72, Object obj8) {
                    int i252 = i31;
                    no2 no2Var = no2.PxuCJdSBwIXG;
                    int i262 = i;
                    switch (i252) {
                        case 0:
                            ((Integer) obj8).getClass();
                            int bEKsvqmvPh2y = ki0.bEKsvqmvPh2y(i262 | 1);
                            vi0.Y1f8riQaR6yg(lb1Var, eb1Var, n61Var, sVar, le0Var, le0Var2, le0Var3, le0Var4, (hp) obj72, bEKsvqmvPh2y);
                            break;
                        case 1:
                            ((Integer) obj8).getClass();
                            int bEKsvqmvPh2y2 = ki0.bEKsvqmvPh2y(i262 | 1);
                            vi0.Y1f8riQaR6yg(lb1Var, eb1Var, n61Var, sVar, le0Var, le0Var2, le0Var3, le0Var4, (hp) obj72, bEKsvqmvPh2y2);
                            break;
                        default:
                            ((Integer) obj8).getClass();
                            int bEKsvqmvPh2y3 = ki0.bEKsvqmvPh2y(i262 | 1);
                            vi0.Y1f8riQaR6yg(lb1Var, eb1Var, n61Var, sVar, le0Var, le0Var2, le0Var3, le0Var4, (hp) obj72, bEKsvqmvPh2y3);
                            break;
                    }
                    return no2Var;
                }
            };
        }
    }

    public static final int ZbWwgt3aGe7A(String str, Bundle bundle) {
        str.getClass();
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        xi0.ryVscX7ZL4Ux(str);
        throw null;
    }

    public static m4 a92UlCVFR9N8(String str, dj2 dj2Var, long j, hy hyVar, ob0 ob0Var, int i, int i2) {
        p50 p50Var = p50.rtx2ld2ELZv4;
        return new m4(new q4(str, dj2Var, p50Var, p50Var, ob0Var, hyVar), i, 1, j);
    }

    public static final String aF05bpZJlKEP(String str, Bundle bundle) {
        str.getClass();
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        xi0.ryVscX7ZL4Ux(str);
        throw null;
    }

    public static qc2 amuv7NJvPxHu(ae0 ae0Var) {
        ae0Var.getClass();
        return new qc2(ae0Var);
    }

    public static final qt1 bEKsvqmvPh2y(RectF rectF) {
        return new qt1(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final ArrayList e6tOsSdd2EFb(String str, Bundle bundle) {
        ArrayList lS5Rgt96tfkO2 = Build.VERSION.SDK_INT >= 34 ? JLGWdXyAxbxj.lS5Rgt96tfkO(bundle, str, kj0.e6tOsSdd2EFb(bu1.PxuCJdSBwIXG(Bundle.class))) : bundle.getParcelableArrayList(str);
        if (lS5Rgt96tfkO2 != null) {
            return lS5Rgt96tfkO2;
        }
        xi0.ryVscX7ZL4Ux(str);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00dd, code lost:
    
        if (r3 == r6) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e9gEMXR7LXtO(final lb1 lb1Var, final Object obj, n61 n61Var, s sVar, Map map, le0 le0Var, le0 le0Var2, le0 le0Var3, le0 le0Var4, final le0 le0Var5, hp hpVar, final int i) {
        n61 n61Var2;
        le0 le0Var6;
        le0 le0Var7;
        s sVar2;
        Map map2;
        int i2;
        le0 le0Var8;
        le0 le0Var9;
        final le0 le0Var10;
        tf0 tf0Var;
        final le0 le0Var11;
        final le0 le0Var12;
        final Map map3;
        final le0 le0Var13;
        final s sVar3;
        final n61 n61Var3;
        tf0 tf0Var2 = (tf0) hpVar;
        tf0Var2.JHNfcAUfKc4G(-1476019057);
        int i3 = i | (tf0Var2.rtx2ld2ELZv4(lb1Var) ? 4 : 2) | 316370304;
        int i4 = (tf0Var2.rtx2ld2ELZv4(le0Var5) ? ' ' : (char) 16) | 6;
        if ((306783379 & i3) == 306783378 && (i4 & 19) == 18 && tf0Var2.e6tOsSdd2EFb()) {
            tf0Var2.i68hK7ahKtgp();
            n61Var3 = n61Var;
            sVar3 = sVar;
            map3 = map;
            le0Var13 = le0Var;
            le0Var11 = le0Var2;
            le0Var10 = le0Var4;
            tf0Var = tf0Var2;
            le0Var12 = le0Var3;
        } else {
            tf0Var2.wLFCmsViZrNT();
            int i5 = i & 1;
            Object obj2 = fp.lS5Rgt96tfkO;
            if (i5 == 0 || tf0Var2.pnx5pC0XzaCw()) {
                n61Var2 = n61.Companion;
                s.Companion.getClass();
                Object nLZGh9p8gVSu = tf0Var2.nLZGh9p8gVSu();
                fp fpVar = hp.Companion;
                fpVar.getClass();
                if (nLZGh9p8gVSu == obj2) {
                    nLZGh9p8gVSu = new xy0(22);
                    tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu);
                }
                le0Var6 = (le0) nLZGh9p8gVSu;
                Object nLZGh9p8gVSu2 = tf0Var2.nLZGh9p8gVSu();
                fpVar.getClass();
                if (nLZGh9p8gVSu2 == obj2) {
                    nLZGh9p8gVSu2 = new xy0(24);
                    tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu2);
                }
                le0Var7 = (le0) nLZGh9p8gVSu2;
                sVar2 = r.lS5Rgt96tfkO;
                map2 = q50.rtx2ld2ELZv4;
                i2 = i3 & (-2113929217);
                le0Var8 = le0Var6;
                le0Var9 = le0Var7;
            } else {
                tf0Var2.i68hK7ahKtgp();
                n61Var2 = n61Var;
                sVar2 = sVar;
                map2 = map;
                le0Var6 = le0Var;
                le0Var7 = le0Var2;
                le0Var9 = le0Var4;
                i2 = i3 & (-2113929217);
                le0Var8 = le0Var3;
            }
            tf0Var2.BRwzKIf41E4i();
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            boolean a92UlCVFR9N8 = ((i4 & 112) == 32) | tf0Var2.a92UlCVFR9N8(null) | tf0Var2.a92UlCVFR9N8(obj);
            Object nLZGh9p8gVSu3 = tf0Var2.nLZGh9p8gVSu();
            if (!a92UlCVFR9N8) {
                hp.Companion.getClass();
            }
            fb1 fb1Var = new fb1(lb1Var.lS5Rgt96tfkO.RfyTYNmI9Srp, obj, map2);
            le0Var5.OPXfSBeufaJ8(fb1Var);
            nLZGh9p8gVSu3 = fb1Var.TSizfFm2Yiuu();
            tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu3);
            le0 le0Var14 = le0Var8;
            s sVar4 = sVar2;
            le0 le0Var15 = le0Var7;
            n61 n61Var4 = n61Var2;
            le0 le0Var16 = le0Var6;
            le0 le0Var17 = le0Var9;
            Y1f8riQaR6yg(lb1Var, (eb1) nLZGh9p8gVSu3, n61Var4, sVar4, le0Var16, le0Var15, le0Var14, le0Var17, tf0Var2, (i2 & 8078) | 100884480);
            le0Var10 = le0Var17;
            tf0Var = tf0Var2;
            le0Var11 = le0Var15;
            le0Var12 = le0Var14;
            map3 = map2;
            le0Var13 = le0Var16;
            sVar3 = sVar4;
            n61Var3 = n61Var4;
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new pe0(obj, n61Var3, sVar3, map3, le0Var13, le0Var11, le0Var12, le0Var10, le0Var5, i) { // from class: nb1
                public final /* synthetic */ le0 BRwzKIf41E4i;
                public final /* synthetic */ Object OPXfSBeufaJ8;
                public final /* synthetic */ le0 QrzZRwfaDlRX;
                public final /* synthetic */ le0 cpQdD2nAriOS;
                public final /* synthetic */ s dgRBjINgWbAK;
                public final /* synthetic */ le0 gPXPFXrUH4XX;
                public final /* synthetic */ le0 r3s1LDPKFs1S;
                public final /* synthetic */ n61 wdg6QnbFHrFF;
                public final /* synthetic */ Map x50lh2ztY7Y5;

                @Override // defpackage.pe0
                public final Object rtx2ld2ELZv4(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int bEKsvqmvPh2y = ki0.bEKsvqmvPh2y(49);
                    vi0.e9gEMXR7LXtO(lb1.this, this.OPXfSBeufaJ8, this.wdg6QnbFHrFF, this.dgRBjINgWbAK, this.x50lh2ztY7Y5, this.cpQdD2nAriOS, this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, this.gPXPFXrUH4XX, this.BRwzKIf41E4i, (hp) obj3, bEKsvqmvPh2y);
                    return no2.PxuCJdSBwIXG;
                }
            };
        }
    }

    public static final String gGoUzNp9JO5I(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return o0.gPXPFXrUH4XX(sb, str != null ? o0.x50lh2ztY7Y5(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    public static final boolean gPXPFXrUH4XX(long j, long j2) {
        return j == j2;
    }

    public static void i68hK7ahKtgp(long j, v8 v8Var, boolean z, r3s1LDPKFs1S r3s1ldpkfs1s) {
        if (z) {
            ui2 ui2Var = vi2.Companion;
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            int codePointBefore = i > 0 ? Character.codePointBefore(v8Var, i) : 10;
            int codePointAt = i2 < v8Var.OPXfSBeufaJ8.length() ? Character.codePointAt(v8Var, i2) : 10;
            if (xi0.xfACYKDMU6Dj(codePointBefore) && (xi0.EpkonXwzFgDB(codePointAt) || xi0.J54yh1s3n4Aq(codePointAt))) {
                do {
                    i -= Character.charCount(codePointBefore);
                    if (i == 0) {
                        break;
                    } else {
                        codePointBefore = Character.codePointBefore(v8Var, i);
                    }
                } while (xi0.xfACYKDMU6Dj(codePointBefore));
                j = jh0.rtx2ld2ELZv4(i, i2);
            } else if (xi0.xfACYKDMU6Dj(codePointAt) && (xi0.EpkonXwzFgDB(codePointBefore) || xi0.J54yh1s3n4Aq(codePointBefore))) {
                do {
                    i2 += Character.charCount(codePointAt);
                    if (i2 == v8Var.OPXfSBeufaJ8.length()) {
                        break;
                    } else {
                        codePointAt = Character.codePointAt(v8Var, i2);
                    }
                } while (xi0.xfACYKDMU6Dj(codePointAt));
                j = jh0.rtx2ld2ELZv4(i, i2);
            }
        }
        int i3 = (int) (4294967295L & j);
        r3s1ldpkfs1s.OPXfSBeufaJ8(new wi0(new m40[]{new q42(i3, i3), new cy(vi2.Y1f8riQaR6yg(j), 0)}));
    }

    public static final a22 jyegZNwi31qc(Object obj) {
        if (obj != fx1.PxuCJdSBwIXG) {
            return (a22) obj;
        }
        u9.rtx2ld2ELZv4("Does not contain segment");
        return null;
    }

    public static final String[] kpCQ9veP6n3I(String str, Bundle bundle) {
        str.getClass();
        String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return stringArray;
        }
        xi0.ryVscX7ZL4Ux(str);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        if (r2 == defpackage.fp.lS5Rgt96tfkO) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void lS5Rgt96tfkO(Boolean bool, Object obj, o01 o01Var, le0 le0Var, hp hpVar, int i) {
        int i2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(696924721);
        if ((i & 6) == 0) {
            i2 = (tf0Var.rtx2ld2ELZv4(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(le0Var) ? 2048 : 1024;
        }
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 1171) != 1170)) {
            tf0Var.wLFCmsViZrNT();
            if ((i & 1) == 0 || tf0Var.pnx5pC0XzaCw()) {
                o01Var = (o01) tf0Var.wdg6QnbFHrFF(f21.PxuCJdSBwIXG);
            } else {
                tf0Var.i68hK7ahKtgp();
            }
            int i3 = i2 & (-897);
            tf0Var.BRwzKIf41E4i();
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            boolean a92UlCVFR9N8 = tf0Var.a92UlCVFR9N8(bool) | tf0Var.a92UlCVFR9N8(obj) | tf0Var.a92UlCVFR9N8(o01Var);
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            if (!a92UlCVFR9N8) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu = new w01(o01Var.rtx2ld2ELZv4());
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            TSizfFm2Yiuu(o01Var, (w01) nLZGh9p8gVSu, le0Var, tf0Var, (i3 >> 3) & 896);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        o01 o01Var2 = o01Var;
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new kn(bool, obj, o01Var2, le0Var, i);
        }
    }

    public static final String nLZGh9p8gVSu(Collection collection) {
        return ja2.POWyO8hTM6YC(zk.ctD2u3GUHhtA(collection, ",", null, null, null, 62)).concat(ja2.POWyO8hTM6YC("},"));
    }

    public static String ngxnMNrpiKat(long j) {
        return "PointerId(value=" + j + ')';
    }

    public static final int nxJAScVArhE9(b81 b81Var) {
        int lS5Rgt96tfkO2;
        int i = b81Var.lS5Rgt96tfkO;
        int lS5Rgt96tfkO3 = b81Var.lS5Rgt96tfkO(0);
        while (b81Var.lS5Rgt96tfkO != 0 && b81Var.lS5Rgt96tfkO(0) == lS5Rgt96tfkO3) {
            b81Var.e9gEMXR7LXtO(0, b81Var.TSizfFm2Yiuu());
            b81Var.Y1f8riQaR6yg(b81Var.lS5Rgt96tfkO - 1);
            int i2 = b81Var.lS5Rgt96tfkO;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int lS5Rgt96tfkO4 = b81Var.lS5Rgt96tfkO(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int lS5Rgt96tfkO5 = b81Var.lS5Rgt96tfkO(i6);
                if (i5 >= i2 || (lS5Rgt96tfkO2 = b81Var.lS5Rgt96tfkO(i5)) <= lS5Rgt96tfkO5) {
                    if (lS5Rgt96tfkO5 > lS5Rgt96tfkO4) {
                        b81Var.e9gEMXR7LXtO(i4, lS5Rgt96tfkO5);
                        b81Var.e9gEMXR7LXtO(i6, lS5Rgt96tfkO4);
                        i4 = i6;
                    }
                } else if (lS5Rgt96tfkO2 > lS5Rgt96tfkO4) {
                    b81Var.e9gEMXR7LXtO(i4, lS5Rgt96tfkO2);
                    b81Var.e9gEMXR7LXtO(i5, lS5Rgt96tfkO4);
                    i4 = i5;
                }
            }
        }
        return lS5Rgt96tfkO3;
    }

    public static final void ozEBbv0hFTAB(cb1 cb1Var, String str) {
        cb1Var.dgRBjINgWbAK(cb1Var.lS5Rgt96tfkO - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final zx1 pnx5pC0XzaCw(e51 e51Var) {
        Object wdg6QnbFHrFF = e51Var.wdg6QnbFHrFF();
        if (wdg6QnbFHrFF instanceof zx1) {
            return (zx1) wdg6QnbFHrFF;
        }
        return null;
    }

    public static final float rZjpSjn4zoMv(zx1 zx1Var) {
        if (zx1Var != null) {
            return zx1Var.PxuCJdSBwIXG;
        }
        return 0.0f;
    }

    public static final void rtx2ld2ELZv4(b81 b81Var, int i) {
        if (b81Var.lS5Rgt96tfkO == 0 || !(b81Var.lS5Rgt96tfkO(0) == i || b81Var.lS5Rgt96tfkO(b81Var.lS5Rgt96tfkO - 1) == i)) {
            int i2 = b81Var.lS5Rgt96tfkO;
            b81Var.PxuCJdSBwIXG(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int lS5Rgt96tfkO2 = b81Var.lS5Rgt96tfkO(i3);
                if (i <= lS5Rgt96tfkO2) {
                    break;
                }
                b81Var.e9gEMXR7LXtO(i2, lS5Rgt96tfkO2);
                i2 = i3;
            }
            b81Var.e9gEMXR7LXtO(i2, i);
        }
    }

    public static nx0 ryVscX7ZL4Ux(pz0 pz0Var, ae0 ae0Var) {
        jx1 jx1Var = jx1.pnx5pC0XzaCw;
        int ordinal = pz0Var.ordinal();
        if (ordinal == 0) {
            return new qc2(ae0Var);
        }
        if (ordinal == 1) {
            sy1 sy1Var = new sy1();
            sy1Var.rtx2ld2ELZv4 = ae0Var;
            sy1Var.OPXfSBeufaJ8 = jx1Var;
            return sy1Var;
        }
        if (ordinal != 2) {
            u9.gPXPFXrUH4XX();
            return null;
        }
        vo2 vo2Var = new vo2();
        vo2Var.rtx2ld2ELZv4 = ae0Var;
        vo2Var.OPXfSBeufaJ8 = jx1Var;
        return vo2Var;
    }

    public static final boolean tmVwIGCQF4zR(Object obj) {
        return obj == fx1.PxuCJdSBwIXG;
    }

    public static final long wLFCmsViZrNT(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static void wdg6QnbFHrFF(eg egVar) {
        egVar.OPXfSBeufaJ8(null, false);
    }

    public static final fv2 xbgXKYA2cIfu(ht0 ht0Var, SerialDescriptor serialDescriptor) {
        ht0Var.getClass();
        serialDescriptor.getClass();
        sj0 TSizfFm2Yiuu2 = serialDescriptor.TSizfFm2Yiuu();
        if (TSizfFm2Yiuu2 instanceof jo1) {
            return fv2.cpQdD2nAriOS;
        }
        if (cs0.wdg6QnbFHrFF(TSizfFm2Yiuu2, wa2.a92UlCVFR9N8)) {
            return fv2.dgRBjINgWbAK;
        }
        if (!cs0.wdg6QnbFHrFF(TSizfFm2Yiuu2, wa2.RAsUl2FVSrh6)) {
            return fv2.wdg6QnbFHrFF;
        }
        SerialDescriptor OPXfSBeufaJ8 = OPXfSBeufaJ8(serialDescriptor.wdg6QnbFHrFF(0), ht0Var.lS5Rgt96tfkO);
        sj0 TSizfFm2Yiuu3 = OPXfSBeufaJ8.TSizfFm2Yiuu();
        if ((TSizfFm2Yiuu3 instanceof cq1) || cs0.wdg6QnbFHrFF(TSizfFm2Yiuu3, f42.e9gEMXR7LXtO)) {
            return fv2.x50lh2ztY7Y5;
        }
        String str = "Value of type '" + OPXfSBeufaJ8.lS5Rgt96tfkO() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + OPXfSBeufaJ8.TSizfFm2Yiuu() + '\'';
        OPXfSBeufaJ8.lS5Rgt96tfkO();
        throw new nt0(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final String xfACYKDMU6Dj(Collection collection) {
        return ja2.POWyO8hTM6YC(zk.ctD2u3GUHhtA(collection, ",", null, null, null, 62)).concat(ja2.POWyO8hTM6YC(" }"));
    }

    public static int yQRudnv4La6p(int i) {
        if (i == 1) {
            vh2.Companion.getClass();
            return 1;
        }
        if (i != 2) {
            vh2.Companion.getClass();
            return 0;
        }
        vh2.Companion.getClass();
        return 0;
    }

    public static final long zf8DYfih6EZu(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public Typeface cpQdD2nAriOS(Context context, List list) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public abstract Typeface dgRBjINgWbAK(Context context, jc0 jc0Var, Resources resources);

    public Typeface r3s1LDPKFs1S(Context context, Resources resources, String str) {
        File ozEBbv0hFTAB = xi0.ozEBbv0hFTAB(context);
        if (ozEBbv0hFTAB == null) {
            return null;
        }
        try {
            if (xi0.XL4ISE6Oc65B(ozEBbv0hFTAB, resources, R.font.roboto)) {
                return Typeface.createFromFile(ozEBbv0hFTAB.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            ozEBbv0hFTAB.delete();
        }
    }

    public abstract Typeface x50lh2ztY7Y5(Context context, zc0[] zc0VarArr);
}
