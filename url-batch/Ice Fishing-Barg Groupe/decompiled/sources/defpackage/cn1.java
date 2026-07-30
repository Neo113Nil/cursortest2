package defpackage;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cn1 {
    public final hu PxuCJdSBwIXG;
    public final f22 TSizfFm2Yiuu;
    public final p21 Y1f8riQaR6yg;
    public TextClassifier a92UlCVFR9N8;
    public final Context lS5Rgt96tfkO;
    public final r91 e9gEMXR7LXtO = new r91();
    public final mj1 RAsUl2FVSrh6 = sj0.tmVwIGCQF4zR(null);
    public final Object rtx2ld2ELZv4 = new Object();

    public cn1(hu huVar, Context context, f22 f22Var, p21 p21Var) {
        this.PxuCJdSBwIXG = huVar;
        this.lS5Rgt96tfkO = context;
        this.TSizfFm2Yiuu = f22Var;
        this.Y1f8riQaR6yg = p21Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object PxuCJdSBwIXG(cn1 cn1Var, CharSequence charSequence, long j, TextClassifier textClassifier, ct ctVar) {
        an1 an1Var;
        int i;
        long j2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        r91 r91Var;
        Object obj;
        le2 le2Var;
        su suVar;
        boolean z;
        Object obj2;
        TextClassification.Request.Builder defaultLocales;
        TextClassification.Request build;
        TextClassification classifyText;
        long j3;
        CharSequence charSequence3;
        r91 r91Var2 = cn1Var.e9gEMXR7LXtO;
        mj1 mj1Var = cn1Var.RAsUl2FVSrh6;
        try {
            if (ctVar instanceof an1) {
                an1Var = (an1) ctVar;
                int i2 = an1Var.BRwzKIf41E4i;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    an1Var.BRwzKIf41E4i = i2 - Integer.MIN_VALUE;
                    Object obj3 = an1Var.QrzZRwfaDlRX;
                    i = an1Var.BRwzKIf41E4i;
                    no2 no2Var = no2.PxuCJdSBwIXG;
                    su suVar2 = su.rtx2ld2ELZv4;
                    if (i != 0) {
                        ng0.tmVwIGCQF4zR(obj3);
                        an1Var.dgRBjINgWbAK = charSequence;
                        an1Var.x50lh2ztY7Y5 = textClassifier;
                        an1Var.cpQdD2nAriOS = r91Var2;
                        j2 = j;
                        an1Var.r3s1LDPKFs1S = j2;
                        an1Var.BRwzKIf41E4i = 1;
                        if (r91Var2.a92UlCVFR9N8(an1Var) == suVar2) {
                            return suVar2;
                        }
                        charSequence2 = charSequence;
                        textClassifier2 = textClassifier;
                        r91Var = r91Var2;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j3 = an1Var.r3s1LDPKFs1S;
                            r91Var2 = an1Var.cpQdD2nAriOS;
                            classifyText = hi.OPXfSBeufaJ8(an1Var.x50lh2ztY7Y5);
                            charSequence3 = an1Var.dgRBjINgWbAK;
                            ng0.tmVwIGCQF4zR(obj3);
                            try {
                                mj1Var.setValue(new le2(charSequence3, j3, classifyText));
                                return no2Var;
                            } finally {
                                r91Var2.lS5Rgt96tfkO(null);
                            }
                        }
                        j2 = an1Var.r3s1LDPKFs1S;
                        r91Var = an1Var.cpQdD2nAriOS;
                        textClassifier2 = hi.dgRBjINgWbAK(an1Var.x50lh2ztY7Y5);
                        charSequence2 = an1Var.dgRBjINgWbAK;
                        ng0.tmVwIGCQF4zR(obj3);
                    }
                    le2Var = (le2) mj1Var.getValue();
                    if (le2Var == null) {
                        try {
                            t92 t92Var = en1.PxuCJdSBwIXG;
                            suVar = suVar2;
                            if (vi2.lS5Rgt96tfkO(j2, le2Var.lS5Rgt96tfkO)) {
                                if (cs0.wdg6QnbFHrFF(charSequence2, le2Var.PxuCJdSBwIXG)) {
                                    z = true;
                                    if (!z) {
                                        return no2Var;
                                    }
                                    obj2 = null;
                                }
                            }
                            z = false;
                            if (!z) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            obj = null;
                            r91Var2.lS5Rgt96tfkO(obj);
                            throw th;
                        }
                    } else {
                        suVar = suVar2;
                        obj2 = null;
                    }
                    r91Var2.lS5Rgt96tfkO(obj2);
                    v6yxfmkxNKhL.QrzZRwfaDlRX();
                    defaultLocales = v6yxfmkxNKhL.RAsUl2FVSrh6(charSequence2, vi2.a92UlCVFR9N8(j2), vi2.e9gEMXR7LXtO(j2)).setDefaultLocales(cn1Var.lS5Rgt96tfkO());
                    build = defaultLocales.build();
                    classifyText = textClassifier2.classifyText(build);
                    an1Var.dgRBjINgWbAK = charSequence2;
                    an1Var.x50lh2ztY7Y5 = classifyText;
                    an1Var.cpQdD2nAriOS = r91Var2;
                    an1Var.r3s1LDPKFs1S = j2;
                    an1Var.BRwzKIf41E4i = 2;
                    if (r91Var2.a92UlCVFR9N8(an1Var) != suVar) {
                        return suVar;
                    }
                    j3 = j2;
                    charSequence3 = charSequence2;
                    mj1Var.setValue(new le2(charSequence3, j3, classifyText));
                    return no2Var;
                }
            }
            le2Var = (le2) mj1Var.getValue();
            if (le2Var == null) {
            }
            r91Var2.lS5Rgt96tfkO(obj2);
            v6yxfmkxNKhL.QrzZRwfaDlRX();
            defaultLocales = v6yxfmkxNKhL.RAsUl2FVSrh6(charSequence2, vi2.a92UlCVFR9N8(j2), vi2.e9gEMXR7LXtO(j2)).setDefaultLocales(cn1Var.lS5Rgt96tfkO());
            build = defaultLocales.build();
            classifyText = textClassifier2.classifyText(build);
            an1Var.dgRBjINgWbAK = charSequence2;
            an1Var.x50lh2ztY7Y5 = classifyText;
            an1Var.cpQdD2nAriOS = r91Var2;
            an1Var.r3s1LDPKFs1S = j2;
            an1Var.BRwzKIf41E4i = 2;
            if (r91Var2.a92UlCVFR9N8(an1Var) != suVar) {
            }
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
        an1Var = new an1(cn1Var, ctVar);
        Object obj32 = an1Var.QrzZRwfaDlRX;
        i = an1Var.BRwzKIf41E4i;
        no2 no2Var2 = no2.PxuCJdSBwIXG;
        su suVar22 = su.rtx2ld2ELZv4;
        if (i != 0) {
        }
    }

    public final LocaleList lS5Rgt96tfkO() {
        p21 p21Var = this.Y1f8riQaR6yg;
        if (p21Var == null) {
            n21.Companion.getClass();
            return new LocaleList(((n21) om1.PxuCJdSBwIXG.EcgxDIVH5in8().rtx2ld2ELZv4.get(0)).PxuCJdSBwIXG);
        }
        ArrayList arrayList = new ArrayList(al.KZw9XyiywG4x(p21Var, 10));
        Iterator it = p21Var.rtx2ld2ELZv4.iterator();
        while (it.hasNext()) {
            arrayList.add(((n21) it.next()).PxuCJdSBwIXG);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
