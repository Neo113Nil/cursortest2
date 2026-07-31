package com.unity3d.player;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.reflect.AccessibleObject;

/* renamed from: com.unity3d.player.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1774s {

    /* renamed from: a, reason: collision with root package name */
    public final Class f22242a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22243b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22244c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22245d;

    /* renamed from: e, reason: collision with root package name */
    public volatile AccessibleObject f22246e;

    public C1774s(Class cls, String str, String str2) {
        this.f22242a = cls;
        this.f22243b = str;
        this.f22244c = str2;
        this.f22245d = str2.hashCode() + ((str.hashCode() + ((cls.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1774s) {
            C1774s c1774s = (C1774s) obj;
            if (this.f22245d == c1774s.f22245d && this.f22244c.equals(c1774s.f22244c) && this.f22243b.equals(c1774s.f22243b) && this.f22242a.equals(c1774s.f22242a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f22245d;
    }
}
