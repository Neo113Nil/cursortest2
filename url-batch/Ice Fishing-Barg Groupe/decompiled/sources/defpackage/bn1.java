package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class bn1 extends jc2 implements pe0 {
    public /* synthetic */ Object BRwzKIf41E4i;
    public final /* synthetic */ cn1 EcgxDIVH5in8;
    public long QrzZRwfaDlRX;
    public final /* synthetic */ long RfyTYNmI9Srp;
    public final /* synthetic */ CharSequence XL4ISE6Oc65B;
    public cn1 cpQdD2nAriOS;
    public int gPXPFXrUH4XX;
    public CharSequence r3s1LDPKFs1S;
    public r91 x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn1(long j, bt btVar, cn1 cn1Var, CharSequence charSequence) {
        super(2, btVar);
        this.XL4ISE6Oc65B = charSequence;
        this.RfyTYNmI9Srp = j;
        this.EcgxDIVH5in8 = cn1Var;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        TextSelection.Request.Builder defaultLocales;
        TextSelection.Request build;
        TextSelection suggestSelection;
        int selectionStartIndex;
        int selectionEndIndex;
        long j;
        TextClassification textClassification;
        r91 r91Var;
        TextSelection textSelection;
        CharSequence charSequence;
        cn1 cn1Var;
        TextClassification textClassification2;
        int i = this.gPXPFXrUH4XX;
        if (i == 0) {
            ng0.tmVwIGCQF4zR(obj);
            TextClassifier dgRBjINgWbAK = hi.dgRBjINgWbAK(this.BRwzKIf41E4i);
            v6yxfmkxNKhL.pnx5pC0XzaCw();
            long j2 = this.RfyTYNmI9Srp;
            int a92UlCVFR9N8 = vi2.a92UlCVFR9N8(j2);
            int e9gEMXR7LXtO = vi2.e9gEMXR7LXtO(j2);
            CharSequence charSequence2 = this.XL4ISE6Oc65B;
            TextSelection.Request.Builder dgRBjINgWbAK2 = v6yxfmkxNKhL.dgRBjINgWbAK(charSequence2, a92UlCVFR9N8, e9gEMXR7LXtO);
            cn1 cn1Var2 = this.EcgxDIVH5in8;
            defaultLocales = dgRBjINgWbAK2.setDefaultLocales(cn1Var2.lS5Rgt96tfkO());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            build = defaultLocales.build();
            suggestSelection = dgRBjINgWbAK.suggestSelection(build);
            selectionStartIndex = suggestSelection.getSelectionStartIndex();
            selectionEndIndex = suggestSelection.getSelectionEndIndex();
            long rtx2ld2ELZv4 = jh0.rtx2ld2ELZv4(selectionStartIndex, selectionEndIndex);
            su suVar = su.rtx2ld2ELZv4;
            if (i2 >= 31) {
                textClassification = suggestSelection.getTextClassification();
                if (textClassification != null) {
                    r91Var = cn1Var2.e9gEMXR7LXtO;
                    this.BRwzKIf41E4i = suggestSelection;
                    this.x50lh2ztY7Y5 = r91Var;
                    this.cpQdD2nAriOS = cn1Var2;
                    this.r3s1LDPKFs1S = charSequence2;
                    this.QrzZRwfaDlRX = rtx2ld2ELZv4;
                    this.gPXPFXrUH4XX = 1;
                    if (r91Var.a92UlCVFR9N8(this) != suVar) {
                        textSelection = suggestSelection;
                        charSequence = charSequence2;
                        cn1Var = cn1Var2;
                        j = rtx2ld2ELZv4;
                        textClassification2 = textSelection.getTextClassification();
                        textClassification2.getClass();
                        cn1Var.RAsUl2FVSrh6.setValue(new le2(charSequence, j, textClassification2));
                    }
                    return suVar;
                }
            }
            this.QrzZRwfaDlRX = rtx2ld2ELZv4;
            this.gPXPFXrUH4XX = 2;
            if (cn1.PxuCJdSBwIXG(this.EcgxDIVH5in8, this.XL4ISE6Oc65B, rtx2ld2ELZv4, dgRBjINgWbAK, this) != suVar) {
                j = rtx2ld2ELZv4;
            }
            return suVar;
        }
        if (i == 1) {
            j = this.QrzZRwfaDlRX;
            charSequence = this.r3s1LDPKFs1S;
            cn1Var = this.cpQdD2nAriOS;
            r91Var = this.x50lh2ztY7Y5;
            textSelection = hi.x50lh2ztY7Y5(this.BRwzKIf41E4i);
            ng0.tmVwIGCQF4zR(obj);
            try {
                textClassification2 = textSelection.getTextClassification();
                textClassification2.getClass();
                cn1Var.RAsUl2FVSrh6.setValue(new le2(charSequence, j, textClassification2));
            } finally {
                r91Var.lS5Rgt96tfkO(null);
            }
        } else {
            if (i != 2) {
                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.QrzZRwfaDlRX;
            ng0.tmVwIGCQF4zR(obj);
        }
        return new vi2(j);
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        bn1 bn1Var = new bn1(this.RfyTYNmI9Srp, btVar, this.EcgxDIVH5in8, this.XL4ISE6Oc65B);
        bn1Var.BRwzKIf41E4i = obj;
        return bn1Var;
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((bn1) gPXPFXrUH4XX((bt) obj2, hi.dgRBjINgWbAK(obj))).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
