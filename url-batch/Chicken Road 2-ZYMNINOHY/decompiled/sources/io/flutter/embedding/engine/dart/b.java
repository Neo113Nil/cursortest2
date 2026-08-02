package io.flutter.embedding.engine.dart;

import io.flutter.embedding.engine.dart.DartMessenger;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DartMessenger.SerialTaskQueue f13546a;

    public /* synthetic */ b(DartMessenger.SerialTaskQueue serialTaskQueue) {
        this.f13546a = serialTaskQueue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13546a.flush();
    }
}
