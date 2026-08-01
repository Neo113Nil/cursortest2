package h3;

import c3.o;
import c3.w;
import java.util.regex.Pattern;
import k3.m;
import p3.p;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class h extends w {

    /* renamed from: f, reason: collision with root package name */
    public final String f2027f;
    public final long g;
    public final p h;

    public h(String str, long j4, p pVar) {
        this.f2027f = str;
        this.g = j4;
        this.h = pVar;
    }

    @Override // c3.w
    public final long m() {
        return this.g;
    }

    @Override // c3.w
    public final o n() {
        String str = this.f2027f;
        if (str == null) {
            return null;
        }
        Pattern pattern = o.c;
        try {
            return m.t(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // c3.w
    public final p3.h o() {
        return this.h;
    }
}
