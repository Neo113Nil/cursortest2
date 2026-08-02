package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.InlineExecutionProhibitedException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pl implements Executor {
    private final /* synthetic */ int a;
    private final Object b;

    public pl(int i, byte[] bArr) {
        this.a = i;
        this.b = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        if (i == 0) {
            ((Handler) this.b).post(runnable);
            return;
        }
        if (i == 1) {
            ((Handler) this.b).post(runnable);
            return;
        }
        if (i == 2) {
            ((Handler) this.b).post(runnable);
            return;
        }
        if (i == 3) {
            tw.F(runnable);
            Object obj = this.b;
            if (((Handler) obj).post(runnable)) {
                return;
            }
            Objects.toString(obj);
            throw new RejectedExecutionException(obj.toString().concat(" is shutting down"));
        }
        if (i == 4) {
            this.b.execute(new pm(runnable, 3));
            return;
        }
        ljs ljsVar = new ljs(runnable, Thread.currentThread());
        this.b.execute(ljsVar);
        InlineExecutionProhibitedException inlineExecutionProhibitedException = ljsVar.b;
        if (inlineExecutionProhibitedException != null) {
            throw inlineExecutionProhibitedException;
        }
        ljsVar.a = null;
    }

    public pl(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public pl(int i) {
        this.a = i;
        this.b = new Handler(Looper.getMainLooper());
    }

    public pl(int i, char[] cArr) {
        this.a = i;
        this.b = new Handler(Looper.getMainLooper());
    }
}
