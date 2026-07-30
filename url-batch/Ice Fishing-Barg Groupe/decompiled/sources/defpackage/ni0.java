package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.ExtractedText;
import com.ice.fishing.grenza.R;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class ni0 {
    public static final /* synthetic */ int PxuCJdSBwIXG = 0;

    public static boolean BRwzKIf41E4i(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final int BjEWd04qc7Mw(float f, int i, int i2) {
        return i + ((int) Math.round((i2 - i) * f));
    }

    public static final int EcgxDIVH5in8(KSerializer kSerializer) {
        kSerializer.getClass();
        int hashCode = kSerializer.getDescriptor().lS5Rgt96tfkO().hashCode();
        int Y1f8riQaR6yg = kSerializer.getDescriptor().Y1f8riQaR6yg();
        for (int i = 0; i < Y1f8riQaR6yg; i++) {
            hashCode = (hashCode * 31) + kSerializer.getDescriptor().e9gEMXR7LXtO(i).hashCode();
        }
        return hashCode;
    }

    public static final long EpkonXwzFgDB(ao1 ao1Var, boolean z) {
        long Y1f8riQaR6yg = bf1.Y1f8riQaR6yg(ao1Var.TSizfFm2Yiuu, ao1Var.RAsUl2FVSrh6);
        if (z || !ao1Var.lS5Rgt96tfkO()) {
            return Y1f8riQaR6yg;
        }
        bf1.Companion.getClass();
        return 0L;
    }

    public static final c7 IAToe7bXGz4N(hp hpVar) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        xt2.Companion.getClass();
        return wt2.lS5Rgt96tfkO(hpVar).a92UlCVFR9N8;
    }

    public static final String IXK6ba3ucyzm(String str, String str2, String str3, String str4) {
        return "Route " + str3 + " could not find any NavType for argument " + str + " of type " + str2 + " - typeMap received was " + str4;
    }

    public static final long J54yh1s3n4Aq(t61 t61Var) {
        t61Var.getClass();
        int ordinal = t61Var.ordinal();
        if (ordinal == 0) {
            return mm2.Y1f8riQaR6yg(4284142792L);
        }
        if (ordinal == 1) {
            return mm2.Y1f8riQaR6yg(4294942240L);
        }
        if (ordinal == 2) {
            return mm2.Y1f8riQaR6yg(4294948941L);
        }
        if (ordinal == 3) {
            return mm2.Y1f8riQaR6yg(4294933099L);
        }
        if (ordinal == 4) {
            return mm2.Y1f8riQaR6yg(4280376929L);
        }
        if (ordinal == 5) {
            return mm2.Y1f8riQaR6yg(4287331574L);
        }
        u9.gPXPFXrUH4XX();
        return 0L;
    }

    public static final void JHNfcAUfKc4G(int i, String str, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i + ", but was '" + str.charAt(i) + '\'');
    }

    public static final boolean OPXfSBeufaJ8(ao1 ao1Var) {
        return (ao1Var.lS5Rgt96tfkO() || ao1Var.rtx2ld2ELZv4 || !ao1Var.Y1f8riQaR6yg) ? false : true;
    }

    public static final void POWyO8hTM6YC(Spannable spannable, p21 p21Var, int i, int i2) {
        if (p21Var != null) {
            ArrayList arrayList = new ArrayList(al.KZw9XyiywG4x(p21Var, 10));
            Iterator it = p21Var.rtx2ld2ELZv4.iterator();
            while (it.hasNext()) {
                arrayList.add(((n21) it.next()).PxuCJdSBwIXG);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static final void Pf0ThKz3j5YS(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(mm2.ngxnMNrpiKat(j)), i, i2, 33);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        if (r7 == r10) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c1, code lost:
    
        if (r12 == r10) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e1, code lost:
    
        if (r7 == r10) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0115, code lost:
    
        if (r13 == r10) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PxuCJdSBwIXG(final n61 n61Var, jz0 jz0Var, mi1 mi1Var, final z9 z9Var, nd ndVar, lw lwVar, boolean z, k3 k3Var, final le0 le0Var, hp hpVar, final int i) {
        final jz0 jz0Var2;
        final mi1 mi1Var2;
        final nd ndVar2;
        final lw lwVar2;
        final boolean z2;
        final k3 k3Var2;
        jz0 jz0Var3;
        k3 k3Var3;
        int i2;
        lw lwVar3;
        nd ndVar3;
        mi1 mi1Var3;
        k3 k3Var4;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(53695811);
        int i3 = i | (tf0Var.a92UlCVFR9N8(n61Var) ? 4 : 2) | 46861712 | (tf0Var.rtx2ld2ELZv4(le0Var) ? 536870912 : 268435456);
        boolean z3 = true;
        if (tf0Var.Pf0ThKz3j5YS(i3 & 1, (306783379 & i3) != 306783378)) {
            tf0Var.wLFCmsViZrNT();
            if ((i & 1) == 0 || tf0Var.pnx5pC0XzaCw()) {
                ez0 ez0Var = lz0.PxuCJdSBwIXG;
                gg1 gg1Var = mp.PxuCJdSBwIXG;
                Object[] objArr = new Object[0];
                jz0.Companion.getClass();
                cr1 cr1Var = jz0.ZbWwgt3aGe7A;
                boolean Y1f8riQaR6yg = tf0Var.Y1f8riQaR6yg(0) | tf0Var.Y1f8riQaR6yg(0);
                Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
                Object obj = fp.lS5Rgt96tfkO;
                if (!Y1f8riQaR6yg) {
                    hp.Companion.getClass();
                }
                nLZGh9p8gVSu = new kb(25);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
                jz0Var3 = (jz0) sj0.ryVscX7ZL4Ux(objArr, cr1Var, (ae0) nLZGh9p8gVSu, tf0Var, 0);
                oi1 oi1Var = new oi1(0.0f, 0.0f, 0.0f, 0.0f);
                s.Companion.getClass();
                float f = u82.PxuCJdSBwIXG;
                hy hyVar = (hy) tf0Var.wdg6QnbFHrFF(eq.rtx2ld2ELZv4);
                boolean TSizfFm2Yiuu = tf0Var.TSizfFm2Yiuu(hyVar.lS5Rgt96tfkO());
                Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
                if (!TSizfFm2Yiuu) {
                    hp.Companion.getClass();
                }
                nLZGh9p8gVSu2 = new bw(new b42(hyVar));
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
                bw bwVar = (bw) nLZGh9p8gVSu2;
                boolean a92UlCVFR9N8 = tf0Var.a92UlCVFR9N8(bwVar);
                Object nLZGh9p8gVSu3 = tf0Var.nLZGh9p8gVSu();
                if (!a92UlCVFR9N8) {
                    hp.Companion.getClass();
                }
                nLZGh9p8gVSu3 = new lw(bwVar);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu3);
                lw lwVar4 = (lw) nLZGh9p8gVSu3;
                fq fqVar = bi1.PxuCJdSBwIXG;
                tf0Var.IXK6ba3ucyzm(282942128);
                l3 l3Var = (l3) tf0Var.wdg6QnbFHrFF(bi1.PxuCJdSBwIXG);
                if (l3Var == null) {
                    tf0Var.gPXPFXrUH4XX(false);
                    k3Var3 = null;
                } else {
                    boolean a92UlCVFR9N82 = tf0Var.a92UlCVFR9N8(l3Var);
                    Object nLZGh9p8gVSu4 = tf0Var.nLZGh9p8gVSu();
                    if (!a92UlCVFR9N82) {
                        hp.Companion.getClass();
                    }
                    Object k3Var5 = new k3(l3Var.PxuCJdSBwIXG, l3Var.lS5Rgt96tfkO, l3Var.TSizfFm2Yiuu, l3Var.Y1f8riQaR6yg);
                    tf0Var.JTxCbbCwomzt(k3Var5);
                    nLZGh9p8gVSu4 = k3Var5;
                    k3Var3 = (k3) nLZGh9p8gVSu4;
                    tf0Var.gPXPFXrUH4XX(false);
                }
                i2 = i3 & (-238551153);
                lwVar3 = lwVar4;
                ndVar3 = r.cpQdD2nAriOS;
                mi1Var3 = oi1Var;
                k3Var4 = k3Var3;
            } else {
                tf0Var.i68hK7ahKtgp();
                i2 = i3 & (-238551153);
                jz0Var3 = jz0Var;
                mi1Var3 = mi1Var;
                ndVar3 = ndVar;
                lwVar3 = lwVar;
                z3 = z;
                k3Var4 = k3Var;
            }
            tf0Var.BRwzKIf41E4i();
            gg1 gg1Var2 = mp.PxuCJdSBwIXG;
            jh0.a92UlCVFR9N8(n61Var, jz0Var3, mi1Var3, lwVar3, z3, k3Var4, ndVar3, z9Var, le0Var, tf0Var, 806907264 | (i2 & 14), ((i2 >> 18) & 7168) | 6);
            jz0Var2 = jz0Var3;
            mi1Var2 = mi1Var3;
            lwVar2 = lwVar3;
            z2 = z3;
            k3Var2 = k3Var4;
            ndVar2 = ndVar3;
        } else {
            tf0Var.i68hK7ahKtgp();
            jz0Var2 = jz0Var;
            mi1Var2 = mi1Var;
            ndVar2 = ndVar;
            lwVar2 = lwVar;
            z2 = z;
            k3Var2 = k3Var;
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new pe0(jz0Var2, mi1Var2, z9Var, ndVar2, lwVar2, z2, k3Var2, le0Var, i) { // from class: px0
                public final /* synthetic */ jz0 OPXfSBeufaJ8;
                public final /* synthetic */ k3 QrzZRwfaDlRX;
                public final /* synthetic */ lw cpQdD2nAriOS;
                public final /* synthetic */ z9 dgRBjINgWbAK;
                public final /* synthetic */ le0 gPXPFXrUH4XX;
                public final /* synthetic */ boolean r3s1LDPKFs1S;
                public final /* synthetic */ mi1 wdg6QnbFHrFF;
                public final /* synthetic */ nd x50lh2ztY7Y5;

                @Override // defpackage.pe0
                public final Object rtx2ld2ELZv4(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int bEKsvqmvPh2y = ki0.bEKsvqmvPh2y(24577);
                    ni0.PxuCJdSBwIXG(n61.this, this.OPXfSBeufaJ8, this.wdg6QnbFHrFF, this.dgRBjINgWbAK, this.x50lh2ztY7Y5, this.cpQdD2nAriOS, this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, this.gPXPFXrUH4XX, (hp) obj2, bEKsvqmvPh2y);
                    return no2.PxuCJdSBwIXG;
                }
            };
        }
    }

    public static final lb1 QrzZRwfaDlRX(Context context) {
        context.getClass();
        lb1 lb1Var = new lb1(context);
        la1 la1Var = lb1Var.lS5Rgt96tfkO;
        vc1 vc1Var = la1Var.RfyTYNmI9Srp;
        vc1Var.PxuCJdSBwIXG(new co(vc1Var));
        vc1 vc1Var2 = la1Var.RfyTYNmI9Srp;
        vc1Var2.PxuCJdSBwIXG(new go());
        vc1Var2.PxuCJdSBwIXG(new wz());
        return lb1Var;
    }

    public static final ba2 RAsUl2FVSrh6(Decoder decoder) {
        decoder.getClass();
        ba2 ba2Var = decoder instanceof ba2 ? (ba2) decoder : null;
        if (ba2Var != null) {
            return ba2Var;
        }
        u9.S2OOm9zPNm0h(bu1.PxuCJdSBwIXG(decoder.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    public static final void RfyTYNmI9Srp(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = nj0.PxuCJdSBwIXG[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    public static final Rect S2OOm9zPNm0h(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int nextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i3, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    public static final String S9EYkSpbGuxq(Object obj, LinkedHashMap linkedHashMap) {
        obj.getClass();
        KSerializer serializer = SerializersKt.serializer(bu1.PxuCJdSBwIXG(obj.getClass()));
        Map KZw9XyiywG4x = new tx1(serializer, linkedHashMap).KZw9XyiywG4x(obj);
        e0 e0Var = new e0(serializer);
        ws wsVar = new ws(4, KZw9XyiywG4x, e0Var);
        int Y1f8riQaR6yg = serializer.getDescriptor().Y1f8riQaR6yg();
        for (int i = 0; i < Y1f8riQaR6yg; i++) {
            String e9gEMXR7LXtO = serializer.getDescriptor().e9gEMXR7LXtO(i);
            dc1 dc1Var = (dc1) linkedHashMap.get(e9gEMXR7LXtO);
            if (dc1Var == null) {
                rc1.e9gEMXR7LXtO(o0.dgRBjINgWbAK("Cannot locate NavType for argument [", e9gEMXR7LXtO, ']'));
                return null;
            }
            wsVar.a92UlCVFR9N8(Integer.valueOf(i), e9gEMXR7LXtO, dc1Var);
        }
        return ((String) e0Var.wdg6QnbFHrFF) + ((String) e0Var.dgRBjINgWbAK) + ((String) e0Var.x50lh2ztY7Y5);
    }

    public static final void TSizfFm2Yiuu(final String str, final le0 le0Var, final n61 n61Var, boolean z, final dj2 dj2Var, final pe0 pe0Var, wr2 wr2Var, fv0 fv0Var, bv0 bv0Var, int i, int i2, final z42 z42Var, final pf2 pf2Var, hp hpVar, final int i3) {
        final boolean z2;
        final wr2 wr2Var2;
        final fv0 fv0Var2;
        final bv0 bv0Var2;
        final int i4;
        final int i5;
        fv0 fv0Var3;
        wr2 wr2Var3;
        bv0 bv0Var3;
        int i6;
        boolean z3;
        int i7;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-154966360);
        int i8 = i3 | (tf0Var.a92UlCVFR9N8(str) ? 4 : 2) | (tf0Var.rtx2ld2ELZv4(le0Var) ? 32 : 16) | 27648 | (tf0Var.a92UlCVFR9N8(dj2Var) ? 131072 : 65536) | 907542528;
        if (tf0Var.Pf0ThKz3j5YS(i8 & 1, ((306783379 & i8) == 306783378 && (((tf0Var.a92UlCVFR9N8(pf2Var) ? (char) 256 : (char) 128) | '6') & 147) == 146) ? false : true)) {
            tf0Var.wLFCmsViZrNT();
            if ((i3 & 1) == 0 || tf0Var.pnx5pC0XzaCw()) {
                wr2.Companion.getClass();
                fv0.Companion.getClass();
                fv0 fv0Var4 = fv0.TSizfFm2Yiuu;
                bv0.Companion.getClass();
                fv0Var3 = fv0Var4;
                wr2Var3 = vr2.lS5Rgt96tfkO;
                bv0Var3 = bv0.PxuCJdSBwIXG;
                i6 = Integer.MAX_VALUE;
                z3 = true;
                i7 = 1;
            } else {
                tf0Var.i68hK7ahKtgp();
                z3 = z;
                wr2Var3 = wr2Var;
                fv0Var3 = fv0Var;
                bv0Var3 = bv0Var;
                i6 = i;
                i7 = i2;
            }
            tf0Var.BRwzKIf41E4i();
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            tf0Var.IXK6ba3ucyzm(488210003);
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            hp.Companion.getClass();
            if (nLZGh9p8gVSu == fp.lS5Rgt96tfkO) {
                nLZGh9p8gVSu = new e81();
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            }
            e81 e81Var = (e81) nLZGh9p8gVSu;
            tf0Var.gPXPFXrUH4XX(false);
            tf0Var.IXK6ba3ucyzm(1401227490);
            long lS5Rgt96tfkO = dj2Var.lS5Rgt96tfkO();
            if (lS5Rgt96tfkO == 16) {
                lS5Rgt96tfkO = !z3 ? pf2Var.TSizfFm2Yiuu : ((Boolean) mm2.e6tOsSdd2EFb(e81Var, tf0Var, 0).getValue()).booleanValue() ? pf2Var.PxuCJdSBwIXG : pf2Var.lS5Rgt96tfkO;
            }
            long j = lS5Rgt96tfkO;
            tf0Var.gPXPFXrUH4XX(false);
            zv.lS5Rgt96tfkO(xi2.PxuCJdSBwIXG.PxuCJdSBwIXG(pf2Var.dgRBjINgWbAK), bs0.kpCQ9veP6n3I(1459735400, new ig2(n61Var, pf2Var, str, le0Var, z3, dj2Var.Y1f8riQaR6yg(new dj2(j, 0L, null, null, 0L, 0, 0L, 16777214)), fv0Var3, bv0Var3, i6, i7, wr2Var3, e81Var, pe0Var, z42Var), tf0Var), tf0Var, 56);
            z2 = z3;
            fv0Var2 = fv0Var3;
            bv0Var2 = bv0Var3;
            i4 = i6;
            i5 = i7;
            wr2Var2 = wr2Var3;
        } else {
            tf0Var.i68hK7ahKtgp();
            z2 = z;
            wr2Var2 = wr2Var;
            fv0Var2 = fv0Var;
            bv0Var2 = bv0Var;
            i4 = i;
            i5 = i2;
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new pe0(str, le0Var, n61Var, z2, dj2Var, pe0Var, wr2Var2, fv0Var2, bv0Var2, i4, i5, z42Var, pf2Var, i3) { // from class: gg2
                public final /* synthetic */ int BRwzKIf41E4i;
                public final /* synthetic */ pf2 EcgxDIVH5in8;
                public final /* synthetic */ le0 OPXfSBeufaJ8;
                public final /* synthetic */ fv0 QrzZRwfaDlRX;
                public final /* synthetic */ z42 RfyTYNmI9Srp;
                public final /* synthetic */ int XL4ISE6Oc65B;
                public final /* synthetic */ pe0 cpQdD2nAriOS;
                public final /* synthetic */ boolean dgRBjINgWbAK;
                public final /* synthetic */ bv0 gPXPFXrUH4XX;
                public final /* synthetic */ wr2 r3s1LDPKFs1S;
                public final /* synthetic */ String rtx2ld2ELZv4;
                public final /* synthetic */ n61 wdg6QnbFHrFF;
                public final /* synthetic */ dj2 x50lh2ztY7Y5;

                @Override // defpackage.pe0
                public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int bEKsvqmvPh2y = ki0.bEKsvqmvPh2y(12583297);
                    ni0.TSizfFm2Yiuu(this.rtx2ld2ELZv4, this.OPXfSBeufaJ8, this.wdg6QnbFHrFF, this.dgRBjINgWbAK, this.x50lh2ztY7Y5, this.cpQdD2nAriOS, this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, this.gPXPFXrUH4XX, this.BRwzKIf41E4i, this.XL4ISE6Oc65B, this.RfyTYNmI9Srp, this.EcgxDIVH5in8, (hp) obj, bEKsvqmvPh2y);
                    return no2.PxuCJdSBwIXG;
                }
            };
        }
    }

    public static final long VhhvGxCb8gfr(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final float XL4ISE6Oc65B(float f) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
        float f2 = intBitsToFloat - ((intBitsToFloat - (f / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x01d6, code lost:
    
        if (r15 == r3) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x022d, code lost:
    
        if (defpackage.cs0.wdg6QnbFHrFF(r0.nLZGh9p8gVSu(), java.lang.Integer.valueOf(r9)) == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x04c6, code lost:
    
        if (r0.rtx2ld2ELZv4(r5) != false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x04dd, code lost:
    
        if (r6 == r3) goto L242;
     */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x051f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Y1f8riQaR6yg(final n61 n61Var, pe0 pe0Var, final pe0 pe0Var2, qe0 qe0Var, final pe0 pe0Var3, final pe0 pe0Var4, pe0 pe0Var5, final pe0 pe0Var6, final jg2 jg2Var, final cg2 cg2Var, final on onVar, pe0 pe0Var7, mi1 mi1Var, hp hpVar, final int i, final int i2) {
        int i3;
        int i4;
        final mi1 mi1Var2;
        pe0 pe0Var8;
        final pe0 pe0Var9;
        qe0 qe0Var2;
        pe0 pe0Var10;
        int i5;
        p7 p7Var;
        pe0 pe0Var11;
        float f;
        boolean z;
        cg2 cg2Var2;
        boolean z2;
        int S9EYkSpbGuxq;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-1086465551);
        if ((i & 6) == 0) {
            i3 = i | (tf0Var.a92UlCVFR9N8(n61Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tf0Var.rtx2ld2ELZv4(pe0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= tf0Var.rtx2ld2ELZv4(pe0Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= tf0Var.rtx2ld2ELZv4(qe0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= tf0Var.rtx2ld2ELZv4(pe0Var3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= tf0Var.rtx2ld2ELZv4(pe0Var4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= tf0Var.rtx2ld2ELZv4(pe0Var5) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= tf0Var.rtx2ld2ELZv4(pe0Var6) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= tf0Var.RAsUl2FVSrh6(false) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= tf0Var.a92UlCVFR9N8(jg2Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? tf0Var.a92UlCVFR9N8(cg2Var) : tf0Var.rtx2ld2ELZv4(cg2Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= tf0Var.rtx2ld2ELZv4(onVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= tf0Var.rtx2ld2ELZv4(pe0Var7) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            mi1Var2 = mi1Var;
            i4 |= tf0Var.a92UlCVFR9N8(mi1Var2) ? 2048 : 1024;
        } else {
            mi1Var2 = mi1Var;
        }
        int i6 = i4;
        if (tf0Var.Pf0ThKz3j5YS(i3 & 1, ((i3 & 306783379) == 306783378 && (i6 & 1171) == 1170) ? false : true)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            long j = ((en2) tf0Var.wdg6QnbFHrFF(fn2.PxuCJdSBwIXG)).x50lh2ztY7Y5.lS5Rgt96tfkO.TSizfFm2Yiuu;
            long j2 = nm2.x50lh2ztY7Y5;
            if ((j & 1095216660480L) != 4294967296L) {
                j = j2;
            }
            float xfACYKDMU6Dj = ((hy) tf0Var.wdg6QnbFHrFF(eq.rtx2ld2ELZv4)).xfACYKDMU6Dj(j) / 2.0f;
            int i7 = i6 & 14;
            boolean TSizfFm2Yiuu = ((i3 & 234881024) == 67108864) | ((i3 & 1879048192) == 536870912) | (i7 == 4 || ((i6 & 8) != 0 && tf0Var.a92UlCVFR9N8(cg2Var))) | ((i6 & 7168) == 2048) | tf0Var.TSizfFm2Yiuu(xfACYKDMU6Dj);
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            jx1 jx1Var = fp.lS5Rgt96tfkO;
            if (!TSizfFm2Yiuu) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu = new lg2(jg2Var, cg2Var, mi1Var2, xfACYKDMU6Dj);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            lg2 lg2Var = (lg2) nLZGh9p8gVSu;
            cw0 cw0Var = (cw0) tf0Var.wdg6QnbFHrFF(eq.r3s1LDPKFs1S);
            int S9EYkSpbGuxq2 = cs0.S9EYkSpbGuxq(tf0Var);
            il1 x50lh2ztY7Y5 = tf0Var.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj2 = ov2.xfACYKDMU6Dj(tf0Var, n61Var);
            yo.Companion.getClass();
            dq dqVar = xo.lS5Rgt96tfkO;
            tf0Var.ngxnMNrpiKat();
            if (tf0Var.zf8DYfih6EZu) {
                tf0Var.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var.hVNtCUZb4tYH();
            }
            p7 p7Var2 = xo.a92UlCVFR9N8;
            th0.tmVwIGCQF4zR(tf0Var, p7Var2, lg2Var);
            p7 p7Var3 = xo.e9gEMXR7LXtO;
            th0.tmVwIGCQF4zR(tf0Var, p7Var3, x50lh2ztY7Y5);
            p7 p7Var4 = xo.RAsUl2FVSrh6;
            if (tf0Var.zf8DYfih6EZu) {
                i5 = i7;
            } else {
                i5 = i7;
            }
            o0.RfyTYNmI9Srp(S9EYkSpbGuxq2, tf0Var, S9EYkSpbGuxq2, p7Var4);
            p7 p7Var5 = xo.Y1f8riQaR6yg;
            th0.tmVwIGCQF4zR(tf0Var, p7Var5, xfACYKDMU6Dj2);
            onVar.rtx2ld2ELZv4(tf0Var, Integer.valueOf((i6 >> 3) & 14));
            pd pdVar = r.a92UlCVFR9N8;
            if (pe0Var3 != null) {
                tf0Var.IXK6ba3ucyzm(-1445181094);
                n61 aF05bpZJlKEP = cs0.aF05bpZJlKEP(n61.Companion, "Leading");
                ak0 ak0Var = nr0.PxuCJdSBwIXG;
                n61 TSizfFm2Yiuu2 = aF05bpZJlKEP.TSizfFm2Yiuu(g61.PxuCJdSBwIXG);
                s.Companion.getClass();
                j51 Y1f8riQaR6yg = xe.Y1f8riQaR6yg(pdVar, false);
                int S9EYkSpbGuxq3 = cs0.S9EYkSpbGuxq(tf0Var);
                il1 x50lh2ztY7Y52 = tf0Var.x50lh2ztY7Y5();
                n61 xfACYKDMU6Dj3 = ov2.xfACYKDMU6Dj(tf0Var, TSizfFm2Yiuu2);
                tf0Var.ngxnMNrpiKat();
                if (tf0Var.zf8DYfih6EZu) {
                    tf0Var.dgRBjINgWbAK(dqVar);
                } else {
                    tf0Var.hVNtCUZb4tYH();
                }
                th0.tmVwIGCQF4zR(tf0Var, p7Var2, Y1f8riQaR6yg);
                th0.tmVwIGCQF4zR(tf0Var, p7Var3, x50lh2ztY7Y52);
                if (tf0Var.zf8DYfih6EZu || !cs0.wdg6QnbFHrFF(tf0Var.nLZGh9p8gVSu(), Integer.valueOf(S9EYkSpbGuxq3))) {
                    o0.RfyTYNmI9Srp(S9EYkSpbGuxq3, tf0Var, S9EYkSpbGuxq3, p7Var4);
                }
                th0.tmVwIGCQF4zR(tf0Var, p7Var5, xfACYKDMU6Dj3);
                pe0Var3.rtx2ld2ELZv4(tf0Var, Integer.valueOf((i3 >> 12) & 14));
                tf0Var.gPXPFXrUH4XX(true);
                p7Var = p7Var3;
                tf0Var.gPXPFXrUH4XX(false);
            } else {
                p7Var = p7Var3;
                tf0Var.IXK6ba3ucyzm(-1444935078);
                tf0Var.gPXPFXrUH4XX(false);
            }
            if (pe0Var4 != null) {
                tf0Var.IXK6ba3ucyzm(-1444892360);
                n61 aF05bpZJlKEP2 = cs0.aF05bpZJlKEP(n61.Companion, "Trailing");
                ak0 ak0Var2 = nr0.PxuCJdSBwIXG;
                n61 TSizfFm2Yiuu3 = aF05bpZJlKEP2.TSizfFm2Yiuu(g61.PxuCJdSBwIXG);
                s.Companion.getClass();
                j51 Y1f8riQaR6yg2 = xe.Y1f8riQaR6yg(pdVar, false);
                int S9EYkSpbGuxq4 = cs0.S9EYkSpbGuxq(tf0Var);
                il1 x50lh2ztY7Y53 = tf0Var.x50lh2ztY7Y5();
                n61 xfACYKDMU6Dj4 = ov2.xfACYKDMU6Dj(tf0Var, TSizfFm2Yiuu3);
                tf0Var.ngxnMNrpiKat();
                if (tf0Var.zf8DYfih6EZu) {
                    tf0Var.dgRBjINgWbAK(dqVar);
                } else {
                    tf0Var.hVNtCUZb4tYH();
                }
                th0.tmVwIGCQF4zR(tf0Var, p7Var2, Y1f8riQaR6yg2);
                th0.tmVwIGCQF4zR(tf0Var, p7Var, x50lh2ztY7Y53);
                if (tf0Var.zf8DYfih6EZu || !cs0.wdg6QnbFHrFF(tf0Var.nLZGh9p8gVSu(), Integer.valueOf(S9EYkSpbGuxq4))) {
                    o0.RfyTYNmI9Srp(S9EYkSpbGuxq4, tf0Var, S9EYkSpbGuxq4, p7Var4);
                }
                th0.tmVwIGCQF4zR(tf0Var, p7Var5, xfACYKDMU6Dj4);
                pe0Var4.rtx2ld2ELZv4(tf0Var, Integer.valueOf((i3 >> 15) & 14));
                tf0Var.gPXPFXrUH4XX(true);
                tf0Var.gPXPFXrUH4XX(false);
            } else {
                tf0Var.IXK6ba3ucyzm(-1444644422);
                tf0Var.gPXPFXrUH4XX(false);
            }
            cw0 cw0Var2 = cw0.rtx2ld2ELZv4;
            float PxuCJdSBwIXG2 = cw0Var == cw0Var2 ? mi1Var2.PxuCJdSBwIXG(cw0Var) : mi1Var2.lS5Rgt96tfkO(cw0Var);
            float lS5Rgt96tfkO = cw0Var == cw0Var2 ? mi1Var2.lS5Rgt96tfkO(cw0Var) : mi1Var2.PxuCJdSBwIXG(cw0Var);
            gg1 gg1Var2 = mp.PxuCJdSBwIXG;
            float f2 = ((k10) tf0Var.wdg6QnbFHrFF(nr0.TSizfFm2Yiuu)).rtx2ld2ELZv4;
            if (Float.isNaN(f2)) {
                f2 = 0.0f;
            }
            float f3 = (f2 - 24.0f) / 2.0f;
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (pe0Var3 != null) {
                PxuCJdSBwIXG2 -= f3;
                if (PxuCJdSBwIXG2 < 0.0f) {
                    PxuCJdSBwIXG2 = 0.0f;
                }
            }
            float f4 = PxuCJdSBwIXG2;
            if (pe0Var4 != null) {
                lS5Rgt96tfkO -= f3;
                if (lS5Rgt96tfkO < 0.0f) {
                    lS5Rgt96tfkO = 0.0f;
                }
            }
            pd pdVar2 = r.lS5Rgt96tfkO;
            if (pe0Var5 != null) {
                tf0Var.IXK6ba3ucyzm(-1443868027);
                n61 rZjpSjn4zoMv = f2.rZjpSjn4zoMv(c62.OPXfSBeufaJ8(c62.Y1f8riQaR6yg(cs0.aF05bpZJlKEP(n61.Companion, "Prefix"), 24.0f)), f4, 0.0f, 2.0f, 0.0f, 10);
                s.Companion.getClass();
                j51 Y1f8riQaR6yg3 = xe.Y1f8riQaR6yg(pdVar2, false);
                int S9EYkSpbGuxq5 = cs0.S9EYkSpbGuxq(tf0Var);
                il1 x50lh2ztY7Y54 = tf0Var.x50lh2ztY7Y5();
                n61 xfACYKDMU6Dj5 = ov2.xfACYKDMU6Dj(tf0Var, rZjpSjn4zoMv);
                tf0Var.ngxnMNrpiKat();
                if (tf0Var.zf8DYfih6EZu) {
                    tf0Var.dgRBjINgWbAK(dqVar);
                } else {
                    tf0Var.hVNtCUZb4tYH();
                }
                th0.tmVwIGCQF4zR(tf0Var, p7Var2, Y1f8riQaR6yg3);
                th0.tmVwIGCQF4zR(tf0Var, p7Var, x50lh2ztY7Y54);
                if (tf0Var.zf8DYfih6EZu || !cs0.wdg6QnbFHrFF(tf0Var.nLZGh9p8gVSu(), Integer.valueOf(S9EYkSpbGuxq5))) {
                    o0.RfyTYNmI9Srp(S9EYkSpbGuxq5, tf0Var, S9EYkSpbGuxq5, p7Var4);
                }
                th0.tmVwIGCQF4zR(tf0Var, p7Var5, xfACYKDMU6Dj5);
                pe0Var10 = pe0Var5;
                pe0Var10.rtx2ld2ELZv4(tf0Var, Integer.valueOf((i3 >> 18) & 14));
                tf0Var.gPXPFXrUH4XX(true);
                tf0Var.gPXPFXrUH4XX(false);
            } else {
                pe0Var10 = pe0Var5;
                tf0Var.IXK6ba3ucyzm(-1443540326);
                tf0Var.gPXPFXrUH4XX(false);
            }
            if (pe0Var6 != null) {
                tf0Var.IXK6ba3ucyzm(-1443497081);
                float f5 = lS5Rgt96tfkO;
                n61 rZjpSjn4zoMv2 = f2.rZjpSjn4zoMv(c62.OPXfSBeufaJ8(c62.Y1f8riQaR6yg(cs0.aF05bpZJlKEP(n61.Companion, "Suffix"), 24.0f)), 2.0f, 0.0f, f5, 0.0f, 10);
                f = f5;
                s.Companion.getClass();
                j51 Y1f8riQaR6yg4 = xe.Y1f8riQaR6yg(pdVar2, false);
                int S9EYkSpbGuxq6 = cs0.S9EYkSpbGuxq(tf0Var);
                il1 x50lh2ztY7Y55 = tf0Var.x50lh2ztY7Y5();
                n61 xfACYKDMU6Dj6 = ov2.xfACYKDMU6Dj(tf0Var, rZjpSjn4zoMv2);
                tf0Var.ngxnMNrpiKat();
                if (tf0Var.zf8DYfih6EZu) {
                    tf0Var.dgRBjINgWbAK(dqVar);
                } else {
                    tf0Var.hVNtCUZb4tYH();
                }
                th0.tmVwIGCQF4zR(tf0Var, p7Var2, Y1f8riQaR6yg4);
                th0.tmVwIGCQF4zR(tf0Var, p7Var, x50lh2ztY7Y55);
                if (tf0Var.zf8DYfih6EZu || !cs0.wdg6QnbFHrFF(tf0Var.nLZGh9p8gVSu(), Integer.valueOf(S9EYkSpbGuxq6))) {
                    o0.RfyTYNmI9Srp(S9EYkSpbGuxq6, tf0Var, S9EYkSpbGuxq6, p7Var4);
                }
                th0.tmVwIGCQF4zR(tf0Var, p7Var5, xfACYKDMU6Dj6);
                pe0Var11 = pe0Var6;
                pe0Var11.rtx2ld2ELZv4(tf0Var, Integer.valueOf((i3 >> 21) & 14));
                tf0Var.gPXPFXrUH4XX(true);
                tf0Var.gPXPFXrUH4XX(false);
            } else {
                pe0Var11 = pe0Var6;
                f = lS5Rgt96tfkO;
                tf0Var.IXK6ba3ucyzm(-1443171302);
                tf0Var.gPXPFXrUH4XX(false);
            }
            k61 k61Var = n61.Companion;
            n61 rZjpSjn4zoMv3 = f2.rZjpSjn4zoMv(k61Var, f4, 0.0f, f, 0.0f, 10);
            if (pe0Var2 != null) {
                tf0Var.IXK6ba3ucyzm(-1442671489);
                n61 aF05bpZJlKEP3 = cs0.aF05bpZJlKEP(k61Var, "Label");
                if (i5 != 4) {
                    if ((i6 & 8) != 0) {
                        cg2Var2 = cg2Var;
                    } else {
                        cg2Var2 = cg2Var;
                    }
                    z2 = false;
                    Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
                    if (!z2) {
                        hp.Companion.getClass();
                    }
                    nLZGh9p8gVSu2 = new uy1(15, cg2Var2);
                    tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
                    n61 TSizfFm2Yiuu4 = c62.OPXfSBeufaJ8(fx1.qudtW7lwm99e(aF05bpZJlKEP3, new ai(11, (ae0) nLZGh9p8gVSu2))).TSizfFm2Yiuu(rZjpSjn4zoMv3);
                    s.Companion.getClass();
                    j51 Y1f8riQaR6yg5 = xe.Y1f8riQaR6yg(pdVar2, false);
                    S9EYkSpbGuxq = cs0.S9EYkSpbGuxq(tf0Var);
                    il1 x50lh2ztY7Y56 = tf0Var.x50lh2ztY7Y5();
                    n61 xfACYKDMU6Dj7 = ov2.xfACYKDMU6Dj(tf0Var, TSizfFm2Yiuu4);
                    tf0Var.ngxnMNrpiKat();
                    if (tf0Var.zf8DYfih6EZu) {
                        tf0Var.hVNtCUZb4tYH();
                    } else {
                        tf0Var.dgRBjINgWbAK(dqVar);
                    }
                    th0.tmVwIGCQF4zR(tf0Var, p7Var2, Y1f8riQaR6yg5);
                    th0.tmVwIGCQF4zR(tf0Var, p7Var, x50lh2ztY7Y56);
                    if (!tf0Var.zf8DYfih6EZu || !cs0.wdg6QnbFHrFF(tf0Var.nLZGh9p8gVSu(), Integer.valueOf(S9EYkSpbGuxq))) {
                        o0.RfyTYNmI9Srp(S9EYkSpbGuxq, tf0Var, S9EYkSpbGuxq, p7Var4);
                    }
                    th0.tmVwIGCQF4zR(tf0Var, p7Var5, xfACYKDMU6Dj7);
                    pe0Var2.rtx2ld2ELZv4(tf0Var, Integer.valueOf((i3 >> 6) & 14));
                    tf0Var.gPXPFXrUH4XX(true);
                    tf0Var.gPXPFXrUH4XX(false);
                } else {
                    cg2Var2 = cg2Var;
                }
                z2 = true;
                Object nLZGh9p8gVSu22 = tf0Var.nLZGh9p8gVSu();
                if (!z2) {
                }
                nLZGh9p8gVSu22 = new uy1(15, cg2Var2);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu22);
                n61 TSizfFm2Yiuu42 = c62.OPXfSBeufaJ8(fx1.qudtW7lwm99e(aF05bpZJlKEP3, new ai(11, (ae0) nLZGh9p8gVSu22))).TSizfFm2Yiuu(rZjpSjn4zoMv3);
                s.Companion.getClass();
                j51 Y1f8riQaR6yg52 = xe.Y1f8riQaR6yg(pdVar2, false);
                S9EYkSpbGuxq = cs0.S9EYkSpbGuxq(tf0Var);
                il1 x50lh2ztY7Y562 = tf0Var.x50lh2ztY7Y5();
                n61 xfACYKDMU6Dj72 = ov2.xfACYKDMU6Dj(tf0Var, TSizfFm2Yiuu42);
                tf0Var.ngxnMNrpiKat();
                if (tf0Var.zf8DYfih6EZu) {
                }
                th0.tmVwIGCQF4zR(tf0Var, p7Var2, Y1f8riQaR6yg52);
                th0.tmVwIGCQF4zR(tf0Var, p7Var, x50lh2ztY7Y562);
                if (!tf0Var.zf8DYfih6EZu) {
                }
                o0.RfyTYNmI9Srp(S9EYkSpbGuxq, tf0Var, S9EYkSpbGuxq, p7Var4);
                th0.tmVwIGCQF4zR(tf0Var, p7Var5, xfACYKDMU6Dj72);
                pe0Var2.rtx2ld2ELZv4(tf0Var, Integer.valueOf((i3 >> 6) & 14));
                tf0Var.gPXPFXrUH4XX(true);
                tf0Var.gPXPFXrUH4XX(false);
            } else {
                tf0Var.IXK6ba3ucyzm(-1442276518);
                tf0Var.gPXPFXrUH4XX(false);
            }
            n61 rZjpSjn4zoMv4 = f2.rZjpSjn4zoMv(c62.OPXfSBeufaJ8(c62.Y1f8riQaR6yg(k61Var, 24.0f)), pe0Var10 == null ? f4 : 0.0f, 0.0f, pe0Var11 == null ? f : 0.0f, 0.0f, 10);
            if (qe0Var != null) {
                tf0Var.IXK6ba3ucyzm(-1441906533);
                qe0Var2 = qe0Var;
                qe0Var2.a92UlCVFR9N8(cs0.aF05bpZJlKEP(k61Var, "Hint").TSizfFm2Yiuu(rZjpSjn4zoMv4), tf0Var, Integer.valueOf((i3 >> 6) & 112));
                tf0Var.gPXPFXrUH4XX(false);
            } else {
                qe0Var2 = qe0Var;
                tf0Var.IXK6ba3ucyzm(-1441815238);
                tf0Var.gPXPFXrUH4XX(false);
            }
            n61 TSizfFm2Yiuu5 = cs0.aF05bpZJlKEP(k61Var, "TextField").TSizfFm2Yiuu(rZjpSjn4zoMv4);
            s.Companion.getClass();
            j51 Y1f8riQaR6yg6 = xe.Y1f8riQaR6yg(pdVar2, true);
            int S9EYkSpbGuxq7 = cs0.S9EYkSpbGuxq(tf0Var);
            il1 x50lh2ztY7Y57 = tf0Var.x50lh2ztY7Y5();
            n61 xfACYKDMU6Dj8 = ov2.xfACYKDMU6Dj(tf0Var, TSizfFm2Yiuu5);
            tf0Var.ngxnMNrpiKat();
            if (tf0Var.zf8DYfih6EZu) {
                tf0Var.dgRBjINgWbAK(dqVar);
            } else {
                tf0Var.hVNtCUZb4tYH();
            }
            th0.tmVwIGCQF4zR(tf0Var, p7Var2, Y1f8riQaR6yg6);
            th0.tmVwIGCQF4zR(tf0Var, p7Var, x50lh2ztY7Y57);
            if (tf0Var.zf8DYfih6EZu || !cs0.wdg6QnbFHrFF(tf0Var.nLZGh9p8gVSu(), Integer.valueOf(S9EYkSpbGuxq7))) {
                o0.RfyTYNmI9Srp(S9EYkSpbGuxq7, tf0Var, S9EYkSpbGuxq7, p7Var4);
            }
            th0.tmVwIGCQF4zR(tf0Var, p7Var5, xfACYKDMU6Dj8);
            pe0Var8 = pe0Var;
            pe0Var8.rtx2ld2ELZv4(tf0Var, Integer.valueOf((i3 >> 3) & 14));
            tf0Var.gPXPFXrUH4XX(true);
            if (pe0Var7 != null) {
                tf0Var.IXK6ba3ucyzm(-1441566587);
                n61 e6tOsSdd2EFb = f2.e6tOsSdd2EFb(c62.OPXfSBeufaJ8(c62.Y1f8riQaR6yg(cs0.aF05bpZJlKEP(k61Var, "Supporting"), 16.0f)), new oi1(16.0f, 4.0f, 16.0f, 0.0f));
                j51 Y1f8riQaR6yg7 = xe.Y1f8riQaR6yg(pdVar2, false);
                int S9EYkSpbGuxq8 = cs0.S9EYkSpbGuxq(tf0Var);
                il1 x50lh2ztY7Y58 = tf0Var.x50lh2ztY7Y5();
                n61 xfACYKDMU6Dj9 = ov2.xfACYKDMU6Dj(tf0Var, e6tOsSdd2EFb);
                tf0Var.ngxnMNrpiKat();
                if (tf0Var.zf8DYfih6EZu) {
                    tf0Var.dgRBjINgWbAK(dqVar);
                } else {
                    tf0Var.hVNtCUZb4tYH();
                }
                th0.tmVwIGCQF4zR(tf0Var, p7Var2, Y1f8riQaR6yg7);
                th0.tmVwIGCQF4zR(tf0Var, p7Var, x50lh2ztY7Y58);
                if (tf0Var.zf8DYfih6EZu || !cs0.wdg6QnbFHrFF(tf0Var.nLZGh9p8gVSu(), Integer.valueOf(S9EYkSpbGuxq8))) {
                    o0.RfyTYNmI9Srp(S9EYkSpbGuxq8, tf0Var, S9EYkSpbGuxq8, p7Var4);
                }
                th0.tmVwIGCQF4zR(tf0Var, p7Var5, xfACYKDMU6Dj9);
                pe0Var9 = pe0Var7;
                pe0Var9.rtx2ld2ELZv4(tf0Var, Integer.valueOf((i6 >> 6) & 14));
                z = true;
                tf0Var.gPXPFXrUH4XX(true);
                tf0Var.gPXPFXrUH4XX(false);
            } else {
                pe0Var9 = pe0Var7;
                z = true;
                tf0Var.IXK6ba3ucyzm(-1441177382);
                tf0Var.gPXPFXrUH4XX(false);
            }
            tf0Var.gPXPFXrUH4XX(z);
        } else {
            pe0Var8 = pe0Var;
            pe0Var9 = pe0Var7;
            qe0Var2 = qe0Var;
            pe0Var10 = pe0Var5;
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            final pe0 pe0Var12 = pe0Var8;
            final pe0 pe0Var13 = pe0Var10;
            final qe0 qe0Var3 = qe0Var2;
            XL4ISE6Oc65B.Y1f8riQaR6yg = new pe0() { // from class: fg2
                @Override // defpackage.pe0
                public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int bEKsvqmvPh2y = ki0.bEKsvqmvPh2y(i | 1);
                    int bEKsvqmvPh2y2 = ki0.bEKsvqmvPh2y(i2);
                    ni0.Y1f8riQaR6yg(n61.this, pe0Var12, pe0Var2, qe0Var3, pe0Var3, pe0Var4, pe0Var13, pe0Var6, jg2Var, cg2Var, onVar, pe0Var9, mi1Var2, (hp) obj, bEKsvqmvPh2y, bEKsvqmvPh2y2);
                    return no2.PxuCJdSBwIXG;
                }
            };
        }
    }

    public static final c7 ZbWwgt3aGe7A(hp hpVar) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        xt2.Companion.getClass();
        return wt2.lS5Rgt96tfkO(hpVar).e9gEMXR7LXtO;
    }

    public static final void a92UlCVFR9N8(Encoder encoder) {
        encoder.getClass();
        if ((encoder instanceof ca2 ? (ca2) encoder : null) != null) {
            return;
        }
        u9.S2OOm9zPNm0h(bu1.PxuCJdSBwIXG(encoder.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
    }

    public static final boolean aF05bpZJlKEP(ao1 ao1Var, long j, long j2) {
        int i = ao1Var.OPXfSBeufaJ8;
        ho1.Companion.getClass();
        int i2 = i == 1 ? 1 : 0;
        long j3 = ao1Var.TSizfFm2Yiuu;
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + intBitsToFloat3;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (intBitsToFloat > f2) | (intBitsToFloat < (-intBitsToFloat3)) | (intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat2 > ((int) (j & 4294967295L)) + intBitsToFloat4);
    }

    public static final void amuv7NJvPxHu(b7 b7Var, int i) {
        Object obj;
        Iterator<T> it = b7Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((vw0) ((Map.Entry) obj).getKey()).OPXfSBeufaJ8 == i) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || entry.getValue() == null) {
            return;
        }
        u9.VhhvGxCb8gfr();
    }

    public static final void bEKsvqmvPh2y(d32 d32Var, int i, i02 i02Var) {
        d32 d32Var2;
        f91 f91Var = new f91(new d32[16]);
        List OPXfSBeufaJ8 = d32Var.OPXfSBeufaJ8(false, false);
        while (true) {
            f91Var.Y1f8riQaR6yg(f91Var.wdg6QnbFHrFF, OPXfSBeufaJ8);
            while (true) {
                int i2 = f91Var.wdg6QnbFHrFF;
                if (i2 == 0) {
                    return;
                }
                d32Var2 = (d32) f91Var.dgRBjINgWbAK(i2 - 1);
                boolean ZbWwgt3aGe7A = bs0.ZbWwgt3aGe7A(d32Var2);
                z22 z22Var = d32Var2.Y1f8riQaR6yg;
                v81 v81Var = z22Var.rtx2ld2ELZv4;
                if (!ZbWwgt3aGe7A && !v81Var.TSizfFm2Yiuu(h32.wdg6QnbFHrFF)) {
                    pd1 Y1f8riQaR6yg = d32Var2.Y1f8riQaR6yg();
                    if (Y1f8riQaR6yg == null) {
                        throw o0.a92UlCVFR9N8("Expected semantics node to have a coordinator.");
                    }
                    dr0 wLFCmsViZrNT = xi0.wLFCmsViZrNT(kj0.wdg6QnbFHrFF(Y1f8riQaR6yg, true));
                    if (wLFCmsViZrNT.PxuCJdSBwIXG < wLFCmsViZrNT.TSizfFm2Yiuu && wLFCmsViZrNT.lS5Rgt96tfkO < wLFCmsViZrNT.Y1f8riQaR6yg) {
                        Object RAsUl2FVSrh6 = z22Var.rtx2ld2ELZv4.RAsUl2FVSrh6(y22.e9gEMXR7LXtO);
                        if (RAsUl2FVSrh6 == null) {
                            RAsUl2FVSrh6 = null;
                        }
                        pe0 pe0Var = (pe0) RAsUl2FVSrh6;
                        Object RAsUl2FVSrh62 = v81Var.RAsUl2FVSrh6(h32.S2OOm9zPNm0h);
                        h02 h02Var = (h02) (RAsUl2FVSrh62 != null ? RAsUl2FVSrh62 : null);
                        if (pe0Var != null && h02Var != null && ((Number) h02Var.lS5Rgt96tfkO.PxuCJdSBwIXG()).floatValue() > 0.0f) {
                            int i3 = 1 + i;
                            i02Var.OPXfSBeufaJ8(new j02(d32Var2, i3, wLFCmsViZrNT, Y1f8riQaR6yg));
                            bEKsvqmvPh2y(d32Var2, i3, i02Var);
                        }
                    }
                }
            }
            OPXfSBeufaJ8 = d32Var2.OPXfSBeufaJ8(false, false);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        if (r8 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final dc1 cpQdD2nAriOS(SerialDescriptor serialDescriptor, Map map) {
        Object obj;
        dc1 dc1Var;
        boolean equals;
        Iterator it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ju0 ju0Var = (ju0) obj;
            serialDescriptor.getClass();
            ju0Var.getClass();
            if (serialDescriptor.rtx2ld2ELZv4() != ((mu0) ju0Var).TSizfFm2Yiuu()) {
                equals = false;
            } else {
                KSerializer TSizfFm2Yiuu = SerializersKt.TSizfFm2Yiuu(cs0.jJwa0q7P5wHq, ju0Var);
                if (TSizfFm2Yiuu == null) {
                    u9.wdg6QnbFHrFF("Cannot find KSerializer for [", serialDescriptor.lS5Rgt96tfkO(), "]. If applicable, custom KSerializers for custom and third-party KType is currently not supported when declared directly on a class field via @Serializable(with = ...). Please use @Serializable or @Serializable(with = ...) on the class or object declaration.");
                    return null;
                }
                equals = serialDescriptor.equals(TSizfFm2Yiuu.getDescriptor());
            }
            if (equals) {
                break;
            }
        }
        ju0 ju0Var2 = (ju0) obj;
        dc1 dc1Var2 = ju0Var2 != null ? (dc1) map.get(ju0Var2) : null;
        if (dc1Var2 == null) {
            dc1Var2 = null;
        }
        ao2 ao2Var = ao2.XL4ISE6Oc65B;
        if (dc1Var2 == null) {
            serialDescriptor.getClass();
            switch (kj0.Pf0ThKz3j5YS(serialDescriptor).ordinal()) {
                case 0:
                    dc1Var = dc1.lS5Rgt96tfkO;
                    dc1Var2 = dc1Var;
                    break;
                case 1:
                    dc1Var = mm2.RAsUl2FVSrh6;
                    dc1Var2 = dc1Var;
                    break;
                case 2:
                    dc1Var = dc1.dgRBjINgWbAK;
                    dc1Var2 = dc1Var;
                    break;
                case 3:
                    dc1Var = mm2.rtx2ld2ELZv4;
                    dc1Var2 = dc1Var;
                    break;
                case 4:
                    dc1Var = mm2.OPXfSBeufaJ8;
                    dc1Var2 = dc1Var;
                    break;
                case 5:
                    dc1Var = mm2.wdg6QnbFHrFF;
                    dc1Var2 = dc1Var;
                    break;
                case 6:
                    dc1Var = dc1.rtx2ld2ELZv4;
                    dc1Var2 = dc1Var;
                    break;
                case 7:
                    dc1Var = mm2.dgRBjINgWbAK;
                    dc1Var2 = dc1Var;
                    break;
                case 8:
                    dc1Var = dc1.e9gEMXR7LXtO;
                    dc1Var2 = dc1Var;
                    break;
                case 9:
                    dc1Var = mm2.x50lh2ztY7Y5;
                    dc1Var2 = dc1Var;
                    break;
                case 10:
                    dc1Var = mm2.cpQdD2nAriOS;
                    dc1Var2 = dc1Var;
                    break;
                case 11:
                    dc1Var = dc1.r3s1LDPKFs1S;
                    dc1Var2 = dc1Var;
                    break;
                case 12:
                    dc1Var = dc1.TSizfFm2Yiuu;
                    dc1Var2 = dc1Var;
                    break;
                case 13:
                    dc1Var = dc1.x50lh2ztY7Y5;
                    dc1Var2 = dc1Var;
                    break;
                case 14:
                    dc1Var = mm2.gPXPFXrUH4XX;
                    dc1Var2 = dc1Var;
                    break;
                case 15:
                    dc1Var = dc1.OPXfSBeufaJ8;
                    dc1Var2 = dc1Var;
                    break;
                case 16:
                    dc1Var = dc1.a92UlCVFR9N8;
                    dc1Var2 = dc1Var;
                    break;
                case 17:
                    int ordinal = kj0.Pf0ThKz3j5YS(serialDescriptor.wdg6QnbFHrFF(0)).ordinal();
                    if (ordinal != 10) {
                        if (ordinal == 11) {
                            dc1Var = mm2.r3s1LDPKFs1S;
                        }
                        dc1Var2 = ao2Var;
                        break;
                    } else {
                        dc1Var = dc1.QrzZRwfaDlRX;
                    }
                    dc1Var2 = dc1Var;
                    break;
                case 18:
                    int ordinal2 = kj0.Pf0ThKz3j5YS(serialDescriptor.wdg6QnbFHrFF(0)).ordinal();
                    if (ordinal2 == 0) {
                        dc1Var = dc1.Y1f8riQaR6yg;
                    } else if (ordinal2 == 2) {
                        dc1Var = dc1.cpQdD2nAriOS;
                    } else if (ordinal2 == 4) {
                        dc1Var = mm2.BRwzKIf41E4i;
                    } else if (ordinal2 == 6) {
                        dc1Var = dc1.wdg6QnbFHrFF;
                    } else if (ordinal2 == 8) {
                        dc1Var = dc1.RAsUl2FVSrh6;
                    } else if (ordinal2 == 19) {
                        dc1Var2 = new qr0(sj0.pnx5pC0XzaCw(serialDescriptor.wdg6QnbFHrFF(0)));
                        break;
                    } else if (ordinal2 != 10) {
                        if (ordinal2 == 11) {
                            dc1Var = mm2.QrzZRwfaDlRX;
                        }
                        dc1Var2 = ao2Var;
                        break;
                    } else {
                        dc1Var = dc1.gPXPFXrUH4XX;
                    }
                    dc1Var2 = dc1Var;
                    break;
                case 19:
                    zb1 zb1Var = dc1.Companion;
                    Class pnx5pC0XzaCw = sj0.pnx5pC0XzaCw(serialDescriptor);
                    zb1Var.getClass();
                    if (!Parcelable.class.isAssignableFrom(pnx5pC0XzaCw)) {
                        if (!Enum.class.isAssignableFrom(pnx5pC0XzaCw)) {
                            if (!Serializable.class.isAssignableFrom(pnx5pC0XzaCw)) {
                                dc1Var2 = null;
                                break;
                            } else {
                                dc1Var2 = new cc1(pnx5pC0XzaCw);
                                break;
                            }
                        } else {
                            dc1Var2 = new ac1(pnx5pC0XzaCw);
                            break;
                        }
                    } else {
                        dc1Var2 = new bc1(pnx5pC0XzaCw);
                        break;
                    }
                case 20:
                    Class pnx5pC0XzaCw2 = sj0.pnx5pC0XzaCw(serialDescriptor);
                    if (Enum.class.isAssignableFrom(pnx5pC0XzaCw2)) {
                        dc1Var2 = new rr0(pnx5pC0XzaCw2);
                        break;
                    }
                    dc1Var2 = ao2Var;
                    break;
                default:
                    dc1Var2 = ao2Var;
                    break;
            }
        }
        if (dc1Var2.equals(ao2Var)) {
            return null;
        }
        return dc1Var2;
    }

    public static final boolean dgRBjINgWbAK(ao1 ao1Var) {
        return (ao1Var.lS5Rgt96tfkO() || !ao1Var.rtx2ld2ELZv4 || ao1Var.Y1f8riQaR6yg) ? false : true;
    }

    public static final ji2 e6tOsSdd2EFb(z22 z22Var) {
        le0 le0Var;
        ArrayList arrayList = new ArrayList();
        Object RAsUl2FVSrh6 = z22Var.rtx2ld2ELZv4.RAsUl2FVSrh6(y22.PxuCJdSBwIXG);
        if (RAsUl2FVSrh6 == null) {
            RAsUl2FVSrh6 = null;
        }
        nxJAScVArhE9 nxjascvarhe9 = (nxJAScVArhE9) RAsUl2FVSrh6;
        if (nxjascvarhe9 == null || (le0Var = (le0) nxjascvarhe9.lS5Rgt96tfkO) == null || !((Boolean) le0Var.OPXfSBeufaJ8(arrayList)).booleanValue()) {
            return null;
        }
        return (ji2) arrayList.get(0);
    }

    public static final ExtractedText e9gEMXR7LXtO(oh2 oh2Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = oh2Var.PxuCJdSBwIXG.OPXfSBeufaJ8;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = oh2Var.lS5Rgt96tfkO;
        extractedText.selectionStart = vi2.a92UlCVFR9N8(j);
        extractedText.selectionEnd = vi2.e9gEMXR7LXtO(j);
        extractedText.flags = !ia2.D0aTLcX6Uhyo(oh2Var.PxuCJdSBwIXG.OPXfSBeufaJ8, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final void gGoUzNp9JO5I(Spannable spannable, long j, hy hyVar, int i, int i2) {
        long lS5Rgt96tfkO = hj2.lS5Rgt96tfkO(j);
        jj2.Companion.getClass();
        if (jj2.PxuCJdSBwIXG(lS5Rgt96tfkO, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(b51.IXK6ba3ucyzm(hyVar.qudtW7lwm99e(j)), false), i, i2, 33);
        } else if (jj2.PxuCJdSBwIXG(lS5Rgt96tfkO, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(hj2.TSizfFm2Yiuu(j)), i, i2, 33);
        }
    }

    public static final long gPXPFXrUH4XX() {
        return Thread.currentThread().getId();
    }

    public static final long i68hK7ahKtgp(String str, long j, long j2, long j3) {
        String str2;
        int i = yc2.PxuCJdSBwIXG;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long qudtW7lwm99e = pa2.qudtW7lwm99e(str2);
        if (qudtW7lwm99e == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = qudtW7lwm99e.longValue();
        if (j2 <= longValue && longValue <= j3) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
    }

    public static boolean jyegZNwi31qc(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static final boolean kpCQ9veP6n3I(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return cs0.wdg6QnbFHrFF(serialDescriptor.TSizfFm2Yiuu(), wa2.e9gEMXR7LXtO) && serialDescriptor.a92UlCVFR9N8() && serialDescriptor.Y1f8riQaR6yg() == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r5 == r7) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void lS5Rgt96tfkO(final boolean z, final pe0 pe0Var, hp hpVar, final int i) {
        int i2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-642000585);
        if ((i & 6) == 0) {
            i2 = (tf0Var.RAsUl2FVSrh6(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(pe0Var) ? 32 : 16;
        }
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 19) != 18)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            Object PxuCJdSBwIXG2 = g21.PxuCJdSBwIXG(tf0Var);
            if (PxuCJdSBwIXG2 == null) {
                tf0Var.IXK6ba3ucyzm(1512740606);
                PxuCJdSBwIXG2 = h21.PxuCJdSBwIXG(tf0Var);
            } else {
                tf0Var.IXK6ba3ucyzm(1512737723);
            }
            tf0Var.gPXPFXrUH4XX(false);
            if (PxuCJdSBwIXG2 == null) {
                u9.rtx2ld2ELZv4("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean a92UlCVFR9N8 = tf0Var.a92UlCVFR9N8(PxuCJdSBwIXG2);
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            Object obj = fp.lS5Rgt96tfkO;
            if (!a92UlCVFR9N8) {
                hp.Companion.getClass();
            }
            ic1 ic1Var = PxuCJdSBwIXG2 instanceof ic1 ? (ic1) PxuCJdSBwIXG2 : null;
            hc1 PxuCJdSBwIXG3 = ic1Var != null ? ic1Var.PxuCJdSBwIXG() : null;
            vf1 vf1Var = PxuCJdSBwIXG2 instanceof vf1 ? (vf1) PxuCJdSBwIXG2 : null;
            nLZGh9p8gVSu = new cc(PxuCJdSBwIXG3, vf1Var != null ? vf1Var.lS5Rgt96tfkO() : null);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            Object obj2 = (cc) nLZGh9p8gVSu;
            Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
            hp.Companion.getClass();
            if (nLZGh9p8gVSu2 == obj) {
                nLZGh9p8gVSu2 = mm2.kpCQ9veP6n3I(tf0Var);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
            }
            ru ruVar = (ru) nLZGh9p8gVSu2;
            long j = tf0Var.wLFCmsViZrNT;
            boolean a92UlCVFR9N82 = tf0Var.a92UlCVFR9N8(obj2) | tf0Var.e9gEMXR7LXtO(j);
            Object nLZGh9p8gVSu3 = tf0Var.nLZGh9p8gVSu();
            if (a92UlCVFR9N82 || nLZGh9p8gVSu3 == obj) {
                nLZGh9p8gVSu3 = new mo(ruVar, new jp1(j, PxuCJdSBwIXG2));
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu3);
            }
            mo moVar = (mo) nLZGh9p8gVSu3;
            tf0Var.IXK6ba3ucyzm(-348514256);
            boolean rtx2ld2ELZv4 = tf0Var.rtx2ld2ELZv4(moVar) | tf0Var.rtx2ld2ELZv4(pe0Var);
            Object nLZGh9p8gVSu4 = tf0Var.nLZGh9p8gVSu();
            if (rtx2ld2ELZv4 || nLZGh9p8gVSu4 == obj) {
                nLZGh9p8gVSu4 = new e6(20, moVar, pe0Var);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu4);
            }
            mm2.r3s1LDPKFs1S((ae0) nLZGh9p8gVSu4, tf0Var);
            Boolean valueOf = Boolean.valueOf(z);
            int i3 = i2 & 14;
            boolean rtx2ld2ELZv42 = tf0Var.rtx2ld2ELZv4(moVar) | (i3 == 4);
            Object nLZGh9p8gVSu5 = tf0Var.nLZGh9p8gVSu();
            if (rtx2ld2ELZv42 || nLZGh9p8gVSu5 == obj) {
                nLZGh9p8gVSu5 = new kp1(moVar, z);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu5);
            }
            vi0.lS5Rgt96tfkO(valueOf, moVar, null, (le0) nLZGh9p8gVSu5, tf0Var, i3);
            boolean rtx2ld2ELZv43 = tf0Var.rtx2ld2ELZv4(obj2) | tf0Var.rtx2ld2ELZv4(moVar);
            Object nLZGh9p8gVSu6 = tf0Var.nLZGh9p8gVSu();
            if (rtx2ld2ELZv43 || nLZGh9p8gVSu6 == obj) {
                nLZGh9p8gVSu6 = new e9gEMXR7LXtO(25, obj2, moVar);
                tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu6);
            }
            mm2.OPXfSBeufaJ8(obj2, moVar, (le0) nLZGh9p8gVSu6, tf0Var);
            tf0Var.gPXPFXrUH4XX(false);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new pe0() { // from class: lp1
                @Override // defpackage.pe0
                public final Object rtx2ld2ELZv4(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int bEKsvqmvPh2y = ki0.bEKsvqmvPh2y(i | 1);
                    ni0.lS5Rgt96tfkO(z, pe0Var, (hp) obj3, bEKsvqmvPh2y);
                    return no2.PxuCJdSBwIXG;
                }
            };
        }
    }

    public static final yy1 nLZGh9p8gVSu(hp hpVar) {
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.IXK6ba3ucyzm(1967007413);
        Object[] objArr = new Object[0];
        yy1.Companion.getClass();
        Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
        hp.Companion.getClass();
        if (nLZGh9p8gVSu == fp.lS5Rgt96tfkO) {
            nLZGh9p8gVSu = new j21(10);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
        }
        yy1 yy1Var = (yy1) sj0.ryVscX7ZL4Ux(objArr, yy1.x50lh2ztY7Y5, (ae0) nLZGh9p8gVSu, tf0Var, 384);
        yy1Var.wdg6QnbFHrFF = (zy1) tf0Var.wdg6QnbFHrFF(bz1.PxuCJdSBwIXG);
        tf0Var.gPXPFXrUH4XX(false);
        return yy1Var;
    }

    public static final qt1 nxJAScVArhE9(long j) {
        bf1.Companion.getClass();
        return xi0.PxuCJdSBwIXG(0L, j);
    }

    public static void ozEBbv0hFTAB(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }

    public static final ViewParent pnx5pC0XzaCw(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static Handler r3s1LDPKFs1S(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return k00.PxuCJdSBwIXG(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final float rZjpSjn4zoMv(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final void rtx2ld2ELZv4(dr2 dr2Var, cr1 cr1Var, s01 s01Var) {
        cr1Var.getClass();
        s01Var.getClass();
        fz1 fz1Var = (fz1) dr2Var.TSizfFm2Yiuu("androidx.lifecycle.savedstate.vm.tag");
        if (fz1Var == null || fz1Var.wdg6QnbFHrFF) {
            return;
        }
        fz1Var.gPXPFXrUH4XX(s01Var, cr1Var);
        f01 f01Var = s01Var.rtx2ld2ELZv4;
        if (f01Var == f01.OPXfSBeufaJ8 || f01Var.compareTo(f01.dgRBjINgWbAK) >= 0) {
            cr1Var.dgRBjINgWbAK();
        } else {
            s01Var.PxuCJdSBwIXG(new ww(s01Var, cr1Var));
        }
    }

    public static final float ryVscX7ZL4Ux(long j, float f, hy hyVar) {
        float TSizfFm2Yiuu;
        long lS5Rgt96tfkO = hj2.lS5Rgt96tfkO(j);
        jj2.Companion.getClass();
        if (jj2.PxuCJdSBwIXG(lS5Rgt96tfkO, 4294967296L)) {
            if (hyVar.r3s1LDPKFs1S() <= 1.05d) {
                return hyVar.qudtW7lwm99e(j);
            }
            TSizfFm2Yiuu = hj2.TSizfFm2Yiuu(j) / hj2.TSizfFm2Yiuu(hyVar.uVlwi32qvXeJ(f));
        } else {
            if (!jj2.PxuCJdSBwIXG(lS5Rgt96tfkO, 8589934592L)) {
                return Float.NaN;
            }
            TSizfFm2Yiuu = hj2.TSizfFm2Yiuu(j);
        }
        return TSizfFm2Yiuu * f;
    }

    public static void tmVwIGCQF4zR(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", str);
        }
    }

    public static final aq0 wLFCmsViZrNT(wp0 wp0Var) {
        return new aq0(wp0Var.PxuCJdSBwIXG, wp0Var.lS5Rgt96tfkO, wp0Var.TSizfFm2Yiuu, wp0Var.Y1f8riQaR6yg);
    }

    public static final boolean wdg6QnbFHrFF(ao1 ao1Var) {
        return !ao1Var.rtx2ld2ELZv4 && ao1Var.Y1f8riQaR6yg;
    }

    public static final boolean x50lh2ztY7Y5(ao1 ao1Var) {
        return ao1Var.rtx2ld2ELZv4 && !ao1Var.Y1f8riQaR6yg;
    }

    public static final String xbgXKYA2cIfu(int i) {
        ww1.Companion.getClass();
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final int xfACYKDMU6Dj(String str, int i) {
        char charAt = str.charAt(i);
        return (charAt << 7) + str.charAt(i + 1);
    }

    public static int zf8DYfih6EZu(int i, int i2, String str) {
        return (int) i68hK7ahKtgp(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }
}
