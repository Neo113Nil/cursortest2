package com.artillery.ctc.base;

import androidx.annotation.Keep;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class Cw {
    private final int sc;

    /* renamed from: w, reason: collision with root package name */
    private final String f744w;

    /* JADX WARN: Multi-variable type inference failed */
    public Cw() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Cw copy$default(Cw cw, int i8, String str, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = cw.sc;
        }
        if ((i9 & 2) != 0) {
            str = cw.f744w;
        }
        return cw.copy(i8, str);
    }

    public final int component1() {
        return this.sc;
    }

    public final String component2() {
        return this.f744w;
    }

    public final Cw copy(int i8, String str) {
        return new Cw(i8, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cw)) {
            return false;
        }
        Cw cw = (Cw) obj;
        return this.sc == cw.sc && s.areEqual(this.f744w, cw.f744w);
    }

    public final int getSc() {
        return this.sc;
    }

    public final String getW() {
        return this.f744w;
    }

    public int hashCode() {
        int i8 = this.sc * 31;
        String str = this.f744w;
        return i8 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Cw(sc=" + this.sc + ", w=" + this.f744w + ')';
    }

    public Cw(int i8, String str) {
        this.sc = i8;
        this.f744w = str;
    }

    public /* synthetic */ Cw(int i8, String str, int i9, o oVar) {
        this((i9 & 1) != 0 ? 0 : i8, (i9 & 2) != 0 ? null : str);
    }
}
