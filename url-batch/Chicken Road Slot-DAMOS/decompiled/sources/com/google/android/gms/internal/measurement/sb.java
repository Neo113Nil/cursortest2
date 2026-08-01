package com.google.android.gms.internal.measurement;

import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class sb {

    /* renamed from: c, reason: collision with root package name */
    public static final sb f2794c = new sb(pb.f2671b, lb.A());

    /* renamed from: a, reason: collision with root package name */
    public final pb f2795a;

    /* renamed from: b, reason: collision with root package name */
    public final lb f2796b;

    public sb(pb pbVar, lb lbVar) {
        pbVar.getClass();
        this.f2795a = pbVar;
        this.f2796b = lbVar;
    }

    public static sb a(y0 y0Var, boolean z10) {
        pb a9;
        int C = y0Var.C();
        if (C > 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(C).length() + 44);
            sb2.append("Unsupported version: ");
            sb2.append(C);
            sb2.append(". Current version is: 1");
            throw new v1(sb2.toString());
        }
        y0Var.C();
        int a10 = y0Var.a(y0Var.A());
        c1 c1Var = c1.f2180a;
        int i3 = q0.f2690a;
        lb z11 = lb.z(y0Var, c1.f2181b);
        y0Var.b(a10);
        nb nbVar = new nb();
        Inflater inflater = nbVar.f2576d;
        try {
            if (!z10) {
                inflater.setInput(y0Var.z());
                try {
                    a9 = pb.a(y0.h(new mb(nbVar), 4096));
                    nbVar.close();
                    return new sb(a9, z11);
                } finally {
                }
            }
            int a11 = y0Var.a(y0Var.A());
            int c10 = y0Var.c();
            try {
                a9 = pb.a(y0.h(new InflaterInputStream(new mb(nbVar, y0Var), inflater, c10 < 0 ? 4096 : Math.min(c10, 4096)), 4096));
                inflater.reset();
                if (y0Var.c() != 0) {
                    throw new v1("Unexpected bytes remaining after FlagsBlob parsing.");
                }
                y0Var.b(a11);
                nbVar.close();
                return new sb(a9, z11);
            } finally {
            }
        } finally {
            try {
                nbVar.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
    }
}
