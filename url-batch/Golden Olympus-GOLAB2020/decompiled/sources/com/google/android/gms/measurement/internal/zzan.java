package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
enum zzan {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');

    private final char zzl;

    zzan(char c4) {
        this.zzl = c4;
    }

    public static zzan zzb(char c4) {
        for (zzan zzanVar : values()) {
            if (zzanVar.zzl == c4) {
                return zzanVar;
            }
        }
        return UNSET;
    }
}
