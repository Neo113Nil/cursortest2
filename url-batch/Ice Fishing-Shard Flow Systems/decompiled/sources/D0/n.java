package D0;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.A;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n implements B0.a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile n f344c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f345d = new ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public final a f346a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f347b = new CopyOnWriteArrayList();

    public n(l lVar) {
        this.f346a = lVar;
        if (lVar != null) {
            lVar.d(new l2.c(this));
        }
    }

    @Override // B0.a
    public final void a(A0.i callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (f345d) {
            try {
                if (this.f346a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f347b.iterator();
                while (it.hasNext()) {
                    m callbackWrapper = (m) it.next();
                    if (callbackWrapper.f342b == callback) {
                        Intrinsics.checkNotNullExpressionValue(callbackWrapper, "callbackWrapper");
                        arrayList.add(callbackWrapper);
                    }
                }
                this.f347b.removeAll(arrayList);
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    Activity activity = ((m) obj).f341a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f347b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            if (((m) it2.next()).f341a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    a aVar = this.f346a;
                    if (aVar != null) {
                        ((l) aVar).b(activity);
                    }
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // B0.a
    public final void b(Context context, e0.c executor, A0.i callback) {
        Object obj;
        WindowManager.LayoutParams attributes;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Unit unit = null;
        r1 = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            ReentrantLock reentrantLock = f345d;
            reentrantLock.lock();
            try {
                a aVar = this.f346a;
                if (aVar == null) {
                    callback.accept(new A0.l(A.f6115d));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f347b;
                boolean z7 = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((m) it.next()).f341a.equals(activity)) {
                            z7 = true;
                            break;
                        }
                    }
                }
                m this$0 = new m(activity, executor, callback);
                copyOnWriteArrayList.add(this$0);
                if (z7) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (activity.equals(((m) obj).f341a)) {
                                break;
                            }
                        }
                    }
                    m mVar = (m) obj;
                    A0.l newLayoutInfo = mVar != null ? mVar.f343c : null;
                    if (newLayoutInfo != null) {
                        Intrinsics.checkNotNullParameter(newLayoutInfo, "newLayoutInfo");
                        this$0.f343c = newLayoutInfo;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(newLayoutInfo, "$newLayoutInfo");
                        this$0.f342b.accept(newLayoutInfo);
                    }
                } else {
                    l lVar = (l) aVar;
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        lVar.c(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new k(lVar, activity));
                    }
                }
                Unit unit2 = Unit.f6114a;
                reentrantLock.unlock();
                unit = Unit.f6114a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (unit == null) {
            callback.accept(new A0.l(A.f6115d));
        }
    }
}
