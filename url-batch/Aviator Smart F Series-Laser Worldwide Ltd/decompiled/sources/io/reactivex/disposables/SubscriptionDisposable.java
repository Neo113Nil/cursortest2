package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;
import p7.d;

/* loaded from: classes4.dex */
final class SubscriptionDisposable extends ReferenceDisposable<d> {
    private static final long serialVersionUID = -707001650852963139L;

    SubscriptionDisposable(d dVar) {
        super(dVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.reactivex.disposables.ReferenceDisposable
    public void onDisposed(@NonNull d dVar) {
        dVar.cancel();
    }
}
