package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
final class w43 implements Iterable<String> {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ CharSequence f13714f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ z43 f13715g;

    w43(z43 z43Var, CharSequence charSequence) {
        this.f13715g = z43Var;
        this.f13714f = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        Iterator<String> g7;
        g7 = this.f13715g.g(this.f13714f);
        return g7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator<String> it = iterator();
        try {
            if (it.hasNext()) {
                CharSequence a7 = f43.a(it.next(), ", ");
                while (true) {
                    sb.append(a7);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) ", ");
                    a7 = f43.a(it.next(), ", ");
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }
}
