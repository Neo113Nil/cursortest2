package defpackage;

import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oq extends ow {
    public final Object a = new Object();
    public final ExecutorService b = Executors.newFixedThreadPool(4, new cxb(1, (byte[]) null));
    public volatile Handler c;
}
