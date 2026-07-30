package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.text.LineBreakConfig;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.ice.fishing.grenza.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class xi0 {
    public static final String BRwzKIf41E4i(ht0 ht0Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        ht0Var.getClass();
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof kt0) {
                return ((kt0) annotation).discriminator();
            }
        }
        return "type";
    }

    public static final long BjEWd04qc7Mw(yz0 yz0Var, qt1 qt1Var, int i) {
        ki2 Y1f8riQaR6yg = yz0Var.Y1f8riQaR6yg();
        r71 r71Var = Y1f8riQaR6yg != null ? Y1f8riQaR6yg.PxuCJdSBwIXG.lS5Rgt96tfkO : null;
        bw0 TSizfFm2Yiuu = yz0Var.TSizfFm2Yiuu();
        if (r71Var == null || TSizfFm2Yiuu == null) {
            vi2.Companion.getClass();
            return vi2.lS5Rgt96tfkO;
        }
        bf1.Companion.getClass();
        return r71Var.rtx2ld2ELZv4(qt1Var.OPXfSBeufaJ8(TSizfFm2Yiuu.S2OOm9zPNm0h(0L)), i, wh2.TSizfFm2Yiuu);
    }

    public static StaticLayout EcgxDIVH5in8(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        if (i2 < 0) {
            fp0.PxuCJdSBwIXG("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            fp0.PxuCJdSBwIXG("invalid end value");
        }
        if (i3 < 0) {
            fp0.PxuCJdSBwIXG("invalid maxLines value");
        }
        if (i < 0) {
            fp0.PxuCJdSBwIXG("invalid width value");
        }
        if (i4 < 0) {
            fp0.PxuCJdSBwIXG("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i3);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i4);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(z);
        obtain.setBreakStrategy(i6);
        obtain.setHyphenationFrequency(i9);
        obtain.setIndents(null, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            obtain.setJustificationMode(i5);
        }
        if (i10 >= 28) {
            obtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i10 >= 33) {
            lineBreakStyle = uy1Qfkdvj4xZ.PxuCJdSBwIXG().setLineBreakStyle(i7);
            lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i8);
            build = lineBreakWordStyle.build();
            obtain.setLineBreakConfig(build);
        }
        if (i10 >= 35) {
            obtain.setUseBoundsForWidth(false);
        }
        return obtain.build();
    }

    public static final boolean EpkonXwzFgDB(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final qz1 IAToe7bXGz4N(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            qz1 qz1Var = tag instanceof qz1 ? (qz1) tag : null;
            if (qz1Var != null) {
                return qz1Var;
            }
            Object pnx5pC0XzaCw = ni0.pnx5pC0XzaCw(view);
            view = pnx5pC0XzaCw instanceof View ? (View) pnx5pC0XzaCw : null;
        }
        return null;
    }

    public static final void IXK6ba3ucyzm(List list, yj1 yj1Var) {
        int i;
        Path path;
        int i2;
        float f;
        int i3;
        xk1 xk1Var;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        List list2 = list;
        r4 r4Var = (r4) yj1Var;
        Path path2 = r4Var.PxuCJdSBwIXG;
        Path path3 = r4Var.PxuCJdSBwIXG;
        if (path2.getFillType() == Path.FillType.EVEN_ODD) {
            bk1.Companion.getClass();
            i = 1;
        } else {
            bk1.Companion.getClass();
            i = 0;
        }
        path3.rewind();
        r4Var.RAsUl2FVSrh6(i);
        xk1 xk1Var2 = list2.isEmpty() ? fk1.TSizfFm2Yiuu : (xk1) list2.get(0);
        int size = list2.size();
        float f10 = 0.0f;
        int i4 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (i4 < size) {
            xk1 xk1Var3 = (xk1) list2.get(i4);
            if (xk1Var3 instanceof fk1) {
                path3.close();
                path = path3;
                i2 = size;
                f = f10;
                i3 = i4;
                xk1Var = xk1Var3;
                f11 = f15;
                f13 = f11;
                f12 = f16;
                f14 = f12;
            } else {
                if (xk1Var3 instanceof rk1) {
                    rk1 rk1Var = (rk1) xk1Var3;
                    float f17 = rk1Var.TSizfFm2Yiuu;
                    f13 += f17;
                    float f18 = rk1Var.Y1f8riQaR6yg;
                    f14 += f18;
                    path3.rMoveTo(f17, f18);
                    path = path3;
                    i2 = size;
                    f = f10;
                    i3 = i4;
                    f15 = f13;
                    f16 = f14;
                } else {
                    if (xk1Var3 instanceof jk1) {
                        jk1 jk1Var = (jk1) xk1Var3;
                        float f19 = jk1Var.TSizfFm2Yiuu;
                        float f20 = jk1Var.Y1f8riQaR6yg;
                        path3.moveTo(f19, f20);
                        f14 = f20;
                        f16 = f14;
                        path = path3;
                        f13 = f19;
                        f15 = f13;
                    } else {
                        if (xk1Var3 instanceof qk1) {
                            qk1 qk1Var = (qk1) xk1Var3;
                            float f21 = qk1Var.Y1f8riQaR6yg;
                            float f22 = qk1Var.TSizfFm2Yiuu;
                            path3.rLineTo(f22, f21);
                            f13 += f22;
                            f14 += f21;
                        } else if (xk1Var3 instanceof ik1) {
                            ik1 ik1Var = (ik1) xk1Var3;
                            float f23 = ik1Var.Y1f8riQaR6yg;
                            float f24 = ik1Var.TSizfFm2Yiuu;
                            path3.lineTo(f24, f23);
                            f13 = f24;
                            path = path3;
                            f14 = f23;
                        } else if (xk1Var3 instanceof pk1) {
                            float f25 = ((pk1) xk1Var3).TSizfFm2Yiuu;
                            path3.rLineTo(f25, f10);
                            f13 += f25;
                        } else if (xk1Var3 instanceof hk1) {
                            float f26 = ((hk1) xk1Var3).TSizfFm2Yiuu;
                            path3.lineTo(f26, f14);
                            f13 = f26;
                        } else {
                            if (xk1Var3 instanceof vk1) {
                                f9 = ((vk1) xk1Var3).TSizfFm2Yiuu;
                                path3.rLineTo(f10, f9);
                            } else if (xk1Var3 instanceof wk1) {
                                float f27 = ((wk1) xk1Var3).TSizfFm2Yiuu;
                                path3.lineTo(f13, f27);
                                f14 = f27;
                            } else if (xk1Var3 instanceof ok1) {
                                ok1 ok1Var = (ok1) xk1Var3;
                                path3.rCubicTo(ok1Var.TSizfFm2Yiuu, ok1Var.Y1f8riQaR6yg, ok1Var.e9gEMXR7LXtO, ok1Var.a92UlCVFR9N8, ok1Var.RAsUl2FVSrh6, ok1Var.rtx2ld2ELZv4);
                                f11 = ok1Var.e9gEMXR7LXtO + f13;
                                f12 = ok1Var.a92UlCVFR9N8 + f14;
                                f13 += ok1Var.RAsUl2FVSrh6;
                                f9 = ok1Var.rtx2ld2ELZv4;
                            } else {
                                if (xk1Var3 instanceof gk1) {
                                    gk1 gk1Var = (gk1) xk1Var3;
                                    path3.cubicTo(gk1Var.TSizfFm2Yiuu, gk1Var.Y1f8riQaR6yg, gk1Var.e9gEMXR7LXtO, gk1Var.a92UlCVFR9N8, gk1Var.RAsUl2FVSrh6, gk1Var.rtx2ld2ELZv4);
                                    f11 = gk1Var.e9gEMXR7LXtO;
                                    f12 = gk1Var.a92UlCVFR9N8;
                                    f5 = gk1Var.RAsUl2FVSrh6;
                                    f6 = gk1Var.rtx2ld2ELZv4;
                                } else if (xk1Var3 instanceof tk1) {
                                    if (xk1Var2.PxuCJdSBwIXG) {
                                        f8 = f14 - f12;
                                        f7 = f13 - f11;
                                    } else {
                                        f7 = f10;
                                        f8 = f7;
                                    }
                                    tk1 tk1Var = (tk1) xk1Var3;
                                    path3.rCubicTo(f7, f8, tk1Var.TSizfFm2Yiuu, tk1Var.Y1f8riQaR6yg, tk1Var.e9gEMXR7LXtO, tk1Var.a92UlCVFR9N8);
                                    f11 = tk1Var.TSizfFm2Yiuu + f13;
                                    f12 = tk1Var.Y1f8riQaR6yg + f14;
                                    f13 += tk1Var.e9gEMXR7LXtO;
                                    f9 = tk1Var.a92UlCVFR9N8;
                                } else if (xk1Var3 instanceof lk1) {
                                    if (xk1Var2.PxuCJdSBwIXG) {
                                        f13 = (f13 * 2.0f) - f11;
                                        f14 = (2.0f * f14) - f12;
                                    }
                                    lk1 lk1Var = (lk1) xk1Var3;
                                    path3.cubicTo(f13, f14, lk1Var.TSizfFm2Yiuu, lk1Var.Y1f8riQaR6yg, lk1Var.e9gEMXR7LXtO, lk1Var.a92UlCVFR9N8);
                                    f11 = lk1Var.TSizfFm2Yiuu;
                                    f12 = lk1Var.Y1f8riQaR6yg;
                                    f5 = lk1Var.e9gEMXR7LXtO;
                                    f6 = lk1Var.a92UlCVFR9N8;
                                } else if (xk1Var3 instanceof sk1) {
                                    sk1 sk1Var = (sk1) xk1Var3;
                                    float f28 = sk1Var.a92UlCVFR9N8;
                                    float f29 = sk1Var.e9gEMXR7LXtO;
                                    float f30 = sk1Var.Y1f8riQaR6yg;
                                    float f31 = sk1Var.TSizfFm2Yiuu;
                                    path3.rQuadTo(f31, f30, f29, f28);
                                    float f32 = f31 + f13;
                                    float f33 = f30 + f14;
                                    f13 += f29;
                                    f14 += f28;
                                    f11 = f32;
                                    path = path3;
                                    f12 = f33;
                                } else {
                                    if (xk1Var3 instanceof kk1) {
                                        kk1 kk1Var = (kk1) xk1Var3;
                                        float f34 = kk1Var.a92UlCVFR9N8;
                                        float f35 = kk1Var.e9gEMXR7LXtO;
                                        float f36 = kk1Var.Y1f8riQaR6yg;
                                        f4 = kk1Var.TSizfFm2Yiuu;
                                        path3.quadTo(f4, f36, f35, f34);
                                        path = path3;
                                        f14 = f34;
                                        f13 = f35;
                                        f12 = f36;
                                    } else if (xk1Var3 instanceof uk1) {
                                        if (xk1Var2.lS5Rgt96tfkO) {
                                            f2 = f13 - f11;
                                            f3 = f14 - f12;
                                        } else {
                                            f2 = f10;
                                            f3 = f2;
                                        }
                                        uk1 uk1Var = (uk1) xk1Var3;
                                        float f37 = uk1Var.Y1f8riQaR6yg;
                                        float f38 = uk1Var.TSizfFm2Yiuu;
                                        path3.rQuadTo(f2, f3, f38, f37);
                                        f4 = f2 + f13;
                                        float f39 = f3 + f14;
                                        f13 += f38;
                                        f14 += f37;
                                        path = path3;
                                        f12 = f39;
                                    } else if (xk1Var3 instanceof mk1) {
                                        if (xk1Var2.lS5Rgt96tfkO) {
                                            f13 = (f13 * 2.0f) - f11;
                                            f14 = (2.0f * f14) - f12;
                                        }
                                        mk1 mk1Var = (mk1) xk1Var3;
                                        float f40 = mk1Var.Y1f8riQaR6yg;
                                        float f41 = mk1Var.TSizfFm2Yiuu;
                                        path3.quadTo(f13, f14, f41, f40);
                                        path = path3;
                                        i2 = size;
                                        f = f10;
                                        i3 = i4;
                                        f12 = f14;
                                        xk1Var = xk1Var3;
                                        f14 = f40;
                                        f11 = f13;
                                        f13 = f41;
                                    } else if (xk1Var3 instanceof nk1) {
                                        nk1 nk1Var = (nk1) xk1Var3;
                                        float f42 = nk1Var.rtx2ld2ELZv4 + f13;
                                        float f43 = nk1Var.OPXfSBeufaJ8 + f14;
                                        path = path3;
                                        i3 = i4;
                                        f = 0.0f;
                                        i2 = size;
                                        r4Var = r4Var;
                                        S2OOm9zPNm0h(r4Var, f13, f14, f42, f43, nk1Var.TSizfFm2Yiuu, nk1Var.Y1f8riQaR6yg, nk1Var.e9gEMXR7LXtO, nk1Var.a92UlCVFR9N8, nk1Var.RAsUl2FVSrh6);
                                        f11 = f42;
                                        f13 = f11;
                                        f12 = f43;
                                        f14 = f12;
                                        xk1Var = xk1Var3;
                                    } else {
                                        path = path3;
                                        i2 = size;
                                        f = f10;
                                        i3 = i4;
                                        if (!(xk1Var3 instanceof ek1)) {
                                            u9.gPXPFXrUH4XX();
                                            return;
                                        }
                                        ek1 ek1Var = (ek1) xk1Var3;
                                        float f44 = ek1Var.OPXfSBeufaJ8;
                                        float f45 = ek1Var.rtx2ld2ELZv4;
                                        xk1Var = xk1Var3;
                                        r4Var = r4Var;
                                        S2OOm9zPNm0h(r4Var, f13, f14, f45, f44, ek1Var.TSizfFm2Yiuu, ek1Var.Y1f8riQaR6yg, ek1Var.e9gEMXR7LXtO, ek1Var.a92UlCVFR9N8, ek1Var.RAsUl2FVSrh6);
                                        f12 = f44;
                                        f14 = f12;
                                        f11 = f45;
                                        f13 = f11;
                                    }
                                    i2 = size;
                                    f = f10;
                                    i3 = i4;
                                    xk1Var = xk1Var3;
                                    f11 = f4;
                                }
                                f14 = f6;
                                path = path3;
                                f13 = f5;
                            }
                            f14 += f9;
                        }
                        path = path3;
                    }
                    i2 = size;
                    f = f10;
                    i3 = i4;
                }
                xk1Var = xk1Var3;
            }
            i4 = i3 + 1;
            list2 = list;
            path3 = path;
            size = i2;
            xk1Var2 = xk1Var;
            f10 = f;
        }
    }

    public static final boolean J54yh1s3n4Aq(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final Object JHNfcAUfKc4G(ct ctVar) {
        Object obj;
        hu e9gEMXR7LXtO = ctVar.e9gEMXR7LXtO();
        ki0.ZbWwgt3aGe7A(e9gEMXR7LXtO);
        bt IAToe7bXGz4N = ng0.IAToe7bXGz4N(ctVar);
        e00 e00Var = IAToe7bXGz4N instanceof e00 ? (e00) IAToe7bXGz4N : null;
        Object obj2 = su.rtx2ld2ELZv4;
        Object obj3 = no2.PxuCJdSBwIXG;
        if (e00Var == null) {
            obj = obj3;
        } else {
            ju juVar = e00Var.dgRBjINgWbAK;
            if (juVar.POWyO8hTM6YC(e9gEMXR7LXtO)) {
                e00Var.cpQdD2nAriOS = obj3;
                e00Var.wdg6QnbFHrFF = 1;
                juVar.gGoUzNp9JO5I(e9gEMXR7LXtO, e00Var);
            } else {
                hu RfyTYNmI9Srp = e9gEMXR7LXtO.RfyTYNmI9Srp(new hv2(hv2.OPXfSBeufaJ8));
                e00Var.cpQdD2nAriOS = obj3;
                e00Var.wdg6QnbFHrFF = 1;
                juVar.gGoUzNp9JO5I(RfyTYNmI9Srp, e00Var);
            }
            obj = obj2;
        }
        return obj == obj2 ? obj : obj3;
    }

    public static final long OPXfSBeufaJ8(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean POWyO8hTM6YC(ab0 ab0Var, l7 l7Var) {
        ab0[] ab0VarArr = new ab0[16];
        if (!ab0Var.rtx2ld2ELZv4.S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("visitChildren called on an unattached node");
        }
        f91 f91Var = new f91(new m61[16]);
        m61 m61Var = ab0Var.rtx2ld2ELZv4;
        m61 m61Var2 = m61Var.cpQdD2nAriOS;
        if (m61Var2 == null) {
            zv.OPXfSBeufaJ8(f91Var, m61Var);
        } else {
            f91Var.lS5Rgt96tfkO(m61Var2);
        }
        int i = 0;
        while (true) {
            int i2 = f91Var.wdg6QnbFHrFF;
            if (i2 == 0) {
                break;
            }
            m61 m61Var3 = (m61) f91Var.dgRBjINgWbAK(i2 - 1);
            if ((m61Var3.dgRBjINgWbAK & 1024) == 0) {
                zv.OPXfSBeufaJ8(f91Var, m61Var3);
            } else {
                while (true) {
                    if (m61Var3 == null) {
                        break;
                    }
                    if ((m61Var3.wdg6QnbFHrFF & 1024) != 0) {
                        f91 f91Var2 = null;
                        while (m61Var3 != null) {
                            if (m61Var3 instanceof ab0) {
                                ab0 ab0Var2 = (ab0) m61Var3;
                                int i3 = i + 1;
                                if (ab0VarArr.length < i3) {
                                    int length = ab0VarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(ab0VarArr, 0, r10, 0, length);
                                    ab0VarArr = r10;
                                }
                                ab0VarArr[i] = ab0Var2;
                                i = i3;
                            } else if ((m61Var3.wdg6QnbFHrFF & 1024) != 0 && (m61Var3 instanceof ux)) {
                                int i4 = 0;
                                for (m61 m61Var4 = ((ux) m61Var3).S2OOm9zPNm0h; m61Var4 != null; m61Var4 = m61Var4.cpQdD2nAriOS) {
                                    if ((m61Var4.wdg6QnbFHrFF & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            m61Var3 = m61Var4;
                                        } else {
                                            if (f91Var2 == null) {
                                                f91Var2 = new f91(new m61[16]);
                                            }
                                            if (m61Var3 != null) {
                                                f91Var2.lS5Rgt96tfkO(m61Var3);
                                                m61Var3 = null;
                                            }
                                            f91Var2.lS5Rgt96tfkO(m61Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            m61Var3 = zv.dgRBjINgWbAK(f91Var2);
                        }
                    } else {
                        m61Var3 = m61Var3.cpQdD2nAriOS;
                    }
                }
            }
        }
        Arrays.sort(ab0VarArr, 0, i, db0.lS5Rgt96tfkO);
        int i5 = i - 1;
        if (i5 < ab0VarArr.length) {
            while (i5 >= 0) {
                ab0 ab0Var3 = ab0VarArr[i5];
                if (zv.BjEWd04qc7Mw(ab0Var3) && cpQdD2nAriOS(ab0Var3, l7Var)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    public static MappedByteBuffer Pf0ThKz3j5YS(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static final qt1 PxuCJdSBwIXG(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new qt1(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final boolean RAsUl2FVSrh6(ji2 ji2Var, int i) {
        r71 r71Var = ji2Var.lS5Rgt96tfkO;
        int Y1f8riQaR6yg = r71Var.Y1f8riQaR6yg(i);
        return i == ji2Var.a92UlCVFR9N8(Y1f8riQaR6yg) || i == r71Var.TSizfFm2Yiuu(Y1f8riQaR6yg, false) ? ji2Var.RAsUl2FVSrh6(i) != ji2Var.PxuCJdSBwIXG(i) : ji2Var.PxuCJdSBwIXG(i) != ji2Var.PxuCJdSBwIXG(i - 1);
    }

    public static boolean RfyTYNmI9Srp(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static final void S2OOm9zPNm0h(yj1 yj1Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double cos = Math.cos(d11);
        double sin = Math.sin(d11);
        double d12 = ((d2 * sin) + (d * cos)) / d10;
        double d13 = ((d2 * cos) + ((-d) * sin)) / d6;
        double d14 = ((d4 * sin) + (d3 * cos)) / d10;
        double d15 = ((d4 * cos) + ((-d3) * sin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d20) / 1.99999d);
            S2OOm9zPNm0h(yj1Var, d, d2, d3, d4, d10 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d21);
        double d22 = d16 * sqrt2;
        double d23 = sqrt2 * d17;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double atan2 = Math.atan2(d13 - d9, d12 - d8);
        double atan22 = Math.atan2(d15 - d9, d14 - d8) - atan2;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d24 = d8 * d10;
        double d25 = d9 * d6;
        double d26 = (d24 * cos) - (d25 * sin);
        double d27 = (d25 * cos) + (d24 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(d11);
        double sin2 = Math.sin(d11);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d28 = -d10;
        double d29 = d28 * cos2;
        double d30 = d6 * sin2;
        double d31 = (d29 * sin3) - (d30 * cos3);
        double d32 = d28 * sin2;
        double d33 = d6 * cos2;
        double d34 = (cos3 * d33) + (sin3 * d32);
        double d35 = atan22 / ceil;
        double d36 = atan2;
        double d37 = d31;
        int i = 0;
        double d38 = d34;
        double d39 = d2;
        while (i < ceil) {
            double d40 = d36 + d35;
            double sin4 = Math.sin(d40);
            double cos4 = Math.cos(d40);
            int i2 = ceil;
            double d41 = (((d10 * cos2) * cos4) + d26) - (d30 * sin4);
            double d42 = (d33 * sin4) + (d10 * sin2 * cos4) + d27;
            double d43 = (d29 * sin4) - (d30 * cos4);
            double d44 = (cos4 * d33) + (sin4 * d32);
            double d45 = d40 - d36;
            double tan = Math.tan(d45 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            ((r4) yj1Var).PxuCJdSBwIXG.cubicTo((float) ((d37 * sqrt3) + d), (float) ((d38 * sqrt3) + d39), (float) (d41 - (sqrt3 * d43)), (float) (d42 - (sqrt3 * d44)), (float) d41, (float) d42);
            d35 = d35;
            sin2 = sin2;
            d26 = d26;
            d = d41;
            i++;
            d32 = d32;
            d36 = d40;
            d38 = d44;
            d37 = d43;
            ceil = i2;
            d39 = d42;
            d10 = d5;
        }
    }

    public static final void S9EYkSpbGuxq(di0 di0Var, np2 np2Var) {
        List list = np2Var.BRwzKIf41E4i;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            pp2 pp2Var = (pp2) list.get(i);
            if (pp2Var instanceof rp2) {
                zj1 zj1Var = new zj1();
                rp2 rp2Var = (rp2) pp2Var;
                zj1Var.Y1f8riQaR6yg = rp2Var.OPXfSBeufaJ8;
                zj1Var.r3s1LDPKFs1S = true;
                zj1Var.TSizfFm2Yiuu();
                zj1Var.RfyTYNmI9Srp.RAsUl2FVSrh6(rp2Var.wdg6QnbFHrFF);
                zj1Var.TSizfFm2Yiuu();
                zj1Var.TSizfFm2Yiuu();
                zj1Var.lS5Rgt96tfkO = rp2Var.dgRBjINgWbAK;
                zj1Var.TSizfFm2Yiuu();
                zj1Var.TSizfFm2Yiuu = rp2Var.x50lh2ztY7Y5;
                zj1Var.TSizfFm2Yiuu();
                zj1Var.RAsUl2FVSrh6 = rp2Var.cpQdD2nAriOS;
                zj1Var.TSizfFm2Yiuu();
                zj1Var.e9gEMXR7LXtO = rp2Var.r3s1LDPKFs1S;
                zj1Var.TSizfFm2Yiuu();
                zj1Var.a92UlCVFR9N8 = rp2Var.QrzZRwfaDlRX;
                zj1Var.QrzZRwfaDlRX = true;
                zj1Var.TSizfFm2Yiuu();
                zj1Var.rtx2ld2ELZv4 = rp2Var.gPXPFXrUH4XX;
                zj1Var.QrzZRwfaDlRX = true;
                zj1Var.TSizfFm2Yiuu();
                zj1Var.OPXfSBeufaJ8 = rp2Var.BRwzKIf41E4i;
                zj1Var.QrzZRwfaDlRX = true;
                zj1Var.TSizfFm2Yiuu();
                zj1Var.wdg6QnbFHrFF = rp2Var.XL4ISE6Oc65B;
                zj1Var.QrzZRwfaDlRX = true;
                zj1Var.TSizfFm2Yiuu();
                zj1Var.dgRBjINgWbAK = rp2Var.RfyTYNmI9Srp;
                zj1Var.gPXPFXrUH4XX = true;
                zj1Var.TSizfFm2Yiuu();
                zj1Var.x50lh2ztY7Y5 = rp2Var.EcgxDIVH5in8;
                zj1Var.gPXPFXrUH4XX = true;
                zj1Var.TSizfFm2Yiuu();
                zj1Var.cpQdD2nAriOS = rp2Var.S9EYkSpbGuxq;
                zj1Var.gPXPFXrUH4XX = true;
                zj1Var.TSizfFm2Yiuu();
                di0Var.e9gEMXR7LXtO(i, zj1Var);
            } else if (pp2Var instanceof np2) {
                di0 di0Var2 = new di0();
                np2 np2Var2 = (np2) pp2Var;
                di0Var2.dgRBjINgWbAK = np2Var2.rtx2ld2ELZv4;
                di0Var2.TSizfFm2Yiuu();
                di0Var2.x50lh2ztY7Y5 = np2Var2.OPXfSBeufaJ8;
                di0Var2.RfyTYNmI9Srp = true;
                di0Var2.TSizfFm2Yiuu();
                di0Var2.QrzZRwfaDlRX = np2Var2.x50lh2ztY7Y5;
                di0Var2.RfyTYNmI9Srp = true;
                di0Var2.TSizfFm2Yiuu();
                di0Var2.gPXPFXrUH4XX = np2Var2.cpQdD2nAriOS;
                di0Var2.RfyTYNmI9Srp = true;
                di0Var2.TSizfFm2Yiuu();
                di0Var2.BRwzKIf41E4i = np2Var2.r3s1LDPKFs1S;
                di0Var2.RfyTYNmI9Srp = true;
                di0Var2.TSizfFm2Yiuu();
                di0Var2.XL4ISE6Oc65B = np2Var2.QrzZRwfaDlRX;
                di0Var2.RfyTYNmI9Srp = true;
                di0Var2.TSizfFm2Yiuu();
                di0Var2.cpQdD2nAriOS = np2Var2.wdg6QnbFHrFF;
                di0Var2.RfyTYNmI9Srp = true;
                di0Var2.TSizfFm2Yiuu();
                di0Var2.r3s1LDPKFs1S = np2Var2.dgRBjINgWbAK;
                di0Var2.RfyTYNmI9Srp = true;
                di0Var2.TSizfFm2Yiuu();
                di0Var2.a92UlCVFR9N8 = np2Var2.gPXPFXrUH4XX;
                di0Var2.RAsUl2FVSrh6 = true;
                di0Var2.TSizfFm2Yiuu();
                S9EYkSpbGuxq(di0Var2, np2Var2);
                di0Var.e9gEMXR7LXtO(i, di0Var2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        if (r9 == r12) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
    
        if (r3 == r12) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0130, code lost:
    
        if (r7 == r12) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TSizfFm2Yiuu(boolean z, iv1 iv1Var, eh2 eh2Var, hp hpVar, int i) {
        int i2;
        ki2 Y1f8riQaR6yg;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-1344558920);
        if ((i & 6) == 0) {
            i2 = (tf0Var.RAsUl2FVSrh6(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tf0Var.Y1f8riQaR6yg(iv1Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(eh2Var) ? 256 : 128;
        }
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 147) != 146)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            int i3 = i2 & 14;
            boolean a92UlCVFR9N8 = (i3 == 4) | tf0Var.a92UlCVFR9N8(eh2Var);
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            jx1 jx1Var = fp.lS5Rgt96tfkO;
            if (!a92UlCVFR9N8) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu = new ah2(eh2Var, z);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            of2 of2Var = (of2) nLZGh9p8gVSu;
            boolean rtx2ld2ELZv4 = (i3 == 4) | tf0Var.rtx2ld2ELZv4(eh2Var);
            Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
            if (!rtx2ld2ELZv4) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu2 = new fh2(eh2Var, z);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
            ef1 ef1Var = (ef1) nLZGh9p8gVSu2;
            boolean RAsUl2FVSrh6 = vi2.RAsUl2FVSrh6(eh2Var.r3s1LDPKFs1S().lS5Rgt96tfkO);
            int i4 = (int) (z ? eh2Var.r3s1LDPKFs1S().lS5Rgt96tfkO >> 32 : eh2Var.r3s1LDPKFs1S().lS5Rgt96tfkO & 4294967295L);
            yz0 yz0Var = eh2Var.Y1f8riQaR6yg;
            float f = 0.0f;
            if (yz0Var != null && (Y1f8riQaR6yg = yz0Var.Y1f8riQaR6yg()) != null) {
                ji2 ji2Var = Y1f8riQaR6yg.PxuCJdSBwIXG;
                if (i4 >= 0) {
                    ii2 ii2Var = ji2Var.PxuCJdSBwIXG;
                    r71 r71Var = ji2Var.lS5Rgt96tfkO;
                    if (ii2Var.PxuCJdSBwIXG.OPXfSBeufaJ8.length() != 0) {
                        int min = Math.min(r71Var.Y1f8riQaR6yg(i4), Math.min(r71Var.lS5Rgt96tfkO - 1, r71Var.a92UlCVFR9N8 - 1));
                        if (i4 <= r71Var.TSizfFm2Yiuu(min, false)) {
                            r71Var.x50lh2ztY7Y5(min);
                            ArrayList arrayList = r71Var.rtx2ld2ELZv4;
                            xi1 xi1Var = (xi1) arrayList.get(kj0.BRwzKIf41E4i(min, arrayList));
                            m4 m4Var = xi1Var.PxuCJdSBwIXG;
                            int i5 = min - xi1Var.Y1f8riQaR6yg;
                            hi2 hi2Var = m4Var.Y1f8riQaR6yg;
                            f = hi2Var.e9gEMXR7LXtO(i5) - hi2Var.rtx2ld2ELZv4(i5);
                        }
                    }
                }
            }
            float f2 = f;
            k61 k61Var = n61.Companion;
            boolean rtx2ld2ELZv42 = tf0Var.rtx2ld2ELZv4(of2Var);
            Object nLZGh9p8gVSu3 = tf0Var.nLZGh9p8gVSu();
            if (!rtx2ld2ELZv42) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu3 = new j3(6, of2Var);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu3);
            zv.a92UlCVFR9N8(ef1Var, z, iv1Var, RAsUl2FVSrh6, 0L, f2, lc2.PxuCJdSBwIXG(k61Var, of2Var, (PointerInputEventHandler) nLZGh9p8gVSu3), tf0Var, (i2 << 3) & 1008);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new x5(z, iv1Var, eh2Var, i);
        }
    }

    public static final long VhhvGxCb8gfr() {
        return Thread.currentThread().getId();
    }

    public static boolean XL4ISE6Oc65B(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean RfyTYNmI9Srp = RfyTYNmI9Srp(file, inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return RfyTYNmI9Srp;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static final h22 Y1f8riQaR6yg(w52 w52Var, pe peVar) {
        dv PxuCJdSBwIXG = w52Var.PxuCJdSBwIXG();
        of0 of0Var = w52Var.TSizfFm2Yiuu;
        boolean z = PxuCJdSBwIXG == dv.rtx2ld2ELZv4;
        return new h22(x50lh2ztY7Y5(of0Var, z, true, peVar), x50lh2ztY7Y5(of0Var, z, false, peVar), z);
    }

    public static final boolean ZbWwgt3aGe7A(ab0 ab0Var, l7 l7Var) {
        int ordinal = ab0Var.FT2GK7JK5Ma2().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ab0 EcgxDIVH5in8 = zv.EcgxDIVH5in8(ab0Var);
                if (EcgxDIVH5in8 == null) {
                    u9.rtx2ld2ELZv4("ActiveParent must have a focusedChild");
                    return false;
                }
                if (!ZbWwgt3aGe7A(EcgxDIVH5in8, l7Var)) {
                    ga0.Companion.getClass();
                    if (!pnx5pC0XzaCw(ab0Var, EcgxDIVH5in8, 1, l7Var)) {
                        return false;
                    }
                }
                return true;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return ab0Var.fkblLSN2bAgv().PxuCJdSBwIXG ? ((Boolean) l7Var.OPXfSBeufaJ8(ab0Var)).booleanValue() : i68hK7ahKtgp(ab0Var, l7Var);
                }
                u9.gPXPFXrUH4XX();
                return false;
            }
        }
        return i68hK7ahKtgp(ab0Var, l7Var);
    }

    public static final long a92UlCVFR9N8(yz0 yz0Var, qt1 qt1Var, qt1 qt1Var2, int i) {
        long BjEWd04qc7Mw = BjEWd04qc7Mw(yz0Var, qt1Var, i);
        if (vi2.TSizfFm2Yiuu(BjEWd04qc7Mw)) {
            vi2.Companion.getClass();
            return vi2.lS5Rgt96tfkO;
        }
        long BjEWd04qc7Mw2 = BjEWd04qc7Mw(yz0Var, qt1Var2, i);
        if (vi2.TSizfFm2Yiuu(BjEWd04qc7Mw2)) {
            vi2.Companion.getClass();
            return vi2.lS5Rgt96tfkO;
        }
        int i2 = (int) (BjEWd04qc7Mw >> 32);
        int i3 = (int) (BjEWd04qc7Mw2 & 4294967295L);
        return jh0.rtx2ld2ELZv4(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final float aF05bpZJlKEP(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = li2.PxuCJdSBwIXG;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? sn0.PxuCJdSBwIXG[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static final k51 amuv7NJvPxHu(yx1 yx1Var, int i, int i2, int i3, int i4, int i5, l51 l51Var, List list, em1[] em1VarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        float f;
        long j;
        int i10;
        int i11;
        int i12;
        List list2 = list;
        long j2 = i5;
        int i13 = i7 - i6;
        int[] iArr2 = new int[i13];
        int i14 = i6;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        float f2 = 0.0f;
        while (i14 < i7) {
            e51 e51Var = (e51) list2.get(i14);
            float rZjpSjn4zoMv = vi0.rZjpSjn4zoMv(vi0.pnx5pC0XzaCw(e51Var));
            if (rZjpSjn4zoMv > 0.0f) {
                f2 += rZjpSjn4zoMv;
                i16++;
                j = j2;
                i10 = i14;
            } else {
                int i19 = i3 - i17;
                em1 em1Var = em1VarArr[i14];
                j = j2;
                if (em1Var == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i10 = i14;
                        i11 = i16;
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i10 = i14;
                        i11 = i16;
                        i12 = i19 < 0 ? 0 : i19;
                    }
                    em1Var = e51Var.e9gEMXR7LXtO(yx1Var.Y1f8riQaR6yg(0, i12, i4, false));
                } else {
                    i10 = i14;
                    i11 = i16;
                }
                em1 em1Var2 = em1Var;
                int rtx2ld2ELZv4 = yx1Var.rtx2ld2ELZv4(em1Var2);
                int e9gEMXR7LXtO = yx1Var.e9gEMXR7LXtO(em1Var2);
                iArr2[i10 - i6] = rtx2ld2ELZv4;
                int i20 = i19 - rtx2ld2ELZv4;
                if (i20 < 0) {
                    i20 = 0;
                }
                i18 = Math.min(i5, i20);
                i17 += rtx2ld2ELZv4 + i18;
                i15 = Math.max(i15, e9gEMXR7LXtO);
                em1VarArr[i10] = em1Var2;
                i16 = i11;
            }
            i14 = i10 + 1;
            j2 = j;
        }
        long j3 = j2;
        if (i16 == 0) {
            i17 -= i18;
            i9 = 0;
        } else {
            long j4 = (r22 - 1) * j3;
            long j5 = ((i3 != Integer.MAX_VALUE ? i3 : i) - i17) - j4;
            if (j5 < 0) {
                j5 = 0;
            }
            float f3 = j5 / f2;
            for (int i21 = i6; i21 < i7; i21++) {
                j5 -= Math.round(vi0.rZjpSjn4zoMv(vi0.pnx5pC0XzaCw((e51) list2.get(i21))) * f3);
            }
            int i22 = i6;
            int i23 = i15;
            int i24 = 0;
            while (i22 < i7) {
                if (em1VarArr[i22] == null) {
                    e51 e51Var2 = (e51) list2.get(i22);
                    f = f3;
                    zx1 pnx5pC0XzaCw = vi0.pnx5pC0XzaCw(e51Var2);
                    float rZjpSjn4zoMv2 = vi0.rZjpSjn4zoMv(pnx5pC0XzaCw);
                    if (rZjpSjn4zoMv2 <= 0.0f) {
                        cp0.lS5Rgt96tfkO("All weights <= 0 should have placeables");
                    }
                    int signum = Long.signum(j5);
                    long j6 = j5 - signum;
                    int max = Math.max(0, Math.round(rZjpSjn4zoMv2 * f) + signum);
                    em1 e9gEMXR7LXtO2 = e51Var2.e9gEMXR7LXtO(yx1Var.Y1f8riQaR6yg((!(pnx5pC0XzaCw != null ? pnx5pC0XzaCw.lS5Rgt96tfkO : true) || max == Integer.MAX_VALUE) ? 0 : max, max, i4, true));
                    int rtx2ld2ELZv42 = yx1Var.rtx2ld2ELZv4(e9gEMXR7LXtO2);
                    int e9gEMXR7LXtO3 = yx1Var.e9gEMXR7LXtO(e9gEMXR7LXtO2);
                    iArr2[i22 - i6] = rtx2ld2ELZv42;
                    i24 += rtx2ld2ELZv42;
                    int max2 = Math.max(i23, e9gEMXR7LXtO3);
                    em1VarArr[i22] = e9gEMXR7LXtO2;
                    i23 = max2;
                    j5 = j6;
                } else {
                    f = f3;
                }
                i22++;
                list2 = list;
                f3 = f;
            }
            i9 = (int) (i24 + j4);
            int i25 = i3 - i17;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i25) {
                i9 = i25;
            }
            i15 = i23;
        }
        int i26 = i9 + i17;
        if (i26 < 0) {
            i26 = 0;
        }
        int max3 = Math.max(i26, i);
        int max4 = Math.max(i15, Math.max(i2, 0));
        int[] iArr3 = new int[i13];
        yx1Var.lS5Rgt96tfkO(max3, l51Var, iArr2, iArr3);
        return yx1Var.wdg6QnbFHrFF(em1VarArr, l51Var, iArr3, max3, max4, iArr, i8, i6, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean cpQdD2nAriOS(ab0 ab0Var, l7 l7Var) {
        int ordinal = ab0Var.FT2GK7JK5Ma2().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ab0 EcgxDIVH5in8 = zv.EcgxDIVH5in8(ab0Var);
                if (EcgxDIVH5in8 == null) {
                    u9.rtx2ld2ELZv4("ActiveParent must have a focusedChild");
                    return false;
                }
                int ordinal2 = EcgxDIVH5in8.FT2GK7JK5Ma2().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        if (!cpQdD2nAriOS(EcgxDIVH5in8, l7Var)) {
                            ga0.Companion.getClass();
                            if (pnx5pC0XzaCw(ab0Var, EcgxDIVH5in8, 2, l7Var) || (EcgxDIVH5in8.fkblLSN2bAgv().PxuCJdSBwIXG && ((Boolean) l7Var.OPXfSBeufaJ8(EcgxDIVH5in8)).booleanValue())) {
                            }
                        }
                        return true;
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            u9.gPXPFXrUH4XX();
                            return false;
                        }
                        u9.rtx2ld2ELZv4("ActiveParent must have a focusedChild");
                        return false;
                    }
                }
                ga0.Companion.getClass();
                return pnx5pC0XzaCw(ab0Var, EcgxDIVH5in8, 2, l7Var);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    u9.gPXPFXrUH4XX();
                    return false;
                }
                if (!POWyO8hTM6YC(ab0Var, l7Var)) {
                    if (!(ab0Var.fkblLSN2bAgv().PxuCJdSBwIXG ? ((Boolean) l7Var.OPXfSBeufaJ8(ab0Var)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return POWyO8hTM6YC(ab0Var, l7Var);
    }

    public static final void dgRBjINgWbAK(me2 me2Var, Context context, final boolean z, final String str, final long j) {
        if (vi2.TSizfFm2Yiuu(j) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List list = (List) f2.RfyTYNmI9Srp.OPXfSBeufaJ8(context2);
        if (list.isEmpty()) {
            return;
        }
        p81 p81Var = me2Var.PxuCJdSBwIXG;
        p81 p81Var2 = me2Var.PxuCJdSBwIXG;
        cf2 cf2Var = cf2.lS5Rgt96tfkO;
        p81Var.PxuCJdSBwIXG(cf2Var);
        int size = list.size();
        int i = 0;
        while (i < size) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            p81Var2.PxuCJdSBwIXG(new ye2(new nq1(i), resolveInfo.loadLabel(packageManager).toString(), 0, new le0() { // from class: oq1
                @Override // defpackage.le0
                public final Object OPXfSBeufaJ8(Object obj) {
                    f2.EcgxDIVH5in8.x50lh2ztY7Y5(context2, resolveInfo, Boolean.valueOf(z), str, new vi2(j));
                    ((df2) obj).close();
                    return no2.PxuCJdSBwIXG;
                }
            }));
            i++;
            context2 = context;
        }
        p81Var2.PxuCJdSBwIXG(cf2Var);
    }

    public static final ArrayList e6tOsSdd2EFb(vr0 vr0Var) {
        vr0Var.getClass();
        vw0 OYiFbU3x63rc = ((u31) vr0Var).OYiFbU3x63rc();
        boolean tmVwIGCQF4zR = tmVwIGCQF4zR(OYiFbU3x63rc);
        n81 n81Var = (n81) OYiFbU3x63rc.QrzZRwfaDlRX();
        f91 f91Var = (f91) n81Var.OPXfSBeufaJ8;
        ArrayList arrayList = new ArrayList(f91Var.wdg6QnbFHrFF);
        int i = f91Var.wdg6QnbFHrFF;
        for (int i2 = 0; i2 < i; i2++) {
            vw0 vw0Var = (vw0) n81Var.get(i2);
            arrayList.add(tmVwIGCQF4zR ? vw0Var.x50lh2ztY7Y5() : vw0Var.cpQdD2nAriOS());
        }
        return arrayList;
    }

    public static final int e9gEMXR7LXtO(yz0 yz0Var, long j, vq2 vq2Var) {
        long S2OOm9zPNm0h;
        int kpCQ9veP6n3I;
        ki2 Y1f8riQaR6yg = yz0Var.Y1f8riQaR6yg();
        if (Y1f8riQaR6yg != null) {
            r71 r71Var = Y1f8riQaR6yg.PxuCJdSBwIXG.lS5Rgt96tfkO;
            bw0 TSizfFm2Yiuu = yz0Var.TSizfFm2Yiuu();
            if (TSizfFm2Yiuu != null && (kpCQ9veP6n3I = kpCQ9veP6n3I(r71Var, (S2OOm9zPNm0h = TSizfFm2Yiuu.S2OOm9zPNm0h(j)), vq2Var)) != -1) {
                return r71Var.RAsUl2FVSrh6(bf1.PxuCJdSBwIXG(S2OOm9zPNm0h, (r71Var.lS5Rgt96tfkO(kpCQ9veP6n3I) + r71Var.a92UlCVFR9N8(kpCQ9veP6n3I)) / 2.0f, 1));
            }
        }
        return -1;
    }

    public static final xb1 gGoUzNp9JO5I(le0 le0Var) {
        yb1 yb1Var = new yb1();
        le0Var.OPXfSBeufaJ8(yb1Var);
        boolean z = yb1Var.lS5Rgt96tfkO;
        boolean z2 = yb1Var.TSizfFm2Yiuu;
        ck ckVar = yb1Var.RAsUl2FVSrh6;
        wb1 wb1Var = yb1Var.PxuCJdSBwIXG;
        if (ckVar != null) {
            boolean z3 = yb1Var.e9gEMXR7LXtO;
            boolean z4 = yb1Var.a92UlCVFR9N8;
            wb1Var.lS5Rgt96tfkO = ckVar;
            wb1Var.PxuCJdSBwIXG = -1;
            wb1Var.TSizfFm2Yiuu = z3;
            wb1Var.Y1f8riQaR6yg = z4;
        } else {
            int i = yb1Var.Y1f8riQaR6yg;
            boolean z5 = yb1Var.e9gEMXR7LXtO;
            boolean z6 = yb1Var.a92UlCVFR9N8;
            wb1Var.PxuCJdSBwIXG = i;
            wb1Var.TSizfFm2Yiuu = z5;
            wb1Var.Y1f8riQaR6yg = z6;
        }
        eu0 eu0Var = wb1Var.lS5Rgt96tfkO;
        if (eu0Var == null) {
            return new xb1(z, z2, wb1Var.PxuCJdSBwIXG, wb1Var.TSizfFm2Yiuu, wb1Var.Y1f8riQaR6yg, wb1Var.e9gEMXR7LXtO, wb1Var.a92UlCVFR9N8);
        }
        xb1 xb1Var = new xb1(z, z2, ni0.EcgxDIVH5in8(SerializersKt.serializer(eu0Var)), wb1Var.TSizfFm2Yiuu, wb1Var.Y1f8riQaR6yg, wb1Var.e9gEMXR7LXtO, wb1Var.a92UlCVFR9N8);
        xb1Var.rtx2ld2ELZv4 = eu0Var;
        return xb1Var;
    }

    public static final void gPXPFXrUH4XX(int i) {
        if (i >= 1) {
            return;
        }
        u9.e9gEMXR7LXtO(o0.wdg6QnbFHrFF("Expected positive parallelism level, but got ", i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean i68hK7ahKtgp(ab0 ab0Var, l7 l7Var) {
        ab0[] ab0VarArr = new ab0[16];
        if (!ab0Var.rtx2ld2ELZv4.S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("visitChildren called on an unattached node");
        }
        f91 f91Var = new f91(new m61[16]);
        m61 m61Var = ab0Var.rtx2ld2ELZv4;
        m61 m61Var2 = m61Var.cpQdD2nAriOS;
        if (m61Var2 == null) {
            zv.OPXfSBeufaJ8(f91Var, m61Var);
        } else {
            f91Var.lS5Rgt96tfkO(m61Var2);
        }
        int i = 0;
        while (true) {
            int i2 = f91Var.wdg6QnbFHrFF;
            if (i2 == 0) {
                break;
            }
            m61 m61Var3 = (m61) f91Var.dgRBjINgWbAK(i2 - 1);
            if ((m61Var3.dgRBjINgWbAK & 1024) == 0) {
                zv.OPXfSBeufaJ8(f91Var, m61Var3);
            } else {
                while (true) {
                    if (m61Var3 == null) {
                        break;
                    }
                    if ((m61Var3.wdg6QnbFHrFF & 1024) != 0) {
                        f91 f91Var2 = null;
                        while (m61Var3 != null) {
                            if (m61Var3 instanceof ab0) {
                                ab0 ab0Var2 = (ab0) m61Var3;
                                int i3 = i + 1;
                                if (ab0VarArr.length < i3) {
                                    int length = ab0VarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(ab0VarArr, 0, r10, 0, length);
                                    ab0VarArr = r10;
                                }
                                ab0VarArr[i] = ab0Var2;
                                i = i3;
                            } else if ((m61Var3.wdg6QnbFHrFF & 1024) != 0 && (m61Var3 instanceof ux)) {
                                int i4 = 0;
                                for (m61 m61Var4 = ((ux) m61Var3).S2OOm9zPNm0h; m61Var4 != null; m61Var4 = m61Var4.cpQdD2nAriOS) {
                                    if ((m61Var4.wdg6QnbFHrFF & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            m61Var3 = m61Var4;
                                        } else {
                                            if (f91Var2 == null) {
                                                f91Var2 = new f91(new m61[16]);
                                            }
                                            if (m61Var3 != null) {
                                                f91Var2.lS5Rgt96tfkO(m61Var3);
                                                m61Var3 = null;
                                            }
                                            f91Var2.lS5Rgt96tfkO(m61Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            m61Var3 = zv.dgRBjINgWbAK(f91Var2);
                        }
                    } else {
                        m61Var3 = m61Var3.cpQdD2nAriOS;
                    }
                }
            }
        }
        Arrays.sort(ab0VarArr, 0, i, db0.lS5Rgt96tfkO);
        for (int i5 = 0; i5 < i; i5++) {
            ab0 ab0Var3 = ab0VarArr[i5];
            if (zv.BjEWd04qc7Mw(ab0Var3) && ZbWwgt3aGe7A(ab0Var3, l7Var)) {
                return true;
            }
        }
        return false;
    }

    public static final float jyegZNwi31qc(Layout layout, int i, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = li2.PxuCJdSBwIXG;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : sn0.PxuCJdSBwIXG[paragraphAlignment.ordinal()]) == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final int kpCQ9veP6n3I(r71 r71Var, long j, vq2 vq2Var) {
        float a92UlCVFR9N8 = vq2Var != null ? vq2Var.a92UlCVFR9N8() : 0.0f;
        int i = (int) (4294967295L & j);
        int e9gEMXR7LXtO = r71Var.e9gEMXR7LXtO(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < r71Var.a92UlCVFR9N8(e9gEMXR7LXtO) - a92UlCVFR9N8 || Float.intBitsToFloat(i) > r71Var.lS5Rgt96tfkO(e9gEMXR7LXtO) + a92UlCVFR9N8) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-a92UlCVFR9N8) || Float.intBitsToFloat(i2) > r71Var.Y1f8riQaR6yg + a92UlCVFR9N8) {
            return -1;
        }
        return e9gEMXR7LXtO;
    }

    public static final void lS5Rgt96tfkO(zy0 zy0Var, Object obj, int i, Object obj2, hp hpVar, int i2) {
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(1439843069);
        int i3 = (tf0Var.a92UlCVFR9N8(zy0Var) ? 4 : 2) | i2 | (tf0Var.a92UlCVFR9N8(obj) ? 32 : 16) | (tf0Var.Y1f8riQaR6yg(i) ? 256 : 128) | (tf0Var.a92UlCVFR9N8(obj2) ? 2048 : 1024);
        if (tf0Var.Pf0ThKz3j5YS(i3 & 1, (i3 & 1171) != 1170)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            ((wy1) obj).lS5Rgt96tfkO(obj2, bs0.kpCQ9veP6n3I(980966366, new dy0(i, zy0Var, obj2), tf0Var), tf0Var, 48);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new q5(zy0Var, obj, i, obj2, i2);
        }
    }

    public static y32 nLZGh9p8gVSu(pe0 pe0Var) {
        y32 y32Var = new y32();
        y32Var.wdg6QnbFHrFF = ng0.QrzZRwfaDlRX(y32Var, y32Var, pe0Var);
        return y32Var;
    }

    public static final String nxJAScVArhE9(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static File ozEBbv0hFTAB(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static final boolean pnx5pC0XzaCw(ab0 ab0Var, ab0 ab0Var2, int i, l7 l7Var) {
        if (xbgXKYA2cIfu(ab0Var, ab0Var2, i, l7Var)) {
            return true;
        }
        Boolean bool = (Boolean) zv.xbgXKYA2cIfu(ab0Var, i, new eg1(((qa0) ((r1) zv.wLFCmsViZrNT(ab0Var)).getFocusOwner()).a92UlCVFR9N8(), ab0Var, ab0Var2, i, l7Var, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final g22 r3s1LDPKFs1S(g22 g22Var, of0 of0Var, int i) {
        return new g22(((ji2) of0Var.e9gEMXR7LXtO).PxuCJdSBwIXG(i), i, g22Var.TSizfFm2Yiuu);
    }

    public static final int rZjpSjn4zoMv(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final boolean rtx2ld2ELZv4(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    public static final void ryVscX7ZL4Ux(String str) {
        str.getClass();
        throw new IllegalArgumentException(o0.x50lh2ztY7Y5("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final boolean tmVwIGCQF4zR(vw0 vw0Var) {
        int ordinal = vw0Var.ryVscX7ZL4Ux.Y1f8riQaR6yg.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            u9.gPXPFXrUH4XX();
                            return false;
                        }
                        vw0 S9EYkSpbGuxq = vw0Var.S9EYkSpbGuxq();
                        if (S9EYkSpbGuxq != null) {
                            return tmVwIGCQF4zR(S9EYkSpbGuxq);
                        }
                        u9.XL4ISE6Oc65B("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final dr0 wLFCmsViZrNT(qt1 qt1Var) {
        return new dr0(Math.round(qt1Var.PxuCJdSBwIXG), Math.round(qt1Var.lS5Rgt96tfkO), Math.round(qt1Var.TSizfFm2Yiuu), Math.round(qt1Var.Y1f8riQaR6yg));
    }

    public static final g22 wdg6QnbFHrFF(final w52 w52Var, final of0 of0Var, g22 g22Var) {
        int i = of0Var.TSizfFm2Yiuu;
        int i2 = of0Var.lS5Rgt96tfkO;
        boolean z = w52Var.PxuCJdSBwIXG;
        final int i3 = z ? i2 : i;
        ji2 ji2Var = (ji2) of0Var.e9gEMXR7LXtO;
        int i4 = of0Var.Y1f8riQaR6yg;
        hf0 hf0Var = new hf0(i3, 1, of0Var);
        pz0 pz0Var = pz0.OPXfSBeufaJ8;
        final nx0 ryVscX7ZL4Ux = vi0.ryVscX7ZL4Ux(pz0Var, hf0Var);
        final int i5 = z ? i : i2;
        nx0 ryVscX7ZL4Ux2 = vi0.ryVscX7ZL4Ux(pz0Var, new ae0() { // from class: k22
            @Override // defpackage.ae0
            public final Object PxuCJdSBwIXG() {
                of0 of0Var2 = of0.this;
                ji2 ji2Var2 = (ji2) of0Var2.e9gEMXR7LXtO;
                int intValue = ((Number) ryVscX7ZL4Ux.getValue()).intValue();
                w52 w52Var2 = w52Var;
                boolean z2 = w52Var2.PxuCJdSBwIXG;
                boolean z3 = w52Var2.PxuCJdSBwIXG() == dv.rtx2ld2ELZv4;
                int i6 = i3;
                long rtx2ld2ELZv4 = ji2Var2.rtx2ld2ELZv4(i6);
                r71 r71Var = ji2Var2.lS5Rgt96tfkO;
                ui2 ui2Var = vi2.Companion;
                int i7 = (int) (rtx2ld2ELZv4 >> 32);
                int Y1f8riQaR6yg = r71Var.Y1f8riQaR6yg(i7);
                int i8 = r71Var.a92UlCVFR9N8;
                if (Y1f8riQaR6yg != intValue) {
                    i7 = intValue >= i8 ? ji2Var2.a92UlCVFR9N8(i8 - 1) : ji2Var2.a92UlCVFR9N8(intValue);
                }
                int i9 = (int) (rtx2ld2ELZv4 & 4294967295L);
                if (r71Var.Y1f8riQaR6yg(i9) != intValue) {
                    i9 = intValue >= i8 ? r71Var.TSizfFm2Yiuu(i8 - 1, false) : r71Var.TSizfFm2Yiuu(intValue, false);
                }
                int i10 = i5;
                if (i7 == i10) {
                    return of0Var2.PxuCJdSBwIXG(i9);
                }
                if (i9 == i10) {
                    return of0Var2.PxuCJdSBwIXG(i7);
                }
                if (!(z2 ^ z3) ? i6 >= i7 : i6 > i9) {
                    i7 = i9;
                }
                return of0Var2.PxuCJdSBwIXG(i7);
            }
        });
        if (1 != g22Var.TSizfFm2Yiuu) {
            return (g22) ryVscX7ZL4Ux2.getValue();
        }
        if (i3 == i4) {
            return g22Var;
        }
        if (((Number) ryVscX7ZL4Ux.getValue()).intValue() != ji2Var.lS5Rgt96tfkO.Y1f8riQaR6yg(i4)) {
            return (g22) ryVscX7ZL4Ux2.getValue();
        }
        int i6 = g22Var.lS5Rgt96tfkO;
        long rtx2ld2ELZv4 = ji2Var.rtx2ld2ELZv4(i6);
        if (i4 != -1) {
            if (i3 != i4) {
                dv dvVar = dv.rtx2ld2ELZv4;
                if (((z ? 1 : 0) ^ ((i2 < i ? dv.OPXfSBeufaJ8 : i2 > i ? dvVar : dv.wdg6QnbFHrFF) != dvVar ? 0 : 1)) == 0) {
                }
            }
            return of0Var.PxuCJdSBwIXG(i3);
        }
        ui2 ui2Var = vi2.Companion;
        return (i6 == ((int) (rtx2ld2ELZv4 >> 32)) || i6 == ((int) (rtx2ld2ELZv4 & 4294967295L))) ? (g22) ryVscX7ZL4Ux2.getValue() : of0Var.PxuCJdSBwIXG(i3);
    }

    public static final g22 x50lh2ztY7Y5(of0 of0Var, boolean z, boolean z2, pe peVar) {
        long j;
        long a92UlCVFR9N8 = peVar.a92UlCVFR9N8(of0Var, z2 ? of0Var.lS5Rgt96tfkO : of0Var.TSizfFm2Yiuu);
        if (z ^ z2) {
            ui2 ui2Var = vi2.Companion;
            j = a92UlCVFR9N8 >> 32;
        } else {
            ui2 ui2Var2 = vi2.Companion;
            j = 4294967295L & a92UlCVFR9N8;
        }
        return of0Var.PxuCJdSBwIXG((int) j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0103, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01a1 A[EDGE_INSN: B:152:0x01a1->B:133:0x01a1 BREAK  A[LOOP:5: B:92:0x0136->B:147:0x0136], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0138  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean xbgXKYA2cIfu(ab0 ab0Var, ab0 ab0Var2, int i, l7 l7Var) {
        m61 m61Var;
        vw0 zf8DYfih6EZu;
        kd1 kd1Var;
        if (ab0Var.FT2GK7JK5Ma2() != za0.OPXfSBeufaJ8) {
            u9.rtx2ld2ELZv4("This function should only be used within a parent that has focus.");
            return false;
        }
        ab0[] ab0VarArr = new ab0[16];
        if (!ab0Var.rtx2ld2ELZv4.S9EYkSpbGuxq) {
            ep0.lS5Rgt96tfkO("visitChildren called on an unattached node");
        }
        f91 f91Var = new f91(new m61[16]);
        m61 m61Var2 = ab0Var.rtx2ld2ELZv4;
        m61 m61Var3 = m61Var2.cpQdD2nAriOS;
        if (m61Var3 == null) {
            zv.OPXfSBeufaJ8(f91Var, m61Var2);
        } else {
            f91Var.lS5Rgt96tfkO(m61Var3);
        }
        int i2 = 0;
        while (true) {
            int i3 = f91Var.wdg6QnbFHrFF;
            m61Var = null;
            if (i3 == 0) {
                break;
            }
            m61 m61Var4 = (m61) f91Var.dgRBjINgWbAK(i3 - 1);
            if ((m61Var4.dgRBjINgWbAK & 1024) == 0) {
                zv.OPXfSBeufaJ8(f91Var, m61Var4);
            } else {
                while (true) {
                    if (m61Var4 == null) {
                        break;
                    }
                    if ((m61Var4.wdg6QnbFHrFF & 1024) != 0) {
                        f91 f91Var2 = null;
                        while (m61Var4 != null) {
                            if (m61Var4 instanceof ab0) {
                                ab0 ab0Var3 = (ab0) m61Var4;
                                int i4 = i2 + 1;
                                if (ab0VarArr.length < i4) {
                                    int length = ab0VarArr.length;
                                    ?? r11 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(ab0VarArr, 0, r11, 0, length);
                                    ab0VarArr = r11;
                                }
                                ab0VarArr[i2] = ab0Var3;
                                i2 = i4;
                            } else if ((m61Var4.wdg6QnbFHrFF & 1024) != 0 && (m61Var4 instanceof ux)) {
                                int i5 = 0;
                                for (m61 m61Var5 = ((ux) m61Var4).S2OOm9zPNm0h; m61Var5 != null; m61Var5 = m61Var5.cpQdD2nAriOS) {
                                    if ((m61Var5.wdg6QnbFHrFF & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            m61Var4 = m61Var5;
                                        } else {
                                            if (f91Var2 == null) {
                                                f91Var2 = new f91(new m61[16]);
                                            }
                                            if (m61Var4 != null) {
                                                f91Var2.lS5Rgt96tfkO(m61Var4);
                                                m61Var4 = null;
                                            }
                                            f91Var2.lS5Rgt96tfkO(m61Var5);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            m61Var4 = zv.dgRBjINgWbAK(f91Var2);
                        }
                    } else {
                        m61Var4 = m61Var4.cpQdD2nAriOS;
                    }
                }
            }
        }
        Arrays.sort(ab0VarArr, 0, i2, db0.lS5Rgt96tfkO);
        ga0.Companion.getClass();
        if (i != 1) {
            if (i != 2) {
                u9.rtx2ld2ELZv4("This function should only be used for 1-D focus search");
                return false;
            }
            br0 nLZGh9p8gVSu = ng0.nLZGh9p8gVSu(0, i2);
            int i6 = nLZGh9p8gVSu.rtx2ld2ELZv4;
            int i7 = nLZGh9p8gVSu.OPXfSBeufaJ8;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        ab0 ab0Var4 = ab0VarArr[i7];
                        if (zv.BjEWd04qc7Mw(ab0Var4) && cpQdD2nAriOS(ab0Var4, l7Var)) {
                            break;
                        }
                    }
                    if (cs0.wdg6QnbFHrFF(ab0VarArr[i7], ab0Var2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
            ga0.Companion.getClass();
            if (i != 1) {
                if (!ab0Var.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                }
                m61 m61Var6 = ab0Var.rtx2ld2ELZv4.x50lh2ztY7Y5;
                zf8DYfih6EZu = zv.zf8DYfih6EZu(ab0Var);
                loop5: while (true) {
                    if (zf8DYfih6EZu == null) {
                    }
                }
                if (m61Var != null) {
                }
            }
            return false;
        }
        br0 nLZGh9p8gVSu2 = ng0.nLZGh9p8gVSu(0, i2);
        int i8 = nLZGh9p8gVSu2.rtx2ld2ELZv4;
        int i9 = nLZGh9p8gVSu2.OPXfSBeufaJ8;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    ab0 ab0Var5 = ab0VarArr[i8];
                    if (zv.BjEWd04qc7Mw(ab0Var5) && ZbWwgt3aGe7A(ab0Var5, l7Var)) {
                        break;
                    }
                }
                if (cs0.wdg6QnbFHrFF(ab0VarArr[i8], ab0Var2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
        }
        ga0.Companion.getClass();
        if (i != 1 && ab0Var.fkblLSN2bAgv().PxuCJdSBwIXG) {
            if (!ab0Var.rtx2ld2ELZv4.S9EYkSpbGuxq) {
                ep0.lS5Rgt96tfkO("visitAncestors called on an unattached node");
            }
            m61 m61Var62 = ab0Var.rtx2ld2ELZv4.x50lh2ztY7Y5;
            zf8DYfih6EZu = zv.zf8DYfih6EZu(ab0Var);
            loop5: while (true) {
                if (zf8DYfih6EZu == null) {
                    break;
                }
                if ((zf8DYfih6EZu.nLZGh9p8gVSu.a92UlCVFR9N8.dgRBjINgWbAK & 1024) != 0) {
                    while (m61Var62 != null) {
                        if ((m61Var62.wdg6QnbFHrFF & 1024) != 0) {
                            m61 m61Var7 = m61Var62;
                            f91 f91Var3 = null;
                            while (m61Var7 != null) {
                                if (m61Var7 instanceof ab0) {
                                    m61Var = m61Var7;
                                    break loop5;
                                }
                                if ((m61Var7.wdg6QnbFHrFF & 1024) != 0 && (m61Var7 instanceof ux)) {
                                    int i10 = 0;
                                    for (m61 m61Var8 = ((ux) m61Var7).S2OOm9zPNm0h; m61Var8 != null; m61Var8 = m61Var8.cpQdD2nAriOS) {
                                        if ((m61Var8.wdg6QnbFHrFF & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                m61Var7 = m61Var8;
                                            } else {
                                                if (f91Var3 == null) {
                                                    f91Var3 = new f91(new m61[16]);
                                                }
                                                if (m61Var7 != null) {
                                                    f91Var3.lS5Rgt96tfkO(m61Var7);
                                                    m61Var7 = null;
                                                }
                                                f91Var3.lS5Rgt96tfkO(m61Var8);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                m61Var7 = zv.dgRBjINgWbAK(f91Var3);
                            }
                        }
                        m61Var62 = m61Var62.x50lh2ztY7Y5;
                    }
                }
                zf8DYfih6EZu = zf8DYfih6EZu.S9EYkSpbGuxq();
                m61Var62 = (zf8DYfih6EZu == null || (kd1Var = zf8DYfih6EZu.nLZGh9p8gVSu) == null) ? null : kd1Var.e9gEMXR7LXtO;
            }
            if (m61Var != null) {
                return ((Boolean) l7Var.OPXfSBeufaJ8(ab0Var)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean xfACYKDMU6Dj(int i) {
        int type;
        return (!EpkonXwzFgDB(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0038, code lost:
    
        if (r2 == defpackage.fp.lS5Rgt96tfkO) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final qp2 zf8DYfih6EZu(en0 en0Var, hp hpVar) {
        td tdVar;
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        tf0 tf0Var = (tf0) hpVar;
        hy hyVar = (hy) tf0Var.wdg6QnbFHrFF(eq.rtx2ld2ELZv4);
        float f = en0Var.wdg6QnbFHrFF;
        float lS5Rgt96tfkO = hyVar.lS5Rgt96tfkO();
        boolean e9gEMXR7LXtO = tf0Var.e9gEMXR7LXtO((Float.floatToRawIntBits(lS5Rgt96tfkO) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
        if (!e9gEMXR7LXtO) {
            hp.Companion.getClass();
        }
        di0 di0Var = new di0();
        S9EYkSpbGuxq(di0Var, en0Var.a92UlCVFR9N8);
        float f2 = en0Var.lS5Rgt96tfkO;
        float f3 = en0Var.TSizfFm2Yiuu;
        float e6tOsSdd2EFb = hyVar.e6tOsSdd2EFb(f2);
        float e6tOsSdd2EFb2 = hyVar.e6tOsSdd2EFb(f3);
        long floatToRawIntBits = (Float.floatToRawIntBits(e6tOsSdd2EFb) << 32) | (Float.floatToRawIntBits(e6tOsSdd2EFb2) & 4294967295L);
        float f4 = en0Var.Y1f8riQaR6yg;
        float f5 = en0Var.e9gEMXR7LXtO;
        if (Float.isNaN(f4)) {
            f4 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        }
        if (Float.isNaN(f5)) {
            f5 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
        }
        long floatToRawIntBits2 = (Float.floatToRawIntBits(f4) << 32) | (4294967295L & Float.floatToRawIntBits(f5));
        qp2 qp2Var = new qp2(di0Var);
        String str = en0Var.PxuCJdSBwIXG;
        long j = en0Var.RAsUl2FVSrh6;
        int i = en0Var.rtx2ld2ELZv4;
        if (j != 16) {
            jl.Companion.getClass();
            tdVar = new td(i, j);
        } else {
            tdVar = null;
        }
        boolean z = en0Var.OPXfSBeufaJ8;
        qp2Var.e9gEMXR7LXtO.setValue(new a62(floatToRawIntBits));
        qp2Var.a92UlCVFR9N8.setValue(Boolean.valueOf(z));
        mp2 mp2Var = qp2Var.RAsUl2FVSrh6;
        mp2Var.RAsUl2FVSrh6.setValue(tdVar);
        mp2Var.OPXfSBeufaJ8.setValue(new a62(floatToRawIntBits2));
        mp2Var.TSizfFm2Yiuu = str;
        tf0Var.JTxCbbCwomzt(qp2Var);
        nLZGh9p8gVSu = qp2Var;
        return (qp2) nLZGh9p8gVSu;
    }

    public abstract void QrzZRwfaDlRX();
}
