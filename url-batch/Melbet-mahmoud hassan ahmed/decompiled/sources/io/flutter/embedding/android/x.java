package io.flutter.embedding.android;

import android.app.Activity;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.WindowLayoutInfo;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    final WindowInfoTrackerCallbackAdapter f17204a;

    public x(WindowInfoTrackerCallbackAdapter windowInfoTrackerCallbackAdapter) {
        this.f17204a = windowInfoTrackerCallbackAdapter;
    }

    public void a(Activity activity, Executor executor, q.a<WindowLayoutInfo> aVar) {
        this.f17204a.addWindowLayoutInfoListener(activity, executor, aVar);
    }

    public void b(q.a<WindowLayoutInfo> aVar) {
        this.f17204a.removeWindowLayoutInfoListener(aVar);
    }
}
