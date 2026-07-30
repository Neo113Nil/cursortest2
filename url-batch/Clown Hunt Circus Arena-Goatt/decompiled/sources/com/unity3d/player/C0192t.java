package com.unity3d.player;

import java.lang.reflect.AccessibleObject;

/* renamed from: com.unity3d.player.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0192t {
    public final Class a;
    public final String b;
    public final String c;
    public final int d;
    public volatile AccessibleObject e;

    public C0192t(Class cls, String str, String str2) {
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
        if (obj instanceof C0192t) {
            C0192t c0192t = (C0192t) obj;
            if (this.d == c0192t.d && this.c.equals(c0192t.c) && this.b.equals(c0192t.b) && this.a.equals(c0192t.a)) {
                return true;
            }
        }
        return false;
    }
}
