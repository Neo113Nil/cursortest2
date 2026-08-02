package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifn {
    public final Object a;
    public int b;
    public final Object c;

    public ifn(int i) {
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        this.c = new Path();
    }

    public static final long i(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }

    public final boolean a() {
        return ((LinkedHashMap) this.c).isEmpty();
    }

    public final gfz b(int i) {
        gfz gfzVar = (gfz) ((SparseArray) this.a).get(i);
        gfzVar.getClass();
        return gfzVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final hel c(String str) {
        ServiceInfo serviceInfo;
        her d;
        ?? r0 = this.c;
        ewm ewmVar = (ewm) r0.get(str);
        if (ewmVar == null) {
            ewmVar = new ewm(this, str, new ewi(new dxi(this, str, 17)));
            r0.put(str, ewmVar);
        }
        int i = hel.d;
        heg hegVar = new heg(4);
        loop0: while (true) {
            serviceInfo = null;
            for (ResolveInfo resolveInfo : ((PackageManager) ewmVar.e.a).queryIntentServices(new Intent("com.google.android.libraries.phenotype.registration.PhenotypeMetadataHolderService").setPackage(ewmVar.a), 787072)) {
                if (serviceInfo == null) {
                    if (resolveInfo.serviceInfo != null && resolveInfo.serviceInfo.metaData != null && "com.google.android.libraries.phenotype.registration.PhenotypeMetadataHolderService".equals(resolveInfo.serviceInfo.name)) {
                        serviceInfo = resolveInfo.serviceInfo;
                    }
                }
            }
            break loop0;
        }
        if (serviceInfo == null) {
            d = hix.b;
        } else {
            qi qiVar = new qi();
            qi qiVar2 = new qi();
            Bundle bundle = serviceInfo.metaData;
            for (String str2 : bundle.keySet()) {
                boolean startsWith = str2.startsWith("com.google.android.gms.phenotype.registration.binarypb:");
                boolean startsWith2 = str2.startsWith("com.google.android.gms.phenotype.heterodyne_info.binarypb:");
                if (startsWith || startsWith2) {
                    int i2 = bundle.getInt(str2, 0);
                    if (i2 != 0) {
                        String str3 = (String) hnu.U(gzz.b(':').c(str2), 1);
                        if (startsWith) {
                            qiVar.put(str3, Integer.valueOf(i2));
                        } else {
                            qiVar2.put(str3, Integer.valueOf(i2));
                        }
                    }
                }
            }
            hen h = her.h(qiVar.d);
            for (Map.Entry entry : qiVar.entrySet()) {
                String str4 = (String) entry.getKey();
                h.g(str4, new ewl(ewmVar, str4, ((Integer) entry.getValue()).intValue(), ((Integer) qiVar2.getOrDefault(str4, 0)).intValue()));
            }
            d = h.d(false);
        }
        hjr it = d.values().iterator();
        while (it.hasNext()) {
            iae iaeVar = (iae) ((ewl) it.next()).b.bB();
            if (iaeVar != null) {
                hegVar.h(iaeVar);
            }
        }
        return hegVar.g();
    }

    public final boolean d() {
        return this.c != null;
    }

    public final boolean e() {
        Object obj;
        return this.c == null && (obj = this.a) != null && ((ColorStateList) obj).isStateful();
    }

    public final boolean f(int[] iArr) {
        if (!e()) {
            return false;
        }
        ColorStateList colorStateList = (ColorStateList) this.a;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.b) {
            return false;
        }
        this.b = colorForState;
        return true;
    }

    public final boolean g() {
        return d() || this.b != 0;
    }

    public final ld h(int i) {
        SparseArray sparseArray = (SparseArray) this.a;
        ld ldVar = (ld) sparseArray.get(i);
        if (ldVar != null) {
            return ldVar;
        }
        ld ldVar2 = new ld();
        sparseArray.put(i, ldVar2);
        return ldVar2;
    }

    public ifn(cme cmeVar) {
        this.a = bmp.a(150, new bdh(this, 1));
        this.c = cmeVar;
    }

    public ifn(Shader shader, ColorStateList colorStateList, int i) {
        this.c = shader;
        this.a = colorStateList;
        this.b = i;
    }

    public ifn(byte[] bArr) {
        this.a = new SparseArray();
        this.b = 0;
        this.c = Collections.newSetFromMap(new IdentityHashMap());
    }

    public ifn(PackageManager packageManager) {
        this.c = new HashMap();
        this.b = 0;
        this.a = packageManager;
    }

    public ifn() {
        this.c = new qi();
        this.a = new SparseArray();
        this.b = 0;
    }

    public ifn(Object obj, int i) {
        this.c = new LinkedHashMap();
        this.a = obj;
        this.b = i;
    }
}
