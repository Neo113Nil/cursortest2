package com.google.android.gms.internal.measurement;

import java.io.File;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class qg extends rg {

    /* renamed from: b, reason: collision with root package name */
    public int f2718b;

    @Override // com.google.android.gms.internal.measurement.rg
    public final String a() {
        return "com/google/android/libraries/phenotype/client/Phlogger".replace('/', '.');
    }

    @Override // com.google.android.gms.internal.measurement.rg
    public final String b() {
        return "logInternal";
    }

    @Override // com.google.android.gms.internal.measurement.rg
    public final int c() {
        return 44;
    }

    @Override // com.google.android.gms.internal.measurement.rg
    public final String d() {
        return "Phlogger.java".substring("Phlogger.java".lastIndexOf(File.separatorChar) + 1);
    }

    @Override // com.google.android.gms.internal.measurement.rg
    public final String e() {
        return "Phlogger.java";
    }

    public final boolean equals(Object obj) {
        return obj instanceof qg;
    }

    public final int hashCode() {
        int i3 = this.f2718b;
        if (i3 != 0) {
            return i3;
        }
        this.f2718b = -1391114360;
        return -1391114360;
    }
}
