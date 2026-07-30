package com.google.android.datatransport.cct;

import android.content.Context;
import defpackage.ct;
import defpackage.g50;
import defpackage.mz2;
import defpackage.ul;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class CctBackendFactory {
    public mz2 create(g50 g50Var) {
        Context context = ((ul) g50Var).a;
        ul ulVar = (ul) g50Var;
        return new ct(context, ulVar.b, ulVar.c);
    }
}
