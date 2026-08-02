package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bal {
    public final bam a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ ban d;

    public bal(ban banVar, bam bamVar) {
        this.d = banVar;
        this.a = bamVar;
        this.b = bamVar.e ? null : new boolean[banVar.d];
    }

    public final void a() {
        this.d.a(this, false);
    }

    public final void b() {
        if (this.c) {
            return;
        }
        try {
            a();
        } catch (IOException unused) {
        }
    }
}
