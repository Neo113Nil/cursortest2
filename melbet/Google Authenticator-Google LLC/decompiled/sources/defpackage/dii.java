package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dii extends ThreadLocal {
    public static final dii a = new dii();

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        int myTid = Process.myTid();
        return new dig(Thread.currentThread(), myTid, true, Process.getThreadPriority(myTid), true, false);
    }
}
