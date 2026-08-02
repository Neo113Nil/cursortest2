package com.unity3d.player;

import java.lang.reflect.AccessibleObject;

/* renamed from: com.unity3d.player.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053o {
    public final Class a;
    public final String b;
    public final String c;
    public final int d;
    public volatile AccessibleObject e;

    public C0053o(Class cls, String str, String str2) {
        this.a = cls;
        this.b = str;
        this.c = str2;
        this.d = str2.hashCode() + ((str.hashCode() + ((cls.hashCode() + 527) * 31)) * 31);
    }

    public final int hashCode() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0053o) {
            C0053o c0053o = (C0053o) obj;
            if (this.d == c0053o.d && this.c.equals(c0053o.c) && this.b.equals(c0053o.b) && this.a.equals(c0053o.a)) {
                return true;
            }
        }
        return false;
    }
}
