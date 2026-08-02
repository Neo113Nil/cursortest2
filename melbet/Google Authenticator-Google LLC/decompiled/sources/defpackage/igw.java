package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class igw extends hmx {
    private final hel a;

    public igw(String str, hel helVar) {
        super(str);
        this.a = helVar;
    }

    @Override // defpackage.hlw
    public final void b(hlu hluVar) {
        int i = 0;
        while (true) {
            hel helVar = this.a;
            if (i >= ((his) helVar).c) {
                return;
            }
            hlw hlwVar = (hlw) helVar.get(i);
            if (hluVar.A() || hlwVar.c(hluVar.o())) {
                hlwVar.b(hluVar);
            }
            i++;
        }
    }

    @Override // defpackage.hlw
    public final boolean c(Level level) {
        int i = 0;
        while (true) {
            hel helVar = this.a;
            if (i >= ((his) helVar).c) {
                return false;
            }
            if (((hlw) helVar.get(i)).c(level)) {
                return true;
            }
            i++;
        }
    }
}
