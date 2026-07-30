package u2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: u2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5108b {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f41222a = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new T2.a("ClientDefault", 1));

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorService f41223b = Executors.newSingleThreadExecutor(new T2.a("ClientSingle", 1));
}
