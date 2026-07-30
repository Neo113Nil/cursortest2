package com.google.android.datatransport.cct;

import android.content.Context;
import defpackage.cg;
import defpackage.fj1;
import defpackage.hb;
import defpackage.zn;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class CctBackendFactory {
    public fj1 create(zn znVar) {
        Context context = ((hb) znVar).a;
        hb hbVar = (hb) znVar;
        return new cg(context, hbVar.b, hbVar.c);
    }
}
