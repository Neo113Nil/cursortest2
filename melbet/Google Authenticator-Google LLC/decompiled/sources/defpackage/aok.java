package defpackage;

import android.app.Application;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aok {
    public static final aok a;
    private static final aok e;
    public final aoj b;
    public final krt c;
    public aog d;

    static {
        aok aokVar = new aok(aoe.a, new ajt(4));
        e = aokVar;
        a = aokVar;
    }

    public aok(aoj aojVar, krt krtVar) {
        aog aogVar;
        this.b = aojVar;
        this.c = krtVar;
        if (aojVar.g) {
            aogVar = aoe.b;
        } else {
            Process.myPid();
            Application.getProcessName();
            synchronized (aojVar.f) {
                if (!aojVar.g) {
                    aoe.b = new aog(aojVar);
                    aojVar.g = true;
                }
            }
            aogVar = aoe.b;
        }
        this.d = aogVar;
    }

    public final void a(String str) {
        ((Boolean) this.c.a(str)).booleanValue();
    }
}
